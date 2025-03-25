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
 * FlowInstanceFilter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:33:52.003808146Z[Europe/Lisbon]")
public class FlowInstanceFilter {

  @Valid
  private List<UUID> ids;

  @Valid
  private List<UUID> flowModelSnapshotIds;

  @Deprecated
  private UUID flowModelId;

  @Valid
  private List<UUID> flowModelIds;

  private UUID jobId;

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

  private String externalId;

  /**
   * Gets or Sets statuses
   */
  public enum StatusesEnum {
    CANCELED("canceled"),
    
    STARTED("started"),
    
    COMPLETE("complete"),
    
    WAITING("waiting"),
    
    HOLDING("holding"),
    
    ERROR("error"),
    
    FINISHING("finishing");

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

  private Boolean executingLongRunningOp;

  public FlowInstanceFilter ids(List<UUID> ids) {
    this.ids = ids;
    return this;
  }

  public FlowInstanceFilter addIdsItem(UUID idsItem) {
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

  public FlowInstanceFilter flowModelSnapshotIds(List<UUID> flowModelSnapshotIds) {
    this.flowModelSnapshotIds = flowModelSnapshotIds;
    return this;
  }

  public FlowInstanceFilter addFlowModelSnapshotIdsItem(UUID flowModelSnapshotIdsItem) {
    if (this.flowModelSnapshotIds == null) {
      this.flowModelSnapshotIds = new ArrayList<>();
    }
    this.flowModelSnapshotIds.add(flowModelSnapshotIdsItem);
    return this;
  }

  /**
   * Get flowModelSnapshotIds
   * @return flowModelSnapshotIds
  */
  @Valid 
  @Schema(name = "flowModelSnapshotIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowModelSnapshotIds")
  public List<UUID> getFlowModelSnapshotIds() {
    return flowModelSnapshotIds;
  }

  public void setFlowModelSnapshotIds(List<UUID> flowModelSnapshotIds) {
    this.flowModelSnapshotIds = flowModelSnapshotIds;
  }

  public FlowInstanceFilter flowModelId(UUID flowModelId) {
    this.flowModelId = flowModelId;
    return this;
  }

  /**
   * Get flowModelId
   * @return flowModelId
   * @deprecated
  */
  @Valid 
  @Schema(name = "flowModelId", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowModelId")
  @Deprecated
  public UUID getFlowModelId() {
    return flowModelId;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setFlowModelId(UUID flowModelId) {
    this.flowModelId = flowModelId;
  }

  public FlowInstanceFilter flowModelIds(List<UUID> flowModelIds) {
    this.flowModelIds = flowModelIds;
    return this;
  }

  public FlowInstanceFilter addFlowModelIdsItem(UUID flowModelIdsItem) {
    if (this.flowModelIds == null) {
      this.flowModelIds = new ArrayList<>();
    }
    this.flowModelIds.add(flowModelIdsItem);
    return this;
  }

  /**
   * Get flowModelIds
   * @return flowModelIds
  */
  @Valid 
  @Schema(name = "flowModelIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowModelIds")
  public List<UUID> getFlowModelIds() {
    return flowModelIds;
  }

  public void setFlowModelIds(List<UUID> flowModelIds) {
    this.flowModelIds = flowModelIds;
  }

  public FlowInstanceFilter jobId(UUID jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * Get jobId
   * @return jobId
  */
  @Valid 
  @Schema(name = "jobId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobId")
  public UUID getJobId() {
    return jobId;
  }

  public void setJobId(UUID jobId) {
    this.jobId = jobId;
  }

  public FlowInstanceFilter startDateStart(OffsetDateTime startDateStart) {
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

  public FlowInstanceFilter startDateEnd(OffsetDateTime startDateEnd) {
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

  public FlowInstanceFilter endDateStart(OffsetDateTime endDateStart) {
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

  public FlowInstanceFilter endDateEnd(OffsetDateTime endDateEnd) {
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

  public FlowInstanceFilter expiringDateStart(OffsetDateTime expiringDateStart) {
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

  public FlowInstanceFilter expiringDateEnd(OffsetDateTime expiringDateEnd) {
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

  public FlowInstanceFilter domainId(String domainId) {
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

  public FlowInstanceFilter externalId(String externalId) {
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

  public FlowInstanceFilter statuses(List<StatusesEnum> statuses) {
    this.statuses = statuses;
    return this;
  }

  public FlowInstanceFilter addStatusesItem(StatusesEnum statusesItem) {
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

  public FlowInstanceFilter flowModelTypes(List<FlowModelTypesEnum> flowModelTypes) {
    this.flowModelTypes = flowModelTypes;
    return this;
  }

  public FlowInstanceFilter addFlowModelTypesItem(FlowModelTypesEnum flowModelTypesItem) {
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

  public FlowInstanceFilter executingLongRunningOp(Boolean executingLongRunningOp) {
    this.executingLongRunningOp = executingLongRunningOp;
    return this;
  }

  /**
   * Get executingLongRunningOp
   * @return executingLongRunningOp
  */
  
  @Schema(name = "executingLongRunningOp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executingLongRunningOp")
  public Boolean getExecutingLongRunningOp() {
    return executingLongRunningOp;
  }

  public void setExecutingLongRunningOp(Boolean executingLongRunningOp) {
    this.executingLongRunningOp = executingLongRunningOp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowInstanceFilter flowInstanceFilter = (FlowInstanceFilter) o;
    return Objects.equals(this.ids, flowInstanceFilter.ids) &&
        Objects.equals(this.flowModelSnapshotIds, flowInstanceFilter.flowModelSnapshotIds) &&
        Objects.equals(this.flowModelId, flowInstanceFilter.flowModelId) &&
        Objects.equals(this.flowModelIds, flowInstanceFilter.flowModelIds) &&
        Objects.equals(this.jobId, flowInstanceFilter.jobId) &&
        Objects.equals(this.startDateStart, flowInstanceFilter.startDateStart) &&
        Objects.equals(this.startDateEnd, flowInstanceFilter.startDateEnd) &&
        Objects.equals(this.endDateStart, flowInstanceFilter.endDateStart) &&
        Objects.equals(this.endDateEnd, flowInstanceFilter.endDateEnd) &&
        Objects.equals(this.expiringDateStart, flowInstanceFilter.expiringDateStart) &&
        Objects.equals(this.expiringDateEnd, flowInstanceFilter.expiringDateEnd) &&
        Objects.equals(this.domainId, flowInstanceFilter.domainId) &&
        Objects.equals(this.externalId, flowInstanceFilter.externalId) &&
        Objects.equals(this.statuses, flowInstanceFilter.statuses) &&
        Objects.equals(this.flowModelTypes, flowInstanceFilter.flowModelTypes) &&
        Objects.equals(this.executingLongRunningOp, flowInstanceFilter.executingLongRunningOp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, flowModelSnapshotIds, flowModelId, flowModelIds, jobId, startDateStart, startDateEnd, endDateStart, endDateEnd, expiringDateStart, expiringDateEnd, domainId, externalId, statuses, flowModelTypes, executingLongRunningOp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowInstanceFilter {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    flowModelSnapshotIds: ").append(toIndentedString(flowModelSnapshotIds)).append("\n");
    sb.append("    flowModelId: ").append(toIndentedString(flowModelId)).append("\n");
    sb.append("    flowModelIds: ").append(toIndentedString(flowModelIds)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    startDateStart: ").append(toIndentedString(startDateStart)).append("\n");
    sb.append("    startDateEnd: ").append(toIndentedString(startDateEnd)).append("\n");
    sb.append("    endDateStart: ").append(toIndentedString(endDateStart)).append("\n");
    sb.append("    endDateEnd: ").append(toIndentedString(endDateEnd)).append("\n");
    sb.append("    expiringDateStart: ").append(toIndentedString(expiringDateStart)).append("\n");
    sb.append("    expiringDateEnd: ").append(toIndentedString(expiringDateEnd)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    flowModelTypes: ").append(toIndentedString(flowModelTypes)).append("\n");
    sb.append("    executingLongRunningOp: ").append(toIndentedString(executingLongRunningOp)).append("\n");
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

