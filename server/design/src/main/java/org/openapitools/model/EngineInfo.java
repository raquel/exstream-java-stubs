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
 * EngineInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class EngineInfo {

  private String version;

  private String serialization;

  private String charEncoding;

  private String engineName;

  private Boolean useDefault;

  public EngineInfo version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public EngineInfo serialization(String serialization) {
    this.serialization = serialization;
    return this;
  }

  /**
   * Get serialization
   * @return serialization
  */
  
  @Schema(name = "serialization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serialization")
  public String getSerialization() {
    return serialization;
  }

  public void setSerialization(String serialization) {
    this.serialization = serialization;
  }

  public EngineInfo charEncoding(String charEncoding) {
    this.charEncoding = charEncoding;
    return this;
  }

  /**
   * Get charEncoding
   * @return charEncoding
  */
  
  @Schema(name = "charEncoding", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("charEncoding")
  public String getCharEncoding() {
    return charEncoding;
  }

  public void setCharEncoding(String charEncoding) {
    this.charEncoding = charEncoding;
  }

  public EngineInfo engineName(String engineName) {
    this.engineName = engineName;
    return this;
  }

  /**
   * Get engineName
   * @return engineName
  */
  
  @Schema(name = "engineName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("engineName")
  public String getEngineName() {
    return engineName;
  }

  public void setEngineName(String engineName) {
    this.engineName = engineName;
  }

  public EngineInfo useDefault(Boolean useDefault) {
    this.useDefault = useDefault;
    return this;
  }

  /**
   * Get useDefault
   * @return useDefault
  */
  
  @Schema(name = "useDefault", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useDefault")
  public Boolean getUseDefault() {
    return useDefault;
  }

  public void setUseDefault(Boolean useDefault) {
    this.useDefault = useDefault;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EngineInfo engineInfo = (EngineInfo) o;
    return Objects.equals(this.version, engineInfo.version) &&
        Objects.equals(this.serialization, engineInfo.serialization) &&
        Objects.equals(this.charEncoding, engineInfo.charEncoding) &&
        Objects.equals(this.engineName, engineInfo.engineName) &&
        Objects.equals(this.useDefault, engineInfo.useDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, serialization, charEncoding, engineName, useDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EngineInfo {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serialization: ").append(toIndentedString(serialization)).append("\n");
    sb.append("    charEncoding: ").append(toIndentedString(charEncoding)).append("\n");
    sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
    sb.append("    useDefault: ").append(toIndentedString(useDefault)).append("\n");
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

