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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.NameIdPair;
import org.openapitools.client.model.Subscription;

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
 * CurrentUserResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-17T13:54:16.859257228Z[Europe/Lisbon]")
public class CurrentUserResponse {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TENANT_NAME = "tenantName";
  @SerializedName(SERIALIZED_NAME_TENANT_NAME)
  private String tenantName;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<String> groups;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<NameIdPair> roles;

  public static final String SERIALIZED_NAME_IS_TENANT_ADMIN = "isTenantAdmin";
  @SerializedName(SERIALIZED_NAME_IS_TENANT_ADMIN)
  private Boolean isTenantAdmin;

  public static final String SERIALIZED_NAME_IS_SYSTEM_ADMIN = "isSystemAdmin";
  @SerializedName(SERIALIZED_NAME_IS_SYSTEM_ADMIN)
  private Boolean isSystemAdmin;

  public static final String SERIALIZED_NAME_IS_OT2_TENANT_ADMIN = "isOt2TenantAdmin";
  @SerializedName(SERIALIZED_NAME_IS_OT2_TENANT_ADMIN)
  private Boolean isOt2TenantAdmin;

  public static final String SERIALIZED_NAME_OT2_SUBSCRIPTIONS = "ot2Subscriptions";
  @SerializedName(SERIALIZED_NAME_OT2_SUBSCRIPTIONS)
  private List<Subscription> ot2Subscriptions;

  public CurrentUserResponse() {
  }

  public CurrentUserResponse name(String name) {
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


  public CurrentUserResponse tenantName(String tenantName) {
    this.tenantName = tenantName;
    return this;
  }

   /**
   * Get tenantName
   * @return tenantName
  **/
  @javax.annotation.Nullable
  public String getTenantName() {
    return tenantName;
  }

  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }


