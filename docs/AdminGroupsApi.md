# AdminGroupsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminGroupsAddPermission**](AdminGroupsApi.md#adminGroupsAddPermission) | **PUT** /api/admin/v1/Groups/{id}/permissions | Add permissions to user group
[**adminGroupsCreateGroup**](AdminGroupsApi.md#adminGroupsCreateGroup) | **POST** /api/admin/v1/Groups | Create a new group, returns a new model
[**adminGroupsDeleteGroup**](AdminGroupsApi.md#adminGroupsDeleteGroup) | **DELETE** /api/admin/v1/Groups/{id} | Delete a group by id
[**adminGroupsGetGroup**](AdminGroupsApi.md#adminGroupsGetGroup) | **GET** /api/admin/v1/Groups/{id} | Returns a group by id
[**adminGroupsGetGroups**](AdminGroupsApi.md#adminGroupsGetGroups) | **GET** /api/admin/v1/Groups | Returns a list of groups
[**adminGroupsGetPermissions**](AdminGroupsApi.md#adminGroupsGetPermissions) | **GET** /api/admin/v1/Groups/{id}/permissions | Gets group permissions by identifier
[**adminGroupsRevokePermission**](AdminGroupsApi.md#adminGroupsRevokePermission) | **DELETE** /api/admin/v1/Groups/{id}/permissions | Remove (revoke) permissions in user group by identifier
[**adminGroupsUpdateGroup**](AdminGroupsApi.md#adminGroupsUpdateGroup) | **PUT** /api/admin/v1/Groups/{id} | Update a group by id
[**adminGroupsUpdatePermissions**](AdminGroupsApi.md#adminGroupsUpdatePermissions) | **POST** /api/admin/v1/Groups/{groupId}/permissions | Update permissions in user group by identifier



## adminGroupsAddPermission

> GroupPermissions adminGroupsAddPermission(id, viewModel)

Add permissions to user group

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminGroupsApi;

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

        AdminGroupsApi apiInstance = new AdminGroupsApi(defaultClient);
        String id = "id_example"; // String | Identifier of group
        GroupPermissionsVM viewModel = new GroupPermissionsVM(); // GroupPermissionsVM | Model of permission
        try {
            GroupPermissions result = apiInstance.adminGroupsAddPermission(id, viewModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminGroupsApi#adminGroupsAddPermission");
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
| **400** | The request is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Group with this identifier is not found |  -  |


## adminGroupsCreateGroup

> GroupVM adminGroupsCreateGroup(viewModel)

Create a new group, returns a new model

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminGroupsApi;

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

        AdminGroupsApi apiInstance = new AdminGroupsApi(defaultClient);
        CreateGroupAdminVM viewModel = new CreateGroupAdminVM(); // CreateGroupAdminVM | 
        try {
            GroupVM result = apiInstance.adminGroupsCreateGroup(viewModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminGroupsApi#adminGroupsCreateGroup");
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
 **viewModel** | [**CreateGroupAdminVM**](CreateGroupAdminVM.md)|  | [optional]

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
| **400** | The request is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Subscription not found |  -  |


## adminGroupsDeleteGroup

> adminGroupsDeleteGroup(id)

Delete a group by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminGroupsApi;

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

        AdminGroupsApi apiInstance = new AdminGroupsApi(defaultClient);
        String id = "id_example"; // String | Identifier of group
        try {
            apiInstance.adminGroupsDeleteGroup(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminGroupsApi#adminGroupsDeleteGroup");
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
| **204** | Succesfully deleted |  -  |
| **400** | The request is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Group with this id is not found |  -  |


## adminGroupsGetGroup

> GroupVM adminGroupsGetGroup(id)

Returns a group by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminGroupsApi;

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

        AdminGroupsApi apiInstance = new AdminGroupsApi(defaultClient);
        String id = "id_example"; // String | Identifier of group
        try {
            GroupVM result = apiInstance.adminGroupsGetGroup(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminGroupsApi#adminGroupsGetGroup");
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
| **200** | Succesfully returned |  -  |
| **400** | The request is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Group with this id is not found |  -  |


## adminGroupsGetGroups

> GroupsVM adminGroupsGetGroups(skip, take)

Returns a list of groups

If no groups, then the endpoint will return empty list

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminGroupsApi;

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

        AdminGroupsApi apiInstance = new AdminGroupsApi(defaultClient);
        Integer skip = 0; // Integer | Variable for pagination, defautl value is 0
        Integer take = 10; // Integer | Variable for pagination, default value is 10
        try {
            GroupsVM result = apiInstance.adminGroupsGetGroups(skip, take);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminGroupsApi#adminGroupsGetGroups");
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

[**GroupsVM**](GroupsVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully returned |  -  |
| **400** | The request is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |


## adminGroupsGetPermissions

> GroupPermissions adminGroupsGetPermissions(id)

Gets group permissions by identifier

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminGroupsApi;

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

        AdminGroupsApi apiInstance = new AdminGroupsApi(defaultClient);
        String id = "id_example"; // String | Identifier of group
        try {
            GroupPermissions result = apiInstance.adminGroupsGetPermissions(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminGroupsApi#adminGroupsGetPermissions");
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
| **200** | Succesfully returned |  -  |
| **400** | The request is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Group with this identifier is not found |  -  |


## adminGroupsRevokePermission

> GroupPermissions adminGroupsRevokePermission(id, viewModel)

Remove (revoke) permissions in user group by identifier

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminGroupsApi;

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

        AdminGroupsApi apiInstance = new AdminGroupsApi(defaultClient);
        String id = "id_example"; // String | Identifier of group
        GroupPermissionsVM viewModel = new GroupPermissionsVM(); // GroupPermissionsVM | Model with permissions
        try {
            GroupPermissions result = apiInstance.adminGroupsRevokePermission(id, viewModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminGroupsApi#adminGroupsRevokePermission");
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
 **viewModel** | [**GroupPermissionsVM**](GroupPermissionsVM.md)| Model with permissions | [optional]

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
| **200** | Succesfully revoked |  -  |
| **204** | happens sometimes |  -  |
| **400** | The request is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Group with this identifier is not found |  -  |


## adminGroupsUpdateGroup

> GroupVM adminGroupsUpdateGroup(id, viewModel)

Update a group by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminGroupsApi;

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

        AdminGroupsApi apiInstance = new AdminGroupsApi(defaultClient);
        String id = "id_example"; // String | Identifier of group
        UpdateGroupVM viewModel = new UpdateGroupVM(); // UpdateGroupVM | update vm
        try {
            GroupVM result = apiInstance.adminGroupsUpdateGroup(id, viewModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminGroupsApi#adminGroupsUpdateGroup");
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
 **viewModel** | [**UpdateGroupVM**](UpdateGroupVM.md)| update vm | [optional]

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
| **200** | Succesfully updated |  -  |
| **400** | The request is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Group with this id is not found |  -  |


## adminGroupsUpdatePermissions

> GroupPermissions adminGroupsUpdatePermissions(groupId, newPermissions)

Update permissions in user group by identifier

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminGroupsApi;

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

        AdminGroupsApi apiInstance = new AdminGroupsApi(defaultClient);
        String groupId = "groupId_example"; // String | Identifier of group
        GroupPermissions newPermissions = new GroupPermissions(); // GroupPermissions | Model with new permissions
        try {
            GroupPermissions result = apiInstance.adminGroupsUpdatePermissions(groupId, newPermissions);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminGroupsApi#adminGroupsUpdatePermissions");
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
 **groupId** | **String**| Identifier of group |
 **newPermissions** | [**GroupPermissions**](GroupPermissions.md)| Model with new permissions | [optional]

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
| **200** | Succesfully updated |  -  |
| **400** | The request is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Group with this identifier is not found |  -  |

