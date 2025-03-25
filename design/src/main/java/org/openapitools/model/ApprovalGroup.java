package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.ApprovalRole;
import org.openapitools.model.Domain;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ApprovalGroup
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class ApprovalGroup {

  /**
   * Gets or Sets resourceTypes
   */
  public enum ResourceTypesEnum {
    ALL("all"),
    
    DESIGNER("designer"),
    
    AUTHOR("author"),
    
    DESIGNASSET("designAsset"),
    
    COMMASSET("commAsset"),
    
    ORCHESTRATOR("orchestrator"),
    
    RESOURCEPACK("resourcepack"),
    
    EXSTRAPPLICATION("exstrapplication"),
    
    EXSTRDOCUMENT("exstrdocument"),
    
    EXSTRPAGE("exstrpage"),
    
    EXSTRCOMPONENTOBJ("exstrcomponentobj"),
    
    EXSTREMAIL("exstremail"),
    
    EXSTRENGINE("exstrengine"),
    
    EXSTRVARIABLEBASE("exstrvariablebase"),
    
    EXSTRPACKAGE("exstrpackage"),
    
    EXSTRGRAPHICALMESSAGE("exstrgraphicalmessage"),
    
    EXSTRTEXTMESSAGE("exstrtextmessage"),
    
    EXSTRPARAGRAPH("exstrparagraph"),
    
    EXSTRPARAGRAPHSECTION("exstrparagraphsection"),
    
    IMAGE("image"),
    
    SAMPLEFILE("samplefile"),
    
    EXSTRDATASOURCE("exstrdatasource"),
    
    EXSTRHTML5("exstrhtml5"),
    
    VERSIONEDTEMPLATE("versionedtemplate"),
    
    DOCUMENTDEFINITION("documentdefinition"),
    
    ENGINERUNDEF("enginerundef"),
    
    FONT("font"),
    
    FONTDEFINITION("fontdefinition"),
    
    EXSTRBARCODE("exstrbarcode"),
    
    EXSTRPAPERTYPE("exstrpapertype"),
    
    EXSTRMESSAGETYPE("exstrmessagetype"),
    
    EXSTRMETADATA("exstrmetadata"),
    
    ORCSETTINGS("orcsettings"),
    
    FLOWMODEL("flowmodel"),
    
    EXSTRCOMMUNICATIONSET("exstrcommunicationset"),
    
    EXSTROUTPUTQUEUE("exstroutputqueue"),
    
    EXSTROUTPUT("exstroutput"),
    
    EXSTRLANGUAGE("exstrlanguage"),
    
    EXSTRLOCALE("exstrlocale"),
    
    EXSTRMIGRATIONSET("exstrmigrationset"),
    
    EXSTRMESSAGING("exstrmessaging"),
    
    EXSTRMESSAGINGAUTHOR("exstrmessagingauthor"),
    
    FLOWSCRIPT("flowscript"),
    
    EXSTRNAMEDCOLOR("exstrnamedcolor"),
    
    EXSTRCOLORFAMILY("exstrcolorfamily"),
    
    EXSTRSTYLE("exstrstyle"),
    
    EXSTRSTYLESHEET("exstrstylesheet"),
    
    EXSTREVENT("exstrevent"),
    
    EXSTRRULE("exstrrule"),
    
    DASHBOARD("dashboard"),
    
    PDF("pdf");

    private String value;

    ResourceTypesEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResourceTypesEnum fromValue(String value) {
      for (ResourceTypesEnum b : ResourceTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private Set<ResourceTypesEnum> resourceTypes;

  @Valid
  private Set<@Valid ApprovalRole> approvalRoles = new LinkedHashSet<>();

  private Domain domain;

  @Valid
  private Set<@Valid ApprovalRole> roles;

  public ApprovalGroup() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApprovalGroup(Set<@Valid ApprovalRole> approvalRoles) {
    this.approvalRoles = approvalRoles;
  }

  public ApprovalGroup resourceTypes(Set<ResourceTypesEnum> resourceTypes) {
    this.resourceTypes = resourceTypes;
    return this;
  }

  public ApprovalGroup addResourceTypesItem(ResourceTypesEnum resourceTypesItem) {
    if (this.resourceTypes == null) {
      this.resourceTypes = new LinkedHashSet<>();
    }
    this.resourceTypes.add(resourceTypesItem);
    return this;
  }

  /**
   * Get resourceTypes
   * @return resourceTypes
  */
  
  @Schema(name = "resourceTypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceTypes")
  public Set<ResourceTypesEnum> getResourceTypes() {
    return resourceTypes;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setResourceTypes(Set<ResourceTypesEnum> resourceTypes) {
    this.resourceTypes = resourceTypes;
  }

  public ApprovalGroup approvalRoles(Set<@Valid ApprovalRole> approvalRoles) {
    this.approvalRoles = approvalRoles;
    return this;
  }

  public ApprovalGroup addApprovalRolesItem(ApprovalRole approvalRolesItem) {
    if (this.approvalRoles == null) {
      this.approvalRoles = new LinkedHashSet<>();
    }
    this.approvalRoles.add(approvalRolesItem);
    return this;
  }

  /**
   * Get approvalRoles
   * @return approvalRoles
  */
  @NotNull @Valid 
  @Schema(name = "approvalRoles", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("approvalRoles")
  public Set<@Valid ApprovalRole> getApprovalRoles() {
    return approvalRoles;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setApprovalRoles(Set<@Valid ApprovalRole> approvalRoles) {
    this.approvalRoles = approvalRoles;
  }

  public ApprovalGroup domain(Domain domain) {
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

  public ApprovalGroup roles(Set<@Valid ApprovalRole> roles) {
    this.roles = roles;
    return this;
  }

  public ApprovalGroup addRolesItem(ApprovalRole rolesItem) {
    if (this.roles == null) {
      this.roles = new LinkedHashSet<>();
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
  public Set<@Valid ApprovalRole> getRoles() {
    return roles;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setRoles(Set<@Valid ApprovalRole> roles) {
    this.roles = roles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApprovalGroup approvalGroup = (ApprovalGroup) o;
    return Objects.equals(this.resourceTypes, approvalGroup.resourceTypes) &&
        Objects.equals(this.approvalRoles, approvalGroup.approvalRoles) &&
        Objects.equals(this.domain, approvalGroup.domain) &&
        Objects.equals(this.roles, approvalGroup.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceTypes, approvalRoles, domain, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApprovalGroup {\n");
    sb.append("    resourceTypes: ").append(toIndentedString(resourceTypes)).append("\n");
    sb.append("    approvalRoles: ").append(toIndentedString(approvalRoles)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

