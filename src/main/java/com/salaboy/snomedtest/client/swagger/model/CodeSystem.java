package com.salaboy.snomedtest.client.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * CodeSystem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class CodeSystem   {
  @JsonProperty("branchPath")
  private String branchPath = null;

  @JsonProperty("shortName")
  private String shortName = null;

  public CodeSystem branchPath(String branchPath) {
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

  public CodeSystem shortName(String shortName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodeSystem codeSystem = (CodeSystem) o;
    return Objects.equals(this.branchPath, codeSystem.branchPath) &&
        Objects.equals(this.shortName, codeSystem.shortName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchPath, shortName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodeSystem {\n");
    
    sb.append("    branchPath: ").append(toIndentedString(branchPath)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
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

