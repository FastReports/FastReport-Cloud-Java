# AdminTemplatesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminTemplateFoldersDeleteFolder**](AdminTemplatesApi.md#adminTemplateFoldersDeleteFolder) | **DELETE** /api/admin/v1/TemplateFolders/{id} | Delete specified folder
[**adminTemplateFoldersGetFolder**](AdminTemplatesApi.md#adminTemplateFoldersGetFolder) | **GET** /api/admin/v1/TemplateFolders/{id} | Returns a folder by id
[**adminTemplateFoldersGetFolders**](AdminTemplatesApi.md#adminTemplateFoldersGetFolders) | **GET** /api/admin/v1/TemplateFolders | Returns a list of folders
[**adminTemplateFoldersGetPermissions**](AdminTemplatesApi.md#adminTemplateFoldersGetPermissions) | **GET** /api/admin/v1/TemplateFolders/{id}/permissions | Get all folder permissions
[**adminTemplateFoldersPostFolder**](AdminTemplatesApi.md#adminTemplateFoldersPostFolder) | **POST** /api/admin/v1/TemplateFolders | Create a folder
[**adminTemplateFoldersUpdateFolder**](AdminTemplatesApi.md#adminTemplateFoldersUpdateFolder) | **PUT** /api/admin/v1/TemplateFolders/{id} | Update a folder
[**adminTemplateFoldersUpdatePermissions**](AdminTemplatesApi.md#adminTemplateFoldersUpdatePermissions) | **POST** /api/admin/v1/TemplateFolders/{id}/permissions | Revoke permission
[**adminTemplatesDeleteFile**](AdminTemplatesApi.md#adminTemplatesDeleteFile) | **DELETE** /api/admin/v1/Templates/{id} | Delete specified file
[**adminTemplatesGetFile**](AdminTemplatesApi.md#adminTemplatesGetFile) | **GET** /api/admin/v1/Templates/{id} | Returns a file by id
[**adminTemplatesGetFiles**](AdminTemplatesApi.md#adminTemplatesGetFiles) | **GET** /api/admin/v1/Templates | Returns a list of files
[**adminTemplatesGetPermissions**](AdminTemplatesApi.md#adminTemplatesGetPermissions) | **GET** /api/admin/v1/Templates/{id}/permissions | Get all file permissions
[**adminTemplatesUpdateFile**](AdminTemplatesApi.md#adminTemplatesUpdateFile) | **PUT** /api/admin/v1/Templates/{id} | Update a file
[**adminTemplatesUpdatePermissions**](AdminTemplatesApi.md#adminTemplatesUpdatePermissions) | **POST** /api/admin/v1/Templates/{id}/permissions | Update permissions to file
[**adminTemplatesUploadFile**](AdminTemplatesApi.md#adminTemplatesUploadFile) | **POST** /api/admin/v1/Templates | Upload a file to the specified folder



## adminTemplateFoldersDeleteFolder

> adminTemplateFoldersDeleteFolder(id, recursive)

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
import cloud.fastreport.client.AdminTemplatesApi;

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

        AdminTemplatesApi apiInstance = new AdminTemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        Boolean recursive = true; // Boolean | delete folder's content
        try {
            apiInstance.adminTemplateFoldersDeleteFolder(id, recursive);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminTemplatesApi#adminTemplateFoldersDeleteFolder");
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


## adminTemplateFoldersGetFolder

> FileVM adminTemplateFoldersGetFolder(id)

Returns a folder by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminTemplatesApi;

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

        AdminTemplatesApi apiInstance = new AdminTemplatesApi(defaultClient);
        String id = "id_example"; // String | Identifier of a folder
        try {
            FileVM result = apiInstance.adminTemplateFoldersGetFolder(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminTemplatesApi#adminTemplateFoldersGetFolder");
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


## adminTemplateFoldersGetFolders

> FilesVM adminTemplateFoldersGetFolders(skip, take, subscriptionId)

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
import cloud.fastreport.client.AdminTemplatesApi;

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

        AdminTemplatesApi apiInstance = new AdminTemplatesApi(defaultClient);
        Integer skip = 0; // Integer | Variable for pagination, defautl value is 0
        Integer take = 10; // Integer | Variable for pagination, default value is 10
        String subscriptionId = "subscriptionId_example"; // String | Allows to filter by subscriptions ID
        try {
            FilesVM result = apiInstance.adminTemplateFoldersGetFolders(skip, take, subscriptionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminTemplatesApi#adminTemplateFoldersGetFolders");
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


## adminTemplateFoldersGetPermissions

> FilePermissionsVM adminTemplateFoldersGetPermissions(id)

Get all folder permissions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminTemplatesApi;

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

        AdminTemplatesApi apiInstance = new AdminTemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        try {
            FilePermissionsVM result = apiInstance.adminTemplateFoldersGetPermissions(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminTemplatesApi#adminTemplateFoldersGetPermissions");
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


## adminTemplateFoldersPostFolder

> FileVM adminTemplateFoldersPostFolder(folderVm)

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
import cloud.fastreport.client.AdminTemplatesApi;

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

        AdminTemplatesApi apiInstance = new AdminTemplatesApi(defaultClient);
        AdminTemplateFolderCreateVM folderVm = new AdminTemplateFolderCreateVM(); // AdminTemplateFolderCreateVM | folder create vm
        try {
            FileVM result = apiInstance.adminTemplateFoldersPostFolder(folderVm);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminTemplatesApi#adminTemplateFoldersPostFolder");
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
 **folderVm** | [**AdminTemplateFolderCreateVM**](AdminTemplateFolderCreateVM.md)| folder create vm | [optional]

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


## adminTemplateFoldersUpdateFolder

> FileVM adminTemplateFoldersUpdateFolder(id, folderVM)

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
import cloud.fastreport.client.AdminTemplatesApi;

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

        AdminTemplatesApi apiInstance = new AdminTemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        FileUpdateVM folderVM = new FileUpdateVM(); // FileUpdateVM | folder's view model
        try {
            FileVM result = apiInstance.adminTemplateFoldersUpdateFolder(id, folderVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminTemplatesApi#adminTemplateFoldersUpdateFolder");
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


## adminTemplateFoldersUpdatePermissions

> adminTemplateFoldersUpdatePermissions(id, newPermissions)

Revoke permission

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminTemplatesApi;

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

        AdminTemplatesApi apiInstance = new AdminTemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        UpdateFilePermissionsVM newPermissions = new UpdateFilePermissionsVM(); // UpdateFilePermissionsVM | 
        try {
            apiInstance.adminTemplateFoldersUpdatePermissions(id, newPermissions);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminTemplatesApi#adminTemplateFoldersUpdatePermissions");
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


## adminTemplatesDeleteFile

> adminTemplatesDeleteFile(id)

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
import cloud.fastreport.client.AdminTemplatesApi;

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

        AdminTemplatesApi apiInstance = new AdminTemplatesApi(defaultClient);
        String id = "id_example"; // String | file id
        try {
            apiInstance.adminTemplatesDeleteFile(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminTemplatesApi#adminTemplatesDeleteFile");
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


## adminTemplatesGetFile

> TemplateVM adminTemplatesGetFile(id)

Returns a file by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminTemplatesApi;

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

        AdminTemplatesApi apiInstance = new AdminTemplatesApi(defaultClient);
        String id = "id_example"; // String | Identifier of file
        try {
            TemplateVM result = apiInstance.adminTemplatesGetFile(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminTemplatesApi#adminTemplatesGetFile");
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

[**TemplateVM**](TemplateVM.md)

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


## adminTemplatesGetFiles

> TemplatesVM adminTemplatesGetFiles(skip, take, subscriptionId)

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
import cloud.fastreport.client.AdminTemplatesApi;

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

        AdminTemplatesApi apiInstance = new AdminTemplatesApi(defaultClient);
        Integer skip = 0; // Integer | Variable for pagination, defautl value is 0
        Integer take = 10; // Integer | Variable for pagination, default value is 10
        String subscriptionId = "subscriptionId_example"; // String | Subscription Id
        try {
            TemplatesVM result = apiInstance.adminTemplatesGetFiles(skip, take, subscriptionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminTemplatesApi#adminTemplatesGetFiles");
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

[**TemplatesVM**](TemplatesVM.md)

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


## adminTemplatesGetPermissions

> FilePermissionsVM adminTemplatesGetPermissions(id)

Get all file permissions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminTemplatesApi;

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

        AdminTemplatesApi apiInstance = new AdminTemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            FilePermissionsVM result = apiInstance.adminTemplatesGetPermissions(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminTemplatesApi#adminTemplatesGetPermissions");
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


## adminTemplatesUpdateFile

> TemplateVM adminTemplatesUpdateFile(id, fileVM)

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
import cloud.fastreport.client.AdminTemplatesApi;

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

        AdminTemplatesApi apiInstance = new AdminTemplatesApi(defaultClient);
        String id = "id_example"; // String | file id
        FileUpdateVM fileVM = new FileUpdateVM(); // FileUpdateVM | file's view model
        try {
            TemplateVM result = apiInstance.adminTemplatesUpdateFile(id, fileVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminTemplatesApi#adminTemplatesUpdateFile");
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

[**TemplateVM**](TemplateVM.md)

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


## adminTemplatesUpdatePermissions

> adminTemplatesUpdatePermissions(id, newPermissions)

Update permissions to file

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminTemplatesApi;

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

        AdminTemplatesApi apiInstance = new AdminTemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        UpdateFilePermissionsVM newPermissions = new UpdateFilePermissionsVM(); // UpdateFilePermissionsVM | 
        try {
            apiInstance.adminTemplatesUpdatePermissions(id, newPermissions);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminTemplatesApi#adminTemplatesUpdatePermissions");
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


## adminTemplatesUploadFile

> TemplateVM adminTemplatesUploadFile(fileVM)

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
import cloud.fastreport.client.AdminTemplatesApi;

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

        AdminTemplatesApi apiInstance = new AdminTemplatesApi(defaultClient);
        TemplateCreateAdminVM fileVM = new TemplateCreateAdminVM(); // TemplateCreateAdminVM | file's view model
        try {
            TemplateVM result = apiInstance.adminTemplatesUploadFile(fileVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminTemplatesApi#adminTemplatesUploadFile");
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
 **fileVM** | [**TemplateCreateAdminVM**](TemplateCreateAdminVM.md)| file&#39;s view model | [optional]

### Return type

[**TemplateVM**](TemplateVM.md)

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

