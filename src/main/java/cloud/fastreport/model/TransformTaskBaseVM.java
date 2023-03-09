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
import cloud.fastreport.model.InputFileVM;
import cloud.fastreport.model.OutputFileVM;
import cloud.fastreport.model.TaskType;
import cloud.fastreport.model.TransportTaskBaseVM;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TransformTaskBaseVM
 */
@JsonPropertyOrder({
  TransformTaskBaseVM.JSON_PROPERTY_LOCALE,
  TransformTaskBaseVM.JSON_PROPERTY_INPUT_FILE,
  TransformTaskBaseVM.JSON_PROPERTY_OUTPUT_FILE,
  TransformTaskBaseVM.JSON_PROPERTY_TRANSPORTS,
  TransformTaskBaseVM.JSON_PROPERTY_NAME,
  TransformTaskBaseVM.JSON_PROPERTY_SUBSCRIPTION_ID,
  TransformTaskBaseVM.JSON_PROPERTY_TYPE,
  TransformTaskBaseVM.JSON_PROPERTY_DELAYED_RUN_TIME,
  TransformTaskBaseVM.JSON_PROPERTY_CRON_EXPRESSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransformTaskBaseVM {
  public static final String JSON_PROPERTY_LOCALE = "locale";
  private JsonNullable<String> locale = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INPUT_FILE = "inputFile";
  private InputFileVM inputFile;

  public static final String JSON_PROPERTY_OUTPUT_FILE = "outputFile";
  private OutputFileVM outputFile;

  public static final String JSON_PROPERTY_TRANSPORTS = "transports";
  private JsonNullable<List<TransportTaskBaseVM>> transports = JsonNullable.<List<TransportTaskBaseVM>>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscriptionId";
  private JsonNullable<String> subscriptionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private TaskType type;

  public static final String JSON_PROPERTY_DELAYED_RUN_TIME = "delayedRunTime";
  private JsonNullable<OffsetDateTime> delayedRunTime = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CRON_EXPRESSION = "cronExpression";
  private JsonNullable<String> cronExpression = JsonNullable.<String>undefined();

  public TransformTaskBaseVM() {
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


  public TransformTaskBaseVM transports(List<TransportTaskBaseVM> transports) {
    this.transports = JsonNullable.<List<TransportTaskBaseVM>>of(transports);
    
    return this;
  }

  public TransformTaskBaseVM addTransportsItem(TransportTaskBaseVM transportsItem) {
    if (this.transports == null || !this.transports.isPresent()) {
      this.transports = JsonNullable.<List<TransportTaskBaseVM>>of(new ArrayList<>());
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

  public List<TransportTaskBaseVM> getTransports() {
        return transports.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TRANSPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<TransportTaskBaseVM>> getTransports_JsonNullable() {
    return transports;
  }
  
  @JsonProperty(JSON_PROPERTY_TRANSPORTS)
  public void setTransports_JsonNullable(JsonNullable<List<TransportTaskBaseVM>> transports) {
    this.transports = transports;
  }

  public void setTransports(List<TransportTaskBaseVM> transports) {
    this.transports = JsonNullable.<List<TransportTaskBaseVM>>of(transports);
  }


  public TransformTaskBaseVM name(String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public TransformTaskBaseVM subscriptionId(String subscriptionId) {
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


  public TransformTaskBaseVM type(TaskType type) {
    
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


  public TransformTaskBaseVM delayedRunTime(OffsetDateTime delayedRunTime) {
    this.delayedRunTime = JsonNullable.<OffsetDateTime>of(delayedRunTime);
    
    return this;
  }

   /**
   * Get delayedRunTime
   * @return delayedRunTime
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getDelayedRunTime() {
        return delayedRunTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DELAYED_RUN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getDelayedRunTime_JsonNullable() {
    return delayedRunTime;
  }
  
  @JsonProperty(JSON_PROPERTY_DELAYED_RUN_TIME)
  public void setDelayedRunTime_JsonNullable(JsonNullable<OffsetDateTime> delayedRunTime) {
    this.delayedRunTime = delayedRunTime;
  }

  public void setDelayedRunTime(OffsetDateTime delayedRunTime) {
    this.delayedRunTime = JsonNullable.<OffsetDateTime>of(delayedRunTime);
  }


  public TransformTaskBaseVM cronExpression(String cronExpression) {
    this.cronExpression = JsonNullable.<String>of(cronExpression);
    
    return this;
  }

   /**
   * Get cronExpression
   * @return cronExpression
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCronExpression() {
        return cronExpression.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CRON_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCronExpression_JsonNullable() {
    return cronExpression;
  }
  
  @JsonProperty(JSON_PROPERTY_CRON_EXPRESSION)
  public void setCronExpression_JsonNullable(JsonNullable<String> cronExpression) {
    this.cronExpression = cronExpression;
  }

  public void setCronExpression(String cronExpression) {
    this.cronExpression = JsonNullable.<String>of(cronExpression);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransformTaskBaseVM transformTaskBaseVM = (TransformTaskBaseVM) o;
    return equalsNullable(this.locale, transformTaskBaseVM.locale) &&
        Objects.equals(this.inputFile, transformTaskBaseVM.inputFile) &&
        Objects.equals(this.outputFile, transformTaskBaseVM.outputFile) &&
        equalsNullable(this.transports, transformTaskBaseVM.transports) &&
        equalsNullable(this.name, transformTaskBaseVM.name) &&
        equalsNullable(this.subscriptionId, transformTaskBaseVM.subscriptionId) &&
        Objects.equals(this.type, transformTaskBaseVM.type) &&
        equalsNullable(this.delayedRunTime, transformTaskBaseVM.delayedRunTime) &&
        equalsNullable(this.cronExpression, transformTaskBaseVM.cronExpression);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(locale), inputFile, outputFile, hashCodeNullable(transports), hashCodeNullable(name), hashCodeNullable(subscriptionId), type, hashCodeNullable(delayedRunTime), hashCodeNullable(cronExpression));
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
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    inputFile: ").append(toIndentedString(inputFile)).append("\n");
    sb.append("    outputFile: ").append(toIndentedString(outputFile)).append("\n");
    sb.append("    transports: ").append(toIndentedString(transports)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    delayedRunTime: ").append(toIndentedString(delayedRunTime)).append("\n");
    sb.append("    cronExpression: ").append(toIndentedString(cronExpression)).append("\n");
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

