# PermissionsControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/rationalizationApi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getConfiguration**](PermissionsControllerApi.md#getConfiguration) | **GET** /api/v1/permissions/configurations |  |
| [**getLicensePermissions**](PermissionsControllerApi.md#getLicensePermissions) | **GET** /api/v1/permissions/licenses |  |
| [**getLicensePermissions1**](PermissionsControllerApi.md#getLicensePermissions1) | **GET** /api/v1/permissions/licenses/{production} |  |


<a id="getConfiguration"></a>
# **getConfiguration**
> RationalizationResponseObject getConfiguration()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    PermissionsControllerApi apiInstance = new PermissionsControllerApi(defaultClient);
    try {
      RationalizationResponseObject result = apiInstance.getConfiguration();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsControllerApi#getConfiguration");
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

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getLicensePermissions"></a>
# **getLicensePermissions**
> String getLicensePermissions()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    PermissionsControllerApi apiInstance = new PermissionsControllerApi(defaultClient);
    try {
      String result = apiInstance.getLicensePermissions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsControllerApi#getLicensePermissions");
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

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getLicensePermissions1"></a>
# **getLicensePermissions1**
> String getLicensePermissions1(production)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    PermissionsControllerApi apiInstance = new PermissionsControllerApi(defaultClient);
    Boolean production = true; // Boolean | 
    try {
      String result = apiInstance.getLicensePermissions1(production);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsControllerApi#getLicensePermissions1");
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
| **production** | **Boolean**|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

