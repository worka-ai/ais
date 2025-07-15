// hello.ts
import {
    CreateAgentRequestAgentsInner,
    CreateAgentRequestAgentsInnerEdgesInner,
    CreateAgentRequestAgentsInnerRulesInner,
    CreateWorkflowRequest,
    DefaultApi,
    GetWorkflowResponse,
    ToolUpsert,
    UpdateLLMConfigRequest
} from '../../clients/node/api';

// ───────────────────────────────────────────────────────────────────────────────
// Configuration constants for this example:
const TENANT_ID = 42;
const INBOX_SCANNER_ID = 1;
const KB_LOOKUP_ID = 2;
const TICKET_SEARCH_ID = 3;
const DRAFT_RESPONDER_ID = 4;
const QUALITY_CHECKER_ID = 5;

// ───────────────────────────────────────────────────────────────────────────────

async function main() {
    // Point at your running server (adjust if needed)
    const api = new DefaultApi('http://localhost:8080');

    // ───────────────────────────────────────────────────────────────────────────────
    // 1️⃣ Create a new tenant for the support workflow.
    // ───────────────────────────────────────────────────────────────────────────────
    // const tenantReq: CreateTenantRequest = {
    //     tenantId: TENANT_ID,
    //     username: 'support_bot',
    //     determineConversationWithNarrative: 'narrative',
    //     determineConversationWithAgent: 0
    // };
    // const {body: tenantResp} = await api.tenantPost(tenantReq);
    // const tenantId = tenantResp.tenantId;
    // console.log('✅ Tenant created:', tenantId);
    let tenantId = TENANT_ID;
    // ───────────────────────────────────────────────────────────────────────────────
    // 2️⃣ Add two LLM configs (Gemini & Vertex).
    // ───────────────────────────────────────────────────────────────────────────────
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

    // ───────────────────────────────────────────────────────────────────────────────
    // 3️⃣ Register five tools for email parsing, KB lookup, ticket search,
    //    response drafting, and quality checking.
    // ───────────────────────────────────────────────────────────────────────────────
    const toolUpsert: ToolUpsert = {
        tenantId,
        tools: [
            {
                name: 'parse_email',
                description: 'Parses raw email into subject, body, and sender',
                functionDeclarations: [
                    {
                        name: 'parse_email',
                        description: 'Extract structured fields from raw email text',
                        parameters: {raw: 'string'},
                        response: {subject: 'string', body: 'string', from: 'string'}
                    }
                ]
            },
            {
                name: 'query_knowledge_base',
                description: 'Queries the knowledge base for relevant articles',
                functionDeclarations: [
                    {
                        name: 'query_kb',
                        description: 'Execute a KB search',
                        parameters: {query: 'string', max_results: 5},
                        response: {articles: [{id: 'string', title: 'string'}]}
                    }
                ]
            },
            {
                name: 'search_resolved_tickets',
                description: 'Searches resolved support tickets by keywords',
                functionDeclarations: [
                    {
                        name: 'search_tickets',
                        description: 'Find tickets matching keywords',
                        parameters: {keywords: 'string', limit: 10},
                        response: {tickets: [{id: 'string', subject: 'string', status: 'string'}]}
                    }
                ]
            },
            {
                name: 'draft_response',
                description: 'Drafts a support response based on context',
                functionDeclarations: [
                    {
                        name: 'draft_response',
                        description: 'Generate a support reply text',
                        parameters: {context: 'string'},
                        response: {responseText: 'string'}
                    }
                ]
            },
            {
                name: 'quality_check',
                description: 'Checks response for tone and compliance',
                functionDeclarations: [
                    {
                        name: 'quality_check',
                        description: 'Evaluate and return suggestions',
                        parameters: {responseText: 'string'},
                        response: {ok: 'boolean', suggestions: ['string']}
                    }
                ]
            }
        ]
    };
    await api.toolPut(toolUpsert);
    console.log('✅ Tools registered');

    // ───────────────────────────────────────────────────────────────────────────────
    // 4️⃣ Register five agents with edges for triage workflow.
    // ───────────────────────────────────────────────────────────────────────────────
    const now = new Date();
    const sampleRule: CreateAgentRequestAgentsInnerRulesInner = {
        id: 1,
        name: 'AlwaysRun',
        description: 'Default rule to always execute',
        content: 'return true;',
        position: 1,
        ruleCreatedAt: now,
        versionId: 1,
        versionCreatedAt: now,
        tenantId
    };

    // Use placeholder numeric IDs here; after creating agents you'll get real IDs to wire edges
    const inboxScanner: CreateAgentRequestAgentsInner = {
        id: INBOX_SCANNER_ID,
        name: 'InboxScanner',
        description: 'Parses incoming support emails',
        createdAt: now,
        tenantId,
        expectedInput: 'Raw email text',
        rules: [sampleRule],
        tools: [
            {
                name: 'parse_email',
                description: 'Parse raw emails',
                functionDeclarations: toolUpsert.tools[0].functionDeclarations
            }
        ],
        edges: [
            { targetAgentId: KB_LOOKUP_ID, conditions: [], priority: 1 },
            { targetAgentId: TICKET_SEARCH_ID, conditions: [], priority: 1 }
        ],
        examples: ['Subject: Error 500\nBody: Customer cannot upload file'],
        tags: ['email', 'parsing']
    };
    const kbLookup: CreateAgentRequestAgentsInner = {
        id: KB_LOOKUP_ID,
        name: 'KBLookup',
        description: 'Finds relevant KB articles',
        createdAt: now,
        tenantId,
        expectedInput: 'Parsed email body',
        rules: [sampleRule],
        tools: [
            {
                name: 'query_knowledge_base',
                description: 'Search KB',
                functionDeclarations: toolUpsert.tools[1].functionDeclarations
            }
        ],
        edges: [
            { targetAgentId: DRAFT_RESPONDER_ID, conditions: [], priority: 1 }
        ],
        examples: ['Lookup articles about upload errors'],
        tags: ['kb', 'support']
    };
    const ticketSearch: CreateAgentRequestAgentsInner = {
        id: TICKET_SEARCH_ID,
        name: 'TicketSearch',
        description: 'Looks up past resolved tickets',
        createdAt: now,
        tenantId,
        expectedInput: 'Parsed email body',
        rules: [sampleRule],
        tools: [
            {
                name: 'search_resolved_tickets',
                description: 'Search tickets',
                functionDeclarations: toolUpsert.tools[2].functionDeclarations
            }
        ],
        edges: [
            { targetAgentId: DRAFT_RESPONDER_ID, conditions: [], priority: 1 }
        ],
        examples: ['Search tickets with similar error'],
        tags: ['tickets', 'support']
    };
    const draftResponder: CreateAgentRequestAgentsInner = {
        id: DRAFT_RESPONDER_ID,
        name: 'DraftResponder',
        description: 'Drafts a support reply',
        createdAt: now,
        tenantId,
        expectedInput: 'KB articles + ticket context',
        rules: [sampleRule],
        tools: [
            {
                name: 'draft_response',
                description: 'Create draft text',
                functionDeclarations: toolUpsert.tools[3].functionDeclarations
            }
        ],
        edges: [
            { targetAgentId: QUALITY_CHECKER_ID, conditions: [], priority: 1 }
        ],
        examples: ['Draft apology and link to article'],
        tags: ['draft', 'support']
    };
    const qualityChecker: CreateAgentRequestAgentsInner = {
        id: QUALITY_CHECKER_ID,
        name: 'QualityChecker',
        description: 'Reviews and refines drafts',
        createdAt: now,
        tenantId,
        expectedInput: 'Drafted response',
        rules: [
            {
                id: 2,
                name: 'NeedRevision',
                description: 'Revise if suggestions present',
                content: 'return !ok;',
                position: 1,
                ruleCreatedAt: now,
                versionId: 1,
                versionCreatedAt: now,
                tenantId
            }
        ],
        tools: [
            {
                name: 'quality_check',
                description: 'Evaluate text',
                functionDeclarations: toolUpsert.tools[4].functionDeclarations
            }
        ],
        edges: [
            { targetAgentId: DRAFT_RESPONDER_ID, conditions: [2], priority: 1 }
        ],
        examples: ['Ensure tone and compliance'],
        tags: ['quality', 'review']
    };

    const agents = [inboxScanner, kbLookup, ticketSearch, draftResponder, qualityChecker];
    await api.agentPut({agents});
    console.log('✅ Agents registered');

    // ───────────────────────────────────────────────────────────────────────────────
    // 5️⃣ Start a conversation and trigger a workflow to process a support email.
    // ───────────────────────────────────────────────────────────────────────────────
    const {body: conv} = await api.conversationPost({tenantId,});
    console.log('✅ Conversation started:', conv.conversationId);

    const wfReq: CreateWorkflowRequest = {
        tenantId,
        conversationId: conv.conversationId,
        agentId: undefined,
        input: 'Support email: Customer reports error 500 when uploading a file.',
        freeform: false
    };
    const {body: wfResp} = await api.workflowPost(wfReq);
    console.log('✅ Workflow created:', wfResp.workflowId);

    const {body: wfEvents}: { body: GetWorkflowResponse } = await api.workflowIdGet(wfResp.workflowId);
    console.log('📜 Workflow events:', wfEvents.events);
}

main().catch(err => {
    console.error('❌ Error in example:', err);
    process.exit(1);
});
