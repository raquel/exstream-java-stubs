# SettingsControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMultipleSettings**](SettingsControllerApi.md#createMultipleSettings) | **PUT** /api/v1/settings/multiple |  |
| [**createMultipleSettings1**](SettingsControllerApi.md#createMultipleSettings1) | **POST** /api/v1/settings/multiple |  |
| [**createSetting**](SettingsControllerApi.md#createSetting) | **PUT** /api/v1/settings |  |
| [**createSetting1**](SettingsControllerApi.md#createSetting1) | **POST** /api/v1/settings |  |
| [**deleteSetting**](SettingsControllerApi.md#deleteSetting) | **DELETE** /api/v1/settings/{application}/{name} |  |
| [**getAllSettings**](SettingsControllerApi.md#getAllSettings) | **GET** /api/v1/settings |  |
| [**getSetting**](SettingsControllerApi.md#getSetting) | **GET** /api/v1/settings/{application}/{name} |  |
| [**getSettingsForApp**](SettingsControllerApi.md#getSettingsForApp) | **GET** /api/v1/settings/{application} |  |


<a id="createMultipleSettings"></a>
# **createMultipleSettings**
> ListResponseSettingsObj createMultipleSettings(settingsObj)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SettingsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    SettingsControllerApi apiInstance = new SettingsControllerApi(defaultClient);
    List<SettingsObj> settingsObj = Arrays.asList(); // List<SettingsObj> | 
    try {
      ListResponseSettingsObj result = apiInstance.createMultipleSettings(settingsObj);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsControllerApi#createMultipleSettings");
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
| **settingsObj** | [**List&lt;SettingsObj&gt;**](SettingsObj.md)|  | |

### Return type

[**ListResponseSettingsObj**](ListResponseSettingsObj.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createMultipleSettings1"></a>
# **createMultipleSettings1**
> ListResponseSettingsObj createMultipleSettings1(settingsObj)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SettingsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    SettingsControllerApi apiInstance = new SettingsControllerApi(defaultClient);
    List<SettingsObj> settingsObj = Arrays.asList(); // List<SettingsObj> | 
    try {
      ListResponseSettingsObj result = apiInstance.createMultipleSettings1(settingsObj);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsControllerApi#createMultipleSettings1");
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
| **settingsObj** | [**List&lt;SettingsObj&gt;**](SettingsObj.md)|  | |

### Return type

[**ListResponseSettingsObj**](ListResponseSettingsObj.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createSetting"></a>
# **createSetting**
> DataResponseSettingsObj createSetting(settingsObj)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SettingsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    SettingsControllerApi apiInstance = new SettingsControllerApi(defaultClient);
    SettingsObj settingsObj = new SettingsObj(); // SettingsObj | 
    try {
      DataResponseSettingsObj result = apiInstance.createSetting(settingsObj);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsControllerApi#createSetting");
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
| **settingsObj** | [**SettingsObj**](SettingsObj.md)|  | |

### Return type

[**DataResponseSettingsObj**](DataResponseSettingsObj.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createSetting1"></a>
# **createSetting1**
> DataResponseSettingsObj createSetting1(settingsObj)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SettingsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    SettingsControllerApi apiInstance = new SettingsControllerApi(defaultClient);
    SettingsObj settingsObj = new SettingsObj(); // SettingsObj | 
    try {
      DataResponseSettingsObj result = apiInstance.createSetting1(settingsObj);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsControllerApi#createSetting1");
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
| **settingsObj** | [**SettingsObj**](SettingsObj.md)|  | |

### Return type

[**DataResponseSettingsObj**](DataResponseSettingsObj.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteSetting"></a>
# **deleteSetting**
> GenericResponse deleteSetting(application, name)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SettingsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    SettingsControllerApi apiInstance = new SettingsControllerApi(defaultClient);
    String application = "application_example"; // String | 
    String name = "name_example"; // String | 
    try {
      GenericResponse result = apiInstance.deleteSetting(application, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsControllerApi#deleteSetting");
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
| **application** | **String**|  | |
| **name** | **String**|  | |

### Return type

[**GenericResponse**](GenericResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAllSettings"></a>
# **getAllSettings**
> ListResponseSettingsObj getAllSettings()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SettingsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    SettingsControllerApi apiInstance = new SettingsControllerApi(defaultClient);
    try {
      ListResponseSettingsObj result = apiInstance.getAllSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsControllerApi#getAllSettings");
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

[**ListResponseSettingsObj**](ListResponseSettingsObj.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getSetting"></a>
# **getSetting**
> DataResponseSettingsObj getSetting(application, name)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SettingsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    SettingsControllerApi apiInstance = new SettingsControllerApi(defaultClient);
    String application = "application_example"; // String | 
    String name = "name_example"; // String | 
    try {
      DataResponseSettingsObj result = apiInstance.getSetting(application, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsControllerApi#getSetting");
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
| **application** | **String**|  | |
| **name** | **String**|  | |

### Return type

[**DataResponseSettingsObj**](DataResponseSettingsObj.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getSettingsForApp"></a>
# **getSettingsForApp**
> ListResponseSettingsObj getSettingsForApp(application)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SettingsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    SettingsControllerApi apiInstance = new SettingsControllerApi(defaultClient);
    String application = "application_example"; // String | 
    try {
      ListResponseSettingsObj result = apiInstance.getSettingsForApp(application);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsControllerApi#getSettingsForApp");
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
| **application** | **String**|  | |

### Return type

[**ListResponseSettingsObj**](ListResponseSettingsObj.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

