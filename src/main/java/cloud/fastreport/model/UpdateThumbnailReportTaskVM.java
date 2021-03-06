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
import cloud.fastreport.model.TaskType;
import cloud.fastreport.model.UpdateTransformTaskBaseVM;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * UpdateThumbnailReportTaskVM
 */
@JsonPropertyOrder({
  UpdateThumbnailReportTaskVM.JSON_PROPERTY_NAME,
  UpdateThumbnailReportTaskVM.JSON_PROPERTY_SUBSCRIPTION_ID,
  UpdateThumbnailReportTaskVM.JSON_PROPERTY_TYPE,
  UpdateThumbnailReportTaskVM.JSON_PROPERTY_DELAYED_RUN_TIME,
  UpdateThumbnailReportTaskVM.JSON_PROPERTY_CRON_EXPRESSION
})
@JsonTypeName("UpdateThumbnailReportTaskVM")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateThumbnailReportTaskVM {
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


  public UpdateThumbnailReportTaskVM name(String name) {
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


  public UpdateThumbnailReportTaskVM subscriptionId(String subscriptionId) {
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


  public UpdateThumbnailReportTaskVM type(TaskType type) {
    
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


  public UpdateThumbnailReportTaskVM delayedRunTime(OffsetDateTime delayedRunTime) {
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


  public UpdateThumbnailReportTaskVM cronExpression(String cronExpression) {
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
    UpdateThumbnailReportTaskVM updateThumbnailReportTaskVM = (UpdateThumbnailReportTaskVM) o;
    return Objects.equals(this.name, updateThumbnailReportTaskVM.name) &&
        Objects.equals(this.subscriptionId, updateThumbnailReportTaskVM.subscriptionId) &&
        Objects.equals(this.type, updateThumbnailReportTaskVM.type) &&
        Objects.equals(this.delayedRunTime, updateThumbnailReportTaskVM.delayedRunTime) &&
        Objects.equals(this.cronExpression, updateThumbnailReportTaskVM.cronExpression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, subscriptionId, type, delayedRunTime, cronExpression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateThumbnailReportTaskVM {\n");
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

