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

import cloud.fastreport.model.DefaultPermissionsVM;
import cloud.fastreport.model.MyPermissionsVM;
import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.RenameSubscriptionVM;
import cloud.fastreport.model.SubscriptionPermissionsVM;
import cloud.fastreport.model.SubscriptionVM;
import cloud.fastreport.model.SubscriptionsVM;
import cloud.fastreport.model.UpdateDefaultPermissionsVM;
import cloud.fastreport.model.UpdateSubscriptionLocaleVM;
import cloud.fastreport.model.UpdateSubscriptionPermissionsVM;
import org.junit.Test;
import org.junit.Ignore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubscriptionsApi
 */
@Ignore
public class SubscriptionsApiTest {

    private final SubscriptionsApi api = new SubscriptionsApi();

    
    /**
     * Get subscription&#39;s default permissions for new entities
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void subscriptionsGetDefaultPermissionsTest() throws IOException {
        String subscriptionId = null;
        DefaultPermissionsVM response = api.subscriptionsGetDefaultPermissions(subscriptionId);

        // TODO: test validations
    }
    
    /**
     * Get user&#39;s permissions for a subscription by id
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void subscriptionsGetMyPermissionsTest() throws IOException {
        String subId = null;
        MyPermissionsVM response = api.subscriptionsGetMyPermissions(subId);

        // TODO: test validations
    }
    
    /**
     * Get permissions for a subscription by id
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void subscriptionsGetPermissionsTest() throws IOException {
        String id = null;
        SubscriptionPermissionsVM response = api.subscriptionsGetPermissions(id);

        // TODO: test validations
    }
    
    /**
     * Returns the subscription by id
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void subscriptionsGetSubscriptionTest() throws IOException {
        String id = null;
        SubscriptionVM response = api.subscriptionsGetSubscription(id);

        // TODO: test validations
    }
    
    /**
     * Returns a list of all subscriptions of current user
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void subscriptionsGetSubscriptionsTest() throws IOException {
        Integer skip = null;
        Integer take = null;
        SubscriptionsVM response = api.subscriptionsGetSubscriptions(skip, take);

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
    public void subscriptionsRenameSubscriptionTest() throws IOException {
        String subscriptionId = null;
        RenameSubscriptionVM renameSubscriptionVM = null;
        SubscriptionVM response = api.subscriptionsRenameSubscription(subscriptionId, renameSubscriptionVM);

        // TODO: test validations
    }
    
    /**
     * Change subscription&#39;s default permissions for new entities
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void subscriptionsUpdateDefaultPermissionsTest() throws IOException {
        String subscriptionId = null;
        UpdateDefaultPermissionsVM updateDefaultPermissionsVM = null;
        DefaultPermissionsVM response = api.subscriptionsUpdateDefaultPermissions(subscriptionId, updateDefaultPermissionsVM);

        // TODO: test validations
    }
    
    /**
     * Update subscription&#39;s default locale
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void subscriptionsUpdateLocaleTest() throws IOException {
        String subscriptionId = null;
        UpdateSubscriptionLocaleVM updateSubscriptionLocaleVM = null;
        SubscriptionVM response = api.subscriptionsUpdateLocale(subscriptionId, updateSubscriptionLocaleVM);

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
    public void subscriptionsUpdatePermissionsTest() throws IOException {
        String id = null;
        UpdateSubscriptionPermissionsVM updateSubscriptionPermissionsVM = null;
        api.subscriptionsUpdatePermissions(id, updateSubscriptionPermissionsVM);

        // TODO: test validations
    }
    
}
