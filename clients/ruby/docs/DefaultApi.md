# Worka::DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**agent_put**](DefaultApi.md#agent_put) | **PUT** /agent |  |
| [**conversation_post**](DefaultApi.md#conversation_post) | **POST** /conversation |  |
| [**llm_config_post**](DefaultApi.md#llm_config_post) | **POST** /llm_config |  |
| [**tenant_post**](DefaultApi.md#tenant_post) | **POST** /tenant |  |
| [**tool_put**](DefaultApi.md#tool_put) | **PUT** /tool |  |
| [**workflow_id_get**](DefaultApi.md#workflow_id_get) | **GET** /workflow/{id} |  |
| [**workflow_post**](DefaultApi.md#workflow_post) | **POST** /workflow |  |


## agent_put

> <CreateAgentResponse> agent_put(create_agent_request)



### Examples

```ruby
require 'time'
require 'worka'

api_instance = Worka::DefaultApi.new
create_agent_request = Worka::CreateAgentRequest.new({agents: [Worka::CreateAgentRequestAgentsInner.new({created_at: Time.now, description: 'description_example', edges: [Worka::CreateAgentRequestAgentsInnerEdgesInner.new({conditions: [3.56], priority: 37, target_agent_id: 3.56})], expected_input: 'expected_input_example', id: 3.56, name: 'name_example', rules: [Worka::CreateAgentRequestAgentsInnerRulesInner.new({content: 'content_example', description: 'description_example', id: 3.56, name: 'name_example', position: 3.56, rule_created_at: Time.now, tenant_id: 3.56, version_created_at: Time.now, version_id: 3.56})], tenant_id: 3.56, tools: [Worka::CreateAgentRequestAgentsInnerRulesInnerToolsInner.new({function_declarations: [Worka::CreateAgentRequestAgentsInnerRulesInnerToolsInnerFunctionDeclarationsInner.new({description: 'description_example', name: 'name_example', parameters: 3.56})]})]})]}) # CreateAgentRequest | 

begin
  
  result = api_instance.agent_put(create_agent_request)
  p result
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->agent_put: #{e}"
end
```

#### Using the agent_put_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateAgentResponse>, Integer, Hash)> agent_put_with_http_info(create_agent_request)

```ruby
begin
  
  data, status_code, headers = api_instance.agent_put_with_http_info(create_agent_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateAgentResponse>
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->agent_put_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **create_agent_request** | [**CreateAgentRequest**](CreateAgentRequest.md) |  |  |

### Return type

[**CreateAgentResponse**](CreateAgentResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## conversation_post

> <CreateConversationResponse> conversation_post(create_conversation_request)



### Examples

```ruby
require 'time'
require 'worka'

api_instance = Worka::DefaultApi.new
create_conversation_request = Worka::CreateConversationRequest.new({tenant_id: 3.56}) # CreateConversationRequest | 

begin
  
  result = api_instance.conversation_post(create_conversation_request)
  p result
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->conversation_post: #{e}"
end
```

#### Using the conversation_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateConversationResponse>, Integer, Hash)> conversation_post_with_http_info(create_conversation_request)

```ruby
begin
  
  data, status_code, headers = api_instance.conversation_post_with_http_info(create_conversation_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateConversationResponse>
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->conversation_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **create_conversation_request** | [**CreateConversationRequest**](CreateConversationRequest.md) |  |  |

### Return type

[**CreateConversationResponse**](CreateConversationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## llm_config_post

> <UpdateLLMConfigResponse> llm_config_post(update_llm_config_request)



### Examples

```ruby
require 'time'
require 'worka'

api_instance = Worka::DefaultApi.new
update_llm_config_request = Worka::UpdateLLMConfigRequest.new({api_key: 'api_key_example', model: 'model_example', provider: 'provider_example', temperature: 3.56, tenant_id: 3.56}) # UpdateLLMConfigRequest | 

begin
  
  result = api_instance.llm_config_post(update_llm_config_request)
  p result
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->llm_config_post: #{e}"
end
```

#### Using the llm_config_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UpdateLLMConfigResponse>, Integer, Hash)> llm_config_post_with_http_info(update_llm_config_request)

```ruby
begin
  
  data, status_code, headers = api_instance.llm_config_post_with_http_info(update_llm_config_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UpdateLLMConfigResponse>
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->llm_config_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **update_llm_config_request** | [**UpdateLLMConfigRequest**](UpdateLLMConfigRequest.md) |  |  |

### Return type

[**UpdateLLMConfigResponse**](UpdateLLMConfigResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## tenant_post

> <CreateTenantResponse> tenant_post(create_tenant_request)



### Examples

```ruby
require 'time'
require 'worka'

api_instance = Worka::DefaultApi.new
create_tenant_request = Worka::CreateTenantRequest.new({determine_conversation_with_agent: 3.56, determine_conversation_with_narrative: 'determine_conversation_with_narrative_example', tenant_id: 3.56, username: 'username_example'}) # CreateTenantRequest | 

begin
  
  result = api_instance.tenant_post(create_tenant_request)
  p result
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->tenant_post: #{e}"
end
```

#### Using the tenant_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateTenantResponse>, Integer, Hash)> tenant_post_with_http_info(create_tenant_request)

```ruby
begin
  
  data, status_code, headers = api_instance.tenant_post_with_http_info(create_tenant_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateTenantResponse>
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->tenant_post_with_http_info: #{e}"
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


## tool_put

> tool_put(tool_upsert)



### Examples

```ruby
require 'time'
require 'worka'

api_instance = Worka::DefaultApi.new
tool_upsert = Worka::ToolUpsert.new({tenant_id: 3.56, tools: [Worka::CreateAgentRequestAgentsInnerRulesInnerToolsInner.new({function_declarations: [Worka::CreateAgentRequestAgentsInnerRulesInnerToolsInnerFunctionDeclarationsInner.new({description: 'description_example', name: 'name_example', parameters: 3.56})]})]}) # ToolUpsert | 

begin
  
  api_instance.tool_put(tool_upsert)
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->tool_put: #{e}"
end
```

#### Using the tool_put_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> tool_put_with_http_info(tool_upsert)

```ruby
begin
  
  data, status_code, headers = api_instance.tool_put_with_http_info(tool_upsert)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->tool_put_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **tool_upsert** | [**ToolUpsert**](ToolUpsert.md) |  |  |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


## workflow_id_get

> <GetWorkflowResponse> workflow_id_get(id)



### Examples

```ruby
require 'time'
require 'worka'

api_instance = Worka::DefaultApi.new
id = 789 # Integer | 

begin
  
  result = api_instance.workflow_id_get(id)
  p result
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->workflow_id_get: #{e}"
end
```

#### Using the workflow_id_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetWorkflowResponse>, Integer, Hash)> workflow_id_get_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.workflow_id_get_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetWorkflowResponse>
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->workflow_id_get_with_http_info: #{e}"
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


## workflow_post

> <CreateWorkflowResponse> workflow_post(create_workflow_request)



### Examples

```ruby
require 'time'
require 'worka'

api_instance = Worka::DefaultApi.new
create_workflow_request = Worka::CreateWorkflowRequest.new({freeform: false, input: 'input_example', tenant_id: 3.56}) # CreateWorkflowRequest | 

begin
  
  result = api_instance.workflow_post(create_workflow_request)
  p result
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->workflow_post: #{e}"
end
```

#### Using the workflow_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateWorkflowResponse>, Integer, Hash)> workflow_post_with_http_info(create_workflow_request)

```ruby
begin
  
  data, status_code, headers = api_instance.workflow_post_with_http_info(create_workflow_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateWorkflowResponse>
rescue Worka::ApiError => e
  puts "Error when calling DefaultApi->workflow_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **create_workflow_request** | [**CreateWorkflowRequest**](CreateWorkflowRequest.md) |  |  |

### Return type

[**CreateWorkflowResponse**](CreateWorkflowResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

