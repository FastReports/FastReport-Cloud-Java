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
import cloud.fastreport.model.AdminPermission;
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
 * RegisterUserVM
 */
@JsonPropertyOrder({
  RegisterUserVM.JSON_PROPERTY_ID,
  RegisterUserVM.JSON_PROPERTY_SUBSCRIPTIONS,
  RegisterUserVM.JSON_PROPERTY_GROUPS,
  RegisterUserVM.JSON_PROPERTY_ADMIN_PERMISSION,
  RegisterUserVM.JSON_PROPERTY_NAME,
  RegisterUserVM.JSON_PROPERTY_USERNAME,
  RegisterUserVM.JSON_PROPERTY_EMAIL,
  RegisterUserVM.JSON_PROPERTY_PASSWORD,
  RegisterUserVM.JSON_PROPERTY_IS_ADMIN,
  RegisterUserVM.JSON_PROPERTY_PROVIDER
})
@JsonTypeName("RegisterUserVM")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RegisterUserVM {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SUBSCRIPTIONS = "subscriptions";
  private List<String> subscriptions = null;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private List<String> groups = null;

  public static final String JSON_PROPERTY_ADMIN_PERMISSION = "adminPermission";
  private AdminPermission adminPermission;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_IS_ADMIN = "isAdmin";
  private Boolean isAdmin;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private String provider;


  public RegisterUserVM id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public RegisterUserVM subscriptions(List<String> subscriptions) {
    
    this.subscriptions = subscriptions;
    return this;
  }

  public RegisterUserVM addSubscriptionsItem(String subscriptionsItem) {
    if (this.subscriptions == null) {
      this.subscriptions = new ArrayList<>();
    }
    this.subscriptions.add(subscriptionsItem);
    return this;
  }

   /**
   * Get subscriptions
   * @return subscriptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSubscriptions() {
    return subscriptions;
  }


  public void setSubscriptions(List<String> subscriptions) {
    this.subscriptions = subscriptions;
  }


  public RegisterUserVM groups(List<String> groups) {
    
    this.groups = groups;
    return this;
  }

  public RegisterUserVM addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getGroups() {
    return groups;
  }


  public void setGroups(List<String> groups) {
    this.groups = groups;
  }


  public RegisterUserVM adminPermission(AdminPermission adminPermission) {
    
    this.adminPermission = adminPermission;
    return this;
  }

   /**
   * Get adminPermission
   * @return adminPermission
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADMIN_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdminPermission getAdminPermission() {
    return adminPermission;
  }


  public void setAdminPermission(AdminPermission adminPermission) {
    this.adminPermission = adminPermission;
  }


  public RegisterUserVM name(String name) {
    
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


  public RegisterUserVM username(String username) {
    
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


  public RegisterUserVM email(String email) {
    
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


  public RegisterUserVM password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public RegisterUserVM isAdmin(Boolean isAdmin) {
    
    this.isAdmin = isAdmin;
    return this;
  }

   /**
   * Get isAdmin
   * @return isAdmin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_ADMIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsAdmin() {
    return isAdmin;
  }


  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }


  public RegisterUserVM provider(String provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProvider() {
    return provider;
  }


  public void setProvider(String provider) {
    this.provider = provider;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterUserVM registerUserVM = (RegisterUserVM) o;
    return Objects.equals(this.id, registerUserVM.id) &&
        Objects.equals(this.subscriptions, registerUserVM.subscriptions) &&
        Objects.equals(this.groups, registerUserVM.groups) &&
        Objects.equals(this.adminPermission, registerUserVM.adminPermission) &&
        Objects.equals(this.name, registerUserVM.name) &&
        Objects.equals(this.username, registerUserVM.username) &&
        Objects.equals(this.email, registerUserVM.email) &&
        Objects.equals(this.password, registerUserVM.password) &&
        Objects.equals(this.isAdmin, registerUserVM.isAdmin) &&
        Objects.equals(this.provider, registerUserVM.provider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, subscriptions, groups, adminPermission, name, username, email, password, isAdmin, provider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterUserVM {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    adminPermission: ").append(toIndentedString(adminPermission)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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
