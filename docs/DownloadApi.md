# DownloadApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadGetExport**](DownloadApi.md#downloadGetExport) | **GET** /download/e/{id} | Returns a export file with specified id |
| [**downloadGetExportThumbnail**](DownloadApi.md#downloadGetExportThumbnail) | **GET** /download/e/{id}/thumbnail | Returns export&#39;s thumbnail |
| [**downloadGetExports**](DownloadApi.md#downloadGetExports) | **GET** /download/es/{archiveName} | Returns a zip archive with selected ids |
| [**downloadGetLastSVGExport**](DownloadApi.md#downloadGetLastSVGExport) | **GET** /download/lastPreview/{reportId} | returns export, that was created from report with specified id.  INTERNAL USAGE ONLY! |
| [**downloadGetReport**](DownloadApi.md#downloadGetReport) | **GET** /download/r/{id} | Returns a prepared file with specified id |
| [**downloadGetReportThumbnail**](DownloadApi.md#downloadGetReportThumbnail) | **GET** /download/r/{id}/thumbnail | Returns report&#39;s thumbnail |
| [**downloadGetReports**](DownloadApi.md#downloadGetReports) | **GET** /download/rs/{archiveName} | Returns a zip archive with selected files |
| [**downloadGetTemplate**](DownloadApi.md#downloadGetTemplate) | **GET** /download/t/{id} | Returns a Template file with specified id |
| [**downloadGetTemplateThumbnail**](DownloadApi.md#downloadGetTemplateThumbnail) | **GET** /download/t/{id}/thumbnail | Returns template&#39;s thumbnail |
| [**downloadGetTemplates**](DownloadApi.md#downloadGetTemplates) | **GET** /download/ts/{archiveName} | Returns a zip archive with selected files |


<a id="downloadGetExport"></a>
# **downloadGetExport**
> File downloadGetExport(id, preview)

Returns a export file with specified id

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DownloadApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: ApiKey
    HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setUsername("YOUR USERNAME");
    ApiKey.setPassword("YOUR PASSWORD");

    // Configure HTTP bearer authorization: JWT
    HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
    JWT.setBearerToken("BEARER TOKEN");

    DownloadApi apiInstance = new DownloadApi(defaultClient);
    String id = "id_example"; // String | 
    Boolean preview = false; // Boolean | 
    try {
      File result = apiInstance.downloadGetExport(id, preview);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DownloadApi#downloadGetExport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **preview** | **Boolean**|  | [optional] [default to false] |

### Return type

[**File**](File.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, application/octet-stream, application/pdf

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Specified file was found |  -  |
| **400** | Bad id provided |  -  |
| **402** | Subscription is blocked |  -  |
| **403** | Not enough permissions for the operation |  -  |
| **404** | Specified file was not found or user do not has access to the file |  -  |
| **500** | Try again, if error still here - text our support |  -  |

<a id="downloadGetExportThumbnail"></a>
# **downloadGetExportThumbnail**
> File downloadGetExportThumbnail(id)

Returns export&#39;s thumbnail

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DownloadApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: ApiKey
    HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setUsername("YOUR USERNAME");
    ApiKey.setPassword("YOUR PASSWORD");

    // Configure HTTP bearer authorization: JWT
    HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
    JWT.setBearerToken("BEARER TOKEN");

    DownloadApi apiInstance = new DownloadApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      File result = apiInstance.downloadGetExportThumbnail(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DownloadApi#downloadGetExportThumbnail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**File**](File.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, image/png, image/jpeg

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Specified thumbnail was found |  -  |
| **400** | Bad id provided |  -  |
| **402** | Subscription is blocked |  -  |
| **403** | Not enough permissions for the operation |  -  |
| **404** | Specified thumbnail was not found or user do not has access to it |  -  |

<a id="downloadGetExports"></a>
# **downloadGetExports**
> File downloadGetExports(archiveName, fileIds, folderIds)

Returns a zip archive with selected ids

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DownloadApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: ApiKey
    HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setUsername("YOUR USERNAME");
    ApiKey.setPassword("YOUR PASSWORD");

    // Configure HTTP bearer authorization: JWT
    HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
    JWT.setBearerToken("BEARER TOKEN");

    DownloadApi apiInstance = new DownloadApi(defaultClient);
    String archiveName = "archiveName_example"; // String | name of the created archive
    String fileIds = "fileIds_example"; // String | ids separated with a ',' sign
    String folderIds = "folderIds_example"; // String | ids separated with a ',' sign
    try {
      File result = apiInstance.downloadGetExports(archiveName, fileIds, folderIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DownloadApi#downloadGetExports");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **archiveName** | **String**| name of the created archive | |
| **fileIds** | **String**| ids separated with a &#39;,&#39; sign | [optional] |
| **folderIds** | **String**| ids separated with a &#39;,&#39; sign | [optional] |

### Return type

[**File**](File.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, application/zip

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Specified files was found |  -  |
| **400** | Bad id provided |  -  |
| **402** | Subscription is blocked |  -  |
| **403** | Not enough permissions for the operation |  -  |
| **404** | Specified files were not found or user do not has access to the file |  -  |

<a id="downloadGetLastSVGExport"></a>
# **downloadGetLastSVGExport**
> File downloadGetLastSVGExport(reportId)

returns export, that was created from report with specified id.  INTERNAL USAGE ONLY!

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DownloadApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: ApiKey
    HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setUsername("YOUR USERNAME");
    ApiKey.setPassword("YOUR PASSWORD");

    // Configure HTTP bearer authorization: JWT
    HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
    JWT.setBearerToken("BEARER TOKEN");

    DownloadApi apiInstance = new DownloadApi(defaultClient);
    String reportId = "reportId_example"; // String | 
    try {
      File result = apiInstance.downloadGetLastSVGExport(reportId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DownloadApi#downloadGetLastSVGExport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportId** | **String**|  | |

### Return type

[**File**](File.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Specified file was found |  -  |
| **400** | Bad id provided |  -  |
| **402** | Subscription is blocked |  -  |
| **403** | Not enough permissions for the operation |  -  |
| **404** | Specified file was not found or user do not has access to the file |  -  |

<a id="downloadGetReport"></a>
# **downloadGetReport**
> File downloadGetReport(id)

Returns a prepared file with specified id

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DownloadApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: ApiKey
    HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setUsername("YOUR USERNAME");
    ApiKey.setPassword("YOUR PASSWORD");

    // Configure HTTP bearer authorization: JWT
    HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
    JWT.setBearerToken("BEARER TOKEN");

    DownloadApi apiInstance = new DownloadApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      File result = apiInstance.downloadGetReport(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DownloadApi#downloadGetReport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**File**](File.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Specified file was found |  -  |
| **400** | Bad id provided |  -  |
| **402** | Subscription is blocked |  -  |
| **403** | Not enough permissions |  -  |
| **404** | Specified file was not found or user do not has access to the file |  -  |

<a id="downloadGetReportThumbnail"></a>
# **downloadGetReportThumbnail**
> File downloadGetReportThumbnail(id)

Returns report&#39;s thumbnail

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DownloadApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: ApiKey
    HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setUsername("YOUR USERNAME");
    ApiKey.setPassword("YOUR PASSWORD");

    // Configure HTTP bearer authorization: JWT
    HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
    JWT.setBearerToken("BEARER TOKEN");

    DownloadApi apiInstance = new DownloadApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      File result = apiInstance.downloadGetReportThumbnail(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DownloadApi#downloadGetReportThumbnail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**File**](File.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, image/png, image/jpeg

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Specified thumbnail was found |  -  |
| **400** | Bad id provided |  -  |
| **402** | Subscription is blocked |  -  |
| **403** | Not enough permissions for the operation |  -  |
| **404** | Specified thumbnail was not found or user do not has access to it |  -  |

<a id="downloadGetReports"></a>
# **downloadGetReports**
> File downloadGetReports(archiveName, fileIds, folderIds)

Returns a zip archive with selected files

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DownloadApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: ApiKey
    HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setUsername("YOUR USERNAME");
    ApiKey.setPassword("YOUR PASSWORD");

    // Configure HTTP bearer authorization: JWT
    HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
    JWT.setBearerToken("BEARER TOKEN");

    DownloadApi apiInstance = new DownloadApi(defaultClient);
    String archiveName = "archiveName_example"; // String | name of the created archive
    String fileIds = "fileIds_example"; // String | ids separated with a ',' sign
    String folderIds = "folderIds_example"; // String | ids separated with a ',' sign
    try {
      File result = apiInstance.downloadGetReports(archiveName, fileIds, folderIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DownloadApi#downloadGetReports");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **archiveName** | **String**| name of the created archive | |
| **fileIds** | **String**| ids separated with a &#39;,&#39; sign | [optional] |
| **folderIds** | **String**| ids separated with a &#39;,&#39; sign | [optional] |

### Return type

[**File**](File.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, application/zip

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Files were downloaded |  -  |
| **400** | Wrong parameters provided |  -  |
| **402** | Subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Files were not found |  -  |

<a id="downloadGetTemplate"></a>
# **downloadGetTemplate**
> File downloadGetTemplate(id)

Returns a Template file with specified id

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DownloadApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: ApiKey
    HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setUsername("YOUR USERNAME");
    ApiKey.setPassword("YOUR PASSWORD");

    // Configure HTTP bearer authorization: JWT
    HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
    JWT.setBearerToken("BEARER TOKEN");

    DownloadApi apiInstance = new DownloadApi(defaultClient);
    String id = "id_example"; // String | template id
    try {
      File result = apiInstance.downloadGetTemplate(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DownloadApi#downloadGetTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| template id | |

### Return type

[**File**](File.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Specified file was found |  -  |
| **400** | Bad id provided |  -  |
| **402** | Subscription is blocked |  -  |
| **403** | Not enough permissions |  -  |
| **404** | Specified file was not found or user do not has access to the file |  -  |

<a id="downloadGetTemplateThumbnail"></a>
# **downloadGetTemplateThumbnail**
> File downloadGetTemplateThumbnail(id)

Returns template&#39;s thumbnail

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DownloadApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: ApiKey
    HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setUsername("YOUR USERNAME");
    ApiKey.setPassword("YOUR PASSWORD");

    // Configure HTTP bearer authorization: JWT
    HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
    JWT.setBearerToken("BEARER TOKEN");

    DownloadApi apiInstance = new DownloadApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      File result = apiInstance.downloadGetTemplateThumbnail(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DownloadApi#downloadGetTemplateThumbnail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**File**](File.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, image/png, image/jpeg

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Specified thumbnail was found |  -  |
| **400** | Bad id provided |  -  |
| **402** | Subscription is blocked |  -  |
| **403** | Not enough permissions for the operation |  -  |
| **404** | Specified thumbnail was not found or user do not has access to it |  -  |

<a id="downloadGetTemplates"></a>
# **downloadGetTemplates**
> File downloadGetTemplates(archiveName, fileIds, folderIds)

Returns a zip archive with selected files

### Example
```java
// Import classes:
import cloud.fastreport.ApiClient;
import cloud.fastreport.ApiException;
import cloud.fastreport.Configuration;
import cloud.fastreport.auth.*;
import cloud.fastreport.models.*;
import cloud.fastreport.client.DownloadApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: ApiKey
    HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setUsername("YOUR USERNAME");
    ApiKey.setPassword("YOUR PASSWORD");

    // Configure HTTP bearer authorization: JWT
    HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
    JWT.setBearerToken("BEARER TOKEN");

    DownloadApi apiInstance = new DownloadApi(defaultClient);
    String archiveName = "archiveName_example"; // String | name of the created archive
    String fileIds = "fileIds_example"; // String | ids separated with a ',' sign
    String folderIds = "folderIds_example"; // String | ids separated with a ',' sign
    try {
      File result = apiInstance.downloadGetTemplates(archiveName, fileIds, folderIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DownloadApi#downloadGetTemplates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **archiveName** | **String**| name of the created archive | |
| **fileIds** | **String**| ids separated with a &#39;,&#39; sign | [optional] |
| **folderIds** | **String**| ids separated with a &#39;,&#39; sign | [optional] |

### Return type

[**File**](File.md)

### Authorization

[ApiKey](../README.md#ApiKey), [JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, application/zip

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Files were downloaded |  -  |
| **400** | Wrong parameters provided |  -  |
| **402** | Subscription is blocked |  -  |
| **403** | You don&#39;t have rights for the operation |  -  |
| **404** | Files were not found |  -  |

