/*
 * Exstream Rationalization
 * **For internal use of the product only**
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
 * MigrationSetDomainRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-17T13:53:34.366018029Z[Europe/Lisbon]")
public class MigrationSetDomainRequest {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_EDITABLE = "editable";
  @SerializedName(SERIALIZED_NAME_EDITABLE)
  private Boolean editable;

  public static final String SERIALIZED_NAME_TO_DOMAIN = "toDomain";
  @SerializedName(SERIALIZED_NAME_TO_DOMAIN)
  private String toDomain;

  public static final String SERIALIZED_NAME_RAT = "rat";
  @SerializedName(SERIALIZED_NAME_RAT)
  private Boolean rat;

  public MigrationSetDomainRequest() {
  }

  public MigrationSetDomainRequest id(UUID id) {
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


  public MigrationSetDomainRequest editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

   /**
   * Get editable
   * @return editable
  **/
  @javax.annotation.Nullable
  public Boolean getEditable() {
    return editable;
  }

  public void setEditable(Boolean editable) {
    this.editable = editable;
  }


  public MigrationSetDomainRequest toDomain(String toDomain) {
    this.toDomain = toDomain;
    return this;
  }

   /**
   * Get toDomain
   * @return toDomain
  **/
  @javax.annotation.Nullable
  public String getToDomain() {
    return toDomain;
  }

  public void setToDomain(String toDomain) {
    this.toDomain = toDomain;
  }


  public MigrationSetDomainRequest rat(Boolean rat) {
    this.rat = rat;
    return this;
  }

   /**
   * Get rat
   * @return rat
  **/
  @javax.annotation.Nullable
  public Boolean getRat() {
    return rat;
  }

  public void setRat(Boolean rat) {
    this.rat = rat;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationSetDomainRequest migrationSetDomainRequest = (MigrationSetDomainRequest) o;
    return Objects.equals(this.id, migrationSetDomainRequest.id) &&
        Objects.equals(this.editable, migrationSetDomainRequest.editable) &&
        Objects.equals(this.toDomain, migrationSetDomainRequest.toDomain) &&
        Objects.equals(this.rat, migrationSetDomainRequest.rat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, editable, toDomain, rat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationSetDomainRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    toDomain: ").append(toIndentedString(toDomain)).append("\n");
    sb.append("    rat: ").append(toIndentedString(rat)).append("\n");
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
    openapiFields.add("editable");
    openapiFields.add("toDomain");
    openapiFields.add("rat");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MigrationSetDomainRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MigrationSetDomainRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MigrationSetDomainRequest is not found in the empty JSON string", MigrationSetDomainRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MigrationSetDomainRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MigrationSetDomainRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("toDomain") != null && !jsonObj.get("toDomain").isJsonNull()) && !jsonObj.get("toDomain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `toDomain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("toDomain").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MigrationSetDomainRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MigrationSetDomainRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MigrationSetDomainRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MigrationSetDomainRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<MigrationSetDomainRequest>() {
           @Override
           public void write(JsonWriter out, MigrationSetDomainRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MigrationSetDomainRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MigrationSetDomainRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MigrationSetDomainRequest
  * @throws IOException if the JSON string is invalid with respect to MigrationSetDomainRequest
  */
  public static MigrationSetDomainRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MigrationSetDomainRequest.class);
  }

 /**
  * Convert an instance of MigrationSetDomainRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

