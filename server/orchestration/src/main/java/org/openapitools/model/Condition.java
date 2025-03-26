package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Condition
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:03:17.210646522Z[Europe/Lisbon]")
public class Condition {

  /**
   * Gets or Sets operator
   */
  public enum OperatorEnum {
    EQ("EQ"),
    
    NEQ("NEQ"),
    
    LT("LT"),
    
    LTE("LTE"),
    
    GT("GT"),
    
    GTE("GTE"),
    
    IN("IN"),
    
    NIN("NIN"),
    
    NL("NL"),
    
    NN("NN");

    private String value;

    OperatorEnum(String value) {
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
    public static OperatorEnum fromValue(String value) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OperatorEnum operator;

  /**
   * Gets or Sets datatype
   */
  public enum DatatypeEnum {
    STRING("string"),
    
    NUMERIC("numeric");

    private String value;

    DatatypeEnum(String value) {
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
    public static DatatypeEnum fromValue(String value) {
      for (DatatypeEnum b : DatatypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DatatypeEnum datatype;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    OUTCOME("outcome"),
    
    VARIABLE("variable");

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

  private String name;

  private String value;

  @Valid
  private List<String> values;

  public Condition operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Get operator
   * @return operator
  */
  
  @Schema(name = "operator", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  public Condition datatype(DatatypeEnum datatype) {
    this.datatype = datatype;
    return this;
  }

  /**
   * Get datatype
   * @return datatype
  */
  
  @Schema(name = "datatype", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("datatype")
  public DatatypeEnum getDatatype() {
    return datatype;
  }

  public void setDatatype(DatatypeEnum datatype) {
    this.datatype = datatype;
  }

  public Condition type(TypeEnum type) {
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

  public Condition name(String name) {
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

  public Condition value(String value) {
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

  public Condition values(List<String> values) {
    this.values = values;
    return this;
  }

  public Condition addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  
  @Schema(name = "values", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("values")
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
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
    Condition condition = (Condition) o;
    return Objects.equals(this.operator, condition.operator) &&
        Objects.equals(this.datatype, condition.datatype) &&
        Objects.equals(this.type, condition.type) &&
        Objects.equals(this.name, condition.name) &&
        Objects.equals(this.value, condition.value) &&
        Objects.equals(this.values, condition.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, datatype, type, name, value, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Condition {\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    datatype: ").append(toIndentedString(datatype)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

