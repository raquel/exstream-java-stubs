package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UpdateRationalizationActivityRequest
 */

@JsonTypeName("updateRationalizationActivity_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:40:32.411824350Z[Europe/Lisbon]")
public class UpdateRationalizationActivityRequest {

  private org.springframework.core.io.Resource bundle;

  public UpdateRationalizationActivityRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateRationalizationActivityRequest(org.springframework.core.io.Resource bundle) {
    this.bundle = bundle;
  }

  public UpdateRationalizationActivityRequest bundle(org.springframework.core.io.Resource bundle) {
    this.bundle = bundle;
    return this;
  }

  /**
   * Get bundle
   * @return bundle
  */
  @NotNull @Valid 
  @Schema(name = "bundle", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("bundle")
  public org.springframework.core.io.Resource getBundle() {
    return bundle;
  }

  public void setBundle(org.springframework.core.io.Resource bundle) {
    this.bundle = bundle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRationalizationActivityRequest updateRationalizationActivityRequest = (UpdateRationalizationActivityRequest) o;
    return Objects.equals(this.bundle, updateRationalizationActivityRequest.bundle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRationalizationActivityRequest {\n");
    sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
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

