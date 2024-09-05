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
import cloud.fastreport.model.OutputFileVM;
import cloud.fastreport.model.UpdateTransformTaskBaseVM;
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
 * UpdatePrepareTemplateTaskVM
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdatePrepareTemplateTaskVM extends UpdateTransformTaskBaseVM {
  public static final String SERIALIZED_NAME_EXPORT_IDS = "exportIds";
  @SerializedName(SERIALIZED_NAME_EXPORT_IDS)
  private List<String> exportIds;

  public static final String SERIALIZED_NAME_PAGES_COUNT = "pagesCount";
  @SerializedName(SERIALIZED_NAME_PAGES_COUNT)
  private Integer pagesCount;

  public static final String SERIALIZED_NAME_REPORT_PARAMETERS = "reportParameters";
  @SerializedName(SERIALIZED_NAME_REPORT_PARAMETERS)
  private Map<String, String> reportParameters;

  public static final String SERIALIZED_NAME_$_T = "$t";
  @SerializedName(SERIALIZED_NAME_$_T)
  protected String $t;

  public UpdatePrepareTemplateTaskVM() {
    this.$t = this.getClass().getSimpleName();
  }

  public UpdatePrepareTemplateTaskVM exportIds(List<String> exportIds) {
    this.exportIds = exportIds;
    return this;
  }

  public UpdatePrepareTemplateTaskVM addExportIdsItem(String exportIdsItem) {
    if (this.exportIds == null) {
      this.exportIds = new ArrayList<>();
    }
    this.exportIds.add(exportIdsItem);
    return this;
  }

   /**
   * Get exportIds
   * @return exportIds
  **/
  @javax.annotation.Nullable
  public List<String> getExportIds() {
    return exportIds;
  }

  public void setExportIds(List<String> exportIds) {
    this.exportIds = exportIds;
  }


  public UpdatePrepareTemplateTaskVM pagesCount(Integer pagesCount) {
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


  public UpdatePrepareTemplateTaskVM reportParameters(Map<String, String> reportParameters) {
    this.reportParameters = reportParameters;
    return this;
  }

  public UpdatePrepareTemplateTaskVM putReportParametersItem(String key, String reportParametersItem) {
    if (this.reportParameters == null) {
      this.reportParameters = new HashMap<>();
    }
    this.reportParameters.put(key, reportParametersItem);
    return this;
  }

   /**
   * Get reportParameters
   * @return reportParameters
  **/
  @javax.annotation.Nullable
  public Map<String, String> getReportParameters() {
    return reportParameters;
  }

  public void setReportParameters(Map<String, String> reportParameters) {
    this.reportParameters = reportParameters;
  }


  public UpdatePrepareTemplateTaskVM $t(String $t) {
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
    UpdatePrepareTemplateTaskVM updatePrepareTemplateTaskVM = (UpdatePrepareTemplateTaskVM) o;
    return Objects.equals(this.exportIds, updatePrepareTemplateTaskVM.exportIds) &&
        Objects.equals(this.pagesCount, updatePrepareTemplateTaskVM.pagesCount) &&
        Objects.equals(this.reportParameters, updatePrepareTemplateTaskVM.reportParameters) &&
        Objects.equals(this.$t, updatePrepareTemplateTaskVM.$t) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportIds, pagesCount, reportParameters, $t, super.hashCode());
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
    sb.append("class UpdatePrepareTemplateTaskVM {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    exportIds: ").append(toIndentedString(exportIds)).append("\n");
    sb.append("    pagesCount: ").append(toIndentedString(pagesCount)).append("\n");
    sb.append("    reportParameters: ").append(toIndentedString(reportParameters)).append("\n");
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
  * @throws IOException if the JSON Element is invalid with respect to UpdatePrepareTemplateTaskVM
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdatePrepareTemplateTaskVM.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdatePrepareTemplateTaskVM is not found in the empty JSON string", UpdatePrepareTemplateTaskVM.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdatePrepareTemplateTaskVM.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdatePrepareTemplateTaskVM` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdatePrepareTemplateTaskVM.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdatePrepareTemplateTaskVM.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdatePrepareTemplateTaskVM' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdatePrepareTemplateTaskVM> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdatePrepareTemplateTaskVM.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdatePrepareTemplateTaskVM>() {
           @Override
           public void write(JsonWriter out, UpdatePrepareTemplateTaskVM value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdatePrepareTemplateTaskVM read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             // comment by Detrav, do not need to validate JSON while parse
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdatePrepareTemplateTaskVM given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdatePrepareTemplateTaskVM
  * @throws IOException if the JSON string is invalid with respect to UpdatePrepareTemplateTaskVM
  */
  public static UpdatePrepareTemplateTaskVM fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdatePrepareTemplateTaskVM.class);
  }

 /**
  * Convert an instance of UpdatePrepareTemplateTaskVM to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

