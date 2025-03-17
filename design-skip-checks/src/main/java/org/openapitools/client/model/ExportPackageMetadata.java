/*
 * Exstream Design
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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
import org.openapitools.client.model.VersionConfig;

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
 * ExportPackageMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-17T13:54:16.859257228Z[Europe/Lisbon]")
public class ExportPackageMetadata {
  public static final String SERIALIZED_NAME_DATABASE_NAME = "databaseName";
  @SerializedName(SERIALIZED_NAME_DATABASE_NAME)
  private String databaseName;

  public static final String SERIALIZED_NAME_DATABASE_VERSION = "databaseVersion";
  @SerializedName(SERIALIZED_NAME_DATABASE_VERSION)
  private String databaseVersion;

  public static final String SERIALIZED_NAME_APPLICATION_VERSION = "applicationVersion";
  @SerializedName(SERIALIZED_NAME_APPLICATION_VERSION)
  private String applicationVersion;

  public static final String SERIALIZED_NAME_CREATOR = "creator";
  @SerializedName(SERIALIZED_NAME_CREATOR)
  private String creator;

  public static final String SERIALIZED_NAME_EXPORT_CREATION_DATE = "exportCreationDate";
  @SerializedName(SERIALIZED_NAME_EXPORT_CREATION_DATE)
  private String exportCreationDate;

  public static final String SERIALIZED_NAME_EXPORT_UPDATE_DATE = "exportUpdateDate";
  @SerializedName(SERIALIZED_NAME_EXPORT_UPDATE_DATE)
  private String exportUpdateDate;

  public static final String SERIALIZED_NAME_EXPORT_OPTIONS = "exportOptions";
  @SerializedName(SERIALIZED_NAME_EXPORT_OPTIONS)
  private String exportOptions;

  public static final String SERIALIZED_NAME_VERSION_CONFIG = "versionConfig";
  @SerializedName(SERIALIZED_NAME_VERSION_CONFIG)
  private VersionConfig versionConfig;

  public ExportPackageMetadata() {
  }

  public ExportPackageMetadata databaseName(String databaseName) {
    this.databaseName = databaseName;
    return this;
  }

   /**
   * Get databaseName
   * @return databaseName
  **/
  @javax.annotation.Nullable
  public String getDatabaseName() {
    return databaseName;
  }

  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }


  public ExportPackageMetadata databaseVersion(String databaseVersion) {
    this.databaseVersion = databaseVersion;
    return this;
  }

   /**
   * Get databaseVersion
   * @return databaseVersion
  **/
  @javax.annotation.Nullable
  public String getDatabaseVersion() {
    return databaseVersion;
  }

  public void setDatabaseVersion(String databaseVersion) {
    this.databaseVersion = databaseVersion;
  }


  public ExportPackageMetadata applicationVersion(String applicationVersion) {
    this.applicationVersion = applicationVersion;
    return this;
  }

   /**
   * Get applicationVersion
   * @return applicationVersion
  **/
  @javax.annotation.Nullable
  public String getApplicationVersion() {
    return applicationVersion;
  }

  public void setApplicationVersion(String applicationVersion) {
    this.applicationVersion = applicationVersion;
  }


  public ExportPackageMetadata creator(String creator) {
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @javax.annotation.Nullable
  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }


  public ExportPackageMetadata exportCreationDate(String exportCreationDate) {
    this.exportCreationDate = exportCreationDate;
    return this;
  }

   /**
   * Get exportCreationDate
   * @return exportCreationDate
  **/
  @javax.annotation.Nullable
  public String getExportCreationDate() {
    return exportCreationDate;
  }

  public void setExportCreationDate(String exportCreationDate) {
    this.exportCreationDate = exportCreationDate;
  }


  public ExportPackageMetadata exportUpdateDate(String exportUpdateDate) {
    this.exportUpdateDate = exportUpdateDate;
    return this;
  }

   /**
   * Get exportUpdateDate
   * @return exportUpdateDate
  **/
  @javax.annotation.Nullable
  public String getExportUpdateDate() {
    return exportUpdateDate;
  }

  public void setExportUpdateDate(String exportUpdateDate) {
    this.exportUpdateDate = exportUpdateDate;
  }


  public ExportPackageMetadata exportOptions(String exportOptions) {
    this.exportOptions = exportOptions;
    return this;
  }

   /**
   * Get exportOptions
   * @return exportOptions
  **/
  @javax.annotation.Nullable
  public String getExportOptions() {
    return exportOptions;
  }

  public void setExportOptions(String exportOptions) {
    this.exportOptions = exportOptions;
  }


  public ExportPackageMetadata versionConfig(VersionConfig versionConfig) {
    this.versionConfig = versionConfig;
    return this;
  }

   /**
   * Get versionConfig
   * @return versionConfig
  **/
  @javax.annotation.Nullable
  public VersionConfig getVersionConfig() {
    return versionConfig;
  }

  public void setVersionConfig(VersionConfig versionConfig) {
    this.versionConfig = versionConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportPackageMetadata exportPackageMetadata = (ExportPackageMetadata) o;
    return Objects.equals(this.databaseName, exportPackageMetadata.databaseName) &&
        Objects.equals(this.databaseVersion, exportPackageMetadata.databaseVersion) &&
        Objects.equals(this.applicationVersion, exportPackageMetadata.applicationVersion) &&
        Objects.equals(this.creator, exportPackageMetadata.creator) &&
        Objects.equals(this.exportCreationDate, exportPackageMetadata.exportCreationDate) &&
        Objects.equals(this.exportUpdateDate, exportPackageMetadata.exportUpdateDate) &&
        Objects.equals(this.exportOptions, exportPackageMetadata.exportOptions) &&
        Objects.equals(this.versionConfig, exportPackageMetadata.versionConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseName, databaseVersion, applicationVersion, creator, exportCreationDate, exportUpdateDate, exportOptions, versionConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportPackageMetadata {\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    databaseVersion: ").append(toIndentedString(databaseVersion)).append("\n");
    sb.append("    applicationVersion: ").append(toIndentedString(applicationVersion)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    exportCreationDate: ").append(toIndentedString(exportCreationDate)).append("\n");
    sb.append("    exportUpdateDate: ").append(toIndentedString(exportUpdateDate)).append("\n");
    sb.append("    exportOptions: ").append(toIndentedString(exportOptions)).append("\n");
    sb.append("    versionConfig: ").append(toIndentedString(versionConfig)).append("\n");
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
    openapiFields.add("databaseName");
    openapiFields.add("databaseVersion");
    openapiFields.add("applicationVersion");
    openapiFields.add("creator");
    openapiFields.add("exportCreationDate");
    openapiFields.add("exportUpdateDate");
    openapiFields.add("exportOptions");
    openapiFields.add("versionConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExportPackageMetadata
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExportPackageMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExportPackageMetadata is not found in the empty JSON string", ExportPackageMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExportPackageMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExportPackageMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("databaseName") != null && !jsonObj.get("databaseName").isJsonNull()) && !jsonObj.get("databaseName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `databaseName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("databaseName").toString()));
      }
      if ((jsonObj.get("databaseVersion") != null && !jsonObj.get("databaseVersion").isJsonNull()) && !jsonObj.get("databaseVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `databaseVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("databaseVersion").toString()));
      }
      if ((jsonObj.get("applicationVersion") != null && !jsonObj.get("applicationVersion").isJsonNull()) && !jsonObj.get("applicationVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `applicationVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("applicationVersion").toString()));
      }
      if ((jsonObj.get("creator") != null && !jsonObj.get("creator").isJsonNull()) && !jsonObj.get("creator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creator").toString()));
      }
      if ((jsonObj.get("exportCreationDate") != null && !jsonObj.get("exportCreationDate").isJsonNull()) && !jsonObj.get("exportCreationDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exportCreationDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exportCreationDate").toString()));
      }
      if ((jsonObj.get("exportUpdateDate") != null && !jsonObj.get("exportUpdateDate").isJsonNull()) && !jsonObj.get("exportUpdateDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exportUpdateDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exportUpdateDate").toString()));
      }
      if ((jsonObj.get("exportOptions") != null && !jsonObj.get("exportOptions").isJsonNull()) && !jsonObj.get("exportOptions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exportOptions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exportOptions").toString()));
      }
      // validate the optional field `versionConfig`
      if (jsonObj.get("versionConfig") != null && !jsonObj.get("versionConfig").isJsonNull()) {
        VersionConfig.validateJsonElement(jsonObj.get("versionConfig"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExportPackageMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExportPackageMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExportPackageMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExportPackageMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<ExportPackageMetadata>() {
           @Override
           public void write(JsonWriter out, ExportPackageMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExportPackageMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExportPackageMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExportPackageMetadata
  * @throws IOException if the JSON string is invalid with respect to ExportPackageMetadata
  */
  public static ExportPackageMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExportPackageMetadata.class);
  }

 /**
  * Convert an instance of ExportPackageMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

