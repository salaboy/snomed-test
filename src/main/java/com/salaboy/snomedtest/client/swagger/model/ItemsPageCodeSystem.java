package com.salaboy.snomedtest.client.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ItemsPageCodeSystem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class ItemsPageCodeSystem   {
  @JsonProperty("items")
  private CollectionCodeSystem items = null;

  @JsonProperty("limit")
  private Long limit = null;

  @JsonProperty("offset")
  private Long offset = null;

  @JsonProperty("total")
  private Long total = null;

  public ItemsPageCodeSystem items(CollectionCodeSystem items) {
    this.items = items;
    return this;
  }

  /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CollectionCodeSystem getItems() {
    return items;
  }

  public void setItems(CollectionCodeSystem items) {
    this.items = items;
  }

  public ItemsPageCodeSystem limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Get limit
   * @return limit
  **/
  @ApiModelProperty(value = "")


  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public ItemsPageCodeSystem offset(Long offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Get offset
   * @return offset
  **/
  @ApiModelProperty(value = "")


  public Long getOffset() {
    return offset;
  }

  public void setOffset(Long offset) {
    this.offset = offset;
  }

  public ItemsPageCodeSystem total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")


  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
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
    ItemsPageCodeSystem itemsPageCodeSystem = (ItemsPageCodeSystem) o;
    return Objects.equals(this.items, itemsPageCodeSystem.items) &&
        Objects.equals(this.limit, itemsPageCodeSystem.limit) &&
        Objects.equals(this.offset, itemsPageCodeSystem.offset) &&
        Objects.equals(this.total, itemsPageCodeSystem.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, limit, offset, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemsPageCodeSystem {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

