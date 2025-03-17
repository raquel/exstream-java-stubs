# RationalizationReportControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/rationalizationApi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelOfflineJob**](RationalizationReportControllerApi.md#cancelOfflineJob) | **DELETE** /api/v1/rationalization/{domainId}/{msId} |  |
| [**cancelOfflineJob1**](RationalizationReportControllerApi.md#cancelOfflineJob1) | **DELETE** /api/v1/rationalization/{domainId}/{msId}/{implicit} |  |
| [**createCustomFragment**](RationalizationReportControllerApi.md#createCustomFragment) | **POST** /api/v1/rationalization/{domainId}/preview/{msId} |  |
| [**generateReportOffline**](RationalizationReportControllerApi.md#generateReportOffline) | **POST** /api/v1/rationalization/{domainId}/{msId} |  |
| [**generateReportOffline1**](RationalizationReportControllerApi.md#generateReportOffline1) | **POST** /api/v1/rationalization/{domainId}/{msId}/{implicit} |  |
| [**getCustomSuperSet**](RationalizationReportControllerApi.md#getCustomSuperSet) | **GET** /api/v1/rationalization/{domainId}/fragments/superset/{fragmentId} |  |
| [**getFragmentDetails**](RationalizationReportControllerApi.md#getFragmentDetails) | **GET** /api/v1/rationalization/{domainId}/fragments/details/{fragmentId} |  |
| [**getFragmentOrder**](RationalizationReportControllerApi.md#getFragmentOrder) | **GET** /api/v1/rationalization/{domainId}/fragments/order/{fragmentId} |  |
| [**getGroupFragment**](RationalizationReportControllerApi.md#getGroupFragment) | **GET** /api/v1/rationalization/{domainId}/fragments/groups/{fragmentId} |  |
| [**getMigrationSet**](RationalizationReportControllerApi.md#getMigrationSet) | **GET** /api/v1/rationalization/{domainId}/{msId} |  |
| [**getMigrationSet1**](RationalizationReportControllerApi.md#getMigrationSet1) | **GET** /api/v1/rationalization/{domainId}/{msId}/{implicit} |  |
| [**getOrginatedFragments**](RationalizationReportControllerApi.md#getOrginatedFragments) | **GET** /api/v1/rationalization/{domainId}/custom/fragments/{customFragmentId} |  |
| [**getRatMigrationSetDetails**](RationalizationReportControllerApi.md#getRatMigrationSetDetails) | **GET** /api/v1/rationalization/{domainId}/migrationset/{dasId} |  |
| [**getRationalisationRunResults**](RationalizationReportControllerApi.md#getRationalisationRunResults) | **GET** /api/v1/rationalization/{domainId}/report/{msId} |  |
| [**getRationalizationFragments**](RationalizationReportControllerApi.md#getRationalizationFragments) | **GET** /api/v1/rationalization/{domainId}/fragments/{msId} |  |
| [**getRootCustomFragmentId**](RationalizationReportControllerApi.md#getRootCustomFragmentId) | **GET** /api/v1/rationalization/{domainId}/custom/fragments/parent/{fragmentId} |  |
| [**getTemplateFragments**](RationalizationReportControllerApi.md#getTemplateFragments) | **GET** /api/v1/rationalization/{domainId}/template/fragments/{msId} |  |
| [**preview**](RationalizationReportControllerApi.md#preview) | **GET** /api/v1/rationalization/{domainId}/preview/{fragmentId} |  |
| [**updateCustomFragment**](RationalizationReportControllerApi.md#updateCustomFragment) | **PUT** /api/v1/rationalization/{domainId}/preview/{msId}/{customFragmentId} |  |
| [**updateFragment**](RationalizationReportControllerApi.md#updateFragment) | **PUT** /api/v1/rationalization/{domainId}/preview/{fragmentId} |  |


<a id="cancelOfflineJob"></a>
# **cancelOfflineJob**
> RationalizationResponseObject cancelOfflineJob(domainId, msId, implicit)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RationalizationReportControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    RationalizationReportControllerApi apiInstance = new RationalizationReportControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    UUID msId = UUID.randomUUID(); // UUID | 
    Boolean implicit = true; // Boolean | 
    try {
      RationalizationResponseObject result = apiInstance.cancelOfflineJob(domainId, msId, implicit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RationalizationReportControllerApi#cancelOfflineJob");
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
| **domainId** | **String**|  | |
| **msId** | **UUID**|  | |
| **implicit** | **Boolean**|  | |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="cancelOfflineJob1"></a>
# **cancelOfflineJob1**
> RationalizationResponseObject cancelOfflineJob1(domainId, msId, implicit)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RationalizationReportControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    RationalizationReportControllerApi apiInstance = new RationalizationReportControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    UUID msId = UUID.randomUUID(); // UUID | 
    Boolean implicit = true; // Boolean | 
    try {
      RationalizationResponseObject result = apiInstance.cancelOfflineJob1(domainId, msId, implicit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RationalizationReportControllerApi#cancelOfflineJob1");
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
| **domainId** | **String**|  | |
| **msId** | **UUID**|  | |
| **implicit** | **Boolean**|  | |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createCustomFragment"></a>
# **createCustomFragment**
> RationalizationResponseObject createCustomFragment(domainId, msId, customFragmentRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RationalizationReportControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    RationalizationReportControllerApi apiInstance = new RationalizationReportControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    UUID msId = UUID.randomUUID(); // UUID | 
    CustomFragmentRequest customFragmentRequest = new CustomFragmentRequest(); // CustomFragmentRequest | 
    try {
      RationalizationResponseObject result = apiInstance.createCustomFragment(domainId, msId, customFragmentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RationalizationReportControllerApi#createCustomFragment");
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
| **domainId** | **String**|  | |
| **msId** | **UUID**|  | |
| **customFragmentRequest** | [**CustomFragmentRequest**](CustomFragmentRequest.md)|  | |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="generateReportOffline"></a>
# **generateReportOffline**
> RationalizationResponseObject generateReportOffline(domainId, msId, implicit)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RationalizationReportControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    RationalizationReportControllerApi apiInstance = new RationalizationReportControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    UUID msId = UUID.randomUUID(); // UUID | 
    Boolean implicit = true; // Boolean | 
    try {
      RationalizationResponseObject result = apiInstance.generateReportOffline(domainId, msId, implicit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RationalizationReportControllerApi#generateReportOffline");
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
| **domainId** | **String**|  | |
| **msId** | **UUID**|  | |
| **implicit** | **Boolean**|  | |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="generateReportOffline1"></a>
# **generateReportOffline1**
> RationalizationResponseObject generateReportOffline1(domainId, msId, implicit)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RationalizationReportControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    RationalizationReportControllerApi apiInstance = new RationalizationReportControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    UUID msId = UUID.randomUUID(); // UUID | 
    Boolean implicit = true; // Boolean | 
    try {
      RationalizationResponseObject result = apiInstance.generateReportOffline1(domainId, msId, implicit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RationalizationReportControllerApi#generateReportOffline1");
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
| **domainId** | **String**|  | |
| **msId** | **UUID**|  | |
| **implicit** | **Boolean**|  | |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCustomSuperSet"></a>
# **getCustomSuperSet**
> RationalizationResponseObject getCustomSuperSet(domainId, fragmentId, request)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RationalizationReportControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    RationalizationReportControllerApi apiInstance = new RationalizationReportControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    UUID fragmentId = UUID.randomUUID(); // UUID | 
    CustomSuperSetRequest request = new CustomSuperSetRequest(); // CustomSuperSetRequest | 
    try {
      RationalizationResponseObject result = apiInstance.getCustomSuperSet(domainId, fragmentId, request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RationalizationReportControllerApi#getCustomSuperSet");
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
| **domainId** | **String**|  | |
| **fragmentId** | **UUID**|  | |
| **request** | [**CustomSuperSetRequest**](.md)|  | |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getFragmentDetails"></a>
# **getFragmentDetails**
> RationalizationResponseObject getFragmentDetails(domainId, fragmentId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RationalizationReportControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    RationalizationReportControllerApi apiInstance = new RationalizationReportControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    UUID fragmentId = UUID.randomUUID(); // UUID | 
    try {
      RationalizationResponseObject result = apiInstance.getFragmentDetails(domainId, fragmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RationalizationReportControllerApi#getFragmentDetails");
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
| **domainId** | **String**|  | |
| **fragmentId** | **UUID**|  | |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getFragmentOrder"></a>
# **getFragmentOrder**
> RationalizationResponseObject getFragmentOrder(domainId, fragmentId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RationalizationReportControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    RationalizationReportControllerApi apiInstance = new RationalizationReportControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    UUID fragmentId = UUID.randomUUID(); // UUID | 
    try {
      RationalizationResponseObject result = apiInstance.getFragmentOrder(domainId, fragmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RationalizationReportControllerApi#getFragmentOrder");
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
| **domainId** | **String**|  | |
| **fragmentId** | **UUID**|  | |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getGroupFragment"></a>
# **getGroupFragment**
> RationalizationResponseObject getGroupFragment(domainId, fragmentId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RationalizationReportControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    RationalizationReportControllerApi apiInstance = new RationalizationReportControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    UUID fragmentId = UUID.randomUUID(); // UUID | 
    try {
      RationalizationResponseObject result = apiInstance.getGroupFragment(domainId, fragmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RationalizationReportControllerApi#getGroupFragment");
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
| **domainId** | **String**|  | |
| **fragmentId** | **UUID**|  | |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMigrationSet"></a>
# **getMigrationSet**
> SseEmitter getMigrationSet(domainId, msId, implicit)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RationalizationReportControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    RationalizationReportControllerApi apiInstance = new RationalizationReportControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    UUID msId = UUID.randomUUID(); // UUID | 
    Boolean implicit = true; // Boolean | 
    try {
      SseEmitter result = apiInstance.getMigrationSet(domainId, msId, implicit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RationalizationReportControllerApi#getMigrationSet");
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
| **domainId** | **String**|  | |
| **msId** | **UUID**|  | |
| **implicit** | **Boolean**|  | |

### Return type

[**SseEmitter**](SseEmitter.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMigrationSet1"></a>
# **getMigrationSet1**
> SseEmitter getMigrationSet1(domainId, msId, implicit)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RationalizationReportControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    RationalizationReportControllerApi apiInstance = new RationalizationReportControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    UUID msId = UUID.randomUUID(); // UUID | 
    Boolean implicit = true; // Boolean | 
    try {
      SseEmitter result = apiInstance.getMigrationSet1(domainId, msId, implicit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RationalizationReportControllerApi#getMigrationSet1");
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
| **domainId** | **String**|  | |
| **msId** | **UUID**|  | |
| **implicit** | **Boolean**|  | |

### Return type

[**SseEmitter**](SseEmitter.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getOrginatedFragments"></a>
# **getOrginatedFragments**
> RationalizationResponseObject getOrginatedFragments(domainId, customFragmentId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RationalizationReportControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    RationalizationReportControllerApi apiInstance = new RationalizationReportControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    UUID customFragmentId = UUID.randomUUID(); // UUID | 
    try {
      RationalizationResponseObject result = apiInstance.getOrginatedFragments(domainId, customFragmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RationalizationReportControllerApi#getOrginatedFragments");
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
| **domainId** | **String**|  | |
| **customFragmentId** | **UUID**|  | |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getRatMigrationSetDetails"></a>
# **getRatMigrationSetDetails**
> RationalizationResponseObject getRatMigrationSetDetails(domainId, dasId, latestApproved)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RationalizationReportControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    RationalizationReportControllerApi apiInstance = new RationalizationReportControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    UUID dasId = UUID.randomUUID(); // UUID | 
    Boolean latestApproved = false; // Boolean | 
    try {
      RationalizationResponseObject result = apiInstance.getRatMigrationSetDetails(domainId, dasId, latestApproved);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RationalizationReportControllerApi#getRatMigrationSetDetails");
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
| **domainId** | **String**|  | |
| **dasId** | **UUID**|  | |
| **latestApproved** | **Boolean**|  | [optional] [default to false] |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getRationalisationRunResults"></a>
# **getRationalisationRunResults**
> RationalizationResponseObject getRationalisationRunResults(domainId, msId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RationalizationReportControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    RationalizationReportControllerApi apiInstance = new RationalizationReportControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    UUID msId = UUID.randomUUID(); // UUID | 
    try {
      RationalizationResponseObject result = apiInstance.getRationalisationRunResults(domainId, msId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RationalizationReportControllerApi#getRationalisationRunResults");
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
| **domainId** | **String**|  | |
| **msId** | **UUID**|  | |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getRationalizationFragments"></a>
# **getRationalizationFragments**
> RationalizationResponseObject getRationalizationFragments(domainId, msId, commType, resourcePackId, dasObjectType, offset, limit, orderby, filter)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RationalizationReportControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    RationalizationReportControllerApi apiInstance = new RationalizationReportControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    UUID msId = UUID.randomUUID(); // UUID | 
    String commType = "commType_example"; // String | 
    String resourcePackId = "resourcePackId_example"; // String | 
    List<String> dasObjectType = Arrays.asList(); // List<String> | 
    Integer offset = 0; // Integer | 
    Integer limit = 10; // Integer | 
    Object orderby = null; // Object | 
    RationalisationFilter filter = new RationalisationFilter(); // RationalisationFilter | 
    try {
      RationalizationResponseObject result = apiInstance.getRationalizationFragments(domainId, msId, commType, resourcePackId, dasObjectType, offset, limit, orderby, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RationalizationReportControllerApi#getRationalizationFragments");
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
| **domainId** | **String**|  | |
| **msId** | **UUID**|  | |
| **commType** | **String**|  | [optional] |
| **resourcePackId** | **String**|  | [optional] |
| **dasObjectType** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **limit** | **Integer**|  | [optional] [default to 10] |
| **orderby** | [**Object**](.md)|  | [optional] |
| **filter** | [**RationalisationFilter**](.md)|  | [optional] |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getRootCustomFragmentId"></a>
# **getRootCustomFragmentId**
> RationalizationResponseObject getRootCustomFragmentId(domainId, fragmentId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RationalizationReportControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    RationalizationReportControllerApi apiInstance = new RationalizationReportControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    UUID fragmentId = UUID.randomUUID(); // UUID | 
    try {
      RationalizationResponseObject result = apiInstance.getRootCustomFragmentId(domainId, fragmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RationalizationReportControllerApi#getRootCustomFragmentId");
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
| **domainId** | **String**|  | |
| **fragmentId** | **UUID**|  | |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTemplateFragments"></a>
# **getTemplateFragments**
> RationalizationResponseObject getTemplateFragments(domainId, msId, commType, resourcePackId, dasObjectType, offset, limit, orderby, filter)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RationalizationReportControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    RationalizationReportControllerApi apiInstance = new RationalizationReportControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    UUID msId = UUID.randomUUID(); // UUID | 
    String commType = "commType_example"; // String | 
    String resourcePackId = "resourcePackId_example"; // String | 
    List<String> dasObjectType = Arrays.asList(); // List<String> | 
    Integer offset = 0; // Integer | 
    Integer limit = 10; // Integer | 
    Object orderby = null; // Object | 
    RationalisationFilter filter = new RationalisationFilter(); // RationalisationFilter | 
    try {
      RationalizationResponseObject result = apiInstance.getTemplateFragments(domainId, msId, commType, resourcePackId, dasObjectType, offset, limit, orderby, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RationalizationReportControllerApi#getTemplateFragments");
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
| **domainId** | **String**|  | |
| **msId** | **UUID**|  | |
| **commType** | **String**|  | [optional] |
| **resourcePackId** | **String**|  | [optional] |
| **dasObjectType** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **limit** | **Integer**|  | [optional] [default to 10] |
| **orderby** | [**Object**](.md)|  | [optional] |
| **filter** | [**RationalisationFilter**](.md)|  | [optional] |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="preview"></a>
# **preview**
> Object preview(domainId, fragmentId, isFragmentPreview)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RationalizationReportControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    RationalizationReportControllerApi apiInstance = new RationalizationReportControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    UUID fragmentId = UUID.randomUUID(); // UUID | 
    Boolean isFragmentPreview = false; // Boolean | 
    try {
      Object result = apiInstance.preview(domainId, fragmentId, isFragmentPreview);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RationalizationReportControllerApi#preview");
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
| **domainId** | **String**|  | |
| **fragmentId** | **UUID**|  | |
| **isFragmentPreview** | **Boolean**|  | [optional] [default to false] |

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

<a id="updateCustomFragment"></a>
# **updateCustomFragment**
> RationalizationResponseObject updateCustomFragment(domainId, msId, customFragmentId, customFragmentRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RationalizationReportControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    RationalizationReportControllerApi apiInstance = new RationalizationReportControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    UUID msId = UUID.randomUUID(); // UUID | 
    UUID customFragmentId = UUID.randomUUID(); // UUID | 
    CustomFragmentRequest customFragmentRequest = new CustomFragmentRequest(); // CustomFragmentRequest | 
    try {
      RationalizationResponseObject result = apiInstance.updateCustomFragment(domainId, msId, customFragmentId, customFragmentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RationalizationReportControllerApi#updateCustomFragment");
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
| **domainId** | **String**|  | |
| **msId** | **UUID**|  | |
| **customFragmentId** | **UUID**|  | |
| **customFragmentRequest** | [**CustomFragmentRequest**](CustomFragmentRequest.md)|  | |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateFragment"></a>
# **updateFragment**
> Object updateFragment(domainId, fragmentId, fragmentRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RationalizationReportControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    RationalizationReportControllerApi apiInstance = new RationalizationReportControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    UUID fragmentId = UUID.randomUUID(); // UUID | 
    FragmentRequest fragmentRequest = new FragmentRequest(); // FragmentRequest | 
    try {
      Object result = apiInstance.updateFragment(domainId, fragmentId, fragmentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RationalizationReportControllerApi#updateFragment");
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
| **domainId** | **String**|  | |
| **fragmentId** | **UUID**|  | |
| **fragmentRequest** | [**FragmentRequest**](FragmentRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

