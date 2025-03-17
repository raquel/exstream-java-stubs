

# SortingDataFilter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ids** | **List&lt;UUID&gt;** |  |  [optional] |
|**jobIds** | **List&lt;UUID&gt;** |  |  [optional] |
|**flowStepIds** | **List&lt;UUID&gt;** |  |  [optional] |
|**communicationIds** | **List&lt;UUID&gt;** |  |  [optional] |
|**queueNames** | **List&lt;String&gt;** |  |  [optional] |
|**creationDateStart** | **String** |  |  [optional] |
|**creationDateEnd** | **String** |  |  [optional] |
|**externalIds** | **List&lt;String&gt;** |  |  [optional] |
|**flowModelIds** | **List&lt;UUID&gt;** |  |  [optional] |
|**lastModificationDateStart** | **OffsetDateTime** |  |  [optional] |
|**lastModificationDateEnd** | **OffsetDateTime** |  |  [optional] |
|**states** | [**List&lt;StatesEnum&gt;**](#List&lt;StatesEnum&gt;) |  |  [optional] |
|**assetTypes** | [**List&lt;AssetTypesEnum&gt;**](#List&lt;AssetTypesEnum&gt;) |  |  [optional] |
|**metadata** | **List&lt;String&gt;** |  |  [optional] |
|**sortSubflows** | **List&lt;String&gt;** |  |  [optional] |
|**referenceIds** | **List&lt;UUID&gt;** |  |  [optional] |
|**customersCountFrom** | **Integer** |  |  [optional] |
|**customersCountTo** | **Integer** |  |  [optional] |



## Enum: List&lt;StatesEnum&gt;

| Name | Value |
|---- | -----|
| PROCESSED | &quot;processed&quot; |
| WAITING | &quot;waiting&quot; |
| EXPIRED | &quot;expired&quot; |
| CANCELED | &quot;canceled&quot; |
| ALL | &quot;all&quot; |



## Enum: List&lt;AssetTypesEnum&gt;

| Name | Value |
|---- | -----|
| SORTINGINDEX | &quot;sortingIndex&quot; |
| SORTINGDATAREFERENCE | &quot;sortingDataReference&quot; |



