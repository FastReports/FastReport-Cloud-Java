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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateEndpointVM
 */
@JsonPropertyOrder({
  UpdateEndpointVM.JSON_PROPERTY_BEARER_TOKEN,
  UpdateEndpointVM.JSON_PROPERTY_HEADERS,
  UpdateEndpointVM.JSON_PROPERTY_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateEndpointVM {
  public static final String JSON_PROPERTY_BEARER_TOKEN = "bearerToken";
  private JsonNullable<String> bearerToken = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HEADERS = "headers";
  private JsonNullable<Map<String, String>> headers = JsonNullable.<Map<String, String>>undefined();

  public static final String JSON_PROPERTY_URL = "url";
  private JsonNullable<URI> url = JsonNullable.<URI>undefined();

  public UpdateEndpointVM() {
  }

  public UpdateEndpointVM bearerToken(String bearerToken) {
    this.bearerToken = JsonNullable.<String>of(bearerToken);
    
    return this;
  }

   /**
   * Get bearerToken
   * @return bearerToken
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getBearerToken() {
        return bearerToken.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BEARER_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBearerToken_JsonNullable() {
    return bearerToken;
  }
  
  @JsonProperty(JSON_PROPERTY_BEARER_TOKEN)
  public void setBearerToken_JsonNullable(JsonNullable<String> bearerToken) {
    this.bearerToken = bearerToken;
  }

  public void setBearerToken(String bearerToken) {
    this.bearerToken = JsonNullable.<String>of(bearerToken);
  }


  public UpdateEndpointVM headers(Map<String, String> headers) {
    this.headers = JsonNullable.<Map<String, String>>of(headers);
    
    return this;
  }

  public UpdateEndpointVM putHeadersItem(String key, String headersItem) {
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


  public UpdateEndpointVM url(URI url) {
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateEndpointVM updateEndpointVM = (UpdateEndpointVM) o;
    return equalsNullable(this.bearerToken, updateEndpointVM.bearerToken) &&
        equalsNullable(this.headers, updateEndpointVM.headers) &&
        equalsNullable(this.url, updateEndpointVM.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(bearerToken), hashCodeNullable(headers), hashCodeNullable(url));
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
    sb.append("class UpdateEndpointVM {\n");
    sb.append("    bearerToken: ").append(toIndentedString(bearerToken)).append("\n");
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

}

