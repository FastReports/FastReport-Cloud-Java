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

import cloud.fastreport.ApiCallback;
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
import cloud.fastreport.Configuration;
import cloud.fastreport.Pair;
import cloud.fastreport.ProgressRequestBody;
import cloud.fastreport.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import cloud.fastreport.model.GroupsVM;
import cloud.fastreport.model.ProblemDetails;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubscriptionGroupsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SubscriptionGroupsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SubscriptionGroupsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for subscriptionGroupsCountGroupsAsync
     * @param subscriptionId subscripiton id (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Everything is all right </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> id is not hex24 </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Subscription is blocked </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You don&#39;t have permisison to get groups from this subscription (or in your default (1st) subscription) </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> there is no subscription with provided id found, or user don&#39;t even have a subscription </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call subscriptionGroupsCountGroupsAsyncCall(String subscriptionId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/manage/v1/Subscriptions/{subscriptionId}/count"
            .replace("{" + "subscriptionId" + "}", localVarApiClient.escapeString(subscriptionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKey", "JWT" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call subscriptionGroupsCountGroupsAsyncValidateBeforeCall(String subscriptionId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new ApiException("Missing the required parameter 'subscriptionId' when calling subscriptionGroupsCountGroupsAsync(Async)");
        }

        return subscriptionGroupsCountGroupsAsyncCall(subscriptionId, _callback);

    }

    /**
     * Returns a number of groups in subscription
     * 
     * @param subscriptionId subscripiton id (required)
     * @return Long
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Everything is all right </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> id is not hex24 </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Subscription is blocked </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You don&#39;t have permisison to get groups from this subscription (or in your default (1st) subscription) </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> there is no subscription with provided id found, or user don&#39;t even have a subscription </td><td>  -  </td></tr>
     </table>
     */
    public Long subscriptionGroupsCountGroupsAsync(String subscriptionId) throws ApiException {
        ApiResponse<Long> localVarResp = subscriptionGroupsCountGroupsAsyncWithHttpInfo(subscriptionId);
        return localVarResp.getData();
    }

    /**
     * Returns a number of groups in subscription
     * 
     * @param subscriptionId subscripiton id (required)
     * @return ApiResponse&lt;Long&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Everything is all right </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> id is not hex24 </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Subscription is blocked </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You don&#39;t have permisison to get groups from this subscription (or in your default (1st) subscription) </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> there is no subscription with provided id found, or user don&#39;t even have a subscription </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Long> subscriptionGroupsCountGroupsAsyncWithHttpInfo(String subscriptionId) throws ApiException {
        okhttp3.Call localVarCall = subscriptionGroupsCountGroupsAsyncValidateBeforeCall(subscriptionId, null);
        Type localVarReturnType = new TypeToken<Long>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns a number of groups in subscription (asynchronously)
     * 
     * @param subscriptionId subscripiton id (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Everything is all right </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> id is not hex24 </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Subscription is blocked </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You don&#39;t have permisison to get groups from this subscription (or in your default (1st) subscription) </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> there is no subscription with provided id found, or user don&#39;t even have a subscription </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call subscriptionGroupsCountGroupsAsyncAsync(String subscriptionId, final ApiCallback<Long> _callback) throws ApiException {

        okhttp3.Call localVarCall = subscriptionGroupsCountGroupsAsyncValidateBeforeCall(subscriptionId, _callback);
        Type localVarReturnType = new TypeToken<Long>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for subscriptionGroupsGetGroupsList
     * @param subscriptionId subscripiton id (required)
     * @param userId user Id (optional) (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Everything is all right (list of groups may be empty) </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> id is not hex24 </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Subscription is blocked </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You don&#39;t have permisison to get groups from this subscription (or in your default (1st) subscription) </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> there is no subscription with provided id found, or user don&#39;t even have a subscription </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call subscriptionGroupsGetGroupsListCall(String subscriptionId, String userId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/manage/v1/Subscriptions/{subscriptionId}/groups"
            .replace("{" + "subscriptionId" + "}", localVarApiClient.escapeString(subscriptionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (userId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("userId", userId));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKey", "JWT" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call subscriptionGroupsGetGroupsListValidateBeforeCall(String subscriptionId, String userId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new ApiException("Missing the required parameter 'subscriptionId' when calling subscriptionGroupsGetGroupsList(Async)");
        }

        return subscriptionGroupsGetGroupsListCall(subscriptionId, userId, _callback);

    }

    /**
     * returns groups of the subscription or subscription user
     * 
     * @param subscriptionId subscripiton id (required)
     * @param userId user Id (optional) (optional)
     * @return GroupsVM
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Everything is all right (list of groups may be empty) </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> id is not hex24 </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Subscription is blocked </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You don&#39;t have permisison to get groups from this subscription (or in your default (1st) subscription) </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> there is no subscription with provided id found, or user don&#39;t even have a subscription </td><td>  -  </td></tr>
     </table>
     */
    public GroupsVM subscriptionGroupsGetGroupsList(String subscriptionId, String userId) throws ApiException {
        ApiResponse<GroupsVM> localVarResp = subscriptionGroupsGetGroupsListWithHttpInfo(subscriptionId, userId);
        return localVarResp.getData();
    }

    /**
     * returns groups of the subscription or subscription user
     * 
     * @param subscriptionId subscripiton id (required)
     * @param userId user Id (optional) (optional)
     * @return ApiResponse&lt;GroupsVM&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Everything is all right (list of groups may be empty) </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> id is not hex24 </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Subscription is blocked </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You don&#39;t have permisison to get groups from this subscription (or in your default (1st) subscription) </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> there is no subscription with provided id found, or user don&#39;t even have a subscription </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GroupsVM> subscriptionGroupsGetGroupsListWithHttpInfo(String subscriptionId, String userId) throws ApiException {
        okhttp3.Call localVarCall = subscriptionGroupsGetGroupsListValidateBeforeCall(subscriptionId, userId, null);
        Type localVarReturnType = new TypeToken<GroupsVM>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * returns groups of the subscription or subscription user (asynchronously)
     * 
     * @param subscriptionId subscripiton id (required)
     * @param userId user Id (optional) (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Everything is all right (list of groups may be empty) </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> id is not hex24 </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Subscription is blocked </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You don&#39;t have permisison to get groups from this subscription (or in your default (1st) subscription) </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> there is no subscription with provided id found, or user don&#39;t even have a subscription </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call subscriptionGroupsGetGroupsListAsync(String subscriptionId, String userId, final ApiCallback<GroupsVM> _callback) throws ApiException {

        okhttp3.Call localVarCall = subscriptionGroupsGetGroupsListValidateBeforeCall(subscriptionId, userId, _callback);
        Type localVarReturnType = new TypeToken<GroupsVM>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
