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
 * GitConfig
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:34:47.568105362Z[Europe/Lisbon]")
public class GitConfig {

  private String tag;

  private String hash;

  private String branch;

  private String commits;

  public GitConfig tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   * @return tag
  */
  
  @Schema(name = "tag", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tag")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public GitConfig hash(String hash) {
    this.hash = hash;
    return this;
  }

  /**
   * Get hash
   * @return hash
  */
  
  @Schema(name = "hash", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hash")
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public GitConfig branch(String branch) {
    this.branch = branch;
    return this;
  }

  /**
   * Get branch
   * @return branch
  */
  
  @Schema(name = "branch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("branch")
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public GitConfig commits(String commits) {
    this.commits = commits;
    return this;
  }

  /**
   * Get commits
   * @return commits
  */
  
  @Schema(name = "commits", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("commits")
  public String getCommits() {
    return commits;
  }

  public void setCommits(String commits) {
    this.commits = commits;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitConfig gitConfig = (GitConfig) o;
    return Objects.equals(this.tag, gitConfig.tag) &&
        Objects.equals(this.hash, gitConfig.hash) &&
        Objects.equals(this.branch, gitConfig.branch) &&
        Objects.equals(this.commits, gitConfig.commits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, hash, branch, commits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitConfig {\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
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

