

# JobFilter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ids** | **List&lt;UUID&gt;** |  |  [optional] |
|**channel** | **String** |  |  [optional] |
|**startDateStart** | **OffsetDateTime** |  |  [optional] |
|**startDateEnd** | **OffsetDateTime** |  |  [optional] |
|**endDateStart** | **OffsetDateTime** |  |  [optional] |
|**endDateEnd** | **OffsetDateTime** |  |  [optional] |
|**expiringDateStart** | **OffsetDateTime** |  |  [optional] |
|**expiringDateEnd** | **OffsetDateTime** |  |  [optional] |
|**domainId** | **String** |  |  [optional] |
|**statuses** | [**List&lt;StatusesEnum&gt;**](#List&lt;StatusesEnum&gt;) |  |  [optional] |
|**mode** | [**ModeEnum**](#ModeEnum) |  |  [optional] |
|**externalId** | **String** |  |  [optional] |
|**triggeredBy** | **String** |  |  [optional] |
|**aggregatedFMCSnapshotIds** | **List&lt;UUID&gt;** |  |  [optional] |
|**flowModelTypes** | [**List&lt;FlowModelTypesEnum&gt;**](#List&lt;FlowModelTypesEnum&gt;) |  |  [optional] |



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



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| BATCH | &quot;BATCH&quot; |
| ONDEMAND | &quot;ONDEMAND&quot; |



## Enum: List&lt;FlowModelTypesEnum&gt;

| Name | Value |
|---- | -----|
| COMMUNICATION | &quot;COMMUNICATION&quot; |
| ALERT | &quot;ALERT&quot; |
| NOTIFICATION | &quot;NOTIFICATION&quot; |



