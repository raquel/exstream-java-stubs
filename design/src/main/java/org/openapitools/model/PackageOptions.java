package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ResourceIdStateOverride;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PackageOptions
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class PackageOptions {

  @Valid
  private List<@Valid ResourceIdStateOverride> idStateOverrides;

  private Boolean ensureLinks;

  private Boolean disableEffectivity;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime latestApprovedLastModifiedDateEnd;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime effectiveDate;

  public PackageOptions idStateOverrides(List<@Valid ResourceIdStateOverride> idStateOverrides) {
    this.idStateOverrides = idStateOverrides;
    return this;
  }

  public PackageOptions addIdStateOverridesItem(ResourceIdStateOverride idStateOverridesItem) {
    if (this.idStateOverrides == null) {
      this.idStateOverrides = new ArrayList<>();
    }
    this.idStateOverrides.add(idStateOverridesItem);
    return this;
  }

  /**
   * Get idStateOverrides
   * @return idStateOverrides
  */
  @Valid 
  @Schema(name = "idStateOverrides", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idStateOverrides")
  public List<@Valid ResourceIdStateOverride> getIdStateOverrides() {
    return idStateOverrides;
  }

  public void setIdStateOverrides(List<@Valid ResourceIdStateOverride> idStateOverrides) {
    this.idStateOverrides = idStateOverrides;
  }

  public PackageOptions ensureLinks(Boolean ensureLinks) {
    this.ensureLinks = ensureLinks;
    return this;
  }

  /**
   * Get ensureLinks
   * @return ensureLinks
  */
  
  @Schema(name = "ensureLinks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ensureLinks")
  public Boolean getEnsureLinks() {
    return ensureLinks;
  }

  public void setEnsureLinks(Boolean ensureLinks) {
    this.ensureLinks = ensureLinks;
  }

  public PackageOptions disableEffectivity(Boolean disableEffectivity) {
    this.disableEffectivity = disableEffectivity;
    return this;
  }

  /**
   * Get disableEffectivity
   * @return disableEffectivity
  */
  
  @Schema(name = "disableEffectivity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disableEffectivity")
  public Boolean getDisableEffectivity() {
    return disableEffectivity;
  }

  public void setDisableEffectivity(Boolean disableEffectivity) {
    this.disableEffectivity = disableEffectivity;
  }

  public PackageOptions latestApprovedLastModifiedDateEnd(OffsetDateTime latestApprovedLastModifiedDateEnd) {
    this.latestApprovedLastModifiedDateEnd = latestApprovedLastModifiedDateEnd;
    return this;
  }

  /**
   * Get latestApprovedLastModifiedDateEnd
   * @return latestApprovedLastModifiedDateEnd
  */
  @Valid 
  @Schema(name = "latestApprovedLastModifiedDateEnd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latestApprovedLastModifiedDateEnd")
  public OffsetDateTime getLatestApprovedLastModifiedDateEnd() {
    return latestApprovedLastModifiedDateEnd;
  }

  public void setLatestApprovedLastModifiedDateEnd(OffsetDateTime latestApprovedLastModifiedDateEnd) {
    this.latestApprovedLastModifiedDateEnd = latestApprovedLastModifiedDateEnd;
  }

  public PackageOptions effectiveDate(OffsetDateTime effectiveDate) {
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
    PackageOptions packageOptions = (PackageOptions) o;
    return Objects.equals(this.idStateOverrides, packageOptions.idStateOverrides) &&
        Objects.equals(this.ensureLinks, packageOptions.ensureLinks) &&
        Objects.equals(this.disableEffectivity, packageOptions.disableEffectivity) &&
        Objects.equals(this.latestApprovedLastModifiedDateEnd, packageOptions.latestApprovedLastModifiedDateEnd) &&
        Objects.equals(this.effectiveDate, packageOptions.effectiveDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idStateOverrides, ensureLinks, disableEffectivity, latestApprovedLastModifiedDateEnd, effectiveDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageOptions {\n");
    sb.append("    idStateOverrides: ").append(toIndentedString(idStateOverrides)).append("\n");
    sb.append("    ensureLinks: ").append(toIndentedString(ensureLinks)).append("\n");
    sb.append("    disableEffectivity: ").append(toIndentedString(disableEffectivity)).append("\n");
    sb.append("    latestApprovedLastModifiedDateEnd: ").append(toIndentedString(latestApprovedLastModifiedDateEnd)).append("\n");
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

