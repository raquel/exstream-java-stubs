package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Approval;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ApprovalInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class ApprovalInfo {

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

  private Boolean pending;

  @Valid
  private List<@Valid Approval> approvals;

  public ApprovalInfo state(StateEnum state) {
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

  public ApprovalInfo pending(Boolean pending) {
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

  public ApprovalInfo approvals(List<@Valid Approval> approvals) {
    this.approvals = approvals;
    return this;
  }

  public ApprovalInfo addApprovalsItem(Approval approvalsItem) {
    if (this.approvals == null) {
      this.approvals = new ArrayList<>();
    }
    this.approvals.add(approvalsItem);
    return this;
  }

  /**
   * Get approvals
   * @return approvals
  */
  @Valid 
  @Schema(name = "approvals", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("approvals")
  public List<@Valid Approval> getApprovals() {
    return approvals;
  }

  public void setApprovals(List<@Valid Approval> approvals) {
    this.approvals = approvals;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApprovalInfo approvalInfo = (ApprovalInfo) o;
    return Objects.equals(this.state, approvalInfo.state) &&
        Objects.equals(this.pending, approvalInfo.pending) &&
        Objects.equals(this.approvals, approvalInfo.approvals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, pending, approvals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApprovalInfo {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    approvals: ").append(toIndentedString(approvals)).append("\n");
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

