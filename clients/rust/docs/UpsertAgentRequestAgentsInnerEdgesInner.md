# UpsertAgentRequestAgentsInnerEdgesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conditions** | Option<**Vec<i64>**> | These are rule IDs that act as conditions to prevent an agent being called unless all the conditions in this list are true.  0 or more conditions under which the source agent can invoke the associated [target] [Agent] If empty, the target can be invoked under any circumstances | [optional]
**priority** | Option<**i32**> | If two edges could be invoked and both are not required then the highest priority one should be executed | [optional]
**script_condition** | Option<**String**> | A JavaScript condition which must evaluate to true for the agent to be executed | [optional]
**target_agent_id** | **i64** | The agent ID that should be called if [script_condition] or any of the [conditions] are true | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


