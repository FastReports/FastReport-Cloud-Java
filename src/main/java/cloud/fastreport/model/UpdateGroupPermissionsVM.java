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
import cloud.fastreport.model.GroupAdministrate;
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
 * UpdateGroupPermissionsVM
 */
@JsonPropertyOrder({
  UpdateGroupPermissionsVM.JSON_PROPERTY_NEW_PERMISSIONS,
  UpdateGroupPermissionsVM.JSON_PROPERTY_ADMINISTRATE
})
@JsonTypeName("UpdateGroupPermissionsVM")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateGroupPermissionsVM {
  public static final String JSON_PROPERTY_NEW_PERMISSIONS = "newPermissions";
  private GroupPermissions newPermissions;

  public static final String JSON_PROPERTY_ADMINISTRATE = "administrate";
  private GroupAdministrate administrate;


  public UpdateGroupPermissionsVM newPermissions(GroupPermissions newPermissions) {
    
    this.newPermissions = newPermissions;
    return this;
  }

   /**
   * Get newPermissions
   * @return newPermissions
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NEW_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GroupPermissions getNewPermissions() {
    return newPermissions;
  }


  @JsonProperty(JSON_PROPERTY_NEW_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNewPermissions(GroupPermissions newPermissions) {
    this.newPermissions = newPermissions;
  }


  public UpdateGroupPermissionsVM administrate(GroupAdministrate administrate) {
    
    this.administrate = administrate;
    return this;
  }

   /**
   * Get administrate
   * @return administrate
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ADMINISTRATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GroupAdministrate getAdministrate() {
    return administrate;
  }


  @JsonProperty(JSON_PROPERTY_ADMINISTRATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAdministrate(GroupAdministrate administrate) {
    this.administrate = administrate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateGroupPermissionsVM updateGroupPermissionsVM = (UpdateGroupPermissionsVM) o;
    return Objects.equals(this.newPermissions, updateGroupPermissionsVM.newPermissions) &&
        Objects.equals(this.administrate, updateGroupPermissionsVM.administrate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newPermissions, administrate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGroupPermissionsVM {\n");
    sb.append("    newPermissions: ").append(toIndentedString(newPermissions)).append("\n");
    sb.append("    administrate: ").append(toIndentedString(administrate)).append("\n");
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

