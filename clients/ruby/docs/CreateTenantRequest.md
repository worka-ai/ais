# Worka::CreateTenantRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **determine_conversation_with_agent** | **Integer** |  |  |
| **determine_conversation_with_narrative** | **String** |  |  |
| **tenant_id** | **Integer** |  |  |
| **username** | **String** |  |  |

## Example

```ruby
require 'worka'

instance = Worka::CreateTenantRequest.new(
  determine_conversation_with_agent: null,
  determine_conversation_with_narrative: null,
  tenant_id: null,
  username: null
)
```

