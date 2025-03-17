# LinksControllerApi

All URIs are relative to *http://localhost/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLinkUsingPOST**](LinksControllerApi.md#createLinkUsingPOST) | **POST** /api/v1/links/{domain} | Create a resource link |
| [**createLinksUsingPOST**](LinksControllerApi.md#createLinksUsingPOST) | **POST** /api/v1/links/{domain}/multiple | Create multiple resource links |
| [**deleteLinkUsingDELETE**](LinksControllerApi.md#deleteLinkUsingDELETE) | **DELETE** /api/v1/links/{domain} | Delete a resource link |
| [**deleteLinksUsingDELETE**](LinksControllerApi.md#deleteLinksUsingDELETE) | **DELETE** /api/v1/links/{domain}/multiple | Delete multiple resource links |
| [**getLinksUsingGET**](LinksControllerApi.md#getLinksUsingGET) | **GET** /api/v1/links/{domain} | Fetch links to/from a resource |
| [**getResourcesUsingGET**](LinksControllerApi.md#getResourcesUsingGET) | **GET** /api/v1/links/{domain}/resources | Fetch resources that are linked to/from another resource |


<a id="createLinkUsingPOST"></a>
# **createLinkUsingPOST**
> DataResponseLinkDTO createLinkUsingPOST(domain, link)

Create a resource link

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
    defaultClient.setBasePath("http://localhost/design");

    LinksControllerApi apiInstance = new LinksControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    LinkDTO link = new LinkDTO(); // LinkDTO | link
    try {
      DataResponseLinkDTO result = apiInstance.createLinkUsingPOST(domain, link);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksControllerApi#createLinkUsingPOST");
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
| **link** | [**LinkDTO**](LinkDTO.md)| link | |

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
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="createLinksUsingPOST"></a>
# **createLinksUsingPOST**
> ListResponseLinkDTO createLinksUsingPOST(domain, body)

Create multiple resource links

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
    defaultClient.setBasePath("http://localhost/design");

    LinksControllerApi apiInstance = new LinksControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    MultipleLinksBody body = new MultipleLinksBody(); // MultipleLinksBody | body
    try {
      ListResponseLinkDTO result = apiInstance.createLinksUsingPOST(domain, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksControllerApi#createLinksUsingPOST");
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
| **body** | [**MultipleLinksBody**](MultipleLinksBody.md)| body | |

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
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="deleteLinkUsingDELETE"></a>
# **deleteLinkUsingDELETE**
> GenericResponse deleteLinkUsingDELETE(domain, link)

Delete a resource link

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
    defaultClient.setBasePath("http://localhost/design");

    LinksControllerApi apiInstance = new LinksControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    LinkDTO link = new LinkDTO(); // LinkDTO | link
    try {
      GenericResponse result = apiInstance.deleteLinkUsingDELETE(domain, link);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksControllerApi#deleteLinkUsingDELETE");
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
| **link** | [**LinkDTO**](LinkDTO.md)| link | |

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

<a id="deleteLinksUsingDELETE"></a>
# **deleteLinksUsingDELETE**
> GenericResponse deleteLinksUsingDELETE(domain, body)

Delete multiple resource links

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
    defaultClient.setBasePath("http://localhost/design");

    LinksControllerApi apiInstance = new LinksControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    MultipleLinksBody body = new MultipleLinksBody(); // MultipleLinksBody | body
    try {
      GenericResponse result = apiInstance.deleteLinksUsingDELETE(domain, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksControllerApi#deleteLinksUsingDELETE");
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
| **body** | [**MultipleLinksBody**](MultipleLinksBody.md)| body | |

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

<a id="getLinksUsingGET"></a>
# **getLinksUsingGET**
> PageResponseLinkDTO getLinksUsingGET(domain, count, effectiveDate, filter, linkDepth, linkObjectId, linkSubjectId, linkSubjectVersion, offset, rfilter, sort, tfilter, useEffectiveDate, vfilter)

Fetch links to/from a resource

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
    defaultClient.setBasePath("http://localhost/design");

    LinksControllerApi apiInstance = new LinksControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    Integer count = 1000; // Integer | For pagination, the number of entities per page
    OffsetDateTime effectiveDate = OffsetDateTime.now(); // OffsetDateTime | 
    String filter = "filter_example"; // String | A simple filter that can be used in place of the complex filters. If the query asks for the latest version (which is the default), this filter's domains, types, states, and override ids are applied when determining the latest version. All other attributes of this filter are applied when building the link tree. The filter value is a semicolon delimited list of key value pairs. For example:  name:Example;states:DRAFT,APPROVED;searchString:*ample List values separate possible values with commas. Keys include: | filter name           | Filter value description                                                                        | |-----------------------|-------------------------------------------------------------------------------------------------| | description           | Match resources with this description.                                                          | | excludedTypes         | Match resources whose types do not appear in this comma-separated list.                         | | variableIsArray       | Matches resources against this value.                                                           | | variableType          | Match resources whose variableType is one of these specified.                                   | | ids                   | Match resources with ids in this comma-separated list.                                          | | excludedIds           | Match resources with ids that are NOT in this comma-separated list.                             | | parentId              | Exclude this resource and others directly linked to it. Only usable in the resources API.       | | parentVersion         | For use with parentId. Must use both.                                                           | | name                  | Match resources with this name.                                                                 | | overrideIds           | When matching by states, do not apply the states filter to resources with ids in this list.     | | overrideStates        | When matching by states, apply this states filter to resources with ids in the overrideIds list.| | resourcePackId        | Match resources with this resource pack id.                                                     | | searchString          | Match resources with names or descriptions matching this string. Use a &ast; as a wildcard.     | | caseSensitive         | Specify if searches (name, description, searchString) are case sensitive or not.                | | wholeWord             | Specify if searches (name, description, searchString) match whole word or not.                  | | createdBy             | Match resources created by this user.                                                           | | lastModifiedBy        | Match resources last modified by this user.                                                     | | createdDateStart      | Match resources created on or after this date. (yyyy-MM-dd format).                                   | | createdDateEnd        | Match resources created before this date. (yyyy-MM-dd format).                                  | | lastModifiedDateStart | Match resources last modified on or after this date. (yyyy-MM-dd format).                             | | lastModifiedDateEnd   | Match resources last modified before this date. (yyyy-MM-dd format).                            | | states                | Match resources with states in this list. States include: DRAFT,REVIEW,APPROVED,REJECTED      | | latestVersion         | Set to false to fetch all versions of resources matching the rest of this filter. Only usable in the resources API.| | types                 | Match resources with types in this list. Types include: resourcepack, exstrapplication, exstrdocument, exstrpage, exstrcomponentobj, exstremail, exstrengine, exstrvariablebase, exstrpackage, exstrgraphicalmessage, exstrtextmessage, exstrparagraph, exstrparagraphsection, image, samplefile, exstrdatasource, exstrhtml5, versionedtemplate, documentdefinition, enginerundef, font, fontdefinition, exstrbarcode, exstrpapertype, exstrmessagetype, exstrmetadata, exstrcommunicationset, exstroutputqueue, exstroutput, exstrmigrationset, exstrmessaging         | | systemResource        | Match resources that are (or are not) system resources.                                         | | hasApprovedVersion    | Match resources where a previously approved version of the resources exist.                     | | hidden                | Match resources that are (or are not) hidden.                                                   | | includeVariants       | Set to true to include variants in the response. By default they are excluded unless standardVariantId is specified.| | standardVariantId     | Match resources that are variants of this specified one. Can not be used when includeVariants is explicitly false.  | | categories            | Match resources that are contain at least one of the categories from this list.                 |
    Integer linkDepth = 1; // Integer | Optionally specify the maximum depth for a recursive traversal of a link tree.
    UUID linkObjectId = UUID.randomUUID(); // UUID | 
    UUID linkSubjectId = UUID.randomUUID(); // UUID | 
    Integer linkSubjectVersion = 56; // Integer | 
    Integer offset = 0; // Integer | For pagination, fetch entities after this many
    String rfilter = "rfilter_example"; // String | The query will use this value to filter resources after it has determined latest versions and traversed the link tree. This stepwise filter can be combined with the other stepwise filters. It cannot be combined with the simple filter parameter. See filter for details of this filter's possible values.
    String sort = "sort_example"; // String | Comma separated list of {asc|desc}_{field name}
    String tfilter = "tfilter_example"; // String | The query will use this value to filter resources as the query traverses the link tree. This stepwise filter can be combined with the other stepwise filters. It cannot be combined with the simple filter parameter. See filter for details of this filter's possible values.
    Boolean useEffectiveDate = true; // Boolean | 
    String vfilter = "vfilter_example"; // String | The query will use this value to filter resources as the query determines latest versions. This stepwise filter can be combined with the other stepwise filters. It cannot be combined with the simple filter parameter. See filter for details of this filter's possible values.
    try {
      PageResponseLinkDTO result = apiInstance.getLinksUsingGET(domain, count, effectiveDate, filter, linkDepth, linkObjectId, linkSubjectId, linkSubjectVersion, offset, rfilter, sort, tfilter, useEffectiveDate, vfilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksControllerApi#getLinksUsingGET");
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
| **count** | **Integer**| For pagination, the number of entities per page | [optional] |
| **effectiveDate** | **OffsetDateTime**|  | [optional] |
| **filter** | **String**| A simple filter that can be used in place of the complex filters. If the query asks for the latest version (which is the default), this filter&#39;s domains, types, states, and override ids are applied when determining the latest version. All other attributes of this filter are applied when building the link tree. The filter value is a semicolon delimited list of key value pairs. For example:  name:Example;states:DRAFT,APPROVED;searchString:*ample List values separate possible values with commas. Keys include: | filter name           | Filter value description                                                                        | |-----------------------|-------------------------------------------------------------------------------------------------| | description           | Match resources with this description.                                                          | | excludedTypes         | Match resources whose types do not appear in this comma-separated list.                         | | variableIsArray       | Matches resources against this value.                                                           | | variableType          | Match resources whose variableType is one of these specified.                                   | | ids                   | Match resources with ids in this comma-separated list.                                          | | excludedIds           | Match resources with ids that are NOT in this comma-separated list.                             | | parentId              | Exclude this resource and others directly linked to it. Only usable in the resources API.       | | parentVersion         | For use with parentId. Must use both.                                                           | | name                  | Match resources with this name.                                                                 | | overrideIds           | When matching by states, do not apply the states filter to resources with ids in this list.     | | overrideStates        | When matching by states, apply this states filter to resources with ids in the overrideIds list.| | resourcePackId        | Match resources with this resource pack id.                                                     | | searchString          | Match resources with names or descriptions matching this string. Use a &amp;ast; as a wildcard.     | | caseSensitive         | Specify if searches (name, description, searchString) are case sensitive or not.                | | wholeWord             | Specify if searches (name, description, searchString) match whole word or not.                  | | createdBy             | Match resources created by this user.                                                           | | lastModifiedBy        | Match resources last modified by this user.                                                     | | createdDateStart      | Match resources created on or after this date. (yyyy-MM-dd format).                                   | | createdDateEnd        | Match resources created before this date. (yyyy-MM-dd format).                                  | | lastModifiedDateStart | Match resources last modified on or after this date. (yyyy-MM-dd format).                             | | lastModifiedDateEnd   | Match resources last modified before this date. (yyyy-MM-dd format).                            | | states                | Match resources with states in this list. States include: DRAFT,REVIEW,APPROVED,REJECTED      | | latestVersion         | Set to false to fetch all versions of resources matching the rest of this filter. Only usable in the resources API.| | types                 | Match resources with types in this list. Types include: resourcepack, exstrapplication, exstrdocument, exstrpage, exstrcomponentobj, exstremail, exstrengine, exstrvariablebase, exstrpackage, exstrgraphicalmessage, exstrtextmessage, exstrparagraph, exstrparagraphsection, image, samplefile, exstrdatasource, exstrhtml5, versionedtemplate, documentdefinition, enginerundef, font, fontdefinition, exstrbarcode, exstrpapertype, exstrmessagetype, exstrmetadata, exstrcommunicationset, exstroutputqueue, exstroutput, exstrmigrationset, exstrmessaging         | | systemResource        | Match resources that are (or are not) system resources.                                         | | hasApprovedVersion    | Match resources where a previously approved version of the resources exist.                     | | hidden                | Match resources that are (or are not) hidden.                                                   | | includeVariants       | Set to true to include variants in the response. By default they are excluded unless standardVariantId is specified.| | standardVariantId     | Match resources that are variants of this specified one. Can not be used when includeVariants is explicitly false.  | | categories            | Match resources that are contain at least one of the categories from this list.                 | | [optional] |
| **linkDepth** | **Integer**| Optionally specify the maximum depth for a recursive traversal of a link tree. | [optional] [default to 1] |
| **linkObjectId** | **UUID**|  | [optional] |
| **linkSubjectId** | **UUID**|  | [optional] |
| **linkSubjectVersion** | **Integer**|  | [optional] |
| **offset** | **Integer**| For pagination, fetch entities after this many | [optional] |
| **rfilter** | **String**| The query will use this value to filter resources after it has determined latest versions and traversed the link tree. This stepwise filter can be combined with the other stepwise filters. It cannot be combined with the simple filter parameter. See filter for details of this filter&#39;s possible values. | [optional] |
| **sort** | **String**| Comma separated list of {asc|desc}_{field name} | [optional] |
| **tfilter** | **String**| The query will use this value to filter resources as the query traverses the link tree. This stepwise filter can be combined with the other stepwise filters. It cannot be combined with the simple filter parameter. See filter for details of this filter&#39;s possible values. | [optional] |
| **useEffectiveDate** | **Boolean**|  | [optional] |
| **vfilter** | **String**| The query will use this value to filter resources as the query determines latest versions. This stepwise filter can be combined with the other stepwise filters. It cannot be combined with the simple filter parameter. See filter for details of this filter&#39;s possible values. | [optional] |

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="getResourcesUsingGET"></a>
# **getResourcesUsingGET**
> PageResponseResourceVersion getResourcesUsingGET(domain, count, effectiveDate, filter, linkDepth, linkObjectId, linkSubjectId, offset, rfilter, sort, tfilter, useEffectiveDate, vfilter)

Fetch resources that are linked to/from another resource

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
    defaultClient.setBasePath("http://localhost/design");

    LinksControllerApi apiInstance = new LinksControllerApi(defaultClient);
    String domain = "domain_example"; // String | domain
    Integer count = 1000; // Integer | For pagination, the number of entities per page
    OffsetDateTime effectiveDate = OffsetDateTime.now(); // OffsetDateTime | 
    String filter = "filter_example"; // String | A simple filter that can be used in place of the complex filters. If the query asks for the latest version (which is the default), this filter's domains, types, states, and override ids are applied when determining the latest version. All other attributes of this filter are applied when building the link tree. The filter value is a semicolon delimited list of key value pairs. For example:  name:Example;states:DRAFT,APPROVED;searchString:*ample List values separate possible values with commas. Keys include: | filter name           | Filter value description                                                                        | |-----------------------|-------------------------------------------------------------------------------------------------| | description           | Match resources with this description.                                                          | | excludedTypes         | Match resources whose types do not appear in this comma-separated list.                         | | variableIsArray       | Matches resources against this value.                                                           | | variableType          | Match resources whose variableType is one of these specified.                                   | | ids                   | Match resources with ids in this comma-separated list.                                          | | excludedIds           | Match resources with ids that are NOT in this comma-separated list.                             | | parentId              | Exclude this resource and others directly linked to it. Only usable in the resources API.       | | parentVersion         | For use with parentId. Must use both.                                                           | | name                  | Match resources with this name.                                                                 | | overrideIds           | When matching by states, do not apply the states filter to resources with ids in this list.     | | overrideStates        | When matching by states, apply this states filter to resources with ids in the overrideIds list.| | resourcePackId        | Match resources with this resource pack id.                                                     | | searchString          | Match resources with names or descriptions matching this string. Use a &ast; as a wildcard.     | | caseSensitive         | Specify if searches (name, description, searchString) are case sensitive or not.                | | wholeWord             | Specify if searches (name, description, searchString) match whole word or not.                  | | createdBy             | Match resources created by this user.                                                           | | lastModifiedBy        | Match resources last modified by this user.                                                     | | createdDateStart      | Match resources created on or after this date. (yyyy-MM-dd format).                                   | | createdDateEnd        | Match resources created before this date. (yyyy-MM-dd format).                                  | | lastModifiedDateStart | Match resources last modified on or after this date. (yyyy-MM-dd format).                             | | lastModifiedDateEnd   | Match resources last modified before this date. (yyyy-MM-dd format).                            | | states                | Match resources with states in this list. States include: DRAFT,REVIEW,APPROVED,REJECTED      | | latestVersion         | Set to false to fetch all versions of resources matching the rest of this filter. Only usable in the resources API.| | types                 | Match resources with types in this list. Types include: resourcepack, exstrapplication, exstrdocument, exstrpage, exstrcomponentobj, exstremail, exstrengine, exstrvariablebase, exstrpackage, exstrgraphicalmessage, exstrtextmessage, exstrparagraph, exstrparagraphsection, image, samplefile, exstrdatasource, exstrhtml5, versionedtemplate, documentdefinition, enginerundef, font, fontdefinition, exstrbarcode, exstrpapertype, exstrmessagetype, exstrmetadata, exstrcommunicationset, exstroutputqueue, exstroutput, exstrmigrationset, exstrmessaging         | | systemResource        | Match resources that are (or are not) system resources.                                         | | hasApprovedVersion    | Match resources where a previously approved version of the resources exist.                     | | hidden                | Match resources that are (or are not) hidden.                                                   | | includeVariants       | Set to true to include variants in the response. By default they are excluded unless standardVariantId is specified.| | standardVariantId     | Match resources that are variants of this specified one. Can not be used when includeVariants is explicitly false.  | | categories            | Match resources that are contain at least one of the categories from this list.                 |
    Integer linkDepth = 1; // Integer | Optionally specify the maximum depth for a recursive traversal of a link tree.
    UUID linkObjectId = UUID.randomUUID(); // UUID | 
    UUID linkSubjectId = UUID.randomUUID(); // UUID | 
    Integer offset = 0; // Integer | For pagination, fetch entities after this many
    String rfilter = "rfilter_example"; // String | The query will use this value to filter resources after it has determined latest versions and traversed the link tree. This stepwise filter can be combined with the other stepwise filters. It cannot be combined with the simple filter parameter. See filter for details of this filter's possible values.
    String sort = "sort_example"; // String | Comma separated list of {asc|desc}_{field name}
    String tfilter = "tfilter_example"; // String | The query will use this value to filter resources as the query traverses the link tree. This stepwise filter can be combined with the other stepwise filters. It cannot be combined with the simple filter parameter. See filter for details of this filter's possible values.
    Boolean useEffectiveDate = true; // Boolean | 
    String vfilter = "vfilter_example"; // String | The query will use this value to filter resources as the query determines latest versions. This stepwise filter can be combined with the other stepwise filters. It cannot be combined with the simple filter parameter. See filter for details of this filter's possible values.
    try {
      PageResponseResourceVersion result = apiInstance.getResourcesUsingGET(domain, count, effectiveDate, filter, linkDepth, linkObjectId, linkSubjectId, offset, rfilter, sort, tfilter, useEffectiveDate, vfilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksControllerApi#getResourcesUsingGET");
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
| **count** | **Integer**| For pagination, the number of entities per page | [optional] |
| **effectiveDate** | **OffsetDateTime**|  | [optional] |
| **filter** | **String**| A simple filter that can be used in place of the complex filters. If the query asks for the latest version (which is the default), this filter&#39;s domains, types, states, and override ids are applied when determining the latest version. All other attributes of this filter are applied when building the link tree. The filter value is a semicolon delimited list of key value pairs. For example:  name:Example;states:DRAFT,APPROVED;searchString:*ample List values separate possible values with commas. Keys include: | filter name           | Filter value description                                                                        | |-----------------------|-------------------------------------------------------------------------------------------------| | description           | Match resources with this description.                                                          | | excludedTypes         | Match resources whose types do not appear in this comma-separated list.                         | | variableIsArray       | Matches resources against this value.                                                           | | variableType          | Match resources whose variableType is one of these specified.                                   | | ids                   | Match resources with ids in this comma-separated list.                                          | | excludedIds           | Match resources with ids that are NOT in this comma-separated list.                             | | parentId              | Exclude this resource and others directly linked to it. Only usable in the resources API.       | | parentVersion         | For use with parentId. Must use both.                                                           | | name                  | Match resources with this name.                                                                 | | overrideIds           | When matching by states, do not apply the states filter to resources with ids in this list.     | | overrideStates        | When matching by states, apply this states filter to resources with ids in the overrideIds list.| | resourcePackId        | Match resources with this resource pack id.                                                     | | searchString          | Match resources with names or descriptions matching this string. Use a &amp;ast; as a wildcard.     | | caseSensitive         | Specify if searches (name, description, searchString) are case sensitive or not.                | | wholeWord             | Specify if searches (name, description, searchString) match whole word or not.                  | | createdBy             | Match resources created by this user.                                                           | | lastModifiedBy        | Match resources last modified by this user.                                                     | | createdDateStart      | Match resources created on or after this date. (yyyy-MM-dd format).                                   | | createdDateEnd        | Match resources created before this date. (yyyy-MM-dd format).                                  | | lastModifiedDateStart | Match resources last modified on or after this date. (yyyy-MM-dd format).                             | | lastModifiedDateEnd   | Match resources last modified before this date. (yyyy-MM-dd format).                            | | states                | Match resources with states in this list. States include: DRAFT,REVIEW,APPROVED,REJECTED      | | latestVersion         | Set to false to fetch all versions of resources matching the rest of this filter. Only usable in the resources API.| | types                 | Match resources with types in this list. Types include: resourcepack, exstrapplication, exstrdocument, exstrpage, exstrcomponentobj, exstremail, exstrengine, exstrvariablebase, exstrpackage, exstrgraphicalmessage, exstrtextmessage, exstrparagraph, exstrparagraphsection, image, samplefile, exstrdatasource, exstrhtml5, versionedtemplate, documentdefinition, enginerundef, font, fontdefinition, exstrbarcode, exstrpapertype, exstrmessagetype, exstrmetadata, exstrcommunicationset, exstroutputqueue, exstroutput, exstrmigrationset, exstrmessaging         | | systemResource        | Match resources that are (or are not) system resources.                                         | | hasApprovedVersion    | Match resources where a previously approved version of the resources exist.                     | | hidden                | Match resources that are (or are not) hidden.                                                   | | includeVariants       | Set to true to include variants in the response. By default they are excluded unless standardVariantId is specified.| | standardVariantId     | Match resources that are variants of this specified one. Can not be used when includeVariants is explicitly false.  | | categories            | Match resources that are contain at least one of the categories from this list.                 | | [optional] |
| **linkDepth** | **Integer**| Optionally specify the maximum depth for a recursive traversal of a link tree. | [optional] [default to 1] |
| **linkObjectId** | **UUID**|  | [optional] |
| **linkSubjectId** | **UUID**|  | [optional] |
| **offset** | **Integer**| For pagination, fetch entities after this many | [optional] |
| **rfilter** | **String**| The query will use this value to filter resources after it has determined latest versions and traversed the link tree. This stepwise filter can be combined with the other stepwise filters. It cannot be combined with the simple filter parameter. See filter for details of this filter&#39;s possible values. | [optional] |
| **sort** | **String**| Comma separated list of {asc|desc}_{field name} | [optional] |
| **tfilter** | **String**| The query will use this value to filter resources as the query traverses the link tree. This stepwise filter can be combined with the other stepwise filters. It cannot be combined with the simple filter parameter. See filter for details of this filter&#39;s possible values. | [optional] |
| **useEffectiveDate** | **Boolean**|  | [optional] |
| **vfilter** | **String**| The query will use this value to filter resources as the query determines latest versions. This stepwise filter can be combined with the other stepwise filters. It cannot be combined with the simple filter parameter. See filter for details of this filter&#39;s possible values. | [optional] |

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

