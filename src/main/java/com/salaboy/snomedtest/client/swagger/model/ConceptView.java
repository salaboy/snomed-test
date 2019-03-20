package com.salaboy.snomedtest.client.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ConceptView
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class ConceptView   {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("additionalAxioms")
  @Valid
  private List<Axiom> additionalAxioms = null;

  @JsonProperty("conceptId")
  private String conceptId = null;

  @JsonProperty("definitionStatusId")
  private String definitionStatusId = null;

  @JsonProperty("descriptions")
  @Valid
  private List<Description> descriptions = null;

  @JsonProperty("effectiveTime")
  private String effectiveTime = null;

  @JsonProperty("fsn")
  private String fsn = null;

  @JsonProperty("gciAxioms")
  @Valid
  private List<Axiom> gciAxioms = null;

  @JsonProperty("moduleId")
  private String moduleId = null;

  @JsonProperty("relationships")
  @Valid
  private List<Relationship> relationships = null;

  public ConceptView active(Boolean active) {
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

  public ConceptView additionalAxioms(List<Axiom> additionalAxioms) {
    this.additionalAxioms = additionalAxioms;
    return this;
  }

  public ConceptView addAdditionalAxiomsItem(Axiom additionalAxiomsItem) {
    if (this.additionalAxioms == null) {
      this.additionalAxioms = new ArrayList<Axiom>();
    }
    this.additionalAxioms.add(additionalAxiomsItem);
    return this;
  }

  /**
   * Get additionalAxioms
   * @return additionalAxioms
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Axiom> getAdditionalAxioms() {
    return additionalAxioms;
  }

  public void setAdditionalAxioms(List<Axiom> additionalAxioms) {
    this.additionalAxioms = additionalAxioms;
  }

  public ConceptView conceptId(String conceptId) {
    this.conceptId = conceptId;
    return this;
  }

  /**
   * Get conceptId
   * @return conceptId
  **/
  @ApiModelProperty(value = "")


  public String getConceptId() {
    return conceptId;
  }

  public void setConceptId(String conceptId) {
    this.conceptId = conceptId;
  }

  public ConceptView definitionStatusId(String definitionStatusId) {
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

  public ConceptView descriptions(List<Description> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public ConceptView addDescriptionsItem(Description descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<Description>();
    }
    this.descriptions.add(descriptionsItem);
    return this;
  }

  /**
   * Get descriptions
   * @return descriptions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Description> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<Description> descriptions) {
    this.descriptions = descriptions;
  }

  public ConceptView effectiveTime(String effectiveTime) {
    this.effectiveTime = effectiveTime;
    return this;
  }

  /**
   * Get effectiveTime
   * @return effectiveTime
  **/
  @ApiModelProperty(value = "")


  public String getEffectiveTime() {
    return effectiveTime;
  }

  public void setEffectiveTime(String effectiveTime) {
    this.effectiveTime = effectiveTime;
  }

  public ConceptView fsn(String fsn) {
    this.fsn = fsn;
    return this;
  }

  /**
   * Get fsn
   * @return fsn
  **/
  @ApiModelProperty(value = "")


  public String getFsn() {
    return fsn;
  }

  public void setFsn(String fsn) {
    this.fsn = fsn;
  }

  public ConceptView gciAxioms(List<Axiom> gciAxioms) {
    this.gciAxioms = gciAxioms;
    return this;
  }

  public ConceptView addGciAxiomsItem(Axiom gciAxiomsItem) {
    if (this.gciAxioms == null) {
      this.gciAxioms = new ArrayList<Axiom>();
    }
    this.gciAxioms.add(gciAxiomsItem);
    return this;
  }

  /**
   * Get gciAxioms
   * @return gciAxioms
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Axiom> getGciAxioms() {
    return gciAxioms;
  }

  public void setGciAxioms(List<Axiom> gciAxioms) {
    this.gciAxioms = gciAxioms;
  }

  public ConceptView moduleId(String moduleId) {
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

  public ConceptView relationships(List<Relationship> relationships) {
    this.relationships = relationships;
    return this;
  }

  public ConceptView addRelationshipsItem(Relationship relationshipsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConceptView conceptView = (ConceptView) o;
    return Objects.equals(this.active, conceptView.active) &&
        Objects.equals(this.additionalAxioms, conceptView.additionalAxioms) &&
        Objects.equals(this.conceptId, conceptView.conceptId) &&
        Objects.equals(this.definitionStatusId, conceptView.definitionStatusId) &&
        Objects.equals(this.descriptions, conceptView.descriptions) &&
        Objects.equals(this.effectiveTime, conceptView.effectiveTime) &&
        Objects.equals(this.fsn, conceptView.fsn) &&
        Objects.equals(this.gciAxioms, conceptView.gciAxioms) &&
        Objects.equals(this.moduleId, conceptView.moduleId) &&
        Objects.equals(this.relationships, conceptView.relationships);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, additionalAxioms, conceptId, definitionStatusId, descriptions, effectiveTime, fsn, gciAxioms, moduleId, relationships);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConceptView {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    additionalAxioms: ").append(toIndentedString(additionalAxioms)).append("\n");
    sb.append("    conceptId: ").append(toIndentedString(conceptId)).append("\n");
    sb.append("    definitionStatusId: ").append(toIndentedString(definitionStatusId)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
    sb.append("    fsn: ").append(toIndentedString(fsn)).append("\n");
    sb.append("    gciAxioms: ").append(toIndentedString(gciAxioms)).append("\n");
    sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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

