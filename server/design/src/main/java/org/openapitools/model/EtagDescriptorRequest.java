package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ResourceContentDescriptor;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EtagDescriptorRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class EtagDescriptorRequest {

  @Valid
  private List<@Valid ResourceContentDescriptor> resourceContentDescriptors;

  public EtagDescriptorRequest resourceContentDescriptors(List<@Valid ResourceContentDescriptor> resourceContentDescriptors) {
    this.resourceContentDescriptors = resourceContentDescriptors;
    return this;
  }

  public EtagDescriptorRequest addResourceContentDescriptorsItem(ResourceContentDescriptor resourceContentDescriptorsItem) {
    if (this.resourceContentDescriptors == null) {
      this.resourceContentDescriptors = new ArrayList<>();
    }
    this.resourceContentDescriptors.add(resourceContentDescriptorsItem);
    return this;
  }

  /**
   * Get resourceContentDescriptors
   * @return resourceContentDescriptors
  */
  @Valid 
  @Schema(name = "resourceContentDescriptors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceContentDescriptors")
  public List<@Valid ResourceContentDescriptor> getResourceContentDescriptors() {
    return resourceContentDescriptors;
  }

  public void setResourceContentDescriptors(List<@Valid ResourceContentDescriptor> resourceContentDescriptors) {
    this.resourceContentDescriptors = resourceContentDescriptors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EtagDescriptorRequest etagDescriptorRequest = (EtagDescriptorRequest) o;
    return Objects.equals(this.resourceContentDescriptors, etagDescriptorRequest.resourceContentDescriptors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceContentDescriptors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EtagDescriptorRequest {\n");
    sb.append("    resourceContentDescriptors: ").append(toIndentedString(resourceContentDescriptors)).append("\n");
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

