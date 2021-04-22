package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import org.threeten.bp.OffsetDateTime;
import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.RegisterUserVM;
import cloud.fastreport.model.UpdateUserVM;
import cloud.fastreport.model.UserVM;
import cloud.fastreport.model.UsersVM;

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
public class AdminUsersApi {
    private ApiClient apiClient;

    public AdminUsersApi() {
        this(new ApiClient());
    }

    public AdminUsersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Delete a user from cloud database by id
    * <p><b>204</b> - Succesfully obliterated
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - User with this id is not found
    * <p><b>500</b> - exception caught
    * @param id Identifier of user
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void adminUsersDeleteUser(String id) throws IOException {
        adminUsersDeleteUserForHttpResponse(id);
    }

  /**
    * Delete a user from cloud database by id
    * <p><b>204</b> - Succesfully obliterated
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - User with this id is not found
    * <p><b>500</b> - exception caught
    * @param id Identifier of user
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void adminUsersDeleteUser(String id, Map<String, Object> params) throws IOException {
        adminUsersDeleteUserForHttpResponse(id, params);
    }

    public HttpResponse adminUsersDeleteUserForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminUsersDeleteUser");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Users/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

    public HttpResponse adminUsersDeleteUserForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminUsersDeleteUser");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Users/{id}");

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
    * Returns a key-value pair of new users count per month for a specified time span: (month, number of new users)
    * If no users, then the endpoint will return empty dic
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * @param from A starting date for stats calculation
    * @param to An ending date for stats calculation
    * @return Map&lt;String, Integer&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Map<String, Integer> adminUsersGetNewUsersPerMonth(OffsetDateTime from, OffsetDateTime to) throws IOException {
        HttpResponse response = adminUsersGetNewUsersPerMonthForHttpResponse(from, to);
        TypeReference<Map<String, Integer>> typeRef = new TypeReference<Map<String, Integer>>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns a key-value pair of new users count per month for a specified time span: (month, number of new users)
    * If no users, then the endpoint will return empty dic
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * @param from A starting date for stats calculation
    * @param to An ending date for stats calculation
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Map&lt;String, Integer&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Map<String, Integer> adminUsersGetNewUsersPerMonth(OffsetDateTime from, OffsetDateTime to, Map<String, Object> params) throws IOException {
        HttpResponse response = adminUsersGetNewUsersPerMonthForHttpResponse(from, to, params);
        TypeReference<Map<String, Integer>> typeRef = new TypeReference<Map<String, Integer>>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminUsersGetNewUsersPerMonthForHttpResponse(OffsetDateTime from, OffsetDateTime to) throws IOException {
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new IllegalArgumentException("Missing the required parameter 'from' when calling adminUsersGetNewUsersPerMonth");
        }// verify the required parameter 'to' is set
        if (to == null) {
            throw new IllegalArgumentException("Missing the required parameter 'to' when calling adminUsersGetNewUsersPerMonth");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("from", from);
        uriVariables.put("to", to);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Users/stat/new/{from}/{to}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse adminUsersGetNewUsersPerMonthForHttpResponse(OffsetDateTime from, OffsetDateTime to, Map<String, Object> params) throws IOException {
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new IllegalArgumentException("Missing the required parameter 'from' when calling adminUsersGetNewUsersPerMonth");
        }// verify the required parameter 'to' is set
        if (to == null) {
            throw new IllegalArgumentException("Missing the required parameter 'to' when calling adminUsersGetNewUsersPerMonth");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("from", from);
        uriVariables.put("to", to);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Users/stat/new/{from}/{to}");

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
    * Returns a user view model by id
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - User with this id is not found
    * <p><b>500</b> - exception caught
    * @param id Identifier of user
    * @return UserVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UserVM adminUsersGetUser(String id) throws IOException {
        HttpResponse response = adminUsersGetUserForHttpResponse(id);
        TypeReference<UserVM> typeRef = new TypeReference<UserVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns a user view model by id
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - User with this id is not found
    * <p><b>500</b> - exception caught
    * @param id Identifier of user
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return UserVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UserVM adminUsersGetUser(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminUsersGetUserForHttpResponse(id, params);
        TypeReference<UserVM> typeRef = new TypeReference<UserVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminUsersGetUserForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminUsersGetUser");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Users/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse adminUsersGetUserForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminUsersGetUser");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Users/{id}");

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
    * Returns a list of users
    * If no users, then the endpoint will return empty list
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * @param skip Variable for pagination, defautl value is 0
    * @param take Variable for pagination, default value is 10
    * @return UsersVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UsersVM adminUsersGetUsers(Integer skip, Integer take) throws IOException {
        HttpResponse response = adminUsersGetUsersForHttpResponse(skip, take);
        TypeReference<UsersVM> typeRef = new TypeReference<UsersVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns a list of users
    * If no users, then the endpoint will return empty list
    * <p><b>200</b> - Succesfully returned
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return UsersVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UsersVM adminUsersGetUsers(Map<String, Object> params) throws IOException {
        HttpResponse response = adminUsersGetUsersForHttpResponse(params);
        TypeReference<UsersVM> typeRef = new TypeReference<UsersVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminUsersGetUsersForHttpResponse(Integer skip, Integer take) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Users");
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

    public HttpResponse adminUsersGetUsersForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Users");

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
    * Register a new user in the cloud with specified id, returns a new model
    * <p><b>200</b> - Succesfully created
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - subscription not found
    * <p><b>500</b> - exception caught
    * @param viewModel The viewModel parameter
    * @return UserVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UserVM adminUsersRegisterUser(RegisterUserVM viewModel) throws IOException {
        HttpResponse response = adminUsersRegisterUserForHttpResponse(viewModel);
        TypeReference<UserVM> typeRef = new TypeReference<UserVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Register a new user in the cloud with specified id, returns a new model
    * <p><b>200</b> - Succesfully created
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - subscription not found
    * <p><b>500</b> - exception caught
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return UserVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UserVM adminUsersRegisterUser(RegisterUserVM viewModel, Map<String, Object> params) throws IOException {
        HttpResponse response = adminUsersRegisterUserForHttpResponse(viewModel, params);
        TypeReference<UserVM> typeRef = new TypeReference<UserVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminUsersRegisterUserForHttpResponse(RegisterUserVM viewModel) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Users");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(viewModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse adminUsersRegisterUserForHttpResponse(java.io.InputStream viewModel, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Users");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = viewModel == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, viewModel);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse adminUsersRegisterUserForHttpResponse(RegisterUserVM viewModel, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Users");

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
    * Update an user by id
    * <p><b>200</b> - Succesfully updated
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - User with this id is not found
    * <p><b>500</b> - exception caught
    * @param id Identifier of the user
    * @param viewModel update VM
    * @return UserVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UserVM adminUsersUpdateUser(String id, UpdateUserVM viewModel) throws IOException {
        HttpResponse response = adminUsersUpdateUserForHttpResponse(id, viewModel);
        TypeReference<UserVM> typeRef = new TypeReference<UserVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update an user by id
    * <p><b>200</b> - Succesfully updated
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - User with this id is not found
    * <p><b>500</b> - exception caught
    * @param id Identifier of the user
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return UserVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UserVM adminUsersUpdateUser(UpdateUserVM viewModel, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = adminUsersUpdateUserForHttpResponse(viewModel, id, params);
        TypeReference<UserVM> typeRef = new TypeReference<UserVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse adminUsersUpdateUserForHttpResponse(String id, UpdateUserVM viewModel) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminUsersUpdateUser");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Users/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(viewModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse adminUsersUpdateUserForHttpResponse(String id, java.io.InputStream viewModel, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminUsersUpdateUser");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Users/{id}");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = viewModel == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, viewModel);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse adminUsersUpdateUserForHttpResponse(UpdateUserVM viewModel, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling adminUsersUpdateUser");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Users/{id}");

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
