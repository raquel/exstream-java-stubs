

# ImportHistory


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdBy** | **String** |  |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  [optional] |
|**lastModifiedBy** | **String** |  |  [optional] |
|**lastModifiedDate** | **OffsetDateTime** |  |  [optional] |
|**importId** | **UUID** |  |  [optional] |
|**fileName** | **String** |  |  [optional] |
|**domain** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**error** | **String** |  |  [optional] |
|**exportPackageId** | **UUID** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| SUCCESS | &quot;SUCCESS&quot; |
| FAILURE | &quot;FAILURE&quot; |



