# SecretControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/orchestration*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**migrateVault**](SecretControllerApi.md#migrateVault) | **POST** /api/v1/secrets/{domain}/migrateVault | Migrate secrets to vault. |
| [**rolloverKeys**](SecretControllerApi.md#rolloverKeys) | **POST** /api/v1/secrets/{domain}/rollover |  |
| [**secretExists**](SecretControllerApi.md#secretExists) | **GET** /api/v1/secrets/{domain}/{secretId}/exists |  |
| [**setSecret**](SecretControllerApi.md#setSecret) | **PUT** /api/v1/secrets/{domain}/{secretId} |  |


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
import org.openapitools.client.api.SecretControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    SecretControllerApi apiInstance = new SecretControllerApi(defaultClient);
    try {
      Boolean result = apiInstance.migrateVault();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecretControllerApi#migrateVault");
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
import org.openapitools.client.api.SecretControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    SecretControllerApi apiInstance = new SecretControllerApi(defaultClient);
    String oldKeyId = "oldKeyId_example"; // String | 
    try {
      Integer result = apiInstance.rolloverKeys(oldKeyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecretControllerApi#rolloverKeys");
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

<a id="secretExists"></a>
# **secretExists**
> DataResponseBoolean secretExists(domain, secretId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecretControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    SecretControllerApi apiInstance = new SecretControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID secretId = UUID.randomUUID(); // UUID | 
    try {
      DataResponseBoolean result = apiInstance.secretExists(domain, secretId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecretControllerApi#secretExists");
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
| **secretId** | **UUID**|  | |

### Return type

[**DataResponseBoolean**](DataResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="setSecret"></a>
# **setSecret**
> String setSecret(domain, secretId, secretInfo)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecretControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    SecretControllerApi apiInstance = new SecretControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID secretId = UUID.randomUUID(); // UUID | 
    SecretInfo secretInfo = new SecretInfo(); // SecretInfo | 
    try {
      String result = apiInstance.setSecret(domain, secretId, secretInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecretControllerApi#setSecret");
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
| **secretId** | **UUID**|  | |
| **secretInfo** | [**SecretInfo**](SecretInfo.md)|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

