# AdminSubscriptionPlansApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminSubscriptionPlansCreateSubscriptionPlan**](AdminSubscriptionPlansApi.md#adminSubscriptionPlansCreateSubscriptionPlan) | **POST** /api/admin/v1/SubscriptionPlans | Create a new subscription plan, returns a new model
[**adminSubscriptionPlansDeleteSubscriptionPlan**](AdminSubscriptionPlansApi.md#adminSubscriptionPlansDeleteSubscriptionPlan) | **DELETE** /api/admin/v1/SubscriptionPlans/{id} | Delete a subscription plan.
[**adminSubscriptionPlansGetSubscriptionPlan**](AdminSubscriptionPlansApi.md#adminSubscriptionPlansGetSubscriptionPlan) | **GET** /api/admin/v1/SubscriptionPlans/{id} | Returns a subscription plan. Not all subscriptions can be issued for customer.
[**adminSubscriptionPlansGetSubscriptionPlans**](AdminSubscriptionPlansApi.md#adminSubscriptionPlansGetSubscriptionPlans) | **GET** /api/admin/v1/SubscriptionPlans | Returns a list of active subscription plans that can be issued to the user.
[**adminSubscriptionPlansUpdateSubscriptionPlan**](AdminSubscriptionPlansApi.md#adminSubscriptionPlansUpdateSubscriptionPlan) | **PUT** /api/admin/v1/SubscriptionPlans/{id} | Update a subscription plan.



## adminSubscriptionPlansCreateSubscriptionPlan

> SubscriptionPlanVM adminSubscriptionPlansCreateSubscriptionPlan(viewModel)

Create a new subscription plan, returns a new model

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminSubscriptionPlansApi;

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

        AdminSubscriptionPlansApi apiInstance = new AdminSubscriptionPlansApi(defaultClient);
        CreateSubscriptionPlanVM viewModel = new CreateSubscriptionPlanVM(); // CreateSubscriptionPlanVM | 
        try {
            SubscriptionPlanVM result = apiInstance.adminSubscriptionPlansCreateSubscriptionPlan(viewModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminSubscriptionPlansApi#adminSubscriptionPlansCreateSubscriptionPlan");
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
 **viewModel** | [**CreateSubscriptionPlanVM**](CreateSubscriptionPlanVM.md)|  | [optional]

### Return type

[**SubscriptionPlanVM**](SubscriptionPlanVM.md)

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
| **500** | exception caught |  -  |


## adminSubscriptionPlansDeleteSubscriptionPlan

> adminSubscriptionPlansDeleteSubscriptionPlan(id)

Delete a subscription plan.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminSubscriptionPlansApi;

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

        AdminSubscriptionPlansApi apiInstance = new AdminSubscriptionPlansApi(defaultClient);
        String id = "id_example"; // String | Identifier of subsctiption plan
        try {
            apiInstance.adminSubscriptionPlansDeleteSubscriptionPlan(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminSubscriptionPlansApi#adminSubscriptionPlansDeleteSubscriptionPlan");
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
| **404** | Subscription plan with this id is not found |  -  |
| **500** | exception caught |  -  |


## adminSubscriptionPlansGetSubscriptionPlan

> SubscriptionPlanVM adminSubscriptionPlansGetSubscriptionPlan(id)

Returns a subscription plan. Not all subscriptions can be issued for customer.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminSubscriptionPlansApi;

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

        AdminSubscriptionPlansApi apiInstance = new AdminSubscriptionPlansApi(defaultClient);
        String id = "id_example"; // String | Identifier of subsctiption plan
        try {
            SubscriptionPlanVM result = apiInstance.adminSubscriptionPlansGetSubscriptionPlan(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminSubscriptionPlansApi#adminSubscriptionPlansGetSubscriptionPlan");
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
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Subscription plan with this id is not found |  -  |
| **500** | exception caught |  -  |


## adminSubscriptionPlansGetSubscriptionPlans

> SubscriptionPlansVM adminSubscriptionPlansGetSubscriptionPlans(skip, take)

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
import cloud.fastreport.client.AdminSubscriptionPlansApi;

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

        AdminSubscriptionPlansApi apiInstance = new AdminSubscriptionPlansApi(defaultClient);
        Integer skip = 0; // Integer | Variable for pagination, defautl value is 0
        Integer take = 10; // Integer | Variable for pagination, default value is 10
        try {
            SubscriptionPlansVM result = apiInstance.adminSubscriptionPlansGetSubscriptionPlans(skip, take);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminSubscriptionPlansApi#adminSubscriptionPlansGetSubscriptionPlans");
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
| **403** | You don&#39;t have rights for the operation |  -  |


## adminSubscriptionPlansUpdateSubscriptionPlan

> SubscriptionPlanVM adminSubscriptionPlansUpdateSubscriptionPlan(id, viewModel)

Update a subscription plan.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminSubscriptionPlansApi;

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

        AdminSubscriptionPlansApi apiInstance = new AdminSubscriptionPlansApi(defaultClient);
        String id = "id_example"; // String | Identifier of subsctiption plan
        UpdateSubscriptionPlanVM viewModel = new UpdateSubscriptionPlanVM(); // UpdateSubscriptionPlanVM | Update VM
        try {
            SubscriptionPlanVM result = apiInstance.adminSubscriptionPlansUpdateSubscriptionPlan(id, viewModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminSubscriptionPlansApi#adminSubscriptionPlansUpdateSubscriptionPlan");
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
 **viewModel** | [**UpdateSubscriptionPlanVM**](UpdateSubscriptionPlanVM.md)| Update VM | [optional]

### Return type

[**SubscriptionPlanVM**](SubscriptionPlanVM.md)

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
| **404** | Subscription plan with this id is not found |  -  |
| **500** | exception caught |  -  |

