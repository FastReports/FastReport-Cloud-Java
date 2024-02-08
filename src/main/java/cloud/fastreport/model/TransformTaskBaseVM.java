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
import cloud.fastreport.model.InputFileVM;
import cloud.fastreport.model.OutputFileVM;
import cloud.fastreport.model.TaskBaseVM;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import cloud.fastreport.JSON;
/**
 * TransformTaskBaseVM
 */
@JsonPropertyOrder({
  TransformTaskBaseVM.JSON_PROPERTY_INPUT_FILE,
  TransformTaskBaseVM.JSON_PROPERTY_LOCALE,
  TransformTaskBaseVM.JSON_PROPERTY_OUTPUT_FILE,
  TransformTaskBaseVM.JSON_PROPERTY_TRANSPORT_IDS,
  TransformTaskBaseVM.JSON_PROPERTY_$_T
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
  @JsonSubTypes.Type(value = PrepareTemplateTaskVM.class, name = "PrepareTemplateTaskVM"),
})

public class TransformTaskBaseVM extends TaskBaseVM {
  public static final String JSON_PROPERTY_INPUT_FILE = "inputFile";
  private InputFileVM inputFile;

  public static final String JSON_PROPERTY_LOCALE = "locale";
  private JsonNullable<String> locale = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OUTPUT_FILE = "outputFile";
  private OutputFileVM outputFile;

  public static final String JSON_PROPERTY_TRANSPORT_IDS = "transportIds";
  private JsonNullable<List<String>> transportIds = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_$_T = "$t";
  private String $t;

  public TransformTaskBaseVM() { 
  }

  public TransformTaskBaseVM inputFile(InputFileVM inputFile) {
    this.inputFile = inputFile;
    return this;
  }

   /**
   * Get inputFile
   * @return inputFile
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InputFileVM getInputFile() {
    return inputFile;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputFile(InputFileVM inputFile) {
    this.inputFile = inputFile;
  }


  public TransformTaskBaseVM locale(String locale) {
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


  public TransformTaskBaseVM outputFile(OutputFileVM outputFile) {
    this.outputFile = outputFile;
    return this;
  }

   /**
   * Get outputFile
   * @return outputFile
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTPUT_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OutputFileVM getOutputFile() {
    return outputFile;
  }


  @JsonProperty(JSON_PROPERTY_OUTPUT_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutputFile(OutputFileVM outputFile) {
    this.outputFile = outputFile;
  }


  public TransformTaskBaseVM transportIds(List<String> transportIds) {
    this.transportIds = JsonNullable.<List<String>>of(transportIds);
    return this;
  }

  public TransformTaskBaseVM addTransportIdsItem(String transportIdsItem) {
    if (this.transportIds == null || !this.transportIds.isPresent()) {
      this.transportIds = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.transportIds.get().add(transportIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get transportIds
   * @return transportIds
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public List<String> getTransportIds() {
        return transportIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TRANSPORT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getTransportIds_JsonNullable() {
    return transportIds;
  }
  
  @JsonProperty(JSON_PROPERTY_TRANSPORT_IDS)
  public void setTransportIds_JsonNullable(JsonNullable<List<String>> transportIds) {
    this.transportIds = transportIds;
  }

  public void setTransportIds(List<String> transportIds) {
    this.transportIds = JsonNullable.<List<String>>of(transportIds);
  }


  public TransformTaskBaseVM $t(String $t) {
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
  public TransformTaskBaseVM cronExpression(String cronExpression) {
    this.setCronExpression(cronExpression);
    return this;
  }

  @Override
  public TransformTaskBaseVM delayedRunTime(OffsetDateTime delayedRunTime) {
    this.setDelayedRunTime(delayedRunTime);
    return this;
  }

  @Override
  public TransformTaskBaseVM delayedWasRunTime(OffsetDateTime delayedWasRunTime) {
    this.setDelayedWasRunTime(delayedWasRunTime);
    return this;
  }

  @Override
  public TransformTaskBaseVM id(String id) {
    this.setId(id);
    return this;
  }

  @Override
  public TransformTaskBaseVM name(String name) {
    this.setName(name);
    return this;
  }

  @Override
  public TransformTaskBaseVM recurrentRunTime(OffsetDateTime recurrentRunTime) {
    this.setRecurrentRunTime(recurrentRunTime);
    return this;
  }

  @Override
  public TransformTaskBaseVM recurrentWasRunTime(OffsetDateTime recurrentWasRunTime) {
    this.setRecurrentWasRunTime(recurrentWasRunTime);
    return this;
  }

  @Override
  public TransformTaskBaseVM subscriptionId(String subscriptionId) {
    this.setSubscriptionId(subscriptionId);
    return this;
  }

  /**
   * Return true if this TransformTaskBaseVM object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransformTaskBaseVM transformTaskBaseVM = (TransformTaskBaseVM) o;
    return Objects.equals(this.inputFile, transformTaskBaseVM.inputFile) &&
        equalsNullable(this.locale, transformTaskBaseVM.locale) &&
        Objects.equals(this.outputFile, transformTaskBaseVM.outputFile) &&
        equalsNullable(this.transportIds, transformTaskBaseVM.transportIds) &&
        Objects.equals(this.$t, transformTaskBaseVM.$t) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputFile, hashCodeNullable(locale), outputFile, hashCodeNullable(transportIds), $t, super.hashCode());
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
    sb.append("class TransformTaskBaseVM {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inputFile: ").append(toIndentedString(inputFile)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    outputFile: ").append(toIndentedString(outputFile)).append("\n");
    sb.append("    transportIds: ").append(toIndentedString(transportIds)).append("\n");
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

    // add `cronExpression` to the URL query string
    if (getCronExpression() != null) {
      joiner.add(String.format("%scronExpression%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCronExpression()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `delayedRunTime` to the URL query string
    if (getDelayedRunTime() != null) {
      joiner.add(String.format("%sdelayedRunTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDelayedRunTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `delayedWasRunTime` to the URL query string
    if (getDelayedWasRunTime() != null) {
      joiner.add(String.format("%sdelayedWasRunTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDelayedWasRunTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `recurrentRunTime` to the URL query string
    if (getRecurrentRunTime() != null) {
      joiner.add(String.format("%srecurrentRunTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecurrentRunTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `recurrentWasRunTime` to the URL query string
    if (getRecurrentWasRunTime() != null) {
      joiner.add(String.format("%srecurrentWasRunTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecurrentWasRunTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

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
  mappings.put("ExportReportTaskVM", ExportReportTaskVM.class);
  mappings.put("ExportTemplateTaskVM", ExportTemplateTaskVM.class);
  mappings.put("PrepareTemplateTaskVM", PrepareTemplateTaskVM.class);
  mappings.put("TransformTaskBaseVM", TransformTaskBaseVM.class);
  JSON.registerDiscriminator(TransformTaskBaseVM.class, "$t", mappings);
}
}

