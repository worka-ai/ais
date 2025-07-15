# Worka: The Agentic AI Server

Worka is a production-grade, deterministic AI server for orchestrating multi-agent workflows.  
It acts like an AI-native nginx—serving composable DAGs, toolchains, and LLM-powered agents from your own infrastructure or via Docker.

# Worka

<p align="center">
  <em>Your multi-agent, DAG-based workflow engine powered by LLMs.</em>
</p>

## 🚀 Why Worka?

Worka transforms free-form messages into fully-automated business workflows by combining:
- **Multi-Agent Architecture**: Specialized agents handle focused tasks, reducing LLM hallucinations and maintenance overhead.
- **DAG Orchestration**: Every action is a node in a directed acyclic graph, ensuring clear dependencies, parallelism, and correct ordering.
- **Idempotent Execution**: Deterministic nonces and semantic keys guarantee each side-effecting step runs exactly once—even on retries or restarts.
- **Context-Aware Prompts**: Fine-grained context control lets you prune, prioritize, and budget tokens to maximize LLM relevance and minimize cost.
- **Secure Vault & PII Redaction**: Integrate with Microsoft Presidio, store secrets in a tenant- or conversation-scoped vault, and keep sensitive data out of prompts.
- **Self-Adaptive & Human-in-the-Loop**: Automatic retries on low-confidence DAGs, multi-provider switching, and built-in escalation for human review when needed.
- **Audit & Observability**: Rich event logs with weights, tags, and retention settings—plus log-prob calibration—for full traceability and dynamic history assembly.
- **WASM-First Deployment**: Run the entire engine, database, and JS sandbox in a single Wasm module, client-side or server-side.

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
