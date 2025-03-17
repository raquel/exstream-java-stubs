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
import org.openapitools.client.model.Coordinates;

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
 * FragmentMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-17T13:54:16.859257228Z[Europe/Lisbon]")
public class FragmentMetadata {
  public static final String SERIALIZED_NAME_COORDINATES = "coordinates";
  @SerializedName(SERIALIZED_NAME_COORDINATES)
  private Coordinates coordinates;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Double height;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Double width;

  public static final String SERIALIZED_NAME_PAGE_NO = "pageNo";
  @SerializedName(SERIALIZED_NAME_PAGE_NO)
  private Integer pageNo;

  public static final String SERIALIZED_NAME_FONT_SIZE = "fontSize";
  @SerializedName(SERIALIZED_NAME_FONT_SIZE)
  private String fontSize;

  public static final String SERIALIZED_NAME_FONT_FAMILY = "fontFamily";
  @SerializedName(SERIALIZED_NAME_FONT_FAMILY)
  private String fontFamily;

  public static final String SERIALIZED_NAME_FONT_STYLE = "fontStyle";
  @SerializedName(SERIALIZED_NAME_FONT_STYLE)
  private String fontStyle;

  public static final String SERIALIZED_NAME_FOREGROUND_COLOR = "foregroundColor";
  @SerializedName(SERIALIZED_NAME_FOREGROUND_COLOR)
  private String foregroundColor;

