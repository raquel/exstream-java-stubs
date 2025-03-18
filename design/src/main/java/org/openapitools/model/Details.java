package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.GitConfig;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Details
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class Details {

  private GitConfig git;

  private String appName;

  private String buildNumber;

  private String timestamp;

  public Details git(GitConfig git) {
    this.git = git;
    return this;
  }

  /**
   * Get git
   * @return git
  */
  @Valid 
  @Schema(name = "git", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("git")
  public GitConfig getGit() {
    return git;
  }

  public void setGit(GitConfig git) {
    this.git = git;
  }

  public Details appName(String appName) {
    this.appName = appName;
    return this;
  }

  /**
   * Get appName
   * @return appName
  */
  
  @Schema(name = "appName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appName")
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public Details buildNumber(String buildNumber) {
    this.buildNumber = buildNumber;
    return this;
  }

  /**
   * Get buildNumber
   * @return buildNumber
  */
  
  @Schema(name = "buildNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("buildNumber")
  public String getBuildNumber() {
    return buildNumber;
  }

  public void setBuildNumber(String buildNumber) {
    this.buildNumber = buildNumber;
  }

  public Details timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  */
  
  @Schema(name = "timestamp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timestamp")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Details details = (Details) o;
    return Objects.equals(this.git, details.git) &&
        Objects.equals(this.appName, details.appName) &&
        Objects.equals(this.buildNumber, details.buildNumber) &&
        Objects.equals(this.timestamp, details.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(git, appName, buildNumber, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Details {\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    buildNumber: ").append(toIndentedString(buildNumber)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

