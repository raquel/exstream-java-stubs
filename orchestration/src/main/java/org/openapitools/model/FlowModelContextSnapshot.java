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
 * FlowModelContextSnapshot
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:33:52.003808146Z[Europe/Lisbon]")
public class FlowModelContextSnapshot {

  private UUID snapshotId;

  private UUID id;

  private String domainId;

  private String name;

  private String xmlContent;

  private Integer version;

  private String content;

  public FlowModelContextSnapshot snapshotId(UUID snapshotId) {
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

  public FlowModelContextSnapshot id(UUID id) {
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

  public FlowModelContextSnapshot domainId(String domainId) {
    this.domainId = domainId;
    return this;
  }

  /**
   * Get domainId
   * @return domainId
  */
  
  @Schema(name = "domainId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("domainId")
  public String getDomainId() {
    return domainId;
  }

  public void setDomainId(String domainId) {
    this.domainId = domainId;
  }

  public FlowModelContextSnapshot name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FlowModelContextSnapshot xmlContent(String xmlContent) {
    this.xmlContent = xmlContent;
    return this;
  }

  /**
   * Get xmlContent
   * @return xmlContent
  */
  
  @Schema(name = "xmlContent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("xmlContent")
  public String getXmlContent() {
    return xmlContent;
  }

  public void setXmlContent(String xmlContent) {
    this.xmlContent = xmlContent;
  }

  public FlowModelContextSnapshot version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public FlowModelContextSnapshot content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  */
  
  @Schema(name = "content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
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
    FlowModelContextSnapshot flowModelContextSnapshot = (FlowModelContextSnapshot) o;
    return Objects.equals(this.snapshotId, flowModelContextSnapshot.snapshotId) &&
        Objects.equals(this.id, flowModelContextSnapshot.id) &&
        Objects.equals(this.domainId, flowModelContextSnapshot.domainId) &&
        Objects.equals(this.name, flowModelContextSnapshot.name) &&
        Objects.equals(this.xmlContent, flowModelContextSnapshot.xmlContent) &&
        Objects.equals(this.version, flowModelContextSnapshot.version) &&
        Objects.equals(this.content, flowModelContextSnapshot.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotId, id, domainId, name, xmlContent, version, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowModelContextSnapshot {\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    xmlContent: ").append(toIndentedString(xmlContent)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

