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
 * SortingAsset
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:33:52.003808146Z[Europe/Lisbon]")
public class SortingAsset {

  private UUID id;

  private UUID jobId;

  private UUID flowStepId;

  private UUID flowModelId;

  private UUID communicationId;

  private String subpackageIds;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    PROCESSED("processed"),
    
    WAITING("waiting"),
    
    EXPIRED("expired"),
    
    CANCELED("canceled"),
    
    ALL("all");

    private String value;

    StateEnum(String value) {
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
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StateEnum state;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime creationDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastModificationDate;

  private String queueName;

  private String metadata;

  private String engineInfo;

  private String sortSubflow;

  private String externalId;

  private UUID referenceId;

  private Integer customersCount;

  private String subPackageIds;

  public SortingAsset id(UUID id) {
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

  public SortingAsset jobId(UUID jobId) {
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

  public SortingAsset flowStepId(UUID flowStepId) {
    this.flowStepId = flowStepId;
    return this;
  }

  /**
   * Get flowStepId
   * @return flowStepId
  */
  @Valid 
  @Schema(name = "flowStepId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowStepId")
  public UUID getFlowStepId() {
    return flowStepId;
  }

  public void setFlowStepId(UUID flowStepId) {
    this.flowStepId = flowStepId;
  }

  public SortingAsset flowModelId(UUID flowModelId) {
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

  public SortingAsset communicationId(UUID communicationId) {
    this.communicationId = communicationId;
    return this;
  }

  /**
   * Get communicationId
   * @return communicationId
  */
  @Valid 
  @Schema(name = "communicationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("communicationId")
  public UUID getCommunicationId() {
    return communicationId;
  }

  public void setCommunicationId(UUID communicationId) {
    this.communicationId = communicationId;
  }

  public SortingAsset subpackageIds(String subpackageIds) {
    this.subpackageIds = subpackageIds;
    return this;
  }

  /**
   * Get subpackageIds
   * @return subpackageIds
  */
  
  @Schema(name = "subpackageIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subpackageIds")
  public String getSubpackageIds() {
    return subpackageIds;
  }

  public void setSubpackageIds(String subpackageIds) {
    this.subpackageIds = subpackageIds;
  }

  public SortingAsset state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public SortingAsset creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
  */
  @Valid 
  @Schema(name = "creationDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationDate")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public SortingAsset lastModificationDate(OffsetDateTime lastModificationDate) {
    this.lastModificationDate = lastModificationDate;
    return this;
  }

  /**
   * Get lastModificationDate
   * @return lastModificationDate
  */
  @Valid 
  @Schema(name = "lastModificationDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastModificationDate")
  public OffsetDateTime getLastModificationDate() {
    return lastModificationDate;
  }

  public void setLastModificationDate(OffsetDateTime lastModificationDate) {
    this.lastModificationDate = lastModificationDate;
  }

  public SortingAsset queueName(String queueName) {
    this.queueName = queueName;
    return this;
  }

  /**
   * Get queueName
   * @return queueName
  */
  
  @Schema(name = "queueName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queueName")
  public String getQueueName() {
    return queueName;
  }

  public void setQueueName(String queueName) {
    this.queueName = queueName;
  }

  public SortingAsset metadata(String metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  
  @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metadata")
  public String getMetadata() {
    return metadata;
  }

  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

  public SortingAsset engineInfo(String engineInfo) {
    this.engineInfo = engineInfo;
    return this;
  }

  /**
   * Get engineInfo
   * @return engineInfo
  */
  
  @Schema(name = "engineInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("engineInfo")
  public String getEngineInfo() {
    return engineInfo;
  }

  public void setEngineInfo(String engineInfo) {
    this.engineInfo = engineInfo;
  }

  public SortingAsset sortSubflow(String sortSubflow) {
    this.sortSubflow = sortSubflow;
    return this;
  }

  /**
   * Get sortSubflow
   * @return sortSubflow
  */
  
  @Schema(name = "sortSubflow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sortSubflow")
  public String getSortSubflow() {
    return sortSubflow;
  }

  public void setSortSubflow(String sortSubflow) {
    this.sortSubflow = sortSubflow;
  }

  public SortingAsset externalId(String externalId) {
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

  public SortingAsset referenceId(UUID referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * Get referenceId
   * @return referenceId
  */
  @Valid 
  @Schema(name = "referenceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("referenceId")
  public UUID getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(UUID referenceId) {
    this.referenceId = referenceId;
  }

  public SortingAsset customersCount(Integer customersCount) {
    this.customersCount = customersCount;
    return this;
  }

  /**
   * Get customersCount
   * @return customersCount
  */
  
  @Schema(name = "customersCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customersCount")
  public Integer getCustomersCount() {
    return customersCount;
  }

  public void setCustomersCount(Integer customersCount) {
    this.customersCount = customersCount;
  }

  public SortingAsset subPackageIds(String subPackageIds) {
    this.subPackageIds = subPackageIds;
    return this;
  }

  /**
   * Get subPackageIds
   * @return subPackageIds
  */
  
  @Schema(name = "subPackageIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subPackageIds")
  public String getSubPackageIds() {
    return subPackageIds;
  }

  public void setSubPackageIds(String subPackageIds) {
    this.subPackageIds = subPackageIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SortingAsset sortingAsset = (SortingAsset) o;
    return Objects.equals(this.id, sortingAsset.id) &&
        Objects.equals(this.jobId, sortingAsset.jobId) &&
        Objects.equals(this.flowStepId, sortingAsset.flowStepId) &&
        Objects.equals(this.flowModelId, sortingAsset.flowModelId) &&
        Objects.equals(this.communicationId, sortingAsset.communicationId) &&
        Objects.equals(this.subpackageIds, sortingAsset.subpackageIds) &&
        Objects.equals(this.state, sortingAsset.state) &&
        Objects.equals(this.creationDate, sortingAsset.creationDate) &&
        Objects.equals(this.lastModificationDate, sortingAsset.lastModificationDate) &&
        Objects.equals(this.queueName, sortingAsset.queueName) &&
        Objects.equals(this.metadata, sortingAsset.metadata) &&
        Objects.equals(this.engineInfo, sortingAsset.engineInfo) &&
        Objects.equals(this.sortSubflow, sortingAsset.sortSubflow) &&
        Objects.equals(this.externalId, sortingAsset.externalId) &&
        Objects.equals(this.referenceId, sortingAsset.referenceId) &&
        Objects.equals(this.customersCount, sortingAsset.customersCount) &&
        Objects.equals(this.subPackageIds, sortingAsset.subPackageIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, jobId, flowStepId, flowModelId, communicationId, subpackageIds, state, creationDate, lastModificationDate, queueName, metadata, engineInfo, sortSubflow, externalId, referenceId, customersCount, subPackageIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SortingAsset {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    flowStepId: ").append(toIndentedString(flowStepId)).append("\n");
    sb.append("    flowModelId: ").append(toIndentedString(flowModelId)).append("\n");
    sb.append("    communicationId: ").append(toIndentedString(communicationId)).append("\n");
    sb.append("    subpackageIds: ").append(toIndentedString(subpackageIds)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    lastModificationDate: ").append(toIndentedString(lastModificationDate)).append("\n");
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    engineInfo: ").append(toIndentedString(engineInfo)).append("\n");
    sb.append("    sortSubflow: ").append(toIndentedString(sortSubflow)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    customersCount: ").append(toIndentedString(customersCount)).append("\n");
    sb.append("    subPackageIds: ").append(toIndentedString(subPackageIds)).append("\n");
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

