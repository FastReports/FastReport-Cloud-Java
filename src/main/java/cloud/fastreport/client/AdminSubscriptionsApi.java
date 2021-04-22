package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import cloud.fastreport.model.AdminSubscriptionVM;
import cloud.fastreport.model.AdminSubscriptionsVM;
import cloud.fastreport.model.CreateSubscriptionVM;
import org.threeten.bp.OffsetDateTime;
import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.SubscriptionPermissions;
import cloud.fastreport.model.SubscriptionPermissionsVM;
import cloud.fastreport.model.UpdateSubscriptionVM;

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
public class AdminSubscriptionsApi {
    private ApiClient apiClient;

    public AdminSubscriptionsApi() {
        this(new ApiClient());
    }

    public AdminSubscriptionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Add permissions to subscription
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id subscription id
    * @param permissionsVM permissions VM
    * @return SubscriptionPermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPermissions adminSubscriptionsAddPermission(String id, SubscriptionPermissionsVM permissionsVM) throws IOException {
        HttpResponse response = adminSubscriptionsAddPermissionForHttpResponse(id, permissionsVM);
        TypeReference<SubscriptionPermissions> typeRef = new TypeReference<SubscriptionPermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Add permissions to subscription
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id subscription id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionPermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPermissions adminSubscriptionsAddPermission(SubscriptionPermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminSubscriptionsAddPermissionForHttpResponse(permissionsVM, id, params);
        TypeReference<SubscriptionPermissions> typeRef = new TypeReference<SubscriptionPermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminSubscriptionsAddPermissionForHttpResponse(String id, SubscriptionPermissionsVM permissionsVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminSubscriptionsAddPermission");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Subscriptions/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(permissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse adminSubscriptionsAddPermissionForHttpResponse(String id, java.io.InputStream permissionsVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminSubscriptionsAddPermission");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Subscriptions/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = permissionsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, permissionsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse adminSubscriptionsAddPermissionForHttpResponse(SubscriptionPermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminSubscriptionsAddPermission");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Subscriptions/{id}/permissions");

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
    * Create a new subscription based on some plan
    * <p><b>200</b> - Succesfully created
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription plan is not found
    * @param viewModel View model
    * @return AdminSubscriptionVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AdminSubscriptionVM adminSubscriptionsCreateSubscription(CreateSubscriptionVM viewModel) throws IOException {
        HttpResponse response = adminSubscriptionsCreateSubscriptionForHttpResponse(viewModel);
        TypeReference<AdminSubscriptionVM> typeRef = new TypeReference<AdminSubscriptionVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create a new subscription based on some plan
    * <p><b>200</b> - Succesfully created
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription plan is not found
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return AdminSubscriptionVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AdminSubscriptionVM adminSubscriptionsCreateSubscription(CreateSubscriptionVM viewModel, Map<String, Object> params) throws IOException {
        HttpResponse response = adminSubscriptionsCreateSubscriptionForHttpResponse(viewModel, params);
        TypeReference<AdminSubscriptionVM> typeRef = new TypeReference<AdminSubscriptionVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminSubscriptionsCreateSubscriptionForHttpResponse(CreateSubscriptionVM viewModel) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Subscriptions");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(viewModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse adminSubscriptionsCreateSubscriptionForHttpResponse(java.io.InputStream viewModel, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Subscriptions");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = viewModel == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, viewModel);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse adminSubscriptionsCreateSubscriptionForHttpResponse(CreateSubscriptionVM viewModel, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Subscriptions");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(viewModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Delete the subscription by id
    * <p><b>204</b> - Succesfully deleted
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription is not found
    * @param id Identifier of subscription
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void adminSubscriptionsDeleteSubscription(String id) throws IOException {
        adminSubscriptionsDeleteSubscriptionForHttpResponse(id);
    }

  /**
    * Delete the subscription by id
    * <p><b>204</b> - Succesfully deleted
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription is not found
    * @param id Identifier of subscription
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void adminSubscriptionsDeleteSubscription(String id, Map<String, Object> params) throws IOException {
        adminSubscriptionsDeleteSubscriptionForHttpResponse(id, params);
    }

    public HttpResponse adminSubscriptionsDeleteSubscriptionForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminSubscriptionsDeleteSubscription");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Subscriptions/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

    public HttpResponse adminSubscriptionsDeleteSubscriptionForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminSubscriptionsDeleteSubscription");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Subscriptions/{id}");

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
    * Returns a key-value pair of new(renew) subscriptions count per month for a specified time span: (month, number of new subscriptions)
    * If no subscriptions, then the endpoint will return empty dic
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * @param from A starting date for stats calculation
    * @param to An ending date for stats calculation
    * @return Map&lt;String, Integer&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Map<String, Integer> adminSubscriptionsGetNewSibscriptionsPerMonth(OffsetDateTime from, OffsetDateTime to) throws IOException {
        HttpResponse response = adminSubscriptionsGetNewSibscriptionsPerMonthForHttpResponse(from, to);
        TypeReference<Map<String, Integer>> typeRef = new TypeReference<Map<String, Integer>>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns a key-value pair of new(renew) subscriptions count per month for a specified time span: (month, number of new subscriptions)
    * If no subscriptions, then the endpoint will return empty dic
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * @param from A starting date for stats calculation
    * @param to An ending date for stats calculation
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Map&lt;String, Integer&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Map<String, Integer> adminSubscriptionsGetNewSibscriptionsPerMonth(OffsetDateTime from, OffsetDateTime to, Map<String, Object> params) throws IOException {
        HttpResponse response = adminSubscriptionsGetNewSibscriptionsPerMonthForHttpResponse(from, to, params);
        TypeReference<Map<String, Integer>> typeRef = new TypeReference<Map<String, Integer>>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminSubscriptionsGetNewSibscriptionsPerMonthForHttpResponse(OffsetDateTime from, OffsetDateTime to) throws IOException {
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new IllegalArgumentException("Missing the required parameter 'from' when calling adminSubscriptionsGetNewSibscriptionsPerMonth");
        }// verify the required parameter 'to' is set
        if (to == null) {
            throw new IllegalArgumentException("Missing the required parameter 'to' when calling adminSubscriptionsGetNewSibscriptionsPerMonth");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("from", from);
        uriVariables.put("to", to);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Subscriptions/stat/new/{from}/{to}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse adminSubscriptionsGetNewSibscriptionsPerMonthForHttpResponse(OffsetDateTime from, OffsetDateTime to, Map<String, Object> params) throws IOException {
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new IllegalArgumentException("Missing the required parameter 'from' when calling adminSubscriptionsGetNewSibscriptionsPerMonth");
        }// verify the required parameter 'to' is set
        if (to == null) {
            throw new IllegalArgumentException("Missing the required parameter 'to' when calling adminSubscriptionsGetNewSibscriptionsPerMonth");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("from", from);
        uriVariables.put("to", to);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Subscriptions/stat/new/{from}/{to}");

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
    * Get all subscription permissions
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * @param id The id parameter
    * @return SubscriptionPermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPermissions adminSubscriptionsGetPermissions(String id) throws IOException {
        HttpResponse response = adminSubscriptionsGetPermissionsForHttpResponse(id);
        TypeReference<SubscriptionPermissions> typeRef = new TypeReference<SubscriptionPermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all subscription permissions
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionPermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPermissions adminSubscriptionsGetPermissions(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminSubscriptionsGetPermissionsForHttpResponse(id, params);
        TypeReference<SubscriptionPermissions> typeRef = new TypeReference<SubscriptionPermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminSubscriptionsGetPermissionsForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminSubscriptionsGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Subscriptions/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse adminSubscriptionsGetPermissionsForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminSubscriptionsGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Subscriptions/{id}/permissions");

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
    * <p><b>500</b> - exception caught
    * @param id Identifier of subscription
    * @return AdminSubscriptionVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AdminSubscriptionVM adminSubscriptionsGetSubscription(String id) throws IOException {
        HttpResponse response = adminSubscriptionsGetSubscriptionForHttpResponse(id);
        TypeReference<AdminSubscriptionVM> typeRef = new TypeReference<AdminSubscriptionVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns the subscription by id
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription is not found
    * <p><b>500</b> - exception caught
    * @param id Identifier of subscription
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return AdminSubscriptionVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AdminSubscriptionVM adminSubscriptionsGetSubscription(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminSubscriptionsGetSubscriptionForHttpResponse(id, params);
        TypeReference<AdminSubscriptionVM> typeRef = new TypeReference<AdminSubscriptionVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminSubscriptionsGetSubscriptionForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminSubscriptionsGetSubscription");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Subscriptions/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse adminSubscriptionsGetSubscriptionForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminSubscriptionsGetSubscription");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Subscriptions/{id}");

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
    * Returns a list of all subscriptions
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * @param skip Variable for pagination, defautl value is 0
    * @param take Variable for pagination, default value is 10
    * @return AdminSubscriptionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AdminSubscriptionsVM adminSubscriptionsGetSubscriptions(Integer skip, Integer take) throws IOException {
        HttpResponse response = adminSubscriptionsGetSubscriptionsForHttpResponse(skip, take);
        TypeReference<AdminSubscriptionsVM> typeRef = new TypeReference<AdminSubscriptionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns a list of all subscriptions
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return AdminSubscriptionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AdminSubscriptionsVM adminSubscriptionsGetSubscriptions(Map<String, Object> params) throws IOException {
        HttpResponse response = adminSubscriptionsGetSubscriptionsForHttpResponse(params);
        TypeReference<AdminSubscriptionsVM> typeRef = new TypeReference<AdminSubscriptionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminSubscriptionsGetSubscriptionsForHttpResponse(Integer skip, Integer take) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Subscriptions");
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

    public HttpResponse adminSubscriptionsGetSubscriptionsForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Subscriptions");

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
    * Recount subscription&#39;s files and folders size
    * <p><b>200</b> - Succesfully recounted
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription is not found
    * <p><b>500</b> - exception caught
    * @param id Identifier of subscription
    * @param collectionNames collection names to recount listed through &#39;,&#39; sign
    * @return Map&lt;String, Long&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Map<String, Long> adminSubscriptionsReCountSubscription(String id, String collectionNames) throws IOException {
        HttpResponse response = adminSubscriptionsReCountSubscriptionForHttpResponse(id, collectionNames);
        TypeReference<Map<String, Long>> typeRef = new TypeReference<Map<String, Long>>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Recount subscription&#39;s files and folders size
    * <p><b>200</b> - Succesfully recounted
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription is not found
    * <p><b>500</b> - exception caught
    * @param id Identifier of subscription
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Map&lt;String, Long&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Map<String, Long> adminSubscriptionsReCountSubscription(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminSubscriptionsReCountSubscriptionForHttpResponse(id, params);
        TypeReference<Map<String, Long>> typeRef = new TypeReference<Map<String, Long>>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminSubscriptionsReCountSubscriptionForHttpResponse(String id, String collectionNames) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminSubscriptionsReCountSubscription");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Subscriptions/{id}/recount");
        if (collectionNames != null) {
            String key = "collectionNames";
            Object value = collectionNames;
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

    public HttpResponse adminSubscriptionsReCountSubscriptionForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminSubscriptionsReCountSubscription");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Subscriptions/{id}/recount");

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
    * Revoke permissions to subscription
    * <p><b>200</b> - Success
    * <p><b>204</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id subscription id
    * @param permissionsVM permissions VM
    * @return SubscriptionPermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPermissions adminSubscriptionsRevokePermission(String id, SubscriptionPermissionsVM permissionsVM) throws IOException {
        HttpResponse response = adminSubscriptionsRevokePermissionForHttpResponse(id, permissionsVM);
        TypeReference<SubscriptionPermissions> typeRef = new TypeReference<SubscriptionPermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Revoke permissions to subscription
    * <p><b>200</b> - Success
    * <p><b>204</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id subscription id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionPermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPermissions adminSubscriptionsRevokePermission(SubscriptionPermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminSubscriptionsRevokePermissionForHttpResponse(permissionsVM, id, params);
        TypeReference<SubscriptionPermissions> typeRef = new TypeReference<SubscriptionPermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminSubscriptionsRevokePermissionForHttpResponse(String id, SubscriptionPermissionsVM permissionsVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminSubscriptionsRevokePermission");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Subscriptions/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

      public HttpResponse adminSubscriptionsRevokePermissionForHttpResponse(String id, java.io.InputStream permissionsVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminSubscriptionsRevokePermission");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Subscriptions/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = permissionsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, permissionsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
      }

    public HttpResponse adminSubscriptionsRevokePermissionForHttpResponse(SubscriptionPermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminSubscriptionsRevokePermission");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Subscriptions/{id}/permissions");

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
    * Update permissions to subscription
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id subscription id
    * @param permissionsVM permissions VM
    * @return SubscriptionPermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPermissions adminSubscriptionsUpdatePermissions(String id, SubscriptionPermissions permissionsVM) throws IOException {
        HttpResponse response = adminSubscriptionsUpdatePermissionsForHttpResponse(id, permissionsVM);
        TypeReference<SubscriptionPermissions> typeRef = new TypeReference<SubscriptionPermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update permissions to subscription
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id subscription id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionPermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPermissions adminSubscriptionsUpdatePermissions(SubscriptionPermissions permissionsVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminSubscriptionsUpdatePermissionsForHttpResponse(permissionsVM, id, params);
        TypeReference<SubscriptionPermissions> typeRef = new TypeReference<SubscriptionPermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminSubscriptionsUpdatePermissionsForHttpResponse(String id, SubscriptionPermissions permissionsVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminSubscriptionsUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Subscriptions/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(permissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse adminSubscriptionsUpdatePermissionsForHttpResponse(String id, java.io.InputStream permissionsVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminSubscriptionsUpdatePermissions");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Subscriptions/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = permissionsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, permissionsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse adminSubscriptionsUpdatePermissionsForHttpResponse(SubscriptionPermissions permissionsVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminSubscriptionsUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Subscriptions/{id}/permissions");

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
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Update the subscription by id
    * <p><b>200</b> - Succesfully updated
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription is not found
    * <p><b>500</b> - exception caught
    * @param id Identifier of subscription
    * @param viewModel View model
    * @return AdminSubscriptionVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AdminSubscriptionVM adminSubscriptionsUpdateSubscription(String id, UpdateSubscriptionVM viewModel) throws IOException {
        HttpResponse response = adminSubscriptionsUpdateSubscriptionForHttpResponse(id, viewModel);
        TypeReference<AdminSubscriptionVM> typeRef = new TypeReference<AdminSubscriptionVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update the subscription by id
    * <p><b>200</b> - Succesfully updated
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription is not found
    * <p><b>500</b> - exception caught
    * @param id Identifier of subscription
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return AdminSubscriptionVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AdminSubscriptionVM adminSubscriptionsUpdateSubscription(UpdateSubscriptionVM viewModel, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminSubscriptionsUpdateSubscriptionForHttpResponse(viewModel, id, params);
        TypeReference<AdminSubscriptionVM> typeRef = new TypeReference<AdminSubscriptionVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminSubscriptionsUpdateSubscriptionForHttpResponse(String id, UpdateSubscriptionVM viewModel) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminSubscriptionsUpdateSubscription");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Subscriptions/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(viewModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse adminSubscriptionsUpdateSubscriptionForHttpResponse(String id, java.io.InputStream viewModel, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminSubscriptionsUpdateSubscription");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Subscriptions/{id}");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = viewModel == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, viewModel);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse adminSubscriptionsUpdateSubscriptionForHttpResponse(UpdateSubscriptionVM viewModel, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminSubscriptionsUpdateSubscription");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Subscriptions/{id}");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(viewModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


}
