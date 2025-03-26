package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * FlowInstanceCountsFilter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:03:17.210646522Z[Europe/Lisbon]")
public class FlowInstanceCountsFilter {

  @Valid
  private List<UUID> flowModelIds;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDateStart;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDateEnd;

  private Boolean fillMissingData;

  public FlowInstanceCountsFilter flowModelIds(List<UUID> flowModelIds) {
    this.flowModelIds = flowModelIds;
    return this;
  }

  public FlowInstanceCountsFilter addFlowModelIdsItem(UUID flowModelIdsItem) {
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

  public FlowInstanceCountsFilter startDateStart(OffsetDateTime startDateStart) {
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

  public FlowInstanceCountsFilter startDateEnd(OffsetDateTime startDateEnd) {
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

  public FlowInstanceCountsFilter fillMissingData(Boolean fillMissingData) {
    this.fillMissingData = fillMissingData;
    return this;
  }

  /**
   * Get fillMissingData
   * @return fillMissingData
  */
  
  @Schema(name = "fillMissingData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fillMissingData")
  public Boolean getFillMissingData() {
    return fillMissingData;
  }

  public void setFillMissingData(Boolean fillMissingData) {
    this.fillMissingData = fillMissingData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowInstanceCountsFilter flowInstanceCountsFilter = (FlowInstanceCountsFilter) o;
    return Objects.equals(this.flowModelIds, flowInstanceCountsFilter.flowModelIds) &&
        Objects.equals(this.startDateStart, flowInstanceCountsFilter.startDateStart) &&
        Objects.equals(this.startDateEnd, flowInstanceCountsFilter.startDateEnd) &&
        Objects.equals(this.fillMissingData, flowInstanceCountsFilter.fillMissingData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowModelIds, startDateStart, startDateEnd, fillMissingData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowInstanceCountsFilter {\n");
    sb.append("    flowModelIds: ").append(toIndentedString(flowModelIds)).append("\n");
    sb.append("    startDateStart: ").append(toIndentedString(startDateStart)).append("\n");
    sb.append("    startDateEnd: ").append(toIndentedString(startDateEnd)).append("\n");
    sb.append("    fillMissingData: ").append(toIndentedString(fillMissingData)).append("\n");
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

