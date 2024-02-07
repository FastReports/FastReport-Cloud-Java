package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import cloud.fastreport.model.AuditActionsVM;
import cloud.fastreport.model.BreadcrumbsVM;
import cloud.fastreport.model.CountVM;
import cloud.fastreport.model.ExportFolderCreateVM;
import cloud.fastreport.model.ExportVM;
import cloud.fastreport.model.ExportsVM;
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
import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.SelectedFilesVM;
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
    * Delete all folders and files from recycle bin
    * User with a Delete RecycleBin permission can access this method.
    * <p><b>204</b> - All folders and files in bin have been deleted
    * <p><b>400</b> - FolderId is null
    * <p><b>402</b> - Payment required, subscription is blocked
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File or folder not found
    * @param subscriptionId subscription id
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportFolderAndFileClearRecycleBin(String subscriptionId) throws IOException {
        exportFolderAndFileClearRecycleBinForHttpResponse(subscriptionId);
    }

  /**
    * Delete all folders and files from recycle bin
    * User with a Delete RecycleBin permission can access this method.
    * <p><b>204</b> - All folders and files in bin have been deleted
    * <p><b>400</b> - FolderId is null
    * <p><b>402</b> - Payment required, subscription is blocked
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File or folder not found
    * @param subscriptionId subscription id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportFolderAndFileClearRecycleBin(String subscriptionId, Map<String, Object> params) throws IOException {
        exportFolderAndFileClearRecycleBinForHttpResponse(subscriptionId, params);
    }

    public HttpResponse exportFolderAndFileClearRecycleBinForHttpResponse(String subscriptionId) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling exportFolderAndFileClearRecycleBin");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/{subscriptionId}/ClearRecycleBin");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, aContent).execute();
    }

    public HttpResponse exportFolderAndFileClearRecycleBinForHttpResponse(String subscriptionId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling exportFolderAndFileClearRecycleBin");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/{subscriptionId}/ClearRecycleBin");

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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, aContent).execute();
    }


  /**
    * Copy folders and files to a specified folder
    * User with a Get permission for a files and Create permission for a destination folder can access this method.
    * <p><b>204</b> - All folders and files have been copied
    * <p><b>400</b> - FolderId is null
    * <p><b>402</b> - Payment required, subscription is blocked
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File or folder not found
    * <p><b>500</b> - Server Error
    * @param subscriptionId id of current subscription
    * @param selectedFilesVM VM with files&#39; ids and params of their destination
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportFolderAndFileCopyFiles(String subscriptionId, SelectedFilesVM selectedFilesVM) throws IOException {
        exportFolderAndFileCopyFilesForHttpResponse(subscriptionId, selectedFilesVM);
    }

  /**
    * Copy folders and files to a specified folder
    * User with a Get permission for a files and Create permission for a destination folder can access this method.
    * <p><b>204</b> - All folders and files have been copied
    * <p><b>400</b> - FolderId is null
    * <p><b>402</b> - Payment required, subscription is blocked
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File or folder not found
    * <p><b>500</b> - Server Error
    * @param subscriptionId id of current subscription
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportFolderAndFileCopyFiles(SelectedFilesVM selectedFilesVM, String subscriptionId, Map<String, Object> params) throws IOException {
        exportFolderAndFileCopyFilesForHttpResponse(selectedFilesVM, subscriptionId, params);
    }

    public HttpResponse exportFolderAndFileCopyFilesForHttpResponse(String subscriptionId, SelectedFilesVM selectedFilesVM) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling exportFolderAndFileCopyFiles");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/{subscriptionId}/CopyFiles");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(selectedFilesVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }

      public HttpResponse exportFolderAndFileCopyFilesForHttpResponse(String subscriptionId, java.io.InputStream selectedFilesVM, String mediaType) throws IOException {
          // verify the required parameter 'subscriptionId' is set
              if (subscriptionId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling exportFolderAndFileCopyFiles");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("subscriptionId", subscriptionId);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/{subscriptionId}/CopyFiles");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent aContent = selectedFilesVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, selectedFilesVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
      }

    public HttpResponse exportFolderAndFileCopyFilesForHttpResponse(SelectedFilesVM selectedFilesVM, String subscriptionId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling exportFolderAndFileCopyFiles");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/{subscriptionId}/CopyFiles");

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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(selectedFilesVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }


  /**
    * Delete folders and files
    * User with a Delete permission can access this method.
    * <p><b>204</b> - All folders and files have been deleted
    * <p><b>400</b> - FolderId is null
    * <p><b>402</b> - Payment required, subscription is blocked
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File or folder not found
    * @param subscriptionId id of current subscription
    * @param selectedFilesVM VM with files&#39; ids and params of their destination
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportFolderAndFileDeleteFiles(String subscriptionId, SelectedFilesVM selectedFilesVM) throws IOException {
        exportFolderAndFileDeleteFilesForHttpResponse(subscriptionId, selectedFilesVM);
    }

  /**
    * Delete folders and files
    * User with a Delete permission can access this method.
    * <p><b>204</b> - All folders and files have been deleted
    * <p><b>400</b> - FolderId is null
    * <p><b>402</b> - Payment required, subscription is blocked
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File or folder not found
    * @param subscriptionId id of current subscription
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportFolderAndFileDeleteFiles(SelectedFilesVM selectedFilesVM, String subscriptionId, Map<String, Object> params) throws IOException {
        exportFolderAndFileDeleteFilesForHttpResponse(selectedFilesVM, subscriptionId, params);
    }

    public HttpResponse exportFolderAndFileDeleteFilesForHttpResponse(String subscriptionId, SelectedFilesVM selectedFilesVM) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling exportFolderAndFileDeleteFiles");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/{subscriptionId}/DeleteFiles");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(selectedFilesVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }

      public HttpResponse exportFolderAndFileDeleteFilesForHttpResponse(String subscriptionId, java.io.InputStream selectedFilesVM, String mediaType) throws IOException {
          // verify the required parameter 'subscriptionId' is set
              if (subscriptionId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling exportFolderAndFileDeleteFiles");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("subscriptionId", subscriptionId);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/{subscriptionId}/DeleteFiles");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent aContent = selectedFilesVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, selectedFilesVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
      }

    public HttpResponse exportFolderAndFileDeleteFilesForHttpResponse(SelectedFilesVM selectedFilesVM, String subscriptionId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling exportFolderAndFileDeleteFiles");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/{subscriptionId}/DeleteFiles");

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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(selectedFilesVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }


  /**
    * Get count of files and folders what contains in a specified folder
    * User with a Get Count permission can access this method.
    * <p><b>200</b> - Returns count of the files in a specified folder
    * <p><b>400</b> - FolderId is null
    * <p><b>402</b> - Payment required, subscription is blocked
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param id folder id
    * @param searchPattern string, that must be incuded in file or folder name to be counted &lt;br /&gt;              (leave undefined to count all files and folders)
    * @param useRegex set this to true if you want to use regular expression to search
    * @return CountVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CountVM exportFolderAndFileGetCount(String id, String searchPattern, Boolean useRegex) throws IOException {
        HttpResponse response = exportFolderAndFileGetCountForHttpResponse(id, searchPattern, useRegex);
        TypeReference<CountVM> typeRef = new TypeReference<CountVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get count of files and folders what contains in a specified folder
    * User with a Get Count permission can access this method.
    * <p><b>200</b> - Returns count of the files in a specified folder
    * <p><b>400</b> - FolderId is null
    * <p><b>402</b> - Payment required, subscription is blocked
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

    public HttpResponse exportFolderAndFileGetCountForHttpResponse(String id, String searchPattern, Boolean useRegex) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFolderAndFileGetCount");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/CountFolderAndFiles");
        if (searchPattern != null) {
            String key = "searchPattern";
            Object value = searchPattern;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (useRegex != null) {
            String key = "useRegex";
            Object value = useRegex;
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }


  /**
    * Get all folders and files from specified folder
    * User with a Get Entity permission can access this method.
    * <p><b>200</b> - Returns list of the files from a specified folder
    * <p><b>400</b> - FolderId is null
    * <p><b>402</b> - Payment required, subscription is blocked
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File or folder not found
    * @param id folder id
    * @param skip number of folder and files, that have to be skipped
    * @param take number of folder and files, that have to be returned
    * @param orderBy indicates a field to sort by
    * @param desc indicates if sorting is descending
    * @param searchPattern 
    * @param useRegex 
    * @return FilesVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilesVM exportFolderAndFileGetFoldersAndFiles(String id, Integer skip, Integer take, FileSorting orderBy, Boolean desc, String searchPattern, Boolean useRegex) throws IOException {
        HttpResponse response = exportFolderAndFileGetFoldersAndFilesForHttpResponse(id, skip, take, orderBy, desc, searchPattern, useRegex);
        TypeReference<FilesVM> typeRef = new TypeReference<FilesVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all folders and files from specified folder
    * User with a Get Entity permission can access this method.
    * <p><b>200</b> - Returns list of the files from a specified folder
    * <p><b>400</b> - FolderId is null
    * <p><b>402</b> - Payment required, subscription is blocked
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

    public HttpResponse exportFolderAndFileGetFoldersAndFilesForHttpResponse(String id, Integer skip, Integer take, FileSorting orderBy, Boolean desc, String searchPattern, Boolean useRegex) throws IOException {
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
        }        if (orderBy != null) {
            String key = "orderBy";
            Object value = orderBy;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (desc != null) {
            String key = "desc";
            Object value = desc;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (searchPattern != null) {
            String key = "searchPattern";
            Object value = searchPattern;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (useRegex != null) {
            String key = "useRegex";
            Object value = useRegex;
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }


  /**
    * Get all folders and files from recycle bin
    * User with a Get DeletedFiles permission can access this method.
    * <p><b>200</b> - Returns list of the files from a specified folder
    * <p><b>400</b> - FolderId is null
    * <p><b>402</b> - Payment required, subscription is blocked
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File or folder not found
    * @param subscriptionId subscription id
    * @param skip number of folder and files, that have to be skipped
    * @param take number of folder and files, that have to be returned
    * @param orderBy indicates a field to sort by
    * @param desc indicates if sorting is descending
    * @param searchPattern 
    * @param useRegex 
    * @return FilesVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilesVM exportFolderAndFileGetRecycleBinFoldersAndFiles(String subscriptionId, Integer skip, Integer take, FileSorting orderBy, Boolean desc, String searchPattern, Boolean useRegex) throws IOException {
        HttpResponse response = exportFolderAndFileGetRecycleBinFoldersAndFilesForHttpResponse(subscriptionId, skip, take, orderBy, desc, searchPattern, useRegex);
        TypeReference<FilesVM> typeRef = new TypeReference<FilesVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all folders and files from recycle bin
    * User with a Get DeletedFiles permission can access this method.
    * <p><b>200</b> - Returns list of the files from a specified folder
    * <p><b>400</b> - FolderId is null
    * <p><b>402</b> - Payment required, subscription is blocked
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File or folder not found
    * @param subscriptionId subscription id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FilesVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilesVM exportFolderAndFileGetRecycleBinFoldersAndFiles(String subscriptionId, Map<String, Object> params) throws IOException {
        HttpResponse response = exportFolderAndFileGetRecycleBinFoldersAndFilesForHttpResponse(subscriptionId, params);
        TypeReference<FilesVM> typeRef = new TypeReference<FilesVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportFolderAndFileGetRecycleBinFoldersAndFilesForHttpResponse(String subscriptionId, Integer skip, Integer take, FileSorting orderBy, Boolean desc, String searchPattern, Boolean useRegex) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling exportFolderAndFileGetRecycleBinFoldersAndFiles");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/{subscriptionId}/ListRecycleBinFolderAndFiles");
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
        }        if (orderBy != null) {
            String key = "orderBy";
            Object value = orderBy;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (desc != null) {
            String key = "desc";
            Object value = desc;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (searchPattern != null) {
            String key = "searchPattern";
            Object value = searchPattern;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (useRegex != null) {
            String key = "useRegex";
            Object value = useRegex;
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }

    public HttpResponse exportFolderAndFileGetRecycleBinFoldersAndFilesForHttpResponse(String subscriptionId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling exportFolderAndFileGetRecycleBinFoldersAndFiles");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/{subscriptionId}/ListRecycleBinFolderAndFiles");

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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }


  /**
    * Move folders and files to a specified folder
    * User with a Update Place permission for a files and Create permission for a destination folder can access this method.
    * <p><b>204</b> - All folders and files have been moved
    * <p><b>400</b> - FolderId is null
    * <p><b>402</b> - Payment required, subscription is blocked
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File or folder not found
    * <p><b>500</b> - Server Error
    * @param subscriptionId id of current subscription
    * @param selectedFilesVM VM with files&#39; ids and params of their destination
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportFolderAndFileMoveFiles(String subscriptionId, SelectedFilesVM selectedFilesVM) throws IOException {
        exportFolderAndFileMoveFilesForHttpResponse(subscriptionId, selectedFilesVM);
    }

  /**
    * Move folders and files to a specified folder
    * User with a Update Place permission for a files and Create permission for a destination folder can access this method.
    * <p><b>204</b> - All folders and files have been moved
    * <p><b>400</b> - FolderId is null
    * <p><b>402</b> - Payment required, subscription is blocked
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File or folder not found
    * <p><b>500</b> - Server Error
    * @param subscriptionId id of current subscription
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportFolderAndFileMoveFiles(SelectedFilesVM selectedFilesVM, String subscriptionId, Map<String, Object> params) throws IOException {
        exportFolderAndFileMoveFilesForHttpResponse(selectedFilesVM, subscriptionId, params);
    }

    public HttpResponse exportFolderAndFileMoveFilesForHttpResponse(String subscriptionId, SelectedFilesVM selectedFilesVM) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling exportFolderAndFileMoveFiles");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/{subscriptionId}/MoveFiles");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(selectedFilesVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }

      public HttpResponse exportFolderAndFileMoveFilesForHttpResponse(String subscriptionId, java.io.InputStream selectedFilesVM, String mediaType) throws IOException {
          // verify the required parameter 'subscriptionId' is set
              if (subscriptionId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling exportFolderAndFileMoveFiles");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("subscriptionId", subscriptionId);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/{subscriptionId}/MoveFiles");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent aContent = selectedFilesVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, selectedFilesVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
      }

    public HttpResponse exportFolderAndFileMoveFilesForHttpResponse(SelectedFilesVM selectedFilesVM, String subscriptionId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling exportFolderAndFileMoveFiles");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/{subscriptionId}/MoveFiles");

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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(selectedFilesVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }


  /**
    * Move folders and files to bin
    * User with a Delete permission can access this method.
    * <p><b>204</b> - All folders and files have been moved to bin
    * <p><b>400</b> - FolderId is null
    * <p><b>402</b> - Payment required, subscription is blocked
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File or folder not found
    * @param subscriptionId id of current subscription
    * @param selectedFilesVM VM with files&#39; ids and params of their destination
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportFolderAndFileMoveFilesToBin(String subscriptionId, SelectedFilesVM selectedFilesVM) throws IOException {
        exportFolderAndFileMoveFilesToBinForHttpResponse(subscriptionId, selectedFilesVM);
    }

  /**
    * Move folders and files to bin
    * User with a Delete permission can access this method.
    * <p><b>204</b> - All folders and files have been moved to bin
    * <p><b>400</b> - FolderId is null
    * <p><b>402</b> - Payment required, subscription is blocked
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File or folder not found
    * @param subscriptionId id of current subscription
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportFolderAndFileMoveFilesToBin(SelectedFilesVM selectedFilesVM, String subscriptionId, Map<String, Object> params) throws IOException {
        exportFolderAndFileMoveFilesToBinForHttpResponse(selectedFilesVM, subscriptionId, params);
    }

    public HttpResponse exportFolderAndFileMoveFilesToBinForHttpResponse(String subscriptionId, SelectedFilesVM selectedFilesVM) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling exportFolderAndFileMoveFilesToBin");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/{subscriptionId}/ToBin");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(selectedFilesVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }

      public HttpResponse exportFolderAndFileMoveFilesToBinForHttpResponse(String subscriptionId, java.io.InputStream selectedFilesVM, String mediaType) throws IOException {
          // verify the required parameter 'subscriptionId' is set
              if (subscriptionId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling exportFolderAndFileMoveFilesToBin");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("subscriptionId", subscriptionId);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/{subscriptionId}/ToBin");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent aContent = selectedFilesVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, selectedFilesVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
      }

    public HttpResponse exportFolderAndFileMoveFilesToBinForHttpResponse(SelectedFilesVM selectedFilesVM, String subscriptionId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling exportFolderAndFileMoveFilesToBin");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/{subscriptionId}/ToBin");

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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(selectedFilesVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }


  /**
    * Recover all folders and files from recycle bin
    * User with a Create RecycleBin permission can access this method.
    * <p><b>204</b> - All folders and files in bin have been restored
    * <p><b>400</b> - FolderId is null
    * <p><b>402</b> - Payment required, subscription is blocked
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File or folder not found
    * @param subscriptionId subscription id
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportFolderAndFileRecoverAllFromRecycleBin(String subscriptionId) throws IOException {
        exportFolderAndFileRecoverAllFromRecycleBinForHttpResponse(subscriptionId);
    }

  /**
    * Recover all folders and files from recycle bin
    * User with a Create RecycleBin permission can access this method.
    * <p><b>204</b> - All folders and files in bin have been restored
    * <p><b>400</b> - FolderId is null
    * <p><b>402</b> - Payment required, subscription is blocked
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File or folder not found
    * @param subscriptionId subscription id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportFolderAndFileRecoverAllFromRecycleBin(String subscriptionId, Map<String, Object> params) throws IOException {
        exportFolderAndFileRecoverAllFromRecycleBinForHttpResponse(subscriptionId, params);
    }

    public HttpResponse exportFolderAndFileRecoverAllFromRecycleBinForHttpResponse(String subscriptionId) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling exportFolderAndFileRecoverAllFromRecycleBin");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/{subscriptionId}/RecoverRecycleBin");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }

    public HttpResponse exportFolderAndFileRecoverAllFromRecycleBinForHttpResponse(String subscriptionId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling exportFolderAndFileRecoverAllFromRecycleBin");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/{subscriptionId}/RecoverRecycleBin");

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

        HttpContent aContent = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }


  /**
    * Recover folders and files from bin
    * User with a SubscriptionCreate permission can access this method.
    * <p><b>204</b> - All folders and files have been recovered
    * <p><b>400</b> - FolderId is null
    * <p><b>402</b> - Payment required, subscription is blocked
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File or folder not found
    * @param subscriptionId id of current subscription
    * @param selectedFilesVM VM with files&#39; ids and params of their destination
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportFolderAndFileRecoverFiles(String subscriptionId, SelectedFilesVM selectedFilesVM) throws IOException {
        exportFolderAndFileRecoverFilesForHttpResponse(subscriptionId, selectedFilesVM);
    }

  /**
    * Recover folders and files from bin
    * User with a SubscriptionCreate permission can access this method.
    * <p><b>204</b> - All folders and files have been recovered
    * <p><b>400</b> - FolderId is null
    * <p><b>402</b> - Payment required, subscription is blocked
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File or folder not found
    * @param subscriptionId id of current subscription
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportFolderAndFileRecoverFiles(SelectedFilesVM selectedFilesVM, String subscriptionId, Map<String, Object> params) throws IOException {
        exportFolderAndFileRecoverFilesForHttpResponse(selectedFilesVM, subscriptionId, params);
    }

    public HttpResponse exportFolderAndFileRecoverFilesForHttpResponse(String subscriptionId, SelectedFilesVM selectedFilesVM) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling exportFolderAndFileRecoverFiles");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/{subscriptionId}/RecoverFiles");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(selectedFilesVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }

      public HttpResponse exportFolderAndFileRecoverFilesForHttpResponse(String subscriptionId, java.io.InputStream selectedFilesVM, String mediaType) throws IOException {
          // verify the required parameter 'subscriptionId' is set
              if (subscriptionId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling exportFolderAndFileRecoverFiles");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("subscriptionId", subscriptionId);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/{subscriptionId}/RecoverFiles");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent aContent = selectedFilesVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, selectedFilesVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
      }

    public HttpResponse exportFolderAndFileRecoverFilesForHttpResponse(SelectedFilesVM selectedFilesVM, String subscriptionId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling exportFolderAndFileRecoverFiles");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/{subscriptionId}/RecoverFiles");

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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(selectedFilesVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }


  /**
    * Get specified folder, calculate it&#39;s size
    * User with a Get Entity permission can access this method.
    * <p><b>200</b> - Returns specified folder
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param id folder id
    * @return FolderSizeVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FolderSizeVM exportFoldersCalculateFolderSize(String id) throws IOException {
        HttpResponse response = exportFoldersCalculateFolderSizeForHttpResponse(id);
        TypeReference<FolderSizeVM> typeRef = new TypeReference<FolderSizeVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get specified folder, calculate it&#39;s size
    * User with a Get Entity permission can access this method.
    * <p><b>200</b> - Returns specified folder
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param id folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FolderSizeVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FolderSizeVM exportFoldersCalculateFolderSize(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportFoldersCalculateFolderSizeForHttpResponse(id, params);
        TypeReference<FolderSizeVM> typeRef = new TypeReference<FolderSizeVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportFoldersCalculateFolderSizeForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersCalculateFolderSize");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/size");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }

    public HttpResponse exportFoldersCalculateFolderSizeForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersCalculateFolderSize");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/size");

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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }


  /**
    * Move folder to a specified folder
    * User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.
    * <p><b>200</b> - Folder has been moved to a specified folder
    * <p><b>400</b> - folderId or parentFolderId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
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
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
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

        HttpContent aContent = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
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

        HttpContent aContent = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }


  /**
    * Delete specified folder
    * User with a Delete Entity permission can access this method.
    * <p><b>204</b> - Folder succesfully deleted
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
    * <p><b>404</b> - Folder not found
    * @param id folder id
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportFoldersDeleteFolder(String id) throws IOException {
        exportFoldersDeleteFolderForHttpResponse(id);
    }

  /**
    * Delete specified folder
    * User with a Delete Entity permission can access this method.
    * <p><b>204</b> - Folder succesfully deleted
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
    * <p><b>404</b> - Folder not found
    * @param id folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportFoldersDeleteFolder(String id, Map<String, Object> params) throws IOException {
        exportFoldersDeleteFolderForHttpResponse(id, params);
    }

    public HttpResponse exportFoldersDeleteFolderForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersDeleteFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, aContent).execute();
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, aContent).execute();
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
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
    * @param orderBy 
    * @param desc 
    * @param searchPattern 
    * @param useRegex 
    * @return FilesVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilesVM exportFoldersGetFolders(String id, Integer skip, Integer take, FileSorting orderBy, Boolean desc, String searchPattern, Boolean useRegex) throws IOException {
        HttpResponse response = exportFoldersGetFoldersForHttpResponse(id, skip, take, orderBy, desc, searchPattern, useRegex);
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

    public HttpResponse exportFoldersGetFoldersForHttpResponse(String id, Integer skip, Integer take, FileSorting orderBy, Boolean desc, String searchPattern, Boolean useRegex) throws IOException {
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
        }        if (orderBy != null) {
            String key = "orderBy";
            Object value = orderBy;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (desc != null) {
            String key = "desc";
            Object value = desc;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (searchPattern != null) {
            String key = "searchPattern";
            Object value = searchPattern;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (useRegex != null) {
            String key = "useRegex";
            Object value = useRegex;
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }


  /**
    * Get specified folder
    * User with a Get Entity permission can access this method.
    * <p><b>200</b> - Returns specified folder
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Folder not found
    * @param name folder name
    * @param subscriptionId subscriptionId
    * @param parentId parent folder id
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM exportFoldersGetOrCreate(String name, String subscriptionId, String parentId) throws IOException {
        HttpResponse response = exportFoldersGetOrCreateForHttpResponse(name, subscriptionId, parentId);
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
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM exportFoldersGetOrCreate(Map<String, Object> params) throws IOException {
        HttpResponse response = exportFoldersGetOrCreateForHttpResponse(params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportFoldersGetOrCreateForHttpResponse(String name, String subscriptionId, String parentId) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/getOrCreate");
        if (name != null) {
            String key = "name";
            Object value = name;
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
        }        if (parentId != null) {
            String key = "parentId";
            Object value = parentId;
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }

    public HttpResponse exportFoldersGetOrCreateForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/getOrCreate");

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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }


  /**
    * Get all folder permissions
    * <p><b>200</b> - returned permissions
    * <p><b>400</b> - id is not valid
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - folder is not found
    * @param id 
    * @return FilePermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissionsVM exportFoldersGetPermissions(String id) throws IOException {
        HttpResponse response = exportFoldersGetPermissionsForHttpResponse(id);
        TypeReference<FilePermissionsVM> typeRef = new TypeReference<FilePermissionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all folder permissions
    * <p><b>200</b> - returned permissions
    * <p><b>400</b> - id is not valid
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - folder is not found
    * @param id 
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FilePermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissionsVM exportFoldersGetPermissions(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportFoldersGetPermissionsForHttpResponse(id, params);
        TypeReference<FilePermissionsVM> typeRef = new TypeReference<FilePermissionsVM>() {};
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }


  /**
    * Get user&#39;s root folder (without parents)
    * &gt; Breakchange. Now user model doesn&#39;t contain a root folders.  This method can return error 400 and 404 when subscription is not found.
    * <p><b>200</b> - Gets user&#39;s root folder (without parents)
    * <p><b>400</b> - Error with the request.
    * <p><b>404</b> - Not found subscription
    * <p><b>403</b> - No permissions to get root folder
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
    * &gt; Breakchange. Now user model doesn&#39;t contain a root folders.  This method can return error 400 and 404 when subscription is not found.
    * <p><b>200</b> - Gets user&#39;s root folder (without parents)
    * <p><b>400</b> - Error with the request.
    * <p><b>404</b> - Not found subscription
    * <p><b>403</b> - No permissions to get root folder
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }


  /**
    * Move folder to a specified folder
    * User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.
    * <p><b>200</b> - Folder has been moved to a specified folder
    * <p><b>400</b> - folderId or parentFolderId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
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
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
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

        HttpContent aContent = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
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

        HttpContent aContent = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }


  /**
    * Move specified folder to recycle bin
    * User with a Delete Entity permission can access this method.
    * <p><b>204</b> - Folder succesfully deleted
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
    * <p><b>404</b> - Folder not found
    * @param id folder id
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportFoldersMoveFolderToBin(String id) throws IOException {
        exportFoldersMoveFolderToBinForHttpResponse(id);
    }

  /**
    * Move specified folder to recycle bin
    * User with a Delete Entity permission can access this method.
    * <p><b>204</b> - Folder succesfully deleted
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
    * <p><b>404</b> - Folder not found
    * @param id folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportFoldersMoveFolderToBin(String id, Map<String, Object> params) throws IOException {
        exportFoldersMoveFolderToBinForHttpResponse(id, params);
    }

    public HttpResponse exportFoldersMoveFolderToBinForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersMoveFolderToBin");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/ToBin");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, aContent).execute();
    }

    public HttpResponse exportFoldersMoveFolderToBinForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersMoveFolderToBin");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/ToBin");

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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, aContent).execute();
    }


  /**
    * Create folder
    * User with a Create Entity permisison can access this method.
    * <p><b>200</b> - New folder has been created)
    * <p><b>400</b> - Parent folder id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - subscription is outdated
    * <p><b>404</b> - parent folder/subscription not found
    * @param id Identifier of parent folder id
    * @param exportFolderCreateVM create VM
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM exportFoldersPostFolder(String id, ExportFolderCreateVM exportFolderCreateVM) throws IOException {
        HttpResponse response = exportFoldersPostFolderForHttpResponse(id, exportFolderCreateVM);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create folder
    * User with a Create Entity permisison can access this method.
    * <p><b>200</b> - New folder has been created)
    * <p><b>400</b> - Parent folder id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - subscription is outdated
    * <p><b>404</b> - parent folder/subscription not found
    * @param id Identifier of parent folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM exportFoldersPostFolder(ExportFolderCreateVM exportFolderCreateVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportFoldersPostFolderForHttpResponse(exportFolderCreateVM, id, params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportFoldersPostFolderForHttpResponse(String id, ExportFolderCreateVM exportFolderCreateVM) throws IOException {
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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(exportFolderCreateVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }

      public HttpResponse exportFoldersPostFolderForHttpResponse(String id, java.io.InputStream exportFolderCreateVM, String mediaType) throws IOException {
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

              HttpContent aContent = exportFolderCreateVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, exportFolderCreateVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
      }

    public HttpResponse exportFoldersPostFolderForHttpResponse(ExportFolderCreateVM exportFolderCreateVM, String id, Map<String, Object> params) throws IOException {
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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(exportFolderCreateVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }


  /**
    * Recover specified folder
    * User with a Delete Entity permission can access this method.
    * <p><b>204</b> - Folder succesfully restored from bin
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
    * <p><b>404</b> - Folder not found
    * @param id folder id
    * @param recoveryPath 
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportFoldersRecoverFolder(String id, String recoveryPath) throws IOException {
        exportFoldersRecoverFolderForHttpResponse(id, recoveryPath);
    }

  /**
    * Recover specified folder
    * User with a Delete Entity permission can access this method.
    * <p><b>204</b> - Folder succesfully restored from bin
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
    * <p><b>404</b> - Folder not found
    * @param id folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportFoldersRecoverFolder(String id, Map<String, Object> params) throws IOException {
        exportFoldersRecoverFolderForHttpResponse(id, params);
    }

    public HttpResponse exportFoldersRecoverFolderForHttpResponse(String id, String recoveryPath) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersRecoverFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/Recover");
        if (recoveryPath != null) {
            String key = "recoveryPath";
            Object value = recoveryPath;
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

        HttpContent aContent = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }

    public HttpResponse exportFoldersRecoverFolderForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersRecoverFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/Folder/{id}/Recover");

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

        HttpContent aContent = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }


  /**
    * Rename a folder
    * User with a Update Name permision can access this method.
    * <p><b>200</b> - Folder name has been updated
    * <p><b>400</b> - folderId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - subscription is outdated
    * <p><b>404</b> - Folder not found
    * @param id The id parameter
    * @param folderRenameVM The folderRenameVM parameter
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM exportFoldersRenameFolder(String id, FolderRenameVM folderRenameVM) throws IOException {
        HttpResponse response = exportFoldersRenameFolderForHttpResponse(id, folderRenameVM);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Rename a folder
    * User with a Update Name permision can access this method.
    * <p><b>200</b> - Folder name has been updated
    * <p><b>400</b> - folderId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - subscription is outdated
    * <p><b>404</b> - Folder not found
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM exportFoldersRenameFolder(FolderRenameVM folderRenameVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportFoldersRenameFolderForHttpResponse(folderRenameVM, id, params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportFoldersRenameFolderForHttpResponse(String id, FolderRenameVM folderRenameVM) throws IOException {
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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(folderRenameVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
    }

      public HttpResponse exportFoldersRenameFolderForHttpResponse(String id, java.io.InputStream folderRenameVM, String mediaType) throws IOException {
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

              HttpContent aContent = folderRenameVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, folderRenameVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
      }

    public HttpResponse exportFoldersRenameFolderForHttpResponse(FolderRenameVM folderRenameVM, String id, Map<String, Object> params) throws IOException {
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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(folderRenameVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
    }


  /**
    * Update a folder&#39;s icon
    * User with a Update Icon permission can access this method.
    * <p><b>200</b> - Folder&#39;s icon has been updated
    * <p><b>400</b> - folderId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - subscription is outdated
    * <p><b>404</b> - Folder not found
    * @param id Identifier of folder
    * @param folderIconVM Update icon model
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM exportFoldersUpdateIcon(String id, FolderIconVM folderIconVM) throws IOException {
        HttpResponse response = exportFoldersUpdateIconForHttpResponse(id, folderIconVM);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update a folder&#39;s icon
    * User with a Update Icon permission can access this method.
    * <p><b>200</b> - Folder&#39;s icon has been updated
    * <p><b>400</b> - folderId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - subscription is outdated
    * <p><b>404</b> - Folder not found
    * @param id Identifier of folder
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM exportFoldersUpdateIcon(FolderIconVM folderIconVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportFoldersUpdateIconForHttpResponse(folderIconVM, id, params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportFoldersUpdateIconForHttpResponse(String id, FolderIconVM folderIconVM) throws IOException {
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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(folderIconVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
    }

      public HttpResponse exportFoldersUpdateIconForHttpResponse(String id, java.io.InputStream folderIconVM, String mediaType) throws IOException {
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

              HttpContent aContent = folderIconVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, folderIconVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
      }

    public HttpResponse exportFoldersUpdateIconForHttpResponse(FolderIconVM folderIconVM, String id, Map<String, Object> params) throws IOException {
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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(folderIconVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
    }


  /**
    * Update permissions
    * <p><b>204</b> - No Content
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id 
    * @param updateFilePermissionsVM 
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportFoldersUpdatePermissions(String id, UpdateFilePermissionsVM updateFilePermissionsVM) throws IOException {
        exportFoldersUpdatePermissionsForHttpResponse(id, updateFilePermissionsVM);
    }

  /**
    * Update permissions
    * <p><b>204</b> - No Content
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id 
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportFoldersUpdatePermissions(UpdateFilePermissionsVM updateFilePermissionsVM, String id, Map<String, Object> params) throws IOException {
        exportFoldersUpdatePermissionsForHttpResponse(updateFilePermissionsVM, id, params);
    }

    public HttpResponse exportFoldersUpdatePermissionsForHttpResponse(String id, UpdateFilePermissionsVM updateFilePermissionsVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(updateFilePermissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }

      public HttpResponse exportFoldersUpdatePermissionsForHttpResponse(String id, java.io.InputStream updateFilePermissionsVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersUpdatePermissions");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent aContent = updateFilePermissionsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, updateFilePermissionsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
      }

    public HttpResponse exportFoldersUpdatePermissionsForHttpResponse(UpdateFilePermissionsVM updateFilePermissionsVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportFoldersUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/{id}/permissions");

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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(updateFilePermissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }


  /**
    * Update tags
    * User with a Update Tags permission can access this method.
    * <p><b>200</b> - Tags has been updated
    * <p><b>400</b> - folderId or Tags is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - subscription is outdated
    * <p><b>404</b> - Folder not found
    * @param id The id parameter
    * @param folderTagsUpdateVM The folderTagsUpdateVM parameter
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM exportFoldersUpdateTags(String id, FolderTagsUpdateVM folderTagsUpdateVM) throws IOException {
        HttpResponse response = exportFoldersUpdateTagsForHttpResponse(id, folderTagsUpdateVM);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update tags
    * User with a Update Tags permission can access this method.
    * <p><b>200</b> - Tags has been updated
    * <p><b>400</b> - folderId or Tags is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - subscription is outdated
    * <p><b>404</b> - Folder not found
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM exportFoldersUpdateTags(FolderTagsUpdateVM folderTagsUpdateVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportFoldersUpdateTagsForHttpResponse(folderTagsUpdateVM, id, params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportFoldersUpdateTagsForHttpResponse(String id, FolderTagsUpdateVM folderTagsUpdateVM) throws IOException {
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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(folderTagsUpdateVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
    }

      public HttpResponse exportFoldersUpdateTagsForHttpResponse(String id, java.io.InputStream folderTagsUpdateVM, String mediaType) throws IOException {
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

              HttpContent aContent = folderTagsUpdateVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, folderTagsUpdateVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
      }

    public HttpResponse exportFoldersUpdateTagsForHttpResponse(FolderTagsUpdateVM folderTagsUpdateVM, String id, Map<String, Object> params) throws IOException {
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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(folderTagsUpdateVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
    }


  /**
    * Copy file to a specified folder
    * <p><b>200</b> - File has been copied
    * <p><b>400</b> - fileId or folderId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
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
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
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

        HttpContent aContent = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
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

        HttpContent aContent = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }


  /**
    * Delete specified file
    * User with Delete permission can access the method.
    * <p><b>204</b> - File succesfully deleted
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
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
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, aContent).execute();
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, aContent).execute();
    }


  /**
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id The id parameter
    * @return ExportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportVM exportsGetFile(String id) throws IOException {
        HttpResponse response = exportsGetFileForHttpResponse(id);
        TypeReference<ExportVM> typeRef = new TypeReference<ExportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id The id parameter
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }


  /**
    * Returns list of actions, performed on this file
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * @param id 
    * @param skip 
    * @param take 
    * @return AuditActionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AuditActionsVM exportsGetFileHistory(String id, Integer skip, Integer take) throws IOException {
        HttpResponse response = exportsGetFileHistoryForHttpResponse(id, skip, take);
        TypeReference<AuditActionsVM> typeRef = new TypeReference<AuditActionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns list of actions, performed on this file
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * @param id 
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return AuditActionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AuditActionsVM exportsGetFileHistory(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportsGetFileHistoryForHttpResponse(id, params);
        TypeReference<AuditActionsVM> typeRef = new TypeReference<AuditActionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportsGetFileHistoryForHttpResponse(String id, Integer skip, Integer take) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsGetFileHistory");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/History");
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }

    public HttpResponse exportsGetFileHistoryForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsGetFileHistory");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/History");

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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }


  /**
    * Get all files from specified folder. &lt;br /&gt;  User with Get Entity permission can access this method. &lt;br /&gt;  The method will returns minimal infomration about the file: &lt;br /&gt;  id, name, size, editedTime, createdTime, tags, status, statusReason.
    * <p><b>200</b> - Returns list of the files from a specified folder
    * <p><b>400</b> - FolderId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File or folder not found
    * <p><b>500</b> - Exception thrown
    * @param id folder id
    * @param skip number of files, that have to be skipped
    * @param take number of files, that have to be returned
    * @param searchPattern 
    * @param orderBy 
    * @param desc 
    * @param useRegex 
    * @return ExportsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportsVM exportsGetFilesList(String id, Integer skip, Integer take, String searchPattern, FileSorting orderBy, Boolean desc, Boolean useRegex) throws IOException {
        HttpResponse response = exportsGetFilesListForHttpResponse(id, skip, take, searchPattern, orderBy, desc, useRegex);
        TypeReference<ExportsVM> typeRef = new TypeReference<ExportsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all files from specified folder. &lt;br /&gt;  User with Get Entity permission can access this method. &lt;br /&gt;  The method will returns minimal infomration about the file: &lt;br /&gt;  id, name, size, editedTime, createdTime, tags, status, statusReason.
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

    public HttpResponse exportsGetFilesListForHttpResponse(String id, Integer skip, Integer take, String searchPattern, FileSorting orderBy, Boolean desc, Boolean useRegex) throws IOException {
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
        }        if (searchPattern != null) {
            String key = "searchPattern";
            Object value = searchPattern;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (orderBy != null) {
            String key = "orderBy";
            Object value = orderBy;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (desc != null) {
            String key = "desc";
            Object value = desc;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (useRegex != null) {
            String key = "useRegex";
            Object value = useRegex;
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }


  /**
    * Get all file permissions
    * <p><b>200</b> - got permissions successfully
    * <p><b>400</b> - id is not valid
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - file is not found
    * @param id 
    * @return FilePermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissionsVM exportsGetPermissions(String id) throws IOException {
        HttpResponse response = exportsGetPermissionsForHttpResponse(id);
        TypeReference<FilePermissionsVM> typeRef = new TypeReference<FilePermissionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all file permissions
    * <p><b>200</b> - got permissions successfully
    * <p><b>400</b> - id is not valid
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - file is not found
    * @param id 
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FilePermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissionsVM exportsGetPermissions(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportsGetPermissionsForHttpResponse(id, params);
        TypeReference<FilePermissionsVM> typeRef = new TypeReference<FilePermissionsVM>() {};
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }


  /**
    * Move file to a specified folder
    * User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.
    * <p><b>200</b> - File has been moved
    * <p><b>400</b> - fileId or folderId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
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
    * User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.
    * <p><b>200</b> - File has been moved
    * <p><b>400</b> - fileId or folderId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
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

        HttpContent aContent = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
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

        HttpContent aContent = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }


  /**
    * Move specified file to recycle bin
    * User with Delete permission can access the method.
    * <p><b>204</b> - File succesfully deleted
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception thrown
    * @param id file id
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportsMoveFileToBin(String id) throws IOException {
        exportsMoveFileToBinForHttpResponse(id);
    }

  /**
    * Move specified file to recycle bin
    * User with Delete permission can access the method.
    * <p><b>204</b> - File succesfully deleted
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception thrown
    * @param id file id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportsMoveFileToBin(String id, Map<String, Object> params) throws IOException {
        exportsMoveFileToBinForHttpResponse(id, params);
    }

    public HttpResponse exportsMoveFileToBinForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsMoveFileToBin");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/ToBin");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, aContent).execute();
    }

    public HttpResponse exportsMoveFileToBinForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsMoveFileToBin");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/ToBin");

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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, aContent).execute();
    }


  /**
    * Recover specified file from bin
    * User with Delete permission can access the method.
    * <p><b>204</b> - File succesfully recovered
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception thrown
    * @param id file id
    * @param recoveryPath 
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportsRecoverFile(String id, String recoveryPath) throws IOException {
        exportsRecoverFileForHttpResponse(id, recoveryPath);
    }

  /**
    * Recover specified file from bin
    * User with Delete permission can access the method.
    * <p><b>204</b> - File succesfully recovered
    * <p><b>400</b> - Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception thrown
    * @param id file id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportsRecoverFile(String id, Map<String, Object> params) throws IOException {
        exportsRecoverFileForHttpResponse(id, params);
    }

    public HttpResponse exportsRecoverFileForHttpResponse(String id, String recoveryPath) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsRecoverFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/Recover");
        if (recoveryPath != null) {
            String key = "recoveryPath";
            Object value = recoveryPath;
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

        HttpContent aContent = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }

    public HttpResponse exportsRecoverFileForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsRecoverFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/Recover");

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

        HttpContent aContent = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }


  /**
    * Rename a file
    * User with Update Name permission can access this method.
    * <p><b>200</b> - File name has been updated
    * <p><b>400</b> - FileId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception thrown
    * @param id The id parameter
    * @param fileRenameVM The fileRenameVM parameter
    * @return ExportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportVM exportsRenameFile(String id, FileRenameVM fileRenameVM) throws IOException {
        HttpResponse response = exportsRenameFileForHttpResponse(id, fileRenameVM);
        TypeReference<ExportVM> typeRef = new TypeReference<ExportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Rename a file
    * User with Update Name permission can access this method.
    * <p><b>200</b> - File name has been updated
    * <p><b>400</b> - FileId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception thrown
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ExportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportVM exportsRenameFile(FileRenameVM fileRenameVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportsRenameFileForHttpResponse(fileRenameVM, id, params);
        TypeReference<ExportVM> typeRef = new TypeReference<ExportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportsRenameFileForHttpResponse(String id, FileRenameVM fileRenameVM) throws IOException {
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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(fileRenameVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
    }

      public HttpResponse exportsRenameFileForHttpResponse(String id, java.io.InputStream fileRenameVM, String mediaType) throws IOException {
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

              HttpContent aContent = fileRenameVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, fileRenameVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
      }

    public HttpResponse exportsRenameFileForHttpResponse(FileRenameVM fileRenameVM, String id, Map<String, Object> params) throws IOException {
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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(fileRenameVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
    }


  /**
    * Update a files&#39;s icon
    * User with Update Icon permission can access this method.
    * <p><b>200</b> - File&#39;s icon has been updated
    * <p><b>400</b> - FileId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception thrown
    * @param id The id parameter
    * @param fileIconVM The fileIconVM parameter
    * @return ExportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportVM exportsUpdateIcon(String id, FileIconVM fileIconVM) throws IOException {
        HttpResponse response = exportsUpdateIconForHttpResponse(id, fileIconVM);
        TypeReference<ExportVM> typeRef = new TypeReference<ExportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update a files&#39;s icon
    * User with Update Icon permission can access this method.
    * <p><b>200</b> - File&#39;s icon has been updated
    * <p><b>400</b> - FileId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception thrown
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ExportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportVM exportsUpdateIcon(FileIconVM fileIconVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportsUpdateIconForHttpResponse(fileIconVM, id, params);
        TypeReference<ExportVM> typeRef = new TypeReference<ExportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportsUpdateIconForHttpResponse(String id, FileIconVM fileIconVM) throws IOException {
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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(fileIconVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
    }

      public HttpResponse exportsUpdateIconForHttpResponse(String id, java.io.InputStream fileIconVM, String mediaType) throws IOException {
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

              HttpContent aContent = fileIconVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, fileIconVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
      }

    public HttpResponse exportsUpdateIconForHttpResponse(FileIconVM fileIconVM, String id, Map<String, Object> params) throws IOException {
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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(fileIconVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
    }


  /**
    * Update permissions
    * <p><b>204</b> - No Content
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id 
    * @param updateFilePermissionsVM 
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportsUpdatePermissions(String id, UpdateFilePermissionsVM updateFilePermissionsVM) throws IOException {
        exportsUpdatePermissionsForHttpResponse(id, updateFilePermissionsVM);
    }

  /**
    * Update permissions
    * <p><b>204</b> - No Content
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id 
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void exportsUpdatePermissions(UpdateFilePermissionsVM updateFilePermissionsVM, String id, Map<String, Object> params) throws IOException {
        exportsUpdatePermissionsForHttpResponse(updateFilePermissionsVM, id, params);
    }

    public HttpResponse exportsUpdatePermissionsForHttpResponse(String id, UpdateFilePermissionsVM updateFilePermissionsVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(updateFilePermissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }

      public HttpResponse exportsUpdatePermissionsForHttpResponse(String id, java.io.InputStream updateFilePermissionsVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsUpdatePermissions");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Exports/File/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent aContent = updateFilePermissionsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, updateFilePermissionsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
      }

    public HttpResponse exportsUpdatePermissionsForHttpResponse(UpdateFilePermissionsVM updateFilePermissionsVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling exportsUpdatePermissions");
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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(updateFilePermissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }


  /**
    * Update tags
    * User with Update Tags permission can access this method.
    * <p><b>200</b> - Tags has been updated
    * <p><b>400</b> - FileId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception thrown
    * @param id The id parameter
    * @param fileTagsUpdateVM The fileTagsUpdateVM parameter
    * @return ExportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportVM exportsUpdateTags(String id, FileTagsUpdateVM fileTagsUpdateVM) throws IOException {
        HttpResponse response = exportsUpdateTagsForHttpResponse(id, fileTagsUpdateVM);
        TypeReference<ExportVM> typeRef = new TypeReference<ExportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update tags
    * User with Update Tags permission can access this method.
    * <p><b>200</b> - Tags has been updated
    * <p><b>400</b> - FileId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception thrown
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ExportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportVM exportsUpdateTags(FileTagsUpdateVM fileTagsUpdateVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = exportsUpdateTagsForHttpResponse(fileTagsUpdateVM, id, params);
        TypeReference<ExportVM> typeRef = new TypeReference<ExportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportsUpdateTagsForHttpResponse(String id, FileTagsUpdateVM fileTagsUpdateVM) throws IOException {
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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(fileTagsUpdateVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
    }

      public HttpResponse exportsUpdateTagsForHttpResponse(String id, java.io.InputStream fileTagsUpdateVM, String mediaType) throws IOException {
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

              HttpContent aContent = fileTagsUpdateVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, fileTagsUpdateVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
      }

    public HttpResponse exportsUpdateTagsForHttpResponse(FileTagsUpdateVM fileTagsUpdateVM, String id, Map<String, Object> params) throws IOException {
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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(fileTagsUpdateVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
    }


}
