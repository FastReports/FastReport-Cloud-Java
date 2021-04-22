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
import cloud.fastreport.model.FilePermission;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * FilePermissions
 */
@JsonPropertyOrder({
  FilePermissions.JSON_PROPERTY_OWNER_ID,
  FilePermissions.JSON_PROPERTY_OWNER,
  FilePermissions.JSON_PROPERTY_GROUPS,
  FilePermissions.JSON_PROPERTY_OTHER,
  FilePermissions.JSON_PROPERTY_ANON
})
@JsonTypeName("FilePermissions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FilePermissions {
  public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
  private String ownerId;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private FilePermission owner;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private Map<String, FilePermission> groups = null;

  public static final String JSON_PROPERTY_OTHER = "other";
  private FilePermission other;

  public static final String JSON_PROPERTY_ANON = "anon";
  private FilePermission anon;


  public FilePermissions ownerId(String ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOwnerId() {
    return ownerId;
  }


  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  public FilePermissions owner(FilePermission owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FilePermission getOwner() {
    return owner;
  }


  public void setOwner(FilePermission owner) {
    this.owner = owner;
  }


  public FilePermissions groups(Map<String, FilePermission> groups) {
    
    this.groups = groups;
    return this;
  }

  public FilePermissions putGroupsItem(String key, FilePermission groupsItem) {
    if (this.groups == null) {
      this.groups = new HashMap<>();
    }
    this.groups.put(key, groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, FilePermission> getGroups() {
    return groups;
  }


  public void setGroups(Map<String, FilePermission> groups) {
    this.groups = groups;
  }


  public FilePermissions other(FilePermission other) {
    
    this.other = other;
    return this;
  }

   /**
   * Get other
   * @return other
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OTHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FilePermission getOther() {
    return other;
  }


  public void setOther(FilePermission other) {
    this.other = other;
  }


  public FilePermissions anon(FilePermission anon) {
    
    this.anon = anon;
    return this;
  }

   /**
   * Get anon
   * @return anon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FilePermission getAnon() {
    return anon;
  }


  public void setAnon(FilePermission anon) {
    this.anon = anon;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilePermissions filePermissions = (FilePermissions) o;
    return Objects.equals(this.ownerId, filePermissions.ownerId) &&
        Objects.equals(this.owner, filePermissions.owner) &&
        Objects.equals(this.groups, filePermissions.groups) &&
        Objects.equals(this.other, filePermissions.other) &&
        Objects.equals(this.anon, filePermissions.anon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerId, owner, groups, other, anon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilePermissions {\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    anon: ").append(toIndentedString(anon)).append("\n");
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

