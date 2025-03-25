package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Connection;
import org.openapitools.model.NodeAttribute;
import org.openapitools.model.NodeMetadata;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Node
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class Node {

  private String displayName;

  private String id;

  private String instanceId;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    INPUT("input"),
    
    OUTPUT("output"),
    
    OUTPUT_EXTERNAL_RESPONSE("output_external_response"),
    
    COMMUNICATION("communication"),
    
    COMMUNICATION_RESPONSE("communication_response"),
    
    EXTERNALSUBFLOW("externalsubflow"),
    
    DECIDER("decider"),
    
    DELAY("delay"),
    
    PROCESSOR("processor"),
    
    AGGREGATION("aggregation"),
    
    EVENT("event");

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

  /**
   * Gets or Sets subtype
   */
  public enum SubtypeEnum {
    DIRECTORY_CHANNEL("directory_channel"),
    
    HTTPS_CHANNEL("https_channel"),
    
    AWS_S3_INPUT_CHANNEL("aws_s3_input_channel"),
    
    EMPOWER_FULFILLMENT_CHANNEL("empower_fulfillment_channel"),
    
    POST_SORT_EVENT_CHANNEL("post_sort_event_channel"),
    
    FILE_CHANNEL("file_channel"),
    
    EMAIL_CHANNEL("email_channel"),
    
    DOCUMENTRESPONSE_CHANNEL("documentresponse_channel"),
    
    AZURE_BLOB_CHANNEL("azure_blob_channel"),
    
    AWS_S3_CHANNEL("aws_s3_channel"),
    
    GCP_CS_OUT_CHANNEL("gcp_cs_out_channel"),
    
    GENERIC("generic"),
    
    GENERIC_CHANNEL("generic_channel"),
    
    UNKNOWN("unknown");

    private String value;

    SubtypeEnum(String value) {
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
    public static SubtypeEnum fromValue(String value) {
      for (SubtypeEnum b : SubtypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SubtypeEnum subtype;

  private Boolean internal;

  private Integer x;

  private Integer y;

  @Valid
  private List<@Valid Connection> connections;

  @Valid
  private List<@Valid NodeAttribute> attributes;

  @Valid
  private List<@Valid NodeMetadata> metadata;

  public Node displayName(String displayName) {
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

  public Node id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Node instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  /**
   * Get instanceId
   * @return instanceId
  */
  
  @Schema(name = "instanceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instanceId")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public Node type(TypeEnum type) {
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

  public Node subtype(SubtypeEnum subtype) {
    this.subtype = subtype;
    return this;
  }

  /**
   * Get subtype
   * @return subtype
  */
  
  @Schema(name = "subtype", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subtype")
  public SubtypeEnum getSubtype() {
    return subtype;
  }

  public void setSubtype(SubtypeEnum subtype) {
    this.subtype = subtype;
  }

  public Node internal(Boolean internal) {
    this.internal = internal;
    return this;
  }

  /**
   * Get internal
   * @return internal
  */
  
  @Schema(name = "internal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("internal")
  public Boolean getInternal() {
    return internal;
  }

  public void setInternal(Boolean internal) {
    this.internal = internal;
  }

  public Node x(Integer x) {
    this.x = x;
    return this;
  }

  /**
   * Get x
   * @return x
  */
  
  @Schema(name = "x", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("x")
  public Integer getX() {
    return x;
  }

  public void setX(Integer x) {
    this.x = x;
  }

  public Node y(Integer y) {
    this.y = y;
    return this;
  }

  /**
   * Get y
   * @return y
  */
  
  @Schema(name = "y", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("y")
  public Integer getY() {
    return y;
  }

  public void setY(Integer y) {
    this.y = y;
  }

  public Node connections(List<@Valid Connection> connections) {
    this.connections = connections;
    return this;
  }

  public Node addConnectionsItem(Connection connectionsItem) {
    if (this.connections == null) {
      this.connections = new ArrayList<>();
    }
    this.connections.add(connectionsItem);
    return this;
  }

  /**
   * Get connections
   * @return connections
  */
  @Valid 
  @Schema(name = "connections", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connections")
  public List<@Valid Connection> getConnections() {
    return connections;
  }

  public void setConnections(List<@Valid Connection> connections) {
    this.connections = connections;
  }

  public Node attributes(List<@Valid NodeAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public Node addAttributesItem(NodeAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  */
  @Valid 
  @Schema(name = "attributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attributes")
  public List<@Valid NodeAttribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<@Valid NodeAttribute> attributes) {
    this.attributes = attributes;
  }

  public Node metadata(List<@Valid NodeMetadata> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Node addMetadataItem(NodeMetadata metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  @Valid 
  @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metadata")
  public List<@Valid NodeMetadata> getMetadata() {
    return metadata;
  }

  public void setMetadata(List<@Valid NodeMetadata> metadata) {
    this.metadata = metadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Node node = (Node) o;
    return Objects.equals(this.displayName, node.displayName) &&
        Objects.equals(this.id, node.id) &&
        Objects.equals(this.instanceId, node.instanceId) &&
        Objects.equals(this.type, node.type) &&
        Objects.equals(this.subtype, node.subtype) &&
        Objects.equals(this.internal, node.internal) &&
        Objects.equals(this.x, node.x) &&
        Objects.equals(this.y, node.y) &&
        Objects.equals(this.connections, node.connections) &&
        Objects.equals(this.attributes, node.attributes) &&
        Objects.equals(this.metadata, node.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, id, instanceId, type, subtype, internal, x, y, connections, attributes, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Node {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

