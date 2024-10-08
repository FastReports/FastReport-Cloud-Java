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
import cloud.fastreport.model.CloudBaseVM;
import cloud.fastreport.model.TaskEnd;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cloud.fastreport.JSON;

/**
 * TaskBaseVM
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TaskBaseVM extends CloudBaseVM {
  public static final String SERIALIZED_NAME_CRON_EXPRESSION = "cronExpression";
  @SerializedName(SERIALIZED_NAME_CRON_EXPRESSION)
  private String cronExpression;

  public static final String SERIALIZED_NAME_STARTS_ON = "startsOn";
  @SerializedName(SERIALIZED_NAME_STARTS_ON)
  private OffsetDateTime startsOn;

  public static final String SERIALIZED_NAME_ENDS = "ends";
  @SerializedName(SERIALIZED_NAME_ENDS)
  private TaskEnd ends;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RECURRENT_RUN_TIME = "recurrentRunTime";
  @SerializedName(SERIALIZED_NAME_RECURRENT_RUN_TIME)
  private OffsetDateTime recurrentRunTime;

  public static final String SERIALIZED_NAME_RECURRENT_WAS_RUN_TIME = "recurrentWasRunTime";
  @SerializedName(SERIALIZED_NAME_RECURRENT_WAS_RUN_TIME)
  private OffsetDateTime recurrentWasRunTime;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_ID = "subscriptionId";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ID)
  private String subscriptionId;

  public static final String SERIALIZED_NAME_$_T = "$t";
  @SerializedName(SERIALIZED_NAME_$_T)
  protected String $t;

  public TaskBaseVM() {
    this.$t = this.getClass().getSimpleName();
  }

  public TaskBaseVM cronExpression(String cronExpression) {
    this.cronExpression = cronExpression;
    return this;
  }

   /**
   * Get cronExpression
   * @return cronExpression
  **/
  @javax.annotation.Nullable
  public String getCronExpression() {
    return cronExpression;
  }

  public void setCronExpression(String cronExpression) {
    this.cronExpression = cronExpression;
  }


  public TaskBaseVM startsOn(OffsetDateTime startsOn) {
    this.startsOn = startsOn;
    return this;
  }

   /**
   * Get startsOn
   * @return startsOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartsOn() {
    return startsOn;
  }

  public void setStartsOn(OffsetDateTime startsOn) {
    this.startsOn = startsOn;
  }


  public TaskBaseVM ends(TaskEnd ends) {
    this.ends = ends;
    return this;
  }

   /**
   * Get ends
   * @return ends
  **/
  @javax.annotation.Nullable
  public TaskEnd getEnds() {
    return ends;
  }

  public void setEnds(TaskEnd ends) {
    this.ends = ends;
  }


  public TaskBaseVM id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public TaskBaseVM name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public TaskBaseVM recurrentRunTime(OffsetDateTime recurrentRunTime) {
    this.recurrentRunTime = recurrentRunTime;
    return this;
  }

   /**
   * Get recurrentRunTime
   * @return recurrentRunTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getRecurrentRunTime() {
    return recurrentRunTime;
  }

  public void setRecurrentRunTime(OffsetDateTime recurrentRunTime) {
    this.recurrentRunTime = recurrentRunTime;
  }


  public TaskBaseVM recurrentWasRunTime(OffsetDateTime recurrentWasRunTime) {
    this.recurrentWasRunTime = recurrentWasRunTime;
    return this;
  }

   /**
   * Get recurrentWasRunTime
   * @return recurrentWasRunTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getRecurrentWasRunTime() {
    return recurrentWasRunTime;
  }

  public void setRecurrentWasRunTime(OffsetDateTime recurrentWasRunTime) {
    this.recurrentWasRunTime = recurrentWasRunTime;
  }


  public TaskBaseVM subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Get subscriptionId
   * @return subscriptionId
  **/
  @javax.annotation.Nullable
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  public TaskBaseVM $t(String $t) {
    this.$t = $t;
    return this;
  }

   /**
   * Get $t
   * @return $t
  **/
  @javax.annotation.Nonnull
  public String get$T() {
    return $t;
  }

  public void set$T(String $t) {
    this.$t = $t;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskBaseVM taskBaseVM = (TaskBaseVM) o;
    return Objects.equals(this.cronExpression, taskBaseVM.cronExpression) &&
        Objects.equals(this.startsOn, taskBaseVM.startsOn) &&
        Objects.equals(this.ends, taskBaseVM.ends) &&
        Objects.equals(this.id, taskBaseVM.id) &&
        Objects.equals(this.name, taskBaseVM.name) &&
        Objects.equals(this.recurrentRunTime, taskBaseVM.recurrentRunTime) &&
        Objects.equals(this.recurrentWasRunTime, taskBaseVM.recurrentWasRunTime) &&
        Objects.equals(this.subscriptionId, taskBaseVM.subscriptionId) &&
        Objects.equals(this.$t, taskBaseVM.$t) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cronExpression, startsOn, ends, id, name, recurrentRunTime, recurrentWasRunTime, subscriptionId, $t, super.hashCode());
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
    sb.append("class TaskBaseVM {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    cronExpression: ").append(toIndentedString(cronExpression)).append("\n");
    sb.append("    startsOn: ").append(toIndentedString(startsOn)).append("\n");
    sb.append("    ends: ").append(toIndentedString(ends)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recurrentRunTime: ").append(toIndentedString(recurrentRunTime)).append("\n");
    sb.append("    recurrentWasRunTime: ").append(toIndentedString(recurrentWasRunTime)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("$t");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("$t");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TaskBaseVM
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TaskBaseVM.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaskBaseVM is not found in the empty JSON string", TaskBaseVM.openapiRequiredFields.toString()));
        }
      }

      String discriminatorValue = jsonElement.getAsJsonObject().get("$t").getAsString();
      switch (discriminatorValue) {
        case "EmailTaskVM":
          EmailTaskVM.validateJsonElement(jsonElement);
          break;
        case "ExportReportTaskVM":
          ExportReportTaskVM.validateJsonElement(jsonElement);
          break;
        case "ExportTemplateTaskVM":
          ExportTemplateTaskVM.validateJsonElement(jsonElement);
          break;
        case "FTPUploadTaskVM":
          FTPUploadTaskVM.validateJsonElement(jsonElement);
          break;
        case "FetchTaskVM":
          FetchTaskVM.validateJsonElement(jsonElement);
          break;
        case "PrepareTemplateTaskVM":
          PrepareTemplateTaskVM.validateJsonElement(jsonElement);
          break;
        case "TaskBaseVM":
          TaskBaseVM.validateJsonElement(jsonElement);
          break;
        case "ThumbnailReportTaskVM":
          ThumbnailReportTaskVM.validateJsonElement(jsonElement);
          break;
        case "ThumbnailTemplateTaskVM":
          ThumbnailTemplateTaskVM.validateJsonElement(jsonElement);
          break;
        case "TransformTaskBaseVM":
          TransformTaskBaseVM.validateJsonElement(jsonElement);
          break;
        case "TransportTaskBaseVM":
          TransportTaskBaseVM.validateJsonElement(jsonElement);
          break;
        case "WebhookTaskVM":
          WebhookTaskVM.validateJsonElement(jsonElement);
          break;
        default:
          throw new IllegalArgumentException(String.format("The value of the `$t` field `%s` does not match any key defined in the discriminator's mapping.", discriminatorValue));
      }
  }


 /**
  * Create an instance of TaskBaseVM given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaskBaseVM
  * @throws IOException if the JSON string is invalid with respect to TaskBaseVM
  */
  public static TaskBaseVM fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaskBaseVM.class);
  }

 /**
  * Convert an instance of TaskBaseVM to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

