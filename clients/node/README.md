# Worka Node.js Client

This is the official Node.js and TypeScript client library for interacting with the Worka multi-agent orchestration platform API.

## Features

- Auto-generated API client from the OpenAPI specification
- Fully typed for TypeScript
- Supports all Worka endpoints: tenants, LLM configurations, tools, agents, conversations, workflows, and events

## Prerequisites

- Node.js v14 or higher
- npm or Yarn
- TypeScript (if using in a TypeScript project)

## Installation

The client is published on NPM so the usual:

```shell
# npm
npm install @worka-ai/worka

# Yarn
yarn add @worka-ai/worka

```

If you want to use the latest from git then, install the client dependencies and build the library:

```bash
cd clients/node
npm install
npm run build
```

Then add the client as a dependency in your project (using a local file reference):

```bash
npm install ../clients/node
#or with yarn
yarn add file:../clients/node

```

## Usage

Import the client in your Node.js or TypeScript code:

```ts
import {
  DefaultApi,
  CreateTenantRequest,
  UpsertLLMConfigRequest,
  UpsertToolRequest,
  UpsertAgentRequest,
  CreateConversationUnderTenantRequest,
  CreateWorkflowUnderTenantRequest,
  GetWorkflowResponse,
} from 'worka-node-client'; // adjust the import path as needed
```

Initialize the API:

```ts
//Use https://api.worka.ai if using a Cloud Worka. 
const api = new DefaultApi({ basePath: 'http://localhost:8080' });
```

A full usage example is available in `examples/node/hello-world.ts`.

## Example

```ts
async function main() {
  // 1. Create a tenant
  const tenantReq: CreateTenantRequest = {
    username: 'support_bot',
    determineConversationWithNarrative: 'narrative',
    determineConversationWithAgent: 0,
  };
  const { body: tenantResp } = await api.tenantsPost(tenantReq);

  // 2. Add an LLM configuration
  const llmReq: UpsertLLMConfigRequest = {
    id: 1,
    provider: 'chatgpt',
    apiKey: 'YOUR_API_KEY',
    model: 'gpt-4',
    temperature: 0.7,
  };
  await api.tenantsTenantIdLlmConfigsPost(tenantResp.tenantId, llmReq);

  // 3. Register tools and agents (see example for details)

  // 4. Start a conversation and create a workflow
  const convReq: CreateConversationUnderTenantRequest = {};
  const { body: convResp } = await api.tenantsTenantIdConversationsPost(
    tenantResp.tenantId,
    convReq
  );

  const wfReq: CreateWorkflowUnderTenantRequest = {
    conversationId: convResp.conversationId,
    input: 'Support email: Customer reports error 500 when uploading a file.',
    freeform: false,
  };
  const { body: wfResp } = await api.tenantsTenantIdWorkflowsPost(
    tenantResp.tenantId,
    wfReq
  );

  // 5. Retrieve workflow events
  const { body: events }: { body: GetWorkflowResponse } =
    await api.workflowsIdGet(wfResp.workflowId);
  console.log('Workflow events:', events.events);
}

main().catch(console.error);
```

## API Reference

| Method                                                     | Description                                |
|------------------------------------------------------------|--------------------------------------------|
| `tenantsPost(request: CreateTenantRequest)`                | Create a new tenant                        |
| `tenantsTenantIdLlmConfigsPost(tenantId, request)`        | Add or update an LLM configuration         |
| `tenantsTenantIdToolsPut(tenantId, request)`              | Register tools                             |
| `tenantsTenantIdAgentsPut(tenantId, request)`             | Create or update agents                    |
| `tenantsTenantIdConversationsPost(tenantId, request)`     | Start a new conversation                   |
| `tenantsTenantIdWorkflowsPost(tenantId, request)`         | Create a new workflow                      |
| `workflowsIdGet(workflowId)`                              | Retrieve workflow events and status        |

Refer to the models under `clients/node/api` for all request and response types.
