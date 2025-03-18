package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Source;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Input
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class Input {

  private String prodDSN;

  private String type;

  private String fileFormat;

  private Source source;

  public Input prodDSN(String prodDSN) {
    this.prodDSN = prodDSN;
    return this;
  }

  /**
   * Get prodDSN
   * @return prodDSN
  */
  
  @Schema(name = "prodDSN", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prodDSN")
  public String getProdDSN() {
    return prodDSN;
  }

  public void setProdDSN(String prodDSN) {
    this.prodDSN = prodDSN;
  }

  public Input type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Input fileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
    return this;
  }

  /**
   * Get fileFormat
   * @return fileFormat
  */
  
  @Schema(name = "fileFormat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fileFormat")
  public String getFileFormat() {
    return fileFormat;
  }

  public void setFileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
  }

  public Input source(Source source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  */
  @Valid 
  @Schema(name = "source", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("source")
  public Source getSource() {
    return source;
  }

  public void setSource(Source source) {
    this.source = source;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Input input = (Input) o;
    return Objects.equals(this.prodDSN, input.prodDSN) &&
        Objects.equals(this.type, input.type) &&
        Objects.equals(this.fileFormat, input.fileFormat) &&
        Objects.equals(this.source, input.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prodDSN, type, fileFormat, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Input {\n");
    sb.append("    prodDSN: ").append(toIndentedString(prodDSN)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

