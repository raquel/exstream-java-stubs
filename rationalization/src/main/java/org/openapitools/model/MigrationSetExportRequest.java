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
 * MigrationSetExportRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:04:36.667726893Z[Europe/Lisbon]")
public class MigrationSetExportRequest {

  /**
   * Gets or Sets versions
   */
  public enum VersionsEnum {
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

  private String id;

  private String encrypt;

  public MigrationSetExportRequest versions(VersionsEnum versions) {
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

  public MigrationSetExportRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MigrationSetExportRequest encrypt(String encrypt) {
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
    MigrationSetExportRequest migrationSetExportRequest = (MigrationSetExportRequest) o;
    return Objects.equals(this.versions, migrationSetExportRequest.versions) &&
        Objects.equals(this.id, migrationSetExportRequest.id) &&
        Objects.equals(this.encrypt, migrationSetExportRequest.encrypt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versions, id, encrypt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationSetExportRequest {\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

