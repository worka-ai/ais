# CreateAgentRequestAgentsInnerRulesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** |  | 
**description** | **str** |  | 
**id** | **int** |  | 
**name** | **str** |  | 
**position** | **int** |  | 
**rule_created_at** | **datetime** |  | 
**tags** | **List[str]** |  | [optional] 
**tenant_id** | **int** |  | 
**tools** | [**List[CreateAgentRequestAgentsInnerRulesInnerToolsInner]**](CreateAgentRequestAgentsInnerRulesInnerToolsInner.md) |  | [optional] 
**version_created_at** | **datetime** |  | 
**version_id** | **int** |  | 

## Example

```python
from worka.models.create_agent_request_agents_inner_rules_inner import CreateAgentRequestAgentsInnerRulesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CreateAgentRequestAgentsInnerRulesInner from a JSON string
create_agent_request_agents_inner_rules_inner_instance = CreateAgentRequestAgentsInnerRulesInner.from_json(json)
# print the JSON string representation of the object
print(CreateAgentRequestAgentsInnerRulesInner.to_json())

# convert the object into a dict
create_agent_request_agents_inner_rules_inner_dict = create_agent_request_agents_inner_rules_inner_instance.to_dict()
# create an instance of CreateAgentRequestAgentsInnerRulesInner from a dict
create_agent_request_agents_inner_rules_inner_from_dict = CreateAgentRequestAgentsInnerRulesInner.from_dict(create_agent_request_agents_inner_rules_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


