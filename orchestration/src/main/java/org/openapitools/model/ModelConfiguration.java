package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.PropertyValue;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:33:52.003808146Z[Europe/Lisbon]")
public class ModelConfiguration {

  private String domainId;

  private String configType;

  private String configName;

  @Valid
  private Map<String, PropertyValue> configDetails = new HashMap<>();

  private Boolean active;

  public ModelConfiguration domainId(String domainId) {
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

  public ModelConfiguration configType(String configType) {
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

  public ModelConfiguration configName(String configName) {
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

  public ModelConfiguration configDetails(Map<String, PropertyValue> configDetails) {
    this.configDetails = configDetails;
    return this;
  }

  public ModelConfiguration putConfigDetailsItem(String key, PropertyValue configDetailsItem) {
    if (this.configDetails == null) {
      this.configDetails = new HashMap<>();
    }
    this.configDetails.put(key, configDetailsItem);
    return this;
  }

  /**
   * Get configDetails
   * @return configDetails
  */
  @Valid 
  @Schema(name = "configDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configDetails")
  public Map<String, PropertyValue> getConfigDetails() {
    return configDetails;
  }

  public void setConfigDetails(Map<String, PropertyValue> configDetails) {
    this.configDetails = configDetails;
  }

  public ModelConfiguration active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
  */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
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
    return Objects.equals(this.domainId, _configuration.domainId) &&
        Objects.equals(this.configType, _configuration.configType) &&
        Objects.equals(this.configName, _configuration.configName) &&
        Objects.equals(this.configDetails, _configuration.configDetails) &&
        Objects.equals(this.active, _configuration.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainId, configType, configName, configDetails, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelConfiguration {\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    configType: ").append(toIndentedString(configType)).append("\n");
    sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
    sb.append("    configDetails: ").append(toIndentedString(configDetails)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

