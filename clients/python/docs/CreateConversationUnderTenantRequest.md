# CreateConversationUnderTenantRequest

CreateConversation (under a tenant)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tags** | **List[str]** |  | [optional] 
**title** | **str** |  | [optional] 

## Example

```python
from worka.models.create_conversation_under_tenant_request import CreateConversationUnderTenantRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateConversationUnderTenantRequest from a JSON string
create_conversation_under_tenant_request_instance = CreateConversationUnderTenantRequest.from_json(json)
# print the JSON string representation of the object
print(CreateConversationUnderTenantRequest.to_json())

# convert the object into a dict
create_conversation_under_tenant_request_dict = create_conversation_under_tenant_request_instance.to_dict()
# create an instance of CreateConversationUnderTenantRequest from a dict
create_conversation_under_tenant_request_from_dict = CreateConversationUnderTenantRequest.from_dict(create_conversation_under_tenant_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


