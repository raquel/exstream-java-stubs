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
 * Events
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:34:47.568105362Z[Europe/Lisbon]")
public class Events {

  private Long id;

  private Integer eventType;

  private String domainId;

  private String customMetadataId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime eventTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastUpdateTime;

  private Integer processingState;

  private String eventMetadata;

  private String customMetadata;

  public Events id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Events eventType(Integer eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Get eventType
   * @return eventType
  */
  
  @Schema(name = "eventType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventType")
  public Integer getEventType() {
    return eventType;
  }

  public void setEventType(Integer eventType) {
    this.eventType = eventType;
  }

  public Events domainId(String domainId) {
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

  public Events customMetadataId(String customMetadataId) {
    this.customMetadataId = customMetadataId;
    return this;
  }

  /**
   * Get customMetadataId
   * @return customMetadataId
  */
  
  @Schema(name = "customMetadataId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customMetadataId")
  public String getCustomMetadataId() {
    return customMetadataId;
  }

  public void setCustomMetadataId(String customMetadataId) {
    this.customMetadataId = customMetadataId;
  }

  public Events eventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * Get eventTime
   * @return eventTime
  */
  @Valid 
  @Schema(name = "eventTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventTime")
  public OffsetDateTime getEventTime() {
    return eventTime;
  }

  public void setEventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
  }

  public Events lastUpdateTime(OffsetDateTime lastUpdateTime) {
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

  public Events processingState(Integer processingState) {
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

  public Events eventMetadata(String eventMetadata) {
    this.eventMetadata = eventMetadata;
    return this;
  }

  /**
   * Get eventMetadata
   * @return eventMetadata
  */
  
  @Schema(name = "eventMetadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventMetadata")
  public String getEventMetadata() {
    return eventMetadata;
  }

  public void setEventMetadata(String eventMetadata) {
    this.eventMetadata = eventMetadata;
  }

  public Events customMetadata(String customMetadata) {
    this.customMetadata = customMetadata;
    return this;
  }

  /**
   * Get customMetadata
   * @return customMetadata
  */
  
  @Schema(name = "customMetadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customMetadata")
  public String getCustomMetadata() {
    return customMetadata;
  }

  public void setCustomMetadata(String customMetadata) {
    this.customMetadata = customMetadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Events events = (Events) o;
    return Objects.equals(this.id, events.id) &&
        Objects.equals(this.eventType, events.eventType) &&
        Objects.equals(this.domainId, events.domainId) &&
        Objects.equals(this.customMetadataId, events.customMetadataId) &&
        Objects.equals(this.eventTime, events.eventTime) &&
        Objects.equals(this.lastUpdateTime, events.lastUpdateTime) &&
        Objects.equals(this.processingState, events.processingState) &&
        Objects.equals(this.eventMetadata, events.eventMetadata) &&
        Objects.equals(this.customMetadata, events.customMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, eventType, domainId, customMetadataId, eventTime, lastUpdateTime, processingState, eventMetadata, customMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Events {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    customMetadataId: ").append(toIndentedString(customMetadataId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    processingState: ").append(toIndentedString(processingState)).append("\n");
    sb.append("    eventMetadata: ").append(toIndentedString(eventMetadata)).append("\n");
    sb.append("    customMetadata: ").append(toIndentedString(customMetadata)).append("\n");
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

