package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OptionValue;
import org.openapitools.model.PluginDynamicOptions;
import org.openapitools.model.PluginMigrationConfig;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PluginProperty
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:03:17.210646522Z[Europe/Lisbon]")
public class PluginProperty {

  private String id;

  private String label;

  private String defaultValue;

  private String type;

  private Boolean required;

  private Boolean disabled;

  private String placeholder;

  private Integer maxLength;

  @Deprecated
  private String validator;

  @Valid
  private List<String> validators;

  private String visible;

  @Valid
  private List<@Valid OptionValue> options;

  private Integer minListRows;

  private Integer maxListRows;

  private String instruction;

  private Integer rows;

  private PluginMigrationConfig migration;

  private Boolean headers;

  private PluginDynamicOptions dynamicOptions;

  public PluginProperty() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PluginProperty(String id) {
    this.id = id;
  }

  public PluginProperty id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PluginProperty label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
  */
  
  @Schema(name = "label", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public PluginProperty defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * Get defaultValue
   * @return defaultValue
  */
  
  @Schema(name = "defaultValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultValue")
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public PluginProperty type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PluginProperty required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Get required
   * @return required
  */
  
  @Schema(name = "required", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("required")
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public PluginProperty disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Get disabled
   * @return disabled
  */
  
  @Schema(name = "disabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disabled")
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public PluginProperty placeholder(String placeholder) {
    this.placeholder = placeholder;
    return this;
  }

  /**
   * Get placeholder
   * @return placeholder
  */
  
  @Schema(name = "placeholder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placeholder")
  public String getPlaceholder() {
    return placeholder;
  }

  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }

  public PluginProperty maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

  /**
   * Get maxLength
   * @return maxLength
  */
  
  @Schema(name = "maxLength", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxLength")
  public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }

  public PluginProperty validator(String validator) {
    this.validator = validator;
    return this;
  }

  /**
   * Get validator
   * @return validator
   * @deprecated
  */
  
  @Schema(name = "validator", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validator")
  @Deprecated
  public String getValidator() {
    return validator;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setValidator(String validator) {
    this.validator = validator;
  }

  public PluginProperty validators(List<String> validators) {
    this.validators = validators;
    return this;
  }

  public PluginProperty addValidatorsItem(String validatorsItem) {
    if (this.validators == null) {
      this.validators = new ArrayList<>();
    }
    this.validators.add(validatorsItem);
    return this;
  }

  /**
   * Get validators
   * @return validators
  */
  
  @Schema(name = "validators", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validators")
  public List<String> getValidators() {
    return validators;
  }

  public void setValidators(List<String> validators) {
    this.validators = validators;
  }

  public PluginProperty visible(String visible) {
    this.visible = visible;
    return this;
  }

  /**
   * Get visible
   * @return visible
  */
  
  @Schema(name = "visible", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visible")
  public String getVisible() {
    return visible;
  }

  public void setVisible(String visible) {
    this.visible = visible;
  }

  public PluginProperty options(List<@Valid OptionValue> options) {
    this.options = options;
    return this;
  }

  public PluginProperty addOptionsItem(OptionValue optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Get options
   * @return options
  */
  @Valid 
  @Schema(name = "options", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("options")
  public List<@Valid OptionValue> getOptions() {
    return options;
  }

  public void setOptions(List<@Valid OptionValue> options) {
    this.options = options;
  }

  public PluginProperty minListRows(Integer minListRows) {
    this.minListRows = minListRows;
    return this;
  }

  /**
   * Get minListRows
   * @return minListRows
  */
  
  @Schema(name = "minListRows", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minListRows")
  public Integer getMinListRows() {
    return minListRows;
  }

  public void setMinListRows(Integer minListRows) {
    this.minListRows = minListRows;
  }

  public PluginProperty maxListRows(Integer maxListRows) {
    this.maxListRows = maxListRows;
    return this;
  }

  /**
   * Get maxListRows
   * @return maxListRows
  */
  
  @Schema(name = "maxListRows", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxListRows")
  public Integer getMaxListRows() {
    return maxListRows;
  }

  public void setMaxListRows(Integer maxListRows) {
    this.maxListRows = maxListRows;
  }

  public PluginProperty instruction(String instruction) {
    this.instruction = instruction;
    return this;
  }

  /**
   * Get instruction
   * @return instruction
  */
  
  @Schema(name = "instruction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instruction")
  public String getInstruction() {
    return instruction;
  }

  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }

  public PluginProperty rows(Integer rows) {
    this.rows = rows;
    return this;
  }

  /**
   * Get rows
   * @return rows
  */
  
  @Schema(name = "rows", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rows")
  public Integer getRows() {
    return rows;
  }

  public void setRows(Integer rows) {
    this.rows = rows;
  }

  public PluginProperty migration(PluginMigrationConfig migration) {
    this.migration = migration;
    return this;
  }

  /**
   * Get migration
   * @return migration
  */
  @Valid 
  @Schema(name = "migration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("migration")
  public PluginMigrationConfig getMigration() {
    return migration;
  }

  public void setMigration(PluginMigrationConfig migration) {
    this.migration = migration;
  }

  public PluginProperty headers(Boolean headers) {
    this.headers = headers;
    return this;
  }

  /**
   * Get headers
   * @return headers
  */
  
  @Schema(name = "headers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("headers")
  public Boolean getHeaders() {
    return headers;
  }

  public void setHeaders(Boolean headers) {
    this.headers = headers;
  }

  public PluginProperty dynamicOptions(PluginDynamicOptions dynamicOptions) {
    this.dynamicOptions = dynamicOptions;
    return this;
  }

  /**
   * Get dynamicOptions
   * @return dynamicOptions
  */
  @Valid 
  @Schema(name = "dynamicOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dynamicOptions")
  public PluginDynamicOptions getDynamicOptions() {
    return dynamicOptions;
  }

  public void setDynamicOptions(PluginDynamicOptions dynamicOptions) {
    this.dynamicOptions = dynamicOptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginProperty pluginProperty = (PluginProperty) o;
    return Objects.equals(this.id, pluginProperty.id) &&
        Objects.equals(this.label, pluginProperty.label) &&
        Objects.equals(this.defaultValue, pluginProperty.defaultValue) &&
        Objects.equals(this.type, pluginProperty.type) &&
        Objects.equals(this.required, pluginProperty.required) &&
        Objects.equals(this.disabled, pluginProperty.disabled) &&
        Objects.equals(this.placeholder, pluginProperty.placeholder) &&
        Objects.equals(this.maxLength, pluginProperty.maxLength) &&
        Objects.equals(this.validator, pluginProperty.validator) &&
        Objects.equals(this.validators, pluginProperty.validators) &&
        Objects.equals(this.visible, pluginProperty.visible) &&
        Objects.equals(this.options, pluginProperty.options) &&
        Objects.equals(this.minListRows, pluginProperty.minListRows) &&
        Objects.equals(this.maxListRows, pluginProperty.maxListRows) &&
        Objects.equals(this.instruction, pluginProperty.instruction) &&
        Objects.equals(this.rows, pluginProperty.rows) &&
        Objects.equals(this.migration, pluginProperty.migration) &&
        Objects.equals(this.headers, pluginProperty.headers) &&
        Objects.equals(this.dynamicOptions, pluginProperty.dynamicOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, defaultValue, type, required, disabled, placeholder, maxLength, validator, validators, visible, options, minListRows, maxListRows, instruction, rows, migration, headers, dynamicOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginProperty {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    validator: ").append(toIndentedString(validator)).append("\n");
    sb.append("    validators: ").append(toIndentedString(validators)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    minListRows: ").append(toIndentedString(minListRows)).append("\n");
    sb.append("    maxListRows: ").append(toIndentedString(maxListRows)).append("\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    migration: ").append(toIndentedString(migration)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    dynamicOptions: ").append(toIndentedString(dynamicOptions)).append("\n");
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

