package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EditableConfig
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:04:14.260450399Z[Europe/Lisbon]")
public class EditableConfig {

  private ConfigType configType;

  private Boolean enabled;

  public EditableConfig configType(ConfigType configType) {
    this.configType = configType;
    return this;
  }

  /**
   * Get configType
   * @return configType
  */
  @Valid 
  @Schema(name = "configType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configType")
  public ConfigType getConfigType() {
    return configType;
  }

  public void setConfigType(ConfigType configType) {
    this.configType = configType;
  }

  public EditableConfig enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
  */
  
  @Schema(name = "enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditableConfig editableConfig = (EditableConfig) o;
    return Objects.equals(this.configType, editableConfig.configType) &&
        Objects.equals(this.enabled, editableConfig.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configType, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditableConfig {\n");
    sb.append("    configType: ").append(toIndentedString(configType)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

