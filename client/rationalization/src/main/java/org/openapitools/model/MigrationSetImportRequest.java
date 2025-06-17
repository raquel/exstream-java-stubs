package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MigrationSetImportRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:40:32.411824350Z[Europe/Lisbon]")
public class MigrationSetImportRequest {

  private String encrypt;

  private org.springframework.core.io.Resource document;

  public MigrationSetImportRequest encrypt(String encrypt) {
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

  public MigrationSetImportRequest document(org.springframework.core.io.Resource document) {
    this.document = document;
    return this;
  }

  /**
   * Get document
   * @return document
  */
  @Valid 
  @Schema(name = "document", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("document")
  public org.springframework.core.io.Resource getDocument() {
    return document;
  }

  public void setDocument(org.springframework.core.io.Resource document) {
    this.document = document;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationSetImportRequest migrationSetImportRequest = (MigrationSetImportRequest) o;
    return Objects.equals(this.encrypt, migrationSetImportRequest.encrypt) &&
        Objects.equals(this.document, migrationSetImportRequest.document);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encrypt, document);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationSetImportRequest {\n");
    sb.append("    encrypt: ").append(toIndentedString(encrypt)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
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

