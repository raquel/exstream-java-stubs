

# Node


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**displayName** | **String** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**instanceId** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**subtype** | [**SubtypeEnum**](#SubtypeEnum) |  |  [optional] |
|**internal** | **Boolean** |  |  [optional] |
|**x** | **Integer** |  |  [optional] |
|**y** | **Integer** |  |  [optional] |
|**connections** | [**List&lt;Connection&gt;**](Connection.md) |  |  [optional] |
|**attributes** | [**List&lt;NodeAttribute&gt;**](NodeAttribute.md) |  |  [optional] |
|**metadata** | [**List&lt;NodeMetadata&gt;**](NodeMetadata.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INPUT | &quot;input&quot; |
| OUTPUT | &quot;output&quot; |
| OUTPUT_EXTERNAL_RESPONSE | &quot;output_external_response&quot; |
| COMMUNICATION | &quot;communication&quot; |
| COMMUNICATION_RESPONSE | &quot;communication_response&quot; |
| EXTERNALSUBFLOW | &quot;externalsubflow&quot; |
| DECIDER | &quot;decider&quot; |
| DELAY | &quot;delay&quot; |
| PROCESSOR | &quot;processor&quot; |
| AGGREGATION | &quot;aggregation&quot; |
| EVENT | &quot;event&quot; |



## Enum: SubtypeEnum

| Name | Value |
|---- | -----|
| DIRECTORY_CHANNEL | &quot;directory_channel&quot; |
| HTTPS_CHANNEL | &quot;https_channel&quot; |
| AWS_S3_INPUT_CHANNEL | &quot;aws_s3_input_channel&quot; |
| EMPOWER_FULFILLMENT_CHANNEL | &quot;empower_fulfillment_channel&quot; |
| POST_SORT_EVENT_CHANNEL | &quot;post_sort_event_channel&quot; |
| FILE_CHANNEL | &quot;file_channel&quot; |
| EMAIL_CHANNEL | &quot;email_channel&quot; |
| DOCUMENTRESPONSE_CHANNEL | &quot;documentresponse_channel&quot; |
| AZURE_BLOB_CHANNEL | &quot;azure_blob_channel&quot; |
| AWS_S3_CHANNEL | &quot;aws_s3_channel&quot; |
| GCP_CS_OUT_CHANNEL | &quot;gcp_cs_out_channel&quot; |
| GENERIC | &quot;generic&quot; |
| GENERIC_CHANNEL | &quot;generic_channel&quot; |
| UNKNOWN | &quot;unknown&quot; |



