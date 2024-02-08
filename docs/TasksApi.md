# TasksApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tasksCreateTask**](TasksApi.md#tasksCreateTask) | **POST** /api/tasks/v1/Tasks | Create a new task |
| [**tasksCreateTaskWithHttpInfo**](TasksApi.md#tasksCreateTaskWithHttpInfo) | **POST** /api/tasks/v1/Tasks | Create a new task |
| [**tasksDeleteTask**](TasksApi.md#tasksDeleteTask) | **DELETE** /api/tasks/v1/Tasks/{taskId} | Delete a task from a storage |
| [**tasksDeleteTaskWithHttpInfo**](TasksApi.md#tasksDeleteTaskWithHttpInfo) | **DELETE** /api/tasks/v1/Tasks/{taskId} | Delete a task from a storage |
| [**tasksGet**](TasksApi.md#tasksGet) | **GET** /api/tasks/v1/Tasks/{taskId} | Get a task by a specified id |
| [**tasksGetWithHttpInfo**](TasksApi.md#tasksGetWithHttpInfo) | **GET** /api/tasks/v1/Tasks/{taskId} | Get a task by a specified id |
| [**tasksGetList**](TasksApi.md#tasksGetList) | **GET** /api/tasks/v1/Tasks | Get tasks list |
| [**tasksGetListWithHttpInfo**](TasksApi.md#tasksGetListWithHttpInfo) | **GET** /api/tasks/v1/Tasks | Get tasks list |
| [**tasksGetPermissions**](TasksApi.md#tasksGetPermissions) | **GET** /api/tasks/v1/Tasks/{id}/permissions | Get all Task permissions |
| [**tasksGetPermissionsWithHttpInfo**](TasksApi.md#tasksGetPermissionsWithHttpInfo) | **GET** /api/tasks/v1/Tasks/{id}/permissions | Get all Task permissions |
| [**tasksRenameTask**](TasksApi.md#tasksRenameTask) | **PUT** /api/tasks/v1/Tasks/{taskId}/rename | Rename a task |
| [**tasksRenameTaskWithHttpInfo**](TasksApi.md#tasksRenameTaskWithHttpInfo) | **PUT** /api/tasks/v1/Tasks/{taskId}/rename | Rename a task |
| [**tasksRunTask**](TasksApi.md#tasksRunTask) | **POST** /api/tasks/v1/Tasks/run | Run a task from request body |
| [**tasksRunTaskWithHttpInfo**](TasksApi.md#tasksRunTaskWithHttpInfo) | **POST** /api/tasks/v1/Tasks/run | Run a task from request body |
| [**tasksRunTaskById**](TasksApi.md#tasksRunTaskById) | **POST** /api/tasks/v1/Tasks/{taskId}/run | Run a task by id |
| [**tasksRunTaskByIdWithHttpInfo**](TasksApi.md#tasksRunTaskByIdWithHttpInfo) | **POST** /api/tasks/v1/Tasks/{taskId}/run | Run a task by id |
| [**tasksUpdatePermissions**](TasksApi.md#tasksUpdatePermissions) | **POST** /api/tasks/v1/Tasks/{id}/permissions | Update permissions |
| [**tasksUpdatePermissionsWithHttpInfo**](TasksApi.md#tasksUpdatePermissionsWithHttpInfo) | **POST** /api/tasks/v1/Tasks/{id}/permissions | Update permissions |
| [**tasksUpdateTask**](TasksApi.md#tasksUpdateTask) | **PUT** /api/tasks/v1/Tasks/{taskId} | Update a task |
| [**tasksUpdateTaskWithHttpInfo**](TasksApi.md#tasksUpdateTaskWithHttpInfo) | **PUT** /api/tasks/v1/Tasks/{taskId} | Update a task |



## tasksCreateTask

> TaskBaseVM tasksCreateTask(createTaskBaseVM)

Create a new task

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TasksApi;

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

        TasksApi apiInstance = new TasksApi(defaultClient);
        CreateTaskBaseVM createTaskBaseVM = new CreateTaskBaseVM(); // CreateTaskBaseVM | task's view model. You have to specify task type (type: \"ExportTemplate\")
        try {
            TaskBaseVM result = apiInstance.tasksCreateTask(createTaskBaseVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#tasksCreateTask");
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
| **createTaskBaseVM** | [**CreateTaskBaseVM**](CreateTaskBaseVM.md)| task&#39;s view model. You have to specify task type (type: \&quot;ExportTemplate\&quot;) | [optional] |

### Return type

[**TaskBaseVM**](TaskBaseVM.md)


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
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

## tasksCreateTaskWithHttpInfo

> ApiResponse<TaskBaseVM> tasksCreateTask tasksCreateTaskWithHttpInfo(createTaskBaseVM)

Create a new task

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TasksApi;

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

        TasksApi apiInstance = new TasksApi(defaultClient);
        CreateTaskBaseVM createTaskBaseVM = new CreateTaskBaseVM(); // CreateTaskBaseVM | task's view model. You have to specify task type (type: \"ExportTemplate\")
        try {
            ApiResponse<TaskBaseVM> response = apiInstance.tasksCreateTaskWithHttpInfo(createTaskBaseVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#tasksCreateTask");
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
| **createTaskBaseVM** | [**CreateTaskBaseVM**](CreateTaskBaseVM.md)| task&#39;s view model. You have to specify task type (type: \&quot;ExportTemplate\&quot;) | [optional] |

### Return type

ApiResponse<[**TaskBaseVM**](TaskBaseVM.md)>


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
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


## tasksDeleteTask

> void tasksDeleteTask(taskId)

Delete a task from a storage

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TasksApi;

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

        TasksApi apiInstance = new TasksApi(defaultClient);
        String taskId = "taskId_example"; // String | deleting task id
        try {
            apiInstance.tasksDeleteTask(taskId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#tasksDeleteTask");
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
| **taskId** | **String**| deleting task id | |

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

## tasksDeleteTaskWithHttpInfo

> ApiResponse<Void> tasksDeleteTask tasksDeleteTaskWithHttpInfo(taskId)

Delete a task from a storage

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TasksApi;

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

        TasksApi apiInstance = new TasksApi(defaultClient);
        String taskId = "taskId_example"; // String | deleting task id
        try {
            ApiResponse<Void> response = apiInstance.tasksDeleteTaskWithHttpInfo(taskId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#tasksDeleteTask");
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
| **taskId** | **String**| deleting task id | |

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **402** | Client Error |  -  |
| **400** | Bad Request |  -  |
| **500** | Server Error |  -  |


## tasksGet

> TaskBaseVM tasksGet(taskId)

Get a task by a specified id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TasksApi;

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

        TasksApi apiInstance = new TasksApi(defaultClient);
        String taskId = "taskId_example"; // String | a task id
        try {
            TaskBaseVM result = apiInstance.tasksGet(taskId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#tasksGet");
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
| **taskId** | **String**| a task id | |

### Return type

[**TaskBaseVM**](TaskBaseVM.md)


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

## tasksGetWithHttpInfo

> ApiResponse<TaskBaseVM> tasksGet tasksGetWithHttpInfo(taskId)

Get a task by a specified id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TasksApi;

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

        TasksApi apiInstance = new TasksApi(defaultClient);
        String taskId = "taskId_example"; // String | a task id
        try {
            ApiResponse<TaskBaseVM> response = apiInstance.tasksGetWithHttpInfo(taskId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#tasksGet");
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
| **taskId** | **String**| a task id | |

### Return type

ApiResponse<[**TaskBaseVM**](TaskBaseVM.md)>


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


## tasksGetList

> TasksVM tasksGetList(skip, take, subscriptionId, searchPattern)

Get tasks list

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TasksApi;

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

        TasksApi apiInstance = new TasksApi(defaultClient);
        Integer skip = 0; // Integer | number of tasks, that have to be skipped
        Integer take = 10; // Integer | number of tasks, that have to be returned
        String subscriptionId = "subscriptionId_example"; // String | subscription id
        String searchPattern = ""; // String | 
        try {
            TasksVM result = apiInstance.tasksGetList(skip, take, subscriptionId, searchPattern);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#tasksGetList");
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
| **skip** | **Integer**| number of tasks, that have to be skipped | [optional] [default to 0] |
| **take** | **Integer**| number of tasks, that have to be returned | [optional] [default to 10] |
| **subscriptionId** | **String**| subscription id | [optional] |
| **searchPattern** | **String**|  | [optional] [default to ] |

### Return type

[**TasksVM**](TasksVM.md)


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

## tasksGetListWithHttpInfo

> ApiResponse<TasksVM> tasksGetList tasksGetListWithHttpInfo(skip, take, subscriptionId, searchPattern)

Get tasks list

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TasksApi;

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

        TasksApi apiInstance = new TasksApi(defaultClient);
        Integer skip = 0; // Integer | number of tasks, that have to be skipped
        Integer take = 10; // Integer | number of tasks, that have to be returned
        String subscriptionId = "subscriptionId_example"; // String | subscription id
        String searchPattern = ""; // String | 
        try {
            ApiResponse<TasksVM> response = apiInstance.tasksGetListWithHttpInfo(skip, take, subscriptionId, searchPattern);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#tasksGetList");
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
| **skip** | **Integer**| number of tasks, that have to be skipped | [optional] [default to 0] |
| **take** | **Integer**| number of tasks, that have to be returned | [optional] [default to 10] |
| **subscriptionId** | **String**| subscription id | [optional] |
| **searchPattern** | **String**|  | [optional] [default to ] |

### Return type

ApiResponse<[**TasksVM**](TasksVM.md)>


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


## tasksGetPermissions

> TaskPermissionsVM tasksGetPermissions(id)

Get all Task permissions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TasksApi;

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

        TasksApi apiInstance = new TasksApi(defaultClient);
        String id = "id_example"; // String | task id
        try {
            TaskPermissionsVM result = apiInstance.tasksGetPermissions(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#tasksGetPermissions");
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
| **id** | **String**| task id | |

### Return type

[**TaskPermissionsVM**](TaskPermissionsVM.md)


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

## tasksGetPermissionsWithHttpInfo

> ApiResponse<TaskPermissionsVM> tasksGetPermissions tasksGetPermissionsWithHttpInfo(id)

Get all Task permissions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TasksApi;

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

        TasksApi apiInstance = new TasksApi(defaultClient);
        String id = "id_example"; // String | task id
        try {
            ApiResponse<TaskPermissionsVM> response = apiInstance.tasksGetPermissionsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#tasksGetPermissions");
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
| **id** | **String**| task id | |

### Return type

ApiResponse<[**TaskPermissionsVM**](TaskPermissionsVM.md)>


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


## tasksRenameTask

> TaskBaseVM tasksRenameTask(taskId, newName)

Rename a task

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TasksApi;

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

        TasksApi apiInstance = new TasksApi(defaultClient);
        String taskId = "taskId_example"; // String | renaming task id
        String newName = "newName_example"; // String | task's new Name
        try {
            TaskBaseVM result = apiInstance.tasksRenameTask(taskId, newName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#tasksRenameTask");
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
| **taskId** | **String**| renaming task id | |
| **newName** | **String**| task&#39;s new Name | [optional] |

### Return type

[**TaskBaseVM**](TaskBaseVM.md)


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

## tasksRenameTaskWithHttpInfo

> ApiResponse<TaskBaseVM> tasksRenameTask tasksRenameTaskWithHttpInfo(taskId, newName)

Rename a task

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TasksApi;

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

        TasksApi apiInstance = new TasksApi(defaultClient);
        String taskId = "taskId_example"; // String | renaming task id
        String newName = "newName_example"; // String | task's new Name
        try {
            ApiResponse<TaskBaseVM> response = apiInstance.tasksRenameTaskWithHttpInfo(taskId, newName);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#tasksRenameTask");
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
| **taskId** | **String**| renaming task id | |
| **newName** | **String**| task&#39;s new Name | [optional] |

### Return type

ApiResponse<[**TaskBaseVM**](TaskBaseVM.md)>


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


## tasksRunTask

> void tasksRunTask(runTaskBaseVM)

Run a task from request body

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TasksApi;

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

        TasksApi apiInstance = new TasksApi(defaultClient);
        RunTaskBaseVM runTaskBaseVM = new RunTaskBaseVM(); // RunTaskBaseVM | task's view model
        try {
            apiInstance.tasksRunTask(runTaskBaseVM);
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#tasksRunTask");
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
| **runTaskBaseVM** | [**RunTaskBaseVM**](RunTaskBaseVM.md)| task&#39;s view model | [optional] |

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **402** | Client Error |  -  |
| **400** | Bad Request |  -  |
| **500** | Server Error |  -  |

## tasksRunTaskWithHttpInfo

> ApiResponse<Void> tasksRunTask tasksRunTaskWithHttpInfo(runTaskBaseVM)

Run a task from request body

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TasksApi;

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

        TasksApi apiInstance = new TasksApi(defaultClient);
        RunTaskBaseVM runTaskBaseVM = new RunTaskBaseVM(); // RunTaskBaseVM | task's view model
        try {
            ApiResponse<Void> response = apiInstance.tasksRunTaskWithHttpInfo(runTaskBaseVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#tasksRunTask");
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
| **runTaskBaseVM** | [**RunTaskBaseVM**](RunTaskBaseVM.md)| task&#39;s view model | [optional] |

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **402** | Client Error |  -  |
| **400** | Bad Request |  -  |
| **500** | Server Error |  -  |


## tasksRunTaskById

> void tasksRunTaskById(taskId)

Run a task by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TasksApi;

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

        TasksApi apiInstance = new TasksApi(defaultClient);
        String taskId = "taskId_example"; // String | task id
        try {
            apiInstance.tasksRunTaskById(taskId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#tasksRunTaskById");
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
| **taskId** | **String**| task id | |

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **402** | Client Error |  -  |
| **400** | Bad Request |  -  |
| **500** | Server Error |  -  |

## tasksRunTaskByIdWithHttpInfo

> ApiResponse<Void> tasksRunTaskById tasksRunTaskByIdWithHttpInfo(taskId)

Run a task by id

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TasksApi;

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

        TasksApi apiInstance = new TasksApi(defaultClient);
        String taskId = "taskId_example"; // String | task id
        try {
            ApiResponse<Void> response = apiInstance.tasksRunTaskByIdWithHttpInfo(taskId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#tasksRunTaskById");
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
| **taskId** | **String**| task id | |

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
| **200** | Success |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **402** | Client Error |  -  |
| **400** | Bad Request |  -  |
| **500** | Server Error |  -  |


## tasksUpdatePermissions

> void tasksUpdatePermissions(id, updateTaskPermissionsVM)

Update permissions

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TasksApi;

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

        TasksApi apiInstance = new TasksApi(defaultClient);
        String id = "id_example"; // String | task id
        UpdateTaskPermissionsVM updateTaskPermissionsVM = new UpdateTaskPermissionsVM(); // UpdateTaskPermissionsVM | new permissions
        try {
            apiInstance.tasksUpdatePermissions(id, updateTaskPermissionsVM);
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#tasksUpdatePermissions");
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
| **id** | **String**| task id | |
| **updateTaskPermissionsVM** | [**UpdateTaskPermissionsVM**](UpdateTaskPermissionsVM.md)| new permissions | [optional] |

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

## tasksUpdatePermissionsWithHttpInfo

> ApiResponse<Void> tasksUpdatePermissions tasksUpdatePermissionsWithHttpInfo(id, updateTaskPermissionsVM)

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
import cloud.fastreport.client.TasksApi;

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

        TasksApi apiInstance = new TasksApi(defaultClient);
        String id = "id_example"; // String | task id
        UpdateTaskPermissionsVM updateTaskPermissionsVM = new UpdateTaskPermissionsVM(); // UpdateTaskPermissionsVM | new permissions
        try {
            ApiResponse<Void> response = apiInstance.tasksUpdatePermissionsWithHttpInfo(id, updateTaskPermissionsVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#tasksUpdatePermissions");
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
| **id** | **String**| task id | |
| **updateTaskPermissionsVM** | [**UpdateTaskPermissionsVM**](UpdateTaskPermissionsVM.md)| new permissions | [optional] |

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


## tasksUpdateTask

> TaskBaseVM tasksUpdateTask(taskId, updateTaskBaseVM)

Update a task

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TasksApi;

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

        TasksApi apiInstance = new TasksApi(defaultClient);
        String taskId = "taskId_example"; // String | updating task id
        UpdateTaskBaseVM updateTaskBaseVM = new UpdateTaskBaseVM(); // UpdateTaskBaseVM | task's view model. You have to specify task type (type: \"ExportTemplate\")
        try {
            TaskBaseVM result = apiInstance.tasksUpdateTask(taskId, updateTaskBaseVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#tasksUpdateTask");
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
| **taskId** | **String**| updating task id | |
| **updateTaskBaseVM** | [**UpdateTaskBaseVM**](UpdateTaskBaseVM.md)| task&#39;s view model. You have to specify task type (type: \&quot;ExportTemplate\&quot;) | [optional] |

### Return type

[**TaskBaseVM**](TaskBaseVM.md)


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
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

## tasksUpdateTaskWithHttpInfo

> ApiResponse<TaskBaseVM> tasksUpdateTask tasksUpdateTaskWithHttpInfo(taskId, updateTaskBaseVM)

Update a task

### Example

```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.TasksApi;

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

        TasksApi apiInstance = new TasksApi(defaultClient);
        String taskId = "taskId_example"; // String | updating task id
        UpdateTaskBaseVM updateTaskBaseVM = new UpdateTaskBaseVM(); // UpdateTaskBaseVM | task's view model. You have to specify task type (type: \"ExportTemplate\")
        try {
            ApiResponse<TaskBaseVM> response = apiInstance.tasksUpdateTaskWithHttpInfo(taskId, updateTaskBaseVM);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#tasksUpdateTask");
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
| **taskId** | **String**| updating task id | |
| **updateTaskBaseVM** | [**UpdateTaskBaseVM**](UpdateTaskBaseVM.md)| task&#39;s view model. You have to specify task type (type: \&quot;ExportTemplate\&quot;) | [optional] |

### Return type

ApiResponse<[**TaskBaseVM**](TaskBaseVM.md)>


### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
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

