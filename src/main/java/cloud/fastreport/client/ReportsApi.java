package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

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
public class ReportsApi {
    private ApiClient apiClient;

    public ReportsApi() {
        this(new ApiClient());
    }

    public ReportsApi(ApiClient apiClient) {
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
    public CountVM reportFolderAndFileGetCount(String id) throws IOException {
        HttpResponse response = reportFolderAndFileGetCountForHttpResponse(id);
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
    public CountVM reportFolderAndFileGetCount(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = reportFolderAndFileGetCountForHttpResponse(id, params);
        TypeReference<CountVM> typeRef = new TypeReference<CountVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse reportFolderAndFileGetCountForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFolderAndFileGetCount");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/CountFolderAndFiles");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse reportFolderAndFileGetCountForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFolderAndFileGetCount");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/CountFolderAndFiles");

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
    * @param orderBy indicates a field to sort by
    * @param desc indicates if sorting is descending
    * @param searchPattern The searchPattern parameter
    * @return FilesVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilesVM reportFolderAndFileGetFoldersAndFiles(String id, Integer skip, Integer take, FileSorting orderBy, Boolean desc, String searchPattern) throws IOException {
        HttpResponse response = reportFolderAndFileGetFoldersAndFilesForHttpResponse(id, skip, take, orderBy, desc, searchPattern);
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
    public FilesVM reportFolderAndFileGetFoldersAndFiles(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = reportFolderAndFileGetFoldersAndFilesForHttpResponse(id, params);
        TypeReference<FilesVM> typeRef = new TypeReference<FilesVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse reportFolderAndFileGetFoldersAndFilesForHttpResponse(String id, Integer skip, Integer take, FileSorting orderBy, Boolean desc, String searchPattern) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFolderAndFileGetFoldersAndFiles");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/ListFolderAndFiles");
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
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse reportFolderAndFileGetFoldersAndFilesForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFolderAndFileGetFoldersAndFiles");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/ListFolderAndFiles");

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
    public FileVM reportFoldersCopyFolder(String id, String folderId) throws IOException {
        HttpResponse response = reportFoldersCopyFolderForHttpResponse(id, folderId);
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
    public FileVM reportFoldersCopyFolder(String id, String folderId, Map<String, Object> params) throws IOException {
        HttpResponse response = reportFoldersCopyFolderForHttpResponse(id, folderId, params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse reportFoldersCopyFolderForHttpResponse(String id, String folderId) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersCopyFolder");
        }// verify the required parameter 'folderId' is set
        if (folderId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'folderId' when calling reportFoldersCopyFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("folderId", folderId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/Copy/{folderId}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse reportFoldersCopyFolderForHttpResponse(String id, String folderId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersCopyFolder");
        }// verify the required parameter 'folderId' is set
        if (folderId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'folderId' when calling reportFoldersCopyFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("folderId", folderId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/Copy/{folderId}");

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
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
    * <p><b>404</b> - Folder not found
    * @param id folder id
    * @param recursive delete all childs
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void reportFoldersDeleteFolder(String id, Boolean recursive) throws IOException {
        reportFoldersDeleteFolderForHttpResponse(id, recursive);
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
    public void reportFoldersDeleteFolder(String id, Map<String, Object> params) throws IOException {
        reportFoldersDeleteFolderForHttpResponse(id, params);
    }

    public HttpResponse reportFoldersDeleteFolderForHttpResponse(String id, Boolean recursive) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersDeleteFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}");
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

    public HttpResponse reportFoldersDeleteFolderForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersDeleteFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}");

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
    public BreadcrumbsVM reportFoldersGetBreadcrumbs(String id) throws IOException {
        HttpResponse response = reportFoldersGetBreadcrumbsForHttpResponse(id);
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
    public BreadcrumbsVM reportFoldersGetBreadcrumbs(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = reportFoldersGetBreadcrumbsForHttpResponse(id, params);
        TypeReference<BreadcrumbsVM> typeRef = new TypeReference<BreadcrumbsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse reportFoldersGetBreadcrumbsForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersGetBreadcrumbs");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/Breadcrumbs");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse reportFoldersGetBreadcrumbsForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersGetBreadcrumbs");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/Breadcrumbs");

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
    public FileVM reportFoldersGetFolder(String id) throws IOException {
        HttpResponse response = reportFoldersGetFolderForHttpResponse(id);
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
    public FileVM reportFoldersGetFolder(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = reportFoldersGetFolderForHttpResponse(id, params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse reportFoldersGetFolderForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersGetFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse reportFoldersGetFolderForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersGetFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}");

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
    public FilesVM reportFoldersGetFolders(String id, Integer skip, Integer take) throws IOException {
        HttpResponse response = reportFoldersGetFoldersForHttpResponse(id, skip, take);
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
    public FilesVM reportFoldersGetFolders(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = reportFoldersGetFoldersForHttpResponse(id, params);
        TypeReference<FilesVM> typeRef = new TypeReference<FilesVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse reportFoldersGetFoldersForHttpResponse(String id, Integer skip, Integer take) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersGetFolders");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/ListFolders");
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

    public HttpResponse reportFoldersGetFoldersForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersGetFolders");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/ListFolders");

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
    public CountVM reportFoldersGetFoldersCount(String id) throws IOException {
        HttpResponse response = reportFoldersGetFoldersCountForHttpResponse(id);
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
    public CountVM reportFoldersGetFoldersCount(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = reportFoldersGetFoldersCountForHttpResponse(id, params);
        TypeReference<CountVM> typeRef = new TypeReference<CountVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse reportFoldersGetFoldersCountForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersGetFoldersCount");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/CountFolders");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse reportFoldersGetFoldersCountForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersGetFoldersCount");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/CountFolders");

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
    * @return FilePermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissionsVM reportFoldersGetPermissions(String id) throws IOException {
        HttpResponse response = reportFoldersGetPermissionsForHttpResponse(id);
        TypeReference<FilePermissionsVM> typeRef = new TypeReference<FilePermissionsVM>() {};
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
    * @return FilePermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissionsVM reportFoldersGetPermissions(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = reportFoldersGetPermissionsForHttpResponse(id, params);
        TypeReference<FilePermissionsVM> typeRef = new TypeReference<FilePermissionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse reportFoldersGetPermissionsForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse reportFoldersGetPermissionsForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/permissions");

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
    * &gt; Breakchange. Now user model doesn&#39;t contain a root folders.  This method can return error 400 and 404 when subscription is not found.
    * <p><b>200</b> - Gets user&#39;s root folder (without parents)
    * <p><b>400</b> - Error with the request.
    * <p><b>404</b> - Not found subscription
    * <p><b>403</b> - No permissions to get root folder
    * @param subscriptionId The subscriptionId parameter
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM reportFoldersGetRootFolder(String subscriptionId) throws IOException {
        HttpResponse response = reportFoldersGetRootFolderForHttpResponse(subscriptionId);
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
    public FileVM reportFoldersGetRootFolder(Map<String, Object> params) throws IOException {
        HttpResponse response = reportFoldersGetRootFolderForHttpResponse(params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse reportFoldersGetRootFolderForHttpResponse(String subscriptionId) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Root");
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

    public HttpResponse reportFoldersGetRootFolderForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Root");

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
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
    * <p><b>404</b> - Folder not found
    * @param id moving folder id
    * @param folderId destination folder id
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM reportFoldersMoveFolder(String id, String folderId) throws IOException {
        HttpResponse response = reportFoldersMoveFolderForHttpResponse(id, folderId);
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
    public FileVM reportFoldersMoveFolder(String id, String folderId, Map<String, Object> params) throws IOException {
        HttpResponse response = reportFoldersMoveFolderForHttpResponse(id, folderId, params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse reportFoldersMoveFolderForHttpResponse(String id, String folderId) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersMoveFolder");
        }// verify the required parameter 'folderId' is set
        if (folderId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'folderId' when calling reportFoldersMoveFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("folderId", folderId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/Move/{folderId}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse reportFoldersMoveFolderForHttpResponse(String id, String folderId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersMoveFolder");
        }// verify the required parameter 'folderId' is set
        if (folderId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'folderId' when calling reportFoldersMoveFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("folderId", folderId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/Move/{folderId}");

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
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - subscription is outdated
    * <p><b>404</b> - parent folder/subscription not found
    * @param id Identifier of parent folder id
    * @param reportFolderCreateVM create VM
    * @return FileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FileVM reportFoldersPostFolder(String id, ReportFolderCreateVM reportFolderCreateVM) throws IOException {
        HttpResponse response = reportFoldersPostFolderForHttpResponse(id, reportFolderCreateVM);
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
    public FileVM reportFoldersPostFolder(ReportFolderCreateVM reportFolderCreateVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = reportFoldersPostFolderForHttpResponse(reportFolderCreateVM, id, params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse reportFoldersPostFolderForHttpResponse(String id, ReportFolderCreateVM reportFolderCreateVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersPostFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/Folder");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reportFolderCreateVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse reportFoldersPostFolderForHttpResponse(String id, java.io.InputStream reportFolderCreateVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersPostFolder");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/Folder");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reportFolderCreateVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reportFolderCreateVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse reportFoldersPostFolderForHttpResponse(ReportFolderCreateVM reportFolderCreateVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersPostFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/Folder");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reportFolderCreateVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
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
    public FileVM reportFoldersRenameFolder(String id, FolderRenameVM folderRenameVM) throws IOException {
        HttpResponse response = reportFoldersRenameFolderForHttpResponse(id, folderRenameVM);
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
    public FileVM reportFoldersRenameFolder(FolderRenameVM folderRenameVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = reportFoldersRenameFolderForHttpResponse(folderRenameVM, id, params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse reportFoldersRenameFolderForHttpResponse(String id, FolderRenameVM folderRenameVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersRenameFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/Rename");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(folderRenameVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse reportFoldersRenameFolderForHttpResponse(String id, java.io.InputStream folderRenameVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersRenameFolder");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/Rename");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = folderRenameVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, folderRenameVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse reportFoldersRenameFolderForHttpResponse(FolderRenameVM folderRenameVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersRenameFolder");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/Rename");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(folderRenameVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
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
    public FileVM reportFoldersUpdateIcon(String id, FolderIconVM folderIconVM) throws IOException {
        HttpResponse response = reportFoldersUpdateIconForHttpResponse(id, folderIconVM);
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
    public FileVM reportFoldersUpdateIcon(FolderIconVM folderIconVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = reportFoldersUpdateIconForHttpResponse(folderIconVM, id, params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse reportFoldersUpdateIconForHttpResponse(String id, FolderIconVM folderIconVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersUpdateIcon");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/Icon");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(folderIconVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse reportFoldersUpdateIconForHttpResponse(String id, java.io.InputStream folderIconVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersUpdateIcon");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/Icon");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = folderIconVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, folderIconVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse reportFoldersUpdateIconForHttpResponse(FolderIconVM folderIconVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersUpdateIcon");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/Icon");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(folderIconVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


  /**
    * Update permissions
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id The id parameter
    * @param updateFilePermissionsVM The updateFilePermissionsVM parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void reportFoldersUpdatePermissions(String id, UpdateFilePermissionsVM updateFilePermissionsVM) throws IOException {
        reportFoldersUpdatePermissionsForHttpResponse(id, updateFilePermissionsVM);
    }

  /**
    * Update permissions
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void reportFoldersUpdatePermissions(UpdateFilePermissionsVM updateFilePermissionsVM, String id, Map<String, Object> params) throws IOException {
        reportFoldersUpdatePermissionsForHttpResponse(updateFilePermissionsVM, id, params);
    }

    public HttpResponse reportFoldersUpdatePermissionsForHttpResponse(String id, UpdateFilePermissionsVM updateFilePermissionsVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(updateFilePermissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse reportFoldersUpdatePermissionsForHttpResponse(String id, java.io.InputStream updateFilePermissionsVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersUpdatePermissions");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = updateFilePermissionsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, updateFilePermissionsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse reportFoldersUpdatePermissionsForHttpResponse(UpdateFilePermissionsVM updateFilePermissionsVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/{id}/permissions");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(updateFilePermissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
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
    public FileVM reportFoldersUpdateTags(String id, FolderTagsUpdateVM folderTagsUpdateVM) throws IOException {
        HttpResponse response = reportFoldersUpdateTagsForHttpResponse(id, folderTagsUpdateVM);
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
    public FileVM reportFoldersUpdateTags(FolderTagsUpdateVM folderTagsUpdateVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = reportFoldersUpdateTagsForHttpResponse(folderTagsUpdateVM, id, params);
        TypeReference<FileVM> typeRef = new TypeReference<FileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse reportFoldersUpdateTagsForHttpResponse(String id, FolderTagsUpdateVM folderTagsUpdateVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersUpdateTags");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/UpdateTags");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(folderTagsUpdateVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse reportFoldersUpdateTagsForHttpResponse(String id, java.io.InputStream folderTagsUpdateVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersUpdateTags");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/UpdateTags");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = folderTagsUpdateVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, folderTagsUpdateVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse reportFoldersUpdateTagsForHttpResponse(FolderTagsUpdateVM folderTagsUpdateVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportFoldersUpdateTags");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/UpdateTags");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(folderTagsUpdateVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
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
    * @return ReportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReportVM reportsCopyFile(String id, String folderId) throws IOException {
        HttpResponse response = reportsCopyFileForHttpResponse(id, folderId);
        TypeReference<ReportVM> typeRef = new TypeReference<ReportVM>() {};
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
    * @return ReportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReportVM reportsCopyFile(String id, String folderId, Map<String, Object> params) throws IOException {
        HttpResponse response = reportsCopyFileForHttpResponse(id, folderId, params);
        TypeReference<ReportVM> typeRef = new TypeReference<ReportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse reportsCopyFileForHttpResponse(String id, String folderId) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsCopyFile");
        }// verify the required parameter 'folderId' is set
        if (folderId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'folderId' when calling reportsCopyFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("folderId", folderId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/File/{id}/Copy/{folderId}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse reportsCopyFileForHttpResponse(String id, String folderId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsCopyFile");
        }// verify the required parameter 'folderId' is set
        if (folderId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'folderId' when calling reportsCopyFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("folderId", folderId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/File/{id}/Copy/{folderId}");

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
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception thrown
    * @param id file id
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void reportsDeleteFile(String id) throws IOException {
        reportsDeleteFileForHttpResponse(id);
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
    public void reportsDeleteFile(String id, Map<String, Object> params) throws IOException {
        reportsDeleteFileForHttpResponse(id, params);
    }

    public HttpResponse reportsDeleteFileForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsDeleteFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/File/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

    public HttpResponse reportsDeleteFileForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsDeleteFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/File/{id}");

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
    * Export specified report to a specified format
    * User with Execute Export permission on prepared report and  Create Entity on an export folder can access this method.
    * <p><b>200</b> - Specified report has been exported
    * <p><b>400</b> - Report Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
    * <p><b>404</b> - Exports folder not found
    * @param id report id
    * @param exportReportVM export parameters
    * @return ExportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportVM reportsExport(String id, ExportReportVM exportReportVM) throws IOException {
        HttpResponse response = reportsExportForHttpResponse(id, exportReportVM);
        TypeReference<ExportVM> typeRef = new TypeReference<ExportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Export specified report to a specified format
    * User with Execute Export permission on prepared report and  Create Entity on an export folder can access this method.
    * <p><b>200</b> - Specified report has been exported
    * <p><b>400</b> - Report Id is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
    * <p><b>404</b> - Exports folder not found
    * @param id report id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ExportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExportVM reportsExport(ExportReportVM exportReportVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = reportsExportForHttpResponse(exportReportVM, id, params);
        TypeReference<ExportVM> typeRef = new TypeReference<ExportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse reportsExportForHttpResponse(String id, ExportReportVM exportReportVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsExport");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/File/{id}/Export");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(exportReportVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse reportsExportForHttpResponse(String id, java.io.InputStream exportReportVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsExport");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/File/{id}/Export");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = exportReportVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, exportReportVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse reportsExportForHttpResponse(ExportReportVM exportReportVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsExport");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/File/{id}/Export");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(exportReportVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
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
    * @return ReportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReportVM reportsGetFile(String id) throws IOException {
        HttpResponse response = reportsGetFileForHttpResponse(id);
        TypeReference<ReportVM> typeRef = new TypeReference<ReportVM>() {};
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
    * @return ReportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReportVM reportsGetFile(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = reportsGetFileForHttpResponse(id, params);
        TypeReference<ReportVM> typeRef = new TypeReference<ReportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse reportsGetFileForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsGetFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/File/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse reportsGetFileForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsGetFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/File/{id}");

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
    public CountVM reportsGetFilesCount(String id) throws IOException {
        HttpResponse response = reportsGetFilesCountForHttpResponse(id);
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
    public CountVM reportsGetFilesCount(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = reportsGetFilesCountForHttpResponse(id, params);
        TypeReference<CountVM> typeRef = new TypeReference<CountVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse reportsGetFilesCountForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsGetFilesCount");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/CountFiles");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse reportsGetFilesCountForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsGetFilesCount");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/CountFiles");

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
    * Get all files from specified folder. &lt;br /&gt;  User with Get Entity permission can access this method. &lt;br /&gt;  The method will returns minimal infomration about the file: &lt;br /&gt;  id, name, size, editedTime, createdTime, tags, status, statusReason.
    * <p><b>200</b> - Returns list of the files from a specified folder
    * <p><b>400</b> - FolderId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - File or folder not found
    * <p><b>500</b> - Exception thrown
    * @param id folder id
    * @param skip number of files, that have to be skipped
    * @param take number of files, that have to be returned
    * @return ReportsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReportsVM reportsGetFilesList(String id, Integer skip, Integer take) throws IOException {
        HttpResponse response = reportsGetFilesListForHttpResponse(id, skip, take);
        TypeReference<ReportsVM> typeRef = new TypeReference<ReportsVM>() {};
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
    * @return ReportsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReportsVM reportsGetFilesList(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = reportsGetFilesListForHttpResponse(id, params);
        TypeReference<ReportsVM> typeRef = new TypeReference<ReportsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse reportsGetFilesListForHttpResponse(String id, Integer skip, Integer take) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsGetFilesList");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/ListFiles");
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

    public HttpResponse reportsGetFilesListForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsGetFilesList");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/ListFiles");

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
    * @return FilePermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissionsVM reportsGetPermissions(String id) throws IOException {
        HttpResponse response = reportsGetPermissionsForHttpResponse(id);
        TypeReference<FilePermissionsVM> typeRef = new TypeReference<FilePermissionsVM>() {};
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
    * @return FilePermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FilePermissionsVM reportsGetPermissions(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = reportsGetPermissionsForHttpResponse(id, params);
        TypeReference<FilePermissionsVM> typeRef = new TypeReference<FilePermissionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse reportsGetPermissionsForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/File/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse reportsGetPermissionsForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/File/{id}/permissions");

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
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
    * <p><b>404</b> - File or folder not found
    * <p><b>500</b> - Exception thrown
    * @param id file id
    * @param folderId folder id
    * @return ReportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReportVM reportsMoveFile(String id, String folderId) throws IOException {
        HttpResponse response = reportsMoveFileForHttpResponse(id, folderId);
        TypeReference<ReportVM> typeRef = new TypeReference<ReportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Move file to a specified folder
    * User with Update Place permission can access this method.
    * <p><b>200</b> - File has been moved
    * <p><b>400</b> - fileId or folderId is null
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
    * <p><b>404</b> - File or folder not found
    * <p><b>500</b> - Exception thrown
    * @param id file id
    * @param folderId folder id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ReportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReportVM reportsMoveFile(String id, String folderId, Map<String, Object> params) throws IOException {
        HttpResponse response = reportsMoveFileForHttpResponse(id, folderId, params);
        TypeReference<ReportVM> typeRef = new TypeReference<ReportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse reportsMoveFileForHttpResponse(String id, String folderId) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsMoveFile");
        }// verify the required parameter 'folderId' is set
        if (folderId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'folderId' when calling reportsMoveFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("folderId", folderId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/File/{id}/Move/{folderId}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse reportsMoveFileForHttpResponse(String id, String folderId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsMoveFile");
        }// verify the required parameter 'folderId' is set
        if (folderId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'folderId' when calling reportsMoveFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("folderId", folderId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/File/{id}/Move/{folderId}");

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
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - Subscription is outdated
    * <p><b>404</b> - File not found
    * <p><b>500</b> - Exception thrown
    * @param id The id parameter
    * @param fileRenameVM The fileRenameVM parameter
    * @return ReportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReportVM reportsRenameFile(String id, FileRenameVM fileRenameVM) throws IOException {
        HttpResponse response = reportsRenameFileForHttpResponse(id, fileRenameVM);
        TypeReference<ReportVM> typeRef = new TypeReference<ReportVM>() {};
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
    * @return ReportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReportVM reportsRenameFile(FileRenameVM fileRenameVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = reportsRenameFileForHttpResponse(fileRenameVM, id, params);
        TypeReference<ReportVM> typeRef = new TypeReference<ReportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse reportsRenameFileForHttpResponse(String id, FileRenameVM fileRenameVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsRenameFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/File/{id}/Rename");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(fileRenameVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse reportsRenameFileForHttpResponse(String id, java.io.InputStream fileRenameVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsRenameFile");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/File/{id}/Rename");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = fileRenameVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, fileRenameVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse reportsRenameFileForHttpResponse(FileRenameVM fileRenameVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsRenameFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/File/{id}/Rename");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(fileRenameVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
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
    * @return ReportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReportVM reportsUpdateIcon(String id, FileIconVM fileIconVM) throws IOException {
        HttpResponse response = reportsUpdateIconForHttpResponse(id, fileIconVM);
        TypeReference<ReportVM> typeRef = new TypeReference<ReportVM>() {};
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
    * @return ReportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReportVM reportsUpdateIcon(FileIconVM fileIconVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = reportsUpdateIconForHttpResponse(fileIconVM, id, params);
        TypeReference<ReportVM> typeRef = new TypeReference<ReportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse reportsUpdateIconForHttpResponse(String id, FileIconVM fileIconVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsUpdateIcon");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/File/{id}/Icon");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(fileIconVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse reportsUpdateIconForHttpResponse(String id, java.io.InputStream fileIconVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsUpdateIcon");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/File/{id}/Icon");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = fileIconVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, fileIconVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse reportsUpdateIconForHttpResponse(FileIconVM fileIconVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsUpdateIcon");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/File/{id}/Icon");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(fileIconVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


  /**
    * Update permissions
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id The id parameter
    * @param updateFilePermissionsVM The updateFilePermissionsVM parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void reportsUpdatePermissions(String id, UpdateFilePermissionsVM updateFilePermissionsVM) throws IOException {
        reportsUpdatePermissionsForHttpResponse(id, updateFilePermissionsVM);
    }

  /**
    * Update permissions
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void reportsUpdatePermissions(UpdateFilePermissionsVM updateFilePermissionsVM, String id, Map<String, Object> params) throws IOException {
        reportsUpdatePermissionsForHttpResponse(updateFilePermissionsVM, id, params);
    }

    public HttpResponse reportsUpdatePermissionsForHttpResponse(String id, UpdateFilePermissionsVM updateFilePermissionsVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/File/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(updateFilePermissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse reportsUpdatePermissionsForHttpResponse(String id, java.io.InputStream updateFilePermissionsVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsUpdatePermissions");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/File/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = updateFilePermissionsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, updateFilePermissionsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse reportsUpdatePermissionsForHttpResponse(UpdateFilePermissionsVM updateFilePermissionsVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/File/{id}/permissions");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(updateFilePermissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
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
    * @return ReportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReportVM reportsUpdateTags(String id, FileTagsUpdateVM fileTagsUpdateVM) throws IOException {
        HttpResponse response = reportsUpdateTagsForHttpResponse(id, fileTagsUpdateVM);
        TypeReference<ReportVM> typeRef = new TypeReference<ReportVM>() {};
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
    * @return ReportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReportVM reportsUpdateTags(FileTagsUpdateVM fileTagsUpdateVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = reportsUpdateTagsForHttpResponse(fileTagsUpdateVM, id, params);
        TypeReference<ReportVM> typeRef = new TypeReference<ReportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse reportsUpdateTagsForHttpResponse(String id, FileTagsUpdateVM fileTagsUpdateVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsUpdateTags");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/File/{id}/UpdateTags");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(fileTagsUpdateVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse reportsUpdateTagsForHttpResponse(String id, java.io.InputStream fileTagsUpdateVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsUpdateTags");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/File/{id}/UpdateTags");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = fileTagsUpdateVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, fileTagsUpdateVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse reportsUpdateTagsForHttpResponse(FileTagsUpdateVM fileTagsUpdateVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsUpdateTags");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/File/{id}/UpdateTags");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(fileTagsUpdateVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


  /**
    * Upload a file to the specified folder  !
    * User with Create Entity permission can access this method.
    * <p><b>200</b> - File has been uploaded
    * <p><b>400</b> - fileVM view model is not valid
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - subscription is outdated
    * <p><b>404</b> - folder/subscription is not found
    * @param id Identifier of folder
    * @param reportCreateVM file&#39;s view model
    * @return ReportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReportVM reportsUploadFile(String id, ReportCreateVM reportCreateVM) throws IOException {
        HttpResponse response = reportsUploadFileForHttpResponse(id, reportCreateVM);
        TypeReference<ReportVM> typeRef = new TypeReference<ReportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Upload a file to the specified folder  !
    * User with Create Entity permission can access this method.
    * <p><b>200</b> - File has been uploaded
    * <p><b>400</b> - fileVM view model is not valid
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - subscription is outdated
    * <p><b>404</b> - folder/subscription is not found
    * @param id Identifier of folder
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ReportVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReportVM reportsUploadFile(ReportCreateVM reportCreateVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = reportsUploadFileForHttpResponse(reportCreateVM, id, params);
        TypeReference<ReportVM> typeRef = new TypeReference<ReportVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse reportsUploadFileForHttpResponse(String id, ReportCreateVM reportCreateVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsUploadFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/File");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reportCreateVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse reportsUploadFileForHttpResponse(String id, java.io.InputStream reportCreateVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsUploadFile");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/File");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reportCreateVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reportCreateVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse reportsUploadFileForHttpResponse(ReportCreateVM reportCreateVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling reportsUploadFile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/rp/v1/Reports/Folder/{id}/File");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reportCreateVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


}
