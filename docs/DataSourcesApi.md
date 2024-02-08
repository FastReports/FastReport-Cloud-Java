# DataSourcesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dataSourcesCountDataSourcesAsync**](DataSourcesApi.md#dataSourcesCountDataSourcesAsync) | **GET** /api/data/v1/DataSources/{subscriptionId}/count | Returns a number of data sources in subscription |
| [**dataSourcesCountDataSourcesAsyncWithHttpInfo**](DataSourcesApi.md#dataSourcesCountDataSourcesAsyncWithHttpInfo) | **GET** /api/data/v1/DataSources/{subscriptionId}/count | Returns a number of data sources in subscription |
| [**dataSourcesCreateDataSource**](DataSourcesApi.md#dataSourcesCreateDataSource) | **POST** /api/data/v1/DataSources | Create new data source |
| [**dataSourcesCreateDataSourceWithHttpInfo**](DataSourcesApi.md#dataSourcesCreateDataSourceWithHttpInfo) | **POST** /api/data/v1/DataSources | Create new data source |
| [**dataSourcesDeleteDataSource**](DataSourcesApi.md#dataSourcesDeleteDataSource) | **DELETE** /api/data/v1/DataSources/{id} | Delete data source by id |
| [**dataSourcesDeleteDataSourceWithHttpInfo**](DataSourcesApi.md#dataSourcesDeleteDataSourceWithHttpInfo) | **DELETE** /api/data/v1/DataSources/{id} | Delete data source by id |
| [**dataSourcesFetchData**](DataSourcesApi.md#dataSourcesFetchData) | **GET** /api/data/v1/DataSources/{id}/fetch | This should connect to a database and set data structure |
| [**dataSourcesFetchDataWithHttpInfo**](DataSourcesApi.md#dataSourcesFetchDataWithHttpInfo) | **GET** /api/data/v1/DataSources/{id}/fetch | This should connect to a database and set data structure |
| [**dataSourcesGetAvailableDataSources**](DataSourcesApi.md#dataSourcesGetAvailableDataSources) | **GET** /api/data/v1/DataSources | Returns all of the data sources, that current user have permission for in a subscription &lt;br /&gt;  The method will return minimal infomration about the datasources: &lt;br /&gt;  id, name, editedTime, status. |
| [**dataSourcesGetAvailableDataSourcesWithHttpInfo**](DataSourcesApi.md#dataSourcesGetAvailableDataSourcesWithHttpInfo) | **GET** /api/data/v1/DataSources | Returns all of the data sources, that current user have permission for in a subscription &lt;br /&gt;  The method will return minimal infomration about the datasources: &lt;br /&gt;  id, name, editedTime, status. |
| [**dataSourcesGetDataSource**](DataSourcesApi.md#dataSourcesGetDataSource) | **GET** /api/data/v1/DataSources/{id} | Get data source by id |
| [**dataSourcesGetDataSourceWithHttpInfo**](DataSourcesApi.md#dataSourcesGetDataSourceWithHttpInfo) | **GET** /api/data/v1/DataSources/{id} | Get data source by id |
| [**dataSourcesGetPermissions**](DataSourcesApi.md#dataSourcesGetPermissions) | **GET** /api/data/v1/DataSources/{id}/permissions | Get all Data source permissions |
| [**dataSourcesGetPermissionsWithHttpInfo**](DataSourcesApi.md#dataSourcesGetPermissionsWithHttpInfo) | **GET** /api/data/v1/DataSources/{id}/permissions | Get all Data source permissions |
| [**dataSourcesRenameDataSource**](DataSourcesApi.md#dataSourcesRenameDataSource) | **PUT** /api/data/v1/DataSources/{id}/rename | Rename data source by id |
| [**dataSourcesRenameDataSourceWithHttpInfo**](DataSourcesApi.md#dataSourcesRenameDataSourceWithHttpInfo) | **PUT** /api/data/v1/DataSources/{id}/rename | Rename data source by id |
| [**dataSourcesUpdateConnectionString**](DataSourcesApi.md#dataSourcesUpdateConnectionString) | **PUT** /api/data/v1/DataSources/{id}/ConnectionString | Update data source&#39;s connection string by id |
| [**dataSourcesUpdateConnectionStringWithHttpInfo**](DataSourcesApi.md#dataSourcesUpdateConnectionStringWithHttpInfo) | **PUT** /api/data/v1/DataSources/{id}/ConnectionString | Update data source&#39;s connection string by id |
| [**dataSourcesUpdatePermissions**](DataSourcesApi.md#dataSourcesUpdatePermissions) | **POST** /api/data/v1/DataSources/{id}/permissions | Update permissions |
| [**dataSourcesUpdatePermissionsWithHttpInfo**](DataSourcesApi.md#dataSourcesUpdatePermissionsWithHttpInfo) | **POST** /api/data/v1/DataSources/{id}/permissions | Update permissions |
| [**dataSourcesUpdateSubscriptionDataSource**](DataSourcesApi.md#dataSourcesUpdateSubscriptionDataSource) | **PUT** /api/data/v1/DataSources/{id}/updateSubscription | Update data source&#39;s subscription |
| [**dataSourcesUpdateSubscriptionDataSourceWithHttpInfo**](DataSourcesApi.md#dataSourcesUpdateSubscriptionDataSourceWithHttpInfo) | **PUT** /api/data/v1/DataSources/{id}/updateSubscription | Update data source&#39;s subscription |



## dataSourcesCountDataSourcesAsync

> Long dataSourcesCountDataSourcesAsync(subscriptionId)

Returns a number of data sources in subscription

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DataSourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DataSourcesApi apiInstance = new DataSourcesApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | subscripiton id
        try {
            Long result = apiInstance.dataSourcesCountDataSourcesAsync(subscriptionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSourcesApi#dataSourcesCountDataSourcesAsync");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **subscriptionId** | **String**| subscripiton id | |

### Return type

**Long**


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Everything is all right |  -  |
| **400** | id is not hex24 |  -  |
| **403** | You don&#39;t have permisison to get data sources from this subscription (or in your default (1st) subscription) |  -  |
| **404** | there is no subscription with provided id found, or user don&#39;t even have a subscription |  -  |

## dataSourcesCountDataSourcesAsyncWithHttpInfo

> ApiResponse<Long> dataSourcesCountDataSourcesAsync dataSourcesCountDataSourcesAsyncWithHttpInfo(subscriptionId)

Returns a number of data sources in subscription

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DataSourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DataSourcesApi apiInstance = new DataSourcesApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | subscripiton id
        try {
            ApiResponse<Long> response = apiInstance.dataSourcesCountDataSourcesAsyncWithHttpInfo(subscriptionId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSourcesApi#dataSourcesCountDataSourcesAsync");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **subscriptionId** | **String**| subscripiton id | |

### Return type

ApiResponse<**Long**>


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Everything is all right |  -  |
| **400** | id is not hex24 |  -  |
| **403** | You don&#39;t have permisison to get data sources from this subscription (or in your default (1st) subscription) |  -  |
| **404** | there is no subscription with provided id found, or user don&#39;t even have a subscription |  -  |


## dataSourcesCreateDataSource

> DataSourceVM dataSourcesCreateDataSource(createDataSourceVM)

Create new data source

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DataSourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DataSourcesApi apiInstance = new DataSourcesApi(defaultClient);
        CreateDataSourceVM createDataSourceVM = new CreateDataSourceVM(); // CreateDataSourceVM | create viewmodel
        try {
            DataSourceVM result = apiInstance.dataSourcesCreateDataSource(createDataSourceVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSourcesApi#dataSourcesCreateDataSource");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createDataSourceVM** | [**CreateDataSourceVM**](CreateDataSourceVM.md)| create viewmodel | [optional] |

### Return type

[**DataSourceVM**](DataSourceVM.md)


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |

## dataSourcesCreateDataSourceWithHttpInfo

> ApiResponse<DataSourceVM> dataSourcesCreateDataSource dataSourcesCreateDataSourceWithHttpInfo(createDataSourceVM)

Create new data source

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DataSourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DataSourcesApi apiInstance = new DataSourcesApi(defaultClient);
        CreateDataSourceVM createDataSourceVM = new CreateDataSourceVM(); // CreateDataSourceVM | create viewmodel
        try {
            ApiResponse<DataSourceVM> response = apiInstance.dataSourcesCreateDataSourceWithHttpInfo(createDataSourceVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSourcesApi#dataSourcesCreateDataSource");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createDataSourceVM** | [**CreateDataSourceVM**](CreateDataSourceVM.md)| create viewmodel | [optional] |

### Return type

ApiResponse<[**DataSourceVM**](DataSourceVM.md)>


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |


## dataSourcesDeleteDataSource

> void dataSourcesDeleteDataSource(id)

Delete data source by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DataSourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DataSourcesApi apiInstance = new DataSourcesApi(defaultClient);
        String id = "id_example"; // String | data source id
        try {
            apiInstance.dataSourcesDeleteDataSource(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSourcesApi#dataSourcesDeleteDataSource");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| data source id | |

### Return type


null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |

## dataSourcesDeleteDataSourceWithHttpInfo

> ApiResponse<Void> dataSourcesDeleteDataSource dataSourcesDeleteDataSourceWithHttpInfo(id)

Delete data source by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DataSourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DataSourcesApi apiInstance = new DataSourcesApi(defaultClient);
        String id = "id_example"; // String | data source id
        try {
            ApiResponse<Void> response = apiInstance.dataSourcesDeleteDataSourceWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSourcesApi#dataSourcesDeleteDataSource");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| data source id | |

### Return type


ApiResponse<Void>

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |


## dataSourcesFetchData

> void dataSourcesFetchData(id)

This should connect to a database and set data structure

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DataSourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DataSourcesApi apiInstance = new DataSourcesApi(defaultClient);
        String id = "id_example"; // String | datasource's id
        try {
            apiInstance.dataSourcesFetchData(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSourcesApi#dataSourcesFetchData");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| datasource&#39;s id | |

### Return type


null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |

## dataSourcesFetchDataWithHttpInfo

> ApiResponse<Void> dataSourcesFetchData dataSourcesFetchDataWithHttpInfo(id)

This should connect to a database and set data structure

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DataSourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DataSourcesApi apiInstance = new DataSourcesApi(defaultClient);
        String id = "id_example"; // String | datasource's id
        try {
            ApiResponse<Void> response = apiInstance.dataSourcesFetchDataWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSourcesApi#dataSourcesFetchData");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| datasource&#39;s id | |

### Return type


ApiResponse<Void>

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |


## dataSourcesGetAvailableDataSources

> DataSourcesVM dataSourcesGetAvailableDataSources(subscriptionId, skip, take, orderBy, desc)

Returns all of the data sources, that current user have permission for in a subscription &lt;br /&gt;  The method will return minimal infomration about the datasources: &lt;br /&gt;  id, name, editedTime, status.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DataSourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DataSourcesApi apiInstance = new DataSourcesApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | id of subscription where the datasources are located
        Integer skip = 0; // Integer | how many data sources will be skipped
        Integer take = 10; // Integer | how many data sources will be taken
        DataSourceSorting orderBy = DataSourceSorting.fromValue("None"); // DataSourceSorting | field to order by
        Boolean desc = false; // Boolean | descending sort
        try {
            DataSourcesVM result = apiInstance.dataSourcesGetAvailableDataSources(subscriptionId, skip, take, orderBy, desc);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSourcesApi#dataSourcesGetAvailableDataSources");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **subscriptionId** | **String**| id of subscription where the datasources are located | [optional] |
| **skip** | **Integer**| how many data sources will be skipped | [optional] [default to 0] |
| **take** | **Integer**| how many data sources will be taken | [optional] [default to 10] |
| **orderBy** | [**DataSourceSorting**](.md)| field to order by | [optional] [enum: None, CreatedTime, EditedTime, Name] |
| **desc** | **Boolean**| descending sort | [optional] [default to false] |

### Return type

[**DataSourcesVM**](DataSourcesVM.md)


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

## dataSourcesGetAvailableDataSourcesWithHttpInfo

> ApiResponse<DataSourcesVM> dataSourcesGetAvailableDataSources dataSourcesGetAvailableDataSourcesWithHttpInfo(subscriptionId, skip, take, orderBy, desc)

Returns all of the data sources, that current user have permission for in a subscription &lt;br /&gt;  The method will return minimal infomration about the datasources: &lt;br /&gt;  id, name, editedTime, status.

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DataSourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DataSourcesApi apiInstance = new DataSourcesApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | id of subscription where the datasources are located
        Integer skip = 0; // Integer | how many data sources will be skipped
        Integer take = 10; // Integer | how many data sources will be taken
        DataSourceSorting orderBy = DataSourceSorting.fromValue("None"); // DataSourceSorting | field to order by
        Boolean desc = false; // Boolean | descending sort
        try {
            ApiResponse<DataSourcesVM> response = apiInstance.dataSourcesGetAvailableDataSourcesWithHttpInfo(subscriptionId, skip, take, orderBy, desc);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSourcesApi#dataSourcesGetAvailableDataSources");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **subscriptionId** | **String**| id of subscription where the datasources are located | [optional] |
| **skip** | **Integer**| how many data sources will be skipped | [optional] [default to 0] |
| **take** | **Integer**| how many data sources will be taken | [optional] [default to 10] |
| **orderBy** | [**DataSourceSorting**](.md)| field to order by | [optional] [enum: None, CreatedTime, EditedTime, Name] |
| **desc** | **Boolean**| descending sort | [optional] [default to false] |

### Return type

ApiResponse<[**DataSourcesVM**](DataSourcesVM.md)>


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## dataSourcesGetDataSource

> DataSourceVM dataSourcesGetDataSource(id)

Get data source by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DataSourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DataSourcesApi apiInstance = new DataSourcesApi(defaultClient);
        String id = "id_example"; // String | data source id
        try {
            DataSourceVM result = apiInstance.dataSourcesGetDataSource(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSourcesApi#dataSourcesGetDataSource");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| data source id | |

### Return type

[**DataSourceVM**](DataSourceVM.md)


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |

## dataSourcesGetDataSourceWithHttpInfo

> ApiResponse<DataSourceVM> dataSourcesGetDataSource dataSourcesGetDataSourceWithHttpInfo(id)

Get data source by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DataSourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DataSourcesApi apiInstance = new DataSourcesApi(defaultClient);
        String id = "id_example"; // String | data source id
        try {
            ApiResponse<DataSourceVM> response = apiInstance.dataSourcesGetDataSourceWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSourcesApi#dataSourcesGetDataSource");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| data source id | |

### Return type

ApiResponse<[**DataSourceVM**](DataSourceVM.md)>


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |


## dataSourcesGetPermissions

> DataSourcePermissionsVM dataSourcesGetPermissions(id)

Get all Data source permissions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DataSourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DataSourcesApi apiInstance = new DataSourcesApi(defaultClient);
        String id = "id_example"; // String | data source id
        try {
            DataSourcePermissionsVM result = apiInstance.dataSourcesGetPermissions(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSourcesApi#dataSourcesGetPermissions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| data source id | |

### Return type

[**DataSourcePermissionsVM**](DataSourcePermissionsVM.md)


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |

## dataSourcesGetPermissionsWithHttpInfo

> ApiResponse<DataSourcePermissionsVM> dataSourcesGetPermissions dataSourcesGetPermissionsWithHttpInfo(id)

Get all Data source permissions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DataSourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DataSourcesApi apiInstance = new DataSourcesApi(defaultClient);
        String id = "id_example"; // String | data source id
        try {
            ApiResponse<DataSourcePermissionsVM> response = apiInstance.dataSourcesGetPermissionsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSourcesApi#dataSourcesGetPermissions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| data source id | |

### Return type

ApiResponse<[**DataSourcePermissionsVM**](DataSourcePermissionsVM.md)>


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |


## dataSourcesRenameDataSource

> DataSourceVM dataSourcesRenameDataSource(id, renameDataSourceVM)

Rename data source by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DataSourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DataSourcesApi apiInstance = new DataSourcesApi(defaultClient);
        String id = "id_example"; // String | data source id
        RenameDataSourceVM renameDataSourceVM = new RenameDataSourceVM(); // RenameDataSourceVM | rename viewmodel
        try {
            DataSourceVM result = apiInstance.dataSourcesRenameDataSource(id, renameDataSourceVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSourcesApi#dataSourcesRenameDataSource");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| data source id | |
| **renameDataSourceVM** | [**RenameDataSourceVM**](RenameDataSourceVM.md)| rename viewmodel | [optional] |

### Return type

[**DataSourceVM**](DataSourceVM.md)


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |

## dataSourcesRenameDataSourceWithHttpInfo

> ApiResponse<DataSourceVM> dataSourcesRenameDataSource dataSourcesRenameDataSourceWithHttpInfo(id, renameDataSourceVM)

Rename data source by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DataSourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DataSourcesApi apiInstance = new DataSourcesApi(defaultClient);
        String id = "id_example"; // String | data source id
        RenameDataSourceVM renameDataSourceVM = new RenameDataSourceVM(); // RenameDataSourceVM | rename viewmodel
        try {
            ApiResponse<DataSourceVM> response = apiInstance.dataSourcesRenameDataSourceWithHttpInfo(id, renameDataSourceVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSourcesApi#dataSourcesRenameDataSource");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| data source id | |
| **renameDataSourceVM** | [**RenameDataSourceVM**](RenameDataSourceVM.md)| rename viewmodel | [optional] |

### Return type

ApiResponse<[**DataSourceVM**](DataSourceVM.md)>


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |


## dataSourcesUpdateConnectionString

> DataSourceVM dataSourcesUpdateConnectionString(id, updateDataSourceConnectionStringVM)

Update data source&#39;s connection string by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DataSourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DataSourcesApi apiInstance = new DataSourcesApi(defaultClient);
        String id = "id_example"; // String | data source id
        UpdateDataSourceConnectionStringVM updateDataSourceConnectionStringVM = new UpdateDataSourceConnectionStringVM(); // UpdateDataSourceConnectionStringVM | update viewmodel
        try {
            DataSourceVM result = apiInstance.dataSourcesUpdateConnectionString(id, updateDataSourceConnectionStringVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSourcesApi#dataSourcesUpdateConnectionString");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| data source id | |
| **updateDataSourceConnectionStringVM** | [**UpdateDataSourceConnectionStringVM**](UpdateDataSourceConnectionStringVM.md)| update viewmodel | [optional] |

### Return type

[**DataSourceVM**](DataSourceVM.md)


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |

## dataSourcesUpdateConnectionStringWithHttpInfo

> ApiResponse<DataSourceVM> dataSourcesUpdateConnectionString dataSourcesUpdateConnectionStringWithHttpInfo(id, updateDataSourceConnectionStringVM)

Update data source&#39;s connection string by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DataSourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DataSourcesApi apiInstance = new DataSourcesApi(defaultClient);
        String id = "id_example"; // String | data source id
        UpdateDataSourceConnectionStringVM updateDataSourceConnectionStringVM = new UpdateDataSourceConnectionStringVM(); // UpdateDataSourceConnectionStringVM | update viewmodel
        try {
            ApiResponse<DataSourceVM> response = apiInstance.dataSourcesUpdateConnectionStringWithHttpInfo(id, updateDataSourceConnectionStringVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSourcesApi#dataSourcesUpdateConnectionString");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| data source id | |
| **updateDataSourceConnectionStringVM** | [**UpdateDataSourceConnectionStringVM**](UpdateDataSourceConnectionStringVM.md)| update viewmodel | [optional] |

### Return type

ApiResponse<[**DataSourceVM**](DataSourceVM.md)>


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |


## dataSourcesUpdatePermissions

> void dataSourcesUpdatePermissions(id, updateDataSourcePermissionsVM)

Update permissions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DataSourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DataSourcesApi apiInstance = new DataSourcesApi(defaultClient);
        String id = "id_example"; // String | 
        UpdateDataSourcePermissionsVM updateDataSourcePermissionsVM = new UpdateDataSourcePermissionsVM(); // UpdateDataSourcePermissionsVM | 
        try {
            apiInstance.dataSourcesUpdatePermissions(id, updateDataSourcePermissionsVM);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSourcesApi#dataSourcesUpdatePermissions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **updateDataSourcePermissionsVM** | [**UpdateDataSourcePermissionsVM**](UpdateDataSourcePermissionsVM.md)|  | [optional] |

### Return type


null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |

## dataSourcesUpdatePermissionsWithHttpInfo

> ApiResponse<Void> dataSourcesUpdatePermissions dataSourcesUpdatePermissionsWithHttpInfo(id, updateDataSourcePermissionsVM)

Update permissions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DataSourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DataSourcesApi apiInstance = new DataSourcesApi(defaultClient);
        String id = "id_example"; // String | 
        UpdateDataSourcePermissionsVM updateDataSourcePermissionsVM = new UpdateDataSourcePermissionsVM(); // UpdateDataSourcePermissionsVM | 
        try {
            ApiResponse<Void> response = apiInstance.dataSourcesUpdatePermissionsWithHttpInfo(id, updateDataSourcePermissionsVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSourcesApi#dataSourcesUpdatePermissions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **updateDataSourcePermissionsVM** | [**UpdateDataSourcePermissionsVM**](UpdateDataSourcePermissionsVM.md)|  | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |


## dataSourcesUpdateSubscriptionDataSource

> void dataSourcesUpdateSubscriptionDataSource(id, updateDataSourceSubscriptionVM)

Update data source&#39;s subscription

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DataSourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DataSourcesApi apiInstance = new DataSourcesApi(defaultClient);
        String id = "id_example"; // String | data source id
        UpdateDataSourceSubscriptionVM updateDataSourceSubscriptionVM = new UpdateDataSourceSubscriptionVM(); // UpdateDataSourceSubscriptionVM | update subscription viewmodel
        try {
            apiInstance.dataSourcesUpdateSubscriptionDataSource(id, updateDataSourceSubscriptionVM);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSourcesApi#dataSourcesUpdateSubscriptionDataSource");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| data source id | |
| **updateDataSourceSubscriptionVM** | [**UpdateDataSourceSubscriptionVM**](UpdateDataSourceSubscriptionVM.md)| update subscription viewmodel | [optional] |

### Return type


null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |

## dataSourcesUpdateSubscriptionDataSourceWithHttpInfo

> ApiResponse<Void> dataSourcesUpdateSubscriptionDataSource dataSourcesUpdateSubscriptionDataSourceWithHttpInfo(id, updateDataSourceSubscriptionVM)

Update data source&#39;s subscription

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DataSourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DataSourcesApi apiInstance = new DataSourcesApi(defaultClient);
        String id = "id_example"; // String | data source id
        UpdateDataSourceSubscriptionVM updateDataSourceSubscriptionVM = new UpdateDataSourceSubscriptionVM(); // UpdateDataSourceSubscriptionVM | update subscription viewmodel
        try {
            ApiResponse<Void> response = apiInstance.dataSourcesUpdateSubscriptionDataSourceWithHttpInfo(id, updateDataSourceSubscriptionVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSourcesApi#dataSourcesUpdateSubscriptionDataSource");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| data source id | |
| **updateDataSourceSubscriptionVM** | [**UpdateDataSourceSubscriptionVM**](UpdateDataSourceSubscriptionVM.md)| update subscription viewmodel | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |

