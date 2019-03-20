package com.salaboy.snomedtest.client.swagger.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * BranchMergeJob
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class BranchMergeJob   {
  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("scheduledDate")
  private OffsetDateTime scheduledDate = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    SCHEDULED("SCHEDULED"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
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

  @JsonProperty("target")
  private String target = null;

  public BranchMergeJob endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public BranchMergeJob id(String id) {
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

  public BranchMergeJob message(String message) {
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

  public BranchMergeJob scheduledDate(OffsetDateTime scheduledDate) {
    this.scheduledDate = scheduledDate;
    return this;
  }

  /**
   * Get scheduledDate
   * @return scheduledDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getScheduledDate() {
    return scheduledDate;
  }

  public void setScheduledDate(OffsetDateTime scheduledDate) {
    this.scheduledDate = scheduledDate;
  }

  public BranchMergeJob source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public BranchMergeJob startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public BranchMergeJob status(StatusEnum status) {
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

  public BranchMergeJob target(String target) {
    this.target = target;
    return this;
  }

  /**
   * Get target
   * @return target
  **/
  @ApiModelProperty(value = "")


  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchMergeJob branchMergeJob = (BranchMergeJob) o;
    return Objects.equals(this.endDate, branchMergeJob.endDate) &&
        Objects.equals(this.id, branchMergeJob.id) &&
        Objects.equals(this.message, branchMergeJob.message) &&
        Objects.equals(this.scheduledDate, branchMergeJob.scheduledDate) &&
        Objects.equals(this.source, branchMergeJob.source) &&
        Objects.equals(this.startDate, branchMergeJob.startDate) &&
        Objects.equals(this.status, branchMergeJob.status) &&
        Objects.equals(this.target, branchMergeJob.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, id, message, scheduledDate, source, startDate, status, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchMergeJob {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    scheduledDate: ").append(toIndentedString(scheduledDate)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

