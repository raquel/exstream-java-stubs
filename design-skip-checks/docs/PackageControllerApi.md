# PackageControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/design*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPackage**](PackageControllerApi.md#getPackage) | **GET** /api/v1/package/{domain}/root/{id} |  |
| [**getPackageAllResourceType**](PackageControllerApi.md#getPackageAllResourceType) | **GET** /api/v1/package/{domain}/type |  |
| [**getPackageWithPayload**](PackageControllerApi.md#getPackageWithPayload) | **POST** /api/v1/package/{domain}/root/{id} |  |
| [**packageDeploymentUpload**](PackageControllerApi.md#packageDeploymentUpload) | **POST** /api/v1/package/{domain}/deployment |  |
| [**subPackageDeploymentUpload**](PackageControllerApi.md#subPackageDeploymentUpload) | **POST** /api/v1/package/{domain}/deploySubPub |  |


<a id="getPackage"></a>
# **getPackage**
> getPackage(domain, id, version, latestVersions)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackageControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    PackageControllerApi apiInstance = new PackageControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    Integer version = 56; // Integer | 
    Boolean latestVersions = false; // Boolean | 
    try {
      apiInstance.getPackage(domain, id, version, latestVersions);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageControllerApi#getPackage");
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
| **latestVersions** | **Boolean**|  | [optional] [default to false] |

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

<a id="getPackageAllResourceType"></a>
# **getPackageAllResourceType**
> getPackageAllResourceType(domain, resourceType, latestVersions)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackageControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    PackageControllerApi apiInstance = new PackageControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    String resourceType = "all"; // String | 
    Boolean latestVersions = false; // Boolean | 
    try {
      apiInstance.getPackageAllResourceType(domain, resourceType, latestVersions);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageControllerApi#getPackageAllResourceType");
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
| **resourceType** | **String**|  | [enum: all, designer, author, designAsset, commAsset, orchestrator, resourcepack, exstrapplication, exstrdocument, exstrpage, exstrcomponentobj, exstremail, exstrengine, exstrvariablebase, exstrpackage, exstrgraphicalmessage, exstrtextmessage, exstrparagraph, exstrparagraphsection, image, samplefile, exstrdatasource, exstrhtml5, versionedtemplate, documentdefinition, enginerundef, font, fontdefinition, exstrbarcode, exstrpapertype, exstrmessagetype, exstrmetadata, orcsettings, flowmodel, exstrcommunicationset, exstroutputqueue, exstroutput, exstrlanguage, exstrlocale, exstrmigrationset, exstrmessaging, exstrmessagingauthor, flowscript, exstrnamedcolor, exstrcolorfamily, exstrstyle, exstrstylesheet, exstrevent, exstrrule, dashboard, pdf] |
| **latestVersions** | **Boolean**|  | [optional] [default to false] |

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

<a id="getPackageWithPayload"></a>
# **getPackageWithPayload**
> getPackageWithPayload(domain, id, version, latestVersions, packageOptions)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackageControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    PackageControllerApi apiInstance = new PackageControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    Integer version = 56; // Integer | 
    Boolean latestVersions = false; // Boolean | 
    PackageOptions packageOptions = new PackageOptions(); // PackageOptions | 
    try {
      apiInstance.getPackageWithPayload(domain, id, version, latestVersions, packageOptions);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageControllerApi#getPackageWithPayload");
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
| **latestVersions** | **Boolean**|  | [optional] [default to false] |
| **packageOptions** | [**PackageOptions**](PackageOptions.md)|  | [optional] |

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

<a id="packageDeploymentUpload"></a>
# **packageDeploymentUpload**
> ListResponseResourceVersion packageDeploymentUpload(domain, resourcePackId, templateId, packageId, rpFileName, packageFileName, templateFileName, sampleFile1, sampleFile2)



Handle a multi-part form request to deploy packages and their associated resources

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackageControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    PackageControllerApi apiInstance = new PackageControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    List<UUID> resourcePackId = Arrays.asList(); // List<UUID> | 
    UUID templateId = UUID.randomUUID(); // UUID | 
    UUID packageId = UUID.randomUUID(); // UUID | 
    File rpFileName = new File("/path/to/file"); // File | 
    File packageFileName = new File("/path/to/file"); // File | 
    File templateFileName = new File("/path/to/file"); // File | 
    File sampleFile1 = new File("/path/to/file"); // File | Accepts any number of sample files with name matching pattern: ^sampleFile_.+
    File sampleFile2 = new File("/path/to/file"); // File | Accepts any number of sample files with name matching pattern: ^sampleFile_.+
    try {
      ListResponseResourceVersion result = apiInstance.packageDeploymentUpload(domain, resourcePackId, templateId, packageId, rpFileName, packageFileName, templateFileName, sampleFile1, sampleFile2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageControllerApi#packageDeploymentUpload");
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
| **resourcePackId** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **templateId** | **UUID**|  | [optional] |
| **packageId** | **UUID**|  | [optional] |
| **rpFileName** | **File**|  | [optional] |
| **packageFileName** | **File**|  | [optional] |
| **templateFileName** | **File**|  | [optional] |
| **sampleFile1** | **File**| Accepts any number of sample files with name matching pattern: ^sampleFile_.+ | [optional] |
| **sampleFile2** | **File**| Accepts any number of sample files with name matching pattern: ^sampleFile_.+ | [optional] |

### Return type

[**ListResponseResourceVersion**](ListResponseResourceVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="subPackageDeploymentUpload"></a>
# **subPackageDeploymentUpload**
> ListResponseResourceVersion subPackageDeploymentUpload(domain, packageId, parentPackageId, rpFileName, packageFileName, templateFileName, sampleFile1, sampleFile2)



Handle a multi-part form request to deploy packages and their associated resources

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackageControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/design");

    PackageControllerApi apiInstance = new PackageControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID packageId = UUID.randomUUID(); // UUID | 
    UUID parentPackageId = UUID.randomUUID(); // UUID | 
    File rpFileName = new File("/path/to/file"); // File | 
    File packageFileName = new File("/path/to/file"); // File | 
    File templateFileName = new File("/path/to/file"); // File | 
    File sampleFile1 = new File("/path/to/file"); // File | Accepts any number of sample files with name matching pattern: ^sampleFile_.+
    File sampleFile2 = new File("/path/to/file"); // File | Accepts any number of sample files with name matching pattern: ^sampleFile_.+
    try {
      ListResponseResourceVersion result = apiInstance.subPackageDeploymentUpload(domain, packageId, parentPackageId, rpFileName, packageFileName, templateFileName, sampleFile1, sampleFile2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageControllerApi#subPackageDeploymentUpload");
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
| **packageId** | **UUID**|  | [optional] |
| **parentPackageId** | **UUID**|  | [optional] |
| **rpFileName** | **File**|  | [optional] |
| **packageFileName** | **File**|  | [optional] |
| **templateFileName** | **File**|  | [optional] |
| **sampleFile1** | **File**| Accepts any number of sample files with name matching pattern: ^sampleFile_.+ | [optional] |
| **sampleFile2** | **File**| Accepts any number of sample files with name matching pattern: ^sampleFile_.+ | [optional] |

### Return type

[**ListResponseResourceVersion**](ListResponseResourceVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

