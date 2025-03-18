package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FlowStep;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * FlowStepFlow
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:03:17.210646522Z[Europe/Lisbon]")
public class FlowStepFlow {

  private String inputChannel;

  @Valid
  private List<@Valid FlowStep> flowSteps;

  public FlowStepFlow inputChannel(String inputChannel) {
    this.inputChannel = inputChannel;
    return this;
  }

  /**
   * Get inputChannel
   * @return inputChannel
  */
  
  @Schema(name = "inputChannel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inputChannel")
  public String getInputChannel() {
    return inputChannel;
  }

  public void setInputChannel(String inputChannel) {
    this.inputChannel = inputChannel;
  }

  public FlowStepFlow flowSteps(List<@Valid FlowStep> flowSteps) {
    this.flowSteps = flowSteps;
    return this;
  }

  public FlowStepFlow addFlowStepsItem(FlowStep flowStepsItem) {
    if (this.flowSteps == null) {
      this.flowSteps = new ArrayList<>();
    }
    this.flowSteps.add(flowStepsItem);
    return this;
  }

  /**
   * Get flowSteps
   * @return flowSteps
  */
  @Valid 
  @Schema(name = "flowSteps", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowSteps")
  public List<@Valid FlowStep> getFlowSteps() {
    return flowSteps;
  }

  public void setFlowSteps(List<@Valid FlowStep> flowSteps) {
    this.flowSteps = flowSteps;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowStepFlow flowStepFlow = (FlowStepFlow) o;
    return Objects.equals(this.inputChannel, flowStepFlow.inputChannel) &&
        Objects.equals(this.flowSteps, flowStepFlow.flowSteps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputChannel, flowSteps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowStepFlow {\n");
    sb.append("    inputChannel: ").append(toIndentedString(inputChannel)).append("\n");
    sb.append("    flowSteps: ").append(toIndentedString(flowSteps)).append("\n");
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

