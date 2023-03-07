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

import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.UpdateUserProfileVM;
import cloud.fastreport.model.UserProfileVM;
import org.junit.Test;
import org.junit.Ignore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserProfileApi
 */
@Ignore
public class UserProfileApiTest {

    private final UserProfileApi api = new UserProfileApi();

    
    /**
     * Return current profile of the current user
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void userProfileGetMyProfileTest() throws IOException {
        UserProfileVM response = api.userProfileGetMyProfile();

        // TODO: test validations
    }
    
    /**
     * Return user profile by user identifier.  If the user did not provide information about himself or blocked, then the endpoint will return an empty model. (only id)
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void userProfileGetUserProfileTest() throws IOException {
        String userId = null;
        UserProfileVM response = api.userProfileGetUserProfile(userId);

        // TODO: test validations
    }
    
    /**
     * Update profile of the current user
     *
     * This method is only allowed for local sign in via intranet
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void userProfileUpdateMyProfileTest() throws IOException {
        UpdateUserProfileVM updateUserProfileVM = null;
        api.userProfileUpdateMyProfile(updateUserProfileVM);

        // TODO: test validations
    }
    
}
