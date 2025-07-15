# CreateAgentRequestAgentsInnerEdgesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conditions** | **List[int]** | 0 or more conditions under which the source agent can invoke the associated [target] [Agent] If empty, the target can be invoked under any circumstances | 
**priority** | **int** | If two edges could be invoked and both are not required then the highest priority one should be executed | 
**script_condition** | **str** | A JavaScript condition which must evaluate to true for the agent to be executed | [optional] 
**target_agent_id** | **int** | The agent ID that should be called if [script_condition] or any of the [conditions] are true | 

## Example

```python
from worka.models.create_agent_request_agents_inner_edges_inner import CreateAgentRequestAgentsInnerEdgesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CreateAgentRequestAgentsInnerEdgesInner from a JSON string
create_agent_request_agents_inner_edges_inner_instance = CreateAgentRequestAgentsInnerEdgesInner.from_json(json)
# print the JSON string representation of the object
print(CreateAgentRequestAgentsInnerEdgesInner.to_json())

# convert the object into a dict
create_agent_request_agents_inner_edges_inner_dict = create_agent_request_agents_inner_edges_inner_instance.to_dict()
# create an instance of CreateAgentRequestAgentsInnerEdgesInner from a dict
create_agent_request_agents_inner_edges_inner_from_dict = CreateAgentRequestAgentsInnerEdgesInner.from_dict(create_agent_request_agents_inner_edges_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


