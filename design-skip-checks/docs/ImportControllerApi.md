# ImportControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateGraph**](ImportControllerApi.md#generateGraph) | **POST** /api/v1/import/resource-graph/{packagetype} |  |
| [**getImportHistory**](ImportControllerApi.md#getImportHistory) | **GET** /api/v1/import/logs |  |
| [**importPackage**](ImportControllerApi.md#importPackage) | **POST** /api/v1/import/{packagetype}/{domain} |  |


<a id="generateGraph"></a>
# **generateGraph**
> generateGraph(packagetype, nodeFormat, expandSystemResources, exportPackage)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ImportControllerApi apiInstance = new ImportControllerApi(defaultClient);
    String packagetype = "das"; // String | 
    String nodeFormat = "nodeFormat_example"; // String | 
    Boolean expandSystemResources = true; // Boolean | 
    File exportPackage = new File("/path/to/file"); // File | The zip of the export to import
    try {
      apiInstance.generateGraph(packagetype, nodeFormat, expandSystemResources, exportPackage);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportControllerApi#generateGraph");
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
| **packagetype** | **String**|  | [enum: das, migrator] |
| **nodeFormat** | **String**|  | [optional] |
| **expandSystemResources** | **Boolean**|  | [optional] |
| **exportPackage** | **File**| The zip of the export to import | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getImportHistory"></a>
# **getImportHistory**
> ListResponseImportHistory getImportHistory()



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ImportControllerApi apiInstance = new ImportControllerApi(defaultClient);
    try {
      ListResponseImportHistory result = apiInstance.getImportHistory();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportControllerApi#getImportHistory");
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

<a id="importPackage"></a>
# **importPackage**
> DataResponseImportResponse importPackage(packagetype, domain, commit, previousExportPackage, exportPackage)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ImportControllerApi apiInstance = new ImportControllerApi(defaultClient);
    String packagetype = "das"; // String | 
    String domain = "domain_example"; // String | 
    Boolean commit = false; // Boolean | Set to false to do a dry run
    String previousExportPackage = "previousExportPackage_example"; // String | The id of a previously uploaded export package
    File exportPackage = new File("/path/to/file"); // File | The zip of the export to import
    try {
      DataResponseImportResponse result = apiInstance.importPackage(packagetype, domain, commit, previousExportPackage, exportPackage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportControllerApi#importPackage");
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
| **packagetype** | **String**|  | [enum: das, migrator] |
| **domain** | **String**|  | |
| **commit** | **Boolean**| Set to false to do a dry run | [optional] [default to false] |
| **previousExportPackage** | **String**| The id of a previously uploaded export package | [optional] |
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

