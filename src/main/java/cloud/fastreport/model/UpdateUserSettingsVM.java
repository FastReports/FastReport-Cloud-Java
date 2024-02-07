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
import cloud.fastreport.model.AuditType;
import cloud.fastreport.model.ProfileVisibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateUserSettingsVM
 */
@JsonPropertyOrder({
  UpdateUserSettingsVM.JSON_PROPERTY_PROFILE_VISIBILITY,
  UpdateUserSettingsVM.JSON_PROPERTY_DEFAULT_SUBSCRIPTION,
  UpdateUserSettingsVM.JSON_PROPERTY_SHOW_HIDDEN_FILES_AND_FOLDERS,
  UpdateUserSettingsVM.JSON_PROPERTY_SUBSCRIBED_NOTIFICATIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateUserSettingsVM {
  public static final String JSON_PROPERTY_PROFILE_VISIBILITY = "profileVisibility";
  private JsonNullable<ProfileVisibility> profileVisibility = JsonNullable.<ProfileVisibility>undefined();

  public static final String JSON_PROPERTY_DEFAULT_SUBSCRIPTION = "defaultSubscription";
  private JsonNullable<String> defaultSubscription = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SHOW_HIDDEN_FILES_AND_FOLDERS = "showHiddenFilesAndFolders";
  private JsonNullable<Boolean> showHiddenFilesAndFolders = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_SUBSCRIBED_NOTIFICATIONS = "subscribedNotifications";
  private JsonNullable<List<AuditType>> subscribedNotifications = JsonNullable.<List<AuditType>>undefined();

  public UpdateUserSettingsVM() {
  }

  public UpdateUserSettingsVM profileVisibility(ProfileVisibility profileVisibility) {
    this.profileVisibility = JsonNullable.<ProfileVisibility>of(profileVisibility);
    
    return this;
  }

   /**
   * Get profileVisibility
   * @return profileVisibility
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public ProfileVisibility getProfileVisibility() {
        return profileVisibility.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROFILE_VISIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<ProfileVisibility> getProfileVisibility_JsonNullable() {
    return profileVisibility;
  }
  
  @JsonProperty(JSON_PROPERTY_PROFILE_VISIBILITY)
  public void setProfileVisibility_JsonNullable(JsonNullable<ProfileVisibility> profileVisibility) {
    this.profileVisibility = profileVisibility;
  }

  public void setProfileVisibility(ProfileVisibility profileVisibility) {
    this.profileVisibility = JsonNullable.<ProfileVisibility>of(profileVisibility);
  }


  public UpdateUserSettingsVM defaultSubscription(String defaultSubscription) {
    this.defaultSubscription = JsonNullable.<String>of(defaultSubscription);
    
    return this;
  }

   /**
   * Get defaultSubscription
   * @return defaultSubscription
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getDefaultSubscription() {
        return defaultSubscription.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDefaultSubscription_JsonNullable() {
    return defaultSubscription;
  }
  
  @JsonProperty(JSON_PROPERTY_DEFAULT_SUBSCRIPTION)
  public void setDefaultSubscription_JsonNullable(JsonNullable<String> defaultSubscription) {
    this.defaultSubscription = defaultSubscription;
  }

  public void setDefaultSubscription(String defaultSubscription) {
    this.defaultSubscription = JsonNullable.<String>of(defaultSubscription);
  }


  public UpdateUserSettingsVM showHiddenFilesAndFolders(Boolean showHiddenFilesAndFolders) {
    this.showHiddenFilesAndFolders = JsonNullable.<Boolean>of(showHiddenFilesAndFolders);
    
    return this;
  }

   /**
   * Get showHiddenFilesAndFolders
   * @return showHiddenFilesAndFolders
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getShowHiddenFilesAndFolders() {
        return showHiddenFilesAndFolders.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHOW_HIDDEN_FILES_AND_FOLDERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getShowHiddenFilesAndFolders_JsonNullable() {
    return showHiddenFilesAndFolders;
  }
  
  @JsonProperty(JSON_PROPERTY_SHOW_HIDDEN_FILES_AND_FOLDERS)
  public void setShowHiddenFilesAndFolders_JsonNullable(JsonNullable<Boolean> showHiddenFilesAndFolders) {
    this.showHiddenFilesAndFolders = showHiddenFilesAndFolders;
  }

  public void setShowHiddenFilesAndFolders(Boolean showHiddenFilesAndFolders) {
    this.showHiddenFilesAndFolders = JsonNullable.<Boolean>of(showHiddenFilesAndFolders);
  }


  public UpdateUserSettingsVM subscribedNotifications(List<AuditType> subscribedNotifications) {
    this.subscribedNotifications = JsonNullable.<List<AuditType>>of(subscribedNotifications);
    
    return this;
  }

  public UpdateUserSettingsVM addSubscribedNotificationsItem(AuditType subscribedNotificationsItem) {
    if (this.subscribedNotifications == null || !this.subscribedNotifications.isPresent()) {
      this.subscribedNotifications = JsonNullable.<List<AuditType>>of(new ArrayList<>());
    }
    try {
      this.subscribedNotifications.get().add(subscribedNotificationsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get subscribedNotifications
   * @return subscribedNotifications
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public List<AuditType> getSubscribedNotifications() {
        return subscribedNotifications.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBSCRIBED_NOTIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AuditType>> getSubscribedNotifications_JsonNullable() {
    return subscribedNotifications;
  }
  
  @JsonProperty(JSON_PROPERTY_SUBSCRIBED_NOTIFICATIONS)
  public void setSubscribedNotifications_JsonNullable(JsonNullable<List<AuditType>> subscribedNotifications) {
    this.subscribedNotifications = subscribedNotifications;
  }

  public void setSubscribedNotifications(List<AuditType> subscribedNotifications) {
    this.subscribedNotifications = JsonNullable.<List<AuditType>>of(subscribedNotifications);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserSettingsVM updateUserSettingsVM = (UpdateUserSettingsVM) o;
    return equalsNullable(this.profileVisibility, updateUserSettingsVM.profileVisibility) &&
        equalsNullable(this.defaultSubscription, updateUserSettingsVM.defaultSubscription) &&
        equalsNullable(this.showHiddenFilesAndFolders, updateUserSettingsVM.showHiddenFilesAndFolders) &&
        equalsNullable(this.subscribedNotifications, updateUserSettingsVM.subscribedNotifications);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(profileVisibility), hashCodeNullable(defaultSubscription), hashCodeNullable(showHiddenFilesAndFolders), hashCodeNullable(subscribedNotifications));
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
    sb.append("class UpdateUserSettingsVM {\n");
    sb.append("    profileVisibility: ").append(toIndentedString(profileVisibility)).append("\n");
    sb.append("    defaultSubscription: ").append(toIndentedString(defaultSubscription)).append("\n");
    sb.append("    showHiddenFilesAndFolders: ").append(toIndentedString(showHiddenFilesAndFolders)).append("\n");
    sb.append("    subscribedNotifications: ").append(toIndentedString(subscribedNotifications)).append("\n");
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

