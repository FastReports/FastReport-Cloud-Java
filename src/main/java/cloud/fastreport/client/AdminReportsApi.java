package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import cloud.fastreport.model.AdminReportFolderCreateVM;
import cloud.fastreport.model.FilePermissionsVM;
import cloud.fastreport.model.FileUpdateVM;
import cloud.fastreport.model.FileVM;
import cloud.fastreport.model.FilesVM;
import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.ReportCreateAdminVM;
import cloud.fastreport.model.ReportVM;
import cloud.fastreport.model.ReportsVM;
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
public class AdminReportsApi {
    private ApiClient apiClient;

    public AdminReportsApi() {
        this(new ApiClient());
    }

    public AdminReportsApi(ApiClient apiClient) {
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
    public void adminReportFoldersDeleteFolder(String id, Boolean recursive) throws IOException {
        adminReportFoldersDeleteFolderForHttpResponse(id, recursive);
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
    public void adminReportFoldersDeleteFolder(String id, Map<String, Object> params) throws IOException {
        adminReportFoldersDeleteFolderForHttpResponse(id, params);
    }

    public HttpResponse adminReportFoldersDeleteFolderForHttpResponse(String id, Boolean recursive) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminReportFoldersDeleteFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ReportFolders/{id}");
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

    public HttpResponse adminReportFoldersDeleteFolderForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminReportFoldersDeleteFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ReportFolders/{id}");

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
    public FileVM adminReportFoldersGetFolder(String id) throws IOException {
        HttpResponse response = adminReportFoldersGetFolderForHttpResponse(id);
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
    public FileVM adminReportFoldersGetFolder(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminReportFoldersGetFolderForHttpResponse(id, params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminReportFoldersGetFolderForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminReportFoldersGetFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ReportFolders/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse adminReportFoldersGetFolderForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminReportFoldersGetFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ReportFolders/{id}");

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
    public FilesVM adminReportFoldersGetFolders(Integer skip, Integer take, String subscriptionId) throws IOException {
        HttpResponse response = adminReportFoldersGetFoldersForHttpResponse(skip, take, subscriptionId);
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
    public FilesVM adminReportFoldersGetFolders(Map<String, Object> params) throws IOException {
        HttpResponse response = adminReportFoldersGetFoldersForHttpResponse(params);
        TypeReference<FilesVM> typeRef = new TypeReference<FilesVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminReportFoldersGetFoldersForHttpResponse(Integer skip, Integer take, String subscriptionId) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ReportFolders");
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

    public HttpResponse adminReportFoldersGetFoldersForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ReportFolders");

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
    public FilePermissionsVM adminReportFoldersGetPermissions(String id) throws IOException {
        HttpResponse response = adminReportFoldersGetPermissionsForHttpResponse(id);
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
    public FilePermissionsVM adminReportFoldersGetPermissions(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminReportFoldersGetPermissionsForHttpResponse(id, params);
        TypeReference<FilePermissionsVM> typeRef = new TypeReference<FilePermissionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminReportFoldersGetPermissionsForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminReportFoldersGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ReportFolders/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse adminReportFoldersGetPermissionsForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminReportFoldersGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ReportFolders/{id}/permissions");

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
    public FileVM adminReportFoldersPostFolder(AdminReportFolderCreateVM folderVm) throws IOException {
        HttpResponse response = adminReportFoldersPostFolderForHttpResponse(folderVm);
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
    public FileVM adminReportFoldersPostFolder(AdminReportFolderCreateVM folderVm, Map<String, Object> params) throws IOException {
        HttpResponse response = adminReportFoldersPostFolderForHttpResponse(folderVm, params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminReportFoldersPostFolderForHttpResponse(AdminReportFolderCreateVM folderVm) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ReportFolders");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(folderVm);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse adminReportFoldersPostFolderForHttpResponse(java.io.InputStream folderVm, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ReportFolders");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = folderVm == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, folderVm);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse adminReportFoldersPostFolderForHttpResponse(AdminReportFolderCreateVM folderVm, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ReportFolders");

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
    public FileVM adminReportFoldersUpdateFolder(String id, FileUpdateVM folderVM) throws IOException {
        HttpResponse response = adminReportFoldersUpdateFolderForHttpResponse(id, folderVM);
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
    public FileVM adminReportFoldersUpdateFolder(FileUpdateVM folderVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminReportFoldersUpdateFolderForHttpResponse(folderVM, id, params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminReportFoldersUpdateFolderForHttpResponse(String id, FileUpdateVM folderVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminReportFoldersUpdateFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ReportFolders/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(folderVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse adminReportFoldersUpdateFolderForHttpResponse(String id, java.io.InputStream folderVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminReportFoldersUpdateFolder");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ReportFolders/{id}");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = folderVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, folderVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse adminReportFoldersUpdateFolderForHttpResponse(FileUpdateVM folderVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminReportFoldersUpdateFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ReportFolders/{id}");

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
    public void adminReportFoldersUpdatePermissions(String id, UpdateFilePermissionsVM newPermissions) throws IOException {
        adminReportFoldersUpdatePermissionsForHttpResponse(id, newPermissions);
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
    public void adminReportFoldersUpdatePermissions(UpdateFilePermissionsVM newPermissions, String id, Map<String, Object> params) throws IOException {
        adminReportFoldersUpdatePermissionsForHttpResponse(newPermissions, id, params);
    }

    public HttpResponse adminReportFoldersUpdatePermissionsForHttpResponse(String id, UpdateFilePermissionsVM newPermissions) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminReportFoldersUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ReportFolders/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(newPermissions);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse adminReportFoldersUpdatePermissionsForHttpResponse(String id, java.io.InputStream newPermissions, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminReportFoldersUpdatePermissions");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ReportFolders/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = newPermissions == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, newPermissions);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse adminReportFoldersUpdatePermissionsForHttpResponse(UpdateFilePermissionsVM newPermissions, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminReportFoldersUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ReportFolders/{id}/permissions");

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
    public void adminReportsDeleteFile(String id) throws IOException {
        adminReportsDeleteFileForHttpResponse(id);
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
    public void adminReportsDeleteFile(String id, Map<String, Object> params) throws IOException {
        adminReportsDeleteFileForHttpResponse(id, params);
    }

    public HttpResponse adminReportsDeleteFileForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminReportsDeleteFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Reports/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

    public HttpResponse adminReportsDeleteFileForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminReportsDeleteFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Reports/{id}");

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
    * @return ReportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReportVM adminReportsGetFile(String id) throws IOException {
        HttpResponse response = adminReportsGetFileForHttpResponse(id);
        TypeReference<ReportVM> typeRef = new TypeReference<ReportVM>() {};
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
    * @return ReportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReportVM adminReportsGetFile(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminReportsGetFileForHttpResponse(id, params);
        TypeReference<ReportVM> typeRef = new TypeReference<ReportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminReportsGetFileForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminReportsGetFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Reports/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse adminReportsGetFileForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminReportsGetFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Reports/{id}");

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
    * @return ReportsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReportsVM adminReportsGetFiles(Integer skip, Integer take, String subscriptionId) throws IOException {
        HttpResponse response = adminReportsGetFilesForHttpResponse(skip, take, subscriptionId);
        TypeReference<ReportsVM> typeRef = new TypeReference<ReportsVM>() {};
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
    * @return ReportsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReportsVM adminReportsGetFiles(Map<String, Object> params) throws IOException {
        HttpResponse response = adminReportsGetFilesForHttpResponse(params);
        TypeReference<ReportsVM> typeRef = new TypeReference<ReportsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminReportsGetFilesForHttpResponse(Integer skip, Integer take, String subscriptionId) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Reports");
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

    public HttpResponse adminReportsGetFilesForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Reports");

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
    public FilePermissionsVM adminReportsGetPermissions(String id) throws IOException {
        HttpResponse response = adminReportsGetPermissionsForHttpResponse(id);
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
    public FilePermissionsVM adminReportsGetPermissions(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminReportsGetPermissionsForHttpResponse(id, params);
        TypeReference<FilePermissionsVM> typeRef = new TypeReference<FilePermissionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminReportsGetPermissionsForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminReportsGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Reports/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse adminReportsGetPermissionsForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminReportsGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Reports/{id}/permissions");

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
    * @return ReportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReportVM adminReportsUpdateFile(String id, FileUpdateVM fileVM) throws IOException {
        HttpResponse response = adminReportsUpdateFileForHttpResponse(id, fileVM);
        TypeReference<ReportVM> typeRef = new TypeReference<ReportVM>() {};
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
    * @return ReportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReportVM adminReportsUpdateFile(FileUpdateVM fileVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminReportsUpdateFileForHttpResponse(fileVM, id, params);
        TypeReference<ReportVM> typeRef = new TypeReference<ReportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminReportsUpdateFileForHttpResponse(String id, FileUpdateVM fileVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminReportsUpdateFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Reports/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(fileVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse adminReportsUpdateFileForHttpResponse(String id, java.io.InputStream fileVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminReportsUpdateFile");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Reports/{id}");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = fileVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, fileVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse adminReportsUpdateFileForHttpResponse(FileUpdateVM fileVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminReportsUpdateFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Reports/{id}");

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
    public void adminReportsUpdatePermissions(String id, UpdateFilePermissionsVM newPermissions) throws IOException {
        adminReportsUpdatePermissionsForHttpResponse(id, newPermissions);
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
    public void adminReportsUpdatePermissions(UpdateFilePermissionsVM newPermissions, String id, Map<String, Object> params) throws IOException {
        adminReportsUpdatePermissionsForHttpResponse(newPermissions, id, params);
    }

    public HttpResponse adminReportsUpdatePermissionsForHttpResponse(String id, UpdateFilePermissionsVM newPermissions) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminReportsUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Reports/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(newPermissions);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse adminReportsUpdatePermissionsForHttpResponse(String id, java.io.InputStream newPermissions, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminReportsUpdatePermissions");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Reports/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = newPermissions == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, newPermissions);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse adminReportsUpdatePermissionsForHttpResponse(UpdateFilePermissionsVM newPermissions, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminReportsUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Reports/{id}/permissions");

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
    * @return ReportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReportVM adminReportsUploadFile(ReportCreateAdminVM fileVM) throws IOException {
        HttpResponse response = adminReportsUploadFileForHttpResponse(fileVM);
        TypeReference<ReportVM> typeRef = new TypeReference<ReportVM>() {};
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
    * @return ReportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReportVM adminReportsUploadFile(ReportCreateAdminVM fileVM, Map<String, Object> params) throws IOException {
        HttpResponse response = adminReportsUploadFileForHttpResponse(fileVM, params);
        TypeReference<ReportVM> typeRef = new TypeReference<ReportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminReportsUploadFileForHttpResponse(ReportCreateAdminVM fileVM) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Reports");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(fileVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse adminReportsUploadFileForHttpResponse(java.io.InputStream fileVM, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Reports");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = fileVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, fileVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse adminReportsUploadFileForHttpResponse(ReportCreateAdminVM fileVM, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Reports");

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
