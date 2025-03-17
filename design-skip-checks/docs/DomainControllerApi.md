# DomainControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDomains**](DomainControllerApi.md#createDomains) | **POST** /api/v1/domains |  |
| [**deleteDomain**](DomainControllerApi.md#deleteDomain) | **DELETE** /api/v1/domains/{domainName} |  |
| [**getDomains**](DomainControllerApi.md#getDomains) | **GET** /api/v1/domains |  |
| [**updateDomain**](DomainControllerApi.md#updateDomain) | **PUT** /api/v1/domains/{id} |  |


<a id="createDomains"></a>
# **createDomains**
> DataResponseDomain createDomains(domain)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    DomainControllerApi apiInstance = new DomainControllerApi(defaultClient);
    Domain domain = new Domain(); // Domain | 
    try {
      DataResponseDomain result = apiInstance.createDomains(domain);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainControllerApi#createDomains");
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
| **domain** | [**Domain**](Domain.md)|  | |

### Return type

[**DataResponseDomain**](DataResponseDomain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteDomain"></a>
# **deleteDomain**
> GenericResponse deleteDomain(domainName)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    DomainControllerApi apiInstance = new DomainControllerApi(defaultClient);
    String domainName = "domainName_example"; // String | 
    try {
      GenericResponse result = apiInstance.deleteDomain(domainName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainControllerApi#deleteDomain");
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
| **domainName** | **String**|  | |

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

<a id="getDomains"></a>
# **getDomains**
> PageResponseDomain getDomains(filterSearchString, filterCaseSensitive, filterWholeWord, filterCurrentUser, offset, count, fetchChildren, fetchApprovalGroups)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    DomainControllerApi apiInstance = new DomainControllerApi(defaultClient);
    String filterSearchString = "filterSearchString_example"; // String | 
    Boolean filterCaseSensitive = true; // Boolean | 
    Boolean filterWholeWord = true; // Boolean | 
    Boolean filterCurrentUser = true; // Boolean | 
    Integer offset = 0; // Integer | For pagination, fetch entities after this many
    Integer count = 1000; // Integer | For pagination, the number of entities per page
    Boolean fetchChildren = true; // Boolean | 
    Boolean fetchApprovalGroups = true; // Boolean | 
    try {
      PageResponseDomain result = apiInstance.getDomains(filterSearchString, filterCaseSensitive, filterWholeWord, filterCurrentUser, offset, count, fetchChildren, fetchApprovalGroups);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainControllerApi#getDomains");
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
| **filterSearchString** | **String**|  | [optional] |
| **filterCaseSensitive** | **Boolean**|  | [optional] |
| **filterWholeWord** | **Boolean**|  | [optional] |
| **filterCurrentUser** | **Boolean**|  | [optional] |
| **offset** | **Integer**| For pagination, fetch entities after this many | [optional] |
| **count** | **Integer**| For pagination, the number of entities per page | [optional] |
| **fetchChildren** | **Boolean**|  | [optional] |
| **fetchApprovalGroups** | **Boolean**|  | [optional] |

### Return type

[**PageResponseDomain**](PageResponseDomain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateDomain"></a>
# **updateDomain**
> DataResponseDomain updateDomain(id, body)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    DomainControllerApi apiInstance = new DomainControllerApi(defaultClient);
    String id = "id_example"; // String | 
    Object body = null; // Object | 
    try {
      DataResponseDomain result = apiInstance.updateDomain(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainControllerApi#updateDomain");
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
| **id** | **String**|  | |
| **body** | **Object**|  | |

### Return type

[**DataResponseDomain**](DataResponseDomain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

