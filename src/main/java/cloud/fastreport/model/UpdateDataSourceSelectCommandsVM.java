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
import cloud.fastreport.model.DataSourceSelectCommandVM;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * UpdateDataSourceSelectCommandsVM
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateDataSourceSelectCommandsVM extends CloudBaseVM {
  public static final String SERIALIZED_NAME_SELECT_COMMANDS = "selectCommands";
  @SerializedName(SERIALIZED_NAME_SELECT_COMMANDS)
  private List<DataSourceSelectCommandVM> selectCommands = new ArrayList<>();

  public static final String SERIALIZED_NAME_$_T = "$t";
  @SerializedName(SERIALIZED_NAME_$_T)
  protected String $t;

  public UpdateDataSourceSelectCommandsVM() {
    this.$t = this.getClass().getSimpleName();
  }

  public UpdateDataSourceSelectCommandsVM selectCommands(List<DataSourceSelectCommandVM> selectCommands) {
    this.selectCommands = selectCommands;
    return this;
  }

  public UpdateDataSourceSelectCommandsVM addSelectCommandsItem(DataSourceSelectCommandVM selectCommandsItem) {
    if (this.selectCommands == null) {
      this.selectCommands = new ArrayList<>();
    }
    this.selectCommands.add(selectCommandsItem);
    return this;
  }

   /**
   * Get selectCommands
   * @return selectCommands
  **/
  @javax.annotation.Nonnull
  public List<DataSourceSelectCommandVM> getSelectCommands() {
    return selectCommands;
  }

  public void setSelectCommands(List<DataSourceSelectCommandVM> selectCommands) {
    this.selectCommands = selectCommands;
  }


  public UpdateDataSourceSelectCommandsVM $t(String $t) {
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
    UpdateDataSourceSelectCommandsVM updateDataSourceSelectCommandsVM = (UpdateDataSourceSelectCommandsVM) o;
    return Objects.equals(this.selectCommands, updateDataSourceSelectCommandsVM.selectCommands) &&
        Objects.equals(this.$t, updateDataSourceSelectCommandsVM.$t) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selectCommands, $t, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDataSourceSelectCommandsVM {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    selectCommands: ").append(toIndentedString(selectCommands)).append("\n");
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
    openapiRequiredFields.add("selectCommands");
    openapiRequiredFields.add("$t");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateDataSourceSelectCommandsVM
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateDataSourceSelectCommandsVM.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateDataSourceSelectCommandsVM is not found in the empty JSON string", UpdateDataSourceSelectCommandsVM.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateDataSourceSelectCommandsVM.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateDataSourceSelectCommandsVM` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateDataSourceSelectCommandsVM.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateDataSourceSelectCommandsVM.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateDataSourceSelectCommandsVM' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateDataSourceSelectCommandsVM> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateDataSourceSelectCommandsVM.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateDataSourceSelectCommandsVM>() {
           @Override
           public void write(JsonWriter out, UpdateDataSourceSelectCommandsVM value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateDataSourceSelectCommandsVM read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             // comment by Detrav, do not need to validate JSON while parse
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateDataSourceSelectCommandsVM given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateDataSourceSelectCommandsVM
  * @throws IOException if the JSON string is invalid with respect to UpdateDataSourceSelectCommandsVM
  */
  public static UpdateDataSourceSelectCommandsVM fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateDataSourceSelectCommandsVM.class);
  }

 /**
  * Convert an instance of UpdateDataSourceSelectCommandsVM to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

