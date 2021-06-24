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

import cloud.fastreport.model.CreateSubscriptionInviteVM;
import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.SubscriptionInviteVM;
import cloud.fastreport.model.SubscriptionInvitesVM;
import org.junit.Test;
import org.junit.Ignore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubscriptionInvitesApi
 */
@Ignore
public class SubscriptionInvitesApiTest {

    private final SubscriptionInvitesApi api = new SubscriptionInvitesApi();

    
    /**
     * Add a user to the subscription using invite,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void subscriptionInvitesAcceptInviteTest() throws IOException {
        String subscriptionId = null;
        String accessToken = null;
        api.subscriptionInvitesAcceptInvite(subscriptionId, accessToken);

        // TODO: test validations
    }
    
    /**
     * Create invite to subscription
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void subscriptionInvitesCreateInviteTest() throws IOException {
        String subscriptionId = null;
        CreateSubscriptionInviteVM createInviteVM = null;
        SubscriptionInviteVM response = api.subscriptionInvitesCreateInvite(subscriptionId, createInviteVM);

        // TODO: test validations
    }
    
    /**
     * Rename subscription
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void subscriptionInvitesDeleteInviteTest() throws IOException {
        String subscriptionId = null;
        String accesstoken = null;
        api.subscriptionInvitesDeleteInvite(subscriptionId, accesstoken);

        // TODO: test validations
    }
    
    /**
     * Get list of invites in a subscription,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void subscriptionInvitesGetInvitesTest() throws IOException {
        String subscriptionId = null;
        SubscriptionInvitesVM response = api.subscriptionInvitesGetInvites(subscriptionId);

        // TODO: test validations
    }
    
}
