package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ResourceVersion;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataResponseResourceVersion
 */

@JsonTypeName("DataResponse&lt;ResourceVersion&gt;")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T17:54:43.132703260Z[Europe/Lisbon]")
public class DataResponseResourceVersion {

  private ResourceVersion data;

  private String status;

  public DataResponseResourceVersion data(ResourceVersion data) {
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
  public ResourceVersion getData() {
    return data;
  }

  public void setData(ResourceVersion data) {
    this.data = data;
  }

  public DataResponseResourceVersion status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataResponseResourceVersion dataResponseLessThanResourceVersionGreaterThan = (DataResponseResourceVersion) o;
    return Objects.equals(this.data, dataResponseLessThanResourceVersionGreaterThan.data) &&
        Objects.equals(this.status, dataResponseLessThanResourceVersionGreaterThan.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataResponseResourceVersion {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

