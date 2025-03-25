package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
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
 * FlowStep
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:33:52.003808146Z[Europe/Lisbon]")
public class FlowStep {

  private UUID id;

  private UUID previousStepId;

  private UUID flowInstanceId;

  private String stepName;

  private String displayName;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
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

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  /**
   * Gets or Sets stepType
   */
  public enum StepTypeEnum {
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

    StepTypeEnum(String value) {
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
    public static StepTypeEnum fromValue(String value) {
      for (StepTypeEnum b : StepTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StepTypeEnum stepType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime queueDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime executeDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expirationDate;

  private String msg;

  private String externalId;

  private Boolean deliveryFileRetrievable;

  private Boolean messageFileRetrievable;

  public FlowStep id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @Valid 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public FlowStep previousStepId(UUID previousStepId) {
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

  public FlowStep flowInstanceId(UUID flowInstanceId) {
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

  public FlowStep stepName(String stepName) {
    this.stepName = stepName;
    return this;
  }

  /**
   * Get stepName
   * @return stepName
  */
  
  @Schema(name = "stepName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stepName")
  public String getStepName() {
    return stepName;
  }

  public void setStepName(String stepName) {
    this.stepName = stepName;
  }

  public FlowStep displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  */
  
  @Schema(name = "displayName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public FlowStep status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public FlowStep stepType(StepTypeEnum stepType) {
    this.stepType = stepType;
    return this;
  }

  /**
   * Get stepType
   * @return stepType
  */
  
  @Schema(name = "stepType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stepType")
  public StepTypeEnum getStepType() {
    return stepType;
  }

  public void setStepType(StepTypeEnum stepType) {
    this.stepType = stepType;
  }

  public FlowStep queueDate(OffsetDateTime queueDate) {
    this.queueDate = queueDate;
    return this;
  }

  /**
   * Get queueDate
   * @return queueDate
  */
  @Valid 
  @Schema(name = "queueDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queueDate")
  public OffsetDateTime getQueueDate() {
    return queueDate;
  }

  public void setQueueDate(OffsetDateTime queueDate) {
    this.queueDate = queueDate;
  }

  public FlowStep startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  @Valid 
  @Schema(name = "startDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public FlowStep executeDate(OffsetDateTime executeDate) {
    this.executeDate = executeDate;
    return this;
  }

  /**
   * Get executeDate
   * @return executeDate
  */
  @Valid 
  @Schema(name = "executeDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executeDate")
  public OffsetDateTime getExecuteDate() {
    return executeDate;
  }

  public void setExecuteDate(OffsetDateTime executeDate) {
    this.executeDate = executeDate;
  }

  public FlowStep endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  @Valid 
  @Schema(name = "endDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public FlowStep expirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Get expirationDate
   * @return expirationDate
  */
  @Valid 
  @Schema(name = "expirationDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expirationDate")
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public FlowStep msg(String msg) {
    this.msg = msg;
    return this;
  }

  /**
   * Get msg
   * @return msg
  */
  
  @Schema(name = "msg", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("msg")
  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public FlowStep externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
  */
  
  @Schema(name = "externalId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public FlowStep deliveryFileRetrievable(Boolean deliveryFileRetrievable) {
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

  public FlowStep messageFileRetrievable(Boolean messageFileRetrievable) {
    this.messageFileRetrievable = messageFileRetrievable;
    return this;
  }

  /**
   * Get messageFileRetrievable
   * @return messageFileRetrievable
  */
  
  @Schema(name = "messageFileRetrievable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messageFileRetrievable")
  public Boolean getMessageFileRetrievable() {
    return messageFileRetrievable;
  }

  public void setMessageFileRetrievable(Boolean messageFileRetrievable) {
    this.messageFileRetrievable = messageFileRetrievable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowStep flowStep = (FlowStep) o;
    return Objects.equals(this.id, flowStep.id) &&
        Objects.equals(this.previousStepId, flowStep.previousStepId) &&
        Objects.equals(this.flowInstanceId, flowStep.flowInstanceId) &&
        Objects.equals(this.stepName, flowStep.stepName) &&
        Objects.equals(this.displayName, flowStep.displayName) &&
        Objects.equals(this.status, flowStep.status) &&
        Objects.equals(this.stepType, flowStep.stepType) &&
        Objects.equals(this.queueDate, flowStep.queueDate) &&
        Objects.equals(this.startDate, flowStep.startDate) &&
        Objects.equals(this.executeDate, flowStep.executeDate) &&
        Objects.equals(this.endDate, flowStep.endDate) &&
        Objects.equals(this.expirationDate, flowStep.expirationDate) &&
        Objects.equals(this.msg, flowStep.msg) &&
        Objects.equals(this.externalId, flowStep.externalId) &&
        Objects.equals(this.deliveryFileRetrievable, flowStep.deliveryFileRetrievable) &&
        Objects.equals(this.messageFileRetrievable, flowStep.messageFileRetrievable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, previousStepId, flowInstanceId, stepName, displayName, status, stepType, queueDate, startDate, executeDate, endDate, expirationDate, msg, externalId, deliveryFileRetrievable, messageFileRetrievable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowStep {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    previousStepId: ").append(toIndentedString(previousStepId)).append("\n");
    sb.append("    flowInstanceId: ").append(toIndentedString(flowInstanceId)).append("\n");
    sb.append("    stepName: ").append(toIndentedString(stepName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stepType: ").append(toIndentedString(stepType)).append("\n");
    sb.append("    queueDate: ").append(toIndentedString(queueDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    executeDate: ").append(toIndentedString(executeDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    deliveryFileRetrievable: ").append(toIndentedString(deliveryFileRetrievable)).append("\n");
    sb.append("    messageFileRetrievable: ").append(toIndentedString(messageFileRetrievable)).append("\n");
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

