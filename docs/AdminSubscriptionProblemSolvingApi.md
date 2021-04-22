# AdminSubscriptionProblemSolvingApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminSubscriptionProblemSolvingSolveProblems**](AdminSubscriptionProblemSolvingApi.md#adminSubscriptionProblemSolvingSolveProblems) | **POST** /api/admin/v1/Analytics/Solve | Solve problems provided by FastReport.Cloud.Admin.Controllers.SubscriptionAnalyticsController



## adminSubscriptionProblemSolvingSolveProblems

> adminSubscriptionProblemSolvingSolveProblems(analysisResults)

Solve problems provided by FastReport.Cloud.Admin.Controllers.SubscriptionAnalyticsController

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminSubscriptionProblemSolvingApi;

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

        AdminSubscriptionProblemSolvingApi apiInstance = new AdminSubscriptionProblemSolvingApi(defaultClient);
        AnalysisResultsVM analysisResults = new AnalysisResultsVM(); // AnalysisResultsVM | 
        try {
            apiInstance.adminSubscriptionProblemSolvingSolveProblems(analysisResults);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminSubscriptionProblemSolvingApi#adminSubscriptionProblemSolvingSolveProblems");
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
 **analysisResults** | [**AnalysisResultsVM**](AnalysisResultsVM.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

