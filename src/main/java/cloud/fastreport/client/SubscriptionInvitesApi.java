package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import cloud.fastreport.model.CreateSubscriptionInviteVM;
import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.SubscriptionInvitesVM;
import cloud.fastreport.model.SubscriptionVM;

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
public class SubscriptionInvitesApi {
    private ApiClient apiClient;

    public SubscriptionInvitesApi() {
        this(new ApiClient());
    }

    public SubscriptionInvitesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Add a user to the subscription using invite,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.
    * <p><b>200</b> - Succesfully added
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription or user is not found
    * <p><b>500</b> - Exception thrown
    * @param subscriptionId Idenitifier of subscription
    * @param accessToken access token of the subscription
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void subscriptionInvitesAcceptInvite(String subscriptionId, String accessToken) throws IOException {
        subscriptionInvitesAcceptInviteForHttpResponse(subscriptionId, accessToken);
    }

  /**
    * Add a user to the subscription using invite,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.
    * <p><b>200</b> - Succesfully added
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription or user is not found
    * <p><b>500</b> - Exception thrown
    * @param subscriptionId Idenitifier of subscription
    * @param accessToken access token of the subscription
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void subscriptionInvitesAcceptInvite(String subscriptionId, String accessToken, Map<String, Object> params) throws IOException {
        subscriptionInvitesAcceptInviteForHttpResponse(subscriptionId, accessToken, params);
    }

    public HttpResponse subscriptionInvitesAcceptInviteForHttpResponse(String subscriptionId, String accessToken) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionInvitesAcceptInvite");
        }// verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new IllegalArgumentException("Missing the required parameter 'accessToken' when calling subscriptionInvitesAcceptInvite");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        uriVariables.put("accessToken", accessToken);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/invite/{accessToken}/accept");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse subscriptionInvitesAcceptInviteForHttpResponse(String subscriptionId, String accessToken, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionInvitesAcceptInvite");
        }// verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new IllegalArgumentException("Missing the required parameter 'accessToken' when calling subscriptionInvitesAcceptInvite");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        uriVariables.put("accessToken", accessToken);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/invite/{accessToken}/accept");

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
    * Create invite to subscription
    * <p><b>200</b> - Successfully created
    * <p><b>400</b> - Request is wrong
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - Not enough permissions
    * <p><b>404</b> - there is no subscription with such id
    * <p><b>500</b> - exception caught
    * @param subscriptionId id
    * @param createInviteVM create VM
    * @return SubscriptionVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionVM subscriptionInvitesCreateInvite(String subscriptionId, CreateSubscriptionInviteVM createInviteVM) throws IOException {
        HttpResponse response = subscriptionInvitesCreateInviteForHttpResponse(subscriptionId, createInviteVM);
        TypeReference<SubscriptionVM> typeRef = new TypeReference<SubscriptionVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create invite to subscription
    * <p><b>200</b> - Successfully created
    * <p><b>400</b> - Request is wrong
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - Not enough permissions
    * <p><b>404</b> - there is no subscription with such id
    * <p><b>500</b> - exception caught
    * @param subscriptionId id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionVM subscriptionInvitesCreateInvite(CreateSubscriptionInviteVM createInviteVM, String subscriptionId, Map<String, Object> params) throws IOException {
        HttpResponse response = subscriptionInvitesCreateInviteForHttpResponse(createInviteVM, subscriptionId, params);
        TypeReference<SubscriptionVM> typeRef = new TypeReference<SubscriptionVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse subscriptionInvitesCreateInviteForHttpResponse(String subscriptionId, CreateSubscriptionInviteVM createInviteVM) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionInvitesCreateInvite");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/invite");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(createInviteVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse subscriptionInvitesCreateInviteForHttpResponse(String subscriptionId, java.io.InputStream createInviteVM, String mediaType) throws IOException {
          // verify the required parameter 'subscriptionId' is set
              if (subscriptionId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionInvitesCreateInvite");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("subscriptionId", subscriptionId);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/invite");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = createInviteVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, createInviteVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse subscriptionInvitesCreateInviteForHttpResponse(CreateSubscriptionInviteVM createInviteVM, String subscriptionId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionInvitesCreateInvite");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/invite");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(createInviteVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Rename subscription
    * <p><b>204</b> - Successfully deleted
    * <p><b>400</b> - Request is wrong
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - Not enough permissions
    * <p><b>404</b> - there is no subscription with such id
    * <p><b>500</b> - exception caught
    * @param subscriptionId id
    * @param accesstoken invite&#39;s token
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void subscriptionInvitesDeleteInvite(String subscriptionId, String accesstoken) throws IOException {
        subscriptionInvitesDeleteInviteForHttpResponse(subscriptionId, accesstoken);
    }

  /**
    * Rename subscription
    * <p><b>204</b> - Successfully deleted
    * <p><b>400</b> - Request is wrong
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - Not enough permissions
    * <p><b>404</b> - there is no subscription with such id
    * <p><b>500</b> - exception caught
    * @param subscriptionId id
    * @param accesstoken invite&#39;s token
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void subscriptionInvitesDeleteInvite(String subscriptionId, String accesstoken, Map<String, Object> params) throws IOException {
        subscriptionInvitesDeleteInviteForHttpResponse(subscriptionId, accesstoken, params);
    }

    public HttpResponse subscriptionInvitesDeleteInviteForHttpResponse(String subscriptionId, String accesstoken) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionInvitesDeleteInvite");
        }// verify the required parameter 'accesstoken' is set
        if (accesstoken == null) {
            throw new IllegalArgumentException("Missing the required parameter 'accesstoken' when calling subscriptionInvitesDeleteInvite");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        uriVariables.put("accesstoken", accesstoken);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/invite/{accesstoken}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

    public HttpResponse subscriptionInvitesDeleteInviteForHttpResponse(String subscriptionId, String accesstoken, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionInvitesDeleteInvite");
        }// verify the required parameter 'accesstoken' is set
        if (accesstoken == null) {
            throw new IllegalArgumentException("Missing the required parameter 'accesstoken' when calling subscriptionInvitesDeleteInvite");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        uriVariables.put("accesstoken", accesstoken);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/invite/{accesstoken}");

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
    * Get list of invites in a subscription,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.
    * <p><b>200</b> - Succesfully added
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription or user is not found
    * <p><b>500</b> - Exception thrown
    * @param subscriptionId Idenitifier of subscription
    * @return SubscriptionInvitesVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionInvitesVM subscriptionInvitesGetInvites(String subscriptionId) throws IOException {
        HttpResponse response = subscriptionInvitesGetInvitesForHttpResponse(subscriptionId);
        TypeReference<SubscriptionInvitesVM> typeRef = new TypeReference<SubscriptionInvitesVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get list of invites in a subscription,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.
    * <p><b>200</b> - Succesfully added
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription or user is not found
    * <p><b>500</b> - Exception thrown
    * @param subscriptionId Idenitifier of subscription
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionInvitesVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionInvitesVM subscriptionInvitesGetInvites(String subscriptionId, Map<String, Object> params) throws IOException {
        HttpResponse response = subscriptionInvitesGetInvitesForHttpResponse(subscriptionId, params);
        TypeReference<SubscriptionInvitesVM> typeRef = new TypeReference<SubscriptionInvitesVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse subscriptionInvitesGetInvitesForHttpResponse(String subscriptionId) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionInvitesGetInvites");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/invites");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse subscriptionInvitesGetInvitesForHttpResponse(String subscriptionId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionInvitesGetInvites");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/invites");

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
