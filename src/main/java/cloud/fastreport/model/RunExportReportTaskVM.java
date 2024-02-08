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

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import cloud.fastreport.model.ExportFormat;
import cloud.fastreport.model.RunTransformTaskBaseVM;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import cloud.fastreport.JSON;
/**
 * RunExportReportTaskVM
 */
@JsonPropertyOrder({
  RunExportReportTaskVM.JSON_PROPERTY_EXPORT_PARAMETERS,
  RunExportReportTaskVM.JSON_PROPERTY_FORMAT,
  RunExportReportTaskVM.JSON_PROPERTY_PAGES_COUNT,
  RunExportReportTaskVM.JSON_PROPERTY_$_T
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonIgnoreProperties(
  value = "$t", // ignore manually set $t, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the $t to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$t", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = RunExportReportTaskVM.class, name = "RunExportReportTaskVM"),
  @JsonSubTypes.Type(value = RunExportTemplateTaskVM.class, name = "RunExportTemplateTaskVM"),
})

public class RunExportReportTaskVM extends RunTransformTaskBaseVM {
  public static final String JSON_PROPERTY_EXPORT_PARAMETERS = "exportParameters";
  private JsonNullable<Map<String, String>> exportParameters = JsonNullable.<Map<String, String>>undefined();

  public static final String JSON_PROPERTY_FORMAT = "format";
  private ExportFormat format;

  public static final String JSON_PROPERTY_PAGES_COUNT = "pagesCount";
  private Integer pagesCount;

  public static final String JSON_PROPERTY_$_T = "$t";
  private String $t;

  public RunExportReportTaskVM() { 
  }

  public RunExportReportTaskVM exportParameters(Map<String, String> exportParameters) {
    this.exportParameters = JsonNullable.<Map<String, String>>of(exportParameters);
    return this;
  }

  public RunExportReportTaskVM putExportParametersItem(String key, String exportParametersItem) {
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


  public RunExportReportTaskVM format(ExportFormat format) {
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


  public RunExportReportTaskVM pagesCount(Integer pagesCount) {
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


  public RunExportReportTaskVM $t(String $t) {
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
  public RunExportReportTaskVM subscriptionId(String subscriptionId) {
    this.setSubscriptionId(subscriptionId);
    return this;
  }

  /**
   * Return true if this RunExportReportTaskVM object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunExportReportTaskVM runExportReportTaskVM = (RunExportReportTaskVM) o;
    return equalsNullable(this.exportParameters, runExportReportTaskVM.exportParameters) &&
        Objects.equals(this.format, runExportReportTaskVM.format) &&
        Objects.equals(this.pagesCount, runExportReportTaskVM.pagesCount) &&
        Objects.equals(this.$t, runExportReportTaskVM.$t) &&
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
    sb.append("class RunExportReportTaskVM {\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `subscriptionId` to the URL query string
    if (getSubscriptionId() != null) {
      joiner.add(String.format("%ssubscriptionId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubscriptionId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `$t` to the URL query string
    if (get$T() != null) {
      joiner.add(String.format("%s$t%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(get$T()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("RunExportReportTaskVM", RunExportReportTaskVM.class);
  mappings.put("RunExportTemplateTaskVM", RunExportTemplateTaskVM.class);
  mappings.put("RunExportReportTaskVM", RunExportReportTaskVM.class);
  JSON.registerDiscriminator(RunExportReportTaskVM.class, "$t", mappings);
}
}

