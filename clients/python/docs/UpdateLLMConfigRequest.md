# UpdateLLMConfigRequest

UpdateLLMConfig

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**api_key** | **str** |  | 
**conversation_id** | **int** |  | [optional] 
**id** | **int** |  | [optional] 
**location** | **str** |  | [optional] 
**model** | **str** |  | 
**project_id** | **str** |  | [optional] 
**provider** | **str** |  | 
**temperature** | **float** |  | 
**tenant_id** | **int** |  | 
**workflow_id** | **int** |  | [optional] 

## Example

```python
from worka.models.update_llm_config_request import UpdateLLMConfigRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateLLMConfigRequest from a JSON string
update_llm_config_request_instance = UpdateLLMConfigRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateLLMConfigRequest.to_json())

# convert the object into a dict
update_llm_config_request_dict = update_llm_config_request_instance.to_dict()
# create an instance of UpdateLLMConfigRequest from a dict
update_llm_config_request_from_dict = UpdateLLMConfigRequest.from_dict(update_llm_config_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


