package com.salaboy.snomedtest.client.swagger.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * CodeSystemVersion
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class CodeSystemVersion   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("effectiveDate")
  private Integer effectiveDate = null;

  @JsonProperty("importDate")
  private OffsetDateTime importDate = null;

  @JsonProperty("parentBranchPath")
  private String parentBranchPath = null;

  @JsonProperty("shortName")
  private String shortName = null;

  @JsonProperty("version")
  private String version = null;

  public CodeSystemVersion description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CodeSystemVersion effectiveDate(Integer effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * Get effectiveDate
   * @return effectiveDate
  **/
  @ApiModelProperty(value = "")


  public Integer getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(Integer effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public CodeSystemVersion importDate(OffsetDateTime importDate) {
    this.importDate = importDate;
    return this;
  }

  /**
   * Get importDate
   * @return importDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getImportDate() {
    return importDate;
  }

  public void setImportDate(OffsetDateTime importDate) {
    this.importDate = importDate;
  }

  public CodeSystemVersion parentBranchPath(String parentBranchPath) {
    this.parentBranchPath = parentBranchPath;
    return this;
  }

  /**
   * Get parentBranchPath
   * @return parentBranchPath
  **/
  @ApiModelProperty(value = "")


  public String getParentBranchPath() {
    return parentBranchPath;
  }

  public void setParentBranchPath(String parentBranchPath) {
    this.parentBranchPath = parentBranchPath;
  }

  public CodeSystemVersion shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

  /**
   * Get shortName
   * @return shortName
  **/
  @ApiModelProperty(value = "")


  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public CodeSystemVersion version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodeSystemVersion codeSystemVersion = (CodeSystemVersion) o;
    return Objects.equals(this.description, codeSystemVersion.description) &&
        Objects.equals(this.effectiveDate, codeSystemVersion.effectiveDate) &&
        Objects.equals(this.importDate, codeSystemVersion.importDate) &&
        Objects.equals(this.parentBranchPath, codeSystemVersion.parentBranchPath) &&
        Objects.equals(this.shortName, codeSystemVersion.shortName) &&
        Objects.equals(this.version, codeSystemVersion.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, effectiveDate, importDate, parentBranchPath, shortName, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodeSystemVersion {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    importDate: ").append(toIndentedString(importDate)).append("\n");
    sb.append("    parentBranchPath: ").append(toIndentedString(parentBranchPath)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

