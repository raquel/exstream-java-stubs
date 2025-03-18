package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ResourceIdStateOverride;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PostGetThemeWithOptionsPayload
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T17:54:43.132703260Z[Europe/Lisbon]")
public class PostGetThemeWithOptionsPayload {

  @Valid
  private List<@Valid ResourceIdStateOverride> idStateOverrides;

  private Boolean latestApprovedVersions;

  public PostGetThemeWithOptionsPayload idStateOverrides(List<@Valid ResourceIdStateOverride> idStateOverrides) {
    this.idStateOverrides = idStateOverrides;
    return this;
  }

  public PostGetThemeWithOptionsPayload addIdStateOverridesItem(ResourceIdStateOverride idStateOverridesItem) {
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

  public PostGetThemeWithOptionsPayload latestApprovedVersions(Boolean latestApprovedVersions) {
    this.latestApprovedVersions = latestApprovedVersions;
    return this;
  }

  /**
   * Get latestApprovedVersions
   * @return latestApprovedVersions
  */
  
  @Schema(name = "latestApprovedVersions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latestApprovedVersions")
  public Boolean getLatestApprovedVersions() {
    return latestApprovedVersions;
  }

  public void setLatestApprovedVersions(Boolean latestApprovedVersions) {
    this.latestApprovedVersions = latestApprovedVersions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostGetThemeWithOptionsPayload postGetThemeWithOptionsPayload = (PostGetThemeWithOptionsPayload) o;
    return Objects.equals(this.idStateOverrides, postGetThemeWithOptionsPayload.idStateOverrides) &&
        Objects.equals(this.latestApprovedVersions, postGetThemeWithOptionsPayload.latestApprovedVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idStateOverrides, latestApprovedVersions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostGetThemeWithOptionsPayload {\n");
    sb.append("    idStateOverrides: ").append(toIndentedString(idStateOverrides)).append("\n");
    sb.append("    latestApprovedVersions: ").append(toIndentedString(latestApprovedVersions)).append("\n");
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

