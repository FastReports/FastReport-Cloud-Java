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
import cloud.fastreport.model.GroupVM;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SubscriptionUserVM
 */
@JsonPropertyOrder({
  SubscriptionUserVM.JSON_PROPERTY_USER_ID,
  SubscriptionUserVM.JSON_PROPERTY_GROUPS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubscriptionUserVM {
  public static final String JSON_PROPERTY_USER_ID = "userId";
  private JsonNullable<String> userId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private JsonNullable<List<GroupVM>> groups = JsonNullable.<List<GroupVM>>undefined();

  public SubscriptionUserVM() {
  }

  public SubscriptionUserVM userId(String userId) {
    this.userId = JsonNullable.<String>of(userId);
    
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getUserId() {
        return userId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUserId_JsonNullable() {
    return userId;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_ID)
  public void setUserId_JsonNullable(JsonNullable<String> userId) {
    this.userId = userId;
  }

  public void setUserId(String userId) {
    this.userId = JsonNullable.<String>of(userId);
  }


  public SubscriptionUserVM groups(List<GroupVM> groups) {
    this.groups = JsonNullable.<List<GroupVM>>of(groups);
    
    return this;
  }

  public SubscriptionUserVM addGroupsItem(GroupVM groupsItem) {
    if (this.groups == null || !this.groups.isPresent()) {
      this.groups = JsonNullable.<List<GroupVM>>of(new ArrayList<>());
    }
    try {
      this.groups.get().add(groupsItem);
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
  @JsonIgnore

  public List<GroupVM> getGroups() {
        return groups.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<GroupVM>> getGroups_JsonNullable() {
    return groups;
  }
  
  @JsonProperty(JSON_PROPERTY_GROUPS)
  public void setGroups_JsonNullable(JsonNullable<List<GroupVM>> groups) {
    this.groups = groups;
  }

  public void setGroups(List<GroupVM> groups) {
    this.groups = JsonNullable.<List<GroupVM>>of(groups);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionUserVM subscriptionUserVM = (SubscriptionUserVM) o;
    return equalsNullable(this.userId, subscriptionUserVM.userId) &&
        equalsNullable(this.groups, subscriptionUserVM.groups);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(userId), hashCodeNullable(groups));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionUserVM {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

