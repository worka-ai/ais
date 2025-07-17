# Worka::UpsertLLMConfigRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **api_key** | **String** |  |  |
| **conversation_id** | **Integer** |  | [optional] |
| **id** | **Integer** |  | [optional] |
| **location** | **String** |  | [optional] |
| **model** | **String** |  |  |
| **project_id** | **String** |  | [optional] |
| **provider** | **String** |  |  |
| **temperature** | **Float** |  |  |
| **workflow_id** | **Integer** |  | [optional] |

## Example

```ruby
require 'worka'

instance = Worka::UpsertLLMConfigRequest.new(
  api_key: null,
  conversation_id: null,
  id: null,
  location: null,
  model: null,
  project_id: null,
  provider: null,
  temperature: null,
  workflow_id: null
)
```

