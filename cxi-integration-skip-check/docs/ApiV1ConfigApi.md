# ApiV1ConfigApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/ei*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteConfig**](ApiV1ConfigApi.md#deleteConfig) | **DELETE** /api/v1/config/{tenantId}/{domainId}/{configName} |  |
| [**getConfig**](ApiV1ConfigApi.md#getConfig) | **GET** /api/v1/config/{tenantId}/{domainId}/{configName} |  |
| [**updateConfig**](ApiV1ConfigApi.md#updateConfig) | **PUT** /api/v1/config/{tenantId}/{domainId} |  |
| [**validateCovisintConfig**](ApiV1ConfigApi.md#validateCovisintConfig) | **PUT** /api/v1/config/validate-covisint/{tenantId}/{domainId} |  |


<a id="deleteConfig"></a>
# **deleteConfig**
> GenericResponse deleteConfig(tenantId, domainId, configName)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiV1ConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/ei");

    ApiV1ConfigApi apiInstance = new ApiV1ConfigApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String domainId = "domainId_example"; // String | 
    String configName = "covisint"; // String | 
    try {
      GenericResponse result = apiInstance.deleteConfig(tenantId, domainId, configName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiV1ConfigApi#deleteConfig");
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
| **domainId** | **String**|  | |
| **configName** | **String**|  | [enum: covisint, custommetadata, cleanup, unknown] |

### Return type

[**GenericResponse**](GenericResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getConfig"></a>
# **getConfig**
> ExternalConfiguration getConfig(tenantId, domainId, configName)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiV1ConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/ei");

    ApiV1ConfigApi apiInstance = new ApiV1ConfigApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String domainId = "domainId_example"; // String | 
    String configName = "covisint"; // String | 
    try {
      ExternalConfiguration result = apiInstance.getConfig(tenantId, domainId, configName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiV1ConfigApi#getConfig");
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
| **domainId** | **String**|  | |
| **configName** | **String**|  | [enum: covisint, custommetadata, cleanup, unknown] |

### Return type

[**ExternalConfiguration**](ExternalConfiguration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateConfig"></a>
# **updateConfig**
> DataResponseExternalConfiguration updateConfig(tenantId, domainId, configFormat)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiV1ConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/ei");

    ApiV1ConfigApi apiInstance = new ApiV1ConfigApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String domainId = "domainId_example"; // String | 
    ConfigFormat configFormat = new ConfigFormat(); // ConfigFormat | 
    try {
      DataResponseExternalConfiguration result = apiInstance.updateConfig(tenantId, domainId, configFormat);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiV1ConfigApi#updateConfig");
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
| **domainId** | **String**|  | |
| **configFormat** | [**ConfigFormat**](ConfigFormat.md)|  | |

### Return type

[**DataResponseExternalConfiguration**](DataResponseExternalConfiguration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="validateCovisintConfig"></a>
# **validateCovisintConfig**
> DataResponseBoolean validateCovisintConfig(tenantId, domainId, requestBody)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiV1ConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/ei");

    ApiV1ConfigApi apiInstance = new ApiV1ConfigApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String domainId = "domainId_example"; // String | 
    Map<String, String> requestBody = new HashMap(); // Map<String, String> | 
    try {
      DataResponseBoolean result = apiInstance.validateCovisintConfig(tenantId, domainId, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiV1ConfigApi#validateCovisintConfig");
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
| **domainId** | **String**|  | |
| **requestBody** | [**Map&lt;String, String&gt;**](String.md)|  | |

### Return type

[**DataResponseBoolean**](DataResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

