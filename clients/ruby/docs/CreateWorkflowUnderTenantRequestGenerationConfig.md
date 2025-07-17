# Worka::CreateWorkflowUnderTenantRequestGenerationConfig

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **candidate_count** | **Integer** |  | [optional] |
| **max_output_tokens** | **Integer** |  | [optional] |
| **stop_sequences** | **Array&lt;String&gt;** |  | [optional] |
| **temperature** | **Float** |  | [optional] |
| **top_k** | **Integer** |  | [optional] |
| **top_p** | **Float** |  | [optional] |

## Example

```ruby
require 'worka'

instance = Worka::CreateWorkflowUnderTenantRequestGenerationConfig.new(
  candidate_count: null,
  max_output_tokens: null,
  stop_sequences: null,
  temperature: null,
  top_k: null,
  top_p: null
)
```

