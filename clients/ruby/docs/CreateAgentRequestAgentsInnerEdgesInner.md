# Worka::CreateAgentRequestAgentsInnerEdgesInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **conditions** | **Array&lt;Integer&gt;** | 0 or more conditions under which the source agent can invoke the associated [target] [Agent] If empty, the target can be invoked under any circumstances |  |
| **priority** | **Integer** | If two edges could be invoked and both are not required then the highest priority one should be executed |  |
| **script_condition** | **String** | A JavaScript condition which must evaluate to true for the agent to be executed | [optional] |
| **target_agent_id** | **Integer** | The agent ID that should be called if [script_condition] or any of the [conditions] are true |  |

## Example

```ruby
require 'worka'

instance = Worka::CreateAgentRequestAgentsInnerEdgesInner.new(
  conditions: null,
  priority: null,
  script_condition: null,
  target_agent_id: null
)
```

