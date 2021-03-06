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
import cloud.fastreport.model.GroupUserVM;
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
 * GroupUsersVM
 */
@JsonPropertyOrder({
  GroupUsersVM.JSON_PROPERTY_USERS,
  GroupUsersVM.JSON_PROPERTY_COUNT,
  GroupUsersVM.JSON_PROPERTY_TAKE,
  GroupUsersVM.JSON_PROPERTY_SKIP
})
@JsonTypeName("GroupUsersVM")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GroupUsersVM {
  public static final String JSON_PROPERTY_USERS = "users";
  private JsonNullable<List<GroupUserVM>> users = JsonNullable.<List<GroupUserVM>>undefined();

  public static final String JSON_PROPERTY_COUNT = "count";
  private Long count;

  public static final String JSON_PROPERTY_TAKE = "take";
  private Integer take;

  public static final String JSON_PROPERTY_SKIP = "skip";
  private Integer skip;


  public GroupUsersVM users(List<GroupUserVM> users) {
    this.users = JsonNullable.<List<GroupUserVM>>of(users);
    
    return this;
  }

  public GroupUsersVM addUsersItem(GroupUserVM usersItem) {
    if (this.users == null || !this.users.isPresent()) {
      this.users = JsonNullable.<List<GroupUserVM>>of(new ArrayList<>());
    }
    try {
      this.users.get().add(usersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<GroupUserVM> getUsers() {
        return users.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<GroupUserVM>> getUsers_JsonNullable() {
    return users;
  }
  
  @JsonProperty(JSON_PROPERTY_USERS)
  public void setUsers_JsonNullable(JsonNullable<List<GroupUserVM>> users) {
    this.users = users;
  }

  public void setUsers(List<GroupUserVM> users) {
    this.users = JsonNullable.<List<GroupUserVM>>of(users);
  }


  public GroupUsersVM count(Long count) {
    
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


  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCount(Long count) {
    this.count = count;
  }


  public GroupUsersVM take(Integer take) {
    
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


  @JsonProperty(JSON_PROPERTY_TAKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTake(Integer take) {
    this.take = take;
  }


  public GroupUsersVM skip(Integer skip) {
    
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


  @JsonProperty(JSON_PROPERTY_SKIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkip(Integer skip) {
    this.skip = skip;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupUsersVM groupUsersVM = (GroupUsersVM) o;
    return Objects.equals(this.users, groupUsersVM.users) &&
        Objects.equals(this.count, groupUsersVM.count) &&
        Objects.equals(this.take, groupUsersVM.take) &&
        Objects.equals(this.skip, groupUsersVM.skip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, count, take, skip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupUsersVM {\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    take: ").append(toIndentedString(take)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
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

