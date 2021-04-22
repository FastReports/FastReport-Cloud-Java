package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import cloud.fastreport.model.CreateSubscriptionPlanVM;
import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.SubscriptionPlanVM;
import cloud.fastreport.model.SubscriptionPlansVM;
import cloud.fastreport.model.UpdateSubscriptionPlanVM;

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
public class AdminSubscriptionPlansApi {
    private ApiClient apiClient;

    public AdminSubscriptionPlansApi() {
        this(new ApiClient());
    }

    public AdminSubscriptionPlansApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Create a new subscription plan, returns a new model
    * <p><b>200</b> - Succesfully created
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>500</b> - exception caught
    * @param viewModel The viewModel parameter
    * @return SubscriptionPlanVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPlanVM adminSubscriptionPlansCreateSubscriptionPlan(CreateSubscriptionPlanVM viewModel) throws IOException {
        HttpResponse response = adminSubscriptionPlansCreateSubscriptionPlanForHttpResponse(viewModel);
        TypeReference<SubscriptionPlanVM> typeRef = new TypeReference<SubscriptionPlanVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create a new subscription plan, returns a new model
    * <p><b>200</b> - Succesfully created
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>500</b> - exception caught
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionPlanVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPlanVM adminSubscriptionPlansCreateSubscriptionPlan(CreateSubscriptionPlanVM viewModel, Map<String, Object> params) throws IOException {
        HttpResponse response = adminSubscriptionPlansCreateSubscriptionPlanForHttpResponse(viewModel, params);
        TypeReference<SubscriptionPlanVM> typeRef = new TypeReference<SubscriptionPlanVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminSubscriptionPlansCreateSubscriptionPlanForHttpResponse(CreateSubscriptionPlanVM viewModel) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/SubscriptionPlans");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(viewModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse adminSubscriptionPlansCreateSubscriptionPlanForHttpResponse(java.io.InputStream viewModel, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/SubscriptionPlans");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = viewModel == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, viewModel);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse adminSubscriptionPlansCreateSubscriptionPlanForHttpResponse(CreateSubscriptionPlanVM viewModel, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/SubscriptionPlans");

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
    * Delete a subscription plan.
    * <p><b>204</b> - Succesfully deleted
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription plan with this id is not found
    * <p><b>500</b> - exception caught
    * @param id Identifier of subsctiption plan
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void adminSubscriptionPlansDeleteSubscriptionPlan(String id) throws IOException {
        adminSubscriptionPlansDeleteSubscriptionPlanForHttpResponse(id);
    }

  /**
    * Delete a subscription plan.
    * <p><b>204</b> - Succesfully deleted
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription plan with this id is not found
    * <p><b>500</b> - exception caught
    * @param id Identifier of subsctiption plan
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void adminSubscriptionPlansDeleteSubscriptionPlan(String id, Map<String, Object> params) throws IOException {
        adminSubscriptionPlansDeleteSubscriptionPlanForHttpResponse(id, params);
    }

    public HttpResponse adminSubscriptionPlansDeleteSubscriptionPlanForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminSubscriptionPlansDeleteSubscriptionPlan");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/SubscriptionPlans/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

    public HttpResponse adminSubscriptionPlansDeleteSubscriptionPlanForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminSubscriptionPlansDeleteSubscriptionPlan");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/SubscriptionPlans/{id}");

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
    * Returns a subscription plan. Not all subscriptions can be issued for customer.
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription plan with this id is not found
    * <p><b>500</b> - exception caught
    * @param id Identifier of subsctiption plan
    * @return SubscriptionPlanVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPlanVM adminSubscriptionPlansGetSubscriptionPlan(String id) throws IOException {
        HttpResponse response = adminSubscriptionPlansGetSubscriptionPlanForHttpResponse(id);
        TypeReference<SubscriptionPlanVM> typeRef = new TypeReference<SubscriptionPlanVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns a subscription plan. Not all subscriptions can be issued for customer.
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription plan with this id is not found
    * <p><b>500</b> - exception caught
    * @param id Identifier of subsctiption plan
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionPlanVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPlanVM adminSubscriptionPlansGetSubscriptionPlan(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminSubscriptionPlansGetSubscriptionPlanForHttpResponse(id, params);
        TypeReference<SubscriptionPlanVM> typeRef = new TypeReference<SubscriptionPlanVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminSubscriptionPlansGetSubscriptionPlanForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminSubscriptionPlansGetSubscriptionPlan");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/SubscriptionPlans/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse adminSubscriptionPlansGetSubscriptionPlanForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminSubscriptionPlansGetSubscriptionPlan");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/SubscriptionPlans/{id}");

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
    * Returns a list of active subscription plans that can be issued to the user.
    * If no active subscription plans, then the endpoint will return empty list
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * @param skip Variable for pagination, defautl value is 0
    * @param take Variable for pagination, default value is 10
    * @return SubscriptionPlansVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPlansVM adminSubscriptionPlansGetSubscriptionPlans(Integer skip, Integer take) throws IOException {
        HttpResponse response = adminSubscriptionPlansGetSubscriptionPlansForHttpResponse(skip, take);
        TypeReference<SubscriptionPlansVM> typeRef = new TypeReference<SubscriptionPlansVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns a list of active subscription plans that can be issued to the user.
    * If no active subscription plans, then the endpoint will return empty list
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionPlansVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPlansVM adminSubscriptionPlansGetSubscriptionPlans(Map<String, Object> params) throws IOException {
        HttpResponse response = adminSubscriptionPlansGetSubscriptionPlansForHttpResponse(params);
        TypeReference<SubscriptionPlansVM> typeRef = new TypeReference<SubscriptionPlansVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminSubscriptionPlansGetSubscriptionPlansForHttpResponse(Integer skip, Integer take) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/SubscriptionPlans");
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

    public HttpResponse adminSubscriptionPlansGetSubscriptionPlansForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/SubscriptionPlans");

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
    * Update a subscription plan.
    * <p><b>200</b> - Succesfully updated
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription plan with this id is not found
    * <p><b>500</b> - exception caught
    * @param id Identifier of subsctiption plan
    * @param viewModel Update VM
    * @return SubscriptionPlanVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPlanVM adminSubscriptionPlansUpdateSubscriptionPlan(String id, UpdateSubscriptionPlanVM viewModel) throws IOException {
        HttpResponse response = adminSubscriptionPlansUpdateSubscriptionPlanForHttpResponse(id, viewModel);
        TypeReference<SubscriptionPlanVM> typeRef = new TypeReference<SubscriptionPlanVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update a subscription plan.
    * <p><b>200</b> - Succesfully updated
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Subscription plan with this id is not found
    * <p><b>500</b> - exception caught
    * @param id Identifier of subsctiption plan
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionPlanVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPlanVM adminSubscriptionPlansUpdateSubscriptionPlan(UpdateSubscriptionPlanVM viewModel, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminSubscriptionPlansUpdateSubscriptionPlanForHttpResponse(viewModel, id, params);
        TypeReference<SubscriptionPlanVM> typeRef = new TypeReference<SubscriptionPlanVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminSubscriptionPlansUpdateSubscriptionPlanForHttpResponse(String id, UpdateSubscriptionPlanVM viewModel) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminSubscriptionPlansUpdateSubscriptionPlan");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/SubscriptionPlans/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(viewModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse adminSubscriptionPlansUpdateSubscriptionPlanForHttpResponse(String id, java.io.InputStream viewModel, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminSubscriptionPlansUpdateSubscriptionPlan");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/SubscriptionPlans/{id}");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = viewModel == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, viewModel);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse adminSubscriptionPlansUpdateSubscriptionPlanForHttpResponse(UpdateSubscriptionPlanVM viewModel, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminSubscriptionPlansUpdateSubscriptionPlan");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/SubscriptionPlans/{id}");

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
