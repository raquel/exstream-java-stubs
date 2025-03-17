# MigrationSetControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/rationalizationApi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**applyPatchForMigrationSet**](MigrationSetControllerApi.md#applyPatchForMigrationSet) | **PATCH** /api/v1/migrationset/{domainId}/{msId} |  |
| [**createLinkBtwRatAndDasMigrationSet**](MigrationSetControllerApi.md#createLinkBtwRatAndDasMigrationSet) | **POST** /api/v1/migrationset/{domain}/links |  |
| [**createMigrationSet**](MigrationSetControllerApi.md#createMigrationSet) | **POST** /api/v1/migrationset/{domain} |  |
| [**createRationalizationActivity**](MigrationSetControllerApi.md#createRationalizationActivity) | **POST** /api/v1/migrationset/{domain}/tmpfile |  |
| [**deleteMigrationSet**](MigrationSetControllerApi.md#deleteMigrationSet) | **DELETE** /api/v1/migrationset/{domainId}/{msId}/{updateOnly} |  |
| [**getCanDeleteMigrationSet**](MigrationSetControllerApi.md#getCanDeleteMigrationSet) | **GET** /api/v1/migrationset/{domain}/{id}/deletion-eligibility |  |
| [**getFragmentReference**](MigrationSetControllerApi.md#getFragmentReference) | **GET** /api/v1/migrationset/{domain}/fragments/refernce/{msId}/{varId} |  |
| [**getFragmentsOfMigrationSet**](MigrationSetControllerApi.md#getFragmentsOfMigrationSet) | **GET** /api/v1/migrationset/fragments/{domain}/{msId} |  |
| [**getFragmentsOfTemplateMigrationSet**](MigrationSetControllerApi.md#getFragmentsOfTemplateMigrationSet) | **GET** /api/v1/migrationset/template/fragments/{domain}/{msId} |  |
| [**getFragmentsReferences**](MigrationSetControllerApi.md#getFragmentsReferences) | **GET** /api/v1/migrationset/{domain}/fragment/references/{fragmentId} |  |
| [**getMigrationSet2**](MigrationSetControllerApi.md#getMigrationSet2) | **GET** /api/v1/migrationset/{domainId}/{msId} |  |
| [**getMigrationSetLinks**](MigrationSetControllerApi.md#getMigrationSetLinks) | **GET** /api/v1/migrationset/{domain}/links/{msId} |  |
| [**getMigrationSets**](MigrationSetControllerApi.md#getMigrationSets) | **GET** /api/v1/migrationset/{domain} |  |
| [**getPdfFragments**](MigrationSetControllerApi.md#getPdfFragments) | **GET** /api/v1/migrationset/{domain}/fragments/pdf/{msId} |  |
| [**getResourceHistory**](MigrationSetControllerApi.md#getResourceHistory) | **GET** /api/v1/migrationset/{domain}/{msid}/history |  |
| [**getTemplateDetailsOfMigrationSet**](MigrationSetControllerApi.md#getTemplateDetailsOfMigrationSet) | **GET** /api/v1/migrationset/template/{domain}/{msId} |  |
| [**getTemplateFragmentsReferences**](MigrationSetControllerApi.md#getTemplateFragmentsReferences) | **GET** /api/v1/migrationset/{domain}/template/fragment/references/{fragmentId}/{templateId} |  |
| [**getTemplateRuleFragmentsReferences**](MigrationSetControllerApi.md#getTemplateRuleFragmentsReferences) | **GET** /api/v1/migrationset/{domain}/template/rule/references/{ruleId}/{templateId} |  |
| [**getTemplateVariableFragmentsReferences**](MigrationSetControllerApi.md#getTemplateVariableFragmentsReferences) | **GET** /api/v1/migrationset/{domain}/template/variable/references/{variableId}/{templateId} |  |
| [**promote**](MigrationSetControllerApi.md#promote) | **PUT** /api/v1/migrationset/{domain}/{id}/promote |  |
| [**updateMigrationSet**](MigrationSetControllerApi.md#updateMigrationSet) | **PUT** /api/v1/migrationset/{domainId}/{msId} |  |
| [**updateRationalizationActivity**](MigrationSetControllerApi.md#updateRationalizationActivity) | **PUT** /api/v1/migrationset/{domain}/{msId}/tmpfile |  |
| [**updateRationalizationState**](MigrationSetControllerApi.md#updateRationalizationState) | **PUT** /api/v1/migrationset/{domain}/{msId}/state |  |


<a id="applyPatchForMigrationSet"></a>
# **applyPatchForMigrationSet**
> String applyPatchForMigrationSet(domainId, msId, migrationSetPatchRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetControllerApi apiInstance = new MigrationSetControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    UUID msId = UUID.randomUUID(); // UUID | 
    MigrationSetPatchRequest migrationSetPatchRequest = new MigrationSetPatchRequest(); // MigrationSetPatchRequest | 
    try {
      String result = apiInstance.applyPatchForMigrationSet(domainId, msId, migrationSetPatchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetControllerApi#applyPatchForMigrationSet");
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
| **domainId** | **String**|  | |
| **msId** | **UUID**|  | |
| **migrationSetPatchRequest** | [**MigrationSetPatchRequest**](MigrationSetPatchRequest.md)|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createLinkBtwRatAndDasMigrationSet"></a>
# **createLinkBtwRatAndDasMigrationSet**
> RationalizationResponseObject createLinkBtwRatAndDasMigrationSet(domain, migrationSetLinkRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetControllerApi apiInstance = new MigrationSetControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    MigrationSetLinkRequest migrationSetLinkRequest = new MigrationSetLinkRequest(); // MigrationSetLinkRequest | 
    try {
      RationalizationResponseObject result = apiInstance.createLinkBtwRatAndDasMigrationSet(domain, migrationSetLinkRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetControllerApi#createLinkBtwRatAndDasMigrationSet");
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
| **migrationSetLinkRequest** | [**MigrationSetLinkRequest**](MigrationSetLinkRequest.md)|  | |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createMigrationSet"></a>
# **createMigrationSet**
> RationalizationResponseObject createMigrationSet(domain, migrationSetRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetControllerApi apiInstance = new MigrationSetControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    MigrationSetRequest migrationSetRequest = new MigrationSetRequest(); // MigrationSetRequest | 
    try {
      RationalizationResponseObject result = apiInstance.createMigrationSet(domain, migrationSetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetControllerApi#createMigrationSet");
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
| **migrationSetRequest** | [**MigrationSetRequest**](MigrationSetRequest.md)|  | |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createRationalizationActivity"></a>
# **createRationalizationActivity**
> RationalizationResponseObject createRationalizationActivity(domain, migrationType, updateRationalizationActivityRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetControllerApi apiInstance = new MigrationSetControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    String migrationType = "CONTENT"; // String | 
    UpdateRationalizationActivityRequest updateRationalizationActivityRequest = new UpdateRationalizationActivityRequest(); // UpdateRationalizationActivityRequest | 
    try {
      RationalizationResponseObject result = apiInstance.createRationalizationActivity(domain, migrationType, updateRationalizationActivityRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetControllerApi#createRationalizationActivity");
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
| **migrationType** | **String**|  | [optional] [default to CONTENT] |
| **updateRationalizationActivityRequest** | [**UpdateRationalizationActivityRequest**](UpdateRationalizationActivityRequest.md)|  | [optional] |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteMigrationSet"></a>
# **deleteMigrationSet**
> RationalizationResponseObject deleteMigrationSet(domainId, msId, updateOnly)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetControllerApi apiInstance = new MigrationSetControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    UUID msId = UUID.randomUUID(); // UUID | 
    Boolean updateOnly = true; // Boolean | 
    try {
      RationalizationResponseObject result = apiInstance.deleteMigrationSet(domainId, msId, updateOnly);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetControllerApi#deleteMigrationSet");
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
| **domainId** | **String**|  | |
| **msId** | **UUID**|  | |
| **updateOnly** | **Boolean**|  | |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCanDeleteMigrationSet"></a>
# **getCanDeleteMigrationSet**
> RationalizationResponseObject getCanDeleteMigrationSet(domain, id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetControllerApi apiInstance = new MigrationSetControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      RationalizationResponseObject result = apiInstance.getCanDeleteMigrationSet(domain, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetControllerApi#getCanDeleteMigrationSet");
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

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getFragmentReference"></a>
# **getFragmentReference**
> RationalizationResponseObject getFragmentReference(domain, msId, varId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetControllerApi apiInstance = new MigrationSetControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID msId = UUID.randomUUID(); // UUID | 
    UUID varId = UUID.randomUUID(); // UUID | 
    try {
      RationalizationResponseObject result = apiInstance.getFragmentReference(domain, msId, varId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetControllerApi#getFragmentReference");
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
| **msId** | **UUID**|  | |
| **varId** | **UUID**|  | |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getFragmentsOfMigrationSet"></a>
# **getFragmentsOfMigrationSet**
> RationalizationResponseObject getFragmentsOfMigrationSet(domain, msId, offset, limit, orderby, filter, hidden, references)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetControllerApi apiInstance = new MigrationSetControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID msId = UUID.randomUUID(); // UUID | 
    Integer offset = 0; // Integer | 
    Integer limit = 10; // Integer | 
    Object orderby = null; // Object | 
    RationalisationFilter filter = new RationalisationFilter(); // RationalisationFilter | 
    Boolean hidden = false; // Boolean | 
    Boolean references = false; // Boolean | 
    try {
      RationalizationResponseObject result = apiInstance.getFragmentsOfMigrationSet(domain, msId, offset, limit, orderby, filter, hidden, references);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetControllerApi#getFragmentsOfMigrationSet");
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
| **msId** | **UUID**|  | |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **limit** | **Integer**|  | [optional] [default to 10] |
| **orderby** | [**Object**](.md)|  | [optional] |
| **filter** | [**RationalisationFilter**](.md)|  | [optional] |
| **hidden** | **Boolean**|  | [optional] [default to false] |
| **references** | **Boolean**|  | [optional] [default to false] |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getFragmentsOfTemplateMigrationSet"></a>
# **getFragmentsOfTemplateMigrationSet**
> RationalizationResponseObject getFragmentsOfTemplateMigrationSet(domain, msId, offset, limit, orderby, filter, hidden, references)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetControllerApi apiInstance = new MigrationSetControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID msId = UUID.randomUUID(); // UUID | 
    Integer offset = 0; // Integer | 
    Integer limit = 10; // Integer | 
    Object orderby = null; // Object | 
    RationalisationFilter filter = new RationalisationFilter(); // RationalisationFilter | 
    Boolean hidden = false; // Boolean | 
    Boolean references = false; // Boolean | 
    try {
      RationalizationResponseObject result = apiInstance.getFragmentsOfTemplateMigrationSet(domain, msId, offset, limit, orderby, filter, hidden, references);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetControllerApi#getFragmentsOfTemplateMigrationSet");
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
| **msId** | **UUID**|  | |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **limit** | **Integer**|  | [optional] [default to 10] |
| **orderby** | [**Object**](.md)|  | [optional] |
| **filter** | [**RationalisationFilter**](.md)|  | [optional] |
| **hidden** | **Boolean**|  | [optional] [default to false] |
| **references** | **Boolean**|  | [optional] [default to false] |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getFragmentsReferences"></a>
# **getFragmentsReferences**
> RationalizationResponseObject getFragmentsReferences(domain, fragmentId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetControllerApi apiInstance = new MigrationSetControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID fragmentId = UUID.randomUUID(); // UUID | 
    try {
      RationalizationResponseObject result = apiInstance.getFragmentsReferences(domain, fragmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetControllerApi#getFragmentsReferences");
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
| **fragmentId** | **UUID**|  | |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMigrationSet2"></a>
# **getMigrationSet2**
> RationalizationResponseObject getMigrationSet2(domainId, msId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetControllerApi apiInstance = new MigrationSetControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    UUID msId = UUID.randomUUID(); // UUID | 
    try {
      RationalizationResponseObject result = apiInstance.getMigrationSet2(domainId, msId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetControllerApi#getMigrationSet2");
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
| **domainId** | **String**|  | |
| **msId** | **UUID**|  | |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMigrationSetLinks"></a>
# **getMigrationSetLinks**
> RationalizationResponseObject getMigrationSetLinks(domain, msId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetControllerApi apiInstance = new MigrationSetControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID msId = UUID.randomUUID(); // UUID | 
    try {
      RationalizationResponseObject result = apiInstance.getMigrationSetLinks(domain, msId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetControllerApi#getMigrationSetLinks");
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
| **msId** | **UUID**|  | |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMigrationSets"></a>
# **getMigrationSets**
> RationalizationResponseObject getMigrationSets(domain, offset, limit, orderby, filter, hidden, latestversion, checkIfApproved)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetControllerApi apiInstance = new MigrationSetControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    Integer offset = 0; // Integer | 
    Integer limit = 2147483647; // Integer | 
    Object orderby = null; // Object | 
    RationalisationFilter filter = new RationalisationFilter(); // RationalisationFilter | 
    Boolean hidden = false; // Boolean | 
    Boolean latestversion = false; // Boolean | 
    Boolean checkIfApproved = false; // Boolean | 
    try {
      RationalizationResponseObject result = apiInstance.getMigrationSets(domain, offset, limit, orderby, filter, hidden, latestversion, checkIfApproved);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetControllerApi#getMigrationSets");
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
| **offset** | **Integer**|  | [optional] [default to 0] |
| **limit** | **Integer**|  | [optional] [default to 2147483647] |
| **orderby** | [**Object**](.md)|  | [optional] |
| **filter** | [**RationalisationFilter**](.md)|  | [optional] |
| **hidden** | **Boolean**|  | [optional] [default to false] |
| **latestversion** | **Boolean**|  | [optional] [default to false] |
| **checkIfApproved** | **Boolean**|  | [optional] [default to false] |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getPdfFragments"></a>
# **getPdfFragments**
> RationalizationResponseObject getPdfFragments(domain, msId, pdfid, pageno, pagecount)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetControllerApi apiInstance = new MigrationSetControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID msId = UUID.randomUUID(); // UUID | 
    UUID pdfid = UUID.randomUUID(); // UUID | 
    Integer pageno = 0; // Integer | 
    Integer pagecount = 0; // Integer | 
    try {
      RationalizationResponseObject result = apiInstance.getPdfFragments(domain, msId, pdfid, pageno, pagecount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetControllerApi#getPdfFragments");
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
| **msId** | **UUID**|  | |
| **pdfid** | **UUID**|  | |
| **pageno** | **Integer**|  | [optional] [default to 0] |
| **pagecount** | **Integer**|  | [optional] [default to 0] |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getResourceHistory"></a>
# **getResourceHistory**
> RationalizationResponseObject getResourceHistory(domain, msid)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetControllerApi apiInstance = new MigrationSetControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID msid = UUID.randomUUID(); // UUID | 
    try {
      RationalizationResponseObject result = apiInstance.getResourceHistory(domain, msid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetControllerApi#getResourceHistory");
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
| **msid** | **UUID**|  | |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTemplateDetailsOfMigrationSet"></a>
# **getTemplateDetailsOfMigrationSet**
> RationalizationResponseObject getTemplateDetailsOfMigrationSet(domain, msId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetControllerApi apiInstance = new MigrationSetControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID msId = UUID.randomUUID(); // UUID | 
    try {
      RationalizationResponseObject result = apiInstance.getTemplateDetailsOfMigrationSet(domain, msId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetControllerApi#getTemplateDetailsOfMigrationSet");
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
| **msId** | **UUID**|  | |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTemplateFragmentsReferences"></a>
# **getTemplateFragmentsReferences**
> RationalizationResponseObject getTemplateFragmentsReferences(domain, fragmentId, templateId, communications)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetControllerApi apiInstance = new MigrationSetControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID fragmentId = UUID.randomUUID(); // UUID | 
    UUID templateId = UUID.randomUUID(); // UUID | 
    List<String> communications = Arrays.asList(); // List<String> | 
    try {
      RationalizationResponseObject result = apiInstance.getTemplateFragmentsReferences(domain, fragmentId, templateId, communications);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetControllerApi#getTemplateFragmentsReferences");
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
| **fragmentId** | **UUID**|  | |
| **templateId** | **UUID**|  | |
| **communications** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTemplateRuleFragmentsReferences"></a>
# **getTemplateRuleFragmentsReferences**
> RationalizationResponseObject getTemplateRuleFragmentsReferences(domain, ruleId, templateId, communications)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetControllerApi apiInstance = new MigrationSetControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID ruleId = UUID.randomUUID(); // UUID | 
    UUID templateId = UUID.randomUUID(); // UUID | 
    List<String> communications = Arrays.asList(); // List<String> | 
    try {
      RationalizationResponseObject result = apiInstance.getTemplateRuleFragmentsReferences(domain, ruleId, templateId, communications);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetControllerApi#getTemplateRuleFragmentsReferences");
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
| **ruleId** | **UUID**|  | |
| **templateId** | **UUID**|  | |
| **communications** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTemplateVariableFragmentsReferences"></a>
# **getTemplateVariableFragmentsReferences**
> RationalizationResponseObject getTemplateVariableFragmentsReferences(domain, variableId, templateId, communications)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetControllerApi apiInstance = new MigrationSetControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID variableId = UUID.randomUUID(); // UUID | 
    UUID templateId = UUID.randomUUID(); // UUID | 
    List<String> communications = Arrays.asList(); // List<String> | 
    try {
      RationalizationResponseObject result = apiInstance.getTemplateVariableFragmentsReferences(domain, variableId, templateId, communications);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetControllerApi#getTemplateVariableFragmentsReferences");
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
| **variableId** | **UUID**|  | |
| **templateId** | **UUID**|  | |
| **communications** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

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
> RationalizationResponseObject promote(domain, id, workflowRequestBody)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetControllerApi apiInstance = new MigrationSetControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    WorkflowRequestBody workflowRequestBody = new WorkflowRequestBody(); // WorkflowRequestBody | 
    try {
      RationalizationResponseObject result = apiInstance.promote(domain, id, workflowRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetControllerApi#promote");
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

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateMigrationSet"></a>
# **updateMigrationSet**
> RationalizationResponseObject updateMigrationSet(domainId, msId, migrationSetRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetControllerApi apiInstance = new MigrationSetControllerApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    UUID msId = UUID.randomUUID(); // UUID | 
    MigrationSetRequest migrationSetRequest = new MigrationSetRequest(); // MigrationSetRequest | 
    try {
      RationalizationResponseObject result = apiInstance.updateMigrationSet(domainId, msId, migrationSetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetControllerApi#updateMigrationSet");
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
| **domainId** | **String**|  | |
| **msId** | **UUID**|  | |
| **migrationSetRequest** | [**MigrationSetRequest**](MigrationSetRequest.md)|  | |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateRationalizationActivity"></a>
# **updateRationalizationActivity**
> RationalizationResponseObject updateRationalizationActivity(domain, msId, migrationType, updateRationalizationActivityRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetControllerApi apiInstance = new MigrationSetControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID msId = UUID.randomUUID(); // UUID | 
    String migrationType = "CONTENT"; // String | 
    UpdateRationalizationActivityRequest updateRationalizationActivityRequest = new UpdateRationalizationActivityRequest(); // UpdateRationalizationActivityRequest | 
    try {
      RationalizationResponseObject result = apiInstance.updateRationalizationActivity(domain, msId, migrationType, updateRationalizationActivityRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetControllerApi#updateRationalizationActivity");
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
| **msId** | **UUID**|  | |
| **migrationType** | **String**|  | [optional] [default to CONTENT] |
| **updateRationalizationActivityRequest** | [**UpdateRationalizationActivityRequest**](UpdateRationalizationActivityRequest.md)|  | [optional] |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateRationalizationState"></a>
# **updateRationalizationState**
> RationalizationResponseObject updateRationalizationState(domain, msId, workflowRequestBody)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationSetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/rationalizationApi");

    MigrationSetControllerApi apiInstance = new MigrationSetControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID msId = UUID.randomUUID(); // UUID | 
    WorkflowRequestBody workflowRequestBody = new WorkflowRequestBody(); // WorkflowRequestBody | 
    try {
      RationalizationResponseObject result = apiInstance.updateRationalizationState(domain, msId, workflowRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationSetControllerApi#updateRationalizationState");
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
| **msId** | **UUID**|  | |
| **workflowRequestBody** | [**WorkflowRequestBody**](WorkflowRequestBody.md)|  | |

### Return type

[**RationalizationResponseObject**](RationalizationResponseObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

