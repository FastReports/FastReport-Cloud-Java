# ReportsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**reportFolderAndFileClearRecycleBin**](ReportsApi.md#reportFolderAndFileClearRecycleBin) | **DELETE** /api/rp/v1/Reports/{subscriptionId}/ClearRecycleBin | Delete all folders and files from recycle bin |
| [**reportFolderAndFileClearRecycleBinWithHttpInfo**](ReportsApi.md#reportFolderAndFileClearRecycleBinWithHttpInfo) | **DELETE** /api/rp/v1/Reports/{subscriptionId}/ClearRecycleBin | Delete all folders and files from recycle bin |
| [**reportFolderAndFileCopyFiles**](ReportsApi.md#reportFolderAndFileCopyFiles) | **POST** /api/rp/v1/Reports/{subscriptionId}/CopyFiles | Copy folders and files to a specified folder |
| [**reportFolderAndFileCopyFilesWithHttpInfo**](ReportsApi.md#reportFolderAndFileCopyFilesWithHttpInfo) | **POST** /api/rp/v1/Reports/{subscriptionId}/CopyFiles | Copy folders and files to a specified folder |
| [**reportFolderAndFileDeleteFiles**](ReportsApi.md#reportFolderAndFileDeleteFiles) | **POST** /api/rp/v1/Reports/{subscriptionId}/DeleteFiles | Delete folders and files |
| [**reportFolderAndFileDeleteFilesWithHttpInfo**](ReportsApi.md#reportFolderAndFileDeleteFilesWithHttpInfo) | **POST** /api/rp/v1/Reports/{subscriptionId}/DeleteFiles | Delete folders and files |
| [**reportFolderAndFileGetCount**](ReportsApi.md#reportFolderAndFileGetCount) | **GET** /api/rp/v1/Reports/Folder/{id}/CountFolderAndFiles | Get count of files and folders what contains in a specified folder |
| [**reportFolderAndFileGetCountWithHttpInfo**](ReportsApi.md#reportFolderAndFileGetCountWithHttpInfo) | **GET** /api/rp/v1/Reports/Folder/{id}/CountFolderAndFiles | Get count of files and folders what contains in a specified folder |
| [**reportFolderAndFileGetFoldersAndFiles**](ReportsApi.md#reportFolderAndFileGetFoldersAndFiles) | **GET** /api/rp/v1/Reports/Folder/{id}/ListFolderAndFiles | Get all folders and files from specified folder |
| [**reportFolderAndFileGetFoldersAndFilesWithHttpInfo**](ReportsApi.md#reportFolderAndFileGetFoldersAndFilesWithHttpInfo) | **GET** /api/rp/v1/Reports/Folder/{id}/ListFolderAndFiles | Get all folders and files from specified folder |
| [**reportFolderAndFileGetRecycleBinFoldersAndFiles**](ReportsApi.md#reportFolderAndFileGetRecycleBinFoldersAndFiles) | **GET** /api/rp/v1/Reports/{subscriptionId}/ListRecycleBinFolderAndFiles | Get all folders and files from recycle bin |
| [**reportFolderAndFileGetRecycleBinFoldersAndFilesWithHttpInfo**](ReportsApi.md#reportFolderAndFileGetRecycleBinFoldersAndFilesWithHttpInfo) | **GET** /api/rp/v1/Reports/{subscriptionId}/ListRecycleBinFolderAndFiles | Get all folders and files from recycle bin |
| [**reportFolderAndFileMoveFiles**](ReportsApi.md#reportFolderAndFileMoveFiles) | **POST** /api/rp/v1/Reports/{subscriptionId}/MoveFiles | Move folders and files to a specified folder |
| [**reportFolderAndFileMoveFilesWithHttpInfo**](ReportsApi.md#reportFolderAndFileMoveFilesWithHttpInfo) | **POST** /api/rp/v1/Reports/{subscriptionId}/MoveFiles | Move folders and files to a specified folder |
| [**reportFolderAndFileMoveFilesToBin**](ReportsApi.md#reportFolderAndFileMoveFilesToBin) | **POST** /api/rp/v1/Reports/{subscriptionId}/ToBin | Move folders and files to bin |
| [**reportFolderAndFileMoveFilesToBinWithHttpInfo**](ReportsApi.md#reportFolderAndFileMoveFilesToBinWithHttpInfo) | **POST** /api/rp/v1/Reports/{subscriptionId}/ToBin | Move folders and files to bin |
| [**reportFolderAndFileRecoverAllFromRecycleBin**](ReportsApi.md#reportFolderAndFileRecoverAllFromRecycleBin) | **POST** /api/rp/v1/Reports/{subscriptionId}/RecoverRecycleBin | Recover all folders and files from recycle bin |
| [**reportFolderAndFileRecoverAllFromRecycleBinWithHttpInfo**](ReportsApi.md#reportFolderAndFileRecoverAllFromRecycleBinWithHttpInfo) | **POST** /api/rp/v1/Reports/{subscriptionId}/RecoverRecycleBin | Recover all folders and files from recycle bin |
| [**reportFolderAndFileRecoverFiles**](ReportsApi.md#reportFolderAndFileRecoverFiles) | **POST** /api/rp/v1/Reports/{subscriptionId}/RecoverFiles | Recover folders and files from bin |
| [**reportFolderAndFileRecoverFilesWithHttpInfo**](ReportsApi.md#reportFolderAndFileRecoverFilesWithHttpInfo) | **POST** /api/rp/v1/Reports/{subscriptionId}/RecoverFiles | Recover folders and files from bin |
| [**reportFoldersCalculateFolderSize**](ReportsApi.md#reportFoldersCalculateFolderSize) | **GET** /api/rp/v1/Reports/Folder/{id}/size | Get specified folder, calculate it&#39;s size |
| [**reportFoldersCalculateFolderSizeWithHttpInfo**](ReportsApi.md#reportFoldersCalculateFolderSizeWithHttpInfo) | **GET** /api/rp/v1/Reports/Folder/{id}/size | Get specified folder, calculate it&#39;s size |
| [**reportFoldersCopyFolder**](ReportsApi.md#reportFoldersCopyFolder) | **POST** /api/rp/v1/Reports/Folder/{id}/Copy/{folderId} | Move folder to a specified folder |
| [**reportFoldersCopyFolderWithHttpInfo**](ReportsApi.md#reportFoldersCopyFolderWithHttpInfo) | **POST** /api/rp/v1/Reports/Folder/{id}/Copy/{folderId} | Move folder to a specified folder |
| [**reportFoldersDeleteFolder**](ReportsApi.md#reportFoldersDeleteFolder) | **DELETE** /api/rp/v1/Reports/Folder/{id} | Delete specified folder |
| [**reportFoldersDeleteFolderWithHttpInfo**](ReportsApi.md#reportFoldersDeleteFolderWithHttpInfo) | **DELETE** /api/rp/v1/Reports/Folder/{id} | Delete specified folder |
| [**reportFoldersExport**](ReportsApi.md#reportFoldersExport) | **POST** /api/rp/v1/Reports/Folder/{id}/Export | Export specified report folder to a specified format |
| [**reportFoldersExportWithHttpInfo**](ReportsApi.md#reportFoldersExportWithHttpInfo) | **POST** /api/rp/v1/Reports/Folder/{id}/Export | Export specified report folder to a specified format |
| [**reportFoldersGetBreadcrumbs**](ReportsApi.md#reportFoldersGetBreadcrumbs) | **GET** /api/rp/v1/Reports/Folder/{id}/Breadcrumbs | Get specified folder breadcrumbs |
| [**reportFoldersGetBreadcrumbsWithHttpInfo**](ReportsApi.md#reportFoldersGetBreadcrumbsWithHttpInfo) | **GET** /api/rp/v1/Reports/Folder/{id}/Breadcrumbs | Get specified folder breadcrumbs |
| [**reportFoldersGetFolder**](ReportsApi.md#reportFoldersGetFolder) | **GET** /api/rp/v1/Reports/Folder/{id} | Get specified folder |
| [**reportFoldersGetFolderWithHttpInfo**](ReportsApi.md#reportFoldersGetFolderWithHttpInfo) | **GET** /api/rp/v1/Reports/Folder/{id} | Get specified folder |
| [**reportFoldersGetFolders**](ReportsApi.md#reportFoldersGetFolders) | **GET** /api/rp/v1/Reports/Folder/{id}/ListFolders | Get all folders from specified folder |
| [**reportFoldersGetFoldersWithHttpInfo**](ReportsApi.md#reportFoldersGetFoldersWithHttpInfo) | **GET** /api/rp/v1/Reports/Folder/{id}/ListFolders | Get all folders from specified folder |
| [**reportFoldersGetFoldersCount**](ReportsApi.md#reportFoldersGetFoldersCount) | **GET** /api/rp/v1/Reports/Folder/{id}/CountFolders | Get count of folders what contains in a specified folder |
| [**reportFoldersGetFoldersCountWithHttpInfo**](ReportsApi.md#reportFoldersGetFoldersCountWithHttpInfo) | **GET** /api/rp/v1/Reports/Folder/{id}/CountFolders | Get count of folders what contains in a specified folder |
| [**reportFoldersGetOrCreate**](ReportsApi.md#reportFoldersGetOrCreate) | **GET** /api/rp/v1/Reports/Folder/getOrCreate | Get specified folder |
| [**reportFoldersGetOrCreateWithHttpInfo**](ReportsApi.md#reportFoldersGetOrCreateWithHttpInfo) | **GET** /api/rp/v1/Reports/Folder/getOrCreate | Get specified folder |
| [**reportFoldersGetPermissions**](ReportsApi.md#reportFoldersGetPermissions) | **GET** /api/rp/v1/Reports/Folder/{id}/permissions | Get all folder permissions |
| [**reportFoldersGetPermissionsWithHttpInfo**](ReportsApi.md#reportFoldersGetPermissionsWithHttpInfo) | **GET** /api/rp/v1/Reports/Folder/{id}/permissions | Get all folder permissions |
| [**reportFoldersGetRootFolder**](ReportsApi.md#reportFoldersGetRootFolder) | **GET** /api/rp/v1/Reports/Root | Get user&#39;s root folder (without parents) |
| [**reportFoldersGetRootFolderWithHttpInfo**](ReportsApi.md#reportFoldersGetRootFolderWithHttpInfo) | **GET** /api/rp/v1/Reports/Root | Get user&#39;s root folder (without parents) |
| [**reportFoldersMoveFolder**](ReportsApi.md#reportFoldersMoveFolder) | **POST** /api/rp/v1/Reports/Folder/{id}/Move/{folderId} | Move folder to a specified folder |
| [**reportFoldersMoveFolderWithHttpInfo**](ReportsApi.md#reportFoldersMoveFolderWithHttpInfo) | **POST** /api/rp/v1/Reports/Folder/{id}/Move/{folderId} | Move folder to a specified folder |
| [**reportFoldersMoveFolderToBin**](ReportsApi.md#reportFoldersMoveFolderToBin) | **DELETE** /api/rp/v1/Reports/Folder/{id}/ToBin | Move specified folder to recycle bin |
| [**reportFoldersMoveFolderToBinWithHttpInfo**](ReportsApi.md#reportFoldersMoveFolderToBinWithHttpInfo) | **DELETE** /api/rp/v1/Reports/Folder/{id}/ToBin | Move specified folder to recycle bin |
| [**reportFoldersPostFolder**](ReportsApi.md#reportFoldersPostFolder) | **POST** /api/rp/v1/Reports/Folder/{id}/Folder | Create folder |
| [**reportFoldersPostFolderWithHttpInfo**](ReportsApi.md#reportFoldersPostFolderWithHttpInfo) | **POST** /api/rp/v1/Reports/Folder/{id}/Folder | Create folder |
| [**reportFoldersRecoverFolder**](ReportsApi.md#reportFoldersRecoverFolder) | **POST** /api/rp/v1/Reports/Folder/{id}/Recover | Recover specified folder |
| [**reportFoldersRecoverFolderWithHttpInfo**](ReportsApi.md#reportFoldersRecoverFolderWithHttpInfo) | **POST** /api/rp/v1/Reports/Folder/{id}/Recover | Recover specified folder |
| [**reportFoldersRenameFolder**](ReportsApi.md#reportFoldersRenameFolder) | **PUT** /api/rp/v1/Reports/Folder/{id}/Rename | Rename a folder |
| [**reportFoldersRenameFolderWithHttpInfo**](ReportsApi.md#reportFoldersRenameFolderWithHttpInfo) | **PUT** /api/rp/v1/Reports/Folder/{id}/Rename | Rename a folder |
| [**reportFoldersUpdateIcon**](ReportsApi.md#reportFoldersUpdateIcon) | **PUT** /api/rp/v1/Reports/Folder/{id}/Icon | Update a folder&#39;s icon |
| [**reportFoldersUpdateIconWithHttpInfo**](ReportsApi.md#reportFoldersUpdateIconWithHttpInfo) | **PUT** /api/rp/v1/Reports/Folder/{id}/Icon | Update a folder&#39;s icon |
| [**reportFoldersUpdatePermissions**](ReportsApi.md#reportFoldersUpdatePermissions) | **POST** /api/rp/v1/Reports/{id}/permissions | Update permissions |
| [**reportFoldersUpdatePermissionsWithHttpInfo**](ReportsApi.md#reportFoldersUpdatePermissionsWithHttpInfo) | **POST** /api/rp/v1/Reports/{id}/permissions | Update permissions |
| [**reportFoldersUpdateTags**](ReportsApi.md#reportFoldersUpdateTags) | **PUT** /api/rp/v1/Reports/Folder/{id}/UpdateTags | Update tags |
| [**reportFoldersUpdateTagsWithHttpInfo**](ReportsApi.md#reportFoldersUpdateTagsWithHttpInfo) | **PUT** /api/rp/v1/Reports/Folder/{id}/UpdateTags | Update tags |
| [**reportsCopyFile**](ReportsApi.md#reportsCopyFile) | **POST** /api/rp/v1/Reports/File/{id}/Copy/{folderId} | Copy file to a specified folder |
| [**reportsCopyFileWithHttpInfo**](ReportsApi.md#reportsCopyFileWithHttpInfo) | **POST** /api/rp/v1/Reports/File/{id}/Copy/{folderId} | Copy file to a specified folder |
| [**reportsDeleteFile**](ReportsApi.md#reportsDeleteFile) | **DELETE** /api/rp/v1/Reports/File/{id} | Delete specified file |
| [**reportsDeleteFileWithHttpInfo**](ReportsApi.md#reportsDeleteFileWithHttpInfo) | **DELETE** /api/rp/v1/Reports/File/{id} | Delete specified file |
| [**reportsExport**](ReportsApi.md#reportsExport) | **POST** /api/rp/v1/Reports/File/{id}/Export | Export specified report to a specified format |
| [**reportsExportWithHttpInfo**](ReportsApi.md#reportsExportWithHttpInfo) | **POST** /api/rp/v1/Reports/File/{id}/Export | Export specified report to a specified format |
| [**reportsGetFile**](ReportsApi.md#reportsGetFile) | **GET** /api/rp/v1/Reports/File/{id} | Get specified file |
| [**reportsGetFileWithHttpInfo**](ReportsApi.md#reportsGetFileWithHttpInfo) | **GET** /api/rp/v1/Reports/File/{id} | Get specified file |
| [**reportsGetFileHistory**](ReportsApi.md#reportsGetFileHistory) | **GET** /api/rp/v1/Reports/File/{id}/History | Returns list of actions, performed on this file |
| [**reportsGetFileHistoryWithHttpInfo**](ReportsApi.md#reportsGetFileHistoryWithHttpInfo) | **GET** /api/rp/v1/Reports/File/{id}/History | Returns list of actions, performed on this file |
| [**reportsGetFilesCount**](ReportsApi.md#reportsGetFilesCount) | **GET** /api/rp/v1/Reports/Folder/{id}/CountFiles | Get count of files what contains in a specified folder |
| [**reportsGetFilesCountWithHttpInfo**](ReportsApi.md#reportsGetFilesCountWithHttpInfo) | **GET** /api/rp/v1/Reports/Folder/{id}/CountFiles | Get count of files what contains in a specified folder |
| [**reportsGetFilesList**](ReportsApi.md#reportsGetFilesList) | **GET** /api/rp/v1/Reports/Folder/{id}/ListFiles | Get all files from specified folder. &lt;br /&gt;  User with Get Entity permission can access this method. &lt;br /&gt;  The method will returns minimal infomration about the file: &lt;br /&gt;  id, name, size, editedTime, createdTime, tags, status, statusReason. |
| [**reportsGetFilesListWithHttpInfo**](ReportsApi.md#reportsGetFilesListWithHttpInfo) | **GET** /api/rp/v1/Reports/Folder/{id}/ListFiles | Get all files from specified folder. &lt;br /&gt;  User with Get Entity permission can access this method. &lt;br /&gt;  The method will returns minimal infomration about the file: &lt;br /&gt;  id, name, size, editedTime, createdTime, tags, status, statusReason. |
| [**reportsGetPermissions**](ReportsApi.md#reportsGetPermissions) | **GET** /api/rp/v1/Reports/File/{id}/permissions | Get all file permissions |
| [**reportsGetPermissionsWithHttpInfo**](ReportsApi.md#reportsGetPermissionsWithHttpInfo) | **GET** /api/rp/v1/Reports/File/{id}/permissions | Get all file permissions |
| [**reportsMoveFile**](ReportsApi.md#reportsMoveFile) | **POST** /api/rp/v1/Reports/File/{id}/Move/{folderId} | Move file to a specified folder |
| [**reportsMoveFileWithHttpInfo**](ReportsApi.md#reportsMoveFileWithHttpInfo) | **POST** /api/rp/v1/Reports/File/{id}/Move/{folderId} | Move file to a specified folder |
| [**reportsMoveFileToBin**](ReportsApi.md#reportsMoveFileToBin) | **DELETE** /api/rp/v1/Reports/File/{id}/ToBin | Move specified file to recycle bin |
| [**reportsMoveFileToBinWithHttpInfo**](ReportsApi.md#reportsMoveFileToBinWithHttpInfo) | **DELETE** /api/rp/v1/Reports/File/{id}/ToBin | Move specified file to recycle bin |
| [**reportsRecoverFile**](ReportsApi.md#reportsRecoverFile) | **POST** /api/rp/v1/Reports/File/{id}/Recover | Recover specified file from bin |
| [**reportsRecoverFileWithHttpInfo**](ReportsApi.md#reportsRecoverFileWithHttpInfo) | **POST** /api/rp/v1/Reports/File/{id}/Recover | Recover specified file from bin |
| [**reportsRenameFile**](ReportsApi.md#reportsRenameFile) | **PUT** /api/rp/v1/Reports/File/{id}/Rename | Rename a file |
| [**reportsRenameFileWithHttpInfo**](ReportsApi.md#reportsRenameFileWithHttpInfo) | **PUT** /api/rp/v1/Reports/File/{id}/Rename | Rename a file |
| [**reportsStaticPreview**](ReportsApi.md#reportsStaticPreview) | **POST** /api/rp/v1/Reports/File/{id}/StaticPreview | Make preview for the report.  Generate a new or return exist prepared svg files.  If template was changed will be returned a new.  Pass the &#x60;&#x60; parameter to check prepared timestamp |
| [**reportsStaticPreviewWithHttpInfo**](ReportsApi.md#reportsStaticPreviewWithHttpInfo) | **POST** /api/rp/v1/Reports/File/{id}/StaticPreview | Make preview for the report.  Generate a new or return exist prepared svg files.  If template was changed will be returned a new.  Pass the &#x60;&#x60; parameter to check prepared timestamp |
| [**reportsUpdateIcon**](ReportsApi.md#reportsUpdateIcon) | **PUT** /api/rp/v1/Reports/File/{id}/Icon | Update a files&#39;s icon |
| [**reportsUpdateIconWithHttpInfo**](ReportsApi.md#reportsUpdateIconWithHttpInfo) | **PUT** /api/rp/v1/Reports/File/{id}/Icon | Update a files&#39;s icon |
| [**reportsUpdatePermissions**](ReportsApi.md#reportsUpdatePermissions) | **POST** /api/rp/v1/Reports/File/{id}/permissions | Update permissions |
| [**reportsUpdatePermissionsWithHttpInfo**](ReportsApi.md#reportsUpdatePermissionsWithHttpInfo) | **POST** /api/rp/v1/Reports/File/{id}/permissions | Update permissions |
| [**reportsUpdateTags**](ReportsApi.md#reportsUpdateTags) | **PUT** /api/rp/v1/Reports/File/{id}/UpdateTags | Update tags |
| [**reportsUpdateTagsWithHttpInfo**](ReportsApi.md#reportsUpdateTagsWithHttpInfo) | **PUT** /api/rp/v1/Reports/File/{id}/UpdateTags | Update tags |
| [**reportsUploadFile**](ReportsApi.md#reportsUploadFile) | **POST** /api/rp/v1/Reports/Folder/{id}/File | Upload a file to the specified folder. The method is deprecated, use the UploadFileV2 method instead! |
| [**reportsUploadFileWithHttpInfo**](ReportsApi.md#reportsUploadFileWithHttpInfo) | **POST** /api/rp/v1/Reports/Folder/{id}/File | Upload a file to the specified folder. The method is deprecated, use the UploadFileV2 method instead! |
| [**reportsUploadFileV2**](ReportsApi.md#reportsUploadFileV2) | **POST** /api/rp/v2/Reports/Folder/{id}/File | Alternative api for upload a file to the specified folder! |
| [**reportsUploadFileV2WithHttpInfo**](ReportsApi.md#reportsUploadFileV2WithHttpInfo) | **POST** /api/rp/v2/Reports/Folder/{id}/File | Alternative api for upload a file to the specified folder! |



## reportFolderAndFileClearRecycleBin

> void reportFolderAndFileClearRecycleBin(subscriptionId)

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
| **400** | FolderId is null |  -  |
| **402** | Payment required, subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or folder not found |  -  |

## reportFolderAndFileClearRecycleBinWithHttpInfo

> ApiResponse<Void> reportFolderAndFileClearRecycleBin reportFolderAndFileClearRecycleBinWithHttpInfo(subscriptionId)

Delete all folders and files from recycle bin

User with a Delete RecycleBin permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<Void> response = apiInstance.reportFolderAndFileClearRecycleBinWithHttpInfo(subscriptionId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFolderAndFileClearRecycleBin");
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
| **subscriptionId** | **String**| subscription id | |

### Return type


ApiResponse<Void>

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | All folders and files in bin have been deleted |  -  |
| **400** | FolderId is null |  -  |
| **402** | Payment required, subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or folder not found |  -  |


## reportFolderAndFileCopyFiles

> void reportFolderAndFileCopyFiles(subscriptionId, selectedFilesVM)

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

## reportFolderAndFileCopyFilesWithHttpInfo

> ApiResponse<Void> reportFolderAndFileCopyFiles reportFolderAndFileCopyFilesWithHttpInfo(subscriptionId, selectedFilesVM)

Copy folders and files to a specified folder

User with a Get permission for a files and Create permission for a destination folder can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<Void> response = apiInstance.reportFolderAndFileCopyFilesWithHttpInfo(subscriptionId, selectedFilesVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFolderAndFileCopyFiles");
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
| **subscriptionId** | **String**| id of current subscription | |
| **selectedFilesVM** | [**SelectedFilesVM**](SelectedFilesVM.md)| VM with files&#39; ids and params of their destination | [optional] |

### Return type


ApiResponse<Void>

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


## reportFolderAndFileDeleteFiles

> void reportFolderAndFileDeleteFiles(subscriptionId, selectedFilesVM)

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
| **400** | FolderId is null |  -  |
| **402** | Payment required, subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or folder not found |  -  |

## reportFolderAndFileDeleteFilesWithHttpInfo

> ApiResponse<Void> reportFolderAndFileDeleteFiles reportFolderAndFileDeleteFilesWithHttpInfo(subscriptionId, selectedFilesVM)

Delete folders and files

User with a Delete permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<Void> response = apiInstance.reportFolderAndFileDeleteFilesWithHttpInfo(subscriptionId, selectedFilesVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFolderAndFileDeleteFiles");
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
| **subscriptionId** | **String**| id of current subscription | |
| **selectedFilesVM** | [**SelectedFilesVM**](SelectedFilesVM.md)| VM with files&#39; ids and params of their destination | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | All folders and files have been deleted |  -  |
| **400** | FolderId is null |  -  |
| **402** | Payment required, subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or folder not found |  -  |


## reportFolderAndFileGetCount

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
| **400** | FolderId is null |  -  |
| **402** | Payment required, subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |

## reportFolderAndFileGetCountWithHttpInfo

> ApiResponse<CountVM> reportFolderAndFileGetCount reportFolderAndFileGetCountWithHttpInfo(id, searchPattern, useRegex)

Get count of files and folders what contains in a specified folder

User with a Get Count permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<CountVM> response = apiInstance.reportFolderAndFileGetCountWithHttpInfo(id, searchPattern, useRegex);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFolderAndFileGetCount");
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
| **id** | **String**| folder id | |
| **searchPattern** | **String**| string, that must be incuded in file or folder name to be counted &lt;br /&gt;              (leave undefined to count all files and folders) | [optional] |
| **useRegex** | **Boolean**| set this to true if you want to use regular expression to search | [optional] [default to false] |

### Return type

ApiResponse<[**CountVM**](CountVM.md)>


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
| **402** | Payment required, subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |


## reportFolderAndFileGetFoldersAndFiles

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
        FileSorting orderBy = FileSorting.fromValue("None"); // FileSorting | indicates a field to sort by
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
| **400** | FolderId is null |  -  |
| **402** | Payment required, subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or folder not found |  -  |

## reportFolderAndFileGetFoldersAndFilesWithHttpInfo

> ApiResponse<FilesVM> reportFolderAndFileGetFoldersAndFiles reportFolderAndFileGetFoldersAndFilesWithHttpInfo(id, skip, take, orderBy, desc, searchPattern, useRegex)

Get all folders and files from specified folder

User with a Get Entity permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
        FileSorting orderBy = FileSorting.fromValue("None"); // FileSorting | indicates a field to sort by
        Boolean desc = false; // Boolean | indicates if sorting is descending
        String searchPattern = ""; // String | 
        Boolean useRegex = false; // Boolean | 
        try {
            ApiResponse<FilesVM> response = apiInstance.reportFolderAndFileGetFoldersAndFilesWithHttpInfo(id, skip, take, orderBy, desc, searchPattern, useRegex);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFolderAndFileGetFoldersAndFiles");
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
| **id** | **String**| folder id | |
| **skip** | **Integer**| number of folder and files, that have to be skipped | [optional] [default to 0] |
| **take** | **Integer**| number of folder and files, that have to be returned | [optional] [default to 10] |
| **orderBy** | [**FileSorting**](.md)| indicates a field to sort by | [optional] [enum: None, CreatedTime, EditedTime, Size, Name] |
| **desc** | **Boolean**| indicates if sorting is descending | [optional] [default to false] |
| **searchPattern** | **String**|  | [optional] [default to ] |
| **useRegex** | **Boolean**|  | [optional] [default to false] |

### Return type

ApiResponse<[**FilesVM**](FilesVM.md)>


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns list of the files from a specified folder |  -  |
| **400** | FolderId is null |  -  |
| **402** | Payment required, subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or folder not found |  -  |


## reportFolderAndFileGetRecycleBinFoldersAndFiles

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
        FileSorting orderBy = FileSorting.fromValue("None"); // FileSorting | indicates a field to sort by
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
| **400** | FolderId is null |  -  |
| **402** | Payment required, subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or folder not found |  -  |

## reportFolderAndFileGetRecycleBinFoldersAndFilesWithHttpInfo

> ApiResponse<FilesVM> reportFolderAndFileGetRecycleBinFoldersAndFiles reportFolderAndFileGetRecycleBinFoldersAndFilesWithHttpInfo(subscriptionId, skip, take, orderBy, desc, searchPattern, useRegex)

Get all folders and files from recycle bin

User with a Get DeletedFiles permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
        FileSorting orderBy = FileSorting.fromValue("None"); // FileSorting | indicates a field to sort by
        Boolean desc = false; // Boolean | indicates if sorting is descending
        String searchPattern = ""; // String | 
        Boolean useRegex = false; // Boolean | 
        try {
            ApiResponse<FilesVM> response = apiInstance.reportFolderAndFileGetRecycleBinFoldersAndFilesWithHttpInfo(subscriptionId, skip, take, orderBy, desc, searchPattern, useRegex);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFolderAndFileGetRecycleBinFoldersAndFiles");
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
| **subscriptionId** | **String**| subscription id | |
| **skip** | **Integer**| number of folder and files, that have to be skipped | [optional] [default to 0] |
| **take** | **Integer**| number of folder and files, that have to be returned | [optional] [default to 10] |
| **orderBy** | [**FileSorting**](.md)| indicates a field to sort by | [optional] [enum: None, CreatedTime, EditedTime, Size, Name] |
| **desc** | **Boolean**| indicates if sorting is descending | [optional] [default to false] |
| **searchPattern** | **String**|  | [optional] [default to ] |
| **useRegex** | **Boolean**|  | [optional] [default to false] |

### Return type

ApiResponse<[**FilesVM**](FilesVM.md)>


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns list of the files from a specified folder |  -  |
| **400** | FolderId is null |  -  |
| **402** | Payment required, subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or folder not found |  -  |


## reportFolderAndFileMoveFiles

> void reportFolderAndFileMoveFiles(subscriptionId, selectedFilesVM)

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

## reportFolderAndFileMoveFilesWithHttpInfo

> ApiResponse<Void> reportFolderAndFileMoveFiles reportFolderAndFileMoveFilesWithHttpInfo(subscriptionId, selectedFilesVM)

Move folders and files to a specified folder

User with a Update Place permission for a files and Create permission for a destination folder can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<Void> response = apiInstance.reportFolderAndFileMoveFilesWithHttpInfo(subscriptionId, selectedFilesVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFolderAndFileMoveFiles");
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
| **subscriptionId** | **String**| id of current subscription | |
| **selectedFilesVM** | [**SelectedFilesVM**](SelectedFilesVM.md)| VM with files&#39; ids and params of their destination | [optional] |

### Return type


ApiResponse<Void>

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


## reportFolderAndFileMoveFilesToBin

> void reportFolderAndFileMoveFilesToBin(subscriptionId, selectedFilesVM)

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
| **400** | FolderId is null |  -  |
| **402** | Payment required, subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or folder not found |  -  |

## reportFolderAndFileMoveFilesToBinWithHttpInfo

> ApiResponse<Void> reportFolderAndFileMoveFilesToBin reportFolderAndFileMoveFilesToBinWithHttpInfo(subscriptionId, selectedFilesVM)

Move folders and files to bin

User with a Delete permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<Void> response = apiInstance.reportFolderAndFileMoveFilesToBinWithHttpInfo(subscriptionId, selectedFilesVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFolderAndFileMoveFilesToBin");
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
| **subscriptionId** | **String**| id of current subscription | |
| **selectedFilesVM** | [**SelectedFilesVM**](SelectedFilesVM.md)| VM with files&#39; ids and params of their destination | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | All folders and files have been moved to bin |  -  |
| **400** | FolderId is null |  -  |
| **402** | Payment required, subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or folder not found |  -  |


## reportFolderAndFileRecoverAllFromRecycleBin

> void reportFolderAndFileRecoverAllFromRecycleBin(subscriptionId)

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
| **400** | FolderId is null |  -  |
| **402** | Payment required, subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or folder not found |  -  |

## reportFolderAndFileRecoverAllFromRecycleBinWithHttpInfo

> ApiResponse<Void> reportFolderAndFileRecoverAllFromRecycleBin reportFolderAndFileRecoverAllFromRecycleBinWithHttpInfo(subscriptionId)

Recover all folders and files from recycle bin

User with a Create RecycleBin permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<Void> response = apiInstance.reportFolderAndFileRecoverAllFromRecycleBinWithHttpInfo(subscriptionId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFolderAndFileRecoverAllFromRecycleBin");
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
| **subscriptionId** | **String**| subscription id | |

### Return type


ApiResponse<Void>

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | All folders and files in bin have been restored |  -  |
| **400** | FolderId is null |  -  |
| **402** | Payment required, subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or folder not found |  -  |


## reportFolderAndFileRecoverFiles

> void reportFolderAndFileRecoverFiles(subscriptionId, selectedFilesVM)

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
| **400** | FolderId is null |  -  |
| **402** | Payment required, subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or folder not found |  -  |

## reportFolderAndFileRecoverFilesWithHttpInfo

> ApiResponse<Void> reportFolderAndFileRecoverFiles reportFolderAndFileRecoverFilesWithHttpInfo(subscriptionId, selectedFilesVM)

Recover folders and files from bin

User with a SubscriptionCreate permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<Void> response = apiInstance.reportFolderAndFileRecoverFilesWithHttpInfo(subscriptionId, selectedFilesVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFolderAndFileRecoverFiles");
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
| **subscriptionId** | **String**| id of current subscription | |
| **selectedFilesVM** | [**SelectedFilesVM**](SelectedFilesVM.md)| VM with files&#39; ids and params of their destination | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | All folders and files have been recovered |  -  |
| **400** | FolderId is null |  -  |
| **402** | Payment required, subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or folder not found |  -  |


## reportFoldersCalculateFolderSize

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
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |

## reportFoldersCalculateFolderSizeWithHttpInfo

> ApiResponse<FolderSizeVM> reportFoldersCalculateFolderSize reportFoldersCalculateFolderSizeWithHttpInfo(id)

Get specified folder, calculate it&#39;s size

User with a Get Entity permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<FolderSizeVM> response = apiInstance.reportFoldersCalculateFolderSizeWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFoldersCalculateFolderSize");
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
| **id** | **String**| folder id | |

### Return type

ApiResponse<[**FolderSizeVM**](FolderSizeVM.md)>


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
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |


## reportFoldersCopyFolder

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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | Folder not found |  -  |

## reportFoldersCopyFolderWithHttpInfo

> ApiResponse<FileVM> reportFoldersCopyFolder reportFoldersCopyFolderWithHttpInfo(id, folderId)

Move folder to a specified folder

User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<FileVM> response = apiInstance.reportFoldersCopyFolderWithHttpInfo(id, folderId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFoldersCopyFolder");
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
| **id** | **String**| moving folder id | |
| **folderId** | **String**| destination folder id | |

### Return type

ApiResponse<[**FileVM**](FileVM.md)>


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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | Folder not found |  -  |


## reportFoldersDeleteFolder

> void reportFoldersDeleteFolder(id)

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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | Folder not found |  -  |

## reportFoldersDeleteFolderWithHttpInfo

> ApiResponse<Void> reportFoldersDeleteFolder reportFoldersDeleteFolderWithHttpInfo(id)

Delete specified folder

User with a Delete Entity permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<Void> response = apiInstance.reportFoldersDeleteFolderWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFoldersDeleteFolder");
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
| **id** | **String**| folder id | |

### Return type


ApiResponse<Void>

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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | Folder not found |  -  |


## reportFoldersExport

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

## reportFoldersExportWithHttpInfo

> ApiResponse<FileVM> reportFoldersExport reportFoldersExportWithHttpInfo(id, exportReportVM)

Export specified report folder to a specified format

User with Execute Export permission on report folder and  Create Entity on an export folder can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<FileVM> response = apiInstance.reportFoldersExportWithHttpInfo(id, exportReportVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFoldersExport");
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
| **id** | **String**| report folder id | |
| **exportReportVM** | [**ExportReportVM**](ExportReportVM.md)| export parameters | [optional] |

### Return type

ApiResponse<[**FileVM**](FileVM.md)>


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


## reportFoldersGetBreadcrumbs

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
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |

## reportFoldersGetBreadcrumbsWithHttpInfo

> ApiResponse<BreadcrumbsVM> reportFoldersGetBreadcrumbs reportFoldersGetBreadcrumbsWithHttpInfo(id)

Get specified folder breadcrumbs

User with a Get Entity permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<BreadcrumbsVM> response = apiInstance.reportFoldersGetBreadcrumbsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFoldersGetBreadcrumbs");
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
| **id** | **String**| folder id | |

### Return type

ApiResponse<[**BreadcrumbsVM**](BreadcrumbsVM.md)>


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
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |


## reportFoldersGetFolder

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
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |

## reportFoldersGetFolderWithHttpInfo

> ApiResponse<FileVM> reportFoldersGetFolder reportFoldersGetFolderWithHttpInfo(id)

Get specified folder

User with a Get Entity permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<FileVM> response = apiInstance.reportFoldersGetFolderWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFoldersGetFolder");
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
| **id** | **String**| folder id | |

### Return type

ApiResponse<[**FileVM**](FileVM.md)>


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
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |


## reportFoldersGetFolders

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
        FileSorting orderBy = FileSorting.fromValue("None"); // FileSorting | 
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
| **400** | folderId is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |

## reportFoldersGetFoldersWithHttpInfo

> ApiResponse<FilesVM> reportFoldersGetFolders reportFoldersGetFoldersWithHttpInfo(id, skip, take, orderBy, desc, searchPattern, useRegex)

Get all folders from specified folder

User with a Get Entity permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
        FileSorting orderBy = FileSorting.fromValue("None"); // FileSorting | 
        Boolean desc = false; // Boolean | 
        String searchPattern = ""; // String | 
        Boolean useRegex = false; // Boolean | 
        try {
            ApiResponse<FilesVM> response = apiInstance.reportFoldersGetFoldersWithHttpInfo(id, skip, take, orderBy, desc, searchPattern, useRegex);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFoldersGetFolders");
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
| **id** | **String**| folder id | |
| **skip** | **Integer**| number of files, that have to be skipped | [optional] [default to 0] |
| **take** | **Integer**| number of files, that have to be returned | [optional] [default to 10] |
| **orderBy** | [**FileSorting**](.md)|  | [optional] [enum: None, CreatedTime, EditedTime, Size, Name] |
| **desc** | **Boolean**|  | [optional] [default to false] |
| **searchPattern** | **String**|  | [optional] [default to ] |
| **useRegex** | **Boolean**|  | [optional] [default to false] |

### Return type

ApiResponse<[**FilesVM**](FilesVM.md)>


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gets all folders from a specified folder |  -  |
| **400** | folderId is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |


## reportFoldersGetFoldersCount

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
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |

## reportFoldersGetFoldersCountWithHttpInfo

> ApiResponse<CountVM> reportFoldersGetFoldersCount reportFoldersGetFoldersCountWithHttpInfo(id)

Get count of folders what contains in a specified folder

User with a Get Count permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<CountVM> response = apiInstance.reportFoldersGetFoldersCountWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFoldersGetFoldersCount");
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
| **id** | **String**| folder id | |

### Return type

ApiResponse<[**CountVM**](CountVM.md)>


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
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |


## reportFoldersGetOrCreate

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
| **400** | Id is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |

## reportFoldersGetOrCreateWithHttpInfo

> ApiResponse<FileVM> reportFoldersGetOrCreate reportFoldersGetOrCreateWithHttpInfo(name, subscriptionId, parentId)

Get specified folder

User with a Get Entity permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<FileVM> response = apiInstance.reportFoldersGetOrCreateWithHttpInfo(name, subscriptionId, parentId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFoldersGetOrCreate");
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
| **name** | **String**| folder name | [optional] |
| **subscriptionId** | **String**| subscriptionId | [optional] |
| **parentId** | **String**| parent folder id | [optional] |

### Return type

ApiResponse<[**FileVM**](FileVM.md)>


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
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |


## reportFoldersGetPermissions

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
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | folder is not found |  -  |

## reportFoldersGetPermissionsWithHttpInfo

> ApiResponse<FilePermissionsVM> reportFoldersGetPermissions reportFoldersGetPermissionsWithHttpInfo(id)

Get all folder permissions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<FilePermissionsVM> response = apiInstance.reportFoldersGetPermissionsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFoldersGetPermissions");
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
| **id** | **String**|  | |

### Return type

ApiResponse<[**FilePermissionsVM**](FilePermissionsVM.md)>


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
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | folder is not found |  -  |


## reportFoldersGetRootFolder

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
| **400** | Error with the request. |  -  |
| **404** | Not found subscription |  -  |
| **403** | No permissions to get root folder |  -  |

## reportFoldersGetRootFolderWithHttpInfo

> ApiResponse<FileVM> reportFoldersGetRootFolder reportFoldersGetRootFolderWithHttpInfo(subscriptionId)

Get user&#39;s root folder (without parents)

&gt; Breakchange. Now user model doesn&#39;t contain a root folders.  This method can return error 400 and 404 when subscription is not found.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<FileVM> response = apiInstance.reportFoldersGetRootFolderWithHttpInfo(subscriptionId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFoldersGetRootFolder");
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
| **subscriptionId** | **String**|  | [optional] |

### Return type

ApiResponse<[**FileVM**](FileVM.md)>


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gets user&#39;s root folder (without parents) |  -  |
| **400** | Error with the request. |  -  |
| **404** | Not found subscription |  -  |
| **403** | No permissions to get root folder |  -  |


## reportFoldersMoveFolder

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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | Folder not found |  -  |

## reportFoldersMoveFolderWithHttpInfo

> ApiResponse<FileVM> reportFoldersMoveFolder reportFoldersMoveFolderWithHttpInfo(id, folderId)

Move folder to a specified folder

User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<FileVM> response = apiInstance.reportFoldersMoveFolderWithHttpInfo(id, folderId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFoldersMoveFolder");
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
| **id** | **String**| moving folder id | |
| **folderId** | **String**| destination folder id | |

### Return type

ApiResponse<[**FileVM**](FileVM.md)>


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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | Folder not found |  -  |


## reportFoldersMoveFolderToBin

> void reportFoldersMoveFolderToBin(id)

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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | Folder not found |  -  |

## reportFoldersMoveFolderToBinWithHttpInfo

> ApiResponse<Void> reportFoldersMoveFolderToBin reportFoldersMoveFolderToBinWithHttpInfo(id)

Move specified folder to recycle bin

User with a Delete Entity permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<Void> response = apiInstance.reportFoldersMoveFolderToBinWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFoldersMoveFolderToBin");
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
| **id** | **String**| folder id | |

### Return type


ApiResponse<Void>

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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | Folder not found |  -  |


## reportFoldersPostFolder

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
| **400** | Parent folder id is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | subscription is outdated |  -  |
| **404** | parent folder/subscription not found |  -  |

## reportFoldersPostFolderWithHttpInfo

> ApiResponse<FileVM> reportFoldersPostFolder reportFoldersPostFolderWithHttpInfo(id, reportFolderCreateVM)

Create folder

User with a Create Entity permisison can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<FileVM> response = apiInstance.reportFoldersPostFolderWithHttpInfo(id, reportFolderCreateVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFoldersPostFolder");
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
| **id** | **String**| Identifier of parent folder id | |
| **reportFolderCreateVM** | [**ReportFolderCreateVM**](ReportFolderCreateVM.md)| create VM | [optional] |

### Return type

ApiResponse<[**FileVM**](FileVM.md)>


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | New folder has been created) |  -  |
| **400** | Parent folder id is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | subscription is outdated |  -  |
| **404** | parent folder/subscription not found |  -  |


## reportFoldersRecoverFolder

> void reportFoldersRecoverFolder(id, recoveryPath)

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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | Folder not found |  -  |

## reportFoldersRecoverFolderWithHttpInfo

> ApiResponse<Void> reportFoldersRecoverFolder reportFoldersRecoverFolderWithHttpInfo(id, recoveryPath)

Recover specified folder

User with a Delete Entity permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<Void> response = apiInstance.reportFoldersRecoverFolderWithHttpInfo(id, recoveryPath);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFoldersRecoverFolder");
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
| **id** | **String**| folder id | |
| **recoveryPath** | **String**|  | [optional] |

### Return type


ApiResponse<Void>

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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | Folder not found |  -  |


## reportFoldersRenameFolder

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
| **400** | folderId is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | subscription is outdated |  -  |
| **404** | Folder not found |  -  |

## reportFoldersRenameFolderWithHttpInfo

> ApiResponse<FileVM> reportFoldersRenameFolder reportFoldersRenameFolderWithHttpInfo(id, folderRenameVM)

Rename a folder

User with a Update Name permision can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<FileVM> response = apiInstance.reportFoldersRenameFolderWithHttpInfo(id, folderRenameVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFoldersRenameFolder");
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
| **id** | **String**|  | |
| **folderRenameVM** | [**FolderRenameVM**](FolderRenameVM.md)|  | [optional] |

### Return type

ApiResponse<[**FileVM**](FileVM.md)>


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Folder name has been updated |  -  |
| **400** | folderId is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | subscription is outdated |  -  |
| **404** | Folder not found |  -  |


## reportFoldersUpdateIcon

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
| **400** | folderId is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | subscription is outdated |  -  |
| **404** | Folder not found |  -  |

## reportFoldersUpdateIconWithHttpInfo

> ApiResponse<FileVM> reportFoldersUpdateIcon reportFoldersUpdateIconWithHttpInfo(id, folderIconVM)

Update a folder&#39;s icon

User with a Update Icon permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<FileVM> response = apiInstance.reportFoldersUpdateIconWithHttpInfo(id, folderIconVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFoldersUpdateIcon");
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
| **id** | **String**| Identifier of folder | |
| **folderIconVM** | [**FolderIconVM**](FolderIconVM.md)| Update icon model | [optional] |

### Return type

ApiResponse<[**FileVM**](FileVM.md)>


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Folder&#39;s icon has been updated |  -  |
| **400** | folderId is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | subscription is outdated |  -  |
| **404** | Folder not found |  -  |


## reportFoldersUpdatePermissions

> void reportFoldersUpdatePermissions(id, updateFilePermissionsVM)

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
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |

## reportFoldersUpdatePermissionsWithHttpInfo

> ApiResponse<Void> reportFoldersUpdatePermissions reportFoldersUpdatePermissionsWithHttpInfo(id, updateFilePermissionsVM)

Update permissions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<Void> response = apiInstance.reportFoldersUpdatePermissionsWithHttpInfo(id, updateFilePermissionsVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFoldersUpdatePermissions");
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
| **id** | **String**|  | |
| **updateFilePermissionsVM** | [**UpdateFilePermissionsVM**](UpdateFilePermissionsVM.md)|  | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |


## reportFoldersUpdateTags

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
| **404** | Folder not found |  -  |

## reportFoldersUpdateTagsWithHttpInfo

> ApiResponse<FileVM> reportFoldersUpdateTags reportFoldersUpdateTagsWithHttpInfo(id, folderTagsUpdateVM)

Update tags

User with a Update Tags permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<FileVM> response = apiInstance.reportFoldersUpdateTagsWithHttpInfo(id, folderTagsUpdateVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportFoldersUpdateTags");
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
| **id** | **String**|  | |
| **folderTagsUpdateVM** | [**FolderTagsUpdateVM**](FolderTagsUpdateVM.md)|  | [optional] |

### Return type

ApiResponse<[**FileVM**](FileVM.md)>


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
| **404** | Folder not found |  -  |


## reportsCopyFile

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
| **400** | fileId or folderId is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | File or folder not found |  -  |
| **500** | Exception thrown |  -  |

## reportsCopyFileWithHttpInfo

> ApiResponse<ReportVM> reportsCopyFile reportsCopyFileWithHttpInfo(id, folderId)

Copy file to a specified folder

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<ReportVM> response = apiInstance.reportsCopyFileWithHttpInfo(id, folderId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportsCopyFile");
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
| **id** | **String**| file id | |
| **folderId** | **String**| folder id | |

### Return type

ApiResponse<[**ReportVM**](ReportVM.md)>


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | File has been copied |  -  |
| **400** | fileId or folderId is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | File or folder not found |  -  |
| **500** | Exception thrown |  -  |


## reportsDeleteFile

> void reportsDeleteFile(id)

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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | File not found |  -  |
| **500** | Exception thrown |  -  |

## reportsDeleteFileWithHttpInfo

> ApiResponse<Void> reportsDeleteFile reportsDeleteFileWithHttpInfo(id)

Delete specified file

User with Delete permission can access the method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<Void> response = apiInstance.reportsDeleteFileWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportsDeleteFile");
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
| **id** | **String**| file id | |

### Return type


ApiResponse<Void>

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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | File not found |  -  |
| **500** | Exception thrown |  -  |


## reportsExport

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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | Exports folder not found |  -  |

## reportsExportWithHttpInfo

> ApiResponse<ExportVM> reportsExport reportsExportWithHttpInfo(id, exportReportVM)

Export specified report to a specified format

User with Execute Export permission on prepared report and  Create Entity on an export folder can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<ExportVM> response = apiInstance.reportsExportWithHttpInfo(id, exportReportVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportsExport");
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
| **id** | **String**| report id | |
| **exportReportVM** | [**ExportReportVM**](ExportReportVM.md)| export parameters | [optional] |

### Return type

ApiResponse<[**ExportVM**](ExportVM.md)>


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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | Exports folder not found |  -  |


## reportsGetFile

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
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File not found |  -  |
| **500** | Exception thrown |  -  |

## reportsGetFileWithHttpInfo

> ApiResponse<ReportVM> reportsGetFile reportsGetFileWithHttpInfo(id)

Get specified file

User with Get Entity permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<ReportVM> response = apiInstance.reportsGetFileWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportsGetFile");
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
| **id** | **String**| file id | |

### Return type

ApiResponse<[**ReportVM**](ReportVM.md)>


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
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File not found |  -  |
| **500** | Exception thrown |  -  |


## reportsGetFileHistory

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
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

## reportsGetFileHistoryWithHttpInfo

> ApiResponse<AuditActionsVM> reportsGetFileHistory reportsGetFileHistoryWithHttpInfo(id, skip, take)

Returns list of actions, performed on this file

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<AuditActionsVM> response = apiInstance.reportsGetFileHistoryWithHttpInfo(id, skip, take);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportsGetFileHistory");
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
| **id** | **String**|  | |
| **skip** | **Integer**|  | [optional] [default to 0] |
| **take** | **Integer**|  | [optional] [default to 10] |

### Return type

ApiResponse<[**AuditActionsVM**](AuditActionsVM.md)>


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
| **404** | Not Found |  -  |


## reportsGetFilesCount

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
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |
| **500** | Exception thrown |  -  |

## reportsGetFilesCountWithHttpInfo

> ApiResponse<CountVM> reportsGetFilesCount reportsGetFilesCountWithHttpInfo(id)

Get count of files what contains in a specified folder

User with Get Count permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<CountVM> response = apiInstance.reportsGetFilesCountWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportsGetFilesCount");
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
| **id** | **String**| folder id | |

### Return type

ApiResponse<[**CountVM**](CountVM.md)>


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
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Folder not found |  -  |
| **500** | Exception thrown |  -  |


## reportsGetFilesList

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
        FileSorting orderBy = FileSorting.fromValue("None"); // FileSorting | 
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
| **orderBy** | [**FileSorting**](.md)|  | [optional] [enum: None, CreatedTime, EditedTime, Size, Name] |
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
| **400** | FolderId is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or folder not found |  -  |
| **500** | Exception thrown |  -  |

## reportsGetFilesListWithHttpInfo

> ApiResponse<ReportsVM> reportsGetFilesList reportsGetFilesListWithHttpInfo(id, skip, take, searchPattern, orderBy, desc, useRegex)

Get all files from specified folder. &lt;br /&gt;  User with Get Entity permission can access this method. &lt;br /&gt;  The method will returns minimal infomration about the file: &lt;br /&gt;  id, name, size, editedTime, createdTime, tags, status, statusReason.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
        FileSorting orderBy = FileSorting.fromValue("None"); // FileSorting | 
        Boolean desc = false; // Boolean | 
        Boolean useRegex = false; // Boolean | 
        try {
            ApiResponse<ReportsVM> response = apiInstance.reportsGetFilesListWithHttpInfo(id, skip, take, searchPattern, orderBy, desc, useRegex);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportsGetFilesList");
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
| **id** | **String**| folder id | |
| **skip** | **Integer**| number of files, that have to be skipped | [optional] [default to 0] |
| **take** | **Integer**| number of files, that have to be returned | [optional] [default to 10] |
| **searchPattern** | **String**|  | [optional] |
| **orderBy** | [**FileSorting**](.md)|  | [optional] [enum: None, CreatedTime, EditedTime, Size, Name] |
| **desc** | **Boolean**|  | [optional] [default to false] |
| **useRegex** | **Boolean**|  | [optional] [default to false] |

### Return type

ApiResponse<[**ReportsVM**](ReportsVM.md)>


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns list of the files from a specified folder |  -  |
| **400** | FolderId is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | File or folder not found |  -  |
| **500** | Exception thrown |  -  |


## reportsGetPermissions

> FilePermissionsVM reportsGetPermissions(id)

Get all file permissions

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
| **200** | got permissions successfully |  -  |
| **400** | id is not valid |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | file is not found |  -  |

## reportsGetPermissionsWithHttpInfo

> ApiResponse<FilePermissionsVM> reportsGetPermissions reportsGetPermissionsWithHttpInfo(id)

Get all file permissions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<FilePermissionsVM> response = apiInstance.reportsGetPermissionsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportsGetPermissions");
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
| **id** | **String**|  | |

### Return type

ApiResponse<[**FilePermissionsVM**](FilePermissionsVM.md)>


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | got permissions successfully |  -  |
| **400** | id is not valid |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | file is not found |  -  |


## reportsMoveFile

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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | File or folder not found |  -  |
| **500** | Exception thrown |  -  |

## reportsMoveFileWithHttpInfo

> ApiResponse<ReportVM> reportsMoveFile reportsMoveFileWithHttpInfo(id, folderId)

Move file to a specified folder

User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<ReportVM> response = apiInstance.reportsMoveFileWithHttpInfo(id, folderId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportsMoveFile");
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
| **id** | **String**| file id | |
| **folderId** | **String**| folder id | |

### Return type

ApiResponse<[**ReportVM**](ReportVM.md)>


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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | File or folder not found |  -  |
| **500** | Exception thrown |  -  |


## reportsMoveFileToBin

> void reportsMoveFileToBin(id)

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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | File not found |  -  |
| **500** | Exception thrown |  -  |

## reportsMoveFileToBinWithHttpInfo

> ApiResponse<Void> reportsMoveFileToBin reportsMoveFileToBinWithHttpInfo(id)

Move specified file to recycle bin

User with Delete permission can access the method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<Void> response = apiInstance.reportsMoveFileToBinWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportsMoveFileToBin");
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
| **id** | **String**| file id | |

### Return type


ApiResponse<Void>

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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | File not found |  -  |
| **500** | Exception thrown |  -  |


## reportsRecoverFile

> void reportsRecoverFile(id, recoveryPath)

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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | File not found |  -  |
| **500** | Exception thrown |  -  |

## reportsRecoverFileWithHttpInfo

> ApiResponse<Void> reportsRecoverFile reportsRecoverFileWithHttpInfo(id, recoveryPath)

Recover specified file from bin

User with Delete permission can access the method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<Void> response = apiInstance.reportsRecoverFileWithHttpInfo(id, recoveryPath);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportsRecoverFile");
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
| **id** | **String**| file id | |
| **recoveryPath** | **String**|  | [optional] |

### Return type


ApiResponse<Void>

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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | File not found |  -  |
| **500** | Exception thrown |  -  |


## reportsRenameFile

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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | File not found |  -  |
| **500** | Exception thrown |  -  |

## reportsRenameFileWithHttpInfo

> ApiResponse<ReportVM> reportsRenameFile reportsRenameFileWithHttpInfo(id, fileRenameVM)

Rename a file

User with Update Name permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<ReportVM> response = apiInstance.reportsRenameFileWithHttpInfo(id, fileRenameVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportsRenameFile");
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
| **id** | **String**|  | |
| **fileRenameVM** | [**FileRenameVM**](FileRenameVM.md)|  | [optional] |

### Return type

ApiResponse<[**ReportVM**](ReportVM.md)>


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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | File not found |  -  |
| **500** | Exception thrown |  -  |


## reportsStaticPreview

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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | Template or folder not found |  -  |

## reportsStaticPreviewWithHttpInfo

> ApiResponse<ExportVM> reportsStaticPreview reportsStaticPreviewWithHttpInfo(id, previewReportVM)

Make preview for the report.  Generate a new or return exist prepared svg files.  If template was changed will be returned a new.  Pass the &#x60;&#x60; parameter to check prepared timestamp

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<ExportVM> response = apiInstance.reportsStaticPreviewWithHttpInfo(id, previewReportVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportsStaticPreview");
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
| **id** | **String**| template id | |
| **previewReportVM** | [**PreviewReportVM**](PreviewReportVM.md)| Model with parameters | [optional] |

### Return type

ApiResponse<[**ExportVM**](ExportVM.md)>


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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | Template or folder not found |  -  |


## reportsUpdateIcon

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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | File not found |  -  |
| **500** | Exception thrown |  -  |

## reportsUpdateIconWithHttpInfo

> ApiResponse<ReportVM> reportsUpdateIcon reportsUpdateIconWithHttpInfo(id, fileIconVM)

Update a files&#39;s icon

User with Update Icon permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<ReportVM> response = apiInstance.reportsUpdateIconWithHttpInfo(id, fileIconVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportsUpdateIcon");
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
| **id** | **String**|  | |
| **fileIconVM** | [**FileIconVM**](FileIconVM.md)|  | [optional] |

### Return type

ApiResponse<[**ReportVM**](ReportVM.md)>


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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | File not found |  -  |
| **500** | Exception thrown |  -  |


## reportsUpdatePermissions

> void reportsUpdatePermissions(id, updateFilePermissionsVM)

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
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |

## reportsUpdatePermissionsWithHttpInfo

> ApiResponse<Void> reportsUpdatePermissions reportsUpdatePermissionsWithHttpInfo(id, updateFilePermissionsVM)

Update permissions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<Void> response = apiInstance.reportsUpdatePermissionsWithHttpInfo(id, updateFilePermissionsVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportsUpdatePermissions");
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
| **id** | **String**|  | |
| **updateFilePermissionsVM** | [**UpdateFilePermissionsVM**](UpdateFilePermissionsVM.md)|  | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |


## reportsUpdateTags

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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | File not found |  -  |
| **500** | Exception thrown |  -  |

## reportsUpdateTagsWithHttpInfo

> ApiResponse<ReportVM> reportsUpdateTags reportsUpdateTagsWithHttpInfo(id, fileTagsUpdateVM)

Update tags

User with Update Tags permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<ReportVM> response = apiInstance.reportsUpdateTagsWithHttpInfo(id, fileTagsUpdateVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportsUpdateTags");
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
| **id** | **String**|  | |
| **fileTagsUpdateVM** | [**FileTagsUpdateVM**](FileTagsUpdateVM.md)|  | [optional] |

### Return type

ApiResponse<[**ReportVM**](ReportVM.md)>


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
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | File not found |  -  |
| **500** | Exception thrown |  -  |


## reportsUploadFile

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

## reportsUploadFileWithHttpInfo

> ApiResponse<ReportVM> reportsUploadFile reportsUploadFileWithHttpInfo(id, reportCreateVM)

Upload a file to the specified folder. The method is deprecated, use the UploadFileV2 method instead!

User with Create Entity permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<ReportVM> response = apiInstance.reportsUploadFileWithHttpInfo(id, reportCreateVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportsUploadFile");
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
| **id** | **String**| Identifier of folder | |
| **reportCreateVM** | [**ReportCreateVM**](ReportCreateVM.md)| file&#39;s view model | [optional] |

### Return type

ApiResponse<[**ReportVM**](ReportVM.md)>


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


## reportsUploadFileV2

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

## reportsUploadFileV2WithHttpInfo

> ApiResponse<ReportVM> reportsUploadFileV2 reportsUploadFileV2WithHttpInfo(id, fileContent, templateId, tags, icon)

Alternative api for upload a file to the specified folder!

User with Create Entity permission can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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
            ApiResponse<ReportVM> response = apiInstance.reportsUploadFileV2WithHttpInfo(id, fileContent, templateId, tags, icon);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportsUploadFileV2");
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
| **id** | **String**| Identifier of folder | |
| **fileContent** | **File**|  | |
| **templateId** | **String**|  | [optional] |
| **tags** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **icon** | **File**|  | [optional] |

### Return type

ApiResponse<[**ReportVM**](ReportVM.md)>


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

