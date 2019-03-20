package com.salaboy.snomedtest.client.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ConceptIdsPojo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class ConceptIdsPojo   {
  @JsonProperty("conceptIds")
  @Valid
  private List<String> conceptIds = null;

  public ConceptIdsPojo conceptIds(List<String> conceptIds) {
    this.conceptIds = conceptIds;
    return this;
  }

  public ConceptIdsPojo addConceptIdsItem(String conceptIdsItem) {
    if (this.conceptIds == null) {
      this.conceptIds = new ArrayList<String>();
    }
    this.conceptIds.add(conceptIdsItem);
    return this;
  }

  /**
   * Get conceptIds
   * @return conceptIds
  **/
  @ApiModelProperty(value = "")


  public List<String> getConceptIds() {
    return conceptIds;
  }

  public void setConceptIds(List<String> conceptIds) {
    this.conceptIds = conceptIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConceptIdsPojo conceptIdsPojo = (ConceptIdsPojo) o;
    return Objects.equals(this.conceptIds, conceptIdsPojo.conceptIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conceptIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConceptIdsPojo {\n");
    
    sb.append("    conceptIds: ").append(toIndentedString(conceptIds)).append("\n");
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

