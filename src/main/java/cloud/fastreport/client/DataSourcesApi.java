package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import cloud.fastreport.model.CreateDataSourceVM;
import cloud.fastreport.model.DataSourcePermissions;
import cloud.fastreport.model.DataSourcePermissionsVM;
import cloud.fastreport.model.DataSourceVM;
import cloud.fastreport.model.DataSourcesVM;
import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.RenameDataSourceVM;
import cloud.fastreport.model.UpdateDataSourceConnectionStringVM;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-22T14:13:34.806+03:00[Europe/Moscow]")
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
    * Add Permission
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id data source id
    * @param permissionsVM The permissionsVM parameter
    * @return DataSourcePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DataSourcePermissions dataSourcesAddPermission(String id, DataSourcePermissionsVM permissionsVM) throws IOException {
        HttpResponse response = dataSourcesAddPermissionForHttpResponse(id, permissionsVM);
        TypeReference<DataSourcePermissions> typeRef = new TypeReference<DataSourcePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Add Permission
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id data source id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DataSourcePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DataSourcePermissions dataSourcesAddPermission(DataSourcePermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = dataSourcesAddPermissionForHttpResponse(permissionsVM, id, params);
        TypeReference<DataSourcePermissions> typeRef = new TypeReference<DataSourcePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse dataSourcesAddPermissionForHttpResponse(String id, DataSourcePermissionsVM permissionsVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling dataSourcesAddPermission");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(permissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse dataSourcesAddPermissionForHttpResponse(String id, java.io.InputStream permissionsVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling dataSourcesAddPermission");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = permissionsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, permissionsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse dataSourcesAddPermissionForHttpResponse(DataSourcePermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling dataSourcesAddPermission");
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(permissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


  /**
    * Create new data source
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param viewModel create viewmodel
    * @return DataSourceVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DataSourceVM dataSourcesCreateDataSource(CreateDataSourceVM viewModel) throws IOException {
        HttpResponse response = dataSourcesCreateDataSourceForHttpResponse(viewModel);
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
    public DataSourceVM dataSourcesCreateDataSource(CreateDataSourceVM viewModel, Map<String, Object> params) throws IOException {
        HttpResponse response = dataSourcesCreateDataSourceForHttpResponse(viewModel, params);
        TypeReference<DataSourceVM> typeRef = new TypeReference<DataSourceVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse dataSourcesCreateDataSourceForHttpResponse(CreateDataSourceVM viewModel) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(viewModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse dataSourcesCreateDataSourceForHttpResponse(java.io.InputStream viewModel, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = viewModel == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, viewModel);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse dataSourcesCreateDataSourceForHttpResponse(CreateDataSourceVM viewModel, Map<String, Object> params) throws IOException {
        
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(viewModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Delete data source by id
    * <p><b>204</b> - Success
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
    * <p><b>204</b> - Success
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
    * <p><b>200</b> - Success
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
    * <p><b>200</b> - Success
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
    * Returns all of the data sources, that current user have permission for in a subscription  if subscription id is null, returns all data sources, that current user have permission for
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * @param subscriptionId subscription id
    * @param skip how many data sources will be skipped
    * @param take how many data sources will be taken
    * @return DataSourcesVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DataSourcesVM dataSourcesGetAvailableDataSources(String subscriptionId, Integer skip, Integer take) throws IOException {
        HttpResponse response = dataSourcesGetAvailableDataSourcesForHttpResponse(subscriptionId, skip, take);
        TypeReference<DataSourcesVM> typeRef = new TypeReference<DataSourcesVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns all of the data sources, that current user have permission for in a subscription  if subscription id is null, returns all data sources, that current user have permission for
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

    public HttpResponse dataSourcesGetAvailableDataSourcesForHttpResponse(String subscriptionId, Integer skip, Integer take) throws IOException {
        
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
    * @return DataSourcePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DataSourcePermissions dataSourcesGetPermissions(String id) throws IOException {
        HttpResponse response = dataSourcesGetPermissionsForHttpResponse(id);
        TypeReference<DataSourcePermissions> typeRef = new TypeReference<DataSourcePermissions>() {};
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
    * @return DataSourcePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DataSourcePermissions dataSourcesGetPermissions(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = dataSourcesGetPermissionsForHttpResponse(id, params);
        TypeReference<DataSourcePermissions> typeRef = new TypeReference<DataSourcePermissions>() {};
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
    * @param renameModel rename viewmodel
    * @return DataSourceVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DataSourceVM dataSourcesRenameDataSource(String id, RenameDataSourceVM renameModel) throws IOException {
        HttpResponse response = dataSourcesRenameDataSourceForHttpResponse(id, renameModel);
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
    public DataSourceVM dataSourcesRenameDataSource(RenameDataSourceVM renameModel, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = dataSourcesRenameDataSourceForHttpResponse(renameModel, id, params);
        TypeReference<DataSourceVM> typeRef = new TypeReference<DataSourceVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse dataSourcesRenameDataSourceForHttpResponse(String id, RenameDataSourceVM renameModel) throws IOException {
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(renameModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse dataSourcesRenameDataSourceForHttpResponse(String id, java.io.InputStream renameModel, String mediaType) throws IOException {
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

              HttpContent content = renameModel == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, renameModel);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse dataSourcesRenameDataSourceForHttpResponse(RenameDataSourceVM renameModel, String id, Map<String, Object> params) throws IOException {
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(renameModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


  /**
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id The id parameter
    * @param permissionsVM The permissionsVM parameter
    * @return DataSourcePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DataSourcePermissions dataSourcesRevokePermission(String id, DataSourcePermissionsVM permissionsVM) throws IOException {
        HttpResponse response = dataSourcesRevokePermissionForHttpResponse(id, permissionsVM);
        TypeReference<DataSourcePermissions> typeRef = new TypeReference<DataSourcePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id The id parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DataSourcePermissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DataSourcePermissions dataSourcesRevokePermission(DataSourcePermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = dataSourcesRevokePermissionForHttpResponse(permissionsVM, id, params);
        TypeReference<DataSourcePermissions> typeRef = new TypeReference<DataSourcePermissions>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse dataSourcesRevokePermissionForHttpResponse(String id, DataSourcePermissionsVM permissionsVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling dataSourcesRevokePermission");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

      public HttpResponse dataSourcesRevokePermissionForHttpResponse(String id, java.io.InputStream permissionsVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling dataSourcesRevokePermission");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/data/v1/DataSources/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = permissionsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, permissionsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
      }

    public HttpResponse dataSourcesRevokePermissionForHttpResponse(DataSourcePermissionsVM permissionsVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling dataSourcesRevokePermission");
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
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
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
    * @param updateModel update viewmodel
    * @return DataSourceVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DataSourceVM dataSourcesUpdateConnectionString(String id, UpdateDataSourceConnectionStringVM updateModel) throws IOException {
        HttpResponse response = dataSourcesUpdateConnectionStringForHttpResponse(id, updateModel);
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
    public DataSourceVM dataSourcesUpdateConnectionString(UpdateDataSourceConnectionStringVM updateModel, String id, Map<String, Object> params) throws IOException {
        HttpResponse response = dataSourcesUpdateConnectionStringForHttpResponse(updateModel, id, params);
        TypeReference<DataSourceVM> typeRef = new TypeReference<DataSourceVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse dataSourcesUpdateConnectionStringForHttpResponse(String id, UpdateDataSourceConnectionStringVM updateModel) throws IOException {
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(updateModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse dataSourcesUpdateConnectionStringForHttpResponse(String id, java.io.InputStream updateModel, String mediaType) throws IOException {
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

              HttpContent content = updateModel == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, updateModel);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse dataSourcesUpdateConnectionStringForHttpResponse(UpdateDataSourceConnectionStringVM updateModel, String id, Map<String, Object> params) throws IOException {
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(updateModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
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
    * @param updatesubscriptionModel update subscription viewmodel
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void dataSourcesUpdateSubscriptionDataSource(String id, UpdateDataSourceSubscriptionVM updatesubscriptionModel) throws IOException {
        dataSourcesUpdateSubscriptionDataSourceForHttpResponse(id, updatesubscriptionModel);
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
    public void dataSourcesUpdateSubscriptionDataSource(UpdateDataSourceSubscriptionVM updatesubscriptionModel, String id, Map<String, Object> params) throws IOException {
        dataSourcesUpdateSubscriptionDataSourceForHttpResponse(updatesubscriptionModel, id, params);
    }

    public HttpResponse dataSourcesUpdateSubscriptionDataSourceForHttpResponse(String id, UpdateDataSourceSubscriptionVM updatesubscriptionModel) throws IOException {
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(updatesubscriptionModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse dataSourcesUpdateSubscriptionDataSourceForHttpResponse(String id, java.io.InputStream updatesubscriptionModel, String mediaType) throws IOException {
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

              HttpContent content = updatesubscriptionModel == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, updatesubscriptionModel);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse dataSourcesUpdateSubscriptionDataSourceForHttpResponse(UpdateDataSourceSubscriptionVM updatesubscriptionModel, String id, Map<String, Object> params) throws IOException {
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(updatesubscriptionModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


}
