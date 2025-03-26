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
 * MigrationSetFilter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:04:36.667726893Z[Europe/Lisbon]")
public class MigrationSetFilter {

  private String baseFilter;

  private UUID designPackId;

  public MigrationSetFilter baseFilter(String baseFilter) {
    this.baseFilter = baseFilter;
    return this;
  }

  /**
   * Get baseFilter
   * @return baseFilter
  */
  
  @Schema(name = "baseFilter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("baseFilter")
  public String getBaseFilter() {
    return baseFilter;
  }

  public void setBaseFilter(String baseFilter) {
    this.baseFilter = baseFilter;
  }

  public MigrationSetFilter designPackId(UUID designPackId) {
    this.designPackId = designPackId;
    return this;
  }

  /**
   * Get designPackId
   * @return designPackId
  */
  @Valid 
  @Schema(name = "designPackId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("designPackId")
  public UUID getDesignPackId() {
    return designPackId;
  }

  public void setDesignPackId(UUID designPackId) {
    this.designPackId = designPackId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationSetFilter migrationSetFilter = (MigrationSetFilter) o;
    return Objects.equals(this.baseFilter, migrationSetFilter.baseFilter) &&
        Objects.equals(this.designPackId, migrationSetFilter.designPackId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseFilter, designPackId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationSetFilter {\n");
    sb.append("    baseFilter: ").append(toIndentedString(baseFilter)).append("\n");
    sb.append("    designPackId: ").append(toIndentedString(designPackId)).append("\n");
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

