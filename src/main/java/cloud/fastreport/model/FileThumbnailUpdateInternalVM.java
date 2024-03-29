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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.File;
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
 * FileThumbnailUpdateInternalVM
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FileThumbnailUpdateInternalVM extends CloudBaseVM {
  public static final String SERIALIZED_NAME_THUMBNAIL = "thumbnail";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL)
  private File thumbnail;

  public static final String SERIALIZED_NAME_EDITOR_ID = "editorId";
  @SerializedName(SERIALIZED_NAME_EDITOR_ID)
  private String editorId;

  public static final String SERIALIZED_NAME_$_T = "$t";
  @SerializedName(SERIALIZED_NAME_$_T)
  protected String $t;

  public FileThumbnailUpdateInternalVM() {
    this.$t = this.getClass().getSimpleName();
  }

  public FileThumbnailUpdateInternalVM thumbnail(File thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * Get thumbnail
   * @return thumbnail
  **/
  @javax.annotation.Nullable
  public File getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(File thumbnail) {
    this.thumbnail = thumbnail;
  }


  public FileThumbnailUpdateInternalVM editorId(String editorId) {
    this.editorId = editorId;
    return this;
  }

   /**
   * Get editorId
   * @return editorId
  **/
  @javax.annotation.Nullable
  public String getEditorId() {
    return editorId;
  }

  public void setEditorId(String editorId) {
    this.editorId = editorId;
  }


  public FileThumbnailUpdateInternalVM $t(String $t) {
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
    FileThumbnailUpdateInternalVM fileThumbnailUpdateInternalVM = (FileThumbnailUpdateInternalVM) o;
    return Objects.equals(this.thumbnail, fileThumbnailUpdateInternalVM.thumbnail) &&
        Objects.equals(this.editorId, fileThumbnailUpdateInternalVM.editorId) &&
        Objects.equals(this.$t, fileThumbnailUpdateInternalVM.$t) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(thumbnail, editorId, $t, super.hashCode());
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
    sb.append("class FileThumbnailUpdateInternalVM {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    editorId: ").append(toIndentedString(editorId)).append("\n");
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
  * @throws IOException if the JSON Element is invalid with respect to FileThumbnailUpdateInternalVM
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FileThumbnailUpdateInternalVM.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FileThumbnailUpdateInternalVM is not found in the empty JSON string", FileThumbnailUpdateInternalVM.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FileThumbnailUpdateInternalVM.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FileThumbnailUpdateInternalVM` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FileThumbnailUpdateInternalVM.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileThumbnailUpdateInternalVM.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileThumbnailUpdateInternalVM' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileThumbnailUpdateInternalVM> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileThumbnailUpdateInternalVM.class));

       return (TypeAdapter<T>) new TypeAdapter<FileThumbnailUpdateInternalVM>() {
           @Override
           public void write(JsonWriter out, FileThumbnailUpdateInternalVM value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileThumbnailUpdateInternalVM read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             // comment by Detrav, do not need to validate JSON while parse
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileThumbnailUpdateInternalVM given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileThumbnailUpdateInternalVM
  * @throws IOException if the JSON string is invalid with respect to FileThumbnailUpdateInternalVM
  */
  public static FileThumbnailUpdateInternalVM fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileThumbnailUpdateInternalVM.class);
  }

 /**
  * Convert an instance of FileThumbnailUpdateInternalVM to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

