# ImportControllerApi

All URIs are relative to *http://localhost/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getImportHistoryUsingGET**](ImportControllerApi.md#getImportHistoryUsingGET) | **GET** /api/v1/import/logs | Fetch import history |
| [**importPackageUsingPOST**](ImportControllerApi.md#importPackageUsingPOST) | **POST** /api/v1/import/{packagetype}/{domain} | Import a package that was previously exported |


<a id="getImportHistoryUsingGET"></a>
# **getImportHistoryUsingGET**
> ListResponseImportHistory getImportHistoryUsingGET()

Fetch import history

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImportControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/design");

    ImportControllerApi apiInstance = new ImportControllerApi(defaultClient);
    try {
      ListResponseImportHistory result = apiInstance.getImportHistoryUsingGET();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportControllerApi#getImportHistoryUsingGET");
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

[**ListResponseImportHistory**](ListResponseImportHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="importPackageUsingPOST"></a>
# **importPackageUsingPOST**
> DataResponseImportResponse importPackageUsingPOST(domain, packagetype, commit, previousExportPackage, exportPackage)

Import a package that was previously exported

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImportControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/design");

    ImportControllerApi apiInstance = new ImportControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    String packagetype = "das"; // String | packagetype
    String commit = "commit_example"; // String | Set to false to do a dry run
    String previousExportPackage = "previousExportPackage_example"; // String | The id of a previously uploaded export package.
    File exportPackage = new File("/path/to/file"); // File | The zip of the export to import
    try {
      DataResponseImportResponse result = apiInstance.importPackageUsingPOST(domain, packagetype, commit, previousExportPackage, exportPackage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportControllerApi#importPackageUsingPOST");
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
| **packagetype** | **String**| packagetype | [enum: das, migrator] |
| **commit** | **String**| Set to false to do a dry run | [optional] |
| **previousExportPackage** | **String**| The id of a previously uploaded export package. | [optional] |
| **exportPackage** | **File**| The zip of the export to import | [optional] |

### Return type

[**DataResponseImportResponse**](DataResponseImportResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

