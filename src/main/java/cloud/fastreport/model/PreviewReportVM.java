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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PreviewReportVM
 */
@JsonPropertyOrder({
  PreviewReportVM.JSON_PROPERTY_LOCALE,
  PreviewReportVM.JSON_PROPERTY_CACHE_TOLERANCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PreviewReportVM {
  public static final String JSON_PROPERTY_LOCALE = "locale";
  private JsonNullable<String> locale = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CACHE_TOLERANCE = "cacheTolerance";
  private Double cacheTolerance = 300d;

  public PreviewReportVM() {
  }

  public PreviewReportVM locale(String locale) {
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


  public PreviewReportVM cacheTolerance(Double cacheTolerance) {
    
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
    PreviewReportVM previewReportVM = (PreviewReportVM) o;
    return equalsNullable(this.locale, previewReportVM.locale) &&
        Objects.equals(this.cacheTolerance, previewReportVM.cacheTolerance);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(locale), cacheTolerance);
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
    sb.append("class PreviewReportVM {\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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

