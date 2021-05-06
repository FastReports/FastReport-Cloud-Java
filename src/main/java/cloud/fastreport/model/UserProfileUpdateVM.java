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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * UserProfileUpdateVM
 */
@JsonPropertyOrder({
  UserProfileUpdateVM.JSON_PROPERTY_NAME,
  UserProfileUpdateVM.JSON_PROPERTY_USERNAME,
  UserProfileUpdateVM.JSON_PROPERTY_EMAIL,
  UserProfileUpdateVM.JSON_PROPERTY_PASSWORD_NEW,
  UserProfileUpdateVM.JSON_PROPERTY_PASSWORD_NEW2
})
@JsonTypeName("UserProfileUpdateVM")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserProfileUpdateVM {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_PASSWORD_NEW = "passwordNew";
  private String passwordNew;

  public static final String JSON_PROPERTY_PASSWORD_NEW2 = "passwordNew2";
  private String passwordNew2;


  public UserProfileUpdateVM name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UserProfileUpdateVM username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public UserProfileUpdateVM email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public UserProfileUpdateVM passwordNew(String passwordNew) {
    
    this.passwordNew = passwordNew;
    return this;
  }

   /**
   * Get passwordNew
   * @return passwordNew
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PASSWORD_NEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPasswordNew() {
    return passwordNew;
  }


  public void setPasswordNew(String passwordNew) {
    this.passwordNew = passwordNew;
  }


  public UserProfileUpdateVM passwordNew2(String passwordNew2) {
    
    this.passwordNew2 = passwordNew2;
    return this;
  }

   /**
   * Get passwordNew2
   * @return passwordNew2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PASSWORD_NEW2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPasswordNew2() {
    return passwordNew2;
  }


  public void setPasswordNew2(String passwordNew2) {
    this.passwordNew2 = passwordNew2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfileUpdateVM userProfileUpdateVM = (UserProfileUpdateVM) o;
    return Objects.equals(this.name, userProfileUpdateVM.name) &&
        Objects.equals(this.username, userProfileUpdateVM.username) &&
        Objects.equals(this.email, userProfileUpdateVM.email) &&
        Objects.equals(this.passwordNew, userProfileUpdateVM.passwordNew) &&
        Objects.equals(this.passwordNew2, userProfileUpdateVM.passwordNew2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, username, email, passwordNew, passwordNew2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfileUpdateVM {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    passwordNew: ").append(toIndentedString(passwordNew)).append("\n");
    sb.append("    passwordNew2: ").append(toIndentedString(passwordNew2)).append("\n");
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
