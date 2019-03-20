package com.salaboy.snomedtest.client.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * InvalidContent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class InvalidContent   {
  @JsonProperty("componentId")
  private String componentId = null;

  @JsonProperty("conceptId")
  private String conceptId = null;

  @JsonProperty("ignorePublishedCheck")
  private Boolean ignorePublishedCheck = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("published")
  private Boolean published = null;

  /**
   * Gets or Sets severity
   */
  public enum SeverityEnum {
    ERROR("ERROR"),
    
    WARNING("WARNING");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SeverityEnum fromValue(String text) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("severity")
  private SeverityEnum severity = null;

  public InvalidContent componentId(String componentId) {
    this.componentId = componentId;
    return this;
  }

  /**
   * Get componentId
   * @return componentId
  **/
  @ApiModelProperty(value = "")


  public String getComponentId() {
    return componentId;
  }

  public void setComponentId(String componentId) {
    this.componentId = componentId;
  }

  public InvalidContent conceptId(String conceptId) {
    this.conceptId = conceptId;
    return this;
  }

  /**
   * Get conceptId
   * @return conceptId
  **/
  @ApiModelProperty(value = "")


  public String getConceptId() {
    return conceptId;
  }

  public void setConceptId(String conceptId) {
    this.conceptId = conceptId;
  }

  public InvalidContent ignorePublishedCheck(Boolean ignorePublishedCheck) {
    this.ignorePublishedCheck = ignorePublishedCheck;
    return this;
  }

  /**
   * Get ignorePublishedCheck
   * @return ignorePublishedCheck
  **/
  @ApiModelProperty(value = "")


  public Boolean isIgnorePublishedCheck() {
    return ignorePublishedCheck;
  }

  public void setIgnorePublishedCheck(Boolean ignorePublishedCheck) {
    this.ignorePublishedCheck = ignorePublishedCheck;
  }

  public InvalidContent message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InvalidContent published(Boolean published) {
    this.published = published;
    return this;
  }

  /**
   * Get published
   * @return published
  **/
  @ApiModelProperty(value = "")


  public Boolean isPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }

  public InvalidContent severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Get severity
   * @return severity
  **/
  @ApiModelProperty(value = "")


  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvalidContent invalidContent = (InvalidContent) o;
    return Objects.equals(this.componentId, invalidContent.componentId) &&
        Objects.equals(this.conceptId, invalidContent.conceptId) &&
        Objects.equals(this.ignorePublishedCheck, invalidContent.ignorePublishedCheck) &&
        Objects.equals(this.message, invalidContent.message) &&
        Objects.equals(this.published, invalidContent.published) &&
        Objects.equals(this.severity, invalidContent.severity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentId, conceptId, ignorePublishedCheck, message, published, severity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvalidContent {\n");
    
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    conceptId: ").append(toIndentedString(conceptId)).append("\n");
    sb.append("    ignorePublishedCheck: ").append(toIndentedString(ignorePublishedCheck)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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

