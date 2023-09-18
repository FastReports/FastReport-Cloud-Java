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

import cloud.fastreport.model.AuditActionsVM;
import cloud.fastreport.model.BreadcrumbsVM;
import cloud.fastreport.model.CountVM;
import cloud.fastreport.model.ExportReportVM;
import cloud.fastreport.model.ExportVM;
import cloud.fastreport.model.FileIconVM;
import cloud.fastreport.model.FilePermissionsVM;
import cloud.fastreport.model.FileRenameVM;
import cloud.fastreport.model.FileSorting;
import cloud.fastreport.model.FileTagsUpdateVM;
import cloud.fastreport.model.FileVM;
import cloud.fastreport.model.FilesVM;
import cloud.fastreport.model.FolderCreateVM;
import cloud.fastreport.model.FolderIconVM;
import cloud.fastreport.model.FolderRenameVM;
import cloud.fastreport.model.FolderSizeVM;
import cloud.fastreport.model.FolderTagsUpdateVM;
import cloud.fastreport.model.PreviewReportVM;
import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.ReportCreateVM;
import cloud.fastreport.model.ReportFolderCreateVM;
import cloud.fastreport.model.ReportVM;
import cloud.fastreport.model.ReportsVM;
import cloud.fastreport.model.SelectedFilesForDeletingVM;
import cloud.fastreport.model.UpdateFilePermissionsVM;
import org.junit.Test;
import org.junit.Ignore;

import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportsApi
 */
@Ignore
public class ReportsApiTest {

