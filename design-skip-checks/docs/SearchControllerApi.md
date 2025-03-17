# SearchControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](SearchControllerApi.md#create) | **POST** /api/v1/search/create/{tenantId} |  |
| [**delete**](SearchControllerApi.md#delete) | **DELETE** /api/v1/search/{tenantId} |  |
| [**healthCheck**](SearchControllerApi.md#healthCheck) | **GET** /api/v1/search/healthCheck |  |
| [**healthCheck1**](SearchControllerApi.md#healthCheck1) | **GET** /api/v1/search/healthCheck/{tenantId} |  |
| [**indexResources**](SearchControllerApi.md#indexResources) | **POST** /api/v1/search/indexAll/{tenantId} |  |
| [**search**](SearchControllerApi.md#search) | **GET** /api/v1/search/{domain} |  |


<a id="create"></a>
# **create**
> DataResponseSolrCollection create(tenantId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    SearchControllerApi apiInstance = new SearchControllerApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    try {
      DataResponseSolrCollection result = apiInstance.create(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchControllerApi#create");
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
| **tenantId** | **String**|  | |

### Return type

[**DataResponseSolrCollection**](DataResponseSolrCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="delete"></a>
# **delete**
> DataResponseSolrCollection delete(tenantId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    SearchControllerApi apiInstance = new SearchControllerApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    try {
      DataResponseSolrCollection result = apiInstance.delete(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchControllerApi#delete");
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
| **tenantId** | **String**|  | |

### Return type

[**DataResponseSolrCollection**](DataResponseSolrCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="healthCheck"></a>
# **healthCheck**
> String healthCheck()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    SearchControllerApi apiInstance = new SearchControllerApi(defaultClient);
    try {
      String result = apiInstance.healthCheck();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchControllerApi#healthCheck");
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

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="healthCheck1"></a>
# **healthCheck1**
> String healthCheck1(tenantId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    SearchControllerApi apiInstance = new SearchControllerApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    try {
      String result = apiInstance.healthCheck1(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchControllerApi#healthCheck1");
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
| **tenantId** | **String**|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="indexResources"></a>
# **indexResources**
> indexResources(tenantId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    SearchControllerApi apiInstance = new SearchControllerApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    try {
      apiInstance.indexResources(tenantId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchControllerApi#indexResources");
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
| **tenantId** | **String**|  | |

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

<a id="search"></a>
# **search**
> PageResponseResourceVersion search(domain, requestFilter, lockedBy, fetchPermissions, fetchCategories, fetchVariants, fetchApproval)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    SearchControllerApi apiInstance = new SearchControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    ResourceFilterRequest requestFilter = new ResourceFilterRequest(); // ResourceFilterRequest | 
    String lockedBy = "lockedBy_example"; // String | 
    Boolean fetchPermissions = false; // Boolean | 
    Boolean fetchCategories = false; // Boolean | 
    Boolean fetchVariants = false; // Boolean | 
    Boolean fetchApproval = false; // Boolean | 
    try {
      PageResponseResourceVersion result = apiInstance.search(domain, requestFilter, lockedBy, fetchPermissions, fetchCategories, fetchVariants, fetchApproval);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchControllerApi#search");
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
| **requestFilter** | [**ResourceFilterRequest**](.md)|  | |
| **lockedBy** | **String**|  | [optional] |
| **fetchPermissions** | **Boolean**|  | [optional] [default to false] |
| **fetchCategories** | **Boolean**|  | [optional] [default to false] |
| **fetchVariants** | **Boolean**|  | [optional] [default to false] |
| **fetchApproval** | **Boolean**|  | [optional] [default to false] |

### Return type

[**PageResponseResourceVersion**](PageResponseResourceVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

