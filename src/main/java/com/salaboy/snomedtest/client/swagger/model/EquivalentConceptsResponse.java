package com.salaboy.snomedtest.client.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * EquivalentConceptsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class EquivalentConceptsResponse   {
  @JsonProperty("equivalentConcepts")
  @Valid
  private List<ConceptIdAndLabel> equivalentConcepts = null;

  public EquivalentConceptsResponse equivalentConcepts(List<ConceptIdAndLabel> equivalentConcepts) {
    this.equivalentConcepts = equivalentConcepts;
    return this;
  }

  public EquivalentConceptsResponse addEquivalentConceptsItem(ConceptIdAndLabel equivalentConceptsItem) {
    if (this.equivalentConcepts == null) {
      this.equivalentConcepts = new ArrayList<ConceptIdAndLabel>();
    }
    this.equivalentConcepts.add(equivalentConceptsItem);
    return this;
  }

  /**
   * Get equivalentConcepts
   * @return equivalentConcepts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ConceptIdAndLabel> getEquivalentConcepts() {
    return equivalentConcepts;
  }

  public void setEquivalentConcepts(List<ConceptIdAndLabel> equivalentConcepts) {
    this.equivalentConcepts = equivalentConcepts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EquivalentConceptsResponse equivalentConceptsResponse = (EquivalentConceptsResponse) o;
    return Objects.equals(this.equivalentConcepts, equivalentConceptsResponse.equivalentConcepts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(equivalentConcepts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EquivalentConceptsResponse {\n");
    
    sb.append("    equivalentConcepts: ").append(toIndentedString(equivalentConcepts)).append("\n");
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

