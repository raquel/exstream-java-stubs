package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.Outcome;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * FlowContextOutputChannelMappingsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class FlowContextOutputChannelMappingsResponse {

  @Valid
  private Map<String, List<@Valid Outcome>> mappings = new HashMap<>();

  @Valid
  private Map<String, String> channels = new HashMap<>();

  public FlowContextOutputChannelMappingsResponse mappings(Map<String, List<@Valid Outcome>> mappings) {
    this.mappings = mappings;
    return this;
  }

  public FlowContextOutputChannelMappingsResponse putMappingsItem(String key, List<@Valid Outcome> mappingsItem) {
    if (this.mappings == null) {
      this.mappings = new HashMap<>();
    }
    this.mappings.put(key, mappingsItem);
    return this;
  }

  /**
   * Get mappings
   * @return mappings
  */
  @Valid 
  @Schema(name = "mappings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mappings")
  public Map<String, List<@Valid Outcome>> getMappings() {
    return mappings;
  }

  public void setMappings(Map<String, List<@Valid Outcome>> mappings) {
    this.mappings = mappings;
  }

  public FlowContextOutputChannelMappingsResponse channels(Map<String, String> channels) {
    this.channels = channels;
    return this;
  }

  public FlowContextOutputChannelMappingsResponse putChannelsItem(String key, String channelsItem) {
    if (this.channels == null) {
      this.channels = new HashMap<>();
    }
    this.channels.put(key, channelsItem);
    return this;
  }

  /**
   * Get channels
   * @return channels
  */
  
  @Schema(name = "channels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("channels")
  public Map<String, String> getChannels() {
    return channels;
  }

  public void setChannels(Map<String, String> channels) {
    this.channels = channels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowContextOutputChannelMappingsResponse flowContextOutputChannelMappingsResponse = (FlowContextOutputChannelMappingsResponse) o;
    return Objects.equals(this.mappings, flowContextOutputChannelMappingsResponse.mappings) &&
        Objects.equals(this.channels, flowContextOutputChannelMappingsResponse.channels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mappings, channels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowContextOutputChannelMappingsResponse {\n");
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
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

