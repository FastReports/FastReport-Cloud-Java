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
import cloud.fastreport.model.ExportTemplateVM;
import cloud.fastreport.model.ExportVM;
import java.io.File;
import cloud.fastreport.model.FileIconVM;
import cloud.fastreport.model.FilePermissionsVM;
import cloud.fastreport.model.FileRenameVM;
import cloud.fastreport.model.FileSorting;
import cloud.fastreport.model.FileTagsUpdateVM;
import cloud.fastreport.model.FileVM;
import cloud.fastreport.model.FilesVM;
import cloud.fastreport.model.FolderIconVM;
import cloud.fastreport.model.FolderRenameVM;
import cloud.fastreport.model.FolderSizeVM;
import cloud.fastreport.model.FolderTagsUpdateVM;
import cloud.fastreport.model.PrepareTemplateVM;
import cloud.fastreport.model.PreviewTemplateVM;
import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.ReportVM;
import cloud.fastreport.model.SelectedFilesVM;
import cloud.fastreport.model.TemplateCreateVM;
import cloud.fastreport.model.TemplateFolderCreateVM;
import cloud.fastreport.model.TemplateVM;
import cloud.fastreport.model.TemplatesVM;
import cloud.fastreport.model.UpdateFileContentVM;
import cloud.fastreport.model.UpdateFilePermissionsVM;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TemplatesApi
 */
@Disabled
public class TemplatesApiTest {

    private final TemplatesApi api = new TemplatesApi();

