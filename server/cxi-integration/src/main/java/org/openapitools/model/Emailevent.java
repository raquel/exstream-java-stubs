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
 * Emailevent
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:04:14.260450399Z[Europe/Lisbon]")
public class Emailevent {

  private Long eventId;

  private String connectorType;

  private String custMetadataId;

  private String domainId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime eventDate;

  private String eventType;

  private String jobId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastUpdateTime;

  private Integer processingState;

  private String tenantId;

  private String trackerId;

  private String eventRef;

  private String eventStatus;

  public Emailevent eventId(Long eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Get eventId
   * @return eventId
  */
  
  @Schema(name = "eventId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventId")
  public Long getEventId() {
    return eventId;
  }

  public void setEventId(Long eventId) {
    this.eventId = eventId;
  }

  public Emailevent connectorType(String connectorType) {
    this.connectorType = connectorType;
    return this;
  }

  /**
   * Get connectorType
   * @return connectorType
  */
  
  @Schema(name = "connectorType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectorType")
  public String getConnectorType() {
    return connectorType;
  }

  public void setConnectorType(String connectorType) {
    this.connectorType = connectorType;
  }

  public Emailevent custMetadataId(String custMetadataId) {
    this.custMetadataId = custMetadataId;
    return this;
  }

  /**
   * Get custMetadataId
   * @return custMetadataId
  */
  
  @Schema(name = "custMetadataId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custMetadataId")
  public String getCustMetadataId() {
    return custMetadataId;
  }

  public void setCustMetadataId(String custMetadataId) {
    this.custMetadataId = custMetadataId;
  }

  public Emailevent domainId(String domainId) {
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

  public Emailevent eventDate(OffsetDateTime eventDate) {
    this.eventDate = eventDate;
    return this;
  }

  /**
   * Get eventDate
   * @return eventDate
  */
  @Valid 
  @Schema(name = "eventDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventDate")
  public OffsetDateTime getEventDate() {
    return eventDate;
  }

  public void setEventDate(OffsetDateTime eventDate) {
    this.eventDate = eventDate;
  }

  public Emailevent eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Get eventType
   * @return eventType
  */
  
  @Schema(name = "eventType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventType")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public Emailevent jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * Get jobId
   * @return jobId
  */
  
  @Schema(name = "jobId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobId")
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  public Emailevent lastUpdateTime(OffsetDateTime lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

  /**
   * Get lastUpdateTime
   * @return lastUpdateTime
  */
  @Valid 
  @Schema(name = "lastUpdateTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastUpdateTime")
  public OffsetDateTime getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(OffsetDateTime lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public Emailevent processingState(Integer processingState) {
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

  public Emailevent tenantId(String tenantId) {
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

  public Emailevent trackerId(String trackerId) {
    this.trackerId = trackerId;
    return this;
  }

  /**
   * Get trackerId
   * @return trackerId
  */
  
  @Schema(name = "trackerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trackerId")
  public String getTrackerId() {
    return trackerId;
  }

  public void setTrackerId(String trackerId) {
    this.trackerId = trackerId;
  }

  public Emailevent eventRef(String eventRef) {
    this.eventRef = eventRef;
    return this;
  }

  /**
   * Get eventRef
   * @return eventRef
  */
  
  @Schema(name = "eventRef", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventRef")
  public String getEventRef() {
    return eventRef;
  }

  public void setEventRef(String eventRef) {
    this.eventRef = eventRef;
  }

  public Emailevent eventStatus(String eventStatus) {
    this.eventStatus = eventStatus;
    return this;
  }

  /**
   * Get eventStatus
   * @return eventStatus
  */
  
  @Schema(name = "eventStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventStatus")
  public String getEventStatus() {
    return eventStatus;
  }

  public void setEventStatus(String eventStatus) {
    this.eventStatus = eventStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Emailevent emailevent = (Emailevent) o;
    return Objects.equals(this.eventId, emailevent.eventId) &&
        Objects.equals(this.connectorType, emailevent.connectorType) &&
        Objects.equals(this.custMetadataId, emailevent.custMetadataId) &&
        Objects.equals(this.domainId, emailevent.domainId) &&
        Objects.equals(this.eventDate, emailevent.eventDate) &&
        Objects.equals(this.eventType, emailevent.eventType) &&
        Objects.equals(this.jobId, emailevent.jobId) &&
        Objects.equals(this.lastUpdateTime, emailevent.lastUpdateTime) &&
        Objects.equals(this.processingState, emailevent.processingState) &&
        Objects.equals(this.tenantId, emailevent.tenantId) &&
        Objects.equals(this.trackerId, emailevent.trackerId) &&
        Objects.equals(this.eventRef, emailevent.eventRef) &&
        Objects.equals(this.eventStatus, emailevent.eventStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, connectorType, custMetadataId, domainId, eventDate, eventType, jobId, lastUpdateTime, processingState, tenantId, trackerId, eventRef, eventStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Emailevent {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    connectorType: ").append(toIndentedString(connectorType)).append("\n");
    sb.append("    custMetadataId: ").append(toIndentedString(custMetadataId)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    processingState: ").append(toIndentedString(processingState)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    trackerId: ").append(toIndentedString(trackerId)).append("\n");
    sb.append("    eventRef: ").append(toIndentedString(eventRef)).append("\n");
    sb.append("    eventStatus: ").append(toIndentedString(eventStatus)).append("\n");
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

