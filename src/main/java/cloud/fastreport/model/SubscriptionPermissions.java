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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SubscriptionPermissions
 */
@JsonPropertyOrder({
  SubscriptionPermissions.JSON_PROPERTY_OWNER_ID,
  SubscriptionPermissions.JSON_PROPERTY_OWNER,
  SubscriptionPermissions.JSON_PROPERTY_GROUPS,
  SubscriptionPermissions.JSON_PROPERTY_OTHER,
  SubscriptionPermissions.JSON_PROPERTY_ANON
})
@JsonTypeName("SubscriptionPermissions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-22T14:13:34.806+03:00[Europe/Moscow]")
public class SubscriptionPermissions {
  public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
  private String ownerId;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private SubscriptionPermission owner;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private Map<String, SubscriptionPermission> groups = null;

  public static final String JSON_PROPERTY_OTHER = "other";
  private SubscriptionPermission other;

  public static final String JSON_PROPERTY_ANON = "anon";
  private SubscriptionPermission anon;


  public SubscriptionPermissions ownerId(String ownerId) {
    
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


  public SubscriptionPermissions owner(SubscriptionPermission owner) {
    
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

  public SubscriptionPermission getOwner() {
    return owner;
  }


  public void setOwner(SubscriptionPermission owner) {
    this.owner = owner;
  }


  public SubscriptionPermissions groups(Map<String, SubscriptionPermission> groups) {
    
    this.groups = groups;
    return this;
  }

  public SubscriptionPermissions putGroupsItem(String key, SubscriptionPermission groupsItem) {
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

  public Map<String, SubscriptionPermission> getGroups() {
    return groups;
  }


  public void setGroups(Map<String, SubscriptionPermission> groups) {
    this.groups = groups;
  }


  public SubscriptionPermissions other(SubscriptionPermission other) {
    
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

  public SubscriptionPermission getOther() {
    return other;
  }


  public void setOther(SubscriptionPermission other) {
    this.other = other;
  }


  public SubscriptionPermissions anon(SubscriptionPermission anon) {
    
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

  public SubscriptionPermission getAnon() {
    return anon;
  }


  public void setAnon(SubscriptionPermission anon) {
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
    SubscriptionPermissions subscriptionPermissions = (SubscriptionPermissions) o;
    return Objects.equals(this.ownerId, subscriptionPermissions.ownerId) &&
        Objects.equals(this.owner, subscriptionPermissions.owner) &&
        Objects.equals(this.groups, subscriptionPermissions.groups) &&
        Objects.equals(this.other, subscriptionPermissions.other) &&
        Objects.equals(this.anon, subscriptionPermissions.anon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerId, owner, groups, other, anon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPermissions {\n");
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

