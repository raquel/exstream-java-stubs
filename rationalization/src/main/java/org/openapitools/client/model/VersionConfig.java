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
import org.openapitools.client.model.Details;

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
 * VersionConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-17T13:53:34.366018029Z[Europe/Lisbon]")
public class VersionConfig {
  public static final String SERIALIZED_NAME_API_IDENTIFIER = "apiIdentifier";
  @SerializedName(SERIALIZED_NAME_API_IDENTIFIER)
  private String apiIdentifier;

  public static final String SERIALIZED_NAME_CLIENT_VERSION = "clientVersion";
  @SerializedName(SERIALIZED_NAME_CLIENT_VERSION)
  private String clientVersion;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private Details details;

  public static final String SERIALIZED_NAME_MAJOR = "major";
  @SerializedName(SERIALIZED_NAME_MAJOR)
  private String major;

  public static final String SERIALIZED_NAME_MINOR = "minor";
  @SerializedName(SERIALIZED_NAME_MINOR)
  private String minor;

  public static final String SERIALIZED_NAME_PATCH = "patch";
  @SerializedName(SERIALIZED_NAME_PATCH)
  private String patch;

  public static final String SERIALIZED_NAME_VERSION_STRING = "versionString";
  @SerializedName(SERIALIZED_NAME_VERSION_STRING)
  private String versionString;

  public VersionConfig() {
  }

  public VersionConfig apiIdentifier(String apiIdentifier) {
    this.apiIdentifier = apiIdentifier;
    return this;
  }

   /**
   * Get apiIdentifier
   * @return apiIdentifier
  **/
  @javax.annotation.Nullable
  public String getApiIdentifier() {
    return apiIdentifier;
  }

  public void setApiIdentifier(String apiIdentifier) {
    this.apiIdentifier = apiIdentifier;
  }


  public VersionConfig clientVersion(String clientVersion) {
    this.clientVersion = clientVersion;
    return this;
  }

   /**
   * Get clientVersion
   * @return clientVersion
  **/
  @javax.annotation.Nullable
  public String getClientVersion() {
    return clientVersion;
  }

  public void setClientVersion(String clientVersion) {
    this.clientVersion = clientVersion;
  }


  public VersionConfig details(Details details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  public Details getDetails() {
    return details;
  }

  public void setDetails(Details details) {
    this.details = details;
  }


  public VersionConfig major(String major) {
    this.major = major;
    return this;
  }

   /**
   * Get major
   * @return major
  **/
  @javax.annotation.Nullable
  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }


  public VersionConfig minor(String minor) {
    this.minor = minor;
    return this;
  }

   /**
   * Get minor
   * @return minor
  **/
  @javax.annotation.Nullable
  public String getMinor() {
    return minor;
  }

  public void setMinor(String minor) {
    this.minor = minor;
  }


  public VersionConfig patch(String patch) {
    this.patch = patch;
    return this;
  }

   /**
   * Get patch
   * @return patch
  **/
  @javax.annotation.Nullable
  public String getPatch() {
    return patch;
  }

  public void setPatch(String patch) {
    this.patch = patch;
  }


  public VersionConfig versionString(String versionString) {
    this.versionString = versionString;
    return this;
  }

   /**
   * Get versionString
   * @return versionString
  **/
  @javax.annotation.Nullable
  public String getVersionString() {
    return versionString;
  }

  public void setVersionString(String versionString) {
    this.versionString = versionString;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionConfig versionConfig = (VersionConfig) o;
    return Objects.equals(this.apiIdentifier, versionConfig.apiIdentifier) &&
        Objects.equals(this.clientVersion, versionConfig.clientVersion) &&
        Objects.equals(this.details, versionConfig.details) &&
        Objects.equals(this.major, versionConfig.major) &&
        Objects.equals(this.minor, versionConfig.minor) &&
        Objects.equals(this.patch, versionConfig.patch) &&
        Objects.equals(this.versionString, versionConfig.versionString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiIdentifier, clientVersion, details, major, minor, patch, versionString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionConfig {\n");
    sb.append("    apiIdentifier: ").append(toIndentedString(apiIdentifier)).append("\n");
    sb.append("    clientVersion: ").append(toIndentedString(clientVersion)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
    sb.append("    versionString: ").append(toIndentedString(versionString)).append("\n");
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
    openapiFields.add("apiIdentifier");
    openapiFields.add("clientVersion");
    openapiFields.add("details");
    openapiFields.add("major");
    openapiFields.add("minor");
    openapiFields.add("patch");
    openapiFields.add("versionString");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VersionConfig
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VersionConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VersionConfig is not found in the empty JSON string", VersionConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VersionConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VersionConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("apiIdentifier") != null && !jsonObj.get("apiIdentifier").isJsonNull()) && !jsonObj.get("apiIdentifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiIdentifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiIdentifier").toString()));
      }
      if ((jsonObj.get("clientVersion") != null && !jsonObj.get("clientVersion").isJsonNull()) && !jsonObj.get("clientVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientVersion").toString()));
      }
      // validate the optional field `details`
      if (jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) {
        Details.validateJsonElement(jsonObj.get("details"));
      }
      if ((jsonObj.get("major") != null && !jsonObj.get("major").isJsonNull()) && !jsonObj.get("major").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `major` to be a primitive type in the JSON string but got `%s`", jsonObj.get("major").toString()));
      }
      if ((jsonObj.get("minor") != null && !jsonObj.get("minor").isJsonNull()) && !jsonObj.get("minor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minor").toString()));
      }
      if ((jsonObj.get("patch") != null && !jsonObj.get("patch").isJsonNull()) && !jsonObj.get("patch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `patch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("patch").toString()));
      }
      if ((jsonObj.get("versionString") != null && !jsonObj.get("versionString").isJsonNull()) && !jsonObj.get("versionString").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `versionString` to be a primitive type in the JSON string but got `%s`", jsonObj.get("versionString").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VersionConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VersionConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VersionConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VersionConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<VersionConfig>() {
           @Override
           public void write(JsonWriter out, VersionConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VersionConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VersionConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VersionConfig
  * @throws IOException if the JSON string is invalid with respect to VersionConfig
  */
  public static VersionConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VersionConfig.class);
  }

 /**
  * Convert an instance of VersionConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

