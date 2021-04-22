package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import cloud.fastreport.model.DefaultPermissions;
import cloud.fastreport.model.DefaultPermissionsVM;
import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.RenameSubscriptionVM;
import cloud.fastreport.model.SubscriptionPermissions;
import cloud.fastreport.model.SubscriptionPermissionsVM;
import cloud.fastreport.model.SubscriptionVM;
import cloud.fastreport.model.SubscriptionsVM;
import cloud.fastreport.model.UpdateDefaultPermissionsVM;
import cloud.fastreport.model.UpdateSubscriptionLocaleVM;

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
public class SubscriptionsApi {
    private ApiClient apiClient;

    public SubscriptionsApi() {
        this(new ApiClient());
    }

    public SubscriptionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Add permissions for a subscription
    * <p><b>200</b> - Succesfully added
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>402</b> - Subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription is not found
    * @param id The id parameter
    * @param permissionsVM The permissionsVM parameter
    * @return SubscriptionPermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPermissions subscriptionsAddPermission(String id, SubscriptionPermissionsVM permissionsVM) throws IOException {
        HttpResponse response = subscriptionsAddPermissionForHttpResponse(id, permissionsVM);
        TypeReference<SubscriptionPermissions> typeRef = new TypeReference<SubscriptionPermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Add permissions for a subscription
    * <p><b>200</b> - Succesfully added
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>402</b> - Subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription is not found
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionPermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPermissions subscriptionsAddPermission(SubscriptionPermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = subscriptionsAddPermissionForHttpResponse(permissionsVM, id, params);
        TypeReference<SubscriptionPermissions> typeRef = new TypeReference<SubscriptionPermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse subscriptionsAddPermissionForHttpResponse(String id, SubscriptionPermissionsVM permissionsVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling subscriptionsAddPermission");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(permissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse subscriptionsAddPermissionForHttpResponse(String id, java.io.InputStream permissionsVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling subscriptionsAddPermission");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = permissionsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, permissionsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse subscriptionsAddPermissionForHttpResponse(SubscriptionPermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling subscriptionsAddPermission");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{id}/permissions");

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
    * Get subscription&#39;s default permissions for new entities
    * <p><b>200</b> - Successfully returned
    * <p><b>400</b> - Request is wrong
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - Not enough permissions
    * <p><b>404</b> - there is no subscription with such id
    * @param subscriptionId id
    * @return DefaultPermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DefaultPermissions subscriptionsGetDefaultPermissions(String subscriptionId) throws IOException {
        HttpResponse response = subscriptionsGetDefaultPermissionsForHttpResponse(subscriptionId);
        TypeReference<DefaultPermissions> typeRef = new TypeReference<DefaultPermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get subscription&#39;s default permissions for new entities
    * <p><b>200</b> - Successfully returned
    * <p><b>400</b> - Request is wrong
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - Not enough permissions
    * <p><b>404</b> - there is no subscription with such id
    * @param subscriptionId id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DefaultPermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DefaultPermissions subscriptionsGetDefaultPermissions(String subscriptionId, Map<String, Object> params) throws IOException {
        HttpResponse response = subscriptionsGetDefaultPermissionsForHttpResponse(subscriptionId, params);
        TypeReference<DefaultPermissions> typeRef = new TypeReference<DefaultPermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse subscriptionsGetDefaultPermissionsForHttpResponse(String subscriptionId) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionsGetDefaultPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/defaultPermissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse subscriptionsGetDefaultPermissionsForHttpResponse(String subscriptionId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionsGetDefaultPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/defaultPermissions");

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
    * Get permissions for a subscription by id
    * <p><b>200</b> - Succesfully returned
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * @param id The id parameter
    * @return SubscriptionPermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPermissions subscriptionsGetPermissions(String id) throws IOException {
        HttpResponse response = subscriptionsGetPermissionsForHttpResponse(id);
        TypeReference<SubscriptionPermissions> typeRef = new TypeReference<SubscriptionPermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get permissions for a subscription by id
    * <p><b>200</b> - Succesfully returned
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionPermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPermissions subscriptionsGetPermissions(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = subscriptionsGetPermissionsForHttpResponse(id, params);
        TypeReference<SubscriptionPermissions> typeRef = new TypeReference<SubscriptionPermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse subscriptionsGetPermissionsForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling subscriptionsGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse subscriptionsGetPermissionsForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling subscriptionsGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{id}/permissions");

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
    * Returns the subscription by id
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription is not found
    * @param id Identifier of subscription
    * @return SubscriptionVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionVM subscriptionsGetSubscription(String id) throws IOException {
        HttpResponse response = subscriptionsGetSubscriptionForHttpResponse(id);
        TypeReference<SubscriptionVM> typeRef = new TypeReference<SubscriptionVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns the subscription by id
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription is not found
    * @param id Identifier of subscription
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionVM subscriptionsGetSubscription(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = subscriptionsGetSubscriptionForHttpResponse(id, params);
        TypeReference<SubscriptionVM> typeRef = new TypeReference<SubscriptionVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse subscriptionsGetSubscriptionForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling subscriptionsGetSubscription");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse subscriptionsGetSubscriptionForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling subscriptionsGetSubscription");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{id}");

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
    * Returns a list of all subscriptions of current user
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - unrealistic skip &#39;n take provided
    * @param skip Variable for pagination, defautl value is 0
    * @param take Variable for pagination, default value is 10
    * @return SubscriptionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionsVM subscriptionsGetSubscriptions(Integer skip, Integer take) throws IOException {
        HttpResponse response = subscriptionsGetSubscriptionsForHttpResponse(skip, take);
        TypeReference<SubscriptionsVM> typeRef = new TypeReference<SubscriptionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns a list of all subscriptions of current user
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - unrealistic skip &#39;n take provided
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionsVM subscriptionsGetSubscriptions(Map<String, Object> params) throws IOException {
        HttpResponse response = subscriptionsGetSubscriptionsForHttpResponse(params);
        TypeReference<SubscriptionsVM> typeRef = new TypeReference<SubscriptionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse subscriptionsGetSubscriptionsForHttpResponse(Integer skip, Integer take) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions");
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

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse subscriptionsGetSubscriptionsForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions");

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
    * Rename subscription
    * <p><b>200</b> - Successfully renamed
    * <p><b>400</b> - Request is wrong
    * <p><b>402</b> - Subscription is outdated
    * <p><b>403</b> - Not enough permissions
    * <p><b>404</b> - there is no subscription with such id (or user have no permission)
    * @param subscriptionId id
    * @param renameSubscriptionVM rename VM
    * @return SubscriptionVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionVM subscriptionsRenameSubscription(String subscriptionId, RenameSubscriptionVM renameSubscriptionVM) throws IOException {
        HttpResponse response = subscriptionsRenameSubscriptionForHttpResponse(subscriptionId, renameSubscriptionVM);
        TypeReference<SubscriptionVM> typeRef = new TypeReference<SubscriptionVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Rename subscription
    * <p><b>200</b> - Successfully renamed
    * <p><b>400</b> - Request is wrong
    * <p><b>402</b> - Subscription is outdated
    * <p><b>403</b> - Not enough permissions
    * <p><b>404</b> - there is no subscription with such id (or user have no permission)
    * @param subscriptionId id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionVM subscriptionsRenameSubscription(RenameSubscriptionVM renameSubscriptionVM, String subscriptionId, Map<String, Object> params) throws IOException {
        HttpResponse response = subscriptionsRenameSubscriptionForHttpResponse(renameSubscriptionVM, subscriptionId, params);
        TypeReference<SubscriptionVM> typeRef = new TypeReference<SubscriptionVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse subscriptionsRenameSubscriptionForHttpResponse(String subscriptionId, RenameSubscriptionVM renameSubscriptionVM) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionsRenameSubscription");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/rename");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(renameSubscriptionVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse subscriptionsRenameSubscriptionForHttpResponse(String subscriptionId, java.io.InputStream renameSubscriptionVM, String mediaType) throws IOException {
          // verify the required parameter 'subscriptionId' is set
              if (subscriptionId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionsRenameSubscription");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("subscriptionId", subscriptionId);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/rename");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = renameSubscriptionVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, renameSubscriptionVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse subscriptionsRenameSubscriptionForHttpResponse(RenameSubscriptionVM renameSubscriptionVM, String subscriptionId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionsRenameSubscription");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/rename");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(renameSubscriptionVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


  /**
    * Remove permissions from a subscription
    * <p><b>200</b> - Succesfully removed
    * <p><b>204</b> - happens sometimes
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription is not found
    * @param id The id parameter
    * @param permissionsVM The permissionsVM parameter
    * @return SubscriptionPermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPermissions subscriptionsRevokePermission(String id, SubscriptionPermissionsVM permissionsVM) throws IOException {
        HttpResponse response = subscriptionsRevokePermissionForHttpResponse(id, permissionsVM);
        TypeReference<SubscriptionPermissions> typeRef = new TypeReference<SubscriptionPermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Remove permissions from a subscription
    * <p><b>200</b> - Succesfully removed
    * <p><b>204</b> - happens sometimes
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription is not found
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionPermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPermissions subscriptionsRevokePermission(SubscriptionPermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = subscriptionsRevokePermissionForHttpResponse(permissionsVM, id, params);
        TypeReference<SubscriptionPermissions> typeRef = new TypeReference<SubscriptionPermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse subscriptionsRevokePermissionForHttpResponse(String id, SubscriptionPermissionsVM permissionsVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling subscriptionsRevokePermission");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

      public HttpResponse subscriptionsRevokePermissionForHttpResponse(String id, java.io.InputStream permissionsVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling subscriptionsRevokePermission");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = permissionsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, permissionsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
      }

    public HttpResponse subscriptionsRevokePermissionForHttpResponse(SubscriptionPermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling subscriptionsRevokePermission");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{id}/permissions");

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
    * Change subscription&#39;s default permissions for new entities
    * <p><b>200</b> - Successfully changed
    * <p><b>400</b> - Request is wrong
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - Not enough permissions
    * <p><b>404</b> - there is no subscription with such id
    * @param subscriptionId id
    * @param permissionsVM update default permissions VM
    * @return DefaultPermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DefaultPermissionsVM subscriptionsUpdateDefaultPermissions(String subscriptionId, UpdateDefaultPermissionsVM permissionsVM) throws IOException {
        HttpResponse response = subscriptionsUpdateDefaultPermissionsForHttpResponse(subscriptionId, permissionsVM);
        TypeReference<DefaultPermissionsVM> typeRef = new TypeReference<DefaultPermissionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Change subscription&#39;s default permissions for new entities
    * <p><b>200</b> - Successfully changed
    * <p><b>400</b> - Request is wrong
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - Not enough permissions
    * <p><b>404</b> - there is no subscription with such id
    * @param subscriptionId id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DefaultPermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DefaultPermissionsVM subscriptionsUpdateDefaultPermissions(UpdateDefaultPermissionsVM permissionsVM, String subscriptionId, Map<String, Object> params) throws IOException {
        HttpResponse response = subscriptionsUpdateDefaultPermissionsForHttpResponse(permissionsVM, subscriptionId, params);
        TypeReference<DefaultPermissionsVM> typeRef = new TypeReference<DefaultPermissionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse subscriptionsUpdateDefaultPermissionsForHttpResponse(String subscriptionId, UpdateDefaultPermissionsVM permissionsVM) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionsUpdateDefaultPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/defaultPermissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(permissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse subscriptionsUpdateDefaultPermissionsForHttpResponse(String subscriptionId, java.io.InputStream permissionsVM, String mediaType) throws IOException {
          // verify the required parameter 'subscriptionId' is set
              if (subscriptionId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionsUpdateDefaultPermissions");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("subscriptionId", subscriptionId);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/defaultPermissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = permissionsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, permissionsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse subscriptionsUpdateDefaultPermissionsForHttpResponse(UpdateDefaultPermissionsVM permissionsVM, String subscriptionId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionsUpdateDefaultPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/defaultPermissions");

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
    * Update subscription&#39;s default locale
    * <p><b>200</b> - Successfully renamed
    * <p><b>400</b> - Request is wrong
    * <p><b>402</b> - Subscription is outdated
    * <p><b>403</b> - Not enough permissions
    * <p><b>404</b> - there is no subscription with such id (or user have no permission)
    * @param subscriptionId id
    * @param updateModel update VM
    * @return SubscriptionVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionVM subscriptionsUpdateLocale(String subscriptionId, UpdateSubscriptionLocaleVM updateModel) throws IOException {
        HttpResponse response = subscriptionsUpdateLocaleForHttpResponse(subscriptionId, updateModel);
        TypeReference<SubscriptionVM> typeRef = new TypeReference<SubscriptionVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update subscription&#39;s default locale
    * <p><b>200</b> - Successfully renamed
    * <p><b>400</b> - Request is wrong
    * <p><b>402</b> - Subscription is outdated
    * <p><b>403</b> - Not enough permissions
    * <p><b>404</b> - there is no subscription with such id (or user have no permission)
    * @param subscriptionId id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionVM subscriptionsUpdateLocale(UpdateSubscriptionLocaleVM updateModel, String subscriptionId, Map<String, Object> params) throws IOException {
        HttpResponse response = subscriptionsUpdateLocaleForHttpResponse(updateModel, subscriptionId, params);
        TypeReference<SubscriptionVM> typeRef = new TypeReference<SubscriptionVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse subscriptionsUpdateLocaleForHttpResponse(String subscriptionId, UpdateSubscriptionLocaleVM updateModel) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionsUpdateLocale");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/Locale");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(updateModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse subscriptionsUpdateLocaleForHttpResponse(String subscriptionId, java.io.InputStream updateModel, String mediaType) throws IOException {
          // verify the required parameter 'subscriptionId' is set
              if (subscriptionId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionsUpdateLocale");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("subscriptionId", subscriptionId);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/Locale");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = updateModel == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, updateModel);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse subscriptionsUpdateLocaleForHttpResponse(UpdateSubscriptionLocaleVM updateModel, String subscriptionId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionsUpdateLocale");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/Locale");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(updateModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


}
