# RealtimeServicesControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**add**](RealtimeServicesControllerApi.md#add) | **POST** /api/v1/realtime-services | Add a new realtime service |
| [**delete1**](RealtimeServicesControllerApi.md#delete1) | **DELETE** /api/v1/realtime-services/{realtimeServiceId} | Deletes the realtime service with the specified id |
| [**get**](RealtimeServicesControllerApi.md#get) | **GET** /api/v1/realtime-services/{realtimeServiceName} | Gets the realtime service with the specified name |
| [**getAll**](RealtimeServicesControllerApi.md#getAll) | **GET** /api/v1/realtime-services | Gets a list of all realtime services |
| [**getEngineRundef**](RealtimeServicesControllerApi.md#getEngineRundef) | **GET** /api/v1/realtime-services/{realtimeServiceName}/enginerundef | Gets the engine rundef content for the realtime service with the specified name |
| [**update**](RealtimeServicesControllerApi.md#update) | **PUT** /api/v1/realtime-services | Update an existing realtime service |


<a id="add"></a>
# **add**
> DataResponseRealtimeService add(realtimeService)

Add a new realtime service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RealtimeServicesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    RealtimeServicesControllerApi apiInstance = new RealtimeServicesControllerApi(defaultClient);
    RealtimeService realtimeService = new RealtimeService(); // RealtimeService | 
    try {
      DataResponseRealtimeService result = apiInstance.add(realtimeService);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RealtimeServicesControllerApi#add");
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
| **realtimeService** | [**RealtimeService**](RealtimeService.md)|  | |

### Return type

[**DataResponseRealtimeService**](DataResponseRealtimeService.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="delete1"></a>
# **delete1**
> GenericResponse delete1(realtimeServiceId)

Deletes the realtime service with the specified id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RealtimeServicesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    RealtimeServicesControllerApi apiInstance = new RealtimeServicesControllerApi(defaultClient);
    UUID realtimeServiceId = UUID.randomUUID(); // UUID | Filter for deleting the realtime service
    try {
      GenericResponse result = apiInstance.delete1(realtimeServiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RealtimeServicesControllerApi#delete1");
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
| **realtimeServiceId** | **UUID**| Filter for deleting the realtime service | |

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

<a id="get"></a>
# **get**
> DataResponseRealtimeService get(realtimeServiceName, domainId)

Gets the realtime service with the specified name

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RealtimeServicesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    RealtimeServicesControllerApi apiInstance = new RealtimeServicesControllerApi(defaultClient);
    String realtimeServiceName = "realtimeServiceName_example"; // String | The realtime service to get information regarding
    String domainId = "domainId_example"; // String | 
    try {
      DataResponseRealtimeService result = apiInstance.get(realtimeServiceName, domainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RealtimeServicesControllerApi#get");
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
| **realtimeServiceName** | **String**| The realtime service to get information regarding | |
| **domainId** | **String**|  | [optional] |

### Return type

[**DataResponseRealtimeService**](DataResponseRealtimeService.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAll"></a>
# **getAll**
> ListResponseRealtimeService getAll(domainId)

Gets a list of all realtime services

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RealtimeServicesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    RealtimeServicesControllerApi apiInstance = new RealtimeServicesControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    try {
      ListResponseRealtimeService result = apiInstance.getAll(domainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RealtimeServicesControllerApi#getAll");
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
| **domainId** | **String**|  | [optional] |

### Return type

[**ListResponseRealtimeService**](ListResponseRealtimeService.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEngineRundef"></a>
# **getEngineRundef**
> getEngineRundef(realtimeServiceName)

Gets the engine rundef content for the realtime service with the specified name

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RealtimeServicesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    RealtimeServicesControllerApi apiInstance = new RealtimeServicesControllerApi(defaultClient);
    String realtimeServiceName = "realtimeServiceName_example"; // String | The realtime service to get information regarding
    try {
      apiInstance.getEngineRundef(realtimeServiceName);
    } catch (ApiException e) {
      System.err.println("Exception when calling RealtimeServicesControllerApi#getEngineRundef");
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
| **realtimeServiceName** | **String**| The realtime service to get information regarding | |

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

<a id="update"></a>
# **update**
> DataResponseRealtimeService update(realtimeService)

Update an existing realtime service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RealtimeServicesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    RealtimeServicesControllerApi apiInstance = new RealtimeServicesControllerApi(defaultClient);
    RealtimeService realtimeService = new RealtimeService(); // RealtimeService | 
    try {
      DataResponseRealtimeService result = apiInstance.update(realtimeService);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RealtimeServicesControllerApi#update");
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
| **realtimeService** | [**RealtimeService**](RealtimeService.md)|  | |

### Return type

[**DataResponseRealtimeService**](DataResponseRealtimeService.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

