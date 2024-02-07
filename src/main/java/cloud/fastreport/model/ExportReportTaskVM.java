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
import cloud.fastreport.model.TransformTaskBaseVM;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ExportReportTaskVM
 */
@JsonPropertyOrder({
  ExportReportTaskVM.JSON_PROPERTY_EXPORT_PARAMETERS,
  ExportReportTaskVM.JSON_PROPERTY_FORMAT,
  ExportReportTaskVM.JSON_PROPERTY_PAGES_COUNT,
  ExportReportTaskVM.JSON_PROPERTY_$_T
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonIgnoreProperties(
  value = "$t", // ignore manually set $t, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the $t to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$t", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = ExportReportTaskVM.class, name = "ExportReportTaskVM"),
  @JsonSubTypes.Type(value = ExportTemplateTaskVM.class, name = "ExportTemplateTaskVM"),
})

public class ExportReportTaskVM extends TransformTaskBaseVM {
  public static final String JSON_PROPERTY_EXPORT_PARAMETERS = "exportParameters";
  private JsonNullable<Map<String, String>> exportParameters = JsonNullable.<Map<String, String>>undefined();

  public static final String JSON_PROPERTY_FORMAT = "format";
  private ExportFormat format;

  public static final String JSON_PROPERTY_PAGES_COUNT = "pagesCount";
  private Integer pagesCount;

  public static final String JSON_PROPERTY_$_T = "$t";
  protected String $t;

  public ExportReportTaskVM() {

  }

  @JsonCreator
  public ExportReportTaskVM(
    @JsonProperty(JSON_PROPERTY_RECURRENT_RUN_TIME) OffsetDateTime recurrentRunTime, 
    @JsonProperty(JSON_PROPERTY_RECURRENT_WAS_RUN_TIME) OffsetDateTime recurrentWasRunTime
  ) {
    this();
    this.recurrentRunTime = recurrentRunTime;
    this.recurrentWasRunTime = recurrentWasRunTime;
  }

  public ExportReportTaskVM exportParameters(Map<String, String> exportParameters) {
    this.exportParameters = JsonNullable.<Map<String, String>>of(exportParameters);
    
    return this;
  }

  public ExportReportTaskVM putExportParametersItem(String key, String exportParametersItem) {
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


  public ExportReportTaskVM format(ExportFormat format) {
    
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
  @JsonProperty(JSON_PROPERTY_PAGES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPagesCount() {
    return pagesCount;
  }


  @JsonProperty(JSON_PROPERTY_PAGES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_$_T)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String get$T() {
    return $t;
  }


  @JsonProperty(JSON_PROPERTY_$_T)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void set$T(String $t) {
    this.$t = $t;
  }

  @Override
  public ExportReportTaskVM cronExpression(String cronExpression) {
    this.setCronExpression(cronExpression);
    return this;
  }

  @Override
  public ExportReportTaskVM delayedRunTime(OffsetDateTime delayedRunTime) {
    this.setDelayedRunTime(delayedRunTime);
    return this;
  }

  @Override
  public ExportReportTaskVM delayedWasRunTime(OffsetDateTime delayedWasRunTime) {
    this.setDelayedWasRunTime(delayedWasRunTime);
    return this;
  }

  @Override
  public ExportReportTaskVM id(String id) {
    this.setId(id);
    return this;
  }

  @Override
  public ExportReportTaskVM name(String name) {
    this.setName(name);
    return this;
  }

  @Override
  public ExportReportTaskVM recurrentRunTime(OffsetDateTime recurrentRunTime) {
    this.setRecurrentRunTime(recurrentRunTime);
    return this;
  }

  @Override
  public ExportReportTaskVM recurrentWasRunTime(OffsetDateTime recurrentWasRunTime) {
    this.setRecurrentWasRunTime(recurrentWasRunTime);
    return this;
  }

  @Override
  public ExportReportTaskVM subscriptionId(String subscriptionId) {
    this.setSubscriptionId(subscriptionId);
    return this;
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
    return equalsNullable(this.exportParameters, exportReportTaskVM.exportParameters) &&
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
    return Objects.hash(hashCodeNullable(exportParameters), format, pagesCount, $t, super.hashCode());
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

}

