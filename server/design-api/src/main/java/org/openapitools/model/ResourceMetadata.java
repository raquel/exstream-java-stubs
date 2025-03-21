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
 * ResourceMetadata
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T17:54:43.132703260Z[Europe/Lisbon]")
public class ResourceMetadata {

  private String dataSourceEligible;

  private UUID defaultSampleFileId;

  private String dialogueEncoding;

  private String dialogueSerialization;

  private String dialogueVersion;

  private String displayName;

  private Boolean hasContentAuthorFrames;

  private String originalSource;

  private String resourceTemplate;

  private String selectionVariable;

  private String subtype;

  private String userFriendlyName;

  private String usesDesignPack;

  private String variableIsArray;

  private String variableType;

  public ResourceMetadata dataSourceEligible(String dataSourceEligible) {
    this.dataSourceEligible = dataSourceEligible;
    return this;
  }

  /**
   * Get dataSourceEligible
   * @return dataSourceEligible
  */
  
  @Schema(name = "dataSourceEligible", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataSourceEligible")
  public String getDataSourceEligible() {
    return dataSourceEligible;
  }

  public void setDataSourceEligible(String dataSourceEligible) {
    this.dataSourceEligible = dataSourceEligible;
  }

  public ResourceMetadata defaultSampleFileId(UUID defaultSampleFileId) {
    this.defaultSampleFileId = defaultSampleFileId;
    return this;
  }

  /**
   * Get defaultSampleFileId
   * @return defaultSampleFileId
  */
  @Valid 
  @Schema(name = "defaultSampleFileId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultSampleFileId")
  public UUID getDefaultSampleFileId() {
    return defaultSampleFileId;
  }

  public void setDefaultSampleFileId(UUID defaultSampleFileId) {
    this.defaultSampleFileId = defaultSampleFileId;
  }

  public ResourceMetadata dialogueEncoding(String dialogueEncoding) {
    this.dialogueEncoding = dialogueEncoding;
    return this;
  }

  /**
   * Get dialogueEncoding
   * @return dialogueEncoding
  */
  
  @Schema(name = "dialogueEncoding", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dialogueEncoding")
  public String getDialogueEncoding() {
    return dialogueEncoding;
  }

  public void setDialogueEncoding(String dialogueEncoding) {
    this.dialogueEncoding = dialogueEncoding;
  }

  public ResourceMetadata dialogueSerialization(String dialogueSerialization) {
    this.dialogueSerialization = dialogueSerialization;
    return this;
  }

  /**
   * Get dialogueSerialization
   * @return dialogueSerialization
  */
  
  @Schema(name = "dialogueSerialization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dialogueSerialization")
  public String getDialogueSerialization() {
    return dialogueSerialization;
  }

  public void setDialogueSerialization(String dialogueSerialization) {
    this.dialogueSerialization = dialogueSerialization;
  }

  public ResourceMetadata dialogueVersion(String dialogueVersion) {
    this.dialogueVersion = dialogueVersion;
    return this;
  }

  /**
   * Get dialogueVersion
   * @return dialogueVersion
  */
  
  @Schema(name = "dialogueVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dialogueVersion")
  public String getDialogueVersion() {
    return dialogueVersion;
  }

  public void setDialogueVersion(String dialogueVersion) {
    this.dialogueVersion = dialogueVersion;
  }

  public ResourceMetadata displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  */
  
  @Schema(name = "displayName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ResourceMetadata hasContentAuthorFrames(Boolean hasContentAuthorFrames) {
    this.hasContentAuthorFrames = hasContentAuthorFrames;
    return this;
  }

  /**
   * Get hasContentAuthorFrames
   * @return hasContentAuthorFrames
  */
  
  @Schema(name = "hasContentAuthorFrames", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasContentAuthorFrames")
  public Boolean getHasContentAuthorFrames() {
    return hasContentAuthorFrames;
  }

  public void setHasContentAuthorFrames(Boolean hasContentAuthorFrames) {
    this.hasContentAuthorFrames = hasContentAuthorFrames;
  }

  public ResourceMetadata originalSource(String originalSource) {
    this.originalSource = originalSource;
    return this;
  }

  /**
   * Get originalSource
   * @return originalSource
  */
  
  @Schema(name = "originalSource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("originalSource")
  public String getOriginalSource() {
    return originalSource;
  }

  public void setOriginalSource(String originalSource) {
    this.originalSource = originalSource;
  }

  public ResourceMetadata resourceTemplate(String resourceTemplate) {
    this.resourceTemplate = resourceTemplate;
    return this;
  }

  /**
   * Get resourceTemplate
   * @return resourceTemplate
  */
  
  @Schema(name = "resourceTemplate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceTemplate")
  public String getResourceTemplate() {
    return resourceTemplate;
  }

  public void setResourceTemplate(String resourceTemplate) {
    this.resourceTemplate = resourceTemplate;
  }

  public ResourceMetadata selectionVariable(String selectionVariable) {
    this.selectionVariable = selectionVariable;
    return this;
  }

  /**
   * Get selectionVariable
   * @return selectionVariable
  */
  
  @Schema(name = "selectionVariable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("selectionVariable")
  public String getSelectionVariable() {
    return selectionVariable;
  }

  public void setSelectionVariable(String selectionVariable) {
    this.selectionVariable = selectionVariable;
  }

  public ResourceMetadata subtype(String subtype) {
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

  public ResourceMetadata userFriendlyName(String userFriendlyName) {
    this.userFriendlyName = userFriendlyName;
    return this;
  }

  /**
   * Get userFriendlyName
   * @return userFriendlyName
  */
  
  @Schema(name = "userFriendlyName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userFriendlyName")
  public String getUserFriendlyName() {
    return userFriendlyName;
  }

  public void setUserFriendlyName(String userFriendlyName) {
    this.userFriendlyName = userFriendlyName;
  }

  public ResourceMetadata usesDesignPack(String usesDesignPack) {
    this.usesDesignPack = usesDesignPack;
    return this;
  }

  /**
   * Get usesDesignPack
   * @return usesDesignPack
  */
  
  @Schema(name = "usesDesignPack", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usesDesignPack")
  public String getUsesDesignPack() {
    return usesDesignPack;
  }

  public void setUsesDesignPack(String usesDesignPack) {
    this.usesDesignPack = usesDesignPack;
  }

  public ResourceMetadata variableIsArray(String variableIsArray) {
    this.variableIsArray = variableIsArray;
    return this;
  }

  /**
   * Get variableIsArray
   * @return variableIsArray
  */
  
  @Schema(name = "variableIsArray", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variableIsArray")
  public String getVariableIsArray() {
    return variableIsArray;
  }

  public void setVariableIsArray(String variableIsArray) {
    this.variableIsArray = variableIsArray;
  }

  public ResourceMetadata variableType(String variableType) {
    this.variableType = variableType;
    return this;
  }

  /**
   * Get variableType
   * @return variableType
  */
  
  @Schema(name = "variableType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variableType")
  public String getVariableType() {
    return variableType;
  }

  public void setVariableType(String variableType) {
    this.variableType = variableType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceMetadata resourceMetadata = (ResourceMetadata) o;
    return Objects.equals(this.dataSourceEligible, resourceMetadata.dataSourceEligible) &&
        Objects.equals(this.defaultSampleFileId, resourceMetadata.defaultSampleFileId) &&
        Objects.equals(this.dialogueEncoding, resourceMetadata.dialogueEncoding) &&
        Objects.equals(this.dialogueSerialization, resourceMetadata.dialogueSerialization) &&
        Objects.equals(this.dialogueVersion, resourceMetadata.dialogueVersion) &&
        Objects.equals(this.displayName, resourceMetadata.displayName) &&
        Objects.equals(this.hasContentAuthorFrames, resourceMetadata.hasContentAuthorFrames) &&
        Objects.equals(this.originalSource, resourceMetadata.originalSource) &&
        Objects.equals(this.resourceTemplate, resourceMetadata.resourceTemplate) &&
        Objects.equals(this.selectionVariable, resourceMetadata.selectionVariable) &&
        Objects.equals(this.subtype, resourceMetadata.subtype) &&
        Objects.equals(this.userFriendlyName, resourceMetadata.userFriendlyName) &&
        Objects.equals(this.usesDesignPack, resourceMetadata.usesDesignPack) &&
        Objects.equals(this.variableIsArray, resourceMetadata.variableIsArray) &&
        Objects.equals(this.variableType, resourceMetadata.variableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSourceEligible, defaultSampleFileId, dialogueEncoding, dialogueSerialization, dialogueVersion, displayName, hasContentAuthorFrames, originalSource, resourceTemplate, selectionVariable, subtype, userFriendlyName, usesDesignPack, variableIsArray, variableType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceMetadata {\n");
    sb.append("    dataSourceEligible: ").append(toIndentedString(dataSourceEligible)).append("\n");
    sb.append("    defaultSampleFileId: ").append(toIndentedString(defaultSampleFileId)).append("\n");
    sb.append("    dialogueEncoding: ").append(toIndentedString(dialogueEncoding)).append("\n");
    sb.append("    dialogueSerialization: ").append(toIndentedString(dialogueSerialization)).append("\n");
    sb.append("    dialogueVersion: ").append(toIndentedString(dialogueVersion)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    hasContentAuthorFrames: ").append(toIndentedString(hasContentAuthorFrames)).append("\n");
    sb.append("    originalSource: ").append(toIndentedString(originalSource)).append("\n");
    sb.append("    resourceTemplate: ").append(toIndentedString(resourceTemplate)).append("\n");
    sb.append("    selectionVariable: ").append(toIndentedString(selectionVariable)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    userFriendlyName: ").append(toIndentedString(userFriendlyName)).append("\n");
    sb.append("    usesDesignPack: ").append(toIndentedString(usesDesignPack)).append("\n");
    sb.append("    variableIsArray: ").append(toIndentedString(variableIsArray)).append("\n");
    sb.append("    variableType: ").append(toIndentedString(variableType)).append("\n");
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

