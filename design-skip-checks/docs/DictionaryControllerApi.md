# DictionaryControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDictionaryFromFiles**](DictionaryControllerApi.md#createDictionaryFromFiles) | **POST** /api/v1/dictionaries |  |
| [**deleteDictionary**](DictionaryControllerApi.md#deleteDictionary) | **DELETE** /api/v1/dictionaries/{languageCode} |  |
| [**getAffFile**](DictionaryControllerApi.md#getAffFile) | **GET** /api/v1/dictionaries/{languageCode}/aff |  |
| [**getDicFile**](DictionaryControllerApi.md#getDicFile) | **GET** /api/v1/dictionaries/{languageCode}/dic |  |
| [**getDictionaries**](DictionaryControllerApi.md#getDictionaries) | **GET** /api/v1/dictionaries |  |
| [**getDictionary**](DictionaryControllerApi.md#getDictionary) | **GET** /api/v1/dictionaries/{languageCode} |  |
| [**updateDictionaryFiles**](DictionaryControllerApi.md#updateDictionaryFiles) | **PUT** /api/v1/dictionaries/{languageCode} |  |


<a id="createDictionaryFromFiles"></a>
# **createDictionaryFromFiles**
> DataResponseDictionary createDictionaryFromFiles(languageCode, locale, dicFile, affFile)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DictionaryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    DictionaryControllerApi apiInstance = new DictionaryControllerApi(defaultClient);
    String languageCode = "languageCode_example"; // String | The language code of the dictionary. e.g. en-us
    String locale = "locale_example"; // String | The locale of the dictionary. e.g. English - United States
    File dicFile = new File("/path/to/file"); // File | The dictionary's dic file to upload
    File affFile = new File("/path/to/file"); // File | The dictionary's aff file to upload
    try {
      DataResponseDictionary result = apiInstance.createDictionaryFromFiles(languageCode, locale, dicFile, affFile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryControllerApi#createDictionaryFromFiles");
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
| **languageCode** | **String**| The language code of the dictionary. e.g. en-us | |
| **locale** | **String**| The locale of the dictionary. e.g. English - United States | |
| **dicFile** | **File**| The dictionary&#39;s dic file to upload | [optional] |
| **affFile** | **File**| The dictionary&#39;s aff file to upload | [optional] |

### Return type

[**DataResponseDictionary**](DataResponseDictionary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteDictionary"></a>
# **deleteDictionary**
> GenericResponse deleteDictionary(languageCode)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DictionaryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    DictionaryControllerApi apiInstance = new DictionaryControllerApi(defaultClient);
    String languageCode = "languageCode_example"; // String | 
    try {
      GenericResponse result = apiInstance.deleteDictionary(languageCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryControllerApi#deleteDictionary");
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
| **languageCode** | **String**|  | |

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

<a id="getAffFile"></a>
# **getAffFile**
> Object getAffFile(languageCode)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DictionaryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    DictionaryControllerApi apiInstance = new DictionaryControllerApi(defaultClient);
    String languageCode = "languageCode_example"; // String | 
    try {
      Object result = apiInstance.getAffFile(languageCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryControllerApi#getAffFile");
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
| **languageCode** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDicFile"></a>
# **getDicFile**
> Object getDicFile(languageCode)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DictionaryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    DictionaryControllerApi apiInstance = new DictionaryControllerApi(defaultClient);
    String languageCode = "languageCode_example"; // String | 
    try {
      Object result = apiInstance.getDicFile(languageCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryControllerApi#getDicFile");
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
| **languageCode** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDictionaries"></a>
# **getDictionaries**
> ListResponseDictionary getDictionaries(includeBinaries)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DictionaryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    DictionaryControllerApi apiInstance = new DictionaryControllerApi(defaultClient);
    Boolean includeBinaries = true; // Boolean | 
    try {
      ListResponseDictionary result = apiInstance.getDictionaries(includeBinaries);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryControllerApi#getDictionaries");
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
| **includeBinaries** | **Boolean**|  | [optional] |

### Return type

[**ListResponseDictionary**](ListResponseDictionary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDictionary"></a>
# **getDictionary**
> DataResponseDictionary getDictionary(languageCode)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DictionaryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    DictionaryControllerApi apiInstance = new DictionaryControllerApi(defaultClient);
    String languageCode = "languageCode_example"; // String | 
    try {
      DataResponseDictionary result = apiInstance.getDictionary(languageCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryControllerApi#getDictionary");
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
| **languageCode** | **String**|  | |

### Return type

[**DataResponseDictionary**](DataResponseDictionary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateDictionaryFiles"></a>
# **updateDictionaryFiles**
> DataResponseDictionary updateDictionaryFiles(languageCode, locale, dicFile, affFile)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DictionaryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    DictionaryControllerApi apiInstance = new DictionaryControllerApi(defaultClient);
    String languageCode = "languageCode_example"; // String | 
    String locale = "locale_example"; // String | The dictionary's locale
    File dicFile = new File("/path/to/file"); // File | The dictionary's dic file to upload
    File affFile = new File("/path/to/file"); // File | The dictionary's aff file to upload
    try {
      DataResponseDictionary result = apiInstance.updateDictionaryFiles(languageCode, locale, dicFile, affFile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryControllerApi#updateDictionaryFiles");
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
| **languageCode** | **String**|  | |
| **locale** | **String**| The dictionary&#39;s locale | [optional] |
| **dicFile** | **File**| The dictionary&#39;s dic file to upload | [optional] |
| **affFile** | **File**| The dictionary&#39;s aff file to upload | [optional] |

### Return type

[**DataResponseDictionary**](DataResponseDictionary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

