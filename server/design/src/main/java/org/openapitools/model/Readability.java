package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Range;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Readability
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class Readability {

  private Boolean enabled;

  private String serviceProvider;

  private String scale;

  private Range targetRange;

  private Range acceptableRange;

  public Readability enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
  */
  
  @Schema(name = "enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public Readability serviceProvider(String serviceProvider) {
    this.serviceProvider = serviceProvider;
    return this;
  }

  /**
   * Get serviceProvider
   * @return serviceProvider
  */
  
  @Schema(name = "service_provider", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service_provider")
  public String getServiceProvider() {
    return serviceProvider;
  }

  public void setServiceProvider(String serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  public Readability scale(String scale) {
    this.scale = scale;
    return this;
  }

  /**
   * Get scale
   * @return scale
  */
  
  @Schema(name = "scale", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scale")
  public String getScale() {
    return scale;
  }

  public void setScale(String scale) {
    this.scale = scale;
  }

  public Readability targetRange(Range targetRange) {
    this.targetRange = targetRange;
    return this;
  }

  /**
   * Get targetRange
   * @return targetRange
  */
  @Valid 
  @Schema(name = "target_range", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("target_range")
  public Range getTargetRange() {
    return targetRange;
  }

  public void setTargetRange(Range targetRange) {
    this.targetRange = targetRange;
  }

  public Readability acceptableRange(Range acceptableRange) {
    this.acceptableRange = acceptableRange;
    return this;
  }

  /**
   * Get acceptableRange
   * @return acceptableRange
  */
  @Valid 
  @Schema(name = "acceptable_range", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acceptable_range")
  public Range getAcceptableRange() {
    return acceptableRange;
  }

  public void setAcceptableRange(Range acceptableRange) {
    this.acceptableRange = acceptableRange;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Readability readability = (Readability) o;
    return Objects.equals(this.enabled, readability.enabled) &&
        Objects.equals(this.serviceProvider, readability.serviceProvider) &&
        Objects.equals(this.scale, readability.scale) &&
        Objects.equals(this.targetRange, readability.targetRange) &&
        Objects.equals(this.acceptableRange, readability.acceptableRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, serviceProvider, scale, targetRange, acceptableRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Readability {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    serviceProvider: ").append(toIndentedString(serviceProvider)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    targetRange: ").append(toIndentedString(targetRange)).append("\n");
    sb.append("    acceptableRange: ").append(toIndentedString(acceptableRange)).append("\n");
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

