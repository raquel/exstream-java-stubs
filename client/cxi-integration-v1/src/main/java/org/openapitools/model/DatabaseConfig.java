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
 * DatabaseConfig
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:34:47.568105362Z[Europe/Lisbon]")
public class DatabaseConfig {

  private String dbVendor;

  private String dbName;

  private String dbSchema;

  private String dbUserName;

  private String dbPassword;

  private String connectionUrl;

  public DatabaseConfig dbVendor(String dbVendor) {
    this.dbVendor = dbVendor;
    return this;
  }

  /**
   * Get dbVendor
   * @return dbVendor
  */
  
  @Schema(name = "dbVendor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dbVendor")
  public String getDbVendor() {
    return dbVendor;
  }

  public void setDbVendor(String dbVendor) {
    this.dbVendor = dbVendor;
  }

  public DatabaseConfig dbName(String dbName) {
    this.dbName = dbName;
    return this;
  }

  /**
   * Get dbName
   * @return dbName
  */
  
  @Schema(name = "dbName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dbName")
  public String getDbName() {
    return dbName;
  }

  public void setDbName(String dbName) {
    this.dbName = dbName;
  }

  public DatabaseConfig dbSchema(String dbSchema) {
    this.dbSchema = dbSchema;
    return this;
  }

  /**
   * Get dbSchema
   * @return dbSchema
  */
  
  @Schema(name = "dbSchema", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dbSchema")
  public String getDbSchema() {
    return dbSchema;
  }

  public void setDbSchema(String dbSchema) {
    this.dbSchema = dbSchema;
  }

  public DatabaseConfig dbUserName(String dbUserName) {
    this.dbUserName = dbUserName;
    return this;
  }

  /**
   * Get dbUserName
   * @return dbUserName
  */
  
  @Schema(name = "dbUserName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dbUserName")
  public String getDbUserName() {
    return dbUserName;
  }

  public void setDbUserName(String dbUserName) {
    this.dbUserName = dbUserName;
  }

  public DatabaseConfig dbPassword(String dbPassword) {
    this.dbPassword = dbPassword;
    return this;
  }

  /**
   * Get dbPassword
   * @return dbPassword
  */
  
  @Schema(name = "dbPassword", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dbPassword")
  public String getDbPassword() {
    return dbPassword;
  }

  public void setDbPassword(String dbPassword) {
    this.dbPassword = dbPassword;
  }

  public DatabaseConfig connectionUrl(String connectionUrl) {
    this.connectionUrl = connectionUrl;
    return this;
  }

  /**
   * Get connectionUrl
   * @return connectionUrl
  */
  
  @Schema(name = "connectionUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectionUrl")
  public String getConnectionUrl() {
    return connectionUrl;
  }

  public void setConnectionUrl(String connectionUrl) {
    this.connectionUrl = connectionUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabaseConfig databaseConfig = (DatabaseConfig) o;
    return Objects.equals(this.dbVendor, databaseConfig.dbVendor) &&
        Objects.equals(this.dbName, databaseConfig.dbName) &&
        Objects.equals(this.dbSchema, databaseConfig.dbSchema) &&
        Objects.equals(this.dbUserName, databaseConfig.dbUserName) &&
        Objects.equals(this.dbPassword, databaseConfig.dbPassword) &&
        Objects.equals(this.connectionUrl, databaseConfig.connectionUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbVendor, dbName, dbSchema, dbUserName, dbPassword, connectionUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseConfig {\n");
    sb.append("    dbVendor: ").append(toIndentedString(dbVendor)).append("\n");
    sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
    sb.append("    dbSchema: ").append(toIndentedString(dbSchema)).append("\n");
    sb.append("    dbUserName: ").append(toIndentedString(dbUserName)).append("\n");
    sb.append("    dbPassword: ").append(toIndentedString(dbPassword)).append("\n");
    sb.append("    connectionUrl: ").append(toIndentedString(connectionUrl)).append("\n");
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

