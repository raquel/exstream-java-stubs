

# MigrationSetRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**tmpId** | **UUID** |  |  [optional] |
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**ratTolerance** | **Integer** |  |  [optional] |
|**fragTolerance** | **Integer** |  |  [optional] |
|**dataSources** | [**List&lt;MigrationSetResource&gt;**](MigrationSetResource.md) |  |  [optional] |
|**outputSamples** | [**List&lt;MigrationSetResource&gt;**](MigrationSetResource.md) |  |  [optional] |
|**templates** | [**List&lt;MigrationSetResource&gt;**](MigrationSetResource.md) |  |  [optional] |
|**migrationType** | [**MigrationTypeEnum**](#MigrationTypeEnum) |  |  |
|**filter** | [**MigrationSetFilter**](MigrationSetFilter.md) |  |  [optional] |



## Enum: MigrationTypeEnum

| Name | Value |
|---- | -----|
| CONTENT | &quot;CONTENT&quot; |
| TEMPLATE | &quot;TEMPLATE&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



