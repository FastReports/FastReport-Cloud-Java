package cloud.fastreport.client;

import cloud.fastreport.ApiClient;

import cloud.fastreport.model.AnalysisResultsVM;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-22T14:13:34.806+03:00[Europe/Moscow]")
public class AdminSubscriptionProblemSolvingApi {
    private ApiClient apiClient;

    public AdminSubscriptionProblemSolvingApi() {
        this(new ApiClient());
    }

    public AdminSubscriptionProblemSolvingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Solve problems provided by FastReport.Cloud.Admin.Controllers.SubscriptionAnalyticsController
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>403</b> - Forbidden
    * @param analysisResults The analysisResults parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void adminSubscriptionProblemSolvingSolveProblems(AnalysisResultsVM analysisResults) throws IOException {
        adminSubscriptionProblemSolvingSolveProblemsForHttpResponse(analysisResults);
    }

  /**
    * Solve problems provided by FastReport.Cloud.Admin.Controllers.SubscriptionAnalyticsController
    * <p><b>200</b> - Success
    * <p><b>400</b> - Bad Request
    * <p><b>403</b> - Forbidden
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void adminSubscriptionProblemSolvingSolveProblems(AnalysisResultsVM analysisResults, Map<String, Object> params) throws IOException {
        adminSubscriptionProblemSolvingSolveProblemsForHttpResponse(analysisResults, params);
    }

    public HttpResponse adminSubscriptionProblemSolvingSolveProblemsForHttpResponse(AnalysisResultsVM analysisResults) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Analytics/Solve");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(analysisResults);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse adminSubscriptionProblemSolvingSolveProblemsForHttpResponse(java.io.InputStream analysisResults, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Analytics/Solve");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = analysisResults == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, analysisResults);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse adminSubscriptionProblemSolvingSolveProblemsForHttpResponse(AnalysisResultsVM analysisResults, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/api/admin/v1/Analytics/Solve");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(analysisResults);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


}
