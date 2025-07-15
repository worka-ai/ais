# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**agentPut**](DefaultApi.md#agentPut) | **PUT** /agent |  |
| [**conversationPost**](DefaultApi.md#conversationPost) | **POST** /conversation |  |
| [**llmConfigPost**](DefaultApi.md#llmConfigPost) | **POST** /llm_config |  |
| [**tenantPost**](DefaultApi.md#tenantPost) | **POST** /tenant |  |
| [**toolPut**](DefaultApi.md#toolPut) | **PUT** /tool |  |
| [**workflowIdGet**](DefaultApi.md#workflowIdGet) | **GET** /workflow/{id} |  |
| [**workflowPost**](DefaultApi.md#workflowPost) | **POST** /workflow |  |



## agentPut

> CreateAgentResponse agentPut(createAgentRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        CreateAgentRequest createAgentRequest = new CreateAgentRequest(); // CreateAgentRequest | 
        try {
            CreateAgentResponse result = apiInstance.agentPut(createAgentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#agentPut");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createAgentRequest** | [**CreateAgentRequest**](CreateAgentRequest.md)|  | |

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
| **200** | OK |  -  |


## conversationPost

> CreateConversationResponse conversationPost(createConversationRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        CreateConversationRequest createConversationRequest = new CreateConversationRequest(); // CreateConversationRequest | 
        try {
            CreateConversationResponse result = apiInstance.conversationPost(createConversationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#conversationPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createConversationRequest** | [**CreateConversationRequest**](CreateConversationRequest.md)|  | |

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
| **200** | OK |  -  |


## llmConfigPost

> UpdateLLMConfigResponse llmConfigPost(updateLLMConfigRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        UpdateLLMConfigRequest updateLLMConfigRequest = new UpdateLLMConfigRequest(); // UpdateLLMConfigRequest | 
        try {
            UpdateLLMConfigResponse result = apiInstance.llmConfigPost(updateLLMConfigRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#llmConfigPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateLLMConfigRequest** | [**UpdateLLMConfigRequest**](UpdateLLMConfigRequest.md)|  | |

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
| **200** | OK |  -  |


## tenantPost

> CreateTenantResponse tenantPost(createTenantRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        CreateTenantRequest createTenantRequest = new CreateTenantRequest(); // CreateTenantRequest | 
        try {
            CreateTenantResponse result = apiInstance.tenantPost(createTenantRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#tenantPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createTenantRequest** | [**CreateTenantRequest**](CreateTenantRequest.md)|  | |

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
| **200** | OK |  -  |


## toolPut

> toolPut(toolUpsert)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        ToolUpsert toolUpsert = new ToolUpsert(); // ToolUpsert | 
        try {
            apiInstance.toolPut(toolUpsert);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#toolPut");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **toolUpsert** | [**ToolUpsert**](ToolUpsert.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## workflowIdGet

> GetWorkflowResponse workflowIdGet(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            GetWorkflowResponse result = apiInstance.workflowIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#workflowIdGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**|  | |

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
| **200** | OK |  -  |


## workflowPost

> CreateWorkflowResponse workflowPost(createWorkflowRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        CreateWorkflowRequest createWorkflowRequest = new CreateWorkflowRequest(); // CreateWorkflowRequest | 
        try {
            CreateWorkflowResponse result = apiInstance.workflowPost(createWorkflowRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#workflowPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createWorkflowRequest** | [**CreateWorkflowRequest**](CreateWorkflowRequest.md)|  | |

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
| **200** | OK |  -  |

