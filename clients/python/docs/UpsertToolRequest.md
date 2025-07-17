# UpsertToolRequest

UpsertTool (under a tenant)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tools** | [**List[UpsertAgentRequestAgentsInnerRulesInnerToolsInner]**](UpsertAgentRequestAgentsInnerRulesInnerToolsInner.md) |  | 

## Example

```python
from worka.models.upsert_tool_request import UpsertToolRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpsertToolRequest from a JSON string
upsert_tool_request_instance = UpsertToolRequest.from_json(json)
# print the JSON string representation of the object
print(UpsertToolRequest.to_json())

# convert the object into a dict
upsert_tool_request_dict = upsert_tool_request_instance.to_dict()
# create an instance of UpsertToolRequest from a dict
upsert_tool_request_from_dict = UpsertToolRequest.from_dict(upsert_tool_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


