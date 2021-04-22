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
import cloud.fastreport.model.ExportTemplateTaskVM;
import cloud.fastreport.model.ExportVM;
import cloud.fastreport.model.FileIconVM;
import cloud.fastreport.model.FilePermissions;
import cloud.fastreport.model.FilePermissionsVM;
import cloud.fastreport.model.FileRenameVM;
import cloud.fastreport.model.FileTagsUpdateVM;
import cloud.fastreport.model.FileVM;
import cloud.fastreport.model.FilesVM;
import cloud.fastreport.model.FolderIconVM;
import cloud.fastreport.model.FolderRenameVM;
import cloud.fastreport.model.FolderTagsUpdateVM;
import cloud.fastreport.model.PrepareTemplateTaskVM;
import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.ReportVM;
import cloud.fastreport.model.TemplateCreateVM;
import cloud.fastreport.model.TemplateFolderCreateVM;
import cloud.fastreport.model.TemplateVM;
import cloud.fastreport.model.TemplatesVM;
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
        CountVM response = api.templateFolderAndFileGetCount(id);

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
        FilesVM response = api.templateFolderAndFileGetFoldersAndFiles(id, skip, take);

        // TODO: test validations
    }
    
    /**
     * Add folder permission
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void templateFoldersAddPermissionTest() throws IOException {
        String id = null;
        FilePermissionsVM permissionsVM = null;
        FilePermissions response = api.templateFoldersAddPermission(id, permissionsVM);

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
        Boolean recursive = null;
        api.templateFoldersDeleteFolder(id, recursive);

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
        FilesVM response = api.templateFoldersGetFolders(id, skip, take);

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
        FilePermissions response = api.templateFoldersGetPermissions(id);

        // TODO: test validations
    }
    
    /**
     * Get user&#39;s root folder (without parents)
     *
     * &amp;gt; Breakchange. Now user model doesn&#39;t contain a root folders.  This method can return error 400 and 404 when subscription is not found.
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
        TemplateFolderCreateVM folderVm = null;
        FileVM response = api.templateFoldersPostFolder(id, folderVm);

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
        FolderRenameVM nameModel = null;
        FileVM response = api.templateFoldersRenameFolder(id, nameModel);

        // TODO: test validations
    }
    
    /**
     * Revoke folder permission
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void templateFoldersRevokePermissionTest() throws IOException {
        String id = null;
        FilePermissionsVM permissionsVM = null;
        FilePermissions response = api.templateFoldersRevokePermission(id, permissionsVM);

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
        FolderIconVM iconModel = null;
        FileVM response = api.templateFoldersUpdateIcon(id, iconModel);

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
        FolderTagsUpdateVM tagsModel = null;
        FileVM response = api.templateFoldersUpdateTags(id, tagsModel);

        // TODO: test validations
    }
    
    /**
     * Add permission
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void templatesAddPermissionTest() throws IOException {
        String id = null;
        FilePermissionsVM permissionsVM = null;
        FilePermissions response = api.templatesAddPermission(id, permissionsVM);

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
        ExportTemplateTaskVM exportTask = null;
        ExportVM response = api.templatesExport(id, exportTask);

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
     * Get all files from specified folder
     *
     * User with Get Entity permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void templatesGetFilesListTest() throws IOException {
        String id = null;
        Integer skip = null;
        Integer take = null;
        TemplatesVM response = api.templatesGetFilesList(id, skip, take);

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
        FilePermissions response = api.templatesGetPermissions(id);

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
     * Prepare specified template to report
     *
     * User with Execute Prepare permission on report and   Create Entity on a prepared report folder can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void templatesPrepareTest() throws IOException {
        String id = null;
        PrepareTemplateTaskVM prepareTask = null;
        ReportVM response = api.templatesPrepare(id, prepareTask);

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
        FileRenameVM nameModel = null;
        TemplateVM response = api.templatesRenameFile(id, nameModel);

        // TODO: test validations
    }
    
    /**
     * Revoke permission
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void templatesRevokePermissionTest() throws IOException {
        String id = null;
        FilePermissionsVM permissionsVM = null;
        FilePermissions response = api.templatesRevokePermission(id, permissionsVM);

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
        FileIconVM iconModel = null;
        TemplateVM response = api.templatesUpdateIcon(id, iconModel);

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
        FileTagsUpdateVM tagsModel = null;
        TemplateVM response = api.templatesUpdateTags(id, tagsModel);

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
        TemplateCreateVM fileVM = null;
        TemplateVM response = api.templatesUploadFile(id, fileVM);

        // TODO: test validations
    }
    
}
