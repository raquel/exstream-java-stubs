package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.openapitools.model.Resource;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SavedResource
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class SavedResource {

  private Resource resource;

  private String userProfile;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dateAdded;

  private UUID resourceId;

  /**
   * Gets or Sets resourceType
   */
  public enum ResourceTypeEnum {
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

    ResourceTypeEnum(String value) {
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
    public static ResourceTypeEnum fromValue(String value) {
      for (ResourceTypeEnum b : ResourceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ResourceTypeEnum resourceType;

  /**
   * Gets or Sets savedType
   */
  public enum SavedTypeEnum {
    RECENT("RECENT"),
    
    FAVORITE("FAVORITE");

    private String value;

    SavedTypeEnum(String value) {
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
    public static SavedTypeEnum fromValue(String value) {
      for (SavedTypeEnum b : SavedTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SavedTypeEnum savedType;

  public SavedResource resource(Resource resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Get resource
   * @return resource
  */
  @Valid 
  @Schema(name = "resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource")
  public Resource getResource() {
    return resource;
  }

  public void setResource(Resource resource) {
    this.resource = resource;
  }

  public SavedResource userProfile(String userProfile) {
    this.userProfile = userProfile;
    return this;
  }

  /**
   * Get userProfile
   * @return userProfile
  */
  
  @Schema(name = "userProfile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userProfile")
  public String getUserProfile() {
    return userProfile;
  }

  public void setUserProfile(String userProfile) {
    this.userProfile = userProfile;
  }

  public SavedResource dateAdded(OffsetDateTime dateAdded) {
    this.dateAdded = dateAdded;
    return this;
  }

  /**
   * Get dateAdded
   * @return dateAdded
  */
  @Valid 
  @Schema(name = "dateAdded", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateAdded")
  public OffsetDateTime getDateAdded() {
    return dateAdded;
  }

  public void setDateAdded(OffsetDateTime dateAdded) {
    this.dateAdded = dateAdded;
  }

  public SavedResource resourceId(UUID resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * Get resourceId
   * @return resourceId
  */
  @Valid 
  @Schema(name = "resourceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceId")
  public UUID getResourceId() {
    return resourceId;
  }

  public void setResourceId(UUID resourceId) {
    this.resourceId = resourceId;
  }

  public SavedResource resourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * Get resourceType
   * @return resourceType
  */
  
  @Schema(name = "resourceType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceType")
  public ResourceTypeEnum getResourceType() {
    return resourceType;
  }

  public void setResourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
  }

  public SavedResource savedType(SavedTypeEnum savedType) {
    this.savedType = savedType;
    return this;
  }

  /**
   * Get savedType
   * @return savedType
  */
  
  @Schema(name = "savedType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("savedType")
  public SavedTypeEnum getSavedType() {
    return savedType;
  }

  public void setSavedType(SavedTypeEnum savedType) {
    this.savedType = savedType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedResource savedResource = (SavedResource) o;
    return Objects.equals(this.resource, savedResource.resource) &&
        Objects.equals(this.userProfile, savedResource.userProfile) &&
        Objects.equals(this.dateAdded, savedResource.dateAdded) &&
        Objects.equals(this.resourceId, savedResource.resourceId) &&
        Objects.equals(this.resourceType, savedResource.resourceType) &&
        Objects.equals(this.savedType, savedResource.savedType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource, userProfile, dateAdded, resourceId, resourceType, savedType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedResource {\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    userProfile: ").append(toIndentedString(userProfile)).append("\n");
    sb.append("    dateAdded: ").append(toIndentedString(dateAdded)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    savedType: ").append(toIndentedString(savedType)).append("\n");
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

