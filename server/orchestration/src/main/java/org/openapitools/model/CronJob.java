package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CronJob
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:03:17.210646522Z[Europe/Lisbon]")
public class CronJob {

  private String domainId;

  private String name;

  private String cronExpression;

  /**
   * Gets or Sets cronType
   */
  public enum CronTypeEnum {
    MARKDELETED("markDeleted"),
    
    WIPE("wipe"),
    
    STARTJOB("startJob"),
    
    UPDATEEXPIRATIONTIME("updateExpirationTime"),
    
    WIPESORTINGASSETS("wipeSortingAssets"),
    
    EXPIRESORTINGASSETS("expireSortingAssets"),
    
    SORTINGANDBUNDLING("sortingAndBundling");

    private String value;

    CronTypeEnum(String value) {
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
    public static CronTypeEnum fromValue(String value) {
      for (CronTypeEnum b : CronTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CronTypeEnum cronType;

  private String startDateStart;

  private String startDateEnd;

  private String endDateStart;

  private String endDateEnd;

  private Boolean enabled;

  private String serviceName;

  private String channelName;

  private String inputPath;

  @Valid
  private Map<String, String> headers = new HashMap<>();

  private Float cacheTimeout;

  /**
   * Gets or Sets mode
   */
  public enum ModeEnum {
    BATCH("BATCH"),
    
    ONDEMAND("ONDEMAND");

    private String value;

    ModeEnum(String value) {
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
    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ModeEnum mode;

  private UUID flowModelId;

  private String preSortQueueName;

  private String postSortQueueName;

  private UUID jobId;

  private Boolean dryRun;

  private Boolean appConsolidation;

  private Boolean jobAvailable;

  private UUID id;

  /**
   * Gets or Sets statuses
   */
  public enum StatusesEnum {
    CANCELED("canceled"),
    
    COMPLETE("complete"),
    
    DELETED("deleted"),
    
    STARTED("started"),
    
    WAITING("waiting"),
    
    HOLDING("holding"),
    
    ERROR("error"),
    
    UNINITIALIZED("uninitialized");

    private String value;

    StatusesEnum(String value) {
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
    public static StatusesEnum fromValue(String value) {
      for (StatusesEnum b : StatusesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<StatusesEnum> statuses;

  /**
   * Gets or Sets sortingAssetStatuses
   */
  public enum SortingAssetStatusesEnum {
    PROCESSED("processed"),
    
    WAITING("waiting"),
    
    EXPIRED("expired"),
    
    CANCELED("canceled"),
    
    ALL("all");

    private String value;

    SortingAssetStatusesEnum(String value) {
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
    public static SortingAssetStatusesEnum fromValue(String value) {
      for (SortingAssetStatusesEnum b : SortingAssetStatusesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<SortingAssetStatusesEnum> sortingAssetStatuses;

  @Valid
  private List<UUID> communicationIdList;

  public CronJob domainId(String domainId) {
    this.domainId = domainId;
    return this;
  }

  /**
   * Get domainId
   * @return domainId
  */
  
  @Schema(name = "domainId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("domainId")
  public String getDomainId() {
    return domainId;
  }

  public void setDomainId(String domainId) {
    this.domainId = domainId;
  }

  public CronJob name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @Size(min = 1, max = 255) 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CronJob cronExpression(String cronExpression) {
    this.cronExpression = cronExpression;
    return this;
  }

  /**
   * Get cronExpression
   * @return cronExpression
  */
  @Size(min = 1, max = 255) 
  @Schema(name = "cronExpression", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cronExpression")
  public String getCronExpression() {
    return cronExpression;
  }

  public void setCronExpression(String cronExpression) {
    this.cronExpression = cronExpression;
  }

  public CronJob cronType(CronTypeEnum cronType) {
    this.cronType = cronType;
    return this;
  }

  /**
   * Get cronType
   * @return cronType
  */
  
  @Schema(name = "cronType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cronType")
  public CronTypeEnum getCronType() {
    return cronType;
  }

  public void setCronType(CronTypeEnum cronType) {
    this.cronType = cronType;
  }

  public CronJob startDateStart(String startDateStart) {
    this.startDateStart = startDateStart;
    return this;
  }

  /**
   * Get startDateStart
   * @return startDateStart
  */
  @Size(min = 0, max = 255) 
  @Schema(name = "startDateStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDateStart")
  public String getStartDateStart() {
    return startDateStart;
  }

  public void setStartDateStart(String startDateStart) {
    this.startDateStart = startDateStart;
  }

  public CronJob startDateEnd(String startDateEnd) {
    this.startDateEnd = startDateEnd;
    return this;
  }

  /**
   * Get startDateEnd
   * @return startDateEnd
  */
  @Size(min = 0, max = 255) 
  @Schema(name = "startDateEnd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDateEnd")
  public String getStartDateEnd() {
    return startDateEnd;
  }

  public void setStartDateEnd(String startDateEnd) {
    this.startDateEnd = startDateEnd;
  }

  public CronJob endDateStart(String endDateStart) {
    this.endDateStart = endDateStart;
    return this;
  }

  /**
   * Get endDateStart
   * @return endDateStart
  */
  @Size(min = 0, max = 255) 
  @Schema(name = "endDateStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDateStart")
  public String getEndDateStart() {
    return endDateStart;
  }

  public void setEndDateStart(String endDateStart) {
    this.endDateStart = endDateStart;
  }

  public CronJob endDateEnd(String endDateEnd) {
    this.endDateEnd = endDateEnd;
    return this;
  }

  /**
   * Get endDateEnd
   * @return endDateEnd
  */
  @Size(min = 0, max = 255) 
  @Schema(name = "endDateEnd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDateEnd")
  public String getEndDateEnd() {
    return endDateEnd;
  }

  public void setEndDateEnd(String endDateEnd) {
    this.endDateEnd = endDateEnd;
  }

  public CronJob enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
  */
  
  @Schema(name = "enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public CronJob serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
  */
  @Size(min = 0, max = 255) 
  @Schema(name = "serviceName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceName")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public CronJob channelName(String channelName) {
    this.channelName = channelName;
    return this;
  }

  /**
   * Get channelName
   * @return channelName
  */
  @Size(min = 0, max = 255) 
  @Schema(name = "channelName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("channelName")
  public String getChannelName() {
    return channelName;
  }

  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }

  public CronJob inputPath(String inputPath) {
    this.inputPath = inputPath;
    return this;
  }

  /**
   * Get inputPath
   * @return inputPath
  */
  @Size(min = 0, max = 255) 
  @Schema(name = "inputPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inputPath")
  public String getInputPath() {
    return inputPath;
  }

  public void setInputPath(String inputPath) {
    this.inputPath = inputPath;
  }

  public CronJob headers(Map<String, String> headers) {
    this.headers = headers;
    return this;
  }

  public CronJob putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

  /**
   * Get headers
   * @return headers
  */
  
  @Schema(name = "headers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("headers")
  public Map<String, String> getHeaders() {
    return headers;
  }

  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }

  public CronJob cacheTimeout(Float cacheTimeout) {
    this.cacheTimeout = cacheTimeout;
    return this;
  }

  /**
   * Get cacheTimeout
   * @return cacheTimeout
  */
  
  @Schema(name = "cacheTimeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cacheTimeout")
  public Float getCacheTimeout() {
    return cacheTimeout;
  }

  public void setCacheTimeout(Float cacheTimeout) {
    this.cacheTimeout = cacheTimeout;
  }

  public CronJob mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
  */
  
  @Schema(name = "mode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mode")
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public CronJob flowModelId(UUID flowModelId) {
    this.flowModelId = flowModelId;
    return this;
  }

  /**
   * Get flowModelId
   * @return flowModelId
  */
  @Valid 
  @Schema(name = "flowModelId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowModelId")
  public UUID getFlowModelId() {
    return flowModelId;
  }

  public void setFlowModelId(UUID flowModelId) {
    this.flowModelId = flowModelId;
  }

  public CronJob preSortQueueName(String preSortQueueName) {
    this.preSortQueueName = preSortQueueName;
    return this;
  }

  /**
   * Get preSortQueueName
   * @return preSortQueueName
  */
  @Size(min = 0, max = 255) 
  @Schema(name = "preSortQueueName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preSortQueueName")
  public String getPreSortQueueName() {
    return preSortQueueName;
  }

  public void setPreSortQueueName(String preSortQueueName) {
    this.preSortQueueName = preSortQueueName;
  }

  public CronJob postSortQueueName(String postSortQueueName) {
    this.postSortQueueName = postSortQueueName;
    return this;
  }

  /**
   * Get postSortQueueName
   * @return postSortQueueName
  */
  @Size(min = 0, max = 255) 
  @Schema(name = "postSortQueueName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postSortQueueName")
  public String getPostSortQueueName() {
    return postSortQueueName;
  }

  public void setPostSortQueueName(String postSortQueueName) {
    this.postSortQueueName = postSortQueueName;
  }

  public CronJob jobId(UUID jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * Get jobId
   * @return jobId
  */
  @Valid 
  @Schema(name = "jobId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobId")
  public UUID getJobId() {
    return jobId;
  }

  public void setJobId(UUID jobId) {
    this.jobId = jobId;
  }

  public CronJob dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * Get dryRun
   * @return dryRun
  */
  
  @Schema(name = "dryRun", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dryRun")
  public Boolean getDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public CronJob appConsolidation(Boolean appConsolidation) {
    this.appConsolidation = appConsolidation;
    return this;
  }

  /**
   * Get appConsolidation
   * @return appConsolidation
  */
  
  @Schema(name = "appConsolidation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appConsolidation")
  public Boolean getAppConsolidation() {
    return appConsolidation;
  }

  public void setAppConsolidation(Boolean appConsolidation) {
    this.appConsolidation = appConsolidation;
  }

  public CronJob jobAvailable(Boolean jobAvailable) {
    this.jobAvailable = jobAvailable;
    return this;
  }

  /**
   * Get jobAvailable
   * @return jobAvailable
  */
  
  @Schema(name = "jobAvailable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobAvailable")
  public Boolean getJobAvailable() {
    return jobAvailable;
  }

  public void setJobAvailable(Boolean jobAvailable) {
    this.jobAvailable = jobAvailable;
  }

  public CronJob id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @Valid 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CronJob statuses(List<StatusesEnum> statuses) {
    this.statuses = statuses;
    return this;
  }

  public CronJob addStatusesItem(StatusesEnum statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

  /**
   * Get statuses
   * @return statuses
  */
  
  @Schema(name = "statuses", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statuses")
  public List<StatusesEnum> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<StatusesEnum> statuses) {
    this.statuses = statuses;
  }

  public CronJob sortingAssetStatuses(List<SortingAssetStatusesEnum> sortingAssetStatuses) {
    this.sortingAssetStatuses = sortingAssetStatuses;
    return this;
  }

  public CronJob addSortingAssetStatusesItem(SortingAssetStatusesEnum sortingAssetStatusesItem) {
    if (this.sortingAssetStatuses == null) {
      this.sortingAssetStatuses = new ArrayList<>();
    }
    this.sortingAssetStatuses.add(sortingAssetStatusesItem);
    return this;
  }

  /**
   * Get sortingAssetStatuses
   * @return sortingAssetStatuses
  */
  
  @Schema(name = "sortingAssetStatuses", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sortingAssetStatuses")
  public List<SortingAssetStatusesEnum> getSortingAssetStatuses() {
    return sortingAssetStatuses;
  }

  public void setSortingAssetStatuses(List<SortingAssetStatusesEnum> sortingAssetStatuses) {
    this.sortingAssetStatuses = sortingAssetStatuses;
  }

  public CronJob communicationIdList(List<UUID> communicationIdList) {
    this.communicationIdList = communicationIdList;
    return this;
  }

  public CronJob addCommunicationIdListItem(UUID communicationIdListItem) {
    if (this.communicationIdList == null) {
      this.communicationIdList = new ArrayList<>();
    }
    this.communicationIdList.add(communicationIdListItem);
    return this;
  }

  /**
   * Get communicationIdList
   * @return communicationIdList
  */
  @Valid 
  @Schema(name = "communicationIdList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("communicationIdList")
  public List<UUID> getCommunicationIdList() {
    return communicationIdList;
  }

  public void setCommunicationIdList(List<UUID> communicationIdList) {
    this.communicationIdList = communicationIdList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CronJob cronJob = (CronJob) o;
    return Objects.equals(this.domainId, cronJob.domainId) &&
        Objects.equals(this.name, cronJob.name) &&
        Objects.equals(this.cronExpression, cronJob.cronExpression) &&
        Objects.equals(this.cronType, cronJob.cronType) &&
        Objects.equals(this.startDateStart, cronJob.startDateStart) &&
        Objects.equals(this.startDateEnd, cronJob.startDateEnd) &&
        Objects.equals(this.endDateStart, cronJob.endDateStart) &&
        Objects.equals(this.endDateEnd, cronJob.endDateEnd) &&
        Objects.equals(this.enabled, cronJob.enabled) &&
        Objects.equals(this.serviceName, cronJob.serviceName) &&
        Objects.equals(this.channelName, cronJob.channelName) &&
        Objects.equals(this.inputPath, cronJob.inputPath) &&
        Objects.equals(this.headers, cronJob.headers) &&
        Objects.equals(this.cacheTimeout, cronJob.cacheTimeout) &&
        Objects.equals(this.mode, cronJob.mode) &&
        Objects.equals(this.flowModelId, cronJob.flowModelId) &&
        Objects.equals(this.preSortQueueName, cronJob.preSortQueueName) &&
        Objects.equals(this.postSortQueueName, cronJob.postSortQueueName) &&
        Objects.equals(this.jobId, cronJob.jobId) &&
        Objects.equals(this.dryRun, cronJob.dryRun) &&
        Objects.equals(this.appConsolidation, cronJob.appConsolidation) &&
        Objects.equals(this.jobAvailable, cronJob.jobAvailable) &&
        Objects.equals(this.id, cronJob.id) &&
        Objects.equals(this.statuses, cronJob.statuses) &&
        Objects.equals(this.sortingAssetStatuses, cronJob.sortingAssetStatuses) &&
        Objects.equals(this.communicationIdList, cronJob.communicationIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainId, name, cronExpression, cronType, startDateStart, startDateEnd, endDateStart, endDateEnd, enabled, serviceName, channelName, inputPath, headers, cacheTimeout, mode, flowModelId, preSortQueueName, postSortQueueName, jobId, dryRun, appConsolidation, jobAvailable, id, statuses, sortingAssetStatuses, communicationIdList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CronJob {\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cronExpression: ").append(toIndentedString(cronExpression)).append("\n");
    sb.append("    cronType: ").append(toIndentedString(cronType)).append("\n");
    sb.append("    startDateStart: ").append(toIndentedString(startDateStart)).append("\n");
    sb.append("    startDateEnd: ").append(toIndentedString(startDateEnd)).append("\n");
    sb.append("    endDateStart: ").append(toIndentedString(endDateStart)).append("\n");
    sb.append("    endDateEnd: ").append(toIndentedString(endDateEnd)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    inputPath: ").append(toIndentedString(inputPath)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    cacheTimeout: ").append(toIndentedString(cacheTimeout)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    flowModelId: ").append(toIndentedString(flowModelId)).append("\n");
    sb.append("    preSortQueueName: ").append(toIndentedString(preSortQueueName)).append("\n");
    sb.append("    postSortQueueName: ").append(toIndentedString(postSortQueueName)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    appConsolidation: ").append(toIndentedString(appConsolidation)).append("\n");
    sb.append("    jobAvailable: ").append(toIndentedString(jobAvailable)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    sortingAssetStatuses: ").append(toIndentedString(sortingAssetStatuses)).append("\n");
    sb.append("    communicationIdList: ").append(toIndentedString(communicationIdList)).append("\n");
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

