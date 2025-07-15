# CreateAgentRequestAgentsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **datetime** |  | 
**description** | **str** |  | 
**edges** | [**List[CreateAgentRequestAgentsInnerEdgesInner]**](CreateAgentRequestAgentsInnerEdgesInner.md) |  | 
**examples** | **List[str]** |  | [optional] 
**expected_input** | **str** | The info the agent expects in its prompt | 
**id** | **int** |  | 
**is_default** | **datetime** |  | [optional] 
**name** | **str** |  | 
**rules** | [**List[CreateAgentRequestAgentsInnerRulesInner]**](CreateAgentRequestAgentsInnerRulesInner.md) |  | 
**tags** | **List[str]** |  | [optional] 
**tenant_id** | **int** |  | 
**tools** | [**List[CreateAgentRequestAgentsInnerRulesInnerToolsInner]**](CreateAgentRequestAgentsInnerRulesInnerToolsInner.md) |  | 

## Example

```python
from worka.models.create_agent_request_agents_inner import CreateAgentRequestAgentsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CreateAgentRequestAgentsInner from a JSON string
create_agent_request_agents_inner_instance = CreateAgentRequestAgentsInner.from_json(json)
# print the JSON string representation of the object
print(CreateAgentRequestAgentsInner.to_json())

# convert the object into a dict
create_agent_request_agents_inner_dict = create_agent_request_agents_inner_instance.to_dict()
# create an instance of CreateAgentRequestAgentsInner from a dict
create_agent_request_agents_inner_from_dict = CreateAgentRequestAgentsInner.from_dict(create_agent_request_agents_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


