

# FlowInstanceFilter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ids** | **List&lt;UUID&gt;** |  |  [optional] |
|**flowModelSnapshotIds** | **List&lt;UUID&gt;** |  |  [optional] |
|**flowModelId** | **UUID** |  |  [optional] |
|**flowModelIds** | **List&lt;UUID&gt;** |  |  [optional] |
|**jobId** | **UUID** |  |  [optional] |
|**startDateStart** | **OffsetDateTime** |  |  [optional] |
|**startDateEnd** | **OffsetDateTime** |  |  [optional] |
|**endDateStart** | **OffsetDateTime** |  |  [optional] |
|**endDateEnd** | **OffsetDateTime** |  |  [optional] |
|**expiringDateStart** | **OffsetDateTime** |  |  [optional] |
|**expiringDateEnd** | **OffsetDateTime** |  |  [optional] |
|**domainId** | **String** |  |  [optional] |
|**externalId** | **String** |  |  [optional] |
|**statuses** | [**List&lt;StatusesEnum&gt;**](#List&lt;StatusesEnum&gt;) |  |  [optional] |
|**flowModelTypes** | [**List&lt;FlowModelTypesEnum&gt;**](#List&lt;FlowModelTypesEnum&gt;) |  |  [optional] |
|**executingLongRunningOp** | **Boolean** |  |  [optional] |



## Enum: List&lt;StatusesEnum&gt;

| Name | Value |
|---- | -----|
| CANCELED | &quot;canceled&quot; |
| STARTED | &quot;started&quot; |
| COMPLETE | &quot;complete&quot; |
| WAITING | &quot;waiting&quot; |
| HOLDING | &quot;holding&quot; |
| ERROR | &quot;error&quot; |
| FINISHING | &quot;finishing&quot; |



## Enum: List&lt;FlowModelTypesEnum&gt;

| Name | Value |
|---- | -----|
| COMMUNICATION | &quot;COMMUNICATION&quot; |
| ALERT | &quot;ALERT&quot; |
| NOTIFICATION | &quot;NOTIFICATION&quot; |



