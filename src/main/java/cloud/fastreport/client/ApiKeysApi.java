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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiKeysApi {
    private ApiClient apiClient;

    public ApiKeysApi() {
        this(new ApiClient());
    }

    public ApiKeysApi(ApiClient apiClient) {
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
    * <p><b>400</b> - wrong model provided or exception thrown (user&#39;s attempts to create sixth key for example throwns an exception)
    * <p><b>401</b> - User is not authorized
    * @param createApiKeyVM The createApiKeyVM parameter
    * @return ApiKeyVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ApiKeyVM apiKeysCreateApiKey(CreateApiKeyVM createApiKeyVM) throws IOException {
        HttpResponse response = apiKeysCreateApiKeyForHttpResponse(createApiKeyVM);
        TypeReference<ApiKeyVM> typeRef = new TypeReference<ApiKeyVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create a new apikey, 5 apikeys for user. Hardcoded for ddos.
    * <p><b>200</b> - Succesfully created
    * <p><b>400</b> - wrong model provided or exception thrown (user&#39;s attempts to create sixth key for example throwns an exception)
    * <p><b>401</b> - User is not authorized
    * @param createApiKeyVM The createApiKeyVM parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ApiKeyVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ApiKeyVM apiKeysCreateApiKey(CreateApiKeyVM createApiKeyVM, Map<String, Object> params) throws IOException {
        HttpResponse response = apiKeysCreateApiKeyForHttpResponse(createApiKeyVM, params);
        TypeReference<ApiKeyVM> typeRef = new TypeReference<ApiKeyVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse apiKeysCreateApiKeyForHttpResponse(CreateApiKeyVM createApiKeyVM) throws IOException {
        // verify the required parameter 'createApiKeyVM' is set
        if (createApiKeyVM == null) {
            throw new IllegalArgumentException("Missing the required parameter 'createApiKeyVM' when calling apiKeysCreateApiKey");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/ApiKeys");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(createApiKeyVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse apiKeysCreateApiKeyForHttpResponse(java.io.InputStream createApiKeyVM, String mediaType) throws IOException {
          // verify the required parameter 'createApiKeyVM' is set
              if (createApiKeyVM == null) {
              throw new IllegalArgumentException("Missing the required parameter 'createApiKeyVM' when calling apiKeysCreateApiKey");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/ApiKeys");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = createApiKeyVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, createApiKeyVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse apiKeysCreateApiKeyForHttpResponse(CreateApiKeyVM createApiKeyVM, Map<String, Object> params) throws IOException {
        // verify the required parameter 'createApiKeyVM' is set
        if (createApiKeyVM == null) {
            throw new IllegalArgumentException("Missing the required parameter 'createApiKeyVM' when calling apiKeysCreateApiKey");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/ApiKeys");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(createApiKeyVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Delete an apikey
    * <p><b>204</b> - Succesfully deleted
    * <p><b>400</b> - The request is wrong
    * <p><b>401</b> - User is not authorized
    * <p><b>404</b> - No such apikey found
    * <p><b>500</b> - exception thrown
    * @param deleteApiKeyVM The deleteApiKeyVM parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void apiKeysDeleteApiKey(DeleteApiKeyVM deleteApiKeyVM) throws IOException {
        apiKeysDeleteApiKeyForHttpResponse(deleteApiKeyVM);
    }

  /**
    * Delete an apikey
    * <p><b>204</b> - Succesfully deleted
    * <p><b>400</b> - The request is wrong
    * <p><b>401</b> - User is not authorized
    * <p><b>404</b> - No such apikey found
    * <p><b>500</b> - exception thrown
    * @param deleteApiKeyVM The deleteApiKeyVM parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void apiKeysDeleteApiKey(DeleteApiKeyVM deleteApiKeyVM, Map<String, Object> params) throws IOException {
        apiKeysDeleteApiKeyForHttpResponse(deleteApiKeyVM, params);
    }

    public HttpResponse apiKeysDeleteApiKeyForHttpResponse(DeleteApiKeyVM deleteApiKeyVM) throws IOException {
        // verify the required parameter 'deleteApiKeyVM' is set
        if (deleteApiKeyVM == null) {
            throw new IllegalArgumentException("Missing the required parameter 'deleteApiKeyVM' when calling apiKeysDeleteApiKey");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/ApiKeys");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

      public HttpResponse apiKeysDeleteApiKeyForHttpResponse(java.io.InputStream deleteApiKeyVM, String mediaType) throws IOException {
          // verify the required parameter 'deleteApiKeyVM' is set
              if (deleteApiKeyVM == null) {
              throw new IllegalArgumentException("Missing the required parameter 'deleteApiKeyVM' when calling apiKeysDeleteApiKey");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/ApiKeys");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = deleteApiKeyVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, deleteApiKeyVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
      }

    public HttpResponse apiKeysDeleteApiKeyForHttpResponse(DeleteApiKeyVM deleteApiKeyVM, Map<String, Object> params) throws IOException {
        // verify the required parameter 'deleteApiKeyVM' is set
        if (deleteApiKeyVM == null) {
            throw new IllegalArgumentException("Missing the required parameter 'deleteApiKeyVM' when calling apiKeysDeleteApiKey");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/ApiKeys");

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
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }


  /**
    * Returns list with all api keys of current user
    * Always work, it should make only 200 response (except if user is not authorized).
    * <p><b>200</b> - Succesfully retured
    * <p><b>401</b> - User is not authorized
    * <p><b>500</b> - Exception somehow thrown (barely possible)
    * @return ApiKeysVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ApiKeysVM apiKeysGetApiKeys() throws IOException {
        HttpResponse response = apiKeysGetApiKeysForHttpResponse();
        TypeReference<ApiKeysVM> typeRef = new TypeReference<ApiKeysVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns list with all api keys of current user
    * Always work, it should make only 200 response (except if user is not authorized).
    * <p><b>200</b> - Succesfully retured
    * <p><b>401</b> - User is not authorized
    * <p><b>500</b> - Exception somehow thrown (barely possible)
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ApiKeysVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ApiKeysVM apiKeysGetApiKeys(Map<String, Object> params) throws IOException {
        HttpResponse response = apiKeysGetApiKeysForHttpResponse(params);
        TypeReference<ApiKeysVM> typeRef = new TypeReference<ApiKeysVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse apiKeysGetApiKeysForHttpResponse() throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/ApiKeys");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse apiKeysGetApiKeysForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/ApiKeys");

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


}
