# ReportsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**reportFolderAndFileClearRecycleBin**](ReportsApi.md#reportFolderAndFileClearRecycleBin) | **DELETE** /api/rp/v1/Reports/{subscriptionId}/ClearRecycleBin | Delete all folders and files from recycle bin |
| [**reportFolderAndFileCopyFiles**](ReportsApi.md#reportFolderAndFileCopyFiles) | **POST** /api/rp/v1/Reports/{subscriptionId}/CopyFiles | Copy folders and files to a specified folder |
| [**reportFolderAndFileCountRecycleBinFoldersAndFiles**](ReportsApi.md#reportFolderAndFileCountRecycleBinFoldersAndFiles) | **GET** /api/rp/v1/Reports/{subscriptionId}/CountRecycleBinFolderAndFiles | Count all folders and files from recycle bin |
| [**reportFolderAndFileDeleteFiles**](ReportsApi.md#reportFolderAndFileDeleteFiles) | **POST** /api/rp/v1/Reports/{subscriptionId}/DeleteFiles | Delete folders and files |
| [**reportFolderAndFileGetCount**](ReportsApi.md#reportFolderAndFileGetCount) | **GET** /api/rp/v1/Reports/Folder/{id}/CountFolderAndFiles | Get count of files and folders what contains in a specified folder |
| [**reportFolderAndFileGetFoldersAndFiles**](ReportsApi.md#reportFolderAndFileGetFoldersAndFiles) | **GET** /api/rp/v1/Reports/Folder/{id}/ListFolderAndFiles | Get all folders and files from specified folder |
| [**reportFolderAndFileGetRecycleBinFoldersAndFiles**](ReportsApi.md#reportFolderAndFileGetRecycleBinFoldersAndFiles) | **GET** /api/rp/v1/Reports/{subscriptionId}/ListRecycleBinFolderAndFiles | Get all folders and files from recycle bin |
| [**reportFolderAndFileMoveFiles**](ReportsApi.md#reportFolderAndFileMoveFiles) | **POST** /api/rp/v1/Reports/{subscriptionId}/MoveFiles | Move folders and files to a specified folder |
| [**reportFolderAndFileMoveFilesToBin**](ReportsApi.md#reportFolderAndFileMoveFilesToBin) | **POST** /api/rp/v1/Reports/{subscriptionId}/ToBin | Move folders and files to bin |
| [**reportFolderAndFileRecoverAllFromRecycleBin**](ReportsApi.md#reportFolderAndFileRecoverAllFromRecycleBin) | **POST** /api/rp/v1/Reports/{subscriptionId}/RecoverRecycleBin | Recover all folders and files from recycle bin |
| [**reportFolderAndFileRecoverFiles**](ReportsApi.md#reportFolderAndFileRecoverFiles) | **POST** /api/rp/v1/Reports/{subscriptionId}/RecoverFiles | Recover folders and files from bin |
| [**reportFoldersCalculateFolderSize**](ReportsApi.md#reportFoldersCalculateFolderSize) | **GET** /api/rp/v1/Reports/Folder/{id}/size | Get specified folder, calculate it&#39;s size |
| [**reportFoldersCopyFolder**](ReportsApi.md#reportFoldersCopyFolder) | **POST** /api/rp/v1/Reports/Folder/{id}/Copy/{folderId} | Move folder to a specified folder |
| [**reportFoldersDeleteFolder**](ReportsApi.md#reportFoldersDeleteFolder) | **DELETE** /api/rp/v1/Reports/Folder/{id} | Delete specified folder |
| [**reportFoldersExport**](ReportsApi.md#reportFoldersExport) | **POST** /api/rp/v1/Reports/Folder/{id}/Export | Export specified report folder to a specified format |
| [**reportFoldersGetBreadcrumbs**](ReportsApi.md#reportFoldersGetBreadcrumbs) | **GET** /api/rp/v1/Reports/Folder/{id}/Breadcrumbs | Get specified folder breadcrumbs |
| [**reportFoldersGetFolder**](ReportsApi.md#reportFoldersGetFolder) | **GET** /api/rp/v1/Reports/Folder/{id} | Get specified folder |
| [**reportFoldersGetFolders**](ReportsApi.md#reportFoldersGetFolders) | **GET** /api/rp/v1/Reports/Folder/{id}/ListFolders | Get all folders from specified folder |
| [**reportFoldersGetFoldersCount**](ReportsApi.md#reportFoldersGetFoldersCount) | **GET** /api/rp/v1/Reports/Folder/{id}/CountFolders | Get count of folders what contains in a specified folder |
| [**reportFoldersGetOrCreate**](ReportsApi.md#reportFoldersGetOrCreate) | **GET** /api/rp/v1/Reports/Folder/getOrCreate | Get specified folder |
| [**reportFoldersGetPermissions**](ReportsApi.md#reportFoldersGetPermissions) | **GET** /api/rp/v1/Reports/Folder/{id}/permissions | Get all folder permissions |
| [**reportFoldersGetRootFolder**](ReportsApi.md#reportFoldersGetRootFolder) | **GET** /api/rp/v1/Reports/Root | Get user&#39;s root folder (without parents) |
| [**reportFoldersMoveFolder**](ReportsApi.md#reportFoldersMoveFolder) | **POST** /api/rp/v1/Reports/Folder/{id}/Move/{folderId} | Move folder to a specified folder |
| [**reportFoldersMoveFolderToBin**](ReportsApi.md#reportFoldersMoveFolderToBin) | **DELETE** /api/rp/v1/Reports/Folder/{id}/ToBin | Move specified folder to recycle bin |
| [**reportFoldersPostFolder**](ReportsApi.md#reportFoldersPostFolder) | **POST** /api/rp/v1/Reports/Folder/{id}/Folder | Create folder |
| [**reportFoldersRecoverFolder**](ReportsApi.md#reportFoldersRecoverFolder) | **POST** /api/rp/v1/Reports/Folder/{id}/Recover | Recover specified folder |
| [**reportFoldersRenameFolder**](ReportsApi.md#reportFoldersRenameFolder) | **PUT** /api/rp/v1/Reports/Folder/{id}/Rename | Rename a folder |
| [**reportFoldersUpdateIcon**](ReportsApi.md#reportFoldersUpdateIcon) | **PUT** /api/rp/v1/Reports/Folder/{id}/Icon | Update a folder&#39;s icon |
| [**reportFoldersUpdatePermissions**](ReportsApi.md#reportFoldersUpdatePermissions) | **POST** /api/rp/v1/Reports/{id}/permissions | Update permissions |
| [**reportFoldersUpdateTags**](ReportsApi.md#reportFoldersUpdateTags) | **PUT** /api/rp/v1/Reports/Folder/{id}/UpdateTags | Update tags |
| [**reportsCopyFile**](ReportsApi.md#reportsCopyFile) | **POST** /api/rp/v1/Reports/File/{id}/Copy/{folderId} | Copy file to a specified folder |
| [**reportsCreateSharingKey**](ReportsApi.md#reportsCreateSharingKey) | **POST** /api/rp/v1/Reports/File/{id}/sharingKey | Create a new key, that can be used to share access to a file  (You need Administrate.Anon permission to create a new key) |
| [**reportsDeleteFile**](ReportsApi.md#reportsDeleteFile) | **DELETE** /api/rp/v1/Reports/File/{id} | Delete specified file |
| [**reportsDeleteSharingKey**](ReportsApi.md#reportsDeleteSharingKey) | **DELETE** /api/rp/v1/Reports/File/{id}/sharingKey | Deletes a sharing key, making links, that utilizing it no longer work |
| [**reportsExport**](ReportsApi.md#reportsExport) | **POST** /api/rp/v1/Reports/File/{id}/Export | Export specified report to a specified format |
| [**reportsGetFile**](ReportsApi.md#reportsGetFile) | **GET** /api/rp/v1/Reports/File/{id} | Get specified file |
| [**reportsGetFileHistory**](ReportsApi.md#reportsGetFileHistory) | **GET** /api/rp/v1/Reports/File/{id}/History | Returns list of actions, performed on this file |
| [**reportsGetFilesCount**](ReportsApi.md#reportsGetFilesCount) | **GET** /api/rp/v1/Reports/Folder/{id}/CountFiles | Get count of files what contains in a specified folder |
| [**reportsGetFilesList**](ReportsApi.md#reportsGetFilesList) | **GET** /api/rp/v1/Reports/Folder/{id}/ListFiles | Get all files from specified folder. &lt;br /&gt;  User with Get Entity permission can access this method. &lt;br /&gt;  The method will returns minimal infomration about the file: &lt;br /&gt;  id, name, size, editedTime, createdTime, tags, status, statusReason. |
| [**reportsGetPermissions**](ReportsApi.md#reportsGetPermissions) | **GET** /api/rp/v1/Reports/File/{id}/permissions |  |
| [**reportsGetSharingKeys**](ReportsApi.md#reportsGetSharingKeys) | **GET** /api/rp/v1/Reports/File/{id}/sharingKeys | Returns all sharing keys, associated with the file |
| [**reportsMoveFile**](ReportsApi.md#reportsMoveFile) | **POST** /api/rp/v1/Reports/File/{id}/Move/{folderId} | Move file to a specified folder |
| [**reportsMoveFileToBin**](ReportsApi.md#reportsMoveFileToBin) | **DELETE** /api/rp/v1/Reports/File/{id}/ToBin | Move specified file to recycle bin |
| [**reportsRecoverFile**](ReportsApi.md#reportsRecoverFile) | **POST** /api/rp/v1/Reports/File/{id}/Recover | Recover specified file from bin |
| [**reportsRenameFile**](ReportsApi.md#reportsRenameFile) | **PUT** /api/rp/v1/Reports/File/{id}/Rename | Rename a file |
| [**reportsStaticPreview**](ReportsApi.md#reportsStaticPreview) | **POST** /api/rp/v1/Reports/File/{id}/StaticPreview | Make preview for the report.  Generate a new or return exist prepared svg files.  If template was changed will be returned a new.  Pass the &#x60;&#x60; parameter to check prepared timestamp |
| [**reportsUpdateIcon**](ReportsApi.md#reportsUpdateIcon) | **PUT** /api/rp/v1/Reports/File/{id}/Icon | Update a files&#39;s icon |
| [**reportsUpdatePermissions**](ReportsApi.md#reportsUpdatePermissions) | **POST** /api/rp/v1/Reports/File/{id}/permissions | Update permissions |
| [**reportsUpdateTags**](ReportsApi.md#reportsUpdateTags) | **PUT** /api/rp/v1/Reports/File/{id}/UpdateTags | Update tags |
| [**reportsUploadFile**](ReportsApi.md#reportsUploadFile) | **POST** /api/rp/v1/Reports/Folder/{id}/File | Upload a file to the specified folder. The method is deprecated, use the UploadFileV2 method instead! |
| [**reportsUploadFileV2**](ReportsApi.md#reportsUploadFileV2) | **POST** /api/rp/v2/Reports/Folder/{id}/File | Alternative api for upload a file to the specified folder! |


<a id="reportFolderAndFileClearRecycleBin"></a>
# **reportFolderAndFileClearRecycleBin**
> reportFolderAndFileClearRecycleBin(subscriptionId)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | subscription id
    try {
      apiInstance.reportFolderAndFileClearRecycleBin(subscriptionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFolderAndFileClearRecycleBin");
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

<a id="reportFolderAndFileCopyFiles"></a>
# **reportFolderAndFileCopyFiles**
> reportFolderAndFileCopyFiles(subscriptionId, selectedFilesVM)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | id of current subscription
    SelectedFilesVM selectedFilesVM = new SelectedFilesVM(); // SelectedFilesVM | VM with files' ids and params of their destination
    try {
      apiInstance.reportFolderAndFileCopyFiles(subscriptionId, selectedFilesVM);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFolderAndFileCopyFiles");
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

<a id="reportFolderAndFileCountRecycleBinFoldersAndFiles"></a>
# **reportFolderAndFileCountRecycleBinFoldersAndFiles**
> CountVM reportFolderAndFileCountRecycleBinFoldersAndFiles(subscriptionId, searchPattern, useRegex)

Count all folders and files from recycle bin

User with a Get DeletedFiles permission can access this method.

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | subscription id
    String searchPattern = ""; // String | 
    Boolean useRegex = false; // Boolean | 
    try {
      CountVM result = apiInstance.reportFolderAndFileCountRecycleBinFoldersAndFiles(subscriptionId, searchPattern, useRegex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFolderAndFileCountRecycleBinFoldersAndFiles");
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
| **searchPattern** | **String**|  | [optional] [default to ] |
| **useRegex** | **Boolean**|  | [optional] [default to false] |

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
| **200** | Returns list of the files from a specified folder |  -  |
| **400** | Params are not valid |  -  |
| **402** | Payment required, subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Subscription not found |  -  |

<a id="reportFolderAndFileDeleteFiles"></a>
# **reportFolderAndFileDeleteFiles**
> reportFolderAndFileDeleteFiles(subscriptionId, selectedFilesVM)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | id of current subscription
    SelectedFilesVM selectedFilesVM = new SelectedFilesVM(); // SelectedFilesVM | VM with files' ids and params of their destination
    try {
      apiInstance.reportFolderAndFileDeleteFiles(subscriptionId, selectedFilesVM);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFolderAndFileDeleteFiles");
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

<a id="reportFolderAndFileGetCount"></a>
# **reportFolderAndFileGetCount**
> CountVM reportFolderAndFileGetCount(id, searchPattern, useRegex)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | folder id
    String searchPattern = "searchPattern_example"; // String | string, that must be incuded in file or folder name to be counted <br />              (leave undefined to count all files and folders)
    Boolean useRegex = false; // Boolean | set this to true if you want to use regular expression to search
    try {
      CountVM result = apiInstance.reportFolderAndFileGetCount(id, searchPattern, useRegex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFolderAndFileGetCount");
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

<a id="reportFolderAndFileGetFoldersAndFiles"></a>
# **reportFolderAndFileGetFoldersAndFiles**
> FilesVM reportFolderAndFileGetFoldersAndFiles(id, skip, take, orderBy, desc, searchPattern, useRegex)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | folder id
    Integer skip = 0; // Integer | number of folder and files, that have to be skipped
    Integer take = 10; // Integer | number of folder and files, that have to be returned
    FileSorting orderBy = FileSorting.fromValue("CreatedTime"); // FileSorting | indicates a field to sort by
    Boolean desc = false; // Boolean | indicates if sorting is descending
    String searchPattern = ""; // String | 
    Boolean useRegex = false; // Boolean | 
    try {
      FilesVM result = apiInstance.reportFolderAndFileGetFoldersAndFiles(id, skip, take, orderBy, desc, searchPattern, useRegex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFolderAndFileGetFoldersAndFiles");
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
| **orderBy** | [**FileSorting**](.md)| indicates a field to sort by | [optional] [enum: CreatedTime, EditedTime, Size, Name] |
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

<a id="reportFolderAndFileGetRecycleBinFoldersAndFiles"></a>
# **reportFolderAndFileGetRecycleBinFoldersAndFiles**
> FilesVM reportFolderAndFileGetRecycleBinFoldersAndFiles(subscriptionId, skip, take, orderBy, desc, searchPattern, useRegex)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | subscription id
    Integer skip = 0; // Integer | number of folder and files, that have to be skipped
    Integer take = 10; // Integer | number of folder and files, that have to be returned
    FileSorting orderBy = FileSorting.fromValue("CreatedTime"); // FileSorting | indicates a field to sort by
    Boolean desc = false; // Boolean | indicates if sorting is descending
    String searchPattern = ""; // String | 
    Boolean useRegex = false; // Boolean | 
    try {
      FilesVM result = apiInstance.reportFolderAndFileGetRecycleBinFoldersAndFiles(subscriptionId, skip, take, orderBy, desc, searchPattern, useRegex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFolderAndFileGetRecycleBinFoldersAndFiles");
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
| **orderBy** | [**FileSorting**](.md)| indicates a field to sort by | [optional] [enum: CreatedTime, EditedTime, Size, Name] |
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

<a id="reportFolderAndFileMoveFiles"></a>
# **reportFolderAndFileMoveFiles**
> reportFolderAndFileMoveFiles(subscriptionId, selectedFilesVM)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | id of current subscription
    SelectedFilesVM selectedFilesVM = new SelectedFilesVM(); // SelectedFilesVM | VM with files' ids and params of their destination
    try {
      apiInstance.reportFolderAndFileMoveFiles(subscriptionId, selectedFilesVM);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFolderAndFileMoveFiles");
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

<a id="reportFolderAndFileMoveFilesToBin"></a>
# **reportFolderAndFileMoveFilesToBin**
> reportFolderAndFileMoveFilesToBin(subscriptionId, selectedFilesVM)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | id of current subscription
    SelectedFilesVM selectedFilesVM = new SelectedFilesVM(); // SelectedFilesVM | VM with files' ids and params of their destination
    try {
      apiInstance.reportFolderAndFileMoveFilesToBin(subscriptionId, selectedFilesVM);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFolderAndFileMoveFilesToBin");
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

<a id="reportFolderAndFileRecoverAllFromRecycleBin"></a>
# **reportFolderAndFileRecoverAllFromRecycleBin**
> reportFolderAndFileRecoverAllFromRecycleBin(subscriptionId)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | subscription id
    try {
      apiInstance.reportFolderAndFileRecoverAllFromRecycleBin(subscriptionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFolderAndFileRecoverAllFromRecycleBin");
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

<a id="reportFolderAndFileRecoverFiles"></a>
# **reportFolderAndFileRecoverFiles**
> reportFolderAndFileRecoverFiles(subscriptionId, selectedFilesVM)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | id of current subscription
    SelectedFilesVM selectedFilesVM = new SelectedFilesVM(); // SelectedFilesVM | VM with files' ids and params of their destination
    try {
      apiInstance.reportFolderAndFileRecoverFiles(subscriptionId, selectedFilesVM);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFolderAndFileRecoverFiles");
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

<a id="reportFoldersCalculateFolderSize"></a>
# **reportFoldersCalculateFolderSize**
> FolderSizeVM reportFoldersCalculateFolderSize(id)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | folder id
    try {
      FolderSizeVM result = apiInstance.reportFoldersCalculateFolderSize(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFoldersCalculateFolderSize");
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

<a id="reportFoldersCopyFolder"></a>
# **reportFoldersCopyFolder**
> FileVM reportFoldersCopyFolder(id, folderId)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | moving folder id
    String folderId = "folderId_example"; // String | destination folder id
    try {
      FileVM result = apiInstance.reportFoldersCopyFolder(id, folderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFoldersCopyFolder");
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

<a id="reportFoldersDeleteFolder"></a>
# **reportFoldersDeleteFolder**
> reportFoldersDeleteFolder(id)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | folder id
    try {
      apiInstance.reportFoldersDeleteFolder(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFoldersDeleteFolder");
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

<a id="reportFoldersExport"></a>
# **reportFoldersExport**
> FileVM reportFoldersExport(id, exportReportVM)

Export specified report folder to a specified format

User with Execute Export permission on report folder and  Create Entity on an export folder can access this method.

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | report folder id
    ExportReportVM exportReportVM = new ExportReportVM(); // ExportReportVM | export parameters
    try {
      FileVM result = apiInstance.reportFoldersExport(id, exportReportVM);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFoldersExport");
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
| **id** | **String**| report folder id | |
| **exportReportVM** | [**ExportReportVM**](ExportReportVM.md)| export parameters | [optional] |

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
| **200** | Specified report folder has been exported |  -  |
| **400** | Report folder Id is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | Exports folder not found |  -  |

<a id="reportFoldersGetBreadcrumbs"></a>
# **reportFoldersGetBreadcrumbs**
> BreadcrumbsVM reportFoldersGetBreadcrumbs(id)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | folder id
    try {
      BreadcrumbsVM result = apiInstance.reportFoldersGetBreadcrumbs(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFoldersGetBreadcrumbs");
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

<a id="reportFoldersGetFolder"></a>
# **reportFoldersGetFolder**
> FileVM reportFoldersGetFolder(id)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | folder id
    try {
      FileVM result = apiInstance.reportFoldersGetFolder(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFoldersGetFolder");
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

<a id="reportFoldersGetFolders"></a>
# **reportFoldersGetFolders**
> FilesVM reportFoldersGetFolders(id, skip, take, orderBy, desc, searchPattern, useRegex)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | folder id
    Integer skip = 0; // Integer | number of files, that have to be skipped
    Integer take = 10; // Integer | number of files, that have to be returned
    FileSorting orderBy = FileSorting.fromValue("CreatedTime"); // FileSorting | 
    Boolean desc = false; // Boolean | 
    String searchPattern = ""; // String | 
    Boolean useRegex = false; // Boolean | 
    try {
      FilesVM result = apiInstance.reportFoldersGetFolders(id, skip, take, orderBy, desc, searchPattern, useRegex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFoldersGetFolders");
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
| **orderBy** | [**FileSorting**](.md)|  | [optional] [enum: CreatedTime, EditedTime, Size, Name] |
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

<a id="reportFoldersGetFoldersCount"></a>
# **reportFoldersGetFoldersCount**
> CountVM reportFoldersGetFoldersCount(id)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | folder id
    try {
      CountVM result = apiInstance.reportFoldersGetFoldersCount(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFoldersGetFoldersCount");
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

<a id="reportFoldersGetOrCreate"></a>
# **reportFoldersGetOrCreate**
> FileVM reportFoldersGetOrCreate(name, subscriptionId, parentId)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String name = "name_example"; // String | folder name
    String subscriptionId = "subscriptionId_example"; // String | subscriptionId
    String parentId = "parentId_example"; // String | parent folder id
    try {
      FileVM result = apiInstance.reportFoldersGetOrCreate(name, subscriptionId, parentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFoldersGetOrCreate");
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

<a id="reportFoldersGetPermissions"></a>
# **reportFoldersGetPermissions**
> FilePermissionsVM reportFoldersGetPermissions(id)

Get all folder permissions

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      FilePermissionsVM result = apiInstance.reportFoldersGetPermissions(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFoldersGetPermissions");
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

<a id="reportFoldersGetRootFolder"></a>
# **reportFoldersGetRootFolder**
> FileVM reportFoldersGetRootFolder(subscriptionId)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | 
    try {
      FileVM result = apiInstance.reportFoldersGetRootFolder(subscriptionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFoldersGetRootFolder");
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

<a id="reportFoldersMoveFolder"></a>
# **reportFoldersMoveFolder**
> FileVM reportFoldersMoveFolder(id, folderId)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | moving folder id
    String folderId = "folderId_example"; // String | destination folder id
    try {
      FileVM result = apiInstance.reportFoldersMoveFolder(id, folderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFoldersMoveFolder");
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

<a id="reportFoldersMoveFolderToBin"></a>
# **reportFoldersMoveFolderToBin**
> reportFoldersMoveFolderToBin(id)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | folder id
    try {
      apiInstance.reportFoldersMoveFolderToBin(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFoldersMoveFolderToBin");
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

<a id="reportFoldersPostFolder"></a>
# **reportFoldersPostFolder**
> FileVM reportFoldersPostFolder(id, reportFolderCreateVM)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | Identifier of parent folder id
    ReportFolderCreateVM reportFolderCreateVM = new ReportFolderCreateVM(); // ReportFolderCreateVM | create VM
    try {
      FileVM result = apiInstance.reportFoldersPostFolder(id, reportFolderCreateVM);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFoldersPostFolder");
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
| **reportFolderCreateVM** | [**ReportFolderCreateVM**](ReportFolderCreateVM.md)| create VM | [optional] |

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

<a id="reportFoldersRecoverFolder"></a>
# **reportFoldersRecoverFolder**
> reportFoldersRecoverFolder(id, recoveryPath)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | folder id
    String recoveryPath = "recoveryPath_example"; // String | 
    try {
      apiInstance.reportFoldersRecoverFolder(id, recoveryPath);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFoldersRecoverFolder");
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

<a id="reportFoldersRenameFolder"></a>
# **reportFoldersRenameFolder**
> FileVM reportFoldersRenameFolder(id, folderRenameVM)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | 
    FolderRenameVM folderRenameVM = new FolderRenameVM(); // FolderRenameVM | 
    try {
      FileVM result = apiInstance.reportFoldersRenameFolder(id, folderRenameVM);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFoldersRenameFolder");
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

<a id="reportFoldersUpdateIcon"></a>
# **reportFoldersUpdateIcon**
> FileVM reportFoldersUpdateIcon(id, folderIconVM)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | Identifier of folder
    FolderIconVM folderIconVM = new FolderIconVM(); // FolderIconVM | Update icon model
    try {
      FileVM result = apiInstance.reportFoldersUpdateIcon(id, folderIconVM);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFoldersUpdateIcon");
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

<a id="reportFoldersUpdatePermissions"></a>
# **reportFoldersUpdatePermissions**
> reportFoldersUpdatePermissions(id, updateFilePermissionsVM)

Update permissions

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | 
    UpdateFilePermissionsVM updateFilePermissionsVM = new UpdateFilePermissionsVM(); // UpdateFilePermissionsVM | 
    try {
      apiInstance.reportFoldersUpdatePermissions(id, updateFilePermissionsVM);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFoldersUpdatePermissions");
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

<a id="reportFoldersUpdateTags"></a>
# **reportFoldersUpdateTags**
> FileVM reportFoldersUpdateTags(id, folderTagsUpdateVM)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | 
    FolderTagsUpdateVM folderTagsUpdateVM = new FolderTagsUpdateVM(); // FolderTagsUpdateVM | 
    try {
      FileVM result = apiInstance.reportFoldersUpdateTags(id, folderTagsUpdateVM);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportFoldersUpdateTags");
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

<a id="reportsCopyFile"></a>
# **reportsCopyFile**
> ReportVM reportsCopyFile(id, folderId)

Copy file to a specified folder

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | file id
    String folderId = "folderId_example"; // String | folder id
    try {
      ReportVM result = apiInstance.reportsCopyFile(id, folderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsCopyFile");
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

[**ReportVM**](ReportVM.md)

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

<a id="reportsCreateSharingKey"></a>
# **reportsCreateSharingKey**
> FileSharingKeysVM reportsCreateSharingKey(id, createFileShareVM)

Create a new key, that can be used to share access to a file  (You need Administrate.Anon permission to create a new key)

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | file id
    CreateFileShareVM createFileShareVM = new CreateFileShareVM(); // CreateFileShareVM | parameters for sharing key creation
    try {
      FileSharingKeysVM result = apiInstance.reportsCreateSharingKey(id, createFileShareVM);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsCreateSharingKey");
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
| **createFileShareVM** | [**CreateFileShareVM**](CreateFileShareVM.md)| parameters for sharing key creation | [optional] |

### Return type

[**FileSharingKeysVM**](FileSharingKeysVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **402** | Client Error |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |

<a id="reportsDeleteFile"></a>
# **reportsDeleteFile**
> reportsDeleteFile(id)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | file id
    try {
      apiInstance.reportsDeleteFile(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsDeleteFile");
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

<a id="reportsDeleteSharingKey"></a>
# **reportsDeleteSharingKey**
> reportsDeleteSharingKey(id, key)

Deletes a sharing key, making links, that utilizing it no longer work

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | file id
    String key = "key_example"; // String | key to delete
    try {
      apiInstance.reportsDeleteSharingKey(id, key);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsDeleteSharingKey");
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
| **key** | **String**| key to delete | |

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
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **402** | Client Error |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |

<a id="reportsExport"></a>
# **reportsExport**
> ExportVM reportsExport(id, exportReportVM)

Export specified report to a specified format

User with Execute Export permission on prepared report and  Create Entity on an export folder can access this method.

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | report id
    ExportReportVM exportReportVM = new ExportReportVM(); // ExportReportVM | export parameters
    try {
      ExportVM result = apiInstance.reportsExport(id, exportReportVM);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsExport");
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
| **id** | **String**| report id | |
| **exportReportVM** | [**ExportReportVM**](ExportReportVM.md)| export parameters | [optional] |

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
| **200** | Specified report has been exported |  -  |
| **204** | Specified report has been exported |  -  |
| **400** | Report Id is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Exports folder not found |  -  |

<a id="reportsGetFile"></a>
# **reportsGetFile**
> ReportVM reportsGetFile(id)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | file id
    try {
      ReportVM result = apiInstance.reportsGetFile(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsGetFile");
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

[**ReportVM**](ReportVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the specified file |  -  |
| **400** | Id is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or subscription not found |  -  |
| **500** | Exception thrown |  -  |

<a id="reportsGetFileHistory"></a>
# **reportsGetFileHistory**
> AuditActionsVM reportsGetFileHistory(id, skip, take)

Returns list of actions, performed on this file

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | 
    Integer skip = 0; // Integer | 
    Integer take = 10; // Integer | 
    try {
      AuditActionsVM result = apiInstance.reportsGetFileHistory(id, skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsGetFileHistory");
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

<a id="reportsGetFilesCount"></a>
# **reportsGetFilesCount**
> CountVM reportsGetFilesCount(id)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | folder id
    try {
      CountVM result = apiInstance.reportsGetFilesCount(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsGetFilesCount");
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

<a id="reportsGetFilesList"></a>
# **reportsGetFilesList**
> ReportsVM reportsGetFilesList(id, skip, take, searchPattern, orderBy, desc, useRegex)

Get all files from specified folder. &lt;br /&gt;  User with Get Entity permission can access this method. &lt;br /&gt;  The method will returns minimal infomration about the file: &lt;br /&gt;  id, name, size, editedTime, createdTime, tags, status, statusReason.

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | folder id
    Integer skip = 0; // Integer | number of files, that have to be skipped
    Integer take = 10; // Integer | number of files, that have to be returned
    String searchPattern = "searchPattern_example"; // String | 
    FileSorting orderBy = FileSorting.fromValue("CreatedTime"); // FileSorting | 
    Boolean desc = false; // Boolean | 
    Boolean useRegex = false; // Boolean | 
    try {
      ReportsVM result = apiInstance.reportsGetFilesList(id, skip, take, searchPattern, orderBy, desc, useRegex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsGetFilesList");
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
| **orderBy** | [**FileSorting**](.md)|  | [optional] [enum: CreatedTime, EditedTime, Size, Name] |
| **desc** | **Boolean**|  | [optional] [default to false] |
| **useRegex** | **Boolean**|  | [optional] [default to false] |

### Return type

[**ReportsVM**](ReportsVM.md)

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

<a id="reportsGetPermissions"></a>
# **reportsGetPermissions**
> FilePermissionsVM reportsGetPermissions(id)



### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      FilePermissionsVM result = apiInstance.reportsGetPermissions(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsGetPermissions");
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

<a id="reportsGetSharingKeys"></a>
# **reportsGetSharingKeys**
> FileSharingKeysVM reportsGetSharingKeys(id)

Returns all sharing keys, associated with the file

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | file id
    try {
      FileSharingKeysVM result = apiInstance.reportsGetSharingKeys(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsGetSharingKeys");
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

[**FileSharingKeysVM**](FileSharingKeysVM.md)

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
| **403** | Forbidden |  -  |
| **402** | Client Error |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |

<a id="reportsMoveFile"></a>
# **reportsMoveFile**
> ReportVM reportsMoveFile(id, folderId)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | file id
    String folderId = "folderId_example"; // String | folder id
    try {
      ReportVM result = apiInstance.reportsMoveFile(id, folderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsMoveFile");
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

[**ReportVM**](ReportVM.md)

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

<a id="reportsMoveFileToBin"></a>
# **reportsMoveFileToBin**
> reportsMoveFileToBin(id)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | file id
    try {
      apiInstance.reportsMoveFileToBin(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsMoveFileToBin");
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

<a id="reportsRecoverFile"></a>
# **reportsRecoverFile**
> reportsRecoverFile(id, recoveryPath)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | file id
    String recoveryPath = "recoveryPath_example"; // String | 
    try {
      apiInstance.reportsRecoverFile(id, recoveryPath);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsRecoverFile");
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

<a id="reportsRenameFile"></a>
# **reportsRenameFile**
> ReportVM reportsRenameFile(id, fileRenameVM)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | 
    FileRenameVM fileRenameVM = new FileRenameVM(); // FileRenameVM | 
    try {
      ReportVM result = apiInstance.reportsRenameFile(id, fileRenameVM);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsRenameFile");
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

[**ReportVM**](ReportVM.md)

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

<a id="reportsStaticPreview"></a>
# **reportsStaticPreview**
> ExportVM reportsStaticPreview(id, previewReportVM)

Make preview for the report.  Generate a new or return exist prepared svg files.  If template was changed will be returned a new.  Pass the &#x60;&#x60; parameter to check prepared timestamp

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | template id
    PreviewReportVM previewReportVM = new PreviewReportVM(); // PreviewReportVM | Model with parameters
    try {
      ExportVM result = apiInstance.reportsStaticPreview(id, previewReportVM);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsStaticPreview");
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
| **id** | **String**| template id | |
| **previewReportVM** | [**PreviewReportVM**](PreviewReportVM.md)| Model with parameters | [optional] |

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
| **200** | Specified template has been prepared |  -  |
| **204** | Specified template has been prepared |  -  |
| **400** | Template Id is null |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Template or folder not found |  -  |

<a id="reportsUpdateIcon"></a>
# **reportsUpdateIcon**
> ReportVM reportsUpdateIcon(id, fileIconVM)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | 
    FileIconVM fileIconVM = new FileIconVM(); // FileIconVM | 
    try {
      ReportVM result = apiInstance.reportsUpdateIcon(id, fileIconVM);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsUpdateIcon");
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

[**ReportVM**](ReportVM.md)

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

<a id="reportsUpdatePermissions"></a>
# **reportsUpdatePermissions**
> reportsUpdatePermissions(id, updateFilePermissionsVM)

Update permissions

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | 
    UpdateFilePermissionsVM updateFilePermissionsVM = new UpdateFilePermissionsVM(); // UpdateFilePermissionsVM | 
    try {
      apiInstance.reportsUpdatePermissions(id, updateFilePermissionsVM);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsUpdatePermissions");
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

<a id="reportsUpdateTags"></a>
# **reportsUpdateTags**
> ReportVM reportsUpdateTags(id, fileTagsUpdateVM)

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
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | 
    FileTagsUpdateVM fileTagsUpdateVM = new FileTagsUpdateVM(); // FileTagsUpdateVM | 
    try {
      ReportVM result = apiInstance.reportsUpdateTags(id, fileTagsUpdateVM);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsUpdateTags");
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

[**ReportVM**](ReportVM.md)

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

<a id="reportsUploadFile"></a>
# **reportsUploadFile**
> ReportVM reportsUploadFile(id, reportCreateVM)

Upload a file to the specified folder. The method is deprecated, use the UploadFileV2 method instead!

User with Create Entity permission can access this method.

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | Identifier of folder
    ReportCreateVM reportCreateVM = new ReportCreateVM(); // ReportCreateVM | file's view model
    try {
      ReportVM result = apiInstance.reportsUploadFile(id, reportCreateVM);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsUploadFile");
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
| **reportCreateVM** | [**ReportCreateVM**](ReportCreateVM.md)| file&#39;s view model | [optional] |

### Return type

[**ReportVM**](ReportVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | File has been uploaded |  -  |
| **400** | fileVM view model is not valid |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | subscription is outdated |  -  |
| **404** | folder/subscription is not found |  -  |

<a id="reportsUploadFileV2"></a>
# **reportsUploadFileV2**
> ReportVM reportsUploadFileV2(id, fileContent, templateId, tags, icon)

Alternative api for upload a file to the specified folder!

User with Create Entity permission can access this method.

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String id = "id_example"; // String | Identifier of folder
    File fileContent = new File("/path/to/file"); // File | 
    String templateId = "templateId_example"; // String | 
    List<String> tags = Arrays.asList(); // List<String> | 
    File icon = new File("/path/to/file"); // File | 
    try {
      ReportVM result = apiInstance.reportsUploadFileV2(id, fileContent, templateId, tags, icon);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsUploadFileV2");
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
| **fileContent** | **File**|  | |
| **templateId** | **String**|  | [optional] |
| **tags** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **icon** | **File**|  | [optional] |

### Return type

[**ReportVM**](ReportVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | File has been uploaded |  -  |
| **400** | fileVM view model is not valid |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | subscription is outdated |  -  |
| **404** | folder/subscription is not found |  -  |

