# MigrationSetImportControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/rationalizationApi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**importMigrationSet**](MigrationSetImportControllerApi.md#importMigrationSet) | **POST** /api/v1/migrationset/import/{domain} |  |


<a id="importMigrationSet"></a>
# **importMigrationSet**
> RationalizationResponseObject importMigrationSet(domain, commit, encrypt, document)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetImportControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetImportControllerApi apiInstance = new MigrationSetImportControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    Boolean commit = false; // Boolean | 
    String encrypt = "encrypt_example"; // String | 
    File document = new File("/path/to/file"); // File | 
    try {
      RationalizationResponseObject result = apiInstance.importMigrationSet(domain, commit, encrypt, document);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetImportControllerApi#importMigrationSet");
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
| **commit** | **Boolean**|  | [optional] [default to false] |
| **encrypt** | **String**|  | [optional] |
| **document** | **File**|  | [optional] |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data, application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

