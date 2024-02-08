# TemplatesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**templateFolderAndFileClearRecycleBin**](TemplatesApi.md#templateFolderAndFileClearRecycleBin) | **DELETE** /api/rp/v1/Templates/{subscriptionId}/ClearRecycleBin | Delete all folders and files from recycle bin |
| [**templateFolderAndFileClearRecycleBinWithHttpInfo**](TemplatesApi.md#templateFolderAndFileClearRecycleBinWithHttpInfo) | **DELETE** /api/rp/v1/Templates/{subscriptionId}/ClearRecycleBin | Delete all folders and files from recycle bin |
| [**templateFolderAndFileCopyFiles**](TemplatesApi.md#templateFolderAndFileCopyFiles) | **POST** /api/rp/v1/Templates/{subscriptionId}/CopyFiles | Copy folders and files to a specified folder |
| [**templateFolderAndFileCopyFilesWithHttpInfo**](TemplatesApi.md#templateFolderAndFileCopyFilesWithHttpInfo) | **POST** /api/rp/v1/Templates/{subscriptionId}/CopyFiles | Copy folders and files to a specified folder |
| [**templateFolderAndFileDeleteFiles**](TemplatesApi.md#templateFolderAndFileDeleteFiles) | **POST** /api/rp/v1/Templates/{subscriptionId}/DeleteFiles | Delete folders and files |
| [**templateFolderAndFileDeleteFilesWithHttpInfo**](TemplatesApi.md#templateFolderAndFileDeleteFilesWithHttpInfo) | **POST** /api/rp/v1/Templates/{subscriptionId}/DeleteFiles | Delete folders and files |
| [**templateFolderAndFileGetCount**](TemplatesApi.md#templateFolderAndFileGetCount) | **GET** /api/rp/v1/Templates/Folder/{id}/CountFolderAndFiles | Get count of files and folders what contains in a specified folder |
| [**templateFolderAndFileGetCountWithHttpInfo**](TemplatesApi.md#templateFolderAndFileGetCountWithHttpInfo) | **GET** /api/rp/v1/Templates/Folder/{id}/CountFolderAndFiles | Get count of files and folders what contains in a specified folder |
| [**templateFolderAndFileGetFoldersAndFiles**](TemplatesApi.md#templateFolderAndFileGetFoldersAndFiles) | **GET** /api/rp/v1/Templates/Folder/{id}/ListFolderAndFiles | Get all folders and files from specified folder |
| [**templateFolderAndFileGetFoldersAndFilesWithHttpInfo**](TemplatesApi.md#templateFolderAndFileGetFoldersAndFilesWithHttpInfo) | **GET** /api/rp/v1/Templates/Folder/{id}/ListFolderAndFiles | Get all folders and files from specified folder |
| [**templateFolderAndFileGetRecycleBinFoldersAndFiles**](TemplatesApi.md#templateFolderAndFileGetRecycleBinFoldersAndFiles) | **GET** /api/rp/v1/Templates/{subscriptionId}/ListRecycleBinFolderAndFiles | Get all folders and files from recycle bin |
| [**templateFolderAndFileGetRecycleBinFoldersAndFilesWithHttpInfo**](TemplatesApi.md#templateFolderAndFileGetRecycleBinFoldersAndFilesWithHttpInfo) | **GET** /api/rp/v1/Templates/{subscriptionId}/ListRecycleBinFolderAndFiles | Get all folders and files from recycle bin |
| [**templateFolderAndFileMoveFiles**](TemplatesApi.md#templateFolderAndFileMoveFiles) | **POST** /api/rp/v1/Templates/{subscriptionId}/MoveFiles | Move folders and files to a specified folder |
| [**templateFolderAndFileMoveFilesWithHttpInfo**](TemplatesApi.md#templateFolderAndFileMoveFilesWithHttpInfo) | **POST** /api/rp/v1/Templates/{subscriptionId}/MoveFiles | Move folders and files to a specified folder |
| [**templateFolderAndFileMoveFilesToBin**](TemplatesApi.md#templateFolderAndFileMoveFilesToBin) | **POST** /api/rp/v1/Templates/{subscriptionId}/ToBin | Move folders and files to bin |
| [**templateFolderAndFileMoveFilesToBinWithHttpInfo**](TemplatesApi.md#templateFolderAndFileMoveFilesToBinWithHttpInfo) | **POST** /api/rp/v1/Templates/{subscriptionId}/ToBin | Move folders and files to bin |
| [**templateFolderAndFileRecoverAllFromRecycleBin**](TemplatesApi.md#templateFolderAndFileRecoverAllFromRecycleBin) | **POST** /api/rp/v1/Templates/{subscriptionId}/RecoverRecycleBin | Recover all folders and files from recycle bin |
| [**templateFolderAndFileRecoverAllFromRecycleBinWithHttpInfo**](TemplatesApi.md#templateFolderAndFileRecoverAllFromRecycleBinWithHttpInfo) | **POST** /api/rp/v1/Templates/{subscriptionId}/RecoverRecycleBin | Recover all folders and files from recycle bin |
| [**templateFolderAndFileRecoverFiles**](TemplatesApi.md#templateFolderAndFileRecoverFiles) | **POST** /api/rp/v1/Templates/{subscriptionId}/RecoverFiles | Recover folders and files from bin |
| [**templateFolderAndFileRecoverFilesWithHttpInfo**](TemplatesApi.md#templateFolderAndFileRecoverFilesWithHttpInfo) | **POST** /api/rp/v1/Templates/{subscriptionId}/RecoverFiles | Recover folders and files from bin |
| [**templateFoldersCalculateFolderSize**](TemplatesApi.md#templateFoldersCalculateFolderSize) | **GET** /api/rp/v1/Templates/Folder/{id}/size | Get specified folder, calculate it&#39;s size |
| [**templateFoldersCalculateFolderSizeWithHttpInfo**](TemplatesApi.md#templateFoldersCalculateFolderSizeWithHttpInfo) | **GET** /api/rp/v1/Templates/Folder/{id}/size | Get specified folder, calculate it&#39;s size |
| [**templateFoldersCopyFolder**](TemplatesApi.md#templateFoldersCopyFolder) | **POST** /api/rp/v1/Templates/Folder/{id}/Copy/{folderId} | Move folder to a specified folder |
| [**templateFoldersCopyFolderWithHttpInfo**](TemplatesApi.md#templateFoldersCopyFolderWithHttpInfo) | **POST** /api/rp/v1/Templates/Folder/{id}/Copy/{folderId} | Move folder to a specified folder |
| [**templateFoldersDeleteFolder**](TemplatesApi.md#templateFoldersDeleteFolder) | **DELETE** /api/rp/v1/Templates/Folder/{id} | Delete specified folder |
| [**templateFoldersDeleteFolderWithHttpInfo**](TemplatesApi.md#templateFoldersDeleteFolderWithHttpInfo) | **DELETE** /api/rp/v1/Templates/Folder/{id} | Delete specified folder |
| [**templateFoldersExport**](TemplatesApi.md#templateFoldersExport) | **POST** /api/rp/v1/Templates/Folder/{id}/Export | Export specified template folder to a specified format |
| [**templateFoldersExportWithHttpInfo**](TemplatesApi.md#templateFoldersExportWithHttpInfo) | **POST** /api/rp/v1/Templates/Folder/{id}/Export | Export specified template folder to a specified format |
| [**templateFoldersGetBreadcrumbs**](TemplatesApi.md#templateFoldersGetBreadcrumbs) | **GET** /api/rp/v1/Templates/Folder/{id}/Breadcrumbs | Get specified folder breadcrumbs |
| [**templateFoldersGetBreadcrumbsWithHttpInfo**](TemplatesApi.md#templateFoldersGetBreadcrumbsWithHttpInfo) | **GET** /api/rp/v1/Templates/Folder/{id}/Breadcrumbs | Get specified folder breadcrumbs |
| [**templateFoldersGetFolder**](TemplatesApi.md#templateFoldersGetFolder) | **GET** /api/rp/v1/Templates/Folder/{id} | Get specified folder |
| [**templateFoldersGetFolderWithHttpInfo**](TemplatesApi.md#templateFoldersGetFolderWithHttpInfo) | **GET** /api/rp/v1/Templates/Folder/{id} | Get specified folder |
| [**templateFoldersGetFolders**](TemplatesApi.md#templateFoldersGetFolders) | **GET** /api/rp/v1/Templates/Folder/{id}/ListFolders | Get all folders from specified folder |
| [**templateFoldersGetFoldersWithHttpInfo**](TemplatesApi.md#templateFoldersGetFoldersWithHttpInfo) | **GET** /api/rp/v1/Templates/Folder/{id}/ListFolders | Get all folders from specified folder |
| [**templateFoldersGetFoldersCount**](TemplatesApi.md#templateFoldersGetFoldersCount) | **GET** /api/rp/v1/Templates/Folder/{id}/CountFolders | Get count of folders what contains in a specified folder |
| [**templateFoldersGetFoldersCountWithHttpInfo**](TemplatesApi.md#templateFoldersGetFoldersCountWithHttpInfo) | **GET** /api/rp/v1/Templates/Folder/{id}/CountFolders | Get count of folders what contains in a specified folder |
| [**templateFoldersGetOrCreate**](TemplatesApi.md#templateFoldersGetOrCreate) | **GET** /api/rp/v1/Templates/Folder/getOrCreate | Get specified folder |
| [**templateFoldersGetOrCreateWithHttpInfo**](TemplatesApi.md#templateFoldersGetOrCreateWithHttpInfo) | **GET** /api/rp/v1/Templates/Folder/getOrCreate | Get specified folder |
| [**templateFoldersGetPermissions**](TemplatesApi.md#templateFoldersGetPermissions) | **GET** /api/rp/v1/Templates/Folder/{id}/permissions | Get all folder permissions |
| [**templateFoldersGetPermissionsWithHttpInfo**](TemplatesApi.md#templateFoldersGetPermissionsWithHttpInfo) | **GET** /api/rp/v1/Templates/Folder/{id}/permissions | Get all folder permissions |
| [**templateFoldersGetRootFolder**](TemplatesApi.md#templateFoldersGetRootFolder) | **GET** /api/rp/v1/Templates/Root | Get user&#39;s root folder (without parents) |
| [**templateFoldersGetRootFolderWithHttpInfo**](TemplatesApi.md#templateFoldersGetRootFolderWithHttpInfo) | **GET** /api/rp/v1/Templates/Root | Get user&#39;s root folder (without parents) |
| [**templateFoldersMoveFolder**](TemplatesApi.md#templateFoldersMoveFolder) | **POST** /api/rp/v1/Templates/Folder/{id}/Move/{folderId} | Move folder to a specified folder |
| [**templateFoldersMoveFolderWithHttpInfo**](TemplatesApi.md#templateFoldersMoveFolderWithHttpInfo) | **POST** /api/rp/v1/Templates/Folder/{id}/Move/{folderId} | Move folder to a specified folder |
| [**templateFoldersMoveFolderToBin**](TemplatesApi.md#templateFoldersMoveFolderToBin) | **DELETE** /api/rp/v1/Templates/Folder/{id}/ToBin | Move specified folder to recycle bin |
| [**templateFoldersMoveFolderToBinWithHttpInfo**](TemplatesApi.md#templateFoldersMoveFolderToBinWithHttpInfo) | **DELETE** /api/rp/v1/Templates/Folder/{id}/ToBin | Move specified folder to recycle bin |
| [**templateFoldersPostFolder**](TemplatesApi.md#templateFoldersPostFolder) | **POST** /api/rp/v1/Templates/Folder/{id}/Folder | Create folder |
| [**templateFoldersPostFolderWithHttpInfo**](TemplatesApi.md#templateFoldersPostFolderWithHttpInfo) | **POST** /api/rp/v1/Templates/Folder/{id}/Folder | Create folder |
| [**templateFoldersPrepare**](TemplatesApi.md#templateFoldersPrepare) | **POST** /api/rp/v1/Templates/Folder/{id}/Prepare | Prepare specified template folder to report folder |
| [**templateFoldersPrepareWithHttpInfo**](TemplatesApi.md#templateFoldersPrepareWithHttpInfo) | **POST** /api/rp/v1/Templates/Folder/{id}/Prepare | Prepare specified template folder to report folder |
| [**templateFoldersRecoverFolder**](TemplatesApi.md#templateFoldersRecoverFolder) | **POST** /api/rp/v1/Templates/Folder/{id}/Recover | Recover specified folder |
| [**templateFoldersRecoverFolderWithHttpInfo**](TemplatesApi.md#templateFoldersRecoverFolderWithHttpInfo) | **POST** /api/rp/v1/Templates/Folder/{id}/Recover | Recover specified folder |
| [**templateFoldersRenameFolder**](TemplatesApi.md#templateFoldersRenameFolder) | **PUT** /api/rp/v1/Templates/Folder/{id}/Rename | Rename a folder |
| [**templateFoldersRenameFolderWithHttpInfo**](TemplatesApi.md#templateFoldersRenameFolderWithHttpInfo) | **PUT** /api/rp/v1/Templates/Folder/{id}/Rename | Rename a folder |
| [**templateFoldersUpdateIcon**](TemplatesApi.md#templateFoldersUpdateIcon) | **PUT** /api/rp/v1/Templates/Folder/{id}/Icon | Update a folder&#39;s icon |
| [**templateFoldersUpdateIconWithHttpInfo**](TemplatesApi.md#templateFoldersUpdateIconWithHttpInfo) | **PUT** /api/rp/v1/Templates/Folder/{id}/Icon | Update a folder&#39;s icon |
| [**templateFoldersUpdatePermissions**](TemplatesApi.md#templateFoldersUpdatePermissions) | **POST** /api/rp/v1/Templates/{id}/permissions | Update permissions |
| [**templateFoldersUpdatePermissionsWithHttpInfo**](TemplatesApi.md#templateFoldersUpdatePermissionsWithHttpInfo) | **POST** /api/rp/v1/Templates/{id}/permissions | Update permissions |
| [**templateFoldersUpdateTags**](TemplatesApi.md#templateFoldersUpdateTags) | **PUT** /api/rp/v1/Templates/Folder/{id}/UpdateTags | Update tags |
| [**templateFoldersUpdateTagsWithHttpInfo**](TemplatesApi.md#templateFoldersUpdateTagsWithHttpInfo) | **PUT** /api/rp/v1/Templates/Folder/{id}/UpdateTags | Update tags |
| [**templatesCopyFile**](TemplatesApi.md#templatesCopyFile) | **POST** /api/rp/v1/Templates/File/{id}/Copy/{folderId} | Copy file to a specified folder |
| [**templatesCopyFileWithHttpInfo**](TemplatesApi.md#templatesCopyFileWithHttpInfo) | **POST** /api/rp/v1/Templates/File/{id}/Copy/{folderId} | Copy file to a specified folder |
| [**templatesDeleteFile**](TemplatesApi.md#templatesDeleteFile) | **DELETE** /api/rp/v1/Templates/File/{id} | Delete specified file |
| [**templatesDeleteFileWithHttpInfo**](TemplatesApi.md#templatesDeleteFileWithHttpInfo) | **DELETE** /api/rp/v1/Templates/File/{id} | Delete specified file |
| [**templatesExport**](TemplatesApi.md#templatesExport) | **POST** /api/rp/v1/Templates/File/{id}/Export | Export specified report template to a specified format |
| [**templatesExportWithHttpInfo**](TemplatesApi.md#templatesExportWithHttpInfo) | **POST** /api/rp/v1/Templates/File/{id}/Export | Export specified report template to a specified format |
| [**templatesGetFile**](TemplatesApi.md#templatesGetFile) | **GET** /api/rp/v1/Templates/File/{id} | Get specified file |
| [**templatesGetFileWithHttpInfo**](TemplatesApi.md#templatesGetFileWithHttpInfo) | **GET** /api/rp/v1/Templates/File/{id} | Get specified file |
| [**templatesGetFileHistory**](TemplatesApi.md#templatesGetFileHistory) | **GET** /api/rp/v1/Templates/File/{id}/History | Returns list of actions, performed on this file |
| [**templatesGetFileHistoryWithHttpInfo**](TemplatesApi.md#templatesGetFileHistoryWithHttpInfo) | **GET** /api/rp/v1/Templates/File/{id}/History | Returns list of actions, performed on this file |
| [**templatesGetFilesCount**](TemplatesApi.md#templatesGetFilesCount) | **GET** /api/rp/v1/Templates/Folder/{id}/CountFiles | Get count of files what contains in a specified folder |
| [**templatesGetFilesCountWithHttpInfo**](TemplatesApi.md#templatesGetFilesCountWithHttpInfo) | **GET** /api/rp/v1/Templates/Folder/{id}/CountFiles | Get count of files what contains in a specified folder |
| [**templatesGetFilesList**](TemplatesApi.md#templatesGetFilesList) | **GET** /api/rp/v1/Templates/Folder/{id}/ListFiles | Get all files from specified folder. &lt;br /&gt;  User with Get Entity permission can access this method. &lt;br /&gt;  The method will returns minimal infomration about the file: &lt;br /&gt;  id, name, size, editedTime, createdTime, tags, status, statusReason. |
| [**templatesGetFilesListWithHttpInfo**](TemplatesApi.md#templatesGetFilesListWithHttpInfo) | **GET** /api/rp/v1/Templates/Folder/{id}/ListFiles | Get all files from specified folder. &lt;br /&gt;  User with Get Entity permission can access this method. &lt;br /&gt;  The method will returns minimal infomration about the file: &lt;br /&gt;  id, name, size, editedTime, createdTime, tags, status, statusReason. |
| [**templatesGetPermissions**](TemplatesApi.md#templatesGetPermissions) | **GET** /api/rp/v1/Templates/File/{id}/permissions | Get all file permissions |
| [**templatesGetPermissionsWithHttpInfo**](TemplatesApi.md#templatesGetPermissionsWithHttpInfo) | **GET** /api/rp/v1/Templates/File/{id}/permissions | Get all file permissions |
| [**templatesMoveFile**](TemplatesApi.md#templatesMoveFile) | **POST** /api/rp/v1/Templates/File/{id}/Move/{folderId} | Move file to a specified folder |
| [**templatesMoveFileWithHttpInfo**](TemplatesApi.md#templatesMoveFileWithHttpInfo) | **POST** /api/rp/v1/Templates/File/{id}/Move/{folderId} | Move file to a specified folder |
| [**templatesMoveFileToBin**](TemplatesApi.md#templatesMoveFileToBin) | **DELETE** /api/rp/v1/Templates/File/{id}/ToBin | Move specified file to recycle bin |
| [**templatesMoveFileToBinWithHttpInfo**](TemplatesApi.md#templatesMoveFileToBinWithHttpInfo) | **DELETE** /api/rp/v1/Templates/File/{id}/ToBin | Move specified file to recycle bin |
| [**templatesPrepare**](TemplatesApi.md#templatesPrepare) | **POST** /api/rp/v1/Templates/File/{id}/Prepare | Prepare specified template to report |
| [**templatesPrepareWithHttpInfo**](TemplatesApi.md#templatesPrepareWithHttpInfo) | **POST** /api/rp/v1/Templates/File/{id}/Prepare | Prepare specified template to report |
| [**templatesRecoverFile**](TemplatesApi.md#templatesRecoverFile) | **POST** /api/rp/v1/Templates/File/{id}/Recover | Recover specified file from bin |
| [**templatesRecoverFileWithHttpInfo**](TemplatesApi.md#templatesRecoverFileWithHttpInfo) | **POST** /api/rp/v1/Templates/File/{id}/Recover | Recover specified file from bin |
| [**templatesRenameFile**](TemplatesApi.md#templatesRenameFile) | **PUT** /api/rp/v1/Templates/File/{id}/Rename | Rename a file |
| [**templatesRenameFileWithHttpInfo**](TemplatesApi.md#templatesRenameFileWithHttpInfo) | **PUT** /api/rp/v1/Templates/File/{id}/Rename | Rename a file |
| [**templatesStaticPreview**](TemplatesApi.md#templatesStaticPreview) | **POST** /api/rp/v1/Templates/File/{id}/StaticPreview | Make preview for the report.  Generate a new or return exist prepared svg files.  If template was changed will be returned a new.  Pass the &#x60;&#x60; parameter to check prepared timestamp |
| [**templatesStaticPreviewWithHttpInfo**](TemplatesApi.md#templatesStaticPreviewWithHttpInfo) | **POST** /api/rp/v1/Templates/File/{id}/StaticPreview | Make preview for the report.  Generate a new or return exist prepared svg files.  If template was changed will be returned a new.  Pass the &#x60;&#x60; parameter to check prepared timestamp |
| [**templatesUpdateContent**](TemplatesApi.md#templatesUpdateContent) | **PUT** /api/rp/v1/Templates/File/{id}/Content | Updates contnet of the template. The method is deprecated, use the UpdateContentV2 method instead! |
| [**templatesUpdateContentWithHttpInfo**](TemplatesApi.md#templatesUpdateContentWithHttpInfo) | **PUT** /api/rp/v1/Templates/File/{id}/Content | Updates contnet of the template. The method is deprecated, use the UpdateContentV2 method instead! |
| [**templatesUpdateContentV2**](TemplatesApi.md#templatesUpdateContentV2) | **PUT** /api/rp/v2/Templates/File/{id}/Content | Updates contnet of the template. |
| [**templatesUpdateContentV2WithHttpInfo**](TemplatesApi.md#templatesUpdateContentV2WithHttpInfo) | **PUT** /api/rp/v2/Templates/File/{id}/Content | Updates contnet of the template. |
| [**templatesUpdateIcon**](TemplatesApi.md#templatesUpdateIcon) | **PUT** /api/rp/v1/Templates/File/{id}/Icon | Update a files&#39;s icon |
| [**templatesUpdateIconWithHttpInfo**](TemplatesApi.md#templatesUpdateIconWithHttpInfo) | **PUT** /api/rp/v1/Templates/File/{id}/Icon | Update a files&#39;s icon |
| [**templatesUpdatePermissions**](TemplatesApi.md#templatesUpdatePermissions) | **POST** /api/rp/v1/Templates/File/{id}/permissions | Update permissions |
| [**templatesUpdatePermissionsWithHttpInfo**](TemplatesApi.md#templatesUpdatePermissionsWithHttpInfo) | **POST** /api/rp/v1/Templates/File/{id}/permissions | Update permissions |
| [**templatesUpdateTags**](TemplatesApi.md#templatesUpdateTags) | **PUT** /api/rp/v1/Templates/File/{id}/UpdateTags | Update tags |
| [**templatesUpdateTagsWithHttpInfo**](TemplatesApi.md#templatesUpdateTagsWithHttpInfo) | **PUT** /api/rp/v1/Templates/File/{id}/UpdateTags | Update tags |
| [**templatesUploadFile**](TemplatesApi.md#templatesUploadFile) | **POST** /api/rp/v1/Templates/Folder/{id}/File | Upload a file to the specified folder. The method is deprecated, use the UploadFileV2 method instead! |
| [**templatesUploadFileWithHttpInfo**](TemplatesApi.md#templatesUploadFileWithHttpInfo) | **POST** /api/rp/v1/Templates/Folder/{id}/File | Upload a file to the specified folder. The method is deprecated, use the UploadFileV2 method instead! |
| [**templatesUploadFileV2**](TemplatesApi.md#templatesUploadFileV2) | **POST** /api/rp/v2/Templates/Folder/{id}/File | Alternative api for upload a file to the specified folder! |
| [**templatesUploadFileV2WithHttpInfo**](TemplatesApi.md#templatesUploadFileV2WithHttpInfo) | **POST** /api/rp/v2/Templates/Folder/{id}/File | Alternative api for upload a file to the specified folder! |



## templateFolderAndFileClearRecycleBin

> void templateFolderAndFileClearRecycleBin(subscriptionId)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | subscription id
        try {
            apiInstance.templateFolderAndFileClearRecycleBin(subscriptionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFolderAndFileClearRecycleBin");
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

## templateFolderAndFileClearRecycleBinWithHttpInfo

> ApiResponse<Void> templateFolderAndFileClearRecycleBin templateFolderAndFileClearRecycleBinWithHttpInfo(subscriptionId)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | subscription id
        try {
            ApiResponse<Void> response = apiInstance.templateFolderAndFileClearRecycleBinWithHttpInfo(subscriptionId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFolderAndFileClearRecycleBin");
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


## templateFolderAndFileCopyFiles

> void templateFolderAndFileCopyFiles(subscriptionId, selectedFilesVM)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | id of current subscription
        SelectedFilesVM selectedFilesVM = new SelectedFilesVM(); // SelectedFilesVM | VM with files' ids and params of their destination
        try {
            apiInstance.templateFolderAndFileCopyFiles(subscriptionId, selectedFilesVM);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFolderAndFileCopyFiles");
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

## templateFolderAndFileCopyFilesWithHttpInfo

> ApiResponse<Void> templateFolderAndFileCopyFiles templateFolderAndFileCopyFilesWithHttpInfo(subscriptionId, selectedFilesVM)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | id of current subscription
        SelectedFilesVM selectedFilesVM = new SelectedFilesVM(); // SelectedFilesVM | VM with files' ids and params of their destination
        try {
            ApiResponse<Void> response = apiInstance.templateFolderAndFileCopyFilesWithHttpInfo(subscriptionId, selectedFilesVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFolderAndFileCopyFiles");
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


## templateFolderAndFileDeleteFiles

> void templateFolderAndFileDeleteFiles(subscriptionId, selectedFilesVM)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | id of current subscription
        SelectedFilesVM selectedFilesVM = new SelectedFilesVM(); // SelectedFilesVM | VM with files' ids and params of their destination
        try {
            apiInstance.templateFolderAndFileDeleteFiles(subscriptionId, selectedFilesVM);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFolderAndFileDeleteFiles");
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

## templateFolderAndFileDeleteFilesWithHttpInfo

> ApiResponse<Void> templateFolderAndFileDeleteFiles templateFolderAndFileDeleteFilesWithHttpInfo(subscriptionId, selectedFilesVM)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | id of current subscription
        SelectedFilesVM selectedFilesVM = new SelectedFilesVM(); // SelectedFilesVM | VM with files' ids and params of their destination
        try {
            ApiResponse<Void> response = apiInstance.templateFolderAndFileDeleteFilesWithHttpInfo(subscriptionId, selectedFilesVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFolderAndFileDeleteFiles");
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


## templateFolderAndFileGetCount

> CountVM templateFolderAndFileGetCount(id, searchPattern, useRegex)

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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        String searchPattern = "searchPattern_example"; // String | string, that must be incuded in file or folder name to be counted <br />              (leave undefined to count all files and folders)
        Boolean useRegex = false; // Boolean | set this to true if you want to use regular expression to search
        try {
            CountVM result = apiInstance.templateFolderAndFileGetCount(id, searchPattern, useRegex);
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

## templateFolderAndFileGetCountWithHttpInfo

> ApiResponse<CountVM> templateFolderAndFileGetCount templateFolderAndFileGetCountWithHttpInfo(id, searchPattern, useRegex)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        String searchPattern = "searchPattern_example"; // String | string, that must be incuded in file or folder name to be counted <br />              (leave undefined to count all files and folders)
        Boolean useRegex = false; // Boolean | set this to true if you want to use regular expression to search
        try {
            ApiResponse<CountVM> response = apiInstance.templateFolderAndFileGetCountWithHttpInfo(id, searchPattern, useRegex);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFolderAndFileGetCount");
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


## templateFolderAndFileGetFoldersAndFiles

> FilesVM templateFolderAndFileGetFoldersAndFiles(id, skip, take, orderBy, desc, searchPattern, useRegex)

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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        Integer skip = 0; // Integer | number of folder and files, that have to be skipped
        Integer take = 10; // Integer | number of folder and files, that have to be returned
        FileSorting orderBy = FileSorting.fromValue("None"); // FileSorting | indicates a field to sort by
        Boolean desc = false; // Boolean | indicates if sorting is descending
        String searchPattern = ""; // String | 
        Boolean useRegex = false; // Boolean | 
        try {
            FilesVM result = apiInstance.templateFolderAndFileGetFoldersAndFiles(id, skip, take, orderBy, desc, searchPattern, useRegex);
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

## templateFolderAndFileGetFoldersAndFilesWithHttpInfo

> ApiResponse<FilesVM> templateFolderAndFileGetFoldersAndFiles templateFolderAndFileGetFoldersAndFilesWithHttpInfo(id, skip, take, orderBy, desc, searchPattern, useRegex)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        Integer skip = 0; // Integer | number of folder and files, that have to be skipped
        Integer take = 10; // Integer | number of folder and files, that have to be returned
        FileSorting orderBy = FileSorting.fromValue("None"); // FileSorting | indicates a field to sort by
        Boolean desc = false; // Boolean | indicates if sorting is descending
        String searchPattern = ""; // String | 
        Boolean useRegex = false; // Boolean | 
        try {
            ApiResponse<FilesVM> response = apiInstance.templateFolderAndFileGetFoldersAndFilesWithHttpInfo(id, skip, take, orderBy, desc, searchPattern, useRegex);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFolderAndFileGetFoldersAndFiles");
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


## templateFolderAndFileGetRecycleBinFoldersAndFiles

> FilesVM templateFolderAndFileGetRecycleBinFoldersAndFiles(subscriptionId, skip, take, orderBy, desc, searchPattern, useRegex)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | subscription id
        Integer skip = 0; // Integer | number of folder and files, that have to be skipped
        Integer take = 10; // Integer | number of folder and files, that have to be returned
        FileSorting orderBy = FileSorting.fromValue("None"); // FileSorting | indicates a field to sort by
        Boolean desc = false; // Boolean | indicates if sorting is descending
        String searchPattern = ""; // String | 
        Boolean useRegex = false; // Boolean | 
        try {
            FilesVM result = apiInstance.templateFolderAndFileGetRecycleBinFoldersAndFiles(subscriptionId, skip, take, orderBy, desc, searchPattern, useRegex);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFolderAndFileGetRecycleBinFoldersAndFiles");
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

## templateFolderAndFileGetRecycleBinFoldersAndFilesWithHttpInfo

> ApiResponse<FilesVM> templateFolderAndFileGetRecycleBinFoldersAndFiles templateFolderAndFileGetRecycleBinFoldersAndFilesWithHttpInfo(subscriptionId, skip, take, orderBy, desc, searchPattern, useRegex)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | subscription id
        Integer skip = 0; // Integer | number of folder and files, that have to be skipped
        Integer take = 10; // Integer | number of folder and files, that have to be returned
        FileSorting orderBy = FileSorting.fromValue("None"); // FileSorting | indicates a field to sort by
        Boolean desc = false; // Boolean | indicates if sorting is descending
        String searchPattern = ""; // String | 
        Boolean useRegex = false; // Boolean | 
        try {
            ApiResponse<FilesVM> response = apiInstance.templateFolderAndFileGetRecycleBinFoldersAndFilesWithHttpInfo(subscriptionId, skip, take, orderBy, desc, searchPattern, useRegex);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFolderAndFileGetRecycleBinFoldersAndFiles");
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


## templateFolderAndFileMoveFiles

> void templateFolderAndFileMoveFiles(subscriptionId, selectedFilesVM)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | id of current subscription
        SelectedFilesVM selectedFilesVM = new SelectedFilesVM(); // SelectedFilesVM | VM with files' ids and params of their destination
        try {
            apiInstance.templateFolderAndFileMoveFiles(subscriptionId, selectedFilesVM);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFolderAndFileMoveFiles");
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

## templateFolderAndFileMoveFilesWithHttpInfo

> ApiResponse<Void> templateFolderAndFileMoveFiles templateFolderAndFileMoveFilesWithHttpInfo(subscriptionId, selectedFilesVM)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | id of current subscription
        SelectedFilesVM selectedFilesVM = new SelectedFilesVM(); // SelectedFilesVM | VM with files' ids and params of their destination
        try {
            ApiResponse<Void> response = apiInstance.templateFolderAndFileMoveFilesWithHttpInfo(subscriptionId, selectedFilesVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFolderAndFileMoveFiles");
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


## templateFolderAndFileMoveFilesToBin

> void templateFolderAndFileMoveFilesToBin(subscriptionId, selectedFilesVM)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | id of current subscription
        SelectedFilesVM selectedFilesVM = new SelectedFilesVM(); // SelectedFilesVM | VM with files' ids and params of their destination
        try {
            apiInstance.templateFolderAndFileMoveFilesToBin(subscriptionId, selectedFilesVM);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFolderAndFileMoveFilesToBin");
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

## templateFolderAndFileMoveFilesToBinWithHttpInfo

> ApiResponse<Void> templateFolderAndFileMoveFilesToBin templateFolderAndFileMoveFilesToBinWithHttpInfo(subscriptionId, selectedFilesVM)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | id of current subscription
        SelectedFilesVM selectedFilesVM = new SelectedFilesVM(); // SelectedFilesVM | VM with files' ids and params of their destination
        try {
            ApiResponse<Void> response = apiInstance.templateFolderAndFileMoveFilesToBinWithHttpInfo(subscriptionId, selectedFilesVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFolderAndFileMoveFilesToBin");
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


## templateFolderAndFileRecoverAllFromRecycleBin

> void templateFolderAndFileRecoverAllFromRecycleBin(subscriptionId)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | subscription id
        try {
            apiInstance.templateFolderAndFileRecoverAllFromRecycleBin(subscriptionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFolderAndFileRecoverAllFromRecycleBin");
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

## templateFolderAndFileRecoverAllFromRecycleBinWithHttpInfo

> ApiResponse<Void> templateFolderAndFileRecoverAllFromRecycleBin templateFolderAndFileRecoverAllFromRecycleBinWithHttpInfo(subscriptionId)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | subscription id
        try {
            ApiResponse<Void> response = apiInstance.templateFolderAndFileRecoverAllFromRecycleBinWithHttpInfo(subscriptionId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFolderAndFileRecoverAllFromRecycleBin");
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


## templateFolderAndFileRecoverFiles

> void templateFolderAndFileRecoverFiles(subscriptionId, selectedFilesVM)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | id of current subscription
        SelectedFilesVM selectedFilesVM = new SelectedFilesVM(); // SelectedFilesVM | VM with files' ids and params of their destination
        try {
            apiInstance.templateFolderAndFileRecoverFiles(subscriptionId, selectedFilesVM);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFolderAndFileRecoverFiles");
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

## templateFolderAndFileRecoverFilesWithHttpInfo

> ApiResponse<Void> templateFolderAndFileRecoverFiles templateFolderAndFileRecoverFilesWithHttpInfo(subscriptionId, selectedFilesVM)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | id of current subscription
        SelectedFilesVM selectedFilesVM = new SelectedFilesVM(); // SelectedFilesVM | VM with files' ids and params of their destination
        try {
            ApiResponse<Void> response = apiInstance.templateFolderAndFileRecoverFilesWithHttpInfo(subscriptionId, selectedFilesVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFolderAndFileRecoverFiles");
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


## templateFoldersCalculateFolderSize

> FolderSizeVM templateFoldersCalculateFolderSize(id)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        try {
            FolderSizeVM result = apiInstance.templateFoldersCalculateFolderSize(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersCalculateFolderSize");
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

## templateFoldersCalculateFolderSizeWithHttpInfo

> ApiResponse<FolderSizeVM> templateFoldersCalculateFolderSize templateFoldersCalculateFolderSizeWithHttpInfo(id)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        try {
            ApiResponse<FolderSizeVM> response = apiInstance.templateFoldersCalculateFolderSizeWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersCalculateFolderSize");
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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

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

## templateFoldersCopyFolderWithHttpInfo

> ApiResponse<FileVM> templateFoldersCopyFolder templateFoldersCopyFolderWithHttpInfo(id, folderId)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | moving folder id
        String folderId = "folderId_example"; // String | destination folder id
        try {
            ApiResponse<FileVM> response = apiInstance.templateFoldersCopyFolderWithHttpInfo(id, folderId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersCopyFolder");
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


## templateFoldersDeleteFolder

> void templateFoldersDeleteFolder(id)

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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        try {
            apiInstance.templateFoldersDeleteFolder(id);
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

## templateFoldersDeleteFolderWithHttpInfo

> ApiResponse<Void> templateFoldersDeleteFolder templateFoldersDeleteFolderWithHttpInfo(id)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        try {
            ApiResponse<Void> response = apiInstance.templateFoldersDeleteFolderWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersDeleteFolder");
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


## templateFoldersExport

> FileVM templateFoldersExport(id, exportTemplateVM)

Export specified template folder to a specified format

User with Execute Export permission on template folder and  Create Entity on an export folder can access this method.

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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | template folder id
        ExportTemplateVM exportTemplateVM = new ExportTemplateVM(); // ExportTemplateVM | export parameters (string only)
        try {
            FileVM result = apiInstance.templateFoldersExport(id, exportTemplateVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersExport");
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
| **id** | **String**| template folder id | |
| **exportTemplateVM** | [**ExportTemplateVM**](ExportTemplateVM.md)| export parameters (string only) | [optional] |

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
| **200** | Specified template folder has been exported |  -  |
| **400** | Template folder Id is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | Exports folder not found |  -  |

## templateFoldersExportWithHttpInfo

> ApiResponse<FileVM> templateFoldersExport templateFoldersExportWithHttpInfo(id, exportTemplateVM)

Export specified template folder to a specified format

User with Execute Export permission on template folder and  Create Entity on an export folder can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | template folder id
        ExportTemplateVM exportTemplateVM = new ExportTemplateVM(); // ExportTemplateVM | export parameters (string only)
        try {
            ApiResponse<FileVM> response = apiInstance.templateFoldersExportWithHttpInfo(id, exportTemplateVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersExport");
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
| **id** | **String**| template folder id | |
| **exportTemplateVM** | [**ExportTemplateVM**](ExportTemplateVM.md)| export parameters (string only) | [optional] |

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
| **200** | Specified template folder has been exported |  -  |
| **400** | Template folder Id is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | Subscription is outdated |  -  |
| **404** | Exports folder not found |  -  |


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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

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

## templateFoldersGetBreadcrumbsWithHttpInfo

> ApiResponse<BreadcrumbsVM> templateFoldersGetBreadcrumbs templateFoldersGetBreadcrumbsWithHttpInfo(id)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        try {
            ApiResponse<BreadcrumbsVM> response = apiInstance.templateFoldersGetBreadcrumbsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersGetBreadcrumbs");
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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

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

## templateFoldersGetFolderWithHttpInfo

> ApiResponse<FileVM> templateFoldersGetFolder templateFoldersGetFolderWithHttpInfo(id)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        try {
            ApiResponse<FileVM> response = apiInstance.templateFoldersGetFolderWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersGetFolder");
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


## templateFoldersGetFolders

> FilesVM templateFoldersGetFolders(id, skip, take, orderBy, desc, searchPattern, useRegex)

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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        Integer skip = 0; // Integer | number of files, that have to be skipped
        Integer take = 10; // Integer | number of files, that have to be returned
        FileSorting orderBy = FileSorting.fromValue("None"); // FileSorting | 
        Boolean desc = false; // Boolean | 
        String searchPattern = ""; // String | 
        Boolean useRegex = false; // Boolean | 
        try {
            FilesVM result = apiInstance.templateFoldersGetFolders(id, skip, take, orderBy, desc, searchPattern, useRegex);
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

## templateFoldersGetFoldersWithHttpInfo

> ApiResponse<FilesVM> templateFoldersGetFolders templateFoldersGetFoldersWithHttpInfo(id, skip, take, orderBy, desc, searchPattern, useRegex)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        Integer skip = 0; // Integer | number of files, that have to be skipped
        Integer take = 10; // Integer | number of files, that have to be returned
        FileSorting orderBy = FileSorting.fromValue("None"); // FileSorting | 
        Boolean desc = false; // Boolean | 
        String searchPattern = ""; // String | 
        Boolean useRegex = false; // Boolean | 
        try {
            ApiResponse<FilesVM> response = apiInstance.templateFoldersGetFoldersWithHttpInfo(id, skip, take, orderBy, desc, searchPattern, useRegex);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersGetFolders");
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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

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

## templateFoldersGetFoldersCountWithHttpInfo

> ApiResponse<CountVM> templateFoldersGetFoldersCount templateFoldersGetFoldersCountWithHttpInfo(id)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        try {
            ApiResponse<CountVM> response = apiInstance.templateFoldersGetFoldersCountWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersGetFoldersCount");
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


## templateFoldersGetOrCreate

> FileVM templateFoldersGetOrCreate(name, subscriptionId, parentId)

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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String name = "name_example"; // String | folder name
        String subscriptionId = "subscriptionId_example"; // String | subscriptionId
        String parentId = "parentId_example"; // String | parent folder id
        try {
            FileVM result = apiInstance.templateFoldersGetOrCreate(name, subscriptionId, parentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersGetOrCreate");
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

## templateFoldersGetOrCreateWithHttpInfo

> ApiResponse<FileVM> templateFoldersGetOrCreate templateFoldersGetOrCreateWithHttpInfo(name, subscriptionId, parentId)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String name = "name_example"; // String | folder name
        String subscriptionId = "subscriptionId_example"; // String | subscriptionId
        String parentId = "parentId_example"; // String | parent folder id
        try {
            ApiResponse<FileVM> response = apiInstance.templateFoldersGetOrCreateWithHttpInfo(name, subscriptionId, parentId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersGetOrCreate");
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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

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

## templateFoldersGetPermissionsWithHttpInfo

> ApiResponse<FilePermissionsVM> templateFoldersGetPermissions templateFoldersGetPermissionsWithHttpInfo(id)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            ApiResponse<FilePermissionsVM> response = apiInstance.templateFoldersGetPermissionsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersGetPermissions");
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


## templateFoldersGetRootFolder

> FileVM templateFoldersGetRootFolder(subscriptionId)

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
import cloud.fastreport.client.TemplatesApi;

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

## templateFoldersGetRootFolderWithHttpInfo

> ApiResponse<FileVM> templateFoldersGetRootFolder templateFoldersGetRootFolderWithHttpInfo(subscriptionId)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | 
        try {
            ApiResponse<FileVM> response = apiInstance.templateFoldersGetRootFolderWithHttpInfo(subscriptionId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersGetRootFolder");
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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

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

## templateFoldersMoveFolderWithHttpInfo

> ApiResponse<FileVM> templateFoldersMoveFolder templateFoldersMoveFolderWithHttpInfo(id, folderId)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | moving folder id
        String folderId = "folderId_example"; // String | destination folder id
        try {
            ApiResponse<FileVM> response = apiInstance.templateFoldersMoveFolderWithHttpInfo(id, folderId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersMoveFolder");
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


## templateFoldersMoveFolderToBin

> void templateFoldersMoveFolderToBin(id)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        try {
            apiInstance.templateFoldersMoveFolderToBin(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersMoveFolderToBin");
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

## templateFoldersMoveFolderToBinWithHttpInfo

> ApiResponse<Void> templateFoldersMoveFolderToBin templateFoldersMoveFolderToBinWithHttpInfo(id)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        try {
            ApiResponse<Void> response = apiInstance.templateFoldersMoveFolderToBinWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersMoveFolderToBin");
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


## templateFoldersPostFolder

> FileVM templateFoldersPostFolder(id, templateFolderCreateVM)

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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | Identifier of parent folder id
        TemplateFolderCreateVM templateFolderCreateVM = new TemplateFolderCreateVM(); // TemplateFolderCreateVM | create VM
        try {
            FileVM result = apiInstance.templateFoldersPostFolder(id, templateFolderCreateVM);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Identifier of parent folder id | |
| **templateFolderCreateVM** | [**TemplateFolderCreateVM**](TemplateFolderCreateVM.md)| create VM | [optional] |

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

## templateFoldersPostFolderWithHttpInfo

> ApiResponse<FileVM> templateFoldersPostFolder templateFoldersPostFolderWithHttpInfo(id, templateFolderCreateVM)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | Identifier of parent folder id
        TemplateFolderCreateVM templateFolderCreateVM = new TemplateFolderCreateVM(); // TemplateFolderCreateVM | create VM
        try {
            ApiResponse<FileVM> response = apiInstance.templateFoldersPostFolderWithHttpInfo(id, templateFolderCreateVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersPostFolder");
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
| **templateFolderCreateVM** | [**TemplateFolderCreateVM**](TemplateFolderCreateVM.md)| create VM | [optional] |

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


## templateFoldersPrepare

> FileVM templateFoldersPrepare(id, prepareTemplateVM)

Prepare specified template folder to report folder

User with Execute Prepare permission on report and  Create Entity on a prepared report folder can access this method.

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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | template id
        PrepareTemplateVM prepareTemplateVM = new PrepareTemplateVM(); // PrepareTemplateVM | Template folder prepare view model
        try {
            FileVM result = apiInstance.templateFoldersPrepare(id, prepareTemplateVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersPrepare");
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
| **prepareTemplateVM** | [**PrepareTemplateVM**](PrepareTemplateVM.md)| Template folder prepare view model | [optional] |

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
| **200** | Specified template folder has been prepared |  -  |
| **400** | Template folder Id is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | subscription is outdated |  -  |
| **404** | Template or report folder not found |  -  |

## templateFoldersPrepareWithHttpInfo

> ApiResponse<FileVM> templateFoldersPrepare templateFoldersPrepareWithHttpInfo(id, prepareTemplateVM)

Prepare specified template folder to report folder

User with Execute Prepare permission on report and  Create Entity on a prepared report folder can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | template id
        PrepareTemplateVM prepareTemplateVM = new PrepareTemplateVM(); // PrepareTemplateVM | Template folder prepare view model
        try {
            ApiResponse<FileVM> response = apiInstance.templateFoldersPrepareWithHttpInfo(id, prepareTemplateVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersPrepare");
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
| **prepareTemplateVM** | [**PrepareTemplateVM**](PrepareTemplateVM.md)| Template folder prepare view model | [optional] |

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
| **200** | Specified template folder has been prepared |  -  |
| **400** | Template folder Id is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | subscription is outdated |  -  |
| **404** | Template or report folder not found |  -  |


## templateFoldersRecoverFolder

> void templateFoldersRecoverFolder(id, recoveryPath)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        String recoveryPath = "recoveryPath_example"; // String | 
        try {
            apiInstance.templateFoldersRecoverFolder(id, recoveryPath);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersRecoverFolder");
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

## templateFoldersRecoverFolderWithHttpInfo

> ApiResponse<Void> templateFoldersRecoverFolder templateFoldersRecoverFolderWithHttpInfo(id, recoveryPath)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        String recoveryPath = "recoveryPath_example"; // String | 
        try {
            ApiResponse<Void> response = apiInstance.templateFoldersRecoverFolderWithHttpInfo(id, recoveryPath);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersRecoverFolder");
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


## templateFoldersRenameFolder

> FileVM templateFoldersRenameFolder(id, folderRenameVM)

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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        FolderRenameVM folderRenameVM = new FolderRenameVM(); // FolderRenameVM | 
        try {
            FileVM result = apiInstance.templateFoldersRenameFolder(id, folderRenameVM);
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

## templateFoldersRenameFolderWithHttpInfo

> ApiResponse<FileVM> templateFoldersRenameFolder templateFoldersRenameFolderWithHttpInfo(id, folderRenameVM)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        FolderRenameVM folderRenameVM = new FolderRenameVM(); // FolderRenameVM | 
        try {
            ApiResponse<FileVM> response = apiInstance.templateFoldersRenameFolderWithHttpInfo(id, folderRenameVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersRenameFolder");
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


## templateFoldersUpdateIcon

> FileVM templateFoldersUpdateIcon(id, folderIconVM)

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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | Identifier of folder
        FolderIconVM folderIconVM = new FolderIconVM(); // FolderIconVM | Update icon model
        try {
            FileVM result = apiInstance.templateFoldersUpdateIcon(id, folderIconVM);
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

## templateFoldersUpdateIconWithHttpInfo

> ApiResponse<FileVM> templateFoldersUpdateIcon templateFoldersUpdateIconWithHttpInfo(id, folderIconVM)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | Identifier of folder
        FolderIconVM folderIconVM = new FolderIconVM(); // FolderIconVM | Update icon model
        try {
            ApiResponse<FileVM> response = apiInstance.templateFoldersUpdateIconWithHttpInfo(id, folderIconVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersUpdateIcon");
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


## templateFoldersUpdatePermissions

> void templateFoldersUpdatePermissions(id, updateFilePermissionsVM)

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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        UpdateFilePermissionsVM updateFilePermissionsVM = new UpdateFilePermissionsVM(); // UpdateFilePermissionsVM | 
        try {
            apiInstance.templateFoldersUpdatePermissions(id, updateFilePermissionsVM);
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

## templateFoldersUpdatePermissionsWithHttpInfo

> ApiResponse<Void> templateFoldersUpdatePermissions templateFoldersUpdatePermissionsWithHttpInfo(id, updateFilePermissionsVM)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        UpdateFilePermissionsVM updateFilePermissionsVM = new UpdateFilePermissionsVM(); // UpdateFilePermissionsVM | 
        try {
            ApiResponse<Void> response = apiInstance.templateFoldersUpdatePermissionsWithHttpInfo(id, updateFilePermissionsVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersUpdatePermissions");
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


## templateFoldersUpdateTags

> FileVM templateFoldersUpdateTags(id, folderTagsUpdateVM)

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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        FolderTagsUpdateVM folderTagsUpdateVM = new FolderTagsUpdateVM(); // FolderTagsUpdateVM | 
        try {
            FileVM result = apiInstance.templateFoldersUpdateTags(id, folderTagsUpdateVM);
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

## templateFoldersUpdateTagsWithHttpInfo

> ApiResponse<FileVM> templateFoldersUpdateTags templateFoldersUpdateTagsWithHttpInfo(id, folderTagsUpdateVM)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        FolderTagsUpdateVM folderTagsUpdateVM = new FolderTagsUpdateVM(); // FolderTagsUpdateVM | 
        try {
            ApiResponse<FileVM> response = apiInstance.templateFoldersUpdateTagsWithHttpInfo(id, folderTagsUpdateVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templateFoldersUpdateTags");
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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| file id | |
| **folderId** | **String**| folder id | |

### Return type

[**TemplateVM**](TemplateVM.md)


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

## templatesCopyFileWithHttpInfo

> ApiResponse<TemplateVM> templatesCopyFile templatesCopyFileWithHttpInfo(id, folderId)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | file id
        String folderId = "folderId_example"; // String | folder id
        try {
            ApiResponse<TemplateVM> response = apiInstance.templatesCopyFileWithHttpInfo(id, folderId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesCopyFile");
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

ApiResponse<[**TemplateVM**](TemplateVM.md)>


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


## templatesDeleteFile

> void templatesDeleteFile(id)

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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

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

## templatesDeleteFileWithHttpInfo

> ApiResponse<Void> templatesDeleteFile templatesDeleteFileWithHttpInfo(id)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | file id
        try {
            ApiResponse<Void> response = apiInstance.templatesDeleteFileWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesDeleteFile");
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


## templatesExport

> ExportVM templatesExport(id, exportTemplateVM)

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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | template id
        ExportTemplateVM exportTemplateVM = new ExportTemplateVM(); // ExportTemplateVM | export parameters (string only)
        try {
            ExportVM result = apiInstance.templatesExport(id, exportTemplateVM);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| template id | |
| **exportTemplateVM** | [**ExportTemplateVM**](ExportTemplateVM.md)| export parameters (string only) | [optional] |

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

## templatesExportWithHttpInfo

> ApiResponse<ExportVM> templatesExport templatesExportWithHttpInfo(id, exportTemplateVM)

Export specified report template to a specified format

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | template id
        ExportTemplateVM exportTemplateVM = new ExportTemplateVM(); // ExportTemplateVM | export parameters (string only)
        try {
            ApiResponse<ExportVM> response = apiInstance.templatesExportWithHttpInfo(id, exportTemplateVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesExport");
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
| **exportTemplateVM** | [**ExportTemplateVM**](ExportTemplateVM.md)| export parameters (string only) | [optional] |

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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| file id | |

### Return type

[**TemplateVM**](TemplateVM.md)


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

## templatesGetFileWithHttpInfo

> ApiResponse<TemplateVM> templatesGetFile templatesGetFileWithHttpInfo(id)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | file id
        try {
            ApiResponse<TemplateVM> response = apiInstance.templatesGetFileWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesGetFile");
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

ApiResponse<[**TemplateVM**](TemplateVM.md)>


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


## templatesGetFileHistory

> AuditActionsVM templatesGetFileHistory(id, skip, take)

Returns list of actions, performed on this file

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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        Integer skip = 0; // Integer | 
        Integer take = 10; // Integer | 
        try {
            AuditActionsVM result = apiInstance.templatesGetFileHistory(id, skip, take);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesGetFileHistory");
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

## templatesGetFileHistoryWithHttpInfo

> ApiResponse<AuditActionsVM> templatesGetFileHistory templatesGetFileHistoryWithHttpInfo(id, skip, take)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        Integer skip = 0; // Integer | 
        Integer take = 10; // Integer | 
        try {
            ApiResponse<AuditActionsVM> response = apiInstance.templatesGetFileHistoryWithHttpInfo(id, skip, take);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesGetFileHistory");
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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

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

## templatesGetFilesCountWithHttpInfo

> ApiResponse<CountVM> templatesGetFilesCount templatesGetFilesCountWithHttpInfo(id)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        try {
            ApiResponse<CountVM> response = apiInstance.templatesGetFilesCountWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesGetFilesCount");
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


## templatesGetFilesList

> TemplatesVM templatesGetFilesList(id, skip, take, searchPattern, orderBy, desc, useRegex)

Get all files from specified folder. &lt;br /&gt;  User with Get Entity permission can access this method. &lt;br /&gt;  The method will returns minimal infomration about the file: &lt;br /&gt;  id, name, size, editedTime, createdTime, tags, status, statusReason.

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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        Integer skip = 0; // Integer | number of files, that have to be skipped
        Integer take = 10; // Integer | number of files, that have to be returned
        String searchPattern = "searchPattern_example"; // String | 
        FileSorting orderBy = FileSorting.fromValue("None"); // FileSorting | 
        Boolean desc = false; // Boolean | 
        Boolean useRegex = false; // Boolean | 
        try {
            TemplatesVM result = apiInstance.templatesGetFilesList(id, skip, take, searchPattern, orderBy, desc, useRegex);
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

[**TemplatesVM**](TemplatesVM.md)


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

## templatesGetFilesListWithHttpInfo

> ApiResponse<TemplatesVM> templatesGetFilesList templatesGetFilesListWithHttpInfo(id, skip, take, searchPattern, orderBy, desc, useRegex)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | folder id
        Integer skip = 0; // Integer | number of files, that have to be skipped
        Integer take = 10; // Integer | number of files, that have to be returned
        String searchPattern = "searchPattern_example"; // String | 
        FileSorting orderBy = FileSorting.fromValue("None"); // FileSorting | 
        Boolean desc = false; // Boolean | 
        Boolean useRegex = false; // Boolean | 
        try {
            ApiResponse<TemplatesVM> response = apiInstance.templatesGetFilesListWithHttpInfo(id, skip, take, searchPattern, orderBy, desc, useRegex);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesGetFilesList");
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

ApiResponse<[**TemplatesVM**](TemplatesVM.md)>


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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

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

## templatesGetPermissionsWithHttpInfo

> ApiResponse<FilePermissionsVM> templatesGetPermissions templatesGetPermissionsWithHttpInfo(id)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            ApiResponse<FilePermissionsVM> response = apiInstance.templatesGetPermissionsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesGetPermissions");
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


## templatesMoveFile

> TemplateVM templatesMoveFile(id, folderId)

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
import cloud.fastreport.client.TemplatesApi;

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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| file id | |
| **folderId** | **String**| folder id | |

### Return type

[**TemplateVM**](TemplateVM.md)


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

## templatesMoveFileWithHttpInfo

> ApiResponse<TemplateVM> templatesMoveFile templatesMoveFileWithHttpInfo(id, folderId)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | file id
        String folderId = "folderId_example"; // String | folder id
        try {
            ApiResponse<TemplateVM> response = apiInstance.templatesMoveFileWithHttpInfo(id, folderId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesMoveFile");
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

ApiResponse<[**TemplateVM**](TemplateVM.md)>


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


## templatesMoveFileToBin

> void templatesMoveFileToBin(id)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | file id
        try {
            apiInstance.templatesMoveFileToBin(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesMoveFileToBin");
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

## templatesMoveFileToBinWithHttpInfo

> ApiResponse<Void> templatesMoveFileToBin templatesMoveFileToBinWithHttpInfo(id)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | file id
        try {
            ApiResponse<Void> response = apiInstance.templatesMoveFileToBinWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesMoveFileToBin");
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


## templatesPrepare

> ReportVM templatesPrepare(id, prepareTemplateVM)

Prepare specified template to report

User with Execute Prepare permission on report and  Create Entity on a prepared report folder can access this method.

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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | template id
        PrepareTemplateVM prepareTemplateVM = new PrepareTemplateVM(); // PrepareTemplateVM | Template prepare view model
        try {
            ReportVM result = apiInstance.templatesPrepare(id, prepareTemplateVM);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| template id | |
| **prepareTemplateVM** | [**PrepareTemplateVM**](PrepareTemplateVM.md)| Template prepare view model | [optional] |

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
| **200** | Specified template has been prepared |  -  |
| **204** | Specified template has been prepared |  -  |
| **400** | Report Id is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | subscription is outdated |  -  |
| **404** | Template or folder not found |  -  |

## templatesPrepareWithHttpInfo

> ApiResponse<ReportVM> templatesPrepare templatesPrepareWithHttpInfo(id, prepareTemplateVM)

Prepare specified template to report

User with Execute Prepare permission on report and  Create Entity on a prepared report folder can access this method.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | template id
        PrepareTemplateVM prepareTemplateVM = new PrepareTemplateVM(); // PrepareTemplateVM | Template prepare view model
        try {
            ApiResponse<ReportVM> response = apiInstance.templatesPrepareWithHttpInfo(id, prepareTemplateVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesPrepare");
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
| **prepareTemplateVM** | [**PrepareTemplateVM**](PrepareTemplateVM.md)| Template prepare view model | [optional] |

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
| **200** | Specified template has been prepared |  -  |
| **204** | Specified template has been prepared |  -  |
| **400** | Report Id is null |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **402** | subscription is outdated |  -  |
| **404** | Template or folder not found |  -  |


## templatesRecoverFile

> void templatesRecoverFile(id, recoveryPath)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | file id
        String recoveryPath = "recoveryPath_example"; // String | 
        try {
            apiInstance.templatesRecoverFile(id, recoveryPath);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesRecoverFile");
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

## templatesRecoverFileWithHttpInfo

> ApiResponse<Void> templatesRecoverFile templatesRecoverFileWithHttpInfo(id, recoveryPath)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | file id
        String recoveryPath = "recoveryPath_example"; // String | 
        try {
            ApiResponse<Void> response = apiInstance.templatesRecoverFileWithHttpInfo(id, recoveryPath);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesRecoverFile");
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


## templatesRenameFile

> TemplateVM templatesRenameFile(id, fileRenameVM)

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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        FileRenameVM fileRenameVM = new FileRenameVM(); // FileRenameVM | 
        try {
            TemplateVM result = apiInstance.templatesRenameFile(id, fileRenameVM);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **fileRenameVM** | [**FileRenameVM**](FileRenameVM.md)|  | [optional] |

### Return type

[**TemplateVM**](TemplateVM.md)


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

## templatesRenameFileWithHttpInfo

> ApiResponse<TemplateVM> templatesRenameFile templatesRenameFileWithHttpInfo(id, fileRenameVM)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        FileRenameVM fileRenameVM = new FileRenameVM(); // FileRenameVM | 
        try {
            ApiResponse<TemplateVM> response = apiInstance.templatesRenameFileWithHttpInfo(id, fileRenameVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesRenameFile");
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

ApiResponse<[**TemplateVM**](TemplateVM.md)>


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


## templatesStaticPreview

> ExportVM templatesStaticPreview(id, previewTemplateVM)

Make preview for the report.  Generate a new or return exist prepared svg files.  If template was changed will be returned a new.  Pass the &#x60;&#x60; parameter to check prepared timestamp

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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | template id
        PreviewTemplateVM previewTemplateVM = new PreviewTemplateVM(); // PreviewTemplateVM | Model with parameters
        try {
            ExportVM result = apiInstance.templatesStaticPreview(id, previewTemplateVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesStaticPreview");
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
| **previewTemplateVM** | [**PreviewTemplateVM**](PreviewTemplateVM.md)| Model with parameters | [optional] |

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

## templatesStaticPreviewWithHttpInfo

> ApiResponse<ExportVM> templatesStaticPreview templatesStaticPreviewWithHttpInfo(id, previewTemplateVM)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | template id
        PreviewTemplateVM previewTemplateVM = new PreviewTemplateVM(); // PreviewTemplateVM | Model with parameters
        try {
            ApiResponse<ExportVM> response = apiInstance.templatesStaticPreviewWithHttpInfo(id, previewTemplateVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesStaticPreview");
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
| **previewTemplateVM** | [**PreviewTemplateVM**](PreviewTemplateVM.md)| Model with parameters | [optional] |

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


## templatesUpdateContent

> void templatesUpdateContent(id, updateFileContentVM)

Updates contnet of the template. The method is deprecated, use the UpdateContentV2 method instead!

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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | template id
        UpdateFileContentVM updateFileContentVM = new UpdateFileContentVM(); // UpdateFileContentVM | VM with only byte[] with new content
        try {
            apiInstance.templatesUpdateContent(id, updateFileContentVM);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesUpdateContent");
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
| **updateFileContentVM** | [**UpdateFileContentVM**](UpdateFileContentVM.md)| VM with only byte[] with new content | [optional] |

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
| **404** | Not Found |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **402** | Client Error |  -  |

## templatesUpdateContentWithHttpInfo

> ApiResponse<Void> templatesUpdateContent templatesUpdateContentWithHttpInfo(id, updateFileContentVM)

Updates contnet of the template. The method is deprecated, use the UpdateContentV2 method instead!

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | template id
        UpdateFileContentVM updateFileContentVM = new UpdateFileContentVM(); // UpdateFileContentVM | VM with only byte[] with new content
        try {
            ApiResponse<Void> response = apiInstance.templatesUpdateContentWithHttpInfo(id, updateFileContentVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesUpdateContent");
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
| **updateFileContentVM** | [**UpdateFileContentVM**](UpdateFileContentVM.md)| VM with only byte[] with new content | [optional] |

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
| **404** | Not Found |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **402** | Client Error |  -  |


## templatesUpdateContentV2

> void templatesUpdateContentV2(id, fileContent)

Updates contnet of the template.

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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | template id
        File fileContent = new File("/path/to/file"); // File | 
        try {
            apiInstance.templatesUpdateContentV2(id, fileContent);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesUpdateContentV2");
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
| **fileContent** | **File**|  | |

### Return type


null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **404** | Not Found |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **402** | Client Error |  -  |

## templatesUpdateContentV2WithHttpInfo

> ApiResponse<Void> templatesUpdateContentV2 templatesUpdateContentV2WithHttpInfo(id, fileContent)

Updates contnet of the template.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | template id
        File fileContent = new File("/path/to/file"); // File | 
        try {
            ApiResponse<Void> response = apiInstance.templatesUpdateContentV2WithHttpInfo(id, fileContent);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesUpdateContentV2");
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
| **fileContent** | **File**|  | |

### Return type


ApiResponse<Void>

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **404** | Not Found |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **402** | Client Error |  -  |


## templatesUpdateIcon

> TemplateVM templatesUpdateIcon(id, fileIconVM)

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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        FileIconVM fileIconVM = new FileIconVM(); // FileIconVM | 
        try {
            TemplateVM result = apiInstance.templatesUpdateIcon(id, fileIconVM);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **fileIconVM** | [**FileIconVM**](FileIconVM.md)|  | [optional] |

### Return type

[**TemplateVM**](TemplateVM.md)


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

## templatesUpdateIconWithHttpInfo

> ApiResponse<TemplateVM> templatesUpdateIcon templatesUpdateIconWithHttpInfo(id, fileIconVM)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        FileIconVM fileIconVM = new FileIconVM(); // FileIconVM | 
        try {
            ApiResponse<TemplateVM> response = apiInstance.templatesUpdateIconWithHttpInfo(id, fileIconVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesUpdateIcon");
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

ApiResponse<[**TemplateVM**](TemplateVM.md)>


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


## templatesUpdatePermissions

> void templatesUpdatePermissions(id, updateFilePermissionsVM)

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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        UpdateFilePermissionsVM updateFilePermissionsVM = new UpdateFilePermissionsVM(); // UpdateFilePermissionsVM | 
        try {
            apiInstance.templatesUpdatePermissions(id, updateFilePermissionsVM);
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

## templatesUpdatePermissionsWithHttpInfo

> ApiResponse<Void> templatesUpdatePermissions templatesUpdatePermissionsWithHttpInfo(id, updateFilePermissionsVM)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        UpdateFilePermissionsVM updateFilePermissionsVM = new UpdateFilePermissionsVM(); // UpdateFilePermissionsVM | 
        try {
            ApiResponse<Void> response = apiInstance.templatesUpdatePermissionsWithHttpInfo(id, updateFilePermissionsVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesUpdatePermissions");
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


## templatesUpdateTags

> TemplateVM templatesUpdateTags(id, fileTagsUpdateVM)

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

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        FileTagsUpdateVM fileTagsUpdateVM = new FileTagsUpdateVM(); // FileTagsUpdateVM | 
        try {
            TemplateVM result = apiInstance.templatesUpdateTags(id, fileTagsUpdateVM);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **fileTagsUpdateVM** | [**FileTagsUpdateVM**](FileTagsUpdateVM.md)|  | [optional] |

### Return type

[**TemplateVM**](TemplateVM.md)


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

## templatesUpdateTagsWithHttpInfo

> ApiResponse<TemplateVM> templatesUpdateTags templatesUpdateTagsWithHttpInfo(id, fileTagsUpdateVM)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | 
        FileTagsUpdateVM fileTagsUpdateVM = new FileTagsUpdateVM(); // FileTagsUpdateVM | 
        try {
            ApiResponse<TemplateVM> response = apiInstance.templatesUpdateTagsWithHttpInfo(id, fileTagsUpdateVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesUpdateTags");
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

ApiResponse<[**TemplateVM**](TemplateVM.md)>


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


## templatesUploadFile

> TemplateVM templatesUploadFile(id, templateCreateVM)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | Identifier of folder
        TemplateCreateVM templateCreateVM = new TemplateCreateVM(); // TemplateCreateVM | file's view model
        try {
            TemplateVM result = apiInstance.templatesUploadFile(id, templateCreateVM);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Identifier of folder | |
| **templateCreateVM** | [**TemplateCreateVM**](TemplateCreateVM.md)| file&#39;s view model | [optional] |

### Return type

[**TemplateVM**](TemplateVM.md)


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

## templatesUploadFileWithHttpInfo

> ApiResponse<TemplateVM> templatesUploadFile templatesUploadFileWithHttpInfo(id, templateCreateVM)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | Identifier of folder
        TemplateCreateVM templateCreateVM = new TemplateCreateVM(); // TemplateCreateVM | file's view model
        try {
            ApiResponse<TemplateVM> response = apiInstance.templatesUploadFileWithHttpInfo(id, templateCreateVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesUploadFile");
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
| **templateCreateVM** | [**TemplateCreateVM**](TemplateCreateVM.md)| file&#39;s view model | [optional] |

### Return type

ApiResponse<[**TemplateVM**](TemplateVM.md)>


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


## templatesUploadFileV2

> TemplateVM templatesUploadFileV2(id, fileContent, tags, icon)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | Identifier of folder
        File fileContent = new File("/path/to/file"); // File | 
        List<String> tags = Arrays.asList(); // List<String> | 
        File icon = new File("/path/to/file"); // File | 
        try {
            TemplateVM result = apiInstance.templatesUploadFileV2(id, fileContent, tags, icon);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesUploadFileV2");
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
| **tags** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **icon** | **File**|  | [optional] |

### Return type

[**TemplateVM**](TemplateVM.md)


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

## templatesUploadFileV2WithHttpInfo

> ApiResponse<TemplateVM> templatesUploadFileV2 templatesUploadFileV2WithHttpInfo(id, fileContent, tags, icon)

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
import cloud.fastreport.client.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String id = "id_example"; // String | Identifier of folder
        File fileContent = new File("/path/to/file"); // File | 
        List<String> tags = Arrays.asList(); // List<String> | 
        File icon = new File("/path/to/file"); // File | 
        try {
            ApiResponse<TemplateVM> response = apiInstance.templatesUploadFileV2WithHttpInfo(id, fileContent, tags, icon);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesUploadFileV2");
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
| **tags** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **icon** | **File**|  | [optional] |

### Return type

ApiResponse<[**TemplateVM**](TemplateVM.md)>


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

