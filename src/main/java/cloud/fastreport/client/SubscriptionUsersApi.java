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

import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.ApiResponse;
import cloud.fastreport.Pair;

import cloud.fastreport.model.ProblemDetails;
import cloud.fastreport.model.SubscriptionUsersVM;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubscriptionUsersApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public SubscriptionUsersApi() {
    this(new ApiClient());
  }

  public SubscriptionUsersApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * Add a user to the subscription,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.
   * 
   * @param subscriptionId Idenitifier of subscription (required)
   * @param userId Idenitifier of user (required)
   * @throws ApiException if fails to make API call
   */
  public void subscriptionUsersAddUser(String subscriptionId, String userId) throws ApiException {
    subscriptionUsersAddUserWithHttpInfo(subscriptionId, userId);
  }

  /**
   * Add a user to the subscription,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.
   * 
   * @param subscriptionId Idenitifier of subscription (required)
   * @param userId Idenitifier of user (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> subscriptionUsersAddUserWithHttpInfo(String subscriptionId, String userId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = subscriptionUsersAddUserRequestBuilder(subscriptionId, userId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("subscriptionUsersAddUser", localVarResponse);
        }
        return new ApiResponse<Void>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          null
        );
      } finally {
        // Drain the InputStream
        while (localVarResponse.body().read() != -1) {
            // Ignore
        }
        localVarResponse.body().close();
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder subscriptionUsersAddUserRequestBuilder(String subscriptionId, String userId) throws ApiException {
    // verify the required parameter 'subscriptionId' is set
    if (subscriptionId == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionId' when calling subscriptionUsersAddUser");
    }
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling subscriptionUsersAddUser");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/manage/v1/Subscriptions/{subscriptionId}/users/{userId}"
        .replace("{subscriptionId}", ApiClient.urlEncode(subscriptionId.toString()))
        .replace("{userId}", ApiClient.urlEncode(userId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("PUT", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Returns a number of users in subscription
   * 
   * @param subscriptionId  (required)
   * @return Long
   * @throws ApiException if fails to make API call
   */
  public Long subscriptionUsersCountUsersAsync(String subscriptionId) throws ApiException {
    ApiResponse<Long> localVarResponse = subscriptionUsersCountUsersAsyncWithHttpInfo(subscriptionId);
    return localVarResponse.getData();
  }

  /**
   * Returns a number of users in subscription
   * 
   * @param subscriptionId  (required)
   * @return ApiResponse&lt;Long&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Long> subscriptionUsersCountUsersAsyncWithHttpInfo(String subscriptionId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = subscriptionUsersCountUsersAsyncRequestBuilder(subscriptionId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("subscriptionUsersCountUsersAsync", localVarResponse);
        }
        return new ApiResponse<Long>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Long>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder subscriptionUsersCountUsersAsyncRequestBuilder(String subscriptionId) throws ApiException {
    // verify the required parameter 'subscriptionId' is set
    if (subscriptionId == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionId' when calling subscriptionUsersCountUsersAsync");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/manage/v1/Subscriptions/{subscriptionId}/UsersCount"
        .replace("{subscriptionId}", ApiClient.urlEncode(subscriptionId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Returns all users of subscription
   * 
   * @param subscriptionId Idenitifier of subscription (required)
   * @param skip How many entities skip (optional, default to 0)
   * @param take How many entities take (optional, default to 10)
   * @return SubscriptionUsersVM
   * @throws ApiException if fails to make API call
   */
  public SubscriptionUsersVM subscriptionUsersGetUsers(String subscriptionId, Integer skip, Integer take) throws ApiException {
    ApiResponse<SubscriptionUsersVM> localVarResponse = subscriptionUsersGetUsersWithHttpInfo(subscriptionId, skip, take);
    return localVarResponse.getData();
  }

  /**
   * Returns all users of subscription
   * 
   * @param subscriptionId Idenitifier of subscription (required)
   * @param skip How many entities skip (optional, default to 0)
   * @param take How many entities take (optional, default to 10)
   * @return ApiResponse&lt;SubscriptionUsersVM&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SubscriptionUsersVM> subscriptionUsersGetUsersWithHttpInfo(String subscriptionId, Integer skip, Integer take) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = subscriptionUsersGetUsersRequestBuilder(subscriptionId, skip, take);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("subscriptionUsersGetUsers", localVarResponse);
        }
        return new ApiResponse<SubscriptionUsersVM>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SubscriptionUsersVM>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder subscriptionUsersGetUsersRequestBuilder(String subscriptionId, Integer skip, Integer take) throws ApiException {
    // verify the required parameter 'subscriptionId' is set
    if (subscriptionId == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionId' when calling subscriptionUsersGetUsers");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/manage/v1/Subscriptions/{subscriptionId}/users"
        .replace("{subscriptionId}", ApiClient.urlEncode(subscriptionId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "skip";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("skip", skip));
    localVarQueryParameterBaseName = "take";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("take", take));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Allows user to leave subscription,.
   * 
   * @param subscriptionId Idenitifier of subscription (required)
   * @throws ApiException if fails to make API call
   */
  public void subscriptionUsersLeaveSubscripiton(String subscriptionId) throws ApiException {
    subscriptionUsersLeaveSubscripitonWithHttpInfo(subscriptionId);
  }

  /**
   * Allows user to leave subscription,.
   * 
   * @param subscriptionId Idenitifier of subscription (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> subscriptionUsersLeaveSubscripitonWithHttpInfo(String subscriptionId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = subscriptionUsersLeaveSubscripitonRequestBuilder(subscriptionId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("subscriptionUsersLeaveSubscripiton", localVarResponse);
        }
        return new ApiResponse<Void>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          null
        );
      } finally {
        // Drain the InputStream
        while (localVarResponse.body().read() != -1) {
            // Ignore
        }
        localVarResponse.body().close();
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder subscriptionUsersLeaveSubscripitonRequestBuilder(String subscriptionId) throws ApiException {
    // verify the required parameter 'subscriptionId' is set
    if (subscriptionId == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionId' when calling subscriptionUsersLeaveSubscripiton");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/manage/v1/Subscriptions/{subscriptionId}/leave"
        .replace("{subscriptionId}", ApiClient.urlEncode(subscriptionId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Delete a user from the subscription,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.
   * 
   * @param subscriptionId Idenitifier of subscription (required)
   * @param userId Idenitifier of user (required)
   * @throws ApiException if fails to make API call
   */
  public void subscriptionUsersRemoveUser(String subscriptionId, String userId) throws ApiException {
    subscriptionUsersRemoveUserWithHttpInfo(subscriptionId, userId);
  }

  /**
   * Delete a user from the subscription,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.
   * 
   * @param subscriptionId Idenitifier of subscription (required)
   * @param userId Idenitifier of user (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> subscriptionUsersRemoveUserWithHttpInfo(String subscriptionId, String userId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = subscriptionUsersRemoveUserRequestBuilder(subscriptionId, userId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("subscriptionUsersRemoveUser", localVarResponse);
        }
        return new ApiResponse<Void>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          null
        );
      } finally {
        // Drain the InputStream
        while (localVarResponse.body().read() != -1) {
            // Ignore
        }
        localVarResponse.body().close();
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder subscriptionUsersRemoveUserRequestBuilder(String subscriptionId, String userId) throws ApiException {
    // verify the required parameter 'subscriptionId' is set
    if (subscriptionId == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionId' when calling subscriptionUsersRemoveUser");
    }
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling subscriptionUsersRemoveUser");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/manage/v1/Subscriptions/{subscriptionId}/users/{userId}"
        .replace("{subscriptionId}", ApiClient.urlEncode(subscriptionId.toString()))
        .replace("{userId}", ApiClient.urlEncode(userId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}
