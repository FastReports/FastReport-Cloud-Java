# TemplatesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**templateFolderAndFileGetCount**](TemplatesApi.md#templateFolderAndFileGetCount) | **GET** /api/rp/v1/Templates/Folder/{id}/CountFolderAndFiles | Get count of files and folders what contains in a specified folder
[**templateFolderAndFileGetFoldersAndFiles**](TemplatesApi.md#templateFolderAndFileGetFoldersAndFiles) | **GET** /api/rp/v1/Templates/Folder/{id}/ListFolderAndFiles | Get all folders and files from specified folder
[**templateFoldersCopyFolder**](TemplatesApi.md#templateFoldersCopyFolder) | **POST** /api/rp/v1/Templates/Folder/{id}/Copy/{folderId} | Move folder to a specified folder
[**templateFoldersDeleteFolder**](TemplatesApi.md#templateFoldersDeleteFolder) | **DELETE** /api/rp/v1/Templates/Folder/{id} | Delete specified folder
[**templateFoldersGetBreadcrumbs**](TemplatesApi.md#templateFoldersGetBreadcrumbs) | **GET** /api/rp/v1/Templates/Folder/{id}/Breadcrumbs | Get specified folder breadcrumbs
[**templateFoldersGetFolder**](TemplatesApi.md#templateFoldersGetFolder) | **GET** /api/rp/v1/Templates/Folder/{id} | Get specified folder
[**templateFoldersGetFolders**](TemplatesApi.md#templateFoldersGetFolders) | **GET** /api/rp/v1/Templates/Folder/{id}/ListFolders | Get all folders from specified folder
[**templateFoldersGetFoldersCount**](TemplatesApi.md#templateFoldersGetFoldersCount) | **GET** /api/rp/v1/Templates/Folder/{id}/CountFolders | Get count of folders what contains in a specified folder
[**templateFoldersGetPermissions**](TemplatesApi.md#templateFoldersGetPermissions) | **GET** /api/rp/v1/Templates/Folder/{id}/permissions | Get all folder permissions
[**templateFoldersGetRootFolder**](TemplatesApi.md#templateFoldersGetRootFolder) | **GET** /api/rp/v1/Templates/Root | Get user&#39;s root folder (without parents)
[**templateFoldersMoveFolder**](TemplatesApi.md#templateFoldersMoveFolder) | **POST** /api/rp/v1/Templates/Folder/{id}/Move/{folderId} | Move folder to a specified folder
[**templateFoldersPostFolder**](TemplatesApi.md#templateFoldersPostFolder) | **POST** /api/rp/v1/Templates/Folder/{id}/Folder | Create folder
[**templateFoldersRenameFolder**](TemplatesApi.md#templateFoldersRenameFolder) | **PUT** /api/rp/v1/Templates/Folder/{id}/Rename | Rename a folder
[**templateFoldersUpdateIcon**](TemplatesApi.md#templateFoldersUpdateIcon) | **PUT** /api/rp/v1/Templates/Folder/{id}/Icon | Update a folder&#39;s icon
[**templateFoldersUpdatePermissions**](TemplatesApi.md#templateFoldersUpdatePermissions) | **POST** /api/rp/v1/Templates/{id}/permissions | Update permissions
[**templateFoldersUpdateTags**](TemplatesApi.md#templateFoldersUpdateTags) | **PUT** /api/rp/v1/Templates/Folder/{id}/UpdateTags | Update tags
[**templatesCopyFile**](TemplatesApi.md#templatesCopyFile) | **POST** /api/rp/v1/Templates/File/{id}/Copy/{folderId} | Copy file to a specified folder
[**templatesDeleteFile**](TemplatesApi.md#templatesDeleteFile) | **DELETE** /api/rp/v1/Templates/File/{id} | Delete specified file
[**templatesExport**](TemplatesApi.md#templatesExport) | **POST** /api/rp/v1/Templates/File/{id}/Export | Export specified report template to a specified format
[**templatesGetFile**](TemplatesApi.md#templatesGetFile) | **GET** /api/rp/v1/Templates/File/{id} | Get specified file
[**templatesGetFilesCount**](TemplatesApi.md#templatesGetFilesCount) | **GET** /api/rp/v1/Templates/Folder/{id}/CountFiles | Get count of files what contains in a specified folder
[**templatesGetFilesList**](TemplatesApi.md#templatesGetFilesList) | **GET** /api/rp/v1/Templates/Folder/{id}/ListFiles | Get all files from specified folder
[**templatesGetPermissions**](TemplatesApi.md#templatesGetPermissions) | **GET** /api/rp/v1/Templates/File/{id}/permissions | Get all file permissions
[**templatesMoveFile**](TemplatesApi.md#templatesMoveFile) | **POST** /api/rp/v1/Templates/File/{id}/Move/{folderId} | Move file to a specified folder
[**templatesPrepare**](TemplatesApi.md#templatesPrepare) | **POST** /api/rp/v1/Templates/File/{id}/Prepare | Prepare specified template to report
[**templatesRenameFile**](TemplatesApi.md#templatesRenameFile) | **PUT** /api/rp/v1/Templates/File/{id}/Rename | Rename a file
[**templatesUpdateIcon**](TemplatesApi.md#templatesUpdateIcon) | **PUT** /api/rp/v1/Templates/File/{id}/Icon | Update a files&#39;s icon
[**templatesUpdatePermissions**](TemplatesApi.md#templatesUpdatePermissions) | **POST** /api/rp/v1/Templates/File/{id}/permissions | Update permissions
[**templatesUpdateTags**](TemplatesApi.md#templatesUpdateTags) | **PUT** /api/rp/v1/Templates/File/{id}/UpdateTags | Update tags
[**templatesUploadFile**](TemplatesApi.md#templatesUploadFile) | **POST** /api/rp/v1/Templates/Folder/{id}/File | Upload a file to the specified folder  !



## templateFolderAndFileGetCount

> CountVM templateFolderAndFileGetCount(id)

Get count of files and folders what contains in a specified folder

User with a Get Count permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        try {
            CountVM result = apiInstance.templateFolderAndFileGetCount(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFolderAndFileGetCount");
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

[**CountVM**](CountVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns count of the files in a specified folder |  -  |
| **400** | FolderId is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |


## templateFolderAndFileGetFoldersAndFiles

> FilesVM templateFolderAndFileGetFoldersAndFiles(id, skip, take)

Get all folders and files from specified folder

User with a Get Entity permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        Integer skip = 0; // Integer | number of folder and files, that have to be skipped
        Integer take = 10; // Integer | number of folder and files, that have to be returned
        try {
            FilesVM result = apiInstance.templateFolderAndFileGetFoldersAndFiles(id, skip, take);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFolderAndFileGetFoldersAndFiles");
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
 **skip** | **Integer**| number of folder and files, that have to be skipped | [optional] [default to 0]
 **take** | **Integer**| number of folder and files, that have to be returned | [optional] [default to 10]

### Return type

[**FilesVM**](FilesVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns list of the files from a specified folder |  -  |
| **400** | FolderId is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or folder not found |  -  |


## templateFoldersCopyFolder

> FileVM templateFoldersCopyFolder(id, folderId)

Move folder to a specified folder

User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | moving folder id
        String folderId = "folderId_example"; // String | destination folder id
        try {
            FileVM result = apiInstance.templateFoldersCopyFolder(id, folderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersCopyFolder");
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
 **id** | **String**| moving folder id |
 **folderId** | **String**| destination folder id |

### Return type

[**FileVM**](FileVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Folder has been moved to a specified folder |  -  |
| **400** | folderId or parentFolderId is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |


## templateFoldersDeleteFolder

> templateFoldersDeleteFolder(id, recursive)

Delete specified folder

User with a Delete Entity permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        Boolean recursive = true; // Boolean | delete all childs
        try {
            apiInstance.templateFoldersDeleteFolder(id, recursive);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersDeleteFolder");
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
 **recursive** | **Boolean**| delete all childs | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Folder succesfully deleted |  -  |
| **400** | Id is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |


## templateFoldersGetBreadcrumbs

> BreadcrumbsVM templateFoldersGetBreadcrumbs(id)

Get specified folder breadcrumbs

User with a Get Entity permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        try {
            BreadcrumbsVM result = apiInstance.templateFoldersGetBreadcrumbs(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersGetBreadcrumbs");
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

[**BreadcrumbsVM**](BreadcrumbsVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns breadcrumbs parents list (starts from root folder) |  -  |
| **400** | folderId is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |


## templateFoldersGetFolder

> FileVM templateFoldersGetFolder(id)

Get specified folder

User with a Get Entity permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        try {
            FileVM result = apiInstance.templateFoldersGetFolder(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersGetFolder");
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

[**FileVM**](FileVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns specified folder |  -  |
| **400** | Id is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |


## templateFoldersGetFolders

> FilesVM templateFoldersGetFolders(id, skip, take)

Get all folders from specified folder

User with a Get Entity permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        Integer skip = 0; // Integer | number of files, that have to be skipped
        Integer take = 10; // Integer | number of files, that have to be returned
        try {
            FilesVM result = apiInstance.templateFoldersGetFolders(id, skip, take);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersGetFolders");
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
 **skip** | **Integer**| number of files, that have to be skipped | [optional] [default to 0]
 **take** | **Integer**| number of files, that have to be returned | [optional] [default to 10]

### Return type

[**FilesVM**](FilesVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gets all folders from a specified folder |  -  |
| **400** | folderId is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |


## templateFoldersGetFoldersCount

> CountVM templateFoldersGetFoldersCount(id)

Get count of folders what contains in a specified folder

User with a Get Count permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        try {
            CountVM result = apiInstance.templateFoldersGetFoldersCount(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersGetFoldersCount");
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

[**CountVM**](CountVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns count of folders in a specified folder |  -  |
| **400** | folderId is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |


## templateFoldersGetPermissions

> FilePermissionsVM templateFoldersGetPermissions(id)

Get all folder permissions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            FilePermissionsVM result = apiInstance.templateFoldersGetPermissions(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersGetPermissions");
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
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | returned permissions |  -  |
| **400** | id is not valid |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | folder is not found |  -  |


## templateFoldersGetRootFolder

> FileVM templateFoldersGetRootFolder(subscriptionId)

Get user&#39;s root folder (without parents)

&amp;gt; Breakchange. Now user model doesn&#39;t contain a root folders.  This method can return error 400 and 404 when subscription is not found.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | 
        try {
            FileVM result = apiInstance.templateFoldersGetRootFolder(subscriptionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersGetRootFolder");
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
 **subscriptionId** | **String**|  | [optional]

### Return type

[**FileVM**](FileVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gets user&#39;s root folder (without parents) |  -  |
| **400** | Error with the request. |  -  |
| **403** | No permissions to get root folder |  -  |
| **404** | Not found subscription |  -  |


## templateFoldersMoveFolder

> FileVM templateFoldersMoveFolder(id, folderId)

Move folder to a specified folder

User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | moving folder id
        String folderId = "folderId_example"; // String | destination folder id
        try {
            FileVM result = apiInstance.templateFoldersMoveFolder(id, folderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersMoveFolder");
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
 **id** | **String**| moving folder id |
 **folderId** | **String**| destination folder id |

### Return type

[**FileVM**](FileVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Folder has been moved to a specified folder |  -  |
| **400** | folderId or parentFolderId is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |


## templateFoldersPostFolder

> FileVM templateFoldersPostFolder(id, folderVm)

Create folder

User with a Create Entity permisison can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | Identifier of parent folder id
        TemplateFolderCreateVM folderVm = new TemplateFolderCreateVM(); // TemplateFolderCreateVM | create VM
        try {
            FileVM result = apiInstance.templateFoldersPostFolder(id, folderVm);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersPostFolder");
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
 **id** | **String**| Identifier of parent folder id |
 **folderVm** | [**TemplateFolderCreateVM**](TemplateFolderCreateVM.md)| create VM | [optional]

### Return type

[**FileVM**](FileVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | New folder has been created) |  -  |
| **400** | Parent folder id is null |  -  |
| **402** | subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | parent folder/subscription not found |  -  |


## templateFoldersRenameFolder

> FileVM templateFoldersRenameFolder(id, nameModel)

Rename a folder

User with a Update Name permision can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        FolderRenameVM nameModel = new FolderRenameVM(); // FolderRenameVM | 
        try {
            FileVM result = apiInstance.templateFoldersRenameFolder(id, nameModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersRenameFolder");
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
 **nameModel** | [**FolderRenameVM**](FolderRenameVM.md)|  | [optional]

### Return type

[**FileVM**](FileVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Folder name has been updated |  -  |
| **400** | folderId is null |  -  |
| **402** | subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |


## templateFoldersUpdateIcon

> FileVM templateFoldersUpdateIcon(id, iconModel)

Update a folder&#39;s icon

User with a Update Icon permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | Identifier of folder
        FolderIconVM iconModel = new FolderIconVM(); // FolderIconVM | Update icon model
        try {
            FileVM result = apiInstance.templateFoldersUpdateIcon(id, iconModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersUpdateIcon");
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
 **id** | **String**| Identifier of folder |
 **iconModel** | [**FolderIconVM**](FolderIconVM.md)| Update icon model | [optional]

### Return type

[**FileVM**](FileVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Folder&#39;s icon has been updated |  -  |
| **400** | folderId is null |  -  |
| **402** | subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |


## templateFoldersUpdatePermissions

> templateFoldersUpdatePermissions(id, permissionsVM)

Update permissions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        UpdateFilePermissionsVM permissionsVM = new UpdateFilePermissionsVM(); // UpdateFilePermissionsVM | 
        try {
            apiInstance.templateFoldersUpdatePermissions(id, permissionsVM);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersUpdatePermissions");
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
 **permissionsVM** | [**UpdateFilePermissionsVM**](UpdateFilePermissionsVM.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |


## templateFoldersUpdateTags

> FileVM templateFoldersUpdateTags(id, tagsModel)

Update tags

User with a Update Tags permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        FolderTagsUpdateVM tagsModel = new FolderTagsUpdateVM(); // FolderTagsUpdateVM | 
        try {
            FileVM result = apiInstance.templateFoldersUpdateTags(id, tagsModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersUpdateTags");
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
 **tagsModel** | [**FolderTagsUpdateVM**](FolderTagsUpdateVM.md)|  | [optional]

### Return type

[**FileVM**](FileVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tags has been updated |  -  |
| **400** | folderId or Tags is null |  -  |
| **402** | subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |


## templatesCopyFile

> TemplateVM templatesCopyFile(id, folderId)

Copy file to a specified folder

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | file id
        String folderId = "folderId_example"; // String | folder id
        try {
            TemplateVM result = apiInstance.templatesCopyFile(id, folderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesCopyFile");
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
 **folderId** | **String**| folder id |

### Return type

[**TemplateVM**](TemplateVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | File has been copied |  -  |
| **400** | fileId or folderId is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or folder not found |  -  |
| **500** | Exception thrown |  -  |


## templatesDeleteFile

> templatesDeleteFile(id)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | file id
        try {
            apiInstance.templatesDeleteFile(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesDeleteFile");
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
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | File succesfully deleted |  -  |
| **400** | Id is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File not found |  -  |
| **500** | Exception thrown |  -  |


## templatesExport

> ExportVM templatesExport(id, exportTask)

Export specified report template to a specified format

User with Execute Export permission on prepared report and  Create Entity on an export folder can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | report id
        ExportTemplateTaskVM exportTask = new ExportTemplateTaskVM(); // ExportTemplateTaskVM | export parameters (string only)
        try {
            ExportVM result = apiInstance.templatesExport(id, exportTask);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesExport");
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
 **id** | **String**| report id |
 **exportTask** | [**ExportTemplateTaskVM**](ExportTemplateTaskVM.md)| export parameters (string only) | [optional]

### Return type

[**ExportVM**](ExportVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Specified report has been exported |  -  |
| **400** | Report Id is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Exports folder not found |  -  |


## templatesGetFile

> TemplateVM templatesGetFile(id)

Get specified file

User with Get Entity permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | file id
        try {
            TemplateVM result = apiInstance.templatesGetFile(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesGetFile");
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

[**TemplateVM**](TemplateVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the specified file |  -  |
| **400** | Id is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File not found |  -  |
| **500** | Exception thrown |  -  |


## templatesGetFilesCount

> CountVM templatesGetFilesCount(id)

Get count of files what contains in a specified folder

User with Get Count permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        try {
            CountVM result = apiInstance.templatesGetFilesCount(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesGetFilesCount");
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

[**CountVM**](CountVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns count of the files in a specified folder |  -  |
| **400** | FolderId is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |
| **500** | Exception thrown |  -  |


## templatesGetFilesList

> TemplatesVM templatesGetFilesList(id, skip, take)

Get all files from specified folder

User with Get Entity permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        Integer skip = 0; // Integer | number of files, that have to be skipped
        Integer take = 10; // Integer | number of files, that have to be returned
        try {
            TemplatesVM result = apiInstance.templatesGetFilesList(id, skip, take);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesGetFilesList");
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
 **skip** | **Integer**| number of files, that have to be skipped | [optional] [default to 0]
 **take** | **Integer**| number of files, that have to be returned | [optional] [default to 10]

### Return type

[**TemplatesVM**](TemplatesVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns list of the files from a specified folder |  -  |
| **400** | FolderId is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or folder not found |  -  |
| **500** | Exception thrown |  -  |


## templatesGetPermissions

> FilePermissionsVM templatesGetPermissions(id)

Get all file permissions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            FilePermissionsVM result = apiInstance.templatesGetPermissions(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesGetPermissions");
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
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | got permissions successfully |  -  |
| **400** | id is not valid |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | file is not found |  -  |


## templatesMoveFile

> TemplateVM templatesMoveFile(id, folderId)

Move file to a specified folder

User with Update Place permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | file id
        String folderId = "folderId_example"; // String | folder id
        try {
            TemplateVM result = apiInstance.templatesMoveFile(id, folderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesMoveFile");
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
 **folderId** | **String**| folder id |

### Return type

[**TemplateVM**](TemplateVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | File has been moved |  -  |
| **400** | fileId or folderId is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or folder not found |  -  |
| **500** | Exception thrown |  -  |


## templatesPrepare

> ReportVM templatesPrepare(id, prepareTask)

Prepare specified template to report

User with Execute Prepare permission on report and   Create Entity on a prepared report folder can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | template id
        PrepareTemplateTaskVM prepareTask = new PrepareTemplateTaskVM(); // PrepareTemplateTaskVM | Template prepare view model
        try {
            ReportVM result = apiInstance.templatesPrepare(id, prepareTask);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesPrepare");
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
 **id** | **String**| template id |
 **prepareTask** | [**PrepareTemplateTaskVM**](PrepareTemplateTaskVM.md)| Template prepare view model | [optional]

### Return type

[**ReportVM**](ReportVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Specified template has been prepared |  -  |
| **400** | Report Id is null |  -  |
| **402** | subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Template or folder not found |  -  |


## templatesRenameFile

> TemplateVM templatesRenameFile(id, nameModel)

Rename a file

User with Update Name permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        FileRenameVM nameModel = new FileRenameVM(); // FileRenameVM | 
        try {
            TemplateVM result = apiInstance.templatesRenameFile(id, nameModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesRenameFile");
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
 **nameModel** | [**FileRenameVM**](FileRenameVM.md)|  | [optional]

### Return type

[**TemplateVM**](TemplateVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | File name has been updated |  -  |
| **400** | FileId is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File not found |  -  |
| **500** | Exception thrown |  -  |


## templatesUpdateIcon

> TemplateVM templatesUpdateIcon(id, iconModel)

Update a files&#39;s icon

User with Update Icon permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        FileIconVM iconModel = new FileIconVM(); // FileIconVM | 
        try {
            TemplateVM result = apiInstance.templatesUpdateIcon(id, iconModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesUpdateIcon");
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
 **iconModel** | [**FileIconVM**](FileIconVM.md)|  | [optional]

### Return type

[**TemplateVM**](TemplateVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | File&#39;s icon has been updated |  -  |
| **400** | FileId is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File not found |  -  |
| **500** | Exception thrown |  -  |


## templatesUpdatePermissions

> templatesUpdatePermissions(id, permissionsVM)

Update permissions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        UpdateFilePermissionsVM permissionsVM = new UpdateFilePermissionsVM(); // UpdateFilePermissionsVM | 
        try {
            apiInstance.templatesUpdatePermissions(id, permissionsVM);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesUpdatePermissions");
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
 **permissionsVM** | [**UpdateFilePermissionsVM**](UpdateFilePermissionsVM.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |


## templatesUpdateTags

> TemplateVM templatesUpdateTags(id, tagsModel)

Update tags

User with Update Tags permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        FileTagsUpdateVM tagsModel = new FileTagsUpdateVM(); // FileTagsUpdateVM | 
        try {
            TemplateVM result = apiInstance.templatesUpdateTags(id, tagsModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesUpdateTags");
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
 **tagsModel** | [**FileTagsUpdateVM**](FileTagsUpdateVM.md)|  | [optional]

### Return type

[**TemplateVM**](TemplateVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tags has been updated |  -  |
| **400** | FileId is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File not found |  -  |
| **500** | Exception thrown |  -  |


## templatesUploadFile

> TemplateVM templatesUploadFile(id, fileVM)

Upload a file to the specified folder  !

User with Create Entity permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | Identifier of folder
        TemplateCreateVM fileVM = new TemplateCreateVM(); // TemplateCreateVM | file's view model
        try {
            TemplateVM result = apiInstance.templatesUploadFile(id, fileVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesUploadFile");
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
 **id** | **String**| Identifier of folder |
 **fileVM** | [**TemplateCreateVM**](TemplateCreateVM.md)| file&#39;s view model | [optional]

### Return type

[**TemplateVM**](TemplateVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json, text/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | File has been uploaded |  -  |
| **400** | fileVM view model is not valid |  -  |
| **402** | Client Error |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Not Found |  -  |

