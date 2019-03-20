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
 * Classification
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class Classification   {
  @JsonProperty("completionDate")
  private OffsetDateTime completionDate = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("equivalentConceptsFound")
  private Boolean equivalentConceptsFound = null;

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("inferredRelationshipChangesFound")
  private Boolean inferredRelationshipChangesFound = null;

  @JsonProperty("lastCommitDate")
  private OffsetDateTime lastCommitDate = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("reasonerId")
  private String reasonerId = null;

  @JsonProperty("redundantStatedRelationshipsFound")
  private Boolean redundantStatedRelationshipsFound = null;

  @JsonProperty("saveDate")
  private OffsetDateTime saveDate = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    SCHEDULED("SCHEDULED"),
    
    RUNNING("RUNNING"),
    
    FAILED("FAILED"),
    
    COMPLETED("COMPLETED"),
    
    SAVING_IN_PROGRESS("SAVING_IN_PROGRESS"),
    
    SAVED("SAVED"),
    
    SAVE_FAILED("SAVE_FAILED");

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

  @JsonProperty("userId")
  private String userId = null;

  public Classification completionDate(OffsetDateTime completionDate) {
    this.completionDate = completionDate;
    return this;
  }

  /**
   * Get completionDate
   * @return completionDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCompletionDate() {
    return completionDate;
  }

  public void setCompletionDate(OffsetDateTime completionDate) {
    this.completionDate = completionDate;
  }

  public Classification creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public Classification equivalentConceptsFound(Boolean equivalentConceptsFound) {
    this.equivalentConceptsFound = equivalentConceptsFound;
    return this;
  }

  /**
   * Get equivalentConceptsFound
   * @return equivalentConceptsFound
  **/
  @ApiModelProperty(value = "")


  public Boolean isEquivalentConceptsFound() {
    return equivalentConceptsFound;
  }

  public void setEquivalentConceptsFound(Boolean equivalentConceptsFound) {
    this.equivalentConceptsFound = equivalentConceptsFound;
  }

  public Classification errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
  **/
  @ApiModelProperty(value = "")


  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public Classification id(String id) {
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

  public Classification inferredRelationshipChangesFound(Boolean inferredRelationshipChangesFound) {
    this.inferredRelationshipChangesFound = inferredRelationshipChangesFound;
    return this;
  }

  /**
   * Get inferredRelationshipChangesFound
   * @return inferredRelationshipChangesFound
  **/
  @ApiModelProperty(value = "")


  public Boolean isInferredRelationshipChangesFound() {
    return inferredRelationshipChangesFound;
  }

  public void setInferredRelationshipChangesFound(Boolean inferredRelationshipChangesFound) {
    this.inferredRelationshipChangesFound = inferredRelationshipChangesFound;
  }

  public Classification lastCommitDate(OffsetDateTime lastCommitDate) {
    this.lastCommitDate = lastCommitDate;
    return this;
  }

  /**
   * Get lastCommitDate
   * @return lastCommitDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getLastCommitDate() {
    return lastCommitDate;
  }

  public void setLastCommitDate(OffsetDateTime lastCommitDate) {
    this.lastCommitDate = lastCommitDate;
  }

  public Classification path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Classification reasonerId(String reasonerId) {
    this.reasonerId = reasonerId;
    return this;
  }

  /**
   * Get reasonerId
   * @return reasonerId
  **/
  @ApiModelProperty(value = "")


  public String getReasonerId() {
    return reasonerId;
  }

  public void setReasonerId(String reasonerId) {
    this.reasonerId = reasonerId;
  }

  public Classification redundantStatedRelationshipsFound(Boolean redundantStatedRelationshipsFound) {
    this.redundantStatedRelationshipsFound = redundantStatedRelationshipsFound;
    return this;
  }

  /**
   * Get redundantStatedRelationshipsFound
   * @return redundantStatedRelationshipsFound
  **/
  @ApiModelProperty(value = "")


  public Boolean isRedundantStatedRelationshipsFound() {
    return redundantStatedRelationshipsFound;
  }

  public void setRedundantStatedRelationshipsFound(Boolean redundantStatedRelationshipsFound) {
    this.redundantStatedRelationshipsFound = redundantStatedRelationshipsFound;
  }

  public Classification saveDate(OffsetDateTime saveDate) {
    this.saveDate = saveDate;
    return this;
  }

  /**
   * Get saveDate
   * @return saveDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getSaveDate() {
    return saveDate;
  }

  public void setSaveDate(OffsetDateTime saveDate) {
    this.saveDate = saveDate;
  }

  public Classification status(StatusEnum status) {
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

  public Classification userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Classification classification = (Classification) o;
    return Objects.equals(this.completionDate, classification.completionDate) &&
        Objects.equals(this.creationDate, classification.creationDate) &&
        Objects.equals(this.equivalentConceptsFound, classification.equivalentConceptsFound) &&
        Objects.equals(this.errorMessage, classification.errorMessage) &&
        Objects.equals(this.id, classification.id) &&
        Objects.equals(this.inferredRelationshipChangesFound, classification.inferredRelationshipChangesFound) &&
        Objects.equals(this.lastCommitDate, classification.lastCommitDate) &&
        Objects.equals(this.path, classification.path) &&
        Objects.equals(this.reasonerId, classification.reasonerId) &&
        Objects.equals(this.redundantStatedRelationshipsFound, classification.redundantStatedRelationshipsFound) &&
        Objects.equals(this.saveDate, classification.saveDate) &&
        Objects.equals(this.status, classification.status) &&
        Objects.equals(this.userId, classification.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionDate, creationDate, equivalentConceptsFound, errorMessage, id, inferredRelationshipChangesFound, lastCommitDate, path, reasonerId, redundantStatedRelationshipsFound, saveDate, status, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Classification {\n");
    
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    equivalentConceptsFound: ").append(toIndentedString(equivalentConceptsFound)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inferredRelationshipChangesFound: ").append(toIndentedString(inferredRelationshipChangesFound)).append("\n");
    sb.append("    lastCommitDate: ").append(toIndentedString(lastCommitDate)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    reasonerId: ").append(toIndentedString(reasonerId)).append("\n");
    sb.append("    redundantStatedRelationshipsFound: ").append(toIndentedString(redundantStatedRelationshipsFound)).append("\n");
    sb.append("    saveDate: ").append(toIndentedString(saveDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

