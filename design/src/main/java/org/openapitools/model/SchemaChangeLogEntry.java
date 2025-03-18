package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SchemaChangeLogEntry
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class SchemaChangeLogEntry {

  private String id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dateExecuted;

  private Integer orderExecuted;

  private String liquiBaseVersion;

  public SchemaChangeLogEntry id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SchemaChangeLogEntry dateExecuted(OffsetDateTime dateExecuted) {
    this.dateExecuted = dateExecuted;
    return this;
  }

  /**
   * Get dateExecuted
   * @return dateExecuted
  */
  @Valid 
  @Schema(name = "dateExecuted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateExecuted")
  public OffsetDateTime getDateExecuted() {
    return dateExecuted;
  }

  public void setDateExecuted(OffsetDateTime dateExecuted) {
    this.dateExecuted = dateExecuted;
  }

  public SchemaChangeLogEntry orderExecuted(Integer orderExecuted) {
    this.orderExecuted = orderExecuted;
    return this;
  }

  /**
   * Get orderExecuted
   * @return orderExecuted
  */
  
  @Schema(name = "orderExecuted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderExecuted")
  public Integer getOrderExecuted() {
    return orderExecuted;
  }

  public void setOrderExecuted(Integer orderExecuted) {
    this.orderExecuted = orderExecuted;
  }

  public SchemaChangeLogEntry liquiBaseVersion(String liquiBaseVersion) {
    this.liquiBaseVersion = liquiBaseVersion;
    return this;
  }

  /**
   * Get liquiBaseVersion
   * @return liquiBaseVersion
  */
  
  @Schema(name = "liquiBaseVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("liquiBaseVersion")
  public String getLiquiBaseVersion() {
    return liquiBaseVersion;
  }

  public void setLiquiBaseVersion(String liquiBaseVersion) {
    this.liquiBaseVersion = liquiBaseVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemaChangeLogEntry schemaChangeLogEntry = (SchemaChangeLogEntry) o;
    return Objects.equals(this.id, schemaChangeLogEntry.id) &&
        Objects.equals(this.dateExecuted, schemaChangeLogEntry.dateExecuted) &&
        Objects.equals(this.orderExecuted, schemaChangeLogEntry.orderExecuted) &&
        Objects.equals(this.liquiBaseVersion, schemaChangeLogEntry.liquiBaseVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateExecuted, orderExecuted, liquiBaseVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaChangeLogEntry {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateExecuted: ").append(toIndentedString(dateExecuted)).append("\n");
    sb.append("    orderExecuted: ").append(toIndentedString(orderExecuted)).append("\n");
    sb.append("    liquiBaseVersion: ").append(toIndentedString(liquiBaseVersion)).append("\n");
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

