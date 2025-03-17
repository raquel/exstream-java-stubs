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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Frame;
import org.openapitools.client.model.ResourceVersion;

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
 * Structure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-17T13:44:46.273765810Z[Europe/Lisbon]")
public class Structure {
  public static final String SERIALIZED_NAME_FRAMES = "frames";
  @SerializedName(SERIALIZED_NAME_FRAMES)
  private List<Frame> frames;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private ResourceVersion template;

  public Structure() {
  }

  public Structure frames(List<Frame> frames) {
    this.frames = frames;
    return this;
  }

  public Structure addFramesItem(Frame framesItem) {
    if (this.frames == null) {
      this.frames = new ArrayList<>();
    }
    this.frames.add(framesItem);
    return this;
  }

   /**
   * Get frames
   * @return frames
  **/
  @javax.annotation.Nullable
  public List<Frame> getFrames() {
    return frames;
  }

  public void setFrames(List<Frame> frames) {
    this.frames = frames;
  }


  public Structure template(ResourceVersion template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  public ResourceVersion getTemplate() {
    return template;
  }

  public void setTemplate(ResourceVersion template) {
    this.template = template;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Structure structure = (Structure) o;
    return Objects.equals(this.frames, structure.frames) &&
        Objects.equals(this.template, structure.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frames, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Structure {\n");
    sb.append("    frames: ").append(toIndentedString(frames)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
    openapiFields.add("frames");
    openapiFields.add("template");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Structure
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Structure.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Structure is not found in the empty JSON string", Structure.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Structure.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Structure` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("frames") != null && !jsonObj.get("frames").isJsonNull()) {
        JsonArray jsonArrayframes = jsonObj.getAsJsonArray("frames");
        if (jsonArrayframes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("frames").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `frames` to be an array in the JSON string but got `%s`", jsonObj.get("frames").toString()));
          }

          // validate the optional field `frames` (array)
          for (int i = 0; i < jsonArrayframes.size(); i++) {
            Frame.validateJsonElement(jsonArrayframes.get(i));
          };
        }
      }
      // validate the optional field `template`
      if (jsonObj.get("template") != null && !jsonObj.get("template").isJsonNull()) {
        ResourceVersion.validateJsonElement(jsonObj.get("template"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Structure.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Structure' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Structure> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Structure.class));

       return (TypeAdapter<T>) new TypeAdapter<Structure>() {
           @Override
           public void write(JsonWriter out, Structure value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Structure read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Structure given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Structure
  * @throws IOException if the JSON string is invalid with respect to Structure
  */
  public static Structure fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Structure.class);
  }

 /**
  * Convert an instance of Structure to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

