package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.FlowModelSnapshotFilter;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * FlowModelSnapshotFilterRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:33:52.003808146Z[Europe/Lisbon]")
public class FlowModelSnapshotFilterRequest {

  private Integer offset;

  private Integer count;

  private Object sort;

  private FlowModelSnapshotFilter filter;

  private Boolean includeContent;

  public FlowModelSnapshotFilterRequest offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Get offset
   * @return offset
  */
  
  @Schema(name = "offset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offset")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public FlowModelSnapshotFilterRequest count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  */
  
  @Schema(name = "count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public FlowModelSnapshotFilterRequest sort(Object sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Get sort
   * @return sort
  */
  
  @Schema(name = "sort", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sort")
  public Object getSort() {
    return sort;
  }

  public void setSort(Object sort) {
    this.sort = sort;
  }

  public FlowModelSnapshotFilterRequest filter(FlowModelSnapshotFilter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
  */
  @Valid 
  @Schema(name = "filter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filter")
  public FlowModelSnapshotFilter getFilter() {
    return filter;
  }

  public void setFilter(FlowModelSnapshotFilter filter) {
    this.filter = filter;
  }

  public FlowModelSnapshotFilterRequest includeContent(Boolean includeContent) {
    this.includeContent = includeContent;
    return this;
  }

  /**
   * Get includeContent
   * @return includeContent
  */
  
  @Schema(name = "includeContent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includeContent")
  public Boolean getIncludeContent() {
    return includeContent;
  }

  public void setIncludeContent(Boolean includeContent) {
    this.includeContent = includeContent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowModelSnapshotFilterRequest flowModelSnapshotFilterRequest = (FlowModelSnapshotFilterRequest) o;
    return Objects.equals(this.offset, flowModelSnapshotFilterRequest.offset) &&
        Objects.equals(this.count, flowModelSnapshotFilterRequest.count) &&
        Objects.equals(this.sort, flowModelSnapshotFilterRequest.sort) &&
        Objects.equals(this.filter, flowModelSnapshotFilterRequest.filter) &&
        Objects.equals(this.includeContent, flowModelSnapshotFilterRequest.includeContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, count, sort, filter, includeContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowModelSnapshotFilterRequest {\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    includeContent: ").append(toIndentedString(includeContent)).append("\n");
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