    private final ReportsApi api = new ReportsApi();

    
    /**
     * Delete all folders and files from recycle bin
     *
     * User with a Delete RecycleBin permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportFolderAndFileClearRecycleBinTest() throws IOException {
        String subscriptionId = null;
        api.reportFolderAndFileClearRecycleBin(subscriptionId);

        // TODO: test validations
    }
    
    /**
     * Delete folders and files
     *
     * User with a Delete permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportFolderAndFileDeleteFilesTest() throws IOException {
        String subscriptionId = null;
        SelectedFilesForDeletingVM selectedFilesForDeletingVM = null;
        api.reportFolderAndFileDeleteFiles(subscriptionId, selectedFilesForDeletingVM);

        // TODO: test validations
    }
    
    /**
     * Get count of files and folders what contains in a specified folder
     *
     * User with a Get Count permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportFolderAndFileGetCountTest() throws IOException {
        String id = null;
        String searchPattern = null;
        Boolean useRegex = null;
        CountVM response = api.reportFolderAndFileGetCount(id, searchPattern, useRegex);

        // TODO: test validations
    }
    
    /**
     * Get all folders and files from specified folder
     *
     * User with a Get Entity permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportFolderAndFileGetFoldersAndFilesTest() throws IOException {
        String id = null;
        Integer skip = null;
        Integer take = null;
        FileSorting orderBy = null;
        Boolean desc = null;
        String searchPattern = null;
        Boolean useRegex = null;
        FilesVM response = api.reportFolderAndFileGetFoldersAndFiles(id, skip, take, orderBy, desc, searchPattern, useRegex);

        // TODO: test validations
    }
    
    /**
     * Get all folders and files from recycle bin
     *
     * User with a Get DeletedFiles permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportFolderAndFileGetRecycleBinFoldersAndFilesTest() throws IOException {
        String subscriptionId = null;
        Integer skip = null;
        Integer take = null;
        FileSorting orderBy = null;
        Boolean desc = null;
        String searchPattern = null;
        Boolean useRegex = null;
        FilesVM response = api.reportFolderAndFileGetRecycleBinFoldersAndFiles(subscriptionId, skip, take, orderBy, desc, searchPattern, useRegex);

        // TODO: test validations
    }
    
    /**
     * Recover all folders and files from recycle bin
     *
     * User with a Create RecycleBin permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportFolderAndFileRecoverAllFromRecycleBinTest() throws IOException {
        String subscriptionId = null;
        api.reportFolderAndFileRecoverAllFromRecycleBin(subscriptionId);

        // TODO: test validations
    }
    
    /**
     * Get specified folder, calculate it&#39;s size
     *
     * User with a Get Entity permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportFoldersCalculateFolderSizeTest() throws IOException {
        String id = null;
        FolderSizeVM response = api.reportFoldersCalculateFolderSize(id);

        // TODO: test validations
    }
    
    /**
     * Move folder to a specified folder
     *
     * User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportFoldersCopyFolderTest() throws IOException {
        String id = null;
        String folderId = null;
        FileVM response = api.reportFoldersCopyFolder(id, folderId);

        // TODO: test validations
    }
    
    /**
     * Delete specified folder
     *
     * User with a Delete Entity permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportFoldersDeleteFolderTest() throws IOException {
        String id = null;
        api.reportFoldersDeleteFolder(id);

        // TODO: test validations
    }
    
    /**
     * Export specified report folder to a specified format
     *
     * User with Execute Export permission on report folder and  Create Entity on an export folder can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportFoldersExportTest() throws IOException {
        String id = null;
        ExportReportVM exportReportVM = null;
        FileVM response = api.reportFoldersExport(id, exportReportVM);

        // TODO: test validations
    }
    
    /**
     * Get specified folder breadcrumbs
     *
     * User with a Get Entity permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportFoldersGetBreadcrumbsTest() throws IOException {
        String id = null;
        BreadcrumbsVM response = api.reportFoldersGetBreadcrumbs(id);

        // TODO: test validations
    }
    
    /**
     * Get specified folder
     *
     * User with a Get Entity permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportFoldersGetFolderTest() throws IOException {
        String id = null;
        FileVM response = api.reportFoldersGetFolder(id);

        // TODO: test validations
    }
    
    /**
     * Get all folders from specified folder
     *
     * User with a Get Entity permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportFoldersGetFoldersTest() throws IOException {
        String id = null;
        Integer skip = null;
        Integer take = null;
        FileSorting orderBy = null;
        Boolean desc = null;
        String searchPattern = null;
        Boolean useRegex = null;
        FilesVM response = api.reportFoldersGetFolders(id, skip, take, orderBy, desc, searchPattern, useRegex);

        // TODO: test validations
    }
    
    /**
     * Get count of folders what contains in a specified folder
     *
     * User with a Get Count permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportFoldersGetFoldersCountTest() throws IOException {
        String id = null;
        CountVM response = api.reportFoldersGetFoldersCount(id);

        // TODO: test validations
    }
    
    /**
     * Get specified folder
     *
     * User with a Get Entity permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportFoldersGetOrCreateTest() throws IOException {
        String name = null;
        String subscriptionId = null;
        String parentId = null;
        FileVM response = api.reportFoldersGetOrCreate(name, subscriptionId, parentId);

        // TODO: test validations
    }
    
    /**
     * Get all folder permissions
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportFoldersGetPermissionsTest() throws IOException {
        String id = null;
        FilePermissionsVM response = api.reportFoldersGetPermissions(id);

        // TODO: test validations
    }
    
    /**
     * Get user&#39;s root folder (without parents)
     *
     * &gt; Breakchange. Now user model doesn&#39;t contain a root folders.  This method can return error 400 and 404 when subscription is not found.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportFoldersGetRootFolderTest() throws IOException {
        String subscriptionId = null;
        FileVM response = api.reportFoldersGetRootFolder(subscriptionId);

        // TODO: test validations
    }
    
    /**
     * Move folder to a specified folder
     *
     * User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportFoldersMoveFolderTest() throws IOException {
        String id = null;
        String folderId = null;
        FileVM response = api.reportFoldersMoveFolder(id, folderId);

        // TODO: test validations
    }
    
    /**
     * Move specified folder to recycle bin
     *
     * User with a Delete Entity permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportFoldersMoveFolderToBinTest() throws IOException {
        String id = null;
        api.reportFoldersMoveFolderToBin(id);

        // TODO: test validations
    }
    
    /**
     * Create folder
     *
     * User with a Create Entity permisison can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportFoldersPostFolderTest() throws IOException {
        String id = null;
        ReportFolderCreateVM reportFolderCreateVM = null;
        FileVM response = api.reportFoldersPostFolder(id, reportFolderCreateVM);

        // TODO: test validations
    }
    
    /**
     * Recover specified folder
     *
     * User with a Delete Entity permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportFoldersRecoverFolderTest() throws IOException {
        String id = null;
        String recoveryPath = null;
        api.reportFoldersRecoverFolder(id, recoveryPath);

        // TODO: test validations
    }
    
    /**
     * Rename a folder
     *
     * User with a Update Name permision can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportFoldersRenameFolderTest() throws IOException {
        String id = null;
        FolderRenameVM folderRenameVM = null;
        FileVM response = api.reportFoldersRenameFolder(id, folderRenameVM);

        // TODO: test validations
    }
    
    /**
     * Update a folder&#39;s icon
     *
     * User with a Update Icon permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportFoldersUpdateIconTest() throws IOException {
        String id = null;
        FolderIconVM folderIconVM = null;
        FileVM response = api.reportFoldersUpdateIcon(id, folderIconVM);

        // TODO: test validations
    }
    
    /**
     * Update permissions
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportFoldersUpdatePermissionsTest() throws IOException {
        String id = null;
        UpdateFilePermissionsVM updateFilePermissionsVM = null;
        api.reportFoldersUpdatePermissions(id, updateFilePermissionsVM);

        // TODO: test validations
    }
    
    /**
     * Update tags
     *
     * User with a Update Tags permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportFoldersUpdateTagsTest() throws IOException {
        String id = null;
        FolderTagsUpdateVM folderTagsUpdateVM = null;
        FileVM response = api.reportFoldersUpdateTags(id, folderTagsUpdateVM);

        // TODO: test validations
    }
    
    /**
     * Copy file to a specified folder
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportsCopyFileTest() throws IOException {
        String id = null;
        String folderId = null;
        ReportVM response = api.reportsCopyFile(id, folderId);

        // TODO: test validations
    }
    
    /**
     * Delete specified file
     *
     * User with Delete permission can access the method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportsDeleteFileTest() throws IOException {
        String id = null;
        api.reportsDeleteFile(id);

        // TODO: test validations
    }
    
    /**
     * Export specified report to a specified format
     *
     * User with Execute Export permission on prepared report and  Create Entity on an export folder can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportsExportTest() throws IOException {
        String id = null;
        ExportReportVM exportReportVM = null;
        ExportVM response = api.reportsExport(id, exportReportVM);

        // TODO: test validations
    }
    
    /**
     * Get specified file
     *
     * User with Get Entity permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportsGetFileTest() throws IOException {
        String id = null;
        ReportVM response = api.reportsGetFile(id);

        // TODO: test validations
    }
    
    /**
     * Returns list of actions, performed on this file
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportsGetFileHistoryTest() throws IOException {
        String id = null;
        Integer skip = null;
        Integer take = null;
        AuditActionsVM response = api.reportsGetFileHistory(id, skip, take);

        // TODO: test validations
    }
    
    /**
     * Get count of files what contains in a specified folder
     *
     * User with Get Count permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportsGetFilesCountTest() throws IOException {
        String id = null;
        CountVM response = api.reportsGetFilesCount(id);

        // TODO: test validations
    }
    
    /**
     * Get all files from specified folder. &lt;br /&gt;  User with Get Entity permission can access this method. &lt;br /&gt;  The method will returns minimal infomration about the file: &lt;br /&gt;  id, name, size, editedTime, createdTime, tags, status, statusReason.
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportsGetFilesListTest() throws IOException {
        String id = null;
        Integer skip = null;
        Integer take = null;
        String searchPattern = null;
        FileSorting orderBy = null;
        Boolean desc = null;
        Boolean useRegex = null;
        ReportsVM response = api.reportsGetFilesList(id, skip, take, searchPattern, orderBy, desc, useRegex);

        // TODO: test validations
    }
    
    /**
     * Get all file permissions
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportsGetPermissionsTest() throws IOException {
        String id = null;
        FilePermissionsVM response = api.reportsGetPermissions(id);

        // TODO: test validations
    }
    
    /**
     * Move file to a specified folder
     *
     * User with Update Place permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportsMoveFileTest() throws IOException {
        String id = null;
        String folderId = null;
        ReportVM response = api.reportsMoveFile(id, folderId);

        // TODO: test validations
    }
    
    /**
     * Move specified file to recycle bin
     *
     * User with Delete permission can access the method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportsMoveFileToBinTest() throws IOException {
        String id = null;
        api.reportsMoveFileToBin(id);

        // TODO: test validations
    }
    
    /**
     * Recover specified file from bin
     *
     * User with Delete permission can access the method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportsRecoverFileTest() throws IOException {
        String id = null;
        String recoveryPath = null;
        api.reportsRecoverFile(id, recoveryPath);

        // TODO: test validations
    }
    
    /**
     * Rename a file
     *
     * User with Update Name permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportsRenameFileTest() throws IOException {
        String id = null;
        FileRenameVM fileRenameVM = null;
        ReportVM response = api.reportsRenameFile(id, fileRenameVM);

        // TODO: test validations
    }
    
    /**
     * Make preview for the report.  Generate a new or return exist prepared svg files.  If template was changed will be returned a new.  Pass the &#x60;&#x60; parameter to check prepared timestamp
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportsStaticPreviewTest() throws IOException {
        String id = null;
        PreviewReportVM previewReportVM = null;
        ExportVM response = api.reportsStaticPreview(id, previewReportVM);

        // TODO: test validations
    }
    
    /**
     * Update a files&#39;s icon
     *
     * User with Update Icon permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportsUpdateIconTest() throws IOException {
        String id = null;
        FileIconVM fileIconVM = null;
        ReportVM response = api.reportsUpdateIcon(id, fileIconVM);

        // TODO: test validations
    }
    
    /**
     * Update permissions
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportsUpdatePermissionsTest() throws IOException {
        String id = null;
        UpdateFilePermissionsVM updateFilePermissionsVM = null;
        api.reportsUpdatePermissions(id, updateFilePermissionsVM);

        // TODO: test validations
    }
    
    /**
     * Update tags
     *
     * User with Update Tags permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportsUpdateTagsTest() throws IOException {
        String id = null;
        FileTagsUpdateVM fileTagsUpdateVM = null;
        ReportVM response = api.reportsUpdateTags(id, fileTagsUpdateVM);

        // TODO: test validations
    }
    
    /**
     * Upload a file to the specified folder  !
     *
     * User with Create Entity permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void reportsUploadFileTest() throws IOException {
        String id = null;
        ReportCreateVM reportCreateVM = null;
        ReportVM response = api.reportsUploadFile(id, reportCreateVM);

        // TODO: test validations
    }
    
}
