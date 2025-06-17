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
 * Job
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:33:52.003808146Z[Europe/Lisbon]")
public class Job {

  private UUID id;

  private String domainId;

  private String channel;

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

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    CANCELED("canceled"),
    
    COMPLETE("complete"),
    
    DELETED("deleted"),
    
    STARTED("started"),
    
    WAITING("waiting"),
    
    HOLDING("holding"),
    
    ERROR("error"),
    
    UNINITIALIZED("uninitialized");

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

  private String msg;

  private String externalId;

  private String triggeredBy;

  private UUID aggregatedFMCSnapshotId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expirationDate;

  public Job id(UUID id) {
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

  public Job domainId(String domainId) {
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

  public Job channel(String channel) {
    this.channel = channel;
    return this;
  }

  /**
   * Get channel
   * @return channel
  */
  
  @Schema(name = "channel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("channel")
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public Job mode(ModeEnum mode) {
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

  public Job status(StatusEnum status) {
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

  public Job flowModelType(FlowModelTypeEnum flowModelType) {
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

  public Job msg(String msg) {
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

  public Job externalId(String externalId) {
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

  public Job triggeredBy(String triggeredBy) {
    this.triggeredBy = triggeredBy;
    return this;
  }

  /**
   * Get triggeredBy
   * @return triggeredBy
  */
  
  @Schema(name = "triggeredBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("triggeredBy")
  public String getTriggeredBy() {
    return triggeredBy;
  }

  public void setTriggeredBy(String triggeredBy) {
    this.triggeredBy = triggeredBy;
  }

  public Job aggregatedFMCSnapshotId(UUID aggregatedFMCSnapshotId) {
    this.aggregatedFMCSnapshotId = aggregatedFMCSnapshotId;
    return this;
  }

  /**
   * Get aggregatedFMCSnapshotId
   * @return aggregatedFMCSnapshotId
  */
  @Valid 
  @Schema(name = "aggregatedFMCSnapshotId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aggregatedFMCSnapshotId")
  public UUID getAggregatedFMCSnapshotId() {
    return aggregatedFMCSnapshotId;
  }

  public void setAggregatedFMCSnapshotId(UUID aggregatedFMCSnapshotId) {
    this.aggregatedFMCSnapshotId = aggregatedFMCSnapshotId;
  }

  public Job startDate(OffsetDateTime startDate) {
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

  public Job endDate(OffsetDateTime endDate) {
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

  public Job expirationDate(OffsetDateTime expirationDate) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Job job = (Job) o;
    return Objects.equals(this.id, job.id) &&
        Objects.equals(this.domainId, job.domainId) &&
        Objects.equals(this.channel, job.channel) &&
        Objects.equals(this.mode, job.mode) &&
        Objects.equals(this.status, job.status) &&
        Objects.equals(this.flowModelType, job.flowModelType) &&
        Objects.equals(this.msg, job.msg) &&
        Objects.equals(this.externalId, job.externalId) &&
        Objects.equals(this.triggeredBy, job.triggeredBy) &&
        Objects.equals(this.aggregatedFMCSnapshotId, job.aggregatedFMCSnapshotId) &&
        Objects.equals(this.startDate, job.startDate) &&
        Objects.equals(this.endDate, job.endDate) &&
        Objects.equals(this.expirationDate, job.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, domainId, channel, mode, status, flowModelType, msg, externalId, triggeredBy, aggregatedFMCSnapshotId, startDate, endDate, expirationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Job {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    flowModelType: ").append(toIndentedString(flowModelType)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    triggeredBy: ").append(toIndentedString(triggeredBy)).append("\n");
    sb.append("    aggregatedFMCSnapshotId: ").append(toIndentedString(aggregatedFMCSnapshotId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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

