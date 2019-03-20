package com.salaboy.snomedtest.client.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Expression
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class Expression   {
  @JsonProperty("attributes")
  @Valid
  private List<ExpressionAttribute> attributes = null;

  @JsonProperty("concepts")
  @Valid
  private List<ConceptMicro> concepts = null;

  @JsonProperty("groups")
  private CollectionExpressionGroup groups = null;

  public Expression attributes(List<ExpressionAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public Expression addAttributesItem(ExpressionAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<ExpressionAttribute>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ExpressionAttribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<ExpressionAttribute> attributes) {
    this.attributes = attributes;
  }

  public Expression concepts(List<ConceptMicro> concepts) {
    this.concepts = concepts;
    return this;
  }

  public Expression addConceptsItem(ConceptMicro conceptsItem) {
    if (this.concepts == null) {
      this.concepts = new ArrayList<ConceptMicro>();
    }
    this.concepts.add(conceptsItem);
    return this;
  }

  /**
   * Get concepts
   * @return concepts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ConceptMicro> getConcepts() {
    return concepts;
  }

  public void setConcepts(List<ConceptMicro> concepts) {
    this.concepts = concepts;
  }

  public Expression groups(CollectionExpressionGroup groups) {
    this.groups = groups;
    return this;
  }

  /**
   * Get groups
   * @return groups
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CollectionExpressionGroup getGroups() {
    return groups;
  }

  public void setGroups(CollectionExpressionGroup groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Expression expression = (Expression) o;
    return Objects.equals(this.attributes, expression.attributes) &&
        Objects.equals(this.concepts, expression.concepts) &&
        Objects.equals(this.groups, expression.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, concepts, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Expression {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    concepts: ").append(toIndentedString(concepts)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