  public CurrentUserResponse groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public CurrentUserResponse addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nullable
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }


  public CurrentUserResponse roles(List<NameIdPair> roles) {
    this.roles = roles;
    return this;
  }

  public CurrentUserResponse addRolesItem(NameIdPair rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @javax.annotation.Nullable
  public List<NameIdPair> getRoles() {
    return roles;
  }

  public void setRoles(List<NameIdPair> roles) {
    this.roles = roles;
  }


  public CurrentUserResponse isTenantAdmin(Boolean isTenantAdmin) {
    this.isTenantAdmin = isTenantAdmin;
    return this;
  }

   /**
   * Get isTenantAdmin
   * @return isTenantAdmin
  **/
  @javax.annotation.Nullable
  public Boolean getIsTenantAdmin() {
    return isTenantAdmin;
  }

  public void setIsTenantAdmin(Boolean isTenantAdmin) {
    this.isTenantAdmin = isTenantAdmin;
  }


  public CurrentUserResponse isSystemAdmin(Boolean isSystemAdmin) {
    this.isSystemAdmin = isSystemAdmin;
    return this;
  }

   /**
   * Get isSystemAdmin
   * @return isSystemAdmin
  **/
  @javax.annotation.Nullable
  public Boolean getIsSystemAdmin() {
    return isSystemAdmin;
  }

  public void setIsSystemAdmin(Boolean isSystemAdmin) {
    this.isSystemAdmin = isSystemAdmin;
  }


  public CurrentUserResponse isOt2TenantAdmin(Boolean isOt2TenantAdmin) {
    this.isOt2TenantAdmin = isOt2TenantAdmin;
    return this;
  }

   /**
   * Get isOt2TenantAdmin
   * @return isOt2TenantAdmin
  **/
  @javax.annotation.Nullable
  public Boolean getIsOt2TenantAdmin() {
    return isOt2TenantAdmin;
  }

  public void setIsOt2TenantAdmin(Boolean isOt2TenantAdmin) {
    this.isOt2TenantAdmin = isOt2TenantAdmin;
  }


  public CurrentUserResponse ot2Subscriptions(List<Subscription> ot2Subscriptions) {
    this.ot2Subscriptions = ot2Subscriptions;
    return this;
  }

  public CurrentUserResponse addOt2SubscriptionsItem(Subscription ot2SubscriptionsItem) {
    if (this.ot2Subscriptions == null) {
      this.ot2Subscriptions = new ArrayList<>();
    }
    this.ot2Subscriptions.add(ot2SubscriptionsItem);
    return this;
  }

   /**
   * Get ot2Subscriptions
   * @return ot2Subscriptions
  **/
  @javax.annotation.Nullable
  public List<Subscription> getOt2Subscriptions() {
    return ot2Subscriptions;
  }

  public void setOt2Subscriptions(List<Subscription> ot2Subscriptions) {
    this.ot2Subscriptions = ot2Subscriptions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentUserResponse currentUserResponse = (CurrentUserResponse) o;
    return Objects.equals(this.name, currentUserResponse.name) &&
        Objects.equals(this.tenantName, currentUserResponse.tenantName) &&
        Objects.equals(this.groups, currentUserResponse.groups) &&
        Objects.equals(this.roles, currentUserResponse.roles) &&
        Objects.equals(this.isTenantAdmin, currentUserResponse.isTenantAdmin) &&
        Objects.equals(this.isSystemAdmin, currentUserResponse.isSystemAdmin) &&
        Objects.equals(this.isOt2TenantAdmin, currentUserResponse.isOt2TenantAdmin) &&
        Objects.equals(this.ot2Subscriptions, currentUserResponse.ot2Subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, tenantName, groups, roles, isTenantAdmin, isSystemAdmin, isOt2TenantAdmin, ot2Subscriptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentUserResponse {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    isTenantAdmin: ").append(toIndentedString(isTenantAdmin)).append("\n");
    sb.append("    isSystemAdmin: ").append(toIndentedString(isSystemAdmin)).append("\n");
    sb.append("    isOt2TenantAdmin: ").append(toIndentedString(isOt2TenantAdmin)).append("\n");
    sb.append("    ot2Subscriptions: ").append(toIndentedString(ot2Subscriptions)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("tenantName");
    openapiFields.add("groups");
    openapiFields.add("roles");
    openapiFields.add("isTenantAdmin");
    openapiFields.add("isSystemAdmin");
    openapiFields.add("isOt2TenantAdmin");
    openapiFields.add("ot2Subscriptions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CurrentUserResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CurrentUserResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CurrentUserResponse is not found in the empty JSON string", CurrentUserResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CurrentUserResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CurrentUserResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("tenantName") != null && !jsonObj.get("tenantName").isJsonNull()) && !jsonObj.get("tenantName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonNull() && !jsonObj.get("groups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
      }
      if (jsonObj.get("roles") != null && !jsonObj.get("roles").isJsonNull()) {
        JsonArray jsonArrayroles = jsonObj.getAsJsonArray("roles");
        if (jsonArrayroles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("roles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `roles` to be an array in the JSON string but got `%s`", jsonObj.get("roles").toString()));
          }

          // validate the optional field `roles` (array)
          for (int i = 0; i < jsonArrayroles.size(); i++) {
            NameIdPair.validateJsonElement(jsonArrayroles.get(i));
          };
        }
      }
      if (jsonObj.get("ot2Subscriptions") != null && !jsonObj.get("ot2Subscriptions").isJsonNull()) {
        JsonArray jsonArrayot2Subscriptions = jsonObj.getAsJsonArray("ot2Subscriptions");
        if (jsonArrayot2Subscriptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ot2Subscriptions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ot2Subscriptions` to be an array in the JSON string but got `%s`", jsonObj.get("ot2Subscriptions").toString()));
          }

          // validate the optional field `ot2Subscriptions` (array)
          for (int i = 0; i < jsonArrayot2Subscriptions.size(); i++) {
            Subscription.validateJsonElement(jsonArrayot2Subscriptions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CurrentUserResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CurrentUserResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CurrentUserResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CurrentUserResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CurrentUserResponse>() {
           @Override
           public void write(JsonWriter out, CurrentUserResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CurrentUserResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CurrentUserResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CurrentUserResponse
  * @throws IOException if the JSON string is invalid with respect to CurrentUserResponse
  */
  public static CurrentUserResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CurrentUserResponse.class);
  }

 /**
  * Convert an instance of CurrentUserResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

