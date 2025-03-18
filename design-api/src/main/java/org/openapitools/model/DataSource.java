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
 * DataSource
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T17:54:43.132703260Z[Europe/Lisbon]")
public class DataSource {

  private String id;

  private String name;

  private String prodDsn;

  private String resourceId;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    DRIVER("driver"),
    
    INITIALIZATION("initialization"),
    
    REFERENCE("reference"),
    
    INIT_POST_SORT("init-post-sort"),
    
    POST_SORT_REPORT("post-sort-report"),
    
    AUXILIARY_LAYOUT("auxiliary-layout"),
    
    XSLT("xslt"),
    
    CSS("css"),
    
    UNKNOWN("unknown"),
    
    UNUSED("unused"),
    
    EMPOWERDRIVER("empowerDriver"),
    
    SORT_INDEX("sort-index"),
    
    SORT_DATA("sort-data"),
    
    IMPORT("import"),
    
    USERPROVIDEDMAPPING("userProvidedMapping"),
    
    SUBPACKAGE("subPackage"),
    
    PACKAGE("package"),
    
    REPORT("report"),
    
    FILE_VIEWER("file-viewer"),
    
    CONTENT_OUTPUT("content-output"),
    
    SIGNATURE_REPORT("signature-report");

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

  public DataSource id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DataSource name(String name) {
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

  public DataSource prodDsn(String prodDsn) {
    this.prodDsn = prodDsn;
    return this;
  }

  /**
   * Get prodDsn
   * @return prodDsn
  */
  
  @Schema(name = "prodDsn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prodDsn")
  public String getProdDsn() {
    return prodDsn;
  }

  public void setProdDsn(String prodDsn) {
    this.prodDsn = prodDsn;
  }

  public DataSource resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * Get resourceId
   * @return resourceId
  */
  
  @Schema(name = "resourceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceId")
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public DataSource type(TypeEnum type) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataSource dataSource = (DataSource) o;
    return Objects.equals(this.id, dataSource.id) &&
        Objects.equals(this.name, dataSource.name) &&
        Objects.equals(this.prodDsn, dataSource.prodDsn) &&
        Objects.equals(this.resourceId, dataSource.resourceId) &&
        Objects.equals(this.type, dataSource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, prodDsn, resourceId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prodDsn: ").append(toIndentedString(prodDsn)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

