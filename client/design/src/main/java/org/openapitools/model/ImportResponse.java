package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapitools.model.DataSource;
import org.openapitools.model.ExportPackageMetadata;
import org.openapitools.model.ImportConflictResource;
import org.openapitools.model.ImportFoundCategory;
import org.openapitools.model.ImportFoundResource;
import org.openapitools.model.ReplacementPolicySettings;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ImportResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class ImportResponse {

  private ExportPackageMetadata metadata;

  private String exportPackageUUID;

  private ReplacementPolicySettings policies;

  @Valid
  private List<@Valid ImportFoundResource> importedResources;

  @Valid
  private List<@Valid ImportFoundResource> ignoredResources;

  @Valid
  private List<@Valid ImportConflictResource> conflictedResources;

  @Valid
  private List<@Valid ImportFoundResource> existingResources;

  @Valid
  private List<@Valid ImportFoundCategory> importedCategories;

  @Valid
  private List<@Valid ImportFoundCategory> ignoredCategories;

  @Valid
  private List<String> deploymentPackages;

  @Valid
  private List<@Valid ImportFoundResource> deletedResources;

  @Valid
  private List<@Valid DataSource> placeholderDataSources;

  @Valid
  private Map<String, String> resourcePermissions = new HashMap<>();

  @Valid
  private Set<String> warnings;

  private ExportPackageMetadata schemaMetadata;

  public ImportResponse metadata(ExportPackageMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  @Valid 
  @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metadata")
  public ExportPackageMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(ExportPackageMetadata metadata) {
    this.metadata = metadata;
  }

  public ImportResponse exportPackageUUID(String exportPackageUUID) {
    this.exportPackageUUID = exportPackageUUID;
    return this;
  }

  /**
   * Get exportPackageUUID
   * @return exportPackageUUID
  */
  
  @Schema(name = "exportPackageUUID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exportPackageUUID")
  public String getExportPackageUUID() {
    return exportPackageUUID;
  }

  public void setExportPackageUUID(String exportPackageUUID) {
    this.exportPackageUUID = exportPackageUUID;
  }

  public ImportResponse policies(ReplacementPolicySettings policies) {
    this.policies = policies;
    return this;
  }

  /**
   * Get policies
   * @return policies
  */
  @Valid 
  @Schema(name = "policies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("policies")
  public ReplacementPolicySettings getPolicies() {
    return policies;
  }

  public void setPolicies(ReplacementPolicySettings policies) {
    this.policies = policies;
  }

  public ImportResponse importedResources(List<@Valid ImportFoundResource> importedResources) {
    this.importedResources = importedResources;
    return this;
  }

  public ImportResponse addImportedResourcesItem(ImportFoundResource importedResourcesItem) {
    if (this.importedResources == null) {
      this.importedResources = new ArrayList<>();
    }
    this.importedResources.add(importedResourcesItem);
    return this;
  }

  /**
   * Get importedResources
   * @return importedResources
  */
  @Valid 
  @Schema(name = "importedResources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("importedResources")
  public List<@Valid ImportFoundResource> getImportedResources() {
    return importedResources;
  }

  public void setImportedResources(List<@Valid ImportFoundResource> importedResources) {
    this.importedResources = importedResources;
  }

  public ImportResponse ignoredResources(List<@Valid ImportFoundResource> ignoredResources) {
    this.ignoredResources = ignoredResources;
    return this;
  }

  public ImportResponse addIgnoredResourcesItem(ImportFoundResource ignoredResourcesItem) {
    if (this.ignoredResources == null) {
      this.ignoredResources = new ArrayList<>();
    }
    this.ignoredResources.add(ignoredResourcesItem);
    return this;
  }

  /**
   * Get ignoredResources
   * @return ignoredResources
  */
  @Valid 
  @Schema(name = "ignoredResources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ignoredResources")
  public List<@Valid ImportFoundResource> getIgnoredResources() {
    return ignoredResources;
  }

  public void setIgnoredResources(List<@Valid ImportFoundResource> ignoredResources) {
    this.ignoredResources = ignoredResources;
  }

  public ImportResponse conflictedResources(List<@Valid ImportConflictResource> conflictedResources) {
    this.conflictedResources = conflictedResources;
    return this;
  }

  public ImportResponse addConflictedResourcesItem(ImportConflictResource conflictedResourcesItem) {
    if (this.conflictedResources == null) {
      this.conflictedResources = new ArrayList<>();
    }
    this.conflictedResources.add(conflictedResourcesItem);
    return this;
  }

  /**
   * Get conflictedResources
   * @return conflictedResources
  */
  @Valid 
  @Schema(name = "conflictedResources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conflictedResources")
  public List<@Valid ImportConflictResource> getConflictedResources() {
    return conflictedResources;
  }

  public void setConflictedResources(List<@Valid ImportConflictResource> conflictedResources) {
    this.conflictedResources = conflictedResources;
  }

  public ImportResponse existingResources(List<@Valid ImportFoundResource> existingResources) {
    this.existingResources = existingResources;
    return this;
  }

  public ImportResponse addExistingResourcesItem(ImportFoundResource existingResourcesItem) {
    if (this.existingResources == null) {
      this.existingResources = new ArrayList<>();
    }
    this.existingResources.add(existingResourcesItem);
    return this;
  }

  /**
   * Get existingResources
   * @return existingResources
  */
  @Valid 
  @Schema(name = "existingResources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("existingResources")
  public List<@Valid ImportFoundResource> getExistingResources() {
    return existingResources;
  }

  public void setExistingResources(List<@Valid ImportFoundResource> existingResources) {
    this.existingResources = existingResources;
  }

  public ImportResponse importedCategories(List<@Valid ImportFoundCategory> importedCategories) {
    this.importedCategories = importedCategories;
    return this;
  }

  public ImportResponse addImportedCategoriesItem(ImportFoundCategory importedCategoriesItem) {
    if (this.importedCategories == null) {
      this.importedCategories = new ArrayList<>();
    }
    this.importedCategories.add(importedCategoriesItem);
    return this;
  }

  /**
   * Get importedCategories
   * @return importedCategories
  */
  @Valid 
  @Schema(name = "importedCategories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("importedCategories")
  public List<@Valid ImportFoundCategory> getImportedCategories() {
    return importedCategories;
  }

  public void setImportedCategories(List<@Valid ImportFoundCategory> importedCategories) {
    this.importedCategories = importedCategories;
  }

  public ImportResponse ignoredCategories(List<@Valid ImportFoundCategory> ignoredCategories) {
    this.ignoredCategories = ignoredCategories;
    return this;
  }

  public ImportResponse addIgnoredCategoriesItem(ImportFoundCategory ignoredCategoriesItem) {
    if (this.ignoredCategories == null) {
      this.ignoredCategories = new ArrayList<>();
    }
    this.ignoredCategories.add(ignoredCategoriesItem);
    return this;
  }

  /**
   * Get ignoredCategories
   * @return ignoredCategories
  */
  @Valid 
  @Schema(name = "ignoredCategories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ignoredCategories")
  public List<@Valid ImportFoundCategory> getIgnoredCategories() {
    return ignoredCategories;
  }

  public void setIgnoredCategories(List<@Valid ImportFoundCategory> ignoredCategories) {
    this.ignoredCategories = ignoredCategories;
  }

  public ImportResponse deploymentPackages(List<String> deploymentPackages) {
    this.deploymentPackages = deploymentPackages;
    return this;
  }

  public ImportResponse addDeploymentPackagesItem(String deploymentPackagesItem) {
    if (this.deploymentPackages == null) {
      this.deploymentPackages = new ArrayList<>();
    }
    this.deploymentPackages.add(deploymentPackagesItem);
    return this;
  }

  /**
   * Get deploymentPackages
   * @return deploymentPackages
  */
  
  @Schema(name = "deploymentPackages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deploymentPackages")
  public List<String> getDeploymentPackages() {
    return deploymentPackages;
  }

  public void setDeploymentPackages(List<String> deploymentPackages) {
    this.deploymentPackages = deploymentPackages;
  }

  public ImportResponse deletedResources(List<@Valid ImportFoundResource> deletedResources) {
    this.deletedResources = deletedResources;
    return this;
  }

  public ImportResponse addDeletedResourcesItem(ImportFoundResource deletedResourcesItem) {
    if (this.deletedResources == null) {
      this.deletedResources = new ArrayList<>();
    }
    this.deletedResources.add(deletedResourcesItem);
    return this;
  }

  /**
   * Get deletedResources
   * @return deletedResources
  */
  @Valid 
  @Schema(name = "deletedResources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deletedResources")
  public List<@Valid ImportFoundResource> getDeletedResources() {
    return deletedResources;
  }

  public void setDeletedResources(List<@Valid ImportFoundResource> deletedResources) {
    this.deletedResources = deletedResources;
  }

  public ImportResponse placeholderDataSources(List<@Valid DataSource> placeholderDataSources) {
    this.placeholderDataSources = placeholderDataSources;
    return this;
  }

  public ImportResponse addPlaceholderDataSourcesItem(DataSource placeholderDataSourcesItem) {
    if (this.placeholderDataSources == null) {
      this.placeholderDataSources = new ArrayList<>();
    }
    this.placeholderDataSources.add(placeholderDataSourcesItem);
    return this;
  }

  /**
   * Get placeholderDataSources
   * @return placeholderDataSources
  */
  @Valid 
  @Schema(name = "placeholderDataSources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placeholderDataSources")
  public List<@Valid DataSource> getPlaceholderDataSources() {
    return placeholderDataSources;
  }

  public void setPlaceholderDataSources(List<@Valid DataSource> placeholderDataSources) {
    this.placeholderDataSources = placeholderDataSources;
  }

  public ImportResponse resourcePermissions(Map<String, String> resourcePermissions) {
    this.resourcePermissions = resourcePermissions;
    return this;
  }

  public ImportResponse putResourcePermissionsItem(String key, String resourcePermissionsItem) {
    if (this.resourcePermissions == null) {
      this.resourcePermissions = new HashMap<>();
    }
    this.resourcePermissions.put(key, resourcePermissionsItem);
    return this;
  }

  /**
   * Get resourcePermissions
   * @return resourcePermissions
  */
  
  @Schema(name = "resourcePermissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourcePermissions")
  public Map<String, String> getResourcePermissions() {
    return resourcePermissions;
  }

  public void setResourcePermissions(Map<String, String> resourcePermissions) {
    this.resourcePermissions = resourcePermissions;
  }

  public ImportResponse warnings(Set<String> warnings) {
    this.warnings = warnings;
    return this;
  }

  public ImportResponse addWarningsItem(String warningsItem) {
    if (this.warnings == null) {
      this.warnings = new LinkedHashSet<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * Get warnings
   * @return warnings
  */
  
  @Schema(name = "warnings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warnings")
  public Set<String> getWarnings() {
    return warnings;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setWarnings(Set<String> warnings) {
    this.warnings = warnings;
  }

  public ImportResponse schemaMetadata(ExportPackageMetadata schemaMetadata) {
    this.schemaMetadata = schemaMetadata;
    return this;
  }

  /**
   * Get schemaMetadata
   * @return schemaMetadata
  */
  @Valid 
  @Schema(name = "schemaMetadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schemaMetadata")
  public ExportPackageMetadata getSchemaMetadata() {
    return schemaMetadata;
  }

  public void setSchemaMetadata(ExportPackageMetadata schemaMetadata) {
    this.schemaMetadata = schemaMetadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportResponse importResponse = (ImportResponse) o;
    return Objects.equals(this.metadata, importResponse.metadata) &&
        Objects.equals(this.exportPackageUUID, importResponse.exportPackageUUID) &&
        Objects.equals(this.policies, importResponse.policies) &&
        Objects.equals(this.importedResources, importResponse.importedResources) &&
        Objects.equals(this.ignoredResources, importResponse.ignoredResources) &&
        Objects.equals(this.conflictedResources, importResponse.conflictedResources) &&
        Objects.equals(this.existingResources, importResponse.existingResources) &&
        Objects.equals(this.importedCategories, importResponse.importedCategories) &&
        Objects.equals(this.ignoredCategories, importResponse.ignoredCategories) &&
        Objects.equals(this.deploymentPackages, importResponse.deploymentPackages) &&
        Objects.equals(this.deletedResources, importResponse.deletedResources) &&
        Objects.equals(this.placeholderDataSources, importResponse.placeholderDataSources) &&
        Objects.equals(this.resourcePermissions, importResponse.resourcePermissions) &&
        Objects.equals(this.warnings, importResponse.warnings) &&
        Objects.equals(this.schemaMetadata, importResponse.schemaMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, exportPackageUUID, policies, importedResources, ignoredResources, conflictedResources, existingResources, importedCategories, ignoredCategories, deploymentPackages, deletedResources, placeholderDataSources, resourcePermissions, warnings, schemaMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportResponse {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    exportPackageUUID: ").append(toIndentedString(exportPackageUUID)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    importedResources: ").append(toIndentedString(importedResources)).append("\n");
    sb.append("    ignoredResources: ").append(toIndentedString(ignoredResources)).append("\n");
    sb.append("    conflictedResources: ").append(toIndentedString(conflictedResources)).append("\n");
    sb.append("    existingResources: ").append(toIndentedString(existingResources)).append("\n");
    sb.append("    importedCategories: ").append(toIndentedString(importedCategories)).append("\n");
    sb.append("    ignoredCategories: ").append(toIndentedString(ignoredCategories)).append("\n");
    sb.append("    deploymentPackages: ").append(toIndentedString(deploymentPackages)).append("\n");
    sb.append("    deletedResources: ").append(toIndentedString(deletedResources)).append("\n");
    sb.append("    placeholderDataSources: ").append(toIndentedString(placeholderDataSources)).append("\n");
    sb.append("    resourcePermissions: ").append(toIndentedString(resourcePermissions)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    schemaMetadata: ").append(toIndentedString(schemaMetadata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

