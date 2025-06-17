package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.EngineInfo;
import org.openapitools.model.Input;
import org.openapitools.model.Output;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RunDef
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class RunDef {

  private String name;

  private String description;

  private EngineInfo engineInfo;

  @Valid
  private Map<String, Output> outputs = new HashMap<>();

  @Valid
  private Map<String, Input> inputs = new HashMap<>();

  @Valid
  private Map<String, Output> reports = new HashMap<>();

  @Valid
  private List<String> control;

  private String $schema;

  public RunDef name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RunDef description(String description) {
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

  public RunDef engineInfo(EngineInfo engineInfo) {
    this.engineInfo = engineInfo;
    return this;
  }

  /**
   * Get engineInfo
   * @return engineInfo
  */
  @Valid 
  @Schema(name = "engineInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("engineInfo")
  public EngineInfo getEngineInfo() {
    return engineInfo;
  }

  public void setEngineInfo(EngineInfo engineInfo) {
    this.engineInfo = engineInfo;
  }

  public RunDef outputs(Map<String, Output> outputs) {
    this.outputs = outputs;
    return this;
  }

  public RunDef putOutputsItem(String key, Output outputsItem) {
    if (this.outputs == null) {
      this.outputs = new HashMap<>();
    }
    this.outputs.put(key, outputsItem);
    return this;
  }

  /**
   * Get outputs
   * @return outputs
  */
  @Valid 
  @Schema(name = "outputs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("outputs")
  public Map<String, Output> getOutputs() {
    return outputs;
  }

  public void setOutputs(Map<String, Output> outputs) {
    this.outputs = outputs;
  }

  public RunDef inputs(Map<String, Input> inputs) {
    this.inputs = inputs;
    return this;
  }

  public RunDef putInputsItem(String key, Input inputsItem) {
    if (this.inputs == null) {
      this.inputs = new HashMap<>();
    }
    this.inputs.put(key, inputsItem);
    return this;
  }

  /**
   * Get inputs
   * @return inputs
  */
  @Valid 
  @Schema(name = "inputs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inputs")
  public Map<String, Input> getInputs() {
    return inputs;
  }

  public void setInputs(Map<String, Input> inputs) {
    this.inputs = inputs;
  }

  public RunDef reports(Map<String, Output> reports) {
    this.reports = reports;
    return this;
  }

  public RunDef putReportsItem(String key, Output reportsItem) {
    if (this.reports == null) {
      this.reports = new HashMap<>();
    }
    this.reports.put(key, reportsItem);
    return this;
  }

  /**
   * Get reports
   * @return reports
  */
  @Valid 
  @Schema(name = "reports", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reports")
  public Map<String, Output> getReports() {
    return reports;
  }

  public void setReports(Map<String, Output> reports) {
    this.reports = reports;
  }

  public RunDef control(List<String> control) {
    this.control = control;
    return this;
  }

  public RunDef addControlItem(String controlItem) {
    if (this.control == null) {
      this.control = new ArrayList<>();
    }
    this.control.add(controlItem);
    return this;
  }

  /**
   * Get control
   * @return control
  */
  
  @Schema(name = "control", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("control")
  public List<String> getControl() {
    return control;
  }

  public void setControl(List<String> control) {
    this.control = control;
  }

  public RunDef $schema(String $schema) {
    this.$schema = $schema;
    return this;
  }

  /**
   * Get $schema
   * @return $schema
  */
  
  @Schema(name = "$schema", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("$schema")
  public String get$Schema() {
    return $schema;
  }

  public void set$Schema(String $schema) {
    this.$schema = $schema;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunDef runDef = (RunDef) o;
    return Objects.equals(this.name, runDef.name) &&
        Objects.equals(this.description, runDef.description) &&
        Objects.equals(this.engineInfo, runDef.engineInfo) &&
        Objects.equals(this.outputs, runDef.outputs) &&
        Objects.equals(this.inputs, runDef.inputs) &&
        Objects.equals(this.reports, runDef.reports) &&
        Objects.equals(this.control, runDef.control) &&
        Objects.equals(this.$schema, runDef.$schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, engineInfo, outputs, inputs, reports, control, $schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunDef {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    engineInfo: ").append(toIndentedString(engineInfo)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
    sb.append("    control: ").append(toIndentedString(control)).append("\n");
    sb.append("    $schema: ").append(toIndentedString($schema)).append("\n");
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

