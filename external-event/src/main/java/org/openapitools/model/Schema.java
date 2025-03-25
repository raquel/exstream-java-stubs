package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.SchemaChangeLogEntry;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Schema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:39:30.497323016Z[Europe/Lisbon]")
public class Schema {

  private String schemaId;

  private SchemaChangeLogEntry latestSchemaChangeLogEntry;

  private Boolean schemaMissingFromDatabase;

  public Schema schemaId(String schemaId) {
    this.schemaId = schemaId;
    return this;
  }

  /**
   * Get schemaId
   * @return schemaId
  */
  
  @Schema(name = "schemaId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schemaId")
  public String getSchemaId() {
    return schemaId;
  }

  public void setSchemaId(String schemaId) {
    this.schemaId = schemaId;
  }

  public Schema latestSchemaChangeLogEntry(SchemaChangeLogEntry latestSchemaChangeLogEntry) {
    this.latestSchemaChangeLogEntry = latestSchemaChangeLogEntry;
    return this;
  }

  /**
   * Get latestSchemaChangeLogEntry
   * @return latestSchemaChangeLogEntry
  */
  @Valid 
  @Schema(name = "latestSchemaChangeLogEntry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latestSchemaChangeLogEntry")
  public SchemaChangeLogEntry getLatestSchemaChangeLogEntry() {
    return latestSchemaChangeLogEntry;
  }

  public void setLatestSchemaChangeLogEntry(SchemaChangeLogEntry latestSchemaChangeLogEntry) {
    this.latestSchemaChangeLogEntry = latestSchemaChangeLogEntry;
  }

  public Schema schemaMissingFromDatabase(Boolean schemaMissingFromDatabase) {
    this.schemaMissingFromDatabase = schemaMissingFromDatabase;
    return this;
  }

  /**
   * Get schemaMissingFromDatabase
   * @return schemaMissingFromDatabase
  */
  
  @Schema(name = "schemaMissingFromDatabase", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schemaMissingFromDatabase")
  public Boolean getSchemaMissingFromDatabase() {
    return schemaMissingFromDatabase;
  }

  public void setSchemaMissingFromDatabase(Boolean schemaMissingFromDatabase) {
    this.schemaMissingFromDatabase = schemaMissingFromDatabase;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schema schema = (Schema) o;
    return Objects.equals(this.schemaId, schema.schemaId) &&
        Objects.equals(this.latestSchemaChangeLogEntry, schema.latestSchemaChangeLogEntry) &&
        Objects.equals(this.schemaMissingFromDatabase, schema.schemaMissingFromDatabase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaId, latestSchemaChangeLogEntry, schemaMissingFromDatabase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schema {\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    latestSchemaChangeLogEntry: ").append(toIndentedString(latestSchemaChangeLogEntry)).append("\n");
    sb.append("    schemaMissingFromDatabase: ").append(toIndentedString(schemaMissingFromDatabase)).append("\n");
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

