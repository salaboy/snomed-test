package com.salaboy.snomedtest.client.swagger.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Relationship
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class Relationship   {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("characteristicType")
  private String characteristicType = null;

  @JsonProperty("characteristicTypeId")
  private String characteristicTypeId = null;

  @JsonProperty("destinationId")
  private String destinationId = null;

  @JsonProperty("effectiveTime")
  private String effectiveTime = null;

  @JsonProperty("effectiveTimeI")
  private Integer effectiveTimeI = null;

  @JsonProperty("end")
  private OffsetDateTime end = null;

  @JsonProperty("groupId")
  private Integer groupId = null;

  @JsonProperty("grouped")
  private Boolean grouped = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("idField")
  private String idField = null;

  @JsonProperty("internalId")
  private String internalId = null;

  @JsonProperty("modifier")
  private String modifier = null;

  @JsonProperty("modifierId")
  private String modifierId = null;

  @JsonProperty("moduleId")
  private String moduleId = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("relationshipGroup")
  private Integer relationshipGroup = null;

  @JsonProperty("relationshipId")
  private String relationshipId = null;

  @JsonProperty("releaseHash")
  private String releaseHash = null;

  @JsonProperty("released")
  private Boolean released = null;

  @JsonProperty("releasedEffectiveTime")
  private Integer releasedEffectiveTime = null;

  @JsonProperty("source")
  private ConceptMini source = null;

  @JsonProperty("sourceId")
  private String sourceId = null;

  @JsonProperty("start")
  private OffsetDateTime start = null;

  @JsonProperty("target")
  private ConceptMini target = null;

  @JsonProperty("type")
  private ConceptMini type = null;

  @JsonProperty("typeId")
  private String typeId = null;

  public Relationship active(Boolean active) {
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

  public Relationship characteristicType(String characteristicType) {
    this.characteristicType = characteristicType;
    return this;
  }

  /**
   * Get characteristicType
   * @return characteristicType
  **/
  @ApiModelProperty(value = "")


  public String getCharacteristicType() {
    return characteristicType;
  }

  public void setCharacteristicType(String characteristicType) {
    this.characteristicType = characteristicType;
  }

  public Relationship characteristicTypeId(String characteristicTypeId) {
    this.characteristicTypeId = characteristicTypeId;
    return this;
  }

  /**
   * Get characteristicTypeId
   * @return characteristicTypeId
  **/
  @ApiModelProperty(value = "")


  public String getCharacteristicTypeId() {
    return characteristicTypeId;
  }

  public void setCharacteristicTypeId(String characteristicTypeId) {
    this.characteristicTypeId = characteristicTypeId;
  }

  public Relationship destinationId(String destinationId) {
    this.destinationId = destinationId;
    return this;
  }

  /**
   * Get destinationId
   * @return destinationId
  **/
  @ApiModelProperty(value = "")


  public String getDestinationId() {
    return destinationId;
  }

  public void setDestinationId(String destinationId) {
    this.destinationId = destinationId;
  }

  public Relationship effectiveTime(String effectiveTime) {
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

  public Relationship effectiveTimeI(Integer effectiveTimeI) {
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

  public Relationship end(OffsetDateTime end) {
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

  public Relationship groupId(Integer groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   * @return groupId
  **/
  @ApiModelProperty(value = "")


  public Integer getGroupId() {
    return groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }

  public Relationship grouped(Boolean grouped) {
    this.grouped = grouped;
    return this;
  }

  /**
   * Get grouped
   * @return grouped
  **/
  @ApiModelProperty(value = "")


  public Boolean isGrouped() {
    return grouped;
  }

  public void setGrouped(Boolean grouped) {
    this.grouped = grouped;
  }

  public Relationship id(String id) {
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

  public Relationship idField(String idField) {
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

  public Relationship internalId(String internalId) {
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

  public Relationship modifier(String modifier) {
    this.modifier = modifier;
    return this;
  }

  /**
   * Get modifier
   * @return modifier
  **/
  @ApiModelProperty(value = "")


  public String getModifier() {
    return modifier;
  }

  public void setModifier(String modifier) {
    this.modifier = modifier;
  }

  public Relationship modifierId(String modifierId) {
    this.modifierId = modifierId;
    return this;
  }

  /**
   * Get modifierId
   * @return modifierId
  **/
  @ApiModelProperty(value = "")


  public String getModifierId() {
    return modifierId;
  }

  public void setModifierId(String modifierId) {
    this.modifierId = modifierId;
  }

  public Relationship moduleId(String moduleId) {
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

  public Relationship path(String path) {
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

  public Relationship relationshipGroup(Integer relationshipGroup) {
    this.relationshipGroup = relationshipGroup;
    return this;
  }

  /**
   * Get relationshipGroup
   * @return relationshipGroup
  **/
  @ApiModelProperty(value = "")


  public Integer getRelationshipGroup() {
    return relationshipGroup;
  }

  public void setRelationshipGroup(Integer relationshipGroup) {
    this.relationshipGroup = relationshipGroup;
  }

  public Relationship relationshipId(String relationshipId) {
    this.relationshipId = relationshipId;
    return this;
  }

  /**
   * Get relationshipId
   * @return relationshipId
  **/
  @ApiModelProperty(value = "")


  public String getRelationshipId() {
    return relationshipId;
  }

  public void setRelationshipId(String relationshipId) {
    this.relationshipId = relationshipId;
  }

  public Relationship releaseHash(String releaseHash) {
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

  public Relationship released(Boolean released) {
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

  public Relationship releasedEffectiveTime(Integer releasedEffectiveTime) {
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

  public Relationship source(ConceptMini source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConceptMini getSource() {
    return source;
  }

  public void setSource(ConceptMini source) {
    this.source = source;
  }

  public Relationship sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

  /**
   * Get sourceId
   * @return sourceId
  **/
  @ApiModelProperty(value = "")


  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public Relationship start(OffsetDateTime start) {
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

  public Relationship target(ConceptMini target) {
    this.target = target;
    return this;
  }

  /**
   * Get target
   * @return target
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConceptMini getTarget() {
    return target;
  }

  public void setTarget(ConceptMini target) {
    this.target = target;
  }

  public Relationship type(ConceptMini type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConceptMini getType() {
    return type;
  }

  public void setType(ConceptMini type) {
    this.type = type;
  }

  public Relationship typeId(String typeId) {
    this.typeId = typeId;
    return this;
  }

  /**
   * Get typeId
   * @return typeId
  **/
  @ApiModelProperty(value = "")


  public String getTypeId() {
    return typeId;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Relationship relationship = (Relationship) o;
    return Objects.equals(this.active, relationship.active) &&
        Objects.equals(this.characteristicType, relationship.characteristicType) &&
        Objects.equals(this.characteristicTypeId, relationship.characteristicTypeId) &&
        Objects.equals(this.destinationId, relationship.destinationId) &&
        Objects.equals(this.effectiveTime, relationship.effectiveTime) &&
        Objects.equals(this.effectiveTimeI, relationship.effectiveTimeI) &&
        Objects.equals(this.end, relationship.end) &&
        Objects.equals(this.groupId, relationship.groupId) &&
        Objects.equals(this.grouped, relationship.grouped) &&
        Objects.equals(this.id, relationship.id) &&
        Objects.equals(this.idField, relationship.idField) &&
        Objects.equals(this.internalId, relationship.internalId) &&
        Objects.equals(this.modifier, relationship.modifier) &&
        Objects.equals(this.modifierId, relationship.modifierId) &&
        Objects.equals(this.moduleId, relationship.moduleId) &&
        Objects.equals(this.path, relationship.path) &&
        Objects.equals(this.relationshipGroup, relationship.relationshipGroup) &&
        Objects.equals(this.relationshipId, relationship.relationshipId) &&
        Objects.equals(this.releaseHash, relationship.releaseHash) &&
        Objects.equals(this.released, relationship.released) &&
        Objects.equals(this.releasedEffectiveTime, relationship.releasedEffectiveTime) &&
        Objects.equals(this.source, relationship.source) &&
        Objects.equals(this.sourceId, relationship.sourceId) &&
        Objects.equals(this.start, relationship.start) &&
        Objects.equals(this.target, relationship.target) &&
        Objects.equals(this.type, relationship.type) &&
        Objects.equals(this.typeId, relationship.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, characteristicType, characteristicTypeId, destinationId, effectiveTime, effectiveTimeI, end, groupId, grouped, id, idField, internalId, modifier, modifierId, moduleId, path, relationshipGroup, relationshipId, releaseHash, released, releasedEffectiveTime, source, sourceId, start, target, type, typeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Relationship {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    characteristicType: ").append(toIndentedString(characteristicType)).append("\n");
    sb.append("    characteristicTypeId: ").append(toIndentedString(characteristicTypeId)).append("\n");
    sb.append("    destinationId: ").append(toIndentedString(destinationId)).append("\n");
    sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
    sb.append("    effectiveTimeI: ").append(toIndentedString(effectiveTimeI)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    grouped: ").append(toIndentedString(grouped)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idField: ").append(toIndentedString(idField)).append("\n");
    sb.append("    internalId: ").append(toIndentedString(internalId)).append("\n");
    sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
    sb.append("    modifierId: ").append(toIndentedString(modifierId)).append("\n");
    sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    relationshipGroup: ").append(toIndentedString(relationshipGroup)).append("\n");
    sb.append("    relationshipId: ").append(toIndentedString(relationshipId)).append("\n");
    sb.append("    releaseHash: ").append(toIndentedString(releaseHash)).append("\n");
    sb.append("    released: ").append(toIndentedString(released)).append("\n");
    sb.append("    releasedEffectiveTime: ").append(toIndentedString(releasedEffectiveTime)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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

