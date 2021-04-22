package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import cloud.fastreport.model.ApiKeyVM;
import cloud.fastreport.model.ApiKeysVM;
import cloud.fastreport.model.CreateApiKeyVM;
import cloud.fastreport.model.DeleteApiKeyVM;
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
public class AdminApiKeysApi {
    private ApiClient apiClient;

    public AdminApiKeysApi() {
        this(new ApiClient());
    }

    public AdminApiKeysApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Create a new apikey, 5 apikeys for user. Hardcoded for ddos.
    * <p><b>200</b> - Succesfully created
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - user is not found
    * @param userId The userId parameter
    * @param model The model parameter
    * @return ApiKeyVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ApiKeyVM adminApiKeysCreateApiKey(String userId, CreateApiKeyVM model) throws IOException {
        HttpResponse response = adminApiKeysCreateApiKeyForHttpResponse(userId, model);
        TypeReference<ApiKeyVM> typeRef = new TypeReference<ApiKeyVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create a new apikey, 5 apikeys for user. Hardcoded for ddos.
    * <p><b>200</b> - Succesfully created
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - user is not found
    * @param userId The userId parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ApiKeyVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ApiKeyVM adminApiKeysCreateApiKey(CreateApiKeyVM model, String userId, Map<String, Object> params) throws IOException {
        HttpResponse response = adminApiKeysCreateApiKeyForHttpResponse(model, userId, params);
        TypeReference<ApiKeyVM> typeRef = new TypeReference<ApiKeyVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminApiKeysCreateApiKeyForHttpResponse(String userId, CreateApiKeyVM model) throws IOException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userId' when calling adminApiKeysCreateApiKey");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ApiKeys/{userId}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(model);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse adminApiKeysCreateApiKeyForHttpResponse(String userId, java.io.InputStream model, String mediaType) throws IOException {
          // verify the required parameter 'userId' is set
              if (userId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'userId' when calling adminApiKeysCreateApiKey");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("userId", userId);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ApiKeys/{userId}");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = model == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, model);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse adminApiKeysCreateApiKeyForHttpResponse(CreateApiKeyVM model, String userId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userId' when calling adminApiKeysCreateApiKey");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ApiKeys/{userId}");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(model);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Delete an apikey
    * <p><b>204</b> - Succesfully deleted
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Apikey or user is not found
    * @param userId The userId parameter
    * @param model The model parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void adminApiKeysDeleteApiKey(String userId, DeleteApiKeyVM model) throws IOException {
        adminApiKeysDeleteApiKeyForHttpResponse(userId, model);
    }

  /**
    * Delete an apikey
    * <p><b>204</b> - Succesfully deleted
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Apikey or user is not found
    * @param userId The userId parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void adminApiKeysDeleteApiKey(DeleteApiKeyVM model, String userId, Map<String, Object> params) throws IOException {
        adminApiKeysDeleteApiKeyForHttpResponse(model, userId, params);
    }

    public HttpResponse adminApiKeysDeleteApiKeyForHttpResponse(String userId, DeleteApiKeyVM model) throws IOException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userId' when calling adminApiKeysDeleteApiKey");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ApiKeys/{userId}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

      public HttpResponse adminApiKeysDeleteApiKeyForHttpResponse(String userId, java.io.InputStream model, String mediaType) throws IOException {
          // verify the required parameter 'userId' is set
              if (userId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'userId' when calling adminApiKeysDeleteApiKey");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("userId", userId);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ApiKeys/{userId}");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = model == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, model);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
      }

    public HttpResponse adminApiKeysDeleteApiKeyForHttpResponse(DeleteApiKeyVM model, String userId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userId' when calling adminApiKeysDeleteApiKey");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ApiKeys/{userId}");

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
    * Returns list with all api keys of a specified user
    * Always work, it should make only 200 response.
    * <p><b>200</b> - Succesfully retured
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * @param userId The userId parameter
    * @return ApiKeysVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ApiKeysVM adminApiKeysGetApiKeys(String userId) throws IOException {
        HttpResponse response = adminApiKeysGetApiKeysForHttpResponse(userId);
        TypeReference<ApiKeysVM> typeRef = new TypeReference<ApiKeysVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns list with all api keys of a specified user
    * Always work, it should make only 200 response.
    * <p><b>200</b> - Succesfully retured
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * @param userId The userId parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ApiKeysVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ApiKeysVM adminApiKeysGetApiKeys(String userId, Map<String, Object> params) throws IOException {
        HttpResponse response = adminApiKeysGetApiKeysForHttpResponse(userId, params);
        TypeReference<ApiKeysVM> typeRef = new TypeReference<ApiKeysVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminApiKeysGetApiKeysForHttpResponse(String userId) throws IOException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userId' when calling adminApiKeysGetApiKeys");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ApiKeys/{userId}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse adminApiKeysGetApiKeysForHttpResponse(String userId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userId' when calling adminApiKeysGetApiKeys");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/ApiKeys/{userId}");

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
