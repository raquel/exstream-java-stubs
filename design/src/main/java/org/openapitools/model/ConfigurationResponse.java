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
 * ConfigurationResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class ConfigurationResponse {

  private String exstreamOnDemandUrl;

  private String exstreamOTDSUrl;

  private String exstreamDasUrl;

  private String exstreamOrcUrl;

  private String exstreamOrchestratorUrl;

  private String exstreamRationalizationUrl;

  private String exstreamEIUrl;

  private String exstreamEEPUrl;

  private String exstreamEmpowerUrl;

  private String deployType;

  private String ot2;

  private String solrEnabled;

  private Boolean vaultEnabled;

  private String accessTokenLifetimeSeconds;

  public ConfigurationResponse exstreamOnDemandUrl(String exstreamOnDemandUrl) {
    this.exstreamOnDemandUrl = exstreamOnDemandUrl;
    return this;
  }

  /**
   * Get exstreamOnDemandUrl
   * @return exstreamOnDemandUrl
  */
  
  @Schema(name = "exstreamOnDemandUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exstreamOnDemandUrl")
  public String getExstreamOnDemandUrl() {
    return exstreamOnDemandUrl;
  }

  public void setExstreamOnDemandUrl(String exstreamOnDemandUrl) {
    this.exstreamOnDemandUrl = exstreamOnDemandUrl;
  }

  public ConfigurationResponse exstreamOTDSUrl(String exstreamOTDSUrl) {
    this.exstreamOTDSUrl = exstreamOTDSUrl;
    return this;
  }

  /**
   * Get exstreamOTDSUrl
   * @return exstreamOTDSUrl
  */
  
  @Schema(name = "exstreamOTDSUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exstreamOTDSUrl")
  public String getExstreamOTDSUrl() {
    return exstreamOTDSUrl;
  }

  public void setExstreamOTDSUrl(String exstreamOTDSUrl) {
    this.exstreamOTDSUrl = exstreamOTDSUrl;
  }

  public ConfigurationResponse exstreamDasUrl(String exstreamDasUrl) {
    this.exstreamDasUrl = exstreamDasUrl;
    return this;
  }

  /**
   * Get exstreamDasUrl
   * @return exstreamDasUrl
  */
  
  @Schema(name = "exstreamDasUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exstreamDasUrl")
  public String getExstreamDasUrl() {
    return exstreamDasUrl;
  }

  public void setExstreamDasUrl(String exstreamDasUrl) {
    this.exstreamDasUrl = exstreamDasUrl;
  }

  public ConfigurationResponse exstreamOrcUrl(String exstreamOrcUrl) {
    this.exstreamOrcUrl = exstreamOrcUrl;
    return this;
  }

  /**
   * Get exstreamOrcUrl
   * @return exstreamOrcUrl
  */
  
  @Schema(name = "exstreamOrcUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exstreamOrcUrl")
  public String getExstreamOrcUrl() {
    return exstreamOrcUrl;
  }

  public void setExstreamOrcUrl(String exstreamOrcUrl) {
    this.exstreamOrcUrl = exstreamOrcUrl;
  }

  public ConfigurationResponse exstreamOrchestratorUrl(String exstreamOrchestratorUrl) {
    this.exstreamOrchestratorUrl = exstreamOrchestratorUrl;
    return this;
  }

  /**
   * Get exstreamOrchestratorUrl
   * @return exstreamOrchestratorUrl
  */
  
  @Schema(name = "exstreamOrchestratorUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exstreamOrchestratorUrl")
  public String getExstreamOrchestratorUrl() {
    return exstreamOrchestratorUrl;
  }

  public void setExstreamOrchestratorUrl(String exstreamOrchestratorUrl) {
    this.exstreamOrchestratorUrl = exstreamOrchestratorUrl;
  }

  public ConfigurationResponse exstreamRationalizationUrl(String exstreamRationalizationUrl) {
    this.exstreamRationalizationUrl = exstreamRationalizationUrl;
    return this;
  }

  /**
   * Get exstreamRationalizationUrl
   * @return exstreamRationalizationUrl
  */
  
  @Schema(name = "exstreamRationalizationUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exstreamRationalizationUrl")
  public String getExstreamRationalizationUrl() {
    return exstreamRationalizationUrl;
  }

  public void setExstreamRationalizationUrl(String exstreamRationalizationUrl) {
    this.exstreamRationalizationUrl = exstreamRationalizationUrl;
  }

  public ConfigurationResponse exstreamEIUrl(String exstreamEIUrl) {
    this.exstreamEIUrl = exstreamEIUrl;
    return this;
  }

  /**
   * Get exstreamEIUrl
   * @return exstreamEIUrl
  */
  
  @Schema(name = "exstreamEIUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exstreamEIUrl")
  public String getExstreamEIUrl() {
    return exstreamEIUrl;
  }

  public void setExstreamEIUrl(String exstreamEIUrl) {
    this.exstreamEIUrl = exstreamEIUrl;
  }

  public ConfigurationResponse exstreamEEPUrl(String exstreamEEPUrl) {
    this.exstreamEEPUrl = exstreamEEPUrl;
    return this;
  }

  /**
   * Get exstreamEEPUrl
   * @return exstreamEEPUrl
  */
  
  @Schema(name = "exstreamEEPUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exstreamEEPUrl")
  public String getExstreamEEPUrl() {
    return exstreamEEPUrl;
  }

  public void setExstreamEEPUrl(String exstreamEEPUrl) {
    this.exstreamEEPUrl = exstreamEEPUrl;
  }

  public ConfigurationResponse exstreamEmpowerUrl(String exstreamEmpowerUrl) {
    this.exstreamEmpowerUrl = exstreamEmpowerUrl;
    return this;
  }

  /**
   * Get exstreamEmpowerUrl
   * @return exstreamEmpowerUrl
  */
  
  @Schema(name = "exstreamEmpowerUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exstreamEmpowerUrl")
  public String getExstreamEmpowerUrl() {
    return exstreamEmpowerUrl;
  }

  public void setExstreamEmpowerUrl(String exstreamEmpowerUrl) {
    this.exstreamEmpowerUrl = exstreamEmpowerUrl;
  }

  public ConfigurationResponse deployType(String deployType) {
    this.deployType = deployType;
    return this;
  }

  /**
   * Get deployType
   * @return deployType
  */
  
  @Schema(name = "deployType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deployType")
  public String getDeployType() {
    return deployType;
  }

  public void setDeployType(String deployType) {
    this.deployType = deployType;
  }

  public ConfigurationResponse ot2(String ot2) {
    this.ot2 = ot2;
    return this;
  }

  /**
   * Get ot2
   * @return ot2
  */
  
  @Schema(name = "ot2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ot2")
  public String getOt2() {
    return ot2;
  }

  public void setOt2(String ot2) {
    this.ot2 = ot2;
  }

  public ConfigurationResponse solrEnabled(String solrEnabled) {
    this.solrEnabled = solrEnabled;
    return this;
  }

  /**
   * Get solrEnabled
   * @return solrEnabled
  */
  
  @Schema(name = "solrEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("solrEnabled")
  public String getSolrEnabled() {
    return solrEnabled;
  }

  public void setSolrEnabled(String solrEnabled) {
    this.solrEnabled = solrEnabled;
  }

  public ConfigurationResponse vaultEnabled(Boolean vaultEnabled) {
    this.vaultEnabled = vaultEnabled;
    return this;
  }

  /**
   * Get vaultEnabled
   * @return vaultEnabled
  */
  
  @Schema(name = "vaultEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vaultEnabled")
  public Boolean getVaultEnabled() {
    return vaultEnabled;
  }

  public void setVaultEnabled(Boolean vaultEnabled) {
    this.vaultEnabled = vaultEnabled;
  }

  public ConfigurationResponse accessTokenLifetimeSeconds(String accessTokenLifetimeSeconds) {
    this.accessTokenLifetimeSeconds = accessTokenLifetimeSeconds;
    return this;
  }

  /**
   * Get accessTokenLifetimeSeconds
   * @return accessTokenLifetimeSeconds
  */
  
  @Schema(name = "accessTokenLifetimeSeconds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accessTokenLifetimeSeconds")
  public String getAccessTokenLifetimeSeconds() {
    return accessTokenLifetimeSeconds;
  }

  public void setAccessTokenLifetimeSeconds(String accessTokenLifetimeSeconds) {
    this.accessTokenLifetimeSeconds = accessTokenLifetimeSeconds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationResponse configurationResponse = (ConfigurationResponse) o;
    return Objects.equals(this.exstreamOnDemandUrl, configurationResponse.exstreamOnDemandUrl) &&
        Objects.equals(this.exstreamOTDSUrl, configurationResponse.exstreamOTDSUrl) &&
        Objects.equals(this.exstreamDasUrl, configurationResponse.exstreamDasUrl) &&
        Objects.equals(this.exstreamOrcUrl, configurationResponse.exstreamOrcUrl) &&
        Objects.equals(this.exstreamOrchestratorUrl, configurationResponse.exstreamOrchestratorUrl) &&
        Objects.equals(this.exstreamRationalizationUrl, configurationResponse.exstreamRationalizationUrl) &&
        Objects.equals(this.exstreamEIUrl, configurationResponse.exstreamEIUrl) &&
        Objects.equals(this.exstreamEEPUrl, configurationResponse.exstreamEEPUrl) &&
        Objects.equals(this.exstreamEmpowerUrl, configurationResponse.exstreamEmpowerUrl) &&
        Objects.equals(this.deployType, configurationResponse.deployType) &&
        Objects.equals(this.ot2, configurationResponse.ot2) &&
        Objects.equals(this.solrEnabled, configurationResponse.solrEnabled) &&
        Objects.equals(this.vaultEnabled, configurationResponse.vaultEnabled) &&
        Objects.equals(this.accessTokenLifetimeSeconds, configurationResponse.accessTokenLifetimeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exstreamOnDemandUrl, exstreamOTDSUrl, exstreamDasUrl, exstreamOrcUrl, exstreamOrchestratorUrl, exstreamRationalizationUrl, exstreamEIUrl, exstreamEEPUrl, exstreamEmpowerUrl, deployType, ot2, solrEnabled, vaultEnabled, accessTokenLifetimeSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationResponse {\n");
    sb.append("    exstreamOnDemandUrl: ").append(toIndentedString(exstreamOnDemandUrl)).append("\n");
    sb.append("    exstreamOTDSUrl: ").append(toIndentedString(exstreamOTDSUrl)).append("\n");
    sb.append("    exstreamDasUrl: ").append(toIndentedString(exstreamDasUrl)).append("\n");
    sb.append("    exstreamOrcUrl: ").append(toIndentedString(exstreamOrcUrl)).append("\n");
    sb.append("    exstreamOrchestratorUrl: ").append(toIndentedString(exstreamOrchestratorUrl)).append("\n");
    sb.append("    exstreamRationalizationUrl: ").append(toIndentedString(exstreamRationalizationUrl)).append("\n");
    sb.append("    exstreamEIUrl: ").append(toIndentedString(exstreamEIUrl)).append("\n");
    sb.append("    exstreamEEPUrl: ").append(toIndentedString(exstreamEEPUrl)).append("\n");
    sb.append("    exstreamEmpowerUrl: ").append(toIndentedString(exstreamEmpowerUrl)).append("\n");
    sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
    sb.append("    ot2: ").append(toIndentedString(ot2)).append("\n");
    sb.append("    solrEnabled: ").append(toIndentedString(solrEnabled)).append("\n");
    sb.append("    vaultEnabled: ").append(toIndentedString(vaultEnabled)).append("\n");
    sb.append("    accessTokenLifetimeSeconds: ").append(toIndentedString(accessTokenLifetimeSeconds)).append("\n");
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

