package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import cloud.fastreport.model.ServerConfigurationVM;

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
public class ConfigurationApi {
    private ApiClient apiClient;

    public ConfigurationApi() {
        this(new ApiClient());
    }

    public ConfigurationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * returns information about server configuration
    * <p><b>200</b> - Success
    * @return ServerConfigurationVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ServerConfigurationVM configurationGet() throws IOException {
        HttpResponse response = configurationGetForHttpResponse();
        TypeReference<ServerConfigurationVM> typeRef = new TypeReference<ServerConfigurationVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * returns information about server configuration
    * <p><b>200</b> - Success
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ServerConfigurationVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ServerConfigurationVM configurationGet(Map<String, Object> params) throws IOException {
        HttpResponse response = configurationGetForHttpResponse(params);
        TypeReference<ServerConfigurationVM> typeRef = new TypeReference<ServerConfigurationVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse configurationGetForHttpResponse() throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/Configuration");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }

    public HttpResponse configurationGetForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/Configuration");

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
