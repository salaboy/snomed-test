package com.salaboy.snomedtest.client.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ImportJob
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class ImportJob   {
  @JsonProperty("branchPath")
  private String branchPath = null;

  @JsonProperty("createCodeSystemVersion")
  private Boolean createCodeSystemVersion = null;

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  @JsonProperty("moduleIds")
  @Valid
  private List<String> moduleIds = null;

  @JsonProperty("patchReleaseVersion")
  private Integer patchReleaseVersion = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    WAITING_FOR_FILE("WAITING_FOR_FILE"),
    
    RUNNING("RUNNING"),
    
    COMPLETED("COMPLETED"),
    
    FAILED("FAILED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

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

  public ImportJob branchPath(String branchPath) {
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

  public ImportJob createCodeSystemVersion(Boolean createCodeSystemVersion) {
    this.createCodeSystemVersion = createCodeSystemVersion;
    return this;
  }

  /**
   * Get createCodeSystemVersion
   * @return createCodeSystemVersion
  **/
  @ApiModelProperty(value = "")


  public Boolean isCreateCodeSystemVersion() {
    return createCodeSystemVersion;
  }

  public void setCreateCodeSystemVersion(Boolean createCodeSystemVersion) {
    this.createCodeSystemVersion = createCodeSystemVersion;
  }

  public ImportJob errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
  **/
  @ApiModelProperty(value = "")


  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ImportJob moduleIds(List<String> moduleIds) {
    this.moduleIds = moduleIds;
    return this;
  }

  public ImportJob addModuleIdsItem(String moduleIdsItem) {
    if (this.moduleIds == null) {
      this.moduleIds = new ArrayList<String>();
    }
    this.moduleIds.add(moduleIdsItem);
    return this;
  }

  /**
   * Get moduleIds
   * @return moduleIds
  **/
  @ApiModelProperty(value = "")


  public List<String> getModuleIds() {
    return moduleIds;
  }

  public void setModuleIds(List<String> moduleIds) {
    this.moduleIds = moduleIds;
  }

  public ImportJob patchReleaseVersion(Integer patchReleaseVersion) {
    this.patchReleaseVersion = patchReleaseVersion;
    return this;
  }

  /**
   * Get patchReleaseVersion
   * @return patchReleaseVersion
  **/
  @ApiModelProperty(value = "")


  public Integer getPatchReleaseVersion() {
    return patchReleaseVersion;
  }

  public void setPatchReleaseVersion(Integer patchReleaseVersion) {
    this.patchReleaseVersion = patchReleaseVersion;
  }

  public ImportJob status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ImportJob type(TypeEnum type) {
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
    ImportJob importJob = (ImportJob) o;
    return Objects.equals(this.branchPath, importJob.branchPath) &&
        Objects.equals(this.createCodeSystemVersion, importJob.createCodeSystemVersion) &&
        Objects.equals(this.errorMessage, importJob.errorMessage) &&
        Objects.equals(this.moduleIds, importJob.moduleIds) &&
        Objects.equals(this.patchReleaseVersion, importJob.patchReleaseVersion) &&
        Objects.equals(this.status, importJob.status) &&
        Objects.equals(this.type, importJob.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchPath, createCodeSystemVersion, errorMessage, moduleIds, patchReleaseVersion, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportJob {\n");
    
    sb.append("    branchPath: ").append(toIndentedString(branchPath)).append("\n");
    sb.append("    createCodeSystemVersion: ").append(toIndentedString(createCodeSystemVersion)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    moduleIds: ").append(toIndentedString(moduleIds)).append("\n");
    sb.append("    patchReleaseVersion: ").append(toIndentedString(patchReleaseVersion)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

