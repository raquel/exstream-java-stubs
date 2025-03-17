# CollectionResourcesControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**collectionDetails**](CollectionResourcesControllerApi.md#collectionDetails) | **POST** /api/v1/collection-resources/collection-details | Get the list of resources and versions, including additional detail information, for the specified list of collection ids |
| [**create2**](CollectionResourcesControllerApi.md#create2) | **POST** /api/v1/collection-resources/create | Create a new collection resource containing the specified ResourceVersions |
| [**delete3**](CollectionResourcesControllerApi.md#delete3) | **DELETE** /api/v1/collection-resources/delete/{collectionId} | Deletes the set of resources for the specified collection id |
| [**deleteBulk**](CollectionResourcesControllerApi.md#deleteBulk) | **DELETE** /api/v1/collection-resources/delete-bulk | Deletes the set of resources for the specified collection ids |


<a id="collectionDetails"></a>
# **collectionDetails**
> PageResponseCollectionResourceDetailResponse collectionDetails(requestFilter, requestBody)

Get the list of resources and versions, including additional detail information, for the specified list of collection ids

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CollectionResourcesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    CollectionResourcesControllerApi apiInstance = new CollectionResourcesControllerApi(defaultClient);
    CollectionResourceFilter requestFilter = new CollectionResourceFilter(); // CollectionResourceFilter | 
    List<String> requestBody = Arrays.asList(); // List<String> | 
    try {
      PageResponseCollectionResourceDetailResponse result = apiInstance.collectionDetails(requestFilter, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionResourcesControllerApi#collectionDetails");
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
| **requestFilter** | [**CollectionResourceFilter**](.md)|  | |
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | |

### Return type

[**PageResponseCollectionResourceDetailResponse**](PageResponseCollectionResourceDetailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="create2"></a>
# **create2**
> ListResponseCollectionResource create2(versionedId)

Create a new collection resource containing the specified ResourceVersions

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CollectionResourcesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    CollectionResourcesControllerApi apiInstance = new CollectionResourcesControllerApi(defaultClient);
    List<VersionedId> versionedId = Arrays.asList(); // List<VersionedId> | 
    try {
      ListResponseCollectionResource result = apiInstance.create2(versionedId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionResourcesControllerApi#create2");
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
| **versionedId** | [**List&lt;VersionedId&gt;**](VersionedId.md)|  | |

### Return type

[**ListResponseCollectionResource**](ListResponseCollectionResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="delete3"></a>
# **delete3**
> delete3(collectionId)

Deletes the set of resources for the specified collection id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CollectionResourcesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    CollectionResourcesControllerApi apiInstance = new CollectionResourcesControllerApi(defaultClient);
    String collectionId = "collectionId_example"; // String | Filter for deleting the collection resources
    try {
      apiInstance.delete3(collectionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionResourcesControllerApi#delete3");
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
| **collectionId** | **String**| Filter for deleting the collection resources | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteBulk"></a>
# **deleteBulk**
> deleteBulk(requestBody)

Deletes the set of resources for the specified collection ids

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CollectionResourcesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    CollectionResourcesControllerApi apiInstance = new CollectionResourcesControllerApi(defaultClient);
    List<String> requestBody = Arrays.asList(); // List<String> | 
    try {
      apiInstance.deleteBulk(requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionResourcesControllerApi#deleteBulk");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

