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
 * LinkDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class LinkDTO {

  private UUID linkSubjectId;

  private Integer subjectVersion;

  private UUID linkObjectId;

  public LinkDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LinkDTO(UUID linkSubjectId, UUID linkObjectId) {
    this.linkSubjectId = linkSubjectId;
    this.linkObjectId = linkObjectId;
  }

  public LinkDTO linkSubjectId(UUID linkSubjectId) {
    this.linkSubjectId = linkSubjectId;
    return this;
  }

  /**
   * Get linkSubjectId
   * @return linkSubjectId
  */
  @NotNull @Valid 
  @Schema(name = "linkSubjectId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("linkSubjectId")
  public UUID getLinkSubjectId() {
    return linkSubjectId;
  }

  public void setLinkSubjectId(UUID linkSubjectId) {
    this.linkSubjectId = linkSubjectId;
  }

  public LinkDTO subjectVersion(Integer subjectVersion) {
    this.subjectVersion = subjectVersion;
    return this;
  }

  /**
   * Get subjectVersion
   * @return subjectVersion
  */
  
  @Schema(name = "subjectVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subjectVersion")
  public Integer getSubjectVersion() {
    return subjectVersion;
  }

  public void setSubjectVersion(Integer subjectVersion) {
    this.subjectVersion = subjectVersion;
  }

  public LinkDTO linkObjectId(UUID linkObjectId) {
    this.linkObjectId = linkObjectId;
    return this;
  }

  /**
   * Get linkObjectId
   * @return linkObjectId
  */
  @NotNull @Valid 
  @Schema(name = "linkObjectId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("linkObjectId")
  public UUID getLinkObjectId() {
    return linkObjectId;
  }

  public void setLinkObjectId(UUID linkObjectId) {
    this.linkObjectId = linkObjectId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkDTO linkDTO = (LinkDTO) o;
    return Objects.equals(this.linkSubjectId, linkDTO.linkSubjectId) &&
        Objects.equals(this.subjectVersion, linkDTO.subjectVersion) &&
        Objects.equals(this.linkObjectId, linkDTO.linkObjectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkSubjectId, subjectVersion, linkObjectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkDTO {\n");
    sb.append("    linkSubjectId: ").append(toIndentedString(linkSubjectId)).append("\n");
    sb.append("    subjectVersion: ").append(toIndentedString(subjectVersion)).append("\n");
    sb.append("    linkObjectId: ").append(toIndentedString(linkObjectId)).append("\n");
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

