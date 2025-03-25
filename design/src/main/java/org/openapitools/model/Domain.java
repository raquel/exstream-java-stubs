package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ApprovalGroup;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Domain
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class Domain {

  private String id;

  private Boolean production;

  private String description;

  private Boolean jobTracing;

  /**
   * Gets or Sets workflow
   */
  public enum WorkflowEnum {
    NORMAL("NORMAL"),
    
    SIMPLE("SIMPLE"),
    
    ADVANCED("ADVANCED");

    private String value;

    WorkflowEnum(String value) {
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
    public static WorkflowEnum fromValue(String value) {
      for (WorkflowEnum b : WorkflowEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private WorkflowEnum workflow;

  private Boolean restrictApproval;

  @Valid
  private List<@Valid Domain> children;

  private String parent;

  private Boolean editable;

  @Valid
  private List<@Valid ApprovalGroup> approvalGroups;

  public Domain id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @Size(min = 1, max = 255) 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Domain production(Boolean production) {
    this.production = production;
    return this;
  }

  /**
   * Get production
   * @return production
  */
  
  @Schema(name = "production", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("production")
  public Boolean getProduction() {
    return production;
  }

  public void setProduction(Boolean production) {
    this.production = production;
  }

  public Domain description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Domain jobTracing(Boolean jobTracing) {
    this.jobTracing = jobTracing;
    return this;
  }

  /**
   * Get jobTracing
   * @return jobTracing
  */
  
  @Schema(name = "jobTracing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobTracing")
  public Boolean getJobTracing() {
    return jobTracing;
  }

  public void setJobTracing(Boolean jobTracing) {
    this.jobTracing = jobTracing;
  }

  public Domain workflow(WorkflowEnum workflow) {
    this.workflow = workflow;
    return this;
  }

  /**
   * Get workflow
   * @return workflow
  */
  
  @Schema(name = "workflow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workflow")
  public WorkflowEnum getWorkflow() {
    return workflow;
  }

  public void setWorkflow(WorkflowEnum workflow) {
    this.workflow = workflow;
  }

  public Domain restrictApproval(Boolean restrictApproval) {
    this.restrictApproval = restrictApproval;
    return this;
  }

  /**
   * Get restrictApproval
   * @return restrictApproval
  */
  
  @Schema(name = "restrictApproval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("restrictApproval")
  public Boolean getRestrictApproval() {
    return restrictApproval;
  }

  public void setRestrictApproval(Boolean restrictApproval) {
    this.restrictApproval = restrictApproval;
  }

  public Domain children(List<@Valid Domain> children) {
    this.children = children;
    return this;
  }

  public Domain addChildrenItem(Domain childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

  /**
   * Get children
   * @return children
  */
  @Valid 
  @Schema(name = "children", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("children")
  public List<@Valid Domain> getChildren() {
    return children;
  }

  public void setChildren(List<@Valid Domain> children) {
    this.children = children;
  }

  public Domain parent(String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
  */
  
  @Schema(name = "parent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent")
  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  public Domain editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

  /**
   * Get editable
   * @return editable
  */
  
  @Schema(name = "editable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("editable")
  public Boolean getEditable() {
    return editable;
  }

  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  public Domain approvalGroups(List<@Valid ApprovalGroup> approvalGroups) {
    this.approvalGroups = approvalGroups;
    return this;
  }

  public Domain addApprovalGroupsItem(ApprovalGroup approvalGroupsItem) {
    if (this.approvalGroups == null) {
      this.approvalGroups = new ArrayList<>();
    }
    this.approvalGroups.add(approvalGroupsItem);
    return this;
  }

  /**
   * Get approvalGroups
   * @return approvalGroups
  */
  @Valid 
  @Schema(name = "approvalGroups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("approvalGroups")
  public List<@Valid ApprovalGroup> getApprovalGroups() {
    return approvalGroups;
  }

  public void setApprovalGroups(List<@Valid ApprovalGroup> approvalGroups) {
    this.approvalGroups = approvalGroups;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Domain domain = (Domain) o;
    return Objects.equals(this.id, domain.id) &&
        Objects.equals(this.production, domain.production) &&
        Objects.equals(this.description, domain.description) &&
        Objects.equals(this.jobTracing, domain.jobTracing) &&
        Objects.equals(this.workflow, domain.workflow) &&
        Objects.equals(this.restrictApproval, domain.restrictApproval) &&
        Objects.equals(this.children, domain.children) &&
        Objects.equals(this.parent, domain.parent) &&
        Objects.equals(this.editable, domain.editable) &&
        Objects.equals(this.approvalGroups, domain.approvalGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, production, description, jobTracing, workflow, restrictApproval, children, parent, editable, approvalGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Domain {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    production: ").append(toIndentedString(production)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    jobTracing: ").append(toIndentedString(jobTracing)).append("\n");
    sb.append("    workflow: ").append(toIndentedString(workflow)).append("\n");
    sb.append("    restrictApproval: ").append(toIndentedString(restrictApproval)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    approvalGroups: ").append(toIndentedString(approvalGroups)).append("\n");
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

