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
 * TenantsConfiguration
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:04:36.667726893Z[Europe/Lisbon]")
public class TenantsConfiguration {

  private Boolean autoSchemaManagement;

  public TenantsConfiguration autoSchemaManagement(Boolean autoSchemaManagement) {
    this.autoSchemaManagement = autoSchemaManagement;
    return this;
  }

  /**
   * Get autoSchemaManagement
   * @return autoSchemaManagement
  */
  
  @Schema(name = "autoSchemaManagement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autoSchemaManagement")
  public Boolean getAutoSchemaManagement() {
    return autoSchemaManagement;
  }

  public void setAutoSchemaManagement(Boolean autoSchemaManagement) {
    this.autoSchemaManagement = autoSchemaManagement;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantsConfiguration tenantsConfiguration = (TenantsConfiguration) o;
    return Objects.equals(this.autoSchemaManagement, tenantsConfiguration.autoSchemaManagement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoSchemaManagement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantsConfiguration {\n");
    sb.append("    autoSchemaManagement: ").append(toIndentedString(autoSchemaManagement)).append("\n");
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

