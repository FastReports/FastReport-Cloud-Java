/*
 * FastReport Cloud
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package cloud.fastreport.client;

import cloud.fastreport.ApiException;
import cloud.fastreport.model.AuditActionsVM;
import cloud.fastreport.model.BreadcrumbsVM;
import cloud.fastreport.model.CountVM;
import cloud.fastreport.model.CreateFileShareVM;
import cloud.fastreport.model.ExportFolderCreateVM;
import cloud.fastreport.model.ExportVM;
import cloud.fastreport.model.ExportsVM;
import cloud.fastreport.model.FileIconVM;
import cloud.fastreport.model.FilePermissionsVM;
import cloud.fastreport.model.FileRenameVM;
import cloud.fastreport.model.FileSharingKeysVM;
import cloud.fastreport.model.FileSorting;
import cloud.fastreport.model.FileTagsUpdateVM;
import cloud.fastreport.model.FileVM;
import cloud.fastreport.model.FilesVM;
import cloud.fastreport.model.FolderIconVM;
import cloud.fastreport.model.FolderRenameVM;
import cloud.fastreport.model.FolderSizeVM;
import cloud.fastreport.model.FolderTagsUpdateVM;
import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.SelectedFilesVM;
import cloud.fastreport.model.UpdateFilePermissionsVM;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExportsApi
 */
@Disabled
public class ExportsApiTest {

    private final ExportsApi api = new ExportsApi();

