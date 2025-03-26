package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ProcessState
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:04:14.260450399Z[Europe/Lisbon]")
public class ProcessState {

  /**
   * Gets or Sets configName
   */
  public enum ConfigNameEnum {
    COVISINT("covisint"),
    
    CUSTOMMETADATA("custommetadata"),
    
    CLEANUP("cleanup"),
    
    UNKNOWN("unknown");

    private String value;

    ConfigNameEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ConfigNameEnum fromValue(String value) {
      for (ConfigNameEnum b : ConfigNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ConfigNameEnum configName;

  private Integer processingState;

  private String details;

  private Integer auditLogId;

  public ProcessState configName(ConfigNameEnum configName) {
    this.configName = configName;
    return this;
  }

  /**
   * Get configName
   * @return configName
  */
  
  @Schema(name = "configName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configName")
  public ConfigNameEnum getConfigName() {
    return configName;
  }

  public void setConfigName(ConfigNameEnum configName) {
    this.configName = configName;
  }

  public ProcessState processingState(Integer processingState) {
    this.processingState = processingState;
    return this;
  }

  /**
   * Get processingState
   * @return processingState
  */
  
  @Schema(name = "processingState", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processingState")
  public Integer getProcessingState() {
    return processingState;
  }

  public void setProcessingState(Integer processingState) {
    this.processingState = processingState;
  }

  public ProcessState details(String details) {
    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
  */
  
  @Schema(name = "details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("details")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public ProcessState auditLogId(Integer auditLogId) {
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
    ProcessState processState = (ProcessState) o;
    return Objects.equals(this.configName, processState.configName) &&
        Objects.equals(this.processingState, processState.processingState) &&
        Objects.equals(this.details, processState.details) &&
        Objects.equals(this.auditLogId, processState.auditLogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configName, processingState, details, auditLogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessState {\n");
    sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
    sb.append("    processingState: ").append(toIndentedString(processingState)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

