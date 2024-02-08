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
import cloud.fastreport.model.GroupPermission;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
 * GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions {
  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private GroupPermission owner;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private Map<String, GroupPermission> groups;

  public static final String SERIALIZED_NAME_OTHER = "other";
  @SerializedName(SERIALIZED_NAME_OTHER)
  private GroupPermission other;

  public static final String SERIALIZED_NAME_ANON = "anon";
  @SerializedName(SERIALIZED_NAME_ANON)
  private GroupPermission anon;

  public GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions() {
  }

  public GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @javax.annotation.Nullable
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  public GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions owner(GroupPermission owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  public GroupPermission getOwner() {
    return owner;
  }

  public void setOwner(GroupPermission owner) {
    this.owner = owner;
  }


  public GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions groups(Map<String, GroupPermission> groups) {
    this.groups = groups;
    return this;
  }

  public GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions putGroupsItem(String key, GroupPermission groupsItem) {
    if (this.groups == null) {
      this.groups = new HashMap<>();
    }
    this.groups.put(key, groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nullable
  public Map<String, GroupPermission> getGroups() {
    return groups;
  }

  public void setGroups(Map<String, GroupPermission> groups) {
    this.groups = groups;
  }


  public GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions other(GroupPermission other) {
    this.other = other;
    return this;
  }

   /**
   * Get other
   * @return other
  **/
  @javax.annotation.Nullable
  public GroupPermission getOther() {
    return other;
  }

  public void setOther(GroupPermission other) {
    this.other = other;
  }


  public GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions anon(GroupPermission anon) {
    this.anon = anon;
    return this;
  }

   /**
   * Get anon
   * @return anon
  **/
  @javax.annotation.Nullable
  public GroupPermission getAnon() {
    return anon;
  }

  public void setAnon(GroupPermission anon) {
    this.anon = anon;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions groupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions = (GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions) o;
    return Objects.equals(this.ownerId, groupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions.ownerId) &&
        Objects.equals(this.owner, groupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions.owner) &&
        Objects.equals(this.groups, groupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions.groups) &&
        Objects.equals(this.other, groupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions.other) &&
        Objects.equals(this.anon, groupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions.anon);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerId, owner, groups, other, anon);
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
    sb.append("class GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions {\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    anon: ").append(toIndentedString(anon)).append("\n");
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
    openapiFields.add("ownerId");
    openapiFields.add("owner");
    openapiFields.add("groups");
    openapiFields.add("other");
    openapiFields.add("anon");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions is not found in the empty JSON string", GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ownerId") != null && !jsonObj.get("ownerId").isJsonNull()) && !jsonObj.get("ownerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownerId").toString()));
      }
      // validate the optional field `owner`
      if (jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) {
        GroupPermission.validateJsonElement(jsonObj.get("owner"));
      }
      // validate the optional field `other`
      if (jsonObj.get("other") != null && !jsonObj.get("other").isJsonNull()) {
        GroupPermission.validateJsonElement(jsonObj.get("other"));
      }
      // validate the optional field `anon`
      if (jsonObj.get("anon") != null && !jsonObj.get("anon").isJsonNull()) {
        GroupPermission.validateJsonElement(jsonObj.get("anon"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions>() {
           @Override
           public void write(JsonWriter out, GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions
  * @throws IOException if the JSON string is invalid with respect to GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions
  */
  public static GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions.class);
  }

 /**
  * Convert an instance of GroupPermissionGroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermissions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

