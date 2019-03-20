package com.salaboy.snomedtest.client.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * ConceptMicro
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class ConceptMicro   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("primitive")
  private Boolean primitive = null;

  @JsonProperty("term")
  private String term = null;

  public ConceptMicro id(String id) {
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

  public ConceptMicro primitive(Boolean primitive) {
    this.primitive = primitive;
    return this;
  }

  /**
   * Get primitive
   * @return primitive
  **/
  @ApiModelProperty(value = "")


  public Boolean isPrimitive() {
    return primitive;
  }

  public void setPrimitive(Boolean primitive) {
    this.primitive = primitive;
  }

  public ConceptMicro term(String term) {
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
    ConceptMicro conceptMicro = (ConceptMicro) o;
    return Objects.equals(this.id, conceptMicro.id) &&
        Objects.equals(this.primitive, conceptMicro.primitive) &&
        Objects.equals(this.term, conceptMicro.term);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, primitive, term);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConceptMicro {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    primitive: ").append(toIndentedString(primitive)).append("\n");
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

