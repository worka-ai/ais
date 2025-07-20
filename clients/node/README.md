## Why Worka?

Worka empowers development teams to orchestrate complex, multi-agent workflows with confidence. Our platform provides:
Build reliable, secure, and scalable multi-agent workflows with ease:

- **Deterministic DAG execution**: guarantee idempotent, repeatable pipelines across retries and distributed workers.
- **Fine-grained context control**: prune, prioritize, and shape LLM history for consistent, predictable outputs.
- **Automated retry & audit**: built-in error handling, low-confidence replans, and human-in-the-loop escalation.
- **Comprehensive event logging**: view and troubleshoot every step in the workflow’s lifecycle.
- **Secure secret management & PII redaction**: vault-backed runtime injection keeps your keys, tokens, and user data
  safe.
- **Multi-agent routing & conditional logic**: connect specialized agents with simple JS rules for dynamic
  decision-making.
- **Flexible deployment**: run on-premise or in the cloud via standalone API server & workers, or compile to WebAssembly
  for edge execution.
- **TypeScript-first SDK**: fully typed client with auto-generated models, code-completion, and compile-time safety.
- **Multi-tenant**: You control tenancy via API, mapping our internal tenants to yours.
- **Secure secret management** with vault-backed runtime injection and PII redaction for compliance-ready operations.
- **Flexible deployment**, from a standalone API server and workers to WASM-first architectures that run at the edge.
- **Multi-agent routing** and conditional logic powered by simple JS snippets, connecting specialized agents seamlessly.
- **Built-in retry and audit**, automatically handling low-confidence plans, retries, and human-in-the-loop escalation
  when needed.

Below is an overview of key features and their current maturity stages:

| Feature                              | 🗓️ Planned | 🔧 In Development | 🅰️ Alpha | 🅱️ Beta | 🚀 Production | ⚠️ Deprecated |
|--------------------------------------|:-----------:|:-----------------:|:---------:|:--------:|:-------------:|:-------------:|
| Event Logging & Inspection           |             |                   |           |          |      🚀       |               |
| Retry & Audit                        |             |                   |           |          |      🚀       |               |
| Deterministic DAGs                   |             |                   |           |          |      🚀       |               |
| Semantic Keys & Nonces               |             |                   |           |          |      🚀       |               |
| Multi-Agent Routing                  |             |                   |           |          |      🚀       |               |
| API Server & Worker Binaries         |             |                   |           |          |      🚀       |               |
| Multi-Tenancy                        |             |                   |           |          |      🚀       |               |~~
| Custom Tool Integrations             |             |                   |           |          |      🚀       |               |
| Core Orchestration Features          |             |                   |           |          |      🚀       |               |
| Google Gemini LLM Provider           |             |                   |           |   🅱️    |               |               |
| Google Vertex LLM Provider           |             |                   |           |   🅱️    |               |               |
| Human-in-the-Loop Escalation         |             |                   |           |   🅱️    |               |               |
| Fine-grained Context Control         |             |                   |           |   🅱️    |               |               |
| TypeScript/Node.js SDK               |             |                   |           |          |      🚀       |               |
| Java SDK                             |             |                   |    🅰️    |          |               |               |
| Python SDK                           |             |                   |    🅰️    |          |               |               |
| Ruby SDK                             |             |                   |    🅰️    |          |               |               |
| Rust SDK                             |             |                   |    🅰️    |          |               |               |
| ChatGPT LLM Provider                 |             |                   |    🅰️    |          |               |               |
| WASM-First Architecture              |             |        🅰️        |           |          |               |               |
| PII Redaction                        |             |        🔧         |           |          |               |               |
| Vault Secret Management              |             |        🔧         |           |          |               |               |
| Secret Vault Management              |             |        🔧         |           |          |               |               |
| Model Context Protocol (MCP) Support |     🗓️     |                   |           |          |               |               |
| Anthropic Claude LLM Provider        |     🗓      |                   |           |    ️     |               |               |
| OLlama LLM Provider                  |     🗓      |                   |           |          |               |               |

# Worka Node.js Client

Production-ready orchestration for AI workloads: deterministic DAGs, context control, retries, and audit, all in one
TypeScript SDK.

## Getting Started

Install via npm or Yarn:

```bash
npm install @worka-ai/worka
# or
yarn add @worka-ai/worka
```

```ts
import {DefaultApi, CreateTenantRequest} from '@worka-ai/worka';

const api = new DefaultApi({basePath: 'http://localhost:8080'});

async function main() {
    // 1. Create a new tenant
    const {body: tenant} = await api.tenantsPost({
        username: 'dev_user',
        determineConversationWithNarrative: 'narrative',
        determineConversationWithAgent: 0
    });
    console.log(`👉 Tenant: ${tenant.tenantId}`);

    // 2. Start a conversation
    const {body: conv} = await api.tenantsTenantIdConversationsPost(tenant.tenantId, {});
    console.log(`👉 Conversation: ${conv.conversationId}`);

    // 3. Run a workflow
    const {body: wf} = await api.tenantsTenantIdWorkflowsPost(tenant.tenantId, {
        conversationId: conv.conversationId,
        input: 'Hello, Worka!',
        freeform: false
    });
    console.log(`👉 Workflow: ${wf.workflowId}`);
}

main().catch(console.error);
```

## Server & Workers

Worka is powered by two standalone binaries:

- **API Server** (`worka-server`): serves tenant configs, conversations, workflows, and events.
- **Worker** (`worka-worker`): polls the API for tasks (LLM calls, tool execution, routing) and executes them.

Download pre-built releases for your platform: https://github.com/worka-ai/ais/releases

## Documentation & Community

- Full docs: https://docs.worka.ai
- Community chat: https://discord.gg/worka
- Launching on Product Hunt soon—stay tuned!
