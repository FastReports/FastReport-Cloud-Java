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
import cloud.fastreport.model.CloudBaseVM;
import cloud.fastreport.model.FileKind;
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
 * OutputFileVM
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OutputFileVM extends CloudBaseVM {
  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_FOLDER_ID = "folderId";
  @SerializedName(SERIALIZED_NAME_FOLDER_ID)
  private String folderId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private FileKind type;

  public static final String SERIALIZED_NAME_IS_TEMPORARY = "isTemporary";
  @SerializedName(SERIALIZED_NAME_IS_TEMPORARY)
  private Boolean isTemporary;

  public static final String SERIALIZED_NAME_$_T = "$t";
  @SerializedName(SERIALIZED_NAME_$_T)
  protected String $t;

  public OutputFileVM() {
    this.$t = this.getClass().getSimpleName();
  }

  public OutputFileVM fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nullable
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public OutputFileVM folderId(String folderId) {
    this.folderId = folderId;
    return this;
  }

   /**
   * Get folderId
   * @return folderId
  **/
  @javax.annotation.Nullable
  public String getFolderId() {
    return folderId;
  }

  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }


  public OutputFileVM type(FileKind type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public FileKind getType() {
    return type;
  }

  public void setType(FileKind type) {
    this.type = type;
  }


  public OutputFileVM isTemporary(Boolean isTemporary) {
    this.isTemporary = isTemporary;
    return this;
  }

   /**
   * Get isTemporary
   * @return isTemporary
  **/
  @javax.annotation.Nullable
  public Boolean getIsTemporary() {
    return isTemporary;
  }

  public void setIsTemporary(Boolean isTemporary) {
    this.isTemporary = isTemporary;
  }


  public OutputFileVM $t(String $t) {
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
    OutputFileVM outputFileVM = (OutputFileVM) o;
    return Objects.equals(this.fileName, outputFileVM.fileName) &&
        Objects.equals(this.folderId, outputFileVM.folderId) &&
        Objects.equals(this.type, outputFileVM.type) &&
        Objects.equals(this.isTemporary, outputFileVM.isTemporary) &&
        Objects.equals(this.$t, outputFileVM.$t) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, folderId, type, isTemporary, $t, super.hashCode());
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
    sb.append("class OutputFileVM {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isTemporary: ").append(toIndentedString(isTemporary)).append("\n");
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
  * @throws IOException if the JSON Element is invalid with respect to OutputFileVM
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OutputFileVM.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OutputFileVM is not found in the empty JSON string", OutputFileVM.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OutputFileVM.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OutputFileVM` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OutputFileVM.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OutputFileVM.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OutputFileVM' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OutputFileVM> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OutputFileVM.class));

       return (TypeAdapter<T>) new TypeAdapter<OutputFileVM>() {
           @Override
           public void write(JsonWriter out, OutputFileVM value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OutputFileVM read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             // comment by Detrav, do not need to validate JSON while parse
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OutputFileVM given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OutputFileVM
  * @throws IOException if the JSON string is invalid with respect to OutputFileVM
  */
  public static OutputFileVM fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OutputFileVM.class);
  }

 /**
  * Convert an instance of OutputFileVM to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

