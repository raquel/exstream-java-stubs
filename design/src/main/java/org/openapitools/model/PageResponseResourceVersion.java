package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ResourceVersion;
import org.openapitools.model.SimplePage;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PageResponseResourceVersion
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class PageResponseResourceVersion {

  private String status;

  @Valid
  private List<@Valid ResourceVersion> data;

  private SimplePage page;

  public PageResponseResourceVersion status(String status) {
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

  public PageResponseResourceVersion data(List<@Valid ResourceVersion> data) {
    this.data = data;
    return this;
  }

  public PageResponseResourceVersion addDataItem(ResourceVersion dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public List<@Valid ResourceVersion> getData() {
    return data;
  }

  public void setData(List<@Valid ResourceVersion> data) {
    this.data = data;
  }

  public PageResponseResourceVersion page(SimplePage page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  */
  @Valid 
  @Schema(name = "page", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("page")
  public SimplePage getPage() {
    return page;
  }

  public void setPage(SimplePage page) {
    this.page = page;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageResponseResourceVersion pageResponseResourceVersion = (PageResponseResourceVersion) o;
    return Objects.equals(this.status, pageResponseResourceVersion.status) &&
        Objects.equals(this.data, pageResponseResourceVersion.data) &&
        Objects.equals(this.page, pageResponseResourceVersion.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, data, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageResponseResourceVersion {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

