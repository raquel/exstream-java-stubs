# ThemeControllerApi

All URIs are relative to *http://localhost/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createThemeUsingPOST**](ThemeControllerApi.md#createThemeUsingPOST) | **POST** /api/v1/themes/{domain} | Create a theme |
| [**getThemeUsingGET**](ThemeControllerApi.md#getThemeUsingGET) | **GET** /api/v1/themes/{domain}/{themeId} | Fetch theme |
| [**getThemeWithOptionsUsingPOST**](ThemeControllerApi.md#getThemeWithOptionsUsingPOST) | **POST** /api/v1/themes/{domain}/{themeId} | Fetch theme with options payload |
| [**updateTemplateUsingPUT**](ThemeControllerApi.md#updateTemplateUsingPUT) | **PUT** /api/v1/themes/{domain}/{themeId}/template | Update a theme to be based on the latest approved version of its template |
| [**updateThemeUsingPUT**](ThemeControllerApi.md#updateThemeUsingPUT) | **PUT** /api/v1/themes/{domain}/{themeId} | Update theme |


<a id="createThemeUsingPOST"></a>
# **createThemeUsingPOST**
> DataResponseResourceVersion createThemeUsingPOST(domain, request)

Create a theme

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
    defaultClient.setBasePath("http://localhost/design");

    ThemeControllerApi apiInstance = new ThemeControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    CreateThemeRequest request = new CreateThemeRequest(); // CreateThemeRequest | request
    try {
      DataResponseResourceVersion result = apiInstance.createThemeUsingPOST(domain, request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThemeControllerApi#createThemeUsingPOST");
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
| **domain** | **String**| domain | |
| **request** | [**CreateThemeRequest**](CreateThemeRequest.md)| request | |

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
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="getThemeUsingGET"></a>
# **getThemeUsingGET**
> DataResponseTheme getThemeUsingGET(domain, themeId, version)

Fetch theme

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
    defaultClient.setBasePath("http://localhost/design");

    ThemeControllerApi apiInstance = new ThemeControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    UUID themeId = UUID.randomUUID(); // UUID | themeId
    Integer version = -1; // Integer | version
    try {
      DataResponseTheme result = apiInstance.getThemeUsingGET(domain, themeId, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThemeControllerApi#getThemeUsingGET");
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
| **domain** | **String**| domain | |
| **themeId** | **UUID**| themeId | |
| **version** | **Integer**| version | [optional] [default to -1] |

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="getThemeWithOptionsUsingPOST"></a>
# **getThemeWithOptionsUsingPOST**
> DataResponseTheme getThemeWithOptionsUsingPOST(domain, themeId, version, options)

Fetch theme with options payload

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
    defaultClient.setBasePath("http://localhost/design");

    ThemeControllerApi apiInstance = new ThemeControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    UUID themeId = UUID.randomUUID(); // UUID | themeId
    Integer version = -1; // Integer | version
    PostGetThemeWithOptionsPayload options = new PostGetThemeWithOptionsPayload(); // PostGetThemeWithOptionsPayload | options
    try {
      DataResponseTheme result = apiInstance.getThemeWithOptionsUsingPOST(domain, themeId, version, options);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThemeControllerApi#getThemeWithOptionsUsingPOST");
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
| **domain** | **String**| domain | |
| **themeId** | **UUID**| themeId | |
| **version** | **Integer**| version | [optional] [default to -1] |
| **options** | [**PostGetThemeWithOptionsPayload**](PostGetThemeWithOptionsPayload.md)| options | [optional] |

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
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="updateTemplateUsingPUT"></a>
# **updateTemplateUsingPUT**
> GenericResponse updateTemplateUsingPUT(domain, themeId)

Update a theme to be based on the latest approved version of its template

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
    defaultClient.setBasePath("http://localhost/design");

    ThemeControllerApi apiInstance = new ThemeControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    UUID themeId = UUID.randomUUID(); // UUID | themeId
    try {
      GenericResponse result = apiInstance.updateTemplateUsingPUT(domain, themeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThemeControllerApi#updateTemplateUsingPUT");
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
| **domain** | **String**| domain | |
| **themeId** | **UUID**| themeId | |

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
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="updateThemeUsingPUT"></a>
# **updateThemeUsingPUT**
> GenericResponse updateThemeUsingPUT(domain, themeId, theme)

Update theme

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
    defaultClient.setBasePath("http://localhost/design");

    ThemeControllerApi apiInstance = new ThemeControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    UUID themeId = UUID.randomUUID(); // UUID | themeId
    Theme theme = new Theme(); // Theme | theme
    try {
      GenericResponse result = apiInstance.updateThemeUsingPUT(domain, themeId, theme);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThemeControllerApi#updateThemeUsingPUT");
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
| **domain** | **String**| domain | |
| **themeId** | **UUID**| themeId | |
| **theme** | [**Theme**](Theme.md)| theme | |

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
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

