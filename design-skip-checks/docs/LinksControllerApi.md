# LinksControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLink**](LinksControllerApi.md#createLink) | **POST** /api/v1/links/{domain} |  |
| [**createLinks**](LinksControllerApi.md#createLinks) | **POST** /api/v1/links/{domain}/multiple |  |
| [**deleteLink**](LinksControllerApi.md#deleteLink) | **DELETE** /api/v1/links/{domain} |  |
| [**deleteLinks**](LinksControllerApi.md#deleteLinks) | **DELETE** /api/v1/links/{domain}/multiple |  |
| [**getLinks**](LinksControllerApi.md#getLinks) | **GET** /api/v1/links/{domain} |  |
| [**getResources1**](LinksControllerApi.md#getResources1) | **GET** /api/v1/links/{domain}/resources |  |


<a id="createLink"></a>
# **createLink**
> DataResponseLinkDTO createLink(domain, linkDTO)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LinksControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    LinksControllerApi apiInstance = new LinksControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    LinkDTO linkDTO = new LinkDTO(); // LinkDTO | 
    try {
      DataResponseLinkDTO result = apiInstance.createLink(domain, linkDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksControllerApi#createLink");
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
| **linkDTO** | [**LinkDTO**](LinkDTO.md)|  | |

### Return type

[**DataResponseLinkDTO**](DataResponseLinkDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createLinks"></a>
# **createLinks**
> ListResponseLinkDTO createLinks(domain, multipleLinksBody)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LinksControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    LinksControllerApi apiInstance = new LinksControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    MultipleLinksBody multipleLinksBody = new MultipleLinksBody(); // MultipleLinksBody | 
    try {
      ListResponseLinkDTO result = apiInstance.createLinks(domain, multipleLinksBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksControllerApi#createLinks");
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
| **multipleLinksBody** | [**MultipleLinksBody**](MultipleLinksBody.md)|  | |

### Return type

[**ListResponseLinkDTO**](ListResponseLinkDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteLink"></a>
# **deleteLink**
> GenericResponse deleteLink(domain, linkDTO)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LinksControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    LinksControllerApi apiInstance = new LinksControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    LinkDTO linkDTO = new LinkDTO(); // LinkDTO | 
    try {
      GenericResponse result = apiInstance.deleteLink(domain, linkDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksControllerApi#deleteLink");
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
| **linkDTO** | [**LinkDTO**](LinkDTO.md)|  | |

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

<a id="deleteLinks"></a>
# **deleteLinks**
> GenericResponse deleteLinks(domain, multipleLinksBody)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LinksControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    LinksControllerApi apiInstance = new LinksControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    MultipleLinksBody multipleLinksBody = new MultipleLinksBody(); // MultipleLinksBody | 
    try {
      GenericResponse result = apiInstance.deleteLinks(domain, multipleLinksBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksControllerApi#deleteLinks");
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
| **multipleLinksBody** | [**MultipleLinksBody**](MultipleLinksBody.md)|  | |

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

<a id="getLinks"></a>
# **getLinks**
> PageResponseLinkDTO getLinks(domain, linkSubjectId, linkSubjectVersion, linkObjectId, linkDepth, filterIds, filterExcludedIds, filterTypes, filterExcludedTypes, filterName, filterDescription, filterCreatedBy, filterLastModifiedBy, filterCreatedDateStart, filterCreatedDateEnd, filterLastModifiedDateStart, filterLastModifiedDateEnd, filterSearchString, filterCaseSensitive, filterWholeWord, filterResourcePackId, filterSystemResource, filterHidden, filterHasApprovedVersion, filterStandardVariantId, filterUseEffectiveDate, filterEffectiveDate, filterCategories, filterCategoryObjects, filterVfilterLastModifiedDateEnd, filterDomainId, filterLatestVersion, filterLocked, filterStates, filterOverrideIds, filterOverrideStates, vfilterIds, vfilterExcludedIds, vfilterTypes, vfilterExcludedTypes, vfilterName, vfilterDescription, vfilterCreatedBy, vfilterLastModifiedBy, vfilterCreatedDateStart, vfilterCreatedDateEnd, vfilterLastModifiedDateStart, vfilterLastModifiedDateEnd, vfilterSearchString, vfilterCaseSensitive, vfilterWholeWord, vfilterResourcePackId, vfilterSystemResource, vfilterHidden, vfilterHasApprovedVersion, vfilterStandardVariantId, vfilterUseEffectiveDate, vfilterEffectiveDate, vfilterCategories, vfilterCategoryObjects, vfilterVfilterLastModifiedDateEnd, vfilterDomainId, vfilterLatestVersion, vfilterLocked, vfilterStates, vfilterOverrideIds, vfilterOverrideStates, tfilterIds, tfilterExcludedIds, tfilterTypes, tfilterExcludedTypes, tfilterName, tfilterDescription, tfilterCreatedBy, tfilterLastModifiedBy, tfilterCreatedDateStart, tfilterCreatedDateEnd, tfilterLastModifiedDateStart, tfilterLastModifiedDateEnd, tfilterSearchString, tfilterCaseSensitive, tfilterWholeWord, tfilterResourcePackId, tfilterSystemResource, tfilterHidden, tfilterHasApprovedVersion, tfilterStandardVariantId, tfilterUseEffectiveDate, tfilterEffectiveDate, tfilterCategories, tfilterCategoryObjects, tfilterVfilterLastModifiedDateEnd, tfilterDomainId, tfilterLatestVersion, tfilterLocked, tfilterStates, tfilterOverrideIds, tfilterOverrideStates, rfilterIds, rfilterExcludedIds, rfilterTypes, rfilterExcludedTypes, rfilterName, rfilterDescription, rfilterCreatedBy, rfilterLastModifiedBy, rfilterCreatedDateStart, rfilterCreatedDateEnd, rfilterLastModifiedDateStart, rfilterLastModifiedDateEnd, rfilterSearchString, rfilterCaseSensitive, rfilterWholeWord, rfilterResourcePackId, rfilterSystemResource, rfilterHidden, rfilterHasApprovedVersion, rfilterStandardVariantId, rfilterUseEffectiveDate, rfilterEffectiveDate, rfilterCategories, rfilterCategoryObjects, rfilterVfilterLastModifiedDateEnd, rfilterDomainId, rfilterLatestVersion, rfilterLocked, rfilterStates, rfilterOverrideIds, rfilterOverrideStates, useEffectiveDate, effectiveDate, offset, count)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LinksControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    LinksControllerApi apiInstance = new LinksControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID linkSubjectId = UUID.randomUUID(); // UUID | 
    Integer linkSubjectVersion = 56; // Integer | 
    UUID linkObjectId = UUID.randomUUID(); // UUID | 
    Integer linkDepth = 1000; // Integer | Optionally specify the maximum depth for a recursive traversal of a link tree.
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
    List<UUID> vfilterIds = Arrays.asList(); // List<UUID> | 
    List<UUID> vfilterExcludedIds = Arrays.asList(); // List<UUID> | 
    List<String> vfilterTypes = Arrays.asList(); // List<String> | 
    List<String> vfilterExcludedTypes = Arrays.asList(); // List<String> | 
    String vfilterName = "vfilterName_example"; // String | 
    String vfilterDescription = "vfilterDescription_example"; // String | 
    String vfilterCreatedBy = "vfilterCreatedBy_example"; // String | 
    String vfilterLastModifiedBy = "vfilterLastModifiedBy_example"; // String | 
    OffsetDateTime vfilterCreatedDateStart = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime vfilterCreatedDateEnd = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime vfilterLastModifiedDateStart = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime vfilterLastModifiedDateEnd = OffsetDateTime.now(); // OffsetDateTime | 
    String vfilterSearchString = "vfilterSearchString_example"; // String | This is equivalent to searching where the name OR the description is LIKE this value
    Boolean vfilterCaseSensitive = true; // Boolean | 
    Boolean vfilterWholeWord = true; // Boolean | 
    UUID vfilterResourcePackId = UUID.randomUUID(); // UUID | 
    Boolean vfilterSystemResource = true; // Boolean | 
    Boolean vfilterHidden = true; // Boolean | 
    Boolean vfilterHasApprovedVersion = true; // Boolean | 
    UUID vfilterStandardVariantId = UUID.randomUUID(); // UUID | 
    Boolean vfilterUseEffectiveDate = true; // Boolean | 
    OffsetDateTime vfilterEffectiveDate = OffsetDateTime.now(); // OffsetDateTime | 
    List<String> vfilterCategories = Arrays.asList(); // List<String> | 
    List<ResourceCategory> vfilterCategoryObjects = Arrays.asList(); // List<ResourceCategory> | 
    OffsetDateTime vfilterVfilterLastModifiedDateEnd = OffsetDateTime.now(); // OffsetDateTime | 
    String vfilterDomainId = "vfilterDomainId_example"; // String | only include resources in this domain
    Boolean vfilterLatestVersion = true; // Boolean | only include the latest version of objects
    Boolean vfilterLocked = true; // Boolean | 
    List<String> vfilterStates = Arrays.asList(); // List<String> | 
    List<UUID> vfilterOverrideIds = Arrays.asList(); // List<UUID> | 
    List<String> vfilterOverrideStates = Arrays.asList(); // List<String> | 
    List<UUID> tfilterIds = Arrays.asList(); // List<UUID> | 
    List<UUID> tfilterExcludedIds = Arrays.asList(); // List<UUID> | 
    List<String> tfilterTypes = Arrays.asList(); // List<String> | 
    List<String> tfilterExcludedTypes = Arrays.asList(); // List<String> | 
    String tfilterName = "tfilterName_example"; // String | 
    String tfilterDescription = "tfilterDescription_example"; // String | 
    String tfilterCreatedBy = "tfilterCreatedBy_example"; // String | 
    String tfilterLastModifiedBy = "tfilterLastModifiedBy_example"; // String | 
    OffsetDateTime tfilterCreatedDateStart = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime tfilterCreatedDateEnd = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime tfilterLastModifiedDateStart = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime tfilterLastModifiedDateEnd = OffsetDateTime.now(); // OffsetDateTime | 
    String tfilterSearchString = "tfilterSearchString_example"; // String | This is equivalent to searching where the name OR the description is LIKE this value
    Boolean tfilterCaseSensitive = true; // Boolean | 
    Boolean tfilterWholeWord = true; // Boolean | 
    UUID tfilterResourcePackId = UUID.randomUUID(); // UUID | 
    Boolean tfilterSystemResource = true; // Boolean | 
    Boolean tfilterHidden = true; // Boolean | 
    Boolean tfilterHasApprovedVersion = true; // Boolean | 
    UUID tfilterStandardVariantId = UUID.randomUUID(); // UUID | 
    Boolean tfilterUseEffectiveDate = true; // Boolean | 
    OffsetDateTime tfilterEffectiveDate = OffsetDateTime.now(); // OffsetDateTime | 
    List<String> tfilterCategories = Arrays.asList(); // List<String> | 
    List<ResourceCategory> tfilterCategoryObjects = Arrays.asList(); // List<ResourceCategory> | 
    OffsetDateTime tfilterVfilterLastModifiedDateEnd = OffsetDateTime.now(); // OffsetDateTime | 
    String tfilterDomainId = "tfilterDomainId_example"; // String | only include resources in this domain
    Boolean tfilterLatestVersion = true; // Boolean | only include the latest version of objects
    Boolean tfilterLocked = true; // Boolean | 
    List<String> tfilterStates = Arrays.asList(); // List<String> | 
    List<UUID> tfilterOverrideIds = Arrays.asList(); // List<UUID> | 
    List<String> tfilterOverrideStates = Arrays.asList(); // List<String> | 
    List<UUID> rfilterIds = Arrays.asList(); // List<UUID> | 
    List<UUID> rfilterExcludedIds = Arrays.asList(); // List<UUID> | 
    List<String> rfilterTypes = Arrays.asList(); // List<String> | 
    List<String> rfilterExcludedTypes = Arrays.asList(); // List<String> | 
    String rfilterName = "rfilterName_example"; // String | 
    String rfilterDescription = "rfilterDescription_example"; // String | 
    String rfilterCreatedBy = "rfilterCreatedBy_example"; // String | 
    String rfilterLastModifiedBy = "rfilterLastModifiedBy_example"; // String | 
    OffsetDateTime rfilterCreatedDateStart = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime rfilterCreatedDateEnd = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime rfilterLastModifiedDateStart = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime rfilterLastModifiedDateEnd = OffsetDateTime.now(); // OffsetDateTime | 
    String rfilterSearchString = "rfilterSearchString_example"; // String | This is equivalent to searching where the name OR the description is LIKE this value
    Boolean rfilterCaseSensitive = true; // Boolean | 
    Boolean rfilterWholeWord = true; // Boolean | 
    UUID rfilterResourcePackId = UUID.randomUUID(); // UUID | 
    Boolean rfilterSystemResource = true; // Boolean | 
    Boolean rfilterHidden = true; // Boolean | 
    Boolean rfilterHasApprovedVersion = true; // Boolean | 
    UUID rfilterStandardVariantId = UUID.randomUUID(); // UUID | 
    Boolean rfilterUseEffectiveDate = true; // Boolean | 
    OffsetDateTime rfilterEffectiveDate = OffsetDateTime.now(); // OffsetDateTime | 
    List<String> rfilterCategories = Arrays.asList(); // List<String> | 
    List<ResourceCategory> rfilterCategoryObjects = Arrays.asList(); // List<ResourceCategory> | 
    OffsetDateTime rfilterVfilterLastModifiedDateEnd = OffsetDateTime.now(); // OffsetDateTime | 
    String rfilterDomainId = "rfilterDomainId_example"; // String | only include resources in this domain
    Boolean rfilterLatestVersion = true; // Boolean | only include the latest version of objects
    Boolean rfilterLocked = true; // Boolean | 
    List<String> rfilterStates = Arrays.asList(); // List<String> | 
    List<UUID> rfilterOverrideIds = Arrays.asList(); // List<UUID> | 
    List<String> rfilterOverrideStates = Arrays.asList(); // List<String> | 
    Boolean useEffectiveDate = true; // Boolean | 
    OffsetDateTime effectiveDate = OffsetDateTime.now(); // OffsetDateTime | 
    Integer offset = 0; // Integer | For pagination, fetch entities after this many
    Integer count = 1000; // Integer | For pagination, the number of entities per page
    try {
      PageResponseLinkDTO result = apiInstance.getLinks(domain, linkSubjectId, linkSubjectVersion, linkObjectId, linkDepth, filterIds, filterExcludedIds, filterTypes, filterExcludedTypes, filterName, filterDescription, filterCreatedBy, filterLastModifiedBy, filterCreatedDateStart, filterCreatedDateEnd, filterLastModifiedDateStart, filterLastModifiedDateEnd, filterSearchString, filterCaseSensitive, filterWholeWord, filterResourcePackId, filterSystemResource, filterHidden, filterHasApprovedVersion, filterStandardVariantId, filterUseEffectiveDate, filterEffectiveDate, filterCategories, filterCategoryObjects, filterVfilterLastModifiedDateEnd, filterDomainId, filterLatestVersion, filterLocked, filterStates, filterOverrideIds, filterOverrideStates, vfilterIds, vfilterExcludedIds, vfilterTypes, vfilterExcludedTypes, vfilterName, vfilterDescription, vfilterCreatedBy, vfilterLastModifiedBy, vfilterCreatedDateStart, vfilterCreatedDateEnd, vfilterLastModifiedDateStart, vfilterLastModifiedDateEnd, vfilterSearchString, vfilterCaseSensitive, vfilterWholeWord, vfilterResourcePackId, vfilterSystemResource, vfilterHidden, vfilterHasApprovedVersion, vfilterStandardVariantId, vfilterUseEffectiveDate, vfilterEffectiveDate, vfilterCategories, vfilterCategoryObjects, vfilterVfilterLastModifiedDateEnd, vfilterDomainId, vfilterLatestVersion, vfilterLocked, vfilterStates, vfilterOverrideIds, vfilterOverrideStates, tfilterIds, tfilterExcludedIds, tfilterTypes, tfilterExcludedTypes, tfilterName, tfilterDescription, tfilterCreatedBy, tfilterLastModifiedBy, tfilterCreatedDateStart, tfilterCreatedDateEnd, tfilterLastModifiedDateStart, tfilterLastModifiedDateEnd, tfilterSearchString, tfilterCaseSensitive, tfilterWholeWord, tfilterResourcePackId, tfilterSystemResource, tfilterHidden, tfilterHasApprovedVersion, tfilterStandardVariantId, tfilterUseEffectiveDate, tfilterEffectiveDate, tfilterCategories, tfilterCategoryObjects, tfilterVfilterLastModifiedDateEnd, tfilterDomainId, tfilterLatestVersion, tfilterLocked, tfilterStates, tfilterOverrideIds, tfilterOverrideStates, rfilterIds, rfilterExcludedIds, rfilterTypes, rfilterExcludedTypes, rfilterName, rfilterDescription, rfilterCreatedBy, rfilterLastModifiedBy, rfilterCreatedDateStart, rfilterCreatedDateEnd, rfilterLastModifiedDateStart, rfilterLastModifiedDateEnd, rfilterSearchString, rfilterCaseSensitive, rfilterWholeWord, rfilterResourcePackId, rfilterSystemResource, rfilterHidden, rfilterHasApprovedVersion, rfilterStandardVariantId, rfilterUseEffectiveDate, rfilterEffectiveDate, rfilterCategories, rfilterCategoryObjects, rfilterVfilterLastModifiedDateEnd, rfilterDomainId, rfilterLatestVersion, rfilterLocked, rfilterStates, rfilterOverrideIds, rfilterOverrideStates, useEffectiveDate, effectiveDate, offset, count);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksControllerApi#getLinks");
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
| **linkSubjectId** | **UUID**|  | [optional] |
| **linkSubjectVersion** | **Integer**|  | [optional] |
| **linkObjectId** | **UUID**|  | [optional] |
| **linkDepth** | **Integer**| Optionally specify the maximum depth for a recursive traversal of a link tree. | [optional] |
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
| **vfilterIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **vfilterExcludedIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **vfilterTypes** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: all, designer, author, designAsset, commAsset, orchestrator, resourcepack, exstrapplication, exstrdocument, exstrpage, exstrcomponentobj, exstremail, exstrengine, exstrvariablebase, exstrpackage, exstrgraphicalmessage, exstrtextmessage, exstrparagraph, exstrparagraphsection, image, samplefile, exstrdatasource, exstrhtml5, versionedtemplate, documentdefinition, enginerundef, font, fontdefinition, exstrbarcode, exstrpapertype, exstrmessagetype, exstrmetadata, orcsettings, flowmodel, exstrcommunicationset, exstroutputqueue, exstroutput, exstrlanguage, exstrlocale, exstrmigrationset, exstrmessaging, exstrmessagingauthor, flowscript, exstrnamedcolor, exstrcolorfamily, exstrstyle, exstrstylesheet, exstrevent, exstrrule, dashboard, pdf] |
| **vfilterExcludedTypes** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: all, designer, author, designAsset, commAsset, orchestrator, resourcepack, exstrapplication, exstrdocument, exstrpage, exstrcomponentobj, exstremail, exstrengine, exstrvariablebase, exstrpackage, exstrgraphicalmessage, exstrtextmessage, exstrparagraph, exstrparagraphsection, image, samplefile, exstrdatasource, exstrhtml5, versionedtemplate, documentdefinition, enginerundef, font, fontdefinition, exstrbarcode, exstrpapertype, exstrmessagetype, exstrmetadata, orcsettings, flowmodel, exstrcommunicationset, exstroutputqueue, exstroutput, exstrlanguage, exstrlocale, exstrmigrationset, exstrmessaging, exstrmessagingauthor, flowscript, exstrnamedcolor, exstrcolorfamily, exstrstyle, exstrstylesheet, exstrevent, exstrrule, dashboard, pdf] |
| **vfilterName** | **String**|  | [optional] |
| **vfilterDescription** | **String**|  | [optional] |
| **vfilterCreatedBy** | **String**|  | [optional] |
| **vfilterLastModifiedBy** | **String**|  | [optional] |
| **vfilterCreatedDateStart** | **OffsetDateTime**|  | [optional] |
| **vfilterCreatedDateEnd** | **OffsetDateTime**|  | [optional] |
| **vfilterLastModifiedDateStart** | **OffsetDateTime**|  | [optional] |
| **vfilterLastModifiedDateEnd** | **OffsetDateTime**|  | [optional] |
| **vfilterSearchString** | **String**| This is equivalent to searching where the name OR the description is LIKE this value | [optional] |
| **vfilterCaseSensitive** | **Boolean**|  | [optional] |
| **vfilterWholeWord** | **Boolean**|  | [optional] |
| **vfilterResourcePackId** | **UUID**|  | [optional] |
| **vfilterSystemResource** | **Boolean**|  | [optional] |
| **vfilterHidden** | **Boolean**|  | [optional] |
| **vfilterHasApprovedVersion** | **Boolean**|  | [optional] |
| **vfilterStandardVariantId** | **UUID**|  | [optional] |
| **vfilterUseEffectiveDate** | **Boolean**|  | [optional] |
| **vfilterEffectiveDate** | **OffsetDateTime**|  | [optional] |
| **vfilterCategories** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **vfilterCategoryObjects** | [**List&lt;ResourceCategory&gt;**](ResourceCategory.md)|  | [optional] |
| **vfilterVfilterLastModifiedDateEnd** | **OffsetDateTime**|  | [optional] |
| **vfilterDomainId** | **String**| only include resources in this domain | [optional] |
| **vfilterLatestVersion** | **Boolean**| only include the latest version of objects | [optional] |
| **vfilterLocked** | **Boolean**|  | [optional] |
| **vfilterStates** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DRAFT, REVIEW, APPROVED, REJECTED] |
| **vfilterOverrideIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **vfilterOverrideStates** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DRAFT, REVIEW, APPROVED, REJECTED] |
| **tfilterIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **tfilterExcludedIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **tfilterTypes** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: all, designer, author, designAsset, commAsset, orchestrator, resourcepack, exstrapplication, exstrdocument, exstrpage, exstrcomponentobj, exstremail, exstrengine, exstrvariablebase, exstrpackage, exstrgraphicalmessage, exstrtextmessage, exstrparagraph, exstrparagraphsection, image, samplefile, exstrdatasource, exstrhtml5, versionedtemplate, documentdefinition, enginerundef, font, fontdefinition, exstrbarcode, exstrpapertype, exstrmessagetype, exstrmetadata, orcsettings, flowmodel, exstrcommunicationset, exstroutputqueue, exstroutput, exstrlanguage, exstrlocale, exstrmigrationset, exstrmessaging, exstrmessagingauthor, flowscript, exstrnamedcolor, exstrcolorfamily, exstrstyle, exstrstylesheet, exstrevent, exstrrule, dashboard, pdf] |
| **tfilterExcludedTypes** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: all, designer, author, designAsset, commAsset, orchestrator, resourcepack, exstrapplication, exstrdocument, exstrpage, exstrcomponentobj, exstremail, exstrengine, exstrvariablebase, exstrpackage, exstrgraphicalmessage, exstrtextmessage, exstrparagraph, exstrparagraphsection, image, samplefile, exstrdatasource, exstrhtml5, versionedtemplate, documentdefinition, enginerundef, font, fontdefinition, exstrbarcode, exstrpapertype, exstrmessagetype, exstrmetadata, orcsettings, flowmodel, exstrcommunicationset, exstroutputqueue, exstroutput, exstrlanguage, exstrlocale, exstrmigrationset, exstrmessaging, exstrmessagingauthor, flowscript, exstrnamedcolor, exstrcolorfamily, exstrstyle, exstrstylesheet, exstrevent, exstrrule, dashboard, pdf] |
| **tfilterName** | **String**|  | [optional] |
| **tfilterDescription** | **String**|  | [optional] |
| **tfilterCreatedBy** | **String**|  | [optional] |
| **tfilterLastModifiedBy** | **String**|  | [optional] |
| **tfilterCreatedDateStart** | **OffsetDateTime**|  | [optional] |
| **tfilterCreatedDateEnd** | **OffsetDateTime**|  | [optional] |
| **tfilterLastModifiedDateStart** | **OffsetDateTime**|  | [optional] |
| **tfilterLastModifiedDateEnd** | **OffsetDateTime**|  | [optional] |
| **tfilterSearchString** | **String**| This is equivalent to searching where the name OR the description is LIKE this value | [optional] |
| **tfilterCaseSensitive** | **Boolean**|  | [optional] |
| **tfilterWholeWord** | **Boolean**|  | [optional] |
| **tfilterResourcePackId** | **UUID**|  | [optional] |
| **tfilterSystemResource** | **Boolean**|  | [optional] |
| **tfilterHidden** | **Boolean**|  | [optional] |
| **tfilterHasApprovedVersion** | **Boolean**|  | [optional] |
| **tfilterStandardVariantId** | **UUID**|  | [optional] |
| **tfilterUseEffectiveDate** | **Boolean**|  | [optional] |
| **tfilterEffectiveDate** | **OffsetDateTime**|  | [optional] |
| **tfilterCategories** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tfilterCategoryObjects** | [**List&lt;ResourceCategory&gt;**](ResourceCategory.md)|  | [optional] |
| **tfilterVfilterLastModifiedDateEnd** | **OffsetDateTime**|  | [optional] |
| **tfilterDomainId** | **String**| only include resources in this domain | [optional] |
| **tfilterLatestVersion** | **Boolean**| only include the latest version of objects | [optional] |
| **tfilterLocked** | **Boolean**|  | [optional] |
| **tfilterStates** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DRAFT, REVIEW, APPROVED, REJECTED] |
| **tfilterOverrideIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **tfilterOverrideStates** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DRAFT, REVIEW, APPROVED, REJECTED] |
| **rfilterIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **rfilterExcludedIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **rfilterTypes** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: all, designer, author, designAsset, commAsset, orchestrator, resourcepack, exstrapplication, exstrdocument, exstrpage, exstrcomponentobj, exstremail, exstrengine, exstrvariablebase, exstrpackage, exstrgraphicalmessage, exstrtextmessage, exstrparagraph, exstrparagraphsection, image, samplefile, exstrdatasource, exstrhtml5, versionedtemplate, documentdefinition, enginerundef, font, fontdefinition, exstrbarcode, exstrpapertype, exstrmessagetype, exstrmetadata, orcsettings, flowmodel, exstrcommunicationset, exstroutputqueue, exstroutput, exstrlanguage, exstrlocale, exstrmigrationset, exstrmessaging, exstrmessagingauthor, flowscript, exstrnamedcolor, exstrcolorfamily, exstrstyle, exstrstylesheet, exstrevent, exstrrule, dashboard, pdf] |
| **rfilterExcludedTypes** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: all, designer, author, designAsset, commAsset, orchestrator, resourcepack, exstrapplication, exstrdocument, exstrpage, exstrcomponentobj, exstremail, exstrengine, exstrvariablebase, exstrpackage, exstrgraphicalmessage, exstrtextmessage, exstrparagraph, exstrparagraphsection, image, samplefile, exstrdatasource, exstrhtml5, versionedtemplate, documentdefinition, enginerundef, font, fontdefinition, exstrbarcode, exstrpapertype, exstrmessagetype, exstrmetadata, orcsettings, flowmodel, exstrcommunicationset, exstroutputqueue, exstroutput, exstrlanguage, exstrlocale, exstrmigrationset, exstrmessaging, exstrmessagingauthor, flowscript, exstrnamedcolor, exstrcolorfamily, exstrstyle, exstrstylesheet, exstrevent, exstrrule, dashboard, pdf] |
| **rfilterName** | **String**|  | [optional] |
| **rfilterDescription** | **String**|  | [optional] |
| **rfilterCreatedBy** | **String**|  | [optional] |
| **rfilterLastModifiedBy** | **String**|  | [optional] |
| **rfilterCreatedDateStart** | **OffsetDateTime**|  | [optional] |
| **rfilterCreatedDateEnd** | **OffsetDateTime**|  | [optional] |
| **rfilterLastModifiedDateStart** | **OffsetDateTime**|  | [optional] |
| **rfilterLastModifiedDateEnd** | **OffsetDateTime**|  | [optional] |
| **rfilterSearchString** | **String**| This is equivalent to searching where the name OR the description is LIKE this value | [optional] |
| **rfilterCaseSensitive** | **Boolean**|  | [optional] |
| **rfilterWholeWord** | **Boolean**|  | [optional] |
| **rfilterResourcePackId** | **UUID**|  | [optional] |
| **rfilterSystemResource** | **Boolean**|  | [optional] |
| **rfilterHidden** | **Boolean**|  | [optional] |
| **rfilterHasApprovedVersion** | **Boolean**|  | [optional] |
| **rfilterStandardVariantId** | **UUID**|  | [optional] |
| **rfilterUseEffectiveDate** | **Boolean**|  | [optional] |
| **rfilterEffectiveDate** | **OffsetDateTime**|  | [optional] |
| **rfilterCategories** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **rfilterCategoryObjects** | [**List&lt;ResourceCategory&gt;**](ResourceCategory.md)|  | [optional] |
| **rfilterVfilterLastModifiedDateEnd** | **OffsetDateTime**|  | [optional] |
| **rfilterDomainId** | **String**| only include resources in this domain | [optional] |
| **rfilterLatestVersion** | **Boolean**| only include the latest version of objects | [optional] |
| **rfilterLocked** | **Boolean**|  | [optional] |
| **rfilterStates** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DRAFT, REVIEW, APPROVED, REJECTED] |
| **rfilterOverrideIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **rfilterOverrideStates** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DRAFT, REVIEW, APPROVED, REJECTED] |
| **useEffectiveDate** | **Boolean**|  | [optional] |
| **effectiveDate** | **OffsetDateTime**|  | [optional] |
| **offset** | **Integer**| For pagination, fetch entities after this many | [optional] |
| **count** | **Integer**| For pagination, the number of entities per page | [optional] |

### Return type

[**PageResponseLinkDTO**](PageResponseLinkDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getResources1"></a>
# **getResources1**
> PageResponseResourceVersion getResources1(domain, linkSubjectId, linkSubjectVersion, linkObjectId, linkDepth, filterIds, filterExcludedIds, filterTypes, filterExcludedTypes, filterName, filterDescription, filterCreatedBy, filterLastModifiedBy, filterCreatedDateStart, filterCreatedDateEnd, filterLastModifiedDateStart, filterLastModifiedDateEnd, filterSearchString, filterCaseSensitive, filterWholeWord, filterResourcePackId, filterSystemResource, filterHidden, filterHasApprovedVersion, filterStandardVariantId, filterUseEffectiveDate, filterEffectiveDate, filterCategories, filterCategoryObjects, filterVfilterLastModifiedDateEnd, filterDomainId, filterLatestVersion, filterLocked, filterStates, filterOverrideIds, filterOverrideStates, vfilterIds, vfilterExcludedIds, vfilterTypes, vfilterExcludedTypes, vfilterName, vfilterDescription, vfilterCreatedBy, vfilterLastModifiedBy, vfilterCreatedDateStart, vfilterCreatedDateEnd, vfilterLastModifiedDateStart, vfilterLastModifiedDateEnd, vfilterSearchString, vfilterCaseSensitive, vfilterWholeWord, vfilterResourcePackId, vfilterSystemResource, vfilterHidden, vfilterHasApprovedVersion, vfilterStandardVariantId, vfilterUseEffectiveDate, vfilterEffectiveDate, vfilterCategories, vfilterCategoryObjects, vfilterVfilterLastModifiedDateEnd, vfilterDomainId, vfilterLatestVersion, vfilterLocked, vfilterStates, vfilterOverrideIds, vfilterOverrideStates, tfilterIds, tfilterExcludedIds, tfilterTypes, tfilterExcludedTypes, tfilterName, tfilterDescription, tfilterCreatedBy, tfilterLastModifiedBy, tfilterCreatedDateStart, tfilterCreatedDateEnd, tfilterLastModifiedDateStart, tfilterLastModifiedDateEnd, tfilterSearchString, tfilterCaseSensitive, tfilterWholeWord, tfilterResourcePackId, tfilterSystemResource, tfilterHidden, tfilterHasApprovedVersion, tfilterStandardVariantId, tfilterUseEffectiveDate, tfilterEffectiveDate, tfilterCategories, tfilterCategoryObjects, tfilterVfilterLastModifiedDateEnd, tfilterDomainId, tfilterLatestVersion, tfilterLocked, tfilterStates, tfilterOverrideIds, tfilterOverrideStates, rfilterIds, rfilterExcludedIds, rfilterTypes, rfilterExcludedTypes, rfilterName, rfilterDescription, rfilterCreatedBy, rfilterLastModifiedBy, rfilterCreatedDateStart, rfilterCreatedDateEnd, rfilterLastModifiedDateStart, rfilterLastModifiedDateEnd, rfilterSearchString, rfilterCaseSensitive, rfilterWholeWord, rfilterResourcePackId, rfilterSystemResource, rfilterHidden, rfilterHasApprovedVersion, rfilterStandardVariantId, rfilterUseEffectiveDate, rfilterEffectiveDate, rfilterCategories, rfilterCategoryObjects, rfilterVfilterLastModifiedDateEnd, rfilterDomainId, rfilterLatestVersion, rfilterLocked, rfilterStates, rfilterOverrideIds, rfilterOverrideStates, useEffectiveDate, effectiveDate, offset, count, fetchApproval)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LinksControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    LinksControllerApi apiInstance = new LinksControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID linkSubjectId = UUID.randomUUID(); // UUID | 
    Integer linkSubjectVersion = 56; // Integer | 
    UUID linkObjectId = UUID.randomUUID(); // UUID | 
    Integer linkDepth = 1000; // Integer | Optionally specify the maximum depth for a recursive traversal of a link tree.
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
    List<UUID> vfilterIds = Arrays.asList(); // List<UUID> | 
    List<UUID> vfilterExcludedIds = Arrays.asList(); // List<UUID> | 
    List<String> vfilterTypes = Arrays.asList(); // List<String> | 
    List<String> vfilterExcludedTypes = Arrays.asList(); // List<String> | 
    String vfilterName = "vfilterName_example"; // String | 
    String vfilterDescription = "vfilterDescription_example"; // String | 
    String vfilterCreatedBy = "vfilterCreatedBy_example"; // String | 
    String vfilterLastModifiedBy = "vfilterLastModifiedBy_example"; // String | 
    OffsetDateTime vfilterCreatedDateStart = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime vfilterCreatedDateEnd = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime vfilterLastModifiedDateStart = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime vfilterLastModifiedDateEnd = OffsetDateTime.now(); // OffsetDateTime | 
    String vfilterSearchString = "vfilterSearchString_example"; // String | This is equivalent to searching where the name OR the description is LIKE this value
    Boolean vfilterCaseSensitive = true; // Boolean | 
    Boolean vfilterWholeWord = true; // Boolean | 
    UUID vfilterResourcePackId = UUID.randomUUID(); // UUID | 
    Boolean vfilterSystemResource = true; // Boolean | 
    Boolean vfilterHidden = true; // Boolean | 
    Boolean vfilterHasApprovedVersion = true; // Boolean | 
    UUID vfilterStandardVariantId = UUID.randomUUID(); // UUID | 
    Boolean vfilterUseEffectiveDate = true; // Boolean | 
    OffsetDateTime vfilterEffectiveDate = OffsetDateTime.now(); // OffsetDateTime | 
    List<String> vfilterCategories = Arrays.asList(); // List<String> | 
    List<ResourceCategory> vfilterCategoryObjects = Arrays.asList(); // List<ResourceCategory> | 
    OffsetDateTime vfilterVfilterLastModifiedDateEnd = OffsetDateTime.now(); // OffsetDateTime | 
    String vfilterDomainId = "vfilterDomainId_example"; // String | only include resources in this domain
    Boolean vfilterLatestVersion = true; // Boolean | only include the latest version of objects
    Boolean vfilterLocked = true; // Boolean | 
    List<String> vfilterStates = Arrays.asList(); // List<String> | 
    List<UUID> vfilterOverrideIds = Arrays.asList(); // List<UUID> | 
    List<String> vfilterOverrideStates = Arrays.asList(); // List<String> | 
    List<UUID> tfilterIds = Arrays.asList(); // List<UUID> | 
    List<UUID> tfilterExcludedIds = Arrays.asList(); // List<UUID> | 
    List<String> tfilterTypes = Arrays.asList(); // List<String> | 
    List<String> tfilterExcludedTypes = Arrays.asList(); // List<String> | 
    String tfilterName = "tfilterName_example"; // String | 
    String tfilterDescription = "tfilterDescription_example"; // String | 
    String tfilterCreatedBy = "tfilterCreatedBy_example"; // String | 
    String tfilterLastModifiedBy = "tfilterLastModifiedBy_example"; // String | 
    OffsetDateTime tfilterCreatedDateStart = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime tfilterCreatedDateEnd = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime tfilterLastModifiedDateStart = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime tfilterLastModifiedDateEnd = OffsetDateTime.now(); // OffsetDateTime | 
    String tfilterSearchString = "tfilterSearchString_example"; // String | This is equivalent to searching where the name OR the description is LIKE this value
    Boolean tfilterCaseSensitive = true; // Boolean | 
    Boolean tfilterWholeWord = true; // Boolean | 
    UUID tfilterResourcePackId = UUID.randomUUID(); // UUID | 
    Boolean tfilterSystemResource = true; // Boolean | 
    Boolean tfilterHidden = true; // Boolean | 
    Boolean tfilterHasApprovedVersion = true; // Boolean | 
    UUID tfilterStandardVariantId = UUID.randomUUID(); // UUID | 
    Boolean tfilterUseEffectiveDate = true; // Boolean | 
    OffsetDateTime tfilterEffectiveDate = OffsetDateTime.now(); // OffsetDateTime | 
    List<String> tfilterCategories = Arrays.asList(); // List<String> | 
    List<ResourceCategory> tfilterCategoryObjects = Arrays.asList(); // List<ResourceCategory> | 
    OffsetDateTime tfilterVfilterLastModifiedDateEnd = OffsetDateTime.now(); // OffsetDateTime | 
    String tfilterDomainId = "tfilterDomainId_example"; // String | only include resources in this domain
    Boolean tfilterLatestVersion = true; // Boolean | only include the latest version of objects
    Boolean tfilterLocked = true; // Boolean | 
    List<String> tfilterStates = Arrays.asList(); // List<String> | 
    List<UUID> tfilterOverrideIds = Arrays.asList(); // List<UUID> | 
    List<String> tfilterOverrideStates = Arrays.asList(); // List<String> | 
    List<UUID> rfilterIds = Arrays.asList(); // List<UUID> | 
    List<UUID> rfilterExcludedIds = Arrays.asList(); // List<UUID> | 
    List<String> rfilterTypes = Arrays.asList(); // List<String> | 
    List<String> rfilterExcludedTypes = Arrays.asList(); // List<String> | 
    String rfilterName = "rfilterName_example"; // String | 
    String rfilterDescription = "rfilterDescription_example"; // String | 
    String rfilterCreatedBy = "rfilterCreatedBy_example"; // String | 
    String rfilterLastModifiedBy = "rfilterLastModifiedBy_example"; // String | 
    OffsetDateTime rfilterCreatedDateStart = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime rfilterCreatedDateEnd = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime rfilterLastModifiedDateStart = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime rfilterLastModifiedDateEnd = OffsetDateTime.now(); // OffsetDateTime | 
    String rfilterSearchString = "rfilterSearchString_example"; // String | This is equivalent to searching where the name OR the description is LIKE this value
    Boolean rfilterCaseSensitive = true; // Boolean | 
    Boolean rfilterWholeWord = true; // Boolean | 
    UUID rfilterResourcePackId = UUID.randomUUID(); // UUID | 
    Boolean rfilterSystemResource = true; // Boolean | 
    Boolean rfilterHidden = true; // Boolean | 
    Boolean rfilterHasApprovedVersion = true; // Boolean | 
    UUID rfilterStandardVariantId = UUID.randomUUID(); // UUID | 
    Boolean rfilterUseEffectiveDate = true; // Boolean | 
    OffsetDateTime rfilterEffectiveDate = OffsetDateTime.now(); // OffsetDateTime | 
    List<String> rfilterCategories = Arrays.asList(); // List<String> | 
    List<ResourceCategory> rfilterCategoryObjects = Arrays.asList(); // List<ResourceCategory> | 
    OffsetDateTime rfilterVfilterLastModifiedDateEnd = OffsetDateTime.now(); // OffsetDateTime | 
    String rfilterDomainId = "rfilterDomainId_example"; // String | only include resources in this domain
    Boolean rfilterLatestVersion = true; // Boolean | only include the latest version of objects
    Boolean rfilterLocked = true; // Boolean | 
    List<String> rfilterStates = Arrays.asList(); // List<String> | 
    List<UUID> rfilterOverrideIds = Arrays.asList(); // List<UUID> | 
    List<String> rfilterOverrideStates = Arrays.asList(); // List<String> | 
    Boolean useEffectiveDate = true; // Boolean | 
    OffsetDateTime effectiveDate = OffsetDateTime.now(); // OffsetDateTime | 
    Integer offset = 0; // Integer | For pagination, fetch entities after this many
    Integer count = 1000; // Integer | For pagination, the number of entities per page
    Boolean fetchApproval = false; // Boolean | 
    try {
      PageResponseResourceVersion result = apiInstance.getResources1(domain, linkSubjectId, linkSubjectVersion, linkObjectId, linkDepth, filterIds, filterExcludedIds, filterTypes, filterExcludedTypes, filterName, filterDescription, filterCreatedBy, filterLastModifiedBy, filterCreatedDateStart, filterCreatedDateEnd, filterLastModifiedDateStart, filterLastModifiedDateEnd, filterSearchString, filterCaseSensitive, filterWholeWord, filterResourcePackId, filterSystemResource, filterHidden, filterHasApprovedVersion, filterStandardVariantId, filterUseEffectiveDate, filterEffectiveDate, filterCategories, filterCategoryObjects, filterVfilterLastModifiedDateEnd, filterDomainId, filterLatestVersion, filterLocked, filterStates, filterOverrideIds, filterOverrideStates, vfilterIds, vfilterExcludedIds, vfilterTypes, vfilterExcludedTypes, vfilterName, vfilterDescription, vfilterCreatedBy, vfilterLastModifiedBy, vfilterCreatedDateStart, vfilterCreatedDateEnd, vfilterLastModifiedDateStart, vfilterLastModifiedDateEnd, vfilterSearchString, vfilterCaseSensitive, vfilterWholeWord, vfilterResourcePackId, vfilterSystemResource, vfilterHidden, vfilterHasApprovedVersion, vfilterStandardVariantId, vfilterUseEffectiveDate, vfilterEffectiveDate, vfilterCategories, vfilterCategoryObjects, vfilterVfilterLastModifiedDateEnd, vfilterDomainId, vfilterLatestVersion, vfilterLocked, vfilterStates, vfilterOverrideIds, vfilterOverrideStates, tfilterIds, tfilterExcludedIds, tfilterTypes, tfilterExcludedTypes, tfilterName, tfilterDescription, tfilterCreatedBy, tfilterLastModifiedBy, tfilterCreatedDateStart, tfilterCreatedDateEnd, tfilterLastModifiedDateStart, tfilterLastModifiedDateEnd, tfilterSearchString, tfilterCaseSensitive, tfilterWholeWord, tfilterResourcePackId, tfilterSystemResource, tfilterHidden, tfilterHasApprovedVersion, tfilterStandardVariantId, tfilterUseEffectiveDate, tfilterEffectiveDate, tfilterCategories, tfilterCategoryObjects, tfilterVfilterLastModifiedDateEnd, tfilterDomainId, tfilterLatestVersion, tfilterLocked, tfilterStates, tfilterOverrideIds, tfilterOverrideStates, rfilterIds, rfilterExcludedIds, rfilterTypes, rfilterExcludedTypes, rfilterName, rfilterDescription, rfilterCreatedBy, rfilterLastModifiedBy, rfilterCreatedDateStart, rfilterCreatedDateEnd, rfilterLastModifiedDateStart, rfilterLastModifiedDateEnd, rfilterSearchString, rfilterCaseSensitive, rfilterWholeWord, rfilterResourcePackId, rfilterSystemResource, rfilterHidden, rfilterHasApprovedVersion, rfilterStandardVariantId, rfilterUseEffectiveDate, rfilterEffectiveDate, rfilterCategories, rfilterCategoryObjects, rfilterVfilterLastModifiedDateEnd, rfilterDomainId, rfilterLatestVersion, rfilterLocked, rfilterStates, rfilterOverrideIds, rfilterOverrideStates, useEffectiveDate, effectiveDate, offset, count, fetchApproval);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksControllerApi#getResources1");
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
| **linkSubjectId** | **UUID**|  | [optional] |
| **linkSubjectVersion** | **Integer**|  | [optional] |
| **linkObjectId** | **UUID**|  | [optional] |
| **linkDepth** | **Integer**| Optionally specify the maximum depth for a recursive traversal of a link tree. | [optional] |
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
| **vfilterIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **vfilterExcludedIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **vfilterTypes** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: all, designer, author, designAsset, commAsset, orchestrator, resourcepack, exstrapplication, exstrdocument, exstrpage, exstrcomponentobj, exstremail, exstrengine, exstrvariablebase, exstrpackage, exstrgraphicalmessage, exstrtextmessage, exstrparagraph, exstrparagraphsection, image, samplefile, exstrdatasource, exstrhtml5, versionedtemplate, documentdefinition, enginerundef, font, fontdefinition, exstrbarcode, exstrpapertype, exstrmessagetype, exstrmetadata, orcsettings, flowmodel, exstrcommunicationset, exstroutputqueue, exstroutput, exstrlanguage, exstrlocale, exstrmigrationset, exstrmessaging, exstrmessagingauthor, flowscript, exstrnamedcolor, exstrcolorfamily, exstrstyle, exstrstylesheet, exstrevent, exstrrule, dashboard, pdf] |
| **vfilterExcludedTypes** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: all, designer, author, designAsset, commAsset, orchestrator, resourcepack, exstrapplication, exstrdocument, exstrpage, exstrcomponentobj, exstremail, exstrengine, exstrvariablebase, exstrpackage, exstrgraphicalmessage, exstrtextmessage, exstrparagraph, exstrparagraphsection, image, samplefile, exstrdatasource, exstrhtml5, versionedtemplate, documentdefinition, enginerundef, font, fontdefinition, exstrbarcode, exstrpapertype, exstrmessagetype, exstrmetadata, orcsettings, flowmodel, exstrcommunicationset, exstroutputqueue, exstroutput, exstrlanguage, exstrlocale, exstrmigrationset, exstrmessaging, exstrmessagingauthor, flowscript, exstrnamedcolor, exstrcolorfamily, exstrstyle, exstrstylesheet, exstrevent, exstrrule, dashboard, pdf] |
| **vfilterName** | **String**|  | [optional] |
| **vfilterDescription** | **String**|  | [optional] |
| **vfilterCreatedBy** | **String**|  | [optional] |
| **vfilterLastModifiedBy** | **String**|  | [optional] |
| **vfilterCreatedDateStart** | **OffsetDateTime**|  | [optional] |
| **vfilterCreatedDateEnd** | **OffsetDateTime**|  | [optional] |
| **vfilterLastModifiedDateStart** | **OffsetDateTime**|  | [optional] |
| **vfilterLastModifiedDateEnd** | **OffsetDateTime**|  | [optional] |
| **vfilterSearchString** | **String**| This is equivalent to searching where the name OR the description is LIKE this value | [optional] |
| **vfilterCaseSensitive** | **Boolean**|  | [optional] |
| **vfilterWholeWord** | **Boolean**|  | [optional] |
| **vfilterResourcePackId** | **UUID**|  | [optional] |
| **vfilterSystemResource** | **Boolean**|  | [optional] |
| **vfilterHidden** | **Boolean**|  | [optional] |
| **vfilterHasApprovedVersion** | **Boolean**|  | [optional] |
| **vfilterStandardVariantId** | **UUID**|  | [optional] |
| **vfilterUseEffectiveDate** | **Boolean**|  | [optional] |
| **vfilterEffectiveDate** | **OffsetDateTime**|  | [optional] |
| **vfilterCategories** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **vfilterCategoryObjects** | [**List&lt;ResourceCategory&gt;**](ResourceCategory.md)|  | [optional] |
| **vfilterVfilterLastModifiedDateEnd** | **OffsetDateTime**|  | [optional] |
| **vfilterDomainId** | **String**| only include resources in this domain | [optional] |
| **vfilterLatestVersion** | **Boolean**| only include the latest version of objects | [optional] |
| **vfilterLocked** | **Boolean**|  | [optional] |
| **vfilterStates** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DRAFT, REVIEW, APPROVED, REJECTED] |
| **vfilterOverrideIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **vfilterOverrideStates** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DRAFT, REVIEW, APPROVED, REJECTED] |
| **tfilterIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **tfilterExcludedIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **tfilterTypes** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: all, designer, author, designAsset, commAsset, orchestrator, resourcepack, exstrapplication, exstrdocument, exstrpage, exstrcomponentobj, exstremail, exstrengine, exstrvariablebase, exstrpackage, exstrgraphicalmessage, exstrtextmessage, exstrparagraph, exstrparagraphsection, image, samplefile, exstrdatasource, exstrhtml5, versionedtemplate, documentdefinition, enginerundef, font, fontdefinition, exstrbarcode, exstrpapertype, exstrmessagetype, exstrmetadata, orcsettings, flowmodel, exstrcommunicationset, exstroutputqueue, exstroutput, exstrlanguage, exstrlocale, exstrmigrationset, exstrmessaging, exstrmessagingauthor, flowscript, exstrnamedcolor, exstrcolorfamily, exstrstyle, exstrstylesheet, exstrevent, exstrrule, dashboard, pdf] |
| **tfilterExcludedTypes** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: all, designer, author, designAsset, commAsset, orchestrator, resourcepack, exstrapplication, exstrdocument, exstrpage, exstrcomponentobj, exstremail, exstrengine, exstrvariablebase, exstrpackage, exstrgraphicalmessage, exstrtextmessage, exstrparagraph, exstrparagraphsection, image, samplefile, exstrdatasource, exstrhtml5, versionedtemplate, documentdefinition, enginerundef, font, fontdefinition, exstrbarcode, exstrpapertype, exstrmessagetype, exstrmetadata, orcsettings, flowmodel, exstrcommunicationset, exstroutputqueue, exstroutput, exstrlanguage, exstrlocale, exstrmigrationset, exstrmessaging, exstrmessagingauthor, flowscript, exstrnamedcolor, exstrcolorfamily, exstrstyle, exstrstylesheet, exstrevent, exstrrule, dashboard, pdf] |
| **tfilterName** | **String**|  | [optional] |
| **tfilterDescription** | **String**|  | [optional] |
| **tfilterCreatedBy** | **String**|  | [optional] |
| **tfilterLastModifiedBy** | **String**|  | [optional] |
| **tfilterCreatedDateStart** | **OffsetDateTime**|  | [optional] |
| **tfilterCreatedDateEnd** | **OffsetDateTime**|  | [optional] |
| **tfilterLastModifiedDateStart** | **OffsetDateTime**|  | [optional] |
| **tfilterLastModifiedDateEnd** | **OffsetDateTime**|  | [optional] |
| **tfilterSearchString** | **String**| This is equivalent to searching where the name OR the description is LIKE this value | [optional] |
| **tfilterCaseSensitive** | **Boolean**|  | [optional] |
| **tfilterWholeWord** | **Boolean**|  | [optional] |
| **tfilterResourcePackId** | **UUID**|  | [optional] |
| **tfilterSystemResource** | **Boolean**|  | [optional] |
| **tfilterHidden** | **Boolean**|  | [optional] |
| **tfilterHasApprovedVersion** | **Boolean**|  | [optional] |
| **tfilterStandardVariantId** | **UUID**|  | [optional] |
| **tfilterUseEffectiveDate** | **Boolean**|  | [optional] |
| **tfilterEffectiveDate** | **OffsetDateTime**|  | [optional] |
| **tfilterCategories** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tfilterCategoryObjects** | [**List&lt;ResourceCategory&gt;**](ResourceCategory.md)|  | [optional] |
| **tfilterVfilterLastModifiedDateEnd** | **OffsetDateTime**|  | [optional] |
| **tfilterDomainId** | **String**| only include resources in this domain | [optional] |
| **tfilterLatestVersion** | **Boolean**| only include the latest version of objects | [optional] |
| **tfilterLocked** | **Boolean**|  | [optional] |
| **tfilterStates** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DRAFT, REVIEW, APPROVED, REJECTED] |
| **tfilterOverrideIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **tfilterOverrideStates** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DRAFT, REVIEW, APPROVED, REJECTED] |
| **rfilterIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **rfilterExcludedIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **rfilterTypes** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: all, designer, author, designAsset, commAsset, orchestrator, resourcepack, exstrapplication, exstrdocument, exstrpage, exstrcomponentobj, exstremail, exstrengine, exstrvariablebase, exstrpackage, exstrgraphicalmessage, exstrtextmessage, exstrparagraph, exstrparagraphsection, image, samplefile, exstrdatasource, exstrhtml5, versionedtemplate, documentdefinition, enginerundef, font, fontdefinition, exstrbarcode, exstrpapertype, exstrmessagetype, exstrmetadata, orcsettings, flowmodel, exstrcommunicationset, exstroutputqueue, exstroutput, exstrlanguage, exstrlocale, exstrmigrationset, exstrmessaging, exstrmessagingauthor, flowscript, exstrnamedcolor, exstrcolorfamily, exstrstyle, exstrstylesheet, exstrevent, exstrrule, dashboard, pdf] |
| **rfilterExcludedTypes** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: all, designer, author, designAsset, commAsset, orchestrator, resourcepack, exstrapplication, exstrdocument, exstrpage, exstrcomponentobj, exstremail, exstrengine, exstrvariablebase, exstrpackage, exstrgraphicalmessage, exstrtextmessage, exstrparagraph, exstrparagraphsection, image, samplefile, exstrdatasource, exstrhtml5, versionedtemplate, documentdefinition, enginerundef, font, fontdefinition, exstrbarcode, exstrpapertype, exstrmessagetype, exstrmetadata, orcsettings, flowmodel, exstrcommunicationset, exstroutputqueue, exstroutput, exstrlanguage, exstrlocale, exstrmigrationset, exstrmessaging, exstrmessagingauthor, flowscript, exstrnamedcolor, exstrcolorfamily, exstrstyle, exstrstylesheet, exstrevent, exstrrule, dashboard, pdf] |
| **rfilterName** | **String**|  | [optional] |
| **rfilterDescription** | **String**|  | [optional] |
| **rfilterCreatedBy** | **String**|  | [optional] |
| **rfilterLastModifiedBy** | **String**|  | [optional] |
| **rfilterCreatedDateStart** | **OffsetDateTime**|  | [optional] |
| **rfilterCreatedDateEnd** | **OffsetDateTime**|  | [optional] |
| **rfilterLastModifiedDateStart** | **OffsetDateTime**|  | [optional] |
| **rfilterLastModifiedDateEnd** | **OffsetDateTime**|  | [optional] |
| **rfilterSearchString** | **String**| This is equivalent to searching where the name OR the description is LIKE this value | [optional] |
| **rfilterCaseSensitive** | **Boolean**|  | [optional] |
| **rfilterWholeWord** | **Boolean**|  | [optional] |
| **rfilterResourcePackId** | **UUID**|  | [optional] |
| **rfilterSystemResource** | **Boolean**|  | [optional] |
| **rfilterHidden** | **Boolean**|  | [optional] |
| **rfilterHasApprovedVersion** | **Boolean**|  | [optional] |
| **rfilterStandardVariantId** | **UUID**|  | [optional] |
| **rfilterUseEffectiveDate** | **Boolean**|  | [optional] |
| **rfilterEffectiveDate** | **OffsetDateTime**|  | [optional] |
| **rfilterCategories** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **rfilterCategoryObjects** | [**List&lt;ResourceCategory&gt;**](ResourceCategory.md)|  | [optional] |
| **rfilterVfilterLastModifiedDateEnd** | **OffsetDateTime**|  | [optional] |
| **rfilterDomainId** | **String**| only include resources in this domain | [optional] |
| **rfilterLatestVersion** | **Boolean**| only include the latest version of objects | [optional] |
| **rfilterLocked** | **Boolean**|  | [optional] |
| **rfilterStates** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DRAFT, REVIEW, APPROVED, REJECTED] |
| **rfilterOverrideIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **rfilterOverrideStates** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DRAFT, REVIEW, APPROVED, REJECTED] |
| **useEffectiveDate** | **Boolean**|  | [optional] |
| **effectiveDate** | **OffsetDateTime**|  | [optional] |
| **offset** | **Integer**| For pagination, fetch entities after this many | [optional] |
| **count** | **Integer**| For pagination, the number of entities per page | [optional] |
| **fetchApproval** | **Boolean**|  | [optional] [default to false] |

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

