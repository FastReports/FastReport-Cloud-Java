# SubscriptionInvitesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**subscriptionInvitesAcceptInvite**](SubscriptionInvitesApi.md#subscriptionInvitesAcceptInvite) | **GET** /api/manage/v1/Subscriptions/{subscriptionId}/invite/{accessToken}/accept | Add a user to the subscription using invite,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.
[**subscriptionInvitesCreateInvite**](SubscriptionInvitesApi.md#subscriptionInvitesCreateInvite) | **POST** /api/manage/v1/Subscriptions/{subscriptionId}/invite | Create invite to subscription
[**subscriptionInvitesDeleteInvite**](SubscriptionInvitesApi.md#subscriptionInvitesDeleteInvite) | **DELETE** /api/manage/v1/Subscriptions/{subscriptionId}/invite/{accesstoken} | Rename subscription
[**subscriptionInvitesGetInvites**](SubscriptionInvitesApi.md#subscriptionInvitesGetInvites) | **GET** /api/manage/v1/Subscriptions/{subscriptionId}/invites | Get list of invites in a subscription,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.



## subscriptionInvitesAcceptInvite

> subscriptionInvitesAcceptInvite(subscriptionId, accessToken)

Add a user to the subscription using invite,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.SubscriptionInvitesApi;

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

        SubscriptionInvitesApi apiInstance = new SubscriptionInvitesApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | Idenitifier of subscription
        String accessToken = "accessToken_example"; // String | access token of the subscription
        try {
            apiInstance.subscriptionInvitesAcceptInvite(subscriptionId, accessToken);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionInvitesApi#subscriptionInvitesAcceptInvite");
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
 **subscriptionId** | **String**| Idenitifier of subscription |
 **accessToken** | **String**| access token of the subscription |

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
| **200** | Succesfully added |  -  |
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Subscription or user is not found |  -  |
| **500** | Exception thrown |  -  |


## subscriptionInvitesCreateInvite

> SubscriptionVM subscriptionInvitesCreateInvite(subscriptionId, createInviteVM)

Create invite to subscription

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.SubscriptionInvitesApi;

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

        SubscriptionInvitesApi apiInstance = new SubscriptionInvitesApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | id
        CreateSubscriptionInviteVM createInviteVM = new CreateSubscriptionInviteVM(); // CreateSubscriptionInviteVM | create VM
        try {
            SubscriptionVM result = apiInstance.subscriptionInvitesCreateInvite(subscriptionId, createInviteVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionInvitesApi#subscriptionInvitesCreateInvite");
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
 **createInviteVM** | [**CreateSubscriptionInviteVM**](CreateSubscriptionInviteVM.md)| create VM | [optional]

### Return type

[**SubscriptionVM**](SubscriptionVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully created |  -  |
| **400** | Request is wrong |  -  |
| **402** | subscription is outdated |  -  |
| **403** | Not enough permissions |  -  |
| **404** | there is no subscription with such id |  -  |
| **500** | exception caught |  -  |


## subscriptionInvitesDeleteInvite

> subscriptionInvitesDeleteInvite(subscriptionId, accesstoken)

Rename subscription

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.SubscriptionInvitesApi;

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

        SubscriptionInvitesApi apiInstance = new SubscriptionInvitesApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | id
        String accesstoken = "accesstoken_example"; // String | invite's token
        try {
            apiInstance.subscriptionInvitesDeleteInvite(subscriptionId, accesstoken);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionInvitesApi#subscriptionInvitesDeleteInvite");
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
 **accesstoken** | **String**| invite&#39;s token |

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
| **204** | Successfully deleted |  -  |
| **400** | Request is wrong |  -  |
| **402** | subscription is outdated |  -  |
| **403** | Not enough permissions |  -  |
| **404** | there is no subscription with such id |  -  |
| **500** | exception caught |  -  |


## subscriptionInvitesGetInvites

> SubscriptionInvitesVM subscriptionInvitesGetInvites(subscriptionId)

Get list of invites in a subscription,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.SubscriptionInvitesApi;

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

        SubscriptionInvitesApi apiInstance = new SubscriptionInvitesApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | Idenitifier of subscription
        try {
            SubscriptionInvitesVM result = apiInstance.subscriptionInvitesGetInvites(subscriptionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionInvitesApi#subscriptionInvitesGetInvites");
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
 **subscriptionId** | **String**| Idenitifier of subscription |

### Return type

[**SubscriptionInvitesVM**](SubscriptionInvitesVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully added |  -  |
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Subscription or user is not found |  -  |
| **500** | Exception thrown |  -  |
