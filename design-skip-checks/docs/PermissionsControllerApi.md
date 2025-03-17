# PermissionsControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLicensePermissions**](PermissionsControllerApi.md#getLicensePermissions) | **GET** /api/v1/permissions/{domain}/licenses |  |
| [**getUserPermissions**](PermissionsControllerApi.md#getUserPermissions) | **GET** /api/v1/permissions/{domain}/resources |  |
| [**getWebappPermissions**](PermissionsControllerApi.md#getWebappPermissions) | **GET** /api/v1/permissions/{domain}/webapps |  |


<a id="getLicensePermissions"></a>
# **getLicensePermissions**
> DataResponseWebappPermissionResponse getLicensePermissions()



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    PermissionsControllerApi apiInstance = new PermissionsControllerApi(defaultClient);
    try {
      DataResponseWebappPermissionResponse result = apiInstance.getLicensePermissions();
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

[**DataResponseWebappPermissionResponse**](DataResponseWebappPermissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getUserPermissions"></a>
# **getUserPermissions**
> ListResponseRolePermissions getUserPermissions(domain, groupId, resourceType)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    PermissionsControllerApi apiInstance = new PermissionsControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    String groupId = "groupId_example"; // String | 
    String resourceType = "all"; // String | 
    try {
      ListResponseRolePermissions result = apiInstance.getUserPermissions(domain, groupId, resourceType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsControllerApi#getUserPermissions");
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
| **groupId** | **String**|  | [optional] |
| **resourceType** | **String**|  | [optional] [enum: all, designer, author, designAsset, commAsset, orchestrator, resourcepack, exstrapplication, exstrdocument, exstrpage, exstrcomponentobj, exstremail, exstrengine, exstrvariablebase, exstrpackage, exstrgraphicalmessage, exstrtextmessage, exstrparagraph, exstrparagraphsection, image, samplefile, exstrdatasource, exstrhtml5, versionedtemplate, documentdefinition, enginerundef, font, fontdefinition, exstrbarcode, exstrpapertype, exstrmessagetype, exstrmetadata, orcsettings, flowmodel, exstrcommunicationset, exstroutputqueue, exstroutput, exstrlanguage, exstrlocale, exstrmigrationset, exstrmessaging, exstrmessagingauthor, flowscript, exstrnamedcolor, exstrcolorfamily, exstrstyle, exstrstylesheet, exstrevent, exstrrule, dashboard, pdf] |

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

<a id="getWebappPermissions"></a>
# **getWebappPermissions**
> DataResponseWebappPermissionResponse getWebappPermissions(domain, groupId)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    PermissionsControllerApi apiInstance = new PermissionsControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    String groupId = "groupId_example"; // String | 
    try {
      DataResponseWebappPermissionResponse result = apiInstance.getWebappPermissions(domain, groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsControllerApi#getWebappPermissions");
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
| **groupId** | **String**|  | [optional] |

### Return type

[**DataResponseWebappPermissionResponse**](DataResponseWebappPermissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

