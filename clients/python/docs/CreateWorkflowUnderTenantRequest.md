# CreateWorkflowUnderTenantRequest

CreateWorkflow (under a tenant)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agent_id** | **int** |  | [optional] 
**cached_content** | **object** |  | [optional] 
**conversation_id** | **int** |  | [optional] 
**cron** | **str** |  | [optional] 
**freeform** | **bool** |  | 
**generation_config** | [**CreateWorkflowUnderTenantRequestGenerationConfig**](CreateWorkflowUnderTenantRequestGenerationConfig.md) |  | [optional] 
**input** | **str** |  | 
**input_event_weight** | **float** |  | [optional] 
**output_event_weight** | **float** |  | [optional] 

## Example

```python
from worka.models.create_workflow_under_tenant_request import CreateWorkflowUnderTenantRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateWorkflowUnderTenantRequest from a JSON string
create_workflow_under_tenant_request_instance = CreateWorkflowUnderTenantRequest.from_json(json)
# print the JSON string representation of the object
print(CreateWorkflowUnderTenantRequest.to_json())

# convert the object into a dict
create_workflow_under_tenant_request_dict = create_workflow_under_tenant_request_instance.to_dict()
# create an instance of CreateWorkflowUnderTenantRequest from a dict
create_workflow_under_tenant_request_from_dict = CreateWorkflowUnderTenantRequest.from_dict(create_workflow_under_tenant_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


