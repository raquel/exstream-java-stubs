# OtdsTenantAdminControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteTenantSchema**](OtdsTenantAdminControllerApi.md#deleteTenantSchema) | **DELETE** /api/v1/otds-tenants/{tenant} |  |


<a id="deleteTenantSchema"></a>
# **deleteTenantSchema**
> String deleteTenantSchema(tenant)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OtdsTenantAdminControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    OtdsTenantAdminControllerApi apiInstance = new OtdsTenantAdminControllerApi(defaultClient);
    String tenant = "tenant_example"; // String | 
    try {
      String result = apiInstance.deleteTenantSchema(tenant);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OtdsTenantAdminControllerApi#deleteTenantSchema");
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
| **tenant** | **String**|  | |

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

