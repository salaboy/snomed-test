package com.salaboy.snomedtest.client.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * BuildVersion
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class BuildVersion   {
  @JsonProperty("time")
  private String time = null;

  @JsonProperty("version")
  private String version = null;

  public BuildVersion time(String time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(value = "")


  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public BuildVersion version(String version) {
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
    BuildVersion buildVersion = (BuildVersion) o;
    return Objects.equals(this.time, buildVersion.time) &&
        Objects.equals(this.version, buildVersion.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildVersion {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

