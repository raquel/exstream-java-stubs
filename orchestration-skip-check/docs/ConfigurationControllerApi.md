# ConfigurationControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/orchestration*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addConfiguration**](ConfigurationControllerApi.md#addConfiguration) | **POST** /api/v1/configuration/{domainId} |  |
| [**deleteConfiguration**](ConfigurationControllerApi.md#deleteConfiguration) | **DELETE** /api/v1/configuration/{domainId}/{configType}/{configName} |  |
| [**getConfiguration**](ConfigurationControllerApi.md#getConfiguration) | **GET** /api/v1/configuration/{domainId}/{configType}/{configName} |  |
| [**getConfigurations**](ConfigurationControllerApi.md#getConfigurations) | **GET** /api/v1/configuration/{domainId} | Get all matching configurations |
| [**updateConfiguration**](ConfigurationControllerApi.md#updateConfiguration) | **PUT** /api/v1/configuration/{domainId} |  |


<a id="addConfiguration"></a>
# **addConfiguration**
> DataResponseConfiguration addConfiguration(domainId, modelConfiguration)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConfigurationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    ConfigurationControllerApi apiInstance = new ConfigurationControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    ModelConfiguration modelConfiguration = new ModelConfiguration(); // ModelConfiguration | 
    try {
      DataResponseConfiguration result = apiInstance.addConfiguration(domainId, modelConfiguration);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigurationControllerApi#addConfiguration");
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
| **modelConfiguration** | [**ModelConfiguration**](ModelConfiguration.md)|  | |

### Return type

[**DataResponseConfiguration**](DataResponseConfiguration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteConfiguration"></a>
# **deleteConfiguration**
> GenericResponse deleteConfiguration(domainId, configType, configName)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConfigurationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    ConfigurationControllerApi apiInstance = new ConfigurationControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    String configType = "configType_example"; // String | Specify the configuration type.
    String configName = "configName_example"; // String | Specify the configuration name.
    try {
      GenericResponse result = apiInstance.deleteConfiguration(domainId, configType, configName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigurationControllerApi#deleteConfiguration");
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
| **configType** | **String**| Specify the configuration type. | |
| **configName** | **String**| Specify the configuration name. | |

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

<a id="getConfiguration"></a>
# **getConfiguration**
> ModelConfiguration getConfiguration(domainId, configType, configName)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConfigurationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    ConfigurationControllerApi apiInstance = new ConfigurationControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    String configType = "configType_example"; // String | Specify the configuration type.
    String configName = "configName_example"; // String | Specify the configuration name.
    try {
      ModelConfiguration result = apiInstance.getConfiguration(domainId, configType, configName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigurationControllerApi#getConfiguration");
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
| **configType** | **String**| Specify the configuration type. | |
| **configName** | **String**| Specify the configuration name. | |

### Return type

[**ModelConfiguration**](ModelConfiguration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getConfigurations"></a>
# **getConfigurations**
> PageResponseConfiguration getConfigurations(filterRequest, domainId)

Get all matching configurations

Get all configurations (no filter) or all the configurations matching the filter. &lt;br/&gt;Filter example: filter&#x3D;configType:myConfigType (domain is taken from the URL)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConfigurationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    ConfigurationControllerApi apiInstance = new ConfigurationControllerApi(defaultClient);
    ConfigurationFilterRequest filterRequest = new ConfigurationFilterRequest(); // ConfigurationFilterRequest | The filter value is a semicolon delimited list of key value pairs. List values separate possible values with commas. Keys include: | filter name          | Filter value description                                                                                       | |----------------------|----------------------------------------------------------------------------------------------------------------| | configType           | Match configurations with this configType.                                                                     | | configName           | Match configurations with this configName.                                                                     |
    String domainId = "domainId_example"; // String | 
    try {
      PageResponseConfiguration result = apiInstance.getConfigurations(filterRequest, domainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigurationControllerApi#getConfigurations");
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
| **filterRequest** | [**ConfigurationFilterRequest**](.md)| The filter value is a semicolon delimited list of key value pairs. List values separate possible values with commas. Keys include: | filter name          | Filter value description                                                                                       | |----------------------|----------------------------------------------------------------------------------------------------------------| | configType           | Match configurations with this configType.                                                                     | | configName           | Match configurations with this configName.                                                                     | | |
| **domainId** | **String**|  | |

### Return type

[**PageResponseConfiguration**](PageResponseConfiguration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateConfiguration"></a>
# **updateConfiguration**
> DataResponseConfiguration updateConfiguration(domainId, modelConfiguration)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConfigurationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    ConfigurationControllerApi apiInstance = new ConfigurationControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    ModelConfiguration modelConfiguration = new ModelConfiguration(); // ModelConfiguration | 
    try {
      DataResponseConfiguration result = apiInstance.updateConfiguration(domainId, modelConfiguration);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigurationControllerApi#updateConfiguration");
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
| **modelConfiguration** | [**ModelConfiguration**](ModelConfiguration.md)|  | |

### Return type

[**DataResponseConfiguration**](DataResponseConfiguration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

