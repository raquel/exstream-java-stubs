# EngineRunDefControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create1**](EngineRunDefControllerApi.md#create1) | **POST** /api/v1/run-definitions/{domain}/template/{templateId} |  |
| [**getAvailableEngines**](EngineRunDefControllerApi.md#getAvailableEngines) | **GET** /api/v1/run-definitions/{domain}/engines |  |
| [**getDefForPreview**](EngineRunDefControllerApi.md#getDefForPreview) | **GET** /api/v1/run-definitions/{domain}/preview/{id} |  |
| [**getDefaultEngine**](EngineRunDefControllerApi.md#getDefaultEngine) | **GET** /api/v1/run-definitions/{domain}/engine/default |  |
| [**getNamedEngine**](EngineRunDefControllerApi.md#getNamedEngine) | **GET** /api/v1/run-definitions/{domain}/engine |  |
| [**setEngineAsDefault**](EngineRunDefControllerApi.md#setEngineAsDefault) | **PUT** /api/v1/run-definitions/{domain}/engine/{id} |  |


<a id="create1"></a>
# **create1**
> RunDef create1(domain, templateId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EngineRunDefControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    EngineRunDefControllerApi apiInstance = new EngineRunDefControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID templateId = UUID.randomUUID(); // UUID | 
    try {
      RunDef result = apiInstance.create1(domain, templateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EngineRunDefControllerApi#create1");
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
| **templateId** | **UUID**|  | |

### Return type

[**RunDef**](RunDef.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAvailableEngines"></a>
# **getAvailableEngines**
> PageResponseResourceVersion getAvailableEngines(domain)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EngineRunDefControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    EngineRunDefControllerApi apiInstance = new EngineRunDefControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    try {
      PageResponseResourceVersion result = apiInstance.getAvailableEngines(domain);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EngineRunDefControllerApi#getAvailableEngines");
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

<a id="getDefForPreview"></a>
# **getDefForPreview**
> RunDef getDefForPreview(domain, id, useApprovedTemplate)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EngineRunDefControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    EngineRunDefControllerApi apiInstance = new EngineRunDefControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    Boolean useApprovedTemplate = true; // Boolean | 
    try {
      RunDef result = apiInstance.getDefForPreview(domain, id, useApprovedTemplate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EngineRunDefControllerApi#getDefForPreview");
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
| **useApprovedTemplate** | **Boolean**|  | [optional] |

### Return type

[**RunDef**](RunDef.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDefaultEngine"></a>
# **getDefaultEngine**
> DataResponseResourceVersion getDefaultEngine(domain, encoding)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EngineRunDefControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    EngineRunDefControllerApi apiInstance = new EngineRunDefControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    String encoding = "DBCS"; // String | 
    try {
      DataResponseResourceVersion result = apiInstance.getDefaultEngine(domain, encoding);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EngineRunDefControllerApi#getDefaultEngine");
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
| **encoding** | **String**|  | |

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

<a id="getNamedEngine"></a>
# **getNamedEngine**
> DataResponseResourceVersion getNamedEngine(domain, engineName, encoding)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EngineRunDefControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    EngineRunDefControllerApi apiInstance = new EngineRunDefControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    String engineName = "ProdEngine"; // String | 
    String encoding = "DBCS"; // String | 
    try {
      DataResponseResourceVersion result = apiInstance.getNamedEngine(domain, engineName, encoding);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EngineRunDefControllerApi#getNamedEngine");
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
| **engineName** | **String**|  | |
| **encoding** | **String**|  | [optional] |

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

<a id="setEngineAsDefault"></a>
# **setEngineAsDefault**
> DataResponseResourceVersion setEngineAsDefault(domain, id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EngineRunDefControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    EngineRunDefControllerApi apiInstance = new EngineRunDefControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      DataResponseResourceVersion result = apiInstance.setEngineAsDefault(domain, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EngineRunDefControllerApi#setEngineAsDefault");
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

