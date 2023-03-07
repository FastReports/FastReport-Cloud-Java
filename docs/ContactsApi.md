# ContactsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contactsCreate**](ContactsApi.md#contactsCreate) | **POST** /api/v1/Contacts/contact | Creates new contact
[**contactsDelete**](ContactsApi.md#contactsDelete) | **DELETE** /api/v1/Contacts/{id} | Removes contact by id
[**contactsGet**](ContactsApi.md#contactsGet) | **GET** /api/v1/Contacts/{id} | Returns contact group by id
[**contactsGetByGroup**](ContactsApi.md#contactsGetByGroup) | **GET** /api/v1/Contacts/group/{groupId}/contacts | Returns contacts by group id
[**contactsGetList**](ContactsApi.md#contactsGetList) | **GET** /api/v1/Contacts/subscription/{subscriptionId}/contacts | Allows to search for contacts
[**contactsUpdate**](ContactsApi.md#contactsUpdate) | **PUT** /api/v1/Contacts/{id} | Updates contact by id



## contactsCreate

> ContactVM contactsCreate(createContactVM)

Creates new contact

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ContactsApi;

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

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        CreateContactVM createContactVM = new CreateContactVM(); // CreateContactVM | 
        try {
            ContactVM result = apiInstance.contactsCreate(createContactVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#contactsCreate");
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
 **createContactVM** | [**CreateContactVM**](CreateContactVM.md)|  | [optional]

### Return type

[**ContactVM**](ContactVM.md)

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


## contactsDelete

> contactsDelete(id)

Removes contact by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ContactsApi;

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

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            apiInstance.contactsDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#contactsDelete");
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


## contactsGet

> ContactVM contactsGet(id)

Returns contact group by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ContactsApi;

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

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            ContactVM result = apiInstance.contactsGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#contactsGet");
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

[**ContactVM**](ContactVM.md)

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


## contactsGetByGroup

> ContactsVM contactsGetByGroup(groupId, skip, take)

Returns contacts by group id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ContactsApi;

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

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        String groupId = "groupId_example"; // String | 
        Integer skip = 0; // Integer | 
        Integer take = 10; // Integer | 
        try {
            ContactsVM result = apiInstance.contactsGetByGroup(groupId, skip, take);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#contactsGetByGroup");
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
 **groupId** | **String**|  |
 **skip** | **Integer**|  | [optional] [default to 0]
 **take** | **Integer**|  | [optional] [default to 10]

### Return type

[**ContactsVM**](ContactsVM.md)

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


## contactsGetList

> ContactsVM contactsGetList(subscriptionId, skip, take, searchPattern)

Allows to search for contacts

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ContactsApi;

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

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | 
        Integer skip = 0; // Integer | 
        Integer take = 10; // Integer | 
        String searchPattern = "searchPattern_example"; // String | 
        try {
            ContactsVM result = apiInstance.contactsGetList(subscriptionId, skip, take, searchPattern);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#contactsGetList");
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
 **searchPattern** | **String**|  | [optional]

### Return type

[**ContactsVM**](ContactsVM.md)

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


## contactsUpdate

> ContactVM contactsUpdate(id, updateContactVM)

Updates contact by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.ContactsApi;

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

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        String id = "id_example"; // String | 
        UpdateContactVM updateContactVM = new UpdateContactVM(); // UpdateContactVM | 
        try {
            ContactVM result = apiInstance.contactsUpdate(id, updateContactVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#contactsUpdate");
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
 **updateContactVM** | [**UpdateContactVM**](UpdateContactVM.md)|  | [optional]

### Return type

[**ContactVM**](ContactVM.md)

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

