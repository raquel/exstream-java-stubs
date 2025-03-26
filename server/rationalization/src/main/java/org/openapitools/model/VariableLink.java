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
 * VariableLink
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:04:36.667726893Z[Europe/Lisbon]")
public class VariableLink {

  private UUID ratVariableId;

  private UUID dasVariableId;

  public VariableLink() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VariableLink(UUID ratVariableId, UUID dasVariableId) {
    this.ratVariableId = ratVariableId;
    this.dasVariableId = dasVariableId;
  }

  public VariableLink ratVariableId(UUID ratVariableId) {
    this.ratVariableId = ratVariableId;
    return this;
  }

  /**
   * Get ratVariableId
   * @return ratVariableId
  */
  @NotNull @Valid 
  @Schema(name = "ratVariableId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ratVariableId")
  public UUID getRatVariableId() {
    return ratVariableId;
  }

  public void setRatVariableId(UUID ratVariableId) {
    this.ratVariableId = ratVariableId;
  }

  public VariableLink dasVariableId(UUID dasVariableId) {
    this.dasVariableId = dasVariableId;
    return this;
  }

  /**
   * Get dasVariableId
   * @return dasVariableId
  */
  @NotNull @Valid 
  @Schema(name = "dasVariableId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dasVariableId")
  public UUID getDasVariableId() {
    return dasVariableId;
  }

  public void setDasVariableId(UUID dasVariableId) {
    this.dasVariableId = dasVariableId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableLink variableLink = (VariableLink) o;
    return Objects.equals(this.ratVariableId, variableLink.ratVariableId) &&
        Objects.equals(this.dasVariableId, variableLink.dasVariableId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratVariableId, dasVariableId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableLink {\n");
    sb.append("    ratVariableId: ").append(toIndentedString(ratVariableId)).append("\n");
    sb.append("    dasVariableId: ").append(toIndentedString(dasVariableId)).append("\n");
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

