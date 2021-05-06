# AdminReportsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminReportFoldersDeleteFolder**](AdminReportsApi.md#adminReportFoldersDeleteFolder) | **DELETE** /api/admin/v1/ReportFolders/{id} | Delete specified folder
[**adminReportFoldersGetFolder**](AdminReportsApi.md#adminReportFoldersGetFolder) | **GET** /api/admin/v1/ReportFolders/{id} | Returns a folder by id
[**adminReportFoldersGetFolders**](AdminReportsApi.md#adminReportFoldersGetFolders) | **GET** /api/admin/v1/ReportFolders | Returns a list of folders
[**adminReportFoldersGetPermissions**](AdminReportsApi.md#adminReportFoldersGetPermissions) | **GET** /api/admin/v1/ReportFolders/{id}/permissions | Get all folder permissions
[**adminReportFoldersPostFolder**](AdminReportsApi.md#adminReportFoldersPostFolder) | **POST** /api/admin/v1/ReportFolders | Create a folder
[**adminReportFoldersUpdateFolder**](AdminReportsApi.md#adminReportFoldersUpdateFolder) | **PUT** /api/admin/v1/ReportFolders/{id} | Update a folder
[**adminReportFoldersUpdatePermissions**](AdminReportsApi.md#adminReportFoldersUpdatePermissions) | **POST** /api/admin/v1/ReportFolders/{id}/permissions | Revoke permission
[**adminReportsDeleteFile**](AdminReportsApi.md#adminReportsDeleteFile) | **DELETE** /api/admin/v1/Reports/{id} | Delete specified file
[**adminReportsGetFile**](AdminReportsApi.md#adminReportsGetFile) | **GET** /api/admin/v1/Reports/{id} | Returns a file by id
[**adminReportsGetFiles**](AdminReportsApi.md#adminReportsGetFiles) | **GET** /api/admin/v1/Reports | Returns a list of files
[**adminReportsGetPermissions**](AdminReportsApi.md#adminReportsGetPermissions) | **GET** /api/admin/v1/Reports/{id}/permissions | Get all file permissions
[**adminReportsUpdateFile**](AdminReportsApi.md#adminReportsUpdateFile) | **PUT** /api/admin/v1/Reports/{id} | Update a file
[**adminReportsUpdatePermissions**](AdminReportsApi.md#adminReportsUpdatePermissions) | **POST** /api/admin/v1/Reports/{id}/permissions | Update permissions to file
[**adminReportsUploadFile**](AdminReportsApi.md#adminReportsUploadFile) | **POST** /api/admin/v1/Reports | Upload a file to the specified folder



## adminReportFoldersDeleteFolder

> adminReportFoldersDeleteFolder(id, recursive)

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
import cloud.fastreport.client.AdminReportsApi;

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

        AdminReportsApi apiInstance = new AdminReportsApi(defaultClient);
        String id = "id_example"; // String | folder id
        Boolean recursive = true; // Boolean | delete folder's content
        try {
            apiInstance.adminReportFoldersDeleteFolder(id, recursive);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminReportsApi#adminReportFoldersDeleteFolder");
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


## adminReportFoldersGetFolder

> FileVM adminReportFoldersGetFolder(id)

Returns a folder by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminReportsApi;

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

        AdminReportsApi apiInstance = new AdminReportsApi(defaultClient);
        String id = "id_example"; // String | Identifier of a folder
        try {
            FileVM result = apiInstance.adminReportFoldersGetFolder(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminReportsApi#adminReportFoldersGetFolder");
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


## adminReportFoldersGetFolders

> FilesVM adminReportFoldersGetFolders(skip, take, subscriptionId)

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
import cloud.fastreport.client.AdminReportsApi;

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

        AdminReportsApi apiInstance = new AdminReportsApi(defaultClient);
        Integer skip = 0; // Integer | Variable for pagination, defautl value is 0
        Integer take = 10; // Integer | Variable for pagination, default value is 10
        String subscriptionId = "subscriptionId_example"; // String | Allows to filter by subscriptions ID
        try {
            FilesVM result = apiInstance.adminReportFoldersGetFolders(skip, take, subscriptionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminReportsApi#adminReportFoldersGetFolders");
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
 **subscriptionId** | **String**| Allows to filter by subscriptions ID | [optional]

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


## adminReportFoldersGetPermissions

> FilePermissionsVM adminReportFoldersGetPermissions(id)

Get all folder permissions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminReportsApi;

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

        AdminReportsApi apiInstance = new AdminReportsApi(defaultClient);
        String id = "id_example"; // String | folder id
        try {
            FilePermissionsVM result = apiInstance.adminReportFoldersGetPermissions(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminReportsApi#adminReportFoldersGetPermissions");
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

[**FilePermissionsVM**](FilePermissionsVM.md)

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


## adminReportFoldersPostFolder

> FileVM adminReportFoldersPostFolder(folderVm)

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
import cloud.fastreport.client.AdminReportsApi;

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

        AdminReportsApi apiInstance = new AdminReportsApi(defaultClient);
        AdminReportFolderCreateVM folderVm = new AdminReportFolderCreateVM(); // AdminReportFolderCreateVM | folder create vm
        try {
            FileVM result = apiInstance.adminReportFoldersPostFolder(folderVm);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminReportsApi#adminReportFoldersPostFolder");
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
 **folderVm** | [**AdminReportFolderCreateVM**](AdminReportFolderCreateVM.md)| folder create vm | [optional]

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


## adminReportFoldersUpdateFolder

> FileVM adminReportFoldersUpdateFolder(id, folderVM)

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
import cloud.fastreport.client.AdminReportsApi;

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

        AdminReportsApi apiInstance = new AdminReportsApi(defaultClient);
        String id = "id_example"; // String | folder id
        FileUpdateVM folderVM = new FileUpdateVM(); // FileUpdateVM | folder's view model
        try {
            FileVM result = apiInstance.adminReportFoldersUpdateFolder(id, folderVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminReportsApi#adminReportFoldersUpdateFolder");
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


## adminReportFoldersUpdatePermissions

> adminReportFoldersUpdatePermissions(id, newPermissions)

Revoke permission

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminReportsApi;

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

        AdminReportsApi apiInstance = new AdminReportsApi(defaultClient);
        String id = "id_example"; // String | folder id
        UpdateFilePermissionsVM newPermissions = new UpdateFilePermissionsVM(); // UpdateFilePermissionsVM | 
        try {
            apiInstance.adminReportFoldersUpdatePermissions(id, newPermissions);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminReportsApi#adminReportFoldersUpdatePermissions");
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
 **newPermissions** | [**UpdateFilePermissionsVM**](UpdateFilePermissionsVM.md)|  | [optional]

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
| **200** | succesfully revoked |  -  |
| **400** | Id is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File not found |  -  |
| **500** | Exception caught |  -  |


## adminReportsDeleteFile

> adminReportsDeleteFile(id)

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
import cloud.fastreport.client.AdminReportsApi;

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

        AdminReportsApi apiInstance = new AdminReportsApi(defaultClient);
        String id = "id_example"; // String | file id
        try {
            apiInstance.adminReportsDeleteFile(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminReportsApi#adminReportsDeleteFile");
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


## adminReportsGetFile

> ReportVM adminReportsGetFile(id)

Returns a file by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminReportsApi;

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

        AdminReportsApi apiInstance = new AdminReportsApi(defaultClient);
        String id = "id_example"; // String | Identifier of file
        try {
            ReportVM result = apiInstance.adminReportsGetFile(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminReportsApi#adminReportsGetFile");
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

[**ReportVM**](ReportVM.md)

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


## adminReportsGetFiles

> ReportsVM adminReportsGetFiles(skip, take, subscriptionId)

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
import cloud.fastreport.client.AdminReportsApi;

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

        AdminReportsApi apiInstance = new AdminReportsApi(defaultClient);
        Integer skip = 0; // Integer | Variable for pagination, defautl value is 0
        Integer take = 10; // Integer | Variable for pagination, default value is 10
        String subscriptionId = "subscriptionId_example"; // String | Subscription Id
        try {
            ReportsVM result = apiInstance.adminReportsGetFiles(skip, take, subscriptionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminReportsApi#adminReportsGetFiles");
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

[**ReportsVM**](ReportsVM.md)

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


## adminReportsGetPermissions

> FilePermissionsVM adminReportsGetPermissions(id)

Get all file permissions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminReportsApi;

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

        AdminReportsApi apiInstance = new AdminReportsApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            FilePermissionsVM result = apiInstance.adminReportsGetPermissions(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminReportsApi#adminReportsGetPermissions");
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

[**FilePermissionsVM**](FilePermissionsVM.md)

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


## adminReportsUpdateFile

> ReportVM adminReportsUpdateFile(id, fileVM)

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
import cloud.fastreport.client.AdminReportsApi;

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

        AdminReportsApi apiInstance = new AdminReportsApi(defaultClient);
        String id = "id_example"; // String | file id
        FileUpdateVM fileVM = new FileUpdateVM(); // FileUpdateVM | file's view model
        try {
            ReportVM result = apiInstance.adminReportsUpdateFile(id, fileVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminReportsApi#adminReportsUpdateFile");
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

[**ReportVM**](ReportVM.md)

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


## adminReportsUpdatePermissions

> adminReportsUpdatePermissions(id, newPermissions)

Update permissions to file

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminReportsApi;

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

        AdminReportsApi apiInstance = new AdminReportsApi(defaultClient);
        String id = "id_example"; // String | 
        UpdateFilePermissionsVM newPermissions = new UpdateFilePermissionsVM(); // UpdateFilePermissionsVM | 
        try {
            apiInstance.adminReportsUpdatePermissions(id, newPermissions);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminReportsApi#adminReportsUpdatePermissions");
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
 **newPermissions** | [**UpdateFilePermissionsVM**](UpdateFilePermissionsVM.md)|  | [optional]

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
| **200** | Succesfully updated |  -  |
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Datasource is not found |  -  |


## adminReportsUploadFile

> ReportVM adminReportsUploadFile(fileVM)

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
import cloud.fastreport.client.AdminReportsApi;

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

        AdminReportsApi apiInstance = new AdminReportsApi(defaultClient);
        ReportCreateAdminVM fileVM = new ReportCreateAdminVM(); // ReportCreateAdminVM | file's view model
        try {
            ReportVM result = apiInstance.adminReportsUploadFile(fileVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminReportsApi#adminReportsUploadFile");
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
 **fileVM** | [**ReportCreateAdminVM**](ReportCreateAdminVM.md)| file&#39;s view model | [optional]

### Return type

[**ReportVM**](ReportVM.md)

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

