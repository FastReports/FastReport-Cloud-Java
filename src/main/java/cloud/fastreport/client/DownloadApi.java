package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import java.io.File;
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
public class DownloadApi {
    private ApiClient apiClient;

    public DownloadApi() {
        this(new ApiClient());
    }

    public DownloadApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Returns a export file with specified id
    * <p><b>200</b> - Specified file was found
    * <p><b>400</b> - Bad id provided
    * <p><b>402</b> - Subscription is blocked
    * <p><b>403</b> - Not enough permissions for the operation
    * <p><b>404</b> - Specified file was not found or user do not has access to the file
    * @param id The id parameter
    * @return File
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public File downloadGetExport(String id) throws IOException {
        HttpResponse response = downloadGetExportForHttpResponse(id);
        TypeReference<File> typeRef = new TypeReference<File>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns a export file with specified id
    * <p><b>200</b> - Specified file was found
    * <p><b>400</b> - Bad id provided
    * <p><b>402</b> - Subscription is blocked
    * <p><b>403</b> - Not enough permissions for the operation
    * <p><b>404</b> - Specified file was not found or user do not has access to the file
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return File
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public File downloadGetExport(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = downloadGetExportForHttpResponse(id, params);
        TypeReference<File> typeRef = new TypeReference<File>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse downloadGetExportForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling downloadGetExport");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/download/e/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse downloadGetExportForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling downloadGetExport");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/download/e/{id}");

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
    * Returns export&#39;s thumbnail
    * <p><b>200</b> - Specified thumbnail was found
    * <p><b>400</b> - Bad id provided
    * <p><b>402</b> - Subscription is blocked
    * <p><b>403</b> - Not enough permissions for the operation
    * <p><b>404</b> - Specified thumbnail was not found or user do not has access to it
    * @param id The id parameter
    * @return File
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public File downloadGetExportThumbnail(String id) throws IOException {
        HttpResponse response = downloadGetExportThumbnailForHttpResponse(id);
        TypeReference<File> typeRef = new TypeReference<File>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns export&#39;s thumbnail
    * <p><b>200</b> - Specified thumbnail was found
    * <p><b>400</b> - Bad id provided
    * <p><b>402</b> - Subscription is blocked
    * <p><b>403</b> - Not enough permissions for the operation
    * <p><b>404</b> - Specified thumbnail was not found or user do not has access to it
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return File
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public File downloadGetExportThumbnail(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = downloadGetExportThumbnailForHttpResponse(id, params);
        TypeReference<File> typeRef = new TypeReference<File>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse downloadGetExportThumbnailForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling downloadGetExportThumbnail");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/download/e/{id}/thumbnail");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse downloadGetExportThumbnailForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling downloadGetExportThumbnail");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/download/e/{id}/thumbnail");

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
    * Returns a zip archive with selected ids
    * <p><b>200</b> - Specified file was found
    * <p><b>400</b> - Bad id provided
    * <p><b>402</b> - Subscription is blocked
    * <p><b>403</b> - Not enough permissions for the operation
    * <p><b>404</b> - Specified file was not found or user do not has access to the file
    * @param archiveName name of the created archive
    * @param ids ids separated with a &#39;,&#39; sign
    * @return File
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public File downloadGetExports(String archiveName, String ids) throws IOException {
        HttpResponse response = downloadGetExportsForHttpResponse(archiveName, ids);
        TypeReference<File> typeRef = new TypeReference<File>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns a zip archive with selected ids
    * <p><b>200</b> - Specified file was found
    * <p><b>400</b> - Bad id provided
    * <p><b>402</b> - Subscription is blocked
    * <p><b>403</b> - Not enough permissions for the operation
    * <p><b>404</b> - Specified file was not found or user do not has access to the file
    * @param archiveName name of the created archive
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return File
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public File downloadGetExports(String archiveName, Map<String, Object> params) throws IOException {
        HttpResponse response = downloadGetExportsForHttpResponse(archiveName, params);
        TypeReference<File> typeRef = new TypeReference<File>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse downloadGetExportsForHttpResponse(String archiveName, String ids) throws IOException {
        // verify the required parameter 'archiveName' is set
        if (archiveName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'archiveName' when calling downloadGetExports");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("archiveName", archiveName);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/download/es/{archiveName}");
        if (ids != null) {
            String key = "ids";
            Object value = ids;
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

    public HttpResponse downloadGetExportsForHttpResponse(String archiveName, Map<String, Object> params) throws IOException {
        // verify the required parameter 'archiveName' is set
        if (archiveName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'archiveName' when calling downloadGetExports");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("archiveName", archiveName);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/download/es/{archiveName}");

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
    * Returns a prepared file with specified id
    * <p><b>200</b> - Specified file was found
    * <p><b>400</b> - bad id provided
    * <p><b>402</b> - Subscription is blocked
    * <p><b>403</b> - Not enough permissions
    * <p><b>404</b> - Specified file was not found or user do not has access to the file
    * @param id The id parameter
    * @return File
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public File downloadGetReport(String id) throws IOException {
        HttpResponse response = downloadGetReportForHttpResponse(id);
        TypeReference<File> typeRef = new TypeReference<File>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns a prepared file with specified id
    * <p><b>200</b> - Specified file was found
    * <p><b>400</b> - bad id provided
    * <p><b>402</b> - Subscription is blocked
    * <p><b>403</b> - Not enough permissions
    * <p><b>404</b> - Specified file was not found or user do not has access to the file
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return File
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public File downloadGetReport(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = downloadGetReportForHttpResponse(id, params);
        TypeReference<File> typeRef = new TypeReference<File>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse downloadGetReportForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling downloadGetReport");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/download/r/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse downloadGetReportForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling downloadGetReport");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/download/r/{id}");

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
    * Returns report&#39;s thumbnail
    * <p><b>200</b> - Specified thumbnail was found
    * <p><b>400</b> - Bad id provided
    * <p><b>402</b> - Subscription is blocked
    * <p><b>403</b> - Not enough permissions for the operation
    * <p><b>404</b> - Specified thumbnail was not found or user do not has access to it
    * @param id The id parameter
    * @return File
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public File downloadGetReportThumbnail(String id) throws IOException {
        HttpResponse response = downloadGetReportThumbnailForHttpResponse(id);
        TypeReference<File> typeRef = new TypeReference<File>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns report&#39;s thumbnail
    * <p><b>200</b> - Specified thumbnail was found
    * <p><b>400</b> - Bad id provided
    * <p><b>402</b> - Subscription is blocked
    * <p><b>403</b> - Not enough permissions for the operation
    * <p><b>404</b> - Specified thumbnail was not found or user do not has access to it
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return File
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public File downloadGetReportThumbnail(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = downloadGetReportThumbnailForHttpResponse(id, params);
        TypeReference<File> typeRef = new TypeReference<File>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse downloadGetReportThumbnailForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling downloadGetReportThumbnail");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/download/r/{id}/thumbnail");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse downloadGetReportThumbnailForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling downloadGetReportThumbnail");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/download/r/{id}/thumbnail");

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
    * Returns a zip archive with selected files
    * <p><b>200</b> - File has been downloaded
    * <p><b>400</b> - wrong parameters provided
    * <p><b>402</b> - Subscription is blocked
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - files is not found
    * @param archiveName name of the created archive
    * @param ids ids separated with a &#39;,&#39; sign
    * @return File
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public File downloadGetReports(String archiveName, String ids) throws IOException {
        HttpResponse response = downloadGetReportsForHttpResponse(archiveName, ids);
        TypeReference<File> typeRef = new TypeReference<File>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns a zip archive with selected files
    * <p><b>200</b> - File has been downloaded
    * <p><b>400</b> - wrong parameters provided
    * <p><b>402</b> - Subscription is blocked
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - files is not found
    * @param archiveName name of the created archive
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return File
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public File downloadGetReports(String archiveName, Map<String, Object> params) throws IOException {
        HttpResponse response = downloadGetReportsForHttpResponse(archiveName, params);
        TypeReference<File> typeRef = new TypeReference<File>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse downloadGetReportsForHttpResponse(String archiveName, String ids) throws IOException {
        // verify the required parameter 'archiveName' is set
        if (archiveName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'archiveName' when calling downloadGetReports");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("archiveName", archiveName);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/download/rs/{archiveName}");
        if (ids != null) {
            String key = "ids";
            Object value = ids;
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

    public HttpResponse downloadGetReportsForHttpResponse(String archiveName, Map<String, Object> params) throws IOException {
        // verify the required parameter 'archiveName' is set
        if (archiveName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'archiveName' when calling downloadGetReports");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("archiveName", archiveName);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/download/rs/{archiveName}");

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
    * Returns a report file with specified id
    * <p><b>200</b> - Specified file was found
    * <p><b>400</b> - bad id provided
    * <p><b>402</b> - Subscription is blocked
    * <p><b>403</b> - Not enough permissions
    * <p><b>404</b> - Specified file was not found or user do not has access to the file
    * @param id template id
    * @return File
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public File downloadGetTemplate(String id) throws IOException {
        HttpResponse response = downloadGetTemplateForHttpResponse(id);
        TypeReference<File> typeRef = new TypeReference<File>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns a report file with specified id
    * <p><b>200</b> - Specified file was found
    * <p><b>400</b> - bad id provided
    * <p><b>402</b> - Subscription is blocked
    * <p><b>403</b> - Not enough permissions
    * <p><b>404</b> - Specified file was not found or user do not has access to the file
    * @param id template id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return File
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public File downloadGetTemplate(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = downloadGetTemplateForHttpResponse(id, params);
        TypeReference<File> typeRef = new TypeReference<File>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse downloadGetTemplateForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling downloadGetTemplate");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/download/t/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse downloadGetTemplateForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling downloadGetTemplate");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/download/t/{id}");

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
    * Returns a zip archive with selected files
    * <p><b>200</b> - File has been downloaded
    * <p><b>400</b> - wrong parameters provided
    * <p><b>402</b> - Subscription is blocked
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - files is not found
    * @param archiveName name of the created archive
    * @param ids ids separated with a &#39;,&#39; sign
    * @return File
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public File downloadGetTemplates(String archiveName, String ids) throws IOException {
        HttpResponse response = downloadGetTemplatesForHttpResponse(archiveName, ids);
        TypeReference<File> typeRef = new TypeReference<File>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns a zip archive with selected files
    * <p><b>200</b> - File has been downloaded
    * <p><b>400</b> - wrong parameters provided
    * <p><b>402</b> - Subscription is blocked
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - files is not found
    * @param archiveName name of the created archive
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return File
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public File downloadGetTemplates(String archiveName, Map<String, Object> params) throws IOException {
        HttpResponse response = downloadGetTemplatesForHttpResponse(archiveName, params);
        TypeReference<File> typeRef = new TypeReference<File>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse downloadGetTemplatesForHttpResponse(String archiveName, String ids) throws IOException {
        // verify the required parameter 'archiveName' is set
        if (archiveName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'archiveName' when calling downloadGetTemplates");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("archiveName", archiveName);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/download/ts/{archiveName}");
        if (ids != null) {
            String key = "ids";
            Object value = ids;
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

    public HttpResponse downloadGetTemplatesForHttpResponse(String archiveName, Map<String, Object> params) throws IOException {
        // verify the required parameter 'archiveName' is set
        if (archiveName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'archiveName' when calling downloadGetTemplates");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("archiveName", archiveName);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/download/ts/{archiveName}");

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


}
