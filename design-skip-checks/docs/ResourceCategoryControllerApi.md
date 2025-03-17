# ResourceCategoryControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createResourceCategory**](ResourceCategoryControllerApi.md#createResourceCategory) | **POST** /api/v1/resource-categories/{name} |  |
| [**deleteResourceCategory**](ResourceCategoryControllerApi.md#deleteResourceCategory) | **DELETE** /api/v1/resource-categories/{id} |  |
| [**deleteResourceCategoryByName**](ResourceCategoryControllerApi.md#deleteResourceCategoryByName) | **DELETE** /api/v1/resource-categories/name/{name} |  |
| [**getResourceCategories**](ResourceCategoryControllerApi.md#getResourceCategories) | **GET** /api/v1/resource-categories |  |
| [**getResourceCategory**](ResourceCategoryControllerApi.md#getResourceCategory) | **GET** /api/v1/resource-categories/{id} |  |
| [**getResourceCategoryByName**](ResourceCategoryControllerApi.md#getResourceCategoryByName) | **GET** /api/v1/resource-categories/name/{name} |  |
| [**updateResourceCategory**](ResourceCategoryControllerApi.md#updateResourceCategory) | **PUT** /api/v1/resource-categories |  |


<a id="createResourceCategory"></a>
# **createResourceCategory**
> DataResponseResourceCategory createResourceCategory(name)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResourceCategoryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourceCategoryControllerApi apiInstance = new ResourceCategoryControllerApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      DataResponseResourceCategory result = apiInstance.createResourceCategory(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceCategoryControllerApi#createResourceCategory");
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
| **name** | **String**|  | |

### Return type

[**DataResponseResourceCategory**](DataResponseResourceCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteResourceCategory"></a>
# **deleteResourceCategory**
> GenericResponse deleteResourceCategory(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResourceCategoryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourceCategoryControllerApi apiInstance = new ResourceCategoryControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      GenericResponse result = apiInstance.deleteResourceCategory(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceCategoryControllerApi#deleteResourceCategory");
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
| **id** | **UUID**|  | |

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

<a id="deleteResourceCategoryByName"></a>
# **deleteResourceCategoryByName**
> GenericResponse deleteResourceCategoryByName(name)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResourceCategoryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourceCategoryControllerApi apiInstance = new ResourceCategoryControllerApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      GenericResponse result = apiInstance.deleteResourceCategoryByName(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceCategoryControllerApi#deleteResourceCategoryByName");
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
| **name** | **String**|  | |

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

<a id="getResourceCategories"></a>
# **getResourceCategories**
> ListResponseResourceCategory getResourceCategories()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResourceCategoryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourceCategoryControllerApi apiInstance = new ResourceCategoryControllerApi(defaultClient);
    try {
      ListResponseResourceCategory result = apiInstance.getResourceCategories();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceCategoryControllerApi#getResourceCategories");
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

[**ListResponseResourceCategory**](ListResponseResourceCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getResourceCategory"></a>
# **getResourceCategory**
> DataResponseResourceCategory getResourceCategory(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResourceCategoryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourceCategoryControllerApi apiInstance = new ResourceCategoryControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      DataResponseResourceCategory result = apiInstance.getResourceCategory(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceCategoryControllerApi#getResourceCategory");
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
| **id** | **UUID**|  | |

### Return type

[**DataResponseResourceCategory**](DataResponseResourceCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getResourceCategoryByName"></a>
# **getResourceCategoryByName**
> DataResponseResourceCategory getResourceCategoryByName(name)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResourceCategoryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourceCategoryControllerApi apiInstance = new ResourceCategoryControllerApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      DataResponseResourceCategory result = apiInstance.getResourceCategoryByName(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceCategoryControllerApi#getResourceCategoryByName");
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
| **name** | **String**|  | |

### Return type

[**DataResponseResourceCategory**](DataResponseResourceCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateResourceCategory"></a>
# **updateResourceCategory**
> DataResponseResourceCategory updateResourceCategory(resourceCategory)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResourceCategoryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourceCategoryControllerApi apiInstance = new ResourceCategoryControllerApi(defaultClient);
    ResourceCategory resourceCategory = new ResourceCategory(); // ResourceCategory | 
    try {
      DataResponseResourceCategory result = apiInstance.updateResourceCategory(resourceCategory);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceCategoryControllerApi#updateResourceCategory");
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
| **resourceCategory** | [**ResourceCategory**](ResourceCategory.md)|  | |

### Return type

[**DataResponseResourceCategory**](DataResponseResourceCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

