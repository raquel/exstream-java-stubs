# CacheControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/orchestration*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cleanCache**](CacheControllerApi.md#cleanCache) | **DELETE** /api/v1/runtime/cache | Clean input file cache |
| [**updateCache**](CacheControllerApi.md#updateCache) | **POST** /api/v1/runtime/cache/update | Updates input file cache |


<a id="cleanCache"></a>
# **cleanCache**
> String cleanCache()

Clean input file cache

Delete all input file cache entries for files which are currently not in use.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CacheControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    CacheControllerApi apiInstance = new CacheControllerApi(defaultClient);
    try {
      String result = apiInstance.cleanCache();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CacheControllerApi#cleanCache");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateCache"></a>
# **updateCache**
> String updateCache()

Updates input file cache

Checks if files in the cache should be updated.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CacheControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    CacheControllerApi apiInstance = new CacheControllerApi(defaultClient);
    try {
      String result = apiInstance.updateCache();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CacheControllerApi#updateCache");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

