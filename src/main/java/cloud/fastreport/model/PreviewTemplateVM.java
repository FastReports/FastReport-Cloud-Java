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
import java.util.HashMap;
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
 * PreviewTemplateVM
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PreviewTemplateVM {
  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_REPORT_PARAMETERS = "reportParameters";
  @SerializedName(SERIALIZED_NAME_REPORT_PARAMETERS)
  private Map<String, String> reportParameters;

  public static final String SERIALIZED_NAME_CACHE_TOLERANCE = "cacheTolerance";
  @SerializedName(SERIALIZED_NAME_CACHE_TOLERANCE)
  private Double cacheTolerance = 300d;

  public PreviewTemplateVM() {
  }

  public PreviewTemplateVM locale(String locale) {
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


  public PreviewTemplateVM reportParameters(Map<String, String> reportParameters) {
    this.reportParameters = reportParameters;
    return this;
  }

  public PreviewTemplateVM putReportParametersItem(String key, String reportParametersItem) {
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


  public PreviewTemplateVM cacheTolerance(Double cacheTolerance) {
    this.cacheTolerance = cacheTolerance;
    return this;
  }

   /**
   * Get cacheTolerance
   * @return cacheTolerance
  **/
  @javax.annotation.Nullable
  public Double getCacheTolerance() {
    return cacheTolerance;
  }

  public void setCacheTolerance(Double cacheTolerance) {
    this.cacheTolerance = cacheTolerance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreviewTemplateVM previewTemplateVM = (PreviewTemplateVM) o;
    return Objects.equals(this.locale, previewTemplateVM.locale) &&
        Objects.equals(this.reportParameters, previewTemplateVM.reportParameters) &&
        Objects.equals(this.cacheTolerance, previewTemplateVM.cacheTolerance);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(locale, reportParameters, cacheTolerance);
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
    sb.append("class PreviewTemplateVM {\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    reportParameters: ").append(toIndentedString(reportParameters)).append("\n");
    sb.append("    cacheTolerance: ").append(toIndentedString(cacheTolerance)).append("\n");
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
    openapiFields.add("locale");
    openapiFields.add("reportParameters");
    openapiFields.add("cacheTolerance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PreviewTemplateVM
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PreviewTemplateVM.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PreviewTemplateVM is not found in the empty JSON string", PreviewTemplateVM.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PreviewTemplateVM.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PreviewTemplateVM` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("locale") != null && !jsonObj.get("locale").isJsonNull()) && !jsonObj.get("locale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locale").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PreviewTemplateVM.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PreviewTemplateVM' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PreviewTemplateVM> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PreviewTemplateVM.class));

       return (TypeAdapter<T>) new TypeAdapter<PreviewTemplateVM>() {
           @Override
           public void write(JsonWriter out, PreviewTemplateVM value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PreviewTemplateVM read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PreviewTemplateVM given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PreviewTemplateVM
  * @throws IOException if the JSON string is invalid with respect to PreviewTemplateVM
  */
  public static PreviewTemplateVM fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PreviewTemplateVM.class);
  }

 /**
  * Convert an instance of PreviewTemplateVM to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

