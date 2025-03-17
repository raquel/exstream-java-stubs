# ApiV1InternalApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/ei*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getConfigs**](ApiV1InternalApi.md#getConfigs) | **GET** /api/v1/internal/{eventType} |  |
| [**updateProcessingState**](ApiV1InternalApi.md#updateProcessingState) | **PUT** /api/v1/internal/{tenantId}/{domainId}/state |  |


<a id="getConfigs"></a>
# **getConfigs**
> PageResponseMessage getConfigs(eventType, offset, count)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiV1InternalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/ei");

    ApiV1InternalApi apiInstance = new ApiV1InternalApi(defaultClient);
    String eventType = "emailevent"; // String | 
    Integer offset = 0; // Integer | For pagination, fetch entities after this many
    Integer count = 1000; // Integer | For pagination, the number of entities per page
    try {
      PageResponseMessage result = apiInstance.getConfigs(eventType, offset, count);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiV1InternalApi#getConfigs");
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
| **eventType** | **String**|  | [enum: emailevent, covisint, custommetadata, cleanup] |
| **offset** | **Integer**| For pagination, fetch entities after this many | [optional] |
| **count** | **Integer**| For pagination, the number of entities per page | [optional] |

### Return type

[**PageResponseMessage**](PageResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateProcessingState"></a>
# **updateProcessingState**
> DataResponseExternalConfiguration updateProcessingState(tenantId, domainId, processState)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiV1InternalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/ei");

    ApiV1InternalApi apiInstance = new ApiV1InternalApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String domainId = "domainId_example"; // String | 
    ProcessState processState = new ProcessState(); // ProcessState | 
    try {
      DataResponseExternalConfiguration result = apiInstance.updateProcessingState(tenantId, domainId, processState);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiV1InternalApi#updateProcessingState");
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
| **processState** | [**ProcessState**](ProcessState.md)|  | |

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

