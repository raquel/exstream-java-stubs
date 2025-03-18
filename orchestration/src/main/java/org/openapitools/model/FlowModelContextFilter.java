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
 * FlowModelContextFilter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:03:17.210646522Z[Europe/Lisbon]")
public class FlowModelContextFilter {

  @Valid
  private List<UUID> snapshotIds;

  @Valid
  private List<UUID> dasIds;

  @Valid
  private List<Integer> dasVersions;

  private String domain;

  private String searchString;

  private Boolean caseSensitive;

  private Boolean wholeWord;

  public FlowModelContextFilter snapshotIds(List<UUID> snapshotIds) {
    this.snapshotIds = snapshotIds;
    return this;
  }

  public FlowModelContextFilter addSnapshotIdsItem(UUID snapshotIdsItem) {
    if (this.snapshotIds == null) {
      this.snapshotIds = new ArrayList<>();
    }
    this.snapshotIds.add(snapshotIdsItem);
    return this;
  }

  /**
   * Get snapshotIds
   * @return snapshotIds
  */
  @Valid 
  @Schema(name = "snapshotIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("snapshotIds")
  public List<UUID> getSnapshotIds() {
    return snapshotIds;
  }

  public void setSnapshotIds(List<UUID> snapshotIds) {
    this.snapshotIds = snapshotIds;
  }

  public FlowModelContextFilter dasIds(List<UUID> dasIds) {
    this.dasIds = dasIds;
    return this;
  }

  public FlowModelContextFilter addDasIdsItem(UUID dasIdsItem) {
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

  public FlowModelContextFilter dasVersions(List<Integer> dasVersions) {
    this.dasVersions = dasVersions;
    return this;
  }

  public FlowModelContextFilter addDasVersionsItem(Integer dasVersionsItem) {
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

  public FlowModelContextFilter domain(String domain) {
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

  public FlowModelContextFilter searchString(String searchString) {
    this.searchString = searchString;
    return this;
  }

  /**
   * Get searchString
   * @return searchString
  */
  @Size(min = 0, max = 255) 
  @Schema(name = "searchString", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("searchString")
  public String getSearchString() {
    return searchString;
  }

  public void setSearchString(String searchString) {
    this.searchString = searchString;
  }

  public FlowModelContextFilter caseSensitive(Boolean caseSensitive) {
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

  public FlowModelContextFilter wholeWord(Boolean wholeWord) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowModelContextFilter flowModelContextFilter = (FlowModelContextFilter) o;
    return Objects.equals(this.snapshotIds, flowModelContextFilter.snapshotIds) &&
        Objects.equals(this.dasIds, flowModelContextFilter.dasIds) &&
        Objects.equals(this.dasVersions, flowModelContextFilter.dasVersions) &&
        Objects.equals(this.domain, flowModelContextFilter.domain) &&
        Objects.equals(this.searchString, flowModelContextFilter.searchString) &&
        Objects.equals(this.caseSensitive, flowModelContextFilter.caseSensitive) &&
        Objects.equals(this.wholeWord, flowModelContextFilter.wholeWord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotIds, dasIds, dasVersions, domain, searchString, caseSensitive, wholeWord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowModelContextFilter {\n");
    sb.append("    snapshotIds: ").append(toIndentedString(snapshotIds)).append("\n");
    sb.append("    dasIds: ").append(toIndentedString(dasIds)).append("\n");
    sb.append("    dasVersions: ").append(toIndentedString(dasVersions)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    searchString: ").append(toIndentedString(searchString)).append("\n");
    sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
    sb.append("    wholeWord: ").append(toIndentedString(wholeWord)).append("\n");
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

