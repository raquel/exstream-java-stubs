package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.DatabaseConfig;
import org.openapitools.model.Environment;
import org.openapitools.model.ModelConfiguration;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Message
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:34:47.568105362Z[Europe/Lisbon]")
public class Message {

  private Environment environment;

  private DatabaseConfig database;

  private ModelConfiguration _configuration;

  private Integer auditLogId;

  public Message environment(Environment environment) {
    this.environment = environment;
    return this;
  }

  /**
   * Get environment
   * @return environment
  */
  @Valid 
  @Schema(name = "environment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("environment")
  public Environment getEnvironment() {
    return environment;
  }

  public void setEnvironment(Environment environment) {
    this.environment = environment;
  }

  public Message database(DatabaseConfig database) {
    this.database = database;
    return this;
  }

  /**
   * Get database
   * @return database
  */
  @Valid 
  @Schema(name = "database", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("database")
  public DatabaseConfig getDatabase() {
    return database;
  }

  public void setDatabase(DatabaseConfig database) {
    this.database = database;
  }

  public Message _configuration(ModelConfiguration _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * Get _configuration
   * @return _configuration
  */
  @Valid 
  @Schema(name = "configuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configuration")
  public ModelConfiguration getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(ModelConfiguration _configuration) {
    this._configuration = _configuration;
  }

  public Message auditLogId(Integer auditLogId) {
    this.auditLogId = auditLogId;
    return this;
  }

  /**
   * Get auditLogId
   * @return auditLogId
  */
  
  @Schema(name = "auditLogId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auditLogId")
  public Integer getAuditLogId() {
    return auditLogId;
  }

  public void setAuditLogId(Integer auditLogId) {
    this.auditLogId = auditLogId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.environment, message.environment) &&
        Objects.equals(this.database, message.database) &&
        Objects.equals(this._configuration, message._configuration) &&
        Objects.equals(this.auditLogId, message.auditLogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environment, database, _configuration, auditLogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    auditLogId: ").append(toIndentedString(auditLogId)).append("\n");
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

