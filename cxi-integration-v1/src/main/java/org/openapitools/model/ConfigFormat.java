package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ConfigDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConfigFormat
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:34:47.568105362Z[Europe/Lisbon]")
public class ConfigFormat {

  private Boolean isActive;

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

  private ConfigDetails configDetails;

  private Boolean auditEnable;

  public ConfigFormat isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Get isActive
   * @return isActive
  */
  
  @Schema(name = "isActive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isActive")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public ConfigFormat configName(ConfigNameEnum configName) {
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

  public ConfigFormat configDetails(ConfigDetails configDetails) {
    this.configDetails = configDetails;
    return this;
  }

  /**
   * Get configDetails
   * @return configDetails
  */
  @Valid 
  @Schema(name = "configDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configDetails")
  public ConfigDetails getConfigDetails() {
    return configDetails;
  }

  public void setConfigDetails(ConfigDetails configDetails) {
    this.configDetails = configDetails;
  }

  public ConfigFormat auditEnable(Boolean auditEnable) {
    this.auditEnable = auditEnable;
    return this;
  }

  /**
   * Get auditEnable
   * @return auditEnable
  */
  
  @Schema(name = "auditEnable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auditEnable")
  public Boolean getAuditEnable() {
    return auditEnable;
  }

  public void setAuditEnable(Boolean auditEnable) {
    this.auditEnable = auditEnable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigFormat configFormat = (ConfigFormat) o;
    return Objects.equals(this.isActive, configFormat.isActive) &&
        Objects.equals(this.configName, configFormat.configName) &&
        Objects.equals(this.configDetails, configFormat.configDetails) &&
        Objects.equals(this.auditEnable, configFormat.auditEnable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isActive, configName, configDetails, auditEnable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigFormat {\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
    sb.append("    configDetails: ").append(toIndentedString(configDetails)).append("\n");
    sb.append("    auditEnable: ").append(toIndentedString(auditEnable)).append("\n");
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

