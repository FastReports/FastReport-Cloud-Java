# AdminApiKeysApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminApiKeysCreateApiKey**](AdminApiKeysApi.md#adminApiKeysCreateApiKey) | **POST** /api/admin/v1/ApiKeys/{userId} | Create a new apikey, 5 apikeys for user. Hardcoded for ddos.
[**adminApiKeysDeleteApiKey**](AdminApiKeysApi.md#adminApiKeysDeleteApiKey) | **DELETE** /api/admin/v1/ApiKeys/{userId} | Delete an apikey
[**adminApiKeysGetApiKeys**](AdminApiKeysApi.md#adminApiKeysGetApiKeys) | **GET** /api/admin/v1/ApiKeys/{userId} | Returns list with all api keys of a specified user



## adminApiKeysCreateApiKey

> ApiKeyVM adminApiKeysCreateApiKey(userId, model)

Create a new apikey, 5 apikeys for user. Hardcoded for ddos.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminApiKeysApi;

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

        AdminApiKeysApi apiInstance = new AdminApiKeysApi(defaultClient);
        String userId = "userId_example"; // String | 
        CreateApiKeyVM model = new CreateApiKeyVM(); // CreateApiKeyVM | 
        try {
            ApiKeyVM result = apiInstance.adminApiKeysCreateApiKey(userId, model);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminApiKeysApi#adminApiKeysCreateApiKey");
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
 **userId** | **String**|  |
 **model** | [**CreateApiKeyVM**](CreateApiKeyVM.md)|  | [optional]

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
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | user is not found |  -  |


## adminApiKeysDeleteApiKey

> adminApiKeysDeleteApiKey(userId, model)

Delete an apikey

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminApiKeysApi;

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

        AdminApiKeysApi apiInstance = new AdminApiKeysApi(defaultClient);
        String userId = "userId_example"; // String | 
        DeleteApiKeyVM model = new DeleteApiKeyVM(); // DeleteApiKeyVM | 
        try {
            apiInstance.adminApiKeysDeleteApiKey(userId, model);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminApiKeysApi#adminApiKeysDeleteApiKey");
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
 **userId** | **String**|  |
 **model** | [**DeleteApiKeyVM**](DeleteApiKeyVM.md)|  | [optional]

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
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Apikey or user is not found |  -  |


## adminApiKeysGetApiKeys

> ApiKeysVM adminApiKeysGetApiKeys(userId)

Returns list with all api keys of a specified user

Always work, it should make only 200 response.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminApiKeysApi;

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

        AdminApiKeysApi apiInstance = new AdminApiKeysApi(defaultClient);
        String userId = "userId_example"; // String | 
        try {
            ApiKeysVM result = apiInstance.adminApiKeysGetApiKeys(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminApiKeysApi#adminApiKeysGetApiKeys");
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
 **userId** | **String**|  |

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
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |

