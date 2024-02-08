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

import cloud.fastreport.ApiException;
import cloud.fastreport.model.CreateGroupVM;
import cloud.fastreport.model.GroupPermissionsVM;
import cloud.fastreport.model.GroupVM;
import cloud.fastreport.model.GroupsVM;
import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.RenameGroupVM;
import cloud.fastreport.model.UpdateGroupPermissionsVM;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupsApi
 */
@Disabled
public class GroupsApiTest {

    private final GroupsApi api = new GroupsApi();

    /**
     * Create a new user group
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void groupsCreateGroupTest() throws ApiException {
        CreateGroupVM createGroupVM = null;
        GroupVM response = api.groupsCreateGroup(createGroupVM);
        // TODO: test validations
    }

    /**
     * Delete group by identifier
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void groupsDeleteGroupTest() throws ApiException {
        String id = null;
        api.groupsDeleteGroup(id);
        // TODO: test validations
    }

    /**
     * Gets group by identifier
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void groupsGetGroupTest() throws ApiException {
        String id = null;
        GroupVM response = api.groupsGetGroup(id);
        // TODO: test validations
    }

    /**
     * Returns a list of current user&#39;s groups&lt;br /&gt;  This method will return following data about groups : &lt;br /&gt;  Id, Name, Created time (UTC), Edited time (UTC), creator id, &lt;br /&gt;  editor id, subscription id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void groupsGetGroupListTest() throws ApiException {
        Integer skip = null;
        Integer take = null;
        GroupsVM response = api.groupsGetGroupList(skip, take);
        // TODO: test validations
    }

    /**
     * Gets group permissions by identifier
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void groupsGetPermissionsTest() throws ApiException {
        String id = null;
        GroupPermissionsVM response = api.groupsGetPermissions(id);
        // TODO: test validations
    }

    /**
     * Rename group by identifier
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void groupsRenameGroupTest() throws ApiException {
        String id = null;
        RenameGroupVM renameGroupVM = null;
        GroupVM response = api.groupsRenameGroup(id, renameGroupVM);
        // TODO: test validations
    }

    /**
     * Update permissions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void groupsUpdatePermissionsTest() throws ApiException {
        String id = null;
        UpdateGroupPermissionsVM updateGroupPermissionsVM = null;
        api.groupsUpdatePermissions(id, updateGroupPermissionsVM);
        // TODO: test validations
    }

}
