package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import cloud.fastreport.model.CreateGroupVM;
import cloud.fastreport.model.GroupPermissionsVM;
import cloud.fastreport.model.GroupVM;
import cloud.fastreport.model.GroupsVM;
import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.RenameGroupVM;
import cloud.fastreport.model.UpdateGroupPermissionsVM;

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
public class GroupsApi {
    private ApiClient apiClient;

    public GroupsApi() {
        this(new ApiClient());
    }

    public GroupsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Create a new user group
    * <p><b>200</b> - Succesfully created
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Information from view model is not found
    * @param viewModel Model for creating
    * @return GroupVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GroupVM groupsCreateGroup(CreateGroupVM viewModel) throws IOException {
        HttpResponse response = groupsCreateGroupForHttpResponse(viewModel);
        TypeReference<GroupVM> typeRef = new TypeReference<GroupVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create a new user group
    * <p><b>200</b> - Succesfully created
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Information from view model is not found
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GroupVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GroupVM groupsCreateGroup(CreateGroupVM viewModel, Map<String, Object> params) throws IOException {
        HttpResponse response = groupsCreateGroupForHttpResponse(viewModel, params);
        TypeReference<GroupVM> typeRef = new TypeReference<GroupVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse groupsCreateGroupForHttpResponse(CreateGroupVM viewModel) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Groups");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(viewModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse groupsCreateGroupForHttpResponse(java.io.InputStream viewModel, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Groups");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = viewModel == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, viewModel);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse groupsCreateGroupForHttpResponse(CreateGroupVM viewModel, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Groups");

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
    * Delete group by identifier
    * <p><b>204</b> - Succesfully delete
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>402</b> - subscripiton is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Group with this identifier is not found
    * <p><b>500</b> - Exception thrown
    * @param id Identifier of group
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void groupsDeleteGroup(String id) throws IOException {
        groupsDeleteGroupForHttpResponse(id);
    }

  /**
    * Delete group by identifier
    * <p><b>204</b> - Succesfully delete
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>402</b> - subscripiton is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Group with this identifier is not found
    * <p><b>500</b> - Exception thrown
    * @param id Identifier of group
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void groupsDeleteGroup(String id, Map<String, Object> params) throws IOException {
        groupsDeleteGroupForHttpResponse(id, params);
    }

    public HttpResponse groupsDeleteGroupForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling groupsDeleteGroup");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Groups/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

    public HttpResponse groupsDeleteGroupForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling groupsDeleteGroup");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Groups/{id}");

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
    * Gets group by identifier
    * <p><b>200</b> - Succesfully retured
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Group with this identifier is not found
    * <p><b>500</b> - Exception thrown
    * @param id Identifier of group
    * @return GroupVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GroupVM groupsGetGroup(String id) throws IOException {
        HttpResponse response = groupsGetGroupForHttpResponse(id);
        TypeReference<GroupVM> typeRef = new TypeReference<GroupVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Gets group by identifier
    * <p><b>200</b> - Succesfully retured
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Group with this identifier is not found
    * <p><b>500</b> - Exception thrown
    * @param id Identifier of group
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GroupVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GroupVM groupsGetGroup(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = groupsGetGroupForHttpResponse(id, params);
        TypeReference<GroupVM> typeRef = new TypeReference<GroupVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse groupsGetGroupForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling groupsGetGroup");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Groups/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse groupsGetGroupForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling groupsGetGroup");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Groups/{id}");

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
    * Gets list of user groups
    * <p><b>200</b> - Succesfully retured
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Current user is not found
    * @param skip How many groups need to skip
    * @param take How many groups need to take
    * @return GroupsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GroupsVM groupsGetGroupList(Integer skip, Integer take) throws IOException {
        HttpResponse response = groupsGetGroupListForHttpResponse(skip, take);
        TypeReference<GroupsVM> typeRef = new TypeReference<GroupsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Gets list of user groups
    * <p><b>200</b> - Succesfully retured
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Current user is not found
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GroupsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GroupsVM groupsGetGroupList(Map<String, Object> params) throws IOException {
        HttpResponse response = groupsGetGroupListForHttpResponse(params);
        TypeReference<GroupsVM> typeRef = new TypeReference<GroupsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse groupsGetGroupListForHttpResponse(Integer skip, Integer take) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Groups");
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

    public HttpResponse groupsGetGroupListForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Groups");

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
    * Gets group permissions by identifier
    * <p><b>200</b> - Succesfully retured
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Group with this identifier is not found
    * @param id Identifier of group
    * @return GroupPermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GroupPermissionsVM groupsGetPermissions(String id) throws IOException {
        HttpResponse response = groupsGetPermissionsForHttpResponse(id);
        TypeReference<GroupPermissionsVM> typeRef = new TypeReference<GroupPermissionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Gets group permissions by identifier
    * <p><b>200</b> - Succesfully retured
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Group with this identifier is not found
    * @param id Identifier of group
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GroupPermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GroupPermissionsVM groupsGetPermissions(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = groupsGetPermissionsForHttpResponse(id, params);
        TypeReference<GroupPermissionsVM> typeRef = new TypeReference<GroupPermissionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse groupsGetPermissionsForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling groupsGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Groups/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse groupsGetPermissionsForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling groupsGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Groups/{id}/permissions");

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
    * Rename group by identifier
    * <p><b>200</b> - Succesfully renamed
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Group with this identifier is not found
    * <p><b>500</b> - Exception thrown
    * @param id Identifier of group
    * @param viewModel Model for renaming
    * @return GroupVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GroupVM groupsRenameGroup(String id, RenameGroupVM viewModel) throws IOException {
        HttpResponse response = groupsRenameGroupForHttpResponse(id, viewModel);
        TypeReference<GroupVM> typeRef = new TypeReference<GroupVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Rename group by identifier
    * <p><b>200</b> - Succesfully renamed
    * <p><b>400</b> - The reqeust is wrong
    * <p><b>402</b> - subscription is outdated
    * <p><b>403</b> - You don&#39;t have rights for the operation
    * <p><b>404</b> - Group with this identifier is not found
    * <p><b>500</b> - Exception thrown
    * @param id Identifier of group
    * @param viewModel Model for renaming
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GroupVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GroupVM groupsRenameGroup(String id, RenameGroupVM viewModel, Map<String, Object> params) throws IOException {
        HttpResponse response = groupsRenameGroupForHttpResponse(id, viewModel, params);
        TypeReference<GroupVM> typeRef = new TypeReference<GroupVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse groupsRenameGroupForHttpResponse(String id, RenameGroupVM viewModel) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling groupsRenameGroup");
        }// verify the required parameter 'viewModel' is set
        if (viewModel == null) {
            throw new IllegalArgumentException("Missing the required parameter 'viewModel' when calling groupsRenameGroup");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Groups/{id}/rename");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(viewModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse groupsRenameGroupForHttpResponse(String id, java.io.InputStream viewModel, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling groupsRenameGroup");
              }// verify the required parameter 'viewModel' is set
              if (viewModel == null) {
              throw new IllegalArgumentException("Missing the required parameter 'viewModel' when calling groupsRenameGroup");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Groups/{id}/rename");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = viewModel == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, viewModel);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse groupsRenameGroupForHttpResponse(String id, RenameGroupVM viewModel, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling groupsRenameGroup");
        }// verify the required parameter 'viewModel' is set
        if (viewModel == null) {
            throw new IllegalArgumentException("Missing the required parameter 'viewModel' when calling groupsRenameGroup");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Groups/{id}/rename");

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


  /**
    * Update permissions
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id The id parameter
    * @param permissionsVM The permissionsVM parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void groupsUpdatePermissions(String id, UpdateGroupPermissionsVM permissionsVM) throws IOException {
        groupsUpdatePermissionsForHttpResponse(id, permissionsVM);
    }

  /**
    * Update permissions
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void groupsUpdatePermissions(UpdateGroupPermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        groupsUpdatePermissionsForHttpResponse(permissionsVM, id, params);
    }

    public HttpResponse groupsUpdatePermissionsForHttpResponse(String id, UpdateGroupPermissionsVM permissionsVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling groupsUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Groups/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(permissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse groupsUpdatePermissionsForHttpResponse(String id, java.io.InputStream permissionsVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling groupsUpdatePermissions");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Groups/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = permissionsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, permissionsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse groupsUpdatePermissionsForHttpResponse(UpdateGroupPermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling groupsUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/Groups/{id}/permissions");

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


}
