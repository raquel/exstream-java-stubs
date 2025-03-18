package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.model.VariableLink;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MigrationSetLinkRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:04:36.667726893Z[Europe/Lisbon]")
public class MigrationSetLinkRequest {

  private UUID ratMigrationSetId;

  private UUID dasMigrationSetId;

  @Valid
  private List<@Valid VariableLink> variables;

  public MigrationSetLinkRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MigrationSetLinkRequest(UUID ratMigrationSetId, UUID dasMigrationSetId) {
    this.ratMigrationSetId = ratMigrationSetId;
    this.dasMigrationSetId = dasMigrationSetId;
  }

  public MigrationSetLinkRequest ratMigrationSetId(UUID ratMigrationSetId) {
    this.ratMigrationSetId = ratMigrationSetId;
    return this;
  }

  /**
   * Get ratMigrationSetId
   * @return ratMigrationSetId
  */
  @NotNull @Valid 
  @Schema(name = "ratMigrationSetId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ratMigrationSetId")
  public UUID getRatMigrationSetId() {
    return ratMigrationSetId;
  }

  public void setRatMigrationSetId(UUID ratMigrationSetId) {
    this.ratMigrationSetId = ratMigrationSetId;
  }

  public MigrationSetLinkRequest dasMigrationSetId(UUID dasMigrationSetId) {
    this.dasMigrationSetId = dasMigrationSetId;
    return this;
  }

  /**
   * Get dasMigrationSetId
   * @return dasMigrationSetId
  */
  @NotNull @Valid 
  @Schema(name = "dasMigrationSetId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dasMigrationSetId")
  public UUID getDasMigrationSetId() {
    return dasMigrationSetId;
  }

  public void setDasMigrationSetId(UUID dasMigrationSetId) {
    this.dasMigrationSetId = dasMigrationSetId;
  }

  public MigrationSetLinkRequest variables(List<@Valid VariableLink> variables) {
    this.variables = variables;
    return this;
  }

  public MigrationSetLinkRequest addVariablesItem(VariableLink variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<>();
    }
    this.variables.add(variablesItem);
    return this;
  }

  /**
   * Get variables
   * @return variables
  */
  @Valid 
  @Schema(name = "variables", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variables")
  public List<@Valid VariableLink> getVariables() {
    return variables;
  }

  public void setVariables(List<@Valid VariableLink> variables) {
    this.variables = variables;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationSetLinkRequest migrationSetLinkRequest = (MigrationSetLinkRequest) o;
    return Objects.equals(this.ratMigrationSetId, migrationSetLinkRequest.ratMigrationSetId) &&
        Objects.equals(this.dasMigrationSetId, migrationSetLinkRequest.dasMigrationSetId) &&
        Objects.equals(this.variables, migrationSetLinkRequest.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratMigrationSetId, dasMigrationSetId, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationSetLinkRequest {\n");
    sb.append("    ratMigrationSetId: ").append(toIndentedString(ratMigrationSetId)).append("\n");
    sb.append("    dasMigrationSetId: ").append(toIndentedString(dasMigrationSetId)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

