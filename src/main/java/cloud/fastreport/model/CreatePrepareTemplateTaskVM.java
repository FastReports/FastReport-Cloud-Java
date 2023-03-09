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
import cloud.fastreport.model.CreateExportReportTaskVM;
import cloud.fastreport.model.TaskType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreatePrepareTemplateTaskVM
 */
@JsonPropertyOrder({
  CreatePrepareTemplateTaskVM.JSON_PROPERTY_EXPORTS,
  CreatePrepareTemplateTaskVM.JSON_PROPERTY_PAGES_COUNT,
  CreatePrepareTemplateTaskVM.JSON_PROPERTY_REPORT_PARAMETERS,
  CreatePrepareTemplateTaskVM.JSON_PROPERTY_NAME,
  CreatePrepareTemplateTaskVM.JSON_PROPERTY_SUBSCRIPTION_ID,
  CreatePrepareTemplateTaskVM.JSON_PROPERTY_TYPE,
  CreatePrepareTemplateTaskVM.JSON_PROPERTY_DELAYED_RUN_TIME,
  CreatePrepareTemplateTaskVM.JSON_PROPERTY_CRON_EXPRESSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreatePrepareTemplateTaskVM {
  public static final String JSON_PROPERTY_EXPORTS = "exports";
  private JsonNullable<List<CreateExportReportTaskVM>> exports = JsonNullable.<List<CreateExportReportTaskVM>>undefined();

  public static final String JSON_PROPERTY_PAGES_COUNT = "pagesCount";
  private JsonNullable<Integer> pagesCount = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_REPORT_PARAMETERS = "reportParameters";
  private JsonNullable<Map<String, String>> reportParameters = JsonNullable.<Map<String, String>>undefined();

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

  public CreatePrepareTemplateTaskVM() {
  }

  public CreatePrepareTemplateTaskVM exports(List<CreateExportReportTaskVM> exports) {
    this.exports = JsonNullable.<List<CreateExportReportTaskVM>>of(exports);
    
    return this;
  }

  public CreatePrepareTemplateTaskVM addExportsItem(CreateExportReportTaskVM exportsItem) {
    if (this.exports == null || !this.exports.isPresent()) {
      this.exports = JsonNullable.<List<CreateExportReportTaskVM>>of(new ArrayList<>());
    }
    try {
      this.exports.get().add(exportsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get exports
   * @return exports
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public List<CreateExportReportTaskVM> getExports() {
        return exports.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<CreateExportReportTaskVM>> getExports_JsonNullable() {
    return exports;
  }
  
  @JsonProperty(JSON_PROPERTY_EXPORTS)
  public void setExports_JsonNullable(JsonNullable<List<CreateExportReportTaskVM>> exports) {
    this.exports = exports;
  }

  public void setExports(List<CreateExportReportTaskVM> exports) {
    this.exports = JsonNullable.<List<CreateExportReportTaskVM>>of(exports);
  }


  public CreatePrepareTemplateTaskVM pagesCount(Integer pagesCount) {
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


  public CreatePrepareTemplateTaskVM reportParameters(Map<String, String> reportParameters) {
    this.reportParameters = JsonNullable.<Map<String, String>>of(reportParameters);
    
    return this;
  }

  public CreatePrepareTemplateTaskVM putReportParametersItem(String key, String reportParametersItem) {
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


  public CreatePrepareTemplateTaskVM name(String name) {
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


  public CreatePrepareTemplateTaskVM subscriptionId(String subscriptionId) {
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


  public CreatePrepareTemplateTaskVM type(TaskType type) {
    
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


  public CreatePrepareTemplateTaskVM delayedRunTime(OffsetDateTime delayedRunTime) {
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


  public CreatePrepareTemplateTaskVM cronExpression(String cronExpression) {
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
    CreatePrepareTemplateTaskVM createPrepareTemplateTaskVM = (CreatePrepareTemplateTaskVM) o;
    return equalsNullable(this.exports, createPrepareTemplateTaskVM.exports) &&
        equalsNullable(this.pagesCount, createPrepareTemplateTaskVM.pagesCount) &&
        equalsNullable(this.reportParameters, createPrepareTemplateTaskVM.reportParameters) &&
        equalsNullable(this.name, createPrepareTemplateTaskVM.name) &&
        equalsNullable(this.subscriptionId, createPrepareTemplateTaskVM.subscriptionId) &&
        Objects.equals(this.type, createPrepareTemplateTaskVM.type) &&
        equalsNullable(this.delayedRunTime, createPrepareTemplateTaskVM.delayedRunTime) &&
        equalsNullable(this.cronExpression, createPrepareTemplateTaskVM.cronExpression);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(exports), hashCodeNullable(pagesCount), hashCodeNullable(reportParameters), hashCodeNullable(name), hashCodeNullable(subscriptionId), type, hashCodeNullable(delayedRunTime), hashCodeNullable(cronExpression));
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
    sb.append("class CreatePrepareTemplateTaskVM {\n");
    sb.append("    exports: ").append(toIndentedString(exports)).append("\n");
    sb.append("    pagesCount: ").append(toIndentedString(pagesCount)).append("\n");
    sb.append("    reportParameters: ").append(toIndentedString(reportParameters)).append("\n");
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

