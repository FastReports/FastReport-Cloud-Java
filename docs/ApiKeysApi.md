# ApiKeysApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiKeysCreateApiKey**](ApiKeysApi.md#apiKeysCreateApiKey) | **POST** /api/manage/v1/ApiKeys | Create a new apikey, 5 apikeys for user. Hardcoded for ddos.
[**apiKeysDeleteApiKey**](ApiKeysApi.md#apiKeysDeleteApiKey) | **DELETE** /api/manage/v1/ApiKeys | Delete an apikey
[**apiKeysGetApiKeys**](ApiKeysApi.md#apiKeysGetApiKeys) | **GET** /api/manage/v1/ApiKeys | Returns list with all api keys of current user



## apiKeysCreateApiKey

> ApiKeyVM apiKeysCreateApiKey(model)

Create a new apikey, 5 apikeys for user. Hardcoded for ddos.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ApiKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure API key authorization: JWT
        ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
        JWT.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //JWT.setApiKeyPrefix("Token");

        ApiKeysApi apiInstance = new ApiKeysApi(defaultClient);
        CreateApiKeyVM model = new CreateApiKeyVM(); // CreateApiKeyVM | 
        try {
            ApiKeyVM result = apiInstance.apiKeysCreateApiKey(model);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiKeysApi#apiKeysCreateApiKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**CreateApiKeyVM**](CreateApiKeyVM.md)|  |

### Return type

[**ApiKeyVM**](ApiKeyVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully created |  -  |
| **400** | wrong model provided or exception thrown (user&#39;s attempts to create sixth key for example throwns an exception) |  -  |


## apiKeysDeleteApiKey

> apiKeysDeleteApiKey(model)

Delete an apikey

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ApiKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure API key authorization: JWT
        ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
        JWT.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //JWT.setApiKeyPrefix("Token");

        ApiKeysApi apiInstance = new ApiKeysApi(defaultClient);
        DeleteApiKeyVM model = new DeleteApiKeyVM(); // DeleteApiKeyVM | 
        try {
            apiInstance.apiKeysDeleteApiKey(model);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiKeysApi#apiKeysDeleteApiKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**DeleteApiKeyVM**](DeleteApiKeyVM.md)|  |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Succesfully deleted |  -  |
| **400** | The request is wrong |  -  |
| **404** | No such apikey found |  -  |
| **500** | exception thrown |  -  |


## apiKeysGetApiKeys

> ApiKeysVM apiKeysGetApiKeys()

Returns list with all api keys of current user

Always work, it should make only 200 response.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ApiKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure API key authorization: JWT
        ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
        JWT.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //JWT.setApiKeyPrefix("Token");

        ApiKeysApi apiInstance = new ApiKeysApi(defaultClient);
        try {
            ApiKeysVM result = apiInstance.apiKeysGetApiKeys();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiKeysApi#apiKeysGetApiKeys");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ApiKeysVM**](ApiKeysVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully retured |  -  |
| **500** | Exception somehow thrown (barely possible) |  -  |
