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
 * CustomFragmentRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:04:36.667726893Z[Europe/Lisbon]")
public class CustomFragmentRequest {

  private String name;

  private String description;

  @Valid
  private List<UUID> fragments;

  private Boolean isDynamic;

  private Boolean isIncluded;

  private Integer fragTolerance;

  @Valid
  private List<@Valid FragmentRefRequest> fragOccurrences;

  public CustomFragmentRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomFragmentRequest(String name) {
    this.name = name;
  }

  public CustomFragmentRequest name(String name) {
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

  public CustomFragmentRequest description(String description) {
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

  public CustomFragmentRequest fragments(List<UUID> fragments) {
    this.fragments = fragments;
    return this;
  }

  public CustomFragmentRequest addFragmentsItem(UUID fragmentsItem) {
    if (this.fragments == null) {
      this.fragments = new ArrayList<>();
    }
    this.fragments.add(fragmentsItem);
    return this;
  }

  /**
   * Get fragments
   * @return fragments
  */
  @Valid @Size(min = 2, max = 2147483647) 
  @Schema(name = "fragments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fragments")
  public List<UUID> getFragments() {
    return fragments;
  }

  public void setFragments(List<UUID> fragments) {
    this.fragments = fragments;
  }

  public CustomFragmentRequest isDynamic(Boolean isDynamic) {
    this.isDynamic = isDynamic;
    return this;
  }

  /**
   * Get isDynamic
   * @return isDynamic
  */
  
  @Schema(name = "isDynamic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isDynamic")
  public Boolean getIsDynamic() {
    return isDynamic;
  }

  public void setIsDynamic(Boolean isDynamic) {
    this.isDynamic = isDynamic;
  }

  public CustomFragmentRequest isIncluded(Boolean isIncluded) {
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

  public CustomFragmentRequest fragTolerance(Integer fragTolerance) {
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

  public CustomFragmentRequest fragOccurrences(List<@Valid FragmentRefRequest> fragOccurrences) {
    this.fragOccurrences = fragOccurrences;
    return this;
  }

  public CustomFragmentRequest addFragOccurrencesItem(FragmentRefRequest fragOccurrencesItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFragmentRequest customFragmentRequest = (CustomFragmentRequest) o;
    return Objects.equals(this.name, customFragmentRequest.name) &&
        Objects.equals(this.description, customFragmentRequest.description) &&
        Objects.equals(this.fragments, customFragmentRequest.fragments) &&
        Objects.equals(this.isDynamic, customFragmentRequest.isDynamic) &&
        Objects.equals(this.isIncluded, customFragmentRequest.isIncluded) &&
        Objects.equals(this.fragTolerance, customFragmentRequest.fragTolerance) &&
        Objects.equals(this.fragOccurrences, customFragmentRequest.fragOccurrences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, fragments, isDynamic, isIncluded, fragTolerance, fragOccurrences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFragmentRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fragments: ").append(toIndentedString(fragments)).append("\n");
    sb.append("    isDynamic: ").append(toIndentedString(isDynamic)).append("\n");
    sb.append("    isIncluded: ").append(toIndentedString(isIncluded)).append("\n");
    sb.append("    fragTolerance: ").append(toIndentedString(fragTolerance)).append("\n");
    sb.append("    fragOccurrences: ").append(toIndentedString(fragOccurrences)).append("\n");
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

