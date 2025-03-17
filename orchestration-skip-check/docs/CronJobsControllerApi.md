# CronJobsControllerApi

All URIs are relative to *https://vm-exstreamna1.eimdemo.com/orchestration*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addSchedule**](CronJobsControllerApi.md#addSchedule) | **POST** /api/v1/cron-jobs/{domain} | Adds a new cron job |
| [**deleteSchedule**](CronJobsControllerApi.md#deleteSchedule) | **DELETE** /api/v1/cron-jobs/{domain}/{cronJobId} | Deletes a cron job |
| [**listSchedules**](CronJobsControllerApi.md#listSchedules) | **GET** /api/v1/cron-jobs/{domain} | List all cron jobs |
| [**readSchedule**](CronJobsControllerApi.md#readSchedule) | **GET** /api/v1/cron-jobs/{domain}/{cronJobId} | Gets a cron job |
| [**triggerSchedule**](CronJobsControllerApi.md#triggerSchedule) | **POST** /api/v1/cron-jobs/{domain}/{cronJobId}/trigger | Trigger a cron job |
| [**updateSchedule**](CronJobsControllerApi.md#updateSchedule) | **PUT** /api/v1/cron-jobs/{domain}/{cronJobId} | Updates a cron job |


<a id="addSchedule"></a>
# **addSchedule**
> DataResponseCronJob addSchedule(domain, cronJob)

Adds a new cron job

Adds a new Cron job 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CronJobsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    CronJobsControllerApi apiInstance = new CronJobsControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    CronJob cronJob = new CronJob(); // CronJob | Cron job. It can apply to jobs or sort assets.<br/>name: Name of the cron job<br/>cronExpression: Cron expression in UNIX format that reflects when the cron job should be executed (the main cron orchestration cleanup job is executed hourly by default)<br/>cronType: Cron job type. Available values: markDeleted,wipe,startJob,updateExpirationTime,wipeSortingAssets,expireSortingAssets,sortingAndBundling. When wipe is selected the filter parameters are not used.<br/>startDateStart: Filter jobs matching started date after this date or sort assets created after this date. Date is a (yyyy-MM-dd format) String. It's also possible to use a negative number, representing the number of days before today.<br/>startDateEnd: Filter jobs matching started date before this date or sort assets created before this date. Date is a (yyyy-MM-dd format) String. It's also possible to use a negative number, representing the number of days before today.<br/>endDateStart: Filter jobs matching ended date after this date or sort assets modified after this date. Date is a (yyyy-MM-dd format) String. It's also possible to use a negative number, representing the number of days before today<br/>endDateEnd: Filter jobs matching ended date before this date or sort assets modified before this date. Date is a (yyyy-MM-dd format) String. It's also possible to use a negative number, representing the number of days before today<br/>statuses: Match jobs with any of these statuses. Possible values for jobs: complete,error,canceled,deleted<br/>sortingAssetStatuses: Match sorting assets with any of these statuses, possible values for sort assets: processed,waiting,expired,canceled<br/>serviceName: service to trigger for job<br/>channelName: input channel for pulling data<br/>inputPath: path parameter for the input channel<br/>headers: map of headers for starting job<br/>cacheTimeout: optional duration of file cache<br/>mode: Filter jobs matching this mode (ONDEMAND|BATCH)<br/>flowModelId: Filter sorting assets matching flow model id<br/>communicationIdList: Filter sorting assets matching the communication id (only one) or when running sorting&bundling with appConsolidation equal to true, use the specified communications,<br/>when appConsolidation is false, only one communication id should be present<br/>preSortQueueName: Filter sorting assets matching pre sort queue name<br/>jobId: Filter sorting assets matching jobId<br/>postSortQueueName: queue name used in the post sort queue name<br/>appConsolidation: says whether multiple communications should be consolidated when running sorting&bundling<br/>enabled: Determines whether the cron job should be triggered or not. Default value: true
    try {
      DataResponseCronJob result = apiInstance.addSchedule(domain, cronJob);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CronJobsControllerApi#addSchedule");
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
| **cronJob** | [**CronJob**](CronJob.md)| Cron job. It can apply to jobs or sort assets.&lt;br/&gt;name: Name of the cron job&lt;br/&gt;cronExpression: Cron expression in UNIX format that reflects when the cron job should be executed (the main cron orchestration cleanup job is executed hourly by default)&lt;br/&gt;cronType: Cron job type. Available values: markDeleted,wipe,startJob,updateExpirationTime,wipeSortingAssets,expireSortingAssets,sortingAndBundling. When wipe is selected the filter parameters are not used.&lt;br/&gt;startDateStart: Filter jobs matching started date after this date or sort assets created after this date. Date is a (yyyy-MM-dd format) String. It&#39;s also possible to use a negative number, representing the number of days before today.&lt;br/&gt;startDateEnd: Filter jobs matching started date before this date or sort assets created before this date. Date is a (yyyy-MM-dd format) String. It&#39;s also possible to use a negative number, representing the number of days before today.&lt;br/&gt;endDateStart: Filter jobs matching ended date after this date or sort assets modified after this date. Date is a (yyyy-MM-dd format) String. It&#39;s also possible to use a negative number, representing the number of days before today&lt;br/&gt;endDateEnd: Filter jobs matching ended date before this date or sort assets modified before this date. Date is a (yyyy-MM-dd format) String. It&#39;s also possible to use a negative number, representing the number of days before today&lt;br/&gt;statuses: Match jobs with any of these statuses. Possible values for jobs: complete,error,canceled,deleted&lt;br/&gt;sortingAssetStatuses: Match sorting assets with any of these statuses, possible values for sort assets: processed,waiting,expired,canceled&lt;br/&gt;serviceName: service to trigger for job&lt;br/&gt;channelName: input channel for pulling data&lt;br/&gt;inputPath: path parameter for the input channel&lt;br/&gt;headers: map of headers for starting job&lt;br/&gt;cacheTimeout: optional duration of file cache&lt;br/&gt;mode: Filter jobs matching this mode (ONDEMAND|BATCH)&lt;br/&gt;flowModelId: Filter sorting assets matching flow model id&lt;br/&gt;communicationIdList: Filter sorting assets matching the communication id (only one) or when running sorting&amp;bundling with appConsolidation equal to true, use the specified communications,&lt;br/&gt;when appConsolidation is false, only one communication id should be present&lt;br/&gt;preSortQueueName: Filter sorting assets matching pre sort queue name&lt;br/&gt;jobId: Filter sorting assets matching jobId&lt;br/&gt;postSortQueueName: queue name used in the post sort queue name&lt;br/&gt;appConsolidation: says whether multiple communications should be consolidated when running sorting&amp;bundling&lt;br/&gt;enabled: Determines whether the cron job should be triggered or not. Default value: true | |

### Return type

[**DataResponseCronJob**](DataResponseCronJob.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="deleteSchedule"></a>
# **deleteSchedule**
> GenericResponse deleteSchedule(domain, cronJobId)

Deletes a cron job

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CronJobsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    CronJobsControllerApi apiInstance = new CronJobsControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    UUID cronJobId = UUID.randomUUID(); // UUID | CronJobId
    try {
      GenericResponse result = apiInstance.deleteSchedule(domain, cronJobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CronJobsControllerApi#deleteSchedule");
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
| **cronJobId** | **UUID**| CronJobId | |

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
| **0** | default response |  -  |

<a id="listSchedules"></a>
# **listSchedules**
> ListResponseCronJob listSchedules(domain)

List all cron jobs

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CronJobsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    CronJobsControllerApi apiInstance = new CronJobsControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    try {
      ListResponseCronJob result = apiInstance.listSchedules(domain);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CronJobsControllerApi#listSchedules");
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

### Return type

[**ListResponseCronJob**](ListResponseCronJob.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="readSchedule"></a>
# **readSchedule**
> DataResponseCronJob readSchedule(domain, cronJobId)

Gets a cron job

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CronJobsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    CronJobsControllerApi apiInstance = new CronJobsControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    UUID cronJobId = UUID.randomUUID(); // UUID | CronJobId
    try {
      DataResponseCronJob result = apiInstance.readSchedule(domain, cronJobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CronJobsControllerApi#readSchedule");
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
| **cronJobId** | **UUID**| CronJobId | |

### Return type

[**DataResponseCronJob**](DataResponseCronJob.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="triggerSchedule"></a>
# **triggerSchedule**
> String triggerSchedule(domain, cronJobId)

Trigger a cron job

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CronJobsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    CronJobsControllerApi apiInstance = new CronJobsControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    UUID cronJobId = UUID.randomUUID(); // UUID | CronJobId
    try {
      String result = apiInstance.triggerSchedule(domain, cronJobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CronJobsControllerApi#triggerSchedule");
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
| **cronJobId** | **UUID**| CronJobId | |

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

<a id="updateSchedule"></a>
# **updateSchedule**
> DataResponseCronJob updateSchedule(domain, cronJobId, cronJob)

Updates a cron job

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CronJobsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vm-exstreamna1.eimdemo.com/orchestration");

    CronJobsControllerApi apiInstance = new CronJobsControllerApi(defaultClient);
    String domain = "domain_example"; // String | Domain id
    UUID cronJobId = UUID.randomUUID(); // UUID | CronJobId
    CronJob cronJob = new CronJob(); // CronJob | Cron job. It can apply to jobs or sort assets.<br/>name: Name of the cron job<br/>cronExpression: Cron expression in UNIX format that reflects when the cron job should be executed (the main cron orchestration cleanup job is executed hourly by default)<br/>cronType: Cron job type. Available values: markDeleted,wipe,startJob,updateExpirationTime,wipeSortingAssets,expireSortingAssets,sortingAndBundling. When wipe is selected the filter parameters are not used.<br/>startDateStart: Filter jobs matching started date after this date or sort assets created after this date. Date is a (yyyy-MM-dd format) String. It's also possible to use a negative number, representing the number of days before today.<br/>startDateEnd: Filter jobs matching started date before this date or sort assets created before this date. Date is a (yyyy-MM-dd format) String. It's also possible to use a negative number, representing the number of days before today.<br/>endDateStart: Filter jobs matching ended date after this date or sort assets modified after this date. Date is a (yyyy-MM-dd format) String. It's also possible to use a negative number, representing the number of days before today<br/>endDateEnd: Filter jobs matching ended date before this date or sort assets modified before this date. Date is a (yyyy-MM-dd format) String. It's also possible to use a negative number, representing the number of days before today<br/>statuses: Match jobs with any of these statuses. Possible values for jobs: complete,error,canceled,deleted<br/>sortingAssetStatuses: Match sorting assets with any of these statuses, possible values for sort assets: processed,waiting,expired,canceled<br/>serviceName: service to trigger for job<br/>channelName: input channel for pulling data<br/>inputPath: path parameter for the input channel<br/>headers: map of headers for starting job<br/>cacheTimeout: optional duration of file cache<br/>mode: Filter jobs matching this mode (ONDEMAND|BATCH)<br/>flowModelId: Filter sorting assets matching flow model id<br/>communicationIdList: Filter sorting assets matching the communication id (only one) or when running sorting&bundling with appConsolidation equal to true, use the specified communications,<br/>when appConsolidation is false, only one communication id should be present<br/>preSortQueueName: Filter sorting assets matching pre sort queue name<br/>jobId: Filter sorting assets matching jobId<br/>postSortQueueName: queue name used in the post sort queue name<br/>appConsolidation: says whether multiple communications should be consolidated when running sorting&bundling<br/>enabled: Determines whether the cron job should be triggered or not. Default value: true
    try {
      DataResponseCronJob result = apiInstance.updateSchedule(domain, cronJobId, cronJob);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CronJobsControllerApi#updateSchedule");
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
| **cronJobId** | **UUID**| CronJobId | |
| **cronJob** | [**CronJob**](CronJob.md)| Cron job. It can apply to jobs or sort assets.&lt;br/&gt;name: Name of the cron job&lt;br/&gt;cronExpression: Cron expression in UNIX format that reflects when the cron job should be executed (the main cron orchestration cleanup job is executed hourly by default)&lt;br/&gt;cronType: Cron job type. Available values: markDeleted,wipe,startJob,updateExpirationTime,wipeSortingAssets,expireSortingAssets,sortingAndBundling. When wipe is selected the filter parameters are not used.&lt;br/&gt;startDateStart: Filter jobs matching started date after this date or sort assets created after this date. Date is a (yyyy-MM-dd format) String. It&#39;s also possible to use a negative number, representing the number of days before today.&lt;br/&gt;startDateEnd: Filter jobs matching started date before this date or sort assets created before this date. Date is a (yyyy-MM-dd format) String. It&#39;s also possible to use a negative number, representing the number of days before today.&lt;br/&gt;endDateStart: Filter jobs matching ended date after this date or sort assets modified after this date. Date is a (yyyy-MM-dd format) String. It&#39;s also possible to use a negative number, representing the number of days before today&lt;br/&gt;endDateEnd: Filter jobs matching ended date before this date or sort assets modified before this date. Date is a (yyyy-MM-dd format) String. It&#39;s also possible to use a negative number, representing the number of days before today&lt;br/&gt;statuses: Match jobs with any of these statuses. Possible values for jobs: complete,error,canceled,deleted&lt;br/&gt;sortingAssetStatuses: Match sorting assets with any of these statuses, possible values for sort assets: processed,waiting,expired,canceled&lt;br/&gt;serviceName: service to trigger for job&lt;br/&gt;channelName: input channel for pulling data&lt;br/&gt;inputPath: path parameter for the input channel&lt;br/&gt;headers: map of headers for starting job&lt;br/&gt;cacheTimeout: optional duration of file cache&lt;br/&gt;mode: Filter jobs matching this mode (ONDEMAND|BATCH)&lt;br/&gt;flowModelId: Filter sorting assets matching flow model id&lt;br/&gt;communicationIdList: Filter sorting assets matching the communication id (only one) or when running sorting&amp;bundling with appConsolidation equal to true, use the specified communications,&lt;br/&gt;when appConsolidation is false, only one communication id should be present&lt;br/&gt;preSortQueueName: Filter sorting assets matching pre sort queue name&lt;br/&gt;jobId: Filter sorting assets matching jobId&lt;br/&gt;postSortQueueName: queue name used in the post sort queue name&lt;br/&gt;appConsolidation: says whether multiple communications should be consolidated when running sorting&amp;bundling&lt;br/&gt;enabled: Determines whether the cron job should be triggered or not. Default value: true | |

### Return type

[**DataResponseCronJob**](DataResponseCronJob.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

