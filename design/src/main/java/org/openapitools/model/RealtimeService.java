package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.UUID;
import org.openapitools.model.Domain;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The realtime service that is being added
 */

@Schema(name = "RealtimeService", description = "The realtime service that is being added")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class RealtimeService {

  private Domain domain;

  private UUID engineRunDefId;

  private UUID id;

  private String name;

  private String url;

  public RealtimeService() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RealtimeService(UUID id, String name) {
    this.id = id;
    this.name = name;
  }

  public RealtimeService domain(Domain domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Get domain
   * @return domain
  */
  @Valid 
  @Schema(name = "domain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("domain")
  public Domain getDomain() {
    return domain;
  }

  public void setDomain(Domain domain) {
    this.domain = domain;
  }

  public RealtimeService engineRunDefId(UUID engineRunDefId) {
    this.engineRunDefId = engineRunDefId;
    return this;
  }

  /**
   * Get engineRunDefId
   * @return engineRunDefId
  */
  @Valid 
  @Schema(name = "engineRunDefId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("engineRunDefId")
  public UUID getEngineRunDefId() {
    return engineRunDefId;
  }

  public void setEngineRunDefId(UUID engineRunDefId) {
    this.engineRunDefId = engineRunDefId;
  }

  public RealtimeService id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull @Valid 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public RealtimeService name(String name) {
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

  public RealtimeService url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  @Size(min = 0, max = 262) 
  @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeService realtimeService = (RealtimeService) o;
    return Objects.equals(this.domain, realtimeService.domain) &&
        Objects.equals(this.engineRunDefId, realtimeService.engineRunDefId) &&
        Objects.equals(this.id, realtimeService.id) &&
        Objects.equals(this.name, realtimeService.name) &&
        Objects.equals(this.url, realtimeService.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, engineRunDefId, id, name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeService {\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    engineRunDefId: ").append(toIndentedString(engineRunDefId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

