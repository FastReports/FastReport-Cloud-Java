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
import cloud.fastreport.model.FileVM;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * FilesVM
 */
@JsonPropertyOrder({
  FilesVM.JSON_PROPERTY_FILES,
  FilesVM.JSON_PROPERTY_COUNT,
  FilesVM.JSON_PROPERTY_SKIP,
  FilesVM.JSON_PROPERTY_TAKE
})
@JsonTypeName("FilesVM")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FilesVM {
  public static final String JSON_PROPERTY_FILES = "files";
  private List<FileVM> files = null;

  public static final String JSON_PROPERTY_COUNT = "count";
  private Long count;

  public static final String JSON_PROPERTY_SKIP = "skip";
  private Integer skip;

  public static final String JSON_PROPERTY_TAKE = "take";
  private Integer take;


  public FilesVM files(List<FileVM> files) {
    
    this.files = files;
    return this;
  }

  public FilesVM addFilesItem(FileVM filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FileVM> getFiles() {
    return files;
  }


  public void setFiles(List<FileVM> files) {
    this.files = files;
  }


  public FilesVM count(Long count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCount() {
    return count;
  }


  public void setCount(Long count) {
    this.count = count;
  }


  public FilesVM skip(Integer skip) {
    
    this.skip = skip;
    return this;
  }

   /**
   * Get skip
   * @return skip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SKIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSkip() {
    return skip;
  }


  public void setSkip(Integer skip) {
    this.skip = skip;
  }


  public FilesVM take(Integer take) {
    
    this.take = take;
    return this;
  }

   /**
   * Get take
   * @return take
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTake() {
    return take;
  }


  public void setTake(Integer take) {
    this.take = take;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilesVM filesVM = (FilesVM) o;
    return Objects.equals(this.files, filesVM.files) &&
        Objects.equals(this.count, filesVM.count) &&
        Objects.equals(this.skip, filesVM.skip) &&
        Objects.equals(this.take, filesVM.take);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files, count, skip, take);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilesVM {\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
    sb.append("    take: ").append(toIndentedString(take)).append("\n");
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
