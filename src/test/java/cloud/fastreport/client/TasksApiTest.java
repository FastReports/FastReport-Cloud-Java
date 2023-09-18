/*
 * FastReport Cloud
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package cloud.fastreport.client;

import cloud.fastreport.model.CreateTaskBaseVM;
import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.RunTaskBaseVM;
import cloud.fastreport.model.TaskBaseVM;
import cloud.fastreport.model.TaskPermissionsVM;
import cloud.fastreport.model.TasksVM;
import cloud.fastreport.model.UpdateTaskBaseVM;
import cloud.fastreport.model.UpdateTaskPermissionsVM;
import org.junit.Test;
import org.junit.Ignore;

import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TasksApi
 */
@Ignore
public class TasksApiTest {

    private final TasksApi api = new TasksApi();

    
    /**
     * Create a new task
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void tasksCreateTaskTest() throws IOException {
        CreateTaskBaseVM createTaskBaseVM = null;
        TaskBaseVM response = api.tasksCreateTask(createTaskBaseVM);

        // TODO: test validations
    }
    
    /**
     * Delete a task from a storage
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void tasksDeleteTaskTest() throws IOException {
        String taskId = null;
        api.tasksDeleteTask(taskId);

        // TODO: test validations
    }
    
    /**
     * Get a task by a specified id
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void tasksGetTest() throws IOException {
        String taskId = null;
        TaskBaseVM response = api.tasksGet(taskId);

        // TODO: test validations
    }
    
    /**
     * Get tasks list
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void tasksGetListTest() throws IOException {
        Integer skip = null;
        Integer take = null;
        String subscriptionId = null;
        String searchPattern = null;
        TasksVM response = api.tasksGetList(skip, take, subscriptionId, searchPattern);

        // TODO: test validations
    }
    
    /**
     * Get all Task permissions
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void tasksGetPermissionsTest() throws IOException {
        String id = null;
        TaskPermissionsVM response = api.tasksGetPermissions(id);

        // TODO: test validations
    }
    
    /**
     * Rename a task
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void tasksRenameTaskTest() throws IOException {
        String taskId = null;
        String newName = null;
        TaskBaseVM response = api.tasksRenameTask(taskId, newName);

        // TODO: test validations
    }
    
    /**
     * Run a task from request body
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void tasksRunTaskTest() throws IOException {
        RunTaskBaseVM runTaskBaseVM = null;
        api.tasksRunTask(runTaskBaseVM);

        // TODO: test validations
    }
    
    /**
     * Run a task by id
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void tasksRunTaskByIdTest() throws IOException {
        String taskId = null;
        api.tasksRunTaskById(taskId);

        // TODO: test validations
    }
    
    /**
     * Update permissions
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void tasksUpdatePermissionsTest() throws IOException {
        String id = null;
        UpdateTaskPermissionsVM updateTaskPermissionsVM = null;
        api.tasksUpdatePermissions(id, updateTaskPermissionsVM);

        // TODO: test validations
    }
    
    /**
     * Update a task
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void tasksUpdateTaskTest() throws IOException {
        String taskId = null;
        UpdateTaskBaseVM updateTaskBaseVM = null;
        TaskBaseVM response = api.tasksUpdateTask(taskId, updateTaskBaseVM);

        // TODO: test validations
    }
    
}
