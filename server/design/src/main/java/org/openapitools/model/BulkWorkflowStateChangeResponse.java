package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ResourceVersion;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BulkWorkflowStateChangeResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class BulkWorkflowStateChangeResponse {

  @Valid
  private List<@Valid ResourceVersion> stateChangedResources;

  @Valid
  private List<@Valid ResourceVersion> domainNotFoundExceptionResources;

  @Valid
  private List<@Valid ResourceVersion> permissionDeniedExceptionResources;

  @Valid
  private List<@Valid ResourceVersion> resourceLockedExceptionResources;

  @Valid
  private List<@Valid ResourceVersion> invalidStateForUpdateExceptionResources;

  @Valid
  private List<@Valid ResourceVersion> notAllChildrenApprovedExceptionResources;

  @Valid
  private List<@Valid ResourceVersion> workflowExceptionResources;

  @Valid
  private List<@Valid ResourceVersion> unexpectedExceptionResources;

  @Valid
  private List<@Valid ResourceVersion> errorResources;

  public BulkWorkflowStateChangeResponse stateChangedResources(List<@Valid ResourceVersion> stateChangedResources) {
    this.stateChangedResources = stateChangedResources;
    return this;
  }

  public BulkWorkflowStateChangeResponse addStateChangedResourcesItem(ResourceVersion stateChangedResourcesItem) {
    if (this.stateChangedResources == null) {
      this.stateChangedResources = new ArrayList<>();
    }
    this.stateChangedResources.add(stateChangedResourcesItem);
    return this;
  }

  /**
   * Get stateChangedResources
   * @return stateChangedResources
  */
  @Valid 
  @Schema(name = "stateChangedResources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stateChangedResources")
  public List<@Valid ResourceVersion> getStateChangedResources() {
    return stateChangedResources;
  }

  public void setStateChangedResources(List<@Valid ResourceVersion> stateChangedResources) {
    this.stateChangedResources = stateChangedResources;
  }

  public BulkWorkflowStateChangeResponse domainNotFoundExceptionResources(List<@Valid ResourceVersion> domainNotFoundExceptionResources) {
    this.domainNotFoundExceptionResources = domainNotFoundExceptionResources;
    return this;
  }

  public BulkWorkflowStateChangeResponse addDomainNotFoundExceptionResourcesItem(ResourceVersion domainNotFoundExceptionResourcesItem) {
    if (this.domainNotFoundExceptionResources == null) {
      this.domainNotFoundExceptionResources = new ArrayList<>();
    }
    this.domainNotFoundExceptionResources.add(domainNotFoundExceptionResourcesItem);
    return this;
  }

  /**
   * Get domainNotFoundExceptionResources
   * @return domainNotFoundExceptionResources
  */
  @Valid 
  @Schema(name = "domainNotFoundExceptionResources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("domainNotFoundExceptionResources")
  public List<@Valid ResourceVersion> getDomainNotFoundExceptionResources() {
    return domainNotFoundExceptionResources;
  }

  public void setDomainNotFoundExceptionResources(List<@Valid ResourceVersion> domainNotFoundExceptionResources) {
    this.domainNotFoundExceptionResources = domainNotFoundExceptionResources;
  }

  public BulkWorkflowStateChangeResponse permissionDeniedExceptionResources(List<@Valid ResourceVersion> permissionDeniedExceptionResources) {
    this.permissionDeniedExceptionResources = permissionDeniedExceptionResources;
    return this;
  }

  public BulkWorkflowStateChangeResponse addPermissionDeniedExceptionResourcesItem(ResourceVersion permissionDeniedExceptionResourcesItem) {
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
  public List<@Valid ResourceVersion> getPermissionDeniedExceptionResources() {
    return permissionDeniedExceptionResources;
  }

  public void setPermissionDeniedExceptionResources(List<@Valid ResourceVersion> permissionDeniedExceptionResources) {
    this.permissionDeniedExceptionResources = permissionDeniedExceptionResources;
  }

  public BulkWorkflowStateChangeResponse resourceLockedExceptionResources(List<@Valid ResourceVersion> resourceLockedExceptionResources) {
    this.resourceLockedExceptionResources = resourceLockedExceptionResources;
    return this;
  }

  public BulkWorkflowStateChangeResponse addResourceLockedExceptionResourcesItem(ResourceVersion resourceLockedExceptionResourcesItem) {
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
  public List<@Valid ResourceVersion> getResourceLockedExceptionResources() {
    return resourceLockedExceptionResources;
  }

  public void setResourceLockedExceptionResources(List<@Valid ResourceVersion> resourceLockedExceptionResources) {
    this.resourceLockedExceptionResources = resourceLockedExceptionResources;
  }

  public BulkWorkflowStateChangeResponse invalidStateForUpdateExceptionResources(List<@Valid ResourceVersion> invalidStateForUpdateExceptionResources) {
    this.invalidStateForUpdateExceptionResources = invalidStateForUpdateExceptionResources;
    return this;
  }

  public BulkWorkflowStateChangeResponse addInvalidStateForUpdateExceptionResourcesItem(ResourceVersion invalidStateForUpdateExceptionResourcesItem) {
    if (this.invalidStateForUpdateExceptionResources == null) {
      this.invalidStateForUpdateExceptionResources = new ArrayList<>();
    }
    this.invalidStateForUpdateExceptionResources.add(invalidStateForUpdateExceptionResourcesItem);
    return this;
  }

  /**
   * Get invalidStateForUpdateExceptionResources
   * @return invalidStateForUpdateExceptionResources
  */
  @Valid 
  @Schema(name = "invalidStateForUpdateExceptionResources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invalidStateForUpdateExceptionResources")
  public List<@Valid ResourceVersion> getInvalidStateForUpdateExceptionResources() {
    return invalidStateForUpdateExceptionResources;
  }

  public void setInvalidStateForUpdateExceptionResources(List<@Valid ResourceVersion> invalidStateForUpdateExceptionResources) {
    this.invalidStateForUpdateExceptionResources = invalidStateForUpdateExceptionResources;
  }

  public BulkWorkflowStateChangeResponse notAllChildrenApprovedExceptionResources(List<@Valid ResourceVersion> notAllChildrenApprovedExceptionResources) {
    this.notAllChildrenApprovedExceptionResources = notAllChildrenApprovedExceptionResources;
    return this;
  }

  public BulkWorkflowStateChangeResponse addNotAllChildrenApprovedExceptionResourcesItem(ResourceVersion notAllChildrenApprovedExceptionResourcesItem) {
    if (this.notAllChildrenApprovedExceptionResources == null) {
      this.notAllChildrenApprovedExceptionResources = new ArrayList<>();
    }
    this.notAllChildrenApprovedExceptionResources.add(notAllChildrenApprovedExceptionResourcesItem);
    return this;
  }

  /**
   * Get notAllChildrenApprovedExceptionResources
   * @return notAllChildrenApprovedExceptionResources
  */
  @Valid 
  @Schema(name = "notAllChildrenApprovedExceptionResources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notAllChildrenApprovedExceptionResources")
  public List<@Valid ResourceVersion> getNotAllChildrenApprovedExceptionResources() {
    return notAllChildrenApprovedExceptionResources;
  }

  public void setNotAllChildrenApprovedExceptionResources(List<@Valid ResourceVersion> notAllChildrenApprovedExceptionResources) {
    this.notAllChildrenApprovedExceptionResources = notAllChildrenApprovedExceptionResources;
  }

  public BulkWorkflowStateChangeResponse workflowExceptionResources(List<@Valid ResourceVersion> workflowExceptionResources) {
    this.workflowExceptionResources = workflowExceptionResources;
    return this;
  }

  public BulkWorkflowStateChangeResponse addWorkflowExceptionResourcesItem(ResourceVersion workflowExceptionResourcesItem) {
    if (this.workflowExceptionResources == null) {
      this.workflowExceptionResources = new ArrayList<>();
    }
    this.workflowExceptionResources.add(workflowExceptionResourcesItem);
    return this;
  }

  /**
   * Get workflowExceptionResources
   * @return workflowExceptionResources
  */
  @Valid 
  @Schema(name = "workflowExceptionResources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workflowExceptionResources")
  public List<@Valid ResourceVersion> getWorkflowExceptionResources() {
    return workflowExceptionResources;
  }

  public void setWorkflowExceptionResources(List<@Valid ResourceVersion> workflowExceptionResources) {
    this.workflowExceptionResources = workflowExceptionResources;
  }

  public BulkWorkflowStateChangeResponse unexpectedExceptionResources(List<@Valid ResourceVersion> unexpectedExceptionResources) {
    this.unexpectedExceptionResources = unexpectedExceptionResources;
    return this;
  }

  public BulkWorkflowStateChangeResponse addUnexpectedExceptionResourcesItem(ResourceVersion unexpectedExceptionResourcesItem) {
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
  public List<@Valid ResourceVersion> getUnexpectedExceptionResources() {
    return unexpectedExceptionResources;
  }

  public void setUnexpectedExceptionResources(List<@Valid ResourceVersion> unexpectedExceptionResources) {
    this.unexpectedExceptionResources = unexpectedExceptionResources;
  }

  public BulkWorkflowStateChangeResponse errorResources(List<@Valid ResourceVersion> errorResources) {
    this.errorResources = errorResources;
    return this;
  }

  public BulkWorkflowStateChangeResponse addErrorResourcesItem(ResourceVersion errorResourcesItem) {
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
  public List<@Valid ResourceVersion> getErrorResources() {
    return errorResources;
  }

  public void setErrorResources(List<@Valid ResourceVersion> errorResources) {
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
    BulkWorkflowStateChangeResponse bulkWorkflowStateChangeResponse = (BulkWorkflowStateChangeResponse) o;
    return Objects.equals(this.stateChangedResources, bulkWorkflowStateChangeResponse.stateChangedResources) &&
        Objects.equals(this.domainNotFoundExceptionResources, bulkWorkflowStateChangeResponse.domainNotFoundExceptionResources) &&
        Objects.equals(this.permissionDeniedExceptionResources, bulkWorkflowStateChangeResponse.permissionDeniedExceptionResources) &&
        Objects.equals(this.resourceLockedExceptionResources, bulkWorkflowStateChangeResponse.resourceLockedExceptionResources) &&
        Objects.equals(this.invalidStateForUpdateExceptionResources, bulkWorkflowStateChangeResponse.invalidStateForUpdateExceptionResources) &&
        Objects.equals(this.notAllChildrenApprovedExceptionResources, bulkWorkflowStateChangeResponse.notAllChildrenApprovedExceptionResources) &&
        Objects.equals(this.workflowExceptionResources, bulkWorkflowStateChangeResponse.workflowExceptionResources) &&
        Objects.equals(this.unexpectedExceptionResources, bulkWorkflowStateChangeResponse.unexpectedExceptionResources) &&
        Objects.equals(this.errorResources, bulkWorkflowStateChangeResponse.errorResources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stateChangedResources, domainNotFoundExceptionResources, permissionDeniedExceptionResources, resourceLockedExceptionResources, invalidStateForUpdateExceptionResources, notAllChildrenApprovedExceptionResources, workflowExceptionResources, unexpectedExceptionResources, errorResources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkWorkflowStateChangeResponse {\n");
    sb.append("    stateChangedResources: ").append(toIndentedString(stateChangedResources)).append("\n");
    sb.append("    domainNotFoundExceptionResources: ").append(toIndentedString(domainNotFoundExceptionResources)).append("\n");
    sb.append("    permissionDeniedExceptionResources: ").append(toIndentedString(permissionDeniedExceptionResources)).append("\n");
    sb.append("    resourceLockedExceptionResources: ").append(toIndentedString(resourceLockedExceptionResources)).append("\n");
    sb.append("    invalidStateForUpdateExceptionResources: ").append(toIndentedString(invalidStateForUpdateExceptionResources)).append("\n");
    sb.append("    notAllChildrenApprovedExceptionResources: ").append(toIndentedString(notAllChildrenApprovedExceptionResources)).append("\n");
    sb.append("    workflowExceptionResources: ").append(toIndentedString(workflowExceptionResources)).append("\n");
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

