package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.SubscriptionUsersVM;

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
public class SubscriptionUsersApi {
    private ApiClient apiClient;

    public SubscriptionUsersApi() {
        this(new ApiClient());
    }

    public SubscriptionUsersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Add a user to the subscription,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.
    * <p><b>200</b> - Succesfully added
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - subscription is outdated
    * <p><b>404</b> - Subscription or user is not found
    * <p><b>500</b> - Exception thrown
    * @param subscriptionId Idenitifier of subscription
    * @param userId Idenitifier of user
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void subscriptionUsersAddUser(String subscriptionId, String userId) throws IOException {
        subscriptionUsersAddUserForHttpResponse(subscriptionId, userId);
    }

  /**
    * Add a user to the subscription,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.
    * <p><b>200</b> - Succesfully added
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - subscription is outdated
    * <p><b>404</b> - Subscription or user is not found
    * <p><b>500</b> - Exception thrown
    * @param subscriptionId Idenitifier of subscription
    * @param userId Idenitifier of user
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void subscriptionUsersAddUser(String subscriptionId, String userId, Map<String, Object> params) throws IOException {
        subscriptionUsersAddUserForHttpResponse(subscriptionId, userId, params);
    }

    public HttpResponse subscriptionUsersAddUserForHttpResponse(String subscriptionId, String userId) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionUsersAddUser");
        }// verify the required parameter 'userId' is set
        if (userId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userId' when calling subscriptionUsersAddUser");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        uriVariables.put("userId", userId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/users/{userId}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

    public HttpResponse subscriptionUsersAddUserForHttpResponse(String subscriptionId, String userId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionUsersAddUser");
        }// verify the required parameter 'userId' is set
        if (userId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userId' when calling subscriptionUsersAddUser");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        uriVariables.put("userId", userId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/users/{userId}");

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
    * Returns a number of users in subscription
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription is not found
    * <p><b>500</b> - Exception thrown
    * @param subscriptionId 
    * @return Long
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Long subscriptionUsersCountUsersAsync(String subscriptionId) throws IOException {
        HttpResponse response = subscriptionUsersCountUsersAsyncForHttpResponse(subscriptionId);
        TypeReference<Long> typeRef = new TypeReference<Long>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns a number of users in subscription
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription is not found
    * <p><b>500</b> - Exception thrown
    * @param subscriptionId 
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Long
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Long subscriptionUsersCountUsersAsync(String subscriptionId, Map<String, Object> params) throws IOException {
        HttpResponse response = subscriptionUsersCountUsersAsyncForHttpResponse(subscriptionId, params);
        TypeReference<Long> typeRef = new TypeReference<Long>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse subscriptionUsersCountUsersAsyncForHttpResponse(String subscriptionId) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionUsersCountUsersAsync");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/UsersCount");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse subscriptionUsersCountUsersAsyncForHttpResponse(String subscriptionId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionUsersCountUsersAsync");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/UsersCount");

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
    * Returns all users of subscription
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription is not found
    * <p><b>500</b> - Exception thrown
    * @param subscriptionId Idenitifier of subscription
    * @param skip How many entities skip
    * @param take How many entities take
    * @return SubscriptionUsersVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionUsersVM subscriptionUsersGetUsers(String subscriptionId, Integer skip, Integer take) throws IOException {
        HttpResponse response = subscriptionUsersGetUsersForHttpResponse(subscriptionId, skip, take);
        TypeReference<SubscriptionUsersVM> typeRef = new TypeReference<SubscriptionUsersVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns all users of subscription
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription is not found
    * <p><b>500</b> - Exception thrown
    * @param subscriptionId Idenitifier of subscription
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionUsersVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionUsersVM subscriptionUsersGetUsers(String subscriptionId, Map<String, Object> params) throws IOException {
        HttpResponse response = subscriptionUsersGetUsersForHttpResponse(subscriptionId, params);
        TypeReference<SubscriptionUsersVM> typeRef = new TypeReference<SubscriptionUsersVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse subscriptionUsersGetUsersForHttpResponse(String subscriptionId, Integer skip, Integer take) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionUsersGetUsers");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/users");
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

    public HttpResponse subscriptionUsersGetUsersForHttpResponse(String subscriptionId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionUsersGetUsers");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/users");

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
    * Allows user to leave subscription,.
    * <p><b>204</b> - Succesfully deleted
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>402</b> - subscription id outdated
    * <p><b>404</b> - Subscription or user is not found
    * <p><b>500</b> - Exception thrown
    * @param subscriptionId Idenitifier of subscription
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void subscriptionUsersLeaveSubscripiton(String subscriptionId) throws IOException {
        subscriptionUsersLeaveSubscripitonForHttpResponse(subscriptionId);
    }

  /**
    * Allows user to leave subscription,.
    * <p><b>204</b> - Succesfully deleted
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>402</b> - subscription id outdated
    * <p><b>404</b> - Subscription or user is not found
    * <p><b>500</b> - Exception thrown
    * @param subscriptionId Idenitifier of subscription
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void subscriptionUsersLeaveSubscripiton(String subscriptionId, Map<String, Object> params) throws IOException {
        subscriptionUsersLeaveSubscripitonForHttpResponse(subscriptionId, params);
    }

    public HttpResponse subscriptionUsersLeaveSubscripitonForHttpResponse(String subscriptionId) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionUsersLeaveSubscripiton");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/leave");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

    public HttpResponse subscriptionUsersLeaveSubscripitonForHttpResponse(String subscriptionId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionUsersLeaveSubscripiton");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/leave");

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
    * Delete a user from the subscription,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.
    * <p><b>204</b> - Succesfully deleted
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - subscription id outdated
    * <p><b>404</b> - Subscription or user is not found
    * <p><b>500</b> - Exception thrown
    * @param subscriptionId Idenitifier of subscription
    * @param userId Idenitifier of user
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void subscriptionUsersRemoveUser(String subscriptionId, String userId) throws IOException {
        subscriptionUsersRemoveUserForHttpResponse(subscriptionId, userId);
    }

  /**
    * Delete a user from the subscription,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.
    * <p><b>204</b> - Succesfully deleted
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>402</b> - subscription id outdated
    * <p><b>404</b> - Subscription or user is not found
    * <p><b>500</b> - Exception thrown
    * @param subscriptionId Idenitifier of subscription
    * @param userId Idenitifier of user
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void subscriptionUsersRemoveUser(String subscriptionId, String userId, Map<String, Object> params) throws IOException {
        subscriptionUsersRemoveUserForHttpResponse(subscriptionId, userId, params);
    }

    public HttpResponse subscriptionUsersRemoveUserForHttpResponse(String subscriptionId, String userId) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionUsersRemoveUser");
        }// verify the required parameter 'userId' is set
        if (userId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userId' when calling subscriptionUsersRemoveUser");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        uriVariables.put("userId", userId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/users/{userId}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

    public HttpResponse subscriptionUsersRemoveUserForHttpResponse(String subscriptionId, String userId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionUsersRemoveUser");
        }// verify the required parameter 'userId' is set
        if (userId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userId' when calling subscriptionUsersRemoveUser");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        uriVariables.put("userId", userId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/users/{userId}");

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
