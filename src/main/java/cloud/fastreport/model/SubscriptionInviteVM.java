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
import cloud.fastreport.model.InvitedUser;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SubscriptionInviteVM
 */
@JsonPropertyOrder({
  SubscriptionInviteVM.JSON_PROPERTY_USAGES,
  SubscriptionInviteVM.JSON_PROPERTY_DURABLE,
  SubscriptionInviteVM.JSON_PROPERTY_ACCESS_TOKEN,
  SubscriptionInviteVM.JSON_PROPERTY_EXPIRED_DATE,
  SubscriptionInviteVM.JSON_PROPERTY_ADDED_USERS,
  SubscriptionInviteVM.JSON_PROPERTY_CREATOR_USER_ID
})
@JsonTypeName("SubscriptionInviteVM")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-22T14:13:34.806+03:00[Europe/Moscow]")
public class SubscriptionInviteVM {
  public static final String JSON_PROPERTY_USAGES = "usages";
  private Long usages;

  public static final String JSON_PROPERTY_DURABLE = "durable";
  private Boolean durable;

  public static final String JSON_PROPERTY_ACCESS_TOKEN = "accessToken";
  private String accessToken;

  public static final String JSON_PROPERTY_EXPIRED_DATE = "expiredDate";
  private OffsetDateTime expiredDate;

  public static final String JSON_PROPERTY_ADDED_USERS = "addedUsers";
  private List<InvitedUser> addedUsers = null;

  public static final String JSON_PROPERTY_CREATOR_USER_ID = "creatorUserId";
  private String creatorUserId;


  public SubscriptionInviteVM usages(Long usages) {
    
    this.usages = usages;
    return this;
  }

   /**
   * Get usages
   * @return usages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUsages() {
    return usages;
  }


  public void setUsages(Long usages) {
    this.usages = usages;
  }


  public SubscriptionInviteVM durable(Boolean durable) {
    
    this.durable = durable;
    return this;
  }

   /**
   * Get durable
   * @return durable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DURABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDurable() {
    return durable;
  }


  public void setDurable(Boolean durable) {
    this.durable = durable;
  }


  public SubscriptionInviteVM accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Get accessToken
   * @return accessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public SubscriptionInviteVM expiredDate(OffsetDateTime expiredDate) {
    
    this.expiredDate = expiredDate;
    return this;
  }

   /**
   * Get expiredDate
   * @return expiredDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPIRED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getExpiredDate() {
    return expiredDate;
  }


  public void setExpiredDate(OffsetDateTime expiredDate) {
    this.expiredDate = expiredDate;
  }


  public SubscriptionInviteVM addedUsers(List<InvitedUser> addedUsers) {
    
    this.addedUsers = addedUsers;
    return this;
  }

  public SubscriptionInviteVM addAddedUsersItem(InvitedUser addedUsersItem) {
    if (this.addedUsers == null) {
      this.addedUsers = new ArrayList<>();
    }
    this.addedUsers.add(addedUsersItem);
    return this;
  }

   /**
   * Get addedUsers
   * @return addedUsers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDED_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InvitedUser> getAddedUsers() {
    return addedUsers;
  }


  public void setAddedUsers(List<InvitedUser> addedUsers) {
    this.addedUsers = addedUsers;
  }


  public SubscriptionInviteVM creatorUserId(String creatorUserId) {
    
    this.creatorUserId = creatorUserId;
    return this;
  }

   /**
   * Get creatorUserId
   * @return creatorUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATOR_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatorUserId() {
    return creatorUserId;
  }


  public void setCreatorUserId(String creatorUserId) {
    this.creatorUserId = creatorUserId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionInviteVM subscriptionInviteVM = (SubscriptionInviteVM) o;
    return Objects.equals(this.usages, subscriptionInviteVM.usages) &&
        Objects.equals(this.durable, subscriptionInviteVM.durable) &&
        Objects.equals(this.accessToken, subscriptionInviteVM.accessToken) &&
        Objects.equals(this.expiredDate, subscriptionInviteVM.expiredDate) &&
        Objects.equals(this.addedUsers, subscriptionInviteVM.addedUsers) &&
        Objects.equals(this.creatorUserId, subscriptionInviteVM.creatorUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usages, durable, accessToken, expiredDate, addedUsers, creatorUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionInviteVM {\n");
    sb.append("    usages: ").append(toIndentedString(usages)).append("\n");
    sb.append("    durable: ").append(toIndentedString(durable)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiredDate: ").append(toIndentedString(expiredDate)).append("\n");
    sb.append("    addedUsers: ").append(toIndentedString(addedUsers)).append("\n");
    sb.append("    creatorUserId: ").append(toIndentedString(creatorUserId)).append("\n");
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

