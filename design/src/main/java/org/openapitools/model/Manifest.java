package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.model.DataSource;
import org.openapitools.model.Document;
import org.openapitools.model.MetadataObj;
import org.openapitools.model.QueueObj;
import org.openapitools.model.ReportObj;
import org.openapitools.model.Section;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Manifest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
public class Manifest {

  /**
   * Gets or Sets characterEncoding
   */
  public enum CharacterEncodingEnum {
    DBCS("DBCS"),
    
    SBCS("SBCS");

    private String value;

    CharacterEncodingEnum(String value) {
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
    public static CharacterEncodingEnum fromValue(String value) {
      for (CharacterEncodingEnum b : CharacterEncodingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CharacterEncodingEnum characterEncoding;

  private String sectionVariableOid;

  private String applicationName;

  @Valid
  private List<@Valid QueueObj> queueList;

  @Valid
  private List<@Valid ReportObj> reportList;

  @Valid
  private Set<@Valid MetadataObj> metadata;

  private Integer serialization;

  @Valid
  private List<@Valid DataSource> dsnlist;

  private Integer serializationVersion;

  @Valid
  private List<List<@Valid Section>> documentSections;

  @Valid
  private List<@Valid Document> documentWithVariableDrivenSections;

  public Manifest characterEncoding(CharacterEncodingEnum characterEncoding) {
    this.characterEncoding = characterEncoding;
    return this;
  }

  /**
   * Get characterEncoding
   * @return characterEncoding
  */
  
  @Schema(name = "characterEncoding", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("characterEncoding")
  public CharacterEncodingEnum getCharacterEncoding() {
    return characterEncoding;
  }

  public void setCharacterEncoding(CharacterEncodingEnum characterEncoding) {
    this.characterEncoding = characterEncoding;
  }

  public Manifest sectionVariableOid(String sectionVariableOid) {
    this.sectionVariableOid = sectionVariableOid;
    return this;
  }

  /**
   * Get sectionVariableOid
   * @return sectionVariableOid
  */
  
  @Schema(name = "sectionVariableOid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sectionVariableOid")
  public String getSectionVariableOid() {
    return sectionVariableOid;
  }

  public void setSectionVariableOid(String sectionVariableOid) {
    this.sectionVariableOid = sectionVariableOid;
  }

  public Manifest applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

  /**
   * Get applicationName
   * @return applicationName
  */
  
  @Schema(name = "applicationName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("applicationName")
  public String getApplicationName() {
    return applicationName;
  }

  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  public Manifest queueList(List<@Valid QueueObj> queueList) {
    this.queueList = queueList;
    return this;
  }

  public Manifest addQueueListItem(QueueObj queueListItem) {
    if (this.queueList == null) {
      this.queueList = new ArrayList<>();
    }
    this.queueList.add(queueListItem);
    return this;
  }

  /**
   * Get queueList
   * @return queueList
  */
  @Valid 
  @Schema(name = "queueList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queueList")
  public List<@Valid QueueObj> getQueueList() {
    return queueList;
  }

  public void setQueueList(List<@Valid QueueObj> queueList) {
    this.queueList = queueList;
  }

  public Manifest reportList(List<@Valid ReportObj> reportList) {
    this.reportList = reportList;
    return this;
  }

  public Manifest addReportListItem(ReportObj reportListItem) {
    if (this.reportList == null) {
      this.reportList = new ArrayList<>();
    }
    this.reportList.add(reportListItem);
    return this;
  }

  /**
   * Get reportList
   * @return reportList
  */
  @Valid 
  @Schema(name = "reportList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reportList")
  public List<@Valid ReportObj> getReportList() {
    return reportList;
  }

  public void setReportList(List<@Valid ReportObj> reportList) {
    this.reportList = reportList;
  }

  public Manifest metadata(Set<@Valid MetadataObj> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Manifest addMetadataItem(MetadataObj metadataItem) {
    if (this.metadata == null) {
      this.metadata = new LinkedHashSet<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  @Valid 
  @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metadata")
  public Set<@Valid MetadataObj> getMetadata() {
    return metadata;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setMetadata(Set<@Valid MetadataObj> metadata) {
    this.metadata = metadata;
  }

  public Manifest serialization(Integer serialization) {
    this.serialization = serialization;
    return this;
  }

  /**
   * Get serialization
   * @return serialization
  */
  
  @Schema(name = "serialization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serialization")
  public Integer getSerialization() {
    return serialization;
  }

  public void setSerialization(Integer serialization) {
    this.serialization = serialization;
  }

  public Manifest dsnlist(List<@Valid DataSource> dsnlist) {
    this.dsnlist = dsnlist;
    return this;
  }

  public Manifest addDsnlistItem(DataSource dsnlistItem) {
    if (this.dsnlist == null) {
      this.dsnlist = new ArrayList<>();
    }
    this.dsnlist.add(dsnlistItem);
    return this;
  }

  /**
   * Get dsnlist
   * @return dsnlist
  */
  @Valid 
  @Schema(name = "dsnlist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dsnlist")
  public List<@Valid DataSource> getDsnlist() {
    return dsnlist;
  }

  public void setDsnlist(List<@Valid DataSource> dsnlist) {
    this.dsnlist = dsnlist;
  }

  public Manifest serializationVersion(Integer serializationVersion) {
    this.serializationVersion = serializationVersion;
    return this;
  }

  /**
   * Get serializationVersion
   * @return serializationVersion
  */
  
  @Schema(name = "serializationVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serializationVersion")
  public Integer getSerializationVersion() {
    return serializationVersion;
  }

  public void setSerializationVersion(Integer serializationVersion) {
    this.serializationVersion = serializationVersion;
  }

  public Manifest documentSections(List<List<@Valid Section>> documentSections) {
    this.documentSections = documentSections;
    return this;
  }

  public Manifest addDocumentSectionsItem(List<@Valid Section> documentSectionsItem) {
    if (this.documentSections == null) {
      this.documentSections = new ArrayList<>();
    }
    this.documentSections.add(documentSectionsItem);
    return this;
  }

  /**
   * Get documentSections
   * @return documentSections
  */
  @Valid 
  @Schema(name = "documentSections", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("documentSections")
  public List<List<@Valid Section>> getDocumentSections() {
    return documentSections;
  }

  public void setDocumentSections(List<List<@Valid Section>> documentSections) {
    this.documentSections = documentSections;
  }

  public Manifest documentWithVariableDrivenSections(List<@Valid Document> documentWithVariableDrivenSections) {
    this.documentWithVariableDrivenSections = documentWithVariableDrivenSections;
    return this;
  }

  public Manifest addDocumentWithVariableDrivenSectionsItem(Document documentWithVariableDrivenSectionsItem) {
    if (this.documentWithVariableDrivenSections == null) {
      this.documentWithVariableDrivenSections = new ArrayList<>();
    }
    this.documentWithVariableDrivenSections.add(documentWithVariableDrivenSectionsItem);
    return this;
  }

  /**
   * Get documentWithVariableDrivenSections
   * @return documentWithVariableDrivenSections
  */
  @Valid 
  @Schema(name = "documentWithVariableDrivenSections", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("documentWithVariableDrivenSections")
  public List<@Valid Document> getDocumentWithVariableDrivenSections() {
    return documentWithVariableDrivenSections;
  }

  public void setDocumentWithVariableDrivenSections(List<@Valid Document> documentWithVariableDrivenSections) {
    this.documentWithVariableDrivenSections = documentWithVariableDrivenSections;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Manifest manifest = (Manifest) o;
    return Objects.equals(this.characterEncoding, manifest.characterEncoding) &&
        Objects.equals(this.sectionVariableOid, manifest.sectionVariableOid) &&
        Objects.equals(this.applicationName, manifest.applicationName) &&
        Objects.equals(this.queueList, manifest.queueList) &&
        Objects.equals(this.reportList, manifest.reportList) &&
        Objects.equals(this.metadata, manifest.metadata) &&
        Objects.equals(this.serialization, manifest.serialization) &&
        Objects.equals(this.dsnlist, manifest.dsnlist) &&
        Objects.equals(this.serializationVersion, manifest.serializationVersion) &&
        Objects.equals(this.documentSections, manifest.documentSections) &&
        Objects.equals(this.documentWithVariableDrivenSections, manifest.documentWithVariableDrivenSections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characterEncoding, sectionVariableOid, applicationName, queueList, reportList, metadata, serialization, dsnlist, serializationVersion, documentSections, documentWithVariableDrivenSections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Manifest {\n");
    sb.append("    characterEncoding: ").append(toIndentedString(characterEncoding)).append("\n");
    sb.append("    sectionVariableOid: ").append(toIndentedString(sectionVariableOid)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    queueList: ").append(toIndentedString(queueList)).append("\n");
    sb.append("    reportList: ").append(toIndentedString(reportList)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    serialization: ").append(toIndentedString(serialization)).append("\n");
    sb.append("    dsnlist: ").append(toIndentedString(dsnlist)).append("\n");
    sb.append("    serializationVersion: ").append(toIndentedString(serializationVersion)).append("\n");
    sb.append("    documentSections: ").append(toIndentedString(documentSections)).append("\n");
    sb.append("    documentWithVariableDrivenSections: ").append(toIndentedString(documentWithVariableDrivenSections)).append("\n");
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

