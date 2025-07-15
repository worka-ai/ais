# \DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**agent_put**](DefaultApi.md#agent_put) | **PUT** /agent | 
[**conversation_post**](DefaultApi.md#conversation_post) | **POST** /conversation | 
[**llm_config_post**](DefaultApi.md#llm_config_post) | **POST** /llm_config | 
[**tenant_post**](DefaultApi.md#tenant_post) | **POST** /tenant | 
[**tool_put**](DefaultApi.md#tool_put) | **PUT** /tool | 
[**workflow_id_get**](DefaultApi.md#workflow_id_get) | **GET** /workflow/{id} | 
[**workflow_post**](DefaultApi.md#workflow_post) | **POST** /workflow | 



## agent_put

> models::CreateAgentResponse agent_put(create_agent_request)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**create_agent_request** | [**CreateAgentRequest**](CreateAgentRequest.md) |  | [required] |

### Return type

[**models::CreateAgentResponse**](CreateAgentResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## conversation_post

> models::CreateConversationResponse conversation_post(create_conversation_request)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**create_conversation_request** | [**CreateConversationRequest**](CreateConversationRequest.md) |  | [required] |

### Return type

[**models::CreateConversationResponse**](CreateConversationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## llm_config_post

> models::UpdateLlmConfigResponse llm_config_post(update_llm_config_request)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**update_llm_config_request** | [**UpdateLlmConfigRequest**](UpdateLlmConfigRequest.md) |  | [required] |

### Return type

[**models::UpdateLlmConfigResponse**](UpdateLLMConfigResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tenant_post

> models::CreateTenantResponse tenant_post(create_tenant_request)


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


## tool_put

> tool_put(tool_upsert)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_upsert** | [**ToolUpsert**](ToolUpsert.md) |  | [required] |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## workflow_id_get

> models::GetWorkflowResponse workflow_id_get(id)


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


## workflow_post

> models::CreateWorkflowResponse workflow_post(create_workflow_request)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**create_workflow_request** | [**CreateWorkflowRequest**](CreateWorkflowRequest.md) |  | [required] |

### Return type

[**models::CreateWorkflowResponse**](CreateWorkflowResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

