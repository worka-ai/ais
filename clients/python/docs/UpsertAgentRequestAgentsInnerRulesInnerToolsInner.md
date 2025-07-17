# UpsertAgentRequestAgentsInnerRulesInnerToolsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**function_declarations** | [**List[UpsertAgentRequestAgentsInnerRulesInnerToolsInnerFunctionDeclarationsInner]**](UpsertAgentRequestAgentsInnerRulesInnerToolsInnerFunctionDeclarationsInner.md) |  | 
**id** | **int** |  | [optional] 
**name** | **str** |  | [optional] 

## Example

```python
from worka.models.upsert_agent_request_agents_inner_rules_inner_tools_inner import UpsertAgentRequestAgentsInnerRulesInnerToolsInner

# TODO update the JSON string below
json = "{}"
# create an instance of UpsertAgentRequestAgentsInnerRulesInnerToolsInner from a JSON string
upsert_agent_request_agents_inner_rules_inner_tools_inner_instance = UpsertAgentRequestAgentsInnerRulesInnerToolsInner.from_json(json)
# print the JSON string representation of the object
print(UpsertAgentRequestAgentsInnerRulesInnerToolsInner.to_json())

# convert the object into a dict
upsert_agent_request_agents_inner_rules_inner_tools_inner_dict = upsert_agent_request_agents_inner_rules_inner_tools_inner_instance.to_dict()
# create an instance of UpsertAgentRequestAgentsInnerRulesInnerToolsInner from a dict
upsert_agent_request_agents_inner_rules_inner_tools_inner_from_dict = UpsertAgentRequestAgentsInnerRulesInnerToolsInner.from_dict(upsert_agent_request_agents_inner_rules_inner_tools_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


