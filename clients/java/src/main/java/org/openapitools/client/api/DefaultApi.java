package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CreateAgentRequest;
import org.openapitools.client.model.CreateAgentResponse;
import org.openapitools.client.model.CreateConversationRequest;
import org.openapitools.client.model.CreateConversationResponse;
import org.openapitools.client.model.CreateTenantRequest;
import org.openapitools.client.model.CreateTenantResponse;
import org.openapitools.client.model.CreateWorkflowRequest;
import org.openapitools.client.model.CreateWorkflowResponse;
import org.openapitools.client.model.GetWorkflowResponse;
import org.openapitools.client.model.ToolUpsert;
import org.openapitools.client.model.UpdateLLMConfigRequest;
import org.openapitools.client.model.UpdateLLMConfigResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-15T22:06:20.793426+01:00[Europe/London]", comments = "Generator version: 7.14.0")
public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(new ApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param createAgentRequest The createAgentRequest parameter
     * @return CreateAgentResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec agentPutRequestCreation(@javax.annotation.Nonnull CreateAgentRequest createAgentRequest) throws WebClientResponseException {
        Object postBody = createAgentRequest;
        // verify the required parameter 'createAgentRequest' is set
        if (createAgentRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createAgentRequest' when calling agentPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<CreateAgentResponse> localVarReturnType = new ParameterizedTypeReference<CreateAgentResponse>() {};
        return apiClient.invokeAPI("/agent", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param createAgentRequest The createAgentRequest parameter
     * @return CreateAgentResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CreateAgentResponse> agentPut(@javax.annotation.Nonnull CreateAgentRequest createAgentRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CreateAgentResponse> localVarReturnType = new ParameterizedTypeReference<CreateAgentResponse>() {};
        return agentPutRequestCreation(createAgentRequest).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param createAgentRequest The createAgentRequest parameter
     * @return ResponseEntity&lt;CreateAgentResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CreateAgentResponse>> agentPutWithHttpInfo(@javax.annotation.Nonnull CreateAgentRequest createAgentRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CreateAgentResponse> localVarReturnType = new ParameterizedTypeReference<CreateAgentResponse>() {};
        return agentPutRequestCreation(createAgentRequest).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param createAgentRequest The createAgentRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec agentPutWithResponseSpec(@javax.annotation.Nonnull CreateAgentRequest createAgentRequest) throws WebClientResponseException {
        return agentPutRequestCreation(createAgentRequest);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param createConversationRequest The createConversationRequest parameter
     * @return CreateConversationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec conversationPostRequestCreation(@javax.annotation.Nonnull CreateConversationRequest createConversationRequest) throws WebClientResponseException {
        Object postBody = createConversationRequest;
        // verify the required parameter 'createConversationRequest' is set
        if (createConversationRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createConversationRequest' when calling conversationPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<CreateConversationResponse> localVarReturnType = new ParameterizedTypeReference<CreateConversationResponse>() {};
        return apiClient.invokeAPI("/conversation", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param createConversationRequest The createConversationRequest parameter
     * @return CreateConversationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CreateConversationResponse> conversationPost(@javax.annotation.Nonnull CreateConversationRequest createConversationRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CreateConversationResponse> localVarReturnType = new ParameterizedTypeReference<CreateConversationResponse>() {};
        return conversationPostRequestCreation(createConversationRequest).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param createConversationRequest The createConversationRequest parameter
     * @return ResponseEntity&lt;CreateConversationResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CreateConversationResponse>> conversationPostWithHttpInfo(@javax.annotation.Nonnull CreateConversationRequest createConversationRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CreateConversationResponse> localVarReturnType = new ParameterizedTypeReference<CreateConversationResponse>() {};
        return conversationPostRequestCreation(createConversationRequest).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param createConversationRequest The createConversationRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec conversationPostWithResponseSpec(@javax.annotation.Nonnull CreateConversationRequest createConversationRequest) throws WebClientResponseException {
        return conversationPostRequestCreation(createConversationRequest);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param updateLLMConfigRequest The updateLLMConfigRequest parameter
     * @return UpdateLLMConfigResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec llmConfigPostRequestCreation(@javax.annotation.Nonnull UpdateLLMConfigRequest updateLLMConfigRequest) throws WebClientResponseException {
        Object postBody = updateLLMConfigRequest;
        // verify the required parameter 'updateLLMConfigRequest' is set
        if (updateLLMConfigRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'updateLLMConfigRequest' when calling llmConfigPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<UpdateLLMConfigResponse> localVarReturnType = new ParameterizedTypeReference<UpdateLLMConfigResponse>() {};
        return apiClient.invokeAPI("/llm_config", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param updateLLMConfigRequest The updateLLMConfigRequest parameter
     * @return UpdateLLMConfigResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UpdateLLMConfigResponse> llmConfigPost(@javax.annotation.Nonnull UpdateLLMConfigRequest updateLLMConfigRequest) throws WebClientResponseException {
        ParameterizedTypeReference<UpdateLLMConfigResponse> localVarReturnType = new ParameterizedTypeReference<UpdateLLMConfigResponse>() {};
        return llmConfigPostRequestCreation(updateLLMConfigRequest).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param updateLLMConfigRequest The updateLLMConfigRequest parameter
     * @return ResponseEntity&lt;UpdateLLMConfigResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<UpdateLLMConfigResponse>> llmConfigPostWithHttpInfo(@javax.annotation.Nonnull UpdateLLMConfigRequest updateLLMConfigRequest) throws WebClientResponseException {
        ParameterizedTypeReference<UpdateLLMConfigResponse> localVarReturnType = new ParameterizedTypeReference<UpdateLLMConfigResponse>() {};
        return llmConfigPostRequestCreation(updateLLMConfigRequest).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param updateLLMConfigRequest The updateLLMConfigRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec llmConfigPostWithResponseSpec(@javax.annotation.Nonnull UpdateLLMConfigRequest updateLLMConfigRequest) throws WebClientResponseException {
        return llmConfigPostRequestCreation(updateLLMConfigRequest);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param createTenantRequest The createTenantRequest parameter
     * @return CreateTenantResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec tenantPostRequestCreation(@javax.annotation.Nonnull CreateTenantRequest createTenantRequest) throws WebClientResponseException {
        Object postBody = createTenantRequest;
        // verify the required parameter 'createTenantRequest' is set
        if (createTenantRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createTenantRequest' when calling tenantPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<CreateTenantResponse> localVarReturnType = new ParameterizedTypeReference<CreateTenantResponse>() {};
        return apiClient.invokeAPI("/tenant", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param createTenantRequest The createTenantRequest parameter
     * @return CreateTenantResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CreateTenantResponse> tenantPost(@javax.annotation.Nonnull CreateTenantRequest createTenantRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CreateTenantResponse> localVarReturnType = new ParameterizedTypeReference<CreateTenantResponse>() {};
        return tenantPostRequestCreation(createTenantRequest).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param createTenantRequest The createTenantRequest parameter
     * @return ResponseEntity&lt;CreateTenantResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CreateTenantResponse>> tenantPostWithHttpInfo(@javax.annotation.Nonnull CreateTenantRequest createTenantRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CreateTenantResponse> localVarReturnType = new ParameterizedTypeReference<CreateTenantResponse>() {};
        return tenantPostRequestCreation(createTenantRequest).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param createTenantRequest The createTenantRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec tenantPostWithResponseSpec(@javax.annotation.Nonnull CreateTenantRequest createTenantRequest) throws WebClientResponseException {
        return tenantPostRequestCreation(createTenantRequest);
    }

    /**
     * 
     * 
     * @param toolUpsert The toolUpsert parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec toolPutRequestCreation(@javax.annotation.Nonnull ToolUpsert toolUpsert) throws WebClientResponseException {
        Object postBody = toolUpsert;
        // verify the required parameter 'toolUpsert' is set
        if (toolUpsert == null) {
            throw new WebClientResponseException("Missing the required parameter 'toolUpsert' when calling toolPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/tool", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * @param toolUpsert The toolUpsert parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> toolPut(@javax.annotation.Nonnull ToolUpsert toolUpsert) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return toolPutRequestCreation(toolUpsert).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * @param toolUpsert The toolUpsert parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> toolPutWithHttpInfo(@javax.annotation.Nonnull ToolUpsert toolUpsert) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return toolPutRequestCreation(toolUpsert).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * @param toolUpsert The toolUpsert parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec toolPutWithResponseSpec(@javax.annotation.Nonnull ToolUpsert toolUpsert) throws WebClientResponseException {
        return toolPutRequestCreation(toolUpsert);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param id The id parameter
     * @return GetWorkflowResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec workflowIdGetRequestCreation(@javax.annotation.Nonnull Long id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling workflowIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetWorkflowResponse> localVarReturnType = new ParameterizedTypeReference<GetWorkflowResponse>() {};
        return apiClient.invokeAPI("/workflow/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param id The id parameter
     * @return GetWorkflowResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetWorkflowResponse> workflowIdGet(@javax.annotation.Nonnull Long id) throws WebClientResponseException {
        ParameterizedTypeReference<GetWorkflowResponse> localVarReturnType = new ParameterizedTypeReference<GetWorkflowResponse>() {};
        return workflowIdGetRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param id The id parameter
     * @return ResponseEntity&lt;GetWorkflowResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetWorkflowResponse>> workflowIdGetWithHttpInfo(@javax.annotation.Nonnull Long id) throws WebClientResponseException {
        ParameterizedTypeReference<GetWorkflowResponse> localVarReturnType = new ParameterizedTypeReference<GetWorkflowResponse>() {};
        return workflowIdGetRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec workflowIdGetWithResponseSpec(@javax.annotation.Nonnull Long id) throws WebClientResponseException {
        return workflowIdGetRequestCreation(id);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param createWorkflowRequest The createWorkflowRequest parameter
     * @return CreateWorkflowResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec workflowPostRequestCreation(@javax.annotation.Nonnull CreateWorkflowRequest createWorkflowRequest) throws WebClientResponseException {
        Object postBody = createWorkflowRequest;
        // verify the required parameter 'createWorkflowRequest' is set
        if (createWorkflowRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createWorkflowRequest' when calling workflowPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<CreateWorkflowResponse> localVarReturnType = new ParameterizedTypeReference<CreateWorkflowResponse>() {};
        return apiClient.invokeAPI("/workflow", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param createWorkflowRequest The createWorkflowRequest parameter
     * @return CreateWorkflowResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CreateWorkflowResponse> workflowPost(@javax.annotation.Nonnull CreateWorkflowRequest createWorkflowRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CreateWorkflowResponse> localVarReturnType = new ParameterizedTypeReference<CreateWorkflowResponse>() {};
        return workflowPostRequestCreation(createWorkflowRequest).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param createWorkflowRequest The createWorkflowRequest parameter
     * @return ResponseEntity&lt;CreateWorkflowResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CreateWorkflowResponse>> workflowPostWithHttpInfo(@javax.annotation.Nonnull CreateWorkflowRequest createWorkflowRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CreateWorkflowResponse> localVarReturnType = new ParameterizedTypeReference<CreateWorkflowResponse>() {};
        return workflowPostRequestCreation(createWorkflowRequest).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param createWorkflowRequest The createWorkflowRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec workflowPostWithResponseSpec(@javax.annotation.Nonnull CreateWorkflowRequest createWorkflowRequest) throws WebClientResponseException {
        return workflowPostRequestCreation(createWorkflowRequest);
    }
}
