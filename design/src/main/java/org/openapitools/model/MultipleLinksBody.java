package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MultipleLinksBody
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class MultipleLinksBody {

  private UUID linkSubjectId;

  private Integer subjectVersion;

  @Valid
  private List<UUID> linkObjectIds;

  public MultipleLinksBody linkSubjectId(UUID linkSubjectId) {
    this.linkSubjectId = linkSubjectId;
    return this;
  }

  /**
   * Get linkSubjectId
   * @return linkSubjectId
  */
  @Valid 
  @Schema(name = "linkSubjectId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkSubjectId")
  public UUID getLinkSubjectId() {
    return linkSubjectId;
  }

  public void setLinkSubjectId(UUID linkSubjectId) {
    this.linkSubjectId = linkSubjectId;
  }

  public MultipleLinksBody subjectVersion(Integer subjectVersion) {
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

  public MultipleLinksBody linkObjectIds(List<UUID> linkObjectIds) {
    this.linkObjectIds = linkObjectIds;
    return this;
  }

  public MultipleLinksBody addLinkObjectIdsItem(UUID linkObjectIdsItem) {
    if (this.linkObjectIds == null) {
      this.linkObjectIds = new ArrayList<>();
    }
    this.linkObjectIds.add(linkObjectIdsItem);
    return this;
  }

  /**
   * Get linkObjectIds
   * @return linkObjectIds
  */
  @Valid 
  @Schema(name = "linkObjectIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkObjectIds")
  public List<UUID> getLinkObjectIds() {
    return linkObjectIds;
  }

  public void setLinkObjectIds(List<UUID> linkObjectIds) {
    this.linkObjectIds = linkObjectIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipleLinksBody multipleLinksBody = (MultipleLinksBody) o;
    return Objects.equals(this.linkSubjectId, multipleLinksBody.linkSubjectId) &&
        Objects.equals(this.subjectVersion, multipleLinksBody.subjectVersion) &&
        Objects.equals(this.linkObjectIds, multipleLinksBody.linkObjectIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkSubjectId, subjectVersion, linkObjectIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipleLinksBody {\n");
    sb.append("    linkSubjectId: ").append(toIndentedString(linkSubjectId)).append("\n");
    sb.append("    subjectVersion: ").append(toIndentedString(subjectVersion)).append("\n");
    sb.append("    linkObjectIds: ").append(toIndentedString(linkObjectIds)).append("\n");
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

