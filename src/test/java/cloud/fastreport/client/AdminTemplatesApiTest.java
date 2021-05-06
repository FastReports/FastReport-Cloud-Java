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

import cloud.fastreport.model.AdminTemplateFolderCreateVM;
import cloud.fastreport.model.FilePermissionsVM;
import cloud.fastreport.model.FileUpdateVM;
import cloud.fastreport.model.FileVM;
import cloud.fastreport.model.FilesVM;
import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.TemplateCreateAdminVM;
import cloud.fastreport.model.TemplateVM;
import cloud.fastreport.model.TemplatesVM;
import cloud.fastreport.model.UpdateFilePermissionsVM;
import org.junit.Test;
import org.junit.Ignore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdminTemplatesApi
 */
@Ignore
public class AdminTemplatesApiTest {

    private final AdminTemplatesApi api = new AdminTemplatesApi();

    
    /**
     * Delete specified folder
     *
     * User with Delete permission can access the method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void adminTemplateFoldersDeleteFolderTest() throws IOException {
        String id = null;
        Boolean recursive = null;
        api.adminTemplateFoldersDeleteFolder(id, recursive);

        // TODO: test validations
    }
    
    /**
     * Returns a folder by id
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void adminTemplateFoldersGetFolderTest() throws IOException {
        String id = null;
        FileVM response = api.adminTemplateFoldersGetFolder(id);

        // TODO: test validations
    }
    
    /**
     * Returns a list of folders
     *
     * If no folders, then the endpoint will return empty list
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void adminTemplateFoldersGetFoldersTest() throws IOException {
        Integer skip = null;
        Integer take = null;
        String subscriptionId = null;
        FilesVM response = api.adminTemplateFoldersGetFolders(skip, take, subscriptionId);

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
    public void adminTemplateFoldersGetPermissionsTest() throws IOException {
        String id = null;
        FilePermissionsVM response = api.adminTemplateFoldersGetPermissions(id);

        // TODO: test validations
    }
    
    /**
     * Create a folder
     *
     * User with a Create File permisison can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void adminTemplateFoldersPostFolderTest() throws IOException {
        AdminTemplateFolderCreateVM folderVm = null;
        FileVM response = api.adminTemplateFoldersPostFolder(folderVm);

        // TODO: test validations
    }
    
    /**
     * Update a folder
     *
     * User with Create File permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void adminTemplateFoldersUpdateFolderTest() throws IOException {
        String id = null;
        FileUpdateVM folderVM = null;
        FileVM response = api.adminTemplateFoldersUpdateFolder(id, folderVM);

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
    public void adminTemplateFoldersUpdatePermissionsTest() throws IOException {
        String id = null;
        UpdateFilePermissionsVM newPermissions = null;
        api.adminTemplateFoldersUpdatePermissions(id, newPermissions);

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
    public void adminTemplatesDeleteFileTest() throws IOException {
        String id = null;
        api.adminTemplatesDeleteFile(id);

        // TODO: test validations
    }
    
    /**
     * Returns a file by id
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void adminTemplatesGetFileTest() throws IOException {
        String id = null;
        TemplateVM response = api.adminTemplatesGetFile(id);

        // TODO: test validations
    }
    
    /**
     * Returns a list of files
     *
     * If no files, then the endpoint will return empty list
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void adminTemplatesGetFilesTest() throws IOException {
        Integer skip = null;
        Integer take = null;
        String subscriptionId = null;
        TemplatesVM response = api.adminTemplatesGetFiles(skip, take, subscriptionId);

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
    public void adminTemplatesGetPermissionsTest() throws IOException {
        String id = null;
        FilePermissionsVM response = api.adminTemplatesGetPermissions(id);

        // TODO: test validations
    }
    
    /**
     * Update a file
     *
     * User with Create Entity permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void adminTemplatesUpdateFileTest() throws IOException {
        String id = null;
        FileUpdateVM fileVM = null;
        TemplateVM response = api.adminTemplatesUpdateFile(id, fileVM);

        // TODO: test validations
    }
    
    /**
     * Update permissions to file
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void adminTemplatesUpdatePermissionsTest() throws IOException {
        String id = null;
        UpdateFilePermissionsVM newPermissions = null;
        api.adminTemplatesUpdatePermissions(id, newPermissions);

        // TODO: test validations
    }
    
    /**
     * Upload a file to the specified folder
     *
     * User with Create Entity permission can access this method.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void adminTemplatesUploadFileTest() throws IOException {
        TemplateCreateAdminVM fileVM = null;
        TemplateVM response = api.adminTemplatesUploadFile(fileVM);

        // TODO: test validations
    }
    
}