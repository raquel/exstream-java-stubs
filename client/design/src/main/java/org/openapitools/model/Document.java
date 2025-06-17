package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DocumentProperties;
import org.openapitools.model.Scope;
import org.openapitools.model.SectionUse;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Document
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class Document {

  private Scope scope;

  private DocumentProperties documentProperties;

  @Valid
  private List<@Valid SectionUse> sectionUses;

  public Document scope(Scope scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
  */
  @Valid 
  @Schema(name = "scope", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scope")
  public Scope getScope() {
    return scope;
  }

  public void setScope(Scope scope) {
    this.scope = scope;
  }

  public Document documentProperties(DocumentProperties documentProperties) {
    this.documentProperties = documentProperties;
    return this;
  }

  /**
   * Get documentProperties
   * @return documentProperties
  */
  @Valid 
  @Schema(name = "documentProperties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("documentProperties")
  public DocumentProperties getDocumentProperties() {
    return documentProperties;
  }

  public void setDocumentProperties(DocumentProperties documentProperties) {
    this.documentProperties = documentProperties;
  }

  public Document sectionUses(List<@Valid SectionUse> sectionUses) {
    this.sectionUses = sectionUses;
    return this;
  }

  public Document addSectionUsesItem(SectionUse sectionUsesItem) {
    if (this.sectionUses == null) {
      this.sectionUses = new ArrayList<>();
    }
    this.sectionUses.add(sectionUsesItem);
    return this;
  }

  /**
   * Get sectionUses
   * @return sectionUses
  */
  @Valid 
  @Schema(name = "sectionUses", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sectionUses")
  public List<@Valid SectionUse> getSectionUses() {
    return sectionUses;
  }

  public void setSectionUses(List<@Valid SectionUse> sectionUses) {
    this.sectionUses = sectionUses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.scope, document.scope) &&
        Objects.equals(this.documentProperties, document.documentProperties) &&
        Objects.equals(this.sectionUses, document.sectionUses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, documentProperties, sectionUses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    documentProperties: ").append(toIndentedString(documentProperties)).append("\n");
    sb.append("    sectionUses: ").append(toIndentedString(sectionUses)).append("\n");
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

