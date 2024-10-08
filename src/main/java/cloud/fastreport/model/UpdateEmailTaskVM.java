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
import cloud.fastreport.model.CreateTaskEndVM;
import cloud.fastreport.model.InputFileVM;
import cloud.fastreport.model.UpdateTransportTaskBaseVM;
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
 * UpdateEmailTaskVM
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateEmailTaskVM extends UpdateTransportTaskBaseVM {
  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_ENABLE_SSL = "enableSsl";
  @SerializedName(SERIALIZED_NAME_ENABLE_SSL)
  private Boolean enableSsl;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_IS_BODY_HTML = "isBodyHtml";
  @SerializedName(SERIALIZED_NAME_IS_BODY_HTML)
  private Boolean isBodyHtml;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_SERVER = "server";
  @SerializedName(SERIALIZED_NAME_SERVER)
  private String server;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private List<String> to;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_$_T = "$t";
  @SerializedName(SERIALIZED_NAME_$_T)
  protected String $t;

  public UpdateEmailTaskVM() {
    this.$t = this.getClass().getSimpleName();
  }

  public UpdateEmailTaskVM body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }


  public UpdateEmailTaskVM enableSsl(Boolean enableSsl) {
    this.enableSsl = enableSsl;
    return this;
  }

   /**
   * Get enableSsl
   * @return enableSsl
  **/
  @javax.annotation.Nullable
  public Boolean getEnableSsl() {
    return enableSsl;
  }

  public void setEnableSsl(Boolean enableSsl) {
    this.enableSsl = enableSsl;
  }


  public UpdateEmailTaskVM from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @javax.annotation.Nullable
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }


  public UpdateEmailTaskVM isBodyHtml(Boolean isBodyHtml) {
    this.isBodyHtml = isBodyHtml;
    return this;
  }

   /**
   * Get isBodyHtml
   * @return isBodyHtml
  **/
  @javax.annotation.Nullable
  public Boolean getIsBodyHtml() {
    return isBodyHtml;
  }

  public void setIsBodyHtml(Boolean isBodyHtml) {
    this.isBodyHtml = isBodyHtml;
  }


  public UpdateEmailTaskVM password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public UpdateEmailTaskVM port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }


  public UpdateEmailTaskVM server(String server) {
    this.server = server;
    return this;
  }

   /**
   * Get server
   * @return server
  **/
  @javax.annotation.Nullable
  public String getServer() {
    return server;
  }

  public void setServer(String server) {
    this.server = server;
  }


  public UpdateEmailTaskVM subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nullable
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }


  public UpdateEmailTaskVM to(List<String> to) {
    this.to = to;
    return this;
  }

  public UpdateEmailTaskVM addToItem(String toItem) {
    if (this.to == null) {
      this.to = new ArrayList<>();
    }
    this.to.add(toItem);
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @javax.annotation.Nullable
  public List<String> getTo() {
    return to;
  }

  public void setTo(List<String> to) {
    this.to = to;
  }


  public UpdateEmailTaskVM username(String username) {
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


  public UpdateEmailTaskVM $t(String $t) {
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
    UpdateEmailTaskVM updateEmailTaskVM = (UpdateEmailTaskVM) o;
    return Objects.equals(this.body, updateEmailTaskVM.body) &&
        Objects.equals(this.enableSsl, updateEmailTaskVM.enableSsl) &&
        Objects.equals(this.from, updateEmailTaskVM.from) &&
        Objects.equals(this.isBodyHtml, updateEmailTaskVM.isBodyHtml) &&
        Objects.equals(this.password, updateEmailTaskVM.password) &&
        Objects.equals(this.port, updateEmailTaskVM.port) &&
        Objects.equals(this.server, updateEmailTaskVM.server) &&
        Objects.equals(this.subject, updateEmailTaskVM.subject) &&
        Objects.equals(this.to, updateEmailTaskVM.to) &&
        Objects.equals(this.username, updateEmailTaskVM.username) &&
        Objects.equals(this.$t, updateEmailTaskVM.$t) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, enableSsl, from, isBodyHtml, password, port, server, subject, to, username, $t, super.hashCode());
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
    sb.append("class UpdateEmailTaskVM {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    enableSsl: ").append(toIndentedString(enableSsl)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    isBodyHtml: ").append(toIndentedString(isBodyHtml)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
    openapiFields.add("inputFile");
    openapiFields.add("$t");
    openapiFields.add("cronExpression");
    openapiFields.add("startsOn");
    openapiFields.add("ends");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("$t");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateEmailTaskVM
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateEmailTaskVM.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateEmailTaskVM is not found in the empty JSON string", UpdateEmailTaskVM.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateEmailTaskVM.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateEmailTaskVM` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateEmailTaskVM.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateEmailTaskVM.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateEmailTaskVM' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateEmailTaskVM> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateEmailTaskVM.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateEmailTaskVM>() {
           @Override
           public void write(JsonWriter out, UpdateEmailTaskVM value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateEmailTaskVM read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             // comment by Detrav, do not need to validate JSON while parse
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateEmailTaskVM given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateEmailTaskVM
  * @throws IOException if the JSON string is invalid with respect to UpdateEmailTaskVM
  */
  public static UpdateEmailTaskVM fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateEmailTaskVM.class);
  }

 /**
  * Convert an instance of UpdateEmailTaskVM to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

