

# FlowStepFilter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ids** | **List&lt;UUID&gt;** |  |  [optional] |
|**flowInstanceId** | **UUID** |  |  [optional] |
|**stepName** | **String** |  |  [optional] |
|**displayName** | **String** |  |  [optional] |
|**startDateStart** | **OffsetDateTime** |  |  [optional] |
|**startDateEnd** | **OffsetDateTime** |  |  [optional] |
|**endDateStart** | **OffsetDateTime** |  |  [optional] |
|**endDateEnd** | **OffsetDateTime** |  |  [optional] |
|**queueDateStart** | **OffsetDateTime** |  |  [optional] |
|**queueDateEnd** | **OffsetDateTime** |  |  [optional] |
|**executeDateStart** | **OffsetDateTime** |  |  [optional] |
|**executeDateEnd** | **OffsetDateTime** |  |  [optional] |
|**expiringDateStart** | **OffsetDateTime** |  |  [optional] |
|**expiringDateEnd** | **OffsetDateTime** |  |  [optional] |
|**externalId** | **String** |  |  [optional] |
|**previousStepId** | **UUID** |  |  [optional] |
|**caseSensitive** | **Boolean** |  |  [optional] |
|**deliveryFileRetrievable** | **Boolean** |  |  [optional] |
|**statuses** | [**List&lt;StatusesEnum&gt;**](#List&lt;StatusesEnum&gt;) |  |  [optional] |
|**stepTypes** | [**List&lt;StepTypesEnum&gt;**](#List&lt;StepTypesEnum&gt;) |  |  [optional] |



## Enum: List&lt;StatusesEnum&gt;

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



## Enum: List&lt;StepTypesEnum&gt;

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



