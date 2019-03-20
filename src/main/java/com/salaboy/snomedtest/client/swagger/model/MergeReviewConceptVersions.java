package com.salaboy.snomedtest.client.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * MergeReviewConceptVersions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class MergeReviewConceptVersions   {
  @JsonProperty("autoMergedConcept")
  private Concept autoMergedConcept = null;

  @JsonProperty("manuallyMergedConcept")
  private Concept manuallyMergedConcept = null;

  @JsonProperty("sourceConcept")
  private Concept sourceConcept = null;

  @JsonProperty("targetConcept")
  private Concept targetConcept = null;

  public MergeReviewConceptVersions autoMergedConcept(Concept autoMergedConcept) {
    this.autoMergedConcept = autoMergedConcept;
    return this;
  }

  /**
   * Get autoMergedConcept
   * @return autoMergedConcept
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Concept getAutoMergedConcept() {
    return autoMergedConcept;
  }

  public void setAutoMergedConcept(Concept autoMergedConcept) {
    this.autoMergedConcept = autoMergedConcept;
  }

  public MergeReviewConceptVersions manuallyMergedConcept(Concept manuallyMergedConcept) {
    this.manuallyMergedConcept = manuallyMergedConcept;
    return this;
  }

  /**
   * Get manuallyMergedConcept
   * @return manuallyMergedConcept
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Concept getManuallyMergedConcept() {
    return manuallyMergedConcept;
  }

  public void setManuallyMergedConcept(Concept manuallyMergedConcept) {
    this.manuallyMergedConcept = manuallyMergedConcept;
  }

  public MergeReviewConceptVersions sourceConcept(Concept sourceConcept) {
    this.sourceConcept = sourceConcept;
    return this;
  }

  /**
   * Get sourceConcept
   * @return sourceConcept
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Concept getSourceConcept() {
    return sourceConcept;
  }

  public void setSourceConcept(Concept sourceConcept) {
    this.sourceConcept = sourceConcept;
  }

  public MergeReviewConceptVersions targetConcept(Concept targetConcept) {
    this.targetConcept = targetConcept;
    return this;
  }

  /**
   * Get targetConcept
   * @return targetConcept
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Concept getTargetConcept() {
    return targetConcept;
  }

  public void setTargetConcept(Concept targetConcept) {
    this.targetConcept = targetConcept;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MergeReviewConceptVersions mergeReviewConceptVersions = (MergeReviewConceptVersions) o;
    return Objects.equals(this.autoMergedConcept, mergeReviewConceptVersions.autoMergedConcept) &&
        Objects.equals(this.manuallyMergedConcept, mergeReviewConceptVersions.manuallyMergedConcept) &&
        Objects.equals(this.sourceConcept, mergeReviewConceptVersions.sourceConcept) &&
        Objects.equals(this.targetConcept, mergeReviewConceptVersions.targetConcept);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoMergedConcept, manuallyMergedConcept, sourceConcept, targetConcept);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergeReviewConceptVersions {\n");
    
    sb.append("    autoMergedConcept: ").append(toIndentedString(autoMergedConcept)).append("\n");
    sb.append("    manuallyMergedConcept: ").append(toIndentedString(manuallyMergedConcept)).append("\n");
    sb.append("    sourceConcept: ").append(toIndentedString(sourceConcept)).append("\n");
    sb.append("    targetConcept: ").append(toIndentedString(targetConcept)).append("\n");
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

