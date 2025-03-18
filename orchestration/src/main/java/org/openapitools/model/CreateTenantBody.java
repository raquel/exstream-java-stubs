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
 * CreateTenantBody
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:03:17.210646522Z[Europe/Lisbon]")
public class CreateTenantBody {

  private String tenantId;

  private String schemaName;

  private String dbUserId;

  private String dbPassword;

  public CreateTenantBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateTenantBody(String dbPassword) {
    this.dbPassword = dbPassword;
  }

  public CreateTenantBody tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
  */
  @Size(min = 1, max = 40) 
  @Schema(name = "tenantId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public CreateTenantBody schemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  /**
   * Get schemaName
   * @return schemaName
  */
  
  @Schema(name = "schemaName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schemaName")
  public String getSchemaName() {
    return schemaName;
  }

  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }

  public CreateTenantBody dbUserId(String dbUserId) {
    this.dbUserId = dbUserId;
    return this;
  }

  /**
   * Get dbUserId
   * @return dbUserId
  */
  
  @Schema(name = "dbUserId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dbUserId")
  public String getDbUserId() {
    return dbUserId;
  }

  public void setDbUserId(String dbUserId) {
    this.dbUserId = dbUserId;
  }

  public CreateTenantBody dbPassword(String dbPassword) {
    this.dbPassword = dbPassword;
    return this;
  }

  /**
   * Get dbPassword
   * @return dbPassword
  */
  @NotNull 
  @Schema(name = "dbPassword", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dbPassword")
  public String getDbPassword() {
    return dbPassword;
  }

  public void setDbPassword(String dbPassword) {
    this.dbPassword = dbPassword;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTenantBody createTenantBody = (CreateTenantBody) o;
    return Objects.equals(this.tenantId, createTenantBody.tenantId) &&
        Objects.equals(this.schemaName, createTenantBody.schemaName) &&
        Objects.equals(this.dbUserId, createTenantBody.dbUserId) &&
        Objects.equals(this.dbPassword, createTenantBody.dbPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, schemaName, dbUserId, dbPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTenantBody {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
    sb.append("    dbUserId: ").append(toIndentedString(dbUserId)).append("\n");
    sb.append("    dbPassword: ").append(toIndentedString(dbPassword)).append("\n");
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

