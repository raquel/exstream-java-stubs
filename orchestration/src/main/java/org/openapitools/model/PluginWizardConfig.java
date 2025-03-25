package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PluginWizardStep;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PluginWizardConfig
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:33:52.003808146Z[Europe/Lisbon]")
public class PluginWizardConfig {

  private Boolean outcomeMappingSupported;

  private Boolean assuredDeliverySupported;

  private Boolean outcomeMappingRequired;

  private Boolean analyticsSupported;

  private Boolean additionalFilesInputHandlingSupported;

  private Boolean additionalFilesInputHandlingOnly;

  private Boolean restrictedUseDefault;

  private Object validators;

  @Valid
  private List<String> secureChannelHostVerificationRequired;

  private Boolean authenticationProvided;

  private Boolean jobExpirationSupported;

  @Valid
  private List<@Valid PluginWizardStep> steps;

  public PluginWizardConfig outcomeMappingSupported(Boolean outcomeMappingSupported) {
    this.outcomeMappingSupported = outcomeMappingSupported;
    return this;
  }

  /**
   * Get outcomeMappingSupported
   * @return outcomeMappingSupported
  */
  
  @Schema(name = "outcomeMappingSupported", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("outcomeMappingSupported")
  public Boolean getOutcomeMappingSupported() {
    return outcomeMappingSupported;
  }

  public void setOutcomeMappingSupported(Boolean outcomeMappingSupported) {
    this.outcomeMappingSupported = outcomeMappingSupported;
  }

  public PluginWizardConfig assuredDeliverySupported(Boolean assuredDeliverySupported) {
    this.assuredDeliverySupported = assuredDeliverySupported;
    return this;
  }

  /**
   * Get assuredDeliverySupported
   * @return assuredDeliverySupported
  */
  
  @Schema(name = "assuredDeliverySupported", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assuredDeliverySupported")
  public Boolean getAssuredDeliverySupported() {
    return assuredDeliverySupported;
  }

  public void setAssuredDeliverySupported(Boolean assuredDeliverySupported) {
    this.assuredDeliverySupported = assuredDeliverySupported;
  }

  public PluginWizardConfig outcomeMappingRequired(Boolean outcomeMappingRequired) {
    this.outcomeMappingRequired = outcomeMappingRequired;
    return this;
  }

  /**
   * Get outcomeMappingRequired
   * @return outcomeMappingRequired
  */
  
  @Schema(name = "outcomeMappingRequired", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("outcomeMappingRequired")
  public Boolean getOutcomeMappingRequired() {
    return outcomeMappingRequired;
  }

  public void setOutcomeMappingRequired(Boolean outcomeMappingRequired) {
    this.outcomeMappingRequired = outcomeMappingRequired;
  }

  public PluginWizardConfig analyticsSupported(Boolean analyticsSupported) {
    this.analyticsSupported = analyticsSupported;
    return this;
  }

  /**
   * Get analyticsSupported
   * @return analyticsSupported
  */
  
  @Schema(name = "analyticsSupported", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("analyticsSupported")
  public Boolean getAnalyticsSupported() {
    return analyticsSupported;
  }

  public void setAnalyticsSupported(Boolean analyticsSupported) {
    this.analyticsSupported = analyticsSupported;
  }

  public PluginWizardConfig additionalFilesInputHandlingSupported(Boolean additionalFilesInputHandlingSupported) {
    this.additionalFilesInputHandlingSupported = additionalFilesInputHandlingSupported;
    return this;
  }

  /**
   * Get additionalFilesInputHandlingSupported
   * @return additionalFilesInputHandlingSupported
  */
  
  @Schema(name = "additionalFilesInputHandlingSupported", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additionalFilesInputHandlingSupported")
  public Boolean getAdditionalFilesInputHandlingSupported() {
    return additionalFilesInputHandlingSupported;
  }

  public void setAdditionalFilesInputHandlingSupported(Boolean additionalFilesInputHandlingSupported) {
    this.additionalFilesInputHandlingSupported = additionalFilesInputHandlingSupported;
  }

  public PluginWizardConfig additionalFilesInputHandlingOnly(Boolean additionalFilesInputHandlingOnly) {
    this.additionalFilesInputHandlingOnly = additionalFilesInputHandlingOnly;
    return this;
  }

  /**
   * Get additionalFilesInputHandlingOnly
   * @return additionalFilesInputHandlingOnly
  */
  
  @Schema(name = "additionalFilesInputHandlingOnly", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additionalFilesInputHandlingOnly")
  public Boolean getAdditionalFilesInputHandlingOnly() {
    return additionalFilesInputHandlingOnly;
  }

  public void setAdditionalFilesInputHandlingOnly(Boolean additionalFilesInputHandlingOnly) {
    this.additionalFilesInputHandlingOnly = additionalFilesInputHandlingOnly;
  }

  public PluginWizardConfig restrictedUseDefault(Boolean restrictedUseDefault) {
    this.restrictedUseDefault = restrictedUseDefault;
    return this;
  }

  /**
   * Get restrictedUseDefault
   * @return restrictedUseDefault
  */
  
  @Schema(name = "restrictedUseDefault", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("restrictedUseDefault")
  public Boolean getRestrictedUseDefault() {
    return restrictedUseDefault;
  }

  public void setRestrictedUseDefault(Boolean restrictedUseDefault) {
    this.restrictedUseDefault = restrictedUseDefault;
  }

  public PluginWizardConfig validators(Object validators) {
    this.validators = validators;
    return this;
  }

  /**
   * Get validators
   * @return validators
  */
  
  @Schema(name = "validators", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validators")
  public Object getValidators() {
    return validators;
  }

  public void setValidators(Object validators) {
    this.validators = validators;
  }

  public PluginWizardConfig secureChannelHostVerificationRequired(List<String> secureChannelHostVerificationRequired) {
    this.secureChannelHostVerificationRequired = secureChannelHostVerificationRequired;
    return this;
  }

  public PluginWizardConfig addSecureChannelHostVerificationRequiredItem(String secureChannelHostVerificationRequiredItem) {
    if (this.secureChannelHostVerificationRequired == null) {
      this.secureChannelHostVerificationRequired = new ArrayList<>();
    }
    this.secureChannelHostVerificationRequired.add(secureChannelHostVerificationRequiredItem);
    return this;
  }

  /**
   * Get secureChannelHostVerificationRequired
   * @return secureChannelHostVerificationRequired
  */
  
  @Schema(name = "secureChannelHostVerificationRequired", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secureChannelHostVerificationRequired")
  public List<String> getSecureChannelHostVerificationRequired() {
    return secureChannelHostVerificationRequired;
  }

  public void setSecureChannelHostVerificationRequired(List<String> secureChannelHostVerificationRequired) {
    this.secureChannelHostVerificationRequired = secureChannelHostVerificationRequired;
  }

  public PluginWizardConfig authenticationProvided(Boolean authenticationProvided) {
    this.authenticationProvided = authenticationProvided;
    return this;
  }

  /**
   * Get authenticationProvided
   * @return authenticationProvided
  */
  
  @Schema(name = "authenticationProvided", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authenticationProvided")
  public Boolean getAuthenticationProvided() {
    return authenticationProvided;
  }

  public void setAuthenticationProvided(Boolean authenticationProvided) {
    this.authenticationProvided = authenticationProvided;
  }

  public PluginWizardConfig jobExpirationSupported(Boolean jobExpirationSupported) {
    this.jobExpirationSupported = jobExpirationSupported;
    return this;
  }

  /**
   * Get jobExpirationSupported
   * @return jobExpirationSupported
  */
  
  @Schema(name = "jobExpirationSupported", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobExpirationSupported")
  public Boolean getJobExpirationSupported() {
    return jobExpirationSupported;
  }

  public void setJobExpirationSupported(Boolean jobExpirationSupported) {
    this.jobExpirationSupported = jobExpirationSupported;
  }

  public PluginWizardConfig steps(List<@Valid PluginWizardStep> steps) {
    this.steps = steps;
    return this;
  }

  public PluginWizardConfig addStepsItem(PluginWizardStep stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

  /**
   * Get steps
   * @return steps
  */
  @Valid 
  @Schema(name = "steps", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("steps")
  public List<@Valid PluginWizardStep> getSteps() {
    return steps;
  }

  public void setSteps(List<@Valid PluginWizardStep> steps) {
    this.steps = steps;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginWizardConfig pluginWizardConfig = (PluginWizardConfig) o;
    return Objects.equals(this.outcomeMappingSupported, pluginWizardConfig.outcomeMappingSupported) &&
        Objects.equals(this.assuredDeliverySupported, pluginWizardConfig.assuredDeliverySupported) &&
        Objects.equals(this.outcomeMappingRequired, pluginWizardConfig.outcomeMappingRequired) &&
        Objects.equals(this.analyticsSupported, pluginWizardConfig.analyticsSupported) &&
        Objects.equals(this.additionalFilesInputHandlingSupported, pluginWizardConfig.additionalFilesInputHandlingSupported) &&
        Objects.equals(this.additionalFilesInputHandlingOnly, pluginWizardConfig.additionalFilesInputHandlingOnly) &&
        Objects.equals(this.restrictedUseDefault, pluginWizardConfig.restrictedUseDefault) &&
        Objects.equals(this.validators, pluginWizardConfig.validators) &&
        Objects.equals(this.secureChannelHostVerificationRequired, pluginWizardConfig.secureChannelHostVerificationRequired) &&
        Objects.equals(this.authenticationProvided, pluginWizardConfig.authenticationProvided) &&
        Objects.equals(this.jobExpirationSupported, pluginWizardConfig.jobExpirationSupported) &&
        Objects.equals(this.steps, pluginWizardConfig.steps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcomeMappingSupported, assuredDeliverySupported, outcomeMappingRequired, analyticsSupported, additionalFilesInputHandlingSupported, additionalFilesInputHandlingOnly, restrictedUseDefault, validators, secureChannelHostVerificationRequired, authenticationProvided, jobExpirationSupported, steps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginWizardConfig {\n");
    sb.append("    outcomeMappingSupported: ").append(toIndentedString(outcomeMappingSupported)).append("\n");
    sb.append("    assuredDeliverySupported: ").append(toIndentedString(assuredDeliverySupported)).append("\n");
    sb.append("    outcomeMappingRequired: ").append(toIndentedString(outcomeMappingRequired)).append("\n");
    sb.append("    analyticsSupported: ").append(toIndentedString(analyticsSupported)).append("\n");
    sb.append("    additionalFilesInputHandlingSupported: ").append(toIndentedString(additionalFilesInputHandlingSupported)).append("\n");
    sb.append("    additionalFilesInputHandlingOnly: ").append(toIndentedString(additionalFilesInputHandlingOnly)).append("\n");
    sb.append("    restrictedUseDefault: ").append(toIndentedString(restrictedUseDefault)).append("\n");
    sb.append("    validators: ").append(toIndentedString(validators)).append("\n");
    sb.append("    secureChannelHostVerificationRequired: ").append(toIndentedString(secureChannelHostVerificationRequired)).append("\n");
    sb.append("    authenticationProvided: ").append(toIndentedString(authenticationProvided)).append("\n");
    sb.append("    jobExpirationSupported: ").append(toIndentedString(jobExpirationSupported)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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

