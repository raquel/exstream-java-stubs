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
 * PluginMigrationConfig
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:33:52.003808146Z[Europe/Lisbon]")
public class PluginMigrationConfig {

  private String source;

  private String format;

  public PluginMigrationConfig source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  */
  
  @Schema(name = "source", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public PluginMigrationConfig format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
  */
  
  @Schema(name = "format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("format")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginMigrationConfig pluginMigrationConfig = (PluginMigrationConfig) o;
    return Objects.equals(this.source, pluginMigrationConfig.source) &&
        Objects.equals(this.format, pluginMigrationConfig.format);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, format);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginMigrationConfig {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
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

