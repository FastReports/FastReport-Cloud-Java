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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
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
 * UpdateUserProfileVM
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateUserProfileVM {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PASSWORD_NEW = "passwordNew";
  @SerializedName(SERIALIZED_NAME_PASSWORD_NEW)
  private String passwordNew;

  public static final String SERIALIZED_NAME_PASSWORD_NEW2 = "passwordNew2";
  @SerializedName(SERIALIZED_NAME_PASSWORD_NEW2)
  private String passwordNew2;

  public UpdateUserProfileVM() {
  }

  public UpdateUserProfileVM name(String name) {
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


  public UpdateUserProfileVM username(String username) {
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


  public UpdateUserProfileVM email(String email) {
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


  public UpdateUserProfileVM passwordNew(String passwordNew) {
    this.passwordNew = passwordNew;
    return this;
  }

   /**
   * Get passwordNew
   * @return passwordNew
  **/
  @javax.annotation.Nullable
  public String getPasswordNew() {
    return passwordNew;
  }

  public void setPasswordNew(String passwordNew) {
    this.passwordNew = passwordNew;
  }


  public UpdateUserProfileVM passwordNew2(String passwordNew2) {
    this.passwordNew2 = passwordNew2;
    return this;
  }

   /**
   * Get passwordNew2
   * @return passwordNew2
  **/
  @javax.annotation.Nullable
  public String getPasswordNew2() {
    return passwordNew2;
  }

  public void setPasswordNew2(String passwordNew2) {
    this.passwordNew2 = passwordNew2;
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
    return Objects.equals(this.name, updateUserProfileVM.name) &&
        Objects.equals(this.username, updateUserProfileVM.username) &&
        Objects.equals(this.email, updateUserProfileVM.email) &&
        Objects.equals(this.passwordNew, updateUserProfileVM.passwordNew) &&
        Objects.equals(this.passwordNew2, updateUserProfileVM.passwordNew2);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, username, email, passwordNew, passwordNew2);
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("name");
    openapiFields.add("username");
    openapiFields.add("email");
    openapiFields.add("passwordNew");
    openapiFields.add("passwordNew2");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateUserProfileVM
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateUserProfileVM.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateUserProfileVM is not found in the empty JSON string", UpdateUserProfileVM.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateUserProfileVM.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateUserProfileVM` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("passwordNew") != null && !jsonObj.get("passwordNew").isJsonNull()) && !jsonObj.get("passwordNew").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passwordNew` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passwordNew").toString()));
      }
      if ((jsonObj.get("passwordNew2") != null && !jsonObj.get("passwordNew2").isJsonNull()) && !jsonObj.get("passwordNew2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passwordNew2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passwordNew2").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateUserProfileVM.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateUserProfileVM' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateUserProfileVM> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateUserProfileVM.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateUserProfileVM>() {
           @Override
           public void write(JsonWriter out, UpdateUserProfileVM value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateUserProfileVM read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             // comment by Detrav, do not need to validate JSON while parse
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateUserProfileVM given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateUserProfileVM
  * @throws IOException if the JSON string is invalid with respect to UpdateUserProfileVM
  */
  public static UpdateUserProfileVM fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateUserProfileVM.class);
  }

 /**
  * Convert an instance of UpdateUserProfileVM to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

