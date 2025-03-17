# FlowModelContextControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/orchestration*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFilteredContexts**](FlowModelContextControllerApi.md#getFilteredContexts) | **GET** /api/v1/flow-model-contexts/{domain} | Filter published flow contexts |
| [**getPublished**](FlowModelContextControllerApi.md#getPublished) | **GET** /api/v1/flow-model-contexts/{domain}/published/{flowModelContextId} | Get published flow context content |
| [**isDeletable1**](FlowModelContextControllerApi.md#isDeletable1) | **GET** /api/v1/flow-model-contexts/{domain}/{flowContextId}/deletable | Says whether this flow context can be safely deleted |
| [**listPublished1**](FlowModelContextControllerApi.md#listPublished1) | **GET** /api/v1/flow-model-contexts/{domain}/published | List published flow contexts |
| [**publish1**](FlowModelContextControllerApi.md#publish1) | **POST** /api/v1/flow-model-contexts/{domain}/{flowModelContextId}/publish | Publish flow context |
| [**unpublish2**](FlowModelContextControllerApi.md#unpublish2) | **POST** /api/v1/flow-model-contexts/{domain}/{flowModelContextId}/unpublish | Unpublish flow context |
| [**unpublish3**](FlowModelContextControllerApi.md#unpublish3) | **POST** /api/v1/flow-model-contexts/{domain}/unpublish | Unpublish list of flow contexts |


<a id="getFilteredContexts"></a>
# **getFilteredContexts**
> PageResponseFlowModelContextSnapshot getFilteredContexts(filterRequest, domain)

Filter published flow contexts

Get a filtered list of current published flow contexts in this orchestration runtime environment context.&lt;br/&gt;Filter example: searchString:fulfillment

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowModelContextControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    FlowModelContextControllerApi apiInstance = new FlowModelContextControllerApi(defaultClient);
    FlowModelContextFilterRequest filterRequest = new FlowModelContextFilterRequest(); // FlowModelContextFilterRequest | The filter value is a semicolon delimited list of key value pairs. List values separate possible values with commas. Keys include: | filter name          | Filter value description                                                                                       | |----------------------|----------------------------------------------------------------------------------------------------------------| | snapshotIds          | Match contexts with snapshotIds in this comma-separated list.                                                  | | dasIds               | Match snapshots created from any of these das ids.                                                             | | dasVersions          | Match snapshots where das version of original flow model is in this list. Useful with a singular id in dasIds. | | searchString         | Match snapshots with names matching this string.                                                               | | caseSensitive        | Specify if searches are case sensitive or not.                                                                 | | wholeWord            | Specify if searches match whole word or not.                                                                   |
    String domain = "domain_example"; // String | 
    try {
      PageResponseFlowModelContextSnapshot result = apiInstance.getFilteredContexts(filterRequest, domain);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowModelContextControllerApi#getFilteredContexts");
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
| **filterRequest** | [**FlowModelContextFilterRequest**](.md)| The filter value is a semicolon delimited list of key value pairs. List values separate possible values with commas. Keys include: | filter name          | Filter value description                                                                                       | |----------------------|----------------------------------------------------------------------------------------------------------------| | snapshotIds          | Match contexts with snapshotIds in this comma-separated list.                                                  | | dasIds               | Match snapshots created from any of these das ids.                                                             | | dasVersions          | Match snapshots where das version of original flow model is in this list. Useful with a singular id in dasIds. | | searchString         | Match snapshots with names matching this string.                                                               | | caseSensitive        | Specify if searches are case sensitive or not.                                                                 | | wholeWord            | Specify if searches match whole word or not.                                                                   | | |
| **domain** | **String**|  | |

### Return type

[**PageResponseFlowModelContextSnapshot**](PageResponseFlowModelContextSnapshot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getPublished"></a>
# **getPublished**
> DataResponseFlowModelContextSnapshot getPublished(domain, flowModelContextId)

Get published flow context content

Get content of specified published flow context version from orchestration runtime environment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowModelContextControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    FlowModelContextControllerApi apiInstance = new FlowModelContextControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    UUID flowModelContextId = UUID.randomUUID(); // UUID | Flow context id
    try {
      DataResponseFlowModelContextSnapshot result = apiInstance.getPublished(domain, flowModelContextId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowModelContextControllerApi#getPublished");
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
| **flowModelContextId** | **UUID**| Flow context id | |

### Return type

[**DataResponseFlowModelContextSnapshot**](DataResponseFlowModelContextSnapshot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Content of flow model context returned successfully |  -  |
| **404** | Flow model context not found |  -  |

<a id="isDeletable1"></a>
# **isDeletable1**
> DataResponseDeletableResource isDeletable1(domain, flowContextId, version)

Says whether this flow context can be safely deleted

It will not be deletable if it is published in at least one domain, maybe one to which the user has no access

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowModelContextControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    FlowModelContextControllerApi apiInstance = new FlowModelContextControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    UUID flowContextId = UUID.randomUUID(); // UUID | Flow context id
    Integer version = 56; // Integer | Specify version (optional). If omitted, any version will match.
    try {
      DataResponseDeletableResource result = apiInstance.isDeletable1(domain, flowContextId, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowModelContextControllerApi#isDeletable1");
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
| **flowContextId** | **UUID**| Flow context id | |
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
| **200** | Says whether the flow context can be safely deleted or not |  -  |

<a id="listPublished1"></a>
# **listPublished1**
> ListResponseFlowModelContextSnapshot listPublished1(domain)

List published flow contexts

Get a list of current published flow contexts in this orchestration runtime environment context.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowModelContextControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    FlowModelContextControllerApi apiInstance = new FlowModelContextControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    try {
      ListResponseFlowModelContextSnapshot result = apiInstance.listPublished1(domain);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowModelContextControllerApi#listPublished1");
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

[**ListResponseFlowModelContextSnapshot**](ListResponseFlowModelContextSnapshot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of published flow model contexts, the list may be empty |  -  |

<a id="publish1"></a>
# **publish1**
> DataResponseFlowModelContextSnapshot publish1(domain, flowModelContextId, version)

Publish flow context

Publish specified flow context version to orchestration runtime environment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowModelContextControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    FlowModelContextControllerApi apiInstance = new FlowModelContextControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    UUID flowModelContextId = UUID.randomUUID(); // UUID | Flow context id
    Integer version = 56; // Integer | Specify version (optional). If omitted, latest version will be published.
    try {
      DataResponseFlowModelContextSnapshot result = apiInstance.publish1(domain, flowModelContextId, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowModelContextControllerApi#publish1");
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
| **flowModelContextId** | **UUID**| Flow context id | |
| **version** | **Integer**| Specify version (optional). If omitted, latest version will be published. | [optional] |

### Return type

[**DataResponseFlowModelContextSnapshot**](DataResponseFlowModelContextSnapshot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Flow model context published successfully. |  -  |
| **400** | Bad request |  -  |
| **404** | Flow model context not found. |  -  |

<a id="unpublish2"></a>
# **unpublish2**
> GenericResponse unpublish2(domain, flowModelContextId, version)

Unpublish flow context

Unpublish specified flow context version from orchestration runtime environment. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowModelContextControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    FlowModelContextControllerApi apiInstance = new FlowModelContextControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    UUID flowModelContextId = UUID.randomUUID(); // UUID | Flow context id
    Integer version = 56; // Integer | Specify version (optional). If omitted, latest version will be unpublished.
    try {
      GenericResponse result = apiInstance.unpublish2(domain, flowModelContextId, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowModelContextControllerApi#unpublish2");
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
| **flowModelContextId** | **UUID**| Flow context id | |
| **version** | **Integer**| Specify version (optional). If omitted, latest version will be unpublished. | [optional] |

### Return type

[**GenericResponse**](GenericResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Flow model context unpublished successfully |  -  |
| **400** | Bad request |  -  |
| **404** | Flow model context not found |  -  |

<a id="unpublish3"></a>
# **unpublish3**
> GenericResponse unpublish3(domain, flowObjectsRequest)

Unpublish list of flow contexts

Unpublish specified flow contexts from orchestration runtime environment. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowModelContextControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    FlowModelContextControllerApi apiInstance = new FlowModelContextControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    FlowObjectsRequest flowObjectsRequest = new FlowObjectsRequest(); // FlowObjectsRequest | 
    try {
      GenericResponse result = apiInstance.unpublish3(domain, flowObjectsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowModelContextControllerApi#unpublish3");
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

