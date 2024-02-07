package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import cloud.fastreport.model.DefaultPermissionsVM;
import cloud.fastreport.model.MyPermissionsVM;
import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.RenameSubscriptionVM;
import cloud.fastreport.model.SubscriptionPermissionsVM;
import cloud.fastreport.model.SubscriptionVM;
import cloud.fastreport.model.SubscriptionsVM;
import cloud.fastreport.model.UpdateDefaultPermissionsVM;
import cloud.fastreport.model.UpdateSubscriptionLocaleVM;
import cloud.fastreport.model.UpdateSubscriptionPermissionsVM;

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
    * Get subscription&#39;s default permissions for new entities
    * <p><b>200</b> - Successfully returned
    * <p><b>400</b> - Request is wrong
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - Not enough permissions
    * <p><b>404</b> - there is no subscription with such id
    * @param subscriptionId id
    * @return DefaultPermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DefaultPermissionsVM subscriptionsGetDefaultPermissions(String subscriptionId) throws IOException {
        HttpResponse response = subscriptionsGetDefaultPermissionsForHttpResponse(subscriptionId);
        TypeReference<DefaultPermissionsVM> typeRef = new TypeReference<DefaultPermissionsVM>() {};
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
    * @return DefaultPermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DefaultPermissionsVM subscriptionsGetDefaultPermissions(String subscriptionId, Map<String, Object> params) throws IOException {
        HttpResponse response = subscriptionsGetDefaultPermissionsForHttpResponse(subscriptionId, params);
        TypeReference<DefaultPermissionsVM> typeRef = new TypeReference<DefaultPermissionsVM>() {};
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }


  /**
    * Get user&#39;s permissions for a subscription by id
    * <p><b>200</b> - Succesfully returned
    * @param subId subscription id
    * @return MyPermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public MyPermissionsVM subscriptionsGetMyPermissions(String subId) throws IOException {
        HttpResponse response = subscriptionsGetMyPermissionsForHttpResponse(subId);
        TypeReference<MyPermissionsVM> typeRef = new TypeReference<MyPermissionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get user&#39;s permissions for a subscription by id
    * <p><b>200</b> - Succesfully returned
    * @param subId subscription id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return MyPermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public MyPermissionsVM subscriptionsGetMyPermissions(String subId, Map<String, Object> params) throws IOException {
        HttpResponse response = subscriptionsGetMyPermissionsForHttpResponse(subId, params);
        TypeReference<MyPermissionsVM> typeRef = new TypeReference<MyPermissionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse subscriptionsGetMyPermissionsForHttpResponse(String subId) throws IOException {
        // verify the required parameter 'subId' is set
        if (subId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subId' when calling subscriptionsGetMyPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subId", subId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subId}/mypermissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }

    public HttpResponse subscriptionsGetMyPermissionsForHttpResponse(String subId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subId' is set
        if (subId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subId' when calling subscriptionsGetMyPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subId", subId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subId}/mypermissions");

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
    * Get permissions for a subscription by id
    * <p><b>200</b> - Succesfully returned
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * @param id 
    * @return SubscriptionPermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPermissionsVM subscriptionsGetPermissions(String id) throws IOException {
        HttpResponse response = subscriptionsGetPermissionsForHttpResponse(id);
        TypeReference<SubscriptionPermissionsVM> typeRef = new TypeReference<SubscriptionPermissionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get permissions for a subscription by id
    * <p><b>200</b> - Succesfully returned
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * @param id 
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionPermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPermissionsVM subscriptionsGetPermissions(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = subscriptionsGetPermissionsForHttpResponse(id, params);
        TypeReference<SubscriptionPermissionsVM> typeRef = new TypeReference<SubscriptionPermissionsVM>() {};
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
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
    * @param renameSubscriptionVM rename VM
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionVM subscriptionsRenameSubscription(String subscriptionId, RenameSubscriptionVM renameSubscriptionVM, Map<String, Object> params) throws IOException {
        HttpResponse response = subscriptionsRenameSubscriptionForHttpResponse(subscriptionId, renameSubscriptionVM, params);
        TypeReference<SubscriptionVM> typeRef = new TypeReference<SubscriptionVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse subscriptionsRenameSubscriptionForHttpResponse(String subscriptionId, RenameSubscriptionVM renameSubscriptionVM) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionsRenameSubscription");
        }// verify the required parameter 'renameSubscriptionVM' is set
        if (renameSubscriptionVM == null) {
            throw new IllegalArgumentException("Missing the required parameter 'renameSubscriptionVM' when calling subscriptionsRenameSubscription");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/rename");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(renameSubscriptionVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
    }

      public HttpResponse subscriptionsRenameSubscriptionForHttpResponse(String subscriptionId, java.io.InputStream renameSubscriptionVM, String mediaType) throws IOException {
          // verify the required parameter 'subscriptionId' is set
              if (subscriptionId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionsRenameSubscription");
              }// verify the required parameter 'renameSubscriptionVM' is set
              if (renameSubscriptionVM == null) {
              throw new IllegalArgumentException("Missing the required parameter 'renameSubscriptionVM' when calling subscriptionsRenameSubscription");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("subscriptionId", subscriptionId);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/rename");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent aContent = renameSubscriptionVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, renameSubscriptionVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
      }

    public HttpResponse subscriptionsRenameSubscriptionForHttpResponse(String subscriptionId, RenameSubscriptionVM renameSubscriptionVM, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionsRenameSubscription");
        }// verify the required parameter 'renameSubscriptionVM' is set
        if (renameSubscriptionVM == null) {
            throw new IllegalArgumentException("Missing the required parameter 'renameSubscriptionVM' when calling subscriptionsRenameSubscription");
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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(renameSubscriptionVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
    }


  /**
    * Change subscription&#39;s default permissions for new entities
    * <p><b>200</b> - Successfully changed
    * <p><b>400</b> - Request is wrong
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - Not enough permissions
    * <p><b>404</b> - there is no subscription with such id
    * @param subscriptionId id
    * @param updateDefaultPermissionsVM update default permissions VM
    * @return DefaultPermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DefaultPermissionsVM subscriptionsUpdateDefaultPermissions(String subscriptionId, UpdateDefaultPermissionsVM updateDefaultPermissionsVM) throws IOException {
        HttpResponse response = subscriptionsUpdateDefaultPermissionsForHttpResponse(subscriptionId, updateDefaultPermissionsVM);
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
    * @param updateDefaultPermissionsVM update default permissions VM
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DefaultPermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DefaultPermissionsVM subscriptionsUpdateDefaultPermissions(String subscriptionId, UpdateDefaultPermissionsVM updateDefaultPermissionsVM, Map<String, Object> params) throws IOException {
        HttpResponse response = subscriptionsUpdateDefaultPermissionsForHttpResponse(subscriptionId, updateDefaultPermissionsVM, params);
        TypeReference<DefaultPermissionsVM> typeRef = new TypeReference<DefaultPermissionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse subscriptionsUpdateDefaultPermissionsForHttpResponse(String subscriptionId, UpdateDefaultPermissionsVM updateDefaultPermissionsVM) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionsUpdateDefaultPermissions");
        }// verify the required parameter 'updateDefaultPermissionsVM' is set
        if (updateDefaultPermissionsVM == null) {
            throw new IllegalArgumentException("Missing the required parameter 'updateDefaultPermissionsVM' when calling subscriptionsUpdateDefaultPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/defaultPermissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(updateDefaultPermissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
    }

      public HttpResponse subscriptionsUpdateDefaultPermissionsForHttpResponse(String subscriptionId, java.io.InputStream updateDefaultPermissionsVM, String mediaType) throws IOException {
          // verify the required parameter 'subscriptionId' is set
              if (subscriptionId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionsUpdateDefaultPermissions");
              }// verify the required parameter 'updateDefaultPermissionsVM' is set
              if (updateDefaultPermissionsVM == null) {
              throw new IllegalArgumentException("Missing the required parameter 'updateDefaultPermissionsVM' when calling subscriptionsUpdateDefaultPermissions");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("subscriptionId", subscriptionId);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/defaultPermissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent aContent = updateDefaultPermissionsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, updateDefaultPermissionsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
      }

    public HttpResponse subscriptionsUpdateDefaultPermissionsForHttpResponse(String subscriptionId, UpdateDefaultPermissionsVM updateDefaultPermissionsVM, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionsUpdateDefaultPermissions");
        }// verify the required parameter 'updateDefaultPermissionsVM' is set
        if (updateDefaultPermissionsVM == null) {
            throw new IllegalArgumentException("Missing the required parameter 'updateDefaultPermissionsVM' when calling subscriptionsUpdateDefaultPermissions");
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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(updateDefaultPermissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
    }


  /**
    * Update subscription&#39;s default locale
    * <p><b>200</b> - Successfully renamed
    * <p><b>400</b> - Request is wrong
    * <p><b>402</b> - Subscription is outdated
    * <p><b>403</b> - Not enough permissions
    * <p><b>404</b> - there is no subscription with such id (or user have no permission)
    * @param subscriptionId id
    * @param updateSubscriptionLocaleVM update VM
    * @return SubscriptionVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionVM subscriptionsUpdateLocale(String subscriptionId, UpdateSubscriptionLocaleVM updateSubscriptionLocaleVM) throws IOException {
        HttpResponse response = subscriptionsUpdateLocaleForHttpResponse(subscriptionId, updateSubscriptionLocaleVM);
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
    * @param updateSubscriptionLocaleVM update VM
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionVM subscriptionsUpdateLocale(String subscriptionId, UpdateSubscriptionLocaleVM updateSubscriptionLocaleVM, Map<String, Object> params) throws IOException {
        HttpResponse response = subscriptionsUpdateLocaleForHttpResponse(subscriptionId, updateSubscriptionLocaleVM, params);
        TypeReference<SubscriptionVM> typeRef = new TypeReference<SubscriptionVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse subscriptionsUpdateLocaleForHttpResponse(String subscriptionId, UpdateSubscriptionLocaleVM updateSubscriptionLocaleVM) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionsUpdateLocale");
        }// verify the required parameter 'updateSubscriptionLocaleVM' is set
        if (updateSubscriptionLocaleVM == null) {
            throw new IllegalArgumentException("Missing the required parameter 'updateSubscriptionLocaleVM' when calling subscriptionsUpdateLocale");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/Locale");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(updateSubscriptionLocaleVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
    }

      public HttpResponse subscriptionsUpdateLocaleForHttpResponse(String subscriptionId, java.io.InputStream updateSubscriptionLocaleVM, String mediaType) throws IOException {
          // verify the required parameter 'subscriptionId' is set
              if (subscriptionId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionsUpdateLocale");
              }// verify the required parameter 'updateSubscriptionLocaleVM' is set
              if (updateSubscriptionLocaleVM == null) {
              throw new IllegalArgumentException("Missing the required parameter 'updateSubscriptionLocaleVM' when calling subscriptionsUpdateLocale");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("subscriptionId", subscriptionId);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{subscriptionId}/Locale");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent aContent = updateSubscriptionLocaleVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, updateSubscriptionLocaleVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
      }

    public HttpResponse subscriptionsUpdateLocaleForHttpResponse(String subscriptionId, UpdateSubscriptionLocaleVM updateSubscriptionLocaleVM, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling subscriptionsUpdateLocale");
        }// verify the required parameter 'updateSubscriptionLocaleVM' is set
        if (updateSubscriptionLocaleVM == null) {
            throw new IllegalArgumentException("Missing the required parameter 'updateSubscriptionLocaleVM' when calling subscriptionsUpdateLocale");
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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(updateSubscriptionLocaleVM);
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
    * @param updateSubscriptionPermissionsVM 
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void subscriptionsUpdatePermissions(String id, UpdateSubscriptionPermissionsVM updateSubscriptionPermissionsVM) throws IOException {
        subscriptionsUpdatePermissionsForHttpResponse(id, updateSubscriptionPermissionsVM);
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
    public void subscriptionsUpdatePermissions(UpdateSubscriptionPermissionsVM updateSubscriptionPermissionsVM, String id, Map<String, Object> params) throws IOException {
        subscriptionsUpdatePermissionsForHttpResponse(updateSubscriptionPermissionsVM, id, params);
    }

    public HttpResponse subscriptionsUpdatePermissionsForHttpResponse(String id, UpdateSubscriptionPermissionsVM updateSubscriptionPermissionsVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling subscriptionsUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(updateSubscriptionPermissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }

      public HttpResponse subscriptionsUpdatePermissionsForHttpResponse(String id, java.io.InputStream updateSubscriptionPermissionsVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling subscriptionsUpdatePermissions");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Subscriptions/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent aContent = updateSubscriptionPermissionsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, updateSubscriptionPermissionsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
      }

    public HttpResponse subscriptionsUpdatePermissionsForHttpResponse(UpdateSubscriptionPermissionsVM updateSubscriptionPermissionsVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling subscriptionsUpdatePermissions");
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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(updateSubscriptionPermissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }


}
