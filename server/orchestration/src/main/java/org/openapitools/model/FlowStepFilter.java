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
 * FlowStepFilter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:03:17.210646522Z[Europe/Lisbon]")
public class FlowStepFilter {

  @Valid
  private List<UUID> ids;

  private UUID flowInstanceId;

  private String stepName;

  private String displayName;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDateStart;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDateEnd;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDateStart;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDateEnd;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime queueDateStart;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime queueDateEnd;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime executeDateStart;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime executeDateEnd;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expiringDateStart;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expiringDateEnd;

  private String externalId;

  private UUID previousStepId;

  private Boolean caseSensitive;

  private Boolean deliveryFileRetrievable;

  /**
   * Gets or Sets statuses
   */
  public enum StatusesEnum {
    CANCELED("canceled"),
    
    CREATED("created"),
    
    WAITING("waiting"),
    
    HOLDING("holding"),
    
    STARTED("started"),
    
    EXECUTED("executed"),
    
    FILTERED("filtered"),
    
    COMPLETE("complete"),
    
    ERROR("error"),
    
    EXPIRED("expired");

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
   * Gets or Sets stepTypes
   */
  public enum StepTypesEnum {
    INPUT("input"),
    
    COMMUNICATION("communication"),
    
    OUTPUT("output"),
    
    DECIDER("decider"),
    
    PROCESSOR("processor"),
    
    AGGREGATOR("aggregator"),
    
    DELAY("delay"),
    
    HOLD("hold"),
    
    EXTERNALFLOW("externalFlow");

    private String value;

