package com.salaboy.snomedtest.client.swagger.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * AsyncConceptChangeBatch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class AsyncConceptChangeBatch   {
  @JsonProperty("conceptIds")
  @Valid
  private List<Long> conceptIds = null;

  @JsonProperty("endTime")
  private OffsetDateTime endTime = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("secondsDuration")
  private Long secondsDuration = null;

  @JsonProperty("startTime")
  private OffsetDateTime startTime = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    RUNNING("RUNNING"),
    
    COMPLETED("COMPLETED"),
    
    FAILED("FAILED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  public AsyncConceptChangeBatch conceptIds(List<Long> conceptIds) {
    this.conceptIds = conceptIds;
    return this;
  }

  public AsyncConceptChangeBatch addConceptIdsItem(Long conceptIdsItem) {
    if (this.conceptIds == null) {
      this.conceptIds = new ArrayList<Long>();
    }
    this.conceptIds.add(conceptIdsItem);
    return this;
  }

  /**
   * Get conceptIds
   * @return conceptIds
  **/
  @ApiModelProperty(value = "")


  public List<Long> getConceptIds() {
    return conceptIds;
  }

  public void setConceptIds(List<Long> conceptIds) {
    this.conceptIds = conceptIds;
  }

  public AsyncConceptChangeBatch endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public AsyncConceptChangeBatch id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AsyncConceptChangeBatch message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AsyncConceptChangeBatch secondsDuration(Long secondsDuration) {
    this.secondsDuration = secondsDuration;
    return this;
  }

  /**
   * Get secondsDuration
   * @return secondsDuration
  **/
  @ApiModelProperty(value = "")


  public Long getSecondsDuration() {
    return secondsDuration;
  }

  public void setSecondsDuration(Long secondsDuration) {
    this.secondsDuration = secondsDuration;
  }

  public AsyncConceptChangeBatch startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public AsyncConceptChangeBatch status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncConceptChangeBatch asyncConceptChangeBatch = (AsyncConceptChangeBatch) o;
    return Objects.equals(this.conceptIds, asyncConceptChangeBatch.conceptIds) &&
        Objects.equals(this.endTime, asyncConceptChangeBatch.endTime) &&
        Objects.equals(this.id, asyncConceptChangeBatch.id) &&
        Objects.equals(this.message, asyncConceptChangeBatch.message) &&
        Objects.equals(this.secondsDuration, asyncConceptChangeBatch.secondsDuration) &&
        Objects.equals(this.startTime, asyncConceptChangeBatch.startTime) &&
        Objects.equals(this.status, asyncConceptChangeBatch.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conceptIds, endTime, id, message, secondsDuration, startTime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncConceptChangeBatch {\n");
    
    sb.append("    conceptIds: ").append(toIndentedString(conceptIds)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    secondsDuration: ").append(toIndentedString(secondsDuration)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

