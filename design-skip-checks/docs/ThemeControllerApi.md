# ThemeControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTheme**](ThemeControllerApi.md#createTheme) | **POST** /api/v1/themes/{domain} |  |
| [**getTheme**](ThemeControllerApi.md#getTheme) | **GET** /api/v1/themes/{domain}/{themeId} |  |
| [**getThemeWithOptions**](ThemeControllerApi.md#getThemeWithOptions) | **POST** /api/v1/themes/{domain}/{themeId} |  |
| [**updateTemplate**](ThemeControllerApi.md#updateTemplate) | **PUT** /api/v1/themes/{domain}/{themeId}/template | Update the specified theme to be based on the latest approved version of its template. |
| [**updateTheme**](ThemeControllerApi.md#updateTheme) | **PUT** /api/v1/themes/{domain}/{themeId} |  |


<a id="createTheme"></a>
# **createTheme**
> DataResponseResourceVersion createTheme(domain, createThemeRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThemeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ThemeControllerApi apiInstance = new ThemeControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    CreateThemeRequest createThemeRequest = new CreateThemeRequest(); // CreateThemeRequest | 
    try {
      DataResponseResourceVersion result = apiInstance.createTheme(domain, createThemeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThemeControllerApi#createTheme");
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
| **createThemeRequest** | [**CreateThemeRequest**](CreateThemeRequest.md)|  | |

### Return type

[**DataResponseResourceVersion**](DataResponseResourceVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTheme"></a>
# **getTheme**
> DataResponseTheme getTheme(domain, themeId, version)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThemeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ThemeControllerApi apiInstance = new ThemeControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID themeId = UUID.randomUUID(); // UUID | 
    Integer version = -1; // Integer | 
    try {
      DataResponseTheme result = apiInstance.getTheme(domain, themeId, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThemeControllerApi#getTheme");
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
| **themeId** | **UUID**|  | |
| **version** | **Integer**|  | [optional] [default to -1] |

### Return type

[**DataResponseTheme**](DataResponseTheme.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getThemeWithOptions"></a>
# **getThemeWithOptions**
> DataResponseTheme getThemeWithOptions(domain, themeId, version, postGetThemeWithOptionsPayload)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThemeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ThemeControllerApi apiInstance = new ThemeControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID themeId = UUID.randomUUID(); // UUID | 
    Integer version = -1; // Integer | 
    PostGetThemeWithOptionsPayload postGetThemeWithOptionsPayload = new PostGetThemeWithOptionsPayload(); // PostGetThemeWithOptionsPayload | 
    try {
      DataResponseTheme result = apiInstance.getThemeWithOptions(domain, themeId, version, postGetThemeWithOptionsPayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThemeControllerApi#getThemeWithOptions");
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
| **themeId** | **UUID**|  | |
| **version** | **Integer**|  | [optional] [default to -1] |
| **postGetThemeWithOptionsPayload** | [**PostGetThemeWithOptionsPayload**](PostGetThemeWithOptionsPayload.md)|  | [optional] |

### Return type

[**DataResponseTheme**](DataResponseTheme.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateTemplate"></a>
# **updateTemplate**
> GenericResponse updateTemplate(domain, themeId)

Update the specified theme to be based on the latest approved version of its template.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThemeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ThemeControllerApi apiInstance = new ThemeControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID themeId = UUID.randomUUID(); // UUID | 
    try {
      GenericResponse result = apiInstance.updateTemplate(domain, themeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThemeControllerApi#updateTemplate");
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
| **themeId** | **UUID**|  | |

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

<a id="updateTheme"></a>
# **updateTheme**
> GenericResponse updateTheme(domain, themeId, theme, requireLock)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThemeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ThemeControllerApi apiInstance = new ThemeControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID themeId = UUID.randomUUID(); // UUID | 
    Theme theme = new Theme(); // Theme | 
    Boolean requireLock = true; // Boolean | 
    try {
      GenericResponse result = apiInstance.updateTheme(domain, themeId, theme, requireLock);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThemeControllerApi#updateTheme");
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
| **themeId** | **UUID**|  | |
| **theme** | [**Theme**](Theme.md)|  | |
| **requireLock** | **Boolean**|  | [optional] |

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

