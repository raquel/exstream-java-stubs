

# Domain


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**production** | **Boolean** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**jobTracing** | **Boolean** |  |  [optional] |
|**workflow** | [**WorkflowEnum**](#WorkflowEnum) |  |  [optional] |
|**restrictApproval** | **Boolean** |  |  [optional] |
|**children** | [**List&lt;Domain&gt;**](Domain.md) |  |  [optional] |
|**parent** | **String** |  |  [optional] |
|**editable** | **Boolean** |  |  [optional] |
|**approvalGroups** | [**List&lt;ApprovalGroup&gt;**](ApprovalGroup.md) |  |  [optional] |



## Enum: WorkflowEnum

| Name | Value |
|---- | -----|
| NORMAL | &quot;NORMAL&quot; |
| SIMPLE | &quot;SIMPLE&quot; |
| ADVANCED | &quot;ADVANCED&quot; |



