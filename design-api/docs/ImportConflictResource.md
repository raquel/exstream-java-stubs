

# ImportConflictResource


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**locked** | **Boolean** |  |  [optional] |
|**lockedBy** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**newName** | **String** |  |  [optional] |
|**performedAction** | [**PerformedActionEnum**](#PerformedActionEnum) |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**userSelectedAction** | [**UserSelectedActionEnum**](#UserSelectedActionEnum) |  |  [optional] |
|**version** | **Integer** |  |  [optional] |



## Enum: PerformedActionEnum

| Name | Value |
|---- | -----|
| AUTO_RENAME | &quot;AUTO_RENAME&quot; |
| ERROR | &quot;ERROR&quot; |
| REPLACE | &quot;REPLACE&quot; |
| SKIP | &quot;SKIP&quot; |
| REPLACE_IF_NEWER | &quot;REPLACE_IF_NEWER&quot; |
| EXISTING | &quot;EXISTING&quot; |



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



