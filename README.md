# Worka: The Agentic AI Server

Worka is a production-grade, deterministic AI server for orchestrating multi-agent workflows.  
It acts like an AI-native nginx—serving composable DAGs, toolchains, and LLM-powered agents from your own infrastructure or via Docker.

# Worka

<p align="center">
  <em>Your multi-agent, DAG-based workflow engine powered by LLMs.</em>
</p>

## Why Worka?

Worka transforms free-form messages into fully-automated business workflows.
It empowers development teams to orchestrate complex, multi-agent workflows with confidence. 
Build reliable, secure, and scalable multi-agent workflows with ease.
Our platform provides:

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

## ✨ Core Features

### Multi-Agent Routing
- Conversation agent for initial message assignment.
- Declarative edges (`agent_edge`, `agent_edge_condition`) define who runs next based on rules and script conditions.

### Enhanced DAG Schema
- **semantic_key** + **nonce**: content-based, collision-resistant IDs.
- **side_effect** flag for external mutations.
- **retention** levels (`ephemeral`, `default`, `sticky`) to manage history footprint.

### Context Control
- `max_token_budget`, `include_tags`/`exclude_tags`, `min_event_weight`, `vault_hints`.
- Selective history shaping ensures your prompts stay within token limits without sacrificing relevance.

### Secure Vault & PII Management
- Vault table with optional conversation scoping.
- `vault_redaction` log for audit of Presidio-based NER redactions.
- `$tool:vault:conversation:<key>` & `$tool:vault:global:<key>` for secrets injection.

### Self-Adaptive Execution
- **logprob_observation** & **logprob_calibration** track LLM confidence.
- Automatic DAG retries with temperature/provider fallback.
- Human escalation after configurable retry thresholds.

### Extensible Tooling
- Register any HTTP endpoint or inline JS as functions.
- `is_idempotent` flag guides safe retries.
- Tag-based discovery and dynamic tool injection per agent.

### WASM-First & Rust-Powered
- ACID PostgreSQL persistence via raw SQL.
- Boa JS engine for sandboxed conditions.
- Full client- or server-side deployment in a single Wasm module.

## 🛠 Getting Started

1. **Install** Worka on your server or embed the Wasm module in your application.
2. **Register** your tenants, agents, rules, and tools via our APIs.
3. **Send** your first message—Worka will spawn a workflow, generate a DAG, and execute it end-to-end.

Learn more in our [documentation](#) and see examples in the `/examples` folder!

## 📦 Repository Contents

This repo contains:

- `clients/`: Official Worka SDKs and client integrations.
- No source for the Worka server is included here.
- The server is distributed as a binary (e.g. Docker image).

## 🔑 Licensing Overview

- **Clients (in this repo)** are licensed under the [MIT License](LICENSE_CLIENTS.md).
- **Worka Server Binary** is licensed under the [Worka Binary License Agreement (WBLA)](EULA.md), which:
    - Allows free use for individuals and companies with under $1M/year revenue.
    - Allows redistribution with required attribution.
    - Offers a $50M revenue cap if you post a tutorial or blog with attribution.
    - Provides no access to or rights to the server source code.

## 📜 Attribution Requirement

If you redistribute Worka (e.g. bundled in apps or other Docker images), you **must include** a **visible, do-follow link to [https://worka.ai](https://worka.ai)** in your documentation, website, README, or UI where Worka is used.

## 🚀 Virality Uplift

Want to use Worka for free even if your company makes up to $50M/year?

📢 Just publish:
- A public blog post on your company or personal site describing your use of Worka.
- And/or a YouTube tutorial (≥ 5 minutes) demonstrating how Worka is used in your setup.

💡 Be sure to include a visible do-follow link to [https://worka.ai](https://worka.ai) in the post or video description.

## 🧠 Learn More

- [Official Docs](https://worka.ai)
- [License: Worka Binary EULA](EULA.md)
- [License: MIT for Clients](LICENSE_CLIENTS.md)

---

[![Powered by Worka](https://img.shields.io/badge/Powered%20by-Worka-blue?style=for-the-badge&logo=vercel)](https://worka.ai)
