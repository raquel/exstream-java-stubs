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
 * MigrationSetResource
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:40:32.411824350Z[Europe/Lisbon]")
public class MigrationSetResource {

  private String name;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    XML("XML"),
    
    JSON("JSON"),
    
    PDF("PDF"),
    
    DOC("DOC"),
    
    DOCX("DOCX"),
    
    HTM("HTM"),
    
    HTML("HTML"),
    
    TXT("TXT"),
    
    PNG("PNG"),
    
    JPG("JPG"),
    
    TEMPLATE("TEMPLATE"),
    
    THEME("THEME"),
    
    UNKNOWN("UNKNOWN"),
    
    BIN("BIN");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private Boolean isIncluded;

  public MigrationSetResource name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MigrationSetResource type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MigrationSetResource isIncluded(Boolean isIncluded) {
    this.isIncluded = isIncluded;
    return this;
  }

  /**
   * Get isIncluded
   * @return isIncluded
  */
  
  @Schema(name = "isIncluded", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isIncluded")
  public Boolean getIsIncluded() {
    return isIncluded;
  }

  public void setIsIncluded(Boolean isIncluded) {
    this.isIncluded = isIncluded;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationSetResource migrationSetResource = (MigrationSetResource) o;
    return Objects.equals(this.name, migrationSetResource.name) &&
        Objects.equals(this.type, migrationSetResource.type) &&
        Objects.equals(this.isIncluded, migrationSetResource.isIncluded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, isIncluded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationSetResource {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isIncluded: ").append(toIndentedString(isIncluded)).append("\n");
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

