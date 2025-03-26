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
 * FavoriteResourcesInput
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class FavoriteResourcesInput {

  @Valid
  private List<UUID> resourceIds;

  public FavoriteResourcesInput resourceIds(List<UUID> resourceIds) {
    this.resourceIds = resourceIds;
    return this;
  }

  public FavoriteResourcesInput addResourceIdsItem(UUID resourceIdsItem) {
    if (this.resourceIds == null) {
      this.resourceIds = new ArrayList<>();
    }
    this.resourceIds.add(resourceIdsItem);
    return this;
  }

  /**
   * Get resourceIds
   * @return resourceIds
  */
  @Valid 
  @Schema(name = "resourceIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceIds")
  public List<UUID> getResourceIds() {
    return resourceIds;
  }

  public void setResourceIds(List<UUID> resourceIds) {
    this.resourceIds = resourceIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FavoriteResourcesInput favoriteResourcesInput = (FavoriteResourcesInput) o;
    return Objects.equals(this.resourceIds, favoriteResourcesInput.resourceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FavoriteResourcesInput {\n");
    sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
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

