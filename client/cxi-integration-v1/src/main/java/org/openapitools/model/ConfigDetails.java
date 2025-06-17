package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigProxy;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConfigDetails
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:34:47.568105362Z[Europe/Lisbon]")
public class ConfigDetails {

  private String apiKey;

  private String certificate;

  private String clientId;

  private String clientSecret;

  private ConfigProxy proxy;

  private String password;

  private Integer processingState;

  private String schemaSource;

  private String schemaVersion;

  private String tenantId;

  private String url;

  private String userName;

  private Integer cleanUpDays;

  public ConfigDetails apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * Get apiKey
   * @return apiKey
  */
  
  @Schema(name = "apiKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("apiKey")
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public ConfigDetails certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

  /**
   * Get certificate
   * @return certificate
  */
  
  @Schema(name = "certificate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("certificate")
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  public ConfigDetails clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Get clientId
   * @return clientId
  */
  
  @Schema(name = "clientId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientId")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public ConfigDetails clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * Get clientSecret
   * @return clientSecret
  */
  
  @Schema(name = "clientSecret", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientSecret")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public ConfigDetails proxy(ConfigProxy proxy) {
    this.proxy = proxy;
    return this;
  }

  /**
   * Get proxy
   * @return proxy
  */
  @Valid 
  @Schema(name = "proxy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("proxy")
  public ConfigProxy getProxy() {
    return proxy;
  }

  public void setProxy(ConfigProxy proxy) {
    this.proxy = proxy;
  }

  public ConfigDetails password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  
  @Schema(name = "password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ConfigDetails processingState(Integer processingState) {
    this.processingState = processingState;
    return this;
  }

  /**
   * Get processingState
   * @return processingState
  */
  
  @Schema(name = "processingState", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processingState")
  public Integer getProcessingState() {
    return processingState;
  }

  public void setProcessingState(Integer processingState) {
    this.processingState = processingState;
  }

  public ConfigDetails schemaSource(String schemaSource) {
    this.schemaSource = schemaSource;
    return this;
  }

  /**
   * Get schemaSource
   * @return schemaSource
  */
  
  @Schema(name = "schemaSource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schemaSource")
  public String getSchemaSource() {
    return schemaSource;
  }

  public void setSchemaSource(String schemaSource) {
    this.schemaSource = schemaSource;
  }

  public ConfigDetails schemaVersion(String schemaVersion) {
    this.schemaVersion = schemaVersion;
    return this;
  }

  /**
   * Get schemaVersion
   * @return schemaVersion
  */
  
  @Schema(name = "schemaVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schemaVersion")
  public String getSchemaVersion() {
    return schemaVersion;
  }

  public void setSchemaVersion(String schemaVersion) {
    this.schemaVersion = schemaVersion;
  }

  public ConfigDetails tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
  */
  
  @Schema(name = "tenantId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public ConfigDetails url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  
  @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ConfigDetails userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  */
  
  @Schema(name = "userName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public ConfigDetails cleanUpDays(Integer cleanUpDays) {
    this.cleanUpDays = cleanUpDays;
    return this;
  }

  /**
   * Get cleanUpDays
   * @return cleanUpDays
  */
  
  @Schema(name = "cleanUpDays", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cleanUpDays")
  public Integer getCleanUpDays() {
    return cleanUpDays;
  }

  public void setCleanUpDays(Integer cleanUpDays) {
    this.cleanUpDays = cleanUpDays;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigDetails configDetails = (ConfigDetails) o;
    return Objects.equals(this.apiKey, configDetails.apiKey) &&
        Objects.equals(this.certificate, configDetails.certificate) &&
        Objects.equals(this.clientId, configDetails.clientId) &&
        Objects.equals(this.clientSecret, configDetails.clientSecret) &&
        Objects.equals(this.proxy, configDetails.proxy) &&
        Objects.equals(this.password, configDetails.password) &&
        Objects.equals(this.processingState, configDetails.processingState) &&
        Objects.equals(this.schemaSource, configDetails.schemaSource) &&
        Objects.equals(this.schemaVersion, configDetails.schemaVersion) &&
        Objects.equals(this.tenantId, configDetails.tenantId) &&
        Objects.equals(this.url, configDetails.url) &&
        Objects.equals(this.userName, configDetails.userName) &&
        Objects.equals(this.cleanUpDays, configDetails.cleanUpDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, certificate, clientId, clientSecret, proxy, password, processingState, schemaSource, schemaVersion, tenantId, url, userName, cleanUpDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigDetails {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    processingState: ").append(toIndentedString(processingState)).append("\n");
    sb.append("    schemaSource: ").append(toIndentedString(schemaSource)).append("\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    cleanUpDays: ").append(toIndentedString(cleanUpDays)).append("\n");
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

