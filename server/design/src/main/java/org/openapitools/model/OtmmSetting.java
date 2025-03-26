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
 * OtmmSetting
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class OtmmSetting {

  private String password;

  private String username;

  private String url;

  private String amd;

  private String amdProfile;

  public OtmmSetting password(String password) {
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

  public OtmmSetting username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  */
  
  @Schema(name = "username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public OtmmSetting url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  
  @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public OtmmSetting amd(String amd) {
    this.amd = amd;
    return this;
  }

  /**
   * Get amd
   * @return amd
  */
  
  @Schema(name = "amd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amd")
  public String getAmd() {
    return amd;
  }

  public void setAmd(String amd) {
    this.amd = amd;
  }

  public OtmmSetting amdProfile(String amdProfile) {
    this.amdProfile = amdProfile;
    return this;
  }

  /**
   * Get amdProfile
   * @return amdProfile
  */
  
  @Schema(name = "amdProfile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amdProfile")
  public String getAmdProfile() {
    return amdProfile;
  }

  public void setAmdProfile(String amdProfile) {
    this.amdProfile = amdProfile;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtmmSetting otmmSetting = (OtmmSetting) o;
    return Objects.equals(this.password, otmmSetting.password) &&
        Objects.equals(this.username, otmmSetting.username) &&
        Objects.equals(this.url, otmmSetting.url) &&
        Objects.equals(this.amd, otmmSetting.amd) &&
        Objects.equals(this.amdProfile, otmmSetting.amdProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, username, url, amd, amdProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtmmSetting {\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    amd: ").append(toIndentedString(amd)).append("\n");
    sb.append("    amdProfile: ").append(toIndentedString(amdProfile)).append("\n");
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

