

# TreeResourceVersion


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowNestedSections** | **Boolean** |  |  [optional] |
|**categories** | [**List&lt;ResourceCategory&gt;**](ResourceCategory.md) |  |  [optional] |
|**children** | [**List&lt;TreeResourceVersion&gt;**](TreeResourceVersion.md) |  |  [optional] |
|**containsActiveRevisions** | **Boolean** |  |  [optional] |
|**content** | **Object** |  |  [optional] |
|**contentMimeType** | **String** |  |  [optional] |
|**contentType** | **String** |  |  [optional] |
|**createdBy** | **String** |  |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**domains** | [**List&lt;Domain&gt;**](Domain.md) |  |  [optional] |
|**effectiveEnd** | **OffsetDateTime** |  |  [optional] |
|**effectiveStart** | **OffsetDateTime** |  |  [optional] |
|**hidden** | **Boolean** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**isTrackingRevisions** | **Boolean** |  |  [optional] |
|**lastModifiedBy** | **String** |  |  [optional] |
|**lastModifiedDate** | **OffsetDateTime** |  |  [optional] |
|**latestVersion** | **Boolean** |  |  [optional] |
|**locked** | **Boolean** |  |  [optional] |
|**lockedBy** | **String** |  |  [optional] |
|**metadata** | [**ResourceMetadata**](ResourceMetadata.md) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**permissions** | **List&lt;String&gt;** |  |  [optional] |
|**resourcePackId** | **UUID** |  |  [optional] |
|**standardVariantId** | **UUID** |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |
|**stateComment** | **String** |  |  [optional] |
|**subtype** | **String** |  |  [optional] |
|**systemResource** | **Boolean** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**variants** | [**List&lt;ResourceVersion&gt;**](ResourceVersion.md) |  |  [optional] |
|**version** | **Integer** |  |  [optional] |



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
| EXSTRMIGRATIONSET | &quot;exstrmigrationset&quot; |
| EXSTRMESSAGING | &quot;exstrmessaging&quot; |



