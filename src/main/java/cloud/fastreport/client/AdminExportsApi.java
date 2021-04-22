package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import cloud.fastreport.model.ExportCreateAdminVM;
import cloud.fastreport.model.ExportFolderCreateVM;
import cloud.fastreport.model.ExportVM;
import cloud.fastreport.model.ExportsVM;
import cloud.fastreport.model.FilePermissions;
import cloud.fastreport.model.FilePermissionsVM;
import cloud.fastreport.model.FileUpdateVM;
import cloud.fastreport.model.FileVM;
import cloud.fastreport.model.FilesVM;
import cloud.fastreport.model.ProblemDetails;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.EmptyContent;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.InputStreamContent;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.json.Json;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-22T14:13:34.806+03:00[Europe/Moscow]")
public class AdminExportsApi {
    private ApiClient apiClient;

    public AdminExportsApi() {
        this(new ApiClient());
    }

    public AdminExportsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Add permission
    * <p><b>200</b> - succesfully added
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Caught exception
    * @param id folder id
    * @param permissionsVM File permissions vm
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions adminExportFoldersAddPermission(String id, FilePermissionsVM permissionsVM) throws IOException {
        HttpResponse response = adminExportFoldersAddPermissionForHttpResponse(id, permissionsVM);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Add permission
    * <p><b>200</b> - succesfully added
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Caught exception
    * @param id folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions adminExportFoldersAddPermission(FilePermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminExportFoldersAddPermissionForHttpResponse(permissionsVM, id, params);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminExportFoldersAddPermissionForHttpResponse(String id, FilePermissionsVM permissionsVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportFoldersAddPermission");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ExportFolders/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(permissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse adminExportFoldersAddPermissionForHttpResponse(String id, java.io.InputStream permissionsVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportFoldersAddPermission");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ExportFolders/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = permissionsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, permissionsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse adminExportFoldersAddPermissionForHttpResponse(FilePermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportFoldersAddPermission");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ExportFolders/{id}/permissions");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(permissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


  /**
    * Delete specified folder
    * User with Delete permission can access the method.
    * <p><b>204</b> - Folder succesfully deleted
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * <p><b>500</b> - Exception caught while deleting
    * @param id folder id
    * @param recursive delete folder&#39;s content
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void adminExportFoldersDeleteFolder(String id, Boolean recursive) throws IOException {
        adminExportFoldersDeleteFolderForHttpResponse(id, recursive);
    }

  /**
    * Delete specified folder
    * User with Delete permission can access the method.
    * <p><b>204</b> - Folder succesfully deleted
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * <p><b>500</b> - Exception caught while deleting
    * @param id folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void adminExportFoldersDeleteFolder(String id, Map<String, Object> params) throws IOException {
        adminExportFoldersDeleteFolderForHttpResponse(id, params);
    }

    public HttpResponse adminExportFoldersDeleteFolderForHttpResponse(String id, Boolean recursive) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportFoldersDeleteFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ExportFolders/{id}");
        if (recursive != null) {
            String key = "recursive";
            Object value = recursive;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

    public HttpResponse adminExportFoldersDeleteFolderForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportFoldersDeleteFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ExportFolders/{id}");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }


  /**
    * Returns a folder by id
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder with this id is not found
    * @param id Identifier of a folder
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM adminExportFoldersGetFolder(String id) throws IOException {
        HttpResponse response = adminExportFoldersGetFolderForHttpResponse(id);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns a folder by id
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder with this id is not found
    * @param id Identifier of a folder
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM adminExportFoldersGetFolder(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminExportFoldersGetFolderForHttpResponse(id, params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminExportFoldersGetFolderForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportFoldersGetFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ExportFolders/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse adminExportFoldersGetFolderForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportFoldersGetFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ExportFolders/{id}");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }


  /**
    * Returns a list of folders
    * If no folders, then the endpoint will return empty list
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * @param skip Variable for pagination, defautl value is 0
    * @param take Variable for pagination, default value is 10
    * @param subscriptionId Subscription Id
    * @return FilesVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilesVM adminExportFoldersGetFolders(Integer skip, Integer take, String subscriptionId) throws IOException {
        HttpResponse response = adminExportFoldersGetFoldersForHttpResponse(skip, take, subscriptionId);
        TypeReference<FilesVM> typeRef = new TypeReference<FilesVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns a list of folders
    * If no folders, then the endpoint will return empty list
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FilesVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilesVM adminExportFoldersGetFolders(Map<String, Object> params) throws IOException {
        HttpResponse response = adminExportFoldersGetFoldersForHttpResponse(params);
        TypeReference<FilesVM> typeRef = new TypeReference<FilesVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminExportFoldersGetFoldersForHttpResponse(Integer skip, Integer take, String subscriptionId) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ExportFolders");
        if (skip != null) {
            String key = "skip";
            Object value = skip;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (take != null) {
            String key = "take";
            Object value = take;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (subscriptionId != null) {
            String key = "subscriptionId";
            Object value = subscriptionId;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse adminExportFoldersGetFoldersForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ExportFolders");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }


  /**
    * Get all folder permissions
    * <p><b>200</b> - succesfully returned
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * @param id folder id
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions adminExportFoldersGetPermissions(String id) throws IOException {
        HttpResponse response = adminExportFoldersGetPermissionsForHttpResponse(id);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all folder permissions
    * <p><b>200</b> - succesfully returned
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * @param id folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions adminExportFoldersGetPermissions(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminExportFoldersGetPermissionsForHttpResponse(id, params);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminExportFoldersGetPermissionsForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportFoldersGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ExportFolders/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse adminExportFoldersGetPermissionsForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportFoldersGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ExportFolders/{id}/permissions");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }


  /**
    * Create a folder
    * User with a Create File permisison can access this method.
    * <p><b>200</b> - New folder has been created)
    * <p><b>400</b> - Parent folder id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - subscription not found
    * <p><b>500</b> - Exception caught while creating
    * @param subscriptionId Identifier of subscription
    * @param ownerId User owner id
    * @param folderId Folder to upload id
    * @param folderVm folder create vm
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM adminExportFoldersPostFolder(String subscriptionId, String ownerId, String folderId, ExportFolderCreateVM folderVm) throws IOException {
        HttpResponse response = adminExportFoldersPostFolderForHttpResponse(subscriptionId, ownerId, folderId, folderVm);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create a folder
    * User with a Create File permisison can access this method.
    * <p><b>200</b> - New folder has been created)
    * <p><b>400</b> - Parent folder id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - subscription not found
    * <p><b>500</b> - Exception caught while creating
    * @param subscriptionId Identifier of subscription
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM adminExportFoldersPostFolder(ExportFolderCreateVM folderVm, String subscriptionId, Map<String, Object> params) throws IOException {
        HttpResponse response = adminExportFoldersPostFolderForHttpResponse(folderVm, subscriptionId, params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminExportFoldersPostFolderForHttpResponse(String subscriptionId, String ownerId, String folderId, ExportFolderCreateVM folderVm) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling adminExportFoldersPostFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ExportFolders/{subscriptionId}");
        if (ownerId != null) {
            String key = "ownerId";
            Object value = ownerId;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (folderId != null) {
            String key = "folderId";
            Object value = folderId;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(folderVm);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse adminExportFoldersPostFolderForHttpResponse(String subscriptionId, String ownerId, String folderId, java.io.InputStream folderVm, String mediaType) throws IOException {
          // verify the required parameter 'subscriptionId' is set
              if (subscriptionId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling adminExportFoldersPostFolder");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("subscriptionId", subscriptionId);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ExportFolders/{subscriptionId}");
              if (ownerId != null) {
                  String key = "ownerId";
                  Object value = ownerId;
                  if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                  } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                  } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                  }
              }              if (folderId != null) {
                  String key = "folderId";
                  Object value = folderId;
                  if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                  } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                  } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                  }
              }

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = folderVm == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, folderVm);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse adminExportFoldersPostFolderForHttpResponse(ExportFolderCreateVM folderVm, String subscriptionId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling adminExportFoldersPostFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ExportFolders/{subscriptionId}");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(folderVm);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Revoke permission
    * <p><b>200</b> - succesfully revoked
    * <p><b>204</b> - happens sometimes
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception caught
    * @param id folder id
    * @param permissionsVM File permissions vm
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions adminExportFoldersRevokePermission(String id, FilePermissionsVM permissionsVM) throws IOException {
        HttpResponse response = adminExportFoldersRevokePermissionForHttpResponse(id, permissionsVM);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Revoke permission
    * <p><b>200</b> - succesfully revoked
    * <p><b>204</b> - happens sometimes
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception caught
    * @param id folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions adminExportFoldersRevokePermission(FilePermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminExportFoldersRevokePermissionForHttpResponse(permissionsVM, id, params);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminExportFoldersRevokePermissionForHttpResponse(String id, FilePermissionsVM permissionsVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportFoldersRevokePermission");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ExportFolders/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

      public HttpResponse adminExportFoldersRevokePermissionForHttpResponse(String id, java.io.InputStream permissionsVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportFoldersRevokePermission");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ExportFolders/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = permissionsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, permissionsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
      }

    public HttpResponse adminExportFoldersRevokePermissionForHttpResponse(FilePermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportFoldersRevokePermission");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ExportFolders/{id}/permissions");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }


  /**
    * Update a folder
    * User with Create File permission can access this method.
    * <p><b>200</b> - folder has been uploaded
    * <p><b>400</b> - folderVM view model is not valid
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param id folder id
    * @param folderVM folder&#39;s view model
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM adminExportFoldersUpdateFolder(String id, FileUpdateVM folderVM) throws IOException {
        HttpResponse response = adminExportFoldersUpdateFolderForHttpResponse(id, folderVM);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update a folder
    * User with Create File permission can access this method.
    * <p><b>200</b> - folder has been uploaded
    * <p><b>400</b> - folderVM view model is not valid
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param id folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM adminExportFoldersUpdateFolder(FileUpdateVM folderVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminExportFoldersUpdateFolderForHttpResponse(folderVM, id, params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminExportFoldersUpdateFolderForHttpResponse(String id, FileUpdateVM folderVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportFoldersUpdateFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ExportFolders/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(folderVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse adminExportFoldersUpdateFolderForHttpResponse(String id, java.io.InputStream folderVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportFoldersUpdateFolder");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ExportFolders/{id}");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = folderVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, folderVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse adminExportFoldersUpdateFolderForHttpResponse(FileUpdateVM folderVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportFoldersUpdateFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ExportFolders/{id}");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(folderVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


  /**
    * Revoke permission
    * <p><b>200</b> - succesfully revoked
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception caught
    * @param id folder id
    * @param newPermissions The newPermissions parameter
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions adminExportFoldersUpdatePermissions(String id, FilePermissions newPermissions) throws IOException {
        HttpResponse response = adminExportFoldersUpdatePermissionsForHttpResponse(id, newPermissions);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Revoke permission
    * <p><b>200</b> - succesfully revoked
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception caught
    * @param id folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions adminExportFoldersUpdatePermissions(FilePermissions newPermissions, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminExportFoldersUpdatePermissionsForHttpResponse(newPermissions, id, params);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminExportFoldersUpdatePermissionsForHttpResponse(String id, FilePermissions newPermissions) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportFoldersUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ExportFolders/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(newPermissions);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse adminExportFoldersUpdatePermissionsForHttpResponse(String id, java.io.InputStream newPermissions, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportFoldersUpdatePermissions");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ExportFolders/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = newPermissions == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, newPermissions);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse adminExportFoldersUpdatePermissionsForHttpResponse(FilePermissions newPermissions, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportFoldersUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ExportFolders/{id}/permissions");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(newPermissions);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Add file permissions
    * <p><b>200</b> - succesfully added
    * <p><b>400</b> - Id is null
    * <p><b>401</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * @param id The id parameter
    * @param permissionsVM permissions to add
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions adminExportsAddPermission(String id, FilePermissionsVM permissionsVM) throws IOException {
        HttpResponse response = adminExportsAddPermissionForHttpResponse(id, permissionsVM);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Add file permissions
    * <p><b>200</b> - succesfully added
    * <p><b>400</b> - Id is null
    * <p><b>401</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions adminExportsAddPermission(FilePermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminExportsAddPermissionForHttpResponse(permissionsVM, id, params);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminExportsAddPermissionForHttpResponse(String id, FilePermissionsVM permissionsVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportsAddPermission");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Exports/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(permissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse adminExportsAddPermissionForHttpResponse(String id, java.io.InputStream permissionsVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportsAddPermission");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Exports/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = permissionsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, permissionsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse adminExportsAddPermissionForHttpResponse(FilePermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportsAddPermission");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Exports/{id}/permissions");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(permissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


  /**
    * Delete specified file
    * User with Delete permission can access the method.
    * <p><b>204</b> - File succesfully deleted
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * @param id file id
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void adminExportsDeleteFile(String id) throws IOException {
        adminExportsDeleteFileForHttpResponse(id);
    }

  /**
    * Delete specified file
    * User with Delete permission can access the method.
    * <p><b>204</b> - File succesfully deleted
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * @param id file id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void adminExportsDeleteFile(String id, Map<String, Object> params) throws IOException {
        adminExportsDeleteFileForHttpResponse(id, params);
    }

    public HttpResponse adminExportsDeleteFileForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportsDeleteFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Exports/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

    public HttpResponse adminExportsDeleteFileForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportsDeleteFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Exports/{id}");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }


  /**
    * Returns a file by id
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File with this id is not found
    * @param id Identifier of file
    * @return ExportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportVM adminExportsGetFile(String id) throws IOException {
        HttpResponse response = adminExportsGetFileForHttpResponse(id);
        TypeReference<ExportVM> typeRef = new TypeReference<ExportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns a file by id
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File with this id is not found
    * @param id Identifier of file
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ExportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportVM adminExportsGetFile(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminExportsGetFileForHttpResponse(id, params);
        TypeReference<ExportVM> typeRef = new TypeReference<ExportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminExportsGetFileForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportsGetFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Exports/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse adminExportsGetFileForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportsGetFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Exports/{id}");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }


  /**
    * Returns a list of files
    * If no files, then the endpoint will return empty list
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Files endpoint&#39;s not found
    * @param skip Variable for pagination, defautl value is 0
    * @param take Variable for pagination, default value is 10
    * @param subscriptionId Subscription Id
    * @return ExportsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportsVM adminExportsGetFiles(Integer skip, Integer take, String subscriptionId) throws IOException {
        HttpResponse response = adminExportsGetFilesForHttpResponse(skip, take, subscriptionId);
        TypeReference<ExportsVM> typeRef = new TypeReference<ExportsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns a list of files
    * If no files, then the endpoint will return empty list
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Files endpoint&#39;s not found
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ExportsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportsVM adminExportsGetFiles(Map<String, Object> params) throws IOException {
        HttpResponse response = adminExportsGetFilesForHttpResponse(params);
        TypeReference<ExportsVM> typeRef = new TypeReference<ExportsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminExportsGetFilesForHttpResponse(Integer skip, Integer take, String subscriptionId) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Exports");
        if (skip != null) {
            String key = "skip";
            Object value = skip;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (take != null) {
            String key = "take";
            Object value = take;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (subscriptionId != null) {
            String key = "subscriptionId";
            Object value = subscriptionId;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse adminExportsGetFilesForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Exports");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }


  /**
    * Get all file permissions
    * <p><b>200</b> - succesfully returned
    * <p><b>400</b> - Id is null or not hex24
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * @param id The id parameter
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions adminExportsGetPermissions(String id) throws IOException {
        HttpResponse response = adminExportsGetPermissionsForHttpResponse(id);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all file permissions
    * <p><b>200</b> - succesfully returned
    * <p><b>400</b> - Id is null or not hex24
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions adminExportsGetPermissions(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminExportsGetPermissionsForHttpResponse(id, params);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminExportsGetPermissionsForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportsGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Exports/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse adminExportsGetPermissionsForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportsGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Exports/{id}/permissions");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }


  /**
    * Revoke (remove) file permissions
    * <p><b>200</b> - succesfully revoked
    * <p><b>204</b> - happens sometimes
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception caught
    * @param id file id
    * @param permissionsVM permissions to revoke
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions adminExportsRevokePermission(String id, FilePermissionsVM permissionsVM) throws IOException {
        HttpResponse response = adminExportsRevokePermissionForHttpResponse(id, permissionsVM);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Revoke (remove) file permissions
    * <p><b>200</b> - succesfully revoked
    * <p><b>204</b> - happens sometimes
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception caught
    * @param id file id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions adminExportsRevokePermission(FilePermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminExportsRevokePermissionForHttpResponse(permissionsVM, id, params);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminExportsRevokePermissionForHttpResponse(String id, FilePermissionsVM permissionsVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportsRevokePermission");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Exports/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

      public HttpResponse adminExportsRevokePermissionForHttpResponse(String id, java.io.InputStream permissionsVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportsRevokePermission");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Exports/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = permissionsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, permissionsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
      }

    public HttpResponse adminExportsRevokePermissionForHttpResponse(FilePermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportsRevokePermission");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Exports/{id}/permissions");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }


  /**
    * Update a file
    * User with Create Entity permission can access this method.
    * <p><b>200</b> - File has been uploaded
    * <p><b>400</b> - fileVM view model is not valid
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - original file not found
    * @param id file id
    * @param fileVM file&#39;s view model
    * @return ExportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportVM adminExportsUpdateFile(String id, FileUpdateVM fileVM) throws IOException {
        HttpResponse response = adminExportsUpdateFileForHttpResponse(id, fileVM);
        TypeReference<ExportVM> typeRef = new TypeReference<ExportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update a file
    * User with Create Entity permission can access this method.
    * <p><b>200</b> - File has been uploaded
    * <p><b>400</b> - fileVM view model is not valid
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - original file not found
    * @param id file id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ExportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportVM adminExportsUpdateFile(FileUpdateVM fileVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminExportsUpdateFileForHttpResponse(fileVM, id, params);
        TypeReference<ExportVM> typeRef = new TypeReference<ExportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminExportsUpdateFileForHttpResponse(String id, FileUpdateVM fileVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportsUpdateFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Exports/{id}/File");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(fileVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse adminExportsUpdateFileForHttpResponse(String id, java.io.InputStream fileVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportsUpdateFile");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Exports/{id}/File");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = fileVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, fileVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse adminExportsUpdateFileForHttpResponse(FileUpdateVM fileVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminExportsUpdateFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Exports/{id}/File");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(fileVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


  /**
    * Update file permissions
    * <p><b>200</b> - succesfully updated
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Caught exception while upddating
    * @param fileId The fileId parameter
    * @param newPermissions permissions model
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions adminExportsUpdatePermissions(String fileId, FilePermissions newPermissions) throws IOException {
        HttpResponse response = adminExportsUpdatePermissionsForHttpResponse(fileId, newPermissions);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update file permissions
    * <p><b>200</b> - succesfully updated
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Caught exception while upddating
    * @param fileId The fileId parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions adminExportsUpdatePermissions(FilePermissions newPermissions, String fileId, Map<String, Object> params) throws IOException {
        HttpResponse response = adminExportsUpdatePermissionsForHttpResponse(newPermissions, fileId, params);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminExportsUpdatePermissionsForHttpResponse(String fileId, FilePermissions newPermissions) throws IOException {
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'fileId' when calling adminExportsUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("fileId", fileId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Exports/{fileId}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(newPermissions);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse adminExportsUpdatePermissionsForHttpResponse(String fileId, java.io.InputStream newPermissions, String mediaType) throws IOException {
          // verify the required parameter 'fileId' is set
              if (fileId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'fileId' when calling adminExportsUpdatePermissions");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("fileId", fileId);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Exports/{fileId}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = newPermissions == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, newPermissions);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse adminExportsUpdatePermissionsForHttpResponse(FilePermissions newPermissions, String fileId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'fileId' when calling adminExportsUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("fileId", fileId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Exports/{fileId}/permissions");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(newPermissions);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Upload a file to the specified folder
    * User with Create Entity permission can access this method.
    * <p><b>200</b> - File has been uploaded
    * <p><b>400</b> - fileVM view model is not valid
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - subscription or folder is not found
    * <p><b>413</b> - Uploaded file is too big
    * <p><b>500</b> - catched exception while uploading
    * @param fileVM file&#39;s view model
    * @return ExportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportVM adminExportsUploadFile(ExportCreateAdminVM fileVM) throws IOException {
        HttpResponse response = adminExportsUploadFileForHttpResponse(fileVM);
        TypeReference<ExportVM> typeRef = new TypeReference<ExportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Upload a file to the specified folder
    * User with Create Entity permission can access this method.
    * <p><b>200</b> - File has been uploaded
    * <p><b>400</b> - fileVM view model is not valid
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - subscription or folder is not found
    * <p><b>413</b> - Uploaded file is too big
    * <p><b>500</b> - catched exception while uploading
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ExportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportVM adminExportsUploadFile(ExportCreateAdminVM fileVM, Map<String, Object> params) throws IOException {
        HttpResponse response = adminExportsUploadFileForHttpResponse(fileVM, params);
        TypeReference<ExportVM> typeRef = new TypeReference<ExportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminExportsUploadFileForHttpResponse(ExportCreateAdminVM fileVM) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Exports");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(fileVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse adminExportsUploadFileForHttpResponse(java.io.InputStream fileVM, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Exports");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = fileVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, fileVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse adminExportsUploadFileForHttpResponse(ExportCreateAdminVM fileVM, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Exports");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(fileVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


}
