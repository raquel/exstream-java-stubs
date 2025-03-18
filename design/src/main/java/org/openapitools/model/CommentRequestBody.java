package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CommentRequestBody
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class CommentRequestBody {

  private String auditedComment;

  private Boolean locked;

  public CommentRequestBody auditedComment(String auditedComment) {
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

  public CommentRequestBody locked(Boolean locked) {
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
    CommentRequestBody commentRequestBody = (CommentRequestBody) o;
    return Objects.equals(this.auditedComment, commentRequestBody.auditedComment) &&
        Objects.equals(this.locked, commentRequestBody.locked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditedComment, locked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentRequestBody {\n");
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

