package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * JobFilter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:33:52.003808146Z[Europe/Lisbon]")
public class JobFilter {

  @Valid
  private List<UUID> ids;

  private String channel;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDateStart;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDateEnd;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDateStart;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDateEnd;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expiringDateStart;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expiringDateEnd;

  private String domainId;

  /**
   * Gets or Sets statuses
   */
  public enum StatusesEnum {
    CANCELED("canceled"),
    
    COMPLETE("complete"),
    
    DELETED("deleted"),
    
    STARTED("started"),
    
    WAITING("waiting"),
    
    HOLDING("holding"),
    
    ERROR("error"),
    
    UNINITIALIZED("uninitialized");

    private String value;

    StatusesEnum(String value) {
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
    public static StatusesEnum fromValue(String value) {
      for (StatusesEnum b : StatusesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<StatusesEnum> statuses;

  /**
   * Gets or Sets mode
   */
  public enum ModeEnum {
    BATCH("BATCH"),
    
    ONDEMAND("ONDEMAND");

    private String value;

    ModeEnum(String value) {
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
    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ModeEnum mode;

  private String externalId;

  private String triggeredBy;

  @Valid
  private List<UUID> aggregatedFMCSnapshotIds;

  /**
   * Gets or Sets flowModelTypes
   */
  public enum FlowModelTypesEnum {
    COMMUNICATION("COMMUNICATION"),
    
    ALERT("ALERT"),
    
    NOTIFICATION("NOTIFICATION");

    private String value;

    FlowModelTypesEnum(String value) {
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
    public static FlowModelTypesEnum fromValue(String value) {
      for (FlowModelTypesEnum b : FlowModelTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<FlowModelTypesEnum> flowModelTypes;

  public JobFilter ids(List<UUID> ids) {
    this.ids = ids;
    return this;
  }

  public JobFilter addIdsItem(UUID idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

  /**
   * Get ids
   * @return ids
  */
  @Valid 
  @Schema(name = "ids", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ids")
  public List<UUID> getIds() {
    return ids;
  }

  public void setIds(List<UUID> ids) {
    this.ids = ids;
  }

  public JobFilter channel(String channel) {
    this.channel = channel;
    return this;
  }

  /**
   * Get channel
   * @return channel
  */
  @Size(min = 0, max = 255) 
  @Schema(name = "channel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("channel")
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public JobFilter startDateStart(OffsetDateTime startDateStart) {
    this.startDateStart = startDateStart;
    return this;
  }

  /**
   * Get startDateStart
   * @return startDateStart
  */
  @Valid 
  @Schema(name = "startDateStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDateStart")
  public OffsetDateTime getStartDateStart() {
    return startDateStart;
  }

  public void setStartDateStart(OffsetDateTime startDateStart) {
    this.startDateStart = startDateStart;
  }

  public JobFilter startDateEnd(OffsetDateTime startDateEnd) {
    this.startDateEnd = startDateEnd;
    return this;
  }

  /**
   * Get startDateEnd
   * @return startDateEnd
  */
  @Valid 
  @Schema(name = "startDateEnd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDateEnd")
  public OffsetDateTime getStartDateEnd() {
    return startDateEnd;
  }

  public void setStartDateEnd(OffsetDateTime startDateEnd) {
    this.startDateEnd = startDateEnd;
  }

  public JobFilter endDateStart(OffsetDateTime endDateStart) {
    this.endDateStart = endDateStart;
    return this;
  }

  /**
   * Get endDateStart
   * @return endDateStart
  */
  @Valid 
  @Schema(name = "endDateStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDateStart")
  public OffsetDateTime getEndDateStart() {
    return endDateStart;
  }

  public void setEndDateStart(OffsetDateTime endDateStart) {
    this.endDateStart = endDateStart;
  }

  public JobFilter endDateEnd(OffsetDateTime endDateEnd) {
    this.endDateEnd = endDateEnd;
    return this;
  }

  /**
   * Get endDateEnd
   * @return endDateEnd
  */
  @Valid 
  @Schema(name = "endDateEnd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDateEnd")
  public OffsetDateTime getEndDateEnd() {
    return endDateEnd;
  }

  public void setEndDateEnd(OffsetDateTime endDateEnd) {
    this.endDateEnd = endDateEnd;
  }

  public JobFilter expiringDateStart(OffsetDateTime expiringDateStart) {
    this.expiringDateStart = expiringDateStart;
    return this;
  }

  /**
   * Get expiringDateStart
   * @return expiringDateStart
  */
  @Valid 
  @Schema(name = "expiringDateStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expiringDateStart")
  public OffsetDateTime getExpiringDateStart() {
    return expiringDateStart;
  }

  public void setExpiringDateStart(OffsetDateTime expiringDateStart) {
    this.expiringDateStart = expiringDateStart;
  }

  public JobFilter expiringDateEnd(OffsetDateTime expiringDateEnd) {
    this.expiringDateEnd = expiringDateEnd;
    return this;
  }

  /**
   * Get expiringDateEnd
   * @return expiringDateEnd
  */
  @Valid 
  @Schema(name = "expiringDateEnd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expiringDateEnd")
  public OffsetDateTime getExpiringDateEnd() {
    return expiringDateEnd;
  }

  public void setExpiringDateEnd(OffsetDateTime expiringDateEnd) {
    this.expiringDateEnd = expiringDateEnd;
  }

  public JobFilter domainId(String domainId) {
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

  public JobFilter statuses(List<StatusesEnum> statuses) {
    this.statuses = statuses;
    return this;
  }

  public JobFilter addStatusesItem(StatusesEnum statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

  /**
   * Get statuses
   * @return statuses
  */
  
  @Schema(name = "statuses", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statuses")
  public List<StatusesEnum> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<StatusesEnum> statuses) {
    this.statuses = statuses;
  }

  public JobFilter mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
  */
  
  @Schema(name = "mode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mode")
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public JobFilter externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
  */
  @Size(min = 0, max = 400) 
  @Schema(name = "externalId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public JobFilter triggeredBy(String triggeredBy) {
    this.triggeredBy = triggeredBy;
    return this;
  }

  /**
   * Get triggeredBy
   * @return triggeredBy
  */
  @Size(min = 0, max = 400) 
  @Schema(name = "triggeredBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("triggeredBy")
  public String getTriggeredBy() {
    return triggeredBy;
  }

  public void setTriggeredBy(String triggeredBy) {
    this.triggeredBy = triggeredBy;
  }

  public JobFilter aggregatedFMCSnapshotIds(List<UUID> aggregatedFMCSnapshotIds) {
    this.aggregatedFMCSnapshotIds = aggregatedFMCSnapshotIds;
    return this;
  }

  public JobFilter addAggregatedFMCSnapshotIdsItem(UUID aggregatedFMCSnapshotIdsItem) {
    if (this.aggregatedFMCSnapshotIds == null) {
      this.aggregatedFMCSnapshotIds = new ArrayList<>();
    }
    this.aggregatedFMCSnapshotIds.add(aggregatedFMCSnapshotIdsItem);
    return this;
  }

  /**
   * Get aggregatedFMCSnapshotIds
   * @return aggregatedFMCSnapshotIds
  */
  @Valid 
  @Schema(name = "aggregatedFMCSnapshotIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aggregatedFMCSnapshotIds")
  public List<UUID> getAggregatedFMCSnapshotIds() {
    return aggregatedFMCSnapshotIds;
  }

  public void setAggregatedFMCSnapshotIds(List<UUID> aggregatedFMCSnapshotIds) {
    this.aggregatedFMCSnapshotIds = aggregatedFMCSnapshotIds;
  }

  public JobFilter flowModelTypes(List<FlowModelTypesEnum> flowModelTypes) {
    this.flowModelTypes = flowModelTypes;
    return this;
  }

  public JobFilter addFlowModelTypesItem(FlowModelTypesEnum flowModelTypesItem) {
    if (this.flowModelTypes == null) {
      this.flowModelTypes = new ArrayList<>();
    }
    this.flowModelTypes.add(flowModelTypesItem);
    return this;
  }

  /**
   * Get flowModelTypes
   * @return flowModelTypes
  */
  
  @Schema(name = "flowModelTypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowModelTypes")
  public List<FlowModelTypesEnum> getFlowModelTypes() {
    return flowModelTypes;
  }

  public void setFlowModelTypes(List<FlowModelTypesEnum> flowModelTypes) {
    this.flowModelTypes = flowModelTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobFilter jobFilter = (JobFilter) o;
    return Objects.equals(this.ids, jobFilter.ids) &&
        Objects.equals(this.channel, jobFilter.channel) &&
        Objects.equals(this.startDateStart, jobFilter.startDateStart) &&
        Objects.equals(this.startDateEnd, jobFilter.startDateEnd) &&
        Objects.equals(this.endDateStart, jobFilter.endDateStart) &&
        Objects.equals(this.endDateEnd, jobFilter.endDateEnd) &&
        Objects.equals(this.expiringDateStart, jobFilter.expiringDateStart) &&
        Objects.equals(this.expiringDateEnd, jobFilter.expiringDateEnd) &&
        Objects.equals(this.domainId, jobFilter.domainId) &&
        Objects.equals(this.statuses, jobFilter.statuses) &&
        Objects.equals(this.mode, jobFilter.mode) &&
        Objects.equals(this.externalId, jobFilter.externalId) &&
        Objects.equals(this.triggeredBy, jobFilter.triggeredBy) &&
        Objects.equals(this.aggregatedFMCSnapshotIds, jobFilter.aggregatedFMCSnapshotIds) &&
        Objects.equals(this.flowModelTypes, jobFilter.flowModelTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, channel, startDateStart, startDateEnd, endDateStart, endDateEnd, expiringDateStart, expiringDateEnd, domainId, statuses, mode, externalId, triggeredBy, aggregatedFMCSnapshotIds, flowModelTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobFilter {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    startDateStart: ").append(toIndentedString(startDateStart)).append("\n");
    sb.append("    startDateEnd: ").append(toIndentedString(startDateEnd)).append("\n");
    sb.append("    endDateStart: ").append(toIndentedString(endDateStart)).append("\n");
    sb.append("    endDateEnd: ").append(toIndentedString(endDateEnd)).append("\n");
    sb.append("    expiringDateStart: ").append(toIndentedString(expiringDateStart)).append("\n");
    sb.append("    expiringDateEnd: ").append(toIndentedString(expiringDateEnd)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    triggeredBy: ").append(toIndentedString(triggeredBy)).append("\n");
    sb.append("    aggregatedFMCSnapshotIds: ").append(toIndentedString(aggregatedFMCSnapshotIds)).append("\n");
    sb.append("    flowModelTypes: ").append(toIndentedString(flowModelTypes)).append("\n");
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

