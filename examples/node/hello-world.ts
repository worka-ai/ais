// hello.ts
import {
    DefaultApi,
    CreateTenantRequest,
    UpdateLLMConfigRequest,
    ToolUpsert,
    CreateAgentRequest,
    CreateAgentRequestAgentsInner,
    CreateAgentRequestAgentsInnerRulesInner,
    CreateAgentRequestAgentsInnerRulesInnerToolsInner,
    CreateAgentRequestAgentsInnerRulesInnerToolsInnerFunctionDeclarationsInner,
    CreateConversationRequest,
    CreateWorkflowRequest,
    GetWorkflowResponse
}
    //from 'worka'
    from '../../clients/node/api'
    ;

async function main() {
    // Point at your running server (adjust if needed)
    const api = new DefaultApi('http://localhost:8080');

    // 1️⃣ Create a new tenant
    const tenantReq: CreateTenantRequest = {
        tenantId: 42,
        username: 'support-bot',
        determineConversationWithNarrative: 'narrative',
        determineConversationWithAgent: 0
    };
    const { body: tenantResp } = await api.tenantPost(tenantReq);
    const tenantId = tenantResp.tenantId;
    console.log('✅ Tenant created:', tenantId);

    // 2️⃣ Add two LLM configs (Gemini & Vertex)
    const geminiReq: UpdateLLMConfigRequest = {
        tenantId,
        provider: 'googlegemini', //googlegemini | chatgpt
        apiKey: 'GEMINI_API_KEY',
        model: 'gemini-pro',
        temperature: 0.7
    };
    await api.llmConfigPost(geminiReq);
    console.log('✅ Gemini config added');

    const vertexReq: UpdateLLMConfigRequest = {
        tenantId,
        provider: 'googlevertex', //googlegemini | chatgpt
        apiKey: 'VERTEX_API_KEY',
        model: 'chat-bison',
        temperature: 0.5
    };
    await api.llmConfigPost(vertexReq);
    console.log('✅ Vertex config added');

    // 3️⃣ Register two tools
    const toolUpsert: ToolUpsert = {
        tenantId,
        tools: [
            {
                name: 'queryKnowledgeBase',
                description: 'Queries the knowledge base for relevant articles',
                functionDeclarations: [
                    {
                        name: 'queryKB',
                        description: 'Execute a KB search',
                        parameters: { query: 'string', maxResults: 5 },
                        response: { articles: [{ id: 'string', title: 'string' }] }
                    }
                ]
            },
            {
                name: 'searchResolvedTickets',
                description: 'Searches resolved support tickets by keywords',
                functionDeclarations: [
                    {
                        name: 'searchTickets',
                        description: 'Find tickets matching keywords',
                        parameters: { keywords: 'string', limit: 10 },
                        response: { tickets: [{ id: 'string', subject: 'string', status: 'string' }] }
                    }
                ]
            }
        ]
    };
    await api.toolPut(toolUpsert);
    console.log('✅ Tools registered');

    // 4️⃣ Register two agents with rules, examples, tags, edges, tools, etc.
    const now = new Date();
    const sampleRule: CreateAgentRequestAgentsInnerRulesInner = {
        content: 'return articles.length > 0;',
        description: 'Only run when KB articles exist',
        id: 1,
        name: 'HasArticlesRule',
        position: 1,
        ruleCreatedAt: now,
        tenantId,
        versionCreatedAt: now,
        versionId: 1
    };

    const agent1: CreateAgentRequestAgentsInner = {
        name: 'KBQueryAgent',
        description: 'Handles knowledge base lookups',
        createdAt: now,
        tenantId,
        expectedInput: 'Please find relevant KB articles',
        rules: [sampleRule],
        tools: [
            {
                name: 'queryKnowledgeBase',
                description: 'Use KB query tool',
                functionDeclarations: toolUpsert.tools[0].functionDeclarations
            }
        ],
        edges: [], // no next-step dependencies
        examples: ['Find articles about error code 500'],
        tags: ['kb', 'support']
    };

    const agent2: CreateAgentRequestAgentsInner = {
        name: 'TicketSearchAgent',
        description: 'Searches past resolved tickets',
        createdAt: now,
        tenantId,
        expectedInput: 'Search resolved tickets for similar issues',
        rules: [sampleRule],
        tools: [
            {
                name: 'searchResolvedTickets',
                description: 'Use ticket search tool',
                functionDeclarations: toolUpsert.tools[1].functionDeclarations
            }
        ],
        edges: [],
        examples: ['Search tickets for payment failure'],
        tags: ['tickets', 'support']
    };

    await api.agentPut({ agents: [agent1, agent2] });
    console.log('✅ Agents registered');

    // 5️⃣ Start a conversation and trigger a workflow for a support email
    const { body: conv } = await api.conversationPost({ tenantId, });
    console.log('✅ Conversation started:', conv.conversationId);

    const wfReq: CreateWorkflowRequest = {
        tenantId,
        conversationId: conv.conversationId,
        agentId: undefined,
        input: 'Support email: Customer reports error 500 when uploading a file.',
        freeform: false
    };
    const { body: wfResp } = await api.workflowPost(wfReq);
    console.log('✅ Workflow created:', wfResp.workflowId);

    const { body: wfEvents }: { body: GetWorkflowResponse } = await api.workflowIdGet(wfResp.workflowId);
    console.log('📜 Workflow events:', wfEvents.events);
}

main().catch(err => {
    console.error('❌ Error in example:', err);
    process.exit(1);
});
