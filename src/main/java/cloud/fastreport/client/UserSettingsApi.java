package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import cloud.fastreport.model.AcceptAgreementsVM;
import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.UpdateUserSettingsVM;
import cloud.fastreport.model.UserSettingsVM;

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
public class UserSettingsApi {
    private ApiClient apiClient;

    public UserSettingsApi() {
        this(new ApiClient());
    }

    public UserSettingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Use this endpoint to accept current version of service license agreement
    * <p><b>204</b> - No Content
    * @param acceptAgreementsVM 
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void userSettingsAcceptAgreements(AcceptAgreementsVM acceptAgreementsVM) throws IOException {
        userSettingsAcceptAgreementsForHttpResponse(acceptAgreementsVM);
    }

  /**
    * Use this endpoint to accept current version of service license agreement
    * <p><b>204</b> - No Content
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void userSettingsAcceptAgreements(AcceptAgreementsVM acceptAgreementsVM, Map<String, Object> params) throws IOException {
        userSettingsAcceptAgreementsForHttpResponse(acceptAgreementsVM, params);
    }

    public HttpResponse userSettingsAcceptAgreementsForHttpResponse(AcceptAgreementsVM acceptAgreementsVM) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/UserSettings/accept");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(acceptAgreementsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse userSettingsAcceptAgreementsForHttpResponse(java.io.InputStream acceptAgreementsVM, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/UserSettings/accept");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = acceptAgreementsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, acceptAgreementsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse userSettingsAcceptAgreementsForHttpResponse(AcceptAgreementsVM acceptAgreementsVM, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/UserSettings/accept");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(acceptAgreementsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Return current user settings.
    * <p><b>200</b> - Succesfully returned
    * <p><b>404</b> - User not found
    * @return UserSettingsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UserSettingsVM userSettingsGetCurrentUserSettings() throws IOException {
        HttpResponse response = userSettingsGetCurrentUserSettingsForHttpResponse();
        TypeReference<UserSettingsVM> typeRef = new TypeReference<UserSettingsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Return current user settings.
    * <p><b>200</b> - Succesfully returned
    * <p><b>404</b> - User not found
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return UserSettingsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UserSettingsVM userSettingsGetCurrentUserSettings(Map<String, Object> params) throws IOException {
        HttpResponse response = userSettingsGetCurrentUserSettingsForHttpResponse(params);
        TypeReference<UserSettingsVM> typeRef = new TypeReference<UserSettingsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse userSettingsGetCurrentUserSettingsForHttpResponse() throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/UserSettings");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse userSettingsGetCurrentUserSettingsForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/UserSettings");

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
    * Update settings of the current user
    * <p><b>200</b> - Succesfully updated
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - Forbidden
    * @param updateUserSettingsVM 
    * @return UserSettingsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UserSettingsVM userSettingsUpdateMySettings(UpdateUserSettingsVM updateUserSettingsVM) throws IOException {
        HttpResponse response = userSettingsUpdateMySettingsForHttpResponse(updateUserSettingsVM);
        TypeReference<UserSettingsVM> typeRef = new TypeReference<UserSettingsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update settings of the current user
    * <p><b>200</b> - Succesfully updated
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - Forbidden
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return UserSettingsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UserSettingsVM userSettingsUpdateMySettings(UpdateUserSettingsVM updateUserSettingsVM, Map<String, Object> params) throws IOException {
        HttpResponse response = userSettingsUpdateMySettingsForHttpResponse(updateUserSettingsVM, params);
        TypeReference<UserSettingsVM> typeRef = new TypeReference<UserSettingsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse userSettingsUpdateMySettingsForHttpResponse(UpdateUserSettingsVM updateUserSettingsVM) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/UserSettings");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(updateUserSettingsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse userSettingsUpdateMySettingsForHttpResponse(java.io.InputStream updateUserSettingsVM, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/UserSettings");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = updateUserSettingsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, updateUserSettingsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse userSettingsUpdateMySettingsForHttpResponse(UpdateUserSettingsVM updateUserSettingsVM, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/UserSettings");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(updateUserSettingsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


}
