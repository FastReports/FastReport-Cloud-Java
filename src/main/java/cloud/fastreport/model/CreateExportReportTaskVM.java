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
import cloud.fastreport.model.TaskType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * CreateExportReportTaskVM
 */
@JsonPropertyOrder({
  CreateExportReportTaskVM.JSON_PROPERTY_EXPORT_PARAMETERS,
  CreateExportReportTaskVM.JSON_PROPERTY_FORMAT,
  CreateExportReportTaskVM.JSON_PROPERTY_PAGES_COUNT,
  CreateExportReportTaskVM.JSON_PROPERTY_NAME,
  CreateExportReportTaskVM.JSON_PROPERTY_SUBSCRIPTION_ID,
  CreateExportReportTaskVM.JSON_PROPERTY_TYPE,
  CreateExportReportTaskVM.JSON_PROPERTY_DELAYED_RUN_TIME,
  CreateExportReportTaskVM.JSON_PROPERTY_CRON_EXPRESSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateExportReportTaskVM {
  public static final String JSON_PROPERTY_EXPORT_PARAMETERS = "exportParameters";
  private JsonNullable<Map<String, String>> exportParameters = JsonNullable.<Map<String, String>>undefined();

  public static final String JSON_PROPERTY_FORMAT = "format";
  private ExportFormat format;

  public static final String JSON_PROPERTY_PAGES_COUNT = "pagesCount";
  private JsonNullable<Integer> pagesCount = JsonNullable.<Integer>undefined();

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

  public CreateExportReportTaskVM() {
  }

  public CreateExportReportTaskVM exportParameters(Map<String, String> exportParameters) {
    this.exportParameters = JsonNullable.<Map<String, String>>of(exportParameters);
    
    return this;
  }

  public CreateExportReportTaskVM putExportParametersItem(String key, String exportParametersItem) {
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


  public CreateExportReportTaskVM format(ExportFormat format) {
    
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


  public CreateExportReportTaskVM pagesCount(Integer pagesCount) {
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


  public CreateExportReportTaskVM name(String name) {
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


  public CreateExportReportTaskVM subscriptionId(String subscriptionId) {
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


  public CreateExportReportTaskVM type(TaskType type) {
    
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


  public CreateExportReportTaskVM delayedRunTime(OffsetDateTime delayedRunTime) {
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


  public CreateExportReportTaskVM cronExpression(String cronExpression) {
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
    CreateExportReportTaskVM createExportReportTaskVM = (CreateExportReportTaskVM) o;
    return equalsNullable(this.exportParameters, createExportReportTaskVM.exportParameters) &&
        Objects.equals(this.format, createExportReportTaskVM.format) &&
        equalsNullable(this.pagesCount, createExportReportTaskVM.pagesCount) &&
        equalsNullable(this.name, createExportReportTaskVM.name) &&
        equalsNullable(this.subscriptionId, createExportReportTaskVM.subscriptionId) &&
        Objects.equals(this.type, createExportReportTaskVM.type) &&
        equalsNullable(this.delayedRunTime, createExportReportTaskVM.delayedRunTime) &&
        equalsNullable(this.cronExpression, createExportReportTaskVM.cronExpression);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(exportParameters), format, hashCodeNullable(pagesCount), hashCodeNullable(name), hashCodeNullable(subscriptionId), type, hashCodeNullable(delayedRunTime), hashCodeNullable(cronExpression));
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
    sb.append("class CreateExportReportTaskVM {\n");
    sb.append("    exportParameters: ").append(toIndentedString(exportParameters)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    pagesCount: ").append(toIndentedString(pagesCount)).append("\n");
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