    StepTypesEnum(String value) {
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
    public static StepTypesEnum fromValue(String value) {
      for (StepTypesEnum b : StepTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<StepTypesEnum> stepTypes;

  public FlowStepFilter ids(List<UUID> ids) {
    this.ids = ids;
    return this;
  }

  public FlowStepFilter addIdsItem(UUID idsItem) {
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

  public FlowStepFilter flowInstanceId(UUID flowInstanceId) {
    this.flowInstanceId = flowInstanceId;
    return this;
  }

  /**
   * Get flowInstanceId
   * @return flowInstanceId
  */
  @Valid 
  @Schema(name = "flowInstanceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowInstanceId")
  public UUID getFlowInstanceId() {
    return flowInstanceId;
  }

  public void setFlowInstanceId(UUID flowInstanceId) {
    this.flowInstanceId = flowInstanceId;
  }

  public FlowStepFilter stepName(String stepName) {
    this.stepName = stepName;
    return this;
  }

  /**
   * Get stepName
   * @return stepName
  */
  @Size(min = 0, max = 255) 
  @Schema(name = "stepName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stepName")
  public String getStepName() {
    return stepName;
  }

  public void setStepName(String stepName) {
    this.stepName = stepName;
  }

  public FlowStepFilter displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  */
  @Size(min = 0, max = 255) 
  @Schema(name = "displayName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public FlowStepFilter startDateStart(OffsetDateTime startDateStart) {
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

  public FlowStepFilter startDateEnd(OffsetDateTime startDateEnd) {
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

  public FlowStepFilter endDateStart(OffsetDateTime endDateStart) {
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

  public FlowStepFilter endDateEnd(OffsetDateTime endDateEnd) {
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

  public FlowStepFilter queueDateStart(OffsetDateTime queueDateStart) {
    this.queueDateStart = queueDateStart;
    return this;
  }

  /**
   * Get queueDateStart
   * @return queueDateStart
  */
  @Valid 
  @Schema(name = "queueDateStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queueDateStart")
  public OffsetDateTime getQueueDateStart() {
    return queueDateStart;
  }

  public void setQueueDateStart(OffsetDateTime queueDateStart) {
    this.queueDateStart = queueDateStart;
  }

  public FlowStepFilter queueDateEnd(OffsetDateTime queueDateEnd) {
    this.queueDateEnd = queueDateEnd;
    return this;
  }

  /**
   * Get queueDateEnd
   * @return queueDateEnd
  */
  @Valid 
  @Schema(name = "queueDateEnd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queueDateEnd")
  public OffsetDateTime getQueueDateEnd() {
    return queueDateEnd;
  }

  public void setQueueDateEnd(OffsetDateTime queueDateEnd) {
    this.queueDateEnd = queueDateEnd;
  }

  public FlowStepFilter executeDateStart(OffsetDateTime executeDateStart) {
    this.executeDateStart = executeDateStart;
    return this;
  }

  /**
   * Get executeDateStart
   * @return executeDateStart
  */
  @Valid 
  @Schema(name = "executeDateStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executeDateStart")
  public OffsetDateTime getExecuteDateStart() {
    return executeDateStart;
  }

  public void setExecuteDateStart(OffsetDateTime executeDateStart) {
    this.executeDateStart = executeDateStart;
  }

  public FlowStepFilter executeDateEnd(OffsetDateTime executeDateEnd) {
    this.executeDateEnd = executeDateEnd;
    return this;
  }

  /**
   * Get executeDateEnd
   * @return executeDateEnd
  */
  @Valid 
  @Schema(name = "executeDateEnd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executeDateEnd")
  public OffsetDateTime getExecuteDateEnd() {
    return executeDateEnd;
  }

  public void setExecuteDateEnd(OffsetDateTime executeDateEnd) {
    this.executeDateEnd = executeDateEnd;
  }

  public FlowStepFilter expiringDateStart(OffsetDateTime expiringDateStart) {
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

  public FlowStepFilter expiringDateEnd(OffsetDateTime expiringDateEnd) {
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

  public FlowStepFilter externalId(String externalId) {
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

  public FlowStepFilter previousStepId(UUID previousStepId) {
    this.previousStepId = previousStepId;
    return this;
  }

  /**
   * Get previousStepId
   * @return previousStepId
  */
  @Valid 
  @Schema(name = "previousStepId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("previousStepId")
  public UUID getPreviousStepId() {
    return previousStepId;
  }

  public void setPreviousStepId(UUID previousStepId) {
    this.previousStepId = previousStepId;
  }

  public FlowStepFilter caseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
    return this;
  }

  /**
   * Get caseSensitive
   * @return caseSensitive
  */
  
  @Schema(name = "caseSensitive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseSensitive")
  public Boolean getCaseSensitive() {
    return caseSensitive;
  }

  public void setCaseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
  }

  public FlowStepFilter deliveryFileRetrievable(Boolean deliveryFileRetrievable) {
    this.deliveryFileRetrievable = deliveryFileRetrievable;
    return this;
  }

  /**
   * Get deliveryFileRetrievable
   * @return deliveryFileRetrievable
  */
  
  @Schema(name = "deliveryFileRetrievable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deliveryFileRetrievable")
  public Boolean getDeliveryFileRetrievable() {
    return deliveryFileRetrievable;
  }

  public void setDeliveryFileRetrievable(Boolean deliveryFileRetrievable) {
    this.deliveryFileRetrievable = deliveryFileRetrievable;
  }

  public FlowStepFilter statuses(List<StatusesEnum> statuses) {
    this.statuses = statuses;
    return this;
  }

  public FlowStepFilter addStatusesItem(StatusesEnum statusesItem) {
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

  public FlowStepFilter stepTypes(List<StepTypesEnum> stepTypes) {
    this.stepTypes = stepTypes;
    return this;
  }

  public FlowStepFilter addStepTypesItem(StepTypesEnum stepTypesItem) {
    if (this.stepTypes == null) {
      this.stepTypes = new ArrayList<>();
    }
    this.stepTypes.add(stepTypesItem);
    return this;
  }

  /**
   * Get stepTypes
   * @return stepTypes
  */
  
  @Schema(name = "stepTypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stepTypes")
  public List<StepTypesEnum> getStepTypes() {
    return stepTypes;
  }

  public void setStepTypes(List<StepTypesEnum> stepTypes) {
    this.stepTypes = stepTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowStepFilter flowStepFilter = (FlowStepFilter) o;
    return Objects.equals(this.ids, flowStepFilter.ids) &&
        Objects.equals(this.flowInstanceId, flowStepFilter.flowInstanceId) &&
        Objects.equals(this.stepName, flowStepFilter.stepName) &&
        Objects.equals(this.displayName, flowStepFilter.displayName) &&
        Objects.equals(this.startDateStart, flowStepFilter.startDateStart) &&
        Objects.equals(this.startDateEnd, flowStepFilter.startDateEnd) &&
        Objects.equals(this.endDateStart, flowStepFilter.endDateStart) &&
        Objects.equals(this.endDateEnd, flowStepFilter.endDateEnd) &&
        Objects.equals(this.queueDateStart, flowStepFilter.queueDateStart) &&
        Objects.equals(this.queueDateEnd, flowStepFilter.queueDateEnd) &&
        Objects.equals(this.executeDateStart, flowStepFilter.executeDateStart) &&
        Objects.equals(this.executeDateEnd, flowStepFilter.executeDateEnd) &&
        Objects.equals(this.expiringDateStart, flowStepFilter.expiringDateStart) &&
        Objects.equals(this.expiringDateEnd, flowStepFilter.expiringDateEnd) &&
        Objects.equals(this.externalId, flowStepFilter.externalId) &&
        Objects.equals(this.previousStepId, flowStepFilter.previousStepId) &&
        Objects.equals(this.caseSensitive, flowStepFilter.caseSensitive) &&
        Objects.equals(this.deliveryFileRetrievable, flowStepFilter.deliveryFileRetrievable) &&
        Objects.equals(this.statuses, flowStepFilter.statuses) &&
        Objects.equals(this.stepTypes, flowStepFilter.stepTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, flowInstanceId, stepName, displayName, startDateStart, startDateEnd, endDateStart, endDateEnd, queueDateStart, queueDateEnd, executeDateStart, executeDateEnd, expiringDateStart, expiringDateEnd, externalId, previousStepId, caseSensitive, deliveryFileRetrievable, statuses, stepTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowStepFilter {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    flowInstanceId: ").append(toIndentedString(flowInstanceId)).append("\n");
    sb.append("    stepName: ").append(toIndentedString(stepName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    startDateStart: ").append(toIndentedString(startDateStart)).append("\n");
    sb.append("    startDateEnd: ").append(toIndentedString(startDateEnd)).append("\n");
    sb.append("    endDateStart: ").append(toIndentedString(endDateStart)).append("\n");
    sb.append("    endDateEnd: ").append(toIndentedString(endDateEnd)).append("\n");
    sb.append("    queueDateStart: ").append(toIndentedString(queueDateStart)).append("\n");
    sb.append("    queueDateEnd: ").append(toIndentedString(queueDateEnd)).append("\n");
    sb.append("    executeDateStart: ").append(toIndentedString(executeDateStart)).append("\n");
    sb.append("    executeDateEnd: ").append(toIndentedString(executeDateEnd)).append("\n");
    sb.append("    expiringDateStart: ").append(toIndentedString(expiringDateStart)).append("\n");
    sb.append("    expiringDateEnd: ").append(toIndentedString(expiringDateEnd)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    previousStepId: ").append(toIndentedString(previousStepId)).append("\n");
    sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
    sb.append("    deliveryFileRetrievable: ").append(toIndentedString(deliveryFileRetrievable)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    stepTypes: ").append(toIndentedString(stepTypes)).append("\n");
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

