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
import cloud.fastreport.model.UpdateDataSourcePermissionsVM;
import cloud.fastreport.model.UpdateFilePermissionsVM;
import cloud.fastreport.model.UpdateGroupPermissionsVM;
import cloud.fastreport.model.UpdateTaskPermissionsVM;
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
 * UpdateDefaultPermissionsVM
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateDefaultPermissionsVM {
  public static final String SERIALIZED_NAME_FILE_PERMISSIONS = "filePermissions";
  @SerializedName(SERIALIZED_NAME_FILE_PERMISSIONS)
  private UpdateFilePermissionsVM filePermissions;

  public static final String SERIALIZED_NAME_GROUP_PERMISSIONS = "groupPermissions";
  @SerializedName(SERIALIZED_NAME_GROUP_PERMISSIONS)
  private UpdateGroupPermissionsVM groupPermissions;

  public static final String SERIALIZED_NAME_DATA_SOURCE_PERMISSIONS = "dataSourcePermissions";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_PERMISSIONS)
  private UpdateDataSourcePermissionsVM dataSourcePermissions;

  public static final String SERIALIZED_NAME_TASK_PERMISSIONS = "taskPermissions";
  @SerializedName(SERIALIZED_NAME_TASK_PERMISSIONS)
  private UpdateTaskPermissionsVM taskPermissions;

  public UpdateDefaultPermissionsVM() {
  }

  public UpdateDefaultPermissionsVM filePermissions(UpdateFilePermissionsVM filePermissions) {
    this.filePermissions = filePermissions;
    return this;
  }

   /**
   * Get filePermissions
   * @return filePermissions
  **/
  @javax.annotation.Nullable
  public UpdateFilePermissionsVM getFilePermissions() {
    return filePermissions;
  }

  public void setFilePermissions(UpdateFilePermissionsVM filePermissions) {
    this.filePermissions = filePermissions;
  }


  public UpdateDefaultPermissionsVM groupPermissions(UpdateGroupPermissionsVM groupPermissions) {
    this.groupPermissions = groupPermissions;
    return this;
  }

   /**
   * Get groupPermissions
   * @return groupPermissions
  **/
  @javax.annotation.Nullable
  public UpdateGroupPermissionsVM getGroupPermissions() {
    return groupPermissions;
  }

  public void setGroupPermissions(UpdateGroupPermissionsVM groupPermissions) {
    this.groupPermissions = groupPermissions;
  }


  public UpdateDefaultPermissionsVM dataSourcePermissions(UpdateDataSourcePermissionsVM dataSourcePermissions) {
    this.dataSourcePermissions = dataSourcePermissions;
    return this;
  }

   /**
   * Get dataSourcePermissions
   * @return dataSourcePermissions
  **/
  @javax.annotation.Nullable
  public UpdateDataSourcePermissionsVM getDataSourcePermissions() {
    return dataSourcePermissions;
  }

  public void setDataSourcePermissions(UpdateDataSourcePermissionsVM dataSourcePermissions) {
    this.dataSourcePermissions = dataSourcePermissions;
  }


  public UpdateDefaultPermissionsVM taskPermissions(UpdateTaskPermissionsVM taskPermissions) {
    this.taskPermissions = taskPermissions;
    return this;
  }

   /**
   * Get taskPermissions
   * @return taskPermissions
  **/
  @javax.annotation.Nullable
  public UpdateTaskPermissionsVM getTaskPermissions() {
    return taskPermissions;
  }

  public void setTaskPermissions(UpdateTaskPermissionsVM taskPermissions) {
    this.taskPermissions = taskPermissions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDefaultPermissionsVM updateDefaultPermissionsVM = (UpdateDefaultPermissionsVM) o;
    return Objects.equals(this.filePermissions, updateDefaultPermissionsVM.filePermissions) &&
        Objects.equals(this.groupPermissions, updateDefaultPermissionsVM.groupPermissions) &&
        Objects.equals(this.dataSourcePermissions, updateDefaultPermissionsVM.dataSourcePermissions) &&
        Objects.equals(this.taskPermissions, updateDefaultPermissionsVM.taskPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filePermissions, groupPermissions, dataSourcePermissions, taskPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDefaultPermissionsVM {\n");
    sb.append("    filePermissions: ").append(toIndentedString(filePermissions)).append("\n");
    sb.append("    groupPermissions: ").append(toIndentedString(groupPermissions)).append("\n");
    sb.append("    dataSourcePermissions: ").append(toIndentedString(dataSourcePermissions)).append("\n");
    sb.append("    taskPermissions: ").append(toIndentedString(taskPermissions)).append("\n");
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
    openapiFields.add("filePermissions");
    openapiFields.add("groupPermissions");
    openapiFields.add("dataSourcePermissions");
    openapiFields.add("taskPermissions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateDefaultPermissionsVM
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateDefaultPermissionsVM.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateDefaultPermissionsVM is not found in the empty JSON string", UpdateDefaultPermissionsVM.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateDefaultPermissionsVM.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateDefaultPermissionsVM` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `filePermissions`
      if (jsonObj.get("filePermissions") != null && !jsonObj.get("filePermissions").isJsonNull()) {
        UpdateFilePermissionsVM.validateJsonElement(jsonObj.get("filePermissions"));
      }
      // validate the optional field `groupPermissions`
      if (jsonObj.get("groupPermissions") != null && !jsonObj.get("groupPermissions").isJsonNull()) {
        UpdateGroupPermissionsVM.validateJsonElement(jsonObj.get("groupPermissions"));
      }
      // validate the optional field `dataSourcePermissions`
      if (jsonObj.get("dataSourcePermissions") != null && !jsonObj.get("dataSourcePermissions").isJsonNull()) {
        UpdateDataSourcePermissionsVM.validateJsonElement(jsonObj.get("dataSourcePermissions"));
      }
      // validate the optional field `taskPermissions`
      if (jsonObj.get("taskPermissions") != null && !jsonObj.get("taskPermissions").isJsonNull()) {
        UpdateTaskPermissionsVM.validateJsonElement(jsonObj.get("taskPermissions"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateDefaultPermissionsVM.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateDefaultPermissionsVM' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateDefaultPermissionsVM> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateDefaultPermissionsVM.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateDefaultPermissionsVM>() {
           @Override
           public void write(JsonWriter out, UpdateDefaultPermissionsVM value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateDefaultPermissionsVM read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             // comment by Detrav, do not need to validate JSON while parse
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateDefaultPermissionsVM given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateDefaultPermissionsVM
  * @throws IOException if the JSON string is invalid with respect to UpdateDefaultPermissionsVM
  */
  public static UpdateDefaultPermissionsVM fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateDefaultPermissionsVM.class);
  }

 /**
  * Convert an instance of UpdateDefaultPermissionsVM to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

