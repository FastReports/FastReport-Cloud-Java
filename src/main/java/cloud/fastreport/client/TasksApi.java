package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import cloud.fastreport.model.CreateTaskBaseVM;
import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.RunTaskBaseVM;
import cloud.fastreport.model.TaskBaseVM;
import cloud.fastreport.model.TaskPermissionsVM;
import cloud.fastreport.model.TasksVM;
import cloud.fastreport.model.UpdateTaskBaseVM;
import cloud.fastreport.model.UpdateTaskPermissionsVM;

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
public class TasksApi {
    private ApiClient apiClient;

    public TasksApi() {
        this(new ApiClient());
    }

    public TasksApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Create a new task
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param createTaskBaseVM task&#39;s view model. You have to specify task type (type: \&quot;ExportTemplate\&quot;)
    * @return TaskBaseVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TaskBaseVM tasksCreateTask(CreateTaskBaseVM createTaskBaseVM) throws IOException {
        HttpResponse response = tasksCreateTaskForHttpResponse(createTaskBaseVM);
        TypeReference<TaskBaseVM> typeRef = new TypeReference<TaskBaseVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create a new task
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TaskBaseVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TaskBaseVM tasksCreateTask(CreateTaskBaseVM createTaskBaseVM, Map<String, Object> params) throws IOException {
        HttpResponse response = tasksCreateTaskForHttpResponse(createTaskBaseVM, params);
        TypeReference<TaskBaseVM> typeRef = new TypeReference<TaskBaseVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse tasksCreateTaskForHttpResponse(CreateTaskBaseVM createTaskBaseVM) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/tasks/v1/Tasks");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(createTaskBaseVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }

      public HttpResponse tasksCreateTaskForHttpResponse(java.io.InputStream createTaskBaseVM, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/tasks/v1/Tasks");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent aContent = createTaskBaseVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, createTaskBaseVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
      }

    public HttpResponse tasksCreateTaskForHttpResponse(CreateTaskBaseVM createTaskBaseVM, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/tasks/v1/Tasks");

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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(createTaskBaseVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }


  /**
    * Delete a task from a storage
    * <p><b>204</b> - No Content
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param taskId deleting task id
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void tasksDeleteTask(String taskId) throws IOException {
        tasksDeleteTaskForHttpResponse(taskId);
    }

  /**
    * Delete a task from a storage
    * <p><b>204</b> - No Content
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param taskId deleting task id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void tasksDeleteTask(String taskId, Map<String, Object> params) throws IOException {
        tasksDeleteTaskForHttpResponse(taskId, params);
    }

    public HttpResponse tasksDeleteTaskForHttpResponse(String taskId) throws IOException {
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling tasksDeleteTask");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("taskId", taskId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/tasks/v1/Tasks/{taskId}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, aContent).execute();
    }

    public HttpResponse tasksDeleteTaskForHttpResponse(String taskId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling tasksDeleteTask");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("taskId", taskId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/tasks/v1/Tasks/{taskId}");

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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, aContent).execute();
    }


  /**
    * Get a task by a specified id
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param taskId a task id
    * @return TaskBaseVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TaskBaseVM tasksGet(String taskId) throws IOException {
        HttpResponse response = tasksGetForHttpResponse(taskId);
        TypeReference<TaskBaseVM> typeRef = new TypeReference<TaskBaseVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get a task by a specified id
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param taskId a task id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TaskBaseVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TaskBaseVM tasksGet(String taskId, Map<String, Object> params) throws IOException {
        HttpResponse response = tasksGetForHttpResponse(taskId, params);
        TypeReference<TaskBaseVM> typeRef = new TypeReference<TaskBaseVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse tasksGetForHttpResponse(String taskId) throws IOException {
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling tasksGet");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("taskId", taskId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/tasks/v1/Tasks/{taskId}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }

    public HttpResponse tasksGetForHttpResponse(String taskId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling tasksGet");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("taskId", taskId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/tasks/v1/Tasks/{taskId}");

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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }


  /**
    * Get tasks list
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param skip number of tasks, that have to be skipped
    * @param take number of tasks, that have to be returned
    * @param subscriptionId subscription id
    * @param searchPattern 
    * @return TasksVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TasksVM tasksGetList(Integer skip, Integer take, String subscriptionId, String searchPattern) throws IOException {
        HttpResponse response = tasksGetListForHttpResponse(skip, take, subscriptionId, searchPattern);
        TypeReference<TasksVM> typeRef = new TypeReference<TasksVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get tasks list
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TasksVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TasksVM tasksGetList(Map<String, Object> params) throws IOException {
        HttpResponse response = tasksGetListForHttpResponse(params);
        TypeReference<TasksVM> typeRef = new TypeReference<TasksVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse tasksGetListForHttpResponse(Integer skip, Integer take, String subscriptionId, String searchPattern) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/tasks/v1/Tasks");
        if (skip != null) {
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
        }        if (subscriptionId != null) {
            String key = "subscriptionId";
            Object value = subscriptionId;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (searchPattern != null) {
            String key = "searchPattern";
            Object value = searchPattern;
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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }

    public HttpResponse tasksGetListForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/tasks/v1/Tasks");

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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }


  /**
    * Get all Task permissions
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id task id
    * @return TaskPermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TaskPermissionsVM tasksGetPermissions(String id) throws IOException {
        HttpResponse response = tasksGetPermissionsForHttpResponse(id);
        TypeReference<TaskPermissionsVM> typeRef = new TypeReference<TaskPermissionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all Task permissions
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id task id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TaskPermissionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TaskPermissionsVM tasksGetPermissions(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = tasksGetPermissionsForHttpResponse(id, params);
        TypeReference<TaskPermissionsVM> typeRef = new TypeReference<TaskPermissionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse tasksGetPermissionsForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling tasksGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/tasks/v1/Tasks/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }

    public HttpResponse tasksGetPermissionsForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling tasksGetPermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/tasks/v1/Tasks/{id}/permissions");

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

        HttpContent aContent = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, aContent).execute();
    }


  /**
    * Rename a task
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param taskId renaming task id
    * @param newName task&#39;s new Name
    * @return TaskBaseVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TaskBaseVM tasksRenameTask(String taskId, String newName) throws IOException {
        HttpResponse response = tasksRenameTaskForHttpResponse(taskId, newName);
        TypeReference<TaskBaseVM> typeRef = new TypeReference<TaskBaseVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Rename a task
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param taskId renaming task id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TaskBaseVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TaskBaseVM tasksRenameTask(String taskId, Map<String, Object> params) throws IOException {
        HttpResponse response = tasksRenameTaskForHttpResponse(taskId, params);
        TypeReference<TaskBaseVM> typeRef = new TypeReference<TaskBaseVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse tasksRenameTaskForHttpResponse(String taskId, String newName) throws IOException {
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling tasksRenameTask");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("taskId", taskId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/tasks/v1/Tasks/{taskId}/rename");
        if (newName != null) {
            String key = "newName";
            Object value = newName;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
    }

    public HttpResponse tasksRenameTaskForHttpResponse(String taskId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling tasksRenameTask");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("taskId", taskId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/tasks/v1/Tasks/{taskId}/rename");

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

        HttpContent aContent = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
    }


  /**
    * Run a task from request body
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param runTaskBaseVM task&#39;s view model
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void tasksRunTask(RunTaskBaseVM runTaskBaseVM) throws IOException {
        tasksRunTaskForHttpResponse(runTaskBaseVM);
    }

  /**
    * Run a task from request body
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void tasksRunTask(RunTaskBaseVM runTaskBaseVM, Map<String, Object> params) throws IOException {
        tasksRunTaskForHttpResponse(runTaskBaseVM, params);
    }

    public HttpResponse tasksRunTaskForHttpResponse(RunTaskBaseVM runTaskBaseVM) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/tasks/v1/Tasks/run");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(runTaskBaseVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }

      public HttpResponse tasksRunTaskForHttpResponse(java.io.InputStream runTaskBaseVM, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/tasks/v1/Tasks/run");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent aContent = runTaskBaseVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, runTaskBaseVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
      }

    public HttpResponse tasksRunTaskForHttpResponse(RunTaskBaseVM runTaskBaseVM, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/tasks/v1/Tasks/run");

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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(runTaskBaseVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }


  /**
    * Run a task by id
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param taskId task id
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void tasksRunTaskById(String taskId) throws IOException {
        tasksRunTaskByIdForHttpResponse(taskId);
    }

  /**
    * Run a task by id
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param taskId task id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void tasksRunTaskById(String taskId, Map<String, Object> params) throws IOException {
        tasksRunTaskByIdForHttpResponse(taskId, params);
    }

    public HttpResponse tasksRunTaskByIdForHttpResponse(String taskId) throws IOException {
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling tasksRunTaskById");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("taskId", taskId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/tasks/v1/Tasks/{taskId}/run");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }

    public HttpResponse tasksRunTaskByIdForHttpResponse(String taskId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling tasksRunTaskById");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("taskId", taskId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/tasks/v1/Tasks/{taskId}/run");

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

        HttpContent aContent = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }


  /**
    * Update permissions
    * <p><b>204</b> - No Content
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id task id
    * @param updateTaskPermissionsVM new permissions
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void tasksUpdatePermissions(String id, UpdateTaskPermissionsVM updateTaskPermissionsVM) throws IOException {
        tasksUpdatePermissionsForHttpResponse(id, updateTaskPermissionsVM);
    }

  /**
    * Update permissions
    * <p><b>204</b> - No Content
    * <p><b>400</b> - Bad Request
    * <p><b>402</b> - Client Error
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>500</b> - Server Error
    * @param id task id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void tasksUpdatePermissions(UpdateTaskPermissionsVM updateTaskPermissionsVM, String id, Map<String, Object> params) throws IOException {
        tasksUpdatePermissionsForHttpResponse(updateTaskPermissionsVM, id, params);
    }

    public HttpResponse tasksUpdatePermissionsForHttpResponse(String id, UpdateTaskPermissionsVM updateTaskPermissionsVM) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling tasksUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/tasks/v1/Tasks/{id}/permissions");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(updateTaskPermissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }

      public HttpResponse tasksUpdatePermissionsForHttpResponse(String id, java.io.InputStream updateTaskPermissionsVM, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling tasksUpdatePermissions");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("id", id);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/tasks/v1/Tasks/{id}/permissions");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent aContent = updateTaskPermissionsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, updateTaskPermissionsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
      }

    public HttpResponse tasksUpdatePermissionsForHttpResponse(UpdateTaskPermissionsVM updateTaskPermissionsVM, String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling tasksUpdatePermissions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/tasks/v1/Tasks/{id}/permissions");

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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(updateTaskPermissionsVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, aContent).execute();
    }


  /**
    * Update a task
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param taskId updating task id
    * @param updateTaskBaseVM task&#39;s view model. You have to specify task type (type: \&quot;ExportTemplate\&quot;)
    * @return TaskBaseVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TaskBaseVM tasksUpdateTask(String taskId, UpdateTaskBaseVM updateTaskBaseVM) throws IOException {
        HttpResponse response = tasksUpdateTaskForHttpResponse(taskId, updateTaskBaseVM);
        TypeReference<TaskBaseVM> typeRef = new TypeReference<TaskBaseVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update a task
    * <p><b>200</b> - Success
    * <p><b>403</b> - Forbidden
    * <p><b>404</b> - Not Found
    * <p><b>402</b> - Client Error
    * <p><b>400</b> - Bad Request
    * <p><b>500</b> - Server Error
    * @param taskId updating task id
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TaskBaseVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TaskBaseVM tasksUpdateTask(UpdateTaskBaseVM updateTaskBaseVM, String taskId, Map<String, Object> params) throws IOException {
        HttpResponse response = tasksUpdateTaskForHttpResponse(updateTaskBaseVM, taskId, params);
        TypeReference<TaskBaseVM> typeRef = new TypeReference<TaskBaseVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse tasksUpdateTaskForHttpResponse(String taskId, UpdateTaskBaseVM updateTaskBaseVM) throws IOException {
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling tasksUpdateTask");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("taskId", taskId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/tasks/v1/Tasks/{taskId}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(updateTaskBaseVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
    }

      public HttpResponse tasksUpdateTaskForHttpResponse(String taskId, java.io.InputStream updateTaskBaseVM, String mediaType) throws IOException {
          // verify the required parameter 'taskId' is set
              if (taskId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling tasksUpdateTask");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("taskId", taskId);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/tasks/v1/Tasks/{taskId}");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent aContent = updateTaskBaseVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, updateTaskBaseVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
      }

    public HttpResponse tasksUpdateTaskForHttpResponse(UpdateTaskBaseVM updateTaskBaseVM, String taskId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling tasksUpdateTask");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("taskId", taskId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/tasks/v1/Tasks/{taskId}");

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

        HttpContent aContent = apiClient.new JacksonJsonHttpContent(updateTaskBaseVM);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, aContent).execute();
    }


}
