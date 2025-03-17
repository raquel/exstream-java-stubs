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
import java.time.OffsetDateTime;
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
 * CollectionResource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-17T13:54:16.859257228Z[Europe/Lisbon]")
public class CollectionResource {
  public static final String SERIALIZED_NAME_COLLECTION_ID = "collection_id";
  @SerializedName(SERIALIZED_NAME_COLLECTION_ID)
  private UUID collectionId;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY = "lastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private String lastModifiedBy;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE = "lastModifiedDate";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE)
  private OffsetDateTime lastModifiedDate;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resource_id";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private UUID resourceId;

  public static final String SERIALIZED_NAME_RESOURCE_VERSION = "resource_version";
  @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION)
  private Integer resourceVersion;

  public CollectionResource() {
  }

  public CollectionResource collectionId(UUID collectionId) {
    this.collectionId = collectionId;
    return this;
  }

   /**
   * Get collectionId
   * @return collectionId
  **/
  @javax.annotation.Nonnull
  public UUID getCollectionId() {
    return collectionId;
  }

  public void setCollectionId(UUID collectionId) {
    this.collectionId = collectionId;
  }


  public CollectionResource createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public CollectionResource createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public CollectionResource lastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Get lastModifiedBy
   * @return lastModifiedBy
  **/
  @javax.annotation.Nullable
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }


  public CollectionResource lastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * Get lastModifiedDate
   * @return lastModifiedDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }


  public CollectionResource resourceId(UUID resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @javax.annotation.Nonnull
  public UUID getResourceId() {
    return resourceId;
  }

  public void setResourceId(UUID resourceId) {
    this.resourceId = resourceId;
  }


  public CollectionResource resourceVersion(Integer resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

   /**
   * Get resourceVersion
   * @return resourceVersion
  **/
  @javax.annotation.Nonnull
  public Integer getResourceVersion() {
    return resourceVersion;
  }

  public void setResourceVersion(Integer resourceVersion) {
    this.resourceVersion = resourceVersion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionResource collectionResource = (CollectionResource) o;
    return Objects.equals(this.collectionId, collectionResource.collectionId) &&
        Objects.equals(this.createdBy, collectionResource.createdBy) &&
        Objects.equals(this.createdDate, collectionResource.createdDate) &&
        Objects.equals(this.lastModifiedBy, collectionResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, collectionResource.lastModifiedDate) &&
        Objects.equals(this.resourceId, collectionResource.resourceId) &&
        Objects.equals(this.resourceVersion, collectionResource.resourceVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectionId, createdBy, createdDate, lastModifiedBy, lastModifiedDate, resourceId, resourceVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionResource {\n");
    sb.append("    collectionId: ").append(toIndentedString(collectionId)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
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
    openapiFields.add("collection_id");
    openapiFields.add("createdBy");
    openapiFields.add("createdDate");
    openapiFields.add("lastModifiedBy");
    openapiFields.add("lastModifiedDate");
    openapiFields.add("resource_id");
    openapiFields.add("resource_version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("collection_id");
    openapiRequiredFields.add("resource_id");
    openapiRequiredFields.add("resource_version");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CollectionResource
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CollectionResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CollectionResource is not found in the empty JSON string", CollectionResource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CollectionResource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CollectionResource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CollectionResource.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("collection_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collection_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collection_id").toString()));
      }
      if ((jsonObj.get("createdBy") != null && !jsonObj.get("createdBy").isJsonNull()) && !jsonObj.get("createdBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdBy").toString()));
      }
      if ((jsonObj.get("lastModifiedBy") != null && !jsonObj.get("lastModifiedBy").isJsonNull()) && !jsonObj.get("lastModifiedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastModifiedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastModifiedBy").toString()));
      }
      if (!jsonObj.get("resource_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CollectionResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CollectionResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CollectionResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CollectionResource.class));

       return (TypeAdapter<T>) new TypeAdapter<CollectionResource>() {
           @Override
           public void write(JsonWriter out, CollectionResource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CollectionResource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CollectionResource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CollectionResource
  * @throws IOException if the JSON string is invalid with respect to CollectionResource
  */
  public static CollectionResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CollectionResource.class);
  }

 /**
  * Convert an instance of CollectionResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

