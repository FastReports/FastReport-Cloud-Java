# GroupsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**groupsAddPermission**](GroupsApi.md#groupsAddPermission) | **PUT** /api/manage/v1/Groups/{id}/permissions | Add permissions to user group
[**groupsCreateGroup**](GroupsApi.md#groupsCreateGroup) | **POST** /api/manage/v1/Groups | Create a new user group
[**groupsDeleteGroup**](GroupsApi.md#groupsDeleteGroup) | **DELETE** /api/manage/v1/Groups/{id} | Delete group by identifier
[**groupsGetGroup**](GroupsApi.md#groupsGetGroup) | **GET** /api/manage/v1/Groups/{id} | Gets group by identifier
[**groupsGetGroupList**](GroupsApi.md#groupsGetGroupList) | **GET** /api/manage/v1/Groups | Gets list of user groups
[**groupsGetPermissions**](GroupsApi.md#groupsGetPermissions) | **GET** /api/manage/v1/Groups/{id}/permissions | Gets group permissions by identifier
[**groupsRenameGroup**](GroupsApi.md#groupsRenameGroup) | **PUT** /api/manage/v1/Groups/{id}/rename | Rename group by identifier
[**groupsRevokePermission**](GroupsApi.md#groupsRevokePermission) | **DELETE** /api/manage/v1/Groups/{id}/permissions | Remove (revoke) permissions in user group by identifier



## groupsAddPermission

> GroupPermissions groupsAddPermission(id, viewModel)

Add permissions to user group

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.GroupsApi;

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

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        String id = "id_example"; // String | Identifier of group
        GroupPermissionsVM viewModel = new GroupPermissionsVM(); // GroupPermissionsVM | Model of permission
        try {
            GroupPermissions result = apiInstance.groupsAddPermission(id, viewModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#groupsAddPermission");
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
 **id** | **String**| Identifier of group |
 **viewModel** | [**GroupPermissionsVM**](GroupPermissionsVM.md)| Model of permission | [optional]

### Return type

[**GroupPermissions**](GroupPermissions.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully added |  -  |
| **400** | The reqeust is wrong |  -  |
| **402** | subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Group with this identifier is not found |  -  |


## groupsCreateGroup

> GroupVM groupsCreateGroup(viewModel)

Create a new user group

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.GroupsApi;

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

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        CreateGroupVM viewModel = new CreateGroupVM(); // CreateGroupVM | Model for creating
        try {
            GroupVM result = apiInstance.groupsCreateGroup(viewModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#groupsCreateGroup");
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
 **viewModel** | [**CreateGroupVM**](CreateGroupVM.md)| Model for creating | [optional]

### Return type

[**GroupVM**](GroupVM.md)

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
| **402** | subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Information from view model is not found |  -  |


## groupsDeleteGroup

> groupsDeleteGroup(id)

Delete group by identifier

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.GroupsApi;

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

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        String id = "id_example"; // String | Identifier of group
        try {
            apiInstance.groupsDeleteGroup(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#groupsDeleteGroup");
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
 **id** | **String**| Identifier of group |

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
| **204** | Succesfully delete |  -  |
| **400** | The reqeust is wrong |  -  |
| **402** | subscripiton is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Group with this identifier is not found |  -  |
| **500** | Exception thrown |  -  |


## groupsGetGroup

> GroupVM groupsGetGroup(id)

Gets group by identifier

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.GroupsApi;

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

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        String id = "id_example"; // String | Identifier of group
        try {
            GroupVM result = apiInstance.groupsGetGroup(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#groupsGetGroup");
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
 **id** | **String**| Identifier of group |

### Return type

[**GroupVM**](GroupVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully retured |  -  |
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Group with this identifier is not found |  -  |
| **500** | Exception thrown |  -  |


## groupsGetGroupList

> GroupsVM groupsGetGroupList(skip, take)

Gets list of user groups

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.GroupsApi;

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

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        Integer skip = 0; // Integer | How many groups need to skip
        Integer take = 10; // Integer | How many groups need to take
        try {
            GroupsVM result = apiInstance.groupsGetGroupList(skip, take);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#groupsGetGroupList");
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
 **skip** | **Integer**| How many groups need to skip | [optional] [default to 0]
 **take** | **Integer**| How many groups need to take | [optional] [default to 10]

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
| **200** | Succesfully retured |  -  |
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Current user is not found |  -  |


## groupsGetPermissions

> GroupPermissions groupsGetPermissions(id)

Gets group permissions by identifier

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.GroupsApi;

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

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        String id = "id_example"; // String | Identifier of group
        try {
            GroupPermissions result = apiInstance.groupsGetPermissions(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#groupsGetPermissions");
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
 **id** | **String**| Identifier of group |

### Return type

[**GroupPermissions**](GroupPermissions.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully retured |  -  |
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Group with this identifier is not found |  -  |


## groupsRenameGroup

> GroupVM groupsRenameGroup(id, viewModel)

Rename group by identifier

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.GroupsApi;

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

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        String id = "id_example"; // String | Identifier of group
        RenameGroupVM viewModel = new RenameGroupVM(); // RenameGroupVM | Model for renaming
        try {
            GroupVM result = apiInstance.groupsRenameGroup(id, viewModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#groupsRenameGroup");
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
 **id** | **String**| Identifier of group |
 **viewModel** | [**RenameGroupVM**](RenameGroupVM.md)| Model for renaming |

### Return type

[**GroupVM**](GroupVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully renamed |  -  |
| **400** | The reqeust is wrong |  -  |
| **402** | subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Group with this identifier is not found |  -  |
| **500** | Exception thrown |  -  |


## groupsRevokePermission

> GroupPermissions groupsRevokePermission(id, viewModel)

Remove (revoke) permissions in user group by identifier

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.GroupsApi;

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

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        String id = "id_example"; // String | Identifier of group
        GroupPermissionsVM viewModel = new GroupPermissionsVM(); // GroupPermissionsVM | Model with permissions
        try {
            GroupPermissions result = apiInstance.groupsRevokePermission(id, viewModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#groupsRevokePermission");
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
 **id** | **String**| Identifier of group |
 **viewModel** | [**GroupPermissionsVM**](GroupPermissionsVM.md)| Model with permissions |

### Return type

[**GroupPermissions**](GroupPermissions.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully retured |  -  |
| **204** | happens sometimes |  -  |
| **400** | The reqeust is wrong |  -  |
| **402** | subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Group with this identifier is not found |  -  |

