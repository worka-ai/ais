# Worka::CreateAgentRequestAgentsInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **created_at** | **Time** |  |  |
| **description** | **String** |  |  |
| **edges** | [**Array&lt;CreateAgentRequestAgentsInnerEdgesInner&gt;**](CreateAgentRequestAgentsInnerEdgesInner.md) |  |  |
| **examples** | **Array&lt;String&gt;** |  | [optional] |
| **expected_input** | **String** | The info the agent expects in its prompt |  |
| **id** | **Integer** |  |  |
| **is_default** | **Time** |  | [optional] |
| **name** | **String** |  |  |
| **rules** | [**Array&lt;CreateAgentRequestAgentsInnerRulesInner&gt;**](CreateAgentRequestAgentsInnerRulesInner.md) |  |  |
| **tags** | **Array&lt;String&gt;** |  | [optional] |
| **tenant_id** | **Integer** |  |  |
| **tools** | [**Array&lt;CreateAgentRequestAgentsInnerRulesInnerToolsInner&gt;**](CreateAgentRequestAgentsInnerRulesInnerToolsInner.md) |  |  |

## Example

```ruby
require 'worka'

instance = Worka::CreateAgentRequestAgentsInner.new(
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

