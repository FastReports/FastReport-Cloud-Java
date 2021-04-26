# AdminExportsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminExportFoldersAddPermission**](AdminExportsApi.md#adminExportFoldersAddPermission) | **PUT** /api/admin/v1/ExportFolders/{id}/permissions | Add permission
[**adminExportFoldersDeleteFolder**](AdminExportsApi.md#adminExportFoldersDeleteFolder) | **DELETE** /api/admin/v1/ExportFolders/{id} | Delete specified folder
[**adminExportFoldersGetFolder**](AdminExportsApi.md#adminExportFoldersGetFolder) | **GET** /api/admin/v1/ExportFolders/{id} | Returns a folder by id
[**adminExportFoldersGetFolders**](AdminExportsApi.md#adminExportFoldersGetFolders) | **GET** /api/admin/v1/ExportFolders | Returns a list of folders
[**adminExportFoldersGetPermissions**](AdminExportsApi.md#adminExportFoldersGetPermissions) | **GET** /api/admin/v1/ExportFolders/{id}/permissions | Get all folder permissions
[**adminExportFoldersPostFolder**](AdminExportsApi.md#adminExportFoldersPostFolder) | **POST** /api/admin/v1/ExportFolders/{subscriptionId} | Create a folder
[**adminExportFoldersRevokePermission**](AdminExportsApi.md#adminExportFoldersRevokePermission) | **DELETE** /api/admin/v1/ExportFolders/{id}/permissions | Revoke permission
[**adminExportFoldersUpdateFolder**](AdminExportsApi.md#adminExportFoldersUpdateFolder) | **PUT** /api/admin/v1/ExportFolders/{id} | Update a folder
[**adminExportFoldersUpdatePermissions**](AdminExportsApi.md#adminExportFoldersUpdatePermissions) | **POST** /api/admin/v1/ExportFolders/{id}/permissions | Revoke permission
[**adminExportsAddPermission**](AdminExportsApi.md#adminExportsAddPermission) | **PUT** /api/admin/v1/Exports/{id}/permissions | Add file permissions
[**adminExportsDeleteFile**](AdminExportsApi.md#adminExportsDeleteFile) | **DELETE** /api/admin/v1/Exports/{id} | Delete specified file
[**adminExportsGetFile**](AdminExportsApi.md#adminExportsGetFile) | **GET** /api/admin/v1/Exports/{id} | Returns a file by id
[**adminExportsGetFiles**](AdminExportsApi.md#adminExportsGetFiles) | **GET** /api/admin/v1/Exports | Returns a list of files
[**adminExportsGetPermissions**](AdminExportsApi.md#adminExportsGetPermissions) | **GET** /api/admin/v1/Exports/{id}/permissions | Get all file permissions
[**adminExportsRevokePermission**](AdminExportsApi.md#adminExportsRevokePermission) | **DELETE** /api/admin/v1/Exports/{id}/permissions | Revoke (remove) file permissions
[**adminExportsUpdateFile**](AdminExportsApi.md#adminExportsUpdateFile) | **PUT** /api/admin/v1/Exports/{id}/File | Update a file
[**adminExportsUpdatePermissions**](AdminExportsApi.md#adminExportsUpdatePermissions) | **POST** /api/admin/v1/Exports/{fileId}/permissions | Update file permissions
[**adminExportsUploadFile**](AdminExportsApi.md#adminExportsUploadFile) | **POST** /api/admin/v1/Exports | Upload a file to the specified folder



## adminExportFoldersAddPermission

> FilePermissions adminExportFoldersAddPermission(id, permissionsVM)

Add permission

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminExportsApi;

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

        AdminExportsApi apiInstance = new AdminExportsApi(defaultClient);
        String id = "id_example"; // String | folder id
        FilePermissionsVM permissionsVM = new FilePermissionsVM(); // FilePermissionsVM | File permissions vm
        try {
            FilePermissions result = apiInstance.adminExportFoldersAddPermission(id, permissionsVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminExportsApi#adminExportFoldersAddPermission");
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
 **id** | **String**| folder id |
 **permissionsVM** | [**FilePermissionsVM**](FilePermissionsVM.md)| File permissions vm | [optional]

### Return type

[**FilePermissions**](FilePermissions.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | succesfully added |  -  |
| **400** | Id is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File not found |  -  |
| **500** | Caught exception |  -  |


## adminExportFoldersDeleteFolder

> adminExportFoldersDeleteFolder(id, recursive)

Delete specified folder

User with Delete permission can access the method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminExportsApi;

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

        AdminExportsApi apiInstance = new AdminExportsApi(defaultClient);
        String id = "id_example"; // String | folder id
        Boolean recursive = true; // Boolean | delete folder's content
        try {
            apiInstance.adminExportFoldersDeleteFolder(id, recursive);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminExportsApi#adminExportFoldersDeleteFolder");
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
 **id** | **String**| folder id |
 **recursive** | **Boolean**| delete folder&#39;s content | [optional] [default to true]

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
| **204** | Folder succesfully deleted |  -  |
| **400** | Id is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |
| **500** | Exception caught while deleting |  -  |


## adminExportFoldersGetFolder

> FileVM adminExportFoldersGetFolder(id)

Returns a folder by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminExportsApi;

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

        AdminExportsApi apiInstance = new AdminExportsApi(defaultClient);
        String id = "id_example"; // String | Identifier of a folder
        try {
            FileVM result = apiInstance.adminExportFoldersGetFolder(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminExportsApi#adminExportFoldersGetFolder");
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
 **id** | **String**| Identifier of a folder |

### Return type

[**FileVM**](FileVM.md)

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
| **404** | Folder with this id is not found |  -  |


## adminExportFoldersGetFolders

> FilesVM adminExportFoldersGetFolders(skip, take, subscriptionId)

Returns a list of folders

If no folders, then the endpoint will return empty list

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminExportsApi;

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

        AdminExportsApi apiInstance = new AdminExportsApi(defaultClient);
        Integer skip = 0; // Integer | Variable for pagination, defautl value is 0
        Integer take = 10; // Integer | Variable for pagination, default value is 10
        String subscriptionId = "subscriptionId_example"; // String | Subscription Id
        try {
            FilesVM result = apiInstance.adminExportFoldersGetFolders(skip, take, subscriptionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminExportsApi#adminExportFoldersGetFolders");
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
 **subscriptionId** | **String**| Subscription Id | [optional]

### Return type

[**FilesVM**](FilesVM.md)

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


## adminExportFoldersGetPermissions

> FilePermissions adminExportFoldersGetPermissions(id)

Get all folder permissions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminExportsApi;

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

        AdminExportsApi apiInstance = new AdminExportsApi(defaultClient);
        String id = "id_example"; // String | folder id
        try {
            FilePermissions result = apiInstance.adminExportFoldersGetPermissions(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminExportsApi#adminExportFoldersGetPermissions");
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
 **id** | **String**| folder id |

### Return type

[**FilePermissions**](FilePermissions.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | succesfully returned |  -  |
| **400** | Id is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File not found |  -  |


## adminExportFoldersPostFolder

> FileVM adminExportFoldersPostFolder(subscriptionId, folderVm)

Create a folder

User with a Create File permisison can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminExportsApi;

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

        AdminExportsApi apiInstance = new AdminExportsApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | 
        AdminExportFolderCreateVM folderVm = new AdminExportFolderCreateVM(); // AdminExportFolderCreateVM | folder create vm
        try {
            FileVM result = apiInstance.adminExportFoldersPostFolder(subscriptionId, folderVm);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminExportsApi#adminExportFoldersPostFolder");
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
 **subscriptionId** | **String**|  |
 **folderVm** | [**AdminExportFolderCreateVM**](AdminExportFolderCreateVM.md)| folder create vm | [optional]

### Return type

[**FileVM**](FileVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | New folder has been created) |  -  |
| **400** | Parent folder id is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | subscription not found |  -  |
| **500** | Exception caught while creating |  -  |


## adminExportFoldersRevokePermission

> FilePermissions adminExportFoldersRevokePermission(id, permissionsVM)

Revoke permission

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminExportsApi;

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

        AdminExportsApi apiInstance = new AdminExportsApi(defaultClient);
        String id = "id_example"; // String | folder id
        FilePermissionsVM permissionsVM = new FilePermissionsVM(); // FilePermissionsVM | File permissions vm
        try {
            FilePermissions result = apiInstance.adminExportFoldersRevokePermission(id, permissionsVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminExportsApi#adminExportFoldersRevokePermission");
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
 **id** | **String**| folder id |
 **permissionsVM** | [**FilePermissionsVM**](FilePermissionsVM.md)| File permissions vm | [optional]

### Return type

[**FilePermissions**](FilePermissions.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | succesfully revoked |  -  |
| **204** | happens sometimes |  -  |
| **400** | Id is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File not found |  -  |
| **500** | Exception caught |  -  |


## adminExportFoldersUpdateFolder

> FileVM adminExportFoldersUpdateFolder(id, folderVM)

Update a folder

User with Create File permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminExportsApi;

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

        AdminExportsApi apiInstance = new AdminExportsApi(defaultClient);
        String id = "id_example"; // String | folder id
        FileUpdateVM folderVM = new FileUpdateVM(); // FileUpdateVM | folder's view model
        try {
            FileVM result = apiInstance.adminExportFoldersUpdateFolder(id, folderVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminExportsApi#adminExportFoldersUpdateFolder");
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
 **id** | **String**| folder id |
 **folderVM** | [**FileUpdateVM**](FileUpdateVM.md)| folder&#39;s view model | [optional]

### Return type

[**FileVM**](FileVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | folder has been uploaded |  -  |
| **400** | folderVM view model is not valid |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |


## adminExportFoldersUpdatePermissions

> FilePermissions adminExportFoldersUpdatePermissions(id, newPermissions)

Revoke permission

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminExportsApi;

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

        AdminExportsApi apiInstance = new AdminExportsApi(defaultClient);
        String id = "id_example"; // String | folder id
        FilePermissions newPermissions = new FilePermissions(); // FilePermissions | 
        try {
            FilePermissions result = apiInstance.adminExportFoldersUpdatePermissions(id, newPermissions);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminExportsApi#adminExportFoldersUpdatePermissions");
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
 **id** | **String**| folder id |
 **newPermissions** | [**FilePermissions**](FilePermissions.md)|  | [optional]

### Return type

[**FilePermissions**](FilePermissions.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | succesfully revoked |  -  |
| **400** | Id is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File not found |  -  |
| **500** | Exception caught |  -  |


## adminExportsAddPermission

> FilePermissions adminExportsAddPermission(id, permissionsVM)

Add file permissions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminExportsApi;

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

        AdminExportsApi apiInstance = new AdminExportsApi(defaultClient);
        String id = "id_example"; // String | 
        FilePermissionsVM permissionsVM = new FilePermissionsVM(); // FilePermissionsVM | permissions to add
        try {
            FilePermissions result = apiInstance.adminExportsAddPermission(id, permissionsVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminExportsApi#adminExportsAddPermission");
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
 **permissionsVM** | [**FilePermissionsVM**](FilePermissionsVM.md)| permissions to add | [optional]

### Return type

[**FilePermissions**](FilePermissions.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | succesfully added |  -  |
| **400** | Id is null |  -  |
| **401** | You don&#39;t have rights for the operation |  -  |
| **404** | File not found |  -  |


## adminExportsDeleteFile

> adminExportsDeleteFile(id)

Delete specified file

User with Delete permission can access the method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminExportsApi;

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

        AdminExportsApi apiInstance = new AdminExportsApi(defaultClient);
        String id = "id_example"; // String | file id
        try {
            apiInstance.adminExportsDeleteFile(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminExportsApi#adminExportsDeleteFile");
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
 **id** | **String**| file id |

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
| **204** | File succesfully deleted |  -  |
| **400** | Id is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File not found |  -  |


## adminExportsGetFile

> ExportVM adminExportsGetFile(id)

Returns a file by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminExportsApi;

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

        AdminExportsApi apiInstance = new AdminExportsApi(defaultClient);
        String id = "id_example"; // String | Identifier of file
        try {
            ExportVM result = apiInstance.adminExportsGetFile(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminExportsApi#adminExportsGetFile");
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
 **id** | **String**| Identifier of file |

### Return type

[**ExportVM**](ExportVM.md)

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
| **404** | File with this id is not found |  -  |


## adminExportsGetFiles

> ExportsVM adminExportsGetFiles(skip, take, subscriptionId)

Returns a list of files

If no files, then the endpoint will return empty list

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminExportsApi;

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

        AdminExportsApi apiInstance = new AdminExportsApi(defaultClient);
        Integer skip = 0; // Integer | Variable for pagination, defautl value is 0
        Integer take = 10; // Integer | Variable for pagination, default value is 10
        String subscriptionId = "subscriptionId_example"; // String | Subscription Id
        try {
            ExportsVM result = apiInstance.adminExportsGetFiles(skip, take, subscriptionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminExportsApi#adminExportsGetFiles");
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
 **subscriptionId** | **String**| Subscription Id | [optional]

### Return type

[**ExportsVM**](ExportsVM.md)

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
| **404** | Files endpoint&#39;s not found |  -  |


## adminExportsGetPermissions

> FilePermissions adminExportsGetPermissions(id)

Get all file permissions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminExportsApi;

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

        AdminExportsApi apiInstance = new AdminExportsApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            FilePermissions result = apiInstance.adminExportsGetPermissions(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminExportsApi#adminExportsGetPermissions");
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

### Return type

[**FilePermissions**](FilePermissions.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | succesfully returned |  -  |
| **400** | Id is null or not hex24 |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File not found |  -  |


## adminExportsRevokePermission

> FilePermissions adminExportsRevokePermission(id, permissionsVM)

Revoke (remove) file permissions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminExportsApi;

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

        AdminExportsApi apiInstance = new AdminExportsApi(defaultClient);
        String id = "id_example"; // String | file id
        FilePermissionsVM permissionsVM = new FilePermissionsVM(); // FilePermissionsVM | permissions to revoke
        try {
            FilePermissions result = apiInstance.adminExportsRevokePermission(id, permissionsVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminExportsApi#adminExportsRevokePermission");
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
 **id** | **String**| file id |
 **permissionsVM** | [**FilePermissionsVM**](FilePermissionsVM.md)| permissions to revoke | [optional]

### Return type

[**FilePermissions**](FilePermissions.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | succesfully revoked |  -  |
| **204** | happens sometimes |  -  |
| **400** | Id is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File not found |  -  |
| **500** | Exception caught |  -  |


## adminExportsUpdateFile

> ExportVM adminExportsUpdateFile(id, fileVM)

Update a file

User with Create Entity permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminExportsApi;

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

        AdminExportsApi apiInstance = new AdminExportsApi(defaultClient);
        String id = "id_example"; // String | file id
        FileUpdateVM fileVM = new FileUpdateVM(); // FileUpdateVM | file's view model
        try {
            ExportVM result = apiInstance.adminExportsUpdateFile(id, fileVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminExportsApi#adminExportsUpdateFile");
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
 **id** | **String**| file id |
 **fileVM** | [**FileUpdateVM**](FileUpdateVM.md)| file&#39;s view model | [optional]

### Return type

[**ExportVM**](ExportVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | File has been uploaded |  -  |
| **400** | fileVM view model is not valid |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | original file not found |  -  |


## adminExportsUpdatePermissions

> FilePermissions adminExportsUpdatePermissions(fileId, newPermissions)

Update file permissions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminExportsApi;

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

        AdminExportsApi apiInstance = new AdminExportsApi(defaultClient);
        String fileId = "fileId_example"; // String | 
        FilePermissions newPermissions = new FilePermissions(); // FilePermissions | permissions model
        try {
            FilePermissions result = apiInstance.adminExportsUpdatePermissions(fileId, newPermissions);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminExportsApi#adminExportsUpdatePermissions");
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
 **fileId** | **String**|  |
 **newPermissions** | [**FilePermissions**](FilePermissions.md)| permissions model | [optional]

### Return type

[**FilePermissions**](FilePermissions.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | succesfully updated |  -  |
| **400** | Id is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File not found |  -  |
| **500** | Caught exception while upddating |  -  |


## adminExportsUploadFile

> ExportVM adminExportsUploadFile(fileVM)

Upload a file to the specified folder

User with Create Entity permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminExportsApi;

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

        AdminExportsApi apiInstance = new AdminExportsApi(defaultClient);
        ExportCreateAdminVM fileVM = new ExportCreateAdminVM(); // ExportCreateAdminVM | file's view model
        try {
            ExportVM result = apiInstance.adminExportsUploadFile(fileVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminExportsApi#adminExportsUploadFile");
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
 **fileVM** | [**ExportCreateAdminVM**](ExportCreateAdminVM.md)| file&#39;s view model | [optional]

### Return type

[**ExportVM**](ExportVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | File has been uploaded |  -  |
| **400** | fileVM view model is not valid |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | subscription or folder is not found |  -  |
| **413** | Uploaded file is too big |  -  |
| **500** | catched exception while uploading |  -  |

