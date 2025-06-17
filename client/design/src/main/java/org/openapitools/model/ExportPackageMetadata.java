package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.VersionConfig;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ExportPackageMetadata
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class ExportPackageMetadata {

  private String databaseName;

  private String databaseVersion;

  private String applicationVersion;

  private String creator;

  private String exportCreationDate;

  private String exportUpdateDate;

  private String exportOptions;

  private VersionConfig versionConfig;

  public ExportPackageMetadata databaseName(String databaseName) {
    this.databaseName = databaseName;
    return this;
  }

  /**
   * Get databaseName
   * @return databaseName
  */
  
  @Schema(name = "databaseName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("databaseName")
  public String getDatabaseName() {
    return databaseName;
  }

  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }

  public ExportPackageMetadata databaseVersion(String databaseVersion) {
    this.databaseVersion = databaseVersion;
    return this;
  }

  /**
   * Get databaseVersion
   * @return databaseVersion
  */
  
  @Schema(name = "databaseVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("databaseVersion")
  public String getDatabaseVersion() {
    return databaseVersion;
  }

  public void setDatabaseVersion(String databaseVersion) {
    this.databaseVersion = databaseVersion;
  }

  public ExportPackageMetadata applicationVersion(String applicationVersion) {
    this.applicationVersion = applicationVersion;
    return this;
  }

  /**
   * Get applicationVersion
   * @return applicationVersion
  */
  
  @Schema(name = "applicationVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("applicationVersion")
  public String getApplicationVersion() {
    return applicationVersion;
  }

  public void setApplicationVersion(String applicationVersion) {
    this.applicationVersion = applicationVersion;
  }

  public ExportPackageMetadata creator(String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * Get creator
   * @return creator
  */
  
  @Schema(name = "creator", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creator")
  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public ExportPackageMetadata exportCreationDate(String exportCreationDate) {
    this.exportCreationDate = exportCreationDate;
    return this;
  }

  /**
   * Get exportCreationDate
   * @return exportCreationDate
  */
  
  @Schema(name = "exportCreationDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exportCreationDate")
  public String getExportCreationDate() {
    return exportCreationDate;
  }

  public void setExportCreationDate(String exportCreationDate) {
    this.exportCreationDate = exportCreationDate;
  }

  public ExportPackageMetadata exportUpdateDate(String exportUpdateDate) {
    this.exportUpdateDate = exportUpdateDate;
    return this;
  }

  /**
   * Get exportUpdateDate
   * @return exportUpdateDate
  */
  
  @Schema(name = "exportUpdateDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exportUpdateDate")
  public String getExportUpdateDate() {
    return exportUpdateDate;
  }

  public void setExportUpdateDate(String exportUpdateDate) {
    this.exportUpdateDate = exportUpdateDate;
  }

  public ExportPackageMetadata exportOptions(String exportOptions) {
    this.exportOptions = exportOptions;
    return this;
  }

  /**
   * Get exportOptions
   * @return exportOptions
  */
  
  @Schema(name = "exportOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exportOptions")
  public String getExportOptions() {
    return exportOptions;
  }

  public void setExportOptions(String exportOptions) {
    this.exportOptions = exportOptions;
  }

  public ExportPackageMetadata versionConfig(VersionConfig versionConfig) {
    this.versionConfig = versionConfig;
    return this;
  }

  /**
   * Get versionConfig
   * @return versionConfig
  */
  @Valid 
  @Schema(name = "versionConfig", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionConfig")
  public VersionConfig getVersionConfig() {
    return versionConfig;
  }

  public void setVersionConfig(VersionConfig versionConfig) {
    this.versionConfig = versionConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportPackageMetadata exportPackageMetadata = (ExportPackageMetadata) o;
    return Objects.equals(this.databaseName, exportPackageMetadata.databaseName) &&
        Objects.equals(this.databaseVersion, exportPackageMetadata.databaseVersion) &&
        Objects.equals(this.applicationVersion, exportPackageMetadata.applicationVersion) &&
        Objects.equals(this.creator, exportPackageMetadata.creator) &&
        Objects.equals(this.exportCreationDate, exportPackageMetadata.exportCreationDate) &&
        Objects.equals(this.exportUpdateDate, exportPackageMetadata.exportUpdateDate) &&
        Objects.equals(this.exportOptions, exportPackageMetadata.exportOptions) &&
        Objects.equals(this.versionConfig, exportPackageMetadata.versionConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseName, databaseVersion, applicationVersion, creator, exportCreationDate, exportUpdateDate, exportOptions, versionConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportPackageMetadata {\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    databaseVersion: ").append(toIndentedString(databaseVersion)).append("\n");
    sb.append("    applicationVersion: ").append(toIndentedString(applicationVersion)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    exportCreationDate: ").append(toIndentedString(exportCreationDate)).append("\n");
    sb.append("    exportUpdateDate: ").append(toIndentedString(exportUpdateDate)).append("\n");
    sb.append("    exportOptions: ").append(toIndentedString(exportOptions)).append("\n");
    sb.append("    versionConfig: ").append(toIndentedString(versionConfig)).append("\n");
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

