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
 * ImportFoundCategory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-17T13:44:46.273765810Z[Europe/Lisbon]")
public class ImportFoundCategory {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "newName";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public ImportFoundCategory() {
  }

  public ImportFoundCategory id(UUID id) {
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


  public ImportFoundCategory name(String name) {
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


  public ImportFoundCategory newName(String newName) {
    this.newName = newName;
    return this;
  }

   /**
   * Get newName
   * @return newName
  **/
  @javax.annotation.Nullable
  public String getNewName() {
    return newName;
  }

  public void setNewName(String newName) {
    this.newName = newName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportFoundCategory importFoundCategory = (ImportFoundCategory) o;
    return Objects.equals(this.id, importFoundCategory.id) &&
        Objects.equals(this.name, importFoundCategory.name) &&
        Objects.equals(this.newName, importFoundCategory.newName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, newName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportFoundCategory {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("newName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ImportFoundCategory
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ImportFoundCategory.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImportFoundCategory is not found in the empty JSON string", ImportFoundCategory.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ImportFoundCategory.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImportFoundCategory` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("newName") != null && !jsonObj.get("newName").isJsonNull()) && !jsonObj.get("newName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `newName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("newName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImportFoundCategory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImportFoundCategory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImportFoundCategory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImportFoundCategory.class));

       return (TypeAdapter<T>) new TypeAdapter<ImportFoundCategory>() {
           @Override
           public void write(JsonWriter out, ImportFoundCategory value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImportFoundCategory read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ImportFoundCategory given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImportFoundCategory
  * @throws IOException if the JSON string is invalid with respect to ImportFoundCategory
  */
  public static ImportFoundCategory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImportFoundCategory.class);
  }

 /**
  * Convert an instance of ImportFoundCategory to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

