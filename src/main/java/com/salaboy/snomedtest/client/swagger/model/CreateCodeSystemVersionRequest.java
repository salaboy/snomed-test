package com.salaboy.snomedtest.client.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * CreateCodeSystemVersionRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class CreateCodeSystemVersionRequest   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("effectiveDate")
  private Integer effectiveDate = null;

  public CreateCodeSystemVersionRequest description(String description) {
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

  public CreateCodeSystemVersionRequest effectiveDate(Integer effectiveDate) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCodeSystemVersionRequest createCodeSystemVersionRequest = (CreateCodeSystemVersionRequest) o;
    return Objects.equals(this.description, createCodeSystemVersionRequest.description) &&
        Objects.equals(this.effectiveDate, createCodeSystemVersionRequest.effectiveDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, effectiveDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCodeSystemVersionRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
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

