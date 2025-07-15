# Worka::CreateWorkflowRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **agent_id** | **Integer** |  | [optional] |
| **cached_content** | **Object** |  | [optional] |
| **conversation_id** | **Integer** |  | [optional] |
| **cron** | **String** |  | [optional] |
| **freeform** | **Boolean** |  |  |
| **generation_config** | [**CreateWorkflowRequestGenerationConfig**](CreateWorkflowRequestGenerationConfig.md) |  | [optional] |
| **input** | **String** |  |  |
| **input_event_weight** | **Float** |  | [optional] |
| **output_event_weight** | **Float** |  | [optional] |
| **tenant_id** | **Integer** |  |  |

## Example

```ruby
require 'worka'

instance = Worka::CreateWorkflowRequest.new(
  agent_id: null,
  cached_content: null,
  conversation_id: null,
  cron: null,
  freeform: null,
  generation_config: null,
  input: null,
  input_event_weight: null,
  output_event_weight: null,
  tenant_id: null
)
```

