

# Job


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**domainId** | **String** |  |  [optional] |
|**channel** | **String** |  |  [optional] |
|**mode** | [**ModeEnum**](#ModeEnum) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**flowModelType** | [**FlowModelTypeEnum**](#FlowModelTypeEnum) |  |  [optional] |
|**msg** | **String** |  |  [optional] |
|**externalId** | **String** |  |  [optional] |
|**triggeredBy** | **String** |  |  [optional] |
|**aggregatedFMCSnapshotId** | **UUID** |  |  [optional] |
|**startDate** | **OffsetDateTime** |  |  [optional] |
|**endDate** | **OffsetDateTime** |  |  [optional] |
|**expirationDate** | **OffsetDateTime** |  |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| BATCH | &quot;BATCH&quot; |
| ONDEMAND | &quot;ONDEMAND&quot; |



## Enum: StatusEnum

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



## Enum: FlowModelTypeEnum

| Name | Value |
|---- | -----|
| COMMUNICATION | &quot;COMMUNICATION&quot; |
| ALERT | &quot;ALERT&quot; |
| NOTIFICATION | &quot;NOTIFICATION&quot; |



