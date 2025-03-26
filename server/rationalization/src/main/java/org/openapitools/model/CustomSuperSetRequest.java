package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CustomSuperSetRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:04:36.667726893Z[Europe/Lisbon]")
public class CustomSuperSetRequest {

  private String name;

  private String description;

  @Valid
  private List<UUID> fragmentRef;

  public CustomSuperSetRequest name(String name) {
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

  public CustomSuperSetRequest description(String description) {
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

  public CustomSuperSetRequest fragmentRef(List<UUID> fragmentRef) {
    this.fragmentRef = fragmentRef;
    return this;
  }

  public CustomSuperSetRequest addFragmentRefItem(UUID fragmentRefItem) {
    if (this.fragmentRef == null) {
      this.fragmentRef = new ArrayList<>();
    }
    this.fragmentRef.add(fragmentRefItem);
    return this;
  }

  /**
   * Get fragmentRef
   * @return fragmentRef
  */
  @Valid @Size(min = 2, max = 2147483647) 
  @Schema(name = "fragmentRef", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fragmentRef")
  public List<UUID> getFragmentRef() {
    return fragmentRef;
  }

  public void setFragmentRef(List<UUID> fragmentRef) {
    this.fragmentRef = fragmentRef;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomSuperSetRequest customSuperSetRequest = (CustomSuperSetRequest) o;
    return Objects.equals(this.name, customSuperSetRequest.name) &&
        Objects.equals(this.description, customSuperSetRequest.description) &&
        Objects.equals(this.fragmentRef, customSuperSetRequest.fragmentRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, fragmentRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomSuperSetRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fragmentRef: ").append(toIndentedString(fragmentRef)).append("\n");
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

