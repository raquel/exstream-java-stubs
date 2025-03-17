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
 * ConfigurationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-17T13:54:16.859257228Z[Europe/Lisbon]")
public class ConfigurationResponse {
  public static final String SERIALIZED_NAME_EXSTREAM_ON_DEMAND_URL = "exstreamOnDemandUrl";
  @SerializedName(SERIALIZED_NAME_EXSTREAM_ON_DEMAND_URL)
  private String exstreamOnDemandUrl;

  public static final String SERIALIZED_NAME_EXSTREAM_O_T_D_S_URL = "exstreamOTDSUrl";
  @SerializedName(SERIALIZED_NAME_EXSTREAM_O_T_D_S_URL)
  private String exstreamOTDSUrl;

  public static final String SERIALIZED_NAME_EXSTREAM_DAS_URL = "exstreamDasUrl";
  @SerializedName(SERIALIZED_NAME_EXSTREAM_DAS_URL)
  private String exstreamDasUrl;

  public static final String SERIALIZED_NAME_EXSTREAM_ORC_URL = "exstreamOrcUrl";
  @SerializedName(SERIALIZED_NAME_EXSTREAM_ORC_URL)
  private String exstreamOrcUrl;

  public static final String SERIALIZED_NAME_EXSTREAM_ORCHESTRATOR_URL = "exstreamOrchestratorUrl";
  @SerializedName(SERIALIZED_NAME_EXSTREAM_ORCHESTRATOR_URL)
  private String exstreamOrchestratorUrl;

  public static final String SERIALIZED_NAME_EXSTREAM_RATIONALIZATION_URL = "exstreamRationalizationUrl";
  @SerializedName(SERIALIZED_NAME_EXSTREAM_RATIONALIZATION_URL)
  private String exstreamRationalizationUrl;

  public static final String SERIALIZED_NAME_EXSTREAM_E_I_URL = "exstreamEIUrl";
  @SerializedName(SERIALIZED_NAME_EXSTREAM_E_I_URL)
  private String exstreamEIUrl;

  public static final String SERIALIZED_NAME_EXSTREAM_E_E_P_URL = "exstreamEEPUrl";
  @SerializedName(SERIALIZED_NAME_EXSTREAM_E_E_P_URL)
  private String exstreamEEPUrl;

  public static final String SERIALIZED_NAME_EXSTREAM_EMPOWER_URL = "exstreamEmpowerUrl";
  @SerializedName(SERIALIZED_NAME_EXSTREAM_EMPOWER_URL)
  private String exstreamEmpowerUrl;

  public static final String SERIALIZED_NAME_DEPLOY_TYPE = "deployType";
  @SerializedName(SERIALIZED_NAME_DEPLOY_TYPE)
  private String deployType;

  public static final String SERIALIZED_NAME_OT2 = "ot2";
  @SerializedName(SERIALIZED_NAME_OT2)
  private String ot2;

  public static final String SERIALIZED_NAME_SOLR_ENABLED = "solrEnabled";
  @SerializedName(SERIALIZED_NAME_SOLR_ENABLED)
  private String solrEnabled;

