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
 * Approval
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class Approval {

  private String role;

  private Integer level;

  private Boolean approved;

  private Boolean pending;

  public Approval role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  */
  
  @Schema(name = "role", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public Approval level(Integer level) {
    this.level = level;
    return this;
  }

  /**
   * Get level
   * @return level
  */
  
  @Schema(name = "level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("level")
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public Approval approved(Boolean approved) {
    this.approved = approved;
    return this;
  }

  /**
   * Get approved
   * @return approved
  */
  
  @Schema(name = "approved", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("approved")
  public Boolean getApproved() {
    return approved;
  }

  public void setApproved(Boolean approved) {
    this.approved = approved;
  }

  public Approval pending(Boolean pending) {
    this.pending = pending;
    return this;
  }

  /**
   * Get pending
   * @return pending
  */
  
  @Schema(name = "pending", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pending")
  public Boolean getPending() {
    return pending;
  }

  public void setPending(Boolean pending) {
    this.pending = pending;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Approval approval = (Approval) o;
    return Objects.equals(this.role, approval.role) &&
        Objects.equals(this.level, approval.level) &&
        Objects.equals(this.approved, approval.approved) &&
        Objects.equals(this.pending, approval.pending);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, level, approved, pending);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Approval {\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
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

