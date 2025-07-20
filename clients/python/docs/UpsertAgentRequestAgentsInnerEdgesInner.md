# UpsertAgentRequestAgentsInnerEdgesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conditions** | **List[int]** | These are rule IDs that act as conditions to prevent an agent being called unless all the conditions in this list are true.  0 or more conditions under which the source agent can invoke the associated [target] [Agent] If empty, the target can be invoked under any circumstances | [optional] 
**priority** | **int** | If two edges could be invoked and both are not required then the highest priority one should be executed | [optional] 
**script_condition** | **str** | A JavaScript condition which must evaluate to true for the agent to be executed | [optional] 
**target_agent_id** | **int** | The agent ID that should be called if [script_condition] or any of the [conditions] are true | 

## Example

```python
from worka.models.upsert_agent_request_agents_inner_edges_inner import UpsertAgentRequestAgentsInnerEdgesInner

# TODO update the JSON string below
json = "{}"
# create an instance of UpsertAgentRequestAgentsInnerEdgesInner from a JSON string
upsert_agent_request_agents_inner_edges_inner_instance = UpsertAgentRequestAgentsInnerEdgesInner.from_json(json)
# print the JSON string representation of the object
print(UpsertAgentRequestAgentsInnerEdgesInner.to_json())

# convert the object into a dict
upsert_agent_request_agents_inner_edges_inner_dict = upsert_agent_request_agents_inner_edges_inner_instance.to_dict()
# create an instance of UpsertAgentRequestAgentsInnerEdgesInner from a dict
upsert_agent_request_agents_inner_edges_inner_from_dict = UpsertAgentRequestAgentsInnerEdgesInner.from_dict(upsert_agent_request_agents_inner_edges_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


