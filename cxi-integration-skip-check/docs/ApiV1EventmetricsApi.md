# ApiV1EventmetricsApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/ei*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCustomMetadataEvents**](ApiV1EventmetricsApi.md#getCustomMetadataEvents) | **GET** /api/v1/eventmetrics/docgen-event/{tenantId}/{domainId}/{flowStepId}/metadata |  |
| [**getDocgenReport**](ApiV1EventmetricsApi.md#getDocgenReport) | **GET** /api/v1/eventmetrics/docgen-event/{tenantId}/{domainId} |  |
| [**getEmailEvents**](ApiV1EventmetricsApi.md#getEmailEvents) | **GET** /api/v1/eventmetrics/email-event/{tenantId}/{domainId}/content |  |
| [**getEmaileventReport**](ApiV1EventmetricsApi.md#getEmaileventReport) | **GET** /api/v1/eventmetrics/email-event/{tenantId}/{domainId} |  |
| [**getEvents**](ApiV1EventmetricsApi.md#getEvents) | **GET** /api/v1/eventmetrics/events/{tenantId}/{domainId}/content |  |
| [**getEventsReport**](ApiV1EventmetricsApi.md#getEventsReport) | **GET** /api/v1/eventmetrics/events/{tenantId}/{domainId} |  |
| [**getProcessingStateEmaileventReport**](ApiV1EventmetricsApi.md#getProcessingStateEmaileventReport) | **GET** /api/v1/eventmetrics/email-event/{tenantId}/{domainId}/states |  |
| [**getProcessingStatesEvents**](ApiV1EventmetricsApi.md#getProcessingStatesEvents) | **GET** /api/v1/eventmetrics/docgen-event/{tenantId}/{domainId}/states |  |


<a id="getCustomMetadataEvents"></a>
# **getCustomMetadataEvents**
> DataResponseListEvents getCustomMetadataEvents(tenantId, domainId, flowStepId, communicationId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiV1EventmetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/ei");

    ApiV1EventmetricsApi apiInstance = new ApiV1EventmetricsApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String domainId = "domainId_example"; // String | 
    String flowStepId = "flowStepId_example"; // String | 
    String communicationId = "communicationId_example"; // String | 
    try {
      DataResponseListEvents result = apiInstance.getCustomMetadataEvents(tenantId, domainId, flowStepId, communicationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiV1EventmetricsApi#getCustomMetadataEvents");
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
| **flowStepId** | **String**|  | |
| **communicationId** | **String**|  | [optional] |

### Return type

[**DataResponseListEvents**](DataResponseListEvents.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDocgenReport"></a>
# **getDocgenReport**
> DataResponseLong getDocgenReport(tenantId, domainId, processingState, lastUpdateTimeStart, lastUpdateTimeEnd)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiV1EventmetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/ei");

    ApiV1EventmetricsApi apiInstance = new ApiV1EventmetricsApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String domainId = "domainId_example"; // String | 
    Integer processingState = 56; // Integer | 
    OffsetDateTime lastUpdateTimeStart = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime lastUpdateTimeEnd = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      DataResponseLong result = apiInstance.getDocgenReport(tenantId, domainId, processingState, lastUpdateTimeStart, lastUpdateTimeEnd);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiV1EventmetricsApi#getDocgenReport");
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
| **processingState** | **Integer**|  | [optional] |
| **lastUpdateTimeStart** | **OffsetDateTime**|  | [optional] |
| **lastUpdateTimeEnd** | **OffsetDateTime**|  | [optional] |

### Return type

[**DataResponseLong**](DataResponseLong.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailEvents"></a>
# **getEmailEvents**
> DataResponseListEmailevent getEmailEvents(tenantId, domainId, connectorType, lastUpdateTimeStart, lastUpdateTimeEnd)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiV1EventmetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/ei");

    ApiV1EventmetricsApi apiInstance = new ApiV1EventmetricsApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String domainId = "domainId_example"; // String | 
    String connectorType = "connectorType_example"; // String | 
    OffsetDateTime lastUpdateTimeStart = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime lastUpdateTimeEnd = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      DataResponseListEmailevent result = apiInstance.getEmailEvents(tenantId, domainId, connectorType, lastUpdateTimeStart, lastUpdateTimeEnd);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiV1EventmetricsApi#getEmailEvents");
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
| **connectorType** | **String**|  | |
| **lastUpdateTimeStart** | **OffsetDateTime**|  | [optional] |
| **lastUpdateTimeEnd** | **OffsetDateTime**|  | [optional] |

### Return type

[**DataResponseListEmailevent**](DataResponseListEmailevent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmaileventReport"></a>
# **getEmaileventReport**
> DataResponseLong getEmaileventReport(tenantId, domainId, connectorType, processingState, lastUpdateTimeStart, lastUpdateTimeEnd)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiV1EventmetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/ei");

    ApiV1EventmetricsApi apiInstance = new ApiV1EventmetricsApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String domainId = "domainId_example"; // String | 
    String connectorType = "connectorType_example"; // String | 
    Integer processingState = 56; // Integer | 
    OffsetDateTime lastUpdateTimeStart = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime lastUpdateTimeEnd = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      DataResponseLong result = apiInstance.getEmaileventReport(tenantId, domainId, connectorType, processingState, lastUpdateTimeStart, lastUpdateTimeEnd);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiV1EventmetricsApi#getEmaileventReport");
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
| **connectorType** | **String**|  | |
| **processingState** | **Integer**|  | [optional] |
| **lastUpdateTimeStart** | **OffsetDateTime**|  | [optional] |
| **lastUpdateTimeEnd** | **OffsetDateTime**|  | [optional] |

### Return type

[**DataResponseLong**](DataResponseLong.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEvents"></a>
# **getEvents**
> DataResponseListEvents getEvents(tenantId, domainId, eventType, lastUpdateTimeStart, lastUpdateTimeEnd)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiV1EventmetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/ei");

    ApiV1EventmetricsApi apiInstance = new ApiV1EventmetricsApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String domainId = "domainId_example"; // String | 
    Integer eventType = 56; // Integer | 
    OffsetDateTime lastUpdateTimeStart = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime lastUpdateTimeEnd = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      DataResponseListEvents result = apiInstance.getEvents(tenantId, domainId, eventType, lastUpdateTimeStart, lastUpdateTimeEnd);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiV1EventmetricsApi#getEvents");
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
| **eventType** | **Integer**|  | [optional] |
| **lastUpdateTimeStart** | **OffsetDateTime**|  | [optional] |
| **lastUpdateTimeEnd** | **OffsetDateTime**|  | [optional] |

### Return type

[**DataResponseListEvents**](DataResponseListEvents.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEventsReport"></a>
# **getEventsReport**
> DataResponseLong getEventsReport(tenantId, domainId, lastUpdateTimeStart, lastUpdateTimeEnd)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiV1EventmetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/ei");

    ApiV1EventmetricsApi apiInstance = new ApiV1EventmetricsApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String domainId = "domainId_example"; // String | 
    OffsetDateTime lastUpdateTimeStart = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime lastUpdateTimeEnd = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      DataResponseLong result = apiInstance.getEventsReport(tenantId, domainId, lastUpdateTimeStart, lastUpdateTimeEnd);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiV1EventmetricsApi#getEventsReport");
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
| **lastUpdateTimeStart** | **OffsetDateTime**|  | [optional] |
| **lastUpdateTimeEnd** | **OffsetDateTime**|  | [optional] |

### Return type

[**DataResponseLong**](DataResponseLong.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getProcessingStateEmaileventReport"></a>
# **getProcessingStateEmaileventReport**
> DataResponseLong getProcessingStateEmaileventReport(tenantId, domainId, connectorType, processingStates, lastUpdateTimeStart, lastUpdateTimeEnd)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiV1EventmetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/ei");

    ApiV1EventmetricsApi apiInstance = new ApiV1EventmetricsApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String domainId = "domainId_example"; // String | 
    String connectorType = "connectorType_example"; // String | 
    List<Integer> processingStates = Arrays.asList(); // List<Integer> | 
    OffsetDateTime lastUpdateTimeStart = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime lastUpdateTimeEnd = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      DataResponseLong result = apiInstance.getProcessingStateEmaileventReport(tenantId, domainId, connectorType, processingStates, lastUpdateTimeStart, lastUpdateTimeEnd);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiV1EventmetricsApi#getProcessingStateEmaileventReport");
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
| **connectorType** | **String**|  | |
| **processingStates** | [**List&lt;Integer&gt;**](Integer.md)|  | |
| **lastUpdateTimeStart** | **OffsetDateTime**|  | [optional] |
| **lastUpdateTimeEnd** | **OffsetDateTime**|  | [optional] |

### Return type

[**DataResponseLong**](DataResponseLong.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getProcessingStatesEvents"></a>
# **getProcessingStatesEvents**
> DataResponseListEvents getProcessingStatesEvents(tenantId, domainId, processingStates, lastUpdateTimeStart, lastUpdateTimeEnd)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiV1EventmetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/ei");

    ApiV1EventmetricsApi apiInstance = new ApiV1EventmetricsApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String domainId = "domainId_example"; // String | 
    List<Integer> processingStates = Arrays.asList(); // List<Integer> | 
    OffsetDateTime lastUpdateTimeStart = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime lastUpdateTimeEnd = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      DataResponseListEvents result = apiInstance.getProcessingStatesEvents(tenantId, domainId, processingStates, lastUpdateTimeStart, lastUpdateTimeEnd);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiV1EventmetricsApi#getProcessingStatesEvents");
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
| **processingStates** | [**List&lt;Integer&gt;**](Integer.md)|  | |
| **lastUpdateTimeStart** | **OffsetDateTime**|  | [optional] |
| **lastUpdateTimeEnd** | **OffsetDateTime**|  | [optional] |

### Return type

[**DataResponseListEvents**](DataResponseListEvents.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

