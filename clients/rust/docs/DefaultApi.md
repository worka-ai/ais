# \DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tenants_post**](DefaultApi.md#tenants_post) | **POST** /tenants | 
[**tenants_tenant_id_agents_put**](DefaultApi.md#tenants_tenant_id_agents_put) | **PUT** /tenants/{tenant_id}/agents | 
[**tenants_tenant_id_conversations_post**](DefaultApi.md#tenants_tenant_id_conversations_post) | **POST** /tenants/{tenant_id}/conversations | 
[**tenants_tenant_id_llm_configs_post**](DefaultApi.md#tenants_tenant_id_llm_configs_post) | **POST** /tenants/{tenant_id}/llm-configs | 
[**tenants_tenant_id_tools_put**](DefaultApi.md#tenants_tenant_id_tools_put) | **PUT** /tenants/{tenant_id}/tools | 
[**tenants_tenant_id_workflows_post**](DefaultApi.md#tenants_tenant_id_workflows_post) | **POST** /tenants/{tenant_id}/workflows | 
[**workflows_id_get**](DefaultApi.md#workflows_id_get) | **GET** /workflows/{id} | 



## tenants_post

> models::CreateTenantResponse tenants_post(create_tenant_request)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**create_tenant_request** | [**CreateTenantRequest**](CreateTenantRequest.md) |  | [required] |

### Return type

[**models::CreateTenantResponse**](CreateTenantResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tenants_tenant_id_agents_put

> models::CreateAgentResponse tenants_tenant_id_agents_put(tenant_id, upsert_agent_request)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tenant_id** | **i64** |  | [required] |
**upsert_agent_request** | [**UpsertAgentRequest**](UpsertAgentRequest.md) |  | [required] |

### Return type

[**models::CreateAgentResponse**](CreateAgentResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tenants_tenant_id_conversations_post

> models::CreateConversationResponse tenants_tenant_id_conversations_post(tenant_id, create_conversation_under_tenant_request)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tenant_id** | **i64** |  | [required] |
**create_conversation_under_tenant_request** | [**CreateConversationUnderTenantRequest**](CreateConversationUnderTenantRequest.md) |  | [required] |

### Return type

[**models::CreateConversationResponse**](CreateConversationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tenants_tenant_id_llm_configs_post

> models::UpdateLlmConfigResponse tenants_tenant_id_llm_configs_post(tenant_id, upsert_llm_config_request)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tenant_id** | **i64** |  | [required] |
**upsert_llm_config_request** | [**UpsertLlmConfigRequest**](UpsertLlmConfigRequest.md) |  | [required] |

### Return type

[**models::UpdateLlmConfigResponse**](UpdateLLMConfigResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tenants_tenant_id_tools_put

> tenants_tenant_id_tools_put(tenant_id, upsert_tool_request)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tenant_id** | **i64** |  | [required] |
**upsert_tool_request** | [**UpsertToolRequest**](UpsertToolRequest.md) |  | [required] |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tenants_tenant_id_workflows_post

> models::CreateWorkflowResponse tenants_tenant_id_workflows_post(tenant_id, create_workflow_under_tenant_request)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tenant_id** | **i64** |  | [required] |
**create_workflow_under_tenant_request** | [**CreateWorkflowUnderTenantRequest**](CreateWorkflowUnderTenantRequest.md) |  | [required] |

### Return type

[**models::CreateWorkflowResponse**](CreateWorkflowResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## workflows_id_get

> models::GetWorkflowResponse workflows_id_get(id)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **i64** |  | [required] |

### Return type

[**models::GetWorkflowResponse**](GetWorkflowResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

