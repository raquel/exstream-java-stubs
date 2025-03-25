package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.model.Fragment;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PdfFragmentResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class PdfFragmentResponse {

  private UUID resourceId;

  @Valid
  private List<@Valid Fragment> fragments;

  public PdfFragmentResponse resourceId(UUID resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * Get resourceId
   * @return resourceId
  */
  @Valid 
  @Schema(name = "resourceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceId")
  public UUID getResourceId() {
    return resourceId;
  }

  public void setResourceId(UUID resourceId) {
    this.resourceId = resourceId;
  }

  public PdfFragmentResponse fragments(List<@Valid Fragment> fragments) {
    this.fragments = fragments;
    return this;
  }

  public PdfFragmentResponse addFragmentsItem(Fragment fragmentsItem) {
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
  @Valid 
  @Schema(name = "fragments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fragments")
  public List<@Valid Fragment> getFragments() {
    return fragments;
  }

  public void setFragments(List<@Valid Fragment> fragments) {
    this.fragments = fragments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfFragmentResponse pdfFragmentResponse = (PdfFragmentResponse) o;
    return Objects.equals(this.resourceId, pdfFragmentResponse.resourceId) &&
        Objects.equals(this.fragments, pdfFragmentResponse.fragments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, fragments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfFragmentResponse {\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    fragments: ").append(toIndentedString(fragments)).append("\n");
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

