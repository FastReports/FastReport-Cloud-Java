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
import cloud.fastreport.model.FileCreateVM;
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
 * ReportCreateVM
 */
@JsonPropertyOrder({
  ReportCreateVM.JSON_PROPERTY_TEMPLATE_ID,
  ReportCreateVM.JSON_PROPERTY_NAME,
  ReportCreateVM.JSON_PROPERTY_TAGS,
  ReportCreateVM.JSON_PROPERTY_ICON,
  ReportCreateVM.JSON_PROPERTY_CONTENT
})
@JsonTypeName("ReportCreateVM")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportCreateVM {
  public static final String JSON_PROPERTY_TEMPLATE_ID = "templateId";
  private JsonNullable<String> templateId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_ICON = "icon";
  private JsonNullable<byte[]> icon = JsonNullable.<byte[]>undefined();

  public static final String JSON_PROPERTY_CONTENT = "content";
  private JsonNullable<byte[]> content = JsonNullable.<byte[]>undefined();


  public ReportCreateVM templateId(String templateId) {
    this.templateId = JsonNullable.<String>of(templateId);
    
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getTemplateId() {
        return templateId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTemplateId_JsonNullable() {
    return templateId;
  }
  
  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  public void setTemplateId_JsonNullable(JsonNullable<String> templateId) {
    this.templateId = templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = JsonNullable.<String>of(templateId);
  }


  public ReportCreateVM name(String name) {
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


  public ReportCreateVM tags(List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
    
    return this;
  }

  public ReportCreateVM addTagsItem(String tagsItem) {
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


  public ReportCreateVM icon(byte[] icon) {
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


  public ReportCreateVM content(byte[] content) {
    this.content = JsonNullable.<byte[]>of(content);
    
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public byte[] getContent() {
        return content.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<byte[]> getContent_JsonNullable() {
    return content;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTENT)
  public void setContent_JsonNullable(JsonNullable<byte[]> content) {
    this.content = content;
  }

  public void setContent(byte[] content) {
    this.content = JsonNullable.<byte[]>of(content);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportCreateVM reportCreateVM = (ReportCreateVM) o;
    return Objects.equals(this.templateId, reportCreateVM.templateId) &&
        Objects.equals(this.name, reportCreateVM.name) &&
        Objects.equals(this.tags, reportCreateVM.tags) &&
        Arrays.equals(this.icon, reportCreateVM.icon) &&
        Arrays.equals(this.content, reportCreateVM.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, name, tags, Arrays.hashCode(icon), Arrays.hashCode(content));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportCreateVM {\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

