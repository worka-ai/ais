

# UpsertAgentRequestAgentsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**description** | **String** |  |  |
|**edges** | [**List&lt;UpsertAgentRequestAgentsInnerEdgesInner&gt;**](UpsertAgentRequestAgentsInnerEdgesInner.md) |  |  [optional] |
|**examples** | **List&lt;String&gt;** |  |  [optional] |
|**expectedInput** | **String** | The info the agent expects in its prompt |  |
|**id** | **Long** |  |  |
|**isDefault** | **OffsetDateTime** |  |  [optional] |
|**name** | **String** |  |  |
|**rules** | [**List&lt;UpsertAgentRequestAgentsInnerRulesInner&gt;**](UpsertAgentRequestAgentsInnerRulesInner.md) |  |  |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**tenantId** | **Long** |  |  |
|**tools** | [**List&lt;UpsertAgentRequestAgentsInnerRulesInnerToolsInner&gt;**](UpsertAgentRequestAgentsInnerRulesInnerToolsInner.md) | Tools that the agent itself has access to as opposed to those inherited from the rules |  [optional] |



