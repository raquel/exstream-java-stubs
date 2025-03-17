

# TenantFlowmodel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**revision** | **Integer** |  |  [optional] |
|**version** | **Integer** |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**stateComment** | **String** |  |  [optional] |
|**lockedBy** | **String** |  |  [optional] |
|**sdpermissions** | **List&lt;String&gt;** |  |  [optional] |
|**nodes** | [**List&lt;Node&gt;**](Node.md) |  |  [optional] |
|**latestVersion** | **Boolean** |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;DRAFT&quot; |
| REVIEW | &quot;REVIEW&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| COMMUNICATION | &quot;COMMUNICATION&quot; |
| ALERT | &quot;ALERT&quot; |
| NOTIFICATION | &quot;NOTIFICATION&quot; |