    /**
     * Delete all folders and files from recycle bin
     *
     * User with a Delete RecycleBin permission can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFolderAndFileClearRecycleBinTest() throws ApiException {
        String subscriptionId = null;
        api.exportFolderAndFileClearRecycleBin(subscriptionId);
        // TODO: test validations
    }

    /**
     * Copy folders and files to a specified folder
     *
     * User with a Get permission for a files and Create permission for a destination folder can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFolderAndFileCopyFilesTest() throws ApiException {
        String subscriptionId = null;
        SelectedFilesVM selectedFilesVM = null;
        api.exportFolderAndFileCopyFiles(subscriptionId, selectedFilesVM);
        // TODO: test validations
    }

    /**
     * Count all folders and files from recycle bin
     *
     * User with a Get DeletedFiles permission can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFolderAndFileCountRecycleBinFoldersAndFilesTest() throws ApiException {
        String subscriptionId = null;
        String searchPattern = null;
        Boolean useRegex = null;
        CountVM response = api.exportFolderAndFileCountRecycleBinFoldersAndFiles(subscriptionId, searchPattern, useRegex);
        // TODO: test validations
    }

    /**
     * Delete folders and files
     *
     * User with a Delete permission can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFolderAndFileDeleteFilesTest() throws ApiException {
        String subscriptionId = null;
        SelectedFilesVM selectedFilesVM = null;
        api.exportFolderAndFileDeleteFiles(subscriptionId, selectedFilesVM);
        // TODO: test validations
    }

    /**
     * Get count of files and folders what contains in a specified folder
     *
     * User with a Get Count permission can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFolderAndFileGetCountTest() throws ApiException {
        String id = null;
        String searchPattern = null;
        Boolean useRegex = null;
        CountVM response = api.exportFolderAndFileGetCount(id, searchPattern, useRegex);
        // TODO: test validations
    }

    /**
     * Get all folders and files from specified folder
     *
     * User with a Get Entity permission can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFolderAndFileGetFoldersAndFilesTest() throws ApiException {
        String id = null;
        Integer skip = null;
        Integer take = null;
        FileSorting orderBy = null;
        Boolean desc = null;
        String searchPattern = null;
        Boolean useRegex = null;
        FilesVM response = api.exportFolderAndFileGetFoldersAndFiles(id, skip, take, orderBy, desc, searchPattern, useRegex);
        // TODO: test validations
    }

    /**
     * Get all folders and files from recycle bin
     *
     * User with a Get DeletedFiles permission can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFolderAndFileGetRecycleBinFoldersAndFilesTest() throws ApiException {
        String subscriptionId = null;
        Integer skip = null;
        Integer take = null;
        FileSorting orderBy = null;
        Boolean desc = null;
        String searchPattern = null;
        Boolean useRegex = null;
        FilesVM response = api.exportFolderAndFileGetRecycleBinFoldersAndFiles(subscriptionId, skip, take, orderBy, desc, searchPattern, useRegex);
        // TODO: test validations
    }

    /**
     * Move folders and files to a specified folder
     *
     * User with a Update Place permission for a files and Create permission for a destination folder can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFolderAndFileMoveFilesTest() throws ApiException {
        String subscriptionId = null;
        SelectedFilesVM selectedFilesVM = null;
        api.exportFolderAndFileMoveFiles(subscriptionId, selectedFilesVM);
        // TODO: test validations
    }

    /**
     * Move folders and files to bin
     *
     * User with a Delete permission can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFolderAndFileMoveFilesToBinTest() throws ApiException {
        String subscriptionId = null;
        SelectedFilesVM selectedFilesVM = null;
        api.exportFolderAndFileMoveFilesToBin(subscriptionId, selectedFilesVM);
        // TODO: test validations
    }

    /**
     * Recover all folders and files from recycle bin
     *
     * User with a Create RecycleBin permission can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFolderAndFileRecoverAllFromRecycleBinTest() throws ApiException {
        String subscriptionId = null;
        api.exportFolderAndFileRecoverAllFromRecycleBin(subscriptionId);
        // TODO: test validations
    }

    /**
     * Recover folders and files from bin
     *
     * User with a SubscriptionCreate permission can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFolderAndFileRecoverFilesTest() throws ApiException {
        String subscriptionId = null;
        SelectedFilesVM selectedFilesVM = null;
        api.exportFolderAndFileRecoverFiles(subscriptionId, selectedFilesVM);
        // TODO: test validations
    }

    /**
     * Get specified folder, calculate it&#39;s size
     *
     * User with a Get Entity permission can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFoldersCalculateFolderSizeTest() throws ApiException {
        String id = null;
        FolderSizeVM response = api.exportFoldersCalculateFolderSize(id);
        // TODO: test validations
    }

    /**
     * Move folder to a specified folder
     *
     * User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFoldersCopyFolderTest() throws ApiException {
        String id = null;
        String folderId = null;
        FileVM response = api.exportFoldersCopyFolder(id, folderId);
        // TODO: test validations
    }

    /**
     * Delete specified folder
     *
     * User with a Delete Entity permission can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFoldersDeleteFolderTest() throws ApiException {
        String id = null;
        api.exportFoldersDeleteFolder(id);
        // TODO: test validations
    }

    /**
     * Get specified folder breadcrumbs
     *
     * User with a Get Entity permission can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFoldersGetBreadcrumbsTest() throws ApiException {
        String id = null;
        BreadcrumbsVM response = api.exportFoldersGetBreadcrumbs(id);
        // TODO: test validations
    }

    /**
     * Get specified folder
     *
     * User with a Get Entity permission can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFoldersGetFolderTest() throws ApiException {
        String id = null;
        FileVM response = api.exportFoldersGetFolder(id);
        // TODO: test validations
    }

    /**
     * Get all folders from specified folder
     *
     * User with a Get Entity permission can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFoldersGetFoldersTest() throws ApiException {
        String id = null;
        Integer skip = null;
        Integer take = null;
        FileSorting orderBy = null;
        Boolean desc = null;
        String searchPattern = null;
        Boolean useRegex = null;
        FilesVM response = api.exportFoldersGetFolders(id, skip, take, orderBy, desc, searchPattern, useRegex);
        // TODO: test validations
    }

    /**
     * Get count of folders what contains in a specified folder
     *
     * User with a Get Count permission can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFoldersGetFoldersCountTest() throws ApiException {
        String id = null;
        CountVM response = api.exportFoldersGetFoldersCount(id);
        // TODO: test validations
    }

    /**
     * Get specified folder
     *
     * User with a Get Entity permission can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFoldersGetOrCreateTest() throws ApiException {
        String name = null;
        String subscriptionId = null;
        String parentId = null;
        FileVM response = api.exportFoldersGetOrCreate(name, subscriptionId, parentId);
        // TODO: test validations
    }

    /**
     * Get all folder permissions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFoldersGetPermissionsTest() throws ApiException {
        String id = null;
        FilePermissionsVM response = api.exportFoldersGetPermissions(id);
        // TODO: test validations
    }

    /**
     * Get user&#39;s root folder (without parents)
     *
     * &gt; Breakchange. Now user model doesn&#39;t contain a root folders.  This method can return error 400 and 404 when subscription is not found.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFoldersGetRootFolderTest() throws ApiException {
        String subscriptionId = null;
        FileVM response = api.exportFoldersGetRootFolder(subscriptionId);
        // TODO: test validations
    }

    /**
     * Move folder to a specified folder
     *
     * User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFoldersMoveFolderTest() throws ApiException {
        String id = null;
        String folderId = null;
        FileVM response = api.exportFoldersMoveFolder(id, folderId);
        // TODO: test validations
    }

    /**
     * Move specified folder to recycle bin
     *
     * User with a Delete Entity permission can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFoldersMoveFolderToBinTest() throws ApiException {
        String id = null;
        api.exportFoldersMoveFolderToBin(id);
        // TODO: test validations
    }

    /**
     * Create folder
     *
     * User with a Create Entity permisison can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFoldersPostFolderTest() throws ApiException {
        String id = null;
        ExportFolderCreateVM exportFolderCreateVM = null;
        FileVM response = api.exportFoldersPostFolder(id, exportFolderCreateVM);
        // TODO: test validations
    }

    /**
     * Recover specified folder
     *
     * User with a Delete Entity permission can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFoldersRecoverFolderTest() throws ApiException {
        String id = null;
        String recoveryPath = null;
        api.exportFoldersRecoverFolder(id, recoveryPath);
        // TODO: test validations
    }

    /**
     * Rename a folder
     *
     * User with a Update Name permision can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFoldersRenameFolderTest() throws ApiException {
        String id = null;
        FolderRenameVM folderRenameVM = null;
        FileVM response = api.exportFoldersRenameFolder(id, folderRenameVM);
        // TODO: test validations
    }

    /**
     * Update a folder&#39;s icon
     *
     * User with a Update Icon permission can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFoldersUpdateIconTest() throws ApiException {
        String id = null;
        FolderIconVM folderIconVM = null;
        FileVM response = api.exportFoldersUpdateIcon(id, folderIconVM);
        // TODO: test validations
    }

    /**
     * Update permissions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFoldersUpdatePermissionsTest() throws ApiException {
        String id = null;
        UpdateFilePermissionsVM updateFilePermissionsVM = null;
        api.exportFoldersUpdatePermissions(id, updateFilePermissionsVM);
        // TODO: test validations
    }

    /**
     * Update tags
     *
     * User with a Update Tags permission can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportFoldersUpdateTagsTest() throws ApiException {
        String id = null;
        FolderTagsUpdateVM folderTagsUpdateVM = null;
        FileVM response = api.exportFoldersUpdateTags(id, folderTagsUpdateVM);
        // TODO: test validations
    }

    /**
     * Copy file to a specified folder
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportsCopyFileTest() throws ApiException {
        String id = null;
        String folderId = null;
        ExportVM response = api.exportsCopyFile(id, folderId);
        // TODO: test validations
    }

    /**
     * Create a new key, that can be used to share access to a file  (You need Administrate.Anon permission to create a new key)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportsCreateSharingKeyTest() throws ApiException {
        String id = null;
        CreateFileShareVM createFileShareVM = null;
        FileSharingKeysVM response = api.exportsCreateSharingKey(id, createFileShareVM);
        // TODO: test validations
    }

    /**
     * Delete specified file
     *
     * User with Delete permission can access the method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportsDeleteFileTest() throws ApiException {
        String id = null;
        api.exportsDeleteFile(id);
        // TODO: test validations
    }

    /**
     * Deletes a sharing key, making links, that utilizing it no longer work
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportsDeleteSharingKeyTest() throws ApiException {
        String id = null;
        String key = null;
        api.exportsDeleteSharingKey(id, key);
        // TODO: test validations
    }

    /**
     * Get export by specified id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportsGetFileTest() throws ApiException {
        String id = null;
        ExportVM response = api.exportsGetFile(id);
        // TODO: test validations
    }

    /**
     * Returns list of actions, performed on this file
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportsGetFileHistoryTest() throws ApiException {
        String id = null;
        Integer skip = null;
        Integer take = null;
        AuditActionsVM response = api.exportsGetFileHistory(id, skip, take);
        // TODO: test validations
    }

    /**
     * Get count of files what contains in a specified folder
     *
     * User with Get Count permission can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportsGetFilesCountTest() throws ApiException {
        String id = null;
        CountVM response = api.exportsGetFilesCount(id);
        // TODO: test validations
    }

    /**
     * Get all files from specified folder. &lt;br /&gt;  User with Get Entity permission can access this method. &lt;br /&gt;  The method will returns minimal infomration about the file: &lt;br /&gt;  id, name, size, editedTime, createdTime, tags, status, statusReason.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportsGetFilesListTest() throws ApiException {
        String id = null;
        Integer skip = null;
        Integer take = null;
        String searchPattern = null;
        FileSorting orderBy = null;
        Boolean desc = null;
        Boolean useRegex = null;
        ExportsVM response = api.exportsGetFilesList(id, skip, take, searchPattern, orderBy, desc, useRegex);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportsGetPermissionsTest() throws ApiException {
        String id = null;
        FilePermissionsVM response = api.exportsGetPermissions(id);
        // TODO: test validations
    }

    /**
     * Returns all sharing keys, associated with the file
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportsGetSharingKeysTest() throws ApiException {
        String id = null;
        FileSharingKeysVM response = api.exportsGetSharingKeys(id);
        // TODO: test validations
    }

    /**
     * Move file to a specified folder
     *
     * User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportsMoveFileTest() throws ApiException {
        String id = null;
        String folderId = null;
        ExportVM response = api.exportsMoveFile(id, folderId);
        // TODO: test validations
    }

    /**
     * Move specified file to recycle bin
     *
     * User with Delete permission can access the method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportsMoveFileToBinTest() throws ApiException {
        String id = null;
        api.exportsMoveFileToBin(id);
        // TODO: test validations
    }

    /**
     * Recover specified file from bin
     *
     * User with Delete permission can access the method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportsRecoverFileTest() throws ApiException {
        String id = null;
        String recoveryPath = null;
        api.exportsRecoverFile(id, recoveryPath);
        // TODO: test validations
    }

    /**
     * Rename a file
     *
     * User with Update Name permission can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportsRenameFileTest() throws ApiException {
        String id = null;
        FileRenameVM fileRenameVM = null;
        ExportVM response = api.exportsRenameFile(id, fileRenameVM);
        // TODO: test validations
    }

    /**
     * Update a files&#39;s icon
     *
     * User with Update Icon permission can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportsUpdateIconTest() throws ApiException {
        String id = null;
        FileIconVM fileIconVM = null;
        ExportVM response = api.exportsUpdateIcon(id, fileIconVM);
        // TODO: test validations
    }

    /**
     * Update permissions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportsUpdatePermissionsTest() throws ApiException {
        String id = null;
        UpdateFilePermissionsVM updateFilePermissionsVM = null;
        api.exportsUpdatePermissions(id, updateFilePermissionsVM);
        // TODO: test validations
    }

    /**
     * Update tags
     *
     * User with Update Tags permission can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportsUpdateTagsTest() throws ApiException {
        String id = null;
        FileTagsUpdateVM fileTagsUpdateVM = null;
        ExportVM response = api.exportsUpdateTags(id, fileTagsUpdateVM);
        // TODO: test validations
    }

}