    /**
     * Delete all folders and files from recycle bin
     *
     * User with a Delete RecycleBin permission can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateFolderAndFileClearRecycleBinTest() throws ApiException {
        String subscriptionId = null;
        api.templateFolderAndFileClearRecycleBin(subscriptionId);
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
    public void templateFolderAndFileCopyFilesTest() throws ApiException {
        String subscriptionId = null;
        SelectedFilesVM selectedFilesVM = null;
        api.templateFolderAndFileCopyFiles(subscriptionId, selectedFilesVM);
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
    public void templateFolderAndFileDeleteFilesTest() throws ApiException {
        String subscriptionId = null;
        SelectedFilesVM selectedFilesVM = null;
        api.templateFolderAndFileDeleteFiles(subscriptionId, selectedFilesVM);
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
    public void templateFolderAndFileGetCountTest() throws ApiException {
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
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateFolderAndFileGetFoldersAndFilesTest() throws ApiException {
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
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateFolderAndFileGetRecycleBinFoldersAndFilesTest() throws ApiException {
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
     * Move folders and files to a specified folder
     *
     * User with a Update Place permission for a files and Create permission for a destination folder can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateFolderAndFileMoveFilesTest() throws ApiException {
        String subscriptionId = null;
        SelectedFilesVM selectedFilesVM = null;
        api.templateFolderAndFileMoveFiles(subscriptionId, selectedFilesVM);
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
    public void templateFolderAndFileMoveFilesToBinTest() throws ApiException {
        String subscriptionId = null;
        SelectedFilesVM selectedFilesVM = null;
        api.templateFolderAndFileMoveFilesToBin(subscriptionId, selectedFilesVM);
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
    public void templateFolderAndFileRecoverAllFromRecycleBinTest() throws ApiException {
        String subscriptionId = null;
        api.templateFolderAndFileRecoverAllFromRecycleBin(subscriptionId);
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
    public void templateFolderAndFileRecoverFilesTest() throws ApiException {
        String subscriptionId = null;
        SelectedFilesVM selectedFilesVM = null;
        api.templateFolderAndFileRecoverFiles(subscriptionId, selectedFilesVM);
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
    public void templateFoldersCalculateFolderSizeTest() throws ApiException {
        String id = null;
        FolderSizeVM response = api.templateFoldersCalculateFolderSize(id);
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
    public void templateFoldersCopyFolderTest() throws ApiException {
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
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateFoldersDeleteFolderTest() throws ApiException {
        String id = null;
        api.templateFoldersDeleteFolder(id);
        // TODO: test validations
    }

    /**
     * Export specified template folder to a specified format
     *
     * User with Execute Export permission on template folder and  Create Entity on an export folder can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateFoldersExportTest() throws ApiException {
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
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateFoldersGetBreadcrumbsTest() throws ApiException {
        String id = null;
        BreadcrumbsVM response = api.templateFoldersGetBreadcrumbs(id);
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
    public void templateFoldersGetFolderTest() throws ApiException {
        String id = null;
        FileVM response = api.templateFoldersGetFolder(id);
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
    public void templateFoldersGetFoldersTest() throws ApiException {
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
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateFoldersGetFoldersCountTest() throws ApiException {
        String id = null;
        CountVM response = api.templateFoldersGetFoldersCount(id);
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
    public void templateFoldersGetOrCreateTest() throws ApiException {
        String name = null;
        String subscriptionId = null;
        String parentId = null;
        FileVM response = api.templateFoldersGetOrCreate(name, subscriptionId, parentId);
        // TODO: test validations
    }

    /**
     * Get all folder permissions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateFoldersGetPermissionsTest() throws ApiException {
        String id = null;
        FilePermissionsVM response = api.templateFoldersGetPermissions(id);
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
    public void templateFoldersGetRootFolderTest() throws ApiException {
        String subscriptionId = null;
        FileVM response = api.templateFoldersGetRootFolder(subscriptionId);
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
    public void templateFoldersMoveFolderTest() throws ApiException {
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
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateFoldersMoveFolderToBinTest() throws ApiException {
        String id = null;
        api.templateFoldersMoveFolderToBin(id);
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
    public void templateFoldersPostFolderTest() throws ApiException {
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
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateFoldersPrepareTest() throws ApiException {
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
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateFoldersRecoverFolderTest() throws ApiException {
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
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateFoldersRenameFolderTest() throws ApiException {
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
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateFoldersUpdateIconTest() throws ApiException {
        String id = null;
        FolderIconVM folderIconVM = null;
        FileVM response = api.templateFoldersUpdateIcon(id, folderIconVM);
        // TODO: test validations
    }

    /**
     * Update permissions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateFoldersUpdatePermissionsTest() throws ApiException {
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
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateFoldersUpdateTagsTest() throws ApiException {
        String id = null;
        FolderTagsUpdateVM folderTagsUpdateVM = null;
        FileVM response = api.templateFoldersUpdateTags(id, folderTagsUpdateVM);
        // TODO: test validations
    }

    /**
     * Copy file to a specified folder
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesCopyFileTest() throws ApiException {
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
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesDeleteFileTest() throws ApiException {
        String id = null;
        api.templatesDeleteFile(id);
        // TODO: test validations
    }

    /**
     * Export specified report template to a specified format
     *
     * User with Execute Export permission on prepared report and  Create Entity on an export folder can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesExportTest() throws ApiException {
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
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesGetFileTest() throws ApiException {
        String id = null;
        TemplateVM response = api.templatesGetFile(id);
        // TODO: test validations
    }

    /**
     * Returns list of actions, performed on this file
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesGetFileHistoryTest() throws ApiException {
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
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesGetFilesCountTest() throws ApiException {
        String id = null;
        CountVM response = api.templatesGetFilesCount(id);
        // TODO: test validations
    }

    /**
     * Get all files from specified folder. &lt;br /&gt;  User with Get Entity permission can access this method. &lt;br /&gt;  The method will returns minimal infomration about the file: &lt;br /&gt;  id, name, size, editedTime, createdTime, tags, status, statusReason.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesGetFilesListTest() throws ApiException {
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
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesGetPermissionsTest() throws ApiException {
        String id = null;
        FilePermissionsVM response = api.templatesGetPermissions(id);
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
    public void templatesMoveFileTest() throws ApiException {
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
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesMoveFileToBinTest() throws ApiException {
        String id = null;
        api.templatesMoveFileToBin(id);
        // TODO: test validations
    }

    /**
     * Prepare specified template to report
     *
     * User with Execute Prepare permission on report and  Create Entity on a prepared report folder can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesPrepareTest() throws ApiException {
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
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesRecoverFileTest() throws ApiException {
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
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesRenameFileTest() throws ApiException {
        String id = null;
        FileRenameVM fileRenameVM = null;
        TemplateVM response = api.templatesRenameFile(id, fileRenameVM);
        // TODO: test validations
    }

    /**
     * Make preview for the report.  Generate a new or return exist prepared svg files.  If template was changed will be returned a new.  Pass the &#x60;&#x60; parameter to check prepared timestamp
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesStaticPreviewTest() throws ApiException {
        String id = null;
        PreviewTemplateVM previewTemplateVM = null;
        ExportVM response = api.templatesStaticPreview(id, previewTemplateVM);
        // TODO: test validations
    }

    /**
     * Updates contnet of the template. The method is deprecated, use the UpdateContentV2 method instead!
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesUpdateContentTest() throws ApiException {
        String id = null;
        UpdateFileContentVM updateFileContentVM = null;
        api.templatesUpdateContent(id, updateFileContentVM);
        // TODO: test validations
    }

    /**
     * Updates contnet of the template.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesUpdateContentV2Test() throws ApiException {
        String id = null;
        File fileContent = null;
        api.templatesUpdateContentV2(id, fileContent);
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
    public void templatesUpdateIconTest() throws ApiException {
        String id = null;
        FileIconVM fileIconVM = null;
        TemplateVM response = api.templatesUpdateIcon(id, fileIconVM);
        // TODO: test validations
    }

    /**
     * Update permissions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesUpdatePermissionsTest() throws ApiException {
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
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesUpdateTagsTest() throws ApiException {
        String id = null;
        FileTagsUpdateVM fileTagsUpdateVM = null;
        TemplateVM response = api.templatesUpdateTags(id, fileTagsUpdateVM);
        // TODO: test validations
    }

    /**
     * Upload a file to the specified folder. The method is deprecated, use the UploadFileV2 method instead!
     *
     * User with Create Entity permission can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesUploadFileTest() throws ApiException {
        String id = null;
        TemplateCreateVM templateCreateVM = null;
        TemplateVM response = api.templatesUploadFile(id, templateCreateVM);
        // TODO: test validations
    }

    /**
     * Alternative api for upload a file to the specified folder!
     *
     * User with Create Entity permission can access this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesUploadFileV2Test() throws ApiException {
        String id = null;
        File fileContent = null;
        List<String> tags = null;
        File icon = null;
        TemplateVM response = api.templatesUploadFileV2(id, fileContent, tags, icon);
        // TODO: test validations
    }

}
