# ExportControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exportAllResourcesFromDomain**](ExportControllerApi.md#exportAllResourcesFromDomain) | **POST** /api/v1/export/{domain} |  |
| [**exportAllResourcesFromDomain1**](ExportControllerApi.md#exportAllResourcesFromDomain1) | **GET** /api/v1/export/{domain} |  |
| [**exportResourcesFromRootInDomain**](ExportControllerApi.md#exportResourcesFromRootInDomain) | **POST** /api/v1/export/{domain}/{rootId} |  |
| [**exportResourcesFromRootInDomain1**](ExportControllerApi.md#exportResourcesFromRootInDomain1) | **GET** /api/v1/export/{domain}/{rootId} |  |
| [**generateResourceGraph**](ExportControllerApi.md#generateResourceGraph) | **GET** /api/v1/export/{domain}/resource-graph |  |
| [**generateResourceGraph1**](ExportControllerApi.md#generateResourceGraph1) | **GET** /api/v1/export/{domain}/resource-graph/{rootId} |  |


<a id="exportAllResourcesFromDomain"></a>
# **exportAllResourcesFromDomain**
> exportAllResourcesFromDomain(domain, exportRequest)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ExportControllerApi apiInstance = new ExportControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    ExportRequest exportRequest = new ExportRequest(); // ExportRequest | 
    try {
      apiInstance.exportAllResourcesFromDomain(domain, exportRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportControllerApi#exportAllResourcesFromDomain");
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
| **exportRequest** | [**ExportRequest**](ExportRequest.md)|  | |

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

<a id="exportAllResourcesFromDomain1"></a>
# **exportAllResourcesFromDomain1**
> exportAllResourcesFromDomain1(domain, versions)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ExportControllerApi apiInstance = new ExportControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    String versions = "ALL"; // String | 
    try {
      apiInstance.exportAllResourcesFromDomain1(domain, versions);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportControllerApi#exportAllResourcesFromDomain1");
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
| **versions** | **String**|  | [optional] [default to LATEST_APPROVED] [enum: ALL, LATEST_APPROVED, LATEST] |

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
> exportResourcesFromRootInDomain(domain, rootId, exportRequest)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ExportControllerApi apiInstance = new ExportControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID rootId = UUID.randomUUID(); // UUID | 
    ExportRequest exportRequest = new ExportRequest(); // ExportRequest | 
    try {
      apiInstance.exportResourcesFromRootInDomain(domain, rootId, exportRequest);
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
| **rootId** | **UUID**|  | |
| **exportRequest** | [**ExportRequest**](ExportRequest.md)|  | |

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

<a id="exportResourcesFromRootInDomain1"></a>
# **exportResourcesFromRootInDomain1**
> exportResourcesFromRootInDomain1(domain, rootId, versions)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ExportControllerApi apiInstance = new ExportControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID rootId = UUID.randomUUID(); // UUID | 
    String versions = "ALL"; // String | 
    try {
      apiInstance.exportResourcesFromRootInDomain1(domain, rootId, versions);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportControllerApi#exportResourcesFromRootInDomain1");
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
| **rootId** | **UUID**|  | |
| **versions** | **String**|  | [optional] [default to LATEST_APPROVED] [enum: ALL, LATEST_APPROVED, LATEST] |

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

<a id="generateResourceGraph"></a>
# **generateResourceGraph**
> generateResourceGraph(domain, nodeFormat, expandSystemResources)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ExportControllerApi apiInstance = new ExportControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    String nodeFormat = "nodeFormat_example"; // String | 
    Boolean expandSystemResources = true; // Boolean | 
    try {
      apiInstance.generateResourceGraph(domain, nodeFormat, expandSystemResources);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportControllerApi#generateResourceGraph");
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
| **nodeFormat** | **String**|  | [optional] |
| **expandSystemResources** | **Boolean**|  | [optional] |

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

<a id="generateResourceGraph1"></a>
# **generateResourceGraph1**
> generateResourceGraph1(domain, rootId, nodeFormat, expandSystemResources)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ExportControllerApi apiInstance = new ExportControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID rootId = UUID.randomUUID(); // UUID | Resource id of the 'top' of the resource tree
    String nodeFormat = "nodeFormat_example"; // String | 
    Boolean expandSystemResources = true; // Boolean | 
    try {
      apiInstance.generateResourceGraph1(domain, rootId, nodeFormat, expandSystemResources);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportControllerApi#generateResourceGraph1");
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
| **rootId** | **UUID**| Resource id of the &#39;top&#39; of the resource tree | |
| **nodeFormat** | **String**|  | [optional] |
| **expandSystemResources** | **Boolean**|  | [optional] |

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

