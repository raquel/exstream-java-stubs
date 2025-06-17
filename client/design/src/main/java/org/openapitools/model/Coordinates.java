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
 * Coordinates
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class Coordinates {

  private Double maxX;

  private Double maxY;

  private Double minX;

  private Double minY;

  public Coordinates maxX(Double maxX) {
    this.maxX = maxX;
    return this;
  }

  /**
   * Get maxX
   * @return maxX
  */
  
  @Schema(name = "maxX", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxX")
  public Double getMaxX() {
    return maxX;
  }

  public void setMaxX(Double maxX) {
    this.maxX = maxX;
  }

  public Coordinates maxY(Double maxY) {
    this.maxY = maxY;
    return this;
  }

  /**
   * Get maxY
   * @return maxY
  */
  
  @Schema(name = "maxY", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxY")
  public Double getMaxY() {
    return maxY;
  }

  public void setMaxY(Double maxY) {
    this.maxY = maxY;
  }

  public Coordinates minX(Double minX) {
    this.minX = minX;
    return this;
  }

  /**
   * Get minX
   * @return minX
  */
  
  @Schema(name = "minX", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minX")
  public Double getMinX() {
    return minX;
  }

  public void setMinX(Double minX) {
    this.minX = minX;
  }

  public Coordinates minY(Double minY) {
    this.minY = minY;
    return this;
  }

  /**
   * Get minY
   * @return minY
  */
  
  @Schema(name = "minY", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minY")
  public Double getMinY() {
    return minY;
  }

  public void setMinY(Double minY) {
    this.minY = minY;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Coordinates coordinates = (Coordinates) o;
    return Objects.equals(this.maxX, coordinates.maxX) &&
        Objects.equals(this.maxY, coordinates.maxY) &&
        Objects.equals(this.minX, coordinates.minX) &&
        Objects.equals(this.minY, coordinates.minY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxX, maxY, minX, minY);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Coordinates {\n");
    sb.append("    maxX: ").append(toIndentedString(maxX)).append("\n");
    sb.append("    maxY: ").append(toIndentedString(maxY)).append("\n");
    sb.append("    minX: ").append(toIndentedString(minX)).append("\n");
    sb.append("    minY: ").append(toIndentedString(minY)).append("\n");
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

