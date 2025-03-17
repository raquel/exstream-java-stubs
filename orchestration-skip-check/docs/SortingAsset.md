

# SortingAsset


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**jobId** | **UUID** |  |  [optional] |
|**flowStepId** | **UUID** |  |  [optional] |
|**flowModelId** | **UUID** |  |  [optional] |
|**communicationId** | **UUID** |  |  [optional] |
|**subpackageIds** | **String** |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |
|**creationDate** | **OffsetDateTime** |  |  [optional] |
|**lastModificationDate** | **OffsetDateTime** |  |  [optional] |
|**queueName** | **String** |  |  [optional] |
|**metadata** | **String** |  |  [optional] |
|**engineInfo** | **String** |  |  [optional] |
|**sortSubflow** | **String** |  |  [optional] |
|**externalId** | **String** |  |  [optional] |
|**referenceId** | **UUID** |  |  [optional] |
|**customersCount** | **Integer** |  |  [optional] |
|**subPackageIds** | **String** |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PROCESSED | &quot;processed&quot; |
| WAITING | &quot;waiting&quot; |
| EXPIRED | &quot;expired&quot; |
| CANCELED | &quot;canceled&quot; |
| ALL | &quot;all&quot; |



