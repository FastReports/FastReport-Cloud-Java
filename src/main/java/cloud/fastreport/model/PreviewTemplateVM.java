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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PreviewTemplateVM
 */
@JsonPropertyOrder({
  PreviewTemplateVM.JSON_PROPERTY_LOCALE,
  PreviewTemplateVM.JSON_PROPERTY_REPORT_PARAMETERS,
  PreviewTemplateVM.JSON_PROPERTY_CACHE_TOLERANCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PreviewTemplateVM {
  public static final String JSON_PROPERTY_LOCALE = "locale";
  private JsonNullable<String> locale = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REPORT_PARAMETERS = "reportParameters";
  private JsonNullable<Map<String, String>> reportParameters = JsonNullable.<Map<String, String>>undefined();

  public static final String JSON_PROPERTY_CACHE_TOLERANCE = "cacheTolerance";
  private Double cacheTolerance = 300d;

  public PreviewTemplateVM() {
  }

  public PreviewTemplateVM locale(String locale) {
    this.locale = JsonNullable.<String>of(locale);
    
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLocale() {
        return locale.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLocale_JsonNullable() {
    return locale;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCALE)
  public void setLocale_JsonNullable(JsonNullable<String> locale) {
    this.locale = locale;
  }

  public void setLocale(String locale) {
    this.locale = JsonNullable.<String>of(locale);
  }


  public PreviewTemplateVM reportParameters(Map<String, String> reportParameters) {
    this.reportParameters = JsonNullable.<Map<String, String>>of(reportParameters);
    
    return this;
  }

  public PreviewTemplateVM putReportParametersItem(String key, String reportParametersItem) {
    if (this.reportParameters == null || !this.reportParameters.isPresent()) {
      this.reportParameters = JsonNullable.<Map<String, String>>of(new HashMap<>());
    }
    try {
      this.reportParameters.get().put(key, reportParametersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get reportParameters
   * @return reportParameters
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Map<String, String> getReportParameters() {
        return reportParameters.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REPORT_PARAMETERS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, String>> getReportParameters_JsonNullable() {
    return reportParameters;
  }
  
  @JsonProperty(JSON_PROPERTY_REPORT_PARAMETERS)
  public void setReportParameters_JsonNullable(JsonNullable<Map<String, String>> reportParameters) {
    this.reportParameters = reportParameters;
  }

  public void setReportParameters(Map<String, String> reportParameters) {
    this.reportParameters = JsonNullable.<Map<String, String>>of(reportParameters);
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
  @JsonProperty(JSON_PROPERTY_CACHE_TOLERANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCacheTolerance() {
    return cacheTolerance;
  }


  @JsonProperty(JSON_PROPERTY_CACHE_TOLERANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    return equalsNullable(this.locale, previewTemplateVM.locale) &&
        equalsNullable(this.reportParameters, previewTemplateVM.reportParameters) &&
        Objects.equals(this.cacheTolerance, previewTemplateVM.cacheTolerance);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(locale), hashCodeNullable(reportParameters), cacheTolerance);
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

}

