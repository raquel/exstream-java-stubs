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
 * BulkUnfavoriteResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class BulkUnfavoriteResponse {

  @Valid
  private List<UUID> removedFavorites;

  @Valid
  private List<UUID> resourceNotFoundExceptionResources;

  @Valid
  private List<UUID> unexpectedExceptionResources;

  @Valid
  private List<UUID> errorResources;

  public BulkUnfavoriteResponse removedFavorites(List<UUID> removedFavorites) {
    this.removedFavorites = removedFavorites;
    return this;
  }

  public BulkUnfavoriteResponse addRemovedFavoritesItem(UUID removedFavoritesItem) {
    if (this.removedFavorites == null) {
      this.removedFavorites = new ArrayList<>();
    }
    this.removedFavorites.add(removedFavoritesItem);
    return this;
  }

  /**
   * Get removedFavorites
   * @return removedFavorites
  */
  @Valid 
  @Schema(name = "removedFavorites", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("removedFavorites")
  public List<UUID> getRemovedFavorites() {
    return removedFavorites;
  }

  public void setRemovedFavorites(List<UUID> removedFavorites) {
    this.removedFavorites = removedFavorites;
  }

  public BulkUnfavoriteResponse resourceNotFoundExceptionResources(List<UUID> resourceNotFoundExceptionResources) {
    this.resourceNotFoundExceptionResources = resourceNotFoundExceptionResources;
    return this;
  }

  public BulkUnfavoriteResponse addResourceNotFoundExceptionResourcesItem(UUID resourceNotFoundExceptionResourcesItem) {
    if (this.resourceNotFoundExceptionResources == null) {
      this.resourceNotFoundExceptionResources = new ArrayList<>();
    }
    this.resourceNotFoundExceptionResources.add(resourceNotFoundExceptionResourcesItem);
    return this;
  }

  /**
   * Get resourceNotFoundExceptionResources
   * @return resourceNotFoundExceptionResources
  */
  @Valid 
  @Schema(name = "resourceNotFoundExceptionResources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceNotFoundExceptionResources")
  public List<UUID> getResourceNotFoundExceptionResources() {
    return resourceNotFoundExceptionResources;
  }

  public void setResourceNotFoundExceptionResources(List<UUID> resourceNotFoundExceptionResources) {
    this.resourceNotFoundExceptionResources = resourceNotFoundExceptionResources;
  }

  public BulkUnfavoriteResponse unexpectedExceptionResources(List<UUID> unexpectedExceptionResources) {
    this.unexpectedExceptionResources = unexpectedExceptionResources;
    return this;
  }

  public BulkUnfavoriteResponse addUnexpectedExceptionResourcesItem(UUID unexpectedExceptionResourcesItem) {
    if (this.unexpectedExceptionResources == null) {
      this.unexpectedExceptionResources = new ArrayList<>();
    }
    this.unexpectedExceptionResources.add(unexpectedExceptionResourcesItem);
    return this;
  }

  /**
   * Get unexpectedExceptionResources
   * @return unexpectedExceptionResources
  */
  @Valid 
  @Schema(name = "unexpectedExceptionResources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unexpectedExceptionResources")
  public List<UUID> getUnexpectedExceptionResources() {
    return unexpectedExceptionResources;
  }

  public void setUnexpectedExceptionResources(List<UUID> unexpectedExceptionResources) {
    this.unexpectedExceptionResources = unexpectedExceptionResources;
  }

  public BulkUnfavoriteResponse errorResources(List<UUID> errorResources) {
    this.errorResources = errorResources;
    return this;
  }

  public BulkUnfavoriteResponse addErrorResourcesItem(UUID errorResourcesItem) {
    if (this.errorResources == null) {
      this.errorResources = new ArrayList<>();
    }
    this.errorResources.add(errorResourcesItem);
    return this;
  }

  /**
   * Get errorResources
   * @return errorResources
  */
  @Valid 
  @Schema(name = "errorResources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorResources")
  public List<UUID> getErrorResources() {
    return errorResources;
  }

  public void setErrorResources(List<UUID> errorResources) {
    this.errorResources = errorResources;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkUnfavoriteResponse bulkUnfavoriteResponse = (BulkUnfavoriteResponse) o;
    return Objects.equals(this.removedFavorites, bulkUnfavoriteResponse.removedFavorites) &&
        Objects.equals(this.resourceNotFoundExceptionResources, bulkUnfavoriteResponse.resourceNotFoundExceptionResources) &&
        Objects.equals(this.unexpectedExceptionResources, bulkUnfavoriteResponse.unexpectedExceptionResources) &&
        Objects.equals(this.errorResources, bulkUnfavoriteResponse.errorResources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(removedFavorites, resourceNotFoundExceptionResources, unexpectedExceptionResources, errorResources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkUnfavoriteResponse {\n");
    sb.append("    removedFavorites: ").append(toIndentedString(removedFavorites)).append("\n");
    sb.append("    resourceNotFoundExceptionResources: ").append(toIndentedString(resourceNotFoundExceptionResources)).append("\n");
    sb.append("    unexpectedExceptionResources: ").append(toIndentedString(unexpectedExceptionResources)).append("\n");
    sb.append("    errorResources: ").append(toIndentedString(errorResources)).append("\n");
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

