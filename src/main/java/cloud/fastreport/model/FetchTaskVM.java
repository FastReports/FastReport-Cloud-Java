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
import cloud.fastreport.model.TaskBaseVM;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import cloud.fastreport.JSON;
/**
 * FetchTaskVM
 */
@JsonPropertyOrder({
  FetchTaskVM.JSON_PROPERTY_DATA_SOURCE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonIgnoreProperties(
  value = "$t", // ignore manually set $t, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the $t to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$t", visible = true)

public class FetchTaskVM extends TaskBaseVM {
  public static final String JSON_PROPERTY_DATA_SOURCE_ID = "dataSourceId";
  private JsonNullable<String> dataSourceId = JsonNullable.<String>undefined();

  public FetchTaskVM() { 
  }

  public FetchTaskVM dataSourceId(String dataSourceId) {
    this.dataSourceId = JsonNullable.<String>of(dataSourceId);
    return this;
  }

   /**
   * Get dataSourceId
   * @return dataSourceId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getDataSourceId() {
        return dataSourceId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATA_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDataSourceId_JsonNullable() {
    return dataSourceId;
  }
  
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE_ID)
  public void setDataSourceId_JsonNullable(JsonNullable<String> dataSourceId) {
    this.dataSourceId = dataSourceId;
  }

  public void setDataSourceId(String dataSourceId) {
    this.dataSourceId = JsonNullable.<String>of(dataSourceId);
  }


  @Override
  public FetchTaskVM cronExpression(String cronExpression) {
    this.setCronExpression(cronExpression);
    return this;
  }

  @Override
  public FetchTaskVM delayedRunTime(OffsetDateTime delayedRunTime) {
    this.setDelayedRunTime(delayedRunTime);
    return this;
  }

  @Override
  public FetchTaskVM delayedWasRunTime(OffsetDateTime delayedWasRunTime) {
    this.setDelayedWasRunTime(delayedWasRunTime);
    return this;
  }

  @Override
  public FetchTaskVM id(String id) {
    this.setId(id);
    return this;
  }

  @Override
  public FetchTaskVM name(String name) {
    this.setName(name);
    return this;
  }

  @Override
  public FetchTaskVM recurrentRunTime(OffsetDateTime recurrentRunTime) {
    this.setRecurrentRunTime(recurrentRunTime);
    return this;
  }

  @Override
  public FetchTaskVM recurrentWasRunTime(OffsetDateTime recurrentWasRunTime) {
    this.setRecurrentWasRunTime(recurrentWasRunTime);
    return this;
  }

  @Override
  public FetchTaskVM subscriptionId(String subscriptionId) {
    this.setSubscriptionId(subscriptionId);
    return this;
  }

  /**
   * Return true if this FetchTaskVM object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FetchTaskVM fetchTaskVM = (FetchTaskVM) o;
    return equalsNullable(this.dataSourceId, fetchTaskVM.dataSourceId) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(dataSourceId), super.hashCode());
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
    sb.append("class FetchTaskVM {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dataSourceId: ").append(toIndentedString(dataSourceId)).append("\n");
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

    // add `cronExpression` to the URL query string
    if (getCronExpression() != null) {
      joiner.add(String.format("%scronExpression%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCronExpression()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `delayedRunTime` to the URL query string
    if (getDelayedRunTime() != null) {
      joiner.add(String.format("%sdelayedRunTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDelayedRunTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `delayedWasRunTime` to the URL query string
    if (getDelayedWasRunTime() != null) {
      joiner.add(String.format("%sdelayedWasRunTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDelayedWasRunTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `recurrentRunTime` to the URL query string
    if (getRecurrentRunTime() != null) {
      joiner.add(String.format("%srecurrentRunTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecurrentRunTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `recurrentWasRunTime` to the URL query string
    if (getRecurrentWasRunTime() != null) {
      joiner.add(String.format("%srecurrentWasRunTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecurrentWasRunTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `subscriptionId` to the URL query string
    if (getSubscriptionId() != null) {
      joiner.add(String.format("%ssubscriptionId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubscriptionId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `$t` to the URL query string
    if (get$T() != null) {
      joiner.add(String.format("%s$t%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(get$T()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("FetchTaskVM", FetchTaskVM.class);
  JSON.registerDiscriminator(FetchTaskVM.class, "$t", mappings);
}
}

