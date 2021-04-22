# AdminDataSourceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminDataSourceAddPermission**](AdminDataSourceApi.md#adminDataSourceAddPermission) | **PUT** /api/admin/v1/DataSource/{id}/permissions | Add Permission to datasource
[**adminDataSourceCreateDataSource**](AdminDataSourceApi.md#adminDataSourceCreateDataSource) | **POST** /api/admin/v1/DataSource | Create new data source
[**adminDataSourceDeleteDataSource**](AdminDataSourceApi.md#adminDataSourceDeleteDataSource) | **DELETE** /api/admin/v1/DataSource/{id} | Delete datasource by id
[**adminDataSourceFetchData**](AdminDataSourceApi.md#adminDataSourceFetchData) | **GET** /api/admin/v1/DataSource/{id}/fetch | This should connect to a database and set data structure
[**adminDataSourceGetDataSource**](AdminDataSourceApi.md#adminDataSourceGetDataSource) | **GET** /api/admin/v1/DataSource/{id} | Get datasource by id
[**adminDataSourceGetDataSources**](AdminDataSourceApi.md#adminDataSourceGetDataSources) | **GET** /api/admin/v1/DataSource | Get list of datasources from database
[**adminDataSourceGetPermissions**](AdminDataSourceApi.md#adminDataSourceGetPermissions) | **GET** /api/admin/v1/DataSource/{id}/permissions | Get all Data source permissions
[**adminDataSourceRevokePermission**](AdminDataSourceApi.md#adminDataSourceRevokePermission) | **DELETE** /api/admin/v1/DataSource/{id}/permissions | Revoke permissions to datasource
[**adminDataSourceUpdateDataSource**](AdminDataSourceApi.md#adminDataSourceUpdateDataSource) | **PUT** /api/admin/v1/DataSource/{id} | Update datasource with update VM
[**adminDataSourceUpdatePermissions**](AdminDataSourceApi.md#adminDataSourceUpdatePermissions) | **POST** /api/admin/v1/DataSource/{dataSourceId}/permissions | Update permissions to datasource



## adminDataSourceAddPermission

> DataSourcePermissions adminDataSourceAddPermission(id, permissionsVM)

Add Permission to datasource

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminDataSourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure API key authorization: JWT
        ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
        JWT.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //JWT.setApiKeyPrefix("Token");

        AdminDataSourceApi apiInstance = new AdminDataSourceApi(defaultClient);
        String id = "id_example"; // String | data source id
        DataSourcePermissionsVM permissionsVM = new DataSourcePermissionsVM(); // DataSourcePermissionsVM | 
        try {
            DataSourcePermissions result = apiInstance.adminDataSourceAddPermission(id, permissionsVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminDataSourceApi#adminDataSourceAddPermission");
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
 **permissionsVM** | [**DataSourcePermissionsVM**](DataSourcePermissionsVM.md)|  | [optional]

### Return type

[**DataSourcePermissions**](DataSourcePermissions.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully added |  -  |
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Datasource is not found |  -  |


## adminDataSourceCreateDataSource

> DataSourceVM adminDataSourceCreateDataSource(createVM)

Create new data source

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminDataSourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure API key authorization: JWT
        ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
        JWT.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //JWT.setApiKeyPrefix("Token");

        AdminDataSourceApi apiInstance = new AdminDataSourceApi(defaultClient);
        CreateDataSourceAdminVM createVM = new CreateDataSourceAdminVM(); // CreateDataSourceAdminVM | create VM
        try {
            DataSourceVM result = apiInstance.adminDataSourceCreateDataSource(createVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminDataSourceApi#adminDataSourceCreateDataSource");
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
 **createVM** | [**CreateDataSourceAdminVM**](CreateDataSourceAdminVM.md)| create VM | [optional]

### Return type

[**DataSourceVM**](DataSourceVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully created |  -  |
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Datasource is not found |  -  |


## adminDataSourceDeleteDataSource

> adminDataSourceDeleteDataSource(id)

Delete datasource by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminDataSourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure API key authorization: JWT
        ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
        JWT.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //JWT.setApiKeyPrefix("Token");

        AdminDataSourceApi apiInstance = new AdminDataSourceApi(defaultClient);
        String id = "id_example"; // String | datasource's id
        try {
            apiInstance.adminDataSourceDeleteDataSource(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminDataSourceApi#adminDataSourceDeleteDataSource");
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
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Succesfully deleted |  -  |
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Datasource is not found |  -  |


## adminDataSourceFetchData

> adminDataSourceFetchData(id)

This should connect to a database and set data structure

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminDataSourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure API key authorization: JWT
        ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
        JWT.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //JWT.setApiKeyPrefix("Token");

        AdminDataSourceApi apiInstance = new AdminDataSourceApi(defaultClient);
        String id = "id_example"; // String | datasource's id
        try {
            apiInstance.adminDataSourceFetchData(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminDataSourceApi#adminDataSourceFetchData");
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
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **402** | Client Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |


## adminDataSourceGetDataSource

> DataSourceVM adminDataSourceGetDataSource(id)

Get datasource by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminDataSourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure API key authorization: JWT
        ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
        JWT.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //JWT.setApiKeyPrefix("Token");

        AdminDataSourceApi apiInstance = new AdminDataSourceApi(defaultClient);
        String id = "id_example"; // String | datasource's id
        try {
            DataSourceVM result = apiInstance.adminDataSourceGetDataSource(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminDataSourceApi#adminDataSourceGetDataSource");
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

[**DataSourceVM**](DataSourceVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully retured |  -  |
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Datasource is not found |  -  |


## adminDataSourceGetDataSources

> DataSourcesVM adminDataSourceGetDataSources(skip, take, subscriptionId)

Get list of datasources from database

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminDataSourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure API key authorization: JWT
        ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
        JWT.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //JWT.setApiKeyPrefix("Token");

        AdminDataSourceApi apiInstance = new AdminDataSourceApi(defaultClient);
        Integer skip = 56; // Integer | how many datasources will be skiped
        Integer take = 56; // Integer | how many datasources will be taken
        String subscriptionId = "subscriptionId_example"; // String | Subscription Id
        try {
            DataSourcesVM result = apiInstance.adminDataSourceGetDataSources(skip, take, subscriptionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminDataSourceApi#adminDataSourceGetDataSources");
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
 **skip** | **Integer**| how many datasources will be skiped | [optional]
 **take** | **Integer**| how many datasources will be taken | [optional]
 **subscriptionId** | **String**| Subscription Id | [optional]

### Return type

[**DataSourcesVM**](DataSourcesVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully retured |  -  |
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |


## adminDataSourceGetPermissions

> DataSourcePermissions adminDataSourceGetPermissions(id)

Get all Data source permissions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminDataSourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure API key authorization: JWT
        ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
        JWT.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //JWT.setApiKeyPrefix("Token");

        AdminDataSourceApi apiInstance = new AdminDataSourceApi(defaultClient);
        String id = "id_example"; // String | data source id
        try {
            DataSourcePermissions result = apiInstance.adminDataSourceGetPermissions(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminDataSourceApi#adminDataSourceGetPermissions");
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

[**DataSourcePermissions**](DataSourcePermissions.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully retured |  -  |
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Datasource is not found |  -  |


## adminDataSourceRevokePermission

> DataSourcePermissions adminDataSourceRevokePermission(id, permissionsVM)

Revoke permissions to datasource

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminDataSourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure API key authorization: JWT
        ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
        JWT.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //JWT.setApiKeyPrefix("Token");

        AdminDataSourceApi apiInstance = new AdminDataSourceApi(defaultClient);
        String id = "id_example"; // String | 
        DataSourcePermissionsVM permissionsVM = new DataSourcePermissionsVM(); // DataSourcePermissionsVM | 
        try {
            DataSourcePermissions result = apiInstance.adminDataSourceRevokePermission(id, permissionsVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminDataSourceApi#adminDataSourceRevokePermission");
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
 **permissionsVM** | [**DataSourcePermissionsVM**](DataSourcePermissionsVM.md)|  | [optional]

### Return type

[**DataSourcePermissions**](DataSourcePermissions.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully revoked |  -  |
| **204** | happens sometimes |  -  |
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Datasource is not found |  -  |


## adminDataSourceUpdateDataSource

> DataSourceVM adminDataSourceUpdateDataSource(id, updateVM)

Update datasource with update VM

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminDataSourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure API key authorization: JWT
        ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
        JWT.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //JWT.setApiKeyPrefix("Token");

        AdminDataSourceApi apiInstance = new AdminDataSourceApi(defaultClient);
        String id = "id_example"; // String | datasource's id
        UpdateDataSourceVM updateVM = new UpdateDataSourceVM(); // UpdateDataSourceVM | update VM
        try {
            DataSourceVM result = apiInstance.adminDataSourceUpdateDataSource(id, updateVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminDataSourceApi#adminDataSourceUpdateDataSource");
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
 **updateVM** | [**UpdateDataSourceVM**](UpdateDataSourceVM.md)| update VM | [optional]

### Return type

[**DataSourceVM**](DataSourceVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully updated |  -  |
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Datasource is not found |  -  |


## adminDataSourceUpdatePermissions

> DataSourcePermissions adminDataSourceUpdatePermissions(dataSourceId, newPermissions)

Update permissions to datasource

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.AdminDataSourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        // Configure API key authorization: JWT
        ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
        JWT.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //JWT.setApiKeyPrefix("Token");

        AdminDataSourceApi apiInstance = new AdminDataSourceApi(defaultClient);
        String dataSourceId = "dataSourceId_example"; // String | 
        DataSourcePermissions newPermissions = new DataSourcePermissions(); // DataSourcePermissions | 
        try {
            DataSourcePermissions result = apiInstance.adminDataSourceUpdatePermissions(dataSourceId, newPermissions);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminDataSourceApi#adminDataSourceUpdatePermissions");
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
 **dataSourceId** | **String**|  |
 **newPermissions** | [**DataSourcePermissions**](DataSourcePermissions.md)|  | [optional]

### Return type

[**DataSourcePermissions**](DataSourcePermissions.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully updated |  -  |
| **400** | The reqeust is wrong |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Datasource is not found |  -  |

