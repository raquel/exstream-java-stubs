# RoleControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRole**](RoleControllerApi.md#createRole) | **POST** /api/v1/roles |  |
| [**deleteRole**](RoleControllerApi.md#deleteRole) | **DELETE** /api/v1/roles/{id} |  |
| [**getRoles**](RoleControllerApi.md#getRoles) | **GET** /api/v1/roles |  |
| [**updateRole**](RoleControllerApi.md#updateRole) | **PUT** /api/v1/roles/{id} |  |


<a id="createRole"></a>
# **createRole**
> DataResponseRole createRole(role)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoleControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    RoleControllerApi apiInstance = new RoleControllerApi(defaultClient);
    Role role = new Role(); // Role | 
    try {
      DataResponseRole result = apiInstance.createRole(role);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoleControllerApi#createRole");
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
| **role** | [**Role**](Role.md)|  | |

### Return type

[**DataResponseRole**](DataResponseRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteRole"></a>
# **deleteRole**
> GenericResponse deleteRole(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoleControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    RoleControllerApi apiInstance = new RoleControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      GenericResponse result = apiInstance.deleteRole(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoleControllerApi#deleteRole");
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
| **id** | **UUID**|  | |

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

<a id="getRoles"></a>
# **getRoles**
> PageResponseRole getRoles(filterSearchString, filterCaseSensitive, filterWholeWord, offset, count)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoleControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    RoleControllerApi apiInstance = new RoleControllerApi(defaultClient);
    String filterSearchString = "filterSearchString_example"; // String | 
    Boolean filterCaseSensitive = true; // Boolean | 
    Boolean filterWholeWord = true; // Boolean | 
    Integer offset = 0; // Integer | For pagination, fetch entities after this many
    Integer count = 1000; // Integer | For pagination, the number of entities per page
    try {
      PageResponseRole result = apiInstance.getRoles(filterSearchString, filterCaseSensitive, filterWholeWord, offset, count);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoleControllerApi#getRoles");
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
| **offset** | **Integer**| For pagination, fetch entities after this many | [optional] |
| **count** | **Integer**| For pagination, the number of entities per page | [optional] |

### Return type

[**PageResponseRole**](PageResponseRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateRole"></a>
# **updateRole**
> DataResponseRole updateRole(id, role)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoleControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    RoleControllerApi apiInstance = new RoleControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    Role role = new Role(); // Role | 
    try {
      DataResponseRole result = apiInstance.updateRole(id, role);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoleControllerApi#updateRole");
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
| **id** | **UUID**|  | |
| **role** | [**Role**](Role.md)|  | |

### Return type

[**DataResponseRole**](DataResponseRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

