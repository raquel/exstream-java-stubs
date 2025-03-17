# ExportControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/rationalizationApi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exportMigrationSet**](ExportControllerApi.md#exportMigrationSet) | **GET** /api/v1/export/{domain}/{id} |  |
| [**exportResourcesFromRootInDomain**](ExportControllerApi.md#exportResourcesFromRootInDomain) | **POST** /api/v1/export/{domain}/{id} |  |


<a id="exportMigrationSet"></a>
# **exportMigrationSet**
> exportMigrationSet(domain, id, version)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    ExportControllerApi apiInstance = new ExportControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    String version = "LATEST_APPROVED"; // String | 
    try {
      apiInstance.exportMigrationSet(domain, id, version);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportControllerApi#exportMigrationSet");
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
| **version** | **String**|  | [optional] [default to LATEST_APPROVED] [enum: LATEST_APPROVED, LATEST] |

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

<a id="exportResourcesFromRootInDomain"></a>
# **exportResourcesFromRootInDomain**
> exportResourcesFromRootInDomain(domain, id, migrationSetExportRequest)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    ExportControllerApi apiInstance = new ExportControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    MigrationSetExportRequest migrationSetExportRequest = new MigrationSetExportRequest(); // MigrationSetExportRequest | 
    try {
      apiInstance.exportResourcesFromRootInDomain(domain, id, migrationSetExportRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportControllerApi#exportResourcesFromRootInDomain");
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
| **migrationSetExportRequest** | [**MigrationSetExportRequest**](MigrationSetExportRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

