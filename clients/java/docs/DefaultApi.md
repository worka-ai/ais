# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tenantsPost**](DefaultApi.md#tenantsPost) | **POST** /tenants |  |
| [**tenantsTenantIdAgentsPut**](DefaultApi.md#tenantsTenantIdAgentsPut) | **PUT** /tenants/{tenant_id}/agents |  |
| [**tenantsTenantIdConversationsPost**](DefaultApi.md#tenantsTenantIdConversationsPost) | **POST** /tenants/{tenant_id}/conversations |  |
| [**tenantsTenantIdLlmConfigsPost**](DefaultApi.md#tenantsTenantIdLlmConfigsPost) | **POST** /tenants/{tenant_id}/llm-configs |  |
| [**tenantsTenantIdToolsPut**](DefaultApi.md#tenantsTenantIdToolsPut) | **PUT** /tenants/{tenant_id}/tools |  |
| [**tenantsTenantIdWorkflowsPost**](DefaultApi.md#tenantsTenantIdWorkflowsPost) | **POST** /tenants/{tenant_id}/workflows |  |
| [**workflowsIdGet**](DefaultApi.md#workflowsIdGet) | **GET** /workflows/{id} |  |



## tenantsPost

> CreateTenantResponse tenantsPost(createTenantRequest)



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
            CreateTenantResponse result = apiInstance.tenantsPost(createTenantRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#tenantsPost");
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


## tenantsTenantIdAgentsPut

> CreateAgentResponse tenantsTenantIdAgentsPut(tenantId, upsertAgentRequest)



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
        Long tenantId = 56L; // Long | 
        UpsertAgentRequest upsertAgentRequest = new UpsertAgentRequest(); // UpsertAgentRequest | 
        try {
            CreateAgentResponse result = apiInstance.tenantsTenantIdAgentsPut(tenantId, upsertAgentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#tenantsTenantIdAgentsPut");
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
| **tenantId** | **Long**|  | |
| **upsertAgentRequest** | [**UpsertAgentRequest**](UpsertAgentRequest.md)|  | |

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


## tenantsTenantIdConversationsPost

> CreateConversationResponse tenantsTenantIdConversationsPost(tenantId, createConversationUnderTenantRequest)



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
        Long tenantId = 56L; // Long | 
        CreateConversationUnderTenantRequest createConversationUnderTenantRequest = new CreateConversationUnderTenantRequest(); // CreateConversationUnderTenantRequest | 
        try {
            CreateConversationResponse result = apiInstance.tenantsTenantIdConversationsPost(tenantId, createConversationUnderTenantRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#tenantsTenantIdConversationsPost");
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
| **tenantId** | **Long**|  | |
| **createConversationUnderTenantRequest** | [**CreateConversationUnderTenantRequest**](CreateConversationUnderTenantRequest.md)|  | |

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


## tenantsTenantIdLlmConfigsPost

> UpdateLLMConfigResponse tenantsTenantIdLlmConfigsPost(tenantId, upsertLLMConfigRequest)



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
        Long tenantId = 56L; // Long | 
        UpsertLLMConfigRequest upsertLLMConfigRequest = new UpsertLLMConfigRequest(); // UpsertLLMConfigRequest | 
        try {
            UpdateLLMConfigResponse result = apiInstance.tenantsTenantIdLlmConfigsPost(tenantId, upsertLLMConfigRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#tenantsTenantIdLlmConfigsPost");
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
| **tenantId** | **Long**|  | |
| **upsertLLMConfigRequest** | [**UpsertLLMConfigRequest**](UpsertLLMConfigRequest.md)|  | |

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


## tenantsTenantIdToolsPut

> tenantsTenantIdToolsPut(tenantId, upsertToolRequest)



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
        Long tenantId = 56L; // Long | 
        UpsertToolRequest upsertToolRequest = new UpsertToolRequest(); // UpsertToolRequest | 
        try {
            apiInstance.tenantsTenantIdToolsPut(tenantId, upsertToolRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#tenantsTenantIdToolsPut");
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
| **tenantId** | **Long**|  | |
| **upsertToolRequest** | [**UpsertToolRequest**](UpsertToolRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## tenantsTenantIdWorkflowsPost

> CreateWorkflowResponse tenantsTenantIdWorkflowsPost(tenantId, createWorkflowUnderTenantRequest)



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
        Long tenantId = 56L; // Long | 
        CreateWorkflowUnderTenantRequest createWorkflowUnderTenantRequest = new CreateWorkflowUnderTenantRequest(); // CreateWorkflowUnderTenantRequest | 
        try {
            CreateWorkflowResponse result = apiInstance.tenantsTenantIdWorkflowsPost(tenantId, createWorkflowUnderTenantRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#tenantsTenantIdWorkflowsPost");
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
| **tenantId** | **Long**|  | |
| **createWorkflowUnderTenantRequest** | [**CreateWorkflowUnderTenantRequest**](CreateWorkflowUnderTenantRequest.md)|  | |

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


## workflowsIdGet

> GetWorkflowResponse workflowsIdGet(id)



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
            GetWorkflowResponse result = apiInstance.workflowsIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#workflowsIdGet");
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

