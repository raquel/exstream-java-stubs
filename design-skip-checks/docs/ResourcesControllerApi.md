# ResourcesControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createResource**](ResourcesControllerApi.md#createResource) | **POST** /api/v1/resources/{domain} |  |
| [**createResourceFromFile**](ResourcesControllerApi.md#createResourceFromFile) | **POST** /api/v1/resources/{domain}/content |  |
| [**deleteResource**](ResourcesControllerApi.md#deleteResource) | **DELETE** /api/v1/resources/{domain}/{id} |  |
| [**deleteResources**](ResourcesControllerApi.md#deleteResources) | **DELETE** /api/v1/resources/{domain}/delete-bulk |  |
| [**demote**](ResourcesControllerApi.md#demote) | **PUT** /api/v1/resources/{domain}/{id}/demote |  |
| [**getContent**](ResourcesControllerApi.md#getContent) | **GET** /api/v1/resources/{domain}/{id}/content |  |
| [**getResource**](ResourcesControllerApi.md#getResource) | **GET** /api/v1/resources/{domain}/{id} |  |
| [**getResourceContent**](ResourcesControllerApi.md#getResourceContent) | **GET** /api/v1/resources/{domain}/{id}/content/{type} |  |
| [**getResourceHistory**](ResourcesControllerApi.md#getResourceHistory) | **GET** /api/v1/resources/{domain}/history/{resourceId} |  |
| [**getResources**](ResourcesControllerApi.md#getResources) | **GET** /api/v1/resources/{domain} |  |
| [**getResourcesFilterBody**](ResourcesControllerApi.md#getResourcesFilterBody) | **POST** /api/v1/resources/{domain}/filter |  |
| [**hideResource**](ResourcesControllerApi.md#hideResource) | **PUT** /api/v1/resources/{domain}/{id}/hide |  |
| [**lockResource**](ResourcesControllerApi.md#lockResource) | **POST** /api/v1/resources/{domain}/{id}/lock |  |
| [**promote**](ResourcesControllerApi.md#promote) | **PUT** /api/v1/resources/{domain}/{id}/promote |  |
| [**resourceListEtags**](ResourcesControllerApi.md#resourceListEtags) | **POST** /api/v1/resources/{domain}/Etag/Descriptors |  |
| [**revertToOldVersion**](ResourcesControllerApi.md#revertToOldVersion) | **PUT** /api/v1/resources/{domain}/{id}/revert/{oldVersion} |  |
| [**sectionDescendants**](ResourcesControllerApi.md#sectionDescendants) | **GET** /api/v1/resources/{domain}/{id}/sectionDescendants |  |
| [**showResource**](ResourcesControllerApi.md#showResource) | **PUT** /api/v1/resources/{domain}/{id}/show |  |
| [**unlockResource**](ResourcesControllerApi.md#unlockResource) | **DELETE** /api/v1/resources/{domain}/{id}/lock |  |
| [**updateContentOfTypeViaFile**](ResourcesControllerApi.md#updateContentOfTypeViaFile) | **PUT** /api/v1/resources/{domain}/{id}/content/{type} |  |
| [**updateContentViaFile**](ResourcesControllerApi.md#updateContentViaFile) | **PUT** /api/v1/resources/{domain}/{id}/content |  |
| [**updateResource**](ResourcesControllerApi.md#updateResource) | **PUT** /api/v1/resources/{domain}/{id} |  |
| [**updateState**](ResourcesControllerApi.md#updateState) | **PUT** /api/v1/resources/{domain}/{id}/state |  |
| [**updateStates**](ResourcesControllerApi.md#updateStates) | **PUT** /api/v1/resources/{domain}/state |  |


<a id="createResource"></a>
# **createResource**
> DataResponseResourceVersion createResource(domain, contentType, resourceVersion, contentMimeType)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    String contentType = "contentType_example"; // String | 
    ResourceVersion resourceVersion = new ResourceVersion(); // ResourceVersion | 
    String contentMimeType = "contentMimeType_example"; // String | 
    try {
      DataResponseResourceVersion result = apiInstance.createResource(domain, contentType, resourceVersion, contentMimeType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#createResource");
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
| **contentType** | **String**|  | |
| **resourceVersion** | [**ResourceVersion**](ResourceVersion.md)|  | |
| **contentMimeType** | **String**|  | [optional] |

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

<a id="createResourceFromFile"></a>
# **createResourceFromFile**
> DataResponseResourceVersion createResourceFromFile(domain, name, type, subtype, _file)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    String name = "name_example"; // String | The name of the resource to create.
    String type = "all"; // String | The type of resource to create.
    String subtype = "subtype_example"; // String | The subtype of resource to create. Appears in metadata.
    File _file = new File("/path/to/file"); // File | The binary file to upload
    try {
      DataResponseResourceVersion result = apiInstance.createResourceFromFile(domain, name, type, subtype, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#createResourceFromFile");
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
| **name** | **String**| The name of the resource to create. | |
| **type** | **String**| The type of resource to create. | [enum: all, designer, author, designAsset, commAsset, orchestrator, resourcepack, exstrapplication, exstrdocument, exstrpage, exstrcomponentobj, exstremail, exstrengine, exstrvariablebase, exstrpackage, exstrgraphicalmessage, exstrtextmessage, exstrparagraph, exstrparagraphsection, image, samplefile, exstrdatasource, exstrhtml5, versionedtemplate, documentdefinition, enginerundef, font, fontdefinition, exstrbarcode, exstrpapertype, exstrmessagetype, exstrmetadata, orcsettings, flowmodel, exstrcommunicationset, exstroutputqueue, exstroutput, exstrlanguage, exstrlocale, exstrmigrationset, exstrmessaging, exstrmessagingauthor, flowscript, exstrnamedcolor, exstrcolorfamily, exstrstyle, exstrstylesheet, exstrevent, exstrrule, dashboard, pdf] |
| **subtype** | **String**| The subtype of resource to create. Appears in metadata. | [optional] |
| **_file** | **File**| The binary file to upload | [optional] |

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

<a id="deleteResource"></a>
# **deleteResource**
> GenericResponse deleteResource(domain, id, version)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    String version = "version_example"; // String | Valid values are LATEST, ALL, or an actual version number. If not specified, will use LATEST.
    try {
      GenericResponse result = apiInstance.deleteResource(domain, id, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#deleteResource");
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
| **id** | **UUID**|  | |
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

<a id="deleteResources"></a>
# **deleteResources**
> DataResponseBulkDeleteResponse deleteResources(domain, bulkDeleteRequest)



Deletes a list of resources. The version can be LATEST, ALL or an actual version number. If not specified, LATEST is used.

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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    BulkDeleteRequest bulkDeleteRequest = new BulkDeleteRequest(); // BulkDeleteRequest | 
    try {
      DataResponseBulkDeleteResponse result = apiInstance.deleteResources(domain, bulkDeleteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#deleteResources");
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
| **bulkDeleteRequest** | [**BulkDeleteRequest**](BulkDeleteRequest.md)|  | |

### Return type

[**DataResponseBulkDeleteResponse**](DataResponseBulkDeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="demote"></a>
# **demote**
> DataResponseResourceVersion demote(domain, id, domain2, version)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    Domain domain2 = new Domain(); // Domain | 
    Integer version = -1; // Integer | 
    try {
      DataResponseResourceVersion result = apiInstance.demote(domain, id, domain2, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#demote");
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
| **id** | **UUID**|  | |
| **domain2** | [**Domain**](Domain.md)|  | |
| **version** | **Integer**|  | [optional] [default to -1] |

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

<a id="getContent"></a>
# **getContent**
> Object getContent(domain, id, version, state)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    Integer version = 56; // Integer | 
    String state = "DRAFT"; // String | 
    try {
      Object result = apiInstance.getContent(domain, id, version, state);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#getContent");
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
| **id** | **UUID**|  | |
| **version** | **Integer**|  | [optional] |
| **state** | **String**|  | [optional] [enum: DRAFT, REVIEW, APPROVED, REJECTED] |

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

<a id="getResource"></a>
# **getResource**
> DataResponseResourceVersion getResource(domain, id, version, expand, checkIfLatestVersion, state)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    Integer version = 56; // Integer | 
    String expand = "expand_example"; // String | 
    Boolean checkIfLatestVersion = false; // Boolean | 
    String state = "DRAFT"; // String | 
    try {
      DataResponseResourceVersion result = apiInstance.getResource(domain, id, version, expand, checkIfLatestVersion, state);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#getResource");
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
| **id** | **UUID**|  | |
| **version** | **Integer**|  | [optional] |
| **expand** | **String**|  | [optional] |
| **checkIfLatestVersion** | **Boolean**|  | [optional] [default to false] |
| **state** | **String**|  | [optional] [enum: DRAFT, REVIEW, APPROVED, REJECTED] |

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

<a id="getResourceContent"></a>
# **getResourceContent**
> Object getResourceContent(domain, id, type, version, state)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    String type = "thumbnail"; // String | 
    Integer version = 56; // Integer | 
    String state = "DRAFT"; // String | 
    try {
      Object result = apiInstance.getResourceContent(domain, id, type, version, state);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#getResourceContent");
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
| **id** | **UUID**|  | |
| **type** | **String**|  | [enum: thumbnail, manifest, old] |
| **version** | **Integer**|  | [optional] |
| **state** | **String**|  | [optional] [enum: DRAFT, REVIEW, APPROVED, REJECTED] |

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

<a id="getResourceHistory"></a>
# **getResourceHistory**
> ListResponseResourceHistory getResourceHistory(domain, resourceId, fetchAcrossDomains, historyType)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID resourceId = UUID.randomUUID(); // UUID | 
    Boolean fetchAcrossDomains = true; // Boolean | 
    String historyType = "CREATE"; // String | 
    try {
      ListResponseResourceHistory result = apiInstance.getResourceHistory(domain, resourceId, fetchAcrossDomains, historyType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#getResourceHistory");
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
| **resourceId** | **UUID**|  | |
| **fetchAcrossDomains** | **Boolean**|  | [optional] |
| **historyType** | **String**|  | [optional] [enum: CREATE, STATE, METADATA, CONTENT] |

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

<a id="getResources"></a>
# **getResources**
> PageResponseResourceVersion getResources(domain, filterIds, filterExcludedIds, filterTypes, filterExcludedTypes, filterName, filterDescription, filterCreatedBy, filterLastModifiedBy, filterCreatedDateStart, filterCreatedDateEnd, filterLastModifiedDateStart, filterLastModifiedDateEnd, filterSearchString, filterCaseSensitive, filterWholeWord, filterResourcePackId, filterSystemResource, filterHidden, filterHasApprovedVersion, filterStandardVariantId, filterUseEffectiveDate, filterEffectiveDate, filterCategories, filterCategoryObjects, filterVfilterLastModifiedDateEnd, filterDomainId, filterLatestVersion, filterLocked, filterStates, filterOverrideIds, filterOverrideStates, advancedFilter, offset, count, fetchDomains, fetchPermissions, fetchCategories, fetchVariants, fetchApproval, expand)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    List<UUID> filterIds = Arrays.asList(); // List<UUID> | 
    List<UUID> filterExcludedIds = Arrays.asList(); // List<UUID> | 
    List<String> filterTypes = Arrays.asList(); // List<String> | 
    List<String> filterExcludedTypes = Arrays.asList(); // List<String> | 
    String filterName = "filterName_example"; // String | 
    String filterDescription = "filterDescription_example"; // String | 
    String filterCreatedBy = "filterCreatedBy_example"; // String | 
    String filterLastModifiedBy = "filterLastModifiedBy_example"; // String | 
    OffsetDateTime filterCreatedDateStart = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime filterCreatedDateEnd = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime filterLastModifiedDateStart = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime filterLastModifiedDateEnd = OffsetDateTime.now(); // OffsetDateTime | 
    String filterSearchString = "filterSearchString_example"; // String | This is equivalent to searching where the name OR the description is LIKE this value
    Boolean filterCaseSensitive = true; // Boolean | 
    Boolean filterWholeWord = true; // Boolean | 
    UUID filterResourcePackId = UUID.randomUUID(); // UUID | 
    Boolean filterSystemResource = true; // Boolean | 
    Boolean filterHidden = true; // Boolean | 
    Boolean filterHasApprovedVersion = true; // Boolean | 
    UUID filterStandardVariantId = UUID.randomUUID(); // UUID | 
    Boolean filterUseEffectiveDate = true; // Boolean | 
    OffsetDateTime filterEffectiveDate = OffsetDateTime.now(); // OffsetDateTime | 
    List<String> filterCategories = Arrays.asList(); // List<String> | 
    List<ResourceCategory> filterCategoryObjects = Arrays.asList(); // List<ResourceCategory> | 
    OffsetDateTime filterVfilterLastModifiedDateEnd = OffsetDateTime.now(); // OffsetDateTime | 
    String filterDomainId = "filterDomainId_example"; // String | only include resources in this domain
    Boolean filterLatestVersion = true; // Boolean | only include the latest version of objects
    Boolean filterLocked = true; // Boolean | 
    List<String> filterStates = Arrays.asList(); // List<String> | 
    List<UUID> filterOverrideIds = Arrays.asList(); // List<UUID> | 
    List<String> filterOverrideStates = Arrays.asList(); // List<String> | 
    String advancedFilter = "advancedFilter_example"; // String | 
    Integer offset = 0; // Integer | For pagination, fetch entities after this many
    Integer count = 1000; // Integer | For pagination, the number of entities per page
    Boolean fetchDomains = false; // Boolean | 
    Boolean fetchPermissions = false; // Boolean | 
    Boolean fetchCategories = false; // Boolean | 
    Boolean fetchVariants = false; // Boolean | 
    Boolean fetchApproval = false; // Boolean | 
    String expand = "expand_example"; // String | 
    try {
      PageResponseResourceVersion result = apiInstance.getResources(domain, filterIds, filterExcludedIds, filterTypes, filterExcludedTypes, filterName, filterDescription, filterCreatedBy, filterLastModifiedBy, filterCreatedDateStart, filterCreatedDateEnd, filterLastModifiedDateStart, filterLastModifiedDateEnd, filterSearchString, filterCaseSensitive, filterWholeWord, filterResourcePackId, filterSystemResource, filterHidden, filterHasApprovedVersion, filterStandardVariantId, filterUseEffectiveDate, filterEffectiveDate, filterCategories, filterCategoryObjects, filterVfilterLastModifiedDateEnd, filterDomainId, filterLatestVersion, filterLocked, filterStates, filterOverrideIds, filterOverrideStates, advancedFilter, offset, count, fetchDomains, fetchPermissions, fetchCategories, fetchVariants, fetchApproval, expand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#getResources");
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
| **filterIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **filterExcludedIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **filterTypes** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: all, designer, author, designAsset, commAsset, orchestrator, resourcepack, exstrapplication, exstrdocument, exstrpage, exstrcomponentobj, exstremail, exstrengine, exstrvariablebase, exstrpackage, exstrgraphicalmessage, exstrtextmessage, exstrparagraph, exstrparagraphsection, image, samplefile, exstrdatasource, exstrhtml5, versionedtemplate, documentdefinition, enginerundef, font, fontdefinition, exstrbarcode, exstrpapertype, exstrmessagetype, exstrmetadata, orcsettings, flowmodel, exstrcommunicationset, exstroutputqueue, exstroutput, exstrlanguage, exstrlocale, exstrmigrationset, exstrmessaging, exstrmessagingauthor, flowscript, exstrnamedcolor, exstrcolorfamily, exstrstyle, exstrstylesheet, exstrevent, exstrrule, dashboard, pdf] |
| **filterExcludedTypes** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: all, designer, author, designAsset, commAsset, orchestrator, resourcepack, exstrapplication, exstrdocument, exstrpage, exstrcomponentobj, exstremail, exstrengine, exstrvariablebase, exstrpackage, exstrgraphicalmessage, exstrtextmessage, exstrparagraph, exstrparagraphsection, image, samplefile, exstrdatasource, exstrhtml5, versionedtemplate, documentdefinition, enginerundef, font, fontdefinition, exstrbarcode, exstrpapertype, exstrmessagetype, exstrmetadata, orcsettings, flowmodel, exstrcommunicationset, exstroutputqueue, exstroutput, exstrlanguage, exstrlocale, exstrmigrationset, exstrmessaging, exstrmessagingauthor, flowscript, exstrnamedcolor, exstrcolorfamily, exstrstyle, exstrstylesheet, exstrevent, exstrrule, dashboard, pdf] |
| **filterName** | **String**|  | [optional] |
| **filterDescription** | **String**|  | [optional] |
| **filterCreatedBy** | **String**|  | [optional] |
| **filterLastModifiedBy** | **String**|  | [optional] |
| **filterCreatedDateStart** | **OffsetDateTime**|  | [optional] |
| **filterCreatedDateEnd** | **OffsetDateTime**|  | [optional] |
| **filterLastModifiedDateStart** | **OffsetDateTime**|  | [optional] |
| **filterLastModifiedDateEnd** | **OffsetDateTime**|  | [optional] |
| **filterSearchString** | **String**| This is equivalent to searching where the name OR the description is LIKE this value | [optional] |
| **filterCaseSensitive** | **Boolean**|  | [optional] |
| **filterWholeWord** | **Boolean**|  | [optional] |
| **filterResourcePackId** | **UUID**|  | [optional] |
| **filterSystemResource** | **Boolean**|  | [optional] |
| **filterHidden** | **Boolean**|  | [optional] |
| **filterHasApprovedVersion** | **Boolean**|  | [optional] |
| **filterStandardVariantId** | **UUID**|  | [optional] |
| **filterUseEffectiveDate** | **Boolean**|  | [optional] |
| **filterEffectiveDate** | **OffsetDateTime**|  | [optional] |
| **filterCategories** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **filterCategoryObjects** | [**List&lt;ResourceCategory&gt;**](ResourceCategory.md)|  | [optional] |
| **filterVfilterLastModifiedDateEnd** | **OffsetDateTime**|  | [optional] |
| **filterDomainId** | **String**| only include resources in this domain | [optional] |
| **filterLatestVersion** | **Boolean**| only include the latest version of objects | [optional] |
| **filterLocked** | **Boolean**|  | [optional] |
| **filterStates** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DRAFT, REVIEW, APPROVED, REJECTED] |
| **filterOverrideIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **filterOverrideStates** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DRAFT, REVIEW, APPROVED, REJECTED] |
| **advancedFilter** | **String**|  | [optional] |
| **offset** | **Integer**| For pagination, fetch entities after this many | [optional] |
| **count** | **Integer**| For pagination, the number of entities per page | [optional] |
| **fetchDomains** | **Boolean**|  | [optional] [default to false] |
| **fetchPermissions** | **Boolean**|  | [optional] [default to false] |
| **fetchCategories** | **Boolean**|  | [optional] [default to false] |
| **fetchVariants** | **Boolean**|  | [optional] [default to false] |
| **fetchApproval** | **Boolean**|  | [optional] [default to false] |
| **expand** | **String**|  | [optional] |

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

<a id="getResourcesFilterBody"></a>
# **getResourcesFilterBody**
> PageResponseResourceVersion getResourcesFilterBody(domain, resourceFilter, filterIds, filterExcludedIds, filterTypes, filterExcludedTypes, filterName, filterDescription, filterCreatedBy, filterLastModifiedBy, filterCreatedDateStart, filterCreatedDateEnd, filterLastModifiedDateStart, filterLastModifiedDateEnd, filterSearchString, filterCaseSensitive, filterWholeWord, filterResourcePackId, filterSystemResource, filterHidden, filterHasApprovedVersion, filterStandardVariantId, filterUseEffectiveDate, filterEffectiveDate, filterCategories, filterCategoryObjects, filterVfilterLastModifiedDateEnd, filterDomainId, filterLatestVersion, filterLocked, filterStates, filterOverrideIds, filterOverrideStates, advancedFilter, offset, count, fetchDomains, fetchPermissions, fetchCategories, fetchVariants, fetchApproval, expand)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    ResourceFilter resourceFilter = new ResourceFilter(); // ResourceFilter | 
    List<UUID> filterIds = Arrays.asList(); // List<UUID> | 
    List<UUID> filterExcludedIds = Arrays.asList(); // List<UUID> | 
    List<String> filterTypes = Arrays.asList(); // List<String> | 
    List<String> filterExcludedTypes = Arrays.asList(); // List<String> | 
    String filterName = "filterName_example"; // String | 
    String filterDescription = "filterDescription_example"; // String | 
    String filterCreatedBy = "filterCreatedBy_example"; // String | 
    String filterLastModifiedBy = "filterLastModifiedBy_example"; // String | 
    OffsetDateTime filterCreatedDateStart = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime filterCreatedDateEnd = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime filterLastModifiedDateStart = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime filterLastModifiedDateEnd = OffsetDateTime.now(); // OffsetDateTime | 
    String filterSearchString = "filterSearchString_example"; // String | This is equivalent to searching where the name OR the description is LIKE this value
    Boolean filterCaseSensitive = true; // Boolean | 
    Boolean filterWholeWord = true; // Boolean | 
    UUID filterResourcePackId = UUID.randomUUID(); // UUID | 
    Boolean filterSystemResource = true; // Boolean | 
    Boolean filterHidden = true; // Boolean | 
    Boolean filterHasApprovedVersion = true; // Boolean | 
    UUID filterStandardVariantId = UUID.randomUUID(); // UUID | 
    Boolean filterUseEffectiveDate = true; // Boolean | 
    OffsetDateTime filterEffectiveDate = OffsetDateTime.now(); // OffsetDateTime | 
    List<String> filterCategories = Arrays.asList(); // List<String> | 
    List<ResourceCategory> filterCategoryObjects = Arrays.asList(); // List<ResourceCategory> | 
    OffsetDateTime filterVfilterLastModifiedDateEnd = OffsetDateTime.now(); // OffsetDateTime | 
    String filterDomainId = "filterDomainId_example"; // String | only include resources in this domain
    Boolean filterLatestVersion = true; // Boolean | only include the latest version of objects
    Boolean filterLocked = true; // Boolean | 
    List<String> filterStates = Arrays.asList(); // List<String> | 
    List<UUID> filterOverrideIds = Arrays.asList(); // List<UUID> | 
    List<String> filterOverrideStates = Arrays.asList(); // List<String> | 
    String advancedFilter = "advancedFilter_example"; // String | 
    Integer offset = 0; // Integer | For pagination, fetch entities after this many
    Integer count = 1000; // Integer | For pagination, the number of entities per page
    Boolean fetchDomains = false; // Boolean | 
    Boolean fetchPermissions = false; // Boolean | 
    Boolean fetchCategories = false; // Boolean | 
    Boolean fetchVariants = false; // Boolean | 
    Boolean fetchApproval = false; // Boolean | 
    String expand = "expand_example"; // String | 
    try {
      PageResponseResourceVersion result = apiInstance.getResourcesFilterBody(domain, resourceFilter, filterIds, filterExcludedIds, filterTypes, filterExcludedTypes, filterName, filterDescription, filterCreatedBy, filterLastModifiedBy, filterCreatedDateStart, filterCreatedDateEnd, filterLastModifiedDateStart, filterLastModifiedDateEnd, filterSearchString, filterCaseSensitive, filterWholeWord, filterResourcePackId, filterSystemResource, filterHidden, filterHasApprovedVersion, filterStandardVariantId, filterUseEffectiveDate, filterEffectiveDate, filterCategories, filterCategoryObjects, filterVfilterLastModifiedDateEnd, filterDomainId, filterLatestVersion, filterLocked, filterStates, filterOverrideIds, filterOverrideStates, advancedFilter, offset, count, fetchDomains, fetchPermissions, fetchCategories, fetchVariants, fetchApproval, expand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#getResourcesFilterBody");
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
| **resourceFilter** | [**ResourceFilter**](ResourceFilter.md)|  | |
| **filterIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **filterExcludedIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **filterTypes** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: all, designer, author, designAsset, commAsset, orchestrator, resourcepack, exstrapplication, exstrdocument, exstrpage, exstrcomponentobj, exstremail, exstrengine, exstrvariablebase, exstrpackage, exstrgraphicalmessage, exstrtextmessage, exstrparagraph, exstrparagraphsection, image, samplefile, exstrdatasource, exstrhtml5, versionedtemplate, documentdefinition, enginerundef, font, fontdefinition, exstrbarcode, exstrpapertype, exstrmessagetype, exstrmetadata, orcsettings, flowmodel, exstrcommunicationset, exstroutputqueue, exstroutput, exstrlanguage, exstrlocale, exstrmigrationset, exstrmessaging, exstrmessagingauthor, flowscript, exstrnamedcolor, exstrcolorfamily, exstrstyle, exstrstylesheet, exstrevent, exstrrule, dashboard, pdf] |
| **filterExcludedTypes** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: all, designer, author, designAsset, commAsset, orchestrator, resourcepack, exstrapplication, exstrdocument, exstrpage, exstrcomponentobj, exstremail, exstrengine, exstrvariablebase, exstrpackage, exstrgraphicalmessage, exstrtextmessage, exstrparagraph, exstrparagraphsection, image, samplefile, exstrdatasource, exstrhtml5, versionedtemplate, documentdefinition, enginerundef, font, fontdefinition, exstrbarcode, exstrpapertype, exstrmessagetype, exstrmetadata, orcsettings, flowmodel, exstrcommunicationset, exstroutputqueue, exstroutput, exstrlanguage, exstrlocale, exstrmigrationset, exstrmessaging, exstrmessagingauthor, flowscript, exstrnamedcolor, exstrcolorfamily, exstrstyle, exstrstylesheet, exstrevent, exstrrule, dashboard, pdf] |
| **filterName** | **String**|  | [optional] |
| **filterDescription** | **String**|  | [optional] |
| **filterCreatedBy** | **String**|  | [optional] |
| **filterLastModifiedBy** | **String**|  | [optional] |
| **filterCreatedDateStart** | **OffsetDateTime**|  | [optional] |
| **filterCreatedDateEnd** | **OffsetDateTime**|  | [optional] |
| **filterLastModifiedDateStart** | **OffsetDateTime**|  | [optional] |
| **filterLastModifiedDateEnd** | **OffsetDateTime**|  | [optional] |
| **filterSearchString** | **String**| This is equivalent to searching where the name OR the description is LIKE this value | [optional] |
| **filterCaseSensitive** | **Boolean**|  | [optional] |
| **filterWholeWord** | **Boolean**|  | [optional] |
| **filterResourcePackId** | **UUID**|  | [optional] |
| **filterSystemResource** | **Boolean**|  | [optional] |
| **filterHidden** | **Boolean**|  | [optional] |
| **filterHasApprovedVersion** | **Boolean**|  | [optional] |
| **filterStandardVariantId** | **UUID**|  | [optional] |
| **filterUseEffectiveDate** | **Boolean**|  | [optional] |
| **filterEffectiveDate** | **OffsetDateTime**|  | [optional] |
| **filterCategories** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **filterCategoryObjects** | [**List&lt;ResourceCategory&gt;**](ResourceCategory.md)|  | [optional] |
| **filterVfilterLastModifiedDateEnd** | **OffsetDateTime**|  | [optional] |
| **filterDomainId** | **String**| only include resources in this domain | [optional] |
| **filterLatestVersion** | **Boolean**| only include the latest version of objects | [optional] |
| **filterLocked** | **Boolean**|  | [optional] |
| **filterStates** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DRAFT, REVIEW, APPROVED, REJECTED] |
| **filterOverrideIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **filterOverrideStates** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DRAFT, REVIEW, APPROVED, REJECTED] |
| **advancedFilter** | **String**|  | [optional] |
| **offset** | **Integer**| For pagination, fetch entities after this many | [optional] |
| **count** | **Integer**| For pagination, the number of entities per page | [optional] |
| **fetchDomains** | **Boolean**|  | [optional] [default to false] |
| **fetchPermissions** | **Boolean**|  | [optional] [default to false] |
| **fetchCategories** | **Boolean**|  | [optional] [default to false] |
| **fetchVariants** | **Boolean**|  | [optional] [default to false] |
| **fetchApproval** | **Boolean**|  | [optional] [default to false] |
| **expand** | **String**|  | [optional] |

### Return type

[**PageResponseResourceVersion**](PageResponseResourceVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="hideResource"></a>
# **hideResource**
> DataResponseResource hideResource(id)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      DataResponseResource result = apiInstance.hideResource(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#hideResource");
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

<a id="lockResource"></a>
# **lockResource**
> DataResponseResourceVersion lockResource(domain, id, version)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    Integer version = 56; // Integer | 
    try {
      DataResponseResourceVersion result = apiInstance.lockResource(domain, id, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#lockResource");
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
| **id** | **UUID**|  | |
| **version** | **Integer**|  | [optional] |

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

<a id="promote"></a>
# **promote**
> DataResponseResourceVersion promote(domain, id, domain2, version)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    Domain domain2 = new Domain(); // Domain | 
    Integer version = -1; // Integer | 
    try {
      DataResponseResourceVersion result = apiInstance.promote(domain, id, domain2, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#promote");
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
| **id** | **UUID**|  | |
| **domain2** | [**Domain**](Domain.md)|  | |
| **version** | **Integer**|  | [optional] [default to -1] |

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

<a id="resourceListEtags"></a>
# **resourceListEtags**
> EtagDescriptorResponse resourceListEtags(domain, etagDescriptorRequest)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    EtagDescriptorRequest etagDescriptorRequest = new EtagDescriptorRequest(); // EtagDescriptorRequest | 
    try {
      EtagDescriptorResponse result = apiInstance.resourceListEtags(domain, etagDescriptorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#resourceListEtags");
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
| **etagDescriptorRequest** | [**EtagDescriptorRequest**](EtagDescriptorRequest.md)|  | |

### Return type

[**EtagDescriptorResponse**](EtagDescriptorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="revertToOldVersion"></a>
# **revertToOldVersion**
> DataResponseResourceVersion revertToOldVersion(domain, id, oldVersion, commentRequestBody)



Replace the content of the current draft, or create a new draft with content of specified version. Copies links as well.

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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    Integer oldVersion = 56; // Integer | 
    CommentRequestBody commentRequestBody = new CommentRequestBody(); // CommentRequestBody | 
    try {
      DataResponseResourceVersion result = apiInstance.revertToOldVersion(domain, id, oldVersion, commentRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#revertToOldVersion");
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
| **id** | **UUID**|  | |
| **oldVersion** | **Integer**|  | |
| **commentRequestBody** | [**CommentRequestBody**](CommentRequestBody.md)|  | [optional] |

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

<a id="sectionDescendants"></a>
# **sectionDescendants**
> DataResponseTreeResourceVersion sectionDescendants(domain, id, latestApproved)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    Boolean latestApproved = false; // Boolean | 
    try {
      DataResponseTreeResourceVersion result = apiInstance.sectionDescendants(domain, id, latestApproved);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#sectionDescendants");
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
| **id** | **UUID**|  | |
| **latestApproved** | **Boolean**|  | [optional] [default to false] |

### Return type

[**DataResponseTreeResourceVersion**](DataResponseTreeResourceVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="showResource"></a>
# **showResource**
> DataResponseResource showResource(id)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      DataResponseResource result = apiInstance.showResource(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#showResource");
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

<a id="unlockResource"></a>
# **unlockResource**
> DataResponseResourceVersion unlockResource(domain, id, version, force)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    Integer version = 56; // Integer | 
    Boolean force = false; // Boolean | When set to true, this will break a lock held by another user if the current user is a tenant admin.
    try {
      DataResponseResourceVersion result = apiInstance.unlockResource(domain, id, version, force);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#unlockResource");
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
| **id** | **UUID**|  | |
| **version** | **Integer**|  | [optional] |
| **force** | **Boolean**| When set to true, this will break a lock held by another user if the current user is a tenant admin. | [optional] [default to false] |

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

<a id="updateContentOfTypeViaFile"></a>
# **updateContentOfTypeViaFile**
> DataResponseResourceVersion updateContentOfTypeViaFile(domain, id, type, _file)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    String type = "thumbnail"; // String | 
    File _file = new File("/path/to/file"); // File | The binary file to upload
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
| **domain** | **String**|  | |
| **id** | **UUID**|  | |
| **type** | **String**|  | [enum: thumbnail, manifest, old] |
| **_file** | **File**| The binary file to upload | [optional] |

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

<a id="updateContentViaFile"></a>
# **updateContentViaFile**
> DataResponseResourceVersion updateContentViaFile(domain, id, _file)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    File _file = new File("/path/to/file"); // File | The binary file to upload
    try {
      DataResponseResourceVersion result = apiInstance.updateContentViaFile(domain, id, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#updateContentViaFile");
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
| **id** | **UUID**|  | |
| **_file** | **File**| The binary file to upload | [optional] |

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

<a id="updateResource"></a>
# **updateResource**
> DataResponseResourceVersion updateResource(domain, id, body)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    Object body = null; // Object | 
    try {
      DataResponseResourceVersion result = apiInstance.updateResource(domain, id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#updateResource");
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
| **id** | **UUID**|  | |
| **body** | **Object**|  | |

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

<a id="updateState"></a>
# **updateState**
> DataResponseResourceVersion updateState(domain, id, workflowRequestBody)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    WorkflowRequestBody workflowRequestBody = new WorkflowRequestBody(); // WorkflowRequestBody | 
    try {
      DataResponseResourceVersion result = apiInstance.updateState(domain, id, workflowRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#updateState");
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
| **id** | **UUID**|  | |
| **workflowRequestBody** | [**WorkflowRequestBody**](WorkflowRequestBody.md)|  | |

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

<a id="updateStates"></a>
# **updateStates**
> DataResponseBulkWorkflowStateChangeResponse updateStates(domain, bulkWorkflowRequestBody)



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
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    ResourcesControllerApi apiInstance = new ResourcesControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    BulkWorkflowRequestBody bulkWorkflowRequestBody = new BulkWorkflowRequestBody(); // BulkWorkflowRequestBody | 
    try {
      DataResponseBulkWorkflowStateChangeResponse result = apiInstance.updateStates(domain, bulkWorkflowRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesControllerApi#updateStates");
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
| **bulkWorkflowRequestBody** | [**BulkWorkflowRequestBody**](BulkWorkflowRequestBody.md)|  | |

### Return type

[**DataResponseBulkWorkflowStateChangeResponse**](DataResponseBulkWorkflowStateChangeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

