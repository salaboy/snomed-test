package com.salaboy.snomedtest.client.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * IntegrityIssueReport
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class IntegrityIssueReport   {
  @JsonProperty("empty")
  private Boolean empty = null;

  @JsonProperty("relationshipsWithMissingOrInactiveDestination")
  @Valid
  private Map<String, Long> relationshipsWithMissingOrInactiveDestination = null;

  @JsonProperty("relationshipsWithMissingOrInactiveSource")
  @Valid
  private Map<String, Long> relationshipsWithMissingOrInactiveSource = null;

  @JsonProperty("relationshipsWithMissingOrInactiveType")
  @Valid
  private Map<String, Long> relationshipsWithMissingOrInactiveType = null;

  public IntegrityIssueReport empty(Boolean empty) {
    this.empty = empty;
    return this;
  }

  /**
   * Get empty
   * @return empty
  **/
  @ApiModelProperty(value = "")


  public Boolean isEmpty() {
    return empty;
  }

  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }

  public IntegrityIssueReport relationshipsWithMissingOrInactiveDestination(Map<String, Long> relationshipsWithMissingOrInactiveDestination) {
    this.relationshipsWithMissingOrInactiveDestination = relationshipsWithMissingOrInactiveDestination;
    return this;
  }

  public IntegrityIssueReport putRelationshipsWithMissingOrInactiveDestinationItem(String key, Long relationshipsWithMissingOrInactiveDestinationItem) {
    if (this.relationshipsWithMissingOrInactiveDestination == null) {
      this.relationshipsWithMissingOrInactiveDestination = new HashMap<String, Long>();
    }
    this.relationshipsWithMissingOrInactiveDestination.put(key, relationshipsWithMissingOrInactiveDestinationItem);
    return this;
  }

  /**
   * Get relationshipsWithMissingOrInactiveDestination
   * @return relationshipsWithMissingOrInactiveDestination
  **/
  @ApiModelProperty(value = "")


  public Map<String, Long> getRelationshipsWithMissingOrInactiveDestination() {
    return relationshipsWithMissingOrInactiveDestination;
  }

  public void setRelationshipsWithMissingOrInactiveDestination(Map<String, Long> relationshipsWithMissingOrInactiveDestination) {
    this.relationshipsWithMissingOrInactiveDestination = relationshipsWithMissingOrInactiveDestination;
  }

  public IntegrityIssueReport relationshipsWithMissingOrInactiveSource(Map<String, Long> relationshipsWithMissingOrInactiveSource) {
    this.relationshipsWithMissingOrInactiveSource = relationshipsWithMissingOrInactiveSource;
    return this;
  }

  public IntegrityIssueReport putRelationshipsWithMissingOrInactiveSourceItem(String key, Long relationshipsWithMissingOrInactiveSourceItem) {
    if (this.relationshipsWithMissingOrInactiveSource == null) {
      this.relationshipsWithMissingOrInactiveSource = new HashMap<String, Long>();
    }
    this.relationshipsWithMissingOrInactiveSource.put(key, relationshipsWithMissingOrInactiveSourceItem);
    return this;
  }

  /**
   * Get relationshipsWithMissingOrInactiveSource
   * @return relationshipsWithMissingOrInactiveSource
  **/
  @ApiModelProperty(value = "")


  public Map<String, Long> getRelationshipsWithMissingOrInactiveSource() {
    return relationshipsWithMissingOrInactiveSource;
  }

  public void setRelationshipsWithMissingOrInactiveSource(Map<String, Long> relationshipsWithMissingOrInactiveSource) {
    this.relationshipsWithMissingOrInactiveSource = relationshipsWithMissingOrInactiveSource;
  }

  public IntegrityIssueReport relationshipsWithMissingOrInactiveType(Map<String, Long> relationshipsWithMissingOrInactiveType) {
    this.relationshipsWithMissingOrInactiveType = relationshipsWithMissingOrInactiveType;
    return this;
  }

  public IntegrityIssueReport putRelationshipsWithMissingOrInactiveTypeItem(String key, Long relationshipsWithMissingOrInactiveTypeItem) {
    if (this.relationshipsWithMissingOrInactiveType == null) {
      this.relationshipsWithMissingOrInactiveType = new HashMap<String, Long>();
    }
    this.relationshipsWithMissingOrInactiveType.put(key, relationshipsWithMissingOrInactiveTypeItem);
    return this;
  }

  /**
   * Get relationshipsWithMissingOrInactiveType
   * @return relationshipsWithMissingOrInactiveType
  **/
  @ApiModelProperty(value = "")


  public Map<String, Long> getRelationshipsWithMissingOrInactiveType() {
    return relationshipsWithMissingOrInactiveType;
  }

  public void setRelationshipsWithMissingOrInactiveType(Map<String, Long> relationshipsWithMissingOrInactiveType) {
    this.relationshipsWithMissingOrInactiveType = relationshipsWithMissingOrInactiveType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrityIssueReport integrityIssueReport = (IntegrityIssueReport) o;
    return Objects.equals(this.empty, integrityIssueReport.empty) &&
        Objects.equals(this.relationshipsWithMissingOrInactiveDestination, integrityIssueReport.relationshipsWithMissingOrInactiveDestination) &&
        Objects.equals(this.relationshipsWithMissingOrInactiveSource, integrityIssueReport.relationshipsWithMissingOrInactiveSource) &&
        Objects.equals(this.relationshipsWithMissingOrInactiveType, integrityIssueReport.relationshipsWithMissingOrInactiveType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(empty, relationshipsWithMissingOrInactiveDestination, relationshipsWithMissingOrInactiveSource, relationshipsWithMissingOrInactiveType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrityIssueReport {\n");
    
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
    sb.append("    relationshipsWithMissingOrInactiveDestination: ").append(toIndentedString(relationshipsWithMissingOrInactiveDestination)).append("\n");
    sb.append("    relationshipsWithMissingOrInactiveSource: ").append(toIndentedString(relationshipsWithMissingOrInactiveSource)).append("\n");
    sb.append("    relationshipsWithMissingOrInactiveType: ").append(toIndentedString(relationshipsWithMissingOrInactiveType)).append("\n");
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

