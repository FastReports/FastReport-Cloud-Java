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
import cloud.fastreport.model.AuditType;
import cloud.fastreport.model.CloudBaseVM;
import cloud.fastreport.model.ProfileVisibility;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * UserSettingsVM
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserSettingsVM extends CloudBaseVM {
  public static final String SERIALIZED_NAME_PROFILE_VISIBILITY = "profileVisibility";
  @SerializedName(SERIALIZED_NAME_PROFILE_VISIBILITY)
  private ProfileVisibility profileVisibility;

  public static final String SERIALIZED_NAME_DEFAULT_SUBSCRIPTION = "defaultSubscription";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SUBSCRIPTION)
  private String defaultSubscription;

  public static final String SERIALIZED_NAME_SHOW_HIDDEN_FILES_AND_FOLDERS = "showHiddenFilesAndFolders";
  @SerializedName(SERIALIZED_NAME_SHOW_HIDDEN_FILES_AND_FOLDERS)
  private Boolean showHiddenFilesAndFolders;

  public static final String SERIALIZED_NAME_SLA_ACCEPTED_DATE_TIME = "slaAcceptedDateTime";
  @SerializedName(SERIALIZED_NAME_SLA_ACCEPTED_DATE_TIME)
  private OffsetDateTime slaAcceptedDateTime;

  public static final String SERIALIZED_NAME_SUBSCRIBED_NOTIFICATIONS = "subscribedNotifications";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBED_NOTIFICATIONS)
  private List<AuditType> subscribedNotifications;

  public static final String SERIALIZED_NAME_$_T = "$t";
  @SerializedName(SERIALIZED_NAME_$_T)
  protected String $t;

  public UserSettingsVM() {
    this.$t = this.getClass().getSimpleName();
  }

  public UserSettingsVM profileVisibility(ProfileVisibility profileVisibility) {
    this.profileVisibility = profileVisibility;
    return this;
  }

   /**
   * Get profileVisibility
   * @return profileVisibility
  **/
  @javax.annotation.Nullable
  public ProfileVisibility getProfileVisibility() {
    return profileVisibility;
  }

  public void setProfileVisibility(ProfileVisibility profileVisibility) {
    this.profileVisibility = profileVisibility;
  }


  public UserSettingsVM defaultSubscription(String defaultSubscription) {
    this.defaultSubscription = defaultSubscription;
    return this;
  }

   /**
   * Get defaultSubscription
   * @return defaultSubscription
  **/
  @javax.annotation.Nullable
  public String getDefaultSubscription() {
    return defaultSubscription;
  }

  public void setDefaultSubscription(String defaultSubscription) {
    this.defaultSubscription = defaultSubscription;
  }


  public UserSettingsVM showHiddenFilesAndFolders(Boolean showHiddenFilesAndFolders) {
    this.showHiddenFilesAndFolders = showHiddenFilesAndFolders;
    return this;
  }

   /**
   * Get showHiddenFilesAndFolders
   * @return showHiddenFilesAndFolders
  **/
  @javax.annotation.Nullable
  public Boolean getShowHiddenFilesAndFolders() {
    return showHiddenFilesAndFolders;
  }

  public void setShowHiddenFilesAndFolders(Boolean showHiddenFilesAndFolders) {
    this.showHiddenFilesAndFolders = showHiddenFilesAndFolders;
  }


  public UserSettingsVM slaAcceptedDateTime(OffsetDateTime slaAcceptedDateTime) {
    this.slaAcceptedDateTime = slaAcceptedDateTime;
    return this;
  }

   /**
   * Get slaAcceptedDateTime
   * @return slaAcceptedDateTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getSlaAcceptedDateTime() {
    return slaAcceptedDateTime;
  }

  public void setSlaAcceptedDateTime(OffsetDateTime slaAcceptedDateTime) {
    this.slaAcceptedDateTime = slaAcceptedDateTime;
  }


  public UserSettingsVM subscribedNotifications(List<AuditType> subscribedNotifications) {
    this.subscribedNotifications = subscribedNotifications;
    return this;
  }

  public UserSettingsVM addSubscribedNotificationsItem(AuditType subscribedNotificationsItem) {
    if (this.subscribedNotifications == null) {
      this.subscribedNotifications = new ArrayList<>();
    }
    this.subscribedNotifications.add(subscribedNotificationsItem);
    return this;
  }

   /**
   * Get subscribedNotifications
   * @return subscribedNotifications
  **/
  @javax.annotation.Nullable
  public List<AuditType> getSubscribedNotifications() {
    return subscribedNotifications;
  }

  public void setSubscribedNotifications(List<AuditType> subscribedNotifications) {
    this.subscribedNotifications = subscribedNotifications;
  }


  public UserSettingsVM $t(String $t) {
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
    UserSettingsVM userSettingsVM = (UserSettingsVM) o;
    return Objects.equals(this.profileVisibility, userSettingsVM.profileVisibility) &&
        Objects.equals(this.defaultSubscription, userSettingsVM.defaultSubscription) &&
        Objects.equals(this.showHiddenFilesAndFolders, userSettingsVM.showHiddenFilesAndFolders) &&
        Objects.equals(this.slaAcceptedDateTime, userSettingsVM.slaAcceptedDateTime) &&
        Objects.equals(this.subscribedNotifications, userSettingsVM.subscribedNotifications) &&
        Objects.equals(this.$t, userSettingsVM.$t) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileVisibility, defaultSubscription, showHiddenFilesAndFolders, slaAcceptedDateTime, subscribedNotifications, $t, super.hashCode());
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
    sb.append("class UserSettingsVM {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    profileVisibility: ").append(toIndentedString(profileVisibility)).append("\n");
    sb.append("    defaultSubscription: ").append(toIndentedString(defaultSubscription)).append("\n");
    sb.append("    showHiddenFilesAndFolders: ").append(toIndentedString(showHiddenFilesAndFolders)).append("\n");
    sb.append("    slaAcceptedDateTime: ").append(toIndentedString(slaAcceptedDateTime)).append("\n");
    sb.append("    subscribedNotifications: ").append(toIndentedString(subscribedNotifications)).append("\n");
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
  * @throws IOException if the JSON Element is invalid with respect to UserSettingsVM
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserSettingsVM.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserSettingsVM is not found in the empty JSON string", UserSettingsVM.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserSettingsVM.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserSettingsVM` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserSettingsVM.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserSettingsVM.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserSettingsVM' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserSettingsVM> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserSettingsVM.class));

       return (TypeAdapter<T>) new TypeAdapter<UserSettingsVM>() {
           @Override
           public void write(JsonWriter out, UserSettingsVM value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserSettingsVM read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             // comment by Detrav, do not need to validate JSON while parse
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserSettingsVM given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserSettingsVM
  * @throws IOException if the JSON string is invalid with respect to UserSettingsVM
  */
  public static UserSettingsVM fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserSettingsVM.class);
  }

 /**
  * Convert an instance of UserSettingsVM to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

