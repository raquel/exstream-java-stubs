# FlowModelControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/orchestration*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**isDeletable**](FlowModelControllerApi.md#isDeletable) | **GET** /api/v1/flow-models/{domain}/{flowModelId}/deletable | Says whether this flow model can be safely deleted |
| [**listPublished**](FlowModelControllerApi.md#listPublished) | **GET** /api/v1/flow-models/{domain}/published | List published flow models |
| [**publish**](FlowModelControllerApi.md#publish) | **POST** /api/v1/flow-models/{domain}/{flowModelId}/publish | Publish flow model |
| [**unpublish**](FlowModelControllerApi.md#unpublish) | **POST** /api/v1/flow-models/{domain}/{flowModelId}/unpublish | Unpublish flow model |
| [**unpublish1**](FlowModelControllerApi.md#unpublish1) | **POST** /api/v1/flow-models/{domain}/unpublish | Unpublish list of flow models |


<a id="isDeletable"></a>
# **isDeletable**
> DataResponseDeletableResource isDeletable(domain, flowModelId, version)

Says whether this flow model can be safely deleted

It will not be deletable if it is published in at least one domain, maybe one to which the user has no access

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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    FlowModelControllerApi apiInstance = new FlowModelControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    UUID flowModelId = UUID.randomUUID(); // UUID | Flow model id
    Integer version = 56; // Integer | Specify version (optional). If omitted, any version will match.
    try {
      DataResponseDeletableResource result = apiInstance.isDeletable(domain, flowModelId, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowModelControllerApi#isDeletable");
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
| **domain** | **String**| Domain id | |
| **flowModelId** | **UUID**| Flow model id | |
| **version** | **Integer**| Specify version (optional). If omitted, any version will match. | [optional] |

### Return type

[**DataResponseDeletableResource**](DataResponseDeletableResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Says whether the flow model can be safely deleted or not |  -  |

<a id="listPublished"></a>
# **listPublished**
> ListResponseTenantFlowmodel listPublished(domain)

List published flow models

Get a list of current published flow models in this orchestration runtime environment context.&lt;br /&gt;&lt;b&gt;Version 20.4.0:&lt;/b&gt; Flow model &#39;&lt;i&gt;version&lt;/i&gt;&#39; property changed from datatype string to integer in response body.

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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    FlowModelControllerApi apiInstance = new FlowModelControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    try {
      ListResponseTenantFlowmodel result = apiInstance.listPublished(domain);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowModelControllerApi#listPublished");
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
| **domain** | **String**| Domain id | |

### Return type

[**ListResponseTenantFlowmodel**](ListResponseTenantFlowmodel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of published flow models, the list may be empty |  -  |

<a id="publish"></a>
# **publish**
> DataResponseTenantFlowmodel publish(domain, flowModelId, version)

Publish flow model

Publish specified flow model version to orchestration runtime environment. &lt;br /&gt;&lt;b&gt;Version 20.4.0:&lt;/b&gt; Flow model &#39;&lt;i&gt;version&lt;/i&gt;&#39; property changed from datatype string to integer in response body.

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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    FlowModelControllerApi apiInstance = new FlowModelControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    UUID flowModelId = UUID.randomUUID(); // UUID | Flow model id
    Integer version = 56; // Integer | Specify version (optional). If omitted, latest version will be published.
    try {
      DataResponseTenantFlowmodel result = apiInstance.publish(domain, flowModelId, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowModelControllerApi#publish");
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
| **domain** | **String**| Domain id | |
| **flowModelId** | **UUID**| Flow model id | |
| **version** | **Integer**| Specify version (optional). If omitted, latest version will be published. | [optional] |

### Return type

[**DataResponseTenantFlowmodel**](DataResponseTenantFlowmodel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Flow model published successfully |  -  |
| **400** | Bad request |  -  |
| **404** | Flow model not found |  -  |

<a id="unpublish"></a>
# **unpublish**
> GenericResponse unpublish(domain, flowModelId, version)

Unpublish flow model

Unpublish specified flow model version from orchestration runtime environment. 

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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    FlowModelControllerApi apiInstance = new FlowModelControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    UUID flowModelId = UUID.randomUUID(); // UUID | Flow model id
    Integer version = 56; // Integer | Specify version (optional). If omitted, latest version will be unpublished.
    try {
      GenericResponse result = apiInstance.unpublish(domain, flowModelId, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowModelControllerApi#unpublish");
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
| **domain** | **String**| Domain id | |
| **flowModelId** | **UUID**| Flow model id | |
| **version** | **Integer**| Specify version (optional). If omitted, latest version will be unpublished. | [optional] |

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
| **200** | Flow model published successfully |  -  |
| **400** | Bad request |  -  |
| **404** | Flow model not found |  -  |

<a id="unpublish1"></a>
# **unpublish1**
> GenericResponse unpublish1(domain, flowObjectsRequest)

Unpublish list of flow models

Unpublish specified flow models version from orchestration runtime environment. 

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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    FlowModelControllerApi apiInstance = new FlowModelControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    FlowObjectsRequest flowObjectsRequest = new FlowObjectsRequest(); // FlowObjectsRequest | 
    try {
      GenericResponse result = apiInstance.unpublish1(domain, flowObjectsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowModelControllerApi#unpublish1");
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
| **domain** | **String**| Domain id | |
| **flowObjectsRequest** | [**FlowObjectsRequest**](FlowObjectsRequest.md)|  | |

### Return type

[**GenericResponse**](GenericResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |

