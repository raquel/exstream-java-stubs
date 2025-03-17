# MigrationSetDomainsControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/rationalizationApi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**associateMigrationSetToDomain**](MigrationSetDomainsControllerApi.md#associateMigrationSetToDomain) | **PUT** /api/v1/migrationset/{id}/domains/{domainId}/associate |  |
| [**disassociateMigrationSetToDomain**](MigrationSetDomainsControllerApi.md#disassociateMigrationSetToDomain) | **PUT** /api/v1/migrationset/{id}/domains/{domainId}/disassociate |  |
| [**getMigrationSet3**](MigrationSetDomainsControllerApi.md#getMigrationSet3) | **GET** /api/v1/migrationset/{domainId}/{id}/domains |  |


<a id="associateMigrationSetToDomain"></a>
# **associateMigrationSetToDomain**
> RationalizationResponseObject associateMigrationSetToDomain(domainId, id, migrationSetDomainRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetDomainsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetDomainsControllerApi apiInstance = new MigrationSetDomainsControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    MigrationSetDomainRequest migrationSetDomainRequest = new MigrationSetDomainRequest(); // MigrationSetDomainRequest | 
    try {
      RationalizationResponseObject result = apiInstance.associateMigrationSetToDomain(domainId, id, migrationSetDomainRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetDomainsControllerApi#associateMigrationSetToDomain");
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
| **domainId** | **String**|  | |
| **id** | **UUID**|  | |
| **migrationSetDomainRequest** | [**MigrationSetDomainRequest**](MigrationSetDomainRequest.md)|  | |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="disassociateMigrationSetToDomain"></a>
# **disassociateMigrationSetToDomain**
> RationalizationResponseObject disassociateMigrationSetToDomain(domainId, id, migrationSetDomainRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetDomainsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetDomainsControllerApi apiInstance = new MigrationSetDomainsControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    MigrationSetDomainRequest migrationSetDomainRequest = new MigrationSetDomainRequest(); // MigrationSetDomainRequest | 
    try {
      RationalizationResponseObject result = apiInstance.disassociateMigrationSetToDomain(domainId, id, migrationSetDomainRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetDomainsControllerApi#disassociateMigrationSetToDomain");
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
| **domainId** | **String**|  | |
| **id** | **UUID**|  | |
| **migrationSetDomainRequest** | [**MigrationSetDomainRequest**](MigrationSetDomainRequest.md)|  | |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMigrationSet3"></a>
# **getMigrationSet3**
> RationalizationResponseObject getMigrationSet3(domainId, id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetDomainsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetDomainsControllerApi apiInstance = new MigrationSetDomainsControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      RationalizationResponseObject result = apiInstance.getMigrationSet3(domainId, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetDomainsControllerApi#getMigrationSet3");
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
| **domainId** | **String**|  | |
| **id** | **UUID**|  | |

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

