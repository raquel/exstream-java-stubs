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
 * WebappPermissionResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class WebappPermissionResponse {

  private String webappPermissions;

  public WebappPermissionResponse webappPermissions(String webappPermissions) {
    this.webappPermissions = webappPermissions;
    return this;
  }

  /**
   * Get webappPermissions
   * @return webappPermissions
  */
  
  @Schema(name = "webappPermissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("webappPermissions")
  public String getWebappPermissions() {
    return webappPermissions;
  }

  public void setWebappPermissions(String webappPermissions) {
    this.webappPermissions = webappPermissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebappPermissionResponse webappPermissionResponse = (WebappPermissionResponse) o;
    return Objects.equals(this.webappPermissions, webappPermissionResponse.webappPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webappPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebappPermissionResponse {\n");
    sb.append("    webappPermissions: ").append(toIndentedString(webappPermissions)).append("\n");
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

