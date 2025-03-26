package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ModelConfiguration
 */

@JsonTypeName("Configuration")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:34:47.568105362Z[Europe/Lisbon]")
public class ModelConfiguration {

  /**
   * Gets or Sets configType
   */
  public enum ConfigTypeEnum {
    COVISINT("covisint"),
    
    CUSTOMMETADATA("custommetadata"),
    
    CLEANUP("cleanup"),
    
    UNKNOWN("unknown");

    private String value;

    ConfigTypeEnum(String value) {
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
    public static ConfigTypeEnum fromValue(String value) {
      for (ConfigTypeEnum b : ConfigTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ConfigTypeEnum configType;

  private Object details;

  public ModelConfiguration configType(ConfigTypeEnum configType) {
    this.configType = configType;
    return this;
  }

  /**
   * Get configType
   * @return configType
  */
  
  @Schema(name = "configType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configType")
  public ConfigTypeEnum getConfigType() {
    return configType;
  }

  public void setConfigType(ConfigTypeEnum configType) {
    this.configType = configType;
  }

  public ModelConfiguration details(Object details) {
    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
  */
  
  @Schema(name = "details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("details")
  public Object getDetails() {
    return details;
  }

  public void setDetails(Object details) {
    this.details = details;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelConfiguration _configuration = (ModelConfiguration) o;
    return Objects.equals(this.configType, _configuration.configType) &&
        Objects.equals(this.details, _configuration.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configType, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelConfiguration {\n");
    sb.append("    configType: ").append(toIndentedString(configType)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

