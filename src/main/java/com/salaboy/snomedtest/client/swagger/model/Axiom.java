package com.salaboy.snomedtest.client.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Axiom
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class Axiom   {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("axiomId")
  private String axiomId = null;

  @JsonProperty("definitionStatus")
  private String definitionStatus = null;

  @JsonProperty("definitionStatusId")
  private String definitionStatusId = null;

  @JsonProperty("moduleId")
  private String moduleId = null;

  @JsonProperty("relationships")
  @Valid
  private List<Relationship> relationships = null;

  @JsonProperty("released")
  private Boolean released = null;

  public Axiom active(Boolean active) {
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

  public Axiom axiomId(String axiomId) {
    this.axiomId = axiomId;
    return this;
  }

  /**
   * Get axiomId
   * @return axiomId
  **/
  @ApiModelProperty(value = "")


  public String getAxiomId() {
    return axiomId;
  }

  public void setAxiomId(String axiomId) {
    this.axiomId = axiomId;
  }

  public Axiom definitionStatus(String definitionStatus) {
    this.definitionStatus = definitionStatus;
    return this;
  }

  /**
   * Get definitionStatus
   * @return definitionStatus
  **/
  @ApiModelProperty(value = "")


  public String getDefinitionStatus() {
    return definitionStatus;
  }

  public void setDefinitionStatus(String definitionStatus) {
    this.definitionStatus = definitionStatus;
  }

  public Axiom definitionStatusId(String definitionStatusId) {
    this.definitionStatusId = definitionStatusId;
    return this;
  }

  /**
   * Get definitionStatusId
   * @return definitionStatusId
  **/
  @ApiModelProperty(value = "")


  public String getDefinitionStatusId() {
    return definitionStatusId;
  }

  public void setDefinitionStatusId(String definitionStatusId) {
    this.definitionStatusId = definitionStatusId;
  }

  public Axiom moduleId(String moduleId) {
    this.moduleId = moduleId;
    return this;
  }

  /**
   * Get moduleId
   * @return moduleId
  **/
  @ApiModelProperty(value = "")


  public String getModuleId() {
    return moduleId;
  }

  public void setModuleId(String moduleId) {
    this.moduleId = moduleId;
  }

  public Axiom relationships(List<Relationship> relationships) {
    this.relationships = relationships;
    return this;
  }

  public Axiom addRelationshipsItem(Relationship relationshipsItem) {
    if (this.relationships == null) {
      this.relationships = new ArrayList<Relationship>();
    }
    this.relationships.add(relationshipsItem);
    return this;
  }

  /**
   * Get relationships
   * @return relationships
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Relationship> getRelationships() {
    return relationships;
  }

  public void setRelationships(List<Relationship> relationships) {
    this.relationships = relationships;
  }

  public Axiom released(Boolean released) {
    this.released = released;
    return this;
  }

  /**
   * Get released
   * @return released
  **/
  @ApiModelProperty(value = "")


  public Boolean isReleased() {
    return released;
  }

  public void setReleased(Boolean released) {
    this.released = released;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Axiom axiom = (Axiom) o;
    return Objects.equals(this.active, axiom.active) &&
        Objects.equals(this.axiomId, axiom.axiomId) &&
        Objects.equals(this.definitionStatus, axiom.definitionStatus) &&
        Objects.equals(this.definitionStatusId, axiom.definitionStatusId) &&
        Objects.equals(this.moduleId, axiom.moduleId) &&
        Objects.equals(this.relationships, axiom.relationships) &&
        Objects.equals(this.released, axiom.released);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, axiomId, definitionStatus, definitionStatusId, moduleId, relationships, released);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Axiom {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    axiomId: ").append(toIndentedString(axiomId)).append("\n");
    sb.append("    definitionStatus: ").append(toIndentedString(definitionStatus)).append("\n");
    sb.append("    definitionStatusId: ").append(toIndentedString(definitionStatusId)).append("\n");
    sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    released: ").append(toIndentedString(released)).append("\n");
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

