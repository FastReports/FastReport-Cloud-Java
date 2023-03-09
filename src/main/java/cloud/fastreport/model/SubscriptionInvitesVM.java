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
import cloud.fastreport.model.SubscriptionInviteVM;
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
 * SubscriptionInvitesVM
 */
@JsonPropertyOrder({
  SubscriptionInvitesVM.JSON_PROPERTY_INVITES,
  SubscriptionInvitesVM.JSON_PROPERTY_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubscriptionInvitesVM {
  public static final String JSON_PROPERTY_INVITES = "invites";
  private JsonNullable<List<SubscriptionInviteVM>> invites = JsonNullable.<List<SubscriptionInviteVM>>undefined();

  public static final String JSON_PROPERTY_COUNT = "count";
  private Long count;

  public SubscriptionInvitesVM() {
  }

  public SubscriptionInvitesVM invites(List<SubscriptionInviteVM> invites) {
    this.invites = JsonNullable.<List<SubscriptionInviteVM>>of(invites);
    
    return this;
  }

  public SubscriptionInvitesVM addInvitesItem(SubscriptionInviteVM invitesItem) {
    if (this.invites == null || !this.invites.isPresent()) {
      this.invites = JsonNullable.<List<SubscriptionInviteVM>>of(new ArrayList<>());
    }
    try {
      this.invites.get().add(invitesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get invites
   * @return invites
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public List<SubscriptionInviteVM> getInvites() {
        return invites.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INVITES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<SubscriptionInviteVM>> getInvites_JsonNullable() {
    return invites;
  }
  
  @JsonProperty(JSON_PROPERTY_INVITES)
  public void setInvites_JsonNullable(JsonNullable<List<SubscriptionInviteVM>> invites) {
    this.invites = invites;
  }

  public void setInvites(List<SubscriptionInviteVM> invites) {
    this.invites = JsonNullable.<List<SubscriptionInviteVM>>of(invites);
  }


  public SubscriptionInvitesVM count(Long count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionInvitesVM subscriptionInvitesVM = (SubscriptionInvitesVM) o;
    return equalsNullable(this.invites, subscriptionInvitesVM.invites) &&
        Objects.equals(this.count, subscriptionInvitesVM.count);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(invites), count);
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
    sb.append("class SubscriptionInvitesVM {\n");
    sb.append("    invites: ").append(toIndentedString(invites)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

