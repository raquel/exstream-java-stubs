package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.openapitools.model.PropertyValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PropertyValue
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:33:52.003808146Z[Europe/Lisbon]")
public class PropertyValue {

  private String value;

  private String secretId;

  @Valid
  private Set<Map<String, PropertyValue>> values;

  public PropertyValue value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  
  @Schema(name = "value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public PropertyValue secretId(String secretId) {
    this.secretId = secretId;
    return this;
  }

  /**
   * Get secretId
   * @return secretId
  */
  
  @Schema(name = "secretId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secretId")
  public String getSecretId() {
    return secretId;
  }

  public void setSecretId(String secretId) {
    this.secretId = secretId;
  }

  public PropertyValue values(Set<Map<String, PropertyValue>> values) {
    this.values = values;
    return this;
  }

  public PropertyValue addValuesItem(Map<String, PropertyValue> valuesItem) {
    if (this.values == null) {
      this.values = new LinkedHashSet<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @Valid 
  @Schema(name = "values", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("values")
  public Set<Map<String, PropertyValue>> getValues() {
    return values;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setValues(Set<Map<String, PropertyValue>> values) {
    this.values = values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyValue propertyValue = (PropertyValue) o;
    return Objects.equals(this.value, propertyValue.value) &&
        Objects.equals(this.secretId, propertyValue.secretId) &&
        Objects.equals(this.values, propertyValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, secretId, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyValue {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    secretId: ").append(toIndentedString(secretId)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

