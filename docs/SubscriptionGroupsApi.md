# SubscriptionGroupsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**subscriptionGroupsGetGroupList**](SubscriptionGroupsApi.md#subscriptionGroupsGetGroupList) | **GET** /api/manage/v1/Subscriptions/{id}/groups | returns list of groups in the subscription



## subscriptionGroupsGetGroupList

> GroupsVM subscriptionGroupsGetGroupList(id)

returns list of groups in the subscription

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
        String id = "id_example"; // String | subscripiton id
        try {
            GroupsVM result = apiInstance.subscriptionGroupsGetGroupList(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionGroupsApi#subscriptionGroupsGetGroupList");
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
 **id** | **String**| subscripiton id |

### Return type

[**GroupsVM**](GroupsVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Everything is all right (list of groups may be empty) |  -  |
| **400** | id is not hex24 |  -  |
| **403** | You don&#39;t have permisison to get groups from this subscription (or in your default (1st) subscription) |  -  |
| **404** | there is no subscription with provided id found, or user don&#39;t even have a subscription |  -  |

