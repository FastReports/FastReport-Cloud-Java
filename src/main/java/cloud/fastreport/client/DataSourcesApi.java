package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import cloud.fastreport.model.CreateDataSourceVM;
import cloud.fastreport.model.DataSourcePermissionsVM;
import cloud.fastreport.model.DataSourceSorting;
import cloud.fastreport.model.DataSourceVM;
import cloud.fastreport.model.DataSourcesVM;
import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.RenameDataSourceVM;
import cloud.fastreport.model.UpdateDataSourceConnectionStringVM;
import cloud.fastreport.model.UpdateDataSourcePermissionsVM;
import cloud.fastreport.model.UpdateDataSourceSubscriptionVM;

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
public class DataSourcesApi {
    private ApiClient apiClient;

    public DataSourcesApi() {
        this(new ApiClient());
    }

    public DataSourcesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Returns a number of data sources in subscription
    * <p><b>200</b> - Everything is all right
    * <p><b>400</b> - id is not hex24
    * <p><b>403</b> - You don&#39;t have permisison to get data sources from this subscription (or in your default (1st) subscription)
    * <p><b>404</b> - there is no subscription with provided id found, or user don&#39;t even have a subscription
    * @param subscriptionId subscripiton id
    * @return Long
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Long dataSourcesCountDataSourcesAsync(String subscriptionId) throws IOException {
        HttpResponse response = dataSourcesCountDataSourcesAsyncForHttpResponse(subscriptionId);
        TypeReference<Long> typeRef = new TypeReference<Long>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns a number of data sources in subscription
    * <p><b>200</b> - Everything is all right
    * <p><b>400</b> - id is not hex24
    * <p><b>403</b> - You don&#39;t have permisison to get data sources from this subscription (or in your default (1st) subscription)
    * <p><b>404</b> - there is no subscription with provided id found, or user don&#39;t even have a subscription
    * @param subscriptionId subscripiton id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Long
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Long dataSourcesCountDataSourcesAsync(String subscriptionId, Map<String, Object> params) throws IOException {
        HttpResponse response = dataSourcesCountDataSourcesAsyncForHttpResponse(subscriptionId, params);
        TypeReference<Long> typeRef = new TypeReference<Long>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse dataSourcesCountDataSourcesAsyncForHttpResponse(String subscriptionId) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling dataSourcesCountDataSourcesAsync");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources/{subscriptionId}/count");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse dataSourcesCountDataSourcesAsyncForHttpResponse(String subscriptionId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'subscriptionId' when calling dataSourcesCountDataSourcesAsync");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources/{subscriptionId}/count");

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
    * Create new data source
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param createDataSourceVM create viewmodel
    * @return DataSourceVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DataSourceVM dataSourcesCreateDataSource(CreateDataSourceVM createDataSourceVM) throws IOException {
        HttpResponse response = dataSourcesCreateDataSourceForHttpResponse(createDataSourceVM);
        TypeReference<DataSourceVM> typeRef = new TypeReference<DataSourceVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create new data source
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DataSourceVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DataSourceVM dataSourcesCreateDataSource(CreateDataSourceVM createDataSourceVM, Map<String, Object> params) throws IOException {
        HttpResponse response = dataSourcesCreateDataSourceForHttpResponse(createDataSourceVM, params);
        TypeReference<DataSourceVM> typeRef = new TypeReference<DataSourceVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse dataSourcesCreateDataSourceForHttpResponse(CreateDataSourceVM createDataSourceVM) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(createDataSourceVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse dataSourcesCreateDataSourceForHttpResponse(java.io.InputStream createDataSourceVM, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = createDataSourceVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, createDataSourceVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse dataSourcesCreateDataSourceForHttpResponse(CreateDataSourceVM createDataSourceVM, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(createDataSourceVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Delete data source by id
    * <p><b>204</b> - No Content
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id data source id
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void dataSourcesDeleteDataSource(String id) throws IOException {
        dataSourcesDeleteDataSourceForHttpResponse(id);
    }

  /**
    * Delete data source by id
    * <p><b>204</b> - No Content
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id data source id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void dataSourcesDeleteDataSource(String id, Map<String, Object> params) throws IOException {
        dataSourcesDeleteDataSourceForHttpResponse(id, params);
    }

    public HttpResponse dataSourcesDeleteDataSourceForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling dataSourcesDeleteDataSource");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

    public HttpResponse dataSourcesDeleteDataSourceForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling dataSourcesDeleteDataSource");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources/{id}");

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
    * This should connect to a database and set data structure
    * <p><b>204</b> - No Content
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id datasource&#39;s id
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void dataSourcesFetchData(String id) throws IOException {
        dataSourcesFetchDataForHttpResponse(id);
    }

  /**
    * This should connect to a database and set data structure
    * <p><b>204</b> - No Content
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id datasource&#39;s id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void dataSourcesFetchData(String id, Map<String, Object> params) throws IOException {
        dataSourcesFetchDataForHttpResponse(id, params);
    }

    public HttpResponse dataSourcesFetchDataForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling dataSourcesFetchData");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources/{id}/fetch");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse dataSourcesFetchDataForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling dataSourcesFetchData");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources/{id}/fetch");

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
    * Returns all of the data sources, that current user have permission for in a subscription &lt;br /&gt;  The method will return minimal infomration about the datasources: &lt;br /&gt;  id, name, editedTime, status.
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * @param subscriptionId subscription id
    * @param skip how many data sources will be skipped
    * @param take how many data sources will be taken
    * @param orderBy field to order by
    * @param desc descending sort
    * @return DataSourcesVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DataSourcesVM dataSourcesGetAvailableDataSources(String subscriptionId, Integer skip, Integer take, DataSourceSorting orderBy, Boolean desc) throws IOException {
        HttpResponse response = dataSourcesGetAvailableDataSourcesForHttpResponse(subscriptionId, skip, take, orderBy, desc);
        TypeReference<DataSourcesVM> typeRef = new TypeReference<DataSourcesVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns all of the data sources, that current user have permission for in a subscription &lt;br /&gt;  The method will return minimal infomration about the datasources: &lt;br /&gt;  id, name, editedTime, status.
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DataSourcesVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DataSourcesVM dataSourcesGetAvailableDataSources(Map<String, Object> params) throws IOException {
        HttpResponse response = dataSourcesGetAvailableDataSourcesForHttpResponse(params);
        TypeReference<DataSourcesVM> typeRef = new TypeReference<DataSourcesVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse dataSourcesGetAvailableDataSourcesForHttpResponse(String subscriptionId, Integer skip, Integer take, DataSourceSorting orderBy, Boolean desc) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources");
        if (subscriptionId != null) {
            String key = "subscriptionId";
            Object value = subscriptionId;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (skip != null) {
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
        }        if (orderBy != null) {
            String key = "orderBy";
            Object value = orderBy;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (desc != null) {
            String key = "desc";
            Object value = desc;
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

    public HttpResponse dataSourcesGetAvailableDataSourcesForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources");

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
    * Get data source by id
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id data source id
    * @return DataSourceVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DataSourceVM dataSourcesGetDataSource(String id) throws IOException {
        HttpResponse response = dataSourcesGetDataSourceForHttpResponse(id);
        TypeReference<DataSourceVM> typeRef = new TypeReference<DataSourceVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get data source by id
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id data source id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DataSourceVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DataSourceVM dataSourcesGetDataSource(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = dataSourcesGetDataSourceForHttpResponse(id, params);
        TypeReference<DataSourceVM> typeRef = new TypeReference<DataSourceVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse dataSourcesGetDataSourceForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling dataSourcesGetDataSource");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources/{id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse dataSourcesGetDataSourceForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling dataSourcesGetDataSource");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources/{id}");

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
    * Get all Data source permissions
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id data source id
    * @return DataSourcePermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DataSourcePermissionsVM dataSourcesGetPermissions(String id) throws IOException {
        HttpResponse response = dataSourcesGetPermissionsForHttpResponse(id);
        TypeReference<DataSourcePermissionsVM> typeRef = new TypeReference<DataSourcePermissionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all Data source permissions
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id data source id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DataSourcePermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DataSourcePermissionsVM dataSourcesGetPermissions(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = dataSourcesGetPermissionsForHttpResponse(id, params);
        TypeReference<DataSourcePermissionsVM> typeRef = new TypeReference<DataSourcePermissionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse dataSourcesGetPermissionsForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling dataSourcesGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse dataSourcesGetPermissionsForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling dataSourcesGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources/{id}/permissions");

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
    * Rename data source by id
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id data source id
    * @param renameDataSourceVM rename viewmodel
    * @return DataSourceVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DataSourceVM dataSourcesRenameDataSource(String id, RenameDataSourceVM renameDataSourceVM) throws IOException {
        HttpResponse response = dataSourcesRenameDataSourceForHttpResponse(id, renameDataSourceVM);
        TypeReference<DataSourceVM> typeRef = new TypeReference<DataSourceVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Rename data source by id
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id data source id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DataSourceVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DataSourceVM dataSourcesRenameDataSource(RenameDataSourceVM renameDataSourceVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = dataSourcesRenameDataSourceForHttpResponse(renameDataSourceVM, id, params);
        TypeReference<DataSourceVM> typeRef = new TypeReference<DataSourceVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse dataSourcesRenameDataSourceForHttpResponse(String id, RenameDataSourceVM renameDataSourceVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling dataSourcesRenameDataSource");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources/{id}/rename");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(renameDataSourceVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse dataSourcesRenameDataSourceForHttpResponse(String id, java.io.InputStream renameDataSourceVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling dataSourcesRenameDataSource");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources/{id}/rename");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = renameDataSourceVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, renameDataSourceVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse dataSourcesRenameDataSourceForHttpResponse(RenameDataSourceVM renameDataSourceVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling dataSourcesRenameDataSource");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources/{id}/rename");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(renameDataSourceVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


  /**
    * Update data source&#39;s connection string by id
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id data source id
    * @param updateDataSourceConnectionStringVM update viewmodel
    * @return DataSourceVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DataSourceVM dataSourcesUpdateConnectionString(String id, UpdateDataSourceConnectionStringVM updateDataSourceConnectionStringVM) throws IOException {
        HttpResponse response = dataSourcesUpdateConnectionStringForHttpResponse(id, updateDataSourceConnectionStringVM);
        TypeReference<DataSourceVM> typeRef = new TypeReference<DataSourceVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update data source&#39;s connection string by id
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id data source id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DataSourceVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DataSourceVM dataSourcesUpdateConnectionString(UpdateDataSourceConnectionStringVM updateDataSourceConnectionStringVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = dataSourcesUpdateConnectionStringForHttpResponse(updateDataSourceConnectionStringVM, id, params);
        TypeReference<DataSourceVM> typeRef = new TypeReference<DataSourceVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse dataSourcesUpdateConnectionStringForHttpResponse(String id, UpdateDataSourceConnectionStringVM updateDataSourceConnectionStringVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling dataSourcesUpdateConnectionString");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources/{id}/ConnectionString");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(updateDataSourceConnectionStringVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse dataSourcesUpdateConnectionStringForHttpResponse(String id, java.io.InputStream updateDataSourceConnectionStringVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling dataSourcesUpdateConnectionString");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources/{id}/ConnectionString");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = updateDataSourceConnectionStringVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, updateDataSourceConnectionStringVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse dataSourcesUpdateConnectionStringForHttpResponse(UpdateDataSourceConnectionStringVM updateDataSourceConnectionStringVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling dataSourcesUpdateConnectionString");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources/{id}/ConnectionString");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(updateDataSourceConnectionStringVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


  /**
    * Update permissions
    * <p><b>204</b> - No Content
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id 
    * @param updateDataSourcePermissionsVM 
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void dataSourcesUpdatePermissions(String id, UpdateDataSourcePermissionsVM updateDataSourcePermissionsVM) throws IOException {
        dataSourcesUpdatePermissionsForHttpResponse(id, updateDataSourcePermissionsVM);
    }

  /**
    * Update permissions
    * <p><b>204</b> - No Content
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id 
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void dataSourcesUpdatePermissions(UpdateDataSourcePermissionsVM updateDataSourcePermissionsVM, String id, Map<String, Object> params) throws IOException {
        dataSourcesUpdatePermissionsForHttpResponse(updateDataSourcePermissionsVM, id, params);
    }

    public HttpResponse dataSourcesUpdatePermissionsForHttpResponse(String id, UpdateDataSourcePermissionsVM updateDataSourcePermissionsVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling dataSourcesUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(updateDataSourcePermissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse dataSourcesUpdatePermissionsForHttpResponse(String id, java.io.InputStream updateDataSourcePermissionsVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling dataSourcesUpdatePermissions");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = updateDataSourcePermissionsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, updateDataSourcePermissionsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse dataSourcesUpdatePermissionsForHttpResponse(UpdateDataSourcePermissionsVM updateDataSourcePermissionsVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling dataSourcesUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources/{id}/permissions");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(updateDataSourcePermissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Update data source&#39;s subscription
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id data source id
    * @param updateDataSourceSubscriptionVM update subscription viewmodel
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void dataSourcesUpdateSubscriptionDataSource(String id, UpdateDataSourceSubscriptionVM updateDataSourceSubscriptionVM) throws IOException {
        dataSourcesUpdateSubscriptionDataSourceForHttpResponse(id, updateDataSourceSubscriptionVM);
    }

  /**
    * Update data source&#39;s subscription
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id data source id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void dataSourcesUpdateSubscriptionDataSource(UpdateDataSourceSubscriptionVM updateDataSourceSubscriptionVM, String id, Map<String, Object> params) throws IOException {
        dataSourcesUpdateSubscriptionDataSourceForHttpResponse(updateDataSourceSubscriptionVM, id, params);
    }

    public HttpResponse dataSourcesUpdateSubscriptionDataSourceForHttpResponse(String id, UpdateDataSourceSubscriptionVM updateDataSourceSubscriptionVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling dataSourcesUpdateSubscriptionDataSource");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources/{id}/updateSubscription");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(updateDataSourceSubscriptionVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse dataSourcesUpdateSubscriptionDataSourceForHttpResponse(String id, java.io.InputStream updateDataSourceSubscriptionVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling dataSourcesUpdateSubscriptionDataSource");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources/{id}/updateSubscription");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = updateDataSourceSubscriptionVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, updateDataSourceSubscriptionVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse dataSourcesUpdateSubscriptionDataSourceForHttpResponse(UpdateDataSourceSubscriptionVM updateDataSourceSubscriptionVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling dataSourcesUpdateSubscriptionDataSource");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources/{id}/updateSubscription");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(updateDataSourceSubscriptionVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


}
