

# ImportResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**ExportPackageMetadata**](ExportPackageMetadata.md) |  |  [optional] |
|**exportPackageUUID** | **String** |  |  [optional] |
|**policies** | [**ReplacementPolicySettings**](ReplacementPolicySettings.md) |  |  [optional] |
|**importedResources** | [**List&lt;ImportFoundResource&gt;**](ImportFoundResource.md) |  |  [optional] |
|**ignoredResources** | [**List&lt;ImportFoundResource&gt;**](ImportFoundResource.md) |  |  [optional] |
|**conflictedResources** | [**List&lt;ImportConflictResource&gt;**](ImportConflictResource.md) |  |  [optional] |
|**existingResources** | [**List&lt;ImportFoundResource&gt;**](ImportFoundResource.md) |  |  [optional] |
|**importedCategories** | [**List&lt;ImportFoundCategory&gt;**](ImportFoundCategory.md) |  |  [optional] |
|**ignoredCategories** | [**List&lt;ImportFoundCategory&gt;**](ImportFoundCategory.md) |  |  [optional] |
|**deploymentPackages** | **List&lt;String&gt;** |  |  [optional] |
|**deletedResources** | [**List&lt;ImportFoundResource&gt;**](ImportFoundResource.md) |  |  [optional] |
|**placeholderDataSources** | [**List&lt;DataSource&gt;**](DataSource.md) |  |  [optional] |
|**resourcePermissions** | **Map&lt;String, String&gt;** |  |  [optional] |
|**warnings** | **Set&lt;String&gt;** |  |  [optional] |
|**schemaMetadata** | [**ExportPackageMetadata**](ExportPackageMetadata.md) |  |  [optional] |



