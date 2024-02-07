package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import cloud.fastreport.model.ContactVM;
import cloud.fastreport.model.ContactsVM;
import cloud.fastreport.model.CreateContactVM;
import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.UpdateContactVM;

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
public class ContactsApi {
    private ApiClient apiClient;

    public ContactsApi() {
        this(new ApiClient());
    }

    public ContactsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Creates new contact
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param createContactVM 
    * @return ContactVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ContactVM contactsCreate(CreateContactVM createContactVM) throws IOException {
        HttpResponse response = contactsCreateForHttpResponse(createContactVM);
        TypeReference<ContactVM> typeRef = new TypeReference<ContactVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Creates new contact
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ContactVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ContactVM contactsCreate(CreateContactVM createContactVM, Map<String, Object> params) throws IOException {
        HttpResponse response = contactsCreateForHttpResponse(createContactVM, params);
        TypeReference<ContactVM> typeRef = new TypeReference<ContactVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse contactsCreateForHttpResponse(CreateContactVM createContactVM) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/Contacts/contact");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(createContactVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }

      public HttpResponse contactsCreateForHttpResponse(java.io.InputStream createContactVM, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/Contacts/contact");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent aContent = createContactVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, createContactVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
      }

    public HttpResponse contactsCreateForHttpResponse(CreateContactVM createContactVM, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/Contacts/contact");

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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(createContactVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }


  /**
    * Removes contact by id
    * <p><b>204</b> - No Content
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param id 
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void contactsDelete(String id) throws IOException {
        contactsDeleteForHttpResponse(id);
    }

  /**
    * Removes contact by id
    * <p><b>204</b> - No Content
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param id 
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void contactsDelete(String id, Map<String, Object> params) throws IOException {
        contactsDeleteForHttpResponse(id, params);
    }

    public HttpResponse contactsDeleteForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling contactsDelete");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/Contacts/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, aContent).execute();
    }

    public HttpResponse contactsDeleteForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling contactsDelete");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/Contacts/{id}");

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
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, aContent).execute();
    }


  /**
    * Returns contact group by id
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param id 
    * @return ContactVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ContactVM contactsGet(String id) throws IOException {
        HttpResponse response = contactsGetForHttpResponse(id);
        TypeReference<ContactVM> typeRef = new TypeReference<ContactVM>() {};
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
    * @param id 
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ContactVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ContactVM contactsGet(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = contactsGetForHttpResponse(id, params);
        TypeReference<ContactVM> typeRef = new TypeReference<ContactVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse contactsGetForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling contactsGet");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/Contacts/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }

    public HttpResponse contactsGetForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling contactsGet");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/Contacts/{id}");

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
    * Returns contacts by group id
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param groupId 
    * @param skip 
    * @param take 
    * @return ContactsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ContactsVM contactsGetByGroup(String groupId, Integer skip, Integer take) throws IOException {
        HttpResponse response = contactsGetByGroupForHttpResponse(groupId, skip, take);
        TypeReference<ContactsVM> typeRef = new TypeReference<ContactsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns contacts by group id
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param groupId 
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ContactsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ContactsVM contactsGetByGroup(String groupId, Map<String, Object> params) throws IOException {
        HttpResponse response = contactsGetByGroupForHttpResponse(groupId, params);
        TypeReference<ContactsVM> typeRef = new TypeReference<ContactsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse contactsGetByGroupForHttpResponse(String groupId, Integer skip, Integer take) throws IOException {
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'groupId' when calling contactsGetByGroup");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/Contacts/group/{groupId}/contacts");
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }

    public HttpResponse contactsGetByGroupForHttpResponse(String groupId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'groupId' when calling contactsGetByGroup");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/Contacts/group/{groupId}/contacts");

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
    * Allows to search for contacts
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param subscriptionId 
    * @param skip 
    * @param take 
    * @param searchPattern 
    * @return ContactsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ContactsVM contactsGetList(String subscriptionId, Integer skip, Integer take, String searchPattern) throws IOException {
        HttpResponse response = contactsGetListForHttpResponse(subscriptionId, skip, take, searchPattern);
        TypeReference<ContactsVM> typeRef = new TypeReference<ContactsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Allows to search for contacts
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param subscriptionId 
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ContactsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ContactsVM contactsGetList(String subscriptionId, Map<String, Object> params) throws IOException {
        HttpResponse response = contactsGetListForHttpResponse(subscriptionId, params);
        TypeReference<ContactsVM> typeRef = new TypeReference<ContactsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse contactsGetListForHttpResponse(String subscriptionId, Integer skip, Integer take, String searchPattern) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling contactsGetList");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/Contacts/subscription/{subscriptionId}/contacts");
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
        }        if (searchPattern != null) {
            String key = "searchPattern";
            Object value = searchPattern;
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }

    public HttpResponse contactsGetListForHttpResponse(String subscriptionId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling contactsGetList");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/Contacts/subscription/{subscriptionId}/contacts");

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
    * Updates contact by id
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param id 
    * @param updateContactVM 
    * @return ContactVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ContactVM contactsUpdate(String id, UpdateContactVM updateContactVM) throws IOException {
        HttpResponse response = contactsUpdateForHttpResponse(id, updateContactVM);
        TypeReference<ContactVM> typeRef = new TypeReference<ContactVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Updates contact by id
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param id 
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ContactVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ContactVM contactsUpdate(UpdateContactVM updateContactVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = contactsUpdateForHttpResponse(updateContactVM, id, params);
        TypeReference<ContactVM> typeRef = new TypeReference<ContactVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse contactsUpdateForHttpResponse(String id, UpdateContactVM updateContactVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling contactsUpdate");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/Contacts/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(updateContactVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
    }

      public HttpResponse contactsUpdateForHttpResponse(String id, java.io.InputStream updateContactVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling contactsUpdate");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/Contacts/{id}");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent aContent = updateContactVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, updateContactVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
      }

    public HttpResponse contactsUpdateForHttpResponse(UpdateContactVM updateContactVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling contactsUpdate");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/v1/Contacts/{id}");

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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(updateContactVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
    }


}
