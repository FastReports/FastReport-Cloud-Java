/*
 * FastReport Cloud
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package cloud.fastreport.model;

import java.util.Objects;
import java.util.Arrays;
import cloud.fastreport.model.FolderCreateVM;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ExportFolderCreateVM
 */
@JsonPropertyOrder({
  ExportFolderCreateVM.JSON_PROPERTY_NAME,
  ExportFolderCreateVM.JSON_PROPERTY_TAGS,
  ExportFolderCreateVM.JSON_PROPERTY_ICON
})
@JsonTypeName("ExportFolderCreateVM")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExportFolderCreateVM {
  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_ICON = "icon";
  private JsonNullable<byte[]> icon = JsonNullable.<byte[]>undefined();


  public ExportFolderCreateVM name(String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public ExportFolderCreateVM tags(List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
    
    return this;
  }

  public ExportFolderCreateVM addTagsItem(String tagsItem) {
    if (this.tags == null || !this.tags.isPresent()) {
      this.tags = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.tags.get().add(tagsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<String> getTags() {
        return tags.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getTags_JsonNullable() {
    return tags;
  }
  
  @JsonProperty(JSON_PROPERTY_TAGS)
  public void setTags_JsonNullable(JsonNullable<List<String>> tags) {
    this.tags = tags;
  }

  public void setTags(List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
  }


  public ExportFolderCreateVM icon(byte[] icon) {
    this.icon = JsonNullable.<byte[]>of(icon);
    
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public byte[] getIcon() {
        return icon.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<byte[]> getIcon_JsonNullable() {
    return icon;
  }
  
  @JsonProperty(JSON_PROPERTY_ICON)
  public void setIcon_JsonNullable(JsonNullable<byte[]> icon) {
    this.icon = icon;
  }

  public void setIcon(byte[] icon) {
    this.icon = JsonNullable.<byte[]>of(icon);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportFolderCreateVM exportFolderCreateVM = (ExportFolderCreateVM) o;
    return Objects.equals(this.name, exportFolderCreateVM.name) &&
        Objects.equals(this.tags, exportFolderCreateVM.tags) &&
        Arrays.equals(this.icon, exportFolderCreateVM.icon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, tags, Arrays.hashCode(icon));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportFolderCreateVM {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

