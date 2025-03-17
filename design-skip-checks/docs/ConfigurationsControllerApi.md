# ConfigurationsControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getConfiguration**](ConfigurationsControllerApi.md#getConfiguration) | **GET** /api/v1/configurations/config.json |  |


<a id="getConfiguration"></a>
# **getConfiguration**
> DataResponseConfigurationResponse getConfiguration()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConfigurationsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ConfigurationsControllerApi apiInstance = new ConfigurationsControllerApi(defaultClient);
    try {
      DataResponseConfigurationResponse result = apiInstance.getConfiguration();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigurationsControllerApi#getConfiguration");
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

[**DataResponseConfigurationResponse**](DataResponseConfigurationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

