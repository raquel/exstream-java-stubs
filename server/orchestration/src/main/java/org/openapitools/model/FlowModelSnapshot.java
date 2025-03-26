package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * FlowModelSnapshot
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:03:17.210646522Z[Europe/Lisbon]")
public class FlowModelSnapshot {

  private UUID snapshotId;

  private UUID dasId;

  private Integer dasVersion;

  private String domain;

  private String name;

  private String description;

  private String publishedBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime publishDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime unpublishDate;

  @Valid
  private List<byte[]> content;

  public FlowModelSnapshot snapshotId(UUID snapshotId) {
    this.snapshotId = snapshotId;
    return this;
  }

  /**
   * Get snapshotId
   * @return snapshotId
  */
  @Valid 
  @Schema(name = "snapshotId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("snapshotId")
  public UUID getSnapshotId() {
    return snapshotId;
  }

  public void setSnapshotId(UUID snapshotId) {
    this.snapshotId = snapshotId;
  }

  public FlowModelSnapshot dasId(UUID dasId) {
    this.dasId = dasId;
    return this;
  }

  /**
   * Get dasId
   * @return dasId
  */
  @Valid 
  @Schema(name = "dasId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dasId")
  public UUID getDasId() {
    return dasId;
  }

  public void setDasId(UUID dasId) {
    this.dasId = dasId;
  }

  public FlowModelSnapshot dasVersion(Integer dasVersion) {
    this.dasVersion = dasVersion;
    return this;
  }

  /**
   * Get dasVersion
   * @return dasVersion
  */
  
  @Schema(name = "dasVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dasVersion")
  public Integer getDasVersion() {
    return dasVersion;
  }

  public void setDasVersion(Integer dasVersion) {
    this.dasVersion = dasVersion;
  }

  public FlowModelSnapshot domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Get domain
   * @return domain
  */
  
  @Schema(name = "domain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public FlowModelSnapshot name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @Size(min = 1, max = 128) 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FlowModelSnapshot description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FlowModelSnapshot publishedBy(String publishedBy) {
    this.publishedBy = publishedBy;
    return this;
  }

  /**
   * Get publishedBy
   * @return publishedBy
  */
  
  @Schema(name = "publishedBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publishedBy")
  public String getPublishedBy() {
    return publishedBy;
  }

  public void setPublishedBy(String publishedBy) {
    this.publishedBy = publishedBy;
  }

  public FlowModelSnapshot publishDate(OffsetDateTime publishDate) {
    this.publishDate = publishDate;
    return this;
  }

  /**
   * Get publishDate
   * @return publishDate
  */
  @Valid 
  @Schema(name = "publishDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publishDate")
  public OffsetDateTime getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(OffsetDateTime publishDate) {
    this.publishDate = publishDate;
  }

  public FlowModelSnapshot unpublishDate(OffsetDateTime unpublishDate) {
    this.unpublishDate = unpublishDate;
    return this;
  }

  /**
   * Get unpublishDate
   * @return unpublishDate
  */
  @Valid 
  @Schema(name = "unpublishDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unpublishDate")
  public OffsetDateTime getUnpublishDate() {
    return unpublishDate;
  }

  public void setUnpublishDate(OffsetDateTime unpublishDate) {
    this.unpublishDate = unpublishDate;
  }

  public FlowModelSnapshot content(List<byte[]> content) {
    this.content = content;
    return this;
  }

  public FlowModelSnapshot addContentItem(byte[] contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * Get content
   * @return content
  */
  
  @Schema(name = "content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
  public List<byte[]> getContent() {
    return content;
  }

  public void setContent(List<byte[]> content) {
    this.content = content;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowModelSnapshot flowModelSnapshot = (FlowModelSnapshot) o;
    return Objects.equals(this.snapshotId, flowModelSnapshot.snapshotId) &&
        Objects.equals(this.dasId, flowModelSnapshot.dasId) &&
        Objects.equals(this.dasVersion, flowModelSnapshot.dasVersion) &&
        Objects.equals(this.domain, flowModelSnapshot.domain) &&
        Objects.equals(this.name, flowModelSnapshot.name) &&
        Objects.equals(this.description, flowModelSnapshot.description) &&
        Objects.equals(this.publishedBy, flowModelSnapshot.publishedBy) &&
        Objects.equals(this.publishDate, flowModelSnapshot.publishDate) &&
        Objects.equals(this.unpublishDate, flowModelSnapshot.unpublishDate) &&
        Objects.equals(this.content, flowModelSnapshot.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotId, dasId, dasVersion, domain, name, description, publishedBy, publishDate, unpublishDate, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowModelSnapshot {\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    dasId: ").append(toIndentedString(dasId)).append("\n");
    sb.append("    dasVersion: ").append(toIndentedString(dasVersion)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    publishedBy: ").append(toIndentedString(publishedBy)).append("\n");
    sb.append("    publishDate: ").append(toIndentedString(publishDate)).append("\n");
    sb.append("    unpublishDate: ").append(toIndentedString(unpublishDate)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

