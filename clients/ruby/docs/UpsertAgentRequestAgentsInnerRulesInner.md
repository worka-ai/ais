# Worka::UpsertAgentRequestAgentsInnerRulesInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **content** | **String** |  | [optional] |
| **description** | **String** |  | [optional] |
| **id** | **Integer** |  | [optional] |
| **name** | **String** |  | [optional] |
| **position** | **Integer** |  | [optional] |
| **rule_created_at** | **Time** |  | [optional] |
| **tags** | **Array&lt;String&gt;** |  | [optional] |
| **tenant_id** | **Integer** |  | [optional] |
| **tools** | [**Array&lt;UpsertAgentRequestAgentsInnerRulesInnerToolsInner&gt;**](UpsertAgentRequestAgentsInnerRulesInnerToolsInner.md) |  | [optional] |
| **version_created_at** | **Time** |  | [optional] |
| **version_id** | **Integer** |  | [optional] |

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

