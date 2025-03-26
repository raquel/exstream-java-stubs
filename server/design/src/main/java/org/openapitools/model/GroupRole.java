package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.UUID;
import org.openapitools.model.Domain;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GroupRole
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class GroupRole {

  private String group;

  private String roleName;

  private Domain domain;

  private UUID roleId;

  public GroupRole group(String group) {
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

  public GroupRole roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

  /**
   * Get roleName
   * @return roleName
  */
  
  @Schema(name = "roleName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roleName")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public GroupRole domain(Domain domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Get domain
   * @return domain
  */
  @Valid 
  @Schema(name = "domain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("domain")
  public Domain getDomain() {
    return domain;
  }

  public void setDomain(Domain domain) {
    this.domain = domain;
  }

  public GroupRole roleId(UUID roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * Get roleId
   * @return roleId
  */
  @Valid 
  @Schema(name = "roleId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roleId")
  public UUID getRoleId() {
    return roleId;
  }

  public void setRoleId(UUID roleId) {
    this.roleId = roleId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupRole groupRole = (GroupRole) o;
    return Objects.equals(this.group, groupRole.group) &&
        Objects.equals(this.roleName, groupRole.roleName) &&
        Objects.equals(this.domain, groupRole.domain) &&
        Objects.equals(this.roleId, groupRole.roleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, roleName, domain, roleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupRole {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
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

