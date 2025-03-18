package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Settings
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:04:22.503697576Z[Europe/Lisbon]")
public class Settings {

  private Integer id;

  private String domainId;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    UNKNOWN("UNKNOWN"),
    
    ALL("ALL"),
    
    OTN("OTN"),
    
    CORE_SIGNATURE("CORE_SIGNATURE");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  @Valid
  private Map<String, String> settingDetails = new HashMap<>();

  private String modifiedBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime modifiedTime;

  public Settings id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Settings domainId(String domainId) {
    this.domainId = domainId;
    return this;
  }

  /**
   * Get domainId
   * @return domainId
  */
  
  @Schema(name = "domainId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("domainId")
  public String getDomainId() {
    return domainId;
  }

  public void setDomainId(String domainId) {
    this.domainId = domainId;
  }

  public Settings type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Settings settingDetails(Map<String, String> settingDetails) {
    this.settingDetails = settingDetails;
    return this;
  }

  public Settings putSettingDetailsItem(String key, String settingDetailsItem) {
    if (this.settingDetails == null) {
      this.settingDetails = new HashMap<>();
    }
    this.settingDetails.put(key, settingDetailsItem);
    return this;
  }

  /**
   * Get settingDetails
   * @return settingDetails
  */
  
  @Schema(name = "settingDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("settingDetails")
  public Map<String, String> getSettingDetails() {
    return settingDetails;
  }

  public void setSettingDetails(Map<String, String> settingDetails) {
    this.settingDetails = settingDetails;
  }

  public Settings modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * Get modifiedBy
   * @return modifiedBy
  */
  
  @Schema(name = "modifiedBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modifiedBy")
  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public Settings modifiedTime(OffsetDateTime modifiedTime) {
    this.modifiedTime = modifiedTime;
    return this;
  }

  /**
   * Get modifiedTime
   * @return modifiedTime
  */
  @Valid 
  @Schema(name = "modifiedTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modifiedTime")
  public OffsetDateTime getModifiedTime() {
    return modifiedTime;
  }

  public void setModifiedTime(OffsetDateTime modifiedTime) {
    this.modifiedTime = modifiedTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Settings settings = (Settings) o;
    return Objects.equals(this.id, settings.id) &&
        Objects.equals(this.domainId, settings.domainId) &&
        Objects.equals(this.type, settings.type) &&
        Objects.equals(this.settingDetails, settings.settingDetails) &&
        Objects.equals(this.modifiedBy, settings.modifiedBy) &&
        Objects.equals(this.modifiedTime, settings.modifiedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, domainId, type, settingDetails, modifiedBy, modifiedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Settings {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    settingDetails: ").append(toIndentedString(settingDetails)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
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

