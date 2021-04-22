# AdminSubscriptionPeriodApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminSubscriptionPeriodRenewSubscription**](AdminSubscriptionPeriodApi.md#adminSubscriptionPeriodRenewSubscription) | **POST** /api/admin/v1/Subscriptions/{id}/Renew | Create a new subscripiton period, move current period to old



## adminSubscriptionPeriodRenewSubscription

> SubscriptionVM adminSubscriptionPeriodRenewSubscription(id, viewModel)

Create a new subscripiton period, move current period to old

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminSubscriptionPeriodApi;

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

        AdminSubscriptionPeriodApi apiInstance = new AdminSubscriptionPeriodApi(defaultClient);
        String id = "id_example"; // String | 
        CreateSubscriptionPeriodVM viewModel = new CreateSubscriptionPeriodVM(); // CreateSubscriptionPeriodVM | 
        try {
            SubscriptionVM result = apiInstance.adminSubscriptionPeriodRenewSubscription(id, viewModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminSubscriptionPeriodApi#adminSubscriptionPeriodRenewSubscription");
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
 **viewModel** | [**CreateSubscriptionPeriodVM**](CreateSubscriptionPeriodVM.md)|  | [optional]

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
| **200** | Succesfully created |  -  |
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Plan is not found |  -  |
| **500** | Exception caught while renewing |  -  |

