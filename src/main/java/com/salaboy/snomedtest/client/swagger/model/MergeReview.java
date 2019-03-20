package com.salaboy.snomedtest.client.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * MergeReview
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class MergeReview   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("manuallyMergedConcepts")
  @Valid
  private Map<String, Concept> manuallyMergedConcepts = null;

  @JsonProperty("sourcePath")
  private String sourcePath = null;

  @JsonProperty("sourceToTargetReviewId")
  private String sourceToTargetReviewId = null;

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

  @JsonProperty("targetPath")
  private String targetPath = null;

  @JsonProperty("targetToSourceReviewId")
  private String targetToSourceReviewId = null;

  public MergeReview id(String id) {
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

  public MergeReview manuallyMergedConcepts(Map<String, Concept> manuallyMergedConcepts) {
    this.manuallyMergedConcepts = manuallyMergedConcepts;
    return this;
  }

  public MergeReview putManuallyMergedConceptsItem(String key, Concept manuallyMergedConceptsItem) {
    if (this.manuallyMergedConcepts == null) {
      this.manuallyMergedConcepts = new HashMap<String, Concept>();
    }
    this.manuallyMergedConcepts.put(key, manuallyMergedConceptsItem);
    return this;
  }

  /**
   * Get manuallyMergedConcepts
   * @return manuallyMergedConcepts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Map<String, Concept> getManuallyMergedConcepts() {
    return manuallyMergedConcepts;
  }

  public void setManuallyMergedConcepts(Map<String, Concept> manuallyMergedConcepts) {
    this.manuallyMergedConcepts = manuallyMergedConcepts;
  }

  public MergeReview sourcePath(String sourcePath) {
    this.sourcePath = sourcePath;
    return this;
  }

  /**
   * Get sourcePath
   * @return sourcePath
  **/
  @ApiModelProperty(value = "")


  public String getSourcePath() {
    return sourcePath;
  }

  public void setSourcePath(String sourcePath) {
    this.sourcePath = sourcePath;
  }

  public MergeReview sourceToTargetReviewId(String sourceToTargetReviewId) {
    this.sourceToTargetReviewId = sourceToTargetReviewId;
    return this;
  }

  /**
   * Get sourceToTargetReviewId
   * @return sourceToTargetReviewId
  **/
  @ApiModelProperty(value = "")


  public String getSourceToTargetReviewId() {
    return sourceToTargetReviewId;
  }

  public void setSourceToTargetReviewId(String sourceToTargetReviewId) {
    this.sourceToTargetReviewId = sourceToTargetReviewId;
  }

  public MergeReview status(StatusEnum status) {
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

  public MergeReview targetPath(String targetPath) {
    this.targetPath = targetPath;
    return this;
  }

  /**
   * Get targetPath
   * @return targetPath
  **/
  @ApiModelProperty(value = "")


  public String getTargetPath() {
    return targetPath;
  }

  public void setTargetPath(String targetPath) {
    this.targetPath = targetPath;
  }

  public MergeReview targetToSourceReviewId(String targetToSourceReviewId) {
    this.targetToSourceReviewId = targetToSourceReviewId;
    return this;
  }

  /**
   * Get targetToSourceReviewId
   * @return targetToSourceReviewId
  **/
  @ApiModelProperty(value = "")


  public String getTargetToSourceReviewId() {
    return targetToSourceReviewId;
  }

  public void setTargetToSourceReviewId(String targetToSourceReviewId) {
    this.targetToSourceReviewId = targetToSourceReviewId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MergeReview mergeReview = (MergeReview) o;
    return Objects.equals(this.id, mergeReview.id) &&
        Objects.equals(this.manuallyMergedConcepts, mergeReview.manuallyMergedConcepts) &&
        Objects.equals(this.sourcePath, mergeReview.sourcePath) &&
        Objects.equals(this.sourceToTargetReviewId, mergeReview.sourceToTargetReviewId) &&
        Objects.equals(this.status, mergeReview.status) &&
        Objects.equals(this.targetPath, mergeReview.targetPath) &&
        Objects.equals(this.targetToSourceReviewId, mergeReview.targetToSourceReviewId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, manuallyMergedConcepts, sourcePath, sourceToTargetReviewId, status, targetPath, targetToSourceReviewId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergeReview {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    manuallyMergedConcepts: ").append(toIndentedString(manuallyMergedConcepts)).append("\n");
    sb.append("    sourcePath: ").append(toIndentedString(sourcePath)).append("\n");
    sb.append("    sourceToTargetReviewId: ").append(toIndentedString(sourceToTargetReviewId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    targetPath: ").append(toIndentedString(targetPath)).append("\n");
    sb.append("    targetToSourceReviewId: ").append(toIndentedString(targetToSourceReviewId)).append("\n");
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

