package com.salaboy.snomedtest.client.swagger.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Concept
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class Concept   {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("additionalAxioms")
  @Valid
  private List<Axiom> additionalAxioms = null;

  @JsonProperty("allOwlAxiomMembers")
  @Valid
  private List<ReferenceSetMember> allOwlAxiomMembers = null;

  @JsonProperty("associationTargets")
  @Valid
  private Map<String, java.util.List> associationTargets = null;

  @JsonProperty("conceptId")
  private String conceptId = null;

  @JsonProperty("definitionStatus")
  private String definitionStatus = null;

  @JsonProperty("definitionStatusId")
  private String definitionStatusId = null;

  @JsonProperty("descriptions")
  @Valid
  private List<Description> descriptions = null;

  @JsonProperty("effectiveTime")
  private String effectiveTime = null;

  @JsonProperty("effectiveTimeI")
  private Integer effectiveTimeI = null;

  @JsonProperty("end")
  private OffsetDateTime end = null;

  @JsonProperty("fsn")
  private String fsn = null;

  @JsonProperty("gciAxioms")
  @Valid
  private List<Axiom> gciAxioms = null;

  @JsonProperty("idField")
  private String idField = null;

  @JsonProperty("inactivationIndicator")
  private String inactivationIndicator = null;

  @JsonProperty("internalId")
  private String internalId = null;

  @JsonProperty("moduleId")
  private String moduleId = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("primitive")
  private Boolean primitive = null;

  @JsonProperty("relationships")
  @Valid
  private List<Relationship> relationships = null;

  @JsonProperty("releaseHash")
  private String releaseHash = null;

  @JsonProperty("released")
  private Boolean released = null;

  @JsonProperty("releasedEffectiveTime")
  private Integer releasedEffectiveTime = null;

  @JsonProperty("start")
  private OffsetDateTime start = null;

  public Concept active(Boolean active) {
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

  public Concept additionalAxioms(List<Axiom> additionalAxioms) {
    this.additionalAxioms = additionalAxioms;
    return this;
  }

  public Concept addAdditionalAxiomsItem(Axiom additionalAxiomsItem) {
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

  public Concept allOwlAxiomMembers(List<ReferenceSetMember> allOwlAxiomMembers) {
    this.allOwlAxiomMembers = allOwlAxiomMembers;
    return this;
  }

  public Concept addAllOwlAxiomMembersItem(ReferenceSetMember allOwlAxiomMembersItem) {
    if (this.allOwlAxiomMembers == null) {
      this.allOwlAxiomMembers = new ArrayList<ReferenceSetMember>();
    }
    this.allOwlAxiomMembers.add(allOwlAxiomMembersItem);
    return this;
  }

  /**
   * Get allOwlAxiomMembers
   * @return allOwlAxiomMembers
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ReferenceSetMember> getAllOwlAxiomMembers() {
    return allOwlAxiomMembers;
  }

  public void setAllOwlAxiomMembers(List<ReferenceSetMember> allOwlAxiomMembers) {
    this.allOwlAxiomMembers = allOwlAxiomMembers;
  }

  public Concept associationTargets(Map<String, java.util.List> associationTargets) {
    this.associationTargets = associationTargets;
    return this;
  }

  public Concept putAssociationTargetsItem(String key, java.util.List associationTargetsItem) {
    if (this.associationTargets == null) {
      this.associationTargets = new HashMap<String, java.util.List>();
    }
    this.associationTargets.put(key, associationTargetsItem);
    return this;
  }

  /**
   * Get associationTargets
   * @return associationTargets
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Map<String, java.util.List> getAssociationTargets() {
    return associationTargets;
  }

  public void setAssociationTargets(Map<String, java.util.List> associationTargets) {
    this.associationTargets = associationTargets;
  }

  public Concept conceptId(String conceptId) {
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

  public Concept definitionStatus(String definitionStatus) {
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

  public Concept definitionStatusId(String definitionStatusId) {
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

  public Concept descriptions(List<Description> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public Concept addDescriptionsItem(Description descriptionsItem) {
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

  public Concept effectiveTime(String effectiveTime) {
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

  public Concept effectiveTimeI(Integer effectiveTimeI) {
    this.effectiveTimeI = effectiveTimeI;
    return this;
  }

  /**
   * Get effectiveTimeI
   * @return effectiveTimeI
  **/
  @ApiModelProperty(value = "")


  public Integer getEffectiveTimeI() {
    return effectiveTimeI;
  }

  public void setEffectiveTimeI(Integer effectiveTimeI) {
    this.effectiveTimeI = effectiveTimeI;
  }

  public Concept end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }

  public Concept fsn(String fsn) {
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

  public Concept gciAxioms(List<Axiom> gciAxioms) {
    this.gciAxioms = gciAxioms;
    return this;
  }

  public Concept addGciAxiomsItem(Axiom gciAxiomsItem) {
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

  public Concept idField(String idField) {
    this.idField = idField;
    return this;
  }

  /**
   * Get idField
   * @return idField
  **/
  @ApiModelProperty(value = "")


  public String getIdField() {
    return idField;
  }

  public void setIdField(String idField) {
    this.idField = idField;
  }

  public Concept inactivationIndicator(String inactivationIndicator) {
    this.inactivationIndicator = inactivationIndicator;
    return this;
  }

  /**
   * Get inactivationIndicator
   * @return inactivationIndicator
  **/
  @ApiModelProperty(value = "")


  public String getInactivationIndicator() {
    return inactivationIndicator;
  }

  public void setInactivationIndicator(String inactivationIndicator) {
    this.inactivationIndicator = inactivationIndicator;
  }

  public Concept internalId(String internalId) {
    this.internalId = internalId;
    return this;
  }

  /**
   * Get internalId
   * @return internalId
  **/
  @ApiModelProperty(value = "")


  public String getInternalId() {
    return internalId;
  }

  public void setInternalId(String internalId) {
    this.internalId = internalId;
  }

  public Concept moduleId(String moduleId) {
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

  public Concept path(String path) {
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

  public Concept primitive(Boolean primitive) {
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

  public Concept relationships(List<Relationship> relationships) {
    this.relationships = relationships;
    return this;
  }

  public Concept addRelationshipsItem(Relationship relationshipsItem) {
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

  public Concept releaseHash(String releaseHash) {
    this.releaseHash = releaseHash;
    return this;
  }

  /**
   * Get releaseHash
   * @return releaseHash
  **/
  @ApiModelProperty(value = "")


  public String getReleaseHash() {
    return releaseHash;
  }

  public void setReleaseHash(String releaseHash) {
    this.releaseHash = releaseHash;
  }

  public Concept released(Boolean released) {
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

  public Concept releasedEffectiveTime(Integer releasedEffectiveTime) {
    this.releasedEffectiveTime = releasedEffectiveTime;
    return this;
  }

  /**
   * Get releasedEffectiveTime
   * @return releasedEffectiveTime
  **/
  @ApiModelProperty(value = "")


  public Integer getReleasedEffectiveTime() {
    return releasedEffectiveTime;
  }

  public void setReleasedEffectiveTime(Integer releasedEffectiveTime) {
    this.releasedEffectiveTime = releasedEffectiveTime;
  }

  public Concept start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Concept concept = (Concept) o;
    return Objects.equals(this.active, concept.active) &&
        Objects.equals(this.additionalAxioms, concept.additionalAxioms) &&
        Objects.equals(this.allOwlAxiomMembers, concept.allOwlAxiomMembers) &&
        Objects.equals(this.associationTargets, concept.associationTargets) &&
        Objects.equals(this.conceptId, concept.conceptId) &&
        Objects.equals(this.definitionStatus, concept.definitionStatus) &&
        Objects.equals(this.definitionStatusId, concept.definitionStatusId) &&
        Objects.equals(this.descriptions, concept.descriptions) &&
        Objects.equals(this.effectiveTime, concept.effectiveTime) &&
        Objects.equals(this.effectiveTimeI, concept.effectiveTimeI) &&
        Objects.equals(this.end, concept.end) &&
        Objects.equals(this.fsn, concept.fsn) &&
        Objects.equals(this.gciAxioms, concept.gciAxioms) &&
        Objects.equals(this.idField, concept.idField) &&
        Objects.equals(this.inactivationIndicator, concept.inactivationIndicator) &&
        Objects.equals(this.internalId, concept.internalId) &&
        Objects.equals(this.moduleId, concept.moduleId) &&
        Objects.equals(this.path, concept.path) &&
        Objects.equals(this.primitive, concept.primitive) &&
        Objects.equals(this.relationships, concept.relationships) &&
        Objects.equals(this.releaseHash, concept.releaseHash) &&
        Objects.equals(this.released, concept.released) &&
        Objects.equals(this.releasedEffectiveTime, concept.releasedEffectiveTime) &&
        Objects.equals(this.start, concept.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, additionalAxioms, allOwlAxiomMembers, associationTargets, conceptId, definitionStatus, definitionStatusId, descriptions, effectiveTime, effectiveTimeI, end, fsn, gciAxioms, idField, inactivationIndicator, internalId, moduleId, path, primitive, relationships, releaseHash, released, releasedEffectiveTime, start);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Concept {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    additionalAxioms: ").append(toIndentedString(additionalAxioms)).append("\n");
    sb.append("    allOwlAxiomMembers: ").append(toIndentedString(allOwlAxiomMembers)).append("\n");
    sb.append("    associationTargets: ").append(toIndentedString(associationTargets)).append("\n");
    sb.append("    conceptId: ").append(toIndentedString(conceptId)).append("\n");
    sb.append("    definitionStatus: ").append(toIndentedString(definitionStatus)).append("\n");
    sb.append("    definitionStatusId: ").append(toIndentedString(definitionStatusId)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
    sb.append("    effectiveTimeI: ").append(toIndentedString(effectiveTimeI)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    fsn: ").append(toIndentedString(fsn)).append("\n");
    sb.append("    gciAxioms: ").append(toIndentedString(gciAxioms)).append("\n");
    sb.append("    idField: ").append(toIndentedString(idField)).append("\n");
    sb.append("    inactivationIndicator: ").append(toIndentedString(inactivationIndicator)).append("\n");
    sb.append("    internalId: ").append(toIndentedString(internalId)).append("\n");
    sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    primitive: ").append(toIndentedString(primitive)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    releaseHash: ").append(toIndentedString(releaseHash)).append("\n");
    sb.append("    released: ").append(toIndentedString(released)).append("\n");
    sb.append("    releasedEffectiveTime: ").append(toIndentedString(releasedEffectiveTime)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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

