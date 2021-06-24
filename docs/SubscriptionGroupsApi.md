# SubscriptionGroupsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**subscriptionGroupsGetGroupsList**](SubscriptionGroupsApi.md#subscriptionGroupsGetGroupsList) | **GET** /api/manage/v1/Subscriptions/{subscriptionId}/groups | returns groups of the subscription or subscription user



## subscriptionGroupsGetGroupsList

> GroupsVM subscriptionGroupsGetGroupsList(subscriptionId, userId)

returns groups of the subscription or subscription user

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.SubscriptionGroupsApi;

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

        SubscriptionGroupsApi apiInstance = new SubscriptionGroupsApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | subscripiton id
        String userId = "userId_example"; // String | user Id (optional)
        try {
            GroupsVM result = apiInstance.subscriptionGroupsGetGroupsList(subscriptionId, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionGroupsApi#subscriptionGroupsGetGroupsList");
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
 **subscriptionId** | **String**| subscripiton id |
 **userId** | **String**| user Id (optional) | [optional]

### Return type

[**GroupsVM**](GroupsVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Everything is all right (list of groups may be empty) |  -  |
| **400** | id is not hex24 |  -  |
| **403** | You don&#39;t have permisison to get groups from this subscription (or in your default (1st) subscription) |  -  |
| **404** | there is no subscription with provided id found, or user don&#39;t even have a subscription |  -  |

