

# ResourceHistory


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**modifiedBy** | **String** |  |  [optional] |
|**modifiedDate** | **OffsetDateTime** |  |  [optional] |
|**operation** | [**OperationEnum**](#OperationEnum) |  |  [optional] |
|**state** | **String** |  |  [optional] |
|**historyType** | [**HistoryTypeEnum**](#HistoryTypeEnum) |  |  [optional] |
|**auditedComment** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**version** | **Integer** |  |  [optional] |
|**revision** | **Integer** |  |  [optional] |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| INSERT | &quot;INSERT&quot; |
| UPDATE | &quot;UPDATE&quot; |
| DELETE | &quot;DELETE&quot; |



## Enum: HistoryTypeEnum

| Name | Value |
|---- | -----|
| CREATE | &quot;CREATE&quot; |
| STATE | &quot;STATE&quot; |
| METADATA | &quot;METADATA&quot; |
| CONTENT | &quot;CONTENT&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| DESIGNER | &quot;designer&quot; |
| AUTHOR | &quot;author&quot; |
| DESIGNASSET | &quot;designAsset&quot; |
| COMMASSET | &quot;commAsset&quot; |
| ORCHESTRATOR | &quot;orchestrator&quot; |
| RESOURCEPACK | &quot;resourcepack&quot; |
| EXSTRAPPLICATION | &quot;exstrapplication&quot; |
| EXSTRDOCUMENT | &quot;exstrdocument&quot; |
| EXSTRPAGE | &quot;exstrpage&quot; |
| EXSTRCOMPONENTOBJ | &quot;exstrcomponentobj&quot; |
| EXSTREMAIL | &quot;exstremail&quot; |
| EXSTRENGINE | &quot;exstrengine&quot; |
| EXSTRVARIABLEBASE | &quot;exstrvariablebase&quot; |
| EXSTRPACKAGE | &quot;exstrpackage&quot; |
| EXSTRGRAPHICALMESSAGE | &quot;exstrgraphicalmessage&quot; |
| EXSTRTEXTMESSAGE | &quot;exstrtextmessage&quot; |
| EXSTRPARAGRAPH | &quot;exstrparagraph&quot; |
| EXSTRPARAGRAPHSECTION | &quot;exstrparagraphsection&quot; |
| IMAGE | &quot;image&quot; |
| SAMPLEFILE | &quot;samplefile&quot; |
| EXSTRDATASOURCE | &quot;exstrdatasource&quot; |
| EXSTRHTML5 | &quot;exstrhtml5&quot; |
| VERSIONEDTEMPLATE | &quot;versionedtemplate&quot; |
| DOCUMENTDEFINITION | &quot;documentdefinition&quot; |
| ENGINERUNDEF | &quot;enginerundef&quot; |
| FONT | &quot;font&quot; |
| FONTDEFINITION | &quot;fontdefinition&quot; |
| EXSTRBARCODE | &quot;exstrbarcode&quot; |
| EXSTRPAPERTYPE | &quot;exstrpapertype&quot; |
| EXSTRMESSAGETYPE | &quot;exstrmessagetype&quot; |
| EXSTRMETADATA | &quot;exstrmetadata&quot; |
| ORCSETTINGS | &quot;orcsettings&quot; |
| FLOWMODEL | &quot;flowmodel&quot; |
| EXSTRCOMMUNICATIONSET | &quot;exstrcommunicationset&quot; |
| EXSTROUTPUTQUEUE | &quot;exstroutputqueue&quot; |
| EXSTROUTPUT | &quot;exstroutput&quot; |
| EXSTRLANGUAGE | &quot;exstrlanguage&quot; |
| EXSTRLOCALE | &quot;exstrlocale&quot; |
| EXSTRMIGRATIONSET | &quot;exstrmigrationset&quot; |
| EXSTRMESSAGING | &quot;exstrmessaging&quot; |
| EXSTRMESSAGINGAUTHOR | &quot;exstrmessagingauthor&quot; |
| FLOWSCRIPT | &quot;flowscript&quot; |
| EXSTRNAMEDCOLOR | &quot;exstrnamedcolor&quot; |
| EXSTRCOLORFAMILY | &quot;exstrcolorfamily&quot; |
| EXSTRSTYLE | &quot;exstrstyle&quot; |
| EXSTRSTYLESHEET | &quot;exstrstylesheet&quot; |
| EXSTREVENT | &quot;exstrevent&quot; |
| EXSTRRULE | &quot;exstrrule&quot; |
| DASHBOARD | &quot;dashboard&quot; |
| PDF | &quot;pdf&quot; |



