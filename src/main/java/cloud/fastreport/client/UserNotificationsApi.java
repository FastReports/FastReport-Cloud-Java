package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import cloud.fastreport.model.AuditActionsVM;
import cloud.fastreport.model.ClearNotificationsVM;
import cloud.fastreport.model.ProblemDetails;

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
public class UserNotificationsApi {
    private ApiClient apiClient;

    public UserNotificationsApi() {
        this(new ApiClient());
    }

    public UserNotificationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Use this endpoint to \&quot;clear\&quot; your notifications
    * <p><b>204</b> - No Content
    * <p><b>400</b> - Bad Request
    * <p><b>404</b> - Not Found
    * @param clearNotificationsVM 
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void userNotificationsClearNotifications(ClearNotificationsVM clearNotificationsVM) throws IOException {
        userNotificationsClearNotificationsForHttpResponse(clearNotificationsVM);
    }

  /**
    * Use this endpoint to \&quot;clear\&quot; your notifications
    * <p><b>204</b> - No Content
    * <p><b>400</b> - Bad Request
    * <p><b>404</b> - Not Found
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void userNotificationsClearNotifications(ClearNotificationsVM clearNotificationsVM, Map<String, Object> params) throws IOException {
        userNotificationsClearNotificationsForHttpResponse(clearNotificationsVM, params);
    }

    public HttpResponse userNotificationsClearNotificationsForHttpResponse(ClearNotificationsVM clearNotificationsVM) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/notifications");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

      public HttpResponse userNotificationsClearNotificationsForHttpResponse(java.io.InputStream clearNotificationsVM, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/notifications");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = clearNotificationsVM == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, clearNotificationsVM);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
      }

    public HttpResponse userNotificationsClearNotificationsForHttpResponse(ClearNotificationsVM clearNotificationsVM, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/notifications");

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

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }


  /**
    * Use this endpoint to recieve notifications
    * <p><b>200</b> - Success
    * <p><b>204</b> - No Content
    * @param skip The skip parameter
    * @param take The take parameter
    * @param subscriptionId The subscriptionId parameter
    * @return AuditActionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AuditActionsVM userNotificationsGetNotifications(Integer skip, Integer take, String subscriptionId) throws IOException {
        HttpResponse response = userNotificationsGetNotificationsForHttpResponse(skip, take, subscriptionId);
        TypeReference<AuditActionsVM> typeRef = new TypeReference<AuditActionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Use this endpoint to recieve notifications
    * <p><b>200</b> - Success
    * <p><b>204</b> - No Content
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return AuditActionsVM
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AuditActionsVM userNotificationsGetNotifications(Map<String, Object> params) throws IOException {
        HttpResponse response = userNotificationsGetNotificationsForHttpResponse(params);
        TypeReference<AuditActionsVM> typeRef = new TypeReference<AuditActionsVM>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse userNotificationsGetNotificationsForHttpResponse(Integer skip, Integer take, String subscriptionId) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/notifications");
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
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse userNotificationsGetNotificationsForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/manage/v1/notifications");

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

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }


}
