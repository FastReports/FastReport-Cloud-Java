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
 * AuthConfigVM
 */
@JsonPropertyOrder({
  AuthConfigVM.JSON_PROPERTY_USE_LOCAL,
  AuthConfigVM.JSON_PROPERTY_USE_OPEN_ID,
  AuthConfigVM.JSON_PROPERTY_AUTHORITY
})
@JsonTypeName("AuthConfigVM")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthConfigVM {
  public static final String JSON_PROPERTY_USE_LOCAL = "useLocal";
  private Boolean useLocal;

  public static final String JSON_PROPERTY_USE_OPEN_ID = "useOpenId";
  private Boolean useOpenId;

  public static final String JSON_PROPERTY_AUTHORITY = "authority";
  private JsonNullable<String> authority = JsonNullable.<String>undefined();


  public AuthConfigVM useLocal(Boolean useLocal) {
    
    this.useLocal = useLocal;
    return this;
  }

   /**
   * Get useLocal
   * @return useLocal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USE_LOCAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseLocal() {
    return useLocal;
  }


  @JsonProperty(JSON_PROPERTY_USE_LOCAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseLocal(Boolean useLocal) {
    this.useLocal = useLocal;
  }


  public AuthConfigVM useOpenId(Boolean useOpenId) {
    
    this.useOpenId = useOpenId;
    return this;
  }

   /**
   * Get useOpenId
   * @return useOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USE_OPEN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseOpenId() {
    return useOpenId;
  }


  @JsonProperty(JSON_PROPERTY_USE_OPEN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseOpenId(Boolean useOpenId) {
    this.useOpenId = useOpenId;
  }


  public AuthConfigVM authority(String authority) {
    this.authority = JsonNullable.<String>of(authority);
    
    return this;
  }

   /**
   * Get authority
   * @return authority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getAuthority() {
        return authority.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AUTHORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAuthority_JsonNullable() {
    return authority;
  }
  
  @JsonProperty(JSON_PROPERTY_AUTHORITY)
  public void setAuthority_JsonNullable(JsonNullable<String> authority) {
    this.authority = authority;
  }

  public void setAuthority(String authority) {
    this.authority = JsonNullable.<String>of(authority);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthConfigVM authConfigVM = (AuthConfigVM) o;
    return Objects.equals(this.useLocal, authConfigVM.useLocal) &&
        Objects.equals(this.useOpenId, authConfigVM.useOpenId) &&
        Objects.equals(this.authority, authConfigVM.authority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useLocal, useOpenId, authority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthConfigVM {\n");
    sb.append("    useLocal: ").append(toIndentedString(useLocal)).append("\n");
    sb.append("    useOpenId: ").append(toIndentedString(useOpenId)).append("\n");
    sb.append("    authority: ").append(toIndentedString(authority)).append("\n");
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

