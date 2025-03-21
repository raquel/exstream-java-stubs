package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SimplePage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T17:54:43.132703260Z[Europe/Lisbon]")
public class SimplePage {

  private Integer currentPageNumber;

  private Integer pageOffset;

  private Integer pageSize;

  private Long totalElements;

  private Integer totalPages;

  public SimplePage currentPageNumber(Integer currentPageNumber) {
    this.currentPageNumber = currentPageNumber;
    return this;
  }

  /**
   * Get currentPageNumber
   * @return currentPageNumber
  */
  
  @Schema(name = "currentPageNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentPageNumber")
  public Integer getCurrentPageNumber() {
    return currentPageNumber;
  }

  public void setCurrentPageNumber(Integer currentPageNumber) {
    this.currentPageNumber = currentPageNumber;
  }

  public SimplePage pageOffset(Integer pageOffset) {
    this.pageOffset = pageOffset;
    return this;
  }

  /**
   * Get pageOffset
   * @return pageOffset
  */
  
  @Schema(name = "pageOffset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pageOffset")
  public Integer getPageOffset() {
    return pageOffset;
  }

  public void setPageOffset(Integer pageOffset) {
    this.pageOffset = pageOffset;
  }

  public SimplePage pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * @return pageSize
  */
  
  @Schema(name = "pageSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public SimplePage totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
  */
  
  @Schema(name = "totalElements", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalElements")
  public Long getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  public SimplePage totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
  */
  
  @Schema(name = "totalPages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimplePage simplePage = (SimplePage) o;
    return Objects.equals(this.currentPageNumber, simplePage.currentPageNumber) &&
        Objects.equals(this.pageOffset, simplePage.pageOffset) &&
        Objects.equals(this.pageSize, simplePage.pageSize) &&
        Objects.equals(this.totalElements, simplePage.totalElements) &&
        Objects.equals(this.totalPages, simplePage.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPageNumber, pageOffset, pageSize, totalElements, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimplePage {\n");
    sb.append("    currentPageNumber: ").append(toIndentedString(currentPageNumber)).append("\n");
    sb.append("    pageOffset: ").append(toIndentedString(pageOffset)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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

