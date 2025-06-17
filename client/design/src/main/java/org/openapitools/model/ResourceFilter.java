package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.openapitools.model.ResourceCategory;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ResourceFilter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class ResourceFilter {

  @Valid
  private List<UUID> ids;

  @Valid
  private List<UUID> excludedIds;

  /**
   * Gets or Sets types
   */
  public enum TypesEnum {
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

    TypesEnum(String value) {
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
    public static TypesEnum fromValue(String value) {
      for (TypesEnum b : TypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<TypesEnum> types;

  /**
   * Gets or Sets excludedTypes
   */
  public enum ExcludedTypesEnum {
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

    ExcludedTypesEnum(String value) {
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
    public static ExcludedTypesEnum fromValue(String value) {
      for (ExcludedTypesEnum b : ExcludedTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<ExcludedTypesEnum> excludedTypes;

  private String name;

  private String description;

  private String createdBy;

  private String lastModifiedBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdDateStart;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdDateEnd;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastModifiedDateStart;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastModifiedDateEnd;

  private String searchString;

  private Boolean caseSensitive;

  private Boolean wholeWord;

  private UUID resourcePackId;

  private Boolean systemResource;

  private Boolean hidden;

  private Boolean hasApprovedVersion;

  private Boolean includeVariants;

  private UUID standardVariantId;

  private Boolean useEffectiveDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime effectiveDate;

  @Valid
  private List<String> categories;

  @Valid
  private List<@Valid ResourceCategory> categoryObjects;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime vfilterLastModifiedDateEnd;

  @Valid
  private Map<String, List<Object>> metadata = new HashMap<>();

  private String domainId;

  private Boolean latestVersion;

  private Boolean locked;

  /**
   * Gets or Sets states
   */
  public enum StatesEnum {
    DRAFT("DRAFT"),
    
    REVIEW("REVIEW"),
    
    APPROVED("APPROVED"),
    
    REJECTED("REJECTED");

    private String value;

    StatesEnum(String value) {
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
    public static StatesEnum fromValue(String value) {
      for (StatesEnum b : StatesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<StatesEnum> states;

  @Valid
  private List<UUID> overrideIds;

  /**
   * Gets or Sets overrideStates
   */
  public enum OverrideStatesEnum {
    DRAFT("DRAFT"),
    
    REVIEW("REVIEW"),
    
    APPROVED("APPROVED"),
    
    REJECTED("REJECTED");

    private String value;

    OverrideStatesEnum(String value) {
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
    public static OverrideStatesEnum fromValue(String value) {
      for (OverrideStatesEnum b : OverrideStatesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<OverrideStatesEnum> overrideStates;

  public ResourceFilter ids(List<UUID> ids) {
    this.ids = ids;
    return this;
  }

  public ResourceFilter addIdsItem(UUID idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

  /**
   * Get ids
   * @return ids
  */
  @Valid 
  @Schema(name = "ids", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ids")
  public List<UUID> getIds() {
    return ids;
  }

  public void setIds(List<UUID> ids) {
    this.ids = ids;
  }

  public ResourceFilter excludedIds(List<UUID> excludedIds) {
    this.excludedIds = excludedIds;
    return this;
  }

  public ResourceFilter addExcludedIdsItem(UUID excludedIdsItem) {
    if (this.excludedIds == null) {
      this.excludedIds = new ArrayList<>();
    }
    this.excludedIds.add(excludedIdsItem);
    return this;
  }

  /**
   * Get excludedIds
   * @return excludedIds
  */
  @Valid 
  @Schema(name = "excludedIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("excludedIds")
  public List<UUID> getExcludedIds() {
    return excludedIds;
  }

  public void setExcludedIds(List<UUID> excludedIds) {
    this.excludedIds = excludedIds;
  }

  public ResourceFilter types(List<TypesEnum> types) {
    this.types = types;
    return this;
  }

  public ResourceFilter addTypesItem(TypesEnum typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

  /**
   * Get types
   * @return types
  */
  
  @Schema(name = "types", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("types")
  public List<TypesEnum> getTypes() {
    return types;
  }

  public void setTypes(List<TypesEnum> types) {
    this.types = types;
  }

  public ResourceFilter excludedTypes(List<ExcludedTypesEnum> excludedTypes) {
    this.excludedTypes = excludedTypes;
    return this;
  }

  public ResourceFilter addExcludedTypesItem(ExcludedTypesEnum excludedTypesItem) {
    if (this.excludedTypes == null) {
      this.excludedTypes = new ArrayList<>();
    }
    this.excludedTypes.add(excludedTypesItem);
    return this;
  }

  /**
   * Get excludedTypes
   * @return excludedTypes
  */
  
  @Schema(name = "excludedTypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("excludedTypes")
  public List<ExcludedTypesEnum> getExcludedTypes() {
    return excludedTypes;
  }

  public void setExcludedTypes(List<ExcludedTypesEnum> excludedTypes) {
    this.excludedTypes = excludedTypes;
  }

  public ResourceFilter name(String name) {
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

  public ResourceFilter description(String description) {
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

  public ResourceFilter createdBy(String createdBy) {
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

  public ResourceFilter lastModifiedBy(String lastModifiedBy) {
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

  public ResourceFilter createdDateStart(OffsetDateTime createdDateStart) {
    this.createdDateStart = createdDateStart;
    return this;
  }

  /**
   * Get createdDateStart
   * @return createdDateStart
  */
  @Valid 
  @Schema(name = "createdDateStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdDateStart")
  public OffsetDateTime getCreatedDateStart() {
    return createdDateStart;
  }

  public void setCreatedDateStart(OffsetDateTime createdDateStart) {
    this.createdDateStart = createdDateStart;
  }

  public ResourceFilter createdDateEnd(OffsetDateTime createdDateEnd) {
    this.createdDateEnd = createdDateEnd;
    return this;
  }

  /**
   * Get createdDateEnd
   * @return createdDateEnd
  */
  @Valid 
  @Schema(name = "createdDateEnd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdDateEnd")
  public OffsetDateTime getCreatedDateEnd() {
    return createdDateEnd;
  }

  public void setCreatedDateEnd(OffsetDateTime createdDateEnd) {
    this.createdDateEnd = createdDateEnd;
  }

  public ResourceFilter lastModifiedDateStart(OffsetDateTime lastModifiedDateStart) {
    this.lastModifiedDateStart = lastModifiedDateStart;
    return this;
  }

  /**
   * Get lastModifiedDateStart
   * @return lastModifiedDateStart
  */
  @Valid 
  @Schema(name = "lastModifiedDateStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastModifiedDateStart")
  public OffsetDateTime getLastModifiedDateStart() {
    return lastModifiedDateStart;
  }

  public void setLastModifiedDateStart(OffsetDateTime lastModifiedDateStart) {
    this.lastModifiedDateStart = lastModifiedDateStart;
  }

  public ResourceFilter lastModifiedDateEnd(OffsetDateTime lastModifiedDateEnd) {
    this.lastModifiedDateEnd = lastModifiedDateEnd;
    return this;
  }

  /**
   * Get lastModifiedDateEnd
   * @return lastModifiedDateEnd
  */
  @Valid 
  @Schema(name = "lastModifiedDateEnd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastModifiedDateEnd")
  public OffsetDateTime getLastModifiedDateEnd() {
    return lastModifiedDateEnd;
  }

  public void setLastModifiedDateEnd(OffsetDateTime lastModifiedDateEnd) {
    this.lastModifiedDateEnd = lastModifiedDateEnd;
  }

  public ResourceFilter searchString(String searchString) {
    this.searchString = searchString;
    return this;
  }

  /**
   * Get searchString
   * @return searchString
  */
  
  @Schema(name = "searchString", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("searchString")
  public String getSearchString() {
    return searchString;
  }

  public void setSearchString(String searchString) {
    this.searchString = searchString;
  }

  public ResourceFilter caseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
    return this;
  }

  /**
   * Get caseSensitive
   * @return caseSensitive
  */
  
  @Schema(name = "caseSensitive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseSensitive")
  public Boolean getCaseSensitive() {
    return caseSensitive;
  }

  public void setCaseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
  }

  public ResourceFilter wholeWord(Boolean wholeWord) {
    this.wholeWord = wholeWord;
    return this;
  }

  /**
   * Get wholeWord
   * @return wholeWord
  */
  
  @Schema(name = "wholeWord", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wholeWord")
  public Boolean getWholeWord() {
    return wholeWord;
  }

  public void setWholeWord(Boolean wholeWord) {
    this.wholeWord = wholeWord;
  }

  public ResourceFilter resourcePackId(UUID resourcePackId) {
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

  public ResourceFilter systemResource(Boolean systemResource) {
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

  public ResourceFilter hidden(Boolean hidden) {
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

  public ResourceFilter hasApprovedVersion(Boolean hasApprovedVersion) {
    this.hasApprovedVersion = hasApprovedVersion;
    return this;
  }

  /**
   * Get hasApprovedVersion
   * @return hasApprovedVersion
  */
  
  @Schema(name = "hasApprovedVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasApprovedVersion")
  public Boolean getHasApprovedVersion() {
    return hasApprovedVersion;
  }

  public void setHasApprovedVersion(Boolean hasApprovedVersion) {
    this.hasApprovedVersion = hasApprovedVersion;
  }

  public ResourceFilter includeVariants(Boolean includeVariants) {
    this.includeVariants = includeVariants;
    return this;
  }

  /**
   * Get includeVariants
   * @return includeVariants
  */
  
  @Schema(name = "includeVariants", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includeVariants")
  public Boolean getIncludeVariants() {
    return includeVariants;
  }

  public void setIncludeVariants(Boolean includeVariants) {
    this.includeVariants = includeVariants;
  }

  public ResourceFilter standardVariantId(UUID standardVariantId) {
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

  public ResourceFilter useEffectiveDate(Boolean useEffectiveDate) {
    this.useEffectiveDate = useEffectiveDate;
    return this;
  }

  /**
   * Get useEffectiveDate
   * @return useEffectiveDate
  */
  
  @Schema(name = "useEffectiveDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useEffectiveDate")
  public Boolean getUseEffectiveDate() {
    return useEffectiveDate;
  }

  public void setUseEffectiveDate(Boolean useEffectiveDate) {
    this.useEffectiveDate = useEffectiveDate;
  }

  public ResourceFilter effectiveDate(OffsetDateTime effectiveDate) {
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

  public ResourceFilter categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public ResourceFilter addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Get categories
   * @return categories
  */
  
  @Schema(name = "categories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categories")
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  public ResourceFilter categoryObjects(List<@Valid ResourceCategory> categoryObjects) {
    this.categoryObjects = categoryObjects;
    return this;
  }

  public ResourceFilter addCategoryObjectsItem(ResourceCategory categoryObjectsItem) {
    if (this.categoryObjects == null) {
      this.categoryObjects = new ArrayList<>();
    }
    this.categoryObjects.add(categoryObjectsItem);
    return this;
  }

  /**
   * Get categoryObjects
   * @return categoryObjects
  */
  @Valid 
  @Schema(name = "categoryObjects", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryObjects")
  public List<@Valid ResourceCategory> getCategoryObjects() {
    return categoryObjects;
  }

  public void setCategoryObjects(List<@Valid ResourceCategory> categoryObjects) {
    this.categoryObjects = categoryObjects;
  }

  public ResourceFilter vfilterLastModifiedDateEnd(OffsetDateTime vfilterLastModifiedDateEnd) {
    this.vfilterLastModifiedDateEnd = vfilterLastModifiedDateEnd;
    return this;
  }

  /**
   * Get vfilterLastModifiedDateEnd
   * @return vfilterLastModifiedDateEnd
  */
  @Valid 
  @Schema(name = "vfilter_lastModifiedDateEnd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vfilter_lastModifiedDateEnd")
  public OffsetDateTime getVfilterLastModifiedDateEnd() {
    return vfilterLastModifiedDateEnd;
  }

  public void setVfilterLastModifiedDateEnd(OffsetDateTime vfilterLastModifiedDateEnd) {
    this.vfilterLastModifiedDateEnd = vfilterLastModifiedDateEnd;
  }

  public ResourceFilter metadata(Map<String, List<Object>> metadata) {
    this.metadata = metadata;
    return this;
  }

  public ResourceFilter putMetadataItem(String key, List<Object> metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  @Valid 
  @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metadata")
  public Map<String, List<Object>> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, List<Object>> metadata) {
    this.metadata = metadata;
  }

  public ResourceFilter domainId(String domainId) {
    this.domainId = domainId;
    return this;
  }

  /**
   * Get domainId
   * @return domainId
  */
  
  @Schema(name = "domainId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("domainId")
  public String getDomainId() {
    return domainId;
  }

  public void setDomainId(String domainId) {
    this.domainId = domainId;
  }

  public ResourceFilter latestVersion(Boolean latestVersion) {
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

  public ResourceFilter locked(Boolean locked) {
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

  public ResourceFilter states(List<StatesEnum> states) {
    this.states = states;
    return this;
  }

  public ResourceFilter addStatesItem(StatesEnum statesItem) {
    if (this.states == null) {
      this.states = new ArrayList<>();
    }
    this.states.add(statesItem);
    return this;
  }

  /**
   * Get states
   * @return states
  */
  
  @Schema(name = "states", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("states")
  public List<StatesEnum> getStates() {
    return states;
  }

  public void setStates(List<StatesEnum> states) {
    this.states = states;
  }

  public ResourceFilter overrideIds(List<UUID> overrideIds) {
    this.overrideIds = overrideIds;
    return this;
  }

  public ResourceFilter addOverrideIdsItem(UUID overrideIdsItem) {
    if (this.overrideIds == null) {
      this.overrideIds = new ArrayList<>();
    }
    this.overrideIds.add(overrideIdsItem);
    return this;
  }

  /**
   * Get overrideIds
   * @return overrideIds
  */
  @Valid 
  @Schema(name = "overrideIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("overrideIds")
  public List<UUID> getOverrideIds() {
    return overrideIds;
  }

  public void setOverrideIds(List<UUID> overrideIds) {
    this.overrideIds = overrideIds;
  }

  public ResourceFilter overrideStates(List<OverrideStatesEnum> overrideStates) {
    this.overrideStates = overrideStates;
    return this;
  }

  public ResourceFilter addOverrideStatesItem(OverrideStatesEnum overrideStatesItem) {
    if (this.overrideStates == null) {
      this.overrideStates = new ArrayList<>();
    }
    this.overrideStates.add(overrideStatesItem);
    return this;
  }

  /**
   * Get overrideStates
   * @return overrideStates
  */
  
  @Schema(name = "overrideStates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("overrideStates")
  public List<OverrideStatesEnum> getOverrideStates() {
    return overrideStates;
  }

  public void setOverrideStates(List<OverrideStatesEnum> overrideStates) {
    this.overrideStates = overrideStates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceFilter resourceFilter = (ResourceFilter) o;
    return Objects.equals(this.ids, resourceFilter.ids) &&
        Objects.equals(this.excludedIds, resourceFilter.excludedIds) &&
        Objects.equals(this.types, resourceFilter.types) &&
        Objects.equals(this.excludedTypes, resourceFilter.excludedTypes) &&
        Objects.equals(this.name, resourceFilter.name) &&
        Objects.equals(this.description, resourceFilter.description) &&
        Objects.equals(this.createdBy, resourceFilter.createdBy) &&
        Objects.equals(this.lastModifiedBy, resourceFilter.lastModifiedBy) &&
        Objects.equals(this.createdDateStart, resourceFilter.createdDateStart) &&
        Objects.equals(this.createdDateEnd, resourceFilter.createdDateEnd) &&
        Objects.equals(this.lastModifiedDateStart, resourceFilter.lastModifiedDateStart) &&
        Objects.equals(this.lastModifiedDateEnd, resourceFilter.lastModifiedDateEnd) &&
        Objects.equals(this.searchString, resourceFilter.searchString) &&
        Objects.equals(this.caseSensitive, resourceFilter.caseSensitive) &&
        Objects.equals(this.wholeWord, resourceFilter.wholeWord) &&
        Objects.equals(this.resourcePackId, resourceFilter.resourcePackId) &&
        Objects.equals(this.systemResource, resourceFilter.systemResource) &&
        Objects.equals(this.hidden, resourceFilter.hidden) &&
        Objects.equals(this.hasApprovedVersion, resourceFilter.hasApprovedVersion) &&
        Objects.equals(this.includeVariants, resourceFilter.includeVariants) &&
        Objects.equals(this.standardVariantId, resourceFilter.standardVariantId) &&
        Objects.equals(this.useEffectiveDate, resourceFilter.useEffectiveDate) &&
        Objects.equals(this.effectiveDate, resourceFilter.effectiveDate) &&
        Objects.equals(this.categories, resourceFilter.categories) &&
        Objects.equals(this.categoryObjects, resourceFilter.categoryObjects) &&
        Objects.equals(this.vfilterLastModifiedDateEnd, resourceFilter.vfilterLastModifiedDateEnd) &&
        Objects.equals(this.metadata, resourceFilter.metadata) &&
        Objects.equals(this.domainId, resourceFilter.domainId) &&
        Objects.equals(this.latestVersion, resourceFilter.latestVersion) &&
        Objects.equals(this.locked, resourceFilter.locked) &&
        Objects.equals(this.states, resourceFilter.states) &&
        Objects.equals(this.overrideIds, resourceFilter.overrideIds) &&
        Objects.equals(this.overrideStates, resourceFilter.overrideStates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, excludedIds, types, excludedTypes, name, description, createdBy, lastModifiedBy, createdDateStart, createdDateEnd, lastModifiedDateStart, lastModifiedDateEnd, searchString, caseSensitive, wholeWord, resourcePackId, systemResource, hidden, hasApprovedVersion, includeVariants, standardVariantId, useEffectiveDate, effectiveDate, categories, categoryObjects, vfilterLastModifiedDateEnd, metadata, domainId, latestVersion, locked, states, overrideIds, overrideStates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceFilter {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    excludedIds: ").append(toIndentedString(excludedIds)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    excludedTypes: ").append(toIndentedString(excludedTypes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    createdDateStart: ").append(toIndentedString(createdDateStart)).append("\n");
    sb.append("    createdDateEnd: ").append(toIndentedString(createdDateEnd)).append("\n");
    sb.append("    lastModifiedDateStart: ").append(toIndentedString(lastModifiedDateStart)).append("\n");
    sb.append("    lastModifiedDateEnd: ").append(toIndentedString(lastModifiedDateEnd)).append("\n");
    sb.append("    searchString: ").append(toIndentedString(searchString)).append("\n");
    sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
    sb.append("    wholeWord: ").append(toIndentedString(wholeWord)).append("\n");
    sb.append("    resourcePackId: ").append(toIndentedString(resourcePackId)).append("\n");
    sb.append("    systemResource: ").append(toIndentedString(systemResource)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    hasApprovedVersion: ").append(toIndentedString(hasApprovedVersion)).append("\n");
    sb.append("    includeVariants: ").append(toIndentedString(includeVariants)).append("\n");
    sb.append("    standardVariantId: ").append(toIndentedString(standardVariantId)).append("\n");
    sb.append("    useEffectiveDate: ").append(toIndentedString(useEffectiveDate)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    categoryObjects: ").append(toIndentedString(categoryObjects)).append("\n");
    sb.append("    vfilterLastModifiedDateEnd: ").append(toIndentedString(vfilterLastModifiedDateEnd)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
    sb.append("    overrideIds: ").append(toIndentedString(overrideIds)).append("\n");
    sb.append("    overrideStates: ").append(toIndentedString(overrideStates)).append("\n");
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

