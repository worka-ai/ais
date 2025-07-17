# UpsertLLMConfigRequest

UpsertLLMConfig (under a tenant)

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
**workflow_id** | **int** |  | [optional] 

## Example

```python
from worka.models.upsert_llm_config_request import UpsertLLMConfigRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpsertLLMConfigRequest from a JSON string
upsert_llm_config_request_instance = UpsertLLMConfigRequest.from_json(json)
# print the JSON string representation of the object
print(UpsertLLMConfigRequest.to_json())

# convert the object into a dict
upsert_llm_config_request_dict = upsert_llm_config_request_instance.to_dict()
# create an instance of UpsertLLMConfigRequest from a dict
upsert_llm_config_request_from_dict = UpsertLLMConfigRequest.from_dict(upsert_llm_config_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


