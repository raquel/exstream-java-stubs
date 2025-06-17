package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CollectionResource
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class CollectionResource {

  private UUID collectionId;

  private String createdBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdDate;

  private String lastModifiedBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastModifiedDate;

  private UUID resourceId;

  private Integer resourceVersion;

  public CollectionResource() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CollectionResource(UUID collectionId, UUID resourceId, Integer resourceVersion) {
    this.collectionId = collectionId;
    this.resourceId = resourceId;
    this.resourceVersion = resourceVersion;
  }

  public CollectionResource collectionId(UUID collectionId) {
    this.collectionId = collectionId;
    return this;
  }

  /**
   * Get collectionId
   * @return collectionId
  */
  @NotNull @Valid 
  @Schema(name = "collection_id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("collection_id")
  public UUID getCollectionId() {
    return collectionId;
  }

  public void setCollectionId(UUID collectionId) {
    this.collectionId = collectionId;
  }

  public CollectionResource createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  */
  
  @Schema(name = "createdBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public CollectionResource createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  */
  @Valid 
  @Schema(name = "createdDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdDate")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public CollectionResource lastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  /**
   * Get lastModifiedBy
   * @return lastModifiedBy
  */
  
  @Schema(name = "lastModifiedBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastModifiedBy")
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public CollectionResource lastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

  /**
   * Get lastModifiedDate
   * @return lastModifiedDate
  */
  @Valid 
  @Schema(name = "lastModifiedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastModifiedDate")
  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  public CollectionResource resourceId(UUID resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * Get resourceId
   * @return resourceId
  */
  @NotNull @Valid 
  @Schema(name = "resource_id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resource_id")
  public UUID getResourceId() {
    return resourceId;
  }

  public void setResourceId(UUID resourceId) {
    this.resourceId = resourceId;
  }

  public CollectionResource resourceVersion(Integer resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

  /**
   * Get resourceVersion
   * @return resourceVersion
  */
  @NotNull 
  @Schema(name = "resource_version", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resource_version")
  public Integer getResourceVersion() {
    return resourceVersion;
  }

  public void setResourceVersion(Integer resourceVersion) {
    this.resourceVersion = resourceVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionResource collectionResource = (CollectionResource) o;
    return Objects.equals(this.collectionId, collectionResource.collectionId) &&
        Objects.equals(this.createdBy, collectionResource.createdBy) &&
        Objects.equals(this.createdDate, collectionResource.createdDate) &&
        Objects.equals(this.lastModifiedBy, collectionResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, collectionResource.lastModifiedDate) &&
        Objects.equals(this.resourceId, collectionResource.resourceId) &&
        Objects.equals(this.resourceVersion, collectionResource.resourceVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectionId, createdBy, createdDate, lastModifiedBy, lastModifiedDate, resourceId, resourceVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionResource {\n");
    sb.append("    collectionId: ").append(toIndentedString(collectionId)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
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

