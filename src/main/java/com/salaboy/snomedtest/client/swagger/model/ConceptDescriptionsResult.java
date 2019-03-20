package com.salaboy.snomedtest.client.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ConceptDescriptionsResult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class ConceptDescriptionsResult   {
  @JsonProperty("conceptDescriptions")
  @Valid
  private List<Description> conceptDescriptions = null;

  public ConceptDescriptionsResult conceptDescriptions(List<Description> conceptDescriptions) {
    this.conceptDescriptions = conceptDescriptions;
    return this;
  }

  public ConceptDescriptionsResult addConceptDescriptionsItem(Description conceptDescriptionsItem) {
    if (this.conceptDescriptions == null) {
      this.conceptDescriptions = new ArrayList<Description>();
    }
    this.conceptDescriptions.add(conceptDescriptionsItem);
    return this;
  }

  /**
   * Get conceptDescriptions
   * @return conceptDescriptions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Description> getConceptDescriptions() {
    return conceptDescriptions;
  }

  public void setConceptDescriptions(List<Description> conceptDescriptions) {
    this.conceptDescriptions = conceptDescriptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConceptDescriptionsResult conceptDescriptionsResult = (ConceptDescriptionsResult) o;
    return Objects.equals(this.conceptDescriptions, conceptDescriptionsResult.conceptDescriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conceptDescriptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConceptDescriptionsResult {\n");
    
    sb.append("    conceptDescriptions: ").append(toIndentedString(conceptDescriptions)).append("\n");
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