  public static final String SERIALIZED_NAME_VAULT_ENABLED = "vaultEnabled";
  @SerializedName(SERIALIZED_NAME_VAULT_ENABLED)
  private Boolean vaultEnabled;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN_LIFETIME_SECONDS = "accessTokenLifetimeSeconds";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN_LIFETIME_SECONDS)
  private String accessTokenLifetimeSeconds;

  public ConfigurationResponse() {
  }

  public ConfigurationResponse exstreamOnDemandUrl(String exstreamOnDemandUrl) {
    this.exstreamOnDemandUrl = exstreamOnDemandUrl;
    return this;
  }

   /**
   * Get exstreamOnDemandUrl
   * @return exstreamOnDemandUrl
  **/
  @javax.annotation.Nullable
  public String getExstreamOnDemandUrl() {
    return exstreamOnDemandUrl;
  }

  public void setExstreamOnDemandUrl(String exstreamOnDemandUrl) {
    this.exstreamOnDemandUrl = exstreamOnDemandUrl;
  }


  public ConfigurationResponse exstreamOTDSUrl(String exstreamOTDSUrl) {
    this.exstreamOTDSUrl = exstreamOTDSUrl;
    return this;
  }

   /**
   * Get exstreamOTDSUrl
   * @return exstreamOTDSUrl
  **/
  @javax.annotation.Nullable
  public String getExstreamOTDSUrl() {
    return exstreamOTDSUrl;
  }

  public void setExstreamOTDSUrl(String exstreamOTDSUrl) {
    this.exstreamOTDSUrl = exstreamOTDSUrl;
  }


  public ConfigurationResponse exstreamDasUrl(String exstreamDasUrl) {
    this.exstreamDasUrl = exstreamDasUrl;
    return this;
  }

   /**
   * Get exstreamDasUrl
   * @return exstreamDasUrl
  **/
  @javax.annotation.Nullable
  public String getExstreamDasUrl() {
    return exstreamDasUrl;
  }

  public void setExstreamDasUrl(String exstreamDasUrl) {
    this.exstreamDasUrl = exstreamDasUrl;
  }


  public ConfigurationResponse exstreamOrcUrl(String exstreamOrcUrl) {
    this.exstreamOrcUrl = exstreamOrcUrl;
    return this;
  }

   /**
   * Get exstreamOrcUrl
   * @return exstreamOrcUrl
  **/
  @javax.annotation.Nullable
  public String getExstreamOrcUrl() {
    return exstreamOrcUrl;
  }

  public void setExstreamOrcUrl(String exstreamOrcUrl) {
    this.exstreamOrcUrl = exstreamOrcUrl;
  }


  public ConfigurationResponse exstreamOrchestratorUrl(String exstreamOrchestratorUrl) {
    this.exstreamOrchestratorUrl = exstreamOrchestratorUrl;
    return this;
  }

   /**
   * Get exstreamOrchestratorUrl
   * @return exstreamOrchestratorUrl
  **/
  @javax.annotation.Nullable
  public String getExstreamOrchestratorUrl() {
    return exstreamOrchestratorUrl;
  }

  public void setExstreamOrchestratorUrl(String exstreamOrchestratorUrl) {
    this.exstreamOrchestratorUrl = exstreamOrchestratorUrl;
  }


  public ConfigurationResponse exstreamRationalizationUrl(String exstreamRationalizationUrl) {
    this.exstreamRationalizationUrl = exstreamRationalizationUrl;
    return this;
  }

   /**
   * Get exstreamRationalizationUrl
   * @return exstreamRationalizationUrl
  **/
  @javax.annotation.Nullable
  public String getExstreamRationalizationUrl() {
    return exstreamRationalizationUrl;
  }

  public void setExstreamRationalizationUrl(String exstreamRationalizationUrl) {
    this.exstreamRationalizationUrl = exstreamRationalizationUrl;
  }


  public ConfigurationResponse exstreamEIUrl(String exstreamEIUrl) {
    this.exstreamEIUrl = exstreamEIUrl;
    return this;
  }

   /**
   * Get exstreamEIUrl
   * @return exstreamEIUrl
  **/
  @javax.annotation.Nullable
  public String getExstreamEIUrl() {
    return exstreamEIUrl;
  }

  public void setExstreamEIUrl(String exstreamEIUrl) {
    this.exstreamEIUrl = exstreamEIUrl;
  }


  public ConfigurationResponse exstreamEEPUrl(String exstreamEEPUrl) {
    this.exstreamEEPUrl = exstreamEEPUrl;
    return this;
  }

   /**
   * Get exstreamEEPUrl
   * @return exstreamEEPUrl
  **/
  @javax.annotation.Nullable
  public String getExstreamEEPUrl() {
    return exstreamEEPUrl;
  }

  public void setExstreamEEPUrl(String exstreamEEPUrl) {
    this.exstreamEEPUrl = exstreamEEPUrl;
  }


  public ConfigurationResponse exstreamEmpowerUrl(String exstreamEmpowerUrl) {
    this.exstreamEmpowerUrl = exstreamEmpowerUrl;
    return this;
  }

   /**
   * Get exstreamEmpowerUrl
   * @return exstreamEmpowerUrl
  **/
  @javax.annotation.Nullable
  public String getExstreamEmpowerUrl() {
    return exstreamEmpowerUrl;
  }

  public void setExstreamEmpowerUrl(String exstreamEmpowerUrl) {
    this.exstreamEmpowerUrl = exstreamEmpowerUrl;
  }


  public ConfigurationResponse deployType(String deployType) {
    this.deployType = deployType;
    return this;
  }

   /**
   * Get deployType
   * @return deployType
  **/
  @javax.annotation.Nullable
  public String getDeployType() {
    return deployType;
  }

  public void setDeployType(String deployType) {
    this.deployType = deployType;
  }


  public ConfigurationResponse ot2(String ot2) {
    this.ot2 = ot2;
    return this;
  }

   /**
   * Get ot2
   * @return ot2
  **/
  @javax.annotation.Nullable
  public String getOt2() {
    return ot2;
  }

  public void setOt2(String ot2) {
    this.ot2 = ot2;
  }


  public ConfigurationResponse solrEnabled(String solrEnabled) {
    this.solrEnabled = solrEnabled;
    return this;
  }

   /**
   * Get solrEnabled
   * @return solrEnabled
  **/
  @javax.annotation.Nullable
  public String getSolrEnabled() {
    return solrEnabled;
  }

  public void setSolrEnabled(String solrEnabled) {
    this.solrEnabled = solrEnabled;
  }


  public ConfigurationResponse vaultEnabled(Boolean vaultEnabled) {
    this.vaultEnabled = vaultEnabled;
    return this;
  }

   /**
   * Get vaultEnabled
   * @return vaultEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getVaultEnabled() {
    return vaultEnabled;
  }

  public void setVaultEnabled(Boolean vaultEnabled) {
    this.vaultEnabled = vaultEnabled;
  }


  public ConfigurationResponse accessTokenLifetimeSeconds(String accessTokenLifetimeSeconds) {
    this.accessTokenLifetimeSeconds = accessTokenLifetimeSeconds;
    return this;
  }

   /**
   * Get accessTokenLifetimeSeconds
   * @return accessTokenLifetimeSeconds
  **/
  @javax.annotation.Nullable
  public String getAccessTokenLifetimeSeconds() {
    return accessTokenLifetimeSeconds;
  }

  public void setAccessTokenLifetimeSeconds(String accessTokenLifetimeSeconds) {
    this.accessTokenLifetimeSeconds = accessTokenLifetimeSeconds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationResponse configurationResponse = (ConfigurationResponse) o;
    return Objects.equals(this.exstreamOnDemandUrl, configurationResponse.exstreamOnDemandUrl) &&
        Objects.equals(this.exstreamOTDSUrl, configurationResponse.exstreamOTDSUrl) &&
        Objects.equals(this.exstreamDasUrl, configurationResponse.exstreamDasUrl) &&
        Objects.equals(this.exstreamOrcUrl, configurationResponse.exstreamOrcUrl) &&
        Objects.equals(this.exstreamOrchestratorUrl, configurationResponse.exstreamOrchestratorUrl) &&
        Objects.equals(this.exstreamRationalizationUrl, configurationResponse.exstreamRationalizationUrl) &&
        Objects.equals(this.exstreamEIUrl, configurationResponse.exstreamEIUrl) &&
        Objects.equals(this.exstreamEEPUrl, configurationResponse.exstreamEEPUrl) &&
        Objects.equals(this.exstreamEmpowerUrl, configurationResponse.exstreamEmpowerUrl) &&
        Objects.equals(this.deployType, configurationResponse.deployType) &&
        Objects.equals(this.ot2, configurationResponse.ot2) &&
        Objects.equals(this.solrEnabled, configurationResponse.solrEnabled) &&
        Objects.equals(this.vaultEnabled, configurationResponse.vaultEnabled) &&
        Objects.equals(this.accessTokenLifetimeSeconds, configurationResponse.accessTokenLifetimeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exstreamOnDemandUrl, exstreamOTDSUrl, exstreamDasUrl, exstreamOrcUrl, exstreamOrchestratorUrl, exstreamRationalizationUrl, exstreamEIUrl, exstreamEEPUrl, exstreamEmpowerUrl, deployType, ot2, solrEnabled, vaultEnabled, accessTokenLifetimeSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationResponse {\n");
    sb.append("    exstreamOnDemandUrl: ").append(toIndentedString(exstreamOnDemandUrl)).append("\n");
    sb.append("    exstreamOTDSUrl: ").append(toIndentedString(exstreamOTDSUrl)).append("\n");
    sb.append("    exstreamDasUrl: ").append(toIndentedString(exstreamDasUrl)).append("\n");
    sb.append("    exstreamOrcUrl: ").append(toIndentedString(exstreamOrcUrl)).append("\n");
    sb.append("    exstreamOrchestratorUrl: ").append(toIndentedString(exstreamOrchestratorUrl)).append("\n");
    sb.append("    exstreamRationalizationUrl: ").append(toIndentedString(exstreamRationalizationUrl)).append("\n");
    sb.append("    exstreamEIUrl: ").append(toIndentedString(exstreamEIUrl)).append("\n");
    sb.append("    exstreamEEPUrl: ").append(toIndentedString(exstreamEEPUrl)).append("\n");
    sb.append("    exstreamEmpowerUrl: ").append(toIndentedString(exstreamEmpowerUrl)).append("\n");
    sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
    sb.append("    ot2: ").append(toIndentedString(ot2)).append("\n");
    sb.append("    solrEnabled: ").append(toIndentedString(solrEnabled)).append("\n");
    sb.append("    vaultEnabled: ").append(toIndentedString(vaultEnabled)).append("\n");
    sb.append("    accessTokenLifetimeSeconds: ").append(toIndentedString(accessTokenLifetimeSeconds)).append("\n");
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
    openapiFields.add("exstreamOnDemandUrl");
    openapiFields.add("exstreamOTDSUrl");
    openapiFields.add("exstreamDasUrl");
    openapiFields.add("exstreamOrcUrl");
    openapiFields.add("exstreamOrchestratorUrl");
    openapiFields.add("exstreamRationalizationUrl");
    openapiFields.add("exstreamEIUrl");
    openapiFields.add("exstreamEEPUrl");
    openapiFields.add("exstreamEmpowerUrl");
    openapiFields.add("deployType");
    openapiFields.add("ot2");
    openapiFields.add("solrEnabled");
    openapiFields.add("vaultEnabled");
    openapiFields.add("accessTokenLifetimeSeconds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ConfigurationResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConfigurationResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigurationResponse is not found in the empty JSON string", ConfigurationResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConfigurationResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfigurationResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("exstreamOnDemandUrl") != null && !jsonObj.get("exstreamOnDemandUrl").isJsonNull()) && !jsonObj.get("exstreamOnDemandUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exstreamOnDemandUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exstreamOnDemandUrl").toString()));
      }
      if ((jsonObj.get("exstreamOTDSUrl") != null && !jsonObj.get("exstreamOTDSUrl").isJsonNull()) && !jsonObj.get("exstreamOTDSUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exstreamOTDSUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exstreamOTDSUrl").toString()));
      }
      if ((jsonObj.get("exstreamDasUrl") != null && !jsonObj.get("exstreamDasUrl").isJsonNull()) && !jsonObj.get("exstreamDasUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exstreamDasUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exstreamDasUrl").toString()));
      }
      if ((jsonObj.get("exstreamOrcUrl") != null && !jsonObj.get("exstreamOrcUrl").isJsonNull()) && !jsonObj.get("exstreamOrcUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exstreamOrcUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exstreamOrcUrl").toString()));
      }
      if ((jsonObj.get("exstreamOrchestratorUrl") != null && !jsonObj.get("exstreamOrchestratorUrl").isJsonNull()) && !jsonObj.get("exstreamOrchestratorUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exstreamOrchestratorUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exstreamOrchestratorUrl").toString()));
      }
      if ((jsonObj.get("exstreamRationalizationUrl") != null && !jsonObj.get("exstreamRationalizationUrl").isJsonNull()) && !jsonObj.get("exstreamRationalizationUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exstreamRationalizationUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exstreamRationalizationUrl").toString()));
      }
      if ((jsonObj.get("exstreamEIUrl") != null && !jsonObj.get("exstreamEIUrl").isJsonNull()) && !jsonObj.get("exstreamEIUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exstreamEIUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exstreamEIUrl").toString()));
      }
      if ((jsonObj.get("exstreamEEPUrl") != null && !jsonObj.get("exstreamEEPUrl").isJsonNull()) && !jsonObj.get("exstreamEEPUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exstreamEEPUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exstreamEEPUrl").toString()));
      }
      if ((jsonObj.get("exstreamEmpowerUrl") != null && !jsonObj.get("exstreamEmpowerUrl").isJsonNull()) && !jsonObj.get("exstreamEmpowerUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exstreamEmpowerUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exstreamEmpowerUrl").toString()));
      }
      if ((jsonObj.get("deployType") != null && !jsonObj.get("deployType").isJsonNull()) && !jsonObj.get("deployType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deployType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deployType").toString()));
      }
      if ((jsonObj.get("ot2") != null && !jsonObj.get("ot2").isJsonNull()) && !jsonObj.get("ot2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ot2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ot2").toString()));
      }
      if ((jsonObj.get("solrEnabled") != null && !jsonObj.get("solrEnabled").isJsonNull()) && !jsonObj.get("solrEnabled").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `solrEnabled` to be a primitive type in the JSON string but got `%s`", jsonObj.get("solrEnabled").toString()));
      }
      if ((jsonObj.get("accessTokenLifetimeSeconds") != null && !jsonObj.get("accessTokenLifetimeSeconds").isJsonNull()) && !jsonObj.get("accessTokenLifetimeSeconds").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessTokenLifetimeSeconds` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accessTokenLifetimeSeconds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfigurationResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigurationResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigurationResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigurationResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigurationResponse>() {
           @Override
           public void write(JsonWriter out, ConfigurationResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfigurationResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConfigurationResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConfigurationResponse
  * @throws IOException if the JSON string is invalid with respect to ConfigurationResponse
  */
  public static ConfigurationResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigurationResponse.class);
  }

 /**
  * Convert an instance of ConfigurationResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

