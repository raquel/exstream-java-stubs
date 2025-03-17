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
import org.openapitools.client.model.Grammar;
import org.openapitools.client.model.Readability;
import org.openapitools.client.model.Sentiment;

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
 * AugmentedAuthoring
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-17T13:54:16.859257228Z[Europe/Lisbon]")
public class AugmentedAuthoring {
  public static final String SERIALIZED_NAME_READABILITY = "readability";
  @SerializedName(SERIALIZED_NAME_READABILITY)
  private Readability readability;

  public static final String SERIALIZED_NAME_SENTIMENT = "sentiment";
  @SerializedName(SERIALIZED_NAME_SENTIMENT)
  private Sentiment sentiment;

  public static final String SERIALIZED_NAME_GRAMMAR = "grammar";
  @SerializedName(SERIALIZED_NAME_GRAMMAR)
  private Grammar grammar;

  public AugmentedAuthoring() {
  }

  public AugmentedAuthoring readability(Readability readability) {
    this.readability = readability;
    return this;
  }

   /**
   * Get readability
   * @return readability
  **/
  @javax.annotation.Nullable
  public Readability getReadability() {
    return readability;
  }

  public void setReadability(Readability readability) {
    this.readability = readability;
  }


  public AugmentedAuthoring sentiment(Sentiment sentiment) {
    this.sentiment = sentiment;
    return this;
  }

   /**
   * Get sentiment
   * @return sentiment
  **/
  @javax.annotation.Nullable
  public Sentiment getSentiment() {
    return sentiment;
  }

  public void setSentiment(Sentiment sentiment) {
    this.sentiment = sentiment;
  }


  public AugmentedAuthoring grammar(Grammar grammar) {
    this.grammar = grammar;
    return this;
  }

   /**
   * Get grammar
   * @return grammar
  **/
  @javax.annotation.Nullable
  public Grammar getGrammar() {
    return grammar;
  }

  public void setGrammar(Grammar grammar) {
    this.grammar = grammar;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AugmentedAuthoring augmentedAuthoring = (AugmentedAuthoring) o;
    return Objects.equals(this.readability, augmentedAuthoring.readability) &&
        Objects.equals(this.sentiment, augmentedAuthoring.sentiment) &&
        Objects.equals(this.grammar, augmentedAuthoring.grammar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(readability, sentiment, grammar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AugmentedAuthoring {\n");
    sb.append("    readability: ").append(toIndentedString(readability)).append("\n");
    sb.append("    sentiment: ").append(toIndentedString(sentiment)).append("\n");
    sb.append("    grammar: ").append(toIndentedString(grammar)).append("\n");
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
    openapiFields.add("readability");
    openapiFields.add("sentiment");
    openapiFields.add("grammar");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AugmentedAuthoring
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AugmentedAuthoring.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AugmentedAuthoring is not found in the empty JSON string", AugmentedAuthoring.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AugmentedAuthoring.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AugmentedAuthoring` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `readability`
      if (jsonObj.get("readability") != null && !jsonObj.get("readability").isJsonNull()) {
        Readability.validateJsonElement(jsonObj.get("readability"));
      }
      // validate the optional field `sentiment`
      if (jsonObj.get("sentiment") != null && !jsonObj.get("sentiment").isJsonNull()) {
        Sentiment.validateJsonElement(jsonObj.get("sentiment"));
      }
      // validate the optional field `grammar`
      if (jsonObj.get("grammar") != null && !jsonObj.get("grammar").isJsonNull()) {
        Grammar.validateJsonElement(jsonObj.get("grammar"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AugmentedAuthoring.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AugmentedAuthoring' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AugmentedAuthoring> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AugmentedAuthoring.class));

       return (TypeAdapter<T>) new TypeAdapter<AugmentedAuthoring>() {
           @Override
           public void write(JsonWriter out, AugmentedAuthoring value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AugmentedAuthoring read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AugmentedAuthoring given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AugmentedAuthoring
  * @throws IOException if the JSON string is invalid with respect to AugmentedAuthoring
  */
  public static AugmentedAuthoring fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AugmentedAuthoring.class);
  }

 /**
  * Convert an instance of AugmentedAuthoring to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

