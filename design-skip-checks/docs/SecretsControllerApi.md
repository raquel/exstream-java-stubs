# SecretsControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**migrateVault**](SecretsControllerApi.md#migrateVault) | **POST** /api/v1/secrets/migrateVault | Migrate secrets to vault. |
| [**rolloverKeys**](SecretsControllerApi.md#rolloverKeys) | **POST** /api/v1/secrets/rollover |  |


<a id="migrateVault"></a>
# **migrateVault**
> Boolean migrateVault()

Migrate secrets to vault.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecretsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    SecretsControllerApi apiInstance = new SecretsControllerApi(defaultClient);
    try {
      Boolean result = apiInstance.migrateVault();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecretsControllerApi#migrateVault");
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

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="rolloverKeys"></a>
# **rolloverKeys**
> Integer rolloverKeys(oldKeyId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecretsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    SecretsControllerApi apiInstance = new SecretsControllerApi(defaultClient);
    String oldKeyId = "oldKeyId_example"; // String | 
    try {
      Integer result = apiInstance.rolloverKeys(oldKeyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecretsControllerApi#rolloverKeys");
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
| **oldKeyId** | **String**|  | |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

