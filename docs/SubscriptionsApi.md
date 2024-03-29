# SubscriptionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**subscriptionsGetDefaultPermissions**](SubscriptionsApi.md#subscriptionsGetDefaultPermissions) | **GET** /api/manage/v1/Subscriptions/{subscriptionId}/defaultPermissions | Get subscription&#39;s default permissions for new entities |
| [**subscriptionsGetMyPermissions**](SubscriptionsApi.md#subscriptionsGetMyPermissions) | **GET** /api/manage/v1/Subscriptions/{subId}/mypermissions | Get user&#39;s permissions for a subscription by id |
| [**subscriptionsGetPermissions**](SubscriptionsApi.md#subscriptionsGetPermissions) | **GET** /api/manage/v1/Subscriptions/{id}/permissions | Get permissions for a subscription by id |
| [**subscriptionsGetSubscription**](SubscriptionsApi.md#subscriptionsGetSubscription) | **GET** /api/manage/v1/Subscriptions/{id} | Returns the subscription by id |
| [**subscriptionsGetSubscriptions**](SubscriptionsApi.md#subscriptionsGetSubscriptions) | **GET** /api/manage/v1/Subscriptions | Returns a list of all subscriptions of current user |
| [**subscriptionsRenameSubscription**](SubscriptionsApi.md#subscriptionsRenameSubscription) | **PUT** /api/manage/v1/Subscriptions/{subscriptionId}/rename | Rename subscription |
| [**subscriptionsUpdateDefaultPermissions**](SubscriptionsApi.md#subscriptionsUpdateDefaultPermissions) | **PUT** /api/manage/v1/Subscriptions/{subscriptionId}/defaultPermissions | Change subscription&#39;s default permissions for new entities |
| [**subscriptionsUpdateLocale**](SubscriptionsApi.md#subscriptionsUpdateLocale) | **PUT** /api/manage/v1/Subscriptions/{subscriptionId}/Locale | Update subscription&#39;s default locale |
| [**subscriptionsUpdatePermissions**](SubscriptionsApi.md#subscriptionsUpdatePermissions) | **POST** /api/manage/v1/Subscriptions/{id}/permissions | Update permissions |


<a id="subscriptionsGetDefaultPermissions"></a>
# **subscriptionsGetDefaultPermissions**
> DefaultPermissionsVM subscriptionsGetDefaultPermissions(subscriptionId)

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

    // Configure HTTP bearer authorization: JWT
    HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
    JWT.setBearerToken("BEARER TOKEN");

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | id
    try {
      DefaultPermissionsVM result = apiInstance.subscriptionsGetDefaultPermissions(subscriptionId);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **subscriptionId** | **String**| id | |

### Return type

[**DefaultPermissionsVM**](DefaultPermissionsVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully returned |  -  |
| **400** | Request is wrong |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | Not enough permissions |  -  |
| **404** | There is no subscription with such id |  -  |

<a id="subscriptionsGetMyPermissions"></a>
# **subscriptionsGetMyPermissions**
> MyPermissionsVM subscriptionsGetMyPermissions(subId)

Get user&#39;s permissions for a subscription by id

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

    // Configure HTTP bearer authorization: JWT
    HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
    JWT.setBearerToken("BEARER TOKEN");

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    String subId = "subId_example"; // String | subscription id
    try {
      MyPermissionsVM result = apiInstance.subscriptionsGetMyPermissions(subId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#subscriptionsGetMyPermissions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **subId** | **String**| subscription id | |

### Return type

[**MyPermissionsVM**](MyPermissionsVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully returned |  -  |

<a id="subscriptionsGetPermissions"></a>
# **subscriptionsGetPermissions**
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

    // Configure HTTP bearer authorization: JWT
    HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
    JWT.setBearerToken("BEARER TOKEN");

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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**SubscriptionPermissionsVM**](SubscriptionPermissionsVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully returned |  -  |
| **400** | Request is wrong |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | Not enough permissions |  -  |
| **404** | There is no subscription with such id |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="subscriptionsGetSubscription"></a>
# **subscriptionsGetSubscription**
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

    // Configure HTTP bearer authorization: JWT
    HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
    JWT.setBearerToken("BEARER TOKEN");

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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Identifier of subscription | |

### Return type

[**SubscriptionVM**](SubscriptionVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully returned |  -  |
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Subscription is not found |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="subscriptionsGetSubscriptions"></a>
# **subscriptionsGetSubscriptions**
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

    // Configure HTTP bearer authorization: JWT
    HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
    JWT.setBearerToken("BEARER TOKEN");

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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **skip** | **Integer**| Variable for pagination, defautl value is 0 | [optional] [default to 0] |
| **take** | **Integer**| Variable for pagination, default value is 10 | [optional] [default to 10] |

### Return type

[**SubscriptionsVM**](SubscriptionsVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully returned |  -  |
| **400** | unrealistic skip &#39;n take provided |  -  |

<a id="subscriptionsRenameSubscription"></a>
# **subscriptionsRenameSubscription**
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

    // Configure HTTP bearer authorization: JWT
    HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
    JWT.setBearerToken("BEARER TOKEN");

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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **subscriptionId** | **String**| id | |
| **renameSubscriptionVM** | [**RenameSubscriptionVM**](RenameSubscriptionVM.md)| rename VM | |

### Return type

[**SubscriptionVM**](SubscriptionVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully renamed |  -  |
| **400** | Request is wrong |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | Not enough permissions |  -  |
| **404** | There is no subscription with such id (or user have no permission) |  -  |

<a id="subscriptionsUpdateDefaultPermissions"></a>
# **subscriptionsUpdateDefaultPermissions**
> DefaultPermissionsVM subscriptionsUpdateDefaultPermissions(subscriptionId, updateDefaultPermissionsVM)

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

    // Configure HTTP bearer authorization: JWT
    HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
    JWT.setBearerToken("BEARER TOKEN");

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | id
    UpdateDefaultPermissionsVM updateDefaultPermissionsVM = new UpdateDefaultPermissionsVM(); // UpdateDefaultPermissionsVM | update default permissions VM
    try {
      DefaultPermissionsVM result = apiInstance.subscriptionsUpdateDefaultPermissions(subscriptionId, updateDefaultPermissionsVM);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **subscriptionId** | **String**| id | |
| **updateDefaultPermissionsVM** | [**UpdateDefaultPermissionsVM**](UpdateDefaultPermissionsVM.md)| update default permissions VM | |

### Return type

[**DefaultPermissionsVM**](DefaultPermissionsVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully changed |  -  |
| **400** | Request is wrong |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | Not enough permissions |  -  |
| **404** | There is no subscription with such id |  -  |

<a id="subscriptionsUpdateLocale"></a>
# **subscriptionsUpdateLocale**
> SubscriptionVM subscriptionsUpdateLocale(subscriptionId, updateSubscriptionLocaleVM)

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

    // Configure HTTP bearer authorization: JWT
    HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
    JWT.setBearerToken("BEARER TOKEN");

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | id
    UpdateSubscriptionLocaleVM updateSubscriptionLocaleVM = new UpdateSubscriptionLocaleVM(); // UpdateSubscriptionLocaleVM | update VM
    try {
      SubscriptionVM result = apiInstance.subscriptionsUpdateLocale(subscriptionId, updateSubscriptionLocaleVM);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **subscriptionId** | **String**| id | |
| **updateSubscriptionLocaleVM** | [**UpdateSubscriptionLocaleVM**](UpdateSubscriptionLocaleVM.md)| update VM | |

### Return type

[**SubscriptionVM**](SubscriptionVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully renamed |  -  |
| **400** | Request is wrong |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | Not enough permissions |  -  |
| **404** | There is no subscription with such id (or user have no permission) |  -  |

<a id="subscriptionsUpdatePermissions"></a>
# **subscriptionsUpdatePermissions**
> subscriptionsUpdatePermissions(id, updateSubscriptionPermissionsVM)

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

    // Configure HTTP bearer authorization: JWT
    HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
    JWT.setBearerToken("BEARER TOKEN");

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    String id = "id_example"; // String | 
    UpdateSubscriptionPermissionsVM updateSubscriptionPermissionsVM = new UpdateSubscriptionPermissionsVM(); // UpdateSubscriptionPermissionsVM | 
    try {
      apiInstance.subscriptionsUpdatePermissions(id, updateSubscriptionPermissionsVM);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **updateSubscriptionPermissionsVM** | [**UpdateSubscriptionPermissionsVM**](UpdateSubscriptionPermissionsVM.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Succesfully updated |  -  |
| **400** | Request is wrong |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | Not enough permissions |  -  |
| **404** | There is no subscription with such id |  -  |
| **500** | Try again, if error still here - text our support |  -  |

