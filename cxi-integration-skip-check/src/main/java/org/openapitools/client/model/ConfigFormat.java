/*
 * Exstream CXI Integration
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
import org.openapitools.client.model.ConfigDetails;

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
 * ConfigFormat
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-17T13:55:59.778122580Z[Europe/Lisbon]")
public class ConfigFormat {
  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  /**
   * Gets or Sets configName
   */
  @JsonAdapter(ConfigNameEnum.Adapter.class)
  public enum ConfigNameEnum {
    COVISINT("covisint"),
    
    CUSTOMMETADATA("custommetadata"),
    
    CLEANUP("cleanup"),
    
    UNKNOWN("unknown");

    private String value;

    ConfigNameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConfigNameEnum fromValue(String value) {
      for (ConfigNameEnum b : ConfigNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ConfigNameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConfigNameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConfigNameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ConfigNameEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ConfigNameEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CONFIG_NAME = "configName";
  @SerializedName(SERIALIZED_NAME_CONFIG_NAME)
  private ConfigNameEnum configName;

  public static final String SERIALIZED_NAME_CONFIG_DETAILS = "configDetails";
  @SerializedName(SERIALIZED_NAME_CONFIG_DETAILS)
  private ConfigDetails configDetails;

  public static final String SERIALIZED_NAME_AUDIT_ENABLE = "auditEnable";
  @SerializedName(SERIALIZED_NAME_AUDIT_ENABLE)
  private Boolean auditEnable;

  public ConfigFormat() {
  }

  public ConfigFormat isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nullable
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public ConfigFormat configName(ConfigNameEnum configName) {
    this.configName = configName;
    return this;
  }

   /**
   * Get configName
   * @return configName
  **/
  @javax.annotation.Nullable
  public ConfigNameEnum getConfigName() {
    return configName;
  }

  public void setConfigName(ConfigNameEnum configName) {
    this.configName = configName;
  }


  public ConfigFormat configDetails(ConfigDetails configDetails) {
    this.configDetails = configDetails;
    return this;
  }

   /**
   * Get configDetails
   * @return configDetails
  **/
  @javax.annotation.Nullable
  public ConfigDetails getConfigDetails() {
    return configDetails;
  }

  public void setConfigDetails(ConfigDetails configDetails) {
    this.configDetails = configDetails;
  }


  public ConfigFormat auditEnable(Boolean auditEnable) {
    this.auditEnable = auditEnable;
    return this;
  }

   /**
   * Get auditEnable
   * @return auditEnable
  **/
  @javax.annotation.Nullable
  public Boolean getAuditEnable() {
    return auditEnable;
  }

  public void setAuditEnable(Boolean auditEnable) {
    this.auditEnable = auditEnable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigFormat configFormat = (ConfigFormat) o;
    return Objects.equals(this.isActive, configFormat.isActive) &&
        Objects.equals(this.configName, configFormat.configName) &&
        Objects.equals(this.configDetails, configFormat.configDetails) &&
        Objects.equals(this.auditEnable, configFormat.auditEnable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isActive, configName, configDetails, auditEnable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigFormat {\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
    sb.append("    configDetails: ").append(toIndentedString(configDetails)).append("\n");
    sb.append("    auditEnable: ").append(toIndentedString(auditEnable)).append("\n");
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
    openapiFields.add("isActive");
    openapiFields.add("configName");
    openapiFields.add("configDetails");
    openapiFields.add("auditEnable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ConfigFormat
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConfigFormat.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigFormat is not found in the empty JSON string", ConfigFormat.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConfigFormat.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfigFormat` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("configName") != null && !jsonObj.get("configName").isJsonNull()) && !jsonObj.get("configName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configName").toString()));
      }
      // validate the optional field `configName`
      if (jsonObj.get("configName") != null && !jsonObj.get("configName").isJsonNull()) {
        ConfigNameEnum.validateJsonElement(jsonObj.get("configName"));
      }
      // validate the optional field `configDetails`
      if (jsonObj.get("configDetails") != null && !jsonObj.get("configDetails").isJsonNull()) {
        ConfigDetails.validateJsonElement(jsonObj.get("configDetails"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfigFormat.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigFormat' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigFormat> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigFormat.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigFormat>() {
           @Override
           public void write(JsonWriter out, ConfigFormat value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfigFormat read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConfigFormat given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConfigFormat
  * @throws IOException if the JSON string is invalid with respect to ConfigFormat
  */
  public static ConfigFormat fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigFormat.class);
  }

 /**
  * Convert an instance of ConfigFormat to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

