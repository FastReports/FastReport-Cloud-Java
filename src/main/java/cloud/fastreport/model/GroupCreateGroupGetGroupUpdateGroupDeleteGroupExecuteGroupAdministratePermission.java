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
import cloud.fastreport.model.GroupAdministrate;
import cloud.fastreport.model.GroupCreate;
import cloud.fastreport.model.GroupDelete;
import cloud.fastreport.model.GroupExecute;
import cloud.fastreport.model.GroupGet;
import cloud.fastreport.model.GroupUpdate;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission {
  public static final String SERIALIZED_NAME_CREATE = "create";
  @SerializedName(SERIALIZED_NAME_CREATE)
  private GroupCreate create;

  public static final String SERIALIZED_NAME_DELETE = "delete";
  @SerializedName(SERIALIZED_NAME_DELETE)
  private GroupDelete delete;

  public static final String SERIALIZED_NAME_EXECUTE = "execute";
  @SerializedName(SERIALIZED_NAME_EXECUTE)
  private GroupExecute execute;

  public static final String SERIALIZED_NAME_GET = "get";
  @SerializedName(SERIALIZED_NAME_GET)
  private GroupGet get;

  public static final String SERIALIZED_NAME_UPDATE = "update";
  @SerializedName(SERIALIZED_NAME_UPDATE)
  private GroupUpdate update;

  public static final String SERIALIZED_NAME_ADMINISTRATE = "administrate";
  @SerializedName(SERIALIZED_NAME_ADMINISTRATE)
  private GroupAdministrate administrate;

  public GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission() {
  }

  public GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission create(GroupCreate create) {
    this.create = create;
    return this;
  }

   /**
   * Get create
   * @return create
  **/
  @javax.annotation.Nullable
  public GroupCreate getCreate() {
    return create;
  }

  public void setCreate(GroupCreate create) {
    this.create = create;
  }


  public GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission delete(GroupDelete delete) {
    this.delete = delete;
    return this;
  }

   /**
   * Get delete
   * @return delete
  **/
  @javax.annotation.Nullable
  public GroupDelete getDelete() {
    return delete;
  }

  public void setDelete(GroupDelete delete) {
    this.delete = delete;
  }


  public GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission execute(GroupExecute execute) {
    this.execute = execute;
    return this;
  }

   /**
   * Get execute
   * @return execute
  **/
  @javax.annotation.Nullable
  public GroupExecute getExecute() {
    return execute;
  }

  public void setExecute(GroupExecute execute) {
    this.execute = execute;
  }


  public GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission get(GroupGet get) {
    this.get = get;
    return this;
  }

   /**
   * Get get
   * @return get
  **/
  @javax.annotation.Nullable
  public GroupGet getGet() {
    return get;
  }

  public void setGet(GroupGet get) {
    this.get = get;
  }


  public GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission update(GroupUpdate update) {
    this.update = update;
    return this;
  }

   /**
   * Get update
   * @return update
  **/
  @javax.annotation.Nullable
  public GroupUpdate getUpdate() {
    return update;
  }

  public void setUpdate(GroupUpdate update) {
    this.update = update;
  }


  public GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission administrate(GroupAdministrate administrate) {
    this.administrate = administrate;
    return this;
  }

   /**
   * Get administrate
   * @return administrate
  **/
  @javax.annotation.Nullable
  public GroupAdministrate getAdministrate() {
    return administrate;
  }

  public void setAdministrate(GroupAdministrate administrate) {
    this.administrate = administrate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission groupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission = (GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission) o;
    return Objects.equals(this.create, groupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission.create) &&
        Objects.equals(this.delete, groupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission.delete) &&
        Objects.equals(this.execute, groupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission.execute) &&
        Objects.equals(this.get, groupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission.get) &&
        Objects.equals(this.update, groupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission.update) &&
        Objects.equals(this.administrate, groupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission.administrate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, delete, execute, get, update, administrate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission {\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
    sb.append("    execute: ").append(toIndentedString(execute)).append("\n");
    sb.append("    get: ").append(toIndentedString(get)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    administrate: ").append(toIndentedString(administrate)).append("\n");
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
    openapiFields.add("create");
    openapiFields.add("delete");
    openapiFields.add("execute");
    openapiFields.add("get");
    openapiFields.add("update");
    openapiFields.add("administrate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission is not found in the empty JSON string", GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `create`
      if (jsonObj.get("create") != null && !jsonObj.get("create").isJsonNull()) {
        GroupCreate.validateJsonElement(jsonObj.get("create"));
      }
      // validate the optional field `delete`
      if (jsonObj.get("delete") != null && !jsonObj.get("delete").isJsonNull()) {
        GroupDelete.validateJsonElement(jsonObj.get("delete"));
      }
      // validate the optional field `execute`
      if (jsonObj.get("execute") != null && !jsonObj.get("execute").isJsonNull()) {
        GroupExecute.validateJsonElement(jsonObj.get("execute"));
      }
      // validate the optional field `get`
      if (jsonObj.get("get") != null && !jsonObj.get("get").isJsonNull()) {
        GroupGet.validateJsonElement(jsonObj.get("get"));
      }
      // validate the optional field `update`
      if (jsonObj.get("update") != null && !jsonObj.get("update").isJsonNull()) {
        GroupUpdate.validateJsonElement(jsonObj.get("update"));
      }
      // validate the optional field `administrate`
      if (jsonObj.get("administrate") != null && !jsonObj.get("administrate").isJsonNull()) {
        GroupAdministrate.validateJsonElement(jsonObj.get("administrate"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission>() {
           @Override
           public void write(JsonWriter out, GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             // comment by Detrav, do not need to validate JSON while parse
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission
  * @throws IOException if the JSON string is invalid with respect to GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission
  */
  public static GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission.class);
  }

 /**
  * Convert an instance of GroupCreateGroupGetGroupUpdateGroupDeleteGroupExecuteGroupAdministratePermission to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

