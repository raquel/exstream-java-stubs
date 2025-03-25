package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.Job;
import org.openapitools.model.PageResponseFlowInstance;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * FlowInstancesAndAssociatedJobs
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:33:52.003808146Z[Europe/Lisbon]")
public class FlowInstancesAndAssociatedJobs {

  private PageResponseFlowInstance flowInstances;

  @Valid
  private Map<String, Job> jobs = new HashMap<>();

  public FlowInstancesAndAssociatedJobs flowInstances(PageResponseFlowInstance flowInstances) {
    this.flowInstances = flowInstances;
    return this;
  }

  /**
   * Get flowInstances
   * @return flowInstances
  */
  @Valid 
  @Schema(name = "flowInstances", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowInstances")
  public PageResponseFlowInstance getFlowInstances() {
    return flowInstances;
  }

  public void setFlowInstances(PageResponseFlowInstance flowInstances) {
    this.flowInstances = flowInstances;
  }

  public FlowInstancesAndAssociatedJobs jobs(Map<String, Job> jobs) {
    this.jobs = jobs;
    return this;
  }

  public FlowInstancesAndAssociatedJobs putJobsItem(String key, Job jobsItem) {
    if (this.jobs == null) {
      this.jobs = new HashMap<>();
    }
    this.jobs.put(key, jobsItem);
    return this;
  }

  /**
   * Get jobs
   * @return jobs
  */
  @Valid 
  @Schema(name = "jobs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobs")
  public Map<String, Job> getJobs() {
    return jobs;
  }

  public void setJobs(Map<String, Job> jobs) {
    this.jobs = jobs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowInstancesAndAssociatedJobs flowInstancesAndAssociatedJobs = (FlowInstancesAndAssociatedJobs) o;
    return Objects.equals(this.flowInstances, flowInstancesAndAssociatedJobs.flowInstances) &&
        Objects.equals(this.jobs, flowInstancesAndAssociatedJobs.jobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowInstances, jobs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowInstancesAndAssociatedJobs {\n");
    sb.append("    flowInstances: ").append(toIndentedString(flowInstances)).append("\n");
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
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

