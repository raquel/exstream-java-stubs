package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * JobDeleteStatus
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:33:52.003808146Z[Europe/Lisbon]")
public class JobDeleteStatus {

  @Valid
  private Map<String, String> failedDeleteJobs = new HashMap<>();

  private Long successDeleteJobs;

  public JobDeleteStatus failedDeleteJobs(Map<String, String> failedDeleteJobs) {
    this.failedDeleteJobs = failedDeleteJobs;
    return this;
  }

  public JobDeleteStatus putFailedDeleteJobsItem(String key, String failedDeleteJobsItem) {
    if (this.failedDeleteJobs == null) {
      this.failedDeleteJobs = new HashMap<>();
    }
    this.failedDeleteJobs.put(key, failedDeleteJobsItem);
    return this;
  }

  /**
   * Get failedDeleteJobs
   * @return failedDeleteJobs
  */
  
  @Schema(name = "failedDeleteJobs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("failedDeleteJobs")
  public Map<String, String> getFailedDeleteJobs() {
    return failedDeleteJobs;
  }

  public void setFailedDeleteJobs(Map<String, String> failedDeleteJobs) {
    this.failedDeleteJobs = failedDeleteJobs;
  }

  public JobDeleteStatus successDeleteJobs(Long successDeleteJobs) {
    this.successDeleteJobs = successDeleteJobs;
    return this;
  }

  /**
   * Get successDeleteJobs
   * @return successDeleteJobs
  */
  
  @Schema(name = "successDeleteJobs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("successDeleteJobs")
  public Long getSuccessDeleteJobs() {
    return successDeleteJobs;
  }

  public void setSuccessDeleteJobs(Long successDeleteJobs) {
    this.successDeleteJobs = successDeleteJobs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDeleteStatus jobDeleteStatus = (JobDeleteStatus) o;
    return Objects.equals(this.failedDeleteJobs, jobDeleteStatus.failedDeleteJobs) &&
        Objects.equals(this.successDeleteJobs, jobDeleteStatus.successDeleteJobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failedDeleteJobs, successDeleteJobs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDeleteStatus {\n");
    sb.append("    failedDeleteJobs: ").append(toIndentedString(failedDeleteJobs)).append("\n");
    sb.append("    successDeleteJobs: ").append(toIndentedString(successDeleteJobs)).append("\n");
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

