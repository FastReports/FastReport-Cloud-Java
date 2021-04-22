# AdminSubscriptionAnalyticsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminSubscriptionAnalyticsCheckAnonPermissions**](AdminSubscriptionAnalyticsApi.md#adminSubscriptionAnalyticsCheckAnonPermissions) | **GET** /api/admin/v1/Analytics/Subscriptions/{subscriptionId}/AnonCheck | This will check if there are any files, related to subscription that available for anonymous users
[**adminSubscriptionAnalyticsCheckOtherPermissions**](AdminSubscriptionAnalyticsApi.md#adminSubscriptionAnalyticsCheckOtherPermissions) | **GET** /api/admin/v1/Analytics/Subscriptions/{subscriptionId}/OtherCheck | This will check if there are any files, related to subscription that not available for subscription users
[**adminSubscriptionAnalyticsGetDeadSubsInUsers**](AdminSubscriptionAnalyticsApi.md#adminSubscriptionAnalyticsGetDeadSubsInUsers) | **GET** /api/admin/v1/Analytics/Subscriptions/DeadSubsInUsers | This will check if there are any deleted subscriptions in users sub lists
[**adminSubscriptionAnalyticsGetEmptySubs**](AdminSubscriptionAnalyticsApi.md#adminSubscriptionAnalyticsGetEmptySubs) | **GET** /api/admin/v1/Analytics/Subscriptions/EmptySubs | This will check if there are any subscriptions without users
[**adminSubscriptionAnalyticsGetLostFileChunks**](AdminSubscriptionAnalyticsApi.md#adminSubscriptionAnalyticsGetLostFileChunks) | **GET** /api/admin/v1/Analytics/Subscriptions/LostFileChunks | This will check if there are any files in gridFS, which not related to any file model
[**adminSubscriptionAnalyticsGetUnrelatedDocuments**](AdminSubscriptionAnalyticsApi.md#adminSubscriptionAnalyticsGetUnrelatedDocuments) | **GET** /api/admin/v1/Analytics/Subscriptions/UnrelatedDocuments | This will check if there are any files, that not related to any existing subscription



## adminSubscriptionAnalyticsCheckAnonPermissions

> AnalysisResultsVM adminSubscriptionAnalyticsCheckAnonPermissions(subscriptionId)

This will check if there are any files, related to subscription that available for anonymous users

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminSubscriptionAnalyticsApi;

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

        AdminSubscriptionAnalyticsApi apiInstance = new AdminSubscriptionAnalyticsApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | subscription id
        try {
            AnalysisResultsVM result = apiInstance.adminSubscriptionAnalyticsCheckAnonPermissions(subscriptionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminSubscriptionAnalyticsApi#adminSubscriptionAnalyticsCheckAnonPermissions");
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
 **subscriptionId** | **String**| subscription id |

### Return type

[**AnalysisResultsVM**](AnalysisResultsVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |


## adminSubscriptionAnalyticsCheckOtherPermissions

> AnalysisResultsVM adminSubscriptionAnalyticsCheckOtherPermissions(subscriptionId)

This will check if there are any files, related to subscription that not available for subscription users

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminSubscriptionAnalyticsApi;

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

        AdminSubscriptionAnalyticsApi apiInstance = new AdminSubscriptionAnalyticsApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | subscription id
        try {
            AnalysisResultsVM result = apiInstance.adminSubscriptionAnalyticsCheckOtherPermissions(subscriptionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminSubscriptionAnalyticsApi#adminSubscriptionAnalyticsCheckOtherPermissions");
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
 **subscriptionId** | **String**| subscription id |

### Return type

[**AnalysisResultsVM**](AnalysisResultsVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |


## adminSubscriptionAnalyticsGetDeadSubsInUsers

> AnalysisResultsVM adminSubscriptionAnalyticsGetDeadSubsInUsers()

This will check if there are any deleted subscriptions in users sub lists

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminSubscriptionAnalyticsApi;

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

        AdminSubscriptionAnalyticsApi apiInstance = new AdminSubscriptionAnalyticsApi(defaultClient);
        try {
            AnalysisResultsVM result = apiInstance.adminSubscriptionAnalyticsGetDeadSubsInUsers();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminSubscriptionAnalyticsApi#adminSubscriptionAnalyticsGetDeadSubsInUsers");
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

[**AnalysisResultsVM**](AnalysisResultsVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |


## adminSubscriptionAnalyticsGetEmptySubs

> AnalysisResultsVM adminSubscriptionAnalyticsGetEmptySubs()

This will check if there are any subscriptions without users

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminSubscriptionAnalyticsApi;

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

        AdminSubscriptionAnalyticsApi apiInstance = new AdminSubscriptionAnalyticsApi(defaultClient);
        try {
            AnalysisResultsVM result = apiInstance.adminSubscriptionAnalyticsGetEmptySubs();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminSubscriptionAnalyticsApi#adminSubscriptionAnalyticsGetEmptySubs");
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

[**AnalysisResultsVM**](AnalysisResultsVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |


## adminSubscriptionAnalyticsGetLostFileChunks

> AnalysisResultsVM adminSubscriptionAnalyticsGetLostFileChunks()

This will check if there are any files in gridFS, which not related to any file model

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminSubscriptionAnalyticsApi;

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

        AdminSubscriptionAnalyticsApi apiInstance = new AdminSubscriptionAnalyticsApi(defaultClient);
        try {
            AnalysisResultsVM result = apiInstance.adminSubscriptionAnalyticsGetLostFileChunks();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminSubscriptionAnalyticsApi#adminSubscriptionAnalyticsGetLostFileChunks");
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

[**AnalysisResultsVM**](AnalysisResultsVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |


## adminSubscriptionAnalyticsGetUnrelatedDocuments

> AnalysisResultsVM adminSubscriptionAnalyticsGetUnrelatedDocuments()

This will check if there are any files, that not related to any existing subscription

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminSubscriptionAnalyticsApi;

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

        AdminSubscriptionAnalyticsApi apiInstance = new AdminSubscriptionAnalyticsApi(defaultClient);
        try {
            AnalysisResultsVM result = apiInstance.adminSubscriptionAnalyticsGetUnrelatedDocuments();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminSubscriptionAnalyticsApi#adminSubscriptionAnalyticsGetUnrelatedDocuments");
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

[**AnalysisResultsVM**](AnalysisResultsVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |

