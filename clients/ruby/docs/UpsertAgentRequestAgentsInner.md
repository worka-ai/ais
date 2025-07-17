# Worka::UpsertAgentRequestAgentsInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **created_at** | **Time** |  |  |
| **description** | **String** |  |  |
| **edges** | [**Array&lt;UpsertAgentRequestAgentsInnerEdgesInner&gt;**](UpsertAgentRequestAgentsInnerEdgesInner.md) |  |  |
| **examples** | **Array&lt;String&gt;** |  | [optional] |
| **expected_input** | **String** | The info the agent expects in its prompt |  |
| **id** | **Integer** |  |  |
| **is_default** | **Time** |  | [optional] |
| **name** | **String** |  |  |
| **rules** | [**Array&lt;UpsertAgentRequestAgentsInnerRulesInner&gt;**](UpsertAgentRequestAgentsInnerRulesInner.md) |  |  |
| **tags** | **Array&lt;String&gt;** |  | [optional] |
| **tenant_id** | **Integer** |  |  |
| **tools** | [**Array&lt;UpsertAgentRequestAgentsInnerRulesInnerToolsInner&gt;**](UpsertAgentRequestAgentsInnerRulesInnerToolsInner.md) |  |  |

## Example

```ruby
require 'worka'

instance = Worka::UpsertAgentRequestAgentsInner.new(
  created_at: null,
  description: null,
  edges: null,
  examples: null,
  expected_input: null,
  id: null,
  is_default: null,
  name: null,
  rules: null,
  tags: null,
  tenant_id: null,
  tools: null
)
```

