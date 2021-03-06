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
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * FilePermissionFileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermissions
 */
@JsonPropertyOrder({
  FilePermissionFileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermissions.JSON_PROPERTY_OWNER_ID,
  FilePermissionFileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermissions.JSON_PROPERTY_OWNER,
  FilePermissionFileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermissions.JSON_PROPERTY_GROUPS,
  FilePermissionFileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermissions.JSON_PROPERTY_OTHER,
  FilePermissionFileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermissions.JSON_PROPERTY_ANON
})
@JsonTypeName("FilePermissionFileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermissions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FilePermissionFileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermissions {
  public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
  private JsonNullable<String> ownerId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OWNER = "owner";
  private FilePermission owner;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private JsonNullable<Map<String, FilePermission>> groups = JsonNullable.<Map<String, FilePermission>>undefined();

  public static final String JSON_PROPERTY_OTHER = "other";
  private FilePermission other;

  public static final String JSON_PROPERTY_ANON = "anon";
  private FilePermission anon;


  public FilePermissionFileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermissions ownerId(String ownerId) {
    this.ownerId = JsonNullable.<String>of(ownerId);
    
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getOwnerId() {
        return ownerId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOwnerId_JsonNullable() {
    return ownerId;
  }
  
  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  public void setOwnerId_JsonNullable(JsonNullable<String> ownerId) {
    this.ownerId = ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = JsonNullable.<String>of(ownerId);
  }


  public FilePermissionFileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermissions owner(FilePermission owner) {
    
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


  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwner(FilePermission owner) {
    this.owner = owner;
  }


  public FilePermissionFileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermissions groups(Map<String, FilePermission> groups) {
    this.groups = JsonNullable.<Map<String, FilePermission>>of(groups);
    
    return this;
  }

  public FilePermissionFileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermissions putGroupsItem(String key, FilePermission groupsItem) {
    if (this.groups == null || !this.groups.isPresent()) {
      this.groups = JsonNullable.<Map<String, FilePermission>>of(new HashMap<>());
    }
    try {
      this.groups.get().put(key, groupsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Map<String, FilePermission> getGroups() {
        return groups.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, FilePermission>> getGroups_JsonNullable() {
    return groups;
  }
  
  @JsonProperty(JSON_PROPERTY_GROUPS)
  public void setGroups_JsonNullable(JsonNullable<Map<String, FilePermission>> groups) {
    this.groups = groups;
  }

  public void setGroups(Map<String, FilePermission> groups) {
    this.groups = JsonNullable.<Map<String, FilePermission>>of(groups);
  }


  public FilePermissionFileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermissions other(FilePermission other) {
    
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


  @JsonProperty(JSON_PROPERTY_OTHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOther(FilePermission other) {
    this.other = other;
  }


  public FilePermissionFileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermissions anon(FilePermission anon) {
    
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


  @JsonProperty(JSON_PROPERTY_ANON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    FilePermissionFileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermissions filePermissionFileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermissions = (FilePermissionFileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermissions) o;
    return Objects.equals(this.ownerId, filePermissionFileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermissions.ownerId) &&
        Objects.equals(this.owner, filePermissionFileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermissions.owner) &&
        Objects.equals(this.groups, filePermissionFileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermissions.groups) &&
        Objects.equals(this.other, filePermissionFileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermissions.other) &&
        Objects.equals(this.anon, filePermissionFileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermissions.anon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerId, owner, groups, other, anon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilePermissionFileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermissions {\n");
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

