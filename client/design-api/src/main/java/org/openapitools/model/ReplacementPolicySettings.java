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
 * ReplacementPolicySettings
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T17:54:43.132703260Z[Europe/Lisbon]")
public class ReplacementPolicySettings {

  /**
   * Gets or Sets generalPolicy
   */
  public enum GeneralPolicyEnum {
    AUTO_RENAME("AUTO_RENAME"),
    
    ERROR("ERROR"),
    
    REPLACE("REPLACE"),
    
    SKIP("SKIP"),
    
    REPLACE_IF_NEWER("REPLACE_IF_NEWER"),
    
    EXISTING("EXISTING");

    private String value;

    GeneralPolicyEnum(String value) {
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
    public static GeneralPolicyEnum fromValue(String value) {
      for (GeneralPolicyEnum b : GeneralPolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private GeneralPolicyEnum generalPolicy;

  public ReplacementPolicySettings() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ReplacementPolicySettings(GeneralPolicyEnum generalPolicy) {
    this.generalPolicy = generalPolicy;
  }

  public ReplacementPolicySettings generalPolicy(GeneralPolicyEnum generalPolicy) {
    this.generalPolicy = generalPolicy;
    return this;
  }

  /**
   * Get generalPolicy
   * @return generalPolicy
  */
  @NotNull 
  @Schema(name = "generalPolicy", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("generalPolicy")
  public GeneralPolicyEnum getGeneralPolicy() {
    return generalPolicy;
  }

  public void setGeneralPolicy(GeneralPolicyEnum generalPolicy) {
    this.generalPolicy = generalPolicy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplacementPolicySettings replacementPolicySettings = (ReplacementPolicySettings) o;
    return Objects.equals(this.generalPolicy, replacementPolicySettings.generalPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generalPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplacementPolicySettings {\n");
    sb.append("    generalPolicy: ").append(toIndentedString(generalPolicy)).append("\n");
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

