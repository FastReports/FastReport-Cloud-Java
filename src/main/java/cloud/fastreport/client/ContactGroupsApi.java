package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import cloud.fastreport.model.ContactGroupVM;
import cloud.fastreport.model.ContactGroupsVM;
import cloud.fastreport.model.CreateContactGroupVM;
import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.UpdateContactGroupVM;

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
public class ContactGroupsApi {
    private ApiClient apiClient;

    public ContactGroupsApi() {
        this(new ApiClient());
    }

    public ContactGroupsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Creates contact group
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param createContactGroupVM The createContactGroupVM parameter
    * @return ContactGroupVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ContactGroupVM contactGroupsCreate(CreateContactGroupVM createContactGroupVM) throws IOException {
        HttpResponse response = contactGroupsCreateForHttpResponse(createContactGroupVM);
        TypeReference<ContactGroupVM> typeRef = new TypeReference<ContactGroupVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Creates contact group
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ContactGroupVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ContactGroupVM contactGroupsCreate(CreateContactGroupVM createContactGroupVM, Map<String, Object> params) throws IOException {
        HttpResponse response = contactGroupsCreateForHttpResponse(createContactGroupVM, params);
        TypeReference<ContactGroupVM> typeRef = new TypeReference<ContactGroupVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse contactGroupsCreateForHttpResponse(CreateContactGroupVM createContactGroupVM) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/ContactGroups/group");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(createContactGroupVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse contactGroupsCreateForHttpResponse(java.io.InputStream createContactGroupVM, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/ContactGroups/group");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = createContactGroupVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, createContactGroupVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse contactGroupsCreateForHttpResponse(CreateContactGroupVM createContactGroupVM, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/ContactGroups/group");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(createContactGroupVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Removes contact by id
    * <p><b>204</b> - No Content
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param id The id parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void contactGroupsDelete(String id) throws IOException {
        contactGroupsDeleteForHttpResponse(id);
    }

  /**
    * Removes contact by id
    * <p><b>204</b> - No Content
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void contactGroupsDelete(String id, Map<String, Object> params) throws IOException {
        contactGroupsDeleteForHttpResponse(id, params);
    }

    public HttpResponse contactGroupsDeleteForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling contactGroupsDelete");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/ContactGroups/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

    public HttpResponse contactGroupsDeleteForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling contactGroupsDelete");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/ContactGroups/{id}");

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
    * Returns contact group by id
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param id The id parameter
    * @return ContactGroupVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ContactGroupVM contactGroupsGet(String id) throws IOException {
        HttpResponse response = contactGroupsGetForHttpResponse(id);
        TypeReference<ContactGroupVM> typeRef = new TypeReference<ContactGroupVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns contact group by id
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ContactGroupVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ContactGroupVM contactGroupsGet(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = contactGroupsGetForHttpResponse(id, params);
        TypeReference<ContactGroupVM> typeRef = new TypeReference<ContactGroupVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse contactGroupsGetForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling contactGroupsGet");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/ContactGroups/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse contactGroupsGetForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling contactGroupsGet");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/ContactGroups/{id}");

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
    * Returns contact groups by subscriptionId
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param subscriptionId The subscriptionId parameter
    * @param skip The skip parameter
    * @param take The take parameter
    * @return ContactGroupsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ContactGroupsVM contactGroupsGetList(String subscriptionId, Integer skip, Integer take) throws IOException {
        HttpResponse response = contactGroupsGetListForHttpResponse(subscriptionId, skip, take);
        TypeReference<ContactGroupsVM> typeRef = new TypeReference<ContactGroupsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns contact groups by subscriptionId
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param subscriptionId The subscriptionId parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ContactGroupsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ContactGroupsVM contactGroupsGetList(String subscriptionId, Map<String, Object> params) throws IOException {
        HttpResponse response = contactGroupsGetListForHttpResponse(subscriptionId, params);
        TypeReference<ContactGroupsVM> typeRef = new TypeReference<ContactGroupsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse contactGroupsGetListForHttpResponse(String subscriptionId, Integer skip, Integer take) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling contactGroupsGetList");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/ContactGroups/subscription/{subscriptionId}/groups");
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

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse contactGroupsGetListForHttpResponse(String subscriptionId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling contactGroupsGetList");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/ContactGroups/subscription/{subscriptionId}/groups");

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
    * Updates contact group by id
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id The id parameter
    * @param updateContactGroupVM The updateContactGroupVM parameter
    * @return ContactGroupVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ContactGroupVM contactGroupsUpdate(String id, UpdateContactGroupVM updateContactGroupVM) throws IOException {
        HttpResponse response = contactGroupsUpdateForHttpResponse(id, updateContactGroupVM);
        TypeReference<ContactGroupVM> typeRef = new TypeReference<ContactGroupVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Updates contact group by id
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ContactGroupVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ContactGroupVM contactGroupsUpdate(UpdateContactGroupVM updateContactGroupVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = contactGroupsUpdateForHttpResponse(updateContactGroupVM, id, params);
        TypeReference<ContactGroupVM> typeRef = new TypeReference<ContactGroupVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse contactGroupsUpdateForHttpResponse(String id, UpdateContactGroupVM updateContactGroupVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling contactGroupsUpdate");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/ContactGroups/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(updateContactGroupVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse contactGroupsUpdateForHttpResponse(String id, java.io.InputStream updateContactGroupVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling contactGroupsUpdate");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/ContactGroups/{id}");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = updateContactGroupVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, updateContactGroupVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse contactGroupsUpdateForHttpResponse(UpdateContactGroupVM updateContactGroupVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling contactGroupsUpdate");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/ContactGroups/{id}");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(updateContactGroupVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


}
