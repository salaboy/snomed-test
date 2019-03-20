package com.salaboy.snomedtest.client.swagger.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ReferenceSetMember
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class ReferenceSetMember   {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("additionalFields")
  @Valid
  private Map<String, String> additionalFields = null;

  @JsonProperty("conceptId")
  private String conceptId = null;

  @JsonProperty("effectiveTime")
  private String effectiveTime = null;

  @JsonProperty("effectiveTimeI")
  private Integer effectiveTimeI = null;

  @JsonProperty("end")
  private OffsetDateTime end = null;

  @JsonProperty("idField")
  private String idField = null;

  @JsonProperty("internalId")
  private String internalId = null;

  @JsonProperty("memberId")
  private String memberId = null;

  @JsonProperty("moduleId")
  private String moduleId = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("referencedComponent")
  private ConceptMini referencedComponent = null;

  @JsonProperty("referencedComponentId")
  private String referencedComponentId = null;

  @JsonProperty("refsetId")
  private String refsetId = null;

  @JsonProperty("releaseHash")
  private String releaseHash = null;

  @JsonProperty("released")
  private Boolean released = null;

  @JsonProperty("releasedEffectiveTime")
  private Integer releasedEffectiveTime = null;

  @JsonProperty("start")
  private OffsetDateTime start = null;

  public ReferenceSetMember active(Boolean active) {
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

  public ReferenceSetMember additionalFields(Map<String, String> additionalFields) {
    this.additionalFields = additionalFields;
    return this;
  }

  public ReferenceSetMember putAdditionalFieldsItem(String key, String additionalFieldsItem) {
    if (this.additionalFields == null) {
      this.additionalFields = new HashMap<String, String>();
    }
    this.additionalFields.put(key, additionalFieldsItem);
    return this;
  }

  /**
   * Get additionalFields
   * @return additionalFields
  **/
  @ApiModelProperty(value = "")


  public Map<String, String> getAdditionalFields() {
    return additionalFields;
  }

  public void setAdditionalFields(Map<String, String> additionalFields) {
    this.additionalFields = additionalFields;
  }

  public ReferenceSetMember conceptId(String conceptId) {
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

  public ReferenceSetMember effectiveTime(String effectiveTime) {
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

  public ReferenceSetMember effectiveTimeI(Integer effectiveTimeI) {
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

  public ReferenceSetMember end(OffsetDateTime end) {
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

  public ReferenceSetMember idField(String idField) {
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

  public ReferenceSetMember internalId(String internalId) {
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

  public ReferenceSetMember memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

  /**
   * Get memberId
   * @return memberId
  **/
  @ApiModelProperty(value = "")


  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public ReferenceSetMember moduleId(String moduleId) {
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

  public ReferenceSetMember path(String path) {
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

  public ReferenceSetMember referencedComponent(ConceptMini referencedComponent) {
    this.referencedComponent = referencedComponent;
    return this;
  }

  /**
   * Get referencedComponent
   * @return referencedComponent
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConceptMini getReferencedComponent() {
    return referencedComponent;
  }

  public void setReferencedComponent(ConceptMini referencedComponent) {
    this.referencedComponent = referencedComponent;
  }

  public ReferenceSetMember referencedComponentId(String referencedComponentId) {
    this.referencedComponentId = referencedComponentId;
    return this;
  }

  /**
   * Get referencedComponentId
   * @return referencedComponentId
  **/
  @ApiModelProperty(value = "")


  public String getReferencedComponentId() {
    return referencedComponentId;
  }

  public void setReferencedComponentId(String referencedComponentId) {
    this.referencedComponentId = referencedComponentId;
  }

  public ReferenceSetMember refsetId(String refsetId) {
    this.refsetId = refsetId;
    return this;
  }

  /**
   * Get refsetId
   * @return refsetId
  **/
  @ApiModelProperty(value = "")


  public String getRefsetId() {
    return refsetId;
  }

  public void setRefsetId(String refsetId) {
    this.refsetId = refsetId;
  }

  public ReferenceSetMember releaseHash(String releaseHash) {
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

  public ReferenceSetMember released(Boolean released) {
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

  public ReferenceSetMember releasedEffectiveTime(Integer releasedEffectiveTime) {
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

  public ReferenceSetMember start(OffsetDateTime start) {
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
    ReferenceSetMember referenceSetMember = (ReferenceSetMember) o;
    return Objects.equals(this.active, referenceSetMember.active) &&
        Objects.equals(this.additionalFields, referenceSetMember.additionalFields) &&
        Objects.equals(this.conceptId, referenceSetMember.conceptId) &&
        Objects.equals(this.effectiveTime, referenceSetMember.effectiveTime) &&
        Objects.equals(this.effectiveTimeI, referenceSetMember.effectiveTimeI) &&
        Objects.equals(this.end, referenceSetMember.end) &&
        Objects.equals(this.idField, referenceSetMember.idField) &&
        Objects.equals(this.internalId, referenceSetMember.internalId) &&
        Objects.equals(this.memberId, referenceSetMember.memberId) &&
        Objects.equals(this.moduleId, referenceSetMember.moduleId) &&
        Objects.equals(this.path, referenceSetMember.path) &&
        Objects.equals(this.referencedComponent, referenceSetMember.referencedComponent) &&
        Objects.equals(this.referencedComponentId, referenceSetMember.referencedComponentId) &&
        Objects.equals(this.refsetId, referenceSetMember.refsetId) &&
        Objects.equals(this.releaseHash, referenceSetMember.releaseHash) &&
        Objects.equals(this.released, referenceSetMember.released) &&
        Objects.equals(this.releasedEffectiveTime, referenceSetMember.releasedEffectiveTime) &&
        Objects.equals(this.start, referenceSetMember.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, additionalFields, conceptId, effectiveTime, effectiveTimeI, end, idField, internalId, memberId, moduleId, path, referencedComponent, referencedComponentId, refsetId, releaseHash, released, releasedEffectiveTime, start);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceSetMember {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    additionalFields: ").append(toIndentedString(additionalFields)).append("\n");
    sb.append("    conceptId: ").append(toIndentedString(conceptId)).append("\n");
    sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
    sb.append("    effectiveTimeI: ").append(toIndentedString(effectiveTimeI)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    idField: ").append(toIndentedString(idField)).append("\n");
    sb.append("    internalId: ").append(toIndentedString(internalId)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    referencedComponent: ").append(toIndentedString(referencedComponent)).append("\n");
    sb.append("    referencedComponentId: ").append(toIndentedString(referencedComponentId)).append("\n");
    sb.append("    refsetId: ").append(toIndentedString(refsetId)).append("\n");
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

