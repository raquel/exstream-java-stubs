

# NodeFilter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ids** | **List&lt;UUID&gt;** |  |  [optional] |
|**types** | [**List&lt;TypesEnum&gt;**](#List&lt;TypesEnum&gt;) |  |  [optional] |
|**excludedTypes** | [**List&lt;ExcludedTypesEnum&gt;**](#List&lt;ExcludedTypesEnum&gt;) |  |  [optional] |
|**subtypes** | [**List&lt;SubtypesEnum&gt;**](#List&lt;SubtypesEnum&gt;) |  |  [optional] |
|**excludedSubtypes** | [**List&lt;ExcludedSubtypesEnum&gt;**](#List&lt;ExcludedSubtypesEnum&gt;) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**caseSensitive** | **Boolean** |  |  [optional] |
|**wholeWord** | **Boolean** |  |  [optional] |
|**subTypes** | [**List&lt;SubTypesEnum&gt;**](#List&lt;SubTypesEnum&gt;) |  |  [optional] |



## Enum: List&lt;TypesEnum&gt;

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



## Enum: List&lt;ExcludedTypesEnum&gt;

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



## Enum: List&lt;SubtypesEnum&gt;

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



## Enum: List&lt;ExcludedSubtypesEnum&gt;

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



## Enum: List&lt;SubTypesEnum&gt;

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



