# worka
No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 
- Package version: 1.0.0
- Generator version: 7.14.0
- Build package: org.openapitools.codegen.languages.PythonClientCodegen

## Requirements.

Python 3.9+

## Installation & Usage
### pip install

If the python package is hosted on a repository, you can install directly using:

```sh
pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git`)

Then import the package:
```python
import worka
```

### Setuptools

Install via [Setuptools](http://pypi.python.org/pypi/setuptools).

```sh
python setup.py install --user
```
(or `sudo python setup.py install` to install the package for all users)

Then import the package:
```python
import worka
```

### Tests

Execute `pytest` to run the tests.

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```python

import worka
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
    except ApiException as e:
        print("Exception when calling DefaultApi->tenants_post: %s\n" % e)

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**tenants_post**](docs/DefaultApi.md#tenants_post) | **POST** /tenants | 
*DefaultApi* | [**tenants_tenant_id_agents_put**](docs/DefaultApi.md#tenants_tenant_id_agents_put) | **PUT** /tenants/{tenant_id}/agents | 
*DefaultApi* | [**tenants_tenant_id_conversations_post**](docs/DefaultApi.md#tenants_tenant_id_conversations_post) | **POST** /tenants/{tenant_id}/conversations | 
*DefaultApi* | [**tenants_tenant_id_llm_configs_post**](docs/DefaultApi.md#tenants_tenant_id_llm_configs_post) | **POST** /tenants/{tenant_id}/llm-configs | 
*DefaultApi* | [**tenants_tenant_id_tools_put**](docs/DefaultApi.md#tenants_tenant_id_tools_put) | **PUT** /tenants/{tenant_id}/tools | 
*DefaultApi* | [**tenants_tenant_id_workflows_post**](docs/DefaultApi.md#tenants_tenant_id_workflows_post) | **POST** /tenants/{tenant_id}/workflows | 
*DefaultApi* | [**workflows_id_get**](docs/DefaultApi.md#workflows_id_get) | **GET** /workflows/{id} | 


## Documentation For Models

 - [CreateAgentResponse](docs/CreateAgentResponse.md)
 - [CreateConversationResponse](docs/CreateConversationResponse.md)
 - [CreateConversationUnderTenantRequest](docs/CreateConversationUnderTenantRequest.md)
 - [CreateTenantRequest](docs/CreateTenantRequest.md)
 - [CreateTenantResponse](docs/CreateTenantResponse.md)
 - [CreateWorkflowResponse](docs/CreateWorkflowResponse.md)
 - [CreateWorkflowUnderTenantRequest](docs/CreateWorkflowUnderTenantRequest.md)
 - [CreateWorkflowUnderTenantRequestGenerationConfig](docs/CreateWorkflowUnderTenantRequestGenerationConfig.md)
 - [GetWorkflowResponse](docs/GetWorkflowResponse.md)
 - [UpdateLLMConfigResponse](docs/UpdateLLMConfigResponse.md)
 - [UpsertAgentRequest](docs/UpsertAgentRequest.md)
 - [UpsertAgentRequestAgentsInner](docs/UpsertAgentRequestAgentsInner.md)
 - [UpsertAgentRequestAgentsInnerEdgesInner](docs/UpsertAgentRequestAgentsInnerEdgesInner.md)
 - [UpsertAgentRequestAgentsInnerRulesInner](docs/UpsertAgentRequestAgentsInnerRulesInner.md)
 - [UpsertAgentRequestAgentsInnerRulesInnerToolsInner](docs/UpsertAgentRequestAgentsInnerRulesInnerToolsInner.md)
 - [UpsertAgentRequestAgentsInnerRulesInnerToolsInnerFunctionDeclarationsInner](docs/UpsertAgentRequestAgentsInnerRulesInnerToolsInnerFunctionDeclarationsInner.md)
 - [UpsertAgentRequestAgentsInnerRulesInnerToolsInnerFunctionDeclarationsInnerInternal](docs/UpsertAgentRequestAgentsInnerRulesInnerToolsInnerFunctionDeclarationsInnerInternal.md)
 - [UpsertLLMConfigRequest](docs/UpsertLLMConfigRequest.md)
 - [UpsertToolRequest](docs/UpsertToolRequest.md)


<a id="documentation-for-authorization"></a>
## Documentation For Authorization

Endpoints do not require authorization.


## Author




