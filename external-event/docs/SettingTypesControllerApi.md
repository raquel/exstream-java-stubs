# SettingTypesControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/eep*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**retrieveSettingType**](SettingTypesControllerApi.md#retrieveSettingType) | **GET** /api/v1/setting-types/{typeId} | Retrieve a specific setting type |
| [**retrieveSettingTypes**](SettingTypesControllerApi.md#retrieveSettingTypes) | **GET** /api/v1/setting-types | Retrieve all setting types |


<a id="retrieveSettingType"></a>
# **retrieveSettingType**
> DataResponseSettingType retrieveSettingType(typeId, loadSettings)

Retrieve a specific setting type

Retrieve a setting type

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SettingTypesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/eep");

    SettingTypesControllerApi apiInstance = new SettingTypesControllerApi(defaultClient);
    String typeId = "typeId_example"; // String | Setting type to retrieve. Allowed values are OTN, CORE_SIGNATURE.
    String loadSettings = "loadSettings_example"; // String | Flag to decide if associated settings must be loaded. Allowed values are true/false. Default value is false.
    try {
      DataResponseSettingType result = apiInstance.retrieveSettingType(typeId, loadSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingTypesControllerApi#retrieveSettingType");
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
| **typeId** | **String**| Setting type to retrieve. Allowed values are OTN, CORE_SIGNATURE. | |
| **loadSettings** | **String**| Flag to decide if associated settings must be loaded. Allowed values are true/false. Default value is false. | [optional] |

### Return type

[**DataResponseSettingType**](DataResponseSettingType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a id="retrieveSettingTypes"></a>
# **retrieveSettingTypes**
> ListResponseSettingType retrieveSettingTypes(loadSettings)

Retrieve all setting types

Retrieve setting types

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SettingTypesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/eep");

    SettingTypesControllerApi apiInstance = new SettingTypesControllerApi(defaultClient);
    String loadSettings = "loadSettings_example"; // String | Flag to decide if associated settings must be loaded. Allowed values are true/false. Default value is false.
    try {
      ListResponseSettingType result = apiInstance.retrieveSettingTypes(loadSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingTypesControllerApi#retrieveSettingTypes");
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
| **loadSettings** | **String**| Flag to decide if associated settings must be loaded. Allowed values are true/false. Default value is false. | [optional] |

### Return type

[**ListResponseSettingType**](ListResponseSettingType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

