package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import cloud.fastreport.model.GroupUsersVM;
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
public class GroupUsersApi {
    private ApiClient apiClient;

    public GroupUsersApi() {
        this(new ApiClient());
    }

    public GroupUsersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Add user to the group by identifier
    * <p><b>200</b> - Succesfully retured
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Group with this identifier is not found
    * <p><b>500</b> - Exception thrown
    * @param id Identifier of group
    * @param userId Identifier of user
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void groupUsersAddUserToGroup(String id, String userId) throws IOException {
        groupUsersAddUserToGroupForHttpResponse(id, userId);
    }

  /**
    * Add user to the group by identifier
    * <p><b>200</b> - Succesfully retured
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Group with this identifier is not found
    * <p><b>500</b> - Exception thrown
    * @param id Identifier of group
    * @param userId Identifier of user
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void groupUsersAddUserToGroup(String id, String userId, Map<String, Object> params) throws IOException {
        groupUsersAddUserToGroupForHttpResponse(id, userId, params);
    }

    public HttpResponse groupUsersAddUserToGroupForHttpResponse(String id, String userId) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling groupUsersAddUserToGroup");
        }// verify the required parameter 'userId' is set
        if (userId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userId' when calling groupUsersAddUserToGroup");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("userId", userId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Groups/{id}/Users/{userId}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

    public HttpResponse groupUsersAddUserToGroupForHttpResponse(String id, String userId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling groupUsersAddUserToGroup");
        }// verify the required parameter 'userId' is set
        if (userId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userId' when calling groupUsersAddUserToGroup");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("userId", userId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Groups/{id}/Users/{userId}");

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
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


  /**
    * Returns users in the group by identifier
    * <p><b>200</b> - Succesfully retured
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Group with this identifier is not found
    * <p><b>500</b> - Exception thrown
    * @param id Identifier of group
    * @param skip how many to skip
    * @param take how many to take
    * @return GroupUsersVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GroupUsersVM groupUsersGetUsersInGroup(String id, Integer skip, Integer take) throws IOException {
        HttpResponse response = groupUsersGetUsersInGroupForHttpResponse(id, skip, take);
        TypeReference<GroupUsersVM> typeRef = new TypeReference<GroupUsersVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns users in the group by identifier
    * <p><b>200</b> - Succesfully retured
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Group with this identifier is not found
    * <p><b>500</b> - Exception thrown
    * @param id Identifier of group
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GroupUsersVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GroupUsersVM groupUsersGetUsersInGroup(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = groupUsersGetUsersInGroupForHttpResponse(id, params);
        TypeReference<GroupUsersVM> typeRef = new TypeReference<GroupUsersVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse groupUsersGetUsersInGroupForHttpResponse(String id, Integer skip, Integer take) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling groupUsersGetUsersInGroup");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Groups/{id}/Users");
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

    public HttpResponse groupUsersGetUsersInGroupForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling groupUsersGetUsersInGroup");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Groups/{id}/Users");

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
    * Leave from the group
    * <p><b>204</b> - Succesfully removed
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>402</b> - subscription is outdated
    * <p><b>404</b> - Group with this identifier is not found
    * <p><b>500</b> - Exception thrown
    * @param id Identifier of group
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void groupUsersLeaveFromGroup(String id) throws IOException {
        groupUsersLeaveFromGroupForHttpResponse(id);
    }

  /**
    * Leave from the group
    * <p><b>204</b> - Succesfully removed
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>402</b> - subscription is outdated
    * <p><b>404</b> - Group with this identifier is not found
    * <p><b>500</b> - Exception thrown
    * @param id Identifier of group
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void groupUsersLeaveFromGroup(String id, Map<String, Object> params) throws IOException {
        groupUsersLeaveFromGroupForHttpResponse(id, params);
    }

    public HttpResponse groupUsersLeaveFromGroupForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling groupUsersLeaveFromGroup");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Groups/{id}/leave");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

    public HttpResponse groupUsersLeaveFromGroupForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling groupUsersLeaveFromGroup");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Groups/{id}/leave");

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
    * Remove user from the group by identifier
    * <p><b>204</b> - Succesfully removed
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Group with this identifier is not found
    * <p><b>500</b> - Exception thrown
    * @param id Identifier of group
    * @param userId Identifier of user
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void groupUsersRemoveFromGroup(String id, String userId) throws IOException {
        groupUsersRemoveFromGroupForHttpResponse(id, userId);
    }

  /**
    * Remove user from the group by identifier
    * <p><b>204</b> - Succesfully removed
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Group with this identifier is not found
    * <p><b>500</b> - Exception thrown
    * @param id Identifier of group
    * @param userId Identifier of user
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void groupUsersRemoveFromGroup(String id, String userId, Map<String, Object> params) throws IOException {
        groupUsersRemoveFromGroupForHttpResponse(id, userId, params);
    }

    public HttpResponse groupUsersRemoveFromGroupForHttpResponse(String id, String userId) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling groupUsersRemoveFromGroup");
        }// verify the required parameter 'userId' is set
        if (userId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userId' when calling groupUsersRemoveFromGroup");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("userId", userId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Groups/{id}/Users/{userId}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

    public HttpResponse groupUsersRemoveFromGroupForHttpResponse(String id, String userId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling groupUsersRemoveFromGroup");
        }// verify the required parameter 'userId' is set
        if (userId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userId' when calling groupUsersRemoveFromGroup");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("userId", userId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Groups/{id}/Users/{userId}");

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


}
