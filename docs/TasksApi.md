# TasksApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tasksCreateTask**](TasksApi.md#tasksCreateTask) | **POST** /api/tasks/v1/Tasks | Create a new task |
| [**tasksDeleteTask**](TasksApi.md#tasksDeleteTask) | **DELETE** /api/tasks/v1/Tasks/{taskId} | Delete a task from a storage |
| [**tasksGet**](TasksApi.md#tasksGet) | **GET** /api/tasks/v1/Tasks/{taskId} | Get a task by a specified id |
| [**tasksGetList**](TasksApi.md#tasksGetList) | **GET** /api/tasks/v1/Tasks | Get tasks list |
| [**tasksGetPermissions**](TasksApi.md#tasksGetPermissions) | **GET** /api/tasks/v1/Tasks/{id}/permissions | Get all Task permissions |
| [**tasksRenameTask**](TasksApi.md#tasksRenameTask) | **PUT** /api/tasks/v1/Tasks/{taskId}/rename | Rename a task |
| [**tasksRunTask**](TasksApi.md#tasksRunTask) | **POST** /api/tasks/v1/Tasks/run | Run a task from request body |
| [**tasksRunTaskById**](TasksApi.md#tasksRunTaskById) | **POST** /api/tasks/v1/Tasks/{taskId}/run | Run a task by id |
| [**tasksUpdatePermissions**](TasksApi.md#tasksUpdatePermissions) | **POST** /api/tasks/v1/Tasks/{id}/permissions | Update permissions |
| [**tasksUpdateTask**](TasksApi.md#tasksUpdateTask) | **PUT** /api/tasks/v1/Tasks/{taskId} | Update a task |


<a id="tasksCreateTask"></a>
# **tasksCreateTask**
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
| **200** | Task was created |  -  |
| **400** | Bad VM provided |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | Not enough permissions for the operation |  -  |
| **404** | Subscription was not found |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="tasksDeleteTask"></a>
# **tasksDeleteTask**
> tasksDeleteTask(taskId)

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
| **204** | Task was deleted |  -  |
| **400** | Bad id provided |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | Not enough permissions for the operation |  -  |
| **404** | Subscription or task was not found |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="tasksGet"></a>
# **tasksGet**
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
| **200** | Task was found |  -  |
| **400** | Bad id provided |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | Not enough permissions for the operation |  -  |
| **404** | Subscription or task was not found |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="tasksGetList"></a>
# **tasksGetList**
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
| **200** | Tasks were found |  -  |
| **400** | Bad id provided |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | Not enough permissions for the operation |  -  |
| **404** | Subscription or tasks were not found |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="tasksGetPermissions"></a>
# **tasksGetPermissions**
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
| **200** | Task was found |  -  |
| **400** | Bad id provided |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | Not enough permissions for the operation |  -  |
| **404** | Subscription or task was not found |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="tasksRenameTask"></a>
# **tasksRenameTask**
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
| **200** | Task was found |  -  |
| **400** | Bad id or name provided |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | Not enough permissions for the operation |  -  |
| **404** | Subscription or task was not found |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="tasksRunTask"></a>
# **tasksRunTask**
> tasksRunTask(runTaskBaseVM)

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
| **200** | Task was executed |  -  |
| **403** | Not enough permissions for the operation |  -  |
| **404** | Subscription was not found |  -  |
| **402** | Subscription is outdated |  -  |
| **400** | Bad VM provided |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="tasksRunTaskById"></a>
# **tasksRunTaskById**
> tasksRunTaskById(taskId)

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
| **200** | Task was executed |  -  |
| **400** | Bad id provided |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | Not enough permissions for the operation |  -  |
| **404** | Subscription or task was not found |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="tasksUpdatePermissions"></a>
# **tasksUpdatePermissions**
> tasksUpdatePermissions(id, updateTaskPermissionsVM)

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
| **204** | Task was updated |  -  |
| **400** | Bad id or VM provided |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | Not enough permissions for the operation |  -  |
| **404** | Subscription or task was not found |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="tasksUpdateTask"></a>
# **tasksUpdateTask**
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
| **400** | Bad id or VM provided |  -  |
| **402** | Subscription is outdated |  -  |
| **403** | Not enough permissions for the operation |  -  |
| **404** | Subscription or task was not found |  -  |
| **500** | Try again, if error still here - text our support |  -  |
| **204** | Task was updated |  -  |

