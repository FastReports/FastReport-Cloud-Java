# UserSettingsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**userSettingsAcceptAgreements**](UserSettingsApi.md#userSettingsAcceptAgreements) | **POST** /api/manage/v1/UserSettings/accept | Use this endpoint to accept current version of service license agreement |
| [**userSettingsAcceptAgreementsWithHttpInfo**](UserSettingsApi.md#userSettingsAcceptAgreementsWithHttpInfo) | **POST** /api/manage/v1/UserSettings/accept | Use this endpoint to accept current version of service license agreement |
| [**userSettingsGetCurrentUserSettings**](UserSettingsApi.md#userSettingsGetCurrentUserSettings) | **GET** /api/manage/v1/UserSettings | Return current user settings. |
| [**userSettingsGetCurrentUserSettingsWithHttpInfo**](UserSettingsApi.md#userSettingsGetCurrentUserSettingsWithHttpInfo) | **GET** /api/manage/v1/UserSettings | Return current user settings. |
| [**userSettingsUpdateMySettings**](UserSettingsApi.md#userSettingsUpdateMySettings) | **PUT** /api/manage/v1/UserSettings | Update settings of the current user |
| [**userSettingsUpdateMySettingsWithHttpInfo**](UserSettingsApi.md#userSettingsUpdateMySettingsWithHttpInfo) | **PUT** /api/manage/v1/UserSettings | Update settings of the current user |



## userSettingsAcceptAgreements

> void userSettingsAcceptAgreements(acceptAgreementsVM)

Use this endpoint to accept current version of service license agreement

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.UserSettingsApi;

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

        UserSettingsApi apiInstance = new UserSettingsApi(defaultClient);
        AcceptAgreementsVM acceptAgreementsVM = new AcceptAgreementsVM(); // AcceptAgreementsVM | 
        try {
            apiInstance.userSettingsAcceptAgreements(acceptAgreementsVM);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserSettingsApi#userSettingsAcceptAgreements");
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
| **acceptAgreementsVM** | [**AcceptAgreementsVM**](AcceptAgreementsVM.md)|  | [optional] |

### Return type


null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

## userSettingsAcceptAgreementsWithHttpInfo

> ApiResponse<Void> userSettingsAcceptAgreements userSettingsAcceptAgreementsWithHttpInfo(acceptAgreementsVM)

Use this endpoint to accept current version of service license agreement

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.UserSettingsApi;

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

        UserSettingsApi apiInstance = new UserSettingsApi(defaultClient);
        AcceptAgreementsVM acceptAgreementsVM = new AcceptAgreementsVM(); // AcceptAgreementsVM | 
        try {
            ApiResponse<Void> response = apiInstance.userSettingsAcceptAgreementsWithHttpInfo(acceptAgreementsVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserSettingsApi#userSettingsAcceptAgreements");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **acceptAgreementsVM** | [**AcceptAgreementsVM**](AcceptAgreementsVM.md)|  | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |


## userSettingsGetCurrentUserSettings

> UserSettingsVM userSettingsGetCurrentUserSettings()

Return current user settings.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.UserSettingsApi;

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

        UserSettingsApi apiInstance = new UserSettingsApi(defaultClient);
        try {
            UserSettingsVM result = apiInstance.userSettingsGetCurrentUserSettings();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserSettingsApi#userSettingsGetCurrentUserSettings");
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

[**UserSettingsVM**](UserSettingsVM.md)


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully returned |  -  |
| **404** | User not found |  -  |

## userSettingsGetCurrentUserSettingsWithHttpInfo

> ApiResponse<UserSettingsVM> userSettingsGetCurrentUserSettings userSettingsGetCurrentUserSettingsWithHttpInfo()

Return current user settings.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.UserSettingsApi;

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

        UserSettingsApi apiInstance = new UserSettingsApi(defaultClient);
        try {
            ApiResponse<UserSettingsVM> response = apiInstance.userSettingsGetCurrentUserSettingsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserSettingsApi#userSettingsGetCurrentUserSettings");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**UserSettingsVM**](UserSettingsVM.md)>


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully returned |  -  |
| **404** | User not found |  -  |


## userSettingsUpdateMySettings

> UserSettingsVM userSettingsUpdateMySettings(updateUserSettingsVM)

Update settings of the current user

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.UserSettingsApi;

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

        UserSettingsApi apiInstance = new UserSettingsApi(defaultClient);
        UpdateUserSettingsVM updateUserSettingsVM = new UpdateUserSettingsVM(); // UpdateUserSettingsVM | 
        try {
            UserSettingsVM result = apiInstance.userSettingsUpdateMySettings(updateUserSettingsVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserSettingsApi#userSettingsUpdateMySettings");
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
| **updateUserSettingsVM** | [**UpdateUserSettingsVM**](UpdateUserSettingsVM.md)|  | [optional] |

### Return type

[**UserSettingsVM**](UserSettingsVM.md)


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully updated |  -  |
| **400** | The reqeust is wrong |  -  |
| **403** | Forbidden |  -  |

## userSettingsUpdateMySettingsWithHttpInfo

> ApiResponse<UserSettingsVM> userSettingsUpdateMySettings userSettingsUpdateMySettingsWithHttpInfo(updateUserSettingsVM)

Update settings of the current user

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.UserSettingsApi;

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

        UserSettingsApi apiInstance = new UserSettingsApi(defaultClient);
        UpdateUserSettingsVM updateUserSettingsVM = new UpdateUserSettingsVM(); // UpdateUserSettingsVM | 
        try {
            ApiResponse<UserSettingsVM> response = apiInstance.userSettingsUpdateMySettingsWithHttpInfo(updateUserSettingsVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserSettingsApi#userSettingsUpdateMySettings");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateUserSettingsVM** | [**UpdateUserSettingsVM**](UpdateUserSettingsVM.md)|  | [optional] |

### Return type

ApiResponse<[**UserSettingsVM**](UserSettingsVM.md)>


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully updated |  -  |
| **400** | The reqeust is wrong |  -  |
| **403** | Forbidden |  -  |

