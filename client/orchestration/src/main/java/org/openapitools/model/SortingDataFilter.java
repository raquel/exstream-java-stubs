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
 * SortingDataFilter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:33:52.003808146Z[Europe/Lisbon]")
public class SortingDataFilter {

  @Valid
  private List<UUID> ids;

  @Valid
  private List<UUID> jobIds;

  @Valid
  private List<UUID> flowStepIds;

  @Valid
  private List<UUID> communicationIds;

  @Valid
  private List<String> queueNames;

  private String creationDateStart;

  private String creationDateEnd;

  @Valid
  private List<String> externalIds;

  @Valid
  private List<UUID> flowModelIds;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastModificationDateStart;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastModificationDateEnd;

  /**
   * Gets or Sets states
   */
  public enum StatesEnum {
    PROCESSED("processed"),
    
    WAITING("waiting"),
    
    EXPIRED("expired"),
    
    CANCELED("canceled"),
    
    ALL("all");

    private String value;

    StatesEnum(String value) {
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
    public static StatesEnum fromValue(String value) {
      for (StatesEnum b : StatesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<StatesEnum> states;

  /**
   * Gets or Sets assetTypes
   */
  public enum AssetTypesEnum {
    SORTINGINDEX("sortingIndex"),
    
    SORTINGDATAREFERENCE("sortingDataReference");

    private String value;

    AssetTypesEnum(String value) {
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
    public static AssetTypesEnum fromValue(String value) {
      for (AssetTypesEnum b : AssetTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<AssetTypesEnum> assetTypes;

  @Valid
  private List<String> metadata;

  @Valid
  private List<String> sortSubflows;

  @Valid
  private List<UUID> referenceIds;

  private Integer customersCountFrom;

  private Integer customersCountTo;

  public SortingDataFilter ids(List<UUID> ids) {
    this.ids = ids;
    return this;
  }

  public SortingDataFilter addIdsItem(UUID idsItem) {
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

  public SortingDataFilter jobIds(List<UUID> jobIds) {
    this.jobIds = jobIds;
    return this;
  }

  public SortingDataFilter addJobIdsItem(UUID jobIdsItem) {
    if (this.jobIds == null) {
      this.jobIds = new ArrayList<>();
    }
    this.jobIds.add(jobIdsItem);
    return this;
  }

  /**
   * Get jobIds
   * @return jobIds
  */
  @Valid 
  @Schema(name = "jobIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobIds")
  public List<UUID> getJobIds() {
    return jobIds;
  }

  public void setJobIds(List<UUID> jobIds) {
    this.jobIds = jobIds;
  }

  public SortingDataFilter flowStepIds(List<UUID> flowStepIds) {
    this.flowStepIds = flowStepIds;
    return this;
  }

  public SortingDataFilter addFlowStepIdsItem(UUID flowStepIdsItem) {
    if (this.flowStepIds == null) {
      this.flowStepIds = new ArrayList<>();
    }
    this.flowStepIds.add(flowStepIdsItem);
    return this;
  }

  /**
   * Get flowStepIds
   * @return flowStepIds
  */
  @Valid 
  @Schema(name = "flowStepIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowStepIds")
  public List<UUID> getFlowStepIds() {
    return flowStepIds;
  }

  public void setFlowStepIds(List<UUID> flowStepIds) {
    this.flowStepIds = flowStepIds;
  }

  public SortingDataFilter communicationIds(List<UUID> communicationIds) {
    this.communicationIds = communicationIds;
    return this;
  }

  public SortingDataFilter addCommunicationIdsItem(UUID communicationIdsItem) {
    if (this.communicationIds == null) {
      this.communicationIds = new ArrayList<>();
    }
    this.communicationIds.add(communicationIdsItem);
    return this;
  }

  /**
   * Get communicationIds
   * @return communicationIds
  */
  @Valid 
  @Schema(name = "communicationIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("communicationIds")
  public List<UUID> getCommunicationIds() {
    return communicationIds;
  }

  public void setCommunicationIds(List<UUID> communicationIds) {
    this.communicationIds = communicationIds;
  }

  public SortingDataFilter queueNames(List<String> queueNames) {
    this.queueNames = queueNames;
    return this;
  }

  public SortingDataFilter addQueueNamesItem(String queueNamesItem) {
    if (this.queueNames == null) {
      this.queueNames = new ArrayList<>();
    }
    this.queueNames.add(queueNamesItem);
    return this;
  }

  /**
   * Get queueNames
   * @return queueNames
  */
  
  @Schema(name = "queueNames", example = "[\"Pre-Sort Output Queue\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queueNames")
  public List<String> getQueueNames() {
    return queueNames;
  }

  public void setQueueNames(List<String> queueNames) {
    this.queueNames = queueNames;
  }

  public SortingDataFilter creationDateStart(String creationDateStart) {
    this.creationDateStart = creationDateStart;
    return this;
  }

  /**
   * Get creationDateStart
   * @return creationDateStart
  */
  @Pattern(regexp = "yyyy-MM-dd") 
  @Schema(name = "creationDateStart", example = "2023-02-17", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationDateStart")
  public String getCreationDateStart() {
    return creationDateStart;
  }

  public void setCreationDateStart(String creationDateStart) {
    this.creationDateStart = creationDateStart;
  }

  public SortingDataFilter creationDateEnd(String creationDateEnd) {
    this.creationDateEnd = creationDateEnd;
    return this;
  }

  /**
   * Get creationDateEnd
   * @return creationDateEnd
  */
  @Pattern(regexp = "yyyy-MM-dd") 
  @Schema(name = "creationDateEnd", example = "2023-02-20", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationDateEnd")
  public String getCreationDateEnd() {
    return creationDateEnd;
  }

  public void setCreationDateEnd(String creationDateEnd) {
    this.creationDateEnd = creationDateEnd;
  }

  public SortingDataFilter externalIds(List<String> externalIds) {
    this.externalIds = externalIds;
    return this;
  }

  public SortingDataFilter addExternalIdsItem(String externalIdsItem) {
    if (this.externalIds == null) {
      this.externalIds = new ArrayList<>();
    }
    this.externalIds.add(externalIdsItem);
    return this;
  }

  /**
   * Get externalIds
   * @return externalIds
  */
  
  @Schema(name = "externalIds", example = "[\"ExternalID1\",\"ExternalID2\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalIds")
  public List<String> getExternalIds() {
    return externalIds;
  }

  public void setExternalIds(List<String> externalIds) {
    this.externalIds = externalIds;
  }

  public SortingDataFilter flowModelIds(List<UUID> flowModelIds) {
    this.flowModelIds = flowModelIds;
    return this;
  }

  public SortingDataFilter addFlowModelIdsItem(UUID flowModelIdsItem) {
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

  public SortingDataFilter lastModificationDateStart(OffsetDateTime lastModificationDateStart) {
    this.lastModificationDateStart = lastModificationDateStart;
    return this;
  }

  /**
   * Get lastModificationDateStart
   * @return lastModificationDateStart
  */
  @Valid 
  @Schema(name = "lastModificationDateStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastModificationDateStart")
  public OffsetDateTime getLastModificationDateStart() {
    return lastModificationDateStart;
  }

  public void setLastModificationDateStart(OffsetDateTime lastModificationDateStart) {
    this.lastModificationDateStart = lastModificationDateStart;
  }

  public SortingDataFilter lastModificationDateEnd(OffsetDateTime lastModificationDateEnd) {
    this.lastModificationDateEnd = lastModificationDateEnd;
    return this;
  }

  /**
   * Get lastModificationDateEnd
   * @return lastModificationDateEnd
  */
  @Valid 
  @Schema(name = "lastModificationDateEnd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastModificationDateEnd")
  public OffsetDateTime getLastModificationDateEnd() {
    return lastModificationDateEnd;
  }

  public void setLastModificationDateEnd(OffsetDateTime lastModificationDateEnd) {
    this.lastModificationDateEnd = lastModificationDateEnd;
  }

  public SortingDataFilter states(List<StatesEnum> states) {
    this.states = states;
    return this;
  }

  public SortingDataFilter addStatesItem(StatesEnum statesItem) {
    if (this.states == null) {
      this.states = new ArrayList<>();
    }
    this.states.add(statesItem);
    return this;
  }

  /**
   * Get states
   * @return states
  */
  
  @Schema(name = "states", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("states")
  public List<StatesEnum> getStates() {
    return states;
  }

  public void setStates(List<StatesEnum> states) {
    this.states = states;
  }

  public SortingDataFilter assetTypes(List<AssetTypesEnum> assetTypes) {
    this.assetTypes = assetTypes;
    return this;
  }

  public SortingDataFilter addAssetTypesItem(AssetTypesEnum assetTypesItem) {
    if (this.assetTypes == null) {
      this.assetTypes = new ArrayList<>();
    }
    this.assetTypes.add(assetTypesItem);
    return this;
  }

  /**
   * Get assetTypes
   * @return assetTypes
  */
  
  @Schema(name = "assetTypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assetTypes")
  public List<AssetTypesEnum> getAssetTypes() {
    return assetTypes;
  }

  public void setAssetTypes(List<AssetTypesEnum> assetTypes) {
    this.assetTypes = assetTypes;
  }

  public SortingDataFilter metadata(List<String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public SortingDataFilter addMetadataItem(String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  
  @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metadata")
  public List<String> getMetadata() {
    return metadata;
  }

  public void setMetadata(List<String> metadata) {
    this.metadata = metadata;
  }

  public SortingDataFilter sortSubflows(List<String> sortSubflows) {
    this.sortSubflows = sortSubflows;
    return this;
  }

  public SortingDataFilter addSortSubflowsItem(String sortSubflowsItem) {
    if (this.sortSubflows == null) {
      this.sortSubflows = new ArrayList<>();
    }
    this.sortSubflows.add(sortSubflowsItem);
    return this;
  }

  /**
   * Get sortSubflows
   * @return sortSubflows
  */
  
  @Schema(name = "sortSubflows", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sortSubflows")
  public List<String> getSortSubflows() {
    return sortSubflows;
  }

  public void setSortSubflows(List<String> sortSubflows) {
    this.sortSubflows = sortSubflows;
  }

  public SortingDataFilter referenceIds(List<UUID> referenceIds) {
    this.referenceIds = referenceIds;
    return this;
  }

  public SortingDataFilter addReferenceIdsItem(UUID referenceIdsItem) {
    if (this.referenceIds == null) {
      this.referenceIds = new ArrayList<>();
    }
    this.referenceIds.add(referenceIdsItem);
    return this;
  }

  /**
   * Get referenceIds
   * @return referenceIds
  */
  @Valid 
  @Schema(name = "referenceIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("referenceIds")
  public List<UUID> getReferenceIds() {
    return referenceIds;
  }

  public void setReferenceIds(List<UUID> referenceIds) {
    this.referenceIds = referenceIds;
  }

  public SortingDataFilter customersCountFrom(Integer customersCountFrom) {
    this.customersCountFrom = customersCountFrom;
    return this;
  }

  /**
   * Get customersCountFrom
   * @return customersCountFrom
  */
  
  @Schema(name = "customersCountFrom", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customersCountFrom")
  public Integer getCustomersCountFrom() {
    return customersCountFrom;
  }

  public void setCustomersCountFrom(Integer customersCountFrom) {
    this.customersCountFrom = customersCountFrom;
  }

  public SortingDataFilter customersCountTo(Integer customersCountTo) {
    this.customersCountTo = customersCountTo;
    return this;
  }

  /**
   * Get customersCountTo
   * @return customersCountTo
  */
  
  @Schema(name = "customersCountTo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customersCountTo")
  public Integer getCustomersCountTo() {
    return customersCountTo;
  }

  public void setCustomersCountTo(Integer customersCountTo) {
    this.customersCountTo = customersCountTo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SortingDataFilter sortingDataFilter = (SortingDataFilter) o;
    return Objects.equals(this.ids, sortingDataFilter.ids) &&
        Objects.equals(this.jobIds, sortingDataFilter.jobIds) &&
        Objects.equals(this.flowStepIds, sortingDataFilter.flowStepIds) &&
        Objects.equals(this.communicationIds, sortingDataFilter.communicationIds) &&
        Objects.equals(this.queueNames, sortingDataFilter.queueNames) &&
        Objects.equals(this.creationDateStart, sortingDataFilter.creationDateStart) &&
        Objects.equals(this.creationDateEnd, sortingDataFilter.creationDateEnd) &&
        Objects.equals(this.externalIds, sortingDataFilter.externalIds) &&
        Objects.equals(this.flowModelIds, sortingDataFilter.flowModelIds) &&
        Objects.equals(this.lastModificationDateStart, sortingDataFilter.lastModificationDateStart) &&
        Objects.equals(this.lastModificationDateEnd, sortingDataFilter.lastModificationDateEnd) &&
        Objects.equals(this.states, sortingDataFilter.states) &&
        Objects.equals(this.assetTypes, sortingDataFilter.assetTypes) &&
        Objects.equals(this.metadata, sortingDataFilter.metadata) &&
        Objects.equals(this.sortSubflows, sortingDataFilter.sortSubflows) &&
        Objects.equals(this.referenceIds, sortingDataFilter.referenceIds) &&
        Objects.equals(this.customersCountFrom, sortingDataFilter.customersCountFrom) &&
        Objects.equals(this.customersCountTo, sortingDataFilter.customersCountTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, jobIds, flowStepIds, communicationIds, queueNames, creationDateStart, creationDateEnd, externalIds, flowModelIds, lastModificationDateStart, lastModificationDateEnd, states, assetTypes, metadata, sortSubflows, referenceIds, customersCountFrom, customersCountTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SortingDataFilter {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    jobIds: ").append(toIndentedString(jobIds)).append("\n");
    sb.append("    flowStepIds: ").append(toIndentedString(flowStepIds)).append("\n");
    sb.append("    communicationIds: ").append(toIndentedString(communicationIds)).append("\n");
    sb.append("    queueNames: ").append(toIndentedString(queueNames)).append("\n");
    sb.append("    creationDateStart: ").append(toIndentedString(creationDateStart)).append("\n");
    sb.append("    creationDateEnd: ").append(toIndentedString(creationDateEnd)).append("\n");
    sb.append("    externalIds: ").append(toIndentedString(externalIds)).append("\n");
    sb.append("    flowModelIds: ").append(toIndentedString(flowModelIds)).append("\n");
    sb.append("    lastModificationDateStart: ").append(toIndentedString(lastModificationDateStart)).append("\n");
    sb.append("    lastModificationDateEnd: ").append(toIndentedString(lastModificationDateEnd)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
    sb.append("    assetTypes: ").append(toIndentedString(assetTypes)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    sortSubflows: ").append(toIndentedString(sortSubflows)).append("\n");
    sb.append("    referenceIds: ").append(toIndentedString(referenceIds)).append("\n");
    sb.append("    customersCountFrom: ").append(toIndentedString(customersCountFrom)).append("\n");
    sb.append("    customersCountTo: ").append(toIndentedString(customersCountTo)).append("\n");
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

