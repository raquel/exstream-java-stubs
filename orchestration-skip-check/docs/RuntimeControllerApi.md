# RuntimeControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/orchestration*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteFlowInstance**](RuntimeControllerApi.md#deleteFlowInstance) | **DELETE** /api/v1/runtime/{domain}/flow-instances/{id} |  |
| [**deleteJob**](RuntimeControllerApi.md#deleteJob) | **DELETE** /api/v1/runtime/{domain}/jobs/{id} | Delete completed job |
| [**deleteJobs**](RuntimeControllerApi.md#deleteJobs) | **DELETE** /api/v1/runtime/{domain}/jobs | Delete completed, canceled or failed jobs |
| [**getCustomerOutputArtifacts**](RuntimeControllerApi.md#getCustomerOutputArtifacts) | **GET** /api/v1/runtime/{domain}/flow-steps/{id}/customer-artifacts/{customerId} | Get the customer artifacts in a zip file |
| [**getDeliveryFileOutputFiles**](RuntimeControllerApi.md#getDeliveryFileOutputFiles) | **GET** /api/v1/runtime/{domain}/flow-steps/{id}/delivery-file/output-files |  |
| [**getDeliveryFileOutputs**](RuntimeControllerApi.md#getDeliveryFileOutputs) | **GET** /api/v1/runtime/{domain}/flow-steps/{id}/delivery-file/outputs |  |
| [**getDeliveryFileOutputs1**](RuntimeControllerApi.md#getDeliveryFileOutputs1) | **GET** /api/v1/runtime/{domain}/flow-steps/{id}/artifact/{artifactName} |  |
| [**getFlowInstance**](RuntimeControllerApi.md#getFlowInstance) | **GET** /api/v1/runtime/{domain}/flow-instances/{id} |  |
| [**getFlowInstanceCollectionResources**](RuntimeControllerApi.md#getFlowInstanceCollectionResources) | **GET** /api/v1/runtime/{domain}/flow-instances/{id}/collection-resources |  |
| [**getFlowInstanceInput**](RuntimeControllerApi.md#getFlowInstanceInput) | **GET** /api/v1/runtime/{domain}/flow-instances/{id}/input |  |
| [**getFlowInstances**](RuntimeControllerApi.md#getFlowInstances) | **GET** /api/v1/runtime/{domain}/flow-instances | Get flow instances |
| [**getFlowInstancesAndAssociatedJobs**](RuntimeControllerApi.md#getFlowInstancesAndAssociatedJobs) | **POST** /api/v1/runtime/{domain}/flow-instances/associated-jobs |  |
| [**getFlowInstancesCounts**](RuntimeControllerApi.md#getFlowInstancesCounts) | **POST** /api/v1/runtime/{domain}/flow-instances/counts | Get flow instances counts |
| [**getFlowModelSnapshot**](RuntimeControllerApi.md#getFlowModelSnapshot) | **GET** /api/v1/runtime/{domain}/flow-model-snapshots/{snapshotId} |  |
| [**getFlowModelSnapshots**](RuntimeControllerApi.md#getFlowModelSnapshots) | **GET** /api/v1/runtime/{domain}/flow-model-snapshots |  |
| [**getFlowStep**](RuntimeControllerApi.md#getFlowStep) | **GET** /api/v1/runtime/{domain}/flow-steps/{id} |  |
| [**getFlowStepCollectionResources**](RuntimeControllerApi.md#getFlowStepCollectionResources) | **GET** /api/v1/runtime/{domain}/flow-steps/{id}/collection-resources |  |
| [**getFlowStepDeliveryFile**](RuntimeControllerApi.md#getFlowStepDeliveryFile) | **GET** /api/v1/runtime/{domain}/flow-steps/{id}/delivery-file |  |
| [**getFlowStepFlow**](RuntimeControllerApi.md#getFlowStepFlow) | **GET** /api/v1/runtime/{domain}/flow-steps/{id}/flow |  |
| [**getFlowStepMessageFile**](RuntimeControllerApi.md#getFlowStepMessageFile) | **GET** /api/v1/runtime/{domain}/flow-steps/{id}/message-file |  |
| [**getFlowSteps**](RuntimeControllerApi.md#getFlowSteps) | **GET** /api/v1/runtime/{domain}/flow-steps | Get flow steps |
| [**getJob**](RuntimeControllerApi.md#getJob) | **GET** /api/v1/runtime/{domain}/jobs/{id} |  |
| [**getJobs**](RuntimeControllerApi.md#getJobs) | **GET** /api/v1/runtime/{domain}/jobs | Get jobs |
| [**releaseHoldingFlowInstances**](RuntimeControllerApi.md#releaseHoldingFlowInstances) | **POST** /api/v1/runtime/{domain}/flow-instances/{id}/release | Continue a held flow instance |
| [**releaseHoldingFlowStep**](RuntimeControllerApi.md#releaseHoldingFlowStep) | **POST** /api/v1/runtime/{domain}/flow-steps/{id}/release | Continue a held flow step |
| [**reprocessJob**](RuntimeControllerApi.md#reprocessJob) | **POST** /api/v1/runtime/{domain}/jobs/{id}/reprocessing | Reprocess job |
| [**startPostSortJob**](RuntimeControllerApi.md#startPostSortJob) | **POST** /api/v1/runtime/{domain}/jobs/post-sort | Trigger post-sort run |
| [**stopFlowInstance**](RuntimeControllerApi.md#stopFlowInstance) | **POST** /api/v1/runtime/{domain}/flow-instances/{id}/stop | Cancel flow instance |
| [**stopFlowStep**](RuntimeControllerApi.md#stopFlowStep) | **POST** /api/v1/runtime/{domain}/flow-steps/{id}/stop | Cancel flow step |
| [**stopJob**](RuntimeControllerApi.md#stopJob) | **POST** /api/v1/runtime/{domain}/jobs/{id}/stop | Cancel job |


<a id="deleteFlowInstance"></a>
# **deleteFlowInstance**
> GenericResponse deleteFlowInstance(domain, id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      GenericResponse result = apiInstance.deleteFlowInstance(domain, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#deleteFlowInstance");
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

<a id="deleteJob"></a>
# **deleteJob**
> deleteJob(domain, id, force)

Delete completed job

Delete completed job entry (including all flow instances) in runtime database and correspondent job working directory.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    UUID id = UUID.randomUUID(); // UUID | Job id
    Boolean force = false; // Boolean | Force deletion of job entry in the database repository in case deletion of one or more files in the job working directory failed.
    try {
      apiInstance.deleteJob(domain, id, force);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#deleteJob");
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
| **id** | **UUID**| Job id | |
| **force** | **Boolean**| Force deletion of job entry in the database repository in case deletion of one or more files in the job working directory failed. | [optional] [default to false] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **409** | Deletion of one or more files failed |  -  |

<a id="deleteJobs"></a>
# **deleteJobs**
> DataResponseJobDeleteStatus deleteJobs(domain, force, syncDelete, jobFilterRequest)

Delete completed, canceled or failed jobs

Delete completed, canceled or failed job entries (including all flow instances) in runtime database and correspondent job working directories. &lt;br/&gt; Filter example: filter&#x3D;mode:BATCH;statuses:complete,error 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    Boolean force = false; // Boolean | Force deletion of job entry in the database repository in case deletion of one or more files in the job working directory failed.
    Boolean syncDelete = false; // Boolean | Delete jobs and all job files synchronously. In case we run it asynchronously, the jobs will be marked as deleted and will be deleted asynchronously by an external job. This parameter only is available when using the key 'ids' in the filter.
    JobFilterRequest jobFilterRequest = new JobFilterRequest(); // JobFilterRequest | 
    try {
      DataResponseJobDeleteStatus result = apiInstance.deleteJobs(domain, force, syncDelete, jobFilterRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#deleteJobs");
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
| **force** | **Boolean**| Force deletion of job entry in the database repository in case deletion of one or more files in the job working directory failed. | [optional] [default to false] |
| **syncDelete** | **Boolean**| Delete jobs and all job files synchronously. In case we run it asynchronously, the jobs will be marked as deleted and will be deleted asynchronously by an external job. This parameter only is available when using the key &#39;ids&#39; in the filter. | [optional] [default to false] |
| **jobFilterRequest** | [**JobFilterRequest**](JobFilterRequest.md)|  | [optional] |

### Return type

[**DataResponseJobDeleteStatus**](DataResponseJobDeleteStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Deleted jobs successful |  -  |
| **400** | Bad request |  -  |
| **409** | Deletion of one or more files failed. |  -  |

<a id="getCustomerOutputArtifacts"></a>
# **getCustomerOutputArtifacts**
> getCustomerOutputArtifacts(domain, id, customerId)

Get the customer artifacts in a zip file

Get the customer artifacts (1 or more) in a zip file, for the specified customer number (e.g. 1)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    String customerId = "customerId_example"; // String | 
    try {
      apiInstance.getCustomerOutputArtifacts(domain, id, customerId);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#getCustomerOutputArtifacts");
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
| **customerId** | **String**|  | |

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

<a id="getDeliveryFileOutputFiles"></a>
# **getDeliveryFileOutputFiles**
> PageResponseString getDeliveryFileOutputFiles(domain, id, pageRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    SimplePageRequest pageRequest = new SimplePageRequest(); // SimplePageRequest | 
    try {
      PageResponseString result = apiInstance.getDeliveryFileOutputFiles(domain, id, pageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#getDeliveryFileOutputFiles");
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
| **pageRequest** | [**SimplePageRequest**](.md)|  | |

### Return type

[**PageResponseString**](PageResponseString.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDeliveryFileOutputs"></a>
# **getDeliveryFileOutputs**
> DataResponseJsonNode getDeliveryFileOutputs(domain, id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      DataResponseJsonNode result = apiInstance.getDeliveryFileOutputs(domain, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#getDeliveryFileOutputs");
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

[**DataResponseJsonNode**](DataResponseJsonNode.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDeliveryFileOutputs1"></a>
# **getDeliveryFileOutputs1**
> Object getDeliveryFileOutputs1(domain, id, artifactName)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    String artifactName = "artifactName_example"; // String | 
    try {
      Object result = apiInstance.getDeliveryFileOutputs1(domain, id, artifactName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#getDeliveryFileOutputs1");
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
| **artifactName** | **String**|  | |

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

<a id="getFlowInstance"></a>
# **getFlowInstance**
> DataResponseFlowInstance getFlowInstance(domain, id, checkArtifacts)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    Boolean checkArtifacts = false; // Boolean | 
    try {
      DataResponseFlowInstance result = apiInstance.getFlowInstance(domain, id, checkArtifacts);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#getFlowInstance");
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
| **checkArtifacts** | **Boolean**|  | [optional] [default to false] |

### Return type

[**DataResponseFlowInstance**](DataResponseFlowInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getFlowInstanceCollectionResources"></a>
# **getFlowInstanceCollectionResources**
> ListResponseString getFlowInstanceCollectionResources(domain, id)



Returns all collection resource ids used by any flow step for a flow instance

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      ListResponseString result = apiInstance.getFlowInstanceCollectionResources(domain, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#getFlowInstanceCollectionResources");
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

[**ListResponseString**](ListResponseString.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getFlowInstanceInput"></a>
# **getFlowInstanceInput**
> Object getFlowInstanceInput(domain, id, download)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    Boolean download = false; // Boolean | 
    try {
      Object result = apiInstance.getFlowInstanceInput(domain, id, download);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#getFlowInstanceInput");
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
| **download** | **Boolean**|  | [optional] [default to false] |

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

<a id="getFlowInstances"></a>
# **getFlowInstances**
> PageResponseFlowInstance getFlowInstances(filterRequest, domain)

Get flow instances

Get all flow instances (no filter) or all the flow instances matching the filter. &lt;br/&gt;Filter example: filter&#x3D;statuses:complete,error;externalId:specialJob 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    FlowInstanceFilterRequest filterRequest = new FlowInstanceFilterRequest(); // FlowInstanceFilterRequest | The filter value is a semicolon delimited list of key value pairs. List values separate possible values with commas. Keys include: | filter name            | Filter value description                                                                               | |------------------------|--------------------------------------------------------------------------------------------------------| | ids                    | Match flow instances with ids in this comma-separated list.                                            | | flowModelId            | Match flow instances spawned from this flow model id (deprecated).                                     | | flowModelIds           | Match flow instances spawned from these flow model ids.(Note: When used along with flowModelId filter, ids from both filters are applied.)| | flowModelSnapshotIds   | Match flow instances spawned from any of these flow model snapshot ids.                                | | jobId                  | Match flow instances that ran as part of this job.                                                     | | externalId             | Match flow instances associated to this external id.                                                   | | statuses               | Match flow instances with any of these statuses. Possible values: canceled,started,complete,error,waiting,holding| | expiringDateStart      | Match flow instances expiring after this date. (yyyy-MM-dd format)                                     | | expiringDateEnd        | Match flow instances expiring before this date. (yyyy-MM-dd format)                                    | | flowModelTypes         | Match flow instances with any of these flow model types. Possible values: COMMUNICATION,ALERT,NOTIFICATION| | startDateStart         | Match flow instances started after this date. (yyyy-MM-dd format)                                      | | startDateEnd           | Match flow instances started before this date. (yyyy-MM-dd format)                                     | | endDateStart           | Match flow instances ended after this date. (yyyy-MM-dd format)                                        | | endDateEnd             | Match flow instances ended before this date. (yyyy-MM-dd format)                                       | | executingLongRunningOp | Match flow instances which are executing a long-running operation                                      |
    String domain = "domain_example"; // String | 
    try {
      PageResponseFlowInstance result = apiInstance.getFlowInstances(filterRequest, domain);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#getFlowInstances");
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
| **filterRequest** | [**FlowInstanceFilterRequest**](.md)| The filter value is a semicolon delimited list of key value pairs. List values separate possible values with commas. Keys include: | filter name            | Filter value description                                                                               | |------------------------|--------------------------------------------------------------------------------------------------------| | ids                    | Match flow instances with ids in this comma-separated list.                                            | | flowModelId            | Match flow instances spawned from this flow model id (deprecated).                                     | | flowModelIds           | Match flow instances spawned from these flow model ids.(Note: When used along with flowModelId filter, ids from both filters are applied.)| | flowModelSnapshotIds   | Match flow instances spawned from any of these flow model snapshot ids.                                | | jobId                  | Match flow instances that ran as part of this job.                                                     | | externalId             | Match flow instances associated to this external id.                                                   | | statuses               | Match flow instances with any of these statuses. Possible values: canceled,started,complete,error,waiting,holding| | expiringDateStart      | Match flow instances expiring after this date. (yyyy-MM-dd format)                                     | | expiringDateEnd        | Match flow instances expiring before this date. (yyyy-MM-dd format)                                    | | flowModelTypes         | Match flow instances with any of these flow model types. Possible values: COMMUNICATION,ALERT,NOTIFICATION| | startDateStart         | Match flow instances started after this date. (yyyy-MM-dd format)                                      | | startDateEnd           | Match flow instances started before this date. (yyyy-MM-dd format)                                     | | endDateStart           | Match flow instances ended after this date. (yyyy-MM-dd format)                                        | | endDateEnd             | Match flow instances ended before this date. (yyyy-MM-dd format)                                       | | executingLongRunningOp | Match flow instances which are executing a long-running operation                                      | | |
| **domain** | **String**|  | |

### Return type

[**PageResponseFlowInstance**](PageResponseFlowInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getFlowInstancesAndAssociatedJobs"></a>
# **getFlowInstancesAndAssociatedJobs**
> DataResponseFlowInstancesAndAssociatedJobs getFlowInstancesAndAssociatedJobs(domain, flowInstanceFilterRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    FlowInstanceFilterRequest flowInstanceFilterRequest = new FlowInstanceFilterRequest(); // FlowInstanceFilterRequest | The filter value is a semicolon delimited list of key value pairs. List values separate possible values with commas. Keys include: | filter name            | Filter value description                                                                               | |------------------------|--------------------------------------------------------------------------------------------------------| | ids                    | Match flow instances with ids in this comma-separated list.                                            | | flowModelId            | Match flow instances spawned from this flow model id (deprecated).                                     | | flowModelIds           | Match flow instances spawned from these flow model ids.(Note: When used along with flowModelId filter, ids from both filters are applied.)| | flowModelSnapshotIds   | Match flow instances spawned from any of these flow model snapshot ids.                                | | jobId                  | Match flow instances that ran as part of this job.                                                     | | externalId             | Match flow instances associated to this external id.                                                   | | statuses               | Match flow instances with any of these statuses. Possible values: canceled,started,complete,error,waiting,holding| | expiringDateStart      | Match flow instances expiring after this date. (yyyy-MM-dd format)                                     | | expiringDateEnd        | Match flow instances expiring before this date. (yyyy-MM-dd format)                                    | | flowModelTypes         | Match flow instances with any of these flow model types. Possible values: COMMUNICATION,ALERT,NOTIFICATION| | startDateStart         | Match flow instances started after this date. (yyyy-MM-dd format)                                      | | startDateEnd           | Match flow instances started before this date. (yyyy-MM-dd format)                                     | | endDateStart           | Match flow instances ended after this date. (yyyy-MM-dd format)                                        | | endDateEnd             | Match flow instances ended before this date. (yyyy-MM-dd format)                                       | | executingLongRunningOp | Match flow instances which are executing a long-running operation                                      |
    try {
      DataResponseFlowInstancesAndAssociatedJobs result = apiInstance.getFlowInstancesAndAssociatedJobs(domain, flowInstanceFilterRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#getFlowInstancesAndAssociatedJobs");
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
| **flowInstanceFilterRequest** | [**FlowInstanceFilterRequest**](FlowInstanceFilterRequest.md)| The filter value is a semicolon delimited list of key value pairs. List values separate possible values with commas. Keys include: | filter name            | Filter value description                                                                               | |------------------------|--------------------------------------------------------------------------------------------------------| | ids                    | Match flow instances with ids in this comma-separated list.                                            | | flowModelId            | Match flow instances spawned from this flow model id (deprecated).                                     | | flowModelIds           | Match flow instances spawned from these flow model ids.(Note: When used along with flowModelId filter, ids from both filters are applied.)| | flowModelSnapshotIds   | Match flow instances spawned from any of these flow model snapshot ids.                                | | jobId                  | Match flow instances that ran as part of this job.                                                     | | externalId             | Match flow instances associated to this external id.                                                   | | statuses               | Match flow instances with any of these statuses. Possible values: canceled,started,complete,error,waiting,holding| | expiringDateStart      | Match flow instances expiring after this date. (yyyy-MM-dd format)                                     | | expiringDateEnd        | Match flow instances expiring before this date. (yyyy-MM-dd format)                                    | | flowModelTypes         | Match flow instances with any of these flow model types. Possible values: COMMUNICATION,ALERT,NOTIFICATION| | startDateStart         | Match flow instances started after this date. (yyyy-MM-dd format)                                      | | startDateEnd           | Match flow instances started before this date. (yyyy-MM-dd format)                                     | | endDateStart           | Match flow instances ended after this date. (yyyy-MM-dd format)                                        | | endDateEnd             | Match flow instances ended before this date. (yyyy-MM-dd format)                                       | | executingLongRunningOp | Match flow instances which are executing a long-running operation                                      | | |

### Return type

[**DataResponseFlowInstancesAndAssociatedJobs**](DataResponseFlowInstancesAndAssociatedJobs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getFlowInstancesCounts"></a>
# **getFlowInstancesCounts**
> DataResponseMapObjectObject getFlowInstancesCounts(domain, flowInstanceCountsFilterRequest)

Get flow instances counts

Get counts of flow instances grouped by start date and status. The counts will be automatically grouped by DAY/MONTH/YEAR based on available data.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    FlowInstanceCountsFilterRequest flowInstanceCountsFilterRequest = new FlowInstanceCountsFilterRequest(); // FlowInstanceCountsFilterRequest | The filter value is a semicolon delimited list of key value pairs. List values separate possible values with commas. Keys include: | Filter name          | Filter value description                                                                                             | |----------------------|----------------------------------------------------------------------------------------------------------------------| | flowModelIds         | Match flow instances spawned from these flow model ids.                                                              | | startDateStart       | Match flow instances started after this date. (yyyy-MM-ddThh:mm:ss.SSSZ format)                                      | | startDateEnd         | Match flow instances started before this date. (yyyy-MM-ddThh:mm:ss.SSSZ format)                                     | | fillMissingData      | Populate any missing data between grouped data ranges. If data is not found, counts would be returned as 0           |
    try {
      DataResponseMapObjectObject result = apiInstance.getFlowInstancesCounts(domain, flowInstanceCountsFilterRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#getFlowInstancesCounts");
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
| **flowInstanceCountsFilterRequest** | [**FlowInstanceCountsFilterRequest**](FlowInstanceCountsFilterRequest.md)| The filter value is a semicolon delimited list of key value pairs. List values separate possible values with commas. Keys include: | Filter name          | Filter value description                                                                                             | |----------------------|----------------------------------------------------------------------------------------------------------------------| | flowModelIds         | Match flow instances spawned from these flow model ids.                                                              | | startDateStart       | Match flow instances started after this date. (yyyy-MM-ddThh:mm:ss.SSSZ format)                                      | | startDateEnd         | Match flow instances started before this date. (yyyy-MM-ddThh:mm:ss.SSSZ format)                                     | | fillMissingData      | Populate any missing data between grouped data ranges. If data is not found, counts would be returned as 0           | | |

### Return type

[**DataResponseMapObjectObject**](DataResponseMapObjectObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getFlowModelSnapshot"></a>
# **getFlowModelSnapshot**
> DataResponseFlowModelSnapshot getFlowModelSnapshot(domain, snapshotId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID snapshotId = UUID.randomUUID(); // UUID | 
    try {
      DataResponseFlowModelSnapshot result = apiInstance.getFlowModelSnapshot(domain, snapshotId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#getFlowModelSnapshot");
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
| **snapshotId** | **UUID**|  | |

### Return type

[**DataResponseFlowModelSnapshot**](DataResponseFlowModelSnapshot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getFlowModelSnapshots"></a>
# **getFlowModelSnapshots**
> PageResponseFlowModelSnapshot getFlowModelSnapshots(domain, filterRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    FlowModelSnapshotFilterRequest filterRequest = new FlowModelSnapshotFilterRequest(); // FlowModelSnapshotFilterRequest | 
    try {
      PageResponseFlowModelSnapshot result = apiInstance.getFlowModelSnapshots(domain, filterRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#getFlowModelSnapshots");
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
| **filterRequest** | [**FlowModelSnapshotFilterRequest**](.md)|  | |

### Return type

[**PageResponseFlowModelSnapshot**](PageResponseFlowModelSnapshot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getFlowStep"></a>
# **getFlowStep**
> DataResponseFlowStep getFlowStep(domain, id, checkArtifacts)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    Boolean checkArtifacts = false; // Boolean | 
    try {
      DataResponseFlowStep result = apiInstance.getFlowStep(domain, id, checkArtifacts);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#getFlowStep");
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
| **checkArtifacts** | **Boolean**|  | [optional] [default to false] |

### Return type

[**DataResponseFlowStep**](DataResponseFlowStep.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getFlowStepCollectionResources"></a>
# **getFlowStepCollectionResources**
> ListResponseString getFlowStepCollectionResources(domain, id)



Returns all collection resource ids used by the specified flow step

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      ListResponseString result = apiInstance.getFlowStepCollectionResources(domain, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#getFlowStepCollectionResources");
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

[**ListResponseString**](ListResponseString.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getFlowStepDeliveryFile"></a>
# **getFlowStepDeliveryFile**
> Object getFlowStepDeliveryFile(domain, id, download)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    Boolean download = false; // Boolean | 
    try {
      Object result = apiInstance.getFlowStepDeliveryFile(domain, id, download);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#getFlowStepDeliveryFile");
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
| **download** | **Boolean**|  | [optional] [default to false] |

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

<a id="getFlowStepFlow"></a>
# **getFlowStepFlow**
> DataResponseFlowStepFlow getFlowStepFlow(domain, id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      DataResponseFlowStepFlow result = apiInstance.getFlowStepFlow(domain, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#getFlowStepFlow");
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

[**DataResponseFlowStepFlow**](DataResponseFlowStepFlow.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getFlowStepMessageFile"></a>
# **getFlowStepMessageFile**
> Object getFlowStepMessageFile(domain, id, download)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    Boolean download = false; // Boolean | 
    try {
      Object result = apiInstance.getFlowStepMessageFile(domain, id, download);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#getFlowStepMessageFile");
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
| **download** | **Boolean**|  | [optional] [default to false] |

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

<a id="getFlowSteps"></a>
# **getFlowSteps**
> PageResponseFlowStep getFlowSteps(filterRequest, domain, checkArtifacts)

Get flow steps

Get all flow steps in the domain (no filter) or all the flow steps matching the filter. &lt;br/&gt;Filter example: name:FileInput;statuses:complete,error

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    FlowStepFilterRequest filterRequest = new FlowStepFilterRequest(); // FlowStepFilterRequest | The filter value is a semicolon delimited list of key value pairs. List values separate possible values with commas. Keys include: | filter name             | Filter value description                                                                       | |-------------------------|------------------------------------------------------------------------------------------------| | ids                     | Match flow steps with ids in this comma-separated list.                                        | | stepName                | Match resources with this stepName                                                             | | externalId              | Match flow steps associated to this external id.                                               | | previousStepId          | Match flow steps having this flow step as previous step id                                     | | flowInstanceId          | Match flow steps belonging to this flow instance                                               | | caseSensitive           | Specify if searches (stepName, displayName, externalId) are case sensitive or not.             | | statuses                | Match flow steps with any of these statuses. Possible values: canceled,created,waiting,holding,started,executed,complete,error| | stepTypes               | Match flow steps with any of these types. Possible values: input,communication,output,decider,processor,delay,hold,externalFlow,aggregator| | startDateStart          | Match flow steps started after this date. (yyyy-MM-dd format)                                  | | startDateEnd            | Match flow steps started before this date. (yyyy-MM-dd format)                                 | | endDateStart            | Match flow steps ended after this date. (yyyy-MM-dd format)                                    | | endDateEnd              | Match flow steps ended before this date. (yyyy-MM-dd format)                                   | | expiringDateStart       | Match flow steps expiring after this date. (yyyy-MM-dd format)                                 | | expiringDateEnd         | Match flow steps expiring before this date. (yyyy-MM-dd format)                                | | queueDateStart          | Match flow steps started after this date. (yyyy-MM-dd format)                                  | | queueDateEnd            | Match flow steps started before this date. (yyyy-MM-dd format)                                 | | executeDateStart        | Match flow steps ended after this date. (yyyy-MM-dd format)                                    | | executeDateEnd          | Match flow steps ended before this date. (yyyy-MM-dd format)                                   | | deliveryFileRetrievable | Match flow steps that have retrievable delivery files                                          | | displayName             | Match flow steps with this display name                                                        |
    String domain = "domain_example"; // String | 
    Boolean checkArtifacts = false; // Boolean | 
    try {
      PageResponseFlowStep result = apiInstance.getFlowSteps(filterRequest, domain, checkArtifacts);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#getFlowSteps");
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
| **filterRequest** | [**FlowStepFilterRequest**](.md)| The filter value is a semicolon delimited list of key value pairs. List values separate possible values with commas. Keys include: | filter name             | Filter value description                                                                       | |-------------------------|------------------------------------------------------------------------------------------------| | ids                     | Match flow steps with ids in this comma-separated list.                                        | | stepName                | Match resources with this stepName                                                             | | externalId              | Match flow steps associated to this external id.                                               | | previousStepId          | Match flow steps having this flow step as previous step id                                     | | flowInstanceId          | Match flow steps belonging to this flow instance                                               | | caseSensitive           | Specify if searches (stepName, displayName, externalId) are case sensitive or not.             | | statuses                | Match flow steps with any of these statuses. Possible values: canceled,created,waiting,holding,started,executed,complete,error| | stepTypes               | Match flow steps with any of these types. Possible values: input,communication,output,decider,processor,delay,hold,externalFlow,aggregator| | startDateStart          | Match flow steps started after this date. (yyyy-MM-dd format)                                  | | startDateEnd            | Match flow steps started before this date. (yyyy-MM-dd format)                                 | | endDateStart            | Match flow steps ended after this date. (yyyy-MM-dd format)                                    | | endDateEnd              | Match flow steps ended before this date. (yyyy-MM-dd format)                                   | | expiringDateStart       | Match flow steps expiring after this date. (yyyy-MM-dd format)                                 | | expiringDateEnd         | Match flow steps expiring before this date. (yyyy-MM-dd format)                                | | queueDateStart          | Match flow steps started after this date. (yyyy-MM-dd format)                                  | | queueDateEnd            | Match flow steps started before this date. (yyyy-MM-dd format)                                 | | executeDateStart        | Match flow steps ended after this date. (yyyy-MM-dd format)                                    | | executeDateEnd          | Match flow steps ended before this date. (yyyy-MM-dd format)                                   | | deliveryFileRetrievable | Match flow steps that have retrievable delivery files                                          | | displayName             | Match flow steps with this display name                                                        | | |
| **domain** | **String**|  | |
| **checkArtifacts** | **Boolean**|  | [optional] [default to false] |

### Return type

[**PageResponseFlowStep**](PageResponseFlowStep.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getJob"></a>
# **getJob**
> DataResponseJob getJob(domain, id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      DataResponseJob result = apiInstance.getJob(domain, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#getJob");
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

[**DataResponseJob**](DataResponseJob.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getJobs"></a>
# **getJobs**
> PageResponseJob getJobs(filterRequest, domain, fetchDeleted)

Get jobs

Get all jobs (no filter) or all the jobs matching the filter. &lt;br/&gt;Filter example: filter&#x3D;mode:BATCH;statuses:complete,error 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    JobFilterRequest filterRequest = new JobFilterRequest(); // JobFilterRequest | The filter value is a semicolon delimited list of key value pairs. List values separate possible values with commas. In deletion, if ids are used as key, the other keys are ignored. Keys include: | filter name             | Filter value description                                                                           | |-------------------------|----------------------------------------------------------------------------------------------------| | ids                     | Match jobs with ids in this comma-separated list. For deletion, the maximum number of ids is 100   | | channel                 | Match jobs using this channel                                                                      | | externalId              | Match jobs associated to this external id.                                                         | | triggeredBy             | Match jobs triggered by this user                                                                  | | statuses                | Match jobs with any of these statuses. Possible values: started,complete,error,waiting,holding,canceled,deleted| | startDateStart          | Match jobs started after this date. (yyyy-MM-dd format)                                            | | startDateEnd            | Match jobs started before this date. (yyyy-MM-dd format)                                           | | endDateStart            | Match jobs ended after this date. (yyyy-MM-dd format)                                              | | endDateEnd              | Match jobs ended before this date. (yyyy-MM-dd format)                                             | | expiringDateStart       | Match jobs expiring after this date. (yyyy-MM-dd format)                                           | | expiringDateEnd         | Match jobs expiring before this date. (yyyy-MM-dd format)                                          | | mode                    | Match jobs with modes in this list. Modes include: BATCH,ONDEMAND                      | | aggregatedFMCSnapshotIds| Match jobs with any of these aggregated flow context snapshot ids.                                 | | flowModelTypes          | Match jobs with any of these flowModelTypes. Possible values:COMMUNICATION,ALERT      |
    String domain = "domain_example"; // String | 
    Boolean fetchDeleted = false; // Boolean | Show deleted jobs. If set to true, other states are ignored and only deleted jobs are returned.
    try {
      PageResponseJob result = apiInstance.getJobs(filterRequest, domain, fetchDeleted);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#getJobs");
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
| **filterRequest** | [**JobFilterRequest**](.md)| The filter value is a semicolon delimited list of key value pairs. List values separate possible values with commas. In deletion, if ids are used as key, the other keys are ignored. Keys include: | filter name             | Filter value description                                                                           | |-------------------------|----------------------------------------------------------------------------------------------------| | ids                     | Match jobs with ids in this comma-separated list. For deletion, the maximum number of ids is 100   | | channel                 | Match jobs using this channel                                                                      | | externalId              | Match jobs associated to this external id.                                                         | | triggeredBy             | Match jobs triggered by this user                                                                  | | statuses                | Match jobs with any of these statuses. Possible values: started,complete,error,waiting,holding,canceled,deleted| | startDateStart          | Match jobs started after this date. (yyyy-MM-dd format)                                            | | startDateEnd            | Match jobs started before this date. (yyyy-MM-dd format)                                           | | endDateStart            | Match jobs ended after this date. (yyyy-MM-dd format)                                              | | endDateEnd              | Match jobs ended before this date. (yyyy-MM-dd format)                                             | | expiringDateStart       | Match jobs expiring after this date. (yyyy-MM-dd format)                                           | | expiringDateEnd         | Match jobs expiring before this date. (yyyy-MM-dd format)                                          | | mode                    | Match jobs with modes in this list. Modes include: BATCH,ONDEMAND                      | | aggregatedFMCSnapshotIds| Match jobs with any of these aggregated flow context snapshot ids.                                 | | flowModelTypes          | Match jobs with any of these flowModelTypes. Possible values:COMMUNICATION,ALERT      | | |
| **domain** | **String**|  | |
| **fetchDeleted** | **Boolean**| Show deleted jobs. If set to true, other states are ignored and only deleted jobs are returned. | [optional] [default to false] |

### Return type

[**PageResponseJob**](PageResponseJob.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="releaseHoldingFlowInstances"></a>
# **releaseHoldingFlowInstances**
> String releaseHoldingFlowInstances(domain, id)

Continue a held flow instance

Release a flow instance in holding state.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    UUID id = UUID.randomUUID(); // UUID | Flow instance id
    try {
      String result = apiInstance.releaseHoldingFlowInstances(domain, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#releaseHoldingFlowInstances");
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
| **id** | **UUID**| Flow instance id | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="releaseHoldingFlowStep"></a>
# **releaseHoldingFlowStep**
> String releaseHoldingFlowStep(domain, id)

Continue a held flow step

Release a flow step in holding state.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    UUID id = UUID.randomUUID(); // UUID | Flow step id
    try {
      String result = apiInstance.releaseHoldingFlowStep(domain, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#releaseHoldingFlowStep");
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
| **id** | **UUID**| Flow step id | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="reprocessJob"></a>
# **reprocessJob**
> String reprocessJob(domain, id, useCurrentFlowModel, useCurrentFlowContext)

Reprocess job

Reprocess the job with the specified id, optionally using the current flow model and/or the current flow context

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    UUID id = UUID.randomUUID(); // UUID | Job id
    Boolean useCurrentFlowModel = false; // Boolean | Use current flow model (instead of the one stored in the job)
    Boolean useCurrentFlowContext = false; // Boolean | Use current flow context (instead of the one stored in the job
    try {
      String result = apiInstance.reprocessJob(domain, id, useCurrentFlowModel, useCurrentFlowContext);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#reprocessJob");
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
| **id** | **UUID**| Job id | |
| **useCurrentFlowModel** | **Boolean**| Use current flow model (instead of the one stored in the job) | [optional] [default to false] |
| **useCurrentFlowContext** | **Boolean**| Use current flow context (instead of the one stored in the job | [optional] [default to false] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="startPostSortJob"></a>
# **startPostSortJob**
> GenericResponse startPostSortJob(domain, postSortRunOption)

Trigger post-sort run

Trigger a post-sort related job

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    PostSortRunOption postSortRunOption = new PostSortRunOption(); // PostSortRunOption |    | Run setting            | description                                                                                           | |------------------------|-------------------------------------------------------------------------------------------------------| | flowModelId            | Select sorting assets matching flow model id.                                                         | | appConsolidation       | Consolidate multiple communications.                                                                  | | dryRun                 | Dry run                                                                                               | | externalId             | Set externalID on the job for this post-sort run.                                                     | | customerList           | Select individual list of customer numbers or ranges of numbers to be processed in post-sort run.     | | postSortQueueName      | Set post-sort queue to use in this post-sort run. If not specified, all post-sort queues will be included in the run.|   | Sort asset filter name |Filter value description                                                                               | |------------------------|-------------------------------------------------------------------------------------------------------| | ids                    | Filter sorting assets matching sorting index ids.                                                     | | jobIds                 | Filter sorting assets matching job ids.                                                               | | flowStepIds            | Filter sorting assets matching flow step ids.                                                         | | communicationIds       | Filter sorting assets matching communication ids.                                                     | | queueNames             | Filter sorting assets matching pre-sort queue name                                                     (Note: Only first entry of list is currently supported for post-sort run).       | | externalIds            | Filter sorting assets matching external ids.                                                          | | creationDateStart      | Filter sorting assets created after this date (yyyy-MM-dd format or elapsed period in negative days). | | creationDateEnd        | Filter sorting assets created before this date (yyyy-MM-dd format or elapsed period in negative days).|
    try {
      GenericResponse result = apiInstance.startPostSortJob(domain, postSortRunOption);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#startPostSortJob");
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
| **postSortRunOption** | [**PostSortRunOption**](PostSortRunOption.md)|    | Run setting            | description                                                                                           | |------------------------|-------------------------------------------------------------------------------------------------------| | flowModelId            | Select sorting assets matching flow model id.                                                         | | appConsolidation       | Consolidate multiple communications.                                                                  | | dryRun                 | Dry run                                                                                               | | externalId             | Set externalID on the job for this post-sort run.                                                     | | customerList           | Select individual list of customer numbers or ranges of numbers to be processed in post-sort run.     | | postSortQueueName      | Set post-sort queue to use in this post-sort run. If not specified, all post-sort queues will be included in the run.|   | Sort asset filter name |Filter value description                                                                               | |------------------------|-------------------------------------------------------------------------------------------------------| | ids                    | Filter sorting assets matching sorting index ids.                                                     | | jobIds                 | Filter sorting assets matching job ids.                                                               | | flowStepIds            | Filter sorting assets matching flow step ids.                                                         | | communicationIds       | Filter sorting assets matching communication ids.                                                     | | queueNames             | Filter sorting assets matching pre-sort queue name                                                     (Note: Only first entry of list is currently supported for post-sort run).       | | externalIds            | Filter sorting assets matching external ids.                                                          | | creationDateStart      | Filter sorting assets created after this date (yyyy-MM-dd format or elapsed period in negative days). | | creationDateEnd        | Filter sorting assets created before this date (yyyy-MM-dd format or elapsed period in negative days).| | |

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
| **201** | Post sort run(s) triggered. |  -  |
| **400** | Bad request. Validation failure. |  -  |
| **404** | Domain not found or flow model not found in domain. |  -  |

<a id="stopFlowInstance"></a>
# **stopFlowInstance**
> String stopFlowInstance(domain, id)

Cancel flow instance

Stop a running flow instance entry (including all flow steps) in runtime database.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    UUID id = UUID.randomUUID(); // UUID | Flow instance id
    try {
      String result = apiInstance.stopFlowInstance(domain, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#stopFlowInstance");
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
| **id** | **UUID**| Flow instance id | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="stopFlowStep"></a>
# **stopFlowStep**
> String stopFlowStep(domain, id)

Cancel flow step

Stop a running flow step in runtime database.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    UUID id = UUID.randomUUID(); // UUID | Flow step id
    try {
      String result = apiInstance.stopFlowStep(domain, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#stopFlowStep");
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
| **id** | **UUID**| Flow step id | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="stopJob"></a>
# **stopJob**
> String stopJob(domain, id)

Cancel job

Stop a running job entry (including all flow instances) in runtime database.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RuntimeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    RuntimeControllerApi apiInstance = new RuntimeControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    UUID id = UUID.randomUUID(); // UUID | Job id
    try {
      String result = apiInstance.stopJob(domain, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RuntimeControllerApi#stopJob");
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
| **id** | **UUID**| Job id | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

