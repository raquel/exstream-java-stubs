package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FlowModelSnapshot;
import org.openapitools.model.SimplePage;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PageResponseFlowModelSnapshot
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:03:17.210646522Z[Europe/Lisbon]")
public class PageResponseFlowModelSnapshot {

  private String status;

  @Valid
  private List<@Valid FlowModelSnapshot> data;

  private SimplePage page;

  public PageResponseFlowModelSnapshot status(String status) {
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

  public PageResponseFlowModelSnapshot data(List<@Valid FlowModelSnapshot> data) {
    this.data = data;
    return this;
  }

  public PageResponseFlowModelSnapshot addDataItem(FlowModelSnapshot dataItem) {
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
  public List<@Valid FlowModelSnapshot> getData() {
    return data;
  }

  public void setData(List<@Valid FlowModelSnapshot> data) {
    this.data = data;
  }

  public PageResponseFlowModelSnapshot page(SimplePage page) {
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
    PageResponseFlowModelSnapshot pageResponseFlowModelSnapshot = (PageResponseFlowModelSnapshot) o;
    return Objects.equals(this.status, pageResponseFlowModelSnapshot.status) &&
        Objects.equals(this.data, pageResponseFlowModelSnapshot.data) &&
        Objects.equals(this.page, pageResponseFlowModelSnapshot.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, data, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageResponseFlowModelSnapshot {\n");
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

