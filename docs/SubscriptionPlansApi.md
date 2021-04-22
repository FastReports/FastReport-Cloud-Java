# SubscriptionPlansApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**subscriptionPlansGetSubscriptionPlan**](SubscriptionPlansApi.md#subscriptionPlansGetSubscriptionPlan) | **GET** /api/manage/v1/SubscriptionPlans/{id} | Returns a subscription plan. Not all subscriptions can be issued for customer.
[**subscriptionPlansGetSubscriptionPlans**](SubscriptionPlansApi.md#subscriptionPlansGetSubscriptionPlans) | **GET** /api/manage/v1/SubscriptionPlans | Returns a list of active subscription plans that can be issued to the user.



## subscriptionPlansGetSubscriptionPlan

> SubscriptionPlanVM subscriptionPlansGetSubscriptionPlan(id)

Returns a subscription plan. Not all subscriptions can be issued for customer.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.SubscriptionPlansApi;

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

        SubscriptionPlansApi apiInstance = new SubscriptionPlansApi(defaultClient);
        String id = "id_example"; // String | Identifier of subsctiption plan
        try {
            SubscriptionPlanVM result = apiInstance.subscriptionPlansGetSubscriptionPlan(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionPlansApi#subscriptionPlansGetSubscriptionPlan");
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
 **id** | **String**| Identifier of subsctiption plan |

### Return type

[**SubscriptionPlanVM**](SubscriptionPlanVM.md)

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
| **404** | Subscription plan with this id is not found |  -  |
| **500** | Exception thrown |  -  |


## subscriptionPlansGetSubscriptionPlans

> SubscriptionPlansVM subscriptionPlansGetSubscriptionPlans(skip, take)

Returns a list of active subscription plans that can be issued to the user.

If no active subscription plans, then the endpoint will return empty list

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.SubscriptionPlansApi;

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

        SubscriptionPlansApi apiInstance = new SubscriptionPlansApi(defaultClient);
        Integer skip = 0; // Integer | Variable for pagination, defautl value is 0
        Integer take = 10; // Integer | Variable for pagination, default value is 10
        try {
            SubscriptionPlansVM result = apiInstance.subscriptionPlansGetSubscriptionPlans(skip, take);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionPlansApi#subscriptionPlansGetSubscriptionPlans");
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

[**SubscriptionPlansVM**](SubscriptionPlansVM.md)

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

