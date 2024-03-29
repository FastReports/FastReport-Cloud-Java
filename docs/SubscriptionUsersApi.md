# SubscriptionUsersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**subscriptionUsersAddUser**](SubscriptionUsersApi.md#subscriptionUsersAddUser) | **PUT** /api/manage/v1/Subscriptions/{subscriptionId}/users/{userId} | Add a user to the subscription,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription. |
| [**subscriptionUsersCountUsersAsync**](SubscriptionUsersApi.md#subscriptionUsersCountUsersAsync) | **GET** /api/manage/v1/Subscriptions/{subscriptionId}/UsersCount | Returns a number of users in subscription |
| [**subscriptionUsersGetUsers**](SubscriptionUsersApi.md#subscriptionUsersGetUsers) | **GET** /api/manage/v1/Subscriptions/{subscriptionId}/users | Returns all users of subscription |
| [**subscriptionUsersLeaveSubscripiton**](SubscriptionUsersApi.md#subscriptionUsersLeaveSubscripiton) | **DELETE** /api/manage/v1/Subscriptions/{subscriptionId}/leave | Allows user to leave subscription,. |
| [**subscriptionUsersRemoveUser**](SubscriptionUsersApi.md#subscriptionUsersRemoveUser) | **DELETE** /api/manage/v1/Subscriptions/{subscriptionId}/users/{userId} | Delete a user from the subscription,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription. |


<a id="subscriptionUsersAddUser"></a>
# **subscriptionUsersAddUser**
> subscriptionUsersAddUser(subscriptionId, userId)

Add a user to the subscription,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.SubscriptionUsersApi;

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

    SubscriptionUsersApi apiInstance = new SubscriptionUsersApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | Idenitifier of subscription
    String userId = "userId_example"; // String | Idenitifier of user
    try {
      apiInstance.subscriptionUsersAddUser(subscriptionId, userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionUsersApi#subscriptionUsersAddUser");
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
| **subscriptionId** | **String**| Idenitifier of subscription | |
| **userId** | **String**| Idenitifier of user | |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Succesfully added |  -  |
| **400** | The reqeust is wrong |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Subscription or user is not found |  -  |
| **500** | Exception thrown |  -  |

<a id="subscriptionUsersCountUsersAsync"></a>
# **subscriptionUsersCountUsersAsync**
> Long subscriptionUsersCountUsersAsync(subscriptionId)

Returns a number of users in subscription

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.SubscriptionUsersApi;

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

    SubscriptionUsersApi apiInstance = new SubscriptionUsersApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | 
    try {
      Long result = apiInstance.subscriptionUsersCountUsersAsync(subscriptionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionUsersApi#subscriptionUsersCountUsersAsync");
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
| **subscriptionId** | **String**|  | |

### Return type

**Long**

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
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Subscription is not found |  -  |
| **500** | Exception thrown |  -  |

<a id="subscriptionUsersGetUsers"></a>
# **subscriptionUsersGetUsers**
> SubscriptionUsersVM subscriptionUsersGetUsers(subscriptionId, skip, take)

Returns all users of subscription

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.SubscriptionUsersApi;

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

    SubscriptionUsersApi apiInstance = new SubscriptionUsersApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | Idenitifier of subscription
    Integer skip = 0; // Integer | How many entities skip
    Integer take = 10; // Integer | How many entities take
    try {
      SubscriptionUsersVM result = apiInstance.subscriptionUsersGetUsers(subscriptionId, skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionUsersApi#subscriptionUsersGetUsers");
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
| **subscriptionId** | **String**| Idenitifier of subscription | |
| **skip** | **Integer**| How many entities skip | [optional] [default to 0] |
| **take** | **Integer**| How many entities take | [optional] [default to 10] |

### Return type

[**SubscriptionUsersVM**](SubscriptionUsersVM.md)

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
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Subscription is not found |  -  |
| **500** | Exception thrown |  -  |

<a id="subscriptionUsersLeaveSubscripiton"></a>
# **subscriptionUsersLeaveSubscripiton**
> subscriptionUsersLeaveSubscripiton(subscriptionId)

Allows user to leave subscription,.

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.SubscriptionUsersApi;

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

    SubscriptionUsersApi apiInstance = new SubscriptionUsersApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | Idenitifier of subscription
    try {
      apiInstance.subscriptionUsersLeaveSubscripiton(subscriptionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionUsersApi#subscriptionUsersLeaveSubscripiton");
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
| **subscriptionId** | **String**| Idenitifier of subscription | |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Succesfully deleted |  -  |
| **400** | The reqeust is wrong |  -  |
| **401** | User is unauthorized |  -  |
| **402** | Subscription id outdated |  -  |
| **404** | Subscription or user is not found |  -  |
| **500** | Exception thrown |  -  |

<a id="subscriptionUsersRemoveUser"></a>
# **subscriptionUsersRemoveUser**
> subscriptionUsersRemoveUser(subscriptionId, userId)

Delete a user from the subscription,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.SubscriptionUsersApi;

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

    SubscriptionUsersApi apiInstance = new SubscriptionUsersApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | Idenitifier of subscription
    String userId = "userId_example"; // String | Idenitifier of user
    try {
      apiInstance.subscriptionUsersRemoveUser(subscriptionId, userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionUsersApi#subscriptionUsersRemoveUser");
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
| **subscriptionId** | **String**| Idenitifier of subscription | |
| **userId** | **String**| Idenitifier of user | |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Succesfully deleted |  -  |
| **400** | The reqeust is wrong |  -  |
| **402** | Subscription id outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Subscription or user is not found |  -  |
| **500** | Exception thrown |  -  |

