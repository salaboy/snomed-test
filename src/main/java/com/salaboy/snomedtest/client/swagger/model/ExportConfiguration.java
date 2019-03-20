package com.salaboy.snomedtest.client.swagger.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ExportConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class ExportConfiguration   {
  @JsonProperty("branchPath")
  private String branchPath = null;

  @JsonProperty("conceptsAndRelationshipsOnly")
  private Boolean conceptsAndRelationshipsOnly = null;

  @JsonProperty("filenameEffectiveDate")
  private String filenameEffectiveDate = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    DELTA("DELTA"),
    
    SNAPSHOT("SNAPSHOT"),
    
    FULL("FULL");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  public ExportConfiguration branchPath(String branchPath) {
    this.branchPath = branchPath;
    return this;
  }

  /**
   * Get branchPath
   * @return branchPath
  **/
  @ApiModelProperty(value = "")


  public String getBranchPath() {
    return branchPath;
  }

  public void setBranchPath(String branchPath) {
    this.branchPath = branchPath;
  }

  public ExportConfiguration conceptsAndRelationshipsOnly(Boolean conceptsAndRelationshipsOnly) {
    this.conceptsAndRelationshipsOnly = conceptsAndRelationshipsOnly;
    return this;
  }

  /**
   * false
   * @return conceptsAndRelationshipsOnly
  **/
  @ApiModelProperty(example = "false", value = "false")


  public Boolean isConceptsAndRelationshipsOnly() {
    return conceptsAndRelationshipsOnly;
  }

  public void setConceptsAndRelationshipsOnly(Boolean conceptsAndRelationshipsOnly) {
    this.conceptsAndRelationshipsOnly = conceptsAndRelationshipsOnly;
  }

  public ExportConfiguration filenameEffectiveDate(String filenameEffectiveDate) {
    this.filenameEffectiveDate = filenameEffectiveDate;
    return this;
  }

  /**
   * Get filenameEffectiveDate
   * @return filenameEffectiveDate
  **/
  @ApiModelProperty(value = "")


  public String getFilenameEffectiveDate() {
    return filenameEffectiveDate;
  }

  public void setFilenameEffectiveDate(String filenameEffectiveDate) {
    this.filenameEffectiveDate = filenameEffectiveDate;
  }

  public ExportConfiguration id(String id) {
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

  public ExportConfiguration startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public ExportConfiguration type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportConfiguration exportConfiguration = (ExportConfiguration) o;
    return Objects.equals(this.branchPath, exportConfiguration.branchPath) &&
        Objects.equals(this.conceptsAndRelationshipsOnly, exportConfiguration.conceptsAndRelationshipsOnly) &&
        Objects.equals(this.filenameEffectiveDate, exportConfiguration.filenameEffectiveDate) &&
        Objects.equals(this.id, exportConfiguration.id) &&
        Objects.equals(this.startDate, exportConfiguration.startDate) &&
        Objects.equals(this.type, exportConfiguration.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchPath, conceptsAndRelationshipsOnly, filenameEffectiveDate, id, startDate, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportConfiguration {\n");
    
    sb.append("    branchPath: ").append(toIndentedString(branchPath)).append("\n");
    sb.append("    conceptsAndRelationshipsOnly: ").append(toIndentedString(conceptsAndRelationshipsOnly)).append("\n");
    sb.append("    filenameEffectiveDate: ").append(toIndentedString(filenameEffectiveDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

