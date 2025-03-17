# TenantAdminControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/orchestration*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTenantSchema**](TenantAdminControllerApi.md#createTenantSchema) | **POST** /api/v1/tenants/{tenantId} |  |
| [**createTenantWithExistingSchema**](TenantAdminControllerApi.md#createTenantWithExistingSchema) | **POST** /api/v1/tenants/addTenant |  |
| [**getTenant**](TenantAdminControllerApi.md#getTenant) | **GET** /api/v1/tenants/{tenantId} |  |
| [**getTenantConfiguration**](TenantAdminControllerApi.md#getTenantConfiguration) | **GET** /api/v1/tenants/configuration |  |
| [**getTenants**](TenantAdminControllerApi.md#getTenants) | **GET** /api/v1/tenants |  |
| [**updateTenant**](TenantAdminControllerApi.md#updateTenant) | **PUT** /api/v1/tenants/updateTenant |  |
| [**updateTenantSchema**](TenantAdminControllerApi.md#updateTenantSchema) | **PUT** /api/v1/tenants/{tenantId}/schema |  |
| [**updateTenantSchemas**](TenantAdminControllerApi.md#updateTenantSchemas) | **PUT** /api/v1/tenants/all/schema |  |


<a id="createTenantSchema"></a>
# **createTenantSchema**
> DataResponseTenant createTenantSchema(tenantId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantAdminControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    TenantAdminControllerApi apiInstance = new TenantAdminControllerApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    try {
      DataResponseTenant result = apiInstance.createTenantSchema(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantAdminControllerApi#createTenantSchema");
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
| **tenantId** | **String**|  | |

### Return type

[**DataResponseTenant**](DataResponseTenant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createTenantWithExistingSchema"></a>
# **createTenantWithExistingSchema**
> DataResponseTenant createTenantWithExistingSchema(createTenantBody)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantAdminControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    TenantAdminControllerApi apiInstance = new TenantAdminControllerApi(defaultClient);
    CreateTenantBody createTenantBody = new CreateTenantBody(); // CreateTenantBody | 
    try {
      DataResponseTenant result = apiInstance.createTenantWithExistingSchema(createTenantBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantAdminControllerApi#createTenantWithExistingSchema");
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
| **createTenantBody** | [**CreateTenantBody**](CreateTenantBody.md)|  | |

### Return type

[**DataResponseTenant**](DataResponseTenant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTenant"></a>
# **getTenant**
> DataResponseTenant getTenant(tenantId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantAdminControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    TenantAdminControllerApi apiInstance = new TenantAdminControllerApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    try {
      DataResponseTenant result = apiInstance.getTenant(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantAdminControllerApi#getTenant");
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
| **tenantId** | **String**|  | |

### Return type

[**DataResponseTenant**](DataResponseTenant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTenantConfiguration"></a>
# **getTenantConfiguration**
> DataResponseTenantsConfiguration getTenantConfiguration()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantAdminControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    TenantAdminControllerApi apiInstance = new TenantAdminControllerApi(defaultClient);
    try {
      DataResponseTenantsConfiguration result = apiInstance.getTenantConfiguration();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantAdminControllerApi#getTenantConfiguration");
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

[**DataResponseTenantsConfiguration**](DataResponseTenantsConfiguration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTenants"></a>
# **getTenants**
> ListResponseTenant getTenants()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantAdminControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    TenantAdminControllerApi apiInstance = new TenantAdminControllerApi(defaultClient);
    try {
      ListResponseTenant result = apiInstance.getTenants();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantAdminControllerApi#getTenants");
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

[**ListResponseTenant**](ListResponseTenant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateTenant"></a>
# **updateTenant**
> DataResponseTenant updateTenant(createTenantBody)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantAdminControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    TenantAdminControllerApi apiInstance = new TenantAdminControllerApi(defaultClient);
    CreateTenantBody createTenantBody = new CreateTenantBody(); // CreateTenantBody | 
    try {
      DataResponseTenant result = apiInstance.updateTenant(createTenantBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantAdminControllerApi#updateTenant");
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
| **createTenantBody** | [**CreateTenantBody**](CreateTenantBody.md)|  | |

### Return type

[**DataResponseTenant**](DataResponseTenant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateTenantSchema"></a>
# **updateTenantSchema**
> DataResponseTenant updateTenantSchema(tenantId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantAdminControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    TenantAdminControllerApi apiInstance = new TenantAdminControllerApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    try {
      DataResponseTenant result = apiInstance.updateTenantSchema(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantAdminControllerApi#updateTenantSchema");
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
| **tenantId** | **String**|  | |

### Return type

[**DataResponseTenant**](DataResponseTenant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateTenantSchemas"></a>
# **updateTenantSchemas**
> ListResponseTenant updateTenantSchemas()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantAdminControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    TenantAdminControllerApi apiInstance = new TenantAdminControllerApi(defaultClient);
    try {
      ListResponseTenant result = apiInstance.updateTenantSchemas();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantAdminControllerApi#updateTenantSchemas");
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

[**ListResponseTenant**](ListResponseTenant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

