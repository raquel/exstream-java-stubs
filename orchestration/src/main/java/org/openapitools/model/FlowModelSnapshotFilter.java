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
 * FlowModelSnapshotFilter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:03:17.210646522Z[Europe/Lisbon]")
public class FlowModelSnapshotFilter {

  private String domain;

  @Valid
  private List<UUID> ids;

  @Valid
  private List<UUID> dasIds;

  @Valid
  private List<Integer> dasVersions;

  private String searchString;

  private Boolean caseSensitive;

  private Boolean wholeWord;

  private Boolean published;

  private String publishedBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime publishDateStart;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime publishDateEnd;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime unpublishDateStart;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime unpublishDateEnd;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime effectiveDate;

  public FlowModelSnapshotFilter domain(String domain) {
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

  public FlowModelSnapshotFilter ids(List<UUID> ids) {
    this.ids = ids;
    return this;
  }

  public FlowModelSnapshotFilter addIdsItem(UUID idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

  /**
   * Get ids
   * @return ids
  */
  @Valid 
  @Schema(name = "ids", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ids")
  public List<UUID> getIds() {
    return ids;
  }

  public void setIds(List<UUID> ids) {
    this.ids = ids;
  }

  public FlowModelSnapshotFilter dasIds(List<UUID> dasIds) {
    this.dasIds = dasIds;
    return this;
  }

  public FlowModelSnapshotFilter addDasIdsItem(UUID dasIdsItem) {
    if (this.dasIds == null) {
      this.dasIds = new ArrayList<>();
    }
    this.dasIds.add(dasIdsItem);
    return this;
  }

  /**
   * Get dasIds
   * @return dasIds
  */
  @Valid 
  @Schema(name = "dasIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dasIds")
  public List<UUID> getDasIds() {
    return dasIds;
  }

  public void setDasIds(List<UUID> dasIds) {
    this.dasIds = dasIds;
  }

  public FlowModelSnapshotFilter dasVersions(List<Integer> dasVersions) {
    this.dasVersions = dasVersions;
    return this;
  }

  public FlowModelSnapshotFilter addDasVersionsItem(Integer dasVersionsItem) {
    if (this.dasVersions == null) {
      this.dasVersions = new ArrayList<>();
    }
    this.dasVersions.add(dasVersionsItem);
    return this;
  }

  /**
   * Get dasVersions
   * @return dasVersions
  */
  
  @Schema(name = "dasVersions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dasVersions")
  public List<Integer> getDasVersions() {
    return dasVersions;
  }

  public void setDasVersions(List<Integer> dasVersions) {
    this.dasVersions = dasVersions;
  }

  public FlowModelSnapshotFilter searchString(String searchString) {
    this.searchString = searchString;
    return this;
  }

  /**
   * Get searchString
   * @return searchString
  */
  @Size(min = 0, max = 128) 
  @Schema(name = "searchString", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("searchString")
  public String getSearchString() {
    return searchString;
  }

  public void setSearchString(String searchString) {
    this.searchString = searchString;
  }

  public FlowModelSnapshotFilter caseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
    return this;
  }

  /**
   * Get caseSensitive
   * @return caseSensitive
  */
  
  @Schema(name = "caseSensitive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseSensitive")
  public Boolean getCaseSensitive() {
    return caseSensitive;
  }

  public void setCaseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
  }

  public FlowModelSnapshotFilter wholeWord(Boolean wholeWord) {
    this.wholeWord = wholeWord;
    return this;
  }

  /**
   * Get wholeWord
   * @return wholeWord
  */
  
  @Schema(name = "wholeWord", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wholeWord")
  public Boolean getWholeWord() {
    return wholeWord;
  }

  public void setWholeWord(Boolean wholeWord) {
    this.wholeWord = wholeWord;
  }

  public FlowModelSnapshotFilter published(Boolean published) {
    this.published = published;
    return this;
  }

  /**
   * Get published
   * @return published
  */
  
  @Schema(name = "published", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("published")
  public Boolean getPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }

  public FlowModelSnapshotFilter publishedBy(String publishedBy) {
    this.publishedBy = publishedBy;
    return this;
  }

  /**
   * Get publishedBy
   * @return publishedBy
  */
  @Size(min = 0, max = 255) 
  @Schema(name = "publishedBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publishedBy")
  public String getPublishedBy() {
    return publishedBy;
  }

  public void setPublishedBy(String publishedBy) {
    this.publishedBy = publishedBy;
  }

  public FlowModelSnapshotFilter publishDateStart(OffsetDateTime publishDateStart) {
    this.publishDateStart = publishDateStart;
    return this;
  }

  /**
   * Get publishDateStart
   * @return publishDateStart
  */
  @Valid 
  @Schema(name = "publishDateStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publishDateStart")
  public OffsetDateTime getPublishDateStart() {
    return publishDateStart;
  }

  public void setPublishDateStart(OffsetDateTime publishDateStart) {
    this.publishDateStart = publishDateStart;
  }

  public FlowModelSnapshotFilter publishDateEnd(OffsetDateTime publishDateEnd) {
    this.publishDateEnd = publishDateEnd;
    return this;
  }

  /**
   * Get publishDateEnd
   * @return publishDateEnd
  */
  @Valid 
  @Schema(name = "publishDateEnd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publishDateEnd")
  public OffsetDateTime getPublishDateEnd() {
    return publishDateEnd;
  }

  public void setPublishDateEnd(OffsetDateTime publishDateEnd) {
    this.publishDateEnd = publishDateEnd;
  }

  public FlowModelSnapshotFilter unpublishDateStart(OffsetDateTime unpublishDateStart) {
    this.unpublishDateStart = unpublishDateStart;
    return this;
  }

  /**
   * Get unpublishDateStart
   * @return unpublishDateStart
  */
  @Valid 
  @Schema(name = "unpublishDateStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unpublishDateStart")
  public OffsetDateTime getUnpublishDateStart() {
    return unpublishDateStart;
  }

  public void setUnpublishDateStart(OffsetDateTime unpublishDateStart) {
    this.unpublishDateStart = unpublishDateStart;
  }

  public FlowModelSnapshotFilter unpublishDateEnd(OffsetDateTime unpublishDateEnd) {
    this.unpublishDateEnd = unpublishDateEnd;
    return this;
  }

  /**
   * Get unpublishDateEnd
   * @return unpublishDateEnd
  */
  @Valid 
  @Schema(name = "unpublishDateEnd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unpublishDateEnd")
  public OffsetDateTime getUnpublishDateEnd() {
    return unpublishDateEnd;
  }

  public void setUnpublishDateEnd(OffsetDateTime unpublishDateEnd) {
    this.unpublishDateEnd = unpublishDateEnd;
  }

  public FlowModelSnapshotFilter effectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * Get effectiveDate
   * @return effectiveDate
  */
  @Valid 
  @Schema(name = "effectiveDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("effectiveDate")
  public OffsetDateTime getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowModelSnapshotFilter flowModelSnapshotFilter = (FlowModelSnapshotFilter) o;
    return Objects.equals(this.domain, flowModelSnapshotFilter.domain) &&
        Objects.equals(this.ids, flowModelSnapshotFilter.ids) &&
        Objects.equals(this.dasIds, flowModelSnapshotFilter.dasIds) &&
        Objects.equals(this.dasVersions, flowModelSnapshotFilter.dasVersions) &&
        Objects.equals(this.searchString, flowModelSnapshotFilter.searchString) &&
        Objects.equals(this.caseSensitive, flowModelSnapshotFilter.caseSensitive) &&
        Objects.equals(this.wholeWord, flowModelSnapshotFilter.wholeWord) &&
        Objects.equals(this.published, flowModelSnapshotFilter.published) &&
        Objects.equals(this.publishedBy, flowModelSnapshotFilter.publishedBy) &&
        Objects.equals(this.publishDateStart, flowModelSnapshotFilter.publishDateStart) &&
        Objects.equals(this.publishDateEnd, flowModelSnapshotFilter.publishDateEnd) &&
        Objects.equals(this.unpublishDateStart, flowModelSnapshotFilter.unpublishDateStart) &&
        Objects.equals(this.unpublishDateEnd, flowModelSnapshotFilter.unpublishDateEnd) &&
        Objects.equals(this.effectiveDate, flowModelSnapshotFilter.effectiveDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, ids, dasIds, dasVersions, searchString, caseSensitive, wholeWord, published, publishedBy, publishDateStart, publishDateEnd, unpublishDateStart, unpublishDateEnd, effectiveDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowModelSnapshotFilter {\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    dasIds: ").append(toIndentedString(dasIds)).append("\n");
    sb.append("    dasVersions: ").append(toIndentedString(dasVersions)).append("\n");
    sb.append("    searchString: ").append(toIndentedString(searchString)).append("\n");
    sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
    sb.append("    wholeWord: ").append(toIndentedString(wholeWord)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    publishedBy: ").append(toIndentedString(publishedBy)).append("\n");
    sb.append("    publishDateStart: ").append(toIndentedString(publishDateStart)).append("\n");
    sb.append("    publishDateEnd: ").append(toIndentedString(publishDateEnd)).append("\n");
    sb.append("    unpublishDateStart: ").append(toIndentedString(unpublishDateStart)).append("\n");
    sb.append("    unpublishDateEnd: ").append(toIndentedString(unpublishDateEnd)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
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

