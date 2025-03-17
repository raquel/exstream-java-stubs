# ApiV1ConfigTypesApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/ei*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getConfigurationTypes**](ApiV1ConfigTypesApi.md#getConfigurationTypes) | **GET** /api/v1/configTypes/{tenantId}/{domainId} |  |


<a id="getConfigurationTypes"></a>
# **getConfigurationTypes**
> ListResponseEditableConfig getConfigurationTypes(tenantId, domainId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiV1ConfigTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/ei");

    ApiV1ConfigTypesApi apiInstance = new ApiV1ConfigTypesApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String domainId = "domainId_example"; // String | 
    try {
      ListResponseEditableConfig result = apiInstance.getConfigurationTypes(tenantId, domainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiV1ConfigTypesApi#getConfigurationTypes");
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
| **tenantId** | **String**|  | |
| **domainId** | **String**|  | |

### Return type

[**ListResponseEditableConfig**](ListResponseEditableConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

