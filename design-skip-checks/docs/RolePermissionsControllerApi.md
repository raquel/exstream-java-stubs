# RolePermissionsControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRole1**](RolePermissionsControllerApi.md#createRole1) | **POST** /api/v1/role-permissions |  |
| [**getAllPermissions**](RolePermissionsControllerApi.md#getAllPermissions) | **GET** /api/v1/role-permissions |  |


<a id="createRole1"></a>
# **createRole1**
> DataResponseRolePermissions createRole1(rolePermissions)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolePermissionsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    RolePermissionsControllerApi apiInstance = new RolePermissionsControllerApi(defaultClient);
    RolePermissions rolePermissions = new RolePermissions(); // RolePermissions | 
    try {
      DataResponseRolePermissions result = apiInstance.createRole1(rolePermissions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolePermissionsControllerApi#createRole1");
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
| **rolePermissions** | [**RolePermissions**](RolePermissions.md)|  | |

### Return type

[**DataResponseRolePermissions**](DataResponseRolePermissions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAllPermissions"></a>
# **getAllPermissions**
> ListResponseRolePermissions getAllPermissions(roleName)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolePermissionsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    RolePermissionsControllerApi apiInstance = new RolePermissionsControllerApi(defaultClient);
    String roleName = "roleName_example"; // String | 
    try {
      ListResponseRolePermissions result = apiInstance.getAllPermissions(roleName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolePermissionsControllerApi#getAllPermissions");
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
| **roleName** | **String**|  | [optional] |

### Return type

[**ListResponseRolePermissions**](ListResponseRolePermissions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

