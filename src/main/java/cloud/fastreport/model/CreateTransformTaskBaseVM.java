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
import cloud.fastreport.model.CreateTaskBaseVM;
import cloud.fastreport.model.CreateTaskEndVM;
import cloud.fastreport.model.CreateTransportTaskBaseVM;
import cloud.fastreport.model.InputFileVM;
import cloud.fastreport.model.OutputFileVM;
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
 * CreateTransformTaskBaseVM
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateTransformTaskBaseVM extends CreateTaskBaseVM {
  public static final String SERIALIZED_NAME_INPUT_FILE = "inputFile";
  @SerializedName(SERIALIZED_NAME_INPUT_FILE)
  private InputFileVM inputFile;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_OUTPUT_FILE = "outputFile";
  @SerializedName(SERIALIZED_NAME_OUTPUT_FILE)
  private OutputFileVM outputFile;

  public static final String SERIALIZED_NAME_TRANSPORTS = "transports";
  @SerializedName(SERIALIZED_NAME_TRANSPORTS)
  private List<CreateTransportTaskBaseVM> transports;

  public static final String SERIALIZED_NAME_$_T = "$t";
  @SerializedName(SERIALIZED_NAME_$_T)
  protected String $t;

  public CreateTransformTaskBaseVM() {
    this.$t = this.getClass().getSimpleName();
  }

  public CreateTransformTaskBaseVM inputFile(InputFileVM inputFile) {
    this.inputFile = inputFile;
    return this;
  }

   /**
   * Get inputFile
   * @return inputFile
  **/
  @javax.annotation.Nullable
  public InputFileVM getInputFile() {
    return inputFile;
  }

  public void setInputFile(InputFileVM inputFile) {
    this.inputFile = inputFile;
  }


  public CreateTransformTaskBaseVM locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @javax.annotation.Nullable
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }


  public CreateTransformTaskBaseVM outputFile(OutputFileVM outputFile) {
    this.outputFile = outputFile;
    return this;
  }

   /**
   * Get outputFile
   * @return outputFile
  **/
  @javax.annotation.Nullable
  public OutputFileVM getOutputFile() {
    return outputFile;
  }

  public void setOutputFile(OutputFileVM outputFile) {
    this.outputFile = outputFile;
  }


  public CreateTransformTaskBaseVM transports(List<CreateTransportTaskBaseVM> transports) {
    this.transports = transports;
    return this;
  }

  public CreateTransformTaskBaseVM addTransportsItem(CreateTransportTaskBaseVM transportsItem) {
    if (this.transports == null) {
      this.transports = new ArrayList<>();
    }
    this.transports.add(transportsItem);
    return this;
  }

   /**
   * Get transports
   * @return transports
  **/
  @javax.annotation.Nullable
  public List<CreateTransportTaskBaseVM> getTransports() {
    return transports;
  }

  public void setTransports(List<CreateTransportTaskBaseVM> transports) {
    this.transports = transports;
  }


  public CreateTransformTaskBaseVM $t(String $t) {
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
    CreateTransformTaskBaseVM createTransformTaskBaseVM = (CreateTransformTaskBaseVM) o;
    return Objects.equals(this.inputFile, createTransformTaskBaseVM.inputFile) &&
        Objects.equals(this.locale, createTransformTaskBaseVM.locale) &&
        Objects.equals(this.outputFile, createTransformTaskBaseVM.outputFile) &&
        Objects.equals(this.transports, createTransformTaskBaseVM.transports) &&
        Objects.equals(this.$t, createTransformTaskBaseVM.$t) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputFile, locale, outputFile, transports, $t, super.hashCode());
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
    sb.append("class CreateTransformTaskBaseVM {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inputFile: ").append(toIndentedString(inputFile)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    outputFile: ").append(toIndentedString(outputFile)).append("\n");
    sb.append("    transports: ").append(toIndentedString(transports)).append("\n");
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
    openapiFields.add("cronExpression");
    openapiFields.add("startsOn");
    openapiFields.add("ends");
    openapiFields.add("name");
    openapiFields.add("subscriptionId");
    openapiFields.add("$t");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("$t");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateTransformTaskBaseVM
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateTransformTaskBaseVM.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTransformTaskBaseVM is not found in the empty JSON string", CreateTransformTaskBaseVM.openapiRequiredFields.toString()));
        }
      }

      String discriminatorValue = jsonElement.getAsJsonObject().get("$t").getAsString();
      switch (discriminatorValue) {
        case "CreateExportReportTaskVM":
          CreateExportReportTaskVM.validateJsonElement(jsonElement);
          break;
        case "CreateExportTemplateTaskVM":
          CreateExportTemplateTaskVM.validateJsonElement(jsonElement);
          break;
        case "CreatePrepareTemplateTaskVM":
          CreatePrepareTemplateTaskVM.validateJsonElement(jsonElement);
          break;
        case "CreateTransformTaskBaseVM":
          CreateTransformTaskBaseVM.validateJsonElement(jsonElement);
          break;
        default:
          throw new IllegalArgumentException(String.format("The value of the `$t` field `%s` does not match any key defined in the discriminator's mapping.", discriminatorValue));
      }
  }


 /**
  * Create an instance of CreateTransformTaskBaseVM given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateTransformTaskBaseVM
  * @throws IOException if the JSON string is invalid with respect to CreateTransformTaskBaseVM
  */
  public static CreateTransformTaskBaseVM fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTransformTaskBaseVM.class);
  }

 /**
  * Convert an instance of CreateTransformTaskBaseVM to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

