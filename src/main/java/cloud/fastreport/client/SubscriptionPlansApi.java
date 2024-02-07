package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.SubscriptionPlanVM;
import cloud.fastreport.model.SubscriptionPlansVM;

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
public class SubscriptionPlansApi {
    private ApiClient apiClient;

    public SubscriptionPlansApi() {
        this(new ApiClient());
    }

    public SubscriptionPlansApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Returns a subscription plan. Not all subscriptions can be issued for customer.
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>404</b> - Subscription plan with this id is not found
    * <p><b>500</b> - Exception thrown
    * @param id Identifier of subsctiption plan
    * @return SubscriptionPlanVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPlanVM subscriptionPlansGetSubscriptionPlan(String id) throws IOException {
        HttpResponse response = subscriptionPlansGetSubscriptionPlanForHttpResponse(id);
        TypeReference<SubscriptionPlanVM> typeRef = new TypeReference<SubscriptionPlanVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns a subscription plan. Not all subscriptions can be issued for customer.
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>404</b> - Subscription plan with this id is not found
    * <p><b>500</b> - Exception thrown
    * @param id Identifier of subsctiption plan
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionPlanVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPlanVM subscriptionPlansGetSubscriptionPlan(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = subscriptionPlansGetSubscriptionPlanForHttpResponse(id, params);
        TypeReference<SubscriptionPlanVM> typeRef = new TypeReference<SubscriptionPlanVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse subscriptionPlansGetSubscriptionPlanForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling subscriptionPlansGetSubscriptionPlan");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/SubscriptionPlans/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }

    public HttpResponse subscriptionPlansGetSubscriptionPlanForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling subscriptionPlansGetSubscriptionPlan");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/SubscriptionPlans/{id}");

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
    * Returns a list of active subscription plans that can be issued to the user.
    * If no active subscription plans, then the endpoint will return empty list
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * @param skip Variable for pagination, defautl value is 0
    * @param take Variable for pagination, default value is 10
    * @return SubscriptionPlansVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPlansVM subscriptionPlansGetSubscriptionPlans(Integer skip, Integer take) throws IOException {
        HttpResponse response = subscriptionPlansGetSubscriptionPlansForHttpResponse(skip, take);
        TypeReference<SubscriptionPlansVM> typeRef = new TypeReference<SubscriptionPlansVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns a list of active subscription plans that can be issued to the user.
    * If no active subscription plans, then the endpoint will return empty list
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionPlansVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubscriptionPlansVM subscriptionPlansGetSubscriptionPlans(Map<String, Object> params) throws IOException {
        HttpResponse response = subscriptionPlansGetSubscriptionPlansForHttpResponse(params);
        TypeReference<SubscriptionPlansVM> typeRef = new TypeReference<SubscriptionPlansVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse subscriptionPlansGetSubscriptionPlansForHttpResponse(Integer skip, Integer take) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/SubscriptionPlans");
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

    public HttpResponse subscriptionPlansGetSubscriptionPlansForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/SubscriptionPlans");

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


}
