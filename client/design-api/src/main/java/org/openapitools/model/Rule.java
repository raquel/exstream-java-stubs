package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Rule
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T17:54:43.132703260Z[Europe/Lisbon]")
public class Rule {

  private Integer mRefUsageRule;

  private Object rule;

  public Rule mRefUsageRule(Integer mRefUsageRule) {
    this.mRefUsageRule = mRefUsageRule;
    return this;
  }

  /**
   * Get mRefUsageRule
   * @return mRefUsageRule
  */
  
  @Schema(name = "m_refUsageRule", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("m_refUsageRule")
  public Integer getmRefUsageRule() {
    return mRefUsageRule;
  }

  public void setmRefUsageRule(Integer mRefUsageRule) {
    this.mRefUsageRule = mRefUsageRule;
  }

  public Rule rule(Object rule) {
    this.rule = rule;
    return this;
  }

  /**
   * Get rule
   * @return rule
  */
  
  @Schema(name = "rule", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rule")
  public Object getRule() {
    return rule;
  }

  public void setRule(Object rule) {
    this.rule = rule;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rule rule = (Rule) o;
    return Objects.equals(this.mRefUsageRule, rule.mRefUsageRule) &&
        Objects.equals(this.rule, rule.rule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mRefUsageRule, rule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rule {\n");
    sb.append("    mRefUsageRule: ").append(toIndentedString(mRefUsageRule)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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

