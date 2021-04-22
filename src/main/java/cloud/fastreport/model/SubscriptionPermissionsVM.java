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
import cloud.fastreport.model.SubscriptionPermission;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SubscriptionPermissionsVM
 */
@JsonPropertyOrder({
  SubscriptionPermissionsVM.JSON_PROPERTY_PERMISSION_TYPE,
  SubscriptionPermissionsVM.JSON_PROPERTY_PERMISSION,
  SubscriptionPermissionsVM.JSON_PROPERTY_GROUP_ID,
  SubscriptionPermissionsVM.JSON_PROPERTY_OWNER_ID
})
@JsonTypeName("SubscriptionPermissionsVM")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-22T14:13:34.806+03:00[Europe/Moscow]")
public class SubscriptionPermissionsVM {
  /**
   * Gets or Sets permissionType
   */
  public enum PermissionTypeEnum {
    OWNER("Owner"),
    
    GROUP("Group"),
    
    OTHER("Other"),
    
    ANON("Anon");

    private String value;

    PermissionTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PermissionTypeEnum fromValue(String value) {
      for (PermissionTypeEnum b : PermissionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PERMISSION_TYPE = "permissionType";
  private PermissionTypeEnum permissionType;

  public static final String JSON_PROPERTY_PERMISSION = "permission";
  private SubscriptionPermission permission;

  public static final String JSON_PROPERTY_GROUP_ID = "groupId";
  private String groupId;

  public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
  private String ownerId;


  public SubscriptionPermissionsVM permissionType(PermissionTypeEnum permissionType) {
    
    this.permissionType = permissionType;
    return this;
  }

   /**
   * Get permissionType
   * @return permissionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERMISSION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PermissionTypeEnum getPermissionType() {
    return permissionType;
  }


  public void setPermissionType(PermissionTypeEnum permissionType) {
    this.permissionType = permissionType;
  }


  public SubscriptionPermissionsVM permission(SubscriptionPermission permission) {
    
    this.permission = permission;
    return this;
  }

   /**
   * Get permission
   * @return permission
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionPermission getPermission() {
    return permission;
  }


  public void setPermission(SubscriptionPermission permission) {
    this.permission = permission;
  }


  public SubscriptionPermissionsVM groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public SubscriptionPermissionsVM ownerId(String ownerId) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionPermissionsVM subscriptionPermissionsVM = (SubscriptionPermissionsVM) o;
    return Objects.equals(this.permissionType, subscriptionPermissionsVM.permissionType) &&
        Objects.equals(this.permission, subscriptionPermissionsVM.permission) &&
        Objects.equals(this.groupId, subscriptionPermissionsVM.groupId) &&
        Objects.equals(this.ownerId, subscriptionPermissionsVM.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionType, permission, groupId, ownerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPermissionsVM {\n");
    sb.append("    permissionType: ").append(toIndentedString(permissionType)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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

