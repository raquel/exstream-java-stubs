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
 * BulkWorkflowRequestBody
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class BulkWorkflowRequestBody {

  private String state;

  private String auditedComment;

  private Boolean locked;

  @Valid
  private List<UUID> resourceIds;

  public BulkWorkflowRequestBody state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public BulkWorkflowRequestBody auditedComment(String auditedComment) {
    this.auditedComment = auditedComment;
    return this;
  }

  /**
   * Get auditedComment
   * @return auditedComment
  */
  
  @Schema(name = "auditedComment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auditedComment")
  public String getAuditedComment() {
    return auditedComment;
  }

  public void setAuditedComment(String auditedComment) {
    this.auditedComment = auditedComment;
  }

  public BulkWorkflowRequestBody locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

  /**
   * Get locked
   * @return locked
  */
  
  @Schema(name = "locked", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locked")
  public Boolean getLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public BulkWorkflowRequestBody resourceIds(List<UUID> resourceIds) {
    this.resourceIds = resourceIds;
    return this;
  }

  public BulkWorkflowRequestBody addResourceIdsItem(UUID resourceIdsItem) {
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
    BulkWorkflowRequestBody bulkWorkflowRequestBody = (BulkWorkflowRequestBody) o;
    return Objects.equals(this.state, bulkWorkflowRequestBody.state) &&
        Objects.equals(this.auditedComment, bulkWorkflowRequestBody.auditedComment) &&
        Objects.equals(this.locked, bulkWorkflowRequestBody.locked) &&
        Objects.equals(this.resourceIds, bulkWorkflowRequestBody.resourceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, auditedComment, locked, resourceIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkWorkflowRequestBody {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    auditedComment: ").append(toIndentedString(auditedComment)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
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

