# SubscriptionsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**subscriptionsGetDefaultPermissions**](SubscriptionsApi.md#subscriptionsGetDefaultPermissions) | **GET** /api/manage/v1/Subscriptions/{subscriptionId}/defaultPermissions | Get subscription&#39;s default permissions for new entities
[**subscriptionsGetPermissions**](SubscriptionsApi.md#subscriptionsGetPermissions) | **GET** /api/manage/v1/Subscriptions/{id}/permissions | Get permissions for a subscription by id
[**subscriptionsGetSubscription**](SubscriptionsApi.md#subscriptionsGetSubscription) | **GET** /api/manage/v1/Subscriptions/{id} | Returns the subscription by id
[**subscriptionsGetSubscriptions**](SubscriptionsApi.md#subscriptionsGetSubscriptions) | **GET** /api/manage/v1/Subscriptions | Returns a list of all subscriptions of current user
[**subscriptionsRenameSubscription**](SubscriptionsApi.md#subscriptionsRenameSubscription) | **PUT** /api/manage/v1/Subscriptions/{subscriptionId}/rename | Rename subscription
[**subscriptionsUpdateDefaultPermissions**](SubscriptionsApi.md#subscriptionsUpdateDefaultPermissions) | **PUT** /api/manage/v1/Subscriptions/{subscriptionId}/defaultPermissions | Change subscription&#39;s default permissions for new entities
[**subscriptionsUpdateLocale**](SubscriptionsApi.md#subscriptionsUpdateLocale) | **PUT** /api/manage/v1/Subscriptions/{subscriptionId}/Locale | Update subscription&#39;s default locale
[**subscriptionsUpdatePermissions**](SubscriptionsApi.md#subscriptionsUpdatePermissions) | **POST** /api/manage/v1/Subscriptions/{id}/permissions | Update permissions



## subscriptionsGetDefaultPermissions

> DefaultPermissions subscriptionsGetDefaultPermissions(subscriptionId)

Get subscription&#39;s default permissions for new entities

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.SubscriptionsApi;

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

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | id
        try {
            DefaultPermissions result = apiInstance.subscriptionsGetDefaultPermissions(subscriptionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionsGetDefaultPermissions");
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
 **subscriptionId** | **String**| id |

### Return type

[**DefaultPermissions**](DefaultPermissions.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully returned |  -  |
| **400** | Request is wrong |  -  |
| **402** | subscription is outdated |  -  |
| **403** | Not enough permissions |  -  |
| **404** | there is no subscription with such id |  -  |


## subscriptionsGetPermissions

> SubscriptionPermissionsVM subscriptionsGetPermissions(id)

Get permissions for a subscription by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.SubscriptionsApi;

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

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            SubscriptionPermissionsVM result = apiInstance.subscriptionsGetPermissions(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionsGetPermissions");
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

[**SubscriptionPermissionsVM**](SubscriptionPermissionsVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully returned |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |


## subscriptionsGetSubscription

> SubscriptionVM subscriptionsGetSubscription(id)

Returns the subscription by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.SubscriptionsApi;

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

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        String id = "id_example"; // String | Identifier of subscription
        try {
            SubscriptionVM result = apiInstance.subscriptionsGetSubscription(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionsGetSubscription");
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

[**SubscriptionVM**](SubscriptionVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully returned |  -  |
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Subscription is not found |  -  |


## subscriptionsGetSubscriptions

> SubscriptionsVM subscriptionsGetSubscriptions(skip, take)

Returns a list of all subscriptions of current user

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.SubscriptionsApi;

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

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        Integer skip = 0; // Integer | Variable for pagination, defautl value is 0
        Integer take = 10; // Integer | Variable for pagination, default value is 10
        try {
            SubscriptionsVM result = apiInstance.subscriptionsGetSubscriptions(skip, take);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionsGetSubscriptions");
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

[**SubscriptionsVM**](SubscriptionsVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully returned |  -  |
| **400** | unrealistic skip &#39;n take provided |  -  |


## subscriptionsRenameSubscription

> SubscriptionVM subscriptionsRenameSubscription(subscriptionId, renameSubscriptionVM)

Rename subscription

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.SubscriptionsApi;

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

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | id
        RenameSubscriptionVM renameSubscriptionVM = new RenameSubscriptionVM(); // RenameSubscriptionVM | rename VM
        try {
            SubscriptionVM result = apiInstance.subscriptionsRenameSubscription(subscriptionId, renameSubscriptionVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionsRenameSubscription");
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
 **subscriptionId** | **String**| id |
 **renameSubscriptionVM** | [**RenameSubscriptionVM**](RenameSubscriptionVM.md)| rename VM |

### Return type

[**SubscriptionVM**](SubscriptionVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully renamed |  -  |
| **400** | Request is wrong |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | Not enough permissions |  -  |
| **404** | there is no subscription with such id (or user have no permission) |  -  |


## subscriptionsUpdateDefaultPermissions

> DefaultPermissionsVM subscriptionsUpdateDefaultPermissions(subscriptionId, permissionsVM)

Change subscription&#39;s default permissions for new entities

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.SubscriptionsApi;

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

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | id
        UpdateDefaultPermissionsVM permissionsVM = new UpdateDefaultPermissionsVM(); // UpdateDefaultPermissionsVM | update default permissions VM
        try {
            DefaultPermissionsVM result = apiInstance.subscriptionsUpdateDefaultPermissions(subscriptionId, permissionsVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionsUpdateDefaultPermissions");
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
 **subscriptionId** | **String**| id |
 **permissionsVM** | [**UpdateDefaultPermissionsVM**](UpdateDefaultPermissionsVM.md)| update default permissions VM |

### Return type

[**DefaultPermissionsVM**](DefaultPermissionsVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully changed |  -  |
| **400** | Request is wrong |  -  |
| **402** | subscription is outdated |  -  |
| **403** | Not enough permissions |  -  |
| **404** | there is no subscription with such id |  -  |


## subscriptionsUpdateLocale

> SubscriptionVM subscriptionsUpdateLocale(subscriptionId, updateModel)

Update subscription&#39;s default locale

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.SubscriptionsApi;

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

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | id
        UpdateSubscriptionLocaleVM updateModel = new UpdateSubscriptionLocaleVM(); // UpdateSubscriptionLocaleVM | update VM
        try {
            SubscriptionVM result = apiInstance.subscriptionsUpdateLocale(subscriptionId, updateModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionsUpdateLocale");
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
 **subscriptionId** | **String**| id |
 **updateModel** | [**UpdateSubscriptionLocaleVM**](UpdateSubscriptionLocaleVM.md)| update VM |

### Return type

[**SubscriptionVM**](SubscriptionVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully renamed |  -  |
| **400** | Request is wrong |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | Not enough permissions |  -  |
| **404** | there is no subscription with such id (or user have no permission) |  -  |


## subscriptionsUpdatePermissions

> subscriptionsUpdatePermissions(id, permissionsVM)

Update permissions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.SubscriptionsApi;

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

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        String id = "id_example"; // String | 
        UpdateSubscriptionPermissionsVM permissionsVM = new UpdateSubscriptionPermissionsVM(); // UpdateSubscriptionPermissionsVM | 
        try {
            apiInstance.subscriptionsUpdatePermissions(id, permissionsVM);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionsUpdatePermissions");
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
 **permissionsVM** | [**UpdateSubscriptionPermissionsVM**](UpdateSubscriptionPermissionsVM.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |

