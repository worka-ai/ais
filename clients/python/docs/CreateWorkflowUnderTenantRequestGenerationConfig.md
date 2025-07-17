# CreateWorkflowUnderTenantRequestGenerationConfig


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**candidate_count** | **int** |  | [optional] 
**max_output_tokens** | **int** |  | [optional] 
**stop_sequences** | **List[str]** |  | [optional] 
**temperature** | **float** |  | [optional] 
**top_k** | **int** |  | [optional] 
**top_p** | **float** |  | [optional] 

## Example

```python
from worka.models.create_workflow_under_tenant_request_generation_config import CreateWorkflowUnderTenantRequestGenerationConfig

# TODO update the JSON string below
json = "{}"
# create an instance of CreateWorkflowUnderTenantRequestGenerationConfig from a JSON string
create_workflow_under_tenant_request_generation_config_instance = CreateWorkflowUnderTenantRequestGenerationConfig.from_json(json)
# print the JSON string representation of the object
print(CreateWorkflowUnderTenantRequestGenerationConfig.to_json())

# convert the object into a dict
create_workflow_under_tenant_request_generation_config_dict = create_workflow_under_tenant_request_generation_config_instance.to_dict()
# create an instance of CreateWorkflowUnderTenantRequestGenerationConfig from a dict
create_workflow_under_tenant_request_generation_config_from_dict = CreateWorkflowUnderTenantRequestGenerationConfig.from_dict(create_workflow_under_tenant_request_generation_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


