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
import cloud.fastreport.model.ExportTemplateVM;
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
import cloud.fastreport.model.PrepareTemplateVM;
import cloud.fastreport.model.PreviewTemplateVM;
import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.ReportVM;
import cloud.fastreport.model.TemplateCreateVM;
import cloud.fastreport.model.TemplateFolderCreateVM;
import cloud.fastreport.model.TemplateVM;
import cloud.fastreport.model.TemplatesVM;
import cloud.fastreport.model.UpdateFileContentVM;
import cloud.fastreport.model.UpdateFilePermissionsVM;
import org.junit.Test;
import org.junit.Ignore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TemplatesApi
 */
@Ignore
public class TemplatesApiTest {

    private final TemplatesApi api = new TemplatesApi();

    
    /**
     * Delete all folders and files from recycle bin
     *
     * User with a Delete RecycleBin permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void templateFolderAndFileClearRecycleBinTest() throws IOException {
        String subscriptionId = null;
        api.templateFolderAndFileClearRecycleBin(subscriptionId);

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
    public void templateFolderAndFileGetCountTest() throws IOException {
        String id = null;
        String searchPattern = null;
        Boolean useRegex = null;
        CountVM response = api.templateFolderAndFileGetCount(id, searchPattern, useRegex);

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
    public void templateFolderAndFileGetFoldersAndFilesTest() throws IOException {
        String id = null;
        Integer skip = null;
        Integer take = null;
        FileSorting orderBy = null;
        Boolean desc = null;
        String searchPattern = null;
        Boolean useRegex = null;
        FilesVM response = api.templateFolderAndFileGetFoldersAndFiles(id, skip, take, orderBy, desc, searchPattern, useRegex);

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
    public void templateFolderAndFileGetRecycleBinFoldersAndFilesTest() throws IOException {
        String subscriptionId = null;
        Integer skip = null;
        Integer take = null;
        FileSorting orderBy = null;
        Boolean desc = null;
        String searchPattern = null;
        Boolean useRegex = null;
        FilesVM response = api.templateFolderAndFileGetRecycleBinFoldersAndFiles(subscriptionId, skip, take, orderBy, desc, searchPattern, useRegex);

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
    public void templateFolderAndFileRecoverAllFromRecycleBinTest() throws IOException {
        String subscriptionId = null;
        api.templateFolderAndFileRecoverAllFromRecycleBin(subscriptionId);

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
    public void templateFoldersCopyFolderTest() throws IOException {
        String id = null;
        String folderId = null;
        FileVM response = api.templateFoldersCopyFolder(id, folderId);

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
    public void templateFoldersDeleteFolderTest() throws IOException {
        String id = null;
        api.templateFoldersDeleteFolder(id);

        // TODO: test validations
    }
    
    /**
     * Export specified template folder to a specified format
     *
     * User with Execute Export permission on template folder and  Create Entity on an export folder can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void templateFoldersExportTest() throws IOException {
        String id = null;
        ExportTemplateVM exportTemplateVM = null;
        FileVM response = api.templateFoldersExport(id, exportTemplateVM);

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
    public void templateFoldersGetBreadcrumbsTest() throws IOException {
        String id = null;
        BreadcrumbsVM response = api.templateFoldersGetBreadcrumbs(id);

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
    public void templateFoldersGetFolderTest() throws IOException {
        String id = null;
        FileVM response = api.templateFoldersGetFolder(id);

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
    public void templateFoldersGetFoldersTest() throws IOException {
        String id = null;
        Integer skip = null;
        Integer take = null;
        FileSorting orderBy = null;
        Boolean desc = null;
        String searchPattern = null;
        Boolean useRegex = null;
        FilesVM response = api.templateFoldersGetFolders(id, skip, take, orderBy, desc, searchPattern, useRegex);

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
    public void templateFoldersGetFoldersCountTest() throws IOException {
        String id = null;
        CountVM response = api.templateFoldersGetFoldersCount(id);

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
    public void templateFoldersGetOrCreateTest() throws IOException {
        String name = null;
        String subscriptionId = null;
        String parentId = null;
        FileVM response = api.templateFoldersGetOrCreate(name, subscriptionId, parentId);

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
    public void templateFoldersGetPermissionsTest() throws IOException {
        String id = null;
        FilePermissionsVM response = api.templateFoldersGetPermissions(id);

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
    public void templateFoldersGetRootFolderTest() throws IOException {
        String subscriptionId = null;
        FileVM response = api.templateFoldersGetRootFolder(subscriptionId);

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
    public void templateFoldersMoveFolderTest() throws IOException {
        String id = null;
        String folderId = null;
        FileVM response = api.templateFoldersMoveFolder(id, folderId);

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
    public void templateFoldersMoveFolderToBinTest() throws IOException {
        String id = null;
        api.templateFoldersMoveFolderToBin(id);

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
    public void templateFoldersPostFolderTest() throws IOException {
        String id = null;
        TemplateFolderCreateVM templateFolderCreateVM = null;
        FileVM response = api.templateFoldersPostFolder(id, templateFolderCreateVM);

        // TODO: test validations
    }
    
    /**
     * Prepare specified template folder to report folder
     *
     * User with Execute Prepare permission on report and  Create Entity on a prepared report folder can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void templateFoldersPrepareTest() throws IOException {
        String id = null;
        PrepareTemplateVM prepareTemplateVM = null;
        FileVM response = api.templateFoldersPrepare(id, prepareTemplateVM);

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
    public void templateFoldersRecoverFolderTest() throws IOException {
        String id = null;
        String recoveryPath = null;
        api.templateFoldersRecoverFolder(id, recoveryPath);

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
    public void templateFoldersRenameFolderTest() throws IOException {
        String id = null;
        FolderRenameVM folderRenameVM = null;
        FileVM response = api.templateFoldersRenameFolder(id, folderRenameVM);

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
    public void templateFoldersUpdateIconTest() throws IOException {
        String id = null;
        FolderIconVM folderIconVM = null;
        FileVM response = api.templateFoldersUpdateIcon(id, folderIconVM);

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
    public void templateFoldersUpdatePermissionsTest() throws IOException {
        String id = null;
        UpdateFilePermissionsVM updateFilePermissionsVM = null;
        api.templateFoldersUpdatePermissions(id, updateFilePermissionsVM);

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
    public void templateFoldersUpdateTagsTest() throws IOException {
        String id = null;
        FolderTagsUpdateVM folderTagsUpdateVM = null;
        FileVM response = api.templateFoldersUpdateTags(id, folderTagsUpdateVM);

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
    public void templatesCopyFileTest() throws IOException {
        String id = null;
        String folderId = null;
        TemplateVM response = api.templatesCopyFile(id, folderId);

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
    public void templatesDeleteFileTest() throws IOException {
        String id = null;
        api.templatesDeleteFile(id);

        // TODO: test validations
    }
    
    /**
     * Export specified report template to a specified format
     *
     * User with Execute Export permission on prepared report and  Create Entity on an export folder can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void templatesExportTest() throws IOException {
        String id = null;
        ExportTemplateVM exportTemplateVM = null;
        ExportVM response = api.templatesExport(id, exportTemplateVM);

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
    public void templatesGetFileTest() throws IOException {
        String id = null;
        TemplateVM response = api.templatesGetFile(id);

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
    public void templatesGetFileHistoryTest() throws IOException {
        String id = null;
        Integer skip = null;
        Integer take = null;
        AuditActionsVM response = api.templatesGetFileHistory(id, skip, take);

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
    public void templatesGetFilesCountTest() throws IOException {
        String id = null;
        CountVM response = api.templatesGetFilesCount(id);

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
    public void templatesGetFilesListTest() throws IOException {
        String id = null;
        Integer skip = null;
        Integer take = null;
        String searchPattern = null;
        FileSorting orderBy = null;
        Boolean desc = null;
        Boolean useRegex = null;
        TemplatesVM response = api.templatesGetFilesList(id, skip, take, searchPattern, orderBy, desc, useRegex);

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
    public void templatesGetPermissionsTest() throws IOException {
        String id = null;
        FilePermissionsVM response = api.templatesGetPermissions(id);

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
    public void templatesMoveFileTest() throws IOException {
        String id = null;
        String folderId = null;
        TemplateVM response = api.templatesMoveFile(id, folderId);

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
    public void templatesMoveFileToBinTest() throws IOException {
        String id = null;
        api.templatesMoveFileToBin(id);

        // TODO: test validations
    }
    
    /**
     * Prepare specified template to report
     *
     * User with Execute Prepare permission on report and  Create Entity on a prepared report folder can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void templatesPrepareTest() throws IOException {
        String id = null;
        PrepareTemplateVM prepareTemplateVM = null;
        ReportVM response = api.templatesPrepare(id, prepareTemplateVM);

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
    public void templatesRecoverFileTest() throws IOException {
        String id = null;
        String recoveryPath = null;
        api.templatesRecoverFile(id, recoveryPath);

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
    public void templatesRenameFileTest() throws IOException {
        String id = null;
        FileRenameVM fileRenameVM = null;
        TemplateVM response = api.templatesRenameFile(id, fileRenameVM);

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
    public void templatesStaticPreviewTest() throws IOException {
        String id = null;
        PreviewTemplateVM previewTemplateVM = null;
        ExportVM response = api.templatesStaticPreview(id, previewTemplateVM);

        // TODO: test validations
    }
    
    /**
     * Updates contnet of the template
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void templatesUpdateContentTest() throws IOException {
        String id = null;
        UpdateFileContentVM updateFileContentVM = null;
        api.templatesUpdateContent(id, updateFileContentVM);

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
    public void templatesUpdateIconTest() throws IOException {
        String id = null;
        FileIconVM fileIconVM = null;
        TemplateVM response = api.templatesUpdateIcon(id, fileIconVM);

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
    public void templatesUpdatePermissionsTest() throws IOException {
        String id = null;
        UpdateFilePermissionsVM updateFilePermissionsVM = null;
        api.templatesUpdatePermissions(id, updateFilePermissionsVM);

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
    public void templatesUpdateTagsTest() throws IOException {
        String id = null;
        FileTagsUpdateVM fileTagsUpdateVM = null;
        TemplateVM response = api.templatesUpdateTags(id, fileTagsUpdateVM);

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
    public void templatesUploadFileTest() throws IOException {
        String id = null;
        TemplateCreateVM templateCreateVM = null;
        TemplateVM response = api.templatesUploadFile(id, templateCreateVM);

        // TODO: test validations
    }
    
}
