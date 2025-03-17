# UserProfileControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addFavorite**](UserProfileControllerApi.md#addFavorite) | **POST** /api/v1/user-profiles/{domain}/favorite |  |
| [**addFavorites**](UserProfileControllerApi.md#addFavorites) | **POST** /api/v1/user-profiles/{domain}/favorites |  |
| [**addRecent**](UserProfileControllerApi.md#addRecent) | **POST** /api/v1/user-profiles/{domain}/recent |  |
| [**deleteFavorite**](UserProfileControllerApi.md#deleteFavorite) | **DELETE** /api/v1/user-profiles/{domain}/favorite |  |
| [**deleteFavorites**](UserProfileControllerApi.md#deleteFavorites) | **DELETE** /api/v1/user-profiles/{domain}/favorites |  |
| [**getUserProfile**](UserProfileControllerApi.md#getUserProfile) | **GET** /api/v1/user-profiles/{domain} |  |


<a id="addFavorite"></a>
# **addFavorite**
> SavedResource addFavorite(domain, savedResourceInput)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserProfileControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    UserProfileControllerApi apiInstance = new UserProfileControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    SavedResourceInput savedResourceInput = new SavedResourceInput(); // SavedResourceInput | 
    try {
      SavedResource result = apiInstance.addFavorite(domain, savedResourceInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserProfileControllerApi#addFavorite");
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
| **savedResourceInput** | [**SavedResourceInput**](SavedResourceInput.md)|  | |

### Return type

[**SavedResource**](SavedResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="addFavorites"></a>
# **addFavorites**
> DataResponseBulkFavoriteResponse addFavorites(domain, favoriteResourcesInput)



Marks the given list of resources as favorite for the current user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserProfileControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    UserProfileControllerApi apiInstance = new UserProfileControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    FavoriteResourcesInput favoriteResourcesInput = new FavoriteResourcesInput(); // FavoriteResourcesInput | 
    try {
      DataResponseBulkFavoriteResponse result = apiInstance.addFavorites(domain, favoriteResourcesInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserProfileControllerApi#addFavorites");
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
| **favoriteResourcesInput** | [**FavoriteResourcesInput**](FavoriteResourcesInput.md)|  | |

### Return type

[**DataResponseBulkFavoriteResponse**](DataResponseBulkFavoriteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="addRecent"></a>
# **addRecent**
> SavedResource addRecent(domain, savedResourceInput)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserProfileControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    UserProfileControllerApi apiInstance = new UserProfileControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    SavedResourceInput savedResourceInput = new SavedResourceInput(); // SavedResourceInput | 
    try {
      SavedResource result = apiInstance.addRecent(domain, savedResourceInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserProfileControllerApi#addRecent");
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
| **savedResourceInput** | [**SavedResourceInput**](SavedResourceInput.md)|  | |

### Return type

[**SavedResource**](SavedResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteFavorite"></a>
# **deleteFavorite**
> deleteFavorite(domain, savedResourceInput)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserProfileControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    UserProfileControllerApi apiInstance = new UserProfileControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    SavedResourceInput savedResourceInput = new SavedResourceInput(); // SavedResourceInput | 
    try {
      apiInstance.deleteFavorite(domain, savedResourceInput);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserProfileControllerApi#deleteFavorite");
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
| **savedResourceInput** | [**SavedResourceInput**](SavedResourceInput.md)|  | |

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

<a id="deleteFavorites"></a>
# **deleteFavorites**
> DataResponseBulkUnfavoriteResponse deleteFavorites(domain, favoriteResourcesInput)



Removes the given list of resources from the favorites.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserProfileControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    UserProfileControllerApi apiInstance = new UserProfileControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    FavoriteResourcesInput favoriteResourcesInput = new FavoriteResourcesInput(); // FavoriteResourcesInput | 
    try {
      DataResponseBulkUnfavoriteResponse result = apiInstance.deleteFavorites(domain, favoriteResourcesInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserProfileControllerApi#deleteFavorites");
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
| **favoriteResourcesInput** | [**FavoriteResourcesInput**](FavoriteResourcesInput.md)|  | |

### Return type

[**DataResponseBulkUnfavoriteResponse**](DataResponseBulkUnfavoriteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getUserProfile"></a>
# **getUserProfile**
> UserProfileResponse getUserProfile(domain, fetchSavedResources)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserProfileControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    UserProfileControllerApi apiInstance = new UserProfileControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    Boolean fetchSavedResources = false; // Boolean | 
    try {
      UserProfileResponse result = apiInstance.getUserProfile(domain, fetchSavedResources);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserProfileControllerApi#getUserProfile");
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
| **fetchSavedResources** | **Boolean**|  | [optional] [default to false] |

### Return type

[**UserProfileResponse**](UserProfileResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

