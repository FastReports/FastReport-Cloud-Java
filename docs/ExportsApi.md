# ExportsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exportFolderAndFileClearRecycleBin**](ExportsApi.md#exportFolderAndFileClearRecycleBin) | **DELETE** /api/rp/v1/Exports/{subscriptionId}/ClearRecycleBin | Delete all folders and files from recycle bin |
| [**exportFolderAndFileCopyFiles**](ExportsApi.md#exportFolderAndFileCopyFiles) | **POST** /api/rp/v1/Exports/{subscriptionId}/CopyFiles | Copy folders and files to a specified folder |
| [**exportFolderAndFileDeleteFiles**](ExportsApi.md#exportFolderAndFileDeleteFiles) | **POST** /api/rp/v1/Exports/{subscriptionId}/DeleteFiles | Delete folders and files |
| [**exportFolderAndFileGetCount**](ExportsApi.md#exportFolderAndFileGetCount) | **GET** /api/rp/v1/Exports/Folder/{id}/CountFolderAndFiles | Get count of files and folders what contains in a specified folder |
| [**exportFolderAndFileGetFoldersAndFiles**](ExportsApi.md#exportFolderAndFileGetFoldersAndFiles) | **GET** /api/rp/v1/Exports/Folder/{id}/ListFolderAndFiles | Get all folders and files from specified folder |
| [**exportFolderAndFileGetRecycleBinFoldersAndFiles**](ExportsApi.md#exportFolderAndFileGetRecycleBinFoldersAndFiles) | **GET** /api/rp/v1/Exports/{subscriptionId}/ListRecycleBinFolderAndFiles | Get all folders and files from recycle bin |
| [**exportFolderAndFileMoveFiles**](ExportsApi.md#exportFolderAndFileMoveFiles) | **POST** /api/rp/v1/Exports/{subscriptionId}/MoveFiles | Move folders and files to a specified folder |
| [**exportFolderAndFileMoveFilesToBin**](ExportsApi.md#exportFolderAndFileMoveFilesToBin) | **POST** /api/rp/v1/Exports/{subscriptionId}/ToBin | Move folders and files to bin |
| [**exportFolderAndFileRecoverAllFromRecycleBin**](ExportsApi.md#exportFolderAndFileRecoverAllFromRecycleBin) | **POST** /api/rp/v1/Exports/{subscriptionId}/RecoverRecycleBin | Recover all folders and files from recycle bin |
| [**exportFolderAndFileRecoverFiles**](ExportsApi.md#exportFolderAndFileRecoverFiles) | **POST** /api/rp/v1/Exports/{subscriptionId}/RecoverFiles | Recover folders and files from bin |
| [**exportFoldersCalculateFolderSize**](ExportsApi.md#exportFoldersCalculateFolderSize) | **GET** /api/rp/v1/Exports/Folder/{id}/size | Get specified folder, calculate it&#39;s size |
| [**exportFoldersCopyFolder**](ExportsApi.md#exportFoldersCopyFolder) | **POST** /api/rp/v1/Exports/Folder/{id}/Copy/{folderId} | Move folder to a specified folder |
| [**exportFoldersDeleteFolder**](ExportsApi.md#exportFoldersDeleteFolder) | **DELETE** /api/rp/v1/Exports/Folder/{id} | Delete specified folder |
| [**exportFoldersGetBreadcrumbs**](ExportsApi.md#exportFoldersGetBreadcrumbs) | **GET** /api/rp/v1/Exports/Folder/{id}/Breadcrumbs | Get specified folder breadcrumbs |
| [**exportFoldersGetFolder**](ExportsApi.md#exportFoldersGetFolder) | **GET** /api/rp/v1/Exports/Folder/{id} | Get specified folder |
| [**exportFoldersGetFolders**](ExportsApi.md#exportFoldersGetFolders) | **GET** /api/rp/v1/Exports/Folder/{id}/ListFolders | Get all folders from specified folder |
| [**exportFoldersGetFoldersCount**](ExportsApi.md#exportFoldersGetFoldersCount) | **GET** /api/rp/v1/Exports/Folder/{id}/CountFolders | Get count of folders what contains in a specified folder |
| [**exportFoldersGetOrCreate**](ExportsApi.md#exportFoldersGetOrCreate) | **GET** /api/rp/v1/Exports/Folder/getOrCreate | Get specified folder |
| [**exportFoldersGetPermissions**](ExportsApi.md#exportFoldersGetPermissions) | **GET** /api/rp/v1/Exports/Folder/{id}/permissions | Get all folder permissions |
| [**exportFoldersGetRootFolder**](ExportsApi.md#exportFoldersGetRootFolder) | **GET** /api/rp/v1/Exports/Root | Get user&#39;s root folder (without parents) |
| [**exportFoldersMoveFolder**](ExportsApi.md#exportFoldersMoveFolder) | **POST** /api/rp/v1/Exports/Folder/{id}/Move/{folderId} | Move folder to a specified folder |
| [**exportFoldersMoveFolderToBin**](ExportsApi.md#exportFoldersMoveFolderToBin) | **DELETE** /api/rp/v1/Exports/Folder/{id}/ToBin | Move specified folder to recycle bin |
| [**exportFoldersPostFolder**](ExportsApi.md#exportFoldersPostFolder) | **POST** /api/rp/v1/Exports/Folder/{id}/Folder | Create folder |
| [**exportFoldersRecoverFolder**](ExportsApi.md#exportFoldersRecoverFolder) | **POST** /api/rp/v1/Exports/Folder/{id}/Recover | Recover specified folder |
| [**exportFoldersRenameFolder**](ExportsApi.md#exportFoldersRenameFolder) | **PUT** /api/rp/v1/Exports/Folder/{id}/Rename | Rename a folder |
| [**exportFoldersUpdateIcon**](ExportsApi.md#exportFoldersUpdateIcon) | **PUT** /api/rp/v1/Exports/Folder/{id}/Icon | Update a folder&#39;s icon |
| [**exportFoldersUpdatePermissions**](ExportsApi.md#exportFoldersUpdatePermissions) | **POST** /api/rp/v1/Exports/{id}/permissions | Update permissions |
| [**exportFoldersUpdateTags**](ExportsApi.md#exportFoldersUpdateTags) | **PUT** /api/rp/v1/Exports/Folder/{id}/UpdateTags | Update tags |
| [**exportsCopyFile**](ExportsApi.md#exportsCopyFile) | **POST** /api/rp/v1/Exports/File/{id}/Copy/{folderId} | Copy file to a specified folder |
| [**exportsDeleteFile**](ExportsApi.md#exportsDeleteFile) | **DELETE** /api/rp/v1/Exports/File/{id} | Delete specified file |
| [**exportsGetFile**](ExportsApi.md#exportsGetFile) | **GET** /api/rp/v1/Exports/File/{id} | Get export by specified id |
| [**exportsGetFileHistory**](ExportsApi.md#exportsGetFileHistory) | **GET** /api/rp/v1/Exports/File/{id}/History | Returns list of actions, performed on this file |
| [**exportsGetFilesCount**](ExportsApi.md#exportsGetFilesCount) | **GET** /api/rp/v1/Exports/Folder/{id}/CountFiles | Get count of files what contains in a specified folder |
| [**exportsGetFilesList**](ExportsApi.md#exportsGetFilesList) | **GET** /api/rp/v1/Exports/Folder/{id}/ListFiles | Get all files from specified folder. &lt;br /&gt;  User with Get Entity permission can access this method. &lt;br /&gt;  The method will returns minimal infomration about the file: &lt;br /&gt;  id, name, size, editedTime, createdTime, tags, status, statusReason. |
| [**exportsGetPermissions**](ExportsApi.md#exportsGetPermissions) | **GET** /api/rp/v1/Exports/File/{id}/permissions |  |
| [**exportsMoveFile**](ExportsApi.md#exportsMoveFile) | **POST** /api/rp/v1/Exports/File/{id}/Move/{folderId} | Move file to a specified folder |
| [**exportsMoveFileToBin**](ExportsApi.md#exportsMoveFileToBin) | **DELETE** /api/rp/v1/Exports/File/{id}/ToBin | Move specified file to recycle bin |
| [**exportsRecoverFile**](ExportsApi.md#exportsRecoverFile) | **POST** /api/rp/v1/Exports/File/{id}/Recover | Recover specified file from bin |
| [**exportsRenameFile**](ExportsApi.md#exportsRenameFile) | **PUT** /api/rp/v1/Exports/File/{id}/Rename | Rename a file |
| [**exportsUpdateIcon**](ExportsApi.md#exportsUpdateIcon) | **PUT** /api/rp/v1/Exports/File/{id}/Icon | Update a files&#39;s icon |
| [**exportsUpdatePermissions**](ExportsApi.md#exportsUpdatePermissions) | **POST** /api/rp/v1/Exports/File/{id}/permissions | Update permissions |
| [**exportsUpdateTags**](ExportsApi.md#exportsUpdateTags) | **PUT** /api/rp/v1/Exports/File/{id}/UpdateTags | Update tags |


<a id="exportFolderAndFileClearRecycleBin"></a>
# **exportFolderAndFileClearRecycleBin**
> exportFolderAndFileClearRecycleBin(subscriptionId)

Delete all folders and files from recycle bin

User with a Delete RecycleBin permission can access this method.

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | subscription id
    try {
      apiInstance.exportFolderAndFileClearRecycleBin(subscriptionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFolderAndFileClearRecycleBin");
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
| **subscriptionId** | **String**| subscription id | |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | All folders and files in bin have been deleted |  -  |
| **400** | Subscription id is not valid |  -  |
| **402** | Payment required, subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Subscription not found |  -  |

<a id="exportFolderAndFileCopyFiles"></a>
# **exportFolderAndFileCopyFiles**
> exportFolderAndFileCopyFiles(subscriptionId, selectedFilesVM)

Copy folders and files to a specified folder

User with a Get permission for a files and Create permission for a destination folder can access this method.

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | id of current subscription
    SelectedFilesVM selectedFilesVM = new SelectedFilesVM(); // SelectedFilesVM | VM with files' ids and params of their destination
    try {
      apiInstance.exportFolderAndFileCopyFiles(subscriptionId, selectedFilesVM);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFolderAndFileCopyFiles");
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
| **subscriptionId** | **String**| id of current subscription | |
| **selectedFilesVM** | [**SelectedFilesVM**](SelectedFilesVM.md)| VM with files&#39; ids and params of their destination | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | All folders and files have been copied |  -  |
| **400** | FolderId is null |  -  |
| **402** | Payment required, subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or folder not found |  -  |
| **500** | Server Error |  -  |

<a id="exportFolderAndFileDeleteFiles"></a>
# **exportFolderAndFileDeleteFiles**
> exportFolderAndFileDeleteFiles(subscriptionId, selectedFilesVM)

Delete folders and files

User with a Delete permission can access this method.

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | id of current subscription
    SelectedFilesVM selectedFilesVM = new SelectedFilesVM(); // SelectedFilesVM | VM with files' ids and params of their destination
    try {
      apiInstance.exportFolderAndFileDeleteFiles(subscriptionId, selectedFilesVM);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFolderAndFileDeleteFiles");
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
| **subscriptionId** | **String**| id of current subscription | |
| **selectedFilesVM** | [**SelectedFilesVM**](SelectedFilesVM.md)| VM with files&#39; ids and params of their destination | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | All folders and files have been deleted |  -  |
| **400** | Subscription id or VM is not valid |  -  |
| **402** | Payment required, subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Subscription not found |  -  |

<a id="exportFolderAndFileGetCount"></a>
# **exportFolderAndFileGetCount**
> CountVM exportFolderAndFileGetCount(id, searchPattern, useRegex)

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
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | folder id
    String searchPattern = "searchPattern_example"; // String | string, that must be incuded in file or folder name to be counted <br />              (leave undefined to count all files and folders)
    Boolean useRegex = false; // Boolean | set this to true if you want to use regular expression to search
    try {
      CountVM result = apiInstance.exportFolderAndFileGetCount(id, searchPattern, useRegex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFolderAndFileGetCount");
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
| **id** | **String**| folder id | |
| **searchPattern** | **String**| string, that must be incuded in file or folder name to be counted &lt;br /&gt;              (leave undefined to count all files and folders) | [optional] |
| **useRegex** | **Boolean**| set this to true if you want to use regular expression to search | [optional] [default to false] |

### Return type

[**CountVM**](CountVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns count of the files in a specified folder |  -  |
| **400** | Params are not valid |  -  |
| **402** | Payment required, subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder or subscription not found |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="exportFolderAndFileGetFoldersAndFiles"></a>
# **exportFolderAndFileGetFoldersAndFiles**
> FilesVM exportFolderAndFileGetFoldersAndFiles(id, skip, take, orderBy, desc, searchPattern, useRegex)

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
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | folder id
    Integer skip = 0; // Integer | number of folder and files, that have to be skipped
    Integer take = 10; // Integer | number of folder and files, that have to be returned
    FileSorting orderBy = FileSorting.fromValue("None"); // FileSorting | indicates a field to sort by
    Boolean desc = false; // Boolean | indicates if sorting is descending
    String searchPattern = ""; // String | 
    Boolean useRegex = false; // Boolean | 
    try {
      FilesVM result = apiInstance.exportFolderAndFileGetFoldersAndFiles(id, skip, take, orderBy, desc, searchPattern, useRegex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFolderAndFileGetFoldersAndFiles");
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
| **id** | **String**| folder id | |
| **skip** | **Integer**| number of folder and files, that have to be skipped | [optional] [default to 0] |
| **take** | **Integer**| number of folder and files, that have to be returned | [optional] [default to 10] |
| **orderBy** | [**FileSorting**](.md)| indicates a field to sort by | [optional] [enum: None, CreatedTime, EditedTime, Size, Name] |
| **desc** | **Boolean**| indicates if sorting is descending | [optional] [default to false] |
| **searchPattern** | **String**|  | [optional] [default to ] |
| **useRegex** | **Boolean**|  | [optional] [default to false] |

### Return type

[**FilesVM**](FilesVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns list of the files from a specified folder |  -  |
| **400** | Params are not valid |  -  |
| **402** | Payment required, subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Subscription or folder not found |  -  |

<a id="exportFolderAndFileGetRecycleBinFoldersAndFiles"></a>
# **exportFolderAndFileGetRecycleBinFoldersAndFiles**
> FilesVM exportFolderAndFileGetRecycleBinFoldersAndFiles(subscriptionId, skip, take, orderBy, desc, searchPattern, useRegex)

Get all folders and files from recycle bin

User with a Get DeletedFiles permission can access this method.

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | subscription id
    Integer skip = 0; // Integer | number of folder and files, that have to be skipped
    Integer take = 10; // Integer | number of folder and files, that have to be returned
    FileSorting orderBy = FileSorting.fromValue("None"); // FileSorting | indicates a field to sort by
    Boolean desc = false; // Boolean | indicates if sorting is descending
    String searchPattern = ""; // String | 
    Boolean useRegex = false; // Boolean | 
    try {
      FilesVM result = apiInstance.exportFolderAndFileGetRecycleBinFoldersAndFiles(subscriptionId, skip, take, orderBy, desc, searchPattern, useRegex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFolderAndFileGetRecycleBinFoldersAndFiles");
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
| **subscriptionId** | **String**| subscription id | |
| **skip** | **Integer**| number of folder and files, that have to be skipped | [optional] [default to 0] |
| **take** | **Integer**| number of folder and files, that have to be returned | [optional] [default to 10] |
| **orderBy** | [**FileSorting**](.md)| indicates a field to sort by | [optional] [enum: None, CreatedTime, EditedTime, Size, Name] |
| **desc** | **Boolean**| indicates if sorting is descending | [optional] [default to false] |
| **searchPattern** | **String**|  | [optional] [default to ] |
| **useRegex** | **Boolean**|  | [optional] [default to false] |

### Return type

[**FilesVM**](FilesVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns list of the files from a specified folder |  -  |
| **400** | Params are not valid |  -  |
| **402** | Payment required, subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Subscription not found |  -  |

<a id="exportFolderAndFileMoveFiles"></a>
# **exportFolderAndFileMoveFiles**
> exportFolderAndFileMoveFiles(subscriptionId, selectedFilesVM)

Move folders and files to a specified folder

User with a Update Place permission for a files and Create permission for a destination folder can access this method.

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | id of current subscription
    SelectedFilesVM selectedFilesVM = new SelectedFilesVM(); // SelectedFilesVM | VM with files' ids and params of their destination
    try {
      apiInstance.exportFolderAndFileMoveFiles(subscriptionId, selectedFilesVM);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFolderAndFileMoveFiles");
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
| **subscriptionId** | **String**| id of current subscription | |
| **selectedFilesVM** | [**SelectedFilesVM**](SelectedFilesVM.md)| VM with files&#39; ids and params of their destination | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | All folders and files have been moved |  -  |
| **400** | FolderId is null |  -  |
| **402** | Payment required, subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or folder not found |  -  |
| **500** | Server Error |  -  |

<a id="exportFolderAndFileMoveFilesToBin"></a>
# **exportFolderAndFileMoveFilesToBin**
> exportFolderAndFileMoveFilesToBin(subscriptionId, selectedFilesVM)

Move folders and files to bin

User with a Delete permission can access this method.

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | id of current subscription
    SelectedFilesVM selectedFilesVM = new SelectedFilesVM(); // SelectedFilesVM | VM with files' ids and params of their destination
    try {
      apiInstance.exportFolderAndFileMoveFilesToBin(subscriptionId, selectedFilesVM);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFolderAndFileMoveFilesToBin");
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
| **subscriptionId** | **String**| id of current subscription | |
| **selectedFilesVM** | [**SelectedFilesVM**](SelectedFilesVM.md)| VM with files&#39; ids and params of their destination | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | All folders and files have been moved to bin |  -  |
| **400** | Subscription id or VM is not valid |  -  |
| **402** | Payment required, subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Subscription not found |  -  |

<a id="exportFolderAndFileRecoverAllFromRecycleBin"></a>
# **exportFolderAndFileRecoverAllFromRecycleBin**
> exportFolderAndFileRecoverAllFromRecycleBin(subscriptionId)

Recover all folders and files from recycle bin

User with a Create RecycleBin permission can access this method.

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | subscription id
    try {
      apiInstance.exportFolderAndFileRecoverAllFromRecycleBin(subscriptionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFolderAndFileRecoverAllFromRecycleBin");
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
| **subscriptionId** | **String**| subscription id | |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | All folders and files in bin have been restored |  -  |
| **400** | Subscription id is not valid |  -  |
| **402** | Payment required, subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Subscription not found |  -  |

<a id="exportFolderAndFileRecoverFiles"></a>
# **exportFolderAndFileRecoverFiles**
> exportFolderAndFileRecoverFiles(subscriptionId, selectedFilesVM)

Recover folders and files from bin

User with a SubscriptionCreate permission can access this method.

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | id of current subscription
    SelectedFilesVM selectedFilesVM = new SelectedFilesVM(); // SelectedFilesVM | VM with files' ids and params of their destination
    try {
      apiInstance.exportFolderAndFileRecoverFiles(subscriptionId, selectedFilesVM);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFolderAndFileRecoverFiles");
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
| **subscriptionId** | **String**| id of current subscription | |
| **selectedFilesVM** | [**SelectedFilesVM**](SelectedFilesVM.md)| VM with files&#39; ids and params of their destination | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | All folders and files have been recovered |  -  |
| **400** | Subscription id or VM is not valid |  -  |
| **402** | Payment required, subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Subscription not found |  -  |

<a id="exportFoldersCalculateFolderSize"></a>
# **exportFoldersCalculateFolderSize**
> FolderSizeVM exportFoldersCalculateFolderSize(id)

Get specified folder, calculate it&#39;s size

User with a Get Entity permission can access this method.

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | folder id
    try {
      FolderSizeVM result = apiInstance.exportFoldersCalculateFolderSize(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFoldersCalculateFolderSize");
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
| **id** | **String**| folder id | |

### Return type

[**FolderSizeVM**](FolderSizeVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns specified folder |  -  |
| **400** | Id is null |  -  |
| **402** | Subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder or subscription not found |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="exportFoldersCopyFolder"></a>
# **exportFoldersCopyFolder**
> FileVM exportFoldersCopyFolder(id, folderId)

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
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | moving folder id
    String folderId = "folderId_example"; // String | destination folder id
    try {
      FileVM result = apiInstance.exportFoldersCopyFolder(id, folderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFoldersCopyFolder");
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
| **id** | **String**| moving folder id | |
| **folderId** | **String**| destination folder id | |

### Return type

[**FileVM**](FileVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Folder has been moved to a specified folder |  -  |
| **400** | folderId or parentFolderId is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder or subscription not found |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="exportFoldersDeleteFolder"></a>
# **exportFoldersDeleteFolder**
> exportFoldersDeleteFolder(id)

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
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | folder id
    try {
      apiInstance.exportFoldersDeleteFolder(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFoldersDeleteFolder");
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
| **id** | **String**| folder id | |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Folder succesfully deleted |  -  |
| **400** | Id is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder or subscription not found |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="exportFoldersGetBreadcrumbs"></a>
# **exportFoldersGetBreadcrumbs**
> BreadcrumbsVM exportFoldersGetBreadcrumbs(id)

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
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | folder id
    try {
      BreadcrumbsVM result = apiInstance.exportFoldersGetBreadcrumbs(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFoldersGetBreadcrumbs");
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
| **id** | **String**| folder id | |

### Return type

[**BreadcrumbsVM**](BreadcrumbsVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns breadcrumbs parents list (starts from root folder) |  -  |
| **400** | folderId is null |  -  |
| **402** | Subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder or subscription not found |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="exportFoldersGetFolder"></a>
# **exportFoldersGetFolder**
> FileVM exportFoldersGetFolder(id)

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
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | folder id
    try {
      FileVM result = apiInstance.exportFoldersGetFolder(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFoldersGetFolder");
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
| **id** | **String**| folder id | |

### Return type

[**FileVM**](FileVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns specified folder |  -  |
| **400** | Id is null |  -  |
| **402** | Subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder or subscription not found |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="exportFoldersGetFolders"></a>
# **exportFoldersGetFolders**
> FilesVM exportFoldersGetFolders(id, skip, take, orderBy, desc, searchPattern, useRegex)

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
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | folder id
    Integer skip = 0; // Integer | number of files, that have to be skipped
    Integer take = 10; // Integer | number of files, that have to be returned
    FileSorting orderBy = FileSorting.fromValue("None"); // FileSorting | 
    Boolean desc = false; // Boolean | 
    String searchPattern = ""; // String | 
    Boolean useRegex = false; // Boolean | 
    try {
      FilesVM result = apiInstance.exportFoldersGetFolders(id, skip, take, orderBy, desc, searchPattern, useRegex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFoldersGetFolders");
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
| **id** | **String**| folder id | |
| **skip** | **Integer**| number of files, that have to be skipped | [optional] [default to 0] |
| **take** | **Integer**| number of files, that have to be returned | [optional] [default to 10] |
| **orderBy** | [**FileSorting**](.md)|  | [optional] [enum: None, CreatedTime, EditedTime, Size, Name] |
| **desc** | **Boolean**|  | [optional] [default to false] |
| **searchPattern** | **String**|  | [optional] [default to ] |
| **useRegex** | **Boolean**|  | [optional] [default to false] |

### Return type

[**FilesVM**](FilesVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gets all folders from a specified folder |  -  |
| **400** | 1 of params is not valid |  -  |
| **402** | Subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder or subscription not found |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="exportFoldersGetFoldersCount"></a>
# **exportFoldersGetFoldersCount**
> CountVM exportFoldersGetFoldersCount(id)

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
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | folder id
    try {
      CountVM result = apiInstance.exportFoldersGetFoldersCount(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFoldersGetFoldersCount");
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
| **id** | **String**| folder id | |

### Return type

[**CountVM**](CountVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns count of folders in a specified folder |  -  |
| **400** | folderId is null |  -  |
| **402** | Subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder or subscription not found |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="exportFoldersGetOrCreate"></a>
# **exportFoldersGetOrCreate**
> FileVM exportFoldersGetOrCreate(name, subscriptionId, parentId)

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
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String name = "name_example"; // String | folder name
    String subscriptionId = "subscriptionId_example"; // String | subscriptionId
    String parentId = "parentId_example"; // String | parent folder id
    try {
      FileVM result = apiInstance.exportFoldersGetOrCreate(name, subscriptionId, parentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFoldersGetOrCreate");
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
| **name** | **String**| folder name | [optional] |
| **subscriptionId** | **String**| subscriptionId | [optional] |
| **parentId** | **String**| parent folder id | [optional] |

### Return type

[**FileVM**](FileVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns specified folder |  -  |
| **400** | Name or 1 of ids is not valid |  -  |
| **402** | Subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Subscription not found |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="exportFoldersGetPermissions"></a>
# **exportFoldersGetPermissions**
> FilePermissionsVM exportFoldersGetPermissions(id)

Get all folder permissions

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      FilePermissionsVM result = apiInstance.exportFoldersGetPermissions(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFoldersGetPermissions");
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
| **id** | **String**|  | |

### Return type

[**FilePermissionsVM**](FilePermissionsVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | returned permissions |  -  |
| **400** | id is not valid |  -  |
| **402** | Subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder or subscription not found |  -  |

<a id="exportFoldersGetRootFolder"></a>
# **exportFoldersGetRootFolder**
> FileVM exportFoldersGetRootFolder(subscriptionId)

Get user&#39;s root folder (without parents)

&gt; Breakchange. Now user model doesn&#39;t contain a root folders.  This method can return error 400 and 404 when subscription is not found.

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | 
    try {
      FileVM result = apiInstance.exportFoldersGetRootFolder(subscriptionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFoldersGetRootFolder");
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
| **subscriptionId** | **String**|  | [optional] |

### Return type

[**FileVM**](FileVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gets user&#39;s root folder (without parents) |  -  |
| **402** | Subscription is blocked |  -  |
| **403** | No permissions to get root folder |  -  |
| **404** | Not found subscription |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="exportFoldersMoveFolder"></a>
# **exportFoldersMoveFolder**
> FileVM exportFoldersMoveFolder(id, folderId)

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
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | moving folder id
    String folderId = "folderId_example"; // String | destination folder id
    try {
      FileVM result = apiInstance.exportFoldersMoveFolder(id, folderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFoldersMoveFolder");
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
| **id** | **String**| moving folder id | |
| **folderId** | **String**| destination folder id | |

### Return type

[**FileVM**](FileVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Folder has been moved to a specified folder |  -  |
| **400** | folderId or parentFolderId is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder or subscription not found |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="exportFoldersMoveFolderToBin"></a>
# **exportFoldersMoveFolderToBin**
> exportFoldersMoveFolderToBin(id)

Move specified folder to recycle bin

User with a Delete Entity permission can access this method.

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | folder id
    try {
      apiInstance.exportFoldersMoveFolderToBin(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFoldersMoveFolderToBin");
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
| **id** | **String**| folder id | |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Folder succesfully deleted |  -  |
| **400** | Id is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder or subscription not found |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="exportFoldersPostFolder"></a>
# **exportFoldersPostFolder**
> FileVM exportFoldersPostFolder(id, exportFolderCreateVM)

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
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | Identifier of parent folder id
    ExportFolderCreateVM exportFolderCreateVM = new ExportFolderCreateVM(); // ExportFolderCreateVM | create VM
    try {
      FileVM result = apiInstance.exportFoldersPostFolder(id, exportFolderCreateVM);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFoldersPostFolder");
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
| **id** | **String**| Identifier of parent folder id | |
| **exportFolderCreateVM** | [**ExportFolderCreateVM**](ExportFolderCreateVM.md)| create VM | [optional] |

### Return type

[**FileVM**](FileVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | New folder has been created) |  -  |
| **400** | Parent folder id or VM is not valid |  -  |
| **402** | subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | parent folder/subscription not found |  -  |

<a id="exportFoldersRecoverFolder"></a>
# **exportFoldersRecoverFolder**
> exportFoldersRecoverFolder(id, recoveryPath)

Recover specified folder

User with a Delete Entity permission can access this method.

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | folder id
    String recoveryPath = "recoveryPath_example"; // String | 
    try {
      apiInstance.exportFoldersRecoverFolder(id, recoveryPath);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFoldersRecoverFolder");
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
| **id** | **String**| folder id | |
| **recoveryPath** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Folder succesfully restored from bin |  -  |
| **400** | Id is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder or subscription not found |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="exportFoldersRenameFolder"></a>
# **exportFoldersRenameFolder**
> FileVM exportFoldersRenameFolder(id, folderRenameVM)

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
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | 
    FolderRenameVM folderRenameVM = new FolderRenameVM(); // FolderRenameVM | 
    try {
      FileVM result = apiInstance.exportFoldersRenameFolder(id, folderRenameVM);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFoldersRenameFolder");
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
| **id** | **String**|  | |
| **folderRenameVM** | [**FolderRenameVM**](FolderRenameVM.md)|  | [optional] |

### Return type

[**FileVM**](FileVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Folder name has been updated |  -  |
| **400** | folderId or VM is not valid |  -  |
| **402** | subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder or subscription not found |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="exportFoldersUpdateIcon"></a>
# **exportFoldersUpdateIcon**
> FileVM exportFoldersUpdateIcon(id, folderIconVM)

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
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | Identifier of folder
    FolderIconVM folderIconVM = new FolderIconVM(); // FolderIconVM | Update icon model
    try {
      FileVM result = apiInstance.exportFoldersUpdateIcon(id, folderIconVM);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFoldersUpdateIcon");
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
| **id** | **String**| Identifier of folder | |
| **folderIconVM** | [**FolderIconVM**](FolderIconVM.md)| Update icon model | [optional] |

### Return type

[**FileVM**](FileVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Folder&#39;s icon has been updated |  -  |
| **400** | folderId or VM is not valid |  -  |
| **402** | subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder or subscription not found |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="exportFoldersUpdatePermissions"></a>
# **exportFoldersUpdatePermissions**
> exportFoldersUpdatePermissions(id, updateFilePermissionsVM)

Update permissions

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | 
    UpdateFilePermissionsVM updateFilePermissionsVM = new UpdateFilePermissionsVM(); // UpdateFilePermissionsVM | 
    try {
      apiInstance.exportFoldersUpdatePermissions(id, updateFilePermissionsVM);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFoldersUpdatePermissions");
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
| **id** | **String**|  | |
| **updateFilePermissionsVM** | [**UpdateFilePermissionsVM**](UpdateFilePermissionsVM.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Folder&#39;s permissions has been updated |  -  |
| **400** | Id or VM is not valid |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder or subscription not found |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="exportFoldersUpdateTags"></a>
# **exportFoldersUpdateTags**
> FileVM exportFoldersUpdateTags(id, folderTagsUpdateVM)

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
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | 
    FolderTagsUpdateVM folderTagsUpdateVM = new FolderTagsUpdateVM(); // FolderTagsUpdateVM | 
    try {
      FileVM result = apiInstance.exportFoldersUpdateTags(id, folderTagsUpdateVM);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportFoldersUpdateTags");
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
| **id** | **String**|  | |
| **folderTagsUpdateVM** | [**FolderTagsUpdateVM**](FolderTagsUpdateVM.md)|  | [optional] |

### Return type

[**FileVM**](FileVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tags has been updated |  -  |
| **400** | folderId or Tags is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | subscription is outdated |  -  |
| **404** | Folder or subscription not found |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="exportsCopyFile"></a>
# **exportsCopyFile**
> ExportVM exportsCopyFile(id, folderId)

Copy file to a specified folder

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | file id
    String folderId = "folderId_example"; // String | folder id
    try {
      ExportVM result = apiInstance.exportsCopyFile(id, folderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportsCopyFile");
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
| **id** | **String**| file id | |
| **folderId** | **String**| folder id | |

### Return type

[**ExportVM**](ExportVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | File has been copied |  -  |
| **400** | FileId or folderId is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File, subscription or folder not found |  -  |
| **500** | Exception thrown |  -  |

<a id="exportsDeleteFile"></a>
# **exportsDeleteFile**
> exportsDeleteFile(id)

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
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | file id
    try {
      apiInstance.exportsDeleteFile(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportsDeleteFile");
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
| **id** | **String**| file id | |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | File succesfully deleted |  -  |
| **400** | Id is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or subscription not found |  -  |
| **500** | Exception thrown |  -  |

<a id="exportsGetFile"></a>
# **exportsGetFile**
> ExportVM exportsGetFile(id)

Get export by specified id

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | id of export
    try {
      ExportVM result = apiInstance.exportsGetFile(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportsGetFile");
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
| **id** | **String**| id of export | |

### Return type

[**ExportVM**](ExportVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Export is found |  -  |
| **400** | id is not valid |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You have no get permission |  -  |
| **404** | Export or subscription is not found |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="exportsGetFileHistory"></a>
# **exportsGetFileHistory**
> AuditActionsVM exportsGetFileHistory(id, skip, take)

Returns list of actions, performed on this file

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | 
    Integer skip = 0; // Integer | 
    Integer take = 10; // Integer | 
    try {
      AuditActionsVM result = apiInstance.exportsGetFileHistory(id, skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportsGetFileHistory");
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
| **id** | **String**|  | |
| **skip** | **Integer**|  | [optional] [default to 0] |
| **take** | **Integer**|  | [optional] [default to 10] |

### Return type

[**AuditActionsVM**](AuditActionsVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the actions |  -  |
| **400** | Id is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or subscription not found |  -  |

<a id="exportsGetFilesCount"></a>
# **exportsGetFilesCount**
> CountVM exportsGetFilesCount(id)

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
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | folder id
    try {
      CountVM result = apiInstance.exportsGetFilesCount(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportsGetFilesCount");
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
| **id** | **String**| folder id | |

### Return type

[**CountVM**](CountVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns count of the files in a specified folder |  -  |
| **400** | FolderId is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder or subscription not found |  -  |
| **500** | Exception thrown |  -  |

<a id="exportsGetFilesList"></a>
# **exportsGetFilesList**
> ExportsVM exportsGetFilesList(id, skip, take, searchPattern, orderBy, desc, useRegex)

Get all files from specified folder. &lt;br /&gt;  User with Get Entity permission can access this method. &lt;br /&gt;  The method will returns minimal infomration about the file: &lt;br /&gt;  id, name, size, editedTime, createdTime, tags, status, statusReason.

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | folder id
    Integer skip = 0; // Integer | number of files, that have to be skipped
    Integer take = 10; // Integer | number of files, that have to be returned
    String searchPattern = "searchPattern_example"; // String | 
    FileSorting orderBy = FileSorting.fromValue("None"); // FileSorting | 
    Boolean desc = false; // Boolean | 
    Boolean useRegex = false; // Boolean | 
    try {
      ExportsVM result = apiInstance.exportsGetFilesList(id, skip, take, searchPattern, orderBy, desc, useRegex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportsGetFilesList");
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
| **id** | **String**| folder id | |
| **skip** | **Integer**| number of files, that have to be skipped | [optional] [default to 0] |
| **take** | **Integer**| number of files, that have to be returned | [optional] [default to 10] |
| **searchPattern** | **String**|  | [optional] |
| **orderBy** | [**FileSorting**](.md)|  | [optional] [enum: None, CreatedTime, EditedTime, Size, Name] |
| **desc** | **Boolean**|  | [optional] [default to false] |
| **useRegex** | **Boolean**|  | [optional] [default to false] |

### Return type

[**ExportsVM**](ExportsVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns list of the files from a specified folder |  -  |
| **400** | Invalid params |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File, subscription or folder not found |  -  |
| **500** | Exception thrown |  -  |

<a id="exportsGetPermissions"></a>
# **exportsGetPermissions**
> FilePermissionsVM exportsGetPermissions(id)



### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      FilePermissionsVM result = apiInstance.exportsGetPermissions(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportsGetPermissions");
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
| **id** | **String**|  | |

### Return type

[**FilePermissionsVM**](FilePermissionsVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="exportsMoveFile"></a>
# **exportsMoveFile**
> ExportVM exportsMoveFile(id, folderId)

Move file to a specified folder

User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | file id
    String folderId = "folderId_example"; // String | folder id
    try {
      ExportVM result = apiInstance.exportsMoveFile(id, folderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportsMoveFile");
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
| **id** | **String**| file id | |
| **folderId** | **String**| folder id | |

### Return type

[**ExportVM**](ExportVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | File has been moved |  -  |
| **400** | fileId or folderId is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File, subscription or folder not found |  -  |
| **500** | Exception thrown |  -  |

<a id="exportsMoveFileToBin"></a>
# **exportsMoveFileToBin**
> exportsMoveFileToBin(id)

Move specified file to recycle bin

User with Delete permission can access the method.

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | file id
    try {
      apiInstance.exportsMoveFileToBin(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportsMoveFileToBin");
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
| **id** | **String**| file id | |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | File succesfully deleted |  -  |
| **400** | Id is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or subscription not found |  -  |
| **500** | Exception thrown |  -  |

<a id="exportsRecoverFile"></a>
# **exportsRecoverFile**
> exportsRecoverFile(id, recoveryPath)

Recover specified file from bin

User with Delete permission can access the method.

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | file id
    String recoveryPath = "recoveryPath_example"; // String | 
    try {
      apiInstance.exportsRecoverFile(id, recoveryPath);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportsRecoverFile");
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
| **id** | **String**| file id | |
| **recoveryPath** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | File succesfully recovered |  -  |
| **400** | Id is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or subscription not found |  -  |
| **500** | Exception thrown |  -  |

<a id="exportsRenameFile"></a>
# **exportsRenameFile**
> ExportVM exportsRenameFile(id, fileRenameVM)

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
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | 
    FileRenameVM fileRenameVM = new FileRenameVM(); // FileRenameVM | 
    try {
      ExportVM result = apiInstance.exportsRenameFile(id, fileRenameVM);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportsRenameFile");
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
| **id** | **String**|  | |
| **fileRenameVM** | [**FileRenameVM**](FileRenameVM.md)|  | [optional] |

### Return type

[**ExportVM**](ExportVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | File name has been updated |  -  |
| **400** | FileId is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or subscription not found |  -  |
| **500** | Exception thrown |  -  |

<a id="exportsUpdateIcon"></a>
# **exportsUpdateIcon**
> ExportVM exportsUpdateIcon(id, fileIconVM)

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
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | 
    FileIconVM fileIconVM = new FileIconVM(); // FileIconVM | 
    try {
      ExportVM result = apiInstance.exportsUpdateIcon(id, fileIconVM);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportsUpdateIcon");
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
| **id** | **String**|  | |
| **fileIconVM** | [**FileIconVM**](FileIconVM.md)|  | [optional] |

### Return type

[**ExportVM**](ExportVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | File&#39;s icon has been updated |  -  |
| **400** | FileId is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or subscription not found |  -  |
| **500** | Exception thrown |  -  |

<a id="exportsUpdatePermissions"></a>
# **exportsUpdatePermissions**
> exportsUpdatePermissions(id, updateFilePermissionsVM)

Update permissions

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | 
    UpdateFilePermissionsVM updateFilePermissionsVM = new UpdateFilePermissionsVM(); // UpdateFilePermissionsVM | 
    try {
      apiInstance.exportsUpdatePermissions(id, updateFilePermissionsVM);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportsUpdatePermissions");
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
| **id** | **String**|  | |
| **updateFilePermissionsVM** | [**UpdateFilePermissionsVM**](UpdateFilePermissionsVM.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | File&#39;s permissions has been updated |  -  |
| **400** | FileId or VM is not valid |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or subscription not found |  -  |
| **500** | Exception thrown |  -  |

<a id="exportsUpdateTags"></a>
# **exportsUpdateTags**
> ExportVM exportsUpdateTags(id, fileTagsUpdateVM)

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
import cloud.fastreport.client.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String id = "id_example"; // String | 
    FileTagsUpdateVM fileTagsUpdateVM = new FileTagsUpdateVM(); // FileTagsUpdateVM | 
    try {
      ExportVM result = apiInstance.exportsUpdateTags(id, fileTagsUpdateVM);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#exportsUpdateTags");
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
| **id** | **String**|  | |
| **fileTagsUpdateVM** | [**FileTagsUpdateVM**](FileTagsUpdateVM.md)|  | [optional] |

### Return type

[**ExportVM**](ExportVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tags has been updated |  -  |
| **400** | FileId is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or subscription not found |  -  |
| **500** | Exception thrown |  -  |

