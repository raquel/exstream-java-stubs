package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ResourceFilter;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ResourceFilterRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class ResourceFilterRequest {

  private Integer offset;

  private Integer count;

  private Object sort;

  private ResourceFilter filter;

  private String advancedFilter;

  public ResourceFilterRequest offset(Integer offset) {
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

  public ResourceFilterRequest count(Integer count) {
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

  public ResourceFilterRequest sort(Object sort) {
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

  public ResourceFilterRequest filter(ResourceFilter filter) {
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
  public ResourceFilter getFilter() {
    return filter;
  }

  public void setFilter(ResourceFilter filter) {
    this.filter = filter;
  }

  public ResourceFilterRequest advancedFilter(String advancedFilter) {
    this.advancedFilter = advancedFilter;
    return this;
  }

  /**
   * Get advancedFilter
   * @return advancedFilter
  */
  
  @Schema(name = "advancedFilter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("advancedFilter")
  public String getAdvancedFilter() {
    return advancedFilter;
  }

  public void setAdvancedFilter(String advancedFilter) {
    this.advancedFilter = advancedFilter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceFilterRequest resourceFilterRequest = (ResourceFilterRequest) o;
    return Objects.equals(this.offset, resourceFilterRequest.offset) &&
        Objects.equals(this.count, resourceFilterRequest.count) &&
        Objects.equals(this.sort, resourceFilterRequest.sort) &&
        Objects.equals(this.filter, resourceFilterRequest.filter) &&
        Objects.equals(this.advancedFilter, resourceFilterRequest.advancedFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, count, sort, filter, advancedFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceFilterRequest {\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    advancedFilter: ").append(toIndentedString(advancedFilter)).append("\n");
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

