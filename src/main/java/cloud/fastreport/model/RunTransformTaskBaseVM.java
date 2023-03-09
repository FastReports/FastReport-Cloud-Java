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
import cloud.fastreport.model.OutputFileVM;
import cloud.fastreport.model.RunInputFileVM;
import cloud.fastreport.model.RunTransportTaskBaseVM;
import cloud.fastreport.model.TaskType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RunTransformTaskBaseVM
 */
@JsonPropertyOrder({
  RunTransformTaskBaseVM.JSON_PROPERTY_LOCALE,
  RunTransformTaskBaseVM.JSON_PROPERTY_INPUT_FILE,
  RunTransformTaskBaseVM.JSON_PROPERTY_OUTPUT_FILE,
  RunTransformTaskBaseVM.JSON_PROPERTY_TRANSPORTS,
  RunTransformTaskBaseVM.JSON_PROPERTY_SUBSCRIPTION_ID,
  RunTransformTaskBaseVM.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RunTransformTaskBaseVM {
  public static final String JSON_PROPERTY_LOCALE = "locale";
  private JsonNullable<String> locale = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INPUT_FILE = "inputFile";
  private RunInputFileVM inputFile;

  public static final String JSON_PROPERTY_OUTPUT_FILE = "outputFile";
  private OutputFileVM outputFile;

  public static final String JSON_PROPERTY_TRANSPORTS = "transports";
  private JsonNullable<List<RunTransportTaskBaseVM>> transports = JsonNullable.<List<RunTransportTaskBaseVM>>undefined();

  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscriptionId";
  private JsonNullable<String> subscriptionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private TaskType type;

  public RunTransformTaskBaseVM() {
  }

  public RunTransformTaskBaseVM locale(String locale) {
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


  public RunTransformTaskBaseVM inputFile(RunInputFileVM inputFile) {
    
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

  public RunInputFileVM getInputFile() {
    return inputFile;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputFile(RunInputFileVM inputFile) {
    this.inputFile = inputFile;
  }


  public RunTransformTaskBaseVM outputFile(OutputFileVM outputFile) {
    
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


  public RunTransformTaskBaseVM transports(List<RunTransportTaskBaseVM> transports) {
    this.transports = JsonNullable.<List<RunTransportTaskBaseVM>>of(transports);
    
    return this;
  }

  public RunTransformTaskBaseVM addTransportsItem(RunTransportTaskBaseVM transportsItem) {
    if (this.transports == null || !this.transports.isPresent()) {
      this.transports = JsonNullable.<List<RunTransportTaskBaseVM>>of(new ArrayList<>());
    }
    try {
      this.transports.get().add(transportsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get transports
   * @return transports
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public List<RunTransportTaskBaseVM> getTransports() {
        return transports.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TRANSPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<RunTransportTaskBaseVM>> getTransports_JsonNullable() {
    return transports;
  }
  
  @JsonProperty(JSON_PROPERTY_TRANSPORTS)
  public void setTransports_JsonNullable(JsonNullable<List<RunTransportTaskBaseVM>> transports) {
    this.transports = transports;
  }

  public void setTransports(List<RunTransportTaskBaseVM> transports) {
    this.transports = JsonNullable.<List<RunTransportTaskBaseVM>>of(transports);
  }


  public RunTransformTaskBaseVM subscriptionId(String subscriptionId) {
    this.subscriptionId = JsonNullable.<String>of(subscriptionId);
    
    return this;
  }

   /**
   * Get subscriptionId
   * @return subscriptionId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getSubscriptionId() {
        return subscriptionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSubscriptionId_JsonNullable() {
    return subscriptionId;
  }
  
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  public void setSubscriptionId_JsonNullable(JsonNullable<String> subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = JsonNullable.<String>of(subscriptionId);
  }


  public RunTransformTaskBaseVM type(TaskType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TaskType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TaskType type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunTransformTaskBaseVM runTransformTaskBaseVM = (RunTransformTaskBaseVM) o;
    return equalsNullable(this.locale, runTransformTaskBaseVM.locale) &&
        Objects.equals(this.inputFile, runTransformTaskBaseVM.inputFile) &&
        Objects.equals(this.outputFile, runTransformTaskBaseVM.outputFile) &&
        equalsNullable(this.transports, runTransformTaskBaseVM.transports) &&
        equalsNullable(this.subscriptionId, runTransformTaskBaseVM.subscriptionId) &&
        Objects.equals(this.type, runTransformTaskBaseVM.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(locale), inputFile, outputFile, hashCodeNullable(transports), hashCodeNullable(subscriptionId), type);
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
    sb.append("class RunTransformTaskBaseVM {\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    inputFile: ").append(toIndentedString(inputFile)).append("\n");
    sb.append("    outputFile: ").append(toIndentedString(outputFile)).append("\n");
    sb.append("    transports: ").append(toIndentedString(transports)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

