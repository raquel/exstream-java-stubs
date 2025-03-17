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
 * SimplePage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-17T13:44:46.273765810Z[Europe/Lisbon]")
public class SimplePage {
  public static final String SERIALIZED_NAME_CURRENT_PAGE_NUMBER = "currentPageNumber";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE_NUMBER)
  private Integer currentPageNumber;

  public static final String SERIALIZED_NAME_PAGE_OFFSET = "pageOffset";
  @SerializedName(SERIALIZED_NAME_PAGE_OFFSET)
  private Integer pageOffset;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_TOTAL_ELEMENTS = "totalElements";
  @SerializedName(SERIALIZED_NAME_TOTAL_ELEMENTS)
  private Long totalElements;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "totalPages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private Integer totalPages;

  public SimplePage() {
  }

  public SimplePage currentPageNumber(Integer currentPageNumber) {
    this.currentPageNumber = currentPageNumber;
    return this;
  }

   /**
   * Get currentPageNumber
   * @return currentPageNumber
  **/
  @javax.annotation.Nullable
  public Integer getCurrentPageNumber() {
    return currentPageNumber;
  }

  public void setCurrentPageNumber(Integer currentPageNumber) {
    this.currentPageNumber = currentPageNumber;
  }


  public SimplePage pageOffset(Integer pageOffset) {
    this.pageOffset = pageOffset;
    return this;
  }

   /**
   * Get pageOffset
   * @return pageOffset
  **/
  @javax.annotation.Nullable
  public Integer getPageOffset() {
    return pageOffset;
  }

  public void setPageOffset(Integer pageOffset) {
    this.pageOffset = pageOffset;
  }


  public SimplePage pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @javax.annotation.Nullable
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public SimplePage totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

   /**
   * Get totalElements
   * @return totalElements
  **/
  @javax.annotation.Nullable
  public Long getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }


  public SimplePage totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Get totalPages
   * @return totalPages
  **/
  @javax.annotation.Nullable
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimplePage simplePage = (SimplePage) o;
    return Objects.equals(this.currentPageNumber, simplePage.currentPageNumber) &&
        Objects.equals(this.pageOffset, simplePage.pageOffset) &&
        Objects.equals(this.pageSize, simplePage.pageSize) &&
        Objects.equals(this.totalElements, simplePage.totalElements) &&
        Objects.equals(this.totalPages, simplePage.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPageNumber, pageOffset, pageSize, totalElements, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimplePage {\n");
    sb.append("    currentPageNumber: ").append(toIndentedString(currentPageNumber)).append("\n");
    sb.append("    pageOffset: ").append(toIndentedString(pageOffset)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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
    openapiFields.add("currentPageNumber");
    openapiFields.add("pageOffset");
    openapiFields.add("pageSize");
    openapiFields.add("totalElements");
    openapiFields.add("totalPages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SimplePage
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SimplePage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SimplePage is not found in the empty JSON string", SimplePage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SimplePage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SimplePage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimplePage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimplePage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimplePage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimplePage.class));

       return (TypeAdapter<T>) new TypeAdapter<SimplePage>() {
           @Override
           public void write(JsonWriter out, SimplePage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SimplePage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SimplePage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SimplePage
  * @throws IOException if the JSON string is invalid with respect to SimplePage
  */
  public static SimplePage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimplePage.class);
  }

 /**
  * Convert an instance of SimplePage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

