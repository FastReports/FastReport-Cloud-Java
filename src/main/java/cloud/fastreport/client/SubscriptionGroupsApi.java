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
    * returns list of groups in the subscription
    * <p><b>200</b> - Everything is all right (list of groups may be empty)
    * <p><b>400</b> - id is not hex24
    * <p><b>403</b> - You don&#39;t have permisison to get groups from this subscription (or in your default (1st) subscription)
    * <p><b>404</b> - there is no subscription with provided id found, or user don&#39;t even have a subscription
    * @param id subscripiton id
    * @return GroupsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GroupsVM subscriptionGroupsGetGroupList(String id) throws IOException {
        HttpResponse response = subscriptionGroupsGetGroupListForHttpResponse(id);
        TypeReference<GroupsVM> typeRef = new TypeReference<GroupsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * returns list of groups in the subscription
    * <p><b>200</b> - Everything is all right (list of groups may be empty)
    * <p><b>400</b> - id is not hex24
    * <p><b>403</b> - You don&#39;t have permisison to get groups from this subscription (or in your default (1st) subscription)
    * <p><b>404</b> - there is no subscription with provided id found, or user don&#39;t even have a subscription
    * @param id subscripiton id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GroupsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GroupsVM subscriptionGroupsGetGroupList(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = subscriptionGroupsGetGroupListForHttpResponse(id, params);
        TypeReference<GroupsVM> typeRef = new TypeReference<GroupsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse subscriptionGroupsGetGroupListForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling subscriptionGroupsGetGroupList");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{id}/groups");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse subscriptionGroupsGetGroupListForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling subscriptionGroupsGetGroupList");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{id}/groups");

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
