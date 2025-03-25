package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ReportObj
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class ReportObj {

  private Boolean appLevel;

  private String format;

  private String id;

  private String name;

  private String prodFile;

  public ReportObj appLevel(Boolean appLevel) {
    this.appLevel = appLevel;
    return this;
  }

  /**
   * Get appLevel
   * @return appLevel
  */
  
  @Schema(name = "appLevel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appLevel")
  public Boolean getAppLevel() {
    return appLevel;
  }

  public void setAppLevel(Boolean appLevel) {
    this.appLevel = appLevel;
  }

  public ReportObj format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
  */
  
  @Schema(name = "format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("format")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public ReportObj id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ReportObj name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ReportObj prodFile(String prodFile) {
    this.prodFile = prodFile;
    return this;
  }

  /**
   * Get prodFile
   * @return prodFile
  */
  
  @Schema(name = "prodFile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prodFile")
  public String getProdFile() {
    return prodFile;
  }

  public void setProdFile(String prodFile) {
    this.prodFile = prodFile;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportObj reportObj = (ReportObj) o;
    return Objects.equals(this.appLevel, reportObj.appLevel) &&
        Objects.equals(this.format, reportObj.format) &&
        Objects.equals(this.id, reportObj.id) &&
        Objects.equals(this.name, reportObj.name) &&
        Objects.equals(this.prodFile, reportObj.prodFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appLevel, format, id, name, prodFile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportObj {\n");
    sb.append("    appLevel: ").append(toIndentedString(appLevel)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prodFile: ").append(toIndentedString(prodFile)).append("\n");
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

