# GroupUsersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**groupUsersAddUserToGroup**](GroupUsersApi.md#groupUsersAddUserToGroup) | **PUT** /api/manage/v1/Groups/{id}/Users/{userId} | Add user to the group by identifier
[**groupUsersGetUsersInGroup**](GroupUsersApi.md#groupUsersGetUsersInGroup) | **GET** /api/manage/v1/Groups/{id}/Users | Returns users in the group by identifier
[**groupUsersLeaveFromGroup**](GroupUsersApi.md#groupUsersLeaveFromGroup) | **DELETE** /api/manage/v1/Groups/{id}/leave | Leave from the group
[**groupUsersRemoveFromGroup**](GroupUsersApi.md#groupUsersRemoveFromGroup) | **DELETE** /api/manage/v1/Groups/{id}/Users/{userId} | Remove user from the group by identifier



## groupUsersAddUserToGroup

> groupUsersAddUserToGroup(id, userId)

Add user to the group by identifier

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.GroupUsersApi;

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

        GroupUsersApi apiInstance = new GroupUsersApi(defaultClient);
        String id = "id_example"; // String | Identifier of group
        String userId = "userId_example"; // String | Identifier of user
        try {
            apiInstance.groupUsersAddUserToGroup(id, userId);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupUsersApi#groupUsersAddUserToGroup");
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
 **id** | **String**| Identifier of group |
 **userId** | **String**| Identifier of user |

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
| **200** | Succesfully retured |  -  |
| **400** | The reqeust is wrong |  -  |
| **402** | subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Group with this identifier is not found |  -  |
| **500** | Exception thrown |  -  |


## groupUsersGetUsersInGroup

> GroupUsersVM groupUsersGetUsersInGroup(id, skip, take)

Returns users in the group by identifier

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.GroupUsersApi;

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

        GroupUsersApi apiInstance = new GroupUsersApi(defaultClient);
        String id = "id_example"; // String | Identifier of group
        Integer skip = 0; // Integer | how many to skip
        Integer take = 10; // Integer | how many to take
        try {
            GroupUsersVM result = apiInstance.groupUsersGetUsersInGroup(id, skip, take);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupUsersApi#groupUsersGetUsersInGroup");
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
 **id** | **String**| Identifier of group |
 **skip** | **Integer**| how many to skip | [optional] [default to 0]
 **take** | **Integer**| how many to take | [optional] [default to 10]

### Return type

[**GroupUsersVM**](GroupUsersVM.md)

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
| **404** | Group with this identifier is not found |  -  |
| **500** | Exception thrown |  -  |


## groupUsersLeaveFromGroup

> groupUsersLeaveFromGroup(id)

Leave from the group

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.GroupUsersApi;

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

        GroupUsersApi apiInstance = new GroupUsersApi(defaultClient);
        String id = "id_example"; // String | Identifier of group
        try {
            apiInstance.groupUsersLeaveFromGroup(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupUsersApi#groupUsersLeaveFromGroup");
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
 **id** | **String**| Identifier of group |

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
| **204** | Succesfully removed |  -  |
| **400** | The reqeust is wrong |  -  |
| **402** | subscription is outdated |  -  |
| **404** | Group with this identifier is not found |  -  |
| **500** | Exception thrown |  -  |


## groupUsersRemoveFromGroup

> groupUsersRemoveFromGroup(id, userId)

Remove user from the group by identifier

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.GroupUsersApi;

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

        GroupUsersApi apiInstance = new GroupUsersApi(defaultClient);
        String id = "id_example"; // String | Identifier of group
        String userId = "userId_example"; // String | Identifier of user
        try {
            apiInstance.groupUsersRemoveFromGroup(id, userId);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupUsersApi#groupUsersRemoveFromGroup");
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
 **id** | **String**| Identifier of group |
 **userId** | **String**| Identifier of user |

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
| **204** | Succesfully removed |  -  |
| **400** | The reqeust is wrong |  -  |
| **402** | subscription is outdated |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Group with this identifier is not found |  -  |
| **500** | Exception thrown |  -  |

