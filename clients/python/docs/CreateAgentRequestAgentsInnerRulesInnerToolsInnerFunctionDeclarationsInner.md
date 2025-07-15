# CreateAgentRequestAgentsInnerRulesInnerToolsInnerFunctionDeclarationsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | 
**id** | **int** |  | [optional] 
**internal** | [**CreateAgentRequestAgentsInnerRulesInnerToolsInnerFunctionDeclarationsInnerInternal**](CreateAgentRequestAgentsInnerRulesInnerToolsInnerFunctionDeclarationsInnerInternal.md) |  | [optional] 
**name** | **str** | Required. The name of the function to call. Must start with a letter or an underscore. Must be a-z, A-Z, 0-9, or contain underscores, dots and dashes, with a maximum length of 64. | 
**parameters** | **object** |  | 
**response** | **object** |  | [optional] 

## Example

```python
from worka.models.create_agent_request_agents_inner_rules_inner_tools_inner_function_declarations_inner import CreateAgentRequestAgentsInnerRulesInnerToolsInnerFunctionDeclarationsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CreateAgentRequestAgentsInnerRulesInnerToolsInnerFunctionDeclarationsInner from a JSON string
create_agent_request_agents_inner_rules_inner_tools_inner_function_declarations_inner_instance = CreateAgentRequestAgentsInnerRulesInnerToolsInnerFunctionDeclarationsInner.from_json(json)
# print the JSON string representation of the object
print(CreateAgentRequestAgentsInnerRulesInnerToolsInnerFunctionDeclarationsInner.to_json())

# convert the object into a dict
create_agent_request_agents_inner_rules_inner_tools_inner_function_declarations_inner_dict = create_agent_request_agents_inner_rules_inner_tools_inner_function_declarations_inner_instance.to_dict()
# create an instance of CreateAgentRequestAgentsInnerRulesInnerToolsInnerFunctionDeclarationsInner from a dict
create_agent_request_agents_inner_rules_inner_tools_inner_function_declarations_inner_from_dict = CreateAgentRequestAgentsInnerRulesInnerToolsInnerFunctionDeclarationsInner.from_dict(create_agent_request_agents_inner_rules_inner_tools_inner_function_declarations_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


