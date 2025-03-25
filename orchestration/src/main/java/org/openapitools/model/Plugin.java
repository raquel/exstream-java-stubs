package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.PluginWizardConfig;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Plugin
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:33:52.003808146Z[Europe/Lisbon]")
public class Plugin {

  private String id;

  private String description;

  private String group;

  private String icon;

  private String iconType;

  private String label;

  private String version;

  private String locale;

  private PluginWizardConfig config;

  private String uiComponent;

  private Boolean custom;

  public Plugin() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Plugin(String id) {
    this.id = id;
  }

  public Plugin id(String id) {
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

  public Plugin description(String description) {
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

  public Plugin group(String group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
  */
  
  @Schema(name = "group", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public Plugin icon(String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
  */
  
  @Schema(name = "icon", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("icon")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public Plugin iconType(String iconType) {
    this.iconType = iconType;
    return this;
  }

  /**
   * Get iconType
   * @return iconType
  */
  
  @Schema(name = "iconType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("iconType")
  public String getIconType() {
    return iconType;
  }

  public void setIconType(String iconType) {
    this.iconType = iconType;
  }

  public Plugin label(String label) {
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

  public Plugin version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Plugin locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Get locale
   * @return locale
  */
  
  @Schema(name = "locale", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public Plugin config(PluginWizardConfig config) {
    this.config = config;
    return this;
  }

  /**
   * Get config
   * @return config
  */
  @Valid 
  @Schema(name = "config", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("config")
  public PluginWizardConfig getConfig() {
    return config;
  }

  public void setConfig(PluginWizardConfig config) {
    this.config = config;
  }

  public Plugin uiComponent(String uiComponent) {
    this.uiComponent = uiComponent;
    return this;
  }

  /**
   * Get uiComponent
   * @return uiComponent
  */
  
  @Schema(name = "uiComponent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uiComponent")
  public String getUiComponent() {
    return uiComponent;
  }

  public void setUiComponent(String uiComponent) {
    this.uiComponent = uiComponent;
  }

  public Plugin custom(Boolean custom) {
    this.custom = custom;
    return this;
  }

  /**
   * Get custom
   * @return custom
  */
  
  @Schema(name = "custom", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom")
  public Boolean getCustom() {
    return custom;
  }

  public void setCustom(Boolean custom) {
    this.custom = custom;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plugin plugin = (Plugin) o;
    return Objects.equals(this.id, plugin.id) &&
        Objects.equals(this.description, plugin.description) &&
        Objects.equals(this.group, plugin.group) &&
        Objects.equals(this.icon, plugin.icon) &&
        Objects.equals(this.iconType, plugin.iconType) &&
        Objects.equals(this.label, plugin.label) &&
        Objects.equals(this.version, plugin.version) &&
        Objects.equals(this.locale, plugin.locale) &&
        Objects.equals(this.config, plugin.config) &&
        Objects.equals(this.uiComponent, plugin.uiComponent) &&
        Objects.equals(this.custom, plugin.custom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, group, icon, iconType, label, version, locale, config, uiComponent, custom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plugin {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    iconType: ").append(toIndentedString(iconType)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    uiComponent: ").append(toIndentedString(uiComponent)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
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

