# ResourcesControllerApi

All URIs are relative to *http://localhost/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createResourceFromFileUsingPOST**](ResourcesControllerApi.md#createResourceFromFileUsingPOST) | **POST** /api/v1/resources/{domain}/content | Create resource from file |
| [**createResourceUsingPOST**](ResourcesControllerApi.md#createResourceUsingPOST) | **POST** /api/v1/resources/{domain} | Create a new resource |
| [**deleteResourceUsingDELETE**](ResourcesControllerApi.md#deleteResourceUsingDELETE) | **DELETE** /api/v1/resources/{domain}/{id} | Delete a resource |
| [**demoteUsingPUT**](ResourcesControllerApi.md#demoteUsingPUT) | **PUT** /api/v1/resources/{domain}/{id}/demote | Disassociate (demote) resource from a domain |
| [**getContentUsingGET**](ResourcesControllerApi.md#getContentUsingGET) | **GET** /api/v1/resources/{domain}/{id}/content | Fetch resource content |
| [**getResourceContentUsingGET**](ResourcesControllerApi.md#getResourceContentUsingGET) | **GET** /api/v1/resources/{domain}/{id}/content/{type} | Get additional resource content |
| [**getResourceHistoryUsingGET**](ResourcesControllerApi.md#getResourceHistoryUsingGET) | **GET** /api/v1/resources/{domain}/history/{resourceId} | Fetch the history information of a resource |
| [**getResourceUsingGET**](ResourcesControllerApi.md#getResourceUsingGET) | **GET** /api/v1/resources/{domain}/{id} | Fetch resource information |
| [**getResourcesUsingGET1**](ResourcesControllerApi.md#getResourcesUsingGET1) | **GET** /api/v1/resources/{domain} | Fetch resources |
| [**hideResourceUsingPUT**](ResourcesControllerApi.md#hideResourceUsingPUT) | **PUT** /api/v1/resources/{domain}/{id}/hide | Hide resource |
| [**lockResourceUsingPOST**](ResourcesControllerApi.md#lockResourceUsingPOST) | **POST** /api/v1/resources/{domain}/{id}/lock | Lock resource |
| [**promoteUsingPUT**](ResourcesControllerApi.md#promoteUsingPUT) | **PUT** /api/v1/resources/{domain}/{id}/promote | Associate (promote) resource to a domain |
| [**revertToOldVersionUsingPUT**](ResourcesControllerApi.md#revertToOldVersionUsingPUT) | **PUT** /api/v1/resources/{domain}/{id}/revert/{oldVersion} | Revert to an older resource version |
| [**showResourceUsingPUT**](ResourcesControllerApi.md#showResourceUsingPUT) | **PUT** /api/v1/resources/{domain}/{id}/show | Show/Unhide resource |
| [**unlockResourceUsingDELETE**](ResourcesControllerApi.md#unlockResourceUsingDELETE) | **DELETE** /api/v1/resources/{domain}/{id}/lock | Unlock resource |
| [**updateContentOfTypeViaFile**](ResourcesControllerApi.md#updateContentOfTypeViaFile) | **PUT** /api/v1/resources/{domain}/{id}/content/{type} | Update additional resource content |
| [**updateContentViaFileUsingPUT**](ResourcesControllerApi.md#updateContentViaFileUsingPUT) | **PUT** /api/v1/resources/{domain}/{id}/content | Update resource content |
| [**updateResourceUsingPUT**](ResourcesControllerApi.md#updateResourceUsingPUT) | **PUT** /api/v1/resources/{domain}/{id} | Upate resource information |
| [**updateStateUsingPUT**](ResourcesControllerApi.md#updateStateUsingPUT) | **PUT** /api/v1/resources/{domain}/{id}/state | Update the workflow state of a resource |


<a id="createResourceFromFileUsingPOST"></a>
# **createResourceFromFileUsingPOST**
> DataResponseResourceVersion createResourceFromFileUsingPOST(domain, name, type, _file, subtype)

Create resource from file

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResourcesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    String name = "name_example"; // String | The name of the resource to create.
    String type = "type_example"; // String | The type of resource to create.
    File _file = new File("/path/to/file"); // File | The binary file to upload.
    String subtype = "subtype_example"; // String | The subtype of resource to create. Appears in metadata.
    try {
      DataResponseResourceVersion result = apiInstance.createResourceFromFileUsingPOST(domain, name, type, _file, subtype);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#createResourceFromFileUsingPOST");
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
| **name** | **String**| The name of the resource to create. | |
| **type** | **String**| The type of resource to create. | |
| **_file** | **File**| The binary file to upload. | |
| **subtype** | **String**| The subtype of resource to create. Appears in metadata. | [optional] |

### Return type

[**DataResponseResourceVersion**](DataResponseResourceVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="createResourceUsingPOST"></a>
# **createResourceUsingPOST**
> DataResponseResourceVersion createResourceUsingPOST(domain, body, charsetRegistered, concrete, contentMimeType, qualityValue, subtype, type, wildcardSubtype, wildcardType)

Create a new resource

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResourcesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    ResourceVersion body = new ResourceVersion(); // ResourceVersion | body
    Boolean charsetRegistered = true; // Boolean | 
    Boolean concrete = true; // Boolean | 
    String contentMimeType = "contentMimeType_example"; // String | contentMimeType
    Double qualityValue = 3.4D; // Double | 
    String subtype = "subtype_example"; // String | 
    String type = "type_example"; // String | 
    Boolean wildcardSubtype = true; // Boolean | 
    Boolean wildcardType = true; // Boolean | 
    try {
      DataResponseResourceVersion result = apiInstance.createResourceUsingPOST(domain, body, charsetRegistered, concrete, contentMimeType, qualityValue, subtype, type, wildcardSubtype, wildcardType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#createResourceUsingPOST");
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
| **body** | [**ResourceVersion**](ResourceVersion.md)| body | |
| **charsetRegistered** | **Boolean**|  | [optional] |
| **concrete** | **Boolean**|  | [optional] |
| **contentMimeType** | **String**| contentMimeType | [optional] |
| **qualityValue** | **Double**|  | [optional] |
| **subtype** | **String**|  | [optional] |
| **type** | **String**|  | [optional] |
| **wildcardSubtype** | **Boolean**|  | [optional] |
| **wildcardType** | **Boolean**|  | [optional] |

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

<a id="deleteResourceUsingDELETE"></a>
# **deleteResourceUsingDELETE**
> GenericResponse deleteResourceUsingDELETE(domain, id, version)

Delete a resource

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResourcesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    UUID id = UUID.randomUUID(); // UUID | id
    String version = "version_example"; // String | Valid values are LATEST, ALL, or an actual version number. If not specified, will use LATEST.
    try {
      GenericResponse result = apiInstance.deleteResourceUsingDELETE(domain, id, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#deleteResourceUsingDELETE");
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
| **id** | **UUID**| id | |
| **version** | **String**| Valid values are LATEST, ALL, or an actual version number. If not specified, will use LATEST. | [optional] |

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
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="demoteUsingPUT"></a>
# **demoteUsingPUT**
> DataResponseResourceVersion demoteUsingPUT(domain, id, toDomain, version)

Disassociate (demote) resource from a domain

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResourcesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    UUID id = UUID.randomUUID(); // UUID | id
    Domain toDomain = new Domain(); // Domain | toDomain
    Integer version = -1; // Integer | version
    try {
      DataResponseResourceVersion result = apiInstance.demoteUsingPUT(domain, id, toDomain, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#demoteUsingPUT");
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
| **id** | **UUID**| id | |
| **toDomain** | [**Domain**](Domain.md)| toDomain | |
| **version** | **Integer**| version | [optional] [default to -1] |

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

<a id="getContentUsingGET"></a>
# **getContentUsingGET**
> Object getContentUsingGET(domain, id, state, version)

Fetch resource content

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResourcesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    UUID id = UUID.randomUUID(); // UUID | id
    String state = "DRAFT"; // String | state
    Integer version = 56; // Integer | version
    try {
      Object result = apiInstance.getContentUsingGET(domain, id, state, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#getContentUsingGET");
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
| **id** | **UUID**| id | |
| **state** | **String**| state | [optional] [enum: DRAFT, REVIEW, APPROVED, REJECTED] |
| **version** | **Integer**| version | [optional] |

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="getResourceContentUsingGET"></a>
# **getResourceContentUsingGET**
> Object getResourceContentUsingGET(domain, id, type, state, version)

Get additional resource content

Thumbnails for resources are included here as additional content.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResourcesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    UUID id = UUID.randomUUID(); // UUID | id
    String type = "thumbnail"; // String | type
    String state = "DRAFT"; // String | state
    Integer version = 56; // Integer | version
    try {
      Object result = apiInstance.getResourceContentUsingGET(domain, id, type, state, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#getResourceContentUsingGET");
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
| **id** | **UUID**| id | |
| **type** | **String**| type | [enum: thumbnail, manifest, old] |
| **state** | **String**| state | [optional] [enum: DRAFT, REVIEW, APPROVED, REJECTED] |
| **version** | **Integer**| version | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, image/png, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="getResourceHistoryUsingGET"></a>
# **getResourceHistoryUsingGET**
> ListResponseResourceHistory getResourceHistoryUsingGET(domain, resourceId, fetchAcrossDomains)

Fetch the history information of a resource

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResourcesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    UUID resourceId = UUID.randomUUID(); // UUID | resourceId
    Boolean fetchAcrossDomains = true; // Boolean | fetchAcrossDomains
    try {
      ListResponseResourceHistory result = apiInstance.getResourceHistoryUsingGET(domain, resourceId, fetchAcrossDomains);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#getResourceHistoryUsingGET");
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
| **resourceId** | **UUID**| resourceId | |
| **fetchAcrossDomains** | **Boolean**| fetchAcrossDomains | [optional] |

### Return type

[**ListResponseResourceHistory**](ListResponseResourceHistory.md)

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

<a id="getResourceUsingGET"></a>
# **getResourceUsingGET**
> DataResponseResourceVersion getResourceUsingGET(domain, id, checkIfLatestVersion, expand, state, version)

Fetch resource information

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResourcesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    UUID id = UUID.randomUUID(); // UUID | id
    Boolean checkIfLatestVersion = false; // Boolean | checkIfLatestVersion
    String expand = "expand_example"; // String | expand
    String state = "DRAFT"; // String | state
    Integer version = 56; // Integer | version
    try {
      DataResponseResourceVersion result = apiInstance.getResourceUsingGET(domain, id, checkIfLatestVersion, expand, state, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#getResourceUsingGET");
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
| **id** | **UUID**| id | |
| **checkIfLatestVersion** | **Boolean**| checkIfLatestVersion | [optional] [default to false] |
| **expand** | **String**| expand | [optional] |
| **state** | **String**| state | [optional] [enum: DRAFT, REVIEW, APPROVED, REJECTED] |
| **version** | **Integer**| version | [optional] |

### Return type

[**DataResponseResourceVersion**](DataResponseResourceVersion.md)

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

<a id="getResourcesUsingGET1"></a>
# **getResourcesUsingGET1**
> PageResponseResourceVersion getResourcesUsingGET1(domain, advancedFilter, count, expand, fetchCategories, fetchDomains, fetchPermissions, fetchVariants, filter, offset, sort)

Fetch resources

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResourcesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    String advancedFilter = "advancedFilter_example"; // String | 
    Integer count = 1000; // Integer | For pagination, the number of entities per page
    String expand = "expand_example"; // String | expand
    Boolean fetchCategories = false; // Boolean | fetchCategories
    Boolean fetchDomains = false; // Boolean | fetchDomains
    Boolean fetchPermissions = false; // Boolean | fetchPermissions
    Boolean fetchVariants = false; // Boolean | fetchVariants
    String filter = "filter_example"; // String | The filter value is a semicolon delimited list of key value pairs. For example:  name:Example;states:DRAFT,APPROVED;searchString:*ample List values separate possible values with commas. Keys include: | filter name           | Filter value description                                                                        | |-----------------------|-------------------------------------------------------------------------------------------------| | description           | Match resources with this description.                                                          | | excludedTypes         | Match resources whose types do not appear in this comma-separated list.                         | | variableIsArray       | Matches resources against this value.                                                           | | variableType          | Match resources whose variableType is one of these specified.                                   | | ids                   | Match resources with ids in this comma-separated list.                                          | | excludedIds           | Match resources with ids that are NOT in this comma-separated list.                             | | parentId              | Exclude this resource and others directly linked to it. Only usable in the resources API.       | | parentVersion         | For use with parentId. Must use both.                                                           | | name                  | Match resources with this name.                                                                 | | overrideIds           | When matching by states, do not apply the states filter to resources with ids in this list.     | | overrideStates        | When matching by states, apply this states filter to resources with ids in the overrideIds list.| | resourcePackId        | Match resources with this resource pack id.                                                     | | searchString          | Match resources with names or descriptions matching this string. Use a &ast; as a wildcard.     | | caseSensitive         | Specify if searches (name, description, searchString) are case sensitive or not.                | | wholeWord             | Specify if searches (name, description, searchString) match whole word or not.                  | | createdBy             | Match resources created by this user.                                                           | | lastModifiedBy        | Match resources last modified by this user.                                                     | | createdDateStart      | Match resources created on or after this date. (yyyy-MM-dd format).                                   | | createdDateEnd        | Match resources created before this date. (yyyy-MM-dd format).                                  | | lastModifiedDateStart | Match resources last modified on or after this date. (yyyy-MM-dd format).                             | | lastModifiedDateEnd   | Match resources last modified before this date. (yyyy-MM-dd format).                            | | states                | Match resources with states in this list. States include: DRAFT,REVIEW,APPROVED,REJECTED      | | latestVersion         | Set to false to fetch all versions of resources matching the rest of this filter. Only usable in the resources API.| | types                 | Match resources with types in this list. Types include: resourcepack, exstrapplication, exstrdocument, exstrpage, exstrcomponentobj, exstremail, exstrengine, exstrvariablebase, exstrpackage, exstrgraphicalmessage, exstrtextmessage, exstrparagraph, exstrparagraphsection, image, samplefile, exstrdatasource, exstrhtml5, versionedtemplate, documentdefinition, enginerundef, font, fontdefinition, exstrbarcode, exstrpapertype, exstrmessagetype, exstrmetadata, exstrcommunicationset, exstroutputqueue, exstroutput, exstrmigrationset, exstrmessaging         | | systemResource        | Match resources that are (or are not) system resources.                                         | | hasApprovedVersion    | Match resources where a previously approved version of the resources exist.                     | | hidden                | Match resources that are (or are not) hidden.                                                   | | includeVariants       | Set to true to include variants in the response. By default they are excluded unless standardVariantId is specified.| | standardVariantId     | Match resources that are variants of this specified one. Can not be used when includeVariants is explicitly false.  | | categories            | Match resources that are contain at least one of the categories from this list.                 |
    Integer offset = 0; // Integer | For pagination, fetch entities after this many
    String sort = "sort_example"; // String | Comma separated list of {asc|desc}_{field name}
    try {
      PageResponseResourceVersion result = apiInstance.getResourcesUsingGET1(domain, advancedFilter, count, expand, fetchCategories, fetchDomains, fetchPermissions, fetchVariants, filter, offset, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#getResourcesUsingGET1");
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
| **advancedFilter** | **String**|  | [optional] |
| **count** | **Integer**| For pagination, the number of entities per page | [optional] |
| **expand** | **String**| expand | [optional] |
| **fetchCategories** | **Boolean**| fetchCategories | [optional] [default to false] |
| **fetchDomains** | **Boolean**| fetchDomains | [optional] [default to false] |
| **fetchPermissions** | **Boolean**| fetchPermissions | [optional] [default to false] |
| **fetchVariants** | **Boolean**| fetchVariants | [optional] [default to false] |
| **filter** | **String**| The filter value is a semicolon delimited list of key value pairs. For example:  name:Example;states:DRAFT,APPROVED;searchString:*ample List values separate possible values with commas. Keys include: | filter name           | Filter value description                                                                        | |-----------------------|-------------------------------------------------------------------------------------------------| | description           | Match resources with this description.                                                          | | excludedTypes         | Match resources whose types do not appear in this comma-separated list.                         | | variableIsArray       | Matches resources against this value.                                                           | | variableType          | Match resources whose variableType is one of these specified.                                   | | ids                   | Match resources with ids in this comma-separated list.                                          | | excludedIds           | Match resources with ids that are NOT in this comma-separated list.                             | | parentId              | Exclude this resource and others directly linked to it. Only usable in the resources API.       | | parentVersion         | For use with parentId. Must use both.                                                           | | name                  | Match resources with this name.                                                                 | | overrideIds           | When matching by states, do not apply the states filter to resources with ids in this list.     | | overrideStates        | When matching by states, apply this states filter to resources with ids in the overrideIds list.| | resourcePackId        | Match resources with this resource pack id.                                                     | | searchString          | Match resources with names or descriptions matching this string. Use a &amp;ast; as a wildcard.     | | caseSensitive         | Specify if searches (name, description, searchString) are case sensitive or not.                | | wholeWord             | Specify if searches (name, description, searchString) match whole word or not.                  | | createdBy             | Match resources created by this user.                                                           | | lastModifiedBy        | Match resources last modified by this user.                                                     | | createdDateStart      | Match resources created on or after this date. (yyyy-MM-dd format).                                   | | createdDateEnd        | Match resources created before this date. (yyyy-MM-dd format).                                  | | lastModifiedDateStart | Match resources last modified on or after this date. (yyyy-MM-dd format).                             | | lastModifiedDateEnd   | Match resources last modified before this date. (yyyy-MM-dd format).                            | | states                | Match resources with states in this list. States include: DRAFT,REVIEW,APPROVED,REJECTED      | | latestVersion         | Set to false to fetch all versions of resources matching the rest of this filter. Only usable in the resources API.| | types                 | Match resources with types in this list. Types include: resourcepack, exstrapplication, exstrdocument, exstrpage, exstrcomponentobj, exstremail, exstrengine, exstrvariablebase, exstrpackage, exstrgraphicalmessage, exstrtextmessage, exstrparagraph, exstrparagraphsection, image, samplefile, exstrdatasource, exstrhtml5, versionedtemplate, documentdefinition, enginerundef, font, fontdefinition, exstrbarcode, exstrpapertype, exstrmessagetype, exstrmetadata, exstrcommunicationset, exstroutputqueue, exstroutput, exstrmigrationset, exstrmessaging         | | systemResource        | Match resources that are (or are not) system resources.                                         | | hasApprovedVersion    | Match resources where a previously approved version of the resources exist.                     | | hidden                | Match resources that are (or are not) hidden.                                                   | | includeVariants       | Set to true to include variants in the response. By default they are excluded unless standardVariantId is specified.| | standardVariantId     | Match resources that are variants of this specified one. Can not be used when includeVariants is explicitly false.  | | categories            | Match resources that are contain at least one of the categories from this list.                 | | [optional] |
| **offset** | **Integer**| For pagination, fetch entities after this many | [optional] |
| **sort** | **String**| Comma separated list of {asc|desc}_{field name} | [optional] |

### Return type

[**PageResponseResourceVersion**](PageResponseResourceVersion.md)

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

<a id="hideResourceUsingPUT"></a>
# **hideResourceUsingPUT**
> DataResponseResource hideResourceUsingPUT(domain, id)

Hide resource

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResourcesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    UUID id = UUID.randomUUID(); // UUID | id
    try {
      DataResponseResource result = apiInstance.hideResourceUsingPUT(domain, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#hideResourceUsingPUT");
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
| **id** | **UUID**| id | |

### Return type

[**DataResponseResource**](DataResponseResource.md)

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

<a id="lockResourceUsingPOST"></a>
# **lockResourceUsingPOST**
> DataResponseResourceVersion lockResourceUsingPOST(domain, id, version)

Lock resource

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResourcesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    UUID id = UUID.randomUUID(); // UUID | id
    Integer version = 56; // Integer | version
    try {
      DataResponseResourceVersion result = apiInstance.lockResourceUsingPOST(domain, id, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#lockResourceUsingPOST");
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
| **id** | **UUID**| id | |
| **version** | **Integer**| version | [optional] |

### Return type

[**DataResponseResourceVersion**](DataResponseResourceVersion.md)

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

<a id="promoteUsingPUT"></a>
# **promoteUsingPUT**
> DataResponseResourceVersion promoteUsingPUT(domain, id, toDomain, version)

Associate (promote) resource to a domain

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResourcesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    UUID id = UUID.randomUUID(); // UUID | id
    Domain toDomain = new Domain(); // Domain | toDomain
    Integer version = -1; // Integer | version
    try {
      DataResponseResourceVersion result = apiInstance.promoteUsingPUT(domain, id, toDomain, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#promoteUsingPUT");
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
| **id** | **UUID**| id | |
| **toDomain** | [**Domain**](Domain.md)| toDomain | |
| **version** | **Integer**| version | [optional] [default to -1] |

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

<a id="revertToOldVersionUsingPUT"></a>
# **revertToOldVersionUsingPUT**
> DataResponseResourceVersion revertToOldVersionUsingPUT(domain, id, oldVersion)

Revert to an older resource version

Replaces the content of the current draft, or create a new draft with content of specified version. Copies links as well.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResourcesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    UUID id = UUID.randomUUID(); // UUID | id
    Integer oldVersion = 56; // Integer | oldVersion
    try {
      DataResponseResourceVersion result = apiInstance.revertToOldVersionUsingPUT(domain, id, oldVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#revertToOldVersionUsingPUT");
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
| **id** | **UUID**| id | |
| **oldVersion** | **Integer**| oldVersion | |

### Return type

[**DataResponseResourceVersion**](DataResponseResourceVersion.md)

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

<a id="showResourceUsingPUT"></a>
# **showResourceUsingPUT**
> DataResponseResource showResourceUsingPUT(domain, id)

Show/Unhide resource

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResourcesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    UUID id = UUID.randomUUID(); // UUID | id
    try {
      DataResponseResource result = apiInstance.showResourceUsingPUT(domain, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#showResourceUsingPUT");
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
| **id** | **UUID**| id | |

### Return type

[**DataResponseResource**](DataResponseResource.md)

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

<a id="unlockResourceUsingDELETE"></a>
# **unlockResourceUsingDELETE**
> DataResponseResourceVersion unlockResourceUsingDELETE(domain, id, force, version)

Unlock resource

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResourcesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    UUID id = UUID.randomUUID(); // UUID | id
    Boolean force = false; // Boolean | When set to true, this will break a lock held by another user if the current user is a tenant admin.
    Integer version = 56; // Integer | version
    try {
      DataResponseResourceVersion result = apiInstance.unlockResourceUsingDELETE(domain, id, force, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#unlockResourceUsingDELETE");
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
| **id** | **UUID**| id | |
| **force** | **Boolean**| When set to true, this will break a lock held by another user if the current user is a tenant admin. | [optional] [default to false] |
| **version** | **Integer**| version | [optional] |

### Return type

[**DataResponseResourceVersion**](DataResponseResourceVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="updateContentOfTypeViaFile"></a>
# **updateContentOfTypeViaFile**
> DataResponseResourceVersion updateContentOfTypeViaFile(domain, id, type, _file)

Update additional resource content

Thumbnails for resources are included here as additional content. Expects a form part in the request body with the name \&quot;file\&quot; and will use the contents of that file to update the specified resource.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResourcesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    UUID id = UUID.randomUUID(); // UUID | id
    String type = "thumbnail"; // String | type
    File _file = new File("/path/to/file"); // File | The binary file to upload.
    try {
      DataResponseResourceVersion result = apiInstance.updateContentOfTypeViaFile(domain, id, type, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#updateContentOfTypeViaFile");
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
| **id** | **UUID**| id | |
| **type** | **String**| type | [enum: thumbnail, manifest, old] |
| **_file** | **File**| The binary file to upload. | |

### Return type

[**DataResponseResourceVersion**](DataResponseResourceVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="updateContentViaFileUsingPUT"></a>
# **updateContentViaFileUsingPUT**
> DataResponseResourceVersion updateContentViaFileUsingPUT(domain, id, _file)

Update resource content

Expects a form part in the request body with the name \&quot;file\&quot; and will use the contents of that file to update the specified resource.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResourcesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    UUID id = UUID.randomUUID(); // UUID | id
    File _file = new File("/path/to/file"); // File | The binary file to upload.
    try {
      DataResponseResourceVersion result = apiInstance.updateContentViaFileUsingPUT(domain, id, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#updateContentViaFileUsingPUT");
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
| **id** | **UUID**| id | |
| **_file** | **File**| The binary file to upload. | |

### Return type

[**DataResponseResourceVersion**](DataResponseResourceVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="updateResourceUsingPUT"></a>
# **updateResourceUsingPUT**
> DataResponseResourceVersion updateResourceUsingPUT(domain, id, body)

Upate resource information

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResourcesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    UUID id = UUID.randomUUID(); // UUID | id
    Object body = null; // Object | body
    try {
      DataResponseResourceVersion result = apiInstance.updateResourceUsingPUT(domain, id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#updateResourceUsingPUT");
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
| **id** | **UUID**| id | |
| **body** | **Object**| body | |

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

<a id="updateStateUsingPUT"></a>
# **updateStateUsingPUT**
> DataResponseResourceVersion updateStateUsingPUT(domain, id, stateRequest)

Update the workflow state of a resource

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResourcesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    UUID id = UUID.randomUUID(); // UUID | id
    WorkflowRequestBody stateRequest = new WorkflowRequestBody(); // WorkflowRequestBody | Resource states can be DRAFT, REVIEW, APPROVED, or REJECTED.
    try {
      DataResponseResourceVersion result = apiInstance.updateStateUsingPUT(domain, id, stateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#updateStateUsingPUT");
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
| **id** | **UUID**| id | |
| **stateRequest** | [**WorkflowRequestBody**](WorkflowRequestBody.md)| Resource states can be DRAFT, REVIEW, APPROVED, or REJECTED. | |

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

