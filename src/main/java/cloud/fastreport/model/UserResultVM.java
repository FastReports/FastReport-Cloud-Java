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
import cloud.fastreport.model.AdminPermission;
import cloud.fastreport.model.CloudBaseVM;
import cloud.fastreport.model.UserSettingsVM;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cloud.fastreport.JSON;

/**
 * UserResultVM
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserResultVM extends CloudBaseVM {
  public static final String SERIALIZED_NAME_IS_AUTHENTICATED = "isAuthenticated";
  @SerializedName(SERIALIZED_NAME_IS_AUTHENTICATED)
  private Boolean isAuthenticated;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_ADMIN = "isAdmin";
  @SerializedName(SERIALIZED_NAME_IS_ADMIN)
  private Boolean isAdmin;

  public static final String SERIALIZED_NAME_ADMIN_PERMISSION = "adminPermission";
  @SerializedName(SERIALIZED_NAME_ADMIN_PERMISSION)
  private AdminPermission adminPermission;

  public static final String SERIALIZED_NAME_SUBSCRIPTIONS = "subscriptions";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTIONS)
  private List<String> subscriptions;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<String> groups;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private String provider;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private UserSettingsVM settings;

  public static final String SERIALIZED_NAME_$_T = "$t";
  @SerializedName(SERIALIZED_NAME_$_T)
  protected String $t;

  public UserResultVM() {
    this.$t = this.getClass().getSimpleName();
  }

  public UserResultVM isAuthenticated(Boolean isAuthenticated) {
    this.isAuthenticated = isAuthenticated;
    return this;
  }

   /**
   * Get isAuthenticated
   * @return isAuthenticated
  **/
  @javax.annotation.Nullable
  public Boolean getIsAuthenticated() {
    return isAuthenticated;
  }

  public void setIsAuthenticated(Boolean isAuthenticated) {
    this.isAuthenticated = isAuthenticated;
  }


  public UserResultVM id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public UserResultVM isAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

   /**
   * Get isAdmin
   * @return isAdmin
  **/
  @javax.annotation.Nullable
  public Boolean getIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }


  public UserResultVM adminPermission(AdminPermission adminPermission) {
    this.adminPermission = adminPermission;
    return this;
  }

   /**
   * Get adminPermission
   * @return adminPermission
  **/
  @javax.annotation.Nullable
  public AdminPermission getAdminPermission() {
    return adminPermission;
  }

  public void setAdminPermission(AdminPermission adminPermission) {
    this.adminPermission = adminPermission;
  }


  public UserResultVM subscriptions(List<String> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public UserResultVM addSubscriptionsItem(String subscriptionsItem) {
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
  public List<String> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(List<String> subscriptions) {
    this.subscriptions = subscriptions;
  }


  public UserResultVM groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public UserResultVM addGroupsItem(String groupsItem) {
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
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }


  public UserResultVM provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @javax.annotation.Nullable
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }


  public UserResultVM email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public UserResultVM name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public UserResultVM username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public UserResultVM settings(UserSettingsVM settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nullable
  public UserSettingsVM getSettings() {
    return settings;
  }

  public void setSettings(UserSettingsVM settings) {
    this.settings = settings;
  }


  public UserResultVM $t(String $t) {
    this.$t = $t;
    return this;
  }

   /**
   * Get $t
   * @return $t
  **/
  @javax.annotation.Nonnull
  public String get$T() {
    return $t;
  }

  public void set$T(String $t) {
    this.$t = $t;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserResultVM userResultVM = (UserResultVM) o;
    return Objects.equals(this.isAuthenticated, userResultVM.isAuthenticated) &&
        Objects.equals(this.id, userResultVM.id) &&
        Objects.equals(this.isAdmin, userResultVM.isAdmin) &&
        Objects.equals(this.adminPermission, userResultVM.adminPermission) &&
        Objects.equals(this.subscriptions, userResultVM.subscriptions) &&
        Objects.equals(this.groups, userResultVM.groups) &&
        Objects.equals(this.provider, userResultVM.provider) &&
        Objects.equals(this.email, userResultVM.email) &&
        Objects.equals(this.name, userResultVM.name) &&
        Objects.equals(this.username, userResultVM.username) &&
        Objects.equals(this.settings, userResultVM.settings) &&
        Objects.equals(this.$t, userResultVM.$t) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(isAuthenticated, id, isAdmin, adminPermission, subscriptions, groups, provider, email, name, username, settings, $t, super.hashCode());
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
    sb.append("class UserResultVM {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    isAuthenticated: ").append(toIndentedString(isAuthenticated)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    adminPermission: ").append(toIndentedString(adminPermission)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    $t: ").append(toIndentedString($t)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("$t");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("$t");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UserResultVM
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserResultVM.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserResultVM is not found in the empty JSON string", UserResultVM.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserResultVM.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserResultVM` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserResultVM.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserResultVM.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserResultVM' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserResultVM> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserResultVM.class));

       return (TypeAdapter<T>) new TypeAdapter<UserResultVM>() {
           @Override
           public void write(JsonWriter out, UserResultVM value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserResultVM read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             // comment by Detrav, do not need to validate JSON while parse
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserResultVM given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserResultVM
  * @throws IOException if the JSON string is invalid with respect to UserResultVM
  */
  public static UserResultVM fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserResultVM.class);
  }

 /**
  * Convert an instance of UserResultVM to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

