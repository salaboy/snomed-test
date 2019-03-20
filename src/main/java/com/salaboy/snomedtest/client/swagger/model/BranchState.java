package com.salaboy.snomedtest.client.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * BranchState
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class BranchState   {
  @JsonProperty("baseTimestamp")
  private Long baseTimestamp = null;

  @JsonProperty("headTimestamp")
  private Long headTimestamp = null;

  @JsonProperty("path")
  private String path = null;

  public BranchState baseTimestamp(Long baseTimestamp) {
    this.baseTimestamp = baseTimestamp;
    return this;
  }

  /**
   * Get baseTimestamp
   * @return baseTimestamp
  **/
  @ApiModelProperty(value = "")


  public Long getBaseTimestamp() {
    return baseTimestamp;
  }

  public void setBaseTimestamp(Long baseTimestamp) {
    this.baseTimestamp = baseTimestamp;
  }

  public BranchState headTimestamp(Long headTimestamp) {
    this.headTimestamp = headTimestamp;
    return this;
  }

  /**
   * Get headTimestamp
   * @return headTimestamp
  **/
  @ApiModelProperty(value = "")


  public Long getHeadTimestamp() {
    return headTimestamp;
  }

  public void setHeadTimestamp(Long headTimestamp) {
    this.headTimestamp = headTimestamp;
  }

  public BranchState path(String path) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchState branchState = (BranchState) o;
    return Objects.equals(this.baseTimestamp, branchState.baseTimestamp) &&
        Objects.equals(this.headTimestamp, branchState.headTimestamp) &&
        Objects.equals(this.path, branchState.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseTimestamp, headTimestamp, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchState {\n");
    
    sb.append("    baseTimestamp: ").append(toIndentedString(baseTimestamp)).append("\n");
    sb.append("    headTimestamp: ").append(toIndentedString(headTimestamp)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

