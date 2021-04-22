# AdminSubscriptionsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminSubscriptionsAddPermission**](AdminSubscriptionsApi.md#adminSubscriptionsAddPermission) | **PUT** /api/admin/v1/Subscriptions/{id}/permissions | Add permissions to subscription
[**adminSubscriptionsCreateSubscription**](AdminSubscriptionsApi.md#adminSubscriptionsCreateSubscription) | **POST** /api/admin/v1/Subscriptions | Create a new subscription based on some plan
[**adminSubscriptionsDeleteSubscription**](AdminSubscriptionsApi.md#adminSubscriptionsDeleteSubscription) | **DELETE** /api/admin/v1/Subscriptions/{id} | Delete the subscription by id
[**adminSubscriptionsGetNewSibscriptionsPerMonth**](AdminSubscriptionsApi.md#adminSubscriptionsGetNewSibscriptionsPerMonth) | **GET** /api/admin/v1/Subscriptions/stat/new/{from}/{to} | Returns a key-value pair of new(renew) subscriptions count per month for a specified time span: (month, number of new subscriptions)
[**adminSubscriptionsGetPermissions**](AdminSubscriptionsApi.md#adminSubscriptionsGetPermissions) | **GET** /api/admin/v1/Subscriptions/{id}/permissions | Get all subscription permissions
[**adminSubscriptionsGetSubscription**](AdminSubscriptionsApi.md#adminSubscriptionsGetSubscription) | **GET** /api/admin/v1/Subscriptions/{id} | Returns the subscription by id
[**adminSubscriptionsGetSubscriptions**](AdminSubscriptionsApi.md#adminSubscriptionsGetSubscriptions) | **GET** /api/admin/v1/Subscriptions | Returns a list of all subscriptions
[**adminSubscriptionsReCountSubscription**](AdminSubscriptionsApi.md#adminSubscriptionsReCountSubscription) | **GET** /api/admin/v1/Subscriptions/{id}/recount | Recount subscription&#39;s files and folders size
[**adminSubscriptionsRevokePermission**](AdminSubscriptionsApi.md#adminSubscriptionsRevokePermission) | **DELETE** /api/admin/v1/Subscriptions/{id}/permissions | Revoke permissions to subscription
[**adminSubscriptionsUpdatePermissions**](AdminSubscriptionsApi.md#adminSubscriptionsUpdatePermissions) | **POST** /api/admin/v1/Subscriptions/{id}/permissions | Update permissions to subscription
[**adminSubscriptionsUpdateSubscription**](AdminSubscriptionsApi.md#adminSubscriptionsUpdateSubscription) | **PUT** /api/admin/v1/Subscriptions/{id} | Update the subscription by id



## adminSubscriptionsAddPermission

> SubscriptionPermissions adminSubscriptionsAddPermission(id, permissionsVM)

Add permissions to subscription

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminSubscriptionsApi;

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

        AdminSubscriptionsApi apiInstance = new AdminSubscriptionsApi(defaultClient);
        String id = "id_example"; // String | subscription id
        SubscriptionPermissionsVM permissionsVM = new SubscriptionPermissionsVM(); // SubscriptionPermissionsVM | permissions VM
        try {
            SubscriptionPermissions result = apiInstance.adminSubscriptionsAddPermission(id, permissionsVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminSubscriptionsApi#adminSubscriptionsAddPermission");
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
 **id** | **String**| subscription id |
 **permissionsVM** | [**SubscriptionPermissionsVM**](SubscriptionPermissionsVM.md)| permissions VM | [optional]

### Return type

[**SubscriptionPermissions**](SubscriptionPermissions.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |


## adminSubscriptionsCreateSubscription

> AdminSubscriptionVM adminSubscriptionsCreateSubscription(viewModel)

Create a new subscription based on some plan

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminSubscriptionsApi;

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

        AdminSubscriptionsApi apiInstance = new AdminSubscriptionsApi(defaultClient);
        CreateSubscriptionVM viewModel = new CreateSubscriptionVM(); // CreateSubscriptionVM | View model
        try {
            AdminSubscriptionVM result = apiInstance.adminSubscriptionsCreateSubscription(viewModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminSubscriptionsApi#adminSubscriptionsCreateSubscription");
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
 **viewModel** | [**CreateSubscriptionVM**](CreateSubscriptionVM.md)| View model | [optional]

### Return type

[**AdminSubscriptionVM**](AdminSubscriptionVM.md)

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
| **404** | Subscription plan is not found |  -  |


## adminSubscriptionsDeleteSubscription

> adminSubscriptionsDeleteSubscription(id)

Delete the subscription by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminSubscriptionsApi;

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

        AdminSubscriptionsApi apiInstance = new AdminSubscriptionsApi(defaultClient);
        String id = "id_example"; // String | Identifier of subscription
        try {
            apiInstance.adminSubscriptionsDeleteSubscription(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminSubscriptionsApi#adminSubscriptionsDeleteSubscription");
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
 **id** | **String**| Identifier of subscription |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Succesfully deleted |  -  |
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Subscription is not found |  -  |


## adminSubscriptionsGetNewSibscriptionsPerMonth

> Map&lt;String, Integer&gt; adminSubscriptionsGetNewSibscriptionsPerMonth(from, to)

Returns a key-value pair of new(renew) subscriptions count per month for a specified time span: (month, number of new subscriptions)

If no subscriptions, then the endpoint will return empty dic

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminSubscriptionsApi;

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

        AdminSubscriptionsApi apiInstance = new AdminSubscriptionsApi(defaultClient);
        OffsetDateTime from = OffsetDateTime.now(); // OffsetDateTime | A starting date for stats calculation
        OffsetDateTime to = OffsetDateTime.now(); // OffsetDateTime | An ending date for stats calculation
        try {
            Map<String, Integer> result = apiInstance.adminSubscriptionsGetNewSibscriptionsPerMonth(from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminSubscriptionsApi#adminSubscriptionsGetNewSibscriptionsPerMonth");
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
 **from** | **OffsetDateTime**| A starting date for stats calculation |
 **to** | **OffsetDateTime**| An ending date for stats calculation |

### Return type

**Map&lt;String, Integer&gt;**

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully returned |  -  |
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |


## adminSubscriptionsGetPermissions

> SubscriptionPermissions adminSubscriptionsGetPermissions(id)

Get all subscription permissions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminSubscriptionsApi;

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

        AdminSubscriptionsApi apiInstance = new AdminSubscriptionsApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            SubscriptionPermissions result = apiInstance.adminSubscriptionsGetPermissions(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminSubscriptionsApi#adminSubscriptionsGetPermissions");
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
 **id** | **String**|  |

### Return type

[**SubscriptionPermissions**](SubscriptionPermissions.md)

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
| **404** | Not Found |  -  |


## adminSubscriptionsGetSubscription

> AdminSubscriptionVM adminSubscriptionsGetSubscription(id)

Returns the subscription by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminSubscriptionsApi;

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

        AdminSubscriptionsApi apiInstance = new AdminSubscriptionsApi(defaultClient);
        String id = "id_example"; // String | Identifier of subscription
        try {
            AdminSubscriptionVM result = apiInstance.adminSubscriptionsGetSubscription(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminSubscriptionsApi#adminSubscriptionsGetSubscription");
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
 **id** | **String**| Identifier of subscription |

### Return type

[**AdminSubscriptionVM**](AdminSubscriptionVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully returned |  -  |
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Subscription is not found |  -  |
| **500** | exception caught |  -  |


## adminSubscriptionsGetSubscriptions

> AdminSubscriptionsVM adminSubscriptionsGetSubscriptions(skip, take)

Returns a list of all subscriptions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminSubscriptionsApi;

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

        AdminSubscriptionsApi apiInstance = new AdminSubscriptionsApi(defaultClient);
        Integer skip = 0; // Integer | Variable for pagination, defautl value is 0
        Integer take = 10; // Integer | Variable for pagination, default value is 10
        try {
            AdminSubscriptionsVM result = apiInstance.adminSubscriptionsGetSubscriptions(skip, take);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminSubscriptionsApi#adminSubscriptionsGetSubscriptions");
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
 **skip** | **Integer**| Variable for pagination, defautl value is 0 | [optional] [default to 0]
 **take** | **Integer**| Variable for pagination, default value is 10 | [optional] [default to 10]

### Return type

[**AdminSubscriptionsVM**](AdminSubscriptionsVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully returned |  -  |
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |


## adminSubscriptionsReCountSubscription

> Map&lt;String, Long&gt; adminSubscriptionsReCountSubscription(id, collectionNames)

Recount subscription&#39;s files and folders size

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminSubscriptionsApi;

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

        AdminSubscriptionsApi apiInstance = new AdminSubscriptionsApi(defaultClient);
        String id = "id_example"; // String | Identifier of subscription
        String collectionNames = "collectionNames_example"; // String | collection names to recount listed through ',' sign
        try {
            Map<String, Long> result = apiInstance.adminSubscriptionsReCountSubscription(id, collectionNames);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminSubscriptionsApi#adminSubscriptionsReCountSubscription");
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
 **id** | **String**| Identifier of subscription |
 **collectionNames** | **String**| collection names to recount listed through &#39;,&#39; sign | [optional]

### Return type

**Map&lt;String, Long&gt;**

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully recounted |  -  |
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Subscription is not found |  -  |
| **500** | exception caught |  -  |


## adminSubscriptionsRevokePermission

> SubscriptionPermissions adminSubscriptionsRevokePermission(id, permissionsVM)

Revoke permissions to subscription

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminSubscriptionsApi;

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

        AdminSubscriptionsApi apiInstance = new AdminSubscriptionsApi(defaultClient);
        String id = "id_example"; // String | subscription id
        SubscriptionPermissionsVM permissionsVM = new SubscriptionPermissionsVM(); // SubscriptionPermissionsVM | permissions VM
        try {
            SubscriptionPermissions result = apiInstance.adminSubscriptionsRevokePermission(id, permissionsVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminSubscriptionsApi#adminSubscriptionsRevokePermission");
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
 **id** | **String**| subscription id |
 **permissionsVM** | [**SubscriptionPermissionsVM**](SubscriptionPermissionsVM.md)| permissions VM | [optional]

### Return type

[**SubscriptionPermissions**](SubscriptionPermissions.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |


## adminSubscriptionsUpdatePermissions

> SubscriptionPermissions adminSubscriptionsUpdatePermissions(id, permissionsVM)

Update permissions to subscription

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminSubscriptionsApi;

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

        AdminSubscriptionsApi apiInstance = new AdminSubscriptionsApi(defaultClient);
        String id = "id_example"; // String | subscription id
        SubscriptionPermissions permissionsVM = new SubscriptionPermissions(); // SubscriptionPermissions | permissions VM
        try {
            SubscriptionPermissions result = apiInstance.adminSubscriptionsUpdatePermissions(id, permissionsVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminSubscriptionsApi#adminSubscriptionsUpdatePermissions");
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
 **id** | **String**| subscription id |
 **permissionsVM** | [**SubscriptionPermissions**](SubscriptionPermissions.md)| permissions VM | [optional]

### Return type

[**SubscriptionPermissions**](SubscriptionPermissions.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |


## adminSubscriptionsUpdateSubscription

> AdminSubscriptionVM adminSubscriptionsUpdateSubscription(id, viewModel)

Update the subscription by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminSubscriptionsApi;

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

        AdminSubscriptionsApi apiInstance = new AdminSubscriptionsApi(defaultClient);
        String id = "id_example"; // String | Identifier of subscription
        UpdateSubscriptionVM viewModel = new UpdateSubscriptionVM(); // UpdateSubscriptionVM | View model
        try {
            AdminSubscriptionVM result = apiInstance.adminSubscriptionsUpdateSubscription(id, viewModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminSubscriptionsApi#adminSubscriptionsUpdateSubscription");
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
 **id** | **String**| Identifier of subscription |
 **viewModel** | [**UpdateSubscriptionVM**](UpdateSubscriptionVM.md)| View model | [optional]

### Return type

[**AdminSubscriptionVM**](AdminSubscriptionVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully updated |  -  |
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Subscription is not found |  -  |
| **500** | exception caught |  -  |

