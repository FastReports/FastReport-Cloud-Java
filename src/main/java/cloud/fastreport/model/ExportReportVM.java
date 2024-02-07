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
import cloud.fastreport.model.ExportFormat;
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
 * ExportReportVM
 */
@JsonPropertyOrder({
  ExportReportVM.JSON_PROPERTY_FILE_NAME,
  ExportReportVM.JSON_PROPERTY_FOLDER_ID,
  ExportReportVM.JSON_PROPERTY_LOCALE,
  ExportReportVM.JSON_PROPERTY_PAGES_COUNT,
  ExportReportVM.JSON_PROPERTY_FORMAT,
  ExportReportVM.JSON_PROPERTY_EXPORT_PARAMETERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExportReportVM {
  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private JsonNullable<String> fileName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FOLDER_ID = "folderId";
  private JsonNullable<String> folderId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LOCALE = "locale";
  private JsonNullable<String> locale = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PAGES_COUNT = "pagesCount";
  private JsonNullable<Integer> pagesCount = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_FORMAT = "format";
  private ExportFormat format;

  public static final String JSON_PROPERTY_EXPORT_PARAMETERS = "exportParameters";
  private JsonNullable<Map<String, String>> exportParameters = JsonNullable.<Map<String, String>>undefined();

  public ExportReportVM() {
  }

  public ExportReportVM fileName(String fileName) {
    this.fileName = JsonNullable.<String>of(fileName);
    
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getFileName() {
        return fileName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFileName_JsonNullable() {
    return fileName;
  }
  
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  public void setFileName_JsonNullable(JsonNullable<String> fileName) {
    this.fileName = fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = JsonNullable.<String>of(fileName);
  }


  public ExportReportVM folderId(String folderId) {
    this.folderId = JsonNullable.<String>of(folderId);
    
    return this;
  }

   /**
   * Get folderId
   * @return folderId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getFolderId() {
        return folderId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFolderId_JsonNullable() {
    return folderId;
  }
  
  @JsonProperty(JSON_PROPERTY_FOLDER_ID)
  public void setFolderId_JsonNullable(JsonNullable<String> folderId) {
    this.folderId = folderId;
  }

  public void setFolderId(String folderId) {
    this.folderId = JsonNullable.<String>of(folderId);
  }


  public ExportReportVM locale(String locale) {
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


  public ExportReportVM pagesCount(Integer pagesCount) {
    this.pagesCount = JsonNullable.<Integer>of(pagesCount);
    
    return this;
  }

   /**
   * Get pagesCount
   * minimum: 0
   * maximum: 2147483647
   * @return pagesCount
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getPagesCount() {
        return pagesCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAGES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getPagesCount_JsonNullable() {
    return pagesCount;
  }
  
  @JsonProperty(JSON_PROPERTY_PAGES_COUNT)
  public void setPagesCount_JsonNullable(JsonNullable<Integer> pagesCount) {
    this.pagesCount = pagesCount;
  }

  public void setPagesCount(Integer pagesCount) {
    this.pagesCount = JsonNullable.<Integer>of(pagesCount);
  }


  public ExportReportVM format(ExportFormat format) {
    
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExportFormat getFormat() {
    return format;
  }


  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormat(ExportFormat format) {
    this.format = format;
  }


  public ExportReportVM exportParameters(Map<String, String> exportParameters) {
    this.exportParameters = JsonNullable.<Map<String, String>>of(exportParameters);
    
    return this;
  }

  public ExportReportVM putExportParametersItem(String key, String exportParametersItem) {
    if (this.exportParameters == null || !this.exportParameters.isPresent()) {
      this.exportParameters = JsonNullable.<Map<String, String>>of(new HashMap<>());
    }
    try {
      this.exportParameters.get().put(key, exportParametersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get exportParameters
   * @return exportParameters
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Map<String, String> getExportParameters() {
        return exportParameters.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPORT_PARAMETERS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, String>> getExportParameters_JsonNullable() {
    return exportParameters;
  }
  
  @JsonProperty(JSON_PROPERTY_EXPORT_PARAMETERS)
  public void setExportParameters_JsonNullable(JsonNullable<Map<String, String>> exportParameters) {
    this.exportParameters = exportParameters;
  }

  public void setExportParameters(Map<String, String> exportParameters) {
    this.exportParameters = JsonNullable.<Map<String, String>>of(exportParameters);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportReportVM exportReportVM = (ExportReportVM) o;
    return equalsNullable(this.fileName, exportReportVM.fileName) &&
        equalsNullable(this.folderId, exportReportVM.folderId) &&
        equalsNullable(this.locale, exportReportVM.locale) &&
        equalsNullable(this.pagesCount, exportReportVM.pagesCount) &&
        Objects.equals(this.format, exportReportVM.format) &&
        equalsNullable(this.exportParameters, exportReportVM.exportParameters);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(fileName), hashCodeNullable(folderId), hashCodeNullable(locale), hashCodeNullable(pagesCount), format, hashCodeNullable(exportParameters));
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
    sb.append("class ExportReportVM {\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    pagesCount: ").append(toIndentedString(pagesCount)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    exportParameters: ").append(toIndentedString(exportParameters)).append("\n");
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

