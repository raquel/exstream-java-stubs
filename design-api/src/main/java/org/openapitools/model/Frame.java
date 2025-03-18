package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TreeResourceVersion;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Frame
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T17:54:43.132703260Z[Europe/Lisbon]")
public class Frame {

  @Valid
  private List<@Valid TreeResourceVersion> children;

  private String id;

  private String name;

  public Frame children(List<@Valid TreeResourceVersion> children) {
    this.children = children;
    return this;
  }

  public Frame addChildrenItem(TreeResourceVersion childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

  /**
   * Get children
   * @return children
  */
  @Valid 
  @Schema(name = "children", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("children")
  public List<@Valid TreeResourceVersion> getChildren() {
    return children;
  }

  public void setChildren(List<@Valid TreeResourceVersion> children) {
    this.children = children;
  }

  public Frame id(String id) {
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

  public Frame name(String name) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Frame frame = (Frame) o;
    return Objects.equals(this.children, frame.children) &&
        Objects.equals(this.id, frame.id) &&
        Objects.equals(this.name, frame.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(children, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Frame {\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

