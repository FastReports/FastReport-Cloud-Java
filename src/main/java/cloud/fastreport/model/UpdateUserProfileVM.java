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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateUserProfileVM
 */
@JsonPropertyOrder({
  UpdateUserProfileVM.JSON_PROPERTY_NAME,
  UpdateUserProfileVM.JSON_PROPERTY_USERNAME,
  UpdateUserProfileVM.JSON_PROPERTY_EMAIL,
  UpdateUserProfileVM.JSON_PROPERTY_PASSWORD_NEW,
  UpdateUserProfileVM.JSON_PROPERTY_PASSWORD_NEW2
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateUserProfileVM {
  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USERNAME = "username";
  private JsonNullable<String> username = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EMAIL = "email";
  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PASSWORD_NEW = "passwordNew";
  private JsonNullable<String> passwordNew = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PASSWORD_NEW2 = "passwordNew2";
  private JsonNullable<String> passwordNew2 = JsonNullable.<String>undefined();

  public UpdateUserProfileVM() {
  }

  public UpdateUserProfileVM name(String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public UpdateUserProfileVM username(String username) {
    this.username = JsonNullable.<String>of(username);
    
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getUsername() {
        return username.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUsername_JsonNullable() {
    return username;
  }
  
  @JsonProperty(JSON_PROPERTY_USERNAME)
  public void setUsername_JsonNullable(JsonNullable<String> username) {
    this.username = username;
  }

  public void setUsername(String username) {
    this.username = JsonNullable.<String>of(username);
  }


  public UpdateUserProfileVM email(String email) {
    this.email = JsonNullable.<String>of(email);
    
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getEmail() {
        return email.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEmail_JsonNullable() {
    return email;
  }
  
  @JsonProperty(JSON_PROPERTY_EMAIL)
  public void setEmail_JsonNullable(JsonNullable<String> email) {
    this.email = email;
  }

  public void setEmail(String email) {
    this.email = JsonNullable.<String>of(email);
  }


  public UpdateUserProfileVM passwordNew(String passwordNew) {
    this.passwordNew = JsonNullable.<String>of(passwordNew);
    
    return this;
  }

   /**
   * Get passwordNew
   * @return passwordNew
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPasswordNew() {
        return passwordNew.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PASSWORD_NEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPasswordNew_JsonNullable() {
    return passwordNew;
  }
  
  @JsonProperty(JSON_PROPERTY_PASSWORD_NEW)
  public void setPasswordNew_JsonNullable(JsonNullable<String> passwordNew) {
    this.passwordNew = passwordNew;
  }

  public void setPasswordNew(String passwordNew) {
    this.passwordNew = JsonNullable.<String>of(passwordNew);
  }


  public UpdateUserProfileVM passwordNew2(String passwordNew2) {
    this.passwordNew2 = JsonNullable.<String>of(passwordNew2);
    
    return this;
  }

   /**
   * Get passwordNew2
   * @return passwordNew2
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPasswordNew2() {
        return passwordNew2.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PASSWORD_NEW2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPasswordNew2_JsonNullable() {
    return passwordNew2;
  }
  
  @JsonProperty(JSON_PROPERTY_PASSWORD_NEW2)
  public void setPasswordNew2_JsonNullable(JsonNullable<String> passwordNew2) {
    this.passwordNew2 = passwordNew2;
  }

  public void setPasswordNew2(String passwordNew2) {
    this.passwordNew2 = JsonNullable.<String>of(passwordNew2);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserProfileVM updateUserProfileVM = (UpdateUserProfileVM) o;
    return equalsNullable(this.name, updateUserProfileVM.name) &&
        equalsNullable(this.username, updateUserProfileVM.username) &&
        equalsNullable(this.email, updateUserProfileVM.email) &&
        equalsNullable(this.passwordNew, updateUserProfileVM.passwordNew) &&
        equalsNullable(this.passwordNew2, updateUserProfileVM.passwordNew2);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(username), hashCodeNullable(email), hashCodeNullable(passwordNew), hashCodeNullable(passwordNew2));
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
    sb.append("class UpdateUserProfileVM {\n");
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

