# UpsertAgentRequest

UpsertAgent (under a tenant)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agents** | [**List[UpsertAgentRequestAgentsInner]**](UpsertAgentRequestAgentsInner.md) |  | 

## Example

```python
from worka.models.upsert_agent_request import UpsertAgentRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpsertAgentRequest from a JSON string
upsert_agent_request_instance = UpsertAgentRequest.from_json(json)
# print the JSON string representation of the object
print(UpsertAgentRequest.to_json())

# convert the object into a dict
upsert_agent_request_dict = upsert_agent_request_instance.to_dict()
# create an instance of UpsertAgentRequest from a dict
upsert_agent_request_from_dict = UpsertAgentRequest.from_dict(upsert_agent_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


