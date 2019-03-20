package com.salaboy.snomedtest.client.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * PageBrowserDescriptionSearchResult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class PageBrowserDescriptionSearchResult   {
  @JsonProperty("first")
  private Boolean first = null;

  @JsonProperty("items")
  @Valid
  private List<BrowserDescriptionSearchResult> items = null;

  @JsonProperty("last")
  private Boolean last = null;

  @JsonProperty("number")
  private Integer number = null;

  @JsonProperty("numberOfElements")
  private Integer numberOfElements = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("totalElements")
  private Long totalElements = null;

  @JsonProperty("totalPages")
  private Integer totalPages = null;

  public PageBrowserDescriptionSearchResult first(Boolean first) {
    this.first = first;
    return this;
  }

  /**
   * Get first
   * @return first
  **/
  @ApiModelProperty(value = "")


  public Boolean isFirst() {
    return first;
  }

  public void setFirst(Boolean first) {
    this.first = first;
  }

  public PageBrowserDescriptionSearchResult items(List<BrowserDescriptionSearchResult> items) {
    this.items = items;
    return this;
  }

  public PageBrowserDescriptionSearchResult addItemsItem(BrowserDescriptionSearchResult itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<BrowserDescriptionSearchResult>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<BrowserDescriptionSearchResult> getItems() {
    return items;
  }

  public void setItems(List<BrowserDescriptionSearchResult> items) {
    this.items = items;
  }

  public PageBrowserDescriptionSearchResult last(Boolean last) {
    this.last = last;
    return this;
  }

  /**
   * Get last
   * @return last
  **/
  @ApiModelProperty(value = "")


  public Boolean isLast() {
    return last;
  }

  public void setLast(Boolean last) {
    this.last = last;
  }

  public PageBrowserDescriptionSearchResult number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")


  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public PageBrowserDescriptionSearchResult numberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
    return this;
  }

  /**
   * Get numberOfElements
   * @return numberOfElements
  **/
  @ApiModelProperty(value = "")


  public Integer getNumberOfElements() {
    return numberOfElements;
  }

  public void setNumberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
  }

  public PageBrowserDescriptionSearchResult size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")


  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public PageBrowserDescriptionSearchResult totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
  **/
  @ApiModelProperty(value = "")


  public Long getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  public PageBrowserDescriptionSearchResult totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
  **/
  @ApiModelProperty(value = "")


  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageBrowserDescriptionSearchResult pageBrowserDescriptionSearchResult = (PageBrowserDescriptionSearchResult) o;
    return Objects.equals(this.first, pageBrowserDescriptionSearchResult.first) &&
        Objects.equals(this.items, pageBrowserDescriptionSearchResult.items) &&
        Objects.equals(this.last, pageBrowserDescriptionSearchResult.last) &&
        Objects.equals(this.number, pageBrowserDescriptionSearchResult.number) &&
        Objects.equals(this.numberOfElements, pageBrowserDescriptionSearchResult.numberOfElements) &&
        Objects.equals(this.size, pageBrowserDescriptionSearchResult.size) &&
        Objects.equals(this.totalElements, pageBrowserDescriptionSearchResult.totalElements) &&
        Objects.equals(this.totalPages, pageBrowserDescriptionSearchResult.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, items, last, number, numberOfElements, size, totalElements, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageBrowserDescriptionSearchResult {\n");
    
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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

