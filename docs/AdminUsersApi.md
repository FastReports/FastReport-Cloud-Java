# AdminUsersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminUsersDeleteUser**](AdminUsersApi.md#adminUsersDeleteUser) | **DELETE** /api/admin/v1/Users/{id} | Delete a user from cloud database by id
[**adminUsersGetNewUsersPerMonth**](AdminUsersApi.md#adminUsersGetNewUsersPerMonth) | **GET** /api/admin/v1/Users/stat/new/{from}/{to} | Returns a key-value pair of new users count per month for a specified time span: (month, number of new users)
[**adminUsersGetUser**](AdminUsersApi.md#adminUsersGetUser) | **GET** /api/admin/v1/Users/{id} | Returns a user view model by id
[**adminUsersGetUsers**](AdminUsersApi.md#adminUsersGetUsers) | **GET** /api/admin/v1/Users | Returns a list of users
[**adminUsersRegisterUser**](AdminUsersApi.md#adminUsersRegisterUser) | **POST** /api/admin/v1/Users | Register a new user in the cloud with specified id, returns a new model
[**adminUsersUpdateUser**](AdminUsersApi.md#adminUsersUpdateUser) | **PUT** /api/admin/v1/Users/{id} | Update an user by id



## adminUsersDeleteUser

> adminUsersDeleteUser(id)

Delete a user from cloud database by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminUsersApi;

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

        AdminUsersApi apiInstance = new AdminUsersApi(defaultClient);
        String id = "id_example"; // String | Identifier of user
        try {
            apiInstance.adminUsersDeleteUser(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminUsersApi#adminUsersDeleteUser");
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
 **id** | **String**| Identifier of user |

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
| **204** | Succesfully obliterated |  -  |
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | User with this id is not found |  -  |
| **500** | exception caught |  -  |


## adminUsersGetNewUsersPerMonth

> Map&lt;String, Integer&gt; adminUsersGetNewUsersPerMonth(from, to)

Returns a key-value pair of new users count per month for a specified time span: (month, number of new users)

If no users, then the endpoint will return empty dic

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminUsersApi;

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

        AdminUsersApi apiInstance = new AdminUsersApi(defaultClient);
        OffsetDateTime from = OffsetDateTime.now(); // OffsetDateTime | A starting date for stats calculation
        OffsetDateTime to = OffsetDateTime.now(); // OffsetDateTime | An ending date for stats calculation
        try {
            Map<String, Integer> result = apiInstance.adminUsersGetNewUsersPerMonth(from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminUsersApi#adminUsersGetNewUsersPerMonth");
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
 **from** | **OffsetDateTime**| A starting date for stats calculation |
 **to** | **OffsetDateTime**| An ending date for stats calculation |

### Return type

**Map&lt;String, Integer&gt;**

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


## adminUsersGetUser

> UserVM adminUsersGetUser(id)

Returns a user view model by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminUsersApi;

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

        AdminUsersApi apiInstance = new AdminUsersApi(defaultClient);
        String id = "id_example"; // String | Identifier of user
        try {
            UserVM result = apiInstance.adminUsersGetUser(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminUsersApi#adminUsersGetUser");
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
 **id** | **String**| Identifier of user |

### Return type

[**UserVM**](UserVM.md)

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
| **404** | User with this id is not found |  -  |
| **500** | exception caught |  -  |


## adminUsersGetUsers

> UsersVM adminUsersGetUsers(skip, take)

Returns a list of users

If no users, then the endpoint will return empty list

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminUsersApi;

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

        AdminUsersApi apiInstance = new AdminUsersApi(defaultClient);
        Integer skip = 0; // Integer | Variable for pagination, defautl value is 0
        Integer take = 10; // Integer | Variable for pagination, default value is 10
        try {
            UsersVM result = apiInstance.adminUsersGetUsers(skip, take);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminUsersApi#adminUsersGetUsers");
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

[**UsersVM**](UsersVM.md)

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


## adminUsersRegisterUser

> UserVM adminUsersRegisterUser(viewModel)

Register a new user in the cloud with specified id, returns a new model

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminUsersApi;

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

        AdminUsersApi apiInstance = new AdminUsersApi(defaultClient);
        RegisterUserVM viewModel = new RegisterUserVM(); // RegisterUserVM | 
        try {
            UserVM result = apiInstance.adminUsersRegisterUser(viewModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminUsersApi#adminUsersRegisterUser");
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
 **viewModel** | [**RegisterUserVM**](RegisterUserVM.md)|  | [optional]

### Return type

[**UserVM**](UserVM.md)

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
| **404** | subscription not found |  -  |
| **500** | exception caught |  -  |


## adminUsersUpdateUser

> UserVM adminUsersUpdateUser(id, viewModel)

Update an user by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminUsersApi;

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

        AdminUsersApi apiInstance = new AdminUsersApi(defaultClient);
        String id = "id_example"; // String | Identifier of the user
        UpdateUserVM viewModel = new UpdateUserVM(); // UpdateUserVM | update VM
        try {
            UserVM result = apiInstance.adminUsersUpdateUser(id, viewModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminUsersApi#adminUsersUpdateUser");
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
 **id** | **String**| Identifier of the user |
 **viewModel** | [**UpdateUserVM**](UpdateUserVM.md)| update VM | [optional]

### Return type

[**UserVM**](UserVM.md)

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
| **404** | User with this id is not found |  -  |
| **500** | exception caught |  -  |

