# VersionControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/eep*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getApiVersion**](VersionControllerApi.md#getApiVersion) | **GET** /api/v1/version/api |  |
| [**getVersion**](VersionControllerApi.md#getVersion) | **GET** /api/v1/version |  |


<a id="getApiVersion"></a>
# **getApiVersion**
> String getApiVersion()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VersionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/eep");

    VersionControllerApi apiInstance = new VersionControllerApi(defaultClient);
    try {
      String result = apiInstance.getApiVersion();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VersionControllerApi#getApiVersion");
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

<a id="getVersion"></a>
# **getVersion**
> VersionConfig getVersion()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VersionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/eep");

    VersionControllerApi apiInstance = new VersionControllerApi(defaultClient);
    try {
      VersionConfig result = apiInstance.getVersion();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VersionControllerApi#getVersion");
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

[**VersionConfig**](VersionConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

