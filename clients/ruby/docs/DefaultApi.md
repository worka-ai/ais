# Worka::DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**tenants_post**](DefaultApi.md#tenants_post) | **POST** /tenants |  |
| [**tenants_tenant_id_agents_put**](DefaultApi.md#tenants_tenant_id_agents_put) | **PUT** /tenants/{tenant_id}/agents |  |
| [**tenants_tenant_id_conversations_post**](DefaultApi.md#tenants_tenant_id_conversations_post) | **POST** /tenants/{tenant_id}/conversations |  |
| [**tenants_tenant_id_llm_configs_post**](DefaultApi.md#tenants_tenant_id_llm_configs_post) | **POST** /tenants/{tenant_id}/llm-configs |  |
| [**tenants_tenant_id_tools_put**](DefaultApi.md#tenants_tenant_id_tools_put) | **PUT** /tenants/{tenant_id}/tools |  |
| [**tenants_tenant_id_workflows_post**](DefaultApi.md#tenants_tenant_id_workflows_post) | **POST** /tenants/{tenant_id}/workflows |  |
| [**workflows_id_get**](DefaultApi.md#workflows_id_get) | **GET** /workflows/{id} |  |


## tenants_post

> <CreateTenantResponse> tenants_post(create_tenant_request)



### Examples

```ruby
require 'time'
require 'worka'

api_instance = Worka::DefaultApi.new
create_tenant_request = Worka::CreateTenantRequest.new({determine_conversation_with_agent: 3.56, determine_conversation_with_narrative: 'determine_conversation_with_narrative_example', tenant_id: 3.56, username: 'username_example'}) # CreateTenantRequest | 

begin
  
  result = api_instance.tenants_post(create_tenant_request)
  p result
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->tenants_post: #{e}"
end
```

#### Using the tenants_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateTenantResponse>, Integer, Hash)> tenants_post_with_http_info(create_tenant_request)

```ruby
begin
  
  data, status_code, headers = api_instance.tenants_post_with_http_info(create_tenant_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateTenantResponse>
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->tenants_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **create_tenant_request** | [**CreateTenantRequest**](CreateTenantRequest.md) |  |  |

### Return type

[**CreateTenantResponse**](CreateTenantResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## tenants_tenant_id_agents_put

> <CreateAgentResponse> tenants_tenant_id_agents_put(tenant_id, upsert_agent_request)



### Examples

```ruby
require 'time'
require 'worka'

api_instance = Worka::DefaultApi.new
tenant_id = 789 # Integer | 
upsert_agent_request = Worka::UpsertAgentRequest.new({agents: [Worka::UpsertAgentRequestAgentsInner.new({created_at: Time.now, description: 'description_example', edges: [Worka::UpsertAgentRequestAgentsInnerEdgesInner.new({conditions: [3.56], priority: 37, target_agent_id: 3.56})], expected_input: 'expected_input_example', id: 3.56, name: 'name_example', rules: [Worka::UpsertAgentRequestAgentsInnerRulesInner.new({content: 'content_example', description: 'description_example', id: 3.56, name: 'name_example', position: 3.56, rule_created_at: Time.now, tenant_id: 3.56, version_created_at: Time.now, version_id: 3.56})], tenant_id: 3.56, tools: [Worka::UpsertAgentRequestAgentsInnerRulesInnerToolsInner.new({function_declarations: [Worka::UpsertAgentRequestAgentsInnerRulesInnerToolsInnerFunctionDeclarationsInner.new({description: 'description_example', name: 'name_example', parameters: 3.56})]})]})]}) # UpsertAgentRequest | 

begin
  
  result = api_instance.tenants_tenant_id_agents_put(tenant_id, upsert_agent_request)
  p result
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->tenants_tenant_id_agents_put: #{e}"
end
```

#### Using the tenants_tenant_id_agents_put_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateAgentResponse>, Integer, Hash)> tenants_tenant_id_agents_put_with_http_info(tenant_id, upsert_agent_request)

```ruby
begin
  
  data, status_code, headers = api_instance.tenants_tenant_id_agents_put_with_http_info(tenant_id, upsert_agent_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateAgentResponse>
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->tenants_tenant_id_agents_put_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **tenant_id** | **Integer** |  |  |
| **upsert_agent_request** | [**UpsertAgentRequest**](UpsertAgentRequest.md) |  |  |

### Return type

[**CreateAgentResponse**](CreateAgentResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## tenants_tenant_id_conversations_post

> <CreateConversationResponse> tenants_tenant_id_conversations_post(tenant_id, create_conversation_under_tenant_request)



### Examples

```ruby
require 'time'
require 'worka'

api_instance = Worka::DefaultApi.new
tenant_id = 789 # Integer | 
create_conversation_under_tenant_request = Worka::CreateConversationUnderTenantRequest.new # CreateConversationUnderTenantRequest | 

begin
  
  result = api_instance.tenants_tenant_id_conversations_post(tenant_id, create_conversation_under_tenant_request)
  p result
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->tenants_tenant_id_conversations_post: #{e}"
end
```

#### Using the tenants_tenant_id_conversations_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateConversationResponse>, Integer, Hash)> tenants_tenant_id_conversations_post_with_http_info(tenant_id, create_conversation_under_tenant_request)

```ruby
begin
  
  data, status_code, headers = api_instance.tenants_tenant_id_conversations_post_with_http_info(tenant_id, create_conversation_under_tenant_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateConversationResponse>
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->tenants_tenant_id_conversations_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **tenant_id** | **Integer** |  |  |
| **create_conversation_under_tenant_request** | [**CreateConversationUnderTenantRequest**](CreateConversationUnderTenantRequest.md) |  |  |

### Return type

[**CreateConversationResponse**](CreateConversationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## tenants_tenant_id_llm_configs_post

> <UpdateLLMConfigResponse> tenants_tenant_id_llm_configs_post(tenant_id, upsert_llm_config_request)



### Examples

```ruby
require 'time'
require 'worka'

api_instance = Worka::DefaultApi.new
tenant_id = 789 # Integer | 
upsert_llm_config_request = Worka::UpsertLLMConfigRequest.new({api_key: 'api_key_example', model: 'model_example', provider: 'provider_example', temperature: 3.56}) # UpsertLLMConfigRequest | 

begin
  
  result = api_instance.tenants_tenant_id_llm_configs_post(tenant_id, upsert_llm_config_request)
  p result
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->tenants_tenant_id_llm_configs_post: #{e}"
end
```

#### Using the tenants_tenant_id_llm_configs_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UpdateLLMConfigResponse>, Integer, Hash)> tenants_tenant_id_llm_configs_post_with_http_info(tenant_id, upsert_llm_config_request)

```ruby
begin
  
  data, status_code, headers = api_instance.tenants_tenant_id_llm_configs_post_with_http_info(tenant_id, upsert_llm_config_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UpdateLLMConfigResponse>
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->tenants_tenant_id_llm_configs_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **tenant_id** | **Integer** |  |  |
| **upsert_llm_config_request** | [**UpsertLLMConfigRequest**](UpsertLLMConfigRequest.md) |  |  |

### Return type

[**UpdateLLMConfigResponse**](UpdateLLMConfigResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## tenants_tenant_id_tools_put

> tenants_tenant_id_tools_put(tenant_id, upsert_tool_request)



### Examples

```ruby
require 'time'
require 'worka'

api_instance = Worka::DefaultApi.new
tenant_id = 789 # Integer | 
upsert_tool_request = Worka::UpsertToolRequest.new({tools: [Worka::UpsertAgentRequestAgentsInnerRulesInnerToolsInner.new({function_declarations: [Worka::UpsertAgentRequestAgentsInnerRulesInnerToolsInnerFunctionDeclarationsInner.new({description: 'description_example', name: 'name_example', parameters: 3.56})]})]}) # UpsertToolRequest | 

begin
  
  api_instance.tenants_tenant_id_tools_put(tenant_id, upsert_tool_request)
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->tenants_tenant_id_tools_put: #{e}"
end
```

#### Using the tenants_tenant_id_tools_put_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> tenants_tenant_id_tools_put_with_http_info(tenant_id, upsert_tool_request)

```ruby
begin
  
  data, status_code, headers = api_instance.tenants_tenant_id_tools_put_with_http_info(tenant_id, upsert_tool_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->tenants_tenant_id_tools_put_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **tenant_id** | **Integer** |  |  |
| **upsert_tool_request** | [**UpsertToolRequest**](UpsertToolRequest.md) |  |  |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


## tenants_tenant_id_workflows_post

> <CreateWorkflowResponse> tenants_tenant_id_workflows_post(tenant_id, create_workflow_under_tenant_request)



### Examples

```ruby
require 'time'
require 'worka'

api_instance = Worka::DefaultApi.new
tenant_id = 789 # Integer | 
create_workflow_under_tenant_request = Worka::CreateWorkflowUnderTenantRequest.new({freeform: false, input: 'input_example'}) # CreateWorkflowUnderTenantRequest | 

begin
  
  result = api_instance.tenants_tenant_id_workflows_post(tenant_id, create_workflow_under_tenant_request)
  p result
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->tenants_tenant_id_workflows_post: #{e}"
end
```

#### Using the tenants_tenant_id_workflows_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateWorkflowResponse>, Integer, Hash)> tenants_tenant_id_workflows_post_with_http_info(tenant_id, create_workflow_under_tenant_request)

```ruby
begin
  
  data, status_code, headers = api_instance.tenants_tenant_id_workflows_post_with_http_info(tenant_id, create_workflow_under_tenant_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateWorkflowResponse>
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->tenants_tenant_id_workflows_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **tenant_id** | **Integer** |  |  |
| **create_workflow_under_tenant_request** | [**CreateWorkflowUnderTenantRequest**](CreateWorkflowUnderTenantRequest.md) |  |  |

### Return type

[**CreateWorkflowResponse**](CreateWorkflowResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## workflows_id_get

> <GetWorkflowResponse> workflows_id_get(id)



### Examples

```ruby
require 'time'
require 'worka'

api_instance = Worka::DefaultApi.new
id = 789 # Integer | 

begin
  
  result = api_instance.workflows_id_get(id)
  p result
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->workflows_id_get: #{e}"
end
```

#### Using the workflows_id_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetWorkflowResponse>, Integer, Hash)> workflows_id_get_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.workflows_id_get_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetWorkflowResponse>
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->workflows_id_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  |  |

### Return type

[**GetWorkflowResponse**](GetWorkflowResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

