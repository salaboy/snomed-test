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
 * BranchReview
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class BranchReview   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("lastUpdated")
  private OffsetDateTime lastUpdated = null;

  @JsonProperty("source")
  private BranchState source = null;

  @JsonProperty("sourceIsParent")
  private Boolean sourceIsParent = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    CURRENT("CURRENT"),
    
    STALE("STALE"),
    
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
  private BranchState target = null;

  public BranchReview id(String id) {
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

  public BranchReview lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public BranchReview source(BranchState source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BranchState getSource() {
    return source;
  }

  public void setSource(BranchState source) {
    this.source = source;
  }

  public BranchReview sourceIsParent(Boolean sourceIsParent) {
    this.sourceIsParent = sourceIsParent;
    return this;
  }

  /**
   * Get sourceIsParent
   * @return sourceIsParent
  **/
  @ApiModelProperty(value = "")


  public Boolean isSourceIsParent() {
    return sourceIsParent;
  }

  public void setSourceIsParent(Boolean sourceIsParent) {
    this.sourceIsParent = sourceIsParent;
  }

  public BranchReview status(StatusEnum status) {
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

  public BranchReview target(BranchState target) {
    this.target = target;
    return this;
  }

  /**
   * Get target
   * @return target
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BranchState getTarget() {
    return target;
  }

  public void setTarget(BranchState target) {
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
    BranchReview branchReview = (BranchReview) o;
    return Objects.equals(this.id, branchReview.id) &&
        Objects.equals(this.lastUpdated, branchReview.lastUpdated) &&
        Objects.equals(this.source, branchReview.source) &&
        Objects.equals(this.sourceIsParent, branchReview.sourceIsParent) &&
        Objects.equals(this.status, branchReview.status) &&
        Objects.equals(this.target, branchReview.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastUpdated, source, sourceIsParent, status, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchReview {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceIsParent: ").append(toIndentedString(sourceIsParent)).append("\n");
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

