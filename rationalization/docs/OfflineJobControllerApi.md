# OfflineJobControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/rationalizationApi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**runJob**](OfflineJobControllerApi.md#runJob) | **GET** /api/v1/internal/jobs/{tenant}/{domain}/{msId}/{userName}/{implicit} |  |
| [**unlockMigrationset**](OfflineJobControllerApi.md#unlockMigrationset) | **PUT** /api/v1/internal/jobs/{tenant}/{domain}/{msId}/{implicit} |  |


<a id="runJob"></a>
# **runJob**
> String runJob(tenant, domain, msId, implicit, userName)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OfflineJobControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    OfflineJobControllerApi apiInstance = new OfflineJobControllerApi(defaultClient);
    String tenant = "tenant_example"; // String | 
    String domain = "domain_example"; // String | 
    UUID msId = UUID.randomUUID(); // UUID | 
    Boolean implicit = true; // Boolean | 
    String userName = "userName_example"; // String | 
    try {
      String result = apiInstance.runJob(tenant, domain, msId, implicit, userName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OfflineJobControllerApi#runJob");
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
| **tenant** | **String**|  | |
| **domain** | **String**|  | |
| **msId** | **UUID**|  | |
| **implicit** | **Boolean**|  | |
| **userName** | **String**|  | |

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

<a id="unlockMigrationset"></a>
# **unlockMigrationset**
> String unlockMigrationset(tenant, domain, msId, implicit)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OfflineJobControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    OfflineJobControllerApi apiInstance = new OfflineJobControllerApi(defaultClient);
    String tenant = "tenant_example"; // String | 
    String domain = "domain_example"; // String | 
    UUID msId = UUID.randomUUID(); // UUID | 
    Boolean implicit = true; // Boolean | 
    try {
      String result = apiInstance.unlockMigrationset(tenant, domain, msId, implicit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OfflineJobControllerApi#unlockMigrationset");
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
| **tenant** | **String**|  | |
| **domain** | **String**|  | |
| **msId** | **UUID**|  | |
| **implicit** | **Boolean**|  | |

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

