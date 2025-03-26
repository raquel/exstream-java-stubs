package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ImportConflictResource
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class ImportConflictResource {

  private String type;

  private String name;

  private UUID id;

  private Integer version;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    DRAFT("DRAFT"),
    
    REVIEW("REVIEW"),
    
    APPROVED("APPROVED"),
    
    REJECTED("REJECTED");

    private String value;

    StateEnum(String value) {
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
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StateEnum state;

  private String newName;

  private UUID origId;

  /**
   * Gets or Sets userSelectedAction
   */
  public enum UserSelectedActionEnum {
    AUTO_RENAME("AUTO_RENAME"),
    
    ERROR("ERROR"),
    
    REPLACE("REPLACE"),
    
    SKIP("SKIP"),
    
    REPLACE_IF_NEWER("REPLACE_IF_NEWER"),
    
    EXISTING("EXISTING"),
    
    REPLACE_AT_SAME_VERSION("REPLACE_AT_SAME_VERSION"),
    
    PROMOTED_TO_DOMAIN("PROMOTED_TO_DOMAIN");

    private String value;

    UserSelectedActionEnum(String value) {
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
    public static UserSelectedActionEnum fromValue(String value) {
      for (UserSelectedActionEnum b : UserSelectedActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private UserSelectedActionEnum userSelectedAction;

  /**
   * Gets or Sets performedAction
   */
  public enum PerformedActionEnum {
    AUTO_RENAME("AUTO_RENAME"),
    
    ERROR("ERROR"),
    
    REPLACE("REPLACE"),
    
    SKIP("SKIP"),
    
    REPLACE_IF_NEWER("REPLACE_IF_NEWER"),
    
    EXISTING("EXISTING"),
    
    REPLACE_AT_SAME_VERSION("REPLACE_AT_SAME_VERSION"),
    
    PROMOTED_TO_DOMAIN("PROMOTED_TO_DOMAIN");

    private String value;

    PerformedActionEnum(String value) {
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
    public static PerformedActionEnum fromValue(String value) {
      for (PerformedActionEnum b : PerformedActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PerformedActionEnum performedAction;

  private Boolean locked;

  private String lockedBy;

  public ImportConflictResource type(String type) {
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

  public ImportConflictResource name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ImportConflictResource id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @Valid 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public ImportConflictResource version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public ImportConflictResource state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public ImportConflictResource newName(String newName) {
    this.newName = newName;
    return this;
  }

  /**
   * Get newName
   * @return newName
  */
  
  @Schema(name = "newName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("newName")
  public String getNewName() {
    return newName;
  }

  public void setNewName(String newName) {
    this.newName = newName;
  }

  public ImportConflictResource origId(UUID origId) {
    this.origId = origId;
    return this;
  }

  /**
   * Get origId
   * @return origId
  */
  @Valid 
  @Schema(name = "origId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("origId")
  public UUID getOrigId() {
    return origId;
  }

  public void setOrigId(UUID origId) {
    this.origId = origId;
  }

  public ImportConflictResource userSelectedAction(UserSelectedActionEnum userSelectedAction) {
    this.userSelectedAction = userSelectedAction;
    return this;
  }

  /**
   * Get userSelectedAction
   * @return userSelectedAction
  */
  
  @Schema(name = "userSelectedAction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userSelectedAction")
  public UserSelectedActionEnum getUserSelectedAction() {
    return userSelectedAction;
  }

  public void setUserSelectedAction(UserSelectedActionEnum userSelectedAction) {
    this.userSelectedAction = userSelectedAction;
  }

  public ImportConflictResource performedAction(PerformedActionEnum performedAction) {
    this.performedAction = performedAction;
    return this;
  }

  /**
   * Get performedAction
   * @return performedAction
  */
  
  @Schema(name = "performedAction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("performedAction")
  public PerformedActionEnum getPerformedAction() {
    return performedAction;
  }

  public void setPerformedAction(PerformedActionEnum performedAction) {
    this.performedAction = performedAction;
  }

  public ImportConflictResource locked(Boolean locked) {
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

  public ImportConflictResource lockedBy(String lockedBy) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportConflictResource importConflictResource = (ImportConflictResource) o;
    return Objects.equals(this.type, importConflictResource.type) &&
        Objects.equals(this.name, importConflictResource.name) &&
        Objects.equals(this.id, importConflictResource.id) &&
        Objects.equals(this.version, importConflictResource.version) &&
        Objects.equals(this.state, importConflictResource.state) &&
        Objects.equals(this.newName, importConflictResource.newName) &&
        Objects.equals(this.origId, importConflictResource.origId) &&
        Objects.equals(this.userSelectedAction, importConflictResource.userSelectedAction) &&
        Objects.equals(this.performedAction, importConflictResource.performedAction) &&
        Objects.equals(this.locked, importConflictResource.locked) &&
        Objects.equals(this.lockedBy, importConflictResource.lockedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, id, version, state, newName, origId, userSelectedAction, performedAction, locked, lockedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportConflictResource {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    origId: ").append(toIndentedString(origId)).append("\n");
    sb.append("    userSelectedAction: ").append(toIndentedString(userSelectedAction)).append("\n");
    sb.append("    performedAction: ").append(toIndentedString(performedAction)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    lockedBy: ").append(toIndentedString(lockedBy)).append("\n");
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

