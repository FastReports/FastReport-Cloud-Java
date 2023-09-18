package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.UpdateUserProfileVM;
import cloud.fastreport.model.UserProfileVM;

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
public class UserProfileApi {
    private ApiClient apiClient;

    public UserProfileApi() {
        this(new ApiClient());
    }

    public UserProfileApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Return current profile of the current user
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - Bad Request
    * @return UserProfileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UserProfileVM userProfileGetMyProfile() throws IOException {
        HttpResponse response = userProfileGetMyProfileForHttpResponse();
        TypeReference<UserProfileVM> typeRef = new TypeReference<UserProfileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Return current profile of the current user
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - Bad Request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return UserProfileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UserProfileVM userProfileGetMyProfile(Map<String, Object> params) throws IOException {
        HttpResponse response = userProfileGetMyProfileForHttpResponse(params);
        TypeReference<UserProfileVM> typeRef = new TypeReference<UserProfileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse userProfileGetMyProfileForHttpResponse() throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/UserProfile");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse userProfileGetMyProfileForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/UserProfile");

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
    * Return user profile by user identifier.  If the user did not provide information about himself or blocked, then the endpoint will return an empty model. (only id)
    * <p><b>200</b> - Succesfully returned
    * <p><b>404</b> - User not found
    * @param userId The userId parameter
    * @return UserProfileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UserProfileVM userProfileGetUserProfile(String userId) throws IOException {
        HttpResponse response = userProfileGetUserProfileForHttpResponse(userId);
        TypeReference<UserProfileVM> typeRef = new TypeReference<UserProfileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Return user profile by user identifier.  If the user did not provide information about himself or blocked, then the endpoint will return an empty model. (only id)
    * <p><b>200</b> - Succesfully returned
    * <p><b>404</b> - User not found
    * @param userId The userId parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return UserProfileVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UserProfileVM userProfileGetUserProfile(String userId, Map<String, Object> params) throws IOException {
        HttpResponse response = userProfileGetUserProfileForHttpResponse(userId, params);
        TypeReference<UserProfileVM> typeRef = new TypeReference<UserProfileVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse userProfileGetUserProfileForHttpResponse(String userId) throws IOException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userProfileGetUserProfile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/UserProfile/{userId}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse userProfileGetUserProfileForHttpResponse(String userId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userProfileGetUserProfile");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/UserProfile/{userId}");

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
    * Update profile of the current user
    * This method is only allowed for local sign in via intranet
    * <p><b>204</b> - No Content
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>200</b> - Succesfully updated
    * @param updateUserProfileVM 
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void userProfileUpdateMyProfile(UpdateUserProfileVM updateUserProfileVM) throws IOException {
        userProfileUpdateMyProfileForHttpResponse(updateUserProfileVM);
    }

  /**
    * Update profile of the current user
    * This method is only allowed for local sign in via intranet
    * <p><b>204</b> - No Content
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>200</b> - Succesfully updated
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void userProfileUpdateMyProfile(UpdateUserProfileVM updateUserProfileVM, Map<String, Object> params) throws IOException {
        userProfileUpdateMyProfileForHttpResponse(updateUserProfileVM, params);
    }

    public HttpResponse userProfileUpdateMyProfileForHttpResponse(UpdateUserProfileVM updateUserProfileVM) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/UserProfile");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(updateUserProfileVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse userProfileUpdateMyProfileForHttpResponse(java.io.InputStream updateUserProfileVM, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/UserProfile");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = updateUserProfileVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, updateUserProfileVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse userProfileUpdateMyProfileForHttpResponse(UpdateUserProfileVM updateUserProfileVM, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/UserProfile");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(updateUserProfileVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


}
