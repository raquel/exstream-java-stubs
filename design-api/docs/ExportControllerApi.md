# ExportControllerApi

All URIs are relative to *http://localhost/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exportResourcesFromRootInDomainUsingGET**](ExportControllerApi.md#exportResourcesFromRootInDomainUsingGET) | **GET** /api/v1/export/{domain}/{rootId} | Export a resource and its references into a ZIP file |


<a id="exportResourcesFromRootInDomainUsingGET"></a>
# **exportResourcesFromRootInDomainUsingGET**
> exportResourcesFromRootInDomainUsingGET(domain, rootId, versions)

Export a resource and its references into a ZIP file

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExportControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/design");

    ExportControllerApi apiInstance = new ExportControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    UUID rootId = UUID.randomUUID(); // UUID | rootId
    String versions = "ALL"; // String | versions
    try {
      apiInstance.exportResourcesFromRootInDomainUsingGET(domain, rootId, versions);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportControllerApi#exportResourcesFromRootInDomainUsingGET");
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
| **domain** | **String**| domain | |
| **rootId** | **UUID**| rootId | |
| **versions** | **String**| versions | [optional] [default to LATEST_APPROVED] [enum: ALL, LATEST_APPROVED, LATEST] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

