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
 * SettingsObj
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class SettingsObj {

  private String application;

  private String name;

  private String value;

  public SettingsObj() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SettingsObj(String application, String name, String value) {
    this.application = application;
    this.name = name;
    this.value = value;
  }

  public SettingsObj application(String application) {
    this.application = application;
    return this;
  }

  /**
   * Get application
   * @return application
  */
  @NotNull 
  @Schema(name = "application", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("application")
  public String getApplication() {
    return application;
  }

  public void setApplication(String application) {
    this.application = application;
  }

  public SettingsObj name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SettingsObj value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @NotNull @Size(min = 1, max = 1024) 
  @Schema(name = "value", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingsObj settingsObj = (SettingsObj) o;
    return Objects.equals(this.application, settingsObj.application) &&
        Objects.equals(this.name, settingsObj.name) &&
        Objects.equals(this.value, settingsObj.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsObj {\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

