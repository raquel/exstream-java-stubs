package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Output
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class Output {

  /**
   * Gets or Sets category
   */
  public enum CategoryEnum {
    BCA("bca"),
    
    MESSAGE("message"),
    
    OUTPUT("output");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CategoryEnum category;

  private String driver;

  private String prodFile;

  private Boolean appLevel;

  public Output category(CategoryEnum category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  
  @Schema(name = "category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public Output driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Get driver
   * @return driver
  */
  
  @Schema(name = "driver", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("driver")
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public Output prodFile(String prodFile) {
    this.prodFile = prodFile;
    return this;
  }

  /**
   * Get prodFile
   * @return prodFile
  */
  
  @Schema(name = "prodFile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prodFile")
  public String getProdFile() {
    return prodFile;
  }

  public void setProdFile(String prodFile) {
    this.prodFile = prodFile;
  }

  public Output appLevel(Boolean appLevel) {
    this.appLevel = appLevel;
    return this;
  }

  /**
   * Get appLevel
   * @return appLevel
  */
  
  @Schema(name = "appLevel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appLevel")
  public Boolean getAppLevel() {
    return appLevel;
  }

  public void setAppLevel(Boolean appLevel) {
    this.appLevel = appLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Output output = (Output) o;
    return Objects.equals(this.category, output.category) &&
        Objects.equals(this.driver, output.driver) &&
        Objects.equals(this.prodFile, output.prodFile) &&
        Objects.equals(this.appLevel, output.appLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, driver, prodFile, appLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Output {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    prodFile: ").append(toIndentedString(prodFile)).append("\n");
    sb.append("    appLevel: ").append(toIndentedString(appLevel)).append("\n");
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

