# ToolUpsert

Payload for `/tool` PUT

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenant_id** | **int** |  | 
**tools** | [**List[CreateAgentRequestAgentsInnerRulesInnerToolsInner]**](CreateAgentRequestAgentsInnerRulesInnerToolsInner.md) |  | 

## Example

```python
from worka.models.tool_upsert import ToolUpsert

# TODO update the JSON string below
json = "{}"
# create an instance of ToolUpsert from a JSON string
tool_upsert_instance = ToolUpsert.from_json(json)
# print the JSON string representation of the object
print(ToolUpsert.to_json())

# convert the object into a dict
tool_upsert_dict = tool_upsert_instance.to_dict()
# create an instance of ToolUpsert from a dict
tool_upsert_from_dict = ToolUpsert.from_dict(tool_upsert_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


