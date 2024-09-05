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
import cloud.fastreport.model.DataSourceSelectCommandParameterVM;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * DataSourceSelectCommandVM
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DataSourceSelectCommandVM extends CloudBaseVM {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COMMAND = "command";
  @SerializedName(SERIALIZED_NAME_COMMAND)
  private String command;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<DataSourceSelectCommandParameterVM> parameters;

  public static final String SERIALIZED_NAME_$_T = "$t";
  @SerializedName(SERIALIZED_NAME_$_T)
  protected String $t;

  public DataSourceSelectCommandVM() {
    this.$t = this.getClass().getSimpleName();
  }

  public DataSourceSelectCommandVM name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public DataSourceSelectCommandVM command(String command) {
    this.command = command;
    return this;
  }

   /**
   * Get command
   * @return command
  **/
  @javax.annotation.Nonnull
  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }


  public DataSourceSelectCommandVM parameters(List<DataSourceSelectCommandParameterVM> parameters) {
    this.parameters = parameters;
    return this;
  }

  public DataSourceSelectCommandVM addParametersItem(DataSourceSelectCommandParameterVM parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  public List<DataSourceSelectCommandParameterVM> getParameters() {
    return parameters;
  }

  public void setParameters(List<DataSourceSelectCommandParameterVM> parameters) {
    this.parameters = parameters;
  }


  public DataSourceSelectCommandVM $t(String $t) {
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
    DataSourceSelectCommandVM dataSourceSelectCommandVM = (DataSourceSelectCommandVM) o;
    return Objects.equals(this.name, dataSourceSelectCommandVM.name) &&
        Objects.equals(this.command, dataSourceSelectCommandVM.command) &&
        Objects.equals(this.parameters, dataSourceSelectCommandVM.parameters) &&
        Objects.equals(this.$t, dataSourceSelectCommandVM.$t) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, command, parameters, $t, super.hashCode());
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
    sb.append("class DataSourceSelectCommandVM {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("command");
    openapiRequiredFields.add("$t");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DataSourceSelectCommandVM
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataSourceSelectCommandVM.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataSourceSelectCommandVM is not found in the empty JSON string", DataSourceSelectCommandVM.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DataSourceSelectCommandVM.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataSourceSelectCommandVM` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DataSourceSelectCommandVM.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataSourceSelectCommandVM.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataSourceSelectCommandVM' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataSourceSelectCommandVM> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataSourceSelectCommandVM.class));

       return (TypeAdapter<T>) new TypeAdapter<DataSourceSelectCommandVM>() {
           @Override
           public void write(JsonWriter out, DataSourceSelectCommandVM value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataSourceSelectCommandVM read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             // comment by Detrav, do not need to validate JSON while parse
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataSourceSelectCommandVM given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataSourceSelectCommandVM
  * @throws IOException if the JSON string is invalid with respect to DataSourceSelectCommandVM
  */
  public static DataSourceSelectCommandVM fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataSourceSelectCommandVM.class);
  }

 /**
  * Convert an instance of DataSourceSelectCommandVM to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
