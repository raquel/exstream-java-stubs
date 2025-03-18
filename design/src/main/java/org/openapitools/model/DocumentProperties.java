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
 * DocumentProperties
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class DocumentProperties {

  private Long restartPageCount;

  private Long restartDocumentCount;

  private String frameFillMethod;

  private Long limitPages;

  private String duplexMode;

  private String backPageType;

  private String documentNumberType;

  private String pageNumberType;

  private String paragraphInclusionMethodType;

  private String variableParagraphInclusionOid;

  public DocumentProperties restartPageCount(Long restartPageCount) {
    this.restartPageCount = restartPageCount;
    return this;
  }

  /**
   * Get restartPageCount
   * @return restartPageCount
  */
  
  @Schema(name = "restartPageCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("restartPageCount")
  public Long getRestartPageCount() {
    return restartPageCount;
  }

  public void setRestartPageCount(Long restartPageCount) {
    this.restartPageCount = restartPageCount;
  }

  public DocumentProperties restartDocumentCount(Long restartDocumentCount) {
    this.restartDocumentCount = restartDocumentCount;
    return this;
  }

  /**
   * Get restartDocumentCount
   * @return restartDocumentCount
  */
  
  @Schema(name = "restartDocumentCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("restartDocumentCount")
  public Long getRestartDocumentCount() {
    return restartDocumentCount;
  }

  public void setRestartDocumentCount(Long restartDocumentCount) {
    this.restartDocumentCount = restartDocumentCount;
  }

  public DocumentProperties frameFillMethod(String frameFillMethod) {
    this.frameFillMethod = frameFillMethod;
    return this;
  }

  /**
   * Get frameFillMethod
   * @return frameFillMethod
  */
  
  @Schema(name = "frameFillMethod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("frameFillMethod")
  public String getFrameFillMethod() {
    return frameFillMethod;
  }

  public void setFrameFillMethod(String frameFillMethod) {
    this.frameFillMethod = frameFillMethod;
  }

  public DocumentProperties limitPages(Long limitPages) {
    this.limitPages = limitPages;
    return this;
  }

  /**
   * Get limitPages
   * @return limitPages
  */
  
  @Schema(name = "limitPages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limitPages")
  public Long getLimitPages() {
    return limitPages;
  }

  public void setLimitPages(Long limitPages) {
    this.limitPages = limitPages;
  }

  public DocumentProperties duplexMode(String duplexMode) {
    this.duplexMode = duplexMode;
    return this;
  }

  /**
   * Get duplexMode
   * @return duplexMode
  */
  
  @Schema(name = "duplexMode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("duplexMode")
  public String getDuplexMode() {
    return duplexMode;
  }

  public void setDuplexMode(String duplexMode) {
    this.duplexMode = duplexMode;
  }

  public DocumentProperties backPageType(String backPageType) {
    this.backPageType = backPageType;
    return this;
  }

  /**
   * Get backPageType
   * @return backPageType
  */
  
  @Schema(name = "backPageType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("backPageType")
  public String getBackPageType() {
    return backPageType;
  }

  public void setBackPageType(String backPageType) {
    this.backPageType = backPageType;
  }

  public DocumentProperties documentNumberType(String documentNumberType) {
    this.documentNumberType = documentNumberType;
    return this;
  }

  /**
   * Get documentNumberType
   * @return documentNumberType
  */
  
  @Schema(name = "documentNumberType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("documentNumberType")
  public String getDocumentNumberType() {
    return documentNumberType;
  }

  public void setDocumentNumberType(String documentNumberType) {
    this.documentNumberType = documentNumberType;
  }

  public DocumentProperties pageNumberType(String pageNumberType) {
    this.pageNumberType = pageNumberType;
    return this;
  }

  /**
   * Get pageNumberType
   * @return pageNumberType
  */
  
  @Schema(name = "pageNumberType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pageNumberType")
  public String getPageNumberType() {
    return pageNumberType;
  }

  public void setPageNumberType(String pageNumberType) {
    this.pageNumberType = pageNumberType;
  }

  public DocumentProperties paragraphInclusionMethodType(String paragraphInclusionMethodType) {
    this.paragraphInclusionMethodType = paragraphInclusionMethodType;
    return this;
  }

  /**
   * Get paragraphInclusionMethodType
   * @return paragraphInclusionMethodType
  */
  
  @Schema(name = "paragraphInclusionMethodType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paragraphInclusionMethodType")
  public String getParagraphInclusionMethodType() {
    return paragraphInclusionMethodType;
  }

  public void setParagraphInclusionMethodType(String paragraphInclusionMethodType) {
    this.paragraphInclusionMethodType = paragraphInclusionMethodType;
  }

  public DocumentProperties variableParagraphInclusionOid(String variableParagraphInclusionOid) {
    this.variableParagraphInclusionOid = variableParagraphInclusionOid;
    return this;
  }

  /**
   * Get variableParagraphInclusionOid
   * @return variableParagraphInclusionOid
  */
  
  @Schema(name = "variableParagraphInclusionOid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variableParagraphInclusionOid")
  public String getVariableParagraphInclusionOid() {
    return variableParagraphInclusionOid;
  }

  public void setVariableParagraphInclusionOid(String variableParagraphInclusionOid) {
    this.variableParagraphInclusionOid = variableParagraphInclusionOid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentProperties documentProperties = (DocumentProperties) o;
    return Objects.equals(this.restartPageCount, documentProperties.restartPageCount) &&
        Objects.equals(this.restartDocumentCount, documentProperties.restartDocumentCount) &&
        Objects.equals(this.frameFillMethod, documentProperties.frameFillMethod) &&
        Objects.equals(this.limitPages, documentProperties.limitPages) &&
        Objects.equals(this.duplexMode, documentProperties.duplexMode) &&
        Objects.equals(this.backPageType, documentProperties.backPageType) &&
        Objects.equals(this.documentNumberType, documentProperties.documentNumberType) &&
        Objects.equals(this.pageNumberType, documentProperties.pageNumberType) &&
        Objects.equals(this.paragraphInclusionMethodType, documentProperties.paragraphInclusionMethodType) &&
        Objects.equals(this.variableParagraphInclusionOid, documentProperties.variableParagraphInclusionOid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restartPageCount, restartDocumentCount, frameFillMethod, limitPages, duplexMode, backPageType, documentNumberType, pageNumberType, paragraphInclusionMethodType, variableParagraphInclusionOid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentProperties {\n");
    sb.append("    restartPageCount: ").append(toIndentedString(restartPageCount)).append("\n");
    sb.append("    restartDocumentCount: ").append(toIndentedString(restartDocumentCount)).append("\n");
    sb.append("    frameFillMethod: ").append(toIndentedString(frameFillMethod)).append("\n");
    sb.append("    limitPages: ").append(toIndentedString(limitPages)).append("\n");
    sb.append("    duplexMode: ").append(toIndentedString(duplexMode)).append("\n");
    sb.append("    backPageType: ").append(toIndentedString(backPageType)).append("\n");
    sb.append("    documentNumberType: ").append(toIndentedString(documentNumberType)).append("\n");
    sb.append("    pageNumberType: ").append(toIndentedString(pageNumberType)).append("\n");
    sb.append("    paragraphInclusionMethodType: ").append(toIndentedString(paragraphInclusionMethodType)).append("\n");
    sb.append("    variableParagraphInclusionOid: ").append(toIndentedString(variableParagraphInclusionOid)).append("\n");
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

