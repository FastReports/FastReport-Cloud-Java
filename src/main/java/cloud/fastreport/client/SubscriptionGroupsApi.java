package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import cloud.fastreport.model.GroupsVM;
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
public class SubscriptionGroupsApi {
    private ApiClient apiClient;

    public SubscriptionGroupsApi() {
        this(new ApiClient());
    }

    public SubscriptionGroupsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Returns a number of groups in subscription
    * <p><b>200</b> - Everything is all right
    * <p><b>400</b> - id is not hex24
    * <p><b>403</b> - You don&#39;t have permisison to get groups from this subscription (or in your default (1st) subscription)
    * <p><b>404</b> - there is no subscription with provided id found, or user don&#39;t even have a subscription
    * @param subscriptionId subscripiton id
    * @return Long
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Long subscriptionGroupsCountGroupsAsync(String subscriptionId) throws IOException {
        HttpResponse response = subscriptionGroupsCountGroupsAsyncForHttpResponse(subscriptionId);
        TypeReference<Long> typeRef = new TypeReference<Long>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns a number of groups in subscription
    * <p><b>200</b> - Everything is all right
    * <p><b>400</b> - id is not hex24
    * <p><b>403</b> - You don&#39;t have permisison to get groups from this subscription (or in your default (1st) subscription)
    * <p><b>404</b> - there is no subscription with provided id found, or user don&#39;t even have a subscription
    * @param subscriptionId subscripiton id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Long
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Long subscriptionGroupsCountGroupsAsync(String subscriptionId, Map<String, Object> params) throws IOException {
        HttpResponse response = subscriptionGroupsCountGroupsAsyncForHttpResponse(subscriptionId, params);
        TypeReference<Long> typeRef = new TypeReference<Long>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse subscriptionGroupsCountGroupsAsyncForHttpResponse(String subscriptionId) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionGroupsCountGroupsAsync");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/count");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse subscriptionGroupsCountGroupsAsyncForHttpResponse(String subscriptionId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionGroupsCountGroupsAsync");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/count");

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
    * returns groups of the subscription or subscription user
    * <p><b>200</b> - Everything is all right (list of groups may be empty)
    * <p><b>400</b> - id is not hex24
    * <p><b>403</b> - You don&#39;t have permisison to get groups from this subscription (or in your default (1st) subscription)
    * <p><b>404</b> - there is no subscription with provided id found, or user don&#39;t even have a subscription
    * @param subscriptionId subscripiton id
    * @param userId user Id (optional)
    * @return GroupsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GroupsVM subscriptionGroupsGetGroupsList(String subscriptionId, String userId) throws IOException {
        HttpResponse response = subscriptionGroupsGetGroupsListForHttpResponse(subscriptionId, userId);
        TypeReference<GroupsVM> typeRef = new TypeReference<GroupsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * returns groups of the subscription or subscription user
    * <p><b>200</b> - Everything is all right (list of groups may be empty)
    * <p><b>400</b> - id is not hex24
    * <p><b>403</b> - You don&#39;t have permisison to get groups from this subscription (or in your default (1st) subscription)
    * <p><b>404</b> - there is no subscription with provided id found, or user don&#39;t even have a subscription
    * @param subscriptionId subscripiton id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GroupsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GroupsVM subscriptionGroupsGetGroupsList(String subscriptionId, Map<String, Object> params) throws IOException {
        HttpResponse response = subscriptionGroupsGetGroupsListForHttpResponse(subscriptionId, params);
        TypeReference<GroupsVM> typeRef = new TypeReference<GroupsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse subscriptionGroupsGetGroupsListForHttpResponse(String subscriptionId, String userId) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionGroupsGetGroupsList");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/groups");
        if (userId != null) {
            String key = "userId";
            Object value = userId;
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

    public HttpResponse subscriptionGroupsGetGroupsListForHttpResponse(String subscriptionId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionGroupsGetGroupsList");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/groups");

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
