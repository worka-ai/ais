package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CreateAgentResponse;
import org.openapitools.client.model.CreateConversationResponse;
import org.openapitools.client.model.CreateConversationUnderTenantRequest;
import org.openapitools.client.model.CreateTenantRequest;
import org.openapitools.client.model.CreateTenantResponse;
import org.openapitools.client.model.CreateWorkflowResponse;
import org.openapitools.client.model.CreateWorkflowUnderTenantRequest;
import org.openapitools.client.model.GetWorkflowResponse;
import org.openapitools.client.model.UpdateLLMConfigResponse;
import org.openapitools.client.model.UpsertAgentRequest;
import org.openapitools.client.model.UpsertLLMConfigRequest;
import org.openapitools.client.model.UpsertToolRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-17T16:24:59.041193+01:00[Europe/London]", comments = "Generator version: 7.14.0")
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
     * @param createTenantRequest The createTenantRequest parameter
     * @return CreateTenantResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec tenantsPostRequestCreation(@javax.annotation.Nonnull CreateTenantRequest createTenantRequest) throws WebClientResponseException {
        Object postBody = createTenantRequest;
        // verify the required parameter 'createTenantRequest' is set
        if (createTenantRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createTenantRequest' when calling tenantsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/tenants", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param createTenantRequest The createTenantRequest parameter
     * @return CreateTenantResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CreateTenantResponse> tenantsPost(@javax.annotation.Nonnull CreateTenantRequest createTenantRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CreateTenantResponse> localVarReturnType = new ParameterizedTypeReference<CreateTenantResponse>() {};
        return tenantsPostRequestCreation(createTenantRequest).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param createTenantRequest The createTenantRequest parameter
     * @return ResponseEntity&lt;CreateTenantResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CreateTenantResponse>> tenantsPostWithHttpInfo(@javax.annotation.Nonnull CreateTenantRequest createTenantRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CreateTenantResponse> localVarReturnType = new ParameterizedTypeReference<CreateTenantResponse>() {};
        return tenantsPostRequestCreation(createTenantRequest).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param createTenantRequest The createTenantRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec tenantsPostWithResponseSpec(@javax.annotation.Nonnull CreateTenantRequest createTenantRequest) throws WebClientResponseException {
        return tenantsPostRequestCreation(createTenantRequest);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param tenantId The tenantId parameter
     * @param upsertAgentRequest The upsertAgentRequest parameter
     * @return CreateAgentResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec tenantsTenantIdAgentsPutRequestCreation(@javax.annotation.Nonnull Long tenantId, @javax.annotation.Nonnull UpsertAgentRequest upsertAgentRequest) throws WebClientResponseException {
        Object postBody = upsertAgentRequest;
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new WebClientResponseException("Missing the required parameter 'tenantId' when calling tenantsTenantIdAgentsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'upsertAgentRequest' is set
        if (upsertAgentRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'upsertAgentRequest' when calling tenantsTenantIdAgentsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("tenant_id", tenantId);

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
        return apiClient.invokeAPI("/tenants/{tenant_id}/agents", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param tenantId The tenantId parameter
     * @param upsertAgentRequest The upsertAgentRequest parameter
     * @return CreateAgentResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CreateAgentResponse> tenantsTenantIdAgentsPut(@javax.annotation.Nonnull Long tenantId, @javax.annotation.Nonnull UpsertAgentRequest upsertAgentRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CreateAgentResponse> localVarReturnType = new ParameterizedTypeReference<CreateAgentResponse>() {};
        return tenantsTenantIdAgentsPutRequestCreation(tenantId, upsertAgentRequest).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param tenantId The tenantId parameter
     * @param upsertAgentRequest The upsertAgentRequest parameter
     * @return ResponseEntity&lt;CreateAgentResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CreateAgentResponse>> tenantsTenantIdAgentsPutWithHttpInfo(@javax.annotation.Nonnull Long tenantId, @javax.annotation.Nonnull UpsertAgentRequest upsertAgentRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CreateAgentResponse> localVarReturnType = new ParameterizedTypeReference<CreateAgentResponse>() {};
        return tenantsTenantIdAgentsPutRequestCreation(tenantId, upsertAgentRequest).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param tenantId The tenantId parameter
     * @param upsertAgentRequest The upsertAgentRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec tenantsTenantIdAgentsPutWithResponseSpec(@javax.annotation.Nonnull Long tenantId, @javax.annotation.Nonnull UpsertAgentRequest upsertAgentRequest) throws WebClientResponseException {
        return tenantsTenantIdAgentsPutRequestCreation(tenantId, upsertAgentRequest);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param tenantId The tenantId parameter
     * @param createConversationUnderTenantRequest The createConversationUnderTenantRequest parameter
     * @return CreateConversationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec tenantsTenantIdConversationsPostRequestCreation(@javax.annotation.Nonnull Long tenantId, @javax.annotation.Nonnull CreateConversationUnderTenantRequest createConversationUnderTenantRequest) throws WebClientResponseException {
        Object postBody = createConversationUnderTenantRequest;
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new WebClientResponseException("Missing the required parameter 'tenantId' when calling tenantsTenantIdConversationsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'createConversationUnderTenantRequest' is set
        if (createConversationUnderTenantRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createConversationUnderTenantRequest' when calling tenantsTenantIdConversationsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("tenant_id", tenantId);

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
        return apiClient.invokeAPI("/tenants/{tenant_id}/conversations", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param tenantId The tenantId parameter
     * @param createConversationUnderTenantRequest The createConversationUnderTenantRequest parameter
     * @return CreateConversationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CreateConversationResponse> tenantsTenantIdConversationsPost(@javax.annotation.Nonnull Long tenantId, @javax.annotation.Nonnull CreateConversationUnderTenantRequest createConversationUnderTenantRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CreateConversationResponse> localVarReturnType = new ParameterizedTypeReference<CreateConversationResponse>() {};
        return tenantsTenantIdConversationsPostRequestCreation(tenantId, createConversationUnderTenantRequest).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param tenantId The tenantId parameter
     * @param createConversationUnderTenantRequest The createConversationUnderTenantRequest parameter
     * @return ResponseEntity&lt;CreateConversationResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CreateConversationResponse>> tenantsTenantIdConversationsPostWithHttpInfo(@javax.annotation.Nonnull Long tenantId, @javax.annotation.Nonnull CreateConversationUnderTenantRequest createConversationUnderTenantRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CreateConversationResponse> localVarReturnType = new ParameterizedTypeReference<CreateConversationResponse>() {};
        return tenantsTenantIdConversationsPostRequestCreation(tenantId, createConversationUnderTenantRequest).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param tenantId The tenantId parameter
     * @param createConversationUnderTenantRequest The createConversationUnderTenantRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec tenantsTenantIdConversationsPostWithResponseSpec(@javax.annotation.Nonnull Long tenantId, @javax.annotation.Nonnull CreateConversationUnderTenantRequest createConversationUnderTenantRequest) throws WebClientResponseException {
        return tenantsTenantIdConversationsPostRequestCreation(tenantId, createConversationUnderTenantRequest);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param tenantId The tenantId parameter
     * @param upsertLLMConfigRequest The upsertLLMConfigRequest parameter
     * @return UpdateLLMConfigResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec tenantsTenantIdLlmConfigsPostRequestCreation(@javax.annotation.Nonnull Long tenantId, @javax.annotation.Nonnull UpsertLLMConfigRequest upsertLLMConfigRequest) throws WebClientResponseException {
        Object postBody = upsertLLMConfigRequest;
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new WebClientResponseException("Missing the required parameter 'tenantId' when calling tenantsTenantIdLlmConfigsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'upsertLLMConfigRequest' is set
        if (upsertLLMConfigRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'upsertLLMConfigRequest' when calling tenantsTenantIdLlmConfigsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("tenant_id", tenantId);

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
        return apiClient.invokeAPI("/tenants/{tenant_id}/llm-configs", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param tenantId The tenantId parameter
     * @param upsertLLMConfigRequest The upsertLLMConfigRequest parameter
     * @return UpdateLLMConfigResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UpdateLLMConfigResponse> tenantsTenantIdLlmConfigsPost(@javax.annotation.Nonnull Long tenantId, @javax.annotation.Nonnull UpsertLLMConfigRequest upsertLLMConfigRequest) throws WebClientResponseException {
        ParameterizedTypeReference<UpdateLLMConfigResponse> localVarReturnType = new ParameterizedTypeReference<UpdateLLMConfigResponse>() {};
        return tenantsTenantIdLlmConfigsPostRequestCreation(tenantId, upsertLLMConfigRequest).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param tenantId The tenantId parameter
     * @param upsertLLMConfigRequest The upsertLLMConfigRequest parameter
     * @return ResponseEntity&lt;UpdateLLMConfigResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<UpdateLLMConfigResponse>> tenantsTenantIdLlmConfigsPostWithHttpInfo(@javax.annotation.Nonnull Long tenantId, @javax.annotation.Nonnull UpsertLLMConfigRequest upsertLLMConfigRequest) throws WebClientResponseException {
        ParameterizedTypeReference<UpdateLLMConfigResponse> localVarReturnType = new ParameterizedTypeReference<UpdateLLMConfigResponse>() {};
        return tenantsTenantIdLlmConfigsPostRequestCreation(tenantId, upsertLLMConfigRequest).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param tenantId The tenantId parameter
     * @param upsertLLMConfigRequest The upsertLLMConfigRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec tenantsTenantIdLlmConfigsPostWithResponseSpec(@javax.annotation.Nonnull Long tenantId, @javax.annotation.Nonnull UpsertLLMConfigRequest upsertLLMConfigRequest) throws WebClientResponseException {
        return tenantsTenantIdLlmConfigsPostRequestCreation(tenantId, upsertLLMConfigRequest);
    }

    /**
     * 
     * 
     * @param tenantId The tenantId parameter
     * @param upsertToolRequest The upsertToolRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec tenantsTenantIdToolsPutRequestCreation(@javax.annotation.Nonnull Long tenantId, @javax.annotation.Nonnull UpsertToolRequest upsertToolRequest) throws WebClientResponseException {
        Object postBody = upsertToolRequest;
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new WebClientResponseException("Missing the required parameter 'tenantId' when calling tenantsTenantIdToolsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'upsertToolRequest' is set
        if (upsertToolRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'upsertToolRequest' when calling tenantsTenantIdToolsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("tenant_id", tenantId);

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
        return apiClient.invokeAPI("/tenants/{tenant_id}/tools", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * @param tenantId The tenantId parameter
     * @param upsertToolRequest The upsertToolRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> tenantsTenantIdToolsPut(@javax.annotation.Nonnull Long tenantId, @javax.annotation.Nonnull UpsertToolRequest upsertToolRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return tenantsTenantIdToolsPutRequestCreation(tenantId, upsertToolRequest).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * @param tenantId The tenantId parameter
     * @param upsertToolRequest The upsertToolRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> tenantsTenantIdToolsPutWithHttpInfo(@javax.annotation.Nonnull Long tenantId, @javax.annotation.Nonnull UpsertToolRequest upsertToolRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return tenantsTenantIdToolsPutRequestCreation(tenantId, upsertToolRequest).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * @param tenantId The tenantId parameter
     * @param upsertToolRequest The upsertToolRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec tenantsTenantIdToolsPutWithResponseSpec(@javax.annotation.Nonnull Long tenantId, @javax.annotation.Nonnull UpsertToolRequest upsertToolRequest) throws WebClientResponseException {
        return tenantsTenantIdToolsPutRequestCreation(tenantId, upsertToolRequest);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param tenantId The tenantId parameter
     * @param createWorkflowUnderTenantRequest The createWorkflowUnderTenantRequest parameter
     * @return CreateWorkflowResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec tenantsTenantIdWorkflowsPostRequestCreation(@javax.annotation.Nonnull Long tenantId, @javax.annotation.Nonnull CreateWorkflowUnderTenantRequest createWorkflowUnderTenantRequest) throws WebClientResponseException {
        Object postBody = createWorkflowUnderTenantRequest;
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new WebClientResponseException("Missing the required parameter 'tenantId' when calling tenantsTenantIdWorkflowsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'createWorkflowUnderTenantRequest' is set
        if (createWorkflowUnderTenantRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createWorkflowUnderTenantRequest' when calling tenantsTenantIdWorkflowsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("tenant_id", tenantId);

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
        return apiClient.invokeAPI("/tenants/{tenant_id}/workflows", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param tenantId The tenantId parameter
     * @param createWorkflowUnderTenantRequest The createWorkflowUnderTenantRequest parameter
     * @return CreateWorkflowResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CreateWorkflowResponse> tenantsTenantIdWorkflowsPost(@javax.annotation.Nonnull Long tenantId, @javax.annotation.Nonnull CreateWorkflowUnderTenantRequest createWorkflowUnderTenantRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CreateWorkflowResponse> localVarReturnType = new ParameterizedTypeReference<CreateWorkflowResponse>() {};
        return tenantsTenantIdWorkflowsPostRequestCreation(tenantId, createWorkflowUnderTenantRequest).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param tenantId The tenantId parameter
     * @param createWorkflowUnderTenantRequest The createWorkflowUnderTenantRequest parameter
     * @return ResponseEntity&lt;CreateWorkflowResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CreateWorkflowResponse>> tenantsTenantIdWorkflowsPostWithHttpInfo(@javax.annotation.Nonnull Long tenantId, @javax.annotation.Nonnull CreateWorkflowUnderTenantRequest createWorkflowUnderTenantRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CreateWorkflowResponse> localVarReturnType = new ParameterizedTypeReference<CreateWorkflowResponse>() {};
        return tenantsTenantIdWorkflowsPostRequestCreation(tenantId, createWorkflowUnderTenantRequest).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param tenantId The tenantId parameter
     * @param createWorkflowUnderTenantRequest The createWorkflowUnderTenantRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec tenantsTenantIdWorkflowsPostWithResponseSpec(@javax.annotation.Nonnull Long tenantId, @javax.annotation.Nonnull CreateWorkflowUnderTenantRequest createWorkflowUnderTenantRequest) throws WebClientResponseException {
        return tenantsTenantIdWorkflowsPostRequestCreation(tenantId, createWorkflowUnderTenantRequest);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param id The id parameter
     * @return GetWorkflowResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec workflowsIdGetRequestCreation(@javax.annotation.Nonnull Long id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling workflowsIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/workflows/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param id The id parameter
     * @return GetWorkflowResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetWorkflowResponse> workflowsIdGet(@javax.annotation.Nonnull Long id) throws WebClientResponseException {
        ParameterizedTypeReference<GetWorkflowResponse> localVarReturnType = new ParameterizedTypeReference<GetWorkflowResponse>() {};
        return workflowsIdGetRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param id The id parameter
     * @return ResponseEntity&lt;GetWorkflowResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetWorkflowResponse>> workflowsIdGetWithHttpInfo(@javax.annotation.Nonnull Long id) throws WebClientResponseException {
        ParameterizedTypeReference<GetWorkflowResponse> localVarReturnType = new ParameterizedTypeReference<GetWorkflowResponse>() {};
        return workflowsIdGetRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec workflowsIdGetWithResponseSpec(@javax.annotation.Nonnull Long id) throws WebClientResponseException {
        return workflowsIdGetRequestCreation(id);
    }
}
