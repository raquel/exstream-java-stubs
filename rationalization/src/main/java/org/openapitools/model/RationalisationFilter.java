package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RationalisationFilter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:04:36.667726893Z[Europe/Lisbon]")
public class RationalisationFilter {

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    MIGRATIONSET("MIGRATIONSET"),
    
    FRAGMENTS("FRAGMENTS");

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

  @Valid
  private List<TypeEnum> type;

  private String searchString;

  private Boolean caseSensitive;

  private String createdBy;

  private String lockedBy;

  private String updatedBy;

  /**
   * Gets or Sets statesList
   */
  public enum StatesListEnum {
    DRAFT("DRAFT"),
    
    REVIEW("REVIEW"),
    
    APPROVED("APPROVED"),
    
    REJECTED("REJECTED");

    private String value;

    StatesListEnum(String value) {
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
    public static StatesListEnum fromValue(String value) {
      for (StatesListEnum b : StatesListEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<StatesListEnum> statesList;

  @Valid
  private List<String> communicationIdList;

  @Valid
  private List<String> migrationSetIdList;

  public RationalisationFilter type(List<TypeEnum> type) {
    this.type = type;
    return this;
  }

  public RationalisationFilter addTypeItem(TypeEnum typeItem) {
    if (this.type == null) {
      this.type = new ArrayList<>();
    }
    this.type.add(typeItem);
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public List<TypeEnum> getType() {
    return type;
  }

  public void setType(List<TypeEnum> type) {
    this.type = type;
  }

  public RationalisationFilter searchString(String searchString) {
    this.searchString = searchString;
    return this;
  }

  /**
   * Get searchString
   * @return searchString
  */
  
  @Schema(name = "searchString", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("searchString")
  public String getSearchString() {
    return searchString;
  }

  public void setSearchString(String searchString) {
    this.searchString = searchString;
  }

  public RationalisationFilter caseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
    return this;
  }

  /**
   * Get caseSensitive
   * @return caseSensitive
  */
  
  @Schema(name = "caseSensitive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseSensitive")
  public Boolean getCaseSensitive() {
    return caseSensitive;
  }

  public void setCaseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
  }

  public RationalisationFilter createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  */
  
  @Schema(name = "createdBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public RationalisationFilter lockedBy(String lockedBy) {
    this.lockedBy = lockedBy;
    return this;
  }

  /**
   * Get lockedBy
   * @return lockedBy
  */
  
  @Schema(name = "lockedBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lockedBy")
  public String getLockedBy() {
    return lockedBy;
  }

  public void setLockedBy(String lockedBy) {
    this.lockedBy = lockedBy;
  }

  public RationalisationFilter updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * Get updatedBy
   * @return updatedBy
  */
  
  @Schema(name = "updatedBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedBy")
  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  public RationalisationFilter statesList(List<StatesListEnum> statesList) {
    this.statesList = statesList;
    return this;
  }

  public RationalisationFilter addStatesListItem(StatesListEnum statesListItem) {
    if (this.statesList == null) {
      this.statesList = new ArrayList<>();
    }
    this.statesList.add(statesListItem);
    return this;
  }

  /**
   * Get statesList
   * @return statesList
  */
  
  @Schema(name = "statesList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statesList")
  public List<StatesListEnum> getStatesList() {
    return statesList;
  }

  public void setStatesList(List<StatesListEnum> statesList) {
    this.statesList = statesList;
  }

  public RationalisationFilter communicationIdList(List<String> communicationIdList) {
    this.communicationIdList = communicationIdList;
    return this;
  }

  public RationalisationFilter addCommunicationIdListItem(String communicationIdListItem) {
    if (this.communicationIdList == null) {
      this.communicationIdList = new ArrayList<>();
    }
    this.communicationIdList.add(communicationIdListItem);
    return this;
  }

  /**
   * Get communicationIdList
   * @return communicationIdList
  */
  
  @Schema(name = "communicationIdList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("communicationIdList")
  public List<String> getCommunicationIdList() {
    return communicationIdList;
  }

  public void setCommunicationIdList(List<String> communicationIdList) {
    this.communicationIdList = communicationIdList;
  }

  public RationalisationFilter migrationSetIdList(List<String> migrationSetIdList) {
    this.migrationSetIdList = migrationSetIdList;
    return this;
  }

  public RationalisationFilter addMigrationSetIdListItem(String migrationSetIdListItem) {
    if (this.migrationSetIdList == null) {
      this.migrationSetIdList = new ArrayList<>();
    }
    this.migrationSetIdList.add(migrationSetIdListItem);
    return this;
  }

  /**
   * Get migrationSetIdList
   * @return migrationSetIdList
  */
  
  @Schema(name = "migrationSetIdList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("migrationSetIdList")
  public List<String> getMigrationSetIdList() {
    return migrationSetIdList;
  }

  public void setMigrationSetIdList(List<String> migrationSetIdList) {
    this.migrationSetIdList = migrationSetIdList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RationalisationFilter rationalisationFilter = (RationalisationFilter) o;
    return Objects.equals(this.type, rationalisationFilter.type) &&
        Objects.equals(this.searchString, rationalisationFilter.searchString) &&
        Objects.equals(this.caseSensitive, rationalisationFilter.caseSensitive) &&
        Objects.equals(this.createdBy, rationalisationFilter.createdBy) &&
        Objects.equals(this.lockedBy, rationalisationFilter.lockedBy) &&
        Objects.equals(this.updatedBy, rationalisationFilter.updatedBy) &&
        Objects.equals(this.statesList, rationalisationFilter.statesList) &&
        Objects.equals(this.communicationIdList, rationalisationFilter.communicationIdList) &&
        Objects.equals(this.migrationSetIdList, rationalisationFilter.migrationSetIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, searchString, caseSensitive, createdBy, lockedBy, updatedBy, statesList, communicationIdList, migrationSetIdList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RationalisationFilter {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    searchString: ").append(toIndentedString(searchString)).append("\n");
    sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lockedBy: ").append(toIndentedString(lockedBy)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    statesList: ").append(toIndentedString(statesList)).append("\n");
    sb.append("    communicationIdList: ").append(toIndentedString(communicationIdList)).append("\n");
    sb.append("    migrationSetIdList: ").append(toIndentedString(migrationSetIdList)).append("\n");
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

