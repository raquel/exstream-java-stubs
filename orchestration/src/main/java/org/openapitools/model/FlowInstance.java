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
 * FlowInstance
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:03:17.210646522Z[Europe/Lisbon]")
public class FlowInstance {

  private UUID id;

  private UUID jobId;

  private UUID flowModelId;

  private UUID flowModelSnapshotId;

  private String domainId;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    CANCELED("canceled"),
    
    STARTED("started"),
    
    COMPLETE("complete"),
    
    WAITING("waiting"),
    
    HOLDING("holding"),
    
    ERROR("error"),
    
    FINISHING("finishing");

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

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expirationDate;

  private String msg;

  private String externalId;

  /**
   * Gets or Sets flowModelType
   */
  public enum FlowModelTypeEnum {
    COMMUNICATION("COMMUNICATION"),
    
    ALERT("ALERT"),
    
    NOTIFICATION("NOTIFICATION");

    private String value;

    FlowModelTypeEnum(String value) {
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
    public static FlowModelTypeEnum fromValue(String value) {
      for (FlowModelTypeEnum b : FlowModelTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private FlowModelTypeEnum flowModelType;

  private Boolean inputRetrievable;

  private Boolean executingLongRunningOp;

  public FlowInstance id(UUID id) {
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

  public FlowInstance jobId(UUID jobId) {
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

  public FlowInstance flowModelId(UUID flowModelId) {
    this.flowModelId = flowModelId;
    return this;
  }

  /**
   * Get flowModelId
   * @return flowModelId
  */
  @Valid 
  @Schema(name = "flowModelId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowModelId")
  public UUID getFlowModelId() {
    return flowModelId;
  }

  public void setFlowModelId(UUID flowModelId) {
    this.flowModelId = flowModelId;
  }

  public FlowInstance flowModelSnapshotId(UUID flowModelSnapshotId) {
    this.flowModelSnapshotId = flowModelSnapshotId;
    return this;
  }

  /**
   * Get flowModelSnapshotId
   * @return flowModelSnapshotId
  */
  @Valid 
  @Schema(name = "flowModelSnapshotId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowModelSnapshotId")
  public UUID getFlowModelSnapshotId() {
    return flowModelSnapshotId;
  }

  public void setFlowModelSnapshotId(UUID flowModelSnapshotId) {
    this.flowModelSnapshotId = flowModelSnapshotId;
  }

  public FlowInstance domainId(String domainId) {
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

  public FlowInstance status(StatusEnum status) {
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

  public FlowInstance startDate(OffsetDateTime startDate) {
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

  public FlowInstance endDate(OffsetDateTime endDate) {
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

  public FlowInstance expirationDate(OffsetDateTime expirationDate) {
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

  public FlowInstance msg(String msg) {
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

  public FlowInstance externalId(String externalId) {
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

  public FlowInstance flowModelType(FlowModelTypeEnum flowModelType) {
    this.flowModelType = flowModelType;
    return this;
  }

  /**
   * Get flowModelType
   * @return flowModelType
  */
  
  @Schema(name = "flowModelType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowModelType")
  public FlowModelTypeEnum getFlowModelType() {
    return flowModelType;
  }

  public void setFlowModelType(FlowModelTypeEnum flowModelType) {
    this.flowModelType = flowModelType;
  }

  public FlowInstance inputRetrievable(Boolean inputRetrievable) {
    this.inputRetrievable = inputRetrievable;
    return this;
  }

  /**
   * Get inputRetrievable
   * @return inputRetrievable
  */
  
  @Schema(name = "inputRetrievable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inputRetrievable")
  public Boolean getInputRetrievable() {
    return inputRetrievable;
  }

  public void setInputRetrievable(Boolean inputRetrievable) {
    this.inputRetrievable = inputRetrievable;
  }

  public FlowInstance executingLongRunningOp(Boolean executingLongRunningOp) {
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
    FlowInstance flowInstance = (FlowInstance) o;
    return Objects.equals(this.id, flowInstance.id) &&
        Objects.equals(this.jobId, flowInstance.jobId) &&
        Objects.equals(this.flowModelId, flowInstance.flowModelId) &&
        Objects.equals(this.flowModelSnapshotId, flowInstance.flowModelSnapshotId) &&
        Objects.equals(this.domainId, flowInstance.domainId) &&
        Objects.equals(this.status, flowInstance.status) &&
        Objects.equals(this.startDate, flowInstance.startDate) &&
        Objects.equals(this.endDate, flowInstance.endDate) &&
        Objects.equals(this.expirationDate, flowInstance.expirationDate) &&
        Objects.equals(this.msg, flowInstance.msg) &&
        Objects.equals(this.externalId, flowInstance.externalId) &&
        Objects.equals(this.flowModelType, flowInstance.flowModelType) &&
        Objects.equals(this.inputRetrievable, flowInstance.inputRetrievable) &&
        Objects.equals(this.executingLongRunningOp, flowInstance.executingLongRunningOp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, jobId, flowModelId, flowModelSnapshotId, domainId, status, startDate, endDate, expirationDate, msg, externalId, flowModelType, inputRetrievable, executingLongRunningOp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowInstance {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    flowModelId: ").append(toIndentedString(flowModelId)).append("\n");
    sb.append("    flowModelSnapshotId: ").append(toIndentedString(flowModelSnapshotId)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    flowModelType: ").append(toIndentedString(flowModelType)).append("\n");
    sb.append("    inputRetrievable: ").append(toIndentedString(inputRetrievable)).append("\n");
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

