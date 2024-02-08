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
import cloud.fastreport.model.ExportFormat;
import cloud.fastreport.model.InputFileVM;
import cloud.fastreport.model.OutputFileVM;
import cloud.fastreport.model.TransformTaskBaseVM;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * ExportReportTaskVM
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExportReportTaskVM extends TransformTaskBaseVM {
  public static final String SERIALIZED_NAME_EXPORT_PARAMETERS = "exportParameters";
  @SerializedName(SERIALIZED_NAME_EXPORT_PARAMETERS)
  private Map<String, String> exportParameters;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private ExportFormat format;

  public static final String SERIALIZED_NAME_PAGES_COUNT = "pagesCount";
  @SerializedName(SERIALIZED_NAME_PAGES_COUNT)
  private Integer pagesCount;

  public static final String SERIALIZED_NAME_$_T = "$t";
  @SerializedName(SERIALIZED_NAME_$_T)
  protected String $t;

  public ExportReportTaskVM() {
    this.$t = this.getClass().getSimpleName();
  }

  public ExportReportTaskVM exportParameters(Map<String, String> exportParameters) {
    this.exportParameters = exportParameters;
    return this;
  }

  public ExportReportTaskVM putExportParametersItem(String key, String exportParametersItem) {
    if (this.exportParameters == null) {
      this.exportParameters = new HashMap<>();
    }
    this.exportParameters.put(key, exportParametersItem);
    return this;
  }

   /**
   * Get exportParameters
   * @return exportParameters
  **/
  @javax.annotation.Nullable
  public Map<String, String> getExportParameters() {
    return exportParameters;
  }

  public void setExportParameters(Map<String, String> exportParameters) {
    this.exportParameters = exportParameters;
  }


  public ExportReportTaskVM format(ExportFormat format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @javax.annotation.Nullable
  public ExportFormat getFormat() {
    return format;
  }

  public void setFormat(ExportFormat format) {
    this.format = format;
  }


  public ExportReportTaskVM pagesCount(Integer pagesCount) {
    this.pagesCount = pagesCount;
    return this;
  }

   /**
   * Get pagesCount
   * minimum: 0
   * maximum: 2147483647
   * @return pagesCount
  **/
  @javax.annotation.Nullable
  public Integer getPagesCount() {
    return pagesCount;
  }

  public void setPagesCount(Integer pagesCount) {
    this.pagesCount = pagesCount;
  }


  public ExportReportTaskVM $t(String $t) {
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
    ExportReportTaskVM exportReportTaskVM = (ExportReportTaskVM) o;
    return Objects.equals(this.exportParameters, exportReportTaskVM.exportParameters) &&
        Objects.equals(this.format, exportReportTaskVM.format) &&
        Objects.equals(this.pagesCount, exportReportTaskVM.pagesCount) &&
        Objects.equals(this.$t, exportReportTaskVM.$t) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportParameters, format, pagesCount, $t, super.hashCode());
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
    sb.append("class ExportReportTaskVM {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    exportParameters: ").append(toIndentedString(exportParameters)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    pagesCount: ").append(toIndentedString(pagesCount)).append("\n");
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
    openapiFields.add("locale");
    openapiFields.add("outputFile");
    openapiFields.add("transportIds");
    openapiFields.add("$t");
    openapiFields.add("cronExpression");
    openapiFields.add("delayedRunTime");
    openapiFields.add("delayedWasRunTime");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("recurrentRunTime");
    openapiFields.add("recurrentWasRunTime");
    openapiFields.add("subscriptionId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("$t");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExportReportTaskVM
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExportReportTaskVM.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExportReportTaskVM is not found in the empty JSON string", ExportReportTaskVM.openapiRequiredFields.toString()));
        }
      }

      String discriminatorValue = jsonElement.getAsJsonObject().get("$t").getAsString();
      switch (discriminatorValue) {
        case "ExportReportTaskVM":
          ExportReportTaskVM.validateJsonElement(jsonElement);
          break;
        case "ExportTemplateTaskVM":
          ExportTemplateTaskVM.validateJsonElement(jsonElement);
          break;
        default:
          throw new IllegalArgumentException(String.format("The value of the `$t` field `%s` does not match any key defined in the discriminator's mapping.", discriminatorValue));
      }
  }


 /**
  * Create an instance of ExportReportTaskVM given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExportReportTaskVM
  * @throws IOException if the JSON string is invalid with respect to ExportReportTaskVM
  */
  public static ExportReportTaskVM fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExportReportTaskVM.class);
  }

 /**
  * Convert an instance of ExportReportTaskVM to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

