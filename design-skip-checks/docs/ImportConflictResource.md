

# ImportConflictResource


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**version** | **Integer** |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |
|**newName** | **String** |  |  [optional] |
|**origId** | **UUID** |  |  [optional] |
|**userSelectedAction** | [**UserSelectedActionEnum**](#UserSelectedActionEnum) |  |  [optional] |
|**performedAction** | [**PerformedActionEnum**](#PerformedActionEnum) |  |  [optional] |
|**locked** | **Boolean** |  |  [optional] |
|**lockedBy** | **String** |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;DRAFT&quot; |
| REVIEW | &quot;REVIEW&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |



## Enum: UserSelectedActionEnum

| Name | Value |
|---- | -----|
| AUTO_RENAME | &quot;AUTO_RENAME&quot; |
| ERROR | &quot;ERROR&quot; |
| REPLACE | &quot;REPLACE&quot; |
| SKIP | &quot;SKIP&quot; |
| REPLACE_IF_NEWER | &quot;REPLACE_IF_NEWER&quot; |
| EXISTING | &quot;EXISTING&quot; |
| REPLACE_AT_SAME_VERSION | &quot;REPLACE_AT_SAME_VERSION&quot; |
| PROMOTED_TO_DOMAIN | &quot;PROMOTED_TO_DOMAIN&quot; |



## Enum: PerformedActionEnum

| Name | Value |
|---- | -----|
| AUTO_RENAME | &quot;AUTO_RENAME&quot; |
| ERROR | &quot;ERROR&quot; |
| REPLACE | &quot;REPLACE&quot; |
| SKIP | &quot;SKIP&quot; |
| REPLACE_IF_NEWER | &quot;REPLACE_IF_NEWER&quot; |
| EXISTING | &quot;EXISTING&quot; |
| REPLACE_AT_SAME_VERSION | &quot;REPLACE_AT_SAME_VERSION&quot; |
| PROMOTED_TO_DOMAIN | &quot;PROMOTED_TO_DOMAIN&quot; |



