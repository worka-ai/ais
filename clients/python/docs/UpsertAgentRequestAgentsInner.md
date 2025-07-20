# UpsertAgentRequestAgentsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **datetime** |  | [optional] 
**description** | **str** |  | 
**edges** | [**List[UpsertAgentRequestAgentsInnerEdgesInner]**](UpsertAgentRequestAgentsInnerEdgesInner.md) |  | [optional] 
**examples** | **List[str]** |  | [optional] 
**expected_input** | **str** | The info the agent expects in its prompt | 
**id** | **int** |  | 
**is_default** | **datetime** |  | [optional] 
**name** | **str** |  | 
**rules** | [**List[UpsertAgentRequestAgentsInnerRulesInner]**](UpsertAgentRequestAgentsInnerRulesInner.md) |  | 
**tags** | **List[str]** |  | [optional] 
**tenant_id** | **int** |  | 
**tools** | [**List[UpsertAgentRequestAgentsInnerRulesInnerToolsInner]**](UpsertAgentRequestAgentsInnerRulesInnerToolsInner.md) | Tools that the agent itself has access to as opposed to those inherited from the rules | [optional] 

## Example

```python
from worka.models.upsert_agent_request_agents_inner import UpsertAgentRequestAgentsInner

# TODO update the JSON string below
json = "{}"
# create an instance of UpsertAgentRequestAgentsInner from a JSON string
upsert_agent_request_agents_inner_instance = UpsertAgentRequestAgentsInner.from_json(json)
# print the JSON string representation of the object
print(UpsertAgentRequestAgentsInner.to_json())

# convert the object into a dict
upsert_agent_request_agents_inner_dict = upsert_agent_request_agents_inner_instance.to_dict()
# create an instance of UpsertAgentRequestAgentsInner from a dict
upsert_agent_request_agents_inner_from_dict = UpsertAgentRequestAgentsInner.from_dict(upsert_agent_request_agents_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


