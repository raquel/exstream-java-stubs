

# ResourceFilter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ids** | **List&lt;UUID&gt;** |  |  [optional] |
|**excludedIds** | **List&lt;UUID&gt;** |  |  [optional] |
|**types** | [**List&lt;TypesEnum&gt;**](#List&lt;TypesEnum&gt;) |  |  [optional] |
|**excludedTypes** | [**List&lt;ExcludedTypesEnum&gt;**](#List&lt;ExcludedTypesEnum&gt;) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**createdBy** | **String** |  |  [optional] |
|**lastModifiedBy** | **String** |  |  [optional] |
|**createdDateStart** | **OffsetDateTime** |  |  [optional] |
|**createdDateEnd** | **OffsetDateTime** |  |  [optional] |
|**lastModifiedDateStart** | **OffsetDateTime** |  |  [optional] |
|**lastModifiedDateEnd** | **OffsetDateTime** |  |  [optional] |
|**searchString** | **String** |  |  [optional] |
|**caseSensitive** | **Boolean** |  |  [optional] |
|**wholeWord** | **Boolean** |  |  [optional] |
|**resourcePackId** | **UUID** |  |  [optional] |
|**systemResource** | **Boolean** |  |  [optional] |
|**hidden** | **Boolean** |  |  [optional] |
|**hasApprovedVersion** | **Boolean** |  |  [optional] |
|**includeVariants** | **Boolean** |  |  [optional] |
|**standardVariantId** | **UUID** |  |  [optional] |
|**useEffectiveDate** | **Boolean** |  |  [optional] |
|**effectiveDate** | **OffsetDateTime** |  |  [optional] |
|**categories** | **List&lt;String&gt;** |  |  [optional] |
|**categoryObjects** | [**List&lt;ResourceCategory&gt;**](ResourceCategory.md) |  |  [optional] |
|**vfilterLastModifiedDateEnd** | **OffsetDateTime** |  |  [optional] |
|**metadata** | **Map&lt;String, List&lt;Object&gt;&gt;** |  |  [optional] |
|**domainId** | **String** |  |  [optional] |
|**latestVersion** | **Boolean** |  |  [optional] |
|**locked** | **Boolean** |  |  [optional] |
|**states** | [**List&lt;StatesEnum&gt;**](#List&lt;StatesEnum&gt;) |  |  [optional] |
|**overrideIds** | **List&lt;UUID&gt;** |  |  [optional] |
|**overrideStates** | [**List&lt;OverrideStatesEnum&gt;**](#List&lt;OverrideStatesEnum&gt;) |  |  [optional] |



## Enum: List&lt;TypesEnum&gt;

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



## Enum: List&lt;ExcludedTypesEnum&gt;

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



## Enum: List&lt;StatesEnum&gt;

| Name | Value |
|---- | -----|
| DRAFT | &quot;DRAFT&quot; |
| REVIEW | &quot;REVIEW&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |



## Enum: List&lt;OverrideStatesEnum&gt;

| Name | Value |
|---- | -----|
| DRAFT | &quot;DRAFT&quot; |
| REVIEW | &quot;REVIEW&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |



