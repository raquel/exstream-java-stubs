package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Role
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class Role {

  private String name;

  private String description;

  private String appPermissions;

  private String adminPermissions;

  private UUID id;

  public Role name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @Size(min = 1, max = 255) 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Role description(String description) {
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

  public Role appPermissions(String appPermissions) {
    this.appPermissions = appPermissions;
    return this;
  }

  /**
   * Get appPermissions
   * @return appPermissions
  */
  
  @Schema(name = "appPermissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appPermissions")
  public String getAppPermissions() {
    return appPermissions;
  }

  public void setAppPermissions(String appPermissions) {
    this.appPermissions = appPermissions;
  }

  public Role adminPermissions(String adminPermissions) {
    this.adminPermissions = adminPermissions;
    return this;
  }

  /**
   * Get adminPermissions
   * @return adminPermissions
  */
  
  @Schema(name = "adminPermissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adminPermissions")
  public String getAdminPermissions() {
    return adminPermissions;
  }

  public void setAdminPermissions(String adminPermissions) {
    this.adminPermissions = adminPermissions;
  }

  public Role id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @Valid 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(this.name, role.name) &&
        Objects.equals(this.description, role.description) &&
        Objects.equals(this.appPermissions, role.appPermissions) &&
        Objects.equals(this.adminPermissions, role.adminPermissions) &&
        Objects.equals(this.id, role.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, appPermissions, adminPermissions, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    appPermissions: ").append(toIndentedString(appPermissions)).append("\n");
    sb.append("    adminPermissions: ").append(toIndentedString(adminPermissions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

