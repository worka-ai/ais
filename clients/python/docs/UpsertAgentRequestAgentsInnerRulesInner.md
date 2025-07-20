# UpsertAgentRequestAgentsInnerRulesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**id** | **int** |  | [optional] 
**name** | **str** |  | [optional] 
**position** | **int** |  | [optional] 
**rule_created_at** | **datetime** |  | [optional] 
**tags** | **List[str]** |  | [optional] 
**tenant_id** | **int** |  | [optional] 
**tools** | [**List[UpsertAgentRequestAgentsInnerRulesInnerToolsInner]**](UpsertAgentRequestAgentsInnerRulesInnerToolsInner.md) |  | [optional] 
**version_created_at** | **datetime** |  | [optional] 
**version_id** | **int** |  | [optional] 

## Example

```python
from worka.models.upsert_agent_request_agents_inner_rules_inner import UpsertAgentRequestAgentsInnerRulesInner

# TODO update the JSON string below
json = "{}"
# create an instance of UpsertAgentRequestAgentsInnerRulesInner from a JSON string
upsert_agent_request_agents_inner_rules_inner_instance = UpsertAgentRequestAgentsInnerRulesInner.from_json(json)
# print the JSON string representation of the object
print(UpsertAgentRequestAgentsInnerRulesInner.to_json())

# convert the object into a dict
upsert_agent_request_agents_inner_rules_inner_dict = upsert_agent_request_agents_inner_rules_inner_instance.to_dict()
# create an instance of UpsertAgentRequestAgentsInnerRulesInner from a dict
upsert_agent_request_agents_inner_rules_inner_from_dict = UpsertAgentRequestAgentsInnerRulesInner.from_dict(upsert_agent_request_agents_inner_rules_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


