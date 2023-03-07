# ContactGroupsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contactGroupsCreate**](ContactGroupsApi.md#contactGroupsCreate) | **POST** /api/v1/ContactGroups/group | Creates contact group
[**contactGroupsDelete**](ContactGroupsApi.md#contactGroupsDelete) | **DELETE** /api/v1/ContactGroups/{id} | Removes contact by id
[**contactGroupsGet**](ContactGroupsApi.md#contactGroupsGet) | **GET** /api/v1/ContactGroups/{id} | Returns contact group by id
[**contactGroupsGetList**](ContactGroupsApi.md#contactGroupsGetList) | **GET** /api/v1/ContactGroups/subscription/{subscriptionId}/groups | Returns contact groups by subscriptionId
[**contactGroupsUpdate**](ContactGroupsApi.md#contactGroupsUpdate) | **PUT** /api/v1/ContactGroups/{id} | Updates contact group by id



## contactGroupsCreate

> ContactGroupVM contactGroupsCreate(createContactGroupVM)

Creates contact group

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ContactGroupsApi;

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

        ContactGroupsApi apiInstance = new ContactGroupsApi(defaultClient);
        CreateContactGroupVM createContactGroupVM = new CreateContactGroupVM(); // CreateContactGroupVM | 
        try {
            ContactGroupVM result = apiInstance.contactGroupsCreate(createContactGroupVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactGroupsApi#contactGroupsCreate");
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
 **createContactGroupVM** | [**CreateContactGroupVM**](CreateContactGroupVM.md)|  | [optional]

### Return type

[**ContactGroupVM**](ContactGroupVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/_*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **402** | Client Error |  -  |
| **400** | Bad Request |  -  |
| **500** | Server Error |  -  |


## contactGroupsDelete

> contactGroupsDelete(id)

Removes contact by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ContactGroupsApi;

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

        ContactGroupsApi apiInstance = new ContactGroupsApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            apiInstance.contactGroupsDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactGroupsApi#contactGroupsDelete");
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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **402** | Client Error |  -  |
| **400** | Bad Request |  -  |
| **500** | Server Error |  -  |


## contactGroupsGet

> ContactGroupVM contactGroupsGet(id)

Returns contact group by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ContactGroupsApi;

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

        ContactGroupsApi apiInstance = new ContactGroupsApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            ContactGroupVM result = apiInstance.contactGroupsGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactGroupsApi#contactGroupsGet");
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

### Return type

[**ContactGroupVM**](ContactGroupVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **402** | Client Error |  -  |
| **400** | Bad Request |  -  |
| **500** | Server Error |  -  |


## contactGroupsGetList

> ContactGroupsVM contactGroupsGetList(subscriptionId, skip, take)

Returns contact groups by subscriptionId

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ContactGroupsApi;

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

        ContactGroupsApi apiInstance = new ContactGroupsApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | 
        Integer skip = 0; // Integer | 
        Integer take = 10; // Integer | 
        try {
            ContactGroupsVM result = apiInstance.contactGroupsGetList(subscriptionId, skip, take);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactGroupsApi#contactGroupsGetList");
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
 **subscriptionId** | **String**|  |
 **skip** | **Integer**|  | [optional] [default to 0]
 **take** | **Integer**|  | [optional] [default to 10]

### Return type

[**ContactGroupsVM**](ContactGroupsVM.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **402** | Client Error |  -  |
| **400** | Bad Request |  -  |
| **500** | Server Error |  -  |


## contactGroupsUpdate

> ContactGroupVM contactGroupsUpdate(id, updateContactGroupVM)

Updates contact group by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ContactGroupsApi;

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

        ContactGroupsApi apiInstance = new ContactGroupsApi(defaultClient);
        String id = "id_example"; // String | 
        UpdateContactGroupVM updateContactGroupVM = new UpdateContactGroupVM(); // UpdateContactGroupVM | 
        try {
            ContactGroupVM result = apiInstance.contactGroupsUpdate(id, updateContactGroupVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactGroupsApi#contactGroupsUpdate");
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
 **updateContactGroupVM** | [**UpdateContactGroupVM**](UpdateContactGroupVM.md)|  | [optional]

### Return type

[**ContactGroupVM**](ContactGroupVM.md)

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
