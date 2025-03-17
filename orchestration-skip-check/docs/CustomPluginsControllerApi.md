# CustomPluginsControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/orchestration*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPlugins**](CustomPluginsControllerApi.md#getPlugins) | **GET** /api/v1/plugins | Get a list of plugins |


<a id="getPlugins"></a>
# **getPlugins**
> DataResponseMapStringPlugin getPlugins(locale)

Get a list of plugins

Returns a list of descriptions for all currently deployed custom plugins

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomPluginsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    CustomPluginsControllerApi apiInstance = new CustomPluginsControllerApi(defaultClient);
    String locale = "locale_example"; // String | Requested localization for plugins if available. Will return base localization otherwise.
    try {
      DataResponseMapStringPlugin result = apiInstance.getPlugins(locale);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomPluginsControllerApi#getPlugins");
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
| **locale** | **String**| Requested localization for plugins if available. Will return base localization otherwise. | [optional] |

### Return type

[**DataResponseMapStringPlugin**](DataResponseMapStringPlugin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

