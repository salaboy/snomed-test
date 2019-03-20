package com.salaboy.snomedtest.client.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * BranchReviewConceptChanges
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class BranchReviewConceptChanges   {
  @JsonProperty("changedConcepts")
  @Valid
  private List<Long> changedConcepts = null;

  @JsonProperty("deletedConcepts")
  @Valid
  private List<Long> deletedConcepts = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("newConcepts")
  @Valid
  private List<Long> newConcepts = null;

  public BranchReviewConceptChanges changedConcepts(List<Long> changedConcepts) {
    this.changedConcepts = changedConcepts;
    return this;
  }

  public BranchReviewConceptChanges addChangedConceptsItem(Long changedConceptsItem) {
    if (this.changedConcepts == null) {
      this.changedConcepts = new ArrayList<Long>();
    }
    this.changedConcepts.add(changedConceptsItem);
    return this;
  }

  /**
   * Get changedConcepts
   * @return changedConcepts
  **/
  @ApiModelProperty(value = "")


  public List<Long> getChangedConcepts() {
    return changedConcepts;
  }

  public void setChangedConcepts(List<Long> changedConcepts) {
    this.changedConcepts = changedConcepts;
  }

  public BranchReviewConceptChanges deletedConcepts(List<Long> deletedConcepts) {
    this.deletedConcepts = deletedConcepts;
    return this;
  }

  public BranchReviewConceptChanges addDeletedConceptsItem(Long deletedConceptsItem) {
    if (this.deletedConcepts == null) {
      this.deletedConcepts = new ArrayList<Long>();
    }
    this.deletedConcepts.add(deletedConceptsItem);
    return this;
  }

  /**
   * Get deletedConcepts
   * @return deletedConcepts
  **/
  @ApiModelProperty(value = "")


  public List<Long> getDeletedConcepts() {
    return deletedConcepts;
  }

  public void setDeletedConcepts(List<Long> deletedConcepts) {
    this.deletedConcepts = deletedConcepts;
  }

  public BranchReviewConceptChanges id(String id) {
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

  public BranchReviewConceptChanges newConcepts(List<Long> newConcepts) {
    this.newConcepts = newConcepts;
    return this;
  }

  public BranchReviewConceptChanges addNewConceptsItem(Long newConceptsItem) {
    if (this.newConcepts == null) {
      this.newConcepts = new ArrayList<Long>();
    }
    this.newConcepts.add(newConceptsItem);
    return this;
  }

  /**
   * Get newConcepts
   * @return newConcepts
  **/
  @ApiModelProperty(value = "")


  public List<Long> getNewConcepts() {
    return newConcepts;
  }

  public void setNewConcepts(List<Long> newConcepts) {
    this.newConcepts = newConcepts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchReviewConceptChanges branchReviewConceptChanges = (BranchReviewConceptChanges) o;
    return Objects.equals(this.changedConcepts, branchReviewConceptChanges.changedConcepts) &&
        Objects.equals(this.deletedConcepts, branchReviewConceptChanges.deletedConcepts) &&
        Objects.equals(this.id, branchReviewConceptChanges.id) &&
        Objects.equals(this.newConcepts, branchReviewConceptChanges.newConcepts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changedConcepts, deletedConcepts, id, newConcepts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchReviewConceptChanges {\n");
    
    sb.append("    changedConcepts: ").append(toIndentedString(changedConcepts)).append("\n");
    sb.append("    deletedConcepts: ").append(toIndentedString(deletedConcepts)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    newConcepts: ").append(toIndentedString(newConcepts)).append("\n");
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

