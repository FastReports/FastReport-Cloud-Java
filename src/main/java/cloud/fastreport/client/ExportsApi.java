package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import cloud.fastreport.model.BreadcrumbsVM;
import cloud.fastreport.model.CountVM;
import cloud.fastreport.model.ExportFolderCreateVM;
import cloud.fastreport.model.ExportVM;
import cloud.fastreport.model.ExportsVM;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExportsApi {
    private ApiClient apiClient;

    public ExportsApi() {
        this(new ApiClient());
    }

    public ExportsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Get count of files and folders what contains in a specified folder
    * User with a Get Count permission can access this method.
    * <p><b>200</b> - Returns count of the files in a specified folder
    * <p><b>400</b> - FolderId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param id folder id
    * @return CountVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CountVM exportFolderAndFileGetCount(String id) throws IOException {
        HttpResponse response = exportFolderAndFileGetCountForHttpResponse(id);
        TypeReference<CountVM> typeRef = new TypeReference<CountVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get count of files and folders what contains in a specified folder
    * User with a Get Count permission can access this method.
    * <p><b>200</b> - Returns count of the files in a specified folder
    * <p><b>400</b> - FolderId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param id folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return CountVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CountVM exportFolderAndFileGetCount(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportFolderAndFileGetCountForHttpResponse(id, params);
        TypeReference<CountVM> typeRef = new TypeReference<CountVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportFolderAndFileGetCountForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFolderAndFileGetCount");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/CountFolderAndFiles");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse exportFolderAndFileGetCountForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFolderAndFileGetCount");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/CountFolderAndFiles");

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
    * Get all folders and files from specified folder
    * User with a Get Entity permission can access this method.
    * <p><b>200</b> - Returns list of the files from a specified folder
    * <p><b>400</b> - FolderId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File or folder not found
    * @param id folder id
    * @param skip number of folder and files, that have to be skipped
    * @param take number of folder and files, that have to be returned
    * @return FilesVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilesVM exportFolderAndFileGetFoldersAndFiles(String id, Integer skip, Integer take) throws IOException {
        HttpResponse response = exportFolderAndFileGetFoldersAndFilesForHttpResponse(id, skip, take);
        TypeReference<FilesVM> typeRef = new TypeReference<FilesVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all folders and files from specified folder
    * User with a Get Entity permission can access this method.
    * <p><b>200</b> - Returns list of the files from a specified folder
    * <p><b>400</b> - FolderId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File or folder not found
    * @param id folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FilesVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilesVM exportFolderAndFileGetFoldersAndFiles(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportFolderAndFileGetFoldersAndFilesForHttpResponse(id, params);
        TypeReference<FilesVM> typeRef = new TypeReference<FilesVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportFolderAndFileGetFoldersAndFilesForHttpResponse(String id, Integer skip, Integer take) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFolderAndFileGetFoldersAndFiles");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/ListFolderAndFiles");
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
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse exportFolderAndFileGetFoldersAndFilesForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFolderAndFileGetFoldersAndFiles");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/ListFolderAndFiles");

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
    * Add folder permission
    * <p><b>200</b> - Permissions added
    * <p><b>400</b> - filePermissionsVM or id is not valid
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - folder is not found
    * @param id folder id
    * @param permissionsVM filePermissions view model
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions exportFoldersAddPermission(String id, FilePermissionsVM permissionsVM) throws IOException {
        HttpResponse response = exportFoldersAddPermissionForHttpResponse(id, permissionsVM);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Add folder permission
    * <p><b>200</b> - Permissions added
    * <p><b>400</b> - filePermissionsVM or id is not valid
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - folder is not found
    * @param id folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions exportFoldersAddPermission(FilePermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportFoldersAddPermissionForHttpResponse(permissionsVM, id, params);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportFoldersAddPermissionForHttpResponse(String id, FilePermissionsVM permissionsVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersAddPermission");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(permissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse exportFoldersAddPermissionForHttpResponse(String id, java.io.InputStream permissionsVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersAddPermission");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = permissionsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, permissionsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse exportFoldersAddPermissionForHttpResponse(FilePermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersAddPermission");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/permissions");

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
    * Move folder to a specified folder
    * User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.
    * <p><b>200</b> - Folder has been moved to a specified folder
    * <p><b>400</b> - folderId or parentFolderId is null
    * <p><b>402</b> - Subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param id moving folder id
    * @param folderId destination folder id
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM exportFoldersCopyFolder(String id, String folderId) throws IOException {
        HttpResponse response = exportFoldersCopyFolderForHttpResponse(id, folderId);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Move folder to a specified folder
    * User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.
    * <p><b>200</b> - Folder has been moved to a specified folder
    * <p><b>400</b> - folderId or parentFolderId is null
    * <p><b>402</b> - Subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param id moving folder id
    * @param folderId destination folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM exportFoldersCopyFolder(String id, String folderId, Map<String, Object> params) throws IOException {
        HttpResponse response = exportFoldersCopyFolderForHttpResponse(id, folderId, params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportFoldersCopyFolderForHttpResponse(String id, String folderId) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersCopyFolder");
        }// verify the required parameter 'folderId' is set
        if (folderId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'folderId' when calling exportFoldersCopyFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("folderId", folderId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/Copy/{folderId}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse exportFoldersCopyFolderForHttpResponse(String id, String folderId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersCopyFolder");
        }// verify the required parameter 'folderId' is set
        if (folderId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'folderId' when calling exportFoldersCopyFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("folderId", folderId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/Copy/{folderId}");

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

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Delete specified folder
    * User with a Delete Entity permission can access this method.
    * <p><b>204</b> - Folder succesfully deleted
    * <p><b>400</b> - Id is null
    * <p><b>402</b> - Subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param id folder id
    * @param recursive delete all childs
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportFoldersDeleteFolder(String id, Boolean recursive) throws IOException {
        exportFoldersDeleteFolderForHttpResponse(id, recursive);
    }

  /**
    * Delete specified folder
    * User with a Delete Entity permission can access this method.
    * <p><b>204</b> - Folder succesfully deleted
    * <p><b>400</b> - Id is null
    * <p><b>402</b> - Subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param id folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportFoldersDeleteFolder(String id, Map<String, Object> params) throws IOException {
        exportFoldersDeleteFolderForHttpResponse(id, params);
    }

    public HttpResponse exportFoldersDeleteFolderForHttpResponse(String id, Boolean recursive) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersDeleteFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}");
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

    public HttpResponse exportFoldersDeleteFolderForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersDeleteFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}");

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
    * Get specified folder breadcrumbs
    * User with a Get Entity permission can access this method.
    * <p><b>200</b> - Returns breadcrumbs parents list (starts from root folder)
    * <p><b>400</b> - folderId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param id folder id
    * @return BreadcrumbsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public BreadcrumbsVM exportFoldersGetBreadcrumbs(String id) throws IOException {
        HttpResponse response = exportFoldersGetBreadcrumbsForHttpResponse(id);
        TypeReference<BreadcrumbsVM> typeRef = new TypeReference<BreadcrumbsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get specified folder breadcrumbs
    * User with a Get Entity permission can access this method.
    * <p><b>200</b> - Returns breadcrumbs parents list (starts from root folder)
    * <p><b>400</b> - folderId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param id folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return BreadcrumbsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public BreadcrumbsVM exportFoldersGetBreadcrumbs(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportFoldersGetBreadcrumbsForHttpResponse(id, params);
        TypeReference<BreadcrumbsVM> typeRef = new TypeReference<BreadcrumbsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportFoldersGetBreadcrumbsForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersGetBreadcrumbs");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/Breadcrumbs");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse exportFoldersGetBreadcrumbsForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersGetBreadcrumbs");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/Breadcrumbs");

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
    * Get specified folder
    * User with a Get Entity permission can access this method.
    * <p><b>200</b> - Returns specified folder
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param id folder id
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM exportFoldersGetFolder(String id) throws IOException {
        HttpResponse response = exportFoldersGetFolderForHttpResponse(id);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get specified folder
    * User with a Get Entity permission can access this method.
    * <p><b>200</b> - Returns specified folder
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param id folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM exportFoldersGetFolder(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportFoldersGetFolderForHttpResponse(id, params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportFoldersGetFolderForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersGetFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse exportFoldersGetFolderForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersGetFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}");

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
    * Get all folders from specified folder
    * User with a Get Entity permission can access this method.
    * <p><b>200</b> - Gets all folders from a specified folder
    * <p><b>400</b> - folderId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param id folder id
    * @param skip number of files, that have to be skipped
    * @param take number of files, that have to be returned
    * @return FilesVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilesVM exportFoldersGetFolders(String id, Integer skip, Integer take) throws IOException {
        HttpResponse response = exportFoldersGetFoldersForHttpResponse(id, skip, take);
        TypeReference<FilesVM> typeRef = new TypeReference<FilesVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all folders from specified folder
    * User with a Get Entity permission can access this method.
    * <p><b>200</b> - Gets all folders from a specified folder
    * <p><b>400</b> - folderId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param id folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FilesVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilesVM exportFoldersGetFolders(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportFoldersGetFoldersForHttpResponse(id, params);
        TypeReference<FilesVM> typeRef = new TypeReference<FilesVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportFoldersGetFoldersForHttpResponse(String id, Integer skip, Integer take) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersGetFolders");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/ListFolders");
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
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse exportFoldersGetFoldersForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersGetFolders");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/ListFolders");

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
    * Get count of folders what contains in a specified folder
    * User with a Get Count permission can access this method.
    * <p><b>200</b> - Returns count of folders in a specified folder
    * <p><b>400</b> - folderId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param id folder id
    * @return CountVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CountVM exportFoldersGetFoldersCount(String id) throws IOException {
        HttpResponse response = exportFoldersGetFoldersCountForHttpResponse(id);
        TypeReference<CountVM> typeRef = new TypeReference<CountVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get count of folders what contains in a specified folder
    * User with a Get Count permission can access this method.
    * <p><b>200</b> - Returns count of folders in a specified folder
    * <p><b>400</b> - folderId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param id folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return CountVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CountVM exportFoldersGetFoldersCount(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportFoldersGetFoldersCountForHttpResponse(id, params);
        TypeReference<CountVM> typeRef = new TypeReference<CountVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportFoldersGetFoldersCountForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersGetFoldersCount");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/CountFolders");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse exportFoldersGetFoldersCountForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersGetFoldersCount");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/CountFolders");

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
    * Get all folder permissions
    * <p><b>200</b> - returned permissions
    * <p><b>400</b> - id is not valid
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - folder is not found
    * @param id The id parameter
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions exportFoldersGetPermissions(String id) throws IOException {
        HttpResponse response = exportFoldersGetPermissionsForHttpResponse(id);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all folder permissions
    * <p><b>200</b> - returned permissions
    * <p><b>400</b> - id is not valid
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - folder is not found
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions exportFoldersGetPermissions(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportFoldersGetPermissionsForHttpResponse(id, params);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportFoldersGetPermissionsForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse exportFoldersGetPermissionsForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/permissions");

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
    * Get user&#39;s root folder (without parents)
    * &amp;gt; Breakchange. Now user model doesn&#39;t contain a root folders.  This method can return error 400 and 404 when subscription is not found.
    * <p><b>200</b> - Gets user&#39;s root folder (without parents)
    * <p><b>400</b> - Error with the request.
    * <p><b>403</b> - No permissions to get root folder
    * <p><b>404</b> - Not found subscription
    * @param subscriptionId The subscriptionId parameter
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM exportFoldersGetRootFolder(String subscriptionId) throws IOException {
        HttpResponse response = exportFoldersGetRootFolderForHttpResponse(subscriptionId);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get user&#39;s root folder (without parents)
    * &amp;gt; Breakchange. Now user model doesn&#39;t contain a root folders.  This method can return error 400 and 404 when subscription is not found.
    * <p><b>200</b> - Gets user&#39;s root folder (without parents)
    * <p><b>400</b> - Error with the request.
    * <p><b>403</b> - No permissions to get root folder
    * <p><b>404</b> - Not found subscription
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM exportFoldersGetRootFolder(Map<String, Object> params) throws IOException {
        HttpResponse response = exportFoldersGetRootFolderForHttpResponse(params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportFoldersGetRootFolderForHttpResponse(String subscriptionId) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Root");
        if (subscriptionId != null) {
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

    public HttpResponse exportFoldersGetRootFolderForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Root");

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
    * Move folder to a specified folder
    * User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.
    * <p><b>200</b> - Folder has been moved to a specified folder
    * <p><b>400</b> - folderId or parentFolderId is null
    * <p><b>402</b> - Subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param id moving folder id
    * @param folderId destination folder id
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM exportFoldersMoveFolder(String id, String folderId) throws IOException {
        HttpResponse response = exportFoldersMoveFolderForHttpResponse(id, folderId);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Move folder to a specified folder
    * User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.
    * <p><b>200</b> - Folder has been moved to a specified folder
    * <p><b>400</b> - folderId or parentFolderId is null
    * <p><b>402</b> - Subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param id moving folder id
    * @param folderId destination folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM exportFoldersMoveFolder(String id, String folderId, Map<String, Object> params) throws IOException {
        HttpResponse response = exportFoldersMoveFolderForHttpResponse(id, folderId, params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportFoldersMoveFolderForHttpResponse(String id, String folderId) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersMoveFolder");
        }// verify the required parameter 'folderId' is set
        if (folderId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'folderId' when calling exportFoldersMoveFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("folderId", folderId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/Move/{folderId}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse exportFoldersMoveFolderForHttpResponse(String id, String folderId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersMoveFolder");
        }// verify the required parameter 'folderId' is set
        if (folderId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'folderId' when calling exportFoldersMoveFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("folderId", folderId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/Move/{folderId}");

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

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Create folder
    * User with a Create Entity permisison can access this method.
    * <p><b>200</b> - New folder has been created)
    * <p><b>400</b> - Parent folder id is null
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - parent folder/subscription not found
    * @param id Identifier of parent folder id
    * @param folderVm create VM
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM exportFoldersPostFolder(String id, ExportFolderCreateVM folderVm) throws IOException {
        HttpResponse response = exportFoldersPostFolderForHttpResponse(id, folderVm);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create folder
    * User with a Create Entity permisison can access this method.
    * <p><b>200</b> - New folder has been created)
    * <p><b>400</b> - Parent folder id is null
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - parent folder/subscription not found
    * @param id Identifier of parent folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM exportFoldersPostFolder(ExportFolderCreateVM folderVm, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportFoldersPostFolderForHttpResponse(folderVm, id, params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportFoldersPostFolderForHttpResponse(String id, ExportFolderCreateVM folderVm) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersPostFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/Folder");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(folderVm);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse exportFoldersPostFolderForHttpResponse(String id, java.io.InputStream folderVm, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersPostFolder");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/Folder");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = folderVm == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, folderVm);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse exportFoldersPostFolderForHttpResponse(ExportFolderCreateVM folderVm, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersPostFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/Folder");

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
    * Rename a folder
    * User with a Update Name permision can access this method.
    * <p><b>200</b> - Folder name has been updated
    * <p><b>400</b> - folderId is null
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param id The id parameter
    * @param nameModel The nameModel parameter
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM exportFoldersRenameFolder(String id, FolderRenameVM nameModel) throws IOException {
        HttpResponse response = exportFoldersRenameFolderForHttpResponse(id, nameModel);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Rename a folder
    * User with a Update Name permision can access this method.
    * <p><b>200</b> - Folder name has been updated
    * <p><b>400</b> - folderId is null
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM exportFoldersRenameFolder(FolderRenameVM nameModel, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportFoldersRenameFolderForHttpResponse(nameModel, id, params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportFoldersRenameFolderForHttpResponse(String id, FolderRenameVM nameModel) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersRenameFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/Rename");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(nameModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse exportFoldersRenameFolderForHttpResponse(String id, java.io.InputStream nameModel, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersRenameFolder");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/Rename");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = nameModel == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, nameModel);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse exportFoldersRenameFolderForHttpResponse(FolderRenameVM nameModel, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersRenameFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/Rename");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(nameModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


  /**
    * Revoke folder permission
    * <p><b>200</b> - permissions revoked
    * <p><b>204</b> - happens sometimes
    * <p><b>400</b> - filePermissionsVM or id is not valid
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - folder is not found
    * @param id folder id
    * @param permissionsVM permisisons to revoke
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions exportFoldersRevokePermission(String id, FilePermissionsVM permissionsVM) throws IOException {
        HttpResponse response = exportFoldersRevokePermissionForHttpResponse(id, permissionsVM);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Revoke folder permission
    * <p><b>200</b> - permissions revoked
    * <p><b>204</b> - happens sometimes
    * <p><b>400</b> - filePermissionsVM or id is not valid
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - folder is not found
    * @param id folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions exportFoldersRevokePermission(FilePermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportFoldersRevokePermissionForHttpResponse(permissionsVM, id, params);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportFoldersRevokePermissionForHttpResponse(String id, FilePermissionsVM permissionsVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersRevokePermission");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

      public HttpResponse exportFoldersRevokePermissionForHttpResponse(String id, java.io.InputStream permissionsVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersRevokePermission");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = permissionsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, permissionsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
      }

    public HttpResponse exportFoldersRevokePermissionForHttpResponse(FilePermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersRevokePermission");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/permissions");

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
    * Update a folder&#39;s icon
    * User with a Update Icon permission can access this method.
    * <p><b>200</b> - Folder&#39;s icon has been updated
    * <p><b>400</b> - folderId is null
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param id Identifier of folder
    * @param iconModel Update icon model
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM exportFoldersUpdateIcon(String id, FolderIconVM iconModel) throws IOException {
        HttpResponse response = exportFoldersUpdateIconForHttpResponse(id, iconModel);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update a folder&#39;s icon
    * User with a Update Icon permission can access this method.
    * <p><b>200</b> - Folder&#39;s icon has been updated
    * <p><b>400</b> - folderId is null
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param id Identifier of folder
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM exportFoldersUpdateIcon(FolderIconVM iconModel, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportFoldersUpdateIconForHttpResponse(iconModel, id, params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportFoldersUpdateIconForHttpResponse(String id, FolderIconVM iconModel) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersUpdateIcon");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/Icon");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(iconModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse exportFoldersUpdateIconForHttpResponse(String id, java.io.InputStream iconModel, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersUpdateIcon");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/Icon");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = iconModel == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, iconModel);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse exportFoldersUpdateIconForHttpResponse(FolderIconVM iconModel, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersUpdateIcon");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/Icon");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(iconModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


  /**
    * Update tags
    * User with a Update Tags permission can access this method.
    * <p><b>200</b> - Tags has been updated
    * <p><b>400</b> - folderId or Tags is null
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param id The id parameter
    * @param tagsModel The tagsModel parameter
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM exportFoldersUpdateTags(String id, FolderTagsUpdateVM tagsModel) throws IOException {
        HttpResponse response = exportFoldersUpdateTagsForHttpResponse(id, tagsModel);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update tags
    * User with a Update Tags permission can access this method.
    * <p><b>200</b> - Tags has been updated
    * <p><b>400</b> - folderId or Tags is null
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM exportFoldersUpdateTags(FolderTagsUpdateVM tagsModel, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportFoldersUpdateTagsForHttpResponse(tagsModel, id, params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportFoldersUpdateTagsForHttpResponse(String id, FolderTagsUpdateVM tagsModel) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersUpdateTags");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/UpdateTags");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(tagsModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse exportFoldersUpdateTagsForHttpResponse(String id, java.io.InputStream tagsModel, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersUpdateTags");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/UpdateTags");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = tagsModel == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, tagsModel);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse exportFoldersUpdateTagsForHttpResponse(FolderTagsUpdateVM tagsModel, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersUpdateTags");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/UpdateTags");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(tagsModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


  /**
    * Add permission
    * <p><b>200</b> - permissions added
    * <p><b>400</b> - filePermissionsVM or id is not valid
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File is not found
    * <p><b>500</b> - Exception thrown
    * @param id The id parameter
    * @param permissionsVM The permissionsVM parameter
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions exportsAddPermission(String id, FilePermissionsVM permissionsVM) throws IOException {
        HttpResponse response = exportsAddPermissionForHttpResponse(id, permissionsVM);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Add permission
    * <p><b>200</b> - permissions added
    * <p><b>400</b> - filePermissionsVM or id is not valid
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File is not found
    * <p><b>500</b> - Exception thrown
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions exportsAddPermission(FilePermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportsAddPermissionForHttpResponse(permissionsVM, id, params);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportsAddPermissionForHttpResponse(String id, FilePermissionsVM permissionsVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsAddPermission");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(permissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse exportsAddPermissionForHttpResponse(String id, java.io.InputStream permissionsVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsAddPermission");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = permissionsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, permissionsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse exportsAddPermissionForHttpResponse(FilePermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsAddPermission");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/permissions");

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
    * Copy file to a specified folder
    * <p><b>200</b> - File has been copied
    * <p><b>400</b> - fileId or folderId is null
    * <p><b>402</b> - Subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File or folder not found
    * <p><b>500</b> - Exception thrown
    * @param id file id
    * @param folderId folder id
    * @return ExportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportVM exportsCopyFile(String id, String folderId) throws IOException {
        HttpResponse response = exportsCopyFileForHttpResponse(id, folderId);
        TypeReference<ExportVM> typeRef = new TypeReference<ExportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Copy file to a specified folder
    * <p><b>200</b> - File has been copied
    * <p><b>400</b> - fileId or folderId is null
    * <p><b>402</b> - Subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File or folder not found
    * <p><b>500</b> - Exception thrown
    * @param id file id
    * @param folderId folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ExportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportVM exportsCopyFile(String id, String folderId, Map<String, Object> params) throws IOException {
        HttpResponse response = exportsCopyFileForHttpResponse(id, folderId, params);
        TypeReference<ExportVM> typeRef = new TypeReference<ExportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportsCopyFileForHttpResponse(String id, String folderId) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsCopyFile");
        }// verify the required parameter 'folderId' is set
        if (folderId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'folderId' when calling exportsCopyFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("folderId", folderId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/Copy/{folderId}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse exportsCopyFileForHttpResponse(String id, String folderId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsCopyFile");
        }// verify the required parameter 'folderId' is set
        if (folderId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'folderId' when calling exportsCopyFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("folderId", folderId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/Copy/{folderId}");

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

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Delete specified file
    * User with Delete permission can access the method.
    * <p><b>204</b> - File succesfully deleted
    * <p><b>400</b> - Id is null
    * <p><b>402</b> - Subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception thrown
    * @param id file id
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportsDeleteFile(String id) throws IOException {
        exportsDeleteFileForHttpResponse(id);
    }

  /**
    * Delete specified file
    * User with Delete permission can access the method.
    * <p><b>204</b> - File succesfully deleted
    * <p><b>400</b> - Id is null
    * <p><b>402</b> - Subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception thrown
    * @param id file id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportsDeleteFile(String id, Map<String, Object> params) throws IOException {
        exportsDeleteFileForHttpResponse(id, params);
    }

    public HttpResponse exportsDeleteFileForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsDeleteFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

    public HttpResponse exportsDeleteFileForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsDeleteFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}");

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
    * Get specified file
    * User with Get Entity permission can access this method.
    * <p><b>200</b> - Returns the specified file
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception thrown
    * @param id file id
    * @return ExportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportVM exportsGetFile(String id) throws IOException {
        HttpResponse response = exportsGetFileForHttpResponse(id);
        TypeReference<ExportVM> typeRef = new TypeReference<ExportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get specified file
    * User with Get Entity permission can access this method.
    * <p><b>200</b> - Returns the specified file
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception thrown
    * @param id file id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ExportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportVM exportsGetFile(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportsGetFileForHttpResponse(id, params);
        TypeReference<ExportVM> typeRef = new TypeReference<ExportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportsGetFileForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsGetFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse exportsGetFileForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsGetFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}");

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
    * Get count of files what contains in a specified folder
    * User with Get Count permission can access this method.
    * <p><b>200</b> - Returns count of the files in a specified folder
    * <p><b>400</b> - FolderId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * <p><b>500</b> - Exception thrown
    * @param id folder id
    * @return CountVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CountVM exportsGetFilesCount(String id) throws IOException {
        HttpResponse response = exportsGetFilesCountForHttpResponse(id);
        TypeReference<CountVM> typeRef = new TypeReference<CountVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get count of files what contains in a specified folder
    * User with Get Count permission can access this method.
    * <p><b>200</b> - Returns count of the files in a specified folder
    * <p><b>400</b> - FolderId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * <p><b>500</b> - Exception thrown
    * @param id folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return CountVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CountVM exportsGetFilesCount(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportsGetFilesCountForHttpResponse(id, params);
        TypeReference<CountVM> typeRef = new TypeReference<CountVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportsGetFilesCountForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsGetFilesCount");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/CountFiles");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse exportsGetFilesCountForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsGetFilesCount");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/CountFiles");

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
    * Get all files from specified folder
    * User with Get Entity permission can access this method.
    * <p><b>200</b> - Returns list of the files from a specified folder
    * <p><b>400</b> - FolderId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File or folder not found
    * <p><b>500</b> - Exception thrown
    * @param id folder id
    * @param skip number of files, that have to be skipped
    * @param take number of files, that have to be returned
    * @return ExportsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportsVM exportsGetFilesList(String id, Integer skip, Integer take) throws IOException {
        HttpResponse response = exportsGetFilesListForHttpResponse(id, skip, take);
        TypeReference<ExportsVM> typeRef = new TypeReference<ExportsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all files from specified folder
    * User with Get Entity permission can access this method.
    * <p><b>200</b> - Returns list of the files from a specified folder
    * <p><b>400</b> - FolderId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File or folder not found
    * <p><b>500</b> - Exception thrown
    * @param id folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ExportsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportsVM exportsGetFilesList(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportsGetFilesListForHttpResponse(id, params);
        TypeReference<ExportsVM> typeRef = new TypeReference<ExportsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportsGetFilesListForHttpResponse(String id, Integer skip, Integer take) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsGetFilesList");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/ListFiles");
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
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse exportsGetFilesListForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsGetFilesList");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/ListFiles");

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
    * Get all file permissions
    * <p><b>200</b> - got permissions successfully
    * <p><b>400</b> - id is not valid
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - file is not found
    * @param id The id parameter
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions exportsGetPermissions(String id) throws IOException {
        HttpResponse response = exportsGetPermissionsForHttpResponse(id);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all file permissions
    * <p><b>200</b> - got permissions successfully
    * <p><b>400</b> - id is not valid
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - file is not found
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions exportsGetPermissions(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportsGetPermissionsForHttpResponse(id, params);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportsGetPermissionsForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse exportsGetPermissionsForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/permissions");

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
    * Move file to a specified folder
    * User with Update Place permission can access this method.
    * <p><b>200</b> - File has been moved
    * <p><b>400</b> - fileId or folderId is null
    * <p><b>402</b> - Subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File or folder not found
    * <p><b>500</b> - Exception thrown
    * @param id file id
    * @param folderId folder id
    * @return ExportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportVM exportsMoveFile(String id, String folderId) throws IOException {
        HttpResponse response = exportsMoveFileForHttpResponse(id, folderId);
        TypeReference<ExportVM> typeRef = new TypeReference<ExportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Move file to a specified folder
    * User with Update Place permission can access this method.
    * <p><b>200</b> - File has been moved
    * <p><b>400</b> - fileId or folderId is null
    * <p><b>402</b> - Subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File or folder not found
    * <p><b>500</b> - Exception thrown
    * @param id file id
    * @param folderId folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ExportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportVM exportsMoveFile(String id, String folderId, Map<String, Object> params) throws IOException {
        HttpResponse response = exportsMoveFileForHttpResponse(id, folderId, params);
        TypeReference<ExportVM> typeRef = new TypeReference<ExportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportsMoveFileForHttpResponse(String id, String folderId) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsMoveFile");
        }// verify the required parameter 'folderId' is set
        if (folderId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'folderId' when calling exportsMoveFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("folderId", folderId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/Move/{folderId}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse exportsMoveFileForHttpResponse(String id, String folderId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsMoveFile");
        }// verify the required parameter 'folderId' is set
        if (folderId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'folderId' when calling exportsMoveFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("folderId", folderId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/Move/{folderId}");

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

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Rename a file
    * User with Update Name permission can access this method.
    * <p><b>200</b> - File name has been updated
    * <p><b>400</b> - FileId is null
    * <p><b>402</b> - Subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception thrown
    * @param id The id parameter
    * @param nameModel The nameModel parameter
    * @return ExportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportVM exportsRenameFile(String id, FileRenameVM nameModel) throws IOException {
        HttpResponse response = exportsRenameFileForHttpResponse(id, nameModel);
        TypeReference<ExportVM> typeRef = new TypeReference<ExportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Rename a file
    * User with Update Name permission can access this method.
    * <p><b>200</b> - File name has been updated
    * <p><b>400</b> - FileId is null
    * <p><b>402</b> - Subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception thrown
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ExportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportVM exportsRenameFile(FileRenameVM nameModel, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportsRenameFileForHttpResponse(nameModel, id, params);
        TypeReference<ExportVM> typeRef = new TypeReference<ExportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportsRenameFileForHttpResponse(String id, FileRenameVM nameModel) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsRenameFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/Rename");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(nameModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse exportsRenameFileForHttpResponse(String id, java.io.InputStream nameModel, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsRenameFile");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/Rename");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = nameModel == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, nameModel);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse exportsRenameFileForHttpResponse(FileRenameVM nameModel, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsRenameFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/Rename");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(nameModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


  /**
    * Revoke permission
    * <p><b>200</b> - permissions revoked
    * <p><b>204</b> - happens sometimes
    * <p><b>400</b> - filePermissionsVM or id is not valid
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - file is not found
    * <p><b>500</b> - Exception thrown
    * @param id The id parameter
    * @param permissionsVM The permissionsVM parameter
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions exportsRevokePermission(String id, FilePermissionsVM permissionsVM) throws IOException {
        HttpResponse response = exportsRevokePermissionForHttpResponse(id, permissionsVM);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Revoke permission
    * <p><b>200</b> - permissions revoked
    * <p><b>204</b> - happens sometimes
    * <p><b>400</b> - filePermissionsVM or id is not valid
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - file is not found
    * <p><b>500</b> - Exception thrown
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FilePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissions exportsRevokePermission(FilePermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportsRevokePermissionForHttpResponse(permissionsVM, id, params);
        TypeReference<FilePermissions> typeRef = new TypeReference<FilePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportsRevokePermissionForHttpResponse(String id, FilePermissionsVM permissionsVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsRevokePermission");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

      public HttpResponse exportsRevokePermissionForHttpResponse(String id, java.io.InputStream permissionsVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsRevokePermission");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = permissionsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, permissionsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
      }

    public HttpResponse exportsRevokePermissionForHttpResponse(FilePermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsRevokePermission");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/permissions");

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
    * Update a files&#39;s icon
    * User with Update Icon permission can access this method.
    * <p><b>200</b> - File&#39;s icon has been updated
    * <p><b>400</b> - FileId is null
    * <p><b>402</b> - Subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception thrown
    * @param id The id parameter
    * @param iconModel The iconModel parameter
    * @return ExportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportVM exportsUpdateIcon(String id, FileIconVM iconModel) throws IOException {
        HttpResponse response = exportsUpdateIconForHttpResponse(id, iconModel);
        TypeReference<ExportVM> typeRef = new TypeReference<ExportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update a files&#39;s icon
    * User with Update Icon permission can access this method.
    * <p><b>200</b> - File&#39;s icon has been updated
    * <p><b>400</b> - FileId is null
    * <p><b>402</b> - Subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception thrown
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ExportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportVM exportsUpdateIcon(FileIconVM iconModel, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportsUpdateIconForHttpResponse(iconModel, id, params);
        TypeReference<ExportVM> typeRef = new TypeReference<ExportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportsUpdateIconForHttpResponse(String id, FileIconVM iconModel) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsUpdateIcon");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/Icon");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(iconModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse exportsUpdateIconForHttpResponse(String id, java.io.InputStream iconModel, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsUpdateIcon");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/Icon");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = iconModel == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, iconModel);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse exportsUpdateIconForHttpResponse(FileIconVM iconModel, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsUpdateIcon");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/Icon");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(iconModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


  /**
    * Update tags
    * User with Update Tags permission can access this method.
    * <p><b>200</b> - Tags has been updated
    * <p><b>400</b> - FileId is null
    * <p><b>402</b> - Subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception thrown
    * @param id The id parameter
    * @param tagsModel The tagsModel parameter
    * @return ExportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportVM exportsUpdateTags(String id, FileTagsUpdateVM tagsModel) throws IOException {
        HttpResponse response = exportsUpdateTagsForHttpResponse(id, tagsModel);
        TypeReference<ExportVM> typeRef = new TypeReference<ExportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update tags
    * User with Update Tags permission can access this method.
    * <p><b>200</b> - Tags has been updated
    * <p><b>400</b> - FileId is null
    * <p><b>402</b> - Subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception thrown
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ExportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportVM exportsUpdateTags(FileTagsUpdateVM tagsModel, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportsUpdateTagsForHttpResponse(tagsModel, id, params);
        TypeReference<ExportVM> typeRef = new TypeReference<ExportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportsUpdateTagsForHttpResponse(String id, FileTagsUpdateVM tagsModel) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsUpdateTags");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/UpdateTags");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(tagsModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse exportsUpdateTagsForHttpResponse(String id, java.io.InputStream tagsModel, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsUpdateTags");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/UpdateTags");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = tagsModel == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, tagsModel);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse exportsUpdateTagsForHttpResponse(FileTagsUpdateVM tagsModel, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsUpdateTags");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/UpdateTags");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(tagsModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


}
