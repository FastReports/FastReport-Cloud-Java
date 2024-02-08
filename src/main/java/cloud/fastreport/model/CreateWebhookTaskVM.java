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
import cloud.fastreport.model.CreateTransportTaskBaseVM;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import cloud.fastreport.JSON;
/**
 * CreateWebhookTaskVM
 */
@JsonPropertyOrder({
  CreateWebhookTaskVM.JSON_PROPERTY_HEADERS,
  CreateWebhookTaskVM.JSON_PROPERTY_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonIgnoreProperties(
  value = "$t", // ignore manually set $t, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the $t to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$t", visible = true)

public class CreateWebhookTaskVM extends CreateTransportTaskBaseVM {
  public static final String JSON_PROPERTY_HEADERS = "headers";
  private JsonNullable<Map<String, String>> headers = JsonNullable.<Map<String, String>>undefined();

  public static final String JSON_PROPERTY_URL = "url";
  private JsonNullable<URI> url = JsonNullable.<URI>undefined();

  public CreateWebhookTaskVM() { 
  }

  public CreateWebhookTaskVM headers(Map<String, String> headers) {
    this.headers = JsonNullable.<Map<String, String>>of(headers);
    return this;
  }

  public CreateWebhookTaskVM putHeadersItem(String key, String headersItem) {
    if (this.headers == null || !this.headers.isPresent()) {
      this.headers = JsonNullable.<Map<String, String>>of(new HashMap<>());
    }
    try {
      this.headers.get().put(key, headersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Map<String, String> getHeaders() {
        return headers.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, String>> getHeaders_JsonNullable() {
    return headers;
  }
  
  @JsonProperty(JSON_PROPERTY_HEADERS)
  public void setHeaders_JsonNullable(JsonNullable<Map<String, String>> headers) {
    this.headers = headers;
  }

  public void setHeaders(Map<String, String> headers) {
    this.headers = JsonNullable.<Map<String, String>>of(headers);
  }


  public CreateWebhookTaskVM url(URI url) {
    this.url = JsonNullable.<URI>of(url);
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public URI getUrl() {
        return url.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<URI> getUrl_JsonNullable() {
    return url;
  }
  
  @JsonProperty(JSON_PROPERTY_URL)
  public void setUrl_JsonNullable(JsonNullable<URI> url) {
    this.url = url;
  }

  public void setUrl(URI url) {
    this.url = JsonNullable.<URI>of(url);
  }


  @Override
  public CreateWebhookTaskVM cronExpression(String cronExpression) {
    this.setCronExpression(cronExpression);
    return this;
  }

  @Override
  public CreateWebhookTaskVM delayedRunTime(OffsetDateTime delayedRunTime) {
    this.setDelayedRunTime(delayedRunTime);
    return this;
  }

  @Override
  public CreateWebhookTaskVM name(String name) {
    this.setName(name);
    return this;
  }

  @Override
  public CreateWebhookTaskVM subscriptionId(String subscriptionId) {
    this.setSubscriptionId(subscriptionId);
    return this;
  }

  /**
   * Return true if this CreateWebhookTaskVM object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWebhookTaskVM createWebhookTaskVM = (CreateWebhookTaskVM) o;
    return equalsNullable(this.headers, createWebhookTaskVM.headers) &&
        equalsNullable(this.url, createWebhookTaskVM.url) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(headers), hashCodeNullable(url), super.hashCode());
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
    sb.append("class CreateWebhookTaskVM {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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
  mappings.put("CreateWebhookTaskVM", CreateWebhookTaskVM.class);
  JSON.registerDiscriminator(CreateWebhookTaskVM.class, "$t", mappings);
}
}

