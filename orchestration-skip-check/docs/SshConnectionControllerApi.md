# SshConnectionControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/orchestration*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addKeyForHost**](SshConnectionControllerApi.md#addKeyForHost) | **POST** /api/v1/ssh/known-hosts/hostkey | Add key for host |
| [**clearKnownHosts**](SshConnectionControllerApi.md#clearKnownHosts) | **DELETE** /api/v1/ssh/known-hosts | Clear list of known hosts |
| [**getKeyForHost**](SshConnectionControllerApi.md#getKeyForHost) | **GET** /api/v1/ssh/known-hosts/hostkey | Get key for host |
| [**listKnownHosts**](SshConnectionControllerApi.md#listKnownHosts) | **GET** /api/v1/ssh/known-hosts | Get a list of known hosts |


<a id="addKeyForHost"></a>
# **addKeyForHost**
> GenericResponse addKeyForHost(hostKey)

Add key for host

Add key of provided host to known hosts.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SshConnectionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    SshConnectionControllerApi apiInstance = new SshConnectionControllerApi(defaultClient);
    HostKey hostKey = new HostKey(); // HostKey | hostkey
    try {
      GenericResponse result = apiInstance.addKeyForHost(hostKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SshConnectionControllerApi#addKeyForHost");
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
| **hostKey** | [**HostKey**](HostKey.md)| hostkey | |

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

<a id="clearKnownHosts"></a>
# **clearKnownHosts**
> GenericResponse clearKnownHosts()

Clear list of known hosts

Deletes all currently known hosts and their keys in this tenant context.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SshConnectionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    SshConnectionControllerApi apiInstance = new SshConnectionControllerApi(defaultClient);
    try {
      GenericResponse result = apiInstance.clearKnownHosts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SshConnectionControllerApi#clearKnownHosts");
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

[**GenericResponse**](GenericResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getKeyForHost"></a>
# **getKeyForHost**
> GenericResponse getKeyForHost(host, port)

Get key for host

Requests a fresh key for specified host.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SshConnectionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    SshConnectionControllerApi apiInstance = new SshConnectionControllerApi(defaultClient);
    String host = "host_example"; // String | Specifies host name
    Integer port = 22; // Integer | Specifies port
    try {
      GenericResponse result = apiInstance.getKeyForHost(host, port);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SshConnectionControllerApi#getKeyForHost");
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
| **host** | **String**| Specifies host name | |
| **port** | **Integer**| Specifies port | [optional] [default to 22] |

### Return type

[**GenericResponse**](GenericResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listKnownHosts"></a>
# **listKnownHosts**
> ListResponseHostKey listKnownHosts()

Get a list of known hosts

Returns a list of all currently known hosts and their keys in this tenant context.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SshConnectionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    SshConnectionControllerApi apiInstance = new SshConnectionControllerApi(defaultClient);
    try {
      ListResponseHostKey result = apiInstance.listKnownHosts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SshConnectionControllerApi#listKnownHosts");
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

[**ListResponseHostKey**](ListResponseHostKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

