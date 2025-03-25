package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * FragmentRefRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:40:32.411824350Z[Europe/Lisbon]")
public class FragmentRefRequest {

  private UUID refId;

  private Boolean isSelected;

  private String name;

  private Boolean isPinned;

  public FragmentRefRequest refId(UUID refId) {
    this.refId = refId;
    return this;
  }

  /**
   * Get refId
   * @return refId
  */
  @Valid 
  @Schema(name = "refId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refId")
  public UUID getRefId() {
    return refId;
  }

  public void setRefId(UUID refId) {
    this.refId = refId;
  }

  public FragmentRefRequest isSelected(Boolean isSelected) {
    this.isSelected = isSelected;
    return this;
  }

  /**
   * Get isSelected
   * @return isSelected
  */
  
  @Schema(name = "isSelected", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isSelected")
  public Boolean getIsSelected() {
    return isSelected;
  }

  public void setIsSelected(Boolean isSelected) {
    this.isSelected = isSelected;
  }

  public FragmentRefRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FragmentRefRequest isPinned(Boolean isPinned) {
    this.isPinned = isPinned;
    return this;
  }

  /**
   * Get isPinned
   * @return isPinned
  */
  
  @Schema(name = "isPinned", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isPinned")
  public Boolean getIsPinned() {
    return isPinned;
  }

  public void setIsPinned(Boolean isPinned) {
    this.isPinned = isPinned;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FragmentRefRequest fragmentRefRequest = (FragmentRefRequest) o;
    return Objects.equals(this.refId, fragmentRefRequest.refId) &&
        Objects.equals(this.isSelected, fragmentRefRequest.isSelected) &&
        Objects.equals(this.name, fragmentRefRequest.name) &&
        Objects.equals(this.isPinned, fragmentRefRequest.isPinned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refId, isSelected, name, isPinned);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FragmentRefRequest {\n");
    sb.append("    refId: ").append(toIndentedString(refId)).append("\n");
    sb.append("    isSelected: ").append(toIndentedString(isSelected)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isPinned: ").append(toIndentedString(isPinned)).append("\n");
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

