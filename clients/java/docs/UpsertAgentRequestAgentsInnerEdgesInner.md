

# UpsertAgentRequestAgentsInnerEdgesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conditions** | **List&lt;Long&gt;** | These are rule IDs that act as conditions to prevent an agent being called unless all the conditions in this list are true.  0 or more conditions under which the source agent can invoke the associated [target] [Agent] If empty, the target can be invoked under any circumstances |  [optional] |
|**priority** | **Integer** | If two edges could be invoked and both are not required then the highest priority one should be executed |  [optional] |
|**scriptCondition** | **String** | A JavaScript condition which must evaluate to true for the agent to be executed |  [optional] |
|**targetAgentId** | **Long** | The agent ID that should be called if [script_condition] or any of the [conditions] are true |  |



