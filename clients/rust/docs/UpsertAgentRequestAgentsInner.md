# UpsertAgentRequestAgentsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | Option<**String**> |  | [optional]
**description** | **String** |  | 
**edges** | Option<[**Vec<models::UpsertAgentRequestAgentsInnerEdgesInner>**](UpsertAgentRequest_agents_inner_edges_inner.md)> |  | [optional]
**examples** | Option<**Vec<String>**> |  | [optional]
**expected_input** | **String** | The info the agent expects in its prompt | 
**id** | **i64** |  | 
**is_default** | Option<**String**> |  | [optional]
**name** | **String** |  | 
**rules** | [**Vec<models::UpsertAgentRequestAgentsInnerRulesInner>**](UpsertAgentRequest_agents_inner_rules_inner.md) |  | 
**tags** | Option<**Vec<String>**> |  | [optional]
**tenant_id** | **i64** |  | 
**tools** | Option<[**Vec<models::UpsertAgentRequestAgentsInnerRulesInnerToolsInner>**](UpsertAgentRequest_agents_inner_rules_inner_tools_inner.md)> | Tools that the agent itself has access to as opposed to those inherited from the rules | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


