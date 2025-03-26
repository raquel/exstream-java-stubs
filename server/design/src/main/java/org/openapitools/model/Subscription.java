package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.IdName;
import org.openapitools.model.Sku;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Subscription
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class Subscription {

  private String id;

  private String name;

  private String state;

  @Valid
  private List<String> roles;

  @Valid
  private List<@Valid Sku> skus;

  private IdName application;

  private IdName tenant;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime effectiveDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expiryDate;

  private String createdBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdDate;

  private String modifiedBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime modifiedDate;

  @Valid
  private List<String> groups;

  public Subscription id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Subscription name(String name) {
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

  public Subscription state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Subscription roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public Subscription addRolesItem(String rolesItem) {
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
  
  @Schema(name = "roles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roles")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public Subscription skus(List<@Valid Sku> skus) {
    this.skus = skus;
    return this;
  }

  public Subscription addSkusItem(Sku skusItem) {
    if (this.skus == null) {
      this.skus = new ArrayList<>();
    }
    this.skus.add(skusItem);
    return this;
  }

  /**
   * Get skus
   * @return skus
  */
  @Valid 
  @Schema(name = "skus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skus")
  public List<@Valid Sku> getSkus() {
    return skus;
  }

  public void setSkus(List<@Valid Sku> skus) {
    this.skus = skus;
  }

  public Subscription application(IdName application) {
    this.application = application;
    return this;
  }

  /**
   * Get application
   * @return application
  */
  @Valid 
  @Schema(name = "application", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("application")
  public IdName getApplication() {
    return application;
  }

  public void setApplication(IdName application) {
    this.application = application;
  }

  public Subscription tenant(IdName tenant) {
    this.tenant = tenant;
    return this;
  }

  /**
   * Get tenant
   * @return tenant
  */
  @Valid 
  @Schema(name = "tenant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenant")
  public IdName getTenant() {
    return tenant;
  }

  public void setTenant(IdName tenant) {
    this.tenant = tenant;
  }

  public Subscription effectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * Get effectiveDate
   * @return effectiveDate
  */
  @Valid 
  @Schema(name = "effectiveDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("effectiveDate")
  public OffsetDateTime getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public Subscription expiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

  /**
   * Get expiryDate
   * @return expiryDate
  */
  @Valid 
  @Schema(name = "expiryDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expiryDate")
  public OffsetDateTime getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }

  public Subscription createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  */
  
  @Schema(name = "createdBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Subscription createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  */
  @Valid 
  @Schema(name = "createdDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdDate")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public Subscription modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * Get modifiedBy
   * @return modifiedBy
  */
  
  @Schema(name = "modifiedBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modifiedBy")
  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public Subscription modifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

  /**
   * Get modifiedDate
   * @return modifiedDate
  */
  @Valid 
  @Schema(name = "modifiedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modifiedDate")
  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public Subscription groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public Subscription addGroupsItem(String groupsItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.id, subscription.id) &&
        Objects.equals(this.name, subscription.name) &&
        Objects.equals(this.state, subscription.state) &&
        Objects.equals(this.roles, subscription.roles) &&
        Objects.equals(this.skus, subscription.skus) &&
        Objects.equals(this.application, subscription.application) &&
        Objects.equals(this.tenant, subscription.tenant) &&
        Objects.equals(this.effectiveDate, subscription.effectiveDate) &&
        Objects.equals(this.expiryDate, subscription.expiryDate) &&
        Objects.equals(this.createdBy, subscription.createdBy) &&
        Objects.equals(this.createdDate, subscription.createdDate) &&
        Objects.equals(this.modifiedBy, subscription.modifiedBy) &&
        Objects.equals(this.modifiedDate, subscription.modifiedDate) &&
        Objects.equals(this.groups, subscription.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, state, roles, skus, application, tenant, effectiveDate, expiryDate, createdBy, createdDate, modifiedBy, modifiedDate, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    skus: ").append(toIndentedString(skus)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

