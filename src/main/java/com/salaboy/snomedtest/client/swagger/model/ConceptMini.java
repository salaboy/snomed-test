package com.salaboy.snomedtest.client.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * ConceptMini
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class ConceptMini   {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("conceptId")
  private String conceptId = null;

  @JsonProperty("definitionStatus")
  private String definitionStatus = null;

  @JsonProperty("effectiveTime")
  private String effectiveTime = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isLeafInferred")
  private Boolean isLeafInferred = null;

  @JsonProperty("isLeafStated")
  private Boolean isLeafStated = null;

  @JsonProperty("moduleId")
  private String moduleId = null;


  public ConceptMini active(Boolean active) {
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

  public ConceptMini conceptId(String conceptId) {
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

  public ConceptMini definitionStatus(String definitionStatus) {
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

  public ConceptMini effectiveTime(String effectiveTime) {
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

  public ConceptMini id(String id) {
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

  public ConceptMini isLeafInferred(Boolean isLeafInferred) {
    this.isLeafInferred = isLeafInferred;
    return this;
  }

  /**
   * Get isLeafInferred
   * @return isLeafInferred
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsLeafInferred() {
    return isLeafInferred;
  }

  public void setIsLeafInferred(Boolean isLeafInferred) {
    this.isLeafInferred = isLeafInferred;
  }

  public ConceptMini isLeafStated(Boolean isLeafStated) {
    this.isLeafStated = isLeafStated;
    return this;
  }

  /**
   * Get isLeafStated
   * @return isLeafStated
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsLeafStated() {
    return isLeafStated;
  }

  public void setIsLeafStated(Boolean isLeafStated) {
    this.isLeafStated = isLeafStated;
  }

  public ConceptMini moduleId(String moduleId) {
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

  public ConceptMini pt(String pt) {
    return this;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConceptMini conceptMini = (ConceptMini) o;
    return Objects.equals(this.active, conceptMini.active) &&
        Objects.equals(this.conceptId, conceptMini.conceptId) &&
        Objects.equals(this.definitionStatus, conceptMini.definitionStatus) &&
        Objects.equals(this.effectiveTime, conceptMini.effectiveTime) &&
        Objects.equals(this.id, conceptMini.id) &&
        Objects.equals(this.isLeafInferred, conceptMini.isLeafInferred) &&
        Objects.equals(this.isLeafStated, conceptMini.isLeafStated) &&
        Objects.equals(this.moduleId, conceptMini.moduleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, conceptId, definitionStatus, effectiveTime, id, isLeafInferred, isLeafStated, moduleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConceptMini {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    conceptId: ").append(toIndentedString(conceptId)).append("\n");
    sb.append("    definitionStatus: ").append(toIndentedString(definitionStatus)).append("\n");
    sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isLeafInferred: ").append(toIndentedString(isLeafInferred)).append("\n");
    sb.append("    isLeafStated: ").append(toIndentedString(isLeafStated)).append("\n");
    sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
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

