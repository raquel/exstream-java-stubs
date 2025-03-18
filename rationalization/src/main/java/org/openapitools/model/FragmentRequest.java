package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.model.FragmentRefRequest;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * FragmentRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:04:36.667726893Z[Europe/Lisbon]")
public class FragmentRequest {

  private String name;

  private String description;

  private Boolean isIncluded;

  private UUID dasId;

  private Integer fragTolerance;

  @Valid
  private List<@Valid FragmentRefRequest> fragOccurrences;

  private String type;

  private Boolean isLibraryRule;

  public FragmentRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FragmentRequest(String name) {
    this.name = name;
  }

  public FragmentRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FragmentRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FragmentRequest isIncluded(Boolean isIncluded) {
    this.isIncluded = isIncluded;
    return this;
  }

  /**
   * Get isIncluded
   * @return isIncluded
  */
  
  @Schema(name = "isIncluded", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isIncluded")
  public Boolean getIsIncluded() {
    return isIncluded;
  }

  public void setIsIncluded(Boolean isIncluded) {
    this.isIncluded = isIncluded;
  }

  public FragmentRequest dasId(UUID dasId) {
    this.dasId = dasId;
    return this;
  }

  /**
   * Get dasId
   * @return dasId
  */
  @Valid 
  @Schema(name = "dasId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dasId")
  public UUID getDasId() {
    return dasId;
  }

  public void setDasId(UUID dasId) {
    this.dasId = dasId;
  }

  public FragmentRequest fragTolerance(Integer fragTolerance) {
    this.fragTolerance = fragTolerance;
    return this;
  }

  /**
   * Get fragTolerance
   * @return fragTolerance
  */
  
  @Schema(name = "fragTolerance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fragTolerance")
  public Integer getFragTolerance() {
    return fragTolerance;
  }

  public void setFragTolerance(Integer fragTolerance) {
    this.fragTolerance = fragTolerance;
  }

  public FragmentRequest fragOccurrences(List<@Valid FragmentRefRequest> fragOccurrences) {
    this.fragOccurrences = fragOccurrences;
    return this;
  }

  public FragmentRequest addFragOccurrencesItem(FragmentRefRequest fragOccurrencesItem) {
    if (this.fragOccurrences == null) {
      this.fragOccurrences = new ArrayList<>();
    }
    this.fragOccurrences.add(fragOccurrencesItem);
    return this;
  }

  /**
   * Get fragOccurrences
   * @return fragOccurrences
  */
  @Valid 
  @Schema(name = "fragOccurrences", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fragOccurrences")
  public List<@Valid FragmentRefRequest> getFragOccurrences() {
    return fragOccurrences;
  }

  public void setFragOccurrences(List<@Valid FragmentRefRequest> fragOccurrences) {
    this.fragOccurrences = fragOccurrences;
  }

  public FragmentRequest type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FragmentRequest isLibraryRule(Boolean isLibraryRule) {
    this.isLibraryRule = isLibraryRule;
    return this;
  }

  /**
   * Get isLibraryRule
   * @return isLibraryRule
  */
  
  @Schema(name = "isLibraryRule", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isLibraryRule")
  public Boolean getIsLibraryRule() {
    return isLibraryRule;
  }

  public void setIsLibraryRule(Boolean isLibraryRule) {
    this.isLibraryRule = isLibraryRule;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FragmentRequest fragmentRequest = (FragmentRequest) o;
    return Objects.equals(this.name, fragmentRequest.name) &&
        Objects.equals(this.description, fragmentRequest.description) &&
        Objects.equals(this.isIncluded, fragmentRequest.isIncluded) &&
        Objects.equals(this.dasId, fragmentRequest.dasId) &&
        Objects.equals(this.fragTolerance, fragmentRequest.fragTolerance) &&
        Objects.equals(this.fragOccurrences, fragmentRequest.fragOccurrences) &&
        Objects.equals(this.type, fragmentRequest.type) &&
        Objects.equals(this.isLibraryRule, fragmentRequest.isLibraryRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, isIncluded, dasId, fragTolerance, fragOccurrences, type, isLibraryRule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FragmentRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isIncluded: ").append(toIndentedString(isIncluded)).append("\n");
    sb.append("    dasId: ").append(toIndentedString(dasId)).append("\n");
    sb.append("    fragTolerance: ").append(toIndentedString(fragTolerance)).append("\n");
    sb.append("    fragOccurrences: ").append(toIndentedString(fragOccurrences)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isLibraryRule: ").append(toIndentedString(isLibraryRule)).append("\n");
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

