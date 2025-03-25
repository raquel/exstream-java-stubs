package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.SortingAsset;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataResponseSortingAsset
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:33:52.003808146Z[Europe/Lisbon]")
public class DataResponseSortingAsset {

  private String status;

  private String message;

  private String details;

  private SortingAsset data;

  public DataResponseSortingAsset status(String status) {
    this.status = status;
    return this;
  }

  /**
   * General response state
   * @return status
  */
  
  @Schema(name = "status", example = "success|failure", description = "General response state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DataResponseSortingAsset message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Status code as a string representation (optional)
   * @return message
  */
  
  @Schema(name = "message", description = "Status code as a string representation (optional)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public DataResponseSortingAsset details(String details) {
    this.details = details;
    return this;
  }

  /**
   * Detailed message (optional)
   * @return details
  */
  
  @Schema(name = "details", description = "Detailed message (optional)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("details")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public DataResponseSortingAsset data(SortingAsset data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public SortingAsset getData() {
    return data;
  }

  public void setData(SortingAsset data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataResponseSortingAsset dataResponseSortingAsset = (DataResponseSortingAsset) o;
    return Objects.equals(this.status, dataResponseSortingAsset.status) &&
        Objects.equals(this.message, dataResponseSortingAsset.message) &&
        Objects.equals(this.details, dataResponseSortingAsset.details) &&
        Objects.equals(this.data, dataResponseSortingAsset.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, details, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataResponseSortingAsset {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

