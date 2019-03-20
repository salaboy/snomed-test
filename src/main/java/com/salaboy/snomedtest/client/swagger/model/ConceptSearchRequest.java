package com.salaboy.snomedtest.client.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ConceptSearchRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class ConceptSearchRequest   {
  @JsonProperty("activeFilter")
  private Boolean activeFilter = null;

  @JsonProperty("conceptIds")
  @Valid
  private List<String> conceptIds = null;

  @JsonProperty("eclFilter")
  private String eclFilter = null;

  @JsonProperty("limit")
  private Integer limit = null;

  @JsonProperty("offset")
  private Integer offset = null;

  @JsonProperty("statedEclFilter")
  private String statedEclFilter = null;

  @JsonProperty("termFilter")
  private String termFilter = null;

  public ConceptSearchRequest activeFilter(Boolean activeFilter) {
    this.activeFilter = activeFilter;
    return this;
  }

  /**
   * Get activeFilter
   * @return activeFilter
  **/
  @ApiModelProperty(value = "")


  public Boolean isActiveFilter() {
    return activeFilter;
  }

  public void setActiveFilter(Boolean activeFilter) {
    this.activeFilter = activeFilter;
  }

  public ConceptSearchRequest conceptIds(List<String> conceptIds) {
    this.conceptIds = conceptIds;
    return this;
  }

  public ConceptSearchRequest addConceptIdsItem(String conceptIdsItem) {
    if (this.conceptIds == null) {
      this.conceptIds = new ArrayList<String>();
    }
    this.conceptIds.add(conceptIdsItem);
    return this;
  }

  /**
   * Get conceptIds
   * @return conceptIds
  **/
  @ApiModelProperty(value = "")


  public List<String> getConceptIds() {
    return conceptIds;
  }

  public void setConceptIds(List<String> conceptIds) {
    this.conceptIds = conceptIds;
  }

  public ConceptSearchRequest eclFilter(String eclFilter) {
    this.eclFilter = eclFilter;
    return this;
  }

  /**
   * Get eclFilter
   * @return eclFilter
  **/
  @ApiModelProperty(value = "")


  public String getEclFilter() {
    return eclFilter;
  }

  public void setEclFilter(String eclFilter) {
    this.eclFilter = eclFilter;
  }

  public ConceptSearchRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Get limit
   * @return limit
  **/
  @ApiModelProperty(value = "")


  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public ConceptSearchRequest offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Get offset
   * @return offset
  **/
  @ApiModelProperty(value = "")


  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public ConceptSearchRequest statedEclFilter(String statedEclFilter) {
    this.statedEclFilter = statedEclFilter;
    return this;
  }

  /**
   * Get statedEclFilter
   * @return statedEclFilter
  **/
  @ApiModelProperty(value = "")


  public String getStatedEclFilter() {
    return statedEclFilter;
  }

  public void setStatedEclFilter(String statedEclFilter) {
    this.statedEclFilter = statedEclFilter;
  }

  public ConceptSearchRequest termFilter(String termFilter) {
    this.termFilter = termFilter;
    return this;
  }

  /**
   * Get termFilter
   * @return termFilter
  **/
  @ApiModelProperty(value = "")


  public String getTermFilter() {
    return termFilter;
  }

  public void setTermFilter(String termFilter) {
    this.termFilter = termFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConceptSearchRequest conceptSearchRequest = (ConceptSearchRequest) o;
    return Objects.equals(this.activeFilter, conceptSearchRequest.activeFilter) &&
        Objects.equals(this.conceptIds, conceptSearchRequest.conceptIds) &&
        Objects.equals(this.eclFilter, conceptSearchRequest.eclFilter) &&
        Objects.equals(this.limit, conceptSearchRequest.limit) &&
        Objects.equals(this.offset, conceptSearchRequest.offset) &&
        Objects.equals(this.statedEclFilter, conceptSearchRequest.statedEclFilter) &&
        Objects.equals(this.termFilter, conceptSearchRequest.termFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeFilter, conceptIds, eclFilter, limit, offset, statedEclFilter, termFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConceptSearchRequest {\n");
    
    sb.append("    activeFilter: ").append(toIndentedString(activeFilter)).append("\n");
    sb.append("    conceptIds: ").append(toIndentedString(conceptIds)).append("\n");
    sb.append("    eclFilter: ").append(toIndentedString(eclFilter)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    statedEclFilter: ").append(toIndentedString(statedEclFilter)).append("\n");
    sb.append("    termFilter: ").append(toIndentedString(termFilter)).append("\n");
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

