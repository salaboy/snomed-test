package com.salaboy.snomedtest.client.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * RelationshipChange
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class RelationshipChange   {
  @JsonProperty("active")
  private Boolean active = null;

  /**
   * Gets or Sets changeNature
   */
  public enum ChangeNatureEnum {
    INFERRED("INFERRED"),
    
    REDUNDANT("REDUNDANT");

    private String value;

    ChangeNatureEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ChangeNatureEnum fromValue(String text) {
      for (ChangeNatureEnum b : ChangeNatureEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("changeNature")
  private ChangeNatureEnum changeNature = null;

  @JsonProperty("characteristicTypeId")
  private String characteristicTypeId = null;

  @JsonProperty("classificationId")
  private String classificationId = null;

  @JsonProperty("destination")
  private ConceptMini destination = null;

  @JsonProperty("destinationFsn")
  private String destinationFsn = null;

  @JsonProperty("destinationId")
  private String destinationId = null;

  @JsonProperty("group")
  private Integer group = null;

  @JsonProperty("internalId")
  private String internalId = null;

  @JsonProperty("modifierId")
  private String modifierId = null;

  @JsonProperty("relationshipId")
  private String relationshipId = null;

  @JsonProperty("source")
  private ConceptMini source = null;

  @JsonProperty("sourceFsn")
  private String sourceFsn = null;

  @JsonProperty("sourceId")
  private String sourceId = null;

  @JsonProperty("type")
  private ConceptMini type = null;

  @JsonProperty("typeFsn")
  private String typeFsn = null;

  @JsonProperty("typeId")
  private String typeId = null;

  @JsonProperty("unionGroup")
  private Integer unionGroup = null;

  public RelationshipChange active(Boolean active) {
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

  public RelationshipChange changeNature(ChangeNatureEnum changeNature) {
    this.changeNature = changeNature;
    return this;
  }

  /**
   * Get changeNature
   * @return changeNature
  **/
  @ApiModelProperty(value = "")


  public ChangeNatureEnum getChangeNature() {
    return changeNature;
  }

  public void setChangeNature(ChangeNatureEnum changeNature) {
    this.changeNature = changeNature;
  }

  public RelationshipChange characteristicTypeId(String characteristicTypeId) {
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

  public RelationshipChange classificationId(String classificationId) {
    this.classificationId = classificationId;
    return this;
  }

  /**
   * Get classificationId
   * @return classificationId
  **/
  @ApiModelProperty(value = "")


  public String getClassificationId() {
    return classificationId;
  }

  public void setClassificationId(String classificationId) {
    this.classificationId = classificationId;
  }

  public RelationshipChange destination(ConceptMini destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Get destination
   * @return destination
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConceptMini getDestination() {
    return destination;
  }

  public void setDestination(ConceptMini destination) {
    this.destination = destination;
  }

  public RelationshipChange destinationFsn(String destinationFsn) {
    this.destinationFsn = destinationFsn;
    return this;
  }

  /**
   * Get destinationFsn
   * @return destinationFsn
  **/
  @ApiModelProperty(value = "")


  public String getDestinationFsn() {
    return destinationFsn;
  }

  public void setDestinationFsn(String destinationFsn) {
    this.destinationFsn = destinationFsn;
  }

  public RelationshipChange destinationId(String destinationId) {
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

  public RelationshipChange group(Integer group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(value = "")


  public Integer getGroup() {
    return group;
  }

  public void setGroup(Integer group) {
    this.group = group;
  }

  public RelationshipChange internalId(String internalId) {
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

  public RelationshipChange modifierId(String modifierId) {
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

  public RelationshipChange relationshipId(String relationshipId) {
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

  public RelationshipChange source(ConceptMini source) {
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

  public RelationshipChange sourceFsn(String sourceFsn) {
    this.sourceFsn = sourceFsn;
    return this;
  }

  /**
   * Get sourceFsn
   * @return sourceFsn
  **/
  @ApiModelProperty(value = "")


  public String getSourceFsn() {
    return sourceFsn;
  }

  public void setSourceFsn(String sourceFsn) {
    this.sourceFsn = sourceFsn;
  }

  public RelationshipChange sourceId(String sourceId) {
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

  public RelationshipChange type(ConceptMini type) {
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

  public RelationshipChange typeFsn(String typeFsn) {
    this.typeFsn = typeFsn;
    return this;
  }

  /**
   * Get typeFsn
   * @return typeFsn
  **/
  @ApiModelProperty(value = "")


  public String getTypeFsn() {
    return typeFsn;
  }

  public void setTypeFsn(String typeFsn) {
    this.typeFsn = typeFsn;
  }

  public RelationshipChange typeId(String typeId) {
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

  public RelationshipChange unionGroup(Integer unionGroup) {
    this.unionGroup = unionGroup;
    return this;
  }

  /**
   * Get unionGroup
   * @return unionGroup
  **/
  @ApiModelProperty(value = "")


  public Integer getUnionGroup() {
    return unionGroup;
  }

  public void setUnionGroup(Integer unionGroup) {
    this.unionGroup = unionGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationshipChange relationshipChange = (RelationshipChange) o;
    return Objects.equals(this.active, relationshipChange.active) &&
        Objects.equals(this.changeNature, relationshipChange.changeNature) &&
        Objects.equals(this.characteristicTypeId, relationshipChange.characteristicTypeId) &&
        Objects.equals(this.classificationId, relationshipChange.classificationId) &&
        Objects.equals(this.destination, relationshipChange.destination) &&
        Objects.equals(this.destinationFsn, relationshipChange.destinationFsn) &&
        Objects.equals(this.destinationId, relationshipChange.destinationId) &&
        Objects.equals(this.group, relationshipChange.group) &&
        Objects.equals(this.internalId, relationshipChange.internalId) &&
        Objects.equals(this.modifierId, relationshipChange.modifierId) &&
        Objects.equals(this.relationshipId, relationshipChange.relationshipId) &&
        Objects.equals(this.source, relationshipChange.source) &&
        Objects.equals(this.sourceFsn, relationshipChange.sourceFsn) &&
        Objects.equals(this.sourceId, relationshipChange.sourceId) &&
        Objects.equals(this.type, relationshipChange.type) &&
        Objects.equals(this.typeFsn, relationshipChange.typeFsn) &&
        Objects.equals(this.typeId, relationshipChange.typeId) &&
        Objects.equals(this.unionGroup, relationshipChange.unionGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, changeNature, characteristicTypeId, classificationId, destination, destinationFsn, destinationId, group, internalId, modifierId, relationshipId, source, sourceFsn, sourceId, type, typeFsn, typeId, unionGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationshipChange {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    changeNature: ").append(toIndentedString(changeNature)).append("\n");
    sb.append("    characteristicTypeId: ").append(toIndentedString(characteristicTypeId)).append("\n");
    sb.append("    classificationId: ").append(toIndentedString(classificationId)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    destinationFsn: ").append(toIndentedString(destinationFsn)).append("\n");
    sb.append("    destinationId: ").append(toIndentedString(destinationId)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    internalId: ").append(toIndentedString(internalId)).append("\n");
    sb.append("    modifierId: ").append(toIndentedString(modifierId)).append("\n");
    sb.append("    relationshipId: ").append(toIndentedString(relationshipId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceFsn: ").append(toIndentedString(sourceFsn)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeFsn: ").append(toIndentedString(typeFsn)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    unionGroup: ").append(toIndentedString(unionGroup)).append("\n");
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

