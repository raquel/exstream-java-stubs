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
 * ExportRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class ExportRequest {

  /**
   * Gets or Sets versions
   */
  public enum VersionsEnum {
    ALL("ALL"),
    
    LATEST_APPROVED("LATEST_APPROVED"),
    
    LATEST("LATEST");

    private String value;

    VersionsEnum(String value) {
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
    public static VersionsEnum fromValue(String value) {
      for (VersionsEnum b : VersionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private VersionsEnum versions;

  private String encrypt;

  public ExportRequest versions(VersionsEnum versions) {
    this.versions = versions;
    return this;
  }

  /**
   * Get versions
   * @return versions
  */
  
  @Schema(name = "versions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versions")
  public VersionsEnum getVersions() {
    return versions;
  }

  public void setVersions(VersionsEnum versions) {
    this.versions = versions;
  }

  public ExportRequest encrypt(String encrypt) {
    this.encrypt = encrypt;
    return this;
  }

  /**
   * Get encrypt
   * @return encrypt
  */
  
  @Schema(name = "encrypt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("encrypt")
  public String getEncrypt() {
    return encrypt;
  }

  public void setEncrypt(String encrypt) {
    this.encrypt = encrypt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportRequest exportRequest = (ExportRequest) o;
    return Objects.equals(this.versions, exportRequest.versions) &&
        Objects.equals(this.encrypt, exportRequest.encrypt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versions, encrypt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportRequest {\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
    sb.append("    encrypt: ").append(toIndentedString(encrypt)).append("\n");
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

