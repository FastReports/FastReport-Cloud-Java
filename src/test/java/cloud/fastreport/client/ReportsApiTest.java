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
import cloud.fastreport.model.FolderIconVM;
import cloud.fastreport.model.FolderRenameVM;
import cloud.fastreport.model.FolderTagsUpdateVM;
import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.ReportCreateVM;
import cloud.fastreport.model.ReportFolderCreateVM;
import cloud.fastreport.model.ReportVM;
import cloud.fastreport.model.ReportsVM;
import cloud.fastreport.model.UpdateFilePermissionsVM;
import org.junit.Test;
import org.junit.Ignore;

import java.io.IOException;
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
        CountVM response = api.reportFolderAndFileGetCount(id);

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
        FilesVM response = api.reportFolderAndFileGetFoldersAndFiles(id, skip, take, orderBy, desc, searchPattern);

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
        Boolean recursive = null;
        api.reportFoldersDeleteFolder(id, recursive);

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
        FilesVM response = api.reportFoldersGetFolders(id, skip, take);

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
        ReportsVM response = api.reportsGetFilesList(id, skip, take);

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
