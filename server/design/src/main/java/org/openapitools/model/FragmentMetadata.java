package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Coordinates;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * FragmentMetadata
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class FragmentMetadata {

  private Coordinates coordinates;

  private Double height;

  private Double width;

  private Integer pageNo;

  private String fontSize;

  private String fontFamily;

  private String fontStyle;

  private String foregroundColor;

  private String backgroundColor;

  private String lineSpacing;

  private String isStrikeOut;

  private String isUnderline;

  public FragmentMetadata coordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  /**
   * Get coordinates
   * @return coordinates
  */
  @Valid 
  @Schema(name = "coordinates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("coordinates")
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
  */
  
  @Schema(name = "height", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("height")
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
  */
  
  @Schema(name = "width", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("width")
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
  */
  
  @Schema(name = "pageNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pageNo")
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
  */
  
  @Schema(name = "fontSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fontSize")
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
  */
  
  @Schema(name = "fontFamily", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fontFamily")
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
  */
  
  @Schema(name = "fontStyle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fontStyle")
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
  */
  
  @Schema(name = "foregroundColor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("foregroundColor")
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
  */
  
  @Schema(name = "backgroundColor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("backgroundColor")
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
  */
  
  @Schema(name = "lineSpacing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lineSpacing")
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
  */
  
  @Schema(name = "isStrikeOut", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isStrikeOut")
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
  */
  
  @Schema(name = "isUnderline", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isUnderline")
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
}

