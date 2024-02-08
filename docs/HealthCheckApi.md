# HealthCheckApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**healthCheckDataGet**](HealthCheckApi.md#healthCheckDataGet) | **GET** /api/backend/v1/HealthCheck | healthcheck |


<a id="healthCheckDataGet"></a>
# **healthCheckDataGet**
> healthCheckDataGet()

healthcheck

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.HealthCheckApi;

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

    HealthCheckApi apiInstance = new HealthCheckApi(defaultClient);
    try {
      apiInstance.healthCheckDataGet();
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthCheckApi#healthCheckDataGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Our backend is alive! |  -  |

