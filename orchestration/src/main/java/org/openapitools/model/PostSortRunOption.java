package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.UUID;
import org.openapitools.model.PostSortRunFilter;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PostSortRunOption
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:33:52.003808146Z[Europe/Lisbon]")
public class PostSortRunOption {

  private UUID flowModelId;

  private Boolean appConsolidation;

  private Boolean dryRun;

  private String externalId;

  private String customerList;

  private String postSortQueueName;

  private PostSortRunFilter filter;

  public PostSortRunOption() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostSortRunOption(UUID flowModelId) {
    this.flowModelId = flowModelId;
  }

  public PostSortRunOption flowModelId(UUID flowModelId) {
    this.flowModelId = flowModelId;
    return this;
  }

  /**
   * Get flowModelId
   * @return flowModelId
  */
  @NotNull @Valid 
  @Schema(name = "flowModelId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("flowModelId")
  public UUID getFlowModelId() {
    return flowModelId;
  }

  public void setFlowModelId(UUID flowModelId) {
    this.flowModelId = flowModelId;
  }

  public PostSortRunOption appConsolidation(Boolean appConsolidation) {
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

  public PostSortRunOption dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * Get dryRun
   * @return dryRun
  */
  
  @Schema(name = "dryRun", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dryRun")
  public Boolean getDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public PostSortRunOption externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
  */
  
  @Schema(name = "externalId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public PostSortRunOption customerList(String customerList) {
    this.customerList = customerList;
    return this;
  }

  /**
   * Get customerList
   * @return customerList
  */
  @Pattern(regexp = "^(?!([ \\d]*-){2})\\d+(?: *[-,] *\\d+)*$") 
  @Schema(name = "customerList", example = "2,7,14-50", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customerList")
  public String getCustomerList() {
    return customerList;
  }

  public void setCustomerList(String customerList) {
    this.customerList = customerList;
  }

  public PostSortRunOption postSortQueueName(String postSortQueueName) {
    this.postSortQueueName = postSortQueueName;
    return this;
  }

  /**
   * Get postSortQueueName
   * @return postSortQueueName
  */
  @Size(min = 0, max = 255) 
  @Schema(name = "postSortQueueName", example = "Post-sort queue name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postSortQueueName")
  public String getPostSortQueueName() {
    return postSortQueueName;
  }

  public void setPostSortQueueName(String postSortQueueName) {
    this.postSortQueueName = postSortQueueName;
  }

  public PostSortRunOption filter(PostSortRunFilter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
  */
  @Valid 
  @Schema(name = "filter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filter")
  public PostSortRunFilter getFilter() {
    return filter;
  }

  public void setFilter(PostSortRunFilter filter) {
    this.filter = filter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostSortRunOption postSortRunOption = (PostSortRunOption) o;
    return Objects.equals(this.flowModelId, postSortRunOption.flowModelId) &&
        Objects.equals(this.appConsolidation, postSortRunOption.appConsolidation) &&
        Objects.equals(this.dryRun, postSortRunOption.dryRun) &&
        Objects.equals(this.externalId, postSortRunOption.externalId) &&
        Objects.equals(this.customerList, postSortRunOption.customerList) &&
        Objects.equals(this.postSortQueueName, postSortRunOption.postSortQueueName) &&
        Objects.equals(this.filter, postSortRunOption.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowModelId, appConsolidation, dryRun, externalId, customerList, postSortQueueName, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostSortRunOption {\n");
    sb.append("    flowModelId: ").append(toIndentedString(flowModelId)).append("\n");
    sb.append("    appConsolidation: ").append(toIndentedString(appConsolidation)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    customerList: ").append(toIndentedString(customerList)).append("\n");
    sb.append("    postSortQueueName: ").append(toIndentedString(postSortQueueName)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

