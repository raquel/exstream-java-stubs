

# FlowInstance


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**jobId** | **UUID** |  |  [optional] |
|**flowModelId** | **UUID** |  |  [optional] |
|**flowModelSnapshotId** | **UUID** |  |  [optional] |
|**domainId** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**startDate** | **OffsetDateTime** |  |  [optional] |
|**endDate** | **OffsetDateTime** |  |  [optional] |
|**expirationDate** | **OffsetDateTime** |  |  [optional] |
|**msg** | **String** |  |  [optional] |
|**externalId** | **String** |  |  [optional] |
|**flowModelType** | [**FlowModelTypeEnum**](#FlowModelTypeEnum) |  |  [optional] |
|**inputRetrievable** | **Boolean** |  |  [optional] |
|**executingLongRunningOp** | **Boolean** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CANCELED | &quot;canceled&quot; |
| STARTED | &quot;started&quot; |
| COMPLETE | &quot;complete&quot; |
| WAITING | &quot;waiting&quot; |
| HOLDING | &quot;holding&quot; |
| ERROR | &quot;error&quot; |
| FINISHING | &quot;finishing&quot; |



## Enum: FlowModelTypeEnum

| Name | Value |
|---- | -----|
| COMMUNICATION | &quot;COMMUNICATION&quot; |
| ALERT | &quot;ALERT&quot; |
| NOTIFICATION | &quot;NOTIFICATION&quot; |



