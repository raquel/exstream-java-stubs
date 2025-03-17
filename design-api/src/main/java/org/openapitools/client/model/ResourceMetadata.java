/*
 * Exstream CE Design API (21.2.0)
 * The Exstream CE Design API allows developers to query, create, modify, or delete Exstream CE resources and their links outside of the Exstream CE user inferface. This API requires authentication in order to be used - to authenticate requests, supply a valid OTDS token with `Authorization: Bearer OTDS_TOKEN` in the request header.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * ResourceMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-17T13:44:46.273765810Z[Europe/Lisbon]")
public class ResourceMetadata {
  public static final String SERIALIZED_NAME_DATA_SOURCE_ELIGIBLE = "dataSourceEligible";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_ELIGIBLE)
  private String dataSourceEligible;

  public static final String SERIALIZED_NAME_DEFAULT_SAMPLE_FILE_ID = "defaultSampleFileId";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SAMPLE_FILE_ID)
  private UUID defaultSampleFileId;

  public static final String SERIALIZED_NAME_DIALOGUE_ENCODING = "dialogueEncoding";
  @SerializedName(SERIALIZED_NAME_DIALOGUE_ENCODING)
  private String dialogueEncoding;

  public static final String SERIALIZED_NAME_DIALOGUE_SERIALIZATION = "dialogueSerialization";
  @SerializedName(SERIALIZED_NAME_DIALOGUE_SERIALIZATION)
  private String dialogueSerialization;

  public static final String SERIALIZED_NAME_DIALOGUE_VERSION = "dialogueVersion";
  @SerializedName(SERIALIZED_NAME_DIALOGUE_VERSION)
  private String dialogueVersion;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_HAS_CONTENT_AUTHOR_FRAMES = "hasContentAuthorFrames";
  @SerializedName(SERIALIZED_NAME_HAS_CONTENT_AUTHOR_FRAMES)
  private Boolean hasContentAuthorFrames;

  public static final String SERIALIZED_NAME_ORIGINAL_SOURCE = "originalSource";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_SOURCE)
  private String originalSource;

  public static final String SERIALIZED_NAME_RESOURCE_TEMPLATE = "resourceTemplate";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TEMPLATE)
  private String resourceTemplate;

  public static final String SERIALIZED_NAME_SELECTION_VARIABLE = "selectionVariable";
  @SerializedName(SERIALIZED_NAME_SELECTION_VARIABLE)
  private String selectionVariable;

  public static final String SERIALIZED_NAME_SUBTYPE = "subtype";
  @SerializedName(SERIALIZED_NAME_SUBTYPE)
  private String subtype;

  public static final String SERIALIZED_NAME_USER_FRIENDLY_NAME = "userFriendlyName";
  @SerializedName(SERIALIZED_NAME_USER_FRIENDLY_NAME)
  private String userFriendlyName;

  public static final String SERIALIZED_NAME_USES_DESIGN_PACK = "usesDesignPack";
  @SerializedName(SERIALIZED_NAME_USES_DESIGN_PACK)
  private String usesDesignPack;

  public static final String SERIALIZED_NAME_VARIABLE_IS_ARRAY = "variableIsArray";
  @SerializedName(SERIALIZED_NAME_VARIABLE_IS_ARRAY)
  private String variableIsArray;

  public static final String SERIALIZED_NAME_VARIABLE_TYPE = "variableType";
  @SerializedName(SERIALIZED_NAME_VARIABLE_TYPE)
  private String variableType;

  public ResourceMetadata() {
  }

  public ResourceMetadata dataSourceEligible(String dataSourceEligible) {
    this.dataSourceEligible = dataSourceEligible;
    return this;
  }

   /**
   * Get dataSourceEligible
   * @return dataSourceEligible
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("dataSourceEligible");
    openapiFields.add("defaultSampleFileId");
    openapiFields.add("dialogueEncoding");
    openapiFields.add("dialogueSerialization");
    openapiFields.add("dialogueVersion");
    openapiFields.add("displayName");
    openapiFields.add("hasContentAuthorFrames");
    openapiFields.add("originalSource");
    openapiFields.add("resourceTemplate");
    openapiFields.add("selectionVariable");
    openapiFields.add("subtype");
    openapiFields.add("userFriendlyName");
    openapiFields.add("usesDesignPack");
    openapiFields.add("variableIsArray");
    openapiFields.add("variableType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ResourceMetadata
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceMetadata is not found in the empty JSON string", ResourceMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResourceMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("dataSourceEligible") != null && !jsonObj.get("dataSourceEligible").isJsonNull()) && !jsonObj.get("dataSourceEligible").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataSourceEligible` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataSourceEligible").toString()));
      }
      if ((jsonObj.get("defaultSampleFileId") != null && !jsonObj.get("defaultSampleFileId").isJsonNull()) && !jsonObj.get("defaultSampleFileId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultSampleFileId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultSampleFileId").toString()));
      }
      if ((jsonObj.get("dialogueEncoding") != null && !jsonObj.get("dialogueEncoding").isJsonNull()) && !jsonObj.get("dialogueEncoding").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dialogueEncoding` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dialogueEncoding").toString()));
      }
      if ((jsonObj.get("dialogueSerialization") != null && !jsonObj.get("dialogueSerialization").isJsonNull()) && !jsonObj.get("dialogueSerialization").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dialogueSerialization` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dialogueSerialization").toString()));
      }
      if ((jsonObj.get("dialogueVersion") != null && !jsonObj.get("dialogueVersion").isJsonNull()) && !jsonObj.get("dialogueVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dialogueVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dialogueVersion").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("originalSource") != null && !jsonObj.get("originalSource").isJsonNull()) && !jsonObj.get("originalSource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originalSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originalSource").toString()));
      }
      if ((jsonObj.get("resourceTemplate") != null && !jsonObj.get("resourceTemplate").isJsonNull()) && !jsonObj.get("resourceTemplate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceTemplate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceTemplate").toString()));
      }
      if ((jsonObj.get("selectionVariable") != null && !jsonObj.get("selectionVariable").isJsonNull()) && !jsonObj.get("selectionVariable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selectionVariable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selectionVariable").toString()));
      }
      if ((jsonObj.get("subtype") != null && !jsonObj.get("subtype").isJsonNull()) && !jsonObj.get("subtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subtype").toString()));
      }
      if ((jsonObj.get("userFriendlyName") != null && !jsonObj.get("userFriendlyName").isJsonNull()) && !jsonObj.get("userFriendlyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userFriendlyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userFriendlyName").toString()));
      }
      if ((jsonObj.get("usesDesignPack") != null && !jsonObj.get("usesDesignPack").isJsonNull()) && !jsonObj.get("usesDesignPack").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `usesDesignPack` to be a primitive type in the JSON string but got `%s`", jsonObj.get("usesDesignPack").toString()));
      }
      if ((jsonObj.get("variableIsArray") != null && !jsonObj.get("variableIsArray").isJsonNull()) && !jsonObj.get("variableIsArray").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variableIsArray` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variableIsArray").toString()));
      }
      if ((jsonObj.get("variableType") != null && !jsonObj.get("variableType").isJsonNull()) && !jsonObj.get("variableType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variableType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variableType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceMetadata>() {
           @Override
           public void write(JsonWriter out, ResourceMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResourceMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResourceMetadata
  * @throws IOException if the JSON string is invalid with respect to ResourceMetadata
  */
  public static ResourceMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceMetadata.class);
  }

 /**
  * Convert an instance of ResourceMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

