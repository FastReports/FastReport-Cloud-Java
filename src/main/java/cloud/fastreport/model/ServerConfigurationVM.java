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
import cloud.fastreport.model.AppMixins;
import cloud.fastreport.model.AuthConfigVM;
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
 * ServerConfigurationVM
 */
@JsonPropertyOrder({
  ServerConfigurationVM.JSON_PROPERTY_TITLE,
  ServerConfigurationVM.JSON_PROPERTY_CORPORATE_SERVER_MODE,
  ServerConfigurationVM.JSON_PROPERTY_IS_DISABLED,
  ServerConfigurationVM.JSON_PROPERTY_APP_MIXINS,
  ServerConfigurationVM.JSON_PROPERTY_AUTH
})
@JsonTypeName("ServerConfigurationVM")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServerConfigurationVM {
  public static final String JSON_PROPERTY_TITLE = "title";
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CORPORATE_SERVER_MODE = "corporateServerMode";
  private Boolean corporateServerMode;

  public static final String JSON_PROPERTY_IS_DISABLED = "isDisabled";
  private Boolean isDisabled;

  public static final String JSON_PROPERTY_APP_MIXINS = "appMixins";
  private AppMixins appMixins;

  public static final String JSON_PROPERTY_AUTH = "auth";
  private AuthConfigVM auth;


  public ServerConfigurationVM title(String title) {
    this.title = JsonNullable.<String>of(title);
    
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getTitle() {
        return title.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTitle_JsonNullable() {
    return title;
  }
  
  @JsonProperty(JSON_PROPERTY_TITLE)
  public void setTitle_JsonNullable(JsonNullable<String> title) {
    this.title = title;
  }

  public void setTitle(String title) {
    this.title = JsonNullable.<String>of(title);
  }


  public ServerConfigurationVM corporateServerMode(Boolean corporateServerMode) {
    
    this.corporateServerMode = corporateServerMode;
    return this;
  }

   /**
   * Get corporateServerMode
   * @return corporateServerMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CORPORATE_SERVER_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCorporateServerMode() {
    return corporateServerMode;
  }


  @JsonProperty(JSON_PROPERTY_CORPORATE_SERVER_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCorporateServerMode(Boolean corporateServerMode) {
    this.corporateServerMode = corporateServerMode;
  }


  public ServerConfigurationVM isDisabled(Boolean isDisabled) {
    
    this.isDisabled = isDisabled;
    return this;
  }

   /**
   * Get isDisabled
   * @return isDisabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDisabled() {
    return isDisabled;
  }


  @JsonProperty(JSON_PROPERTY_IS_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
  }


  public ServerConfigurationVM appMixins(AppMixins appMixins) {
    
    this.appMixins = appMixins;
    return this;
  }

   /**
   * Get appMixins
   * @return appMixins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APP_MIXINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppMixins getAppMixins() {
    return appMixins;
  }


  @JsonProperty(JSON_PROPERTY_APP_MIXINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppMixins(AppMixins appMixins) {
    this.appMixins = appMixins;
  }


  public ServerConfigurationVM auth(AuthConfigVM auth) {
    
    this.auth = auth;
    return this;
  }

   /**
   * Get auth
   * @return auth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AuthConfigVM getAuth() {
    return auth;
  }


  @JsonProperty(JSON_PROPERTY_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuth(AuthConfigVM auth) {
    this.auth = auth;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerConfigurationVM serverConfigurationVM = (ServerConfigurationVM) o;
    return Objects.equals(this.title, serverConfigurationVM.title) &&
        Objects.equals(this.corporateServerMode, serverConfigurationVM.corporateServerMode) &&
        Objects.equals(this.isDisabled, serverConfigurationVM.isDisabled) &&
        Objects.equals(this.appMixins, serverConfigurationVM.appMixins) &&
        Objects.equals(this.auth, serverConfigurationVM.auth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, corporateServerMode, isDisabled, appMixins, auth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerConfigurationVM {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    corporateServerMode: ").append(toIndentedString(corporateServerMode)).append("\n");
    sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
    sb.append("    appMixins: ").append(toIndentedString(appMixins)).append("\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
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
