# GroupRoleControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRole2**](GroupRoleControllerApi.md#createRole2) | **POST** /api/v1/group-roles |  |
| [**deleteRole1**](GroupRoleControllerApi.md#deleteRole1) | **DELETE** /api/v1/group-roles |  |
| [**getRoles1**](GroupRoleControllerApi.md#getRoles1) | **GET** /api/v1/group-roles |  |
| [**getRoles2**](GroupRoleControllerApi.md#getRoles2) | **GET** /api/v1/group-roles/{domain} |  |


<a id="createRole2"></a>
# **createRole2**
> DataResponseGroupRole createRole2(groupRole)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupRoleControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    GroupRoleControllerApi apiInstance = new GroupRoleControllerApi(defaultClient);
    GroupRole groupRole = new GroupRole(); // GroupRole | 
    try {
      DataResponseGroupRole result = apiInstance.createRole2(groupRole);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupRoleControllerApi#createRole2");
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
| **groupRole** | [**GroupRole**](GroupRole.md)|  | |

### Return type

[**DataResponseGroupRole**](DataResponseGroupRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteRole1"></a>
# **deleteRole1**
> GenericResponse deleteRole1(groupRole)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupRoleControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    GroupRoleControllerApi apiInstance = new GroupRoleControllerApi(defaultClient);
    GroupRole groupRole = new GroupRole(); // GroupRole | 
    try {
      GenericResponse result = apiInstance.deleteRole1(groupRole);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupRoleControllerApi#deleteRole1");
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
| **groupRole** | [**GroupRole**](GroupRole.md)|  | |

### Return type

[**GenericResponse**](GenericResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getRoles1"></a>
# **getRoles1**
> ListResponseGroupRole getRoles1()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupRoleControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    GroupRoleControllerApi apiInstance = new GroupRoleControllerApi(defaultClient);
    try {
      ListResponseGroupRole result = apiInstance.getRoles1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupRoleControllerApi#getRoles1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListResponseGroupRole**](ListResponseGroupRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getRoles2"></a>
# **getRoles2**
> DataResponseListGroupRole getRoles2(domain)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupRoleControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    GroupRoleControllerApi apiInstance = new GroupRoleControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    try {
      DataResponseListGroupRole result = apiInstance.getRoles2(domain);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupRoleControllerApi#getRoles2");
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

[**DataResponseListGroupRole**](DataResponseListGroupRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

