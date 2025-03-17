# SortDataControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/orchestration*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteSortData**](SortDataControllerApi.md#deleteSortData) | **DELETE** /api/v1/sortdata/{domain} | Delete sorting assets and set the jobs, instances and queued flow steps using those assets to error. The only possible parameters are domain (in the URL) and the mandatory filter |
| [**deleteSortData1**](SortDataControllerApi.md#deleteSortData1) | **DELETE** /api/v1/sortdata/{domain}/{id} | Delete sorting asset and set the jobs, instances and queued flow steps using those assets to error. The only possible parameters are domain (in the URL) and the sorting asset id (in the URL) |
| [**getSortingAsset**](SortDataControllerApi.md#getSortingAsset) | **GET** /api/v1/sortdata/{domain}/{id} | Get sorting asset. The only possible parameters are domain (in the URL) and the id (in the URL) |
| [**getSortingAssetContent**](SortDataControllerApi.md#getSortingAssetContent) | **GET** /api/v1/sortdata/{domain}/{id}/content | Get content of sorting assets. Possible parameters are domain (in the URL) and the id (in the URL) of the sorting asset. |
| [**listSortingAssets**](SortDataControllerApi.md#listSortingAssets) | **GET** /api/v1/sortdata/{domain} | List sorting assets. Possible parameters are domain (in the URL) and the optional parameters filter,count,offset and sort |
| [**updateState**](SortDataControllerApi.md#updateState) | **PUT** /api/v1/sortdata/{domain} | Update state for all sort assets matching filter criteria. Possible parameters are domain (in the URL), state and the mandatory filter |
| [**updateState1**](SortDataControllerApi.md#updateState1) | **PUT** /api/v1/sortdata/{domain}/{id} | Update state for all sort assets referenced by given id. Possible parameters are domain (in the URL), id (in the URL) and state. |


<a id="deleteSortData"></a>
# **deleteSortData**
> GenericResponse deleteSortData(domain, sortingDataFilterRequest)

Delete sorting assets and set the jobs, instances and queued flow steps using those assets to error. The only possible parameters are domain (in the URL) and the mandatory filter

Sorting assets using synchronous mode is not included.  The filter value is a semicolon delimited list of key value pairs.  List values separate possible values with commas. These are the only keys possible, please ignore the parameters below this list: | Filter name                    | Filter value description                                                         | |--------------------------------|----------------------------------------------------------------------------------| | flowModelIds                   | Match sorting assets with these flow model ids.                                  | | communicationIds               | Match sorting assets with these communication ids.                               | | queueNames                     | Match sorting assets with these queue names.                                     | | externalIds                    | Match sorting assets with these external ids.                                    | | flowStepIds                    | Match sorting assets with these flow step ids.                                   | | ids                            | Match sorting assets with these sorting asset ids.                               | | jobIds                         | Match sorting assets with these job ids.                                         | | referenceIds                   | Match sorting assets with these reference ids.                                   | | sortSubflows                   | Match sorting assets with these sort sub flows.                                  | | metadata                       | Match sorting assets with these metadata values.                                 | | states                         | Match sorting assets with any of these states. Possible values: processed,waiting,expired,canceled,all| | customersCountFrom             | Match sorting assets having customer count from this number.                     | | customersCountTo               | Match sorting assets having customer count to this number.                       | | creationDateStart              | Match sorting assets created after this date. (yyyy-MM-dd format)                | | creationDateEnd                | Match sorting assets created before this date. (yyyy-MM-dd format)               | | lastModificationDateStart      | Match sorting assets modified after this date. (yyyy-MM-dd format)               | | lastModificationDateEnd        | Match sorting assets modified before this date. (yyyy-MM-dd format)              | Note: For following special characters in strings (applicable for queueNames, externalIds, sortSubflows, metadata) use:  : &amp;rarr; /colon/  ; &amp;rarr; /semi/  \\ &amp;rarr; /bsol/  Example - filter&#x3D;states:expired;queueNames:SortPrep

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SortDataControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    SortDataControllerApi apiInstance = new SortDataControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    SortingDataFilterRequest sortingDataFilterRequest = new SortingDataFilterRequest(); // SortingDataFilterRequest | 
    try {
      GenericResponse result = apiInstance.deleteSortData(domain, sortingDataFilterRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SortDataControllerApi#deleteSortData");
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
| **domain** | **String**| Domain id | |
| **sortingDataFilterRequest** | [**SortingDataFilterRequest**](SortingDataFilterRequest.md)|  | [optional] |

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
| **200** | Success |  -  |

<a id="deleteSortData1"></a>
# **deleteSortData1**
> GenericResponse deleteSortData1(domain, id)

Delete sorting asset and set the jobs, instances and queued flow steps using those assets to error. The only possible parameters are domain (in the URL) and the sorting asset id (in the URL)

Sorting assets using synchronous mode is not included.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SortDataControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    SortDataControllerApi apiInstance = new SortDataControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    UUID id = UUID.randomUUID(); // UUID | Id
    try {
      GenericResponse result = apiInstance.deleteSortData1(domain, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SortDataControllerApi#deleteSortData1");
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
| **domain** | **String**| Domain id | |
| **id** | **UUID**| Id | |

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
| **200** | Success |  -  |

<a id="getSortingAsset"></a>
# **getSortingAsset**
> DataResponseSortingAsset getSortingAsset(domain, id)

Get sorting asset. The only possible parameters are domain (in the URL) and the id (in the URL)

Sorting assets using synchronous mode is not included.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SortDataControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    SortDataControllerApi apiInstance = new SortDataControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    UUID id = UUID.randomUUID(); // UUID | Id
    try {
      DataResponseSortingAsset result = apiInstance.getSortingAsset(domain, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SortDataControllerApi#getSortingAsset");
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
| **domain** | **String**| Domain id | |
| **id** | **UUID**| Id | |

### Return type

[**DataResponseSortingAsset**](DataResponseSortingAsset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getSortingAssetContent"></a>
# **getSortingAssetContent**
> getSortingAssetContent(domain, id)

Get content of sorting assets. Possible parameters are domain (in the URL) and the id (in the URL) of the sorting asset.

Sorting assets using synchronous mode is not included.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SortDataControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    SortDataControllerApi apiInstance = new SortDataControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    UUID id = UUID.randomUUID(); // UUID | Id
    try {
      apiInstance.getSortingAssetContent(domain, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling SortDataControllerApi#getSortingAssetContent");
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
| **domain** | **String**| Domain id | |
| **id** | **UUID**| Id | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/exstream-sort-index

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listSortingAssets"></a>
# **listSortingAssets**
> GenericResponse listSortingAssets(domain, filterRequest)

List sorting assets. Possible parameters are domain (in the URL) and the optional parameters filter,count,offset and sort

Sorting assets using synchronous mode is not included.  The filter value is a semicolon delimited list of key value pairs.  List values separate possible values with commas. These are the only keys possible, please ignore the parameters below this list: | Filter name                    | Filter value description                                                         | |--------------------------------|----------------------------------------------------------------------------------| | flowModelIds                   | Match sorting assets with these flow model ids.                                  | | communicationIds               | Match sorting assets with these communication ids.                               | | queueNames                     | Match sorting assets with these queue names.                                     | | externalIds                    | Match sorting assets with these external ids.                                    | | flowStepIds                    | Match sorting assets with these flow step ids.                                   | | ids                            | Match sorting assets with these sorting asset ids.                               | | jobIds                         | Match sorting assets with these job ids.                                         | | referenceIds                   | Match sorting assets with these reference ids.                                   | | sortSubflows                   | Match sorting assets with these sort sub flows.                                  | | metadata                       | Match sorting assets with these metadata values.                                 | | states                         | Match sorting assets with any of these states. Possible values: processed,waiting,expired,canceled,all| | customersCountFrom             | Match sorting assets having customer count from this number.                     | | customersCountTo               | Match sorting assets having customer count to this number.                       | | creationDateStart              | Match sorting assets created after this date. (yyyy-MM-dd format)                | | creationDateEnd                | Match sorting assets created before this date. (yyyy-MM-dd format)               | | lastModificationDateStart      | Match sorting assets modified after this date. (yyyy-MM-dd format)               | | lastModificationDateEnd        | Match sorting assets modified before this date. (yyyy-MM-dd format)              | Note: For following special characters in strings (applicable for queueNames, externalIds, sortSubflows, metadata) use:  : &amp;rarr; /colon/  ; &amp;rarr; /semi/  \\ &amp;rarr; /bsol/  Example - filter&#x3D;queueNames:SortPrep&amp;count&#x3D;10&amp;offset&#x3D;0

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SortDataControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    SortDataControllerApi apiInstance = new SortDataControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    SortingDataFilterRequest filterRequest = new SortingDataFilterRequest(); // SortingDataFilterRequest | Use the optional filter parameter to decide which sorting assets should be listed (ALL of them if no filter specified)
    try {
      GenericResponse result = apiInstance.listSortingAssets(domain, filterRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SortDataControllerApi#listSortingAssets");
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
| **domain** | **String**| Domain id | |
| **filterRequest** | [**SortingDataFilterRequest**](.md)| Use the optional filter parameter to decide which sorting assets should be listed (ALL of them if no filter specified) | |

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
| **200** | Success |  -  |

<a id="updateState"></a>
# **updateState**
> GenericResponse updateState(domain, updateStateRequest)

Update state for all sort assets matching filter criteria. Possible parameters are domain (in the URL), state and the mandatory filter

Sorting assets using synchronous mode is not included.  The filter value is a semicolon delimited list of key value pairs.  List values separate possible values with commas. These are the only keys possible, please ignore the parameters below this list: | Filter name                    | Filter value description                                                         | |--------------------------------|----------------------------------------------------------------------------------| | flowModelIds                   | Match sorting assets with these flow model ids.                                  | | communicationIds               | Match sorting assets with these communication ids.                               | | queueNames                     | Match sorting assets with these queue names.                                     | | externalIds                    | Match sorting assets with these external ids.                                    | | flowStepIds                    | Match sorting assets with these flow step ids.                                   | | ids                            | Match sorting assets with these sorting asset ids.                               | | jobIds                         | Match sorting assets with these job ids.                                         | | referenceIds                   | Match sorting assets with these reference ids.                                   | | sortSubflows                   | Match sorting assets with these sort sub flows.                                  | | metadata                       | Match sorting assets with these metadata values.                                 | | states                         | Match sorting assets with any of these states. Possible values: processed,waiting,expired,canceled,all| | customersCountFrom             | Match sorting assets having customer count from this number.                     | | customersCountTo               | Match sorting assets having customer count to this number.                       | | creationDateStart              | Match sorting assets created after this date. (yyyy-MM-dd format)                | | creationDateEnd                | Match sorting assets created before this date. (yyyy-MM-dd format)               | | lastModificationDateStart      | Match sorting assets modified after this date. (yyyy-MM-dd format)               | | lastModificationDateEnd        | Match sorting assets modified before this date. (yyyy-MM-dd format)              | Note: For following special characters in strings (applicable for queueNames, externalIds, sortSubflows, metadata) use:  : &amp;rarr; /colon/  ; &amp;rarr; /semi/  \\ &amp;rarr; /bsol/  Example - state&#x3D;waiting&amp;filter&#x3D;externalIds:Ext001;states:processed

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SortDataControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    SortDataControllerApi apiInstance = new SortDataControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    UpdateStateRequest updateStateRequest = new UpdateStateRequest(); // UpdateStateRequest | 
    try {
      GenericResponse result = apiInstance.updateState(domain, updateStateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SortDataControllerApi#updateState");
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
| **domain** | **String**| Domain id | |
| **updateStateRequest** | [**UpdateStateRequest**](UpdateStateRequest.md)|  | [optional] |

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

<a id="updateState1"></a>
# **updateState1**
> DataResponseSortingAsset updateState1(domain, id, updateState1Request)

Update state for all sort assets referenced by given id. Possible parameters are domain (in the URL), id (in the URL) and state.

Sorting assets using synchronous mode is not included.  Example - state&#x3D;expired

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SortDataControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    SortDataControllerApi apiInstance = new SortDataControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    UUID id = UUID.randomUUID(); // UUID | Id
    UpdateState1Request updateState1Request = new UpdateState1Request(); // UpdateState1Request | 
    try {
      DataResponseSortingAsset result = apiInstance.updateState1(domain, id, updateState1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SortDataControllerApi#updateState1");
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
| **domain** | **String**| Domain id | |
| **id** | **UUID**| Id | |
| **updateState1Request** | [**UpdateState1Request**](UpdateState1Request.md)|  | [optional] |

### Return type

[**DataResponseSortingAsset**](DataResponseSortingAsset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

