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
 * ConfigType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:04:14.260450399Z[Europe/Lisbon]")
public class ConfigType {

  private Integer id;

  private String configName;

  private Boolean autoConfig;

  private String createdby;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime creationtime;

  private String lastupdatedby;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastupdatedtime;

  public ConfigType id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ConfigType configName(String configName) {
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

  public ConfigType autoConfig(Boolean autoConfig) {
    this.autoConfig = autoConfig;
    return this;
  }

  /**
   * Get autoConfig
   * @return autoConfig
  */
  
  @Schema(name = "autoConfig", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autoConfig")
  public Boolean getAutoConfig() {
    return autoConfig;
  }

  public void setAutoConfig(Boolean autoConfig) {
    this.autoConfig = autoConfig;
  }

  public ConfigType createdby(String createdby) {
    this.createdby = createdby;
    return this;
  }

  /**
   * Get createdby
   * @return createdby
  */
  
  @Schema(name = "createdby", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdby")
  public String getCreatedby() {
    return createdby;
  }

  public void setCreatedby(String createdby) {
    this.createdby = createdby;
  }

  public ConfigType creationtime(OffsetDateTime creationtime) {
    this.creationtime = creationtime;
    return this;
  }

  /**
   * Get creationtime
   * @return creationtime
  */
  @Valid 
  @Schema(name = "creationtime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationtime")
  public OffsetDateTime getCreationtime() {
    return creationtime;
  }

  public void setCreationtime(OffsetDateTime creationtime) {
    this.creationtime = creationtime;
  }

  public ConfigType lastupdatedby(String lastupdatedby) {
    this.lastupdatedby = lastupdatedby;
    return this;
  }

  /**
   * Get lastupdatedby
   * @return lastupdatedby
  */
  
  @Schema(name = "lastupdatedby", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastupdatedby")
  public String getLastupdatedby() {
    return lastupdatedby;
  }

  public void setLastupdatedby(String lastupdatedby) {
    this.lastupdatedby = lastupdatedby;
  }

  public ConfigType lastupdatedtime(OffsetDateTime lastupdatedtime) {
    this.lastupdatedtime = lastupdatedtime;
    return this;
  }

  /**
   * Get lastupdatedtime
   * @return lastupdatedtime
  */
  @Valid 
  @Schema(name = "lastupdatedtime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastupdatedtime")
  public OffsetDateTime getLastupdatedtime() {
    return lastupdatedtime;
  }

  public void setLastupdatedtime(OffsetDateTime lastupdatedtime) {
    this.lastupdatedtime = lastupdatedtime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigType configType = (ConfigType) o;
    return Objects.equals(this.id, configType.id) &&
        Objects.equals(this.configName, configType.configName) &&
        Objects.equals(this.autoConfig, configType.autoConfig) &&
        Objects.equals(this.createdby, configType.createdby) &&
        Objects.equals(this.creationtime, configType.creationtime) &&
        Objects.equals(this.lastupdatedby, configType.lastupdatedby) &&
        Objects.equals(this.lastupdatedtime, configType.lastupdatedtime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, configName, autoConfig, createdby, creationtime, lastupdatedby, lastupdatedtime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigType {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
    sb.append("    autoConfig: ").append(toIndentedString(autoConfig)).append("\n");
    sb.append("    createdby: ").append(toIndentedString(createdby)).append("\n");
    sb.append("    creationtime: ").append(toIndentedString(creationtime)).append("\n");
    sb.append("    lastupdatedby: ").append(toIndentedString(lastupdatedby)).append("\n");
    sb.append("    lastupdatedtime: ").append(toIndentedString(lastupdatedtime)).append("\n");
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

