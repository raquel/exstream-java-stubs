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
 * ConfigProxy
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:04:14.260450399Z[Europe/Lisbon]")
public class ConfigProxy {

  private String host;

  private String port;

  private String userName;

  private String password;

  public ConfigProxy host(String host) {
    this.host = host;
    return this;
  }

  /**
   * Get host
   * @return host
  */
  
  @Schema(name = "host", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("host")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public ConfigProxy port(String port) {
    this.port = port;
    return this;
  }

  /**
   * Get port
   * @return port
  */
  
  @Schema(name = "port", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("port")
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }

  public ConfigProxy userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  */
  
  @Schema(name = "userName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public ConfigProxy password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  
  @Schema(name = "password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigProxy configProxy = (ConfigProxy) o;
    return Objects.equals(this.host, configProxy.host) &&
        Objects.equals(this.port, configProxy.port) &&
        Objects.equals(this.userName, configProxy.userName) &&
        Objects.equals(this.password, configProxy.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, port, userName, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigProxy {\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

