package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.FlowStepFilter;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * FlowStepFilterRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:33:52.003808146Z[Europe/Lisbon]")
public class FlowStepFilterRequest {

  private Integer offset;

  private Integer count;

  private Object sort;

  private FlowStepFilter filter;

  public FlowStepFilterRequest offset(Integer offset) {
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

  public FlowStepFilterRequest count(Integer count) {
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

  public FlowStepFilterRequest sort(Object sort) {
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

  public FlowStepFilterRequest filter(FlowStepFilter filter) {
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
  public FlowStepFilter getFilter() {
    return filter;
  }

  public void setFilter(FlowStepFilter filter) {
    this.filter = filter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowStepFilterRequest flowStepFilterRequest = (FlowStepFilterRequest) o;
    return Objects.equals(this.offset, flowStepFilterRequest.offset) &&
        Objects.equals(this.count, flowStepFilterRequest.count) &&
        Objects.equals(this.sort, flowStepFilterRequest.sort) &&
        Objects.equals(this.filter, flowStepFilterRequest.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, count, sort, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowStepFilterRequest {\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

