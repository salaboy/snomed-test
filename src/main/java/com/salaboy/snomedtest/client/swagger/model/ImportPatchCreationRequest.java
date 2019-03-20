package com.salaboy.snomedtest.client.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * ImportPatchCreationRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class ImportPatchCreationRequest   {
  @JsonProperty("branchPath")
  private String branchPath = null;

  @JsonProperty("patchReleaseVersion")
  private Integer patchReleaseVersion = null;

  public ImportPatchCreationRequest branchPath(String branchPath) {
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

  public ImportPatchCreationRequest patchReleaseVersion(Integer patchReleaseVersion) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportPatchCreationRequest importPatchCreationRequest = (ImportPatchCreationRequest) o;
    return Objects.equals(this.branchPath, importPatchCreationRequest.branchPath) &&
        Objects.equals(this.patchReleaseVersion, importPatchCreationRequest.patchReleaseVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchPath, patchReleaseVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportPatchCreationRequest {\n");
    
    sb.append("    branchPath: ").append(toIndentedString(branchPath)).append("\n");
    sb.append("    patchReleaseVersion: ").append(toIndentedString(patchReleaseVersion)).append("\n");
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

