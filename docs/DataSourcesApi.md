# DataSourcesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dataSourcesCreateDataSource**](DataSourcesApi.md#dataSourcesCreateDataSource) | **POST** /api/data/v1/DataSources | Create new data source
[**dataSourcesDeleteDataSource**](DataSourcesApi.md#dataSourcesDeleteDataSource) | **DELETE** /api/data/v1/DataSources/{id} | Delete data source by id
[**dataSourcesFetchData**](DataSourcesApi.md#dataSourcesFetchData) | **GET** /api/data/v1/DataSources/{id}/fetch | This should connect to a database and set data structure
[**dataSourcesGetAvailableDataSources**](DataSourcesApi.md#dataSourcesGetAvailableDataSources) | **GET** /api/data/v1/DataSources | Returns all of the data sources, that current user have permission for in a subscription &lt;br /&gt;  The method will return minimal infomration about the datasources: &lt;br /&gt;  id, name, editedTime, status.
[**dataSourcesGetDataSource**](DataSourcesApi.md#dataSourcesGetDataSource) | **GET** /api/data/v1/DataSources/{id} | Get data source by id
[**dataSourcesGetPermissions**](DataSourcesApi.md#dataSourcesGetPermissions) | **GET** /api/data/v1/DataSources/{id}/permissions | Get all Data source permissions
[**dataSourcesRenameDataSource**](DataSourcesApi.md#dataSourcesRenameDataSource) | **PUT** /api/data/v1/DataSources/{id}/rename | Rename data source by id
[**dataSourcesUpdateConnectionString**](DataSourcesApi.md#dataSourcesUpdateConnectionString) | **PUT** /api/data/v1/DataSources/{id}/ConnectionString | Update data source&#39;s connection string by id
[**dataSourcesUpdatePermissions**](DataSourcesApi.md#dataSourcesUpdatePermissions) | **POST** /api/data/v1/DataSources/{id}/permissions | Update permissions
[**dataSourcesUpdateSubscriptionDataSource**](DataSourcesApi.md#dataSourcesUpdateSubscriptionDataSource) | **PUT** /api/data/v1/DataSources/{id}/updateSubscription | Update data source&#39;s subscription



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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createDataSourceVM** | [**CreateDataSourceVM**](CreateDataSourceVM.md)| create viewmodel | [optional]

### Return type

[**DataSourceVM**](DataSourceVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/_*+json
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

> dataSourcesDeleteDataSource(id)

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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| data source id |

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
| **204** | Success |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |


## dataSourcesFetchData

> dataSourcesFetchData(id)

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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| datasource&#39;s id |

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
| **200** | Success |  -  |
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
        String subscriptionId = "subscriptionId_example"; // String | subscription id
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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **String**| subscription id | [optional]
 **skip** | **Integer**| how many data sources will be skipped | [optional] [default to 0]
 **take** | **Integer**| how many data sources will be taken | [optional] [default to 10]
 **orderBy** | [**DataSourceSorting**](.md)| field to order by | [optional] [enum: None, CreatedTime, EditedTime, Name]
 **desc** | **Boolean**| descending sort | [optional] [default to false]

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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| data source id |

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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| data source id |

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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| data source id |
 **renameDataSourceVM** | [**RenameDataSourceVM**](RenameDataSourceVM.md)| rename viewmodel | [optional]

### Return type

[**DataSourceVM**](DataSourceVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/_*+json
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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| data source id |
 **updateDataSourceConnectionStringVM** | [**UpdateDataSourceConnectionStringVM**](UpdateDataSourceConnectionStringVM.md)| update viewmodel | [optional]

### Return type

[**DataSourceVM**](DataSourceVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/_*+json
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

> dataSourcesUpdatePermissions(id, updateDataSourcePermissionsVM)

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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **updateDataSourcePermissionsVM** | [**UpdateDataSourcePermissionsVM**](UpdateDataSourcePermissionsVM.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/_*+json
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


## dataSourcesUpdateSubscriptionDataSource

> dataSourcesUpdateSubscriptionDataSource(id, updateDataSourceSubscriptionVM)

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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| data source id |
 **updateDataSourceSubscriptionVM** | [**UpdateDataSourceSubscriptionVM**](UpdateDataSourceSubscriptionVM.md)| update subscription viewmodel | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/_*+json
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

