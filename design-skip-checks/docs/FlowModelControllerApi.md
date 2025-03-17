# FlowModelControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listChannelMappings**](FlowModelControllerApi.md#listChannelMappings) | **GET** /api/v1/flow-models/{domain}/channelmappings | Internal only. Do not use! Will likely be removed in the next release! Get list of channels and their associated outcome mappings and the referenced full outcome mappings |
| [**listCommunications**](FlowModelControllerApi.md#listCommunications) | **GET** /api/v1/flow-models/{domain}/communications | Get list of flow model communications |
| [**listMappings**](FlowModelControllerApi.md#listMappings) | **GET** /api/v1/flow-models/{domain}/mappings | Get list of outcome mappings |
| [**listNodes**](FlowModelControllerApi.md#listNodes) | **GET** /api/v1/flow-models/{domain}/nodes | Get list of flow model nodes |


<a id="listChannelMappings"></a>
# **listChannelMappings**
> DataResponseFlowContextOutputChannelMappingsResponse listChannelMappings(domainId)

Internal only. Do not use! Will likely be removed in the next release! Get list of channels and their associated outcome mappings and the referenced full outcome mappings

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowModelControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    FlowModelControllerApi apiInstance = new FlowModelControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    try {
      DataResponseFlowContextOutputChannelMappingsResponse result = apiInstance.listChannelMappings(domainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowModelControllerApi#listChannelMappings");
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

### Return type

[**DataResponseFlowContextOutputChannelMappingsResponse**](DataResponseFlowContextOutputChannelMappingsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listCommunications"></a>
# **listCommunications**
> List&lt;Node&gt; listCommunications(domainId, requestFilter)

Get list of flow model communications

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowModelControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    FlowModelControllerApi apiInstance = new FlowModelControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    NodeFilterRequest requestFilter = new NodeFilterRequest(); // NodeFilterRequest | 
    try {
      List<Node> result = apiInstance.listCommunications(domainId, requestFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowModelControllerApi#listCommunications");
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
| **requestFilter** | [**NodeFilterRequest**](.md)|  | |

### Return type

[**List&lt;Node&gt;**](Node.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listMappings"></a>
# **listMappings**
> listMappings(domainId, filterForAMappingSetWithASpecificGivenName, returnMappingAssociatedToGivenChannelName)

Get list of outcome mappings

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowModelControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    FlowModelControllerApi apiInstance = new FlowModelControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    String filterForAMappingSetWithASpecificGivenName = "filterForAMappingSetWithASpecificGivenName_example"; // String | 
    String returnMappingAssociatedToGivenChannelName = "returnMappingAssociatedToGivenChannelName_example"; // String | 
    try {
      apiInstance.listMappings(domainId, filterForAMappingSetWithASpecificGivenName, returnMappingAssociatedToGivenChannelName);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowModelControllerApi#listMappings");
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
| **filterForAMappingSetWithASpecificGivenName** | **String**|  | [optional] |
| **returnMappingAssociatedToGivenChannelName** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | A filter for an outcome mapping or channel name was specified but nothing was found. |  -  |

<a id="listNodes"></a>
# **listNodes**
> List&lt;Node&gt; listNodes(domainId, requestFilter)

Get list of flow model nodes

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowModelControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    FlowModelControllerApi apiInstance = new FlowModelControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    NodeFilterRequest requestFilter = new NodeFilterRequest(); // NodeFilterRequest | 
    try {
      List<Node> result = apiInstance.listNodes(domainId, requestFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowModelControllerApi#listNodes");
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
| **requestFilter** | [**NodeFilterRequest**](.md)|  | |

### Return type

[**List&lt;Node&gt;**](Node.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

