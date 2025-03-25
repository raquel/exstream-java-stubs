package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Condition;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Connection
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class Connection {

  private Condition condition;

  private String sourceAnchor;

  private String targetAnchor;

  private String targetNode;

  private String targetNodeId;

  private String displayName;

  private Boolean defaultConnection;

  public Connection condition(Condition condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Get condition
   * @return condition
  */
  @Valid 
  @Schema(name = "condition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("condition")
  public Condition getCondition() {
    return condition;
  }

  public void setCondition(Condition condition) {
    this.condition = condition;
  }

  public Connection sourceAnchor(String sourceAnchor) {
    this.sourceAnchor = sourceAnchor;
    return this;
  }

  /**
   * Get sourceAnchor
   * @return sourceAnchor
  */
  
  @Schema(name = "sourceAnchor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sourceAnchor")
  public String getSourceAnchor() {
    return sourceAnchor;
  }

  public void setSourceAnchor(String sourceAnchor) {
    this.sourceAnchor = sourceAnchor;
  }

  public Connection targetAnchor(String targetAnchor) {
    this.targetAnchor = targetAnchor;
    return this;
  }

  /**
   * Get targetAnchor
   * @return targetAnchor
  */
  
  @Schema(name = "targetAnchor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetAnchor")
  public String getTargetAnchor() {
    return targetAnchor;
  }

  public void setTargetAnchor(String targetAnchor) {
    this.targetAnchor = targetAnchor;
  }

  public Connection targetNode(String targetNode) {
    this.targetNode = targetNode;
    return this;
  }

  /**
   * Get targetNode
   * @return targetNode
  */
  
  @Schema(name = "targetNode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetNode")
  public String getTargetNode() {
    return targetNode;
  }

  public void setTargetNode(String targetNode) {
    this.targetNode = targetNode;
  }

  public Connection targetNodeId(String targetNodeId) {
    this.targetNodeId = targetNodeId;
    return this;
  }

  /**
   * Get targetNodeId
   * @return targetNodeId
  */
  
  @Schema(name = "targetNodeId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetNodeId")
  public String getTargetNodeId() {
    return targetNodeId;
  }

  public void setTargetNodeId(String targetNodeId) {
    this.targetNodeId = targetNodeId;
  }

  public Connection displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  */
  
  @Schema(name = "displayName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Connection defaultConnection(Boolean defaultConnection) {
    this.defaultConnection = defaultConnection;
    return this;
  }

  /**
   * Get defaultConnection
   * @return defaultConnection
  */
  
  @Schema(name = "defaultConnection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultConnection")
  public Boolean getDefaultConnection() {
    return defaultConnection;
  }

  public void setDefaultConnection(Boolean defaultConnection) {
    this.defaultConnection = defaultConnection;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connection connection = (Connection) o;
    return Objects.equals(this.condition, connection.condition) &&
        Objects.equals(this.sourceAnchor, connection.sourceAnchor) &&
        Objects.equals(this.targetAnchor, connection.targetAnchor) &&
        Objects.equals(this.targetNode, connection.targetNode) &&
        Objects.equals(this.targetNodeId, connection.targetNodeId) &&
        Objects.equals(this.displayName, connection.displayName) &&
        Objects.equals(this.defaultConnection, connection.defaultConnection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, sourceAnchor, targetAnchor, targetNode, targetNodeId, displayName, defaultConnection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connection {\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    sourceAnchor: ").append(toIndentedString(sourceAnchor)).append("\n");
    sb.append("    targetAnchor: ").append(toIndentedString(targetAnchor)).append("\n");
    sb.append("    targetNode: ").append(toIndentedString(targetNode)).append("\n");
    sb.append("    targetNodeId: ").append(toIndentedString(targetNodeId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    defaultConnection: ").append(toIndentedString(defaultConnection)).append("\n");
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

