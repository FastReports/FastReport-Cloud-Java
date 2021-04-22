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
import cloud.fastreport.model.DataSourcePermissions;
import cloud.fastreport.model.FilePermissions;
import cloud.fastreport.model.GroupPermissions;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DefaultPermissions
 */
@JsonPropertyOrder({
  DefaultPermissions.JSON_PROPERTY_FILE_PERMISSIONS,
  DefaultPermissions.JSON_PROPERTY_GROUP_PERMISSIONS,
  DefaultPermissions.JSON_PROPERTY_DATA_SOURCE_PERMISSIONS
})
@JsonTypeName("DefaultPermissions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-22T14:13:34.806+03:00[Europe/Moscow]")
public class DefaultPermissions {
  public static final String JSON_PROPERTY_FILE_PERMISSIONS = "filePermissions";
  private FilePermissions filePermissions;

  public static final String JSON_PROPERTY_GROUP_PERMISSIONS = "groupPermissions";
  private GroupPermissions groupPermissions;

  public static final String JSON_PROPERTY_DATA_SOURCE_PERMISSIONS = "dataSourcePermissions";
  private DataSourcePermissions dataSourcePermissions;


  public DefaultPermissions filePermissions(FilePermissions filePermissions) {
    
    this.filePermissions = filePermissions;
    return this;
  }

   /**
   * Get filePermissions
   * @return filePermissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILE_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FilePermissions getFilePermissions() {
    return filePermissions;
  }


  public void setFilePermissions(FilePermissions filePermissions) {
    this.filePermissions = filePermissions;
  }


  public DefaultPermissions groupPermissions(GroupPermissions groupPermissions) {
    
    this.groupPermissions = groupPermissions;
    return this;
  }

   /**
   * Get groupPermissions
   * @return groupPermissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUP_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GroupPermissions getGroupPermissions() {
    return groupPermissions;
  }


  public void setGroupPermissions(GroupPermissions groupPermissions) {
    this.groupPermissions = groupPermissions;
  }


  public DefaultPermissions dataSourcePermissions(DataSourcePermissions dataSourcePermissions) {
    
    this.dataSourcePermissions = dataSourcePermissions;
    return this;
  }

   /**
   * Get dataSourcePermissions
   * @return dataSourcePermissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DataSourcePermissions getDataSourcePermissions() {
    return dataSourcePermissions;
  }


  public void setDataSourcePermissions(DataSourcePermissions dataSourcePermissions) {
    this.dataSourcePermissions = dataSourcePermissions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultPermissions defaultPermissions = (DefaultPermissions) o;
    return Objects.equals(this.filePermissions, defaultPermissions.filePermissions) &&
        Objects.equals(this.groupPermissions, defaultPermissions.groupPermissions) &&
        Objects.equals(this.dataSourcePermissions, defaultPermissions.dataSourcePermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filePermissions, groupPermissions, dataSourcePermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultPermissions {\n");
    sb.append("    filePermissions: ").append(toIndentedString(filePermissions)).append("\n");
    sb.append("    groupPermissions: ").append(toIndentedString(groupPermissions)).append("\n");
    sb.append("    dataSourcePermissions: ").append(toIndentedString(dataSourcePermissions)).append("\n");
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

