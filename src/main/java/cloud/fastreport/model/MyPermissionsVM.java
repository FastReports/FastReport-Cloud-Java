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
import cloud.fastreport.model.DataSourcePermission;
import cloud.fastreport.model.FilePermission;
import cloud.fastreport.model.GroupPermission;
import cloud.fastreport.model.SubscriptionPermission;
import cloud.fastreport.model.TaskPermission;
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
 * MyPermissionsVM
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MyPermissionsVM {
  public static final String SERIALIZED_NAME_SUBSCRIPTION = "subscription";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION)
  private SubscriptionPermission subscription;

  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private FilePermission files;

  public static final String SERIALIZED_NAME_DATASOURCES = "datasources";
  @SerializedName(SERIALIZED_NAME_DATASOURCES)
  private DataSourcePermission datasources;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private GroupPermission groups;

  public static final String SERIALIZED_NAME_TASKS = "tasks";
  @SerializedName(SERIALIZED_NAME_TASKS)
  private TaskPermission tasks;

  public MyPermissionsVM() {
  }

  public MyPermissionsVM subscription(SubscriptionPermission subscription) {
    this.subscription = subscription;
    return this;
  }

   /**
   * Get subscription
   * @return subscription
  **/
  @javax.annotation.Nullable
  public SubscriptionPermission getSubscription() {
    return subscription;
  }

  public void setSubscription(SubscriptionPermission subscription) {
    this.subscription = subscription;
  }


  public MyPermissionsVM files(FilePermission files) {
    this.files = files;
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @javax.annotation.Nullable
  public FilePermission getFiles() {
    return files;
  }

  public void setFiles(FilePermission files) {
    this.files = files;
  }


  public MyPermissionsVM datasources(DataSourcePermission datasources) {
    this.datasources = datasources;
    return this;
  }

   /**
   * Get datasources
   * @return datasources
  **/
  @javax.annotation.Nullable
  public DataSourcePermission getDatasources() {
    return datasources;
  }

  public void setDatasources(DataSourcePermission datasources) {
    this.datasources = datasources;
  }


  public MyPermissionsVM groups(GroupPermission groups) {
    this.groups = groups;
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nullable
  public GroupPermission getGroups() {
    return groups;
  }

  public void setGroups(GroupPermission groups) {
    this.groups = groups;
  }


  public MyPermissionsVM tasks(TaskPermission tasks) {
    this.tasks = tasks;
    return this;
  }

   /**
   * Get tasks
   * @return tasks
  **/
  @javax.annotation.Nullable
  public TaskPermission getTasks() {
    return tasks;
  }

  public void setTasks(TaskPermission tasks) {
    this.tasks = tasks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MyPermissionsVM myPermissionsVM = (MyPermissionsVM) o;
    return Objects.equals(this.subscription, myPermissionsVM.subscription) &&
        Objects.equals(this.files, myPermissionsVM.files) &&
        Objects.equals(this.datasources, myPermissionsVM.datasources) &&
        Objects.equals(this.groups, myPermissionsVM.groups) &&
        Objects.equals(this.tasks, myPermissionsVM.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscription, files, datasources, groups, tasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MyPermissionsVM {\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    datasources: ").append(toIndentedString(datasources)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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
    openapiFields.add("subscription");
    openapiFields.add("files");
    openapiFields.add("datasources");
    openapiFields.add("groups");
    openapiFields.add("tasks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MyPermissionsVM
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MyPermissionsVM.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MyPermissionsVM is not found in the empty JSON string", MyPermissionsVM.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MyPermissionsVM.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MyPermissionsVM` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `subscription`
      if (jsonObj.get("subscription") != null && !jsonObj.get("subscription").isJsonNull()) {
        SubscriptionPermission.validateJsonElement(jsonObj.get("subscription"));
      }
      // validate the optional field `files`
      if (jsonObj.get("files") != null && !jsonObj.get("files").isJsonNull()) {
        FilePermission.validateJsonElement(jsonObj.get("files"));
      }
      // validate the optional field `datasources`
      if (jsonObj.get("datasources") != null && !jsonObj.get("datasources").isJsonNull()) {
        DataSourcePermission.validateJsonElement(jsonObj.get("datasources"));
      }
      // validate the optional field `groups`
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonNull()) {
        GroupPermission.validateJsonElement(jsonObj.get("groups"));
      }
      // validate the optional field `tasks`
      if (jsonObj.get("tasks") != null && !jsonObj.get("tasks").isJsonNull()) {
        TaskPermission.validateJsonElement(jsonObj.get("tasks"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MyPermissionsVM.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MyPermissionsVM' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MyPermissionsVM> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MyPermissionsVM.class));

       return (TypeAdapter<T>) new TypeAdapter<MyPermissionsVM>() {
           @Override
           public void write(JsonWriter out, MyPermissionsVM value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MyPermissionsVM read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             // comment by Detrav, do not need to validate JSON while parse
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MyPermissionsVM given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MyPermissionsVM
  * @throws IOException if the JSON string is invalid with respect to MyPermissionsVM
  */
  public static MyPermissionsVM fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MyPermissionsVM.class);
  }

 /**
  * Convert an instance of MyPermissionsVM to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