  public static final String SERIALIZED_NAME_BACKGROUND_COLOR = "backgroundColor";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_COLOR)
  private String backgroundColor;

  public static final String SERIALIZED_NAME_LINE_SPACING = "lineSpacing";
  @SerializedName(SERIALIZED_NAME_LINE_SPACING)
  private String lineSpacing;

  public static final String SERIALIZED_NAME_IS_STRIKE_OUT = "isStrikeOut";
  @SerializedName(SERIALIZED_NAME_IS_STRIKE_OUT)
  private String isStrikeOut;

  public static final String SERIALIZED_NAME_IS_UNDERLINE = "isUnderline";
  @SerializedName(SERIALIZED_NAME_IS_UNDERLINE)
  private String isUnderline;

  public FragmentMetadata() {
  }

  public FragmentMetadata coordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
    return this;
  }

   /**
   * Get coordinates
   * @return coordinates
  **/
  @javax.annotation.Nullable
  public Coordinates getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
  }


  public FragmentMetadata height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }


  public FragmentMetadata width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @javax.annotation.Nullable
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }


  public FragmentMetadata pageNo(Integer pageNo) {
    this.pageNo = pageNo;
    return this;
  }

   /**
   * Get pageNo
   * @return pageNo
  **/
  @javax.annotation.Nullable
  public Integer getPageNo() {
    return pageNo;
  }

  public void setPageNo(Integer pageNo) {
    this.pageNo = pageNo;
  }


  public FragmentMetadata fontSize(String fontSize) {
    this.fontSize = fontSize;
    return this;
  }

   /**
   * Get fontSize
   * @return fontSize
  **/
  @javax.annotation.Nullable
  public String getFontSize() {
    return fontSize;
  }

  public void setFontSize(String fontSize) {
    this.fontSize = fontSize;
  }


  public FragmentMetadata fontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
    return this;
  }

   /**
   * Get fontFamily
   * @return fontFamily
  **/
  @javax.annotation.Nullable
  public String getFontFamily() {
    return fontFamily;
  }

  public void setFontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
  }


  public FragmentMetadata fontStyle(String fontStyle) {
    this.fontStyle = fontStyle;
    return this;
  }

   /**
   * Get fontStyle
   * @return fontStyle
  **/
  @javax.annotation.Nullable
  public String getFontStyle() {
    return fontStyle;
  }

  public void setFontStyle(String fontStyle) {
    this.fontStyle = fontStyle;
  }


  public FragmentMetadata foregroundColor(String foregroundColor) {
    this.foregroundColor = foregroundColor;
    return this;
  }

   /**
   * Get foregroundColor
   * @return foregroundColor
  **/
  @javax.annotation.Nullable
  public String getForegroundColor() {
    return foregroundColor;
  }

  public void setForegroundColor(String foregroundColor) {
    this.foregroundColor = foregroundColor;
  }


  public FragmentMetadata backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

   /**
   * Get backgroundColor
   * @return backgroundColor
  **/
  @javax.annotation.Nullable
  public String getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }


  public FragmentMetadata lineSpacing(String lineSpacing) {
    this.lineSpacing = lineSpacing;
    return this;
  }

   /**
   * Get lineSpacing
   * @return lineSpacing
  **/
  @javax.annotation.Nullable
  public String getLineSpacing() {
    return lineSpacing;
  }

  public void setLineSpacing(String lineSpacing) {
    this.lineSpacing = lineSpacing;
  }


  public FragmentMetadata isStrikeOut(String isStrikeOut) {
    this.isStrikeOut = isStrikeOut;
    return this;
  }

   /**
   * Get isStrikeOut
   * @return isStrikeOut
  **/
  @javax.annotation.Nullable
  public String getIsStrikeOut() {
    return isStrikeOut;
  }

  public void setIsStrikeOut(String isStrikeOut) {
    this.isStrikeOut = isStrikeOut;
  }


  public FragmentMetadata isUnderline(String isUnderline) {
    this.isUnderline = isUnderline;
    return this;
  }

   /**
   * Get isUnderline
   * @return isUnderline
  **/
  @javax.annotation.Nullable
  public String getIsUnderline() {
    return isUnderline;
  }

  public void setIsUnderline(String isUnderline) {
    this.isUnderline = isUnderline;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FragmentMetadata fragmentMetadata = (FragmentMetadata) o;
    return Objects.equals(this.coordinates, fragmentMetadata.coordinates) &&
        Objects.equals(this.height, fragmentMetadata.height) &&
        Objects.equals(this.width, fragmentMetadata.width) &&
        Objects.equals(this.pageNo, fragmentMetadata.pageNo) &&
        Objects.equals(this.fontSize, fragmentMetadata.fontSize) &&
        Objects.equals(this.fontFamily, fragmentMetadata.fontFamily) &&
        Objects.equals(this.fontStyle, fragmentMetadata.fontStyle) &&
        Objects.equals(this.foregroundColor, fragmentMetadata.foregroundColor) &&
        Objects.equals(this.backgroundColor, fragmentMetadata.backgroundColor) &&
        Objects.equals(this.lineSpacing, fragmentMetadata.lineSpacing) &&
        Objects.equals(this.isStrikeOut, fragmentMetadata.isStrikeOut) &&
        Objects.equals(this.isUnderline, fragmentMetadata.isUnderline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinates, height, width, pageNo, fontSize, fontFamily, fontStyle, foregroundColor, backgroundColor, lineSpacing, isStrikeOut, isUnderline);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FragmentMetadata {\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    fontFamily: ").append(toIndentedString(fontFamily)).append("\n");
    sb.append("    fontStyle: ").append(toIndentedString(fontStyle)).append("\n");
    sb.append("    foregroundColor: ").append(toIndentedString(foregroundColor)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    lineSpacing: ").append(toIndentedString(lineSpacing)).append("\n");
    sb.append("    isStrikeOut: ").append(toIndentedString(isStrikeOut)).append("\n");
    sb.append("    isUnderline: ").append(toIndentedString(isUnderline)).append("\n");
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
    openapiFields.add("coordinates");
    openapiFields.add("height");
    openapiFields.add("width");
    openapiFields.add("pageNo");
    openapiFields.add("fontSize");
    openapiFields.add("fontFamily");
    openapiFields.add("fontStyle");
    openapiFields.add("foregroundColor");
    openapiFields.add("backgroundColor");
    openapiFields.add("lineSpacing");
    openapiFields.add("isStrikeOut");
    openapiFields.add("isUnderline");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FragmentMetadata
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FragmentMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FragmentMetadata is not found in the empty JSON string", FragmentMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FragmentMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FragmentMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `coordinates`
      if (jsonObj.get("coordinates") != null && !jsonObj.get("coordinates").isJsonNull()) {
        Coordinates.validateJsonElement(jsonObj.get("coordinates"));
      }
      if ((jsonObj.get("fontSize") != null && !jsonObj.get("fontSize").isJsonNull()) && !jsonObj.get("fontSize").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fontSize` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fontSize").toString()));
      }
      if ((jsonObj.get("fontFamily") != null && !jsonObj.get("fontFamily").isJsonNull()) && !jsonObj.get("fontFamily").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fontFamily` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fontFamily").toString()));
      }
      if ((jsonObj.get("fontStyle") != null && !jsonObj.get("fontStyle").isJsonNull()) && !jsonObj.get("fontStyle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fontStyle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fontStyle").toString()));
      }
      if ((jsonObj.get("foregroundColor") != null && !jsonObj.get("foregroundColor").isJsonNull()) && !jsonObj.get("foregroundColor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `foregroundColor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("foregroundColor").toString()));
      }
      if ((jsonObj.get("backgroundColor") != null && !jsonObj.get("backgroundColor").isJsonNull()) && !jsonObj.get("backgroundColor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backgroundColor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backgroundColor").toString()));
      }
      if ((jsonObj.get("lineSpacing") != null && !jsonObj.get("lineSpacing").isJsonNull()) && !jsonObj.get("lineSpacing").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lineSpacing` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lineSpacing").toString()));
      }
      if ((jsonObj.get("isStrikeOut") != null && !jsonObj.get("isStrikeOut").isJsonNull()) && !jsonObj.get("isStrikeOut").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isStrikeOut` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isStrikeOut").toString()));
      }
      if ((jsonObj.get("isUnderline") != null && !jsonObj.get("isUnderline").isJsonNull()) && !jsonObj.get("isUnderline").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isUnderline` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isUnderline").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FragmentMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FragmentMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FragmentMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FragmentMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<FragmentMetadata>() {
           @Override
           public void write(JsonWriter out, FragmentMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FragmentMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FragmentMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FragmentMetadata
  * @throws IOException if the JSON string is invalid with respect to FragmentMetadata
  */
  public static FragmentMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FragmentMetadata.class);
  }

 /**
  * Convert an instance of FragmentMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

