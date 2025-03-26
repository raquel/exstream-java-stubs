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
import org.openapitools.model.MigrationSetFilter;
import org.openapitools.model.MigrationSetResource;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MigrationSetRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:04:36.667726893Z[Europe/Lisbon]")
public class MigrationSetRequest {

  private UUID id;

  private UUID tmpId;

  private String name;

  private String description;

  private Integer ratTolerance;

  private Integer fragTolerance;

  @Valid
  private List<@Valid MigrationSetResource> dataSources;

  @Valid
  private List<@Valid MigrationSetResource> outputSamples;

  @Valid
  private List<@Valid MigrationSetResource> templates;

  /**
   * Gets or Sets migrationType
   */
  public enum MigrationTypeEnum {
    CONTENT("CONTENT"),
    
    TEMPLATE("TEMPLATE"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    MigrationTypeEnum(String value) {
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
    public static MigrationTypeEnum fromValue(String value) {
      for (MigrationTypeEnum b : MigrationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private MigrationTypeEnum migrationType;

  private MigrationSetFilter filter;

  public MigrationSetRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MigrationSetRequest(String name, MigrationTypeEnum migrationType) {
    this.name = name;
    this.migrationType = migrationType;
  }

  public MigrationSetRequest id(UUID id) {
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

  public MigrationSetRequest tmpId(UUID tmpId) {
    this.tmpId = tmpId;
    return this;
  }

  /**
   * Get tmpId
   * @return tmpId
  */
  @Valid 
  @Schema(name = "tmpId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tmpId")
  public UUID getTmpId() {
    return tmpId;
  }

  public void setTmpId(UUID tmpId) {
    this.tmpId = tmpId;
  }

  public MigrationSetRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MigrationSetRequest description(String description) {
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

  public MigrationSetRequest ratTolerance(Integer ratTolerance) {
    this.ratTolerance = ratTolerance;
    return this;
  }

  /**
   * Get ratTolerance
   * minimum: 50
   * maximum: 100
   * @return ratTolerance
  */
  @Min(50) @Max(100) 
  @Schema(name = "ratTolerance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ratTolerance")
  public Integer getRatTolerance() {
    return ratTolerance;
  }

  public void setRatTolerance(Integer ratTolerance) {
    this.ratTolerance = ratTolerance;
  }

  public MigrationSetRequest fragTolerance(Integer fragTolerance) {
    this.fragTolerance = fragTolerance;
    return this;
  }

  /**
   * Get fragTolerance
   * minimum: 50
   * maximum: 100
   * @return fragTolerance
  */
  @Min(50) @Max(100) 
  @Schema(name = "fragTolerance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fragTolerance")
  public Integer getFragTolerance() {
    return fragTolerance;
  }

  public void setFragTolerance(Integer fragTolerance) {
    this.fragTolerance = fragTolerance;
  }

  public MigrationSetRequest dataSources(List<@Valid MigrationSetResource> dataSources) {
    this.dataSources = dataSources;
    return this;
  }

  public MigrationSetRequest addDataSourcesItem(MigrationSetResource dataSourcesItem) {
    if (this.dataSources == null) {
      this.dataSources = new ArrayList<>();
    }
    this.dataSources.add(dataSourcesItem);
    return this;
  }

  /**
   * Get dataSources
   * @return dataSources
  */
  @Valid 
  @Schema(name = "dataSources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataSources")
  public List<@Valid MigrationSetResource> getDataSources() {
    return dataSources;
  }

  public void setDataSources(List<@Valid MigrationSetResource> dataSources) {
    this.dataSources = dataSources;
  }

  public MigrationSetRequest outputSamples(List<@Valid MigrationSetResource> outputSamples) {
    this.outputSamples = outputSamples;
    return this;
  }

  public MigrationSetRequest addOutputSamplesItem(MigrationSetResource outputSamplesItem) {
    if (this.outputSamples == null) {
      this.outputSamples = new ArrayList<>();
    }
    this.outputSamples.add(outputSamplesItem);
    return this;
  }

  /**
   * Get outputSamples
   * @return outputSamples
  */
  @Valid @Size(min = 1, max = 2147483647) 
  @Schema(name = "outputSamples", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("outputSamples")
  public List<@Valid MigrationSetResource> getOutputSamples() {
    return outputSamples;
  }

  public void setOutputSamples(List<@Valid MigrationSetResource> outputSamples) {
    this.outputSamples = outputSamples;
  }

  public MigrationSetRequest templates(List<@Valid MigrationSetResource> templates) {
    this.templates = templates;
    return this;
  }

  public MigrationSetRequest addTemplatesItem(MigrationSetResource templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<>();
    }
    this.templates.add(templatesItem);
    return this;
  }

  /**
   * Get templates
   * @return templates
  */
  @Valid 
  @Schema(name = "templates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("templates")
  public List<@Valid MigrationSetResource> getTemplates() {
    return templates;
  }

  public void setTemplates(List<@Valid MigrationSetResource> templates) {
    this.templates = templates;
  }

  public MigrationSetRequest migrationType(MigrationTypeEnum migrationType) {
    this.migrationType = migrationType;
    return this;
  }

  /**
   * Get migrationType
   * @return migrationType
  */
  @NotNull 
  @Schema(name = "migrationType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("migrationType")
  public MigrationTypeEnum getMigrationType() {
    return migrationType;
  }

  public void setMigrationType(MigrationTypeEnum migrationType) {
    this.migrationType = migrationType;
  }

  public MigrationSetRequest filter(MigrationSetFilter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
  */
  @Valid 
  @Schema(name = "filter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filter")
  public MigrationSetFilter getFilter() {
    return filter;
  }

  public void setFilter(MigrationSetFilter filter) {
    this.filter = filter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationSetRequest migrationSetRequest = (MigrationSetRequest) o;
    return Objects.equals(this.id, migrationSetRequest.id) &&
        Objects.equals(this.tmpId, migrationSetRequest.tmpId) &&
        Objects.equals(this.name, migrationSetRequest.name) &&
        Objects.equals(this.description, migrationSetRequest.description) &&
        Objects.equals(this.ratTolerance, migrationSetRequest.ratTolerance) &&
        Objects.equals(this.fragTolerance, migrationSetRequest.fragTolerance) &&
        Objects.equals(this.dataSources, migrationSetRequest.dataSources) &&
        Objects.equals(this.outputSamples, migrationSetRequest.outputSamples) &&
        Objects.equals(this.templates, migrationSetRequest.templates) &&
        Objects.equals(this.migrationType, migrationSetRequest.migrationType) &&
        Objects.equals(this.filter, migrationSetRequest.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tmpId, name, description, ratTolerance, fragTolerance, dataSources, outputSamples, templates, migrationType, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationSetRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tmpId: ").append(toIndentedString(tmpId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ratTolerance: ").append(toIndentedString(ratTolerance)).append("\n");
    sb.append("    fragTolerance: ").append(toIndentedString(fragTolerance)).append("\n");
    sb.append("    dataSources: ").append(toIndentedString(dataSources)).append("\n");
    sb.append("    outputSamples: ").append(toIndentedString(outputSamples)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    migrationType: ").append(toIndentedString(migrationType)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

