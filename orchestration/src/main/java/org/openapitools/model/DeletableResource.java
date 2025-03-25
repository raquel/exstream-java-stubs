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
 * DeletableResource
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:33:52.003808146Z[Europe/Lisbon]")
public class DeletableResource {

  private Boolean deletable;

  public DeletableResource deletable(Boolean deletable) {
    this.deletable = deletable;
    return this;
  }

  /**
   * Get deletable
   * @return deletable
  */
  
  @Schema(name = "deletable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deletable")
  public Boolean getDeletable() {
    return deletable;
  }

  public void setDeletable(Boolean deletable) {
    this.deletable = deletable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletableResource deletableResource = (DeletableResource) o;
    return Objects.equals(this.deletable, deletableResource.deletable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletableResource {\n");
    sb.append("    deletable: ").append(toIndentedString(deletable)).append("\n");
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

