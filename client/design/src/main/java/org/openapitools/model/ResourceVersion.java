package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.openapitools.model.ApprovalInfo;
import org.openapitools.model.Domain;
import org.openapitools.model.ResourceCategory;
import org.openapitools.model.ResourceMetadata;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ResourceVersion
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class ResourceVersion {

  private ApprovalInfo approvalInfo;

  @Valid
  private Set<@Valid ResourceCategory> categories;

  private Boolean containsActiveRevisions;

  private Object content;

  private String contentMimeType;

  private String contentType;

  private String createdBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdDate;

  private String description;

  @Valid
  private Set<@Valid Domain> domains;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime effectiveEnd;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime effectiveStart;

  private Boolean hidden;

  private UUID id;

  private Boolean isTrackingRevisions;

  private String lastModifiedBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastModifiedDate;

  private Boolean latestVersion;

  private Boolean locked;

  private String lockedBy;

  private ResourceMetadata metadata;

  private String name;

  @Valid
  private List<String> permissions;

  private UUID resourcePackId;

  private UUID standardVariantId;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    DRAFT("DRAFT"),
    
    REVIEW("REVIEW"),
    
    APPROVED("APPROVED"),
    
    REJECTED("REJECTED");

    private String value;

    StateEnum(String value) {
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
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StateEnum state;

  private String stateComment;

  private String subtype;

  private Boolean systemResource;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
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

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  @Valid
  private List<@Valid ResourceVersion> variants;

  private Integer version;

  public ResourceVersion approvalInfo(ApprovalInfo approvalInfo) {
    this.approvalInfo = approvalInfo;
    return this;
  }

  /**
   * Get approvalInfo
   * @return approvalInfo
  */
  @Valid 
  @Schema(name = "approvalInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("approvalInfo")
  public ApprovalInfo getApprovalInfo() {
    return approvalInfo;
  }

  public void setApprovalInfo(ApprovalInfo approvalInfo) {
    this.approvalInfo = approvalInfo;
  }

  public ResourceVersion categories(Set<@Valid ResourceCategory> categories) {
    this.categories = categories;
    return this;
  }

  public ResourceVersion addCategoriesItem(ResourceCategory categoriesItem) {
    if (this.categories == null) {
      this.categories = new LinkedHashSet<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Get categories
   * @return categories
  */
  @Valid 
  @Schema(name = "categories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categories")
  public Set<@Valid ResourceCategory> getCategories() {
    return categories;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setCategories(Set<@Valid ResourceCategory> categories) {
    this.categories = categories;
  }

  public ResourceVersion containsActiveRevisions(Boolean containsActiveRevisions) {
    this.containsActiveRevisions = containsActiveRevisions;
    return this;
  }

  /**
   * Get containsActiveRevisions
   * @return containsActiveRevisions
  */
  
  @Schema(name = "containsActiveRevisions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("containsActiveRevisions")
  public Boolean getContainsActiveRevisions() {
    return containsActiveRevisions;
  }

  public void setContainsActiveRevisions(Boolean containsActiveRevisions) {
    this.containsActiveRevisions = containsActiveRevisions;
  }

  public ResourceVersion content(Object content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  */
  
  @Schema(name = "content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
  public Object getContent() {
    return content;
  }

  public void setContent(Object content) {
    this.content = content;
  }

  public ResourceVersion contentMimeType(String contentMimeType) {
    this.contentMimeType = contentMimeType;
    return this;
  }

  /**
   * Get contentMimeType
   * @return contentMimeType
  */
  
  @Schema(name = "contentMimeType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentMimeType")
  public String getContentMimeType() {
    return contentMimeType;
  }

  public void setContentMimeType(String contentMimeType) {
    this.contentMimeType = contentMimeType;
  }

  public ResourceVersion contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType
   * @return contentType
  */
  
  @Schema(name = "contentType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentType")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public ResourceVersion createdBy(String createdBy) {
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

  public ResourceVersion createdDate(OffsetDateTime createdDate) {
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

  public ResourceVersion description(String description) {
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

  public ResourceVersion domains(Set<@Valid Domain> domains) {
    this.domains = domains;
    return this;
  }

  public ResourceVersion addDomainsItem(Domain domainsItem) {
    if (this.domains == null) {
      this.domains = new LinkedHashSet<>();
    }
    this.domains.add(domainsItem);
    return this;
  }

  /**
   * Get domains
   * @return domains
  */
  @Valid 
  @Schema(name = "domains", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("domains")
  public Set<@Valid Domain> getDomains() {
    return domains;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setDomains(Set<@Valid Domain> domains) {
    this.domains = domains;
  }

  public ResourceVersion effectiveEnd(OffsetDateTime effectiveEnd) {
    this.effectiveEnd = effectiveEnd;
    return this;
  }

  /**
   * Get effectiveEnd
   * @return effectiveEnd
  */
  @Valid 
  @Schema(name = "effectiveEnd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("effectiveEnd")
  public OffsetDateTime getEffectiveEnd() {
    return effectiveEnd;
  }

  public void setEffectiveEnd(OffsetDateTime effectiveEnd) {
    this.effectiveEnd = effectiveEnd;
  }

  public ResourceVersion effectiveStart(OffsetDateTime effectiveStart) {
    this.effectiveStart = effectiveStart;
    return this;
  }

  /**
   * Get effectiveStart
   * @return effectiveStart
  */
  @Valid 
  @Schema(name = "effectiveStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("effectiveStart")
  public OffsetDateTime getEffectiveStart() {
    return effectiveStart;
  }

  public void setEffectiveStart(OffsetDateTime effectiveStart) {
    this.effectiveStart = effectiveStart;
  }

  public ResourceVersion hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

  /**
   * Get hidden
   * @return hidden
  */
  
  @Schema(name = "hidden", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hidden")
  public Boolean getHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public ResourceVersion id(UUID id) {
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

  public ResourceVersion isTrackingRevisions(Boolean isTrackingRevisions) {
    this.isTrackingRevisions = isTrackingRevisions;
    return this;
  }

  /**
   * Get isTrackingRevisions
   * @return isTrackingRevisions
  */
  
  @Schema(name = "isTrackingRevisions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isTrackingRevisions")
  public Boolean getIsTrackingRevisions() {
    return isTrackingRevisions;
  }

  public void setIsTrackingRevisions(Boolean isTrackingRevisions) {
    this.isTrackingRevisions = isTrackingRevisions;
  }

  public ResourceVersion lastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  /**
   * Get lastModifiedBy
   * @return lastModifiedBy
  */
  
  @Schema(name = "lastModifiedBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastModifiedBy")
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public ResourceVersion lastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

  /**
   * Get lastModifiedDate
   * @return lastModifiedDate
  */
  @Valid 
  @Schema(name = "lastModifiedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastModifiedDate")
  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  public ResourceVersion latestVersion(Boolean latestVersion) {
    this.latestVersion = latestVersion;
    return this;
  }

  /**
   * Get latestVersion
   * @return latestVersion
  */
  
  @Schema(name = "latestVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latestVersion")
  public Boolean getLatestVersion() {
    return latestVersion;
  }

  public void setLatestVersion(Boolean latestVersion) {
    this.latestVersion = latestVersion;
  }

  public ResourceVersion locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

  /**
   * Get locked
   * @return locked
  */
  
  @Schema(name = "locked", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locked")
  public Boolean getLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public ResourceVersion lockedBy(String lockedBy) {
    this.lockedBy = lockedBy;
    return this;
  }

  /**
   * Get lockedBy
   * @return lockedBy
  */
  
  @Schema(name = "lockedBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lockedBy")
  public String getLockedBy() {
    return lockedBy;
  }

  public void setLockedBy(String lockedBy) {
    this.lockedBy = lockedBy;
  }

  public ResourceVersion metadata(ResourceMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  @Valid 
  @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metadata")
  public ResourceMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(ResourceMetadata metadata) {
    this.metadata = metadata;
  }

  public ResourceVersion name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @Size(min = 1, max = 128) 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResourceVersion permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public ResourceVersion addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Get permissions
   * @return permissions
  */
  
  @Schema(name = "permissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  public ResourceVersion resourcePackId(UUID resourcePackId) {
    this.resourcePackId = resourcePackId;
    return this;
  }

  /**
   * Get resourcePackId
   * @return resourcePackId
  */
  @Valid 
  @Schema(name = "resourcePackId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourcePackId")
  public UUID getResourcePackId() {
    return resourcePackId;
  }

  public void setResourcePackId(UUID resourcePackId) {
    this.resourcePackId = resourcePackId;
  }

  public ResourceVersion standardVariantId(UUID standardVariantId) {
    this.standardVariantId = standardVariantId;
    return this;
  }

  /**
   * Get standardVariantId
   * @return standardVariantId
  */
  @Valid 
  @Schema(name = "standardVariantId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("standardVariantId")
  public UUID getStandardVariantId() {
    return standardVariantId;
  }

  public void setStandardVariantId(UUID standardVariantId) {
    this.standardVariantId = standardVariantId;
  }

  public ResourceVersion state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public ResourceVersion stateComment(String stateComment) {
    this.stateComment = stateComment;
    return this;
  }

  /**
   * Get stateComment
   * @return stateComment
  */
  
  @Schema(name = "stateComment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stateComment")
  public String getStateComment() {
    return stateComment;
  }

  public void setStateComment(String stateComment) {
    this.stateComment = stateComment;
  }

  public ResourceVersion subtype(String subtype) {
    this.subtype = subtype;
    return this;
  }

  /**
   * Get subtype
   * @return subtype
  */
  
  @Schema(name = "subtype", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subtype")
  public String getSubtype() {
    return subtype;
  }

  public void setSubtype(String subtype) {
    this.subtype = subtype;
  }

  public ResourceVersion systemResource(Boolean systemResource) {
    this.systemResource = systemResource;
    return this;
  }

  /**
   * Get systemResource
   * @return systemResource
  */
  
  @Schema(name = "systemResource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("systemResource")
  public Boolean getSystemResource() {
    return systemResource;
  }

  public void setSystemResource(Boolean systemResource) {
    this.systemResource = systemResource;
  }

  public ResourceVersion type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ResourceVersion variants(List<@Valid ResourceVersion> variants) {
    this.variants = variants;
    return this;
  }

  public ResourceVersion addVariantsItem(ResourceVersion variantsItem) {
    if (this.variants == null) {
      this.variants = new ArrayList<>();
    }
    this.variants.add(variantsItem);
    return this;
  }

  /**
   * Get variants
   * @return variants
  */
  @Valid 
  @Schema(name = "variants", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variants")
  public List<@Valid ResourceVersion> getVariants() {
    return variants;
  }

  public void setVariants(List<@Valid ResourceVersion> variants) {
    this.variants = variants;
  }

  public ResourceVersion version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceVersion resourceVersion = (ResourceVersion) o;
    return Objects.equals(this.approvalInfo, resourceVersion.approvalInfo) &&
        Objects.equals(this.categories, resourceVersion.categories) &&
        Objects.equals(this.containsActiveRevisions, resourceVersion.containsActiveRevisions) &&
        Objects.equals(this.content, resourceVersion.content) &&
        Objects.equals(this.contentMimeType, resourceVersion.contentMimeType) &&
        Objects.equals(this.contentType, resourceVersion.contentType) &&
        Objects.equals(this.createdBy, resourceVersion.createdBy) &&
        Objects.equals(this.createdDate, resourceVersion.createdDate) &&
        Objects.equals(this.description, resourceVersion.description) &&
        Objects.equals(this.domains, resourceVersion.domains) &&
        Objects.equals(this.effectiveEnd, resourceVersion.effectiveEnd) &&
        Objects.equals(this.effectiveStart, resourceVersion.effectiveStart) &&
        Objects.equals(this.hidden, resourceVersion.hidden) &&
        Objects.equals(this.id, resourceVersion.id) &&
        Objects.equals(this.isTrackingRevisions, resourceVersion.isTrackingRevisions) &&
        Objects.equals(this.lastModifiedBy, resourceVersion.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, resourceVersion.lastModifiedDate) &&
        Objects.equals(this.latestVersion, resourceVersion.latestVersion) &&
        Objects.equals(this.locked, resourceVersion.locked) &&
        Objects.equals(this.lockedBy, resourceVersion.lockedBy) &&
        Objects.equals(this.metadata, resourceVersion.metadata) &&
        Objects.equals(this.name, resourceVersion.name) &&
        Objects.equals(this.permissions, resourceVersion.permissions) &&
        Objects.equals(this.resourcePackId, resourceVersion.resourcePackId) &&
        Objects.equals(this.standardVariantId, resourceVersion.standardVariantId) &&
        Objects.equals(this.state, resourceVersion.state) &&
        Objects.equals(this.stateComment, resourceVersion.stateComment) &&
        Objects.equals(this.subtype, resourceVersion.subtype) &&
        Objects.equals(this.systemResource, resourceVersion.systemResource) &&
        Objects.equals(this.type, resourceVersion.type) &&
        Objects.equals(this.variants, resourceVersion.variants) &&
        Objects.equals(this.version, resourceVersion.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalInfo, categories, containsActiveRevisions, content, contentMimeType, contentType, createdBy, createdDate, description, domains, effectiveEnd, effectiveStart, hidden, id, isTrackingRevisions, lastModifiedBy, lastModifiedDate, latestVersion, locked, lockedBy, metadata, name, permissions, resourcePackId, standardVariantId, state, stateComment, subtype, systemResource, type, variants, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceVersion {\n");
    sb.append("    approvalInfo: ").append(toIndentedString(approvalInfo)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    containsActiveRevisions: ").append(toIndentedString(containsActiveRevisions)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    contentMimeType: ").append(toIndentedString(contentMimeType)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    effectiveEnd: ").append(toIndentedString(effectiveEnd)).append("\n");
    sb.append("    effectiveStart: ").append(toIndentedString(effectiveStart)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isTrackingRevisions: ").append(toIndentedString(isTrackingRevisions)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    lockedBy: ").append(toIndentedString(lockedBy)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    resourcePackId: ").append(toIndentedString(resourcePackId)).append("\n");
    sb.append("    standardVariantId: ").append(toIndentedString(standardVariantId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateComment: ").append(toIndentedString(stateComment)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    systemResource: ").append(toIndentedString(systemResource)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    variants: ").append(toIndentedString(variants)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

