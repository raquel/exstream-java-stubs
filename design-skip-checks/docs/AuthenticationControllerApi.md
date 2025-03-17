# AuthenticationControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**currentUser**](AuthenticationControllerApi.md#currentUser) | **GET** /api/v1/authentication/{domain}/current-user |  |
| [**currentUser1**](AuthenticationControllerApi.md#currentUser1) | **GET** /api/v1/authentication/current-user |  |


<a id="currentUser"></a>
# **currentUser**
> DataResponseCurrentUserResponse currentUser(domain)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    AuthenticationControllerApi apiInstance = new AuthenticationControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    try {
      DataResponseCurrentUserResponse result = apiInstance.currentUser(domain);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationControllerApi#currentUser");
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

[**DataResponseCurrentUserResponse**](DataResponseCurrentUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="currentUser1"></a>
# **currentUser1**
> DataResponseCurrentUserResponse currentUser1()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    AuthenticationControllerApi apiInstance = new AuthenticationControllerApi(defaultClient);
    try {
      DataResponseCurrentUserResponse result = apiInstance.currentUser1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationControllerApi#currentUser1");
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

[**DataResponseCurrentUserResponse**](DataResponseCurrentUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

