package com.salaboy.snomedtest.client.swagger.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Branch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-20T12:04:47.405-03:00")

public class Branch   {
  @JsonProperty("base")
  private OffsetDateTime base = null;

  @JsonProperty("containsContent")
  private Boolean containsContent = null;

  @JsonProperty("creation")
  private OffsetDateTime creation = null;

  @JsonProperty("end")
  private OffsetDateTime end = null;

  @JsonProperty("head")
  private OffsetDateTime head = null;

  @JsonProperty("lastPromotion")
  private OffsetDateTime lastPromotion = null;

  @JsonProperty("locked")
  private Boolean locked = null;

  @JsonProperty("metadata")
  @Valid
  private Map<String, String> metadata = null;

  @JsonProperty("path")
  private String path = null;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    UP_TO_DATE("UP_TO_DATE"),
    
    FORWARD("FORWARD"),
    
    BEHIND("BEHIND"),
    
    DIVERGED("DIVERGED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("state")
  private StateEnum state = null;

  @JsonProperty("versionsReplacedCounts")
  @Valid
  private Map<String, Integer> versionsReplacedCounts = null;

  public Branch base(OffsetDateTime base) {
    this.base = base;
    return this;
  }

  /**
   * Get base
   * @return base
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getBase() {
    return base;
  }

  public void setBase(OffsetDateTime base) {
    this.base = base;
  }

  public Branch containsContent(Boolean containsContent) {
    this.containsContent = containsContent;
    return this;
  }

  /**
   * Get containsContent
   * @return containsContent
  **/
  @ApiModelProperty(value = "")


  public Boolean isContainsContent() {
    return containsContent;
  }

  public void setContainsContent(Boolean containsContent) {
    this.containsContent = containsContent;
  }

  public Branch creation(OffsetDateTime creation) {
    this.creation = creation;
    return this;
  }

  /**
   * Get creation
   * @return creation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreation() {
    return creation;
  }

  public void setCreation(OffsetDateTime creation) {
    this.creation = creation;
  }

  public Branch end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }

  public Branch head(OffsetDateTime head) {
    this.head = head;
    return this;
  }

  /**
   * Get head
   * @return head
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getHead() {
    return head;
  }

  public void setHead(OffsetDateTime head) {
    this.head = head;
  }

  public Branch lastPromotion(OffsetDateTime lastPromotion) {
    this.lastPromotion = lastPromotion;
    return this;
  }

  /**
   * Get lastPromotion
   * @return lastPromotion
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getLastPromotion() {
    return lastPromotion;
  }

  public void setLastPromotion(OffsetDateTime lastPromotion) {
    this.lastPromotion = lastPromotion;
  }

  public Branch locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

  /**
   * Get locked
   * @return locked
  **/
  @ApiModelProperty(value = "")


  public Boolean isLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public Branch metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Branch putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")


  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public Branch path(String path) {
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

  public Branch state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")


  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public Branch versionsReplacedCounts(Map<String, Integer> versionsReplacedCounts) {
    this.versionsReplacedCounts = versionsReplacedCounts;
    return this;
  }

  public Branch putVersionsReplacedCountsItem(String key, Integer versionsReplacedCountsItem) {
    if (this.versionsReplacedCounts == null) {
      this.versionsReplacedCounts = new HashMap<String, Integer>();
    }
    this.versionsReplacedCounts.put(key, versionsReplacedCountsItem);
    return this;
  }

  /**
   * Get versionsReplacedCounts
   * @return versionsReplacedCounts
  **/
  @ApiModelProperty(value = "")


  public Map<String, Integer> getVersionsReplacedCounts() {
    return versionsReplacedCounts;
  }

  public void setVersionsReplacedCounts(Map<String, Integer> versionsReplacedCounts) {
    this.versionsReplacedCounts = versionsReplacedCounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Branch branch = (Branch) o;
    return Objects.equals(this.base, branch.base) &&
        Objects.equals(this.containsContent, branch.containsContent) &&
        Objects.equals(this.creation, branch.creation) &&
        Objects.equals(this.end, branch.end) &&
        Objects.equals(this.head, branch.head) &&
        Objects.equals(this.lastPromotion, branch.lastPromotion) &&
        Objects.equals(this.locked, branch.locked) &&
        Objects.equals(this.metadata, branch.metadata) &&
        Objects.equals(this.path, branch.path) &&
        Objects.equals(this.state, branch.state) &&
        Objects.equals(this.versionsReplacedCounts, branch.versionsReplacedCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, containsContent, creation, end, head, lastPromotion, locked, metadata, path, state, versionsReplacedCounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Branch {\n");
    
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    containsContent: ").append(toIndentedString(containsContent)).append("\n");
    sb.append("    creation: ").append(toIndentedString(creation)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    head: ").append(toIndentedString(head)).append("\n");
    sb.append("    lastPromotion: ").append(toIndentedString(lastPromotion)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    versionsReplacedCounts: ").append(toIndentedString(versionsReplacedCounts)).append("\n");
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

