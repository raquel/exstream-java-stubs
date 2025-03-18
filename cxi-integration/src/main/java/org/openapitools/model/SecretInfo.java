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
 * SecretInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:04:14.260450399Z[Europe/Lisbon]")
public class SecretInfo {

  private String b64Content;

  private String decodedContent;

  public SecretInfo b64Content(String b64Content) {
    this.b64Content = b64Content;
    return this;
  }

  /**
   * Get b64Content
   * @return b64Content
  */
  
  @Schema(name = "b64Content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("b64Content")
  public String getB64Content() {
    return b64Content;
  }

  public void setB64Content(String b64Content) {
    this.b64Content = b64Content;
  }

  public SecretInfo decodedContent(String decodedContent) {
    this.decodedContent = decodedContent;
    return this;
  }

  /**
   * Get decodedContent
   * @return decodedContent
  */
  
  @Schema(name = "decodedContent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decodedContent")
  public String getDecodedContent() {
    return decodedContent;
  }

  public void setDecodedContent(String decodedContent) {
    this.decodedContent = decodedContent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecretInfo secretInfo = (SecretInfo) o;
    return Objects.equals(this.b64Content, secretInfo.b64Content) &&
        Objects.equals(this.decodedContent, secretInfo.decodedContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(b64Content, decodedContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecretInfo {\n");
    sb.append("    b64Content: ").append(toIndentedString(b64Content)).append("\n");
    sb.append("    decodedContent: ").append(toIndentedString(decodedContent)).append("\n");
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

