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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AppMixins
 */
@JsonPropertyOrder({
  AppMixins.JSON_PROPERTY_HEAD,
  AppMixins.JSON_PROPERTY_BODY
})
@JsonTypeName("AppMixins")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AppMixins {
  public static final String JSON_PROPERTY_HEAD = "head";
  private JsonNullable<String> head = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BODY = "body";
  private JsonNullable<String> body = JsonNullable.<String>undefined();


  public AppMixins head(String head) {
    this.head = JsonNullable.<String>of(head);
    
    return this;
  }

   /**
   * Get head
   * @return head
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getHead() {
        return head.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HEAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getHead_JsonNullable() {
    return head;
  }
  
  @JsonProperty(JSON_PROPERTY_HEAD)
  public void setHead_JsonNullable(JsonNullable<String> head) {
    this.head = head;
  }

  public void setHead(String head) {
    this.head = JsonNullable.<String>of(head);
  }


  public AppMixins body(String body) {
    this.body = JsonNullable.<String>of(body);
    
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getBody() {
        return body.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBody_JsonNullable() {
    return body;
  }
  
  @JsonProperty(JSON_PROPERTY_BODY)
  public void setBody_JsonNullable(JsonNullable<String> body) {
    this.body = body;
  }

  public void setBody(String body) {
    this.body = JsonNullable.<String>of(body);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppMixins appMixins = (AppMixins) o;
    return Objects.equals(this.head, appMixins.head) &&
        Objects.equals(this.body, appMixins.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(head, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppMixins {\n");
    sb.append("    head: ").append(toIndentedString(head)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

