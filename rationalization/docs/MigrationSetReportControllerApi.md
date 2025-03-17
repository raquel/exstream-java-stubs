# MigrationSetReportControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/rationalizationApi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMigrationReportDetails**](MigrationSetReportControllerApi.md#getMigrationReportDetails) | **GET** /api/v1/report/{domain}/{id} |  |


<a id="getMigrationReportDetails"></a>
# **getMigrationReportDetails**
> RationalizationResponseObject getMigrationReportDetails(domain, id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetReportControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetReportControllerApi apiInstance = new MigrationSetReportControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      RationalizationResponseObject result = apiInstance.getMigrationReportDetails(domain, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetReportControllerApi#getMigrationReportDetails");
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
| **domain** | **String**|  | |
| **id** | **UUID**|  | |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

