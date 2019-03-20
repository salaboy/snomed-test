package com.salaboy.snomedtest.client.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * MergeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class MergeRequest   {
  @JsonProperty("commitComment")
  private String commitComment = null;

  @JsonProperty("reviewId")
  private String reviewId = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("target")
  private String target = null;

  public MergeRequest commitComment(String commitComment) {
    this.commitComment = commitComment;
    return this;
  }

  /**
   * Get commitComment
   * @return commitComment
  **/
  @ApiModelProperty(value = "")


  public String getCommitComment() {
    return commitComment;
  }

  public void setCommitComment(String commitComment) {
    this.commitComment = commitComment;
  }

  public MergeRequest reviewId(String reviewId) {
    this.reviewId = reviewId;
    return this;
  }

  /**
   * Get reviewId
   * @return reviewId
  **/
  @ApiModelProperty(value = "")


  public String getReviewId() {
    return reviewId;
  }

  public void setReviewId(String reviewId) {
    this.reviewId = reviewId;
  }

  public MergeRequest source(String source) {
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

  public MergeRequest target(String target) {
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
    MergeRequest mergeRequest = (MergeRequest) o;
    return Objects.equals(this.commitComment, mergeRequest.commitComment) &&
        Objects.equals(this.reviewId, mergeRequest.reviewId) &&
        Objects.equals(this.source, mergeRequest.source) &&
        Objects.equals(this.target, mergeRequest.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commitComment, reviewId, source, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergeRequest {\n");
    
    sb.append("    commitComment: ").append(toIndentedString(commitComment)).append("\n");
    sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

