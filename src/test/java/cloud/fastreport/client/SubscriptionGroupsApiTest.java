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

import cloud.fastreport.model.GroupsVM;
import cloud.fastreport.model.ProblemDetails;
import org.junit.Test;
import org.junit.Ignore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubscriptionGroupsApi
 */
@Ignore
public class SubscriptionGroupsApiTest {

    private final SubscriptionGroupsApi api = new SubscriptionGroupsApi();

    
    /**
     * Returns a number of groups in subscription
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void subscriptionGroupsCountGroupsAsyncTest() throws IOException {
        String subscriptionId = null;
        Long response = api.subscriptionGroupsCountGroupsAsync(subscriptionId);

        // TODO: test validations
    }
    
    /**
     * returns groups of the subscription or subscription user
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void subscriptionGroupsGetGroupsListTest() throws IOException {
        String subscriptionId = null;
        String userId = null;
        GroupsVM response = api.subscriptionGroupsGetGroupsList(subscriptionId, userId);

        // TODO: test validations
    }
    
}
