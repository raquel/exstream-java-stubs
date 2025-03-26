package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.model.SavedResource;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BulkFavoriteResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class BulkFavoriteResponse {

  @Valid
  private List<@Valid SavedResource> favoriteResources;

  @Valid
  private List<UUID> resourceNotFoundExceptionResources;

  @Valid
  private List<UUID> unexpectedExceptionResources;

  @Valid
  private List<UUID> errorResources;

  public BulkFavoriteResponse favoriteResources(List<@Valid SavedResource> favoriteResources) {
    this.favoriteResources = favoriteResources;
    return this;
  }

  public BulkFavoriteResponse addFavoriteResourcesItem(SavedResource favoriteResourcesItem) {
    if (this.favoriteResources == null) {
      this.favoriteResources = new ArrayList<>();
    }
    this.favoriteResources.add(favoriteResourcesItem);
    return this;
  }

  /**
   * Get favoriteResources
   * @return favoriteResources
  */
  @Valid 
  @Schema(name = "favoriteResources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("favoriteResources")
  public List<@Valid SavedResource> getFavoriteResources() {
    return favoriteResources;
  }

  public void setFavoriteResources(List<@Valid SavedResource> favoriteResources) {
    this.favoriteResources = favoriteResources;
  }

  public BulkFavoriteResponse resourceNotFoundExceptionResources(List<UUID> resourceNotFoundExceptionResources) {
    this.resourceNotFoundExceptionResources = resourceNotFoundExceptionResources;
    return this;
  }

  public BulkFavoriteResponse addResourceNotFoundExceptionResourcesItem(UUID resourceNotFoundExceptionResourcesItem) {
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

  public BulkFavoriteResponse unexpectedExceptionResources(List<UUID> unexpectedExceptionResources) {
    this.unexpectedExceptionResources = unexpectedExceptionResources;
    return this;
  }

  public BulkFavoriteResponse addUnexpectedExceptionResourcesItem(UUID unexpectedExceptionResourcesItem) {
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

  public BulkFavoriteResponse errorResources(List<UUID> errorResources) {
    this.errorResources = errorResources;
    return this;
  }

  public BulkFavoriteResponse addErrorResourcesItem(UUID errorResourcesItem) {
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
    BulkFavoriteResponse bulkFavoriteResponse = (BulkFavoriteResponse) o;
    return Objects.equals(this.favoriteResources, bulkFavoriteResponse.favoriteResources) &&
        Objects.equals(this.resourceNotFoundExceptionResources, bulkFavoriteResponse.resourceNotFoundExceptionResources) &&
        Objects.equals(this.unexpectedExceptionResources, bulkFavoriteResponse.unexpectedExceptionResources) &&
        Objects.equals(this.errorResources, bulkFavoriteResponse.errorResources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(favoriteResources, resourceNotFoundExceptionResources, unexpectedExceptionResources, errorResources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkFavoriteResponse {\n");
    sb.append("    favoriteResources: ").append(toIndentedString(favoriteResources)).append("\n");
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

