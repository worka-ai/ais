# Automated Customer-Support Triage & Resolution Example

This script uses the Worka Node.js client to demonstrate how to:
1. Create a new tenant for your support bot.
2. Configure two LLM providers (Gemini & Vertex).
3. Register a suite of tools for email parsing, KB lookup, ticket search,
   response drafting, and quality checking.
4. Define a graph of agents with edges to orchestrate a triage workflow:
    - InboxScanner parses incoming emails.
    - KBLookup and TicketSearch run in parallel on parsed content.
    - DraftResponder generates a draft reply based on context.
    - QualityChecker reviews and refines the draft.
5. Start a conversation and trigger the workflow to process a support email.

The agent graph prdocued by this is something like:
```ascii
                   +---------------+
                   | InboxScanner  |
                   +---------------+
                    |           |
           ([],1)   |           |   ([],1)
                    V           V
             +-----------+   +--------------+
             | KBLookup  |   | TicketSearch |
             +-----------+   +--------------+
                    \            /
             ([],1)   \          /   ([],1)
                      \        /
                       V      V
                   +-----------------+
                   | DraftResponder  |
                   +-----------------+
                          |
                     ([],1)
                          |
                          V
                   +-----------------+
                   | QualityChecker  |
                   +-----------------+
                          |
                     ([2],1)
                          |
                          V
                   +-----------------+
                   | DraftResponder  |
                   +-----------------+
```
Run with: `npx ts-node hello-world.ts`
