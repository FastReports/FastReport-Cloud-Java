# UserNotificationsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**userNotificationsClearNotifications**](UserNotificationsApi.md#userNotificationsClearNotifications) | **DELETE** /api/manage/v1/notifications | Use this endpoint to \&quot;clear\&quot; your notifications |
| [**userNotificationsGetNotifications**](UserNotificationsApi.md#userNotificationsGetNotifications) | **GET** /api/manage/v1/notifications | Use this endpoint to recieve notifications |



## userNotificationsClearNotifications

> userNotificationsClearNotifications(clearNotificationsVM)

Use this endpoint to \&quot;clear\&quot; your notifications

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.UserNotificationsApi;

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

        UserNotificationsApi apiInstance = new UserNotificationsApi(defaultClient);
        ClearNotificationsVM clearNotificationsVM = new ClearNotificationsVM(); // ClearNotificationsVM | 
        try {
            apiInstance.userNotificationsClearNotifications(clearNotificationsVM);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserNotificationsApi#userNotificationsClearNotifications");
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
| **clearNotificationsVM** | [**ClearNotificationsVM**](ClearNotificationsVM.md)|  | [optional] |

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
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |


## userNotificationsGetNotifications

> AuditActionsVM userNotificationsGetNotifications(skip, take, subscriptionId)

Use this endpoint to recieve notifications

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.UserNotificationsApi;

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

        UserNotificationsApi apiInstance = new UserNotificationsApi(defaultClient);
        Integer skip = 0; // Integer | 
        Integer take = 5; // Integer | 
        String subscriptionId = ""; // String | 
        try {
            AuditActionsVM result = apiInstance.userNotificationsGetNotifications(skip, take, subscriptionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserNotificationsApi#userNotificationsGetNotifications");
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
| **skip** | **Integer**|  | [optional] [default to 0] |
| **take** | **Integer**|  | [optional] [default to 5] |
| **subscriptionId** | **String**|  | [optional] [default to ] |

### Return type

[**AuditActionsVM**](AuditActionsVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No Content |  -  |

