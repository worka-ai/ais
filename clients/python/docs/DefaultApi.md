# worka.DefaultApi

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


# **tenants_post**
> CreateTenantResponse tenants_post(create_tenant_request)

### Example


```python
import worka
from worka.models.create_tenant_request import CreateTenantRequest
from worka.models.create_tenant_response import CreateTenantResponse
from worka.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = worka.Configuration(
    host = "http://localhost"
)


# Enter a context with an instance of the API client
with worka.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = worka.DefaultApi(api_client)
    create_tenant_request = worka.CreateTenantRequest() # CreateTenantRequest | 

    try:
        api_response = api_instance.tenants_post(create_tenant_request)
        print("The response of DefaultApi->tenants_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->tenants_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_tenant_request** | [**CreateTenantRequest**](CreateTenantRequest.md)|  | 

### Return type

[**CreateTenantResponse**](CreateTenantResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tenants_tenant_id_agents_put**
> CreateAgentResponse tenants_tenant_id_agents_put(tenant_id, upsert_agent_request)

### Example


```python
import worka
from worka.models.create_agent_response import CreateAgentResponse
from worka.models.upsert_agent_request import UpsertAgentRequest
from worka.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = worka.Configuration(
    host = "http://localhost"
)


# Enter a context with an instance of the API client
with worka.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = worka.DefaultApi(api_client)
    tenant_id = 56 # int | 
    upsert_agent_request = worka.UpsertAgentRequest() # UpsertAgentRequest | 

    try:
        api_response = api_instance.tenants_tenant_id_agents_put(tenant_id, upsert_agent_request)
        print("The response of DefaultApi->tenants_tenant_id_agents_put:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->tenants_tenant_id_agents_put: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant_id** | **int**|  | 
 **upsert_agent_request** | [**UpsertAgentRequest**](UpsertAgentRequest.md)|  | 

### Return type

[**CreateAgentResponse**](CreateAgentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tenants_tenant_id_conversations_post**
> CreateConversationResponse tenants_tenant_id_conversations_post(tenant_id, create_conversation_under_tenant_request)

### Example


```python
import worka
from worka.models.create_conversation_response import CreateConversationResponse
from worka.models.create_conversation_under_tenant_request import CreateConversationUnderTenantRequest
from worka.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = worka.Configuration(
    host = "http://localhost"
)


# Enter a context with an instance of the API client
with worka.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = worka.DefaultApi(api_client)
    tenant_id = 56 # int | 
    create_conversation_under_tenant_request = worka.CreateConversationUnderTenantRequest() # CreateConversationUnderTenantRequest | 

    try:
        api_response = api_instance.tenants_tenant_id_conversations_post(tenant_id, create_conversation_under_tenant_request)
        print("The response of DefaultApi->tenants_tenant_id_conversations_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->tenants_tenant_id_conversations_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant_id** | **int**|  | 
 **create_conversation_under_tenant_request** | [**CreateConversationUnderTenantRequest**](CreateConversationUnderTenantRequest.md)|  | 

### Return type

[**CreateConversationResponse**](CreateConversationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tenants_tenant_id_llm_configs_post**
> UpdateLLMConfigResponse tenants_tenant_id_llm_configs_post(tenant_id, upsert_llm_config_request)

### Example


```python
import worka
from worka.models.update_llm_config_response import UpdateLLMConfigResponse
from worka.models.upsert_llm_config_request import UpsertLLMConfigRequest
from worka.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = worka.Configuration(
    host = "http://localhost"
)


# Enter a context with an instance of the API client
with worka.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = worka.DefaultApi(api_client)
    tenant_id = 56 # int | 
    upsert_llm_config_request = worka.UpsertLLMConfigRequest() # UpsertLLMConfigRequest | 

    try:
        api_response = api_instance.tenants_tenant_id_llm_configs_post(tenant_id, upsert_llm_config_request)
        print("The response of DefaultApi->tenants_tenant_id_llm_configs_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->tenants_tenant_id_llm_configs_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant_id** | **int**|  | 
 **upsert_llm_config_request** | [**UpsertLLMConfigRequest**](UpsertLLMConfigRequest.md)|  | 

### Return type

[**UpdateLLMConfigResponse**](UpdateLLMConfigResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tenants_tenant_id_tools_put**
> tenants_tenant_id_tools_put(tenant_id, upsert_tool_request)

### Example


```python
import worka
from worka.models.upsert_tool_request import UpsertToolRequest
from worka.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = worka.Configuration(
    host = "http://localhost"
)


# Enter a context with an instance of the API client
with worka.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = worka.DefaultApi(api_client)
    tenant_id = 56 # int | 
    upsert_tool_request = worka.UpsertToolRequest() # UpsertToolRequest | 

    try:
        api_instance.tenants_tenant_id_tools_put(tenant_id, upsert_tool_request)
    except Exception as e:
        print("Exception when calling DefaultApi->tenants_tenant_id_tools_put: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant_id** | **int**|  | 
 **upsert_tool_request** | [**UpsertToolRequest**](UpsertToolRequest.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tenants_tenant_id_workflows_post**
> CreateWorkflowResponse tenants_tenant_id_workflows_post(tenant_id, create_workflow_under_tenant_request)

### Example


```python
import worka
from worka.models.create_workflow_response import CreateWorkflowResponse
from worka.models.create_workflow_under_tenant_request import CreateWorkflowUnderTenantRequest
from worka.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = worka.Configuration(
    host = "http://localhost"
)


# Enter a context with an instance of the API client
with worka.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = worka.DefaultApi(api_client)
    tenant_id = 56 # int | 
    create_workflow_under_tenant_request = worka.CreateWorkflowUnderTenantRequest() # CreateWorkflowUnderTenantRequest | 

    try:
        api_response = api_instance.tenants_tenant_id_workflows_post(tenant_id, create_workflow_under_tenant_request)
        print("The response of DefaultApi->tenants_tenant_id_workflows_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->tenants_tenant_id_workflows_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant_id** | **int**|  | 
 **create_workflow_under_tenant_request** | [**CreateWorkflowUnderTenantRequest**](CreateWorkflowUnderTenantRequest.md)|  | 

### Return type

[**CreateWorkflowResponse**](CreateWorkflowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **workflows_id_get**
> GetWorkflowResponse workflows_id_get(id)

### Example


```python
import worka
from worka.models.get_workflow_response import GetWorkflowResponse
from worka.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = worka.Configuration(
    host = "http://localhost"
)


# Enter a context with an instance of the API client
with worka.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = worka.DefaultApi(api_client)
    id = 56 # int | 

    try:
        api_response = api_instance.workflows_id_get(id)
        print("The response of DefaultApi->workflows_id_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->workflows_id_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | 

### Return type

[**GetWorkflowResponse**](GetWorkflowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

