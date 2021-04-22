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
import cloud.fastreport.model.SubscriptionPlanVM;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
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
@JsonTypeName("SubscriptionPlansVM")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-22T14:13:34.806+03:00[Europe/Moscow]")
public class SubscriptionPlansVM {
  public static final String JSON_PROPERTY_SUBSCRIPTION_PLANS = "subscriptionPlans";
  private List<SubscriptionPlanVM> subscriptionPlans = null;

  public static final String JSON_PROPERTY_COUNT = "count";
  private Long count;

  public static final String JSON_PROPERTY_SKIP = "skip";
  private Integer skip;

  public static final String JSON_PROPERTY_TAKE = "take";
  private Integer take;


  public SubscriptionPlansVM subscriptionPlans(List<SubscriptionPlanVM> subscriptionPlans) {
    
    this.subscriptionPlans = subscriptionPlans;
    return this;
  }

  public SubscriptionPlansVM addSubscriptionPlansItem(SubscriptionPlanVM subscriptionPlansItem) {
    if (this.subscriptionPlans == null) {
      this.subscriptionPlans = new ArrayList<>();
    }
    this.subscriptionPlans.add(subscriptionPlansItem);
    return this;
  }

   /**
   * Get subscriptionPlans
   * @return subscriptionPlans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_PLANS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SubscriptionPlanVM> getSubscriptionPlans() {
    return subscriptionPlans;
  }


  public void setSubscriptionPlans(List<SubscriptionPlanVM> subscriptionPlans) {
    this.subscriptionPlans = subscriptionPlans;
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
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCount() {
    return count;
  }


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
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SKIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSkip() {
    return skip;
  }


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
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTake() {
    return take;
  }


  public void setTake(Integer take) {
    this.take = take;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionPlansVM subscriptionPlansVM = (SubscriptionPlansVM) o;
    return Objects.equals(this.subscriptionPlans, subscriptionPlansVM.subscriptionPlans) &&
        Objects.equals(this.count, subscriptionPlansVM.count) &&
        Objects.equals(this.skip, subscriptionPlansVM.skip) &&
        Objects.equals(this.take, subscriptionPlansVM.take);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionPlans, count, skip, take);
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

}

