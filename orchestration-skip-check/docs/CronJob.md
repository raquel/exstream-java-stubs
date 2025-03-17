

# CronJob


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**domainId** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**cronExpression** | **String** |  |  [optional] |
|**cronType** | [**CronTypeEnum**](#CronTypeEnum) |  |  [optional] |
|**startDateStart** | **String** |  |  [optional] |
|**startDateEnd** | **String** |  |  [optional] |
|**endDateStart** | **String** |  |  [optional] |
|**endDateEnd** | **String** |  |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |
|**serviceName** | **String** |  |  [optional] |
|**channelName** | **String** |  |  [optional] |
|**inputPath** | **String** |  |  [optional] |
|**headers** | **Map&lt;String, String&gt;** |  |  [optional] |
|**cacheTimeout** | **Float** |  |  [optional] |
|**mode** | [**ModeEnum**](#ModeEnum) |  |  [optional] |
|**flowModelId** | **UUID** |  |  [optional] |
|**preSortQueueName** | **String** |  |  [optional] |
|**postSortQueueName** | **String** |  |  [optional] |
|**jobId** | **UUID** |  |  [optional] |
|**dryRun** | **Boolean** |  |  [optional] |
|**appConsolidation** | **Boolean** |  |  [optional] |
|**jobAvailable** | **Boolean** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**statuses** | [**List&lt;StatusesEnum&gt;**](#List&lt;StatusesEnum&gt;) |  |  [optional] |
|**sortingAssetStatuses** | [**List&lt;SortingAssetStatusesEnum&gt;**](#List&lt;SortingAssetStatusesEnum&gt;) |  |  [optional] |
|**communicationIdList** | **List&lt;UUID&gt;** |  |  [optional] |



## Enum: CronTypeEnum

| Name | Value |
|---- | -----|
| MARKDELETED | &quot;markDeleted&quot; |
| WIPE | &quot;wipe&quot; |
| STARTJOB | &quot;startJob&quot; |
| UPDATEEXPIRATIONTIME | &quot;updateExpirationTime&quot; |
| WIPESORTINGASSETS | &quot;wipeSortingAssets&quot; |
| EXPIRESORTINGASSETS | &quot;expireSortingAssets&quot; |
| SORTINGANDBUNDLING | &quot;sortingAndBundling&quot; |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| BATCH | &quot;BATCH&quot; |
| ONDEMAND | &quot;ONDEMAND&quot; |



## Enum: List&lt;StatusesEnum&gt;

| Name | Value |
|---- | -----|
| CANCELED | &quot;canceled&quot; |
| COMPLETE | &quot;complete&quot; |
| DELETED | &quot;deleted&quot; |
| STARTED | &quot;started&quot; |
| WAITING | &quot;waiting&quot; |
| HOLDING | &quot;holding&quot; |
| ERROR | &quot;error&quot; |
| UNINITIALIZED | &quot;uninitialized&quot; |



## Enum: List&lt;SortingAssetStatusesEnum&gt;

| Name | Value |
|---- | -----|
| PROCESSED | &quot;processed&quot; |
| WAITING | &quot;waiting&quot; |
| EXPIRED | &quot;expired&quot; |
| CANCELED | &quot;canceled&quot; |
| ALL | &quot;all&quot; |



