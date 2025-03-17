# PdfControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createThumbnailContentForResource**](PdfControllerApi.md#createThumbnailContentForResource) | **POST** /api/v1/pdf/{domain}/{id}/content/thumbnail |  |
| [**extractPdf**](PdfControllerApi.md#extractPdf) | **GET** /api/v1/pdf/{domain}/contents/{id}/fragments |  |
| [**pdfPreview**](PdfControllerApi.md#pdfPreview) | **GET** /api/v1/pdf/{domain}/contents/{resourceId} |  |


<a id="createThumbnailContentForResource"></a>
# **createThumbnailContentForResource**
> DataResponseResourceVersion createThumbnailContentForResource(domain, id, version)



Expects a resource id , resource content type and version.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    PdfControllerApi apiInstance = new PdfControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    Integer version = 1; // Integer | 
    try {
      DataResponseResourceVersion result = apiInstance.createThumbnailContentForResource(domain, id, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfControllerApi#createThumbnailContentForResource");
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
| **version** | **Integer**|  | [optional] [default to 1] |

### Return type

[**DataResponseResourceVersion**](DataResponseResourceVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="extractPdf"></a>
# **extractPdf**
> PdfFragmentResponse extractPdf(domain, id, version, state, pageNum)



Expects a resource id, version and state as request parameter and return fragments ( paragraph, image ) for Pdf type resource

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    PdfControllerApi apiInstance = new PdfControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    Integer version = 56; // Integer | 
    String state = "DRAFT"; // String | 
    Integer pageNum = 56; // Integer | 
    try {
      PdfFragmentResponse result = apiInstance.extractPdf(domain, id, version, state, pageNum);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfControllerApi#extractPdf");
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
| **version** | **Integer**|  | |
| **state** | **String**|  | [enum: DRAFT, REVIEW, APPROVED, REJECTED] |
| **pageNum** | **Integer**|  | [optional] |

### Return type

[**PdfFragmentResponse**](PdfFragmentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="pdfPreview"></a>
# **pdfPreview**
> Object pdfPreview(domain, resourceId, version, state, pageNum)



Expects a resource id, version and state and page number as request parameter and return fragments image preview for Pdf type resource

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    PdfControllerApi apiInstance = new PdfControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID resourceId = UUID.randomUUID(); // UUID | 
    Integer version = 56; // Integer | 
    String state = "DRAFT"; // String | 
    Integer pageNum = 56; // Integer | 
    try {
      Object result = apiInstance.pdfPreview(domain, resourceId, version, state, pageNum);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfControllerApi#pdfPreview");
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
| **resourceId** | **UUID**|  | |
| **version** | **Integer**|  | |
| **state** | **String**|  | [enum: DRAFT, REVIEW, APPROVED, REJECTED] |
| **pageNum** | **Integer**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

