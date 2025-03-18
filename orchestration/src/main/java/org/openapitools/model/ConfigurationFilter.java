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
 * ConfigurationFilter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:03:17.210646522Z[Europe/Lisbon]")
public class ConfigurationFilter {

  private String domainId;

  private String configType;

  private String configName;

  public ConfigurationFilter domainId(String domainId) {
    this.domainId = domainId;
    return this;
  }

  /**
   * Get domainId
   * @return domainId
  */
  
  @Schema(name = "domainId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("domainId")
  public String getDomainId() {
    return domainId;
  }

  public void setDomainId(String domainId) {
    this.domainId = domainId;
  }

  public ConfigurationFilter configType(String configType) {
    this.configType = configType;
    return this;
  }

  /**
   * Get configType
   * @return configType
  */
  
  @Schema(name = "configType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configType")
  public String getConfigType() {
    return configType;
  }

  public void setConfigType(String configType) {
    this.configType = configType;
  }

  public ConfigurationFilter configName(String configName) {
    this.configName = configName;
    return this;
  }

  /**
   * Get configName
   * @return configName
  */
  
  @Schema(name = "configName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configName")
  public String getConfigName() {
    return configName;
  }

  public void setConfigName(String configName) {
    this.configName = configName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationFilter configurationFilter = (ConfigurationFilter) o;
    return Objects.equals(this.domainId, configurationFilter.domainId) &&
        Objects.equals(this.configType, configurationFilter.configType) &&
        Objects.equals(this.configName, configurationFilter.configName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainId, configType, configName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationFilter {\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    configType: ").append(toIndentedString(configType)).append("\n");
    sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
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

