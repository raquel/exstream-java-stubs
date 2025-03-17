# SettingsControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/eep*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteSettingsByIdOrDomainId**](SettingsControllerApi.md#deleteSettingsByIdOrDomainId) | **DELETE** /api/v1/settings/{id} | Delete settings by either setting id or domain id, atleast one of the values should be passed for delete call. If setting id value is passed, domain id value will be ignored and setting will be deleted based on setting id |
| [**deleteSettingsByIdOrDomainId1**](SettingsControllerApi.md#deleteSettingsByIdOrDomainId1) | **DELETE** /api/v1/settings | Delete settings by either setting id or domain id, atleast one of the values should be passed for delete call. If setting id value is passed, domain id value will be ignored and setting will be deleted based on setting id |
| [**retrieveSettings**](SettingsControllerApi.md#retrieveSettings) | **GET** /api/v1/settings | Retrieve all settings for a tenant or a specific domain |
| [**saveSettings**](SettingsControllerApi.md#saveSettings) | **PUT** /api/v1/settings | Save a list of settings in domains |


<a id="deleteSettingsByIdOrDomainId"></a>
# **deleteSettingsByIdOrDomainId**
> GenericResponse deleteSettingsByIdOrDomainId(id, domainId)

Delete settings by either setting id or domain id, atleast one of the values should be passed for delete call. If setting id value is passed, domain id value will be ignored and setting will be deleted based on setting id

Delete settings by setting id or domain id

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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/eep");

    SettingsControllerApi apiInstance = new SettingsControllerApi(defaultClient);
    String id = "id_example"; // String | id of the setting to be deleted
    String domainId = "domainId_example"; // String | domain for which settings must be deleted
    try {
      GenericResponse result = apiInstance.deleteSettingsByIdOrDomainId(id, domainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsControllerApi#deleteSettingsByIdOrDomainId");
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
| **id** | **String**| id of the setting to be deleted | |
| **domainId** | **String**| domain for which settings must be deleted | [optional] |

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
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a id="deleteSettingsByIdOrDomainId1"></a>
# **deleteSettingsByIdOrDomainId1**
> GenericResponse deleteSettingsByIdOrDomainId1(id, domainId)

Delete settings by either setting id or domain id, atleast one of the values should be passed for delete call. If setting id value is passed, domain id value will be ignored and setting will be deleted based on setting id

Delete settings by setting id or domain id

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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/eep");

    SettingsControllerApi apiInstance = new SettingsControllerApi(defaultClient);
    String id = "id_example"; // String | id of the setting to be deleted
    String domainId = "domainId_example"; // String | domain for which settings must be deleted
    try {
      GenericResponse result = apiInstance.deleteSettingsByIdOrDomainId1(id, domainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsControllerApi#deleteSettingsByIdOrDomainId1");
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
| **id** | **String**| id of the setting to be deleted | |
| **domainId** | **String**| domain for which settings must be deleted | [optional] |

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
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a id="retrieveSettings"></a>
# **retrieveSettings**
> ListResponseSettings retrieveSettings(domainId)

Retrieve all settings for a tenant or a specific domain

Retrieve settings

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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/eep");

    SettingsControllerApi apiInstance = new SettingsControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | domain for which settings must be retrieved
    try {
      ListResponseSettings result = apiInstance.retrieveSettings(domainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsControllerApi#retrieveSettings");
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
| **domainId** | **String**| domain for which settings must be retrieved | [optional] |

### Return type

[**ListResponseSettings**](ListResponseSettings.md)

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

<a id="saveSettings"></a>
# **saveSettings**
> ListResponseSettings saveSettings(setttingsList)

Save a list of settings in domains

Save settings

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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/eep");

    SettingsControllerApi apiInstance = new SettingsControllerApi(defaultClient);
    SetttingsList setttingsList = new SetttingsList(); // SetttingsList | 
    try {
      ListResponseSettings result = apiInstance.saveSettings(setttingsList);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsControllerApi#saveSettings");
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
| **setttingsList** | [**SetttingsList**](SetttingsList.md)|  | |

### Return type

[**ListResponseSettings**](ListResponseSettings.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

