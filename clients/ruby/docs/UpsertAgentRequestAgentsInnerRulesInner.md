# Worka::UpsertAgentRequestAgentsInnerRulesInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **content** | **String** |  |  |
| **description** | **String** |  |  |
| **id** | **Integer** |  |  |
| **name** | **String** |  |  |
| **position** | **Integer** |  |  |
| **rule_created_at** | **Time** |  |  |
| **tags** | **Array&lt;String&gt;** |  | [optional] |
| **tenant_id** | **Integer** |  |  |
| **tools** | [**Array&lt;UpsertAgentRequestAgentsInnerRulesInnerToolsInner&gt;**](UpsertAgentRequestAgentsInnerRulesInnerToolsInner.md) |  | [optional] |
| **version_created_at** | **Time** |  |  |
| **version_id** | **Integer** |  |  |

## Example

```ruby
require 'worka'

instance = Worka::UpsertAgentRequestAgentsInnerRulesInner.new(
  content: null,
  description: null,
  id: null,
  name: null,
  position: null,
  rule_created_at: null,
  tags: null,
  tenant_id: null,
  tools: null,
  version_created_at: null,
  version_id: null
)
```

