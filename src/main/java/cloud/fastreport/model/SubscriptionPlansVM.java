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
import cloud.fastreport.model.SubscriptionPlanVM;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SubscriptionPlansVM
 */
@JsonPropertyOrder({
  SubscriptionPlansVM.JSON_PROPERTY_SUBSCRIPTION_PLANS,
  SubscriptionPlansVM.JSON_PROPERTY_COUNT,
  SubscriptionPlansVM.JSON_PROPERTY_SKIP,
  SubscriptionPlansVM.JSON_PROPERTY_TAKE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubscriptionPlansVM {
  public static final String JSON_PROPERTY_SUBSCRIPTION_PLANS = "subscriptionPlans";
  private JsonNullable<List<SubscriptionPlanVM>> subscriptionPlans = JsonNullable.<List<SubscriptionPlanVM>>undefined();

  public static final String JSON_PROPERTY_COUNT = "count";
  private Long count;

  public static final String JSON_PROPERTY_SKIP = "skip";
  private Integer skip;

  public static final String JSON_PROPERTY_TAKE = "take";
  private Integer take;

  public SubscriptionPlansVM() { 
  }

  public SubscriptionPlansVM subscriptionPlans(List<SubscriptionPlanVM> subscriptionPlans) {
    this.subscriptionPlans = JsonNullable.<List<SubscriptionPlanVM>>of(subscriptionPlans);
    return this;
  }

  public SubscriptionPlansVM addSubscriptionPlansItem(SubscriptionPlanVM subscriptionPlansItem) {
    if (this.subscriptionPlans == null || !this.subscriptionPlans.isPresent()) {
      this.subscriptionPlans = JsonNullable.<List<SubscriptionPlanVM>>of(new ArrayList<>());
    }
    try {
      this.subscriptionPlans.get().add(subscriptionPlansItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get subscriptionPlans
   * @return subscriptionPlans
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public List<SubscriptionPlanVM> getSubscriptionPlans() {
        return subscriptionPlans.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_PLANS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<SubscriptionPlanVM>> getSubscriptionPlans_JsonNullable() {
    return subscriptionPlans;
  }
  
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_PLANS)
  public void setSubscriptionPlans_JsonNullable(JsonNullable<List<SubscriptionPlanVM>> subscriptionPlans) {
    this.subscriptionPlans = subscriptionPlans;
  }

  public void setSubscriptionPlans(List<SubscriptionPlanVM> subscriptionPlans) {
    this.subscriptionPlans = JsonNullable.<List<SubscriptionPlanVM>>of(subscriptionPlans);
  }


  public SubscriptionPlansVM count(Long count) {
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


  public SubscriptionPlansVM skip(Integer skip) {
    this.skip = skip;
    return this;
  }

   /**
   * Get skip
   * @return skip
  **/
  @javax.annotation.Nullable
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


  public SubscriptionPlansVM take(Integer take) {
    this.take = take;
    return this;
  }

   /**
   * Get take
   * @return take
  **/
  @javax.annotation.Nullable
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


  /**
   * Return true if this SubscriptionPlansVM object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionPlansVM subscriptionPlansVM = (SubscriptionPlansVM) o;
    return equalsNullable(this.subscriptionPlans, subscriptionPlansVM.subscriptionPlans) &&
        Objects.equals(this.count, subscriptionPlansVM.count) &&
        Objects.equals(this.skip, subscriptionPlansVM.skip) &&
        Objects.equals(this.take, subscriptionPlansVM.take);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(subscriptionPlans), count, skip, take);
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
    sb.append("class SubscriptionPlansVM {\n");
    sb.append("    subscriptionPlans: ").append(toIndentedString(subscriptionPlans)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
    sb.append("    take: ").append(toIndentedString(take)).append("\n");
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

    // add `subscriptionPlans` to the URL query string
    if (getSubscriptionPlans() != null) {
      for (int i = 0; i < getSubscriptionPlans().size(); i++) {
        if (getSubscriptionPlans().get(i) != null) {
          joiner.add(getSubscriptionPlans().get(i).toUrlQueryString(String.format("%ssubscriptionPlans%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `count` to the URL query string
    if (getCount() != null) {
      joiner.add(String.format("%scount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `skip` to the URL query string
    if (getSkip() != null) {
      joiner.add(String.format("%sskip%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSkip()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `take` to the URL query string
    if (getTake() != null) {
      joiner.add(String.format("%stake%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTake()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

