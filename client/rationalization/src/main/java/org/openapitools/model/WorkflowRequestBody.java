package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * WorkflowRequestBody
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:40:32.411824350Z[Europe/Lisbon]")
public class WorkflowRequestBody {

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    DRAFT("DRAFT"),
    
    REVIEW("REVIEW"),
    
    APPROVED("APPROVED"),
    
    REJECTED("REJECTED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StateEnum state;

  private String auditedComment;

  private Boolean locked;

  public WorkflowRequestBody state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public WorkflowRequestBody auditedComment(String auditedComment) {
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

  public WorkflowRequestBody locked(Boolean locked) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowRequestBody workflowRequestBody = (WorkflowRequestBody) o;
    return Objects.equals(this.state, workflowRequestBody.state) &&
        Objects.equals(this.auditedComment, workflowRequestBody.auditedComment) &&
        Objects.equals(this.locked, workflowRequestBody.locked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, auditedComment, locked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowRequestBody {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    auditedComment: ").append(toIndentedString(auditedComment)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
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

