# ApiV1TenantInternalApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/rationalizationApi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTenant1**](ApiV1TenantInternalApi.md#getTenant1) | **GET** /api/v1/tenant/internal/{tenantId} |  |


<a id="getTenant1"></a>
# **getTenant1**
> DataResponseTenant getTenant1(tenantId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiV1TenantInternalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    ApiV1TenantInternalApi apiInstance = new ApiV1TenantInternalApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    try {
      DataResponseTenant result = apiInstance.getTenant1(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiV1TenantInternalApi#getTenant1");
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

### Return type

[**DataResponseTenant**](DataResponseTenant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

