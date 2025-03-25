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
 * QueueObj
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class QueueObj {

  private String driver;

  private String id;

  private String name;

  private String prodFile;

  private String reportProdFile;

  private String use;

  public QueueObj driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Get driver
   * @return driver
  */
  
  @Schema(name = "driver", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("driver")
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public QueueObj id(String id) {
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

  public QueueObj name(String name) {
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

  public QueueObj prodFile(String prodFile) {
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

  public QueueObj reportProdFile(String reportProdFile) {
    this.reportProdFile = reportProdFile;
    return this;
  }

  /**
   * Get reportProdFile
   * @return reportProdFile
  */
  
  @Schema(name = "reportProdFile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reportProdFile")
  public String getReportProdFile() {
    return reportProdFile;
  }

  public void setReportProdFile(String reportProdFile) {
    this.reportProdFile = reportProdFile;
  }

  public QueueObj use(String use) {
    this.use = use;
    return this;
  }

  /**
   * Get use
   * @return use
  */
  
  @Schema(name = "use", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("use")
  public String getUse() {
    return use;
  }

  public void setUse(String use) {
    this.use = use;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueObj queueObj = (QueueObj) o;
    return Objects.equals(this.driver, queueObj.driver) &&
        Objects.equals(this.id, queueObj.id) &&
        Objects.equals(this.name, queueObj.name) &&
        Objects.equals(this.prodFile, queueObj.prodFile) &&
        Objects.equals(this.reportProdFile, queueObj.reportProdFile) &&
        Objects.equals(this.use, queueObj.use);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driver, id, name, prodFile, reportProdFile, use);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueObj {\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prodFile: ").append(toIndentedString(prodFile)).append("\n");
    sb.append("    reportProdFile: ").append(toIndentedString(reportProdFile)).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
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

