

# UpdateStateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**body** | [**RequestBodyPut**](RequestBodyPut.md) |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | State |  [optional] |
|**filterRequest** | [**SortingDataFilterRequest**](SortingDataFilterRequest.md) |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PROCESSED | &quot;processed&quot; |
| WAITING | &quot;waiting&quot; |
| EXPIRED | &quot;expired&quot; |
| CANCELED | &quot;canceled&quot; |
| ALL | &quot;all&quot; |



