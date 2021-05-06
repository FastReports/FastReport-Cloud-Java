package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdminTemplatesApi {
    private ApiClient apiClient;

    public AdminTemplatesApi() {
        this(new ApiClient());
    }

    public AdminTemplatesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
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
    public void adminTemplateFoldersDeleteFolder(String id, Boolean recursive) throws IOException {
        adminTemplateFoldersDeleteFolderForHttpResponse(id, recursive);
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
    public void adminTemplateFoldersDeleteFolder(String id, Map<String, Object> params) throws IOException {
        adminTemplateFoldersDeleteFolderForHttpResponse(id, params);
    }

    public HttpResponse adminTemplateFoldersDeleteFolderForHttpResponse(String id, Boolean recursive) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminTemplateFoldersDeleteFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/TemplateFolders/{id}");
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

    public HttpResponse adminTemplateFoldersDeleteFolderForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminTemplateFoldersDeleteFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/TemplateFolders/{id}");

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
    public FileVM adminTemplateFoldersGetFolder(String id) throws IOException {
        HttpResponse response = adminTemplateFoldersGetFolderForHttpResponse(id);
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
    public FileVM adminTemplateFoldersGetFolder(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminTemplateFoldersGetFolderForHttpResponse(id, params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminTemplateFoldersGetFolderForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminTemplateFoldersGetFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/TemplateFolders/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse adminTemplateFoldersGetFolderForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminTemplateFoldersGetFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/TemplateFolders/{id}");

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
    * @param subscriptionId Allows to filter by subscriptions ID
    * @return FilesVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilesVM adminTemplateFoldersGetFolders(Integer skip, Integer take, String subscriptionId) throws IOException {
        HttpResponse response = adminTemplateFoldersGetFoldersForHttpResponse(skip, take, subscriptionId);
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
    public FilesVM adminTemplateFoldersGetFolders(Map<String, Object> params) throws IOException {
        HttpResponse response = adminTemplateFoldersGetFoldersForHttpResponse(params);
        TypeReference<FilesVM> typeRef = new TypeReference<FilesVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminTemplateFoldersGetFoldersForHttpResponse(Integer skip, Integer take, String subscriptionId) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/TemplateFolders");
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

    public HttpResponse adminTemplateFoldersGetFoldersForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/TemplateFolders");

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
    * @return FilePermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissionsVM adminTemplateFoldersGetPermissions(String id) throws IOException {
        HttpResponse response = adminTemplateFoldersGetPermissionsForHttpResponse(id);
        TypeReference<FilePermissionsVM> typeRef = new TypeReference<FilePermissionsVM>() {};
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
    * @return FilePermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissionsVM adminTemplateFoldersGetPermissions(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminTemplateFoldersGetPermissionsForHttpResponse(id, params);
        TypeReference<FilePermissionsVM> typeRef = new TypeReference<FilePermissionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminTemplateFoldersGetPermissionsForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminTemplateFoldersGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/TemplateFolders/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse adminTemplateFoldersGetPermissionsForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminTemplateFoldersGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/TemplateFolders/{id}/permissions");

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
    * @param folderVm folder create vm
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM adminTemplateFoldersPostFolder(AdminTemplateFolderCreateVM folderVm) throws IOException {
        HttpResponse response = adminTemplateFoldersPostFolderForHttpResponse(folderVm);
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
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM adminTemplateFoldersPostFolder(AdminTemplateFolderCreateVM folderVm, Map<String, Object> params) throws IOException {
        HttpResponse response = adminTemplateFoldersPostFolderForHttpResponse(folderVm, params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminTemplateFoldersPostFolderForHttpResponse(AdminTemplateFolderCreateVM folderVm) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/TemplateFolders");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(folderVm);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse adminTemplateFoldersPostFolderForHttpResponse(java.io.InputStream folderVm, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/TemplateFolders");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = folderVm == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, folderVm);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse adminTemplateFoldersPostFolderForHttpResponse(AdminTemplateFolderCreateVM folderVm, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/TemplateFolders");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(folderVm);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
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
    public FileVM adminTemplateFoldersUpdateFolder(String id, FileUpdateVM folderVM) throws IOException {
        HttpResponse response = adminTemplateFoldersUpdateFolderForHttpResponse(id, folderVM);
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
    public FileVM adminTemplateFoldersUpdateFolder(FileUpdateVM folderVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminTemplateFoldersUpdateFolderForHttpResponse(folderVM, id, params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminTemplateFoldersUpdateFolderForHttpResponse(String id, FileUpdateVM folderVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminTemplateFoldersUpdateFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/TemplateFolders/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(folderVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse adminTemplateFoldersUpdateFolderForHttpResponse(String id, java.io.InputStream folderVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminTemplateFoldersUpdateFolder");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/TemplateFolders/{id}");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = folderVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, folderVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse adminTemplateFoldersUpdateFolderForHttpResponse(FileUpdateVM folderVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminTemplateFoldersUpdateFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/TemplateFolders/{id}");

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
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void adminTemplateFoldersUpdatePermissions(String id, UpdateFilePermissionsVM newPermissions) throws IOException {
        adminTemplateFoldersUpdatePermissionsForHttpResponse(id, newPermissions);
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
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void adminTemplateFoldersUpdatePermissions(UpdateFilePermissionsVM newPermissions, String id, Map<String, Object> params) throws IOException {
        adminTemplateFoldersUpdatePermissionsForHttpResponse(newPermissions, id, params);
    }

    public HttpResponse adminTemplateFoldersUpdatePermissionsForHttpResponse(String id, UpdateFilePermissionsVM newPermissions) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminTemplateFoldersUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/TemplateFolders/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(newPermissions);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse adminTemplateFoldersUpdatePermissionsForHttpResponse(String id, java.io.InputStream newPermissions, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminTemplateFoldersUpdatePermissions");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/TemplateFolders/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = newPermissions == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, newPermissions);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse adminTemplateFoldersUpdatePermissionsForHttpResponse(UpdateFilePermissionsVM newPermissions, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminTemplateFoldersUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/TemplateFolders/{id}/permissions");

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
    * Delete specified file
    * User with Delete permission can access the method.
    * <p><b>204</b> - File succesfully deleted
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * @param id file id
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void adminTemplatesDeleteFile(String id) throws IOException {
        adminTemplatesDeleteFileForHttpResponse(id);
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
    public void adminTemplatesDeleteFile(String id, Map<String, Object> params) throws IOException {
        adminTemplatesDeleteFileForHttpResponse(id, params);
    }

    public HttpResponse adminTemplatesDeleteFileForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminTemplatesDeleteFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Templates/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

    public HttpResponse adminTemplatesDeleteFileForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminTemplatesDeleteFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Templates/{id}");

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
    * @return TemplateVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TemplateVM adminTemplatesGetFile(String id) throws IOException {
        HttpResponse response = adminTemplatesGetFileForHttpResponse(id);
        TypeReference<TemplateVM> typeRef = new TypeReference<TemplateVM>() {};
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
    * @return TemplateVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TemplateVM adminTemplatesGetFile(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminTemplatesGetFileForHttpResponse(id, params);
        TypeReference<TemplateVM> typeRef = new TypeReference<TemplateVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminTemplatesGetFileForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminTemplatesGetFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Templates/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse adminTemplatesGetFileForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminTemplatesGetFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Templates/{id}");

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
    * @return TemplatesVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TemplatesVM adminTemplatesGetFiles(Integer skip, Integer take, String subscriptionId) throws IOException {
        HttpResponse response = adminTemplatesGetFilesForHttpResponse(skip, take, subscriptionId);
        TypeReference<TemplatesVM> typeRef = new TypeReference<TemplatesVM>() {};
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
    * @return TemplatesVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TemplatesVM adminTemplatesGetFiles(Map<String, Object> params) throws IOException {
        HttpResponse response = adminTemplatesGetFilesForHttpResponse(params);
        TypeReference<TemplatesVM> typeRef = new TypeReference<TemplatesVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminTemplatesGetFilesForHttpResponse(Integer skip, Integer take, String subscriptionId) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Templates");
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

    public HttpResponse adminTemplatesGetFilesForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Templates");

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
    * @return FilePermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissionsVM adminTemplatesGetPermissions(String id) throws IOException {
        HttpResponse response = adminTemplatesGetPermissionsForHttpResponse(id);
        TypeReference<FilePermissionsVM> typeRef = new TypeReference<FilePermissionsVM>() {};
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
    * @return FilePermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissionsVM adminTemplatesGetPermissions(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminTemplatesGetPermissionsForHttpResponse(id, params);
        TypeReference<FilePermissionsVM> typeRef = new TypeReference<FilePermissionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminTemplatesGetPermissionsForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminTemplatesGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Templates/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse adminTemplatesGetPermissionsForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminTemplatesGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Templates/{id}/permissions");

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
    * Update a file
    * User with Create Entity permission can access this method.
    * <p><b>200</b> - File has been uploaded
    * <p><b>400</b> - fileVM view model is not valid
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - original file not found
    * @param id file id
    * @param fileVM file&#39;s view model
    * @return TemplateVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TemplateVM adminTemplatesUpdateFile(String id, FileUpdateVM fileVM) throws IOException {
        HttpResponse response = adminTemplatesUpdateFileForHttpResponse(id, fileVM);
        TypeReference<TemplateVM> typeRef = new TypeReference<TemplateVM>() {};
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
    * @return TemplateVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TemplateVM adminTemplatesUpdateFile(FileUpdateVM fileVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminTemplatesUpdateFileForHttpResponse(fileVM, id, params);
        TypeReference<TemplateVM> typeRef = new TypeReference<TemplateVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminTemplatesUpdateFileForHttpResponse(String id, FileUpdateVM fileVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminTemplatesUpdateFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Templates/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(fileVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse adminTemplatesUpdateFileForHttpResponse(String id, java.io.InputStream fileVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminTemplatesUpdateFile");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Templates/{id}");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = fileVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, fileVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse adminTemplatesUpdateFileForHttpResponse(FileUpdateVM fileVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminTemplatesUpdateFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Templates/{id}");

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
    * Update permissions to file
    * <p><b>200</b> - Succesfully updated
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Datasource is not found
    * @param id The id parameter
    * @param newPermissions The newPermissions parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void adminTemplatesUpdatePermissions(String id, UpdateFilePermissionsVM newPermissions) throws IOException {
        adminTemplatesUpdatePermissionsForHttpResponse(id, newPermissions);
    }

  /**
    * Update permissions to file
    * <p><b>200</b> - Succesfully updated
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Datasource is not found
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void adminTemplatesUpdatePermissions(UpdateFilePermissionsVM newPermissions, String id, Map<String, Object> params) throws IOException {
        adminTemplatesUpdatePermissionsForHttpResponse(newPermissions, id, params);
    }

    public HttpResponse adminTemplatesUpdatePermissionsForHttpResponse(String id, UpdateFilePermissionsVM newPermissions) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminTemplatesUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Templates/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(newPermissions);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse adminTemplatesUpdatePermissionsForHttpResponse(String id, java.io.InputStream newPermissions, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminTemplatesUpdatePermissions");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Templates/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = newPermissions == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, newPermissions);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse adminTemplatesUpdatePermissionsForHttpResponse(UpdateFilePermissionsVM newPermissions, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminTemplatesUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Templates/{id}/permissions");

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
    * @return TemplateVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TemplateVM adminTemplatesUploadFile(TemplateCreateAdminVM fileVM) throws IOException {
        HttpResponse response = adminTemplatesUploadFileForHttpResponse(fileVM);
        TypeReference<TemplateVM> typeRef = new TypeReference<TemplateVM>() {};
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
    * @return TemplateVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TemplateVM adminTemplatesUploadFile(TemplateCreateAdminVM fileVM, Map<String, Object> params) throws IOException {
        HttpResponse response = adminTemplatesUploadFileForHttpResponse(fileVM, params);
        TypeReference<TemplateVM> typeRef = new TypeReference<TemplateVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminTemplatesUploadFileForHttpResponse(TemplateCreateAdminVM fileVM) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Templates");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(fileVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse adminTemplatesUploadFileForHttpResponse(java.io.InputStream fileVM, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Templates");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = fileVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, fileVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse adminTemplatesUploadFileForHttpResponse(TemplateCreateAdminVM fileVM, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Templates");

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
