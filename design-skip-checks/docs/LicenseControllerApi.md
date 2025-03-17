# LicenseControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getOTDSLicense**](LicenseControllerApi.md#getOTDSLicense) | **GET** /api/v1/licenses | Internal only. Get license information of a tenant. User must belong to a group having privileges to retrieve license information. |


<a id="getOTDSLicense"></a>
# **getOTDSLicense**
> RawDataResponse getOTDSLicense(domainId)

Internal only. Get license information of a tenant. User must belong to a group having privileges to retrieve license information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LicenseControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    LicenseControllerApi apiInstance = new LicenseControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | Retrieves license info based on the configuration of the current domain
    try {
      RawDataResponse result = apiInstance.getOTDSLicense(domainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicenseControllerApi#getOTDSLicense");
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
| **domainId** | **String**| Retrieves license info based on the configuration of the current domain | |

### Return type

[**RawDataResponse**](RawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

