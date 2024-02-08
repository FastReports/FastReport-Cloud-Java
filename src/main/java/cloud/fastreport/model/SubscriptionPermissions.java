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

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import cloud.fastreport.model.SubscriptionPermission;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubscriptionPermissions {
  public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
  private JsonNullable<String> ownerId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OWNER = "owner";
  private SubscriptionPermission owner;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private JsonNullable<Map<String, SubscriptionPermission>> groups = JsonNullable.<Map<String, SubscriptionPermission>>undefined();

  public static final String JSON_PROPERTY_OTHER = "other";
  private SubscriptionPermission other;

  public static final String JSON_PROPERTY_ANON = "anon";
  private SubscriptionPermission anon;

  public SubscriptionPermissions() { 
  }

  public SubscriptionPermissions ownerId(String ownerId) {
    this.ownerId = JsonNullable.<String>of(ownerId);
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @javax.annotation.Nullable
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


  public SubscriptionPermissions owner(SubscriptionPermission owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionPermission getOwner() {
    return owner;
  }


  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwner(SubscriptionPermission owner) {
    this.owner = owner;
  }


  public SubscriptionPermissions groups(Map<String, SubscriptionPermission> groups) {
    this.groups = JsonNullable.<Map<String, SubscriptionPermission>>of(groups);
    return this;
  }

  public SubscriptionPermissions putGroupsItem(String key, SubscriptionPermission groupsItem) {
    if (this.groups == null || !this.groups.isPresent()) {
      this.groups = JsonNullable.<Map<String, SubscriptionPermission>>of(new HashMap<>());
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
  @JsonIgnore

  public Map<String, SubscriptionPermission> getGroups() {
        return groups.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, SubscriptionPermission>> getGroups_JsonNullable() {
    return groups;
  }
  
  @JsonProperty(JSON_PROPERTY_GROUPS)
  public void setGroups_JsonNullable(JsonNullable<Map<String, SubscriptionPermission>> groups) {
    this.groups = groups;
  }

  public void setGroups(Map<String, SubscriptionPermission> groups) {
    this.groups = JsonNullable.<Map<String, SubscriptionPermission>>of(groups);
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
  @JsonProperty(JSON_PROPERTY_OTHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionPermission getOther() {
    return other;
  }


  @JsonProperty(JSON_PROPERTY_OTHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_ANON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionPermission getAnon() {
    return anon;
  }


  @JsonProperty(JSON_PROPERTY_ANON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnon(SubscriptionPermission anon) {
    this.anon = anon;
  }


  /**
   * Return true if this SubscriptionPermissions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionPermissions subscriptionPermissions = (SubscriptionPermissions) o;
    return equalsNullable(this.ownerId, subscriptionPermissions.ownerId) &&
        Objects.equals(this.owner, subscriptionPermissions.owner) &&
        equalsNullable(this.groups, subscriptionPermissions.groups) &&
        Objects.equals(this.other, subscriptionPermissions.other) &&
        Objects.equals(this.anon, subscriptionPermissions.anon);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(ownerId), owner, hashCodeNullable(groups), other, anon);
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `ownerId` to the URL query string
    if (getOwnerId() != null) {
      joiner.add(String.format("%sownerId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOwnerId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `owner` to the URL query string
    if (getOwner() != null) {
      joiner.add(getOwner().toUrlQueryString(prefix + "owner" + suffix));
    }

    // add `groups` to the URL query string
    if (getGroups() != null) {
      for (String _key : getGroups().keySet()) {
        if (getGroups().get(_key) != null) {
          joiner.add(getGroups().get(_key).toUrlQueryString(String.format("%sgroups%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    // add `other` to the URL query string
    if (getOther() != null) {
      joiner.add(getOther().toUrlQueryString(prefix + "other" + suffix));
    }

    // add `anon` to the URL query string
    if (getAnon() != null) {
      joiner.add(getAnon().toUrlQueryString(prefix + "anon" + suffix));
    }

    return joiner.toString();
  }
}

