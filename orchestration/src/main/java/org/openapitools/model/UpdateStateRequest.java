package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RequestBodyPut;
import org.openapitools.model.SortingDataFilterRequest;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UpdateStateRequest
 */

@JsonTypeName("updateState_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:03:17.210646522Z[Europe/Lisbon]")
public class UpdateStateRequest {

  private RequestBodyPut body;

  /**
   * State
   */
  public enum StateEnum {
    PROCESSED("processed"),
    
    WAITING("waiting"),
    
    EXPIRED("expired"),
    
    CANCELED("canceled"),
    
    ALL("all");

    private String value;

    StateEnum(String value) {
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
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StateEnum state;

  private SortingDataFilterRequest filterRequest;

  public UpdateStateRequest body(RequestBodyPut body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   * @return body
  */
  @Valid 
  @Schema(name = "body", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("body")
  public RequestBodyPut getBody() {
    return body;
  }

  public void setBody(RequestBodyPut body) {
    this.body = body;
  }

  public UpdateStateRequest state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * State
   * @return state
  */
  
  @Schema(name = "state", description = "State", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public UpdateStateRequest filterRequest(SortingDataFilterRequest filterRequest) {
    this.filterRequest = filterRequest;
    return this;
  }

  /**
   * Get filterRequest
   * @return filterRequest
  */
  @Valid 
  @Schema(name = "filterRequest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filterRequest")
  public SortingDataFilterRequest getFilterRequest() {
    return filterRequest;
  }

  public void setFilterRequest(SortingDataFilterRequest filterRequest) {
    this.filterRequest = filterRequest;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateStateRequest updateStateRequest = (UpdateStateRequest) o;
    return Objects.equals(this.body, updateStateRequest.body) &&
        Objects.equals(this.state, updateStateRequest.state) &&
        Objects.equals(this.filterRequest, updateStateRequest.filterRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, state, filterRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateStateRequest {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    filterRequest: ").append(toIndentedString(filterRequest)).append("\n");
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

