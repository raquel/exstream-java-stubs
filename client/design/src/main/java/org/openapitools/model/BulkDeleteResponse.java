package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DeleteObj;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BulkDeleteResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class BulkDeleteResponse {

  @Valid
  private List<@Valid DeleteObj> deletedResources;

  @Valid
  private List<@Valid DeleteObj> invalidVersionExceptionResources;

  @Valid
  private List<@Valid DeleteObj> resourceNotFoundExceptionResources;

  @Valid
  private List<@Valid DeleteObj> resourceLockedExceptionResources;

  @Valid
  private List<@Valid DeleteObj> validationExceptionResources;

  @Valid
  private List<@Valid DeleteObj> exstreamExceptionResources;

  @Valid
  private List<@Valid DeleteObj> permissionDeniedExceptionResources;

  @Valid
  private List<@Valid DeleteObj> errorResources;

  @Valid
  private List<@Valid DeleteObj> conflictExceptionResource;

  @Valid
  private List<@Valid DeleteObj> unExpectedExceptionResource;

  public BulkDeleteResponse deletedResources(List<@Valid DeleteObj> deletedResources) {
    this.deletedResources = deletedResources;
    return this;
  }

  public BulkDeleteResponse addDeletedResourcesItem(DeleteObj deletedResourcesItem) {
    if (this.deletedResources == null) {
      this.deletedResources = new ArrayList<>();
    }
    this.deletedResources.add(deletedResourcesItem);
    return this;
  }

  /**
   * Get deletedResources
   * @return deletedResources
  */
  @Valid 
  @Schema(name = "deletedResources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deletedResources")
  public List<@Valid DeleteObj> getDeletedResources() {
    return deletedResources;
  }

  public void setDeletedResources(List<@Valid DeleteObj> deletedResources) {
    this.deletedResources = deletedResources;
  }

  public BulkDeleteResponse invalidVersionExceptionResources(List<@Valid DeleteObj> invalidVersionExceptionResources) {
    this.invalidVersionExceptionResources = invalidVersionExceptionResources;
    return this;
  }

  public BulkDeleteResponse addInvalidVersionExceptionResourcesItem(DeleteObj invalidVersionExceptionResourcesItem) {
    if (this.invalidVersionExceptionResources == null) {
      this.invalidVersionExceptionResources = new ArrayList<>();
    }
    this.invalidVersionExceptionResources.add(invalidVersionExceptionResourcesItem);
    return this;
  }

  /**
   * Get invalidVersionExceptionResources
   * @return invalidVersionExceptionResources
  */
  @Valid 
  @Schema(name = "invalidVersionExceptionResources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invalidVersionExceptionResources")
  public List<@Valid DeleteObj> getInvalidVersionExceptionResources() {
    return invalidVersionExceptionResources;
  }

  public void setInvalidVersionExceptionResources(List<@Valid DeleteObj> invalidVersionExceptionResources) {
    this.invalidVersionExceptionResources = invalidVersionExceptionResources;
  }

  public BulkDeleteResponse resourceNotFoundExceptionResources(List<@Valid DeleteObj> resourceNotFoundExceptionResources) {
    this.resourceNotFoundExceptionResources = resourceNotFoundExceptionResources;
    return this;
  }

  public BulkDeleteResponse addResourceNotFoundExceptionResourcesItem(DeleteObj resourceNotFoundExceptionResourcesItem) {
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
  public List<@Valid DeleteObj> getResourceNotFoundExceptionResources() {
    return resourceNotFoundExceptionResources;
  }

  public void setResourceNotFoundExceptionResources(List<@Valid DeleteObj> resourceNotFoundExceptionResources) {
    this.resourceNotFoundExceptionResources = resourceNotFoundExceptionResources;
  }

  public BulkDeleteResponse resourceLockedExceptionResources(List<@Valid DeleteObj> resourceLockedExceptionResources) {
    this.resourceLockedExceptionResources = resourceLockedExceptionResources;
    return this;
  }

  public BulkDeleteResponse addResourceLockedExceptionResourcesItem(DeleteObj resourceLockedExceptionResourcesItem) {
    if (this.resourceLockedExceptionResources == null) {
      this.resourceLockedExceptionResources = new ArrayList<>();
    }
    this.resourceLockedExceptionResources.add(resourceLockedExceptionResourcesItem);
    return this;
  }

  /**
   * Get resourceLockedExceptionResources
   * @return resourceLockedExceptionResources
  */
  @Valid 
  @Schema(name = "resourceLockedExceptionResources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceLockedExceptionResources")
  public List<@Valid DeleteObj> getResourceLockedExceptionResources() {
    return resourceLockedExceptionResources;
  }

  public void setResourceLockedExceptionResources(List<@Valid DeleteObj> resourceLockedExceptionResources) {
    this.resourceLockedExceptionResources = resourceLockedExceptionResources;
  }

  public BulkDeleteResponse validationExceptionResources(List<@Valid DeleteObj> validationExceptionResources) {
    this.validationExceptionResources = validationExceptionResources;
    return this;
  }

  public BulkDeleteResponse addValidationExceptionResourcesItem(DeleteObj validationExceptionResourcesItem) {
    if (this.validationExceptionResources == null) {
      this.validationExceptionResources = new ArrayList<>();
    }
    this.validationExceptionResources.add(validationExceptionResourcesItem);
    return this;
  }

  /**
   * Get validationExceptionResources
   * @return validationExceptionResources
  */
  @Valid 
  @Schema(name = "validationExceptionResources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validationExceptionResources")
  public List<@Valid DeleteObj> getValidationExceptionResources() {
    return validationExceptionResources;
  }

  public void setValidationExceptionResources(List<@Valid DeleteObj> validationExceptionResources) {
    this.validationExceptionResources = validationExceptionResources;
  }

  public BulkDeleteResponse exstreamExceptionResources(List<@Valid DeleteObj> exstreamExceptionResources) {
    this.exstreamExceptionResources = exstreamExceptionResources;
    return this;
  }

  public BulkDeleteResponse addExstreamExceptionResourcesItem(DeleteObj exstreamExceptionResourcesItem) {
    if (this.exstreamExceptionResources == null) {
      this.exstreamExceptionResources = new ArrayList<>();
    }
    this.exstreamExceptionResources.add(exstreamExceptionResourcesItem);
    return this;
  }

  /**
   * Get exstreamExceptionResources
   * @return exstreamExceptionResources
  */
  @Valid 
  @Schema(name = "exstreamExceptionResources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exstreamExceptionResources")
  public List<@Valid DeleteObj> getExstreamExceptionResources() {
    return exstreamExceptionResources;
  }

  public void setExstreamExceptionResources(List<@Valid DeleteObj> exstreamExceptionResources) {
    this.exstreamExceptionResources = exstreamExceptionResources;
  }

  public BulkDeleteResponse permissionDeniedExceptionResources(List<@Valid DeleteObj> permissionDeniedExceptionResources) {
    this.permissionDeniedExceptionResources = permissionDeniedExceptionResources;
    return this;
  }

  public BulkDeleteResponse addPermissionDeniedExceptionResourcesItem(DeleteObj permissionDeniedExceptionResourcesItem) {
    if (this.permissionDeniedExceptionResources == null) {
      this.permissionDeniedExceptionResources = new ArrayList<>();
    }
    this.permissionDeniedExceptionResources.add(permissionDeniedExceptionResourcesItem);
    return this;
  }

  /**
   * Get permissionDeniedExceptionResources
   * @return permissionDeniedExceptionResources
  */
  @Valid 
  @Schema(name = "permissionDeniedExceptionResources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permissionDeniedExceptionResources")
  public List<@Valid DeleteObj> getPermissionDeniedExceptionResources() {
    return permissionDeniedExceptionResources;
  }

  public void setPermissionDeniedExceptionResources(List<@Valid DeleteObj> permissionDeniedExceptionResources) {
    this.permissionDeniedExceptionResources = permissionDeniedExceptionResources;
  }

  public BulkDeleteResponse errorResources(List<@Valid DeleteObj> errorResources) {
    this.errorResources = errorResources;
    return this;
  }

  public BulkDeleteResponse addErrorResourcesItem(DeleteObj errorResourcesItem) {
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
  public List<@Valid DeleteObj> getErrorResources() {
    return errorResources;
  }

  public void setErrorResources(List<@Valid DeleteObj> errorResources) {
    this.errorResources = errorResources;
  }

  public BulkDeleteResponse conflictExceptionResource(List<@Valid DeleteObj> conflictExceptionResource) {
    this.conflictExceptionResource = conflictExceptionResource;
    return this;
  }

  public BulkDeleteResponse addConflictExceptionResourceItem(DeleteObj conflictExceptionResourceItem) {
    if (this.conflictExceptionResource == null) {
      this.conflictExceptionResource = new ArrayList<>();
    }
    this.conflictExceptionResource.add(conflictExceptionResourceItem);
    return this;
  }

  /**
   * Get conflictExceptionResource
   * @return conflictExceptionResource
  */
  @Valid 
  @Schema(name = "conflictExceptionResource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conflictExceptionResource")
  public List<@Valid DeleteObj> getConflictExceptionResource() {
    return conflictExceptionResource;
  }

  public void setConflictExceptionResource(List<@Valid DeleteObj> conflictExceptionResource) {
    this.conflictExceptionResource = conflictExceptionResource;
  }

  public BulkDeleteResponse unExpectedExceptionResource(List<@Valid DeleteObj> unExpectedExceptionResource) {
    this.unExpectedExceptionResource = unExpectedExceptionResource;
    return this;
  }

  public BulkDeleteResponse addUnExpectedExceptionResourceItem(DeleteObj unExpectedExceptionResourceItem) {
    if (this.unExpectedExceptionResource == null) {
      this.unExpectedExceptionResource = new ArrayList<>();
    }
    this.unExpectedExceptionResource.add(unExpectedExceptionResourceItem);
    return this;
  }

  /**
   * Get unExpectedExceptionResource
   * @return unExpectedExceptionResource
  */
  @Valid 
  @Schema(name = "unExpectedExceptionResource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unExpectedExceptionResource")
  public List<@Valid DeleteObj> getUnExpectedExceptionResource() {
    return unExpectedExceptionResource;
  }

  public void setUnExpectedExceptionResource(List<@Valid DeleteObj> unExpectedExceptionResource) {
    this.unExpectedExceptionResource = unExpectedExceptionResource;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkDeleteResponse bulkDeleteResponse = (BulkDeleteResponse) o;
    return Objects.equals(this.deletedResources, bulkDeleteResponse.deletedResources) &&
        Objects.equals(this.invalidVersionExceptionResources, bulkDeleteResponse.invalidVersionExceptionResources) &&
        Objects.equals(this.resourceNotFoundExceptionResources, bulkDeleteResponse.resourceNotFoundExceptionResources) &&
        Objects.equals(this.resourceLockedExceptionResources, bulkDeleteResponse.resourceLockedExceptionResources) &&
        Objects.equals(this.validationExceptionResources, bulkDeleteResponse.validationExceptionResources) &&
        Objects.equals(this.exstreamExceptionResources, bulkDeleteResponse.exstreamExceptionResources) &&
        Objects.equals(this.permissionDeniedExceptionResources, bulkDeleteResponse.permissionDeniedExceptionResources) &&
        Objects.equals(this.errorResources, bulkDeleteResponse.errorResources) &&
        Objects.equals(this.conflictExceptionResource, bulkDeleteResponse.conflictExceptionResource) &&
        Objects.equals(this.unExpectedExceptionResource, bulkDeleteResponse.unExpectedExceptionResource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedResources, invalidVersionExceptionResources, resourceNotFoundExceptionResources, resourceLockedExceptionResources, validationExceptionResources, exstreamExceptionResources, permissionDeniedExceptionResources, errorResources, conflictExceptionResource, unExpectedExceptionResource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkDeleteResponse {\n");
    sb.append("    deletedResources: ").append(toIndentedString(deletedResources)).append("\n");
    sb.append("    invalidVersionExceptionResources: ").append(toIndentedString(invalidVersionExceptionResources)).append("\n");
    sb.append("    resourceNotFoundExceptionResources: ").append(toIndentedString(resourceNotFoundExceptionResources)).append("\n");
    sb.append("    resourceLockedExceptionResources: ").append(toIndentedString(resourceLockedExceptionResources)).append("\n");
    sb.append("    validationExceptionResources: ").append(toIndentedString(validationExceptionResources)).append("\n");
    sb.append("    exstreamExceptionResources: ").append(toIndentedString(exstreamExceptionResources)).append("\n");
    sb.append("    permissionDeniedExceptionResources: ").append(toIndentedString(permissionDeniedExceptionResources)).append("\n");
    sb.append("    errorResources: ").append(toIndentedString(errorResources)).append("\n");
    sb.append("    conflictExceptionResource: ").append(toIndentedString(conflictExceptionResource)).append("\n");
    sb.append("    unExpectedExceptionResource: ").append(toIndentedString(unExpectedExceptionResource)).append("\n");
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

