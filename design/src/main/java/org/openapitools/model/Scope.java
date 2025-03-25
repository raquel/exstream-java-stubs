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
 * Scope
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class Scope {

  private Long oid;

  private Long folder;

  private String name;

  private String description;

  public Scope oid(Long oid) {
    this.oid = oid;
    return this;
  }

  /**
   * Get oid
   * @return oid
  */
  
  @Schema(name = "oid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oid")
  public Long getOid() {
    return oid;
  }

  public void setOid(Long oid) {
    this.oid = oid;
  }

  public Scope folder(Long folder) {
    this.folder = folder;
    return this;
  }

  /**
   * Get folder
   * @return folder
  */
  
  @Schema(name = "folder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("folder")
  public Long getFolder() {
    return folder;
  }

  public void setFolder(Long folder) {
    this.folder = folder;
  }

  public Scope name(String name) {
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

  public Scope description(String description) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scope scope = (Scope) o;
    return Objects.equals(this.oid, scope.oid) &&
        Objects.equals(this.folder, scope.folder) &&
        Objects.equals(this.name, scope.name) &&
        Objects.equals(this.description, scope.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oid, folder, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scope {\n");
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

