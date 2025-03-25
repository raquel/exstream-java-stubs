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
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NodeFilter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class NodeFilter {

  @Valid
  private List<UUID> ids;

  /**
   * Gets or Sets types
   */
  public enum TypesEnum {
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

    TypesEnum(String value) {
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
    public static TypesEnum fromValue(String value) {
      for (TypesEnum b : TypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<TypesEnum> types;

  /**
   * Gets or Sets excludedTypes
   */
  public enum ExcludedTypesEnum {
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

    ExcludedTypesEnum(String value) {
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
    public static ExcludedTypesEnum fromValue(String value) {
      for (ExcludedTypesEnum b : ExcludedTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<ExcludedTypesEnum> excludedTypes;

  /**
   * Gets or Sets subtypes
   */
  public enum SubtypesEnum {
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

    SubtypesEnum(String value) {
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
    public static SubtypesEnum fromValue(String value) {
      for (SubtypesEnum b : SubtypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<SubtypesEnum> subtypes;

  /**
   * Gets or Sets excludedSubtypes
   */
  public enum ExcludedSubtypesEnum {
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

    ExcludedSubtypesEnum(String value) {
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
    public static ExcludedSubtypesEnum fromValue(String value) {
      for (ExcludedSubtypesEnum b : ExcludedSubtypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<ExcludedSubtypesEnum> excludedSubtypes;

  private String name;

  private Boolean caseSensitive;

  private Boolean wholeWord;

  /**
   * Gets or Sets subTypes
   */
  public enum SubTypesEnum {
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

    SubTypesEnum(String value) {
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
    public static SubTypesEnum fromValue(String value) {
      for (SubTypesEnum b : SubTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<SubTypesEnum> subTypes;

  public NodeFilter ids(List<UUID> ids) {
    this.ids = ids;
    return this;
  }

  public NodeFilter addIdsItem(UUID idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

  /**
   * Get ids
   * @return ids
  */
  @Valid 
  @Schema(name = "ids", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ids")
  public List<UUID> getIds() {
    return ids;
  }

  public void setIds(List<UUID> ids) {
    this.ids = ids;
  }

  public NodeFilter types(List<TypesEnum> types) {
    this.types = types;
    return this;
  }

  public NodeFilter addTypesItem(TypesEnum typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

  /**
   * Get types
   * @return types
  */
  
  @Schema(name = "types", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("types")
  public List<TypesEnum> getTypes() {
    return types;
  }

  public void setTypes(List<TypesEnum> types) {
    this.types = types;
  }

  public NodeFilter excludedTypes(List<ExcludedTypesEnum> excludedTypes) {
    this.excludedTypes = excludedTypes;
    return this;
  }

  public NodeFilter addExcludedTypesItem(ExcludedTypesEnum excludedTypesItem) {
    if (this.excludedTypes == null) {
      this.excludedTypes = new ArrayList<>();
    }
    this.excludedTypes.add(excludedTypesItem);
    return this;
  }

  /**
   * Get excludedTypes
   * @return excludedTypes
  */
  
  @Schema(name = "excludedTypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("excludedTypes")
  public List<ExcludedTypesEnum> getExcludedTypes() {
    return excludedTypes;
  }

  public void setExcludedTypes(List<ExcludedTypesEnum> excludedTypes) {
    this.excludedTypes = excludedTypes;
  }

  public NodeFilter subtypes(List<SubtypesEnum> subtypes) {
    this.subtypes = subtypes;
    return this;
  }

  public NodeFilter addSubtypesItem(SubtypesEnum subtypesItem) {
    if (this.subtypes == null) {
      this.subtypes = new ArrayList<>();
    }
    this.subtypes.add(subtypesItem);
    return this;
  }

  /**
   * Get subtypes
   * @return subtypes
  */
  
  @Schema(name = "subtypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subtypes")
  public List<SubtypesEnum> getSubtypes() {
    return subtypes;
  }

  public void setSubtypes(List<SubtypesEnum> subtypes) {
    this.subtypes = subtypes;
  }

  public NodeFilter excludedSubtypes(List<ExcludedSubtypesEnum> excludedSubtypes) {
    this.excludedSubtypes = excludedSubtypes;
    return this;
  }

  public NodeFilter addExcludedSubtypesItem(ExcludedSubtypesEnum excludedSubtypesItem) {
    if (this.excludedSubtypes == null) {
      this.excludedSubtypes = new ArrayList<>();
    }
    this.excludedSubtypes.add(excludedSubtypesItem);
    return this;
  }

  /**
   * Get excludedSubtypes
   * @return excludedSubtypes
  */
  
  @Schema(name = "excludedSubtypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("excludedSubtypes")
  public List<ExcludedSubtypesEnum> getExcludedSubtypes() {
    return excludedSubtypes;
  }

  public void setExcludedSubtypes(List<ExcludedSubtypesEnum> excludedSubtypes) {
    this.excludedSubtypes = excludedSubtypes;
  }

  public NodeFilter name(String name) {
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

  public NodeFilter caseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
    return this;
  }

  /**
   * Get caseSensitive
   * @return caseSensitive
  */
  
  @Schema(name = "caseSensitive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseSensitive")
  public Boolean getCaseSensitive() {
    return caseSensitive;
  }

  public void setCaseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
  }

  public NodeFilter wholeWord(Boolean wholeWord) {
    this.wholeWord = wholeWord;
    return this;
  }

  /**
   * Get wholeWord
   * @return wholeWord
  */
  
  @Schema(name = "wholeWord", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wholeWord")
  public Boolean getWholeWord() {
    return wholeWord;
  }

  public void setWholeWord(Boolean wholeWord) {
    this.wholeWord = wholeWord;
  }

  public NodeFilter subTypes(List<SubTypesEnum> subTypes) {
    this.subTypes = subTypes;
    return this;
  }

  public NodeFilter addSubTypesItem(SubTypesEnum subTypesItem) {
    if (this.subTypes == null) {
      this.subTypes = new ArrayList<>();
    }
    this.subTypes.add(subTypesItem);
    return this;
  }

  /**
   * Get subTypes
   * @return subTypes
  */
  
  @Schema(name = "subTypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subTypes")
  public List<SubTypesEnum> getSubTypes() {
    return subTypes;
  }

  public void setSubTypes(List<SubTypesEnum> subTypes) {
    this.subTypes = subTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeFilter nodeFilter = (NodeFilter) o;
    return Objects.equals(this.ids, nodeFilter.ids) &&
        Objects.equals(this.types, nodeFilter.types) &&
        Objects.equals(this.excludedTypes, nodeFilter.excludedTypes) &&
        Objects.equals(this.subtypes, nodeFilter.subtypes) &&
        Objects.equals(this.excludedSubtypes, nodeFilter.excludedSubtypes) &&
        Objects.equals(this.name, nodeFilter.name) &&
        Objects.equals(this.caseSensitive, nodeFilter.caseSensitive) &&
        Objects.equals(this.wholeWord, nodeFilter.wholeWord) &&
        Objects.equals(this.subTypes, nodeFilter.subTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, types, excludedTypes, subtypes, excludedSubtypes, name, caseSensitive, wholeWord, subTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeFilter {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    excludedTypes: ").append(toIndentedString(excludedTypes)).append("\n");
    sb.append("    subtypes: ").append(toIndentedString(subtypes)).append("\n");
    sb.append("    excludedSubtypes: ").append(toIndentedString(excludedSubtypes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
    sb.append("    wholeWord: ").append(toIndentedString(wholeWord)).append("\n");
    sb.append("    subTypes: ").append(toIndentedString(subTypes)).append("\n");
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

