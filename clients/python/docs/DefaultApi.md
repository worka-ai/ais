# worka.DefaultApi

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


# **agent_put**
> CreateAgentResponse agent_put(create_agent_request)

### Example


```python
import worka
from worka.models.create_agent_request import CreateAgentRequest
from worka.models.create_agent_response import CreateAgentResponse
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
    create_agent_request = worka.CreateAgentRequest() # CreateAgentRequest | 

    try:
        api_response = api_instance.agent_put(create_agent_request)
        print("The response of DefaultApi->agent_put:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->agent_put: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_agent_request** | [**CreateAgentRequest**](CreateAgentRequest.md)|  | 

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

# **conversation_post**
> CreateConversationResponse conversation_post(create_conversation_request)

### Example


```python
import worka
from worka.models.create_conversation_request import CreateConversationRequest
from worka.models.create_conversation_response import CreateConversationResponse
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
    create_conversation_request = worka.CreateConversationRequest() # CreateConversationRequest | 

    try:
        api_response = api_instance.conversation_post(create_conversation_request)
        print("The response of DefaultApi->conversation_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->conversation_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_conversation_request** | [**CreateConversationRequest**](CreateConversationRequest.md)|  | 

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

# **llm_config_post**
> UpdateLLMConfigResponse llm_config_post(update_llm_config_request)

### Example


```python
import worka
from worka.models.update_llm_config_request import UpdateLLMConfigRequest
from worka.models.update_llm_config_response import UpdateLLMConfigResponse
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
    update_llm_config_request = worka.UpdateLLMConfigRequest() # UpdateLLMConfigRequest | 

    try:
        api_response = api_instance.llm_config_post(update_llm_config_request)
        print("The response of DefaultApi->llm_config_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->llm_config_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_llm_config_request** | [**UpdateLLMConfigRequest**](UpdateLLMConfigRequest.md)|  | 

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

# **tenant_post**
> CreateTenantResponse tenant_post(create_tenant_request)

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
        api_response = api_instance.tenant_post(create_tenant_request)
        print("The response of DefaultApi->tenant_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->tenant_post: %s\n" % e)
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

# **tool_put**
> tool_put(tool_upsert)

### Example


```python
import worka
from worka.models.tool_upsert import ToolUpsert
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
    tool_upsert = worka.ToolUpsert() # ToolUpsert | 

    try:
        api_instance.tool_put(tool_upsert)
    except Exception as e:
        print("Exception when calling DefaultApi->tool_put: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_upsert** | [**ToolUpsert**](ToolUpsert.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **workflow_id_get**
> GetWorkflowResponse workflow_id_get(id)

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
        api_response = api_instance.workflow_id_get(id)
        print("The response of DefaultApi->workflow_id_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->workflow_id_get: %s\n" % e)
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

# **workflow_post**
> CreateWorkflowResponse workflow_post(create_workflow_request)

### Example


```python
import worka
from worka.models.create_workflow_request import CreateWorkflowRequest
from worka.models.create_workflow_response import CreateWorkflowResponse
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
    create_workflow_request = worka.CreateWorkflowRequest() # CreateWorkflowRequest | 

    try:
        api_response = api_instance.workflow_post(create_workflow_request)
        print("The response of DefaultApi->workflow_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->workflow_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_workflow_request** | [**CreateWorkflowRequest**](CreateWorkflowRequest.md)|  | 

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

