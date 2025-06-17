package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NameIdPair;
import org.openapitools.model.Subscription;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CurrentUserResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class CurrentUserResponse {

  private String name;

  private String tenantName;

  @Valid
  private List<String> groups;

  @Valid
  private List<@Valid NameIdPair> roles;

  private Boolean isTenantAdmin;

  private Boolean isSystemAdmin;

  private Boolean isOt2TenantAdmin;

  @Valid
  private List<@Valid Subscription> ot2Subscriptions;

  public CurrentUserResponse name(String name) {
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

  public CurrentUserResponse tenantName(String tenantName) {
    this.tenantName = tenantName;
    return this;
  }

  /**
   * Get tenantName
   * @return tenantName
  */
  
  @Schema(name = "tenantName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantName")
  public String getTenantName() {
    return tenantName;
  }

  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  public CurrentUserResponse groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public CurrentUserResponse addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
  */
  
  @Schema(name = "groups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groups")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public CurrentUserResponse roles(List<@Valid NameIdPair> roles) {
    this.roles = roles;
    return this;
  }

  public CurrentUserResponse addRolesItem(NameIdPair rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
  */
  @Valid 
  @Schema(name = "roles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roles")
  public List<@Valid NameIdPair> getRoles() {
    return roles;
  }

  public void setRoles(List<@Valid NameIdPair> roles) {
    this.roles = roles;
  }

  public CurrentUserResponse isTenantAdmin(Boolean isTenantAdmin) {
    this.isTenantAdmin = isTenantAdmin;
    return this;
  }

  /**
   * Get isTenantAdmin
   * @return isTenantAdmin
  */
  
  @Schema(name = "isTenantAdmin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isTenantAdmin")
  public Boolean getIsTenantAdmin() {
    return isTenantAdmin;
  }

  public void setIsTenantAdmin(Boolean isTenantAdmin) {
    this.isTenantAdmin = isTenantAdmin;
  }

  public CurrentUserResponse isSystemAdmin(Boolean isSystemAdmin) {
    this.isSystemAdmin = isSystemAdmin;
    return this;
  }

  /**
   * Get isSystemAdmin
   * @return isSystemAdmin
  */
  
  @Schema(name = "isSystemAdmin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isSystemAdmin")
  public Boolean getIsSystemAdmin() {
    return isSystemAdmin;
  }

  public void setIsSystemAdmin(Boolean isSystemAdmin) {
    this.isSystemAdmin = isSystemAdmin;
  }

  public CurrentUserResponse isOt2TenantAdmin(Boolean isOt2TenantAdmin) {
    this.isOt2TenantAdmin = isOt2TenantAdmin;
    return this;
  }

  /**
   * Get isOt2TenantAdmin
   * @return isOt2TenantAdmin
  */
  
  @Schema(name = "isOt2TenantAdmin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isOt2TenantAdmin")
  public Boolean getIsOt2TenantAdmin() {
    return isOt2TenantAdmin;
  }

  public void setIsOt2TenantAdmin(Boolean isOt2TenantAdmin) {
    this.isOt2TenantAdmin = isOt2TenantAdmin;
  }

  public CurrentUserResponse ot2Subscriptions(List<@Valid Subscription> ot2Subscriptions) {
    this.ot2Subscriptions = ot2Subscriptions;
    return this;
  }

  public CurrentUserResponse addOt2SubscriptionsItem(Subscription ot2SubscriptionsItem) {
    if (this.ot2Subscriptions == null) {
      this.ot2Subscriptions = new ArrayList<>();
    }
    this.ot2Subscriptions.add(ot2SubscriptionsItem);
    return this;
  }

  /**
   * Get ot2Subscriptions
   * @return ot2Subscriptions
  */
  @Valid 
  @Schema(name = "ot2Subscriptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ot2Subscriptions")
  public List<@Valid Subscription> getOt2Subscriptions() {
    return ot2Subscriptions;
  }

  public void setOt2Subscriptions(List<@Valid Subscription> ot2Subscriptions) {
    this.ot2Subscriptions = ot2Subscriptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentUserResponse currentUserResponse = (CurrentUserResponse) o;
    return Objects.equals(this.name, currentUserResponse.name) &&
        Objects.equals(this.tenantName, currentUserResponse.tenantName) &&
        Objects.equals(this.groups, currentUserResponse.groups) &&
        Objects.equals(this.roles, currentUserResponse.roles) &&
        Objects.equals(this.isTenantAdmin, currentUserResponse.isTenantAdmin) &&
        Objects.equals(this.isSystemAdmin, currentUserResponse.isSystemAdmin) &&
        Objects.equals(this.isOt2TenantAdmin, currentUserResponse.isOt2TenantAdmin) &&
        Objects.equals(this.ot2Subscriptions, currentUserResponse.ot2Subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, tenantName, groups, roles, isTenantAdmin, isSystemAdmin, isOt2TenantAdmin, ot2Subscriptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentUserResponse {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    isTenantAdmin: ").append(toIndentedString(isTenantAdmin)).append("\n");
    sb.append("    isSystemAdmin: ").append(toIndentedString(isSystemAdmin)).append("\n");
    sb.append("    isOt2TenantAdmin: ").append(toIndentedString(isOt2TenantAdmin)).append("\n");
    sb.append("    ot2Subscriptions: ").append(toIndentedString(ot2Subscriptions)).append("\n");
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

