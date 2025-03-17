

# FlowStep


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**previousStepId** | **UUID** |  |  [optional] |
|**flowInstanceId** | **UUID** |  |  [optional] |
|**stepName** | **String** |  |  [optional] |
|**displayName** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**stepType** | [**StepTypeEnum**](#StepTypeEnum) |  |  [optional] |
|**queueDate** | **OffsetDateTime** |  |  [optional] |
|**startDate** | **OffsetDateTime** |  |  [optional] |
|**executeDate** | **OffsetDateTime** |  |  [optional] |
|**endDate** | **OffsetDateTime** |  |  [optional] |
|**expirationDate** | **OffsetDateTime** |  |  [optional] |
|**msg** | **String** |  |  [optional] |
|**externalId** | **String** |  |  [optional] |
|**deliveryFileRetrievable** | **Boolean** |  |  [optional] |
|**messageFileRetrievable** | **Boolean** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CANCELED | &quot;canceled&quot; |
| CREATED | &quot;created&quot; |
| WAITING | &quot;waiting&quot; |
| HOLDING | &quot;holding&quot; |
| STARTED | &quot;started&quot; |
| EXECUTED | &quot;executed&quot; |
| FILTERED | &quot;filtered&quot; |
| COMPLETE | &quot;complete&quot; |
| ERROR | &quot;error&quot; |
| EXPIRED | &quot;expired&quot; |



## Enum: StepTypeEnum

| Name | Value |
|---- | -----|
| INPUT | &quot;input&quot; |
| COMMUNICATION | &quot;communication&quot; |
| OUTPUT | &quot;output&quot; |
| DECIDER | &quot;decider&quot; |
| PROCESSOR | &quot;processor&quot; |
| AGGREGATOR | &quot;aggregator&quot; |
| DELAY | &quot;delay&quot; |
| HOLD | &quot;hold&quot; |
| EXTERNALFLOW | &quot;externalFlow&quot; |



