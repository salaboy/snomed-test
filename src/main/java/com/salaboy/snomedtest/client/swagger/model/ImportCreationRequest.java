package com.salaboy.snomedtest.client.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * ImportCreationRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class ImportCreationRequest   {
  @JsonProperty("branchPath")
  private String branchPath = null;

  @JsonProperty("createCodeSystemVersion")
  private Boolean createCodeSystemVersion = null;

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

  public ImportCreationRequest branchPath(String branchPath) {
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

  public ImportCreationRequest createCodeSystemVersion(Boolean createCodeSystemVersion) {
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

  public ImportCreationRequest type(TypeEnum type) {
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
    ImportCreationRequest importCreationRequest = (ImportCreationRequest) o;
    return Objects.equals(this.branchPath, importCreationRequest.branchPath) &&
        Objects.equals(this.createCodeSystemVersion, importCreationRequest.createCodeSystemVersion) &&
        Objects.equals(this.type, importCreationRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchPath, createCodeSystemVersion, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportCreationRequest {\n");
    
    sb.append("    branchPath: ").append(toIndentedString(branchPath)).append("\n");
    sb.append("    createCodeSystemVersion: ").append(toIndentedString(createCodeSystemVersion)).append("\n");
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

