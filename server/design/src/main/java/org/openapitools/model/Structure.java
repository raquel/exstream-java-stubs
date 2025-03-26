package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Frame;
import org.openapitools.model.ResourceVersion;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Structure
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class Structure {

  private ResourceVersion template;

  @Valid
  private List<@Valid Frame> frames;

  public Structure template(ResourceVersion template) {
    this.template = template;
    return this;
  }

  /**
   * Get template
   * @return template
  */
  @Valid 
  @Schema(name = "template", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("template")
  public ResourceVersion getTemplate() {
    return template;
  }

  public void setTemplate(ResourceVersion template) {
    this.template = template;
  }

  public Structure frames(List<@Valid Frame> frames) {
    this.frames = frames;
    return this;
  }

  public Structure addFramesItem(Frame framesItem) {
    if (this.frames == null) {
      this.frames = new ArrayList<>();
    }
    this.frames.add(framesItem);
    return this;
  }

  /**
   * Get frames
   * @return frames
  */
  @Valid 
  @Schema(name = "frames", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("frames")
  public List<@Valid Frame> getFrames() {
    return frames;
  }

  public void setFrames(List<@Valid Frame> frames) {
    this.frames = frames;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Structure structure = (Structure) o;
    return Objects.equals(this.template, structure.template) &&
        Objects.equals(this.frames, structure.frames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(template, frames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Structure {\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    frames: ").append(toIndentedString(frames)).append("\n");
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

