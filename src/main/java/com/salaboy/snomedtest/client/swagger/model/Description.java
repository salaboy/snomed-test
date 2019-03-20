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
 * Description
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class Description   {
  @JsonProperty("acceptabilityMap")
  @Valid
  private Map<String, String> acceptabilityMap = null;

  @JsonProperty("acceptabilityMapFromLangRefsetMembers")
  @Valid
  private Map<String, String> acceptabilityMapFromLangRefsetMembers = null;

  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("associationTargets")
  @Valid
  private Map<String, java.util.List> associationTargets = null;

  @JsonProperty("caseSignificance")
  private String caseSignificance = null;

  @JsonProperty("caseSignificanceId")
  private String caseSignificanceId = null;

  @JsonProperty("conceptId")
  private String conceptId = null;

  @JsonProperty("descriptionId")
  private String descriptionId = null;

  @JsonProperty("effectiveTime")
  private String effectiveTime = null;

  @JsonProperty("effectiveTimeI")
  private Integer effectiveTimeI = null;

  @JsonProperty("end")
  private OffsetDateTime end = null;

  @JsonProperty("idField")
  private String idField = null;

  @JsonProperty("inactivationIndicator")
  private String inactivationIndicator = null;

  @JsonProperty("internalId")
  private String internalId = null;

  @JsonProperty("lang")
  private String lang = null;

  @JsonProperty("languageCode")
  private String languageCode = null;

  @JsonProperty("moduleId")
  private String moduleId = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("releaseHash")
  private String releaseHash = null;

  @JsonProperty("released")
  private Boolean released = null;

  @JsonProperty("releasedEffectiveTime")
  private Integer releasedEffectiveTime = null;

  @JsonProperty("start")
  private OffsetDateTime start = null;

  @JsonProperty("tag")
  private String tag = null;

  @JsonProperty("term")
  private String term = null;

  @JsonProperty("termLen")
  private Integer termLen = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("typeId")
  private String typeId = null;

  public Description acceptabilityMap(Map<String, String> acceptabilityMap) {
    this.acceptabilityMap = acceptabilityMap;
    return this;
  }

  public Description putAcceptabilityMapItem(String key, String acceptabilityMapItem) {
    if (this.acceptabilityMap == null) {
      this.acceptabilityMap = new HashMap<String, String>();
    }
    this.acceptabilityMap.put(key, acceptabilityMapItem);
    return this;
  }

  /**
   * Get acceptabilityMap
   * @return acceptabilityMap
  **/
  @ApiModelProperty(value = "")


  public Map<String, String> getAcceptabilityMap() {
    return acceptabilityMap;
  }

  public void setAcceptabilityMap(Map<String, String> acceptabilityMap) {
    this.acceptabilityMap = acceptabilityMap;
  }

  public Description acceptabilityMapFromLangRefsetMembers(Map<String, String> acceptabilityMapFromLangRefsetMembers) {
    this.acceptabilityMapFromLangRefsetMembers = acceptabilityMapFromLangRefsetMembers;
    return this;
  }

  public Description putAcceptabilityMapFromLangRefsetMembersItem(String key, String acceptabilityMapFromLangRefsetMembersItem) {
    if (this.acceptabilityMapFromLangRefsetMembers == null) {
      this.acceptabilityMapFromLangRefsetMembers = new HashMap<String, String>();
    }
    this.acceptabilityMapFromLangRefsetMembers.put(key, acceptabilityMapFromLangRefsetMembersItem);
    return this;
  }

  /**
   * Get acceptabilityMapFromLangRefsetMembers
   * @return acceptabilityMapFromLangRefsetMembers
  **/
  @ApiModelProperty(value = "")


  public Map<String, String> getAcceptabilityMapFromLangRefsetMembers() {
    return acceptabilityMapFromLangRefsetMembers;
  }

  public void setAcceptabilityMapFromLangRefsetMembers(Map<String, String> acceptabilityMapFromLangRefsetMembers) {
    this.acceptabilityMapFromLangRefsetMembers = acceptabilityMapFromLangRefsetMembers;
  }

  public Description active(Boolean active) {
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

  public Description associationTargets(Map<String, java.util.List> associationTargets) {
    this.associationTargets = associationTargets;
    return this;
  }

  public Description putAssociationTargetsItem(String key, java.util.List associationTargetsItem) {
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

  public Description caseSignificance(String caseSignificance) {
    this.caseSignificance = caseSignificance;
    return this;
  }

  /**
   * Get caseSignificance
   * @return caseSignificance
  **/
  @ApiModelProperty(value = "")


  public String getCaseSignificance() {
    return caseSignificance;
  }

  public void setCaseSignificance(String caseSignificance) {
    this.caseSignificance = caseSignificance;
  }

  public Description caseSignificanceId(String caseSignificanceId) {
    this.caseSignificanceId = caseSignificanceId;
    return this;
  }

  /**
   * Get caseSignificanceId
   * @return caseSignificanceId
  **/
  @ApiModelProperty(value = "")


  public String getCaseSignificanceId() {
    return caseSignificanceId;
  }

  public void setCaseSignificanceId(String caseSignificanceId) {
    this.caseSignificanceId = caseSignificanceId;
  }

  public Description conceptId(String conceptId) {
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

  public Description descriptionId(String descriptionId) {
    this.descriptionId = descriptionId;
    return this;
  }

  /**
   * Get descriptionId
   * @return descriptionId
  **/
  @ApiModelProperty(value = "")


  public String getDescriptionId() {
    return descriptionId;
  }

  public void setDescriptionId(String descriptionId) {
    this.descriptionId = descriptionId;
  }

  public Description effectiveTime(String effectiveTime) {
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

  public Description effectiveTimeI(Integer effectiveTimeI) {
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

  public Description end(OffsetDateTime end) {
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

  public Description idField(String idField) {
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

  public Description inactivationIndicator(String inactivationIndicator) {
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

  public Description internalId(String internalId) {
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

  public Description lang(String lang) {
    this.lang = lang;
    return this;
  }

  /**
   * Get lang
   * @return lang
  **/
  @ApiModelProperty(value = "")


  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public Description languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Get languageCode
   * @return languageCode
  **/
  @ApiModelProperty(value = "")


  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  public Description moduleId(String moduleId) {
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

  public Description path(String path) {
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

  public Description releaseHash(String releaseHash) {
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

  public Description released(Boolean released) {
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

  public Description releasedEffectiveTime(Integer releasedEffectiveTime) {
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

  public Description start(OffsetDateTime start) {
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

  public Description tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   * @return tag
  **/
  @ApiModelProperty(value = "")


  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public Description term(String term) {
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

  public Description termLen(Integer termLen) {
    this.termLen = termLen;
    return this;
  }

  /**
   * Get termLen
   * @return termLen
  **/
  @ApiModelProperty(value = "")


  public Integer getTermLen() {
    return termLen;
  }

  public void setTermLen(Integer termLen) {
    this.termLen = termLen;
  }

  public Description type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Description typeId(String typeId) {
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
    Description description = (Description) o;
    return Objects.equals(this.acceptabilityMap, description.acceptabilityMap) &&
        Objects.equals(this.acceptabilityMapFromLangRefsetMembers, description.acceptabilityMapFromLangRefsetMembers) &&
        Objects.equals(this.active, description.active) &&
        Objects.equals(this.associationTargets, description.associationTargets) &&
        Objects.equals(this.caseSignificance, description.caseSignificance) &&
        Objects.equals(this.caseSignificanceId, description.caseSignificanceId) &&
        Objects.equals(this.conceptId, description.conceptId) &&
        Objects.equals(this.descriptionId, description.descriptionId) &&
        Objects.equals(this.effectiveTime, description.effectiveTime) &&
        Objects.equals(this.effectiveTimeI, description.effectiveTimeI) &&
        Objects.equals(this.end, description.end) &&
        Objects.equals(this.idField, description.idField) &&
        Objects.equals(this.inactivationIndicator, description.inactivationIndicator) &&
        Objects.equals(this.internalId, description.internalId) &&
        Objects.equals(this.lang, description.lang) &&
        Objects.equals(this.languageCode, description.languageCode) &&
        Objects.equals(this.moduleId, description.moduleId) &&
        Objects.equals(this.path, description.path) &&
        Objects.equals(this.releaseHash, description.releaseHash) &&
        Objects.equals(this.released, description.released) &&
        Objects.equals(this.releasedEffectiveTime, description.releasedEffectiveTime) &&
        Objects.equals(this.start, description.start) &&
        Objects.equals(this.tag, description.tag) &&
        Objects.equals(this.term, description.term) &&
        Objects.equals(this.termLen, description.termLen) &&
        Objects.equals(this.type, description.type) &&
        Objects.equals(this.typeId, description.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptabilityMap, acceptabilityMapFromLangRefsetMembers, active, associationTargets, caseSignificance, caseSignificanceId, conceptId, descriptionId, effectiveTime, effectiveTimeI, end, idField, inactivationIndicator, internalId, lang, languageCode, moduleId, path, releaseHash, released, releasedEffectiveTime, start, tag, term, termLen, type, typeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Description {\n");
    
    sb.append("    acceptabilityMap: ").append(toIndentedString(acceptabilityMap)).append("\n");
    sb.append("    acceptabilityMapFromLangRefsetMembers: ").append(toIndentedString(acceptabilityMapFromLangRefsetMembers)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    associationTargets: ").append(toIndentedString(associationTargets)).append("\n");
    sb.append("    caseSignificance: ").append(toIndentedString(caseSignificance)).append("\n");
    sb.append("    caseSignificanceId: ").append(toIndentedString(caseSignificanceId)).append("\n");
    sb.append("    conceptId: ").append(toIndentedString(conceptId)).append("\n");
    sb.append("    descriptionId: ").append(toIndentedString(descriptionId)).append("\n");
    sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
    sb.append("    effectiveTimeI: ").append(toIndentedString(effectiveTimeI)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    idField: ").append(toIndentedString(idField)).append("\n");
    sb.append("    inactivationIndicator: ").append(toIndentedString(inactivationIndicator)).append("\n");
    sb.append("    internalId: ").append(toIndentedString(internalId)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    releaseHash: ").append(toIndentedString(releaseHash)).append("\n");
    sb.append("    released: ").append(toIndentedString(released)).append("\n");
    sb.append("    releasedEffectiveTime: ").append(toIndentedString(releasedEffectiveTime)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    termLen: ").append(toIndentedString(termLen)).append("\n");
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

