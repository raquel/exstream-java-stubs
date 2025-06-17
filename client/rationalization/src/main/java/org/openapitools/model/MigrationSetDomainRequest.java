package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MigrationSetDomainRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:40:32.411824350Z[Europe/Lisbon]")
public class MigrationSetDomainRequest {

  private UUID id;

  private Boolean editable;

  private String toDomain;

  private Boolean rat;

  public MigrationSetDomainRequest id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @Valid 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public MigrationSetDomainRequest editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

  /**
   * Get editable
   * @return editable
  */
  
  @Schema(name = "editable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("editable")
  public Boolean getEditable() {
    return editable;
  }

  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  public MigrationSetDomainRequest toDomain(String toDomain) {
    this.toDomain = toDomain;
    return this;
  }

  /**
   * Get toDomain
   * @return toDomain
  */
  
  @Schema(name = "toDomain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("toDomain")
  public String getToDomain() {
    return toDomain;
  }

  public void setToDomain(String toDomain) {
    this.toDomain = toDomain;
  }

  public MigrationSetDomainRequest rat(Boolean rat) {
    this.rat = rat;
    return this;
  }

  /**
   * Get rat
   * @return rat
  */
  
  @Schema(name = "rat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rat")
  public Boolean getRat() {
    return rat;
  }

  public void setRat(Boolean rat) {
    this.rat = rat;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationSetDomainRequest migrationSetDomainRequest = (MigrationSetDomainRequest) o;
    return Objects.equals(this.id, migrationSetDomainRequest.id) &&
        Objects.equals(this.editable, migrationSetDomainRequest.editable) &&
        Objects.equals(this.toDomain, migrationSetDomainRequest.toDomain) &&
        Objects.equals(this.rat, migrationSetDomainRequest.rat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, editable, toDomain, rat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationSetDomainRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    toDomain: ").append(toIndentedString(toDomain)).append("\n");
    sb.append("    rat: ").append(toIndentedString(rat)).append("\n");
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

