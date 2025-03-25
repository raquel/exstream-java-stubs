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
 * PublicOrcConfiguration
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:33:52.003808146Z[Europe/Lisbon]")
public class PublicOrcConfiguration {

  private Boolean assuredDeliveryEnabled;

  private Boolean flowScriptDebuggingEnabled;

  private Boolean baseSubscription;

  private Boolean subscriptionEnabled;

  public PublicOrcConfiguration assuredDeliveryEnabled(Boolean assuredDeliveryEnabled) {
    this.assuredDeliveryEnabled = assuredDeliveryEnabled;
    return this;
  }

  /**
   * Get assuredDeliveryEnabled
   * @return assuredDeliveryEnabled
  */
  
  @Schema(name = "assuredDeliveryEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assuredDeliveryEnabled")
  public Boolean getAssuredDeliveryEnabled() {
    return assuredDeliveryEnabled;
  }

  public void setAssuredDeliveryEnabled(Boolean assuredDeliveryEnabled) {
    this.assuredDeliveryEnabled = assuredDeliveryEnabled;
  }

  public PublicOrcConfiguration flowScriptDebuggingEnabled(Boolean flowScriptDebuggingEnabled) {
    this.flowScriptDebuggingEnabled = flowScriptDebuggingEnabled;
    return this;
  }

  /**
   * Get flowScriptDebuggingEnabled
   * @return flowScriptDebuggingEnabled
  */
  
  @Schema(name = "flowScriptDebuggingEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowScriptDebuggingEnabled")
  public Boolean getFlowScriptDebuggingEnabled() {
    return flowScriptDebuggingEnabled;
  }

  public void setFlowScriptDebuggingEnabled(Boolean flowScriptDebuggingEnabled) {
    this.flowScriptDebuggingEnabled = flowScriptDebuggingEnabled;
  }

  public PublicOrcConfiguration baseSubscription(Boolean baseSubscription) {
    this.baseSubscription = baseSubscription;
    return this;
  }

  /**
   * Get baseSubscription
   * @return baseSubscription
  */
  
  @Schema(name = "baseSubscription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("baseSubscription")
  public Boolean getBaseSubscription() {
    return baseSubscription;
  }

  public void setBaseSubscription(Boolean baseSubscription) {
    this.baseSubscription = baseSubscription;
  }

  public PublicOrcConfiguration subscriptionEnabled(Boolean subscriptionEnabled) {
    this.subscriptionEnabled = subscriptionEnabled;
    return this;
  }

  /**
   * Get subscriptionEnabled
   * @return subscriptionEnabled
  */
  
  @Schema(name = "subscriptionEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscriptionEnabled")
  public Boolean getSubscriptionEnabled() {
    return subscriptionEnabled;
  }

  public void setSubscriptionEnabled(Boolean subscriptionEnabled) {
    this.subscriptionEnabled = subscriptionEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicOrcConfiguration publicOrcConfiguration = (PublicOrcConfiguration) o;
    return Objects.equals(this.assuredDeliveryEnabled, publicOrcConfiguration.assuredDeliveryEnabled) &&
        Objects.equals(this.flowScriptDebuggingEnabled, publicOrcConfiguration.flowScriptDebuggingEnabled) &&
        Objects.equals(this.baseSubscription, publicOrcConfiguration.baseSubscription) &&
        Objects.equals(this.subscriptionEnabled, publicOrcConfiguration.subscriptionEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assuredDeliveryEnabled, flowScriptDebuggingEnabled, baseSubscription, subscriptionEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicOrcConfiguration {\n");
    sb.append("    assuredDeliveryEnabled: ").append(toIndentedString(assuredDeliveryEnabled)).append("\n");
    sb.append("    flowScriptDebuggingEnabled: ").append(toIndentedString(flowScriptDebuggingEnabled)).append("\n");
    sb.append("    baseSubscription: ").append(toIndentedString(baseSubscription)).append("\n");
    sb.append("    subscriptionEnabled: ").append(toIndentedString(subscriptionEnabled)).append("\n");
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

