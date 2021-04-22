package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import cloud.fastreport.model.AnalysisResultsVM;
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
public class AdminSubscriptionAnalyticsApi {
    private ApiClient apiClient;

    public AdminSubscriptionAnalyticsApi() {
        this(new ApiClient());
    }

    public AdminSubscriptionAnalyticsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * This will check if there are any files, related to subscription that available for anonymous users
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>403</b> - Forbidden
    * @param subscriptionId subscription id
    * @return AnalysisResultsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AnalysisResultsVM adminSubscriptionAnalyticsCheckAnonPermissions(String subscriptionId) throws IOException {
        HttpResponse response = adminSubscriptionAnalyticsCheckAnonPermissionsForHttpResponse(subscriptionId);
        TypeReference<AnalysisResultsVM> typeRef = new TypeReference<AnalysisResultsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * This will check if there are any files, related to subscription that available for anonymous users
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>403</b> - Forbidden
    * @param subscriptionId subscription id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return AnalysisResultsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AnalysisResultsVM adminSubscriptionAnalyticsCheckAnonPermissions(String subscriptionId, Map<String, Object> params) throws IOException {
        HttpResponse response = adminSubscriptionAnalyticsCheckAnonPermissionsForHttpResponse(subscriptionId, params);
        TypeReference<AnalysisResultsVM> typeRef = new TypeReference<AnalysisResultsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminSubscriptionAnalyticsCheckAnonPermissionsForHttpResponse(String subscriptionId) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling adminSubscriptionAnalyticsCheckAnonPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Analytics/Subscriptions/{subscriptionId}/AnonCheck");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse adminSubscriptionAnalyticsCheckAnonPermissionsForHttpResponse(String subscriptionId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling adminSubscriptionAnalyticsCheckAnonPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Analytics/Subscriptions/{subscriptionId}/AnonCheck");

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
    * This will check if there are any files, related to subscription that not available for subscription users
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>403</b> - Forbidden
    * @param subscriptionId subscription id
    * @return AnalysisResultsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AnalysisResultsVM adminSubscriptionAnalyticsCheckOtherPermissions(String subscriptionId) throws IOException {
        HttpResponse response = adminSubscriptionAnalyticsCheckOtherPermissionsForHttpResponse(subscriptionId);
        TypeReference<AnalysisResultsVM> typeRef = new TypeReference<AnalysisResultsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * This will check if there are any files, related to subscription that not available for subscription users
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>403</b> - Forbidden
    * @param subscriptionId subscription id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return AnalysisResultsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AnalysisResultsVM adminSubscriptionAnalyticsCheckOtherPermissions(String subscriptionId, Map<String, Object> params) throws IOException {
        HttpResponse response = adminSubscriptionAnalyticsCheckOtherPermissionsForHttpResponse(subscriptionId, params);
        TypeReference<AnalysisResultsVM> typeRef = new TypeReference<AnalysisResultsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminSubscriptionAnalyticsCheckOtherPermissionsForHttpResponse(String subscriptionId) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling adminSubscriptionAnalyticsCheckOtherPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Analytics/Subscriptions/{subscriptionId}/OtherCheck");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse adminSubscriptionAnalyticsCheckOtherPermissionsForHttpResponse(String subscriptionId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling adminSubscriptionAnalyticsCheckOtherPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Analytics/Subscriptions/{subscriptionId}/OtherCheck");

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
    * This will check if there are any deleted subscriptions in users sub lists
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * @return AnalysisResultsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AnalysisResultsVM adminSubscriptionAnalyticsGetDeadSubsInUsers() throws IOException {
        HttpResponse response = adminSubscriptionAnalyticsGetDeadSubsInUsersForHttpResponse();
        TypeReference<AnalysisResultsVM> typeRef = new TypeReference<AnalysisResultsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * This will check if there are any deleted subscriptions in users sub lists
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return AnalysisResultsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AnalysisResultsVM adminSubscriptionAnalyticsGetDeadSubsInUsers(Map<String, Object> params) throws IOException {
        HttpResponse response = adminSubscriptionAnalyticsGetDeadSubsInUsersForHttpResponse(params);
        TypeReference<AnalysisResultsVM> typeRef = new TypeReference<AnalysisResultsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminSubscriptionAnalyticsGetDeadSubsInUsersForHttpResponse() throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Analytics/Subscriptions/DeadSubsInUsers");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse adminSubscriptionAnalyticsGetDeadSubsInUsersForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Analytics/Subscriptions/DeadSubsInUsers");

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
    * This will check if there are any subscriptions without users
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * @return AnalysisResultsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AnalysisResultsVM adminSubscriptionAnalyticsGetEmptySubs() throws IOException {
        HttpResponse response = adminSubscriptionAnalyticsGetEmptySubsForHttpResponse();
        TypeReference<AnalysisResultsVM> typeRef = new TypeReference<AnalysisResultsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * This will check if there are any subscriptions without users
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return AnalysisResultsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AnalysisResultsVM adminSubscriptionAnalyticsGetEmptySubs(Map<String, Object> params) throws IOException {
        HttpResponse response = adminSubscriptionAnalyticsGetEmptySubsForHttpResponse(params);
        TypeReference<AnalysisResultsVM> typeRef = new TypeReference<AnalysisResultsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminSubscriptionAnalyticsGetEmptySubsForHttpResponse() throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Analytics/Subscriptions/EmptySubs");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse adminSubscriptionAnalyticsGetEmptySubsForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Analytics/Subscriptions/EmptySubs");

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
    * This will check if there are any files in gridFS, which not related to any file model
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * @return AnalysisResultsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AnalysisResultsVM adminSubscriptionAnalyticsGetLostFileChunks() throws IOException {
        HttpResponse response = adminSubscriptionAnalyticsGetLostFileChunksForHttpResponse();
        TypeReference<AnalysisResultsVM> typeRef = new TypeReference<AnalysisResultsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * This will check if there are any files in gridFS, which not related to any file model
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return AnalysisResultsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AnalysisResultsVM adminSubscriptionAnalyticsGetLostFileChunks(Map<String, Object> params) throws IOException {
        HttpResponse response = adminSubscriptionAnalyticsGetLostFileChunksForHttpResponse(params);
        TypeReference<AnalysisResultsVM> typeRef = new TypeReference<AnalysisResultsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminSubscriptionAnalyticsGetLostFileChunksForHttpResponse() throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Analytics/Subscriptions/LostFileChunks");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse adminSubscriptionAnalyticsGetLostFileChunksForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Analytics/Subscriptions/LostFileChunks");

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
    * This will check if there are any files, that not related to any existing subscription
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * @return AnalysisResultsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AnalysisResultsVM adminSubscriptionAnalyticsGetUnrelatedDocuments() throws IOException {
        HttpResponse response = adminSubscriptionAnalyticsGetUnrelatedDocumentsForHttpResponse();
        TypeReference<AnalysisResultsVM> typeRef = new TypeReference<AnalysisResultsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * This will check if there are any files, that not related to any existing subscription
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return AnalysisResultsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AnalysisResultsVM adminSubscriptionAnalyticsGetUnrelatedDocuments(Map<String, Object> params) throws IOException {
        HttpResponse response = adminSubscriptionAnalyticsGetUnrelatedDocumentsForHttpResponse(params);
        TypeReference<AnalysisResultsVM> typeRef = new TypeReference<AnalysisResultsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminSubscriptionAnalyticsGetUnrelatedDocumentsForHttpResponse() throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Analytics/Subscriptions/UnrelatedDocuments");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse adminSubscriptionAnalyticsGetUnrelatedDocumentsForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Analytics/Subscriptions/UnrelatedDocuments");

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


}
