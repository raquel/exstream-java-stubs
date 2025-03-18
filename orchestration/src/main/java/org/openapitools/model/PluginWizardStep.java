package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PluginProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PluginWizardStep
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:03:17.210646522Z[Europe/Lisbon]")
public class PluginWizardStep {

  private String id;

  private String title;

  private String visible;

  @Valid
  private List<@Valid PluginProperty> properties;

  public PluginWizardStep() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PluginWizardStep(String id) {
    this.id = id;
  }

  public PluginWizardStep id(String id) {
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

  public PluginWizardStep title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PluginWizardStep visible(String visible) {
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

  public PluginWizardStep properties(List<@Valid PluginProperty> properties) {
    this.properties = properties;
    return this;
  }

  public PluginWizardStep addPropertiesItem(PluginProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

  /**
   * Get properties
   * @return properties
  */
  @Valid 
  @Schema(name = "properties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("properties")
  public List<@Valid PluginProperty> getProperties() {
    return properties;
  }

  public void setProperties(List<@Valid PluginProperty> properties) {
    this.properties = properties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginWizardStep pluginWizardStep = (PluginWizardStep) o;
    return Objects.equals(this.id, pluginWizardStep.id) &&
        Objects.equals(this.title, pluginWizardStep.title) &&
        Objects.equals(this.visible, pluginWizardStep.visible) &&
        Objects.equals(this.properties, pluginWizardStep.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, visible, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginWizardStep {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

