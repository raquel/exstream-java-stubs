package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Details;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * VersionConfig
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class VersionConfig {

  private String apiIdentifier;

  private String clientVersion;

  private Details details;

  private String major;

  private String minor;

  private String patch;

  private String versionString;

  public VersionConfig apiIdentifier(String apiIdentifier) {
    this.apiIdentifier = apiIdentifier;
    return this;
  }

  /**
   * Get apiIdentifier
   * @return apiIdentifier
  */
  
  @Schema(name = "apiIdentifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("apiIdentifier")
  public String getApiIdentifier() {
    return apiIdentifier;
  }

  public void setApiIdentifier(String apiIdentifier) {
    this.apiIdentifier = apiIdentifier;
  }

  public VersionConfig clientVersion(String clientVersion) {
    this.clientVersion = clientVersion;
    return this;
  }

  /**
   * Get clientVersion
   * @return clientVersion
  */
  
  @Schema(name = "clientVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientVersion")
  public String getClientVersion() {
    return clientVersion;
  }

  public void setClientVersion(String clientVersion) {
    this.clientVersion = clientVersion;
  }

  public VersionConfig details(Details details) {
    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
  */
  @Valid 
  @Schema(name = "details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("details")
  public Details getDetails() {
    return details;
  }

  public void setDetails(Details details) {
    this.details = details;
  }

  public VersionConfig major(String major) {
    this.major = major;
    return this;
  }

  /**
   * Get major
   * @return major
  */
  
  @Schema(name = "major", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("major")
  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public VersionConfig minor(String minor) {
    this.minor = minor;
    return this;
  }

  /**
   * Get minor
   * @return minor
  */
  
  @Schema(name = "minor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minor")
  public String getMinor() {
    return minor;
  }

  public void setMinor(String minor) {
    this.minor = minor;
  }

  public VersionConfig patch(String patch) {
    this.patch = patch;
    return this;
  }

  /**
   * Get patch
   * @return patch
  */
  
  @Schema(name = "patch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("patch")
  public String getPatch() {
    return patch;
  }

  public void setPatch(String patch) {
    this.patch = patch;
  }

  public VersionConfig versionString(String versionString) {
    this.versionString = versionString;
    return this;
  }

  /**
   * Get versionString
   * @return versionString
  */
  
  @Schema(name = "versionString", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionString")
  public String getVersionString() {
    return versionString;
  }

  public void setVersionString(String versionString) {
    this.versionString = versionString;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionConfig versionConfig = (VersionConfig) o;
    return Objects.equals(this.apiIdentifier, versionConfig.apiIdentifier) &&
        Objects.equals(this.clientVersion, versionConfig.clientVersion) &&
        Objects.equals(this.details, versionConfig.details) &&
        Objects.equals(this.major, versionConfig.major) &&
        Objects.equals(this.minor, versionConfig.minor) &&
        Objects.equals(this.patch, versionConfig.patch) &&
        Objects.equals(this.versionString, versionConfig.versionString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiIdentifier, clientVersion, details, major, minor, patch, versionString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionConfig {\n");
    sb.append("    apiIdentifier: ").append(toIndentedString(apiIdentifier)).append("\n");
    sb.append("    clientVersion: ").append(toIndentedString(clientVersion)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
    sb.append("    versionString: ").append(toIndentedString(versionString)).append("\n");
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

