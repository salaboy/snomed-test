package com.salaboy.snomedtest.client.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * InboundRelationshipsResult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class InboundRelationshipsResult   {
  @JsonProperty("inboundRelationships")
  @Valid
  private List<Relationship> inboundRelationships = null;

  @JsonProperty("total")
  private Integer total = null;

  public InboundRelationshipsResult inboundRelationships(List<Relationship> inboundRelationships) {
    this.inboundRelationships = inboundRelationships;
    return this;
  }

  public InboundRelationshipsResult addInboundRelationshipsItem(Relationship inboundRelationshipsItem) {
    if (this.inboundRelationships == null) {
      this.inboundRelationships = new ArrayList<Relationship>();
    }
    this.inboundRelationships.add(inboundRelationshipsItem);
    return this;
  }

  /**
   * Get inboundRelationships
   * @return inboundRelationships
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Relationship> getInboundRelationships() {
    return inboundRelationships;
  }

  public void setInboundRelationships(List<Relationship> inboundRelationships) {
    this.inboundRelationships = inboundRelationships;
  }

  public InboundRelationshipsResult total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")


  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundRelationshipsResult inboundRelationshipsResult = (InboundRelationshipsResult) o;
    return Objects.equals(this.inboundRelationships, inboundRelationshipsResult.inboundRelationships) &&
        Objects.equals(this.total, inboundRelationshipsResult.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inboundRelationships, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundRelationshipsResult {\n");
    
    sb.append("    inboundRelationships: ").append(toIndentedString(inboundRelationships)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

