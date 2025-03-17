/*
 * Exstream Orchestration
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
 * FlowModelContextSnapshot
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-17T13:55:50.549398439Z[Europe/Lisbon]")
public class FlowModelContextSnapshot {
  public static final String SERIALIZED_NAME_SNAPSHOT_ID = "snapshotId";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_ID)
  private UUID snapshotId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_DOMAIN_ID = "domainId";
  @SerializedName(SERIALIZED_NAME_DOMAIN_ID)
  private String domainId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_XML_CONTENT = "xmlContent";
  @SerializedName(SERIALIZED_NAME_XML_CONTENT)
  private String xmlContent;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public FlowModelContextSnapshot() {
  }

  public FlowModelContextSnapshot snapshotId(UUID snapshotId) {
    this.snapshotId = snapshotId;
    return this;
  }

   /**
   * Get snapshotId
   * @return snapshotId
  **/
  @javax.annotation.Nullable
  public UUID getSnapshotId() {
    return snapshotId;
  }

  public void setSnapshotId(UUID snapshotId) {
    this.snapshotId = snapshotId;
  }


  public FlowModelContextSnapshot id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  public FlowModelContextSnapshot domainId(String domainId) {
    this.domainId = domainId;
    return this;
  }

   /**
   * Get domainId
   * @return domainId
  **/
  @javax.annotation.Nullable
  public String getDomainId() {
    return domainId;
  }

  public void setDomainId(String domainId) {
    this.domainId = domainId;
  }


  public FlowModelContextSnapshot name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public FlowModelContextSnapshot xmlContent(String xmlContent) {
    this.xmlContent = xmlContent;
    return this;
  }

   /**
   * Get xmlContent
   * @return xmlContent
  **/
  @javax.annotation.Nullable
  public String getXmlContent() {
    return xmlContent;
  }

  public void setXmlContent(String xmlContent) {
    this.xmlContent = xmlContent;
  }


  public FlowModelContextSnapshot version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  public FlowModelContextSnapshot content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowModelContextSnapshot flowModelContextSnapshot = (FlowModelContextSnapshot) o;
    return Objects.equals(this.snapshotId, flowModelContextSnapshot.snapshotId) &&
        Objects.equals(this.id, flowModelContextSnapshot.id) &&
        Objects.equals(this.domainId, flowModelContextSnapshot.domainId) &&
        Objects.equals(this.name, flowModelContextSnapshot.name) &&
        Objects.equals(this.xmlContent, flowModelContextSnapshot.xmlContent) &&
        Objects.equals(this.version, flowModelContextSnapshot.version) &&
        Objects.equals(this.content, flowModelContextSnapshot.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotId, id, domainId, name, xmlContent, version, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowModelContextSnapshot {\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    xmlContent: ").append(toIndentedString(xmlContent)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
    openapiFields.add("snapshotId");
    openapiFields.add("id");
    openapiFields.add("domainId");
    openapiFields.add("name");
    openapiFields.add("xmlContent");
    openapiFields.add("version");
    openapiFields.add("content");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FlowModelContextSnapshot
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FlowModelContextSnapshot.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FlowModelContextSnapshot is not found in the empty JSON string", FlowModelContextSnapshot.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FlowModelContextSnapshot.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FlowModelContextSnapshot` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("snapshotId") != null && !jsonObj.get("snapshotId").isJsonNull()) && !jsonObj.get("snapshotId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `snapshotId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("snapshotId").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("domainId") != null && !jsonObj.get("domainId").isJsonNull()) && !jsonObj.get("domainId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domainId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domainId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("xmlContent") != null && !jsonObj.get("xmlContent").isJsonNull()) && !jsonObj.get("xmlContent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xmlContent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xmlContent").toString()));
      }
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FlowModelContextSnapshot.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FlowModelContextSnapshot' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FlowModelContextSnapshot> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FlowModelContextSnapshot.class));

       return (TypeAdapter<T>) new TypeAdapter<FlowModelContextSnapshot>() {
           @Override
           public void write(JsonWriter out, FlowModelContextSnapshot value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FlowModelContextSnapshot read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FlowModelContextSnapshot given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FlowModelContextSnapshot
  * @throws IOException if the JSON string is invalid with respect to FlowModelContextSnapshot
  */
  public static FlowModelContextSnapshot fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FlowModelContextSnapshot.class);
  }

 /**
  * Convert an instance of FlowModelContextSnapshot to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

