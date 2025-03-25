package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MigrationSetPatchRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:40:32.411824350Z[Europe/Lisbon]")
public class MigrationSetPatchRequest {

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    GRAY("GRAY"),
    
    GRAYP("GRAYP"),
    
    GRAYF("GRAYF"),
    
    YELLOW("YELLOW"),
    
    YELLOWP("YELLOWP"),
    
    YELLOWU("YELLOWU"),
    
    YELLOWF("YELLOWF"),
    
    GREEN("GREEN"),
    
    GREENP("GREENP"),
    
    GREENU("GREENU"),
    
    GREENF("GREENF");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  private Boolean isHidden;

  private Boolean locked;

  public MigrationSetPatchRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public MigrationSetPatchRequest isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

  /**
   * Get isHidden
   * @return isHidden
  */
  
  @Schema(name = "isHidden", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isHidden")
  public Boolean getIsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public MigrationSetPatchRequest locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

  /**
   * Get locked
   * @return locked
  */
  
  @Schema(name = "locked", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locked")
  public Boolean getLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationSetPatchRequest migrationSetPatchRequest = (MigrationSetPatchRequest) o;
    return Objects.equals(this.status, migrationSetPatchRequest.status) &&
        Objects.equals(this.isHidden, migrationSetPatchRequest.isHidden) &&
        Objects.equals(this.locked, migrationSetPatchRequest.locked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, isHidden, locked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationSetPatchRequest {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
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

