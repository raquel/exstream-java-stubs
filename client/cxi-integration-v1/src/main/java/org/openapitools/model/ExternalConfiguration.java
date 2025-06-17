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
 * ExternalConfiguration
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:34:47.568105362Z[Europe/Lisbon]")
public class ExternalConfiguration {

  private String id;

  private String domainId;

  private String tenantId;

  private Boolean isActive;

  private Integer processingState;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastProcessDate;

  private String configType;

  private Object configDetails;

  private Boolean auditEnable;

  public ExternalConfiguration id(String id) {
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

  public ExternalConfiguration domainId(String domainId) {
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

  public ExternalConfiguration tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
  */
  
  @Schema(name = "tenantId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public ExternalConfiguration isActive(Boolean isActive) {
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

  public ExternalConfiguration processingState(Integer processingState) {
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

  public ExternalConfiguration lastProcessDate(OffsetDateTime lastProcessDate) {
    this.lastProcessDate = lastProcessDate;
    return this;
  }

  /**
   * Get lastProcessDate
   * @return lastProcessDate
  */
  @Valid 
  @Schema(name = "lastProcessDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastProcessDate")
  public OffsetDateTime getLastProcessDate() {
    return lastProcessDate;
  }

  public void setLastProcessDate(OffsetDateTime lastProcessDate) {
    this.lastProcessDate = lastProcessDate;
  }

  public ExternalConfiguration configType(String configType) {
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

  public ExternalConfiguration configDetails(Object configDetails) {
    this.configDetails = configDetails;
    return this;
  }

  /**
   * Get configDetails
   * @return configDetails
  */
  
  @Schema(name = "configDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configDetails")
  public Object getConfigDetails() {
    return configDetails;
  }

  public void setConfigDetails(Object configDetails) {
    this.configDetails = configDetails;
  }

  public ExternalConfiguration auditEnable(Boolean auditEnable) {
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
    ExternalConfiguration externalConfiguration = (ExternalConfiguration) o;
    return Objects.equals(this.id, externalConfiguration.id) &&
        Objects.equals(this.domainId, externalConfiguration.domainId) &&
        Objects.equals(this.tenantId, externalConfiguration.tenantId) &&
        Objects.equals(this.isActive, externalConfiguration.isActive) &&
        Objects.equals(this.processingState, externalConfiguration.processingState) &&
        Objects.equals(this.lastProcessDate, externalConfiguration.lastProcessDate) &&
        Objects.equals(this.configType, externalConfiguration.configType) &&
        Objects.equals(this.configDetails, externalConfiguration.configDetails) &&
        Objects.equals(this.auditEnable, externalConfiguration.auditEnable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, domainId, tenantId, isActive, processingState, lastProcessDate, configType, configDetails, auditEnable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalConfiguration {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    processingState: ").append(toIndentedString(processingState)).append("\n");
    sb.append("    lastProcessDate: ").append(toIndentedString(lastProcessDate)).append("\n");
    sb.append("    configType: ").append(toIndentedString(configType)).append("\n");
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

