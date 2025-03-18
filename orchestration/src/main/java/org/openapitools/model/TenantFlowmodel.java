package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.model.Node;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TenantFlowmodel
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:03:17.210646522Z[Europe/Lisbon]")
public class TenantFlowmodel {

  private UUID id;

  private String name;

  private String description;

  private Integer revision;

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

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    COMMUNICATION("COMMUNICATION"),
    
    ALERT("ALERT"),
    
    NOTIFICATION("NOTIFICATION");

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

  private String stateComment;

  private String lockedBy;

  @Valid
  private List<String> sdpermissions;

  @Valid
  private List<@Valid Node> nodes;

  private Boolean latestVersion;

  public TenantFlowmodel id(UUID id) {
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

  public TenantFlowmodel name(String name) {
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

  public TenantFlowmodel description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TenantFlowmodel revision(Integer revision) {
    this.revision = revision;
    return this;
  }

  /**
   * Get revision
   * @return revision
  */
  
  @Schema(name = "revision", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("revision")
  public Integer getRevision() {
    return revision;
  }

  public void setRevision(Integer revision) {
    this.revision = revision;
  }

  public TenantFlowmodel version(Integer version) {
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

  public TenantFlowmodel state(StateEnum state) {
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

  public TenantFlowmodel type(TypeEnum type) {
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

  public TenantFlowmodel stateComment(String stateComment) {
    this.stateComment = stateComment;
    return this;
  }

  /**
   * Get stateComment
   * @return stateComment
  */
  
  @Schema(name = "stateComment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stateComment")
  public String getStateComment() {
    return stateComment;
  }

  public void setStateComment(String stateComment) {
    this.stateComment = stateComment;
  }

  public TenantFlowmodel lockedBy(String lockedBy) {
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

  public TenantFlowmodel sdpermissions(List<String> sdpermissions) {
    this.sdpermissions = sdpermissions;
    return this;
  }

  public TenantFlowmodel addSdpermissionsItem(String sdpermissionsItem) {
    if (this.sdpermissions == null) {
      this.sdpermissions = new ArrayList<>();
    }
    this.sdpermissions.add(sdpermissionsItem);
    return this;
  }

  /**
   * Get sdpermissions
   * @return sdpermissions
  */
  
  @Schema(name = "sdpermissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sdpermissions")
  public List<String> getSdpermissions() {
    return sdpermissions;
  }

  public void setSdpermissions(List<String> sdpermissions) {
    this.sdpermissions = sdpermissions;
  }

  public TenantFlowmodel nodes(List<@Valid Node> nodes) {
    this.nodes = nodes;
    return this;
  }

  public TenantFlowmodel addNodesItem(Node nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

  /**
   * Get nodes
   * @return nodes
  */
  @Valid 
  @Schema(name = "nodes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nodes")
  public List<@Valid Node> getNodes() {
    return nodes;
  }

  public void setNodes(List<@Valid Node> nodes) {
    this.nodes = nodes;
  }

  public TenantFlowmodel latestVersion(Boolean latestVersion) {
    this.latestVersion = latestVersion;
    return this;
  }

  /**
   * Get latestVersion
   * @return latestVersion
  */
  
  @Schema(name = "latestVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latestVersion")
  public Boolean getLatestVersion() {
    return latestVersion;
  }

  public void setLatestVersion(Boolean latestVersion) {
    this.latestVersion = latestVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantFlowmodel tenantFlowmodel = (TenantFlowmodel) o;
    return Objects.equals(this.id, tenantFlowmodel.id) &&
        Objects.equals(this.name, tenantFlowmodel.name) &&
        Objects.equals(this.description, tenantFlowmodel.description) &&
        Objects.equals(this.revision, tenantFlowmodel.revision) &&
        Objects.equals(this.version, tenantFlowmodel.version) &&
        Objects.equals(this.state, tenantFlowmodel.state) &&
        Objects.equals(this.type, tenantFlowmodel.type) &&
        Objects.equals(this.stateComment, tenantFlowmodel.stateComment) &&
        Objects.equals(this.lockedBy, tenantFlowmodel.lockedBy) &&
        Objects.equals(this.sdpermissions, tenantFlowmodel.sdpermissions) &&
        Objects.equals(this.nodes, tenantFlowmodel.nodes) &&
        Objects.equals(this.latestVersion, tenantFlowmodel.latestVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, revision, version, state, type, stateComment, lockedBy, sdpermissions, nodes, latestVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantFlowmodel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    stateComment: ").append(toIndentedString(stateComment)).append("\n");
    sb.append("    lockedBy: ").append(toIndentedString(lockedBy)).append("\n");
    sb.append("    sdpermissions: ").append(toIndentedString(sdpermissions)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
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

