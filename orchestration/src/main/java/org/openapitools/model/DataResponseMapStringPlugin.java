package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.Plugin;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataResponseMapStringPlugin
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:03:17.210646522Z[Europe/Lisbon]")
public class DataResponseMapStringPlugin {

  private String status;

  private String message;

  private String details;

  @Valid
  private Map<String, Plugin> data = new HashMap<>();

  public DataResponseMapStringPlugin status(String status) {
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

  public DataResponseMapStringPlugin message(String message) {
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

  public DataResponseMapStringPlugin details(String details) {
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

  public DataResponseMapStringPlugin data(Map<String, Plugin> data) {
    this.data = data;
    return this;
  }

  public DataResponseMapStringPlugin putDataItem(String key, Plugin dataItem) {
    if (this.data == null) {
      this.data = new HashMap<>();
    }
    this.data.put(key, dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public Map<String, Plugin> getData() {
    return data;
  }

  public void setData(Map<String, Plugin> data) {
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
    DataResponseMapStringPlugin dataResponseMapStringPlugin = (DataResponseMapStringPlugin) o;
    return Objects.equals(this.status, dataResponseMapStringPlugin.status) &&
        Objects.equals(this.message, dataResponseMapStringPlugin.message) &&
        Objects.equals(this.details, dataResponseMapStringPlugin.details) &&
        Objects.equals(this.data, dataResponseMapStringPlugin.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, details, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataResponseMapStringPlugin {\n");
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

