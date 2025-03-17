# ManifestControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getManifestForCommunicationSet**](ManifestControllerApi.md#getManifestForCommunicationSet) | **GET** /api/v1/manifests/{domain}/communication-set/{communicationSetId} |  |
| [**getManifestForPackage**](ManifestControllerApi.md#getManifestForPackage) | **GET** /api/v1/manifests/{domain}/{packageId} |  |


<a id="getManifestForCommunicationSet"></a>
# **getManifestForCommunicationSet**
> Manifest getManifestForCommunicationSet(domain, communicationSetId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ManifestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ManifestControllerApi apiInstance = new ManifestControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID communicationSetId = UUID.randomUUID(); // UUID | 
    try {
      Manifest result = apiInstance.getManifestForCommunicationSet(domain, communicationSetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManifestControllerApi#getManifestForCommunicationSet");
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
| **communicationSetId** | **UUID**|  | |

### Return type

[**Manifest**](Manifest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getManifestForPackage"></a>
# **getManifestForPackage**
> Manifest getManifestForPackage(domain, packageId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ManifestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ManifestControllerApi apiInstance = new ManifestControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID packageId = UUID.randomUUID(); // UUID | 
    try {
      Manifest result = apiInstance.getManifestForPackage(domain, packageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManifestControllerApi#getManifestForPackage");
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
| **packageId** | **UUID**|  | |

### Return type

[**Manifest**](Manifest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

