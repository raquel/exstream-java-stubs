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
 * SseEmitter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:40:32.411824350Z[Europe/Lisbon]")
public class SseEmitter {

  private Long timeout;

  public SseEmitter timeout(Long timeout) {
    this.timeout = timeout;
    return this;
  }

  /**
   * Get timeout
   * @return timeout
  */
  
  @Schema(name = "timeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeout")
  public Long getTimeout() {
    return timeout;
  }

  public void setTimeout(Long timeout) {
    this.timeout = timeout;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SseEmitter sseEmitter = (SseEmitter) o;
    return Objects.equals(this.timeout, sseEmitter.timeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SseEmitter {\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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

