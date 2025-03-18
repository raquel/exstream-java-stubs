package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PostSortRunFilter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:03:17.210646522Z[Europe/Lisbon]")
public class PostSortRunFilter {

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

  public PostSortRunFilter ids(List<UUID> ids) {
    this.ids = ids;
    return this;
  }

  public PostSortRunFilter addIdsItem(UUID idsItem) {
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

  public PostSortRunFilter jobIds(List<UUID> jobIds) {
    this.jobIds = jobIds;
    return this;
  }

  public PostSortRunFilter addJobIdsItem(UUID jobIdsItem) {
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

  public PostSortRunFilter flowStepIds(List<UUID> flowStepIds) {
    this.flowStepIds = flowStepIds;
    return this;
  }

  public PostSortRunFilter addFlowStepIdsItem(UUID flowStepIdsItem) {
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

  public PostSortRunFilter communicationIds(List<UUID> communicationIds) {
    this.communicationIds = communicationIds;
    return this;
  }

  public PostSortRunFilter addCommunicationIdsItem(UUID communicationIdsItem) {
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

  public PostSortRunFilter queueNames(List<String> queueNames) {
    this.queueNames = queueNames;
    return this;
  }

  public PostSortRunFilter addQueueNamesItem(String queueNamesItem) {
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

  public PostSortRunFilter creationDateStart(String creationDateStart) {
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

  public PostSortRunFilter creationDateEnd(String creationDateEnd) {
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

  public PostSortRunFilter externalIds(List<String> externalIds) {
    this.externalIds = externalIds;
    return this;
  }

  public PostSortRunFilter addExternalIdsItem(String externalIdsItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostSortRunFilter postSortRunFilter = (PostSortRunFilter) o;
    return Objects.equals(this.ids, postSortRunFilter.ids) &&
        Objects.equals(this.jobIds, postSortRunFilter.jobIds) &&
        Objects.equals(this.flowStepIds, postSortRunFilter.flowStepIds) &&
        Objects.equals(this.communicationIds, postSortRunFilter.communicationIds) &&
        Objects.equals(this.queueNames, postSortRunFilter.queueNames) &&
        Objects.equals(this.creationDateStart, postSortRunFilter.creationDateStart) &&
        Objects.equals(this.creationDateEnd, postSortRunFilter.creationDateEnd) &&
        Objects.equals(this.externalIds, postSortRunFilter.externalIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, jobIds, flowStepIds, communicationIds, queueNames, creationDateStart, creationDateEnd, externalIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostSortRunFilter {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    jobIds: ").append(toIndentedString(jobIds)).append("\n");
    sb.append("    flowStepIds: ").append(toIndentedString(flowStepIds)).append("\n");
    sb.append("    communicationIds: ").append(toIndentedString(communicationIds)).append("\n");
    sb.append("    queueNames: ").append(toIndentedString(queueNames)).append("\n");
    sb.append("    creationDateStart: ").append(toIndentedString(creationDateStart)).append("\n");
    sb.append("    creationDateEnd: ").append(toIndentedString(creationDateEnd)).append("\n");
    sb.append("    externalIds: ").append(toIndentedString(externalIds)).append("\n");
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

