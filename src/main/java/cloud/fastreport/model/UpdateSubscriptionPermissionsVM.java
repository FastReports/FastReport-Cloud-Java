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
import cloud.fastreport.model.SubscriptionAdministrate;
import cloud.fastreport.model.SubscriptionPermissions;
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
 * UpdateSubscriptionPermissionsVM
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateSubscriptionPermissionsVM {
  public static final String SERIALIZED_NAME_NEW_PERMISSIONS = "newPermissions";
  @SerializedName(SERIALIZED_NAME_NEW_PERMISSIONS)
  private SubscriptionPermissions newPermissions;

  public static final String SERIALIZED_NAME_ADMINISTRATE = "administrate";
  @SerializedName(SERIALIZED_NAME_ADMINISTRATE)
  private SubscriptionAdministrate administrate;

  public UpdateSubscriptionPermissionsVM() {
  }

  public UpdateSubscriptionPermissionsVM newPermissions(SubscriptionPermissions newPermissions) {
    this.newPermissions = newPermissions;
    return this;
  }

   /**
   * Get newPermissions
   * @return newPermissions
  **/
  @javax.annotation.Nonnull
  public SubscriptionPermissions getNewPermissions() {
    return newPermissions;
  }

  public void setNewPermissions(SubscriptionPermissions newPermissions) {
    this.newPermissions = newPermissions;
  }


  public UpdateSubscriptionPermissionsVM administrate(SubscriptionAdministrate administrate) {
    this.administrate = administrate;
    return this;
  }

   /**
   * Get administrate
   * @return administrate
  **/
  @javax.annotation.Nonnull
  public SubscriptionAdministrate getAdministrate() {
    return administrate;
  }

  public void setAdministrate(SubscriptionAdministrate administrate) {
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
    UpdateSubscriptionPermissionsVM updateSubscriptionPermissionsVM = (UpdateSubscriptionPermissionsVM) o;
    return Objects.equals(this.newPermissions, updateSubscriptionPermissionsVM.newPermissions) &&
        Objects.equals(this.administrate, updateSubscriptionPermissionsVM.administrate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newPermissions, administrate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSubscriptionPermissionsVM {\n");
    sb.append("    newPermissions: ").append(toIndentedString(newPermissions)).append("\n");
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
    openapiFields.add("newPermissions");
    openapiFields.add("administrate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("newPermissions");
    openapiRequiredFields.add("administrate");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateSubscriptionPermissionsVM
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateSubscriptionPermissionsVM.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateSubscriptionPermissionsVM is not found in the empty JSON string", UpdateSubscriptionPermissionsVM.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateSubscriptionPermissionsVM.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateSubscriptionPermissionsVM` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateSubscriptionPermissionsVM.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `newPermissions`
      SubscriptionPermissions.validateJsonElement(jsonObj.get("newPermissions"));
      // validate the required field `administrate`
      SubscriptionAdministrate.validateJsonElement(jsonObj.get("administrate"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateSubscriptionPermissionsVM.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateSubscriptionPermissionsVM' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateSubscriptionPermissionsVM> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateSubscriptionPermissionsVM.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateSubscriptionPermissionsVM>() {
           @Override
           public void write(JsonWriter out, UpdateSubscriptionPermissionsVM value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateSubscriptionPermissionsVM read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateSubscriptionPermissionsVM given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateSubscriptionPermissionsVM
  * @throws IOException if the JSON string is invalid with respect to UpdateSubscriptionPermissionsVM
  */
  public static UpdateSubscriptionPermissionsVM fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateSubscriptionPermissionsVM.class);
  }

 /**
  * Convert an instance of UpdateSubscriptionPermissionsVM to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

