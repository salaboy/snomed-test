package com.salaboy.snomedtest.client.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * BrowserDescriptionSearchResult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class BrowserDescriptionSearchResult   {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("concept")
  private ConceptMini concept = null;

  @JsonProperty("term")
  private String term = null;

  public BrowserDescriptionSearchResult active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")


  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public BrowserDescriptionSearchResult concept(ConceptMini concept) {
    this.concept = concept;
    return this;
  }

  /**
   * Get concept
   * @return concept
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConceptMini getConcept() {
    return concept;
  }

  public void setConcept(ConceptMini concept) {
    this.concept = concept;
  }

  public BrowserDescriptionSearchResult term(String term) {
    this.term = term;
    return this;
  }

  /**
   * Get term
   * @return term
  **/
  @ApiModelProperty(value = "")


  public String getTerm() {
    return term;
  }

  public void setTerm(String term) {
    this.term = term;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrowserDescriptionSearchResult browserDescriptionSearchResult = (BrowserDescriptionSearchResult) o;
    return Objects.equals(this.active, browserDescriptionSearchResult.active) &&
        Objects.equals(this.concept, browserDescriptionSearchResult.concept) &&
        Objects.equals(this.term, browserDescriptionSearchResult.term);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, concept, term);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrowserDescriptionSearchResult {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    concept: ").append(toIndentedString(concept)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
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

