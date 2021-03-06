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
import cloud.fastreport.model.CreateTaskBaseVM;
import cloud.fastreport.model.CreateTransportTaskBaseVM;
import cloud.fastreport.model.InputFileVM;
import cloud.fastreport.model.OutputFileVM;
import cloud.fastreport.model.TaskType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CreateTransformTaskBaseVM
 */
@JsonPropertyOrder({
  CreateTransformTaskBaseVM.JSON_PROPERTY_LOCALE,
  CreateTransformTaskBaseVM.JSON_PROPERTY_INPUT_FILE,
  CreateTransformTaskBaseVM.JSON_PROPERTY_OUTPUT_FILE,
  CreateTransformTaskBaseVM.JSON_PROPERTY_TRANSPORTS,
  CreateTransformTaskBaseVM.JSON_PROPERTY_NAME,
  CreateTransformTaskBaseVM.JSON_PROPERTY_SUBSCRIPTION_ID,
  CreateTransformTaskBaseVM.JSON_PROPERTY_TYPE,
  CreateTransformTaskBaseVM.JSON_PROPERTY_DELAYED_RUN_TIME,
  CreateTransformTaskBaseVM.JSON_PROPERTY_CRON_EXPRESSION
})
@JsonTypeName("CreateTransformTaskBaseVM")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateTransformTaskBaseVM {
  public static final String JSON_PROPERTY_LOCALE = "locale";
  private JsonNullable<String> locale = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INPUT_FILE = "inputFile";
  private InputFileVM inputFile;

  public static final String JSON_PROPERTY_OUTPUT_FILE = "outputFile";
  private OutputFileVM outputFile;

  public static final String JSON_PROPERTY_TRANSPORTS = "transports";
  private JsonNullable<List<CreateTransportTaskBaseVM>> transports = JsonNullable.<List<CreateTransportTaskBaseVM>>undefined();

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


  public CreateTransformTaskBaseVM locale(String locale) {
    this.locale = JsonNullable.<String>of(locale);
    
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public CreateTransformTaskBaseVM inputFile(InputFileVM inputFile) {
    
    this.inputFile = inputFile;
    return this;
  }

   /**
   * Get inputFile
   * @return inputFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public CreateTransformTaskBaseVM outputFile(OutputFileVM outputFile) {
    
    this.outputFile = outputFile;
    return this;
  }

   /**
   * Get outputFile
   * @return outputFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public CreateTransformTaskBaseVM transports(List<CreateTransportTaskBaseVM> transports) {
    this.transports = JsonNullable.<List<CreateTransportTaskBaseVM>>of(transports);
    
    return this;
  }

  public CreateTransformTaskBaseVM addTransportsItem(CreateTransportTaskBaseVM transportsItem) {
    if (this.transports == null || !this.transports.isPresent()) {
      this.transports = JsonNullable.<List<CreateTransportTaskBaseVM>>of(new ArrayList<>());
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
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<CreateTransportTaskBaseVM> getTransports() {
        return transports.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TRANSPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<CreateTransportTaskBaseVM>> getTransports_JsonNullable() {
    return transports;
  }
  
  @JsonProperty(JSON_PROPERTY_TRANSPORTS)
  public void setTransports_JsonNullable(JsonNullable<List<CreateTransportTaskBaseVM>> transports) {
    this.transports = transports;
  }

  public void setTransports(List<CreateTransportTaskBaseVM> transports) {
    this.transports = JsonNullable.<List<CreateTransportTaskBaseVM>>of(transports);
  }


  public CreateTransformTaskBaseVM name(String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public CreateTransformTaskBaseVM subscriptionId(String subscriptionId) {
    this.subscriptionId = JsonNullable.<String>of(subscriptionId);
    
    return this;
  }

   /**
   * Get subscriptionId
   * @return subscriptionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public CreateTransformTaskBaseVM type(TaskType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public CreateTransformTaskBaseVM delayedRunTime(OffsetDateTime delayedRunTime) {
    this.delayedRunTime = JsonNullable.<OffsetDateTime>of(delayedRunTime);
    
    return this;
  }

   /**
   * Get delayedRunTime
   * @return delayedRunTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public CreateTransformTaskBaseVM cronExpression(String cronExpression) {
    this.cronExpression = JsonNullable.<String>of(cronExpression);
    
    return this;
  }

   /**
   * Get cronExpression
   * @return cronExpression
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
    CreateTransformTaskBaseVM createTransformTaskBaseVM = (CreateTransformTaskBaseVM) o;
    return Objects.equals(this.locale, createTransformTaskBaseVM.locale) &&
        Objects.equals(this.inputFile, createTransformTaskBaseVM.inputFile) &&
        Objects.equals(this.outputFile, createTransformTaskBaseVM.outputFile) &&
        Objects.equals(this.transports, createTransformTaskBaseVM.transports) &&
        Objects.equals(this.name, createTransformTaskBaseVM.name) &&
        Objects.equals(this.subscriptionId, createTransformTaskBaseVM.subscriptionId) &&
        Objects.equals(this.type, createTransformTaskBaseVM.type) &&
        Objects.equals(this.delayedRunTime, createTransformTaskBaseVM.delayedRunTime) &&
        Objects.equals(this.cronExpression, createTransformTaskBaseVM.cronExpression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locale, inputFile, outputFile, transports, name, subscriptionId, type, delayedRunTime, cronExpression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTransformTaskBaseVM {\n");
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

