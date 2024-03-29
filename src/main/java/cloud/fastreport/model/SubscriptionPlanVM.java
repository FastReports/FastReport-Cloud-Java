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
import cloud.fastreport.model.TaskSettingsVM;
import cloud.fastreport.model.TimePeriodType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * SubscriptionPlanVM
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubscriptionPlanVM extends CloudBaseVM {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_TIME_PERIOD_TYPE = "timePeriodType";
  @SerializedName(SERIALIZED_NAME_TIME_PERIOD_TYPE)
  private TimePeriodType timePeriodType;

  public static final String SERIALIZED_NAME_TIME_PERIOD = "timePeriod";
  @SerializedName(SERIALIZED_NAME_TIME_PERIOD)
  private Integer timePeriod;

  public static final String SERIALIZED_NAME_READONLY_TIME_LIMIT_TYPE = "readonlyTimeLimitType";
  @SerializedName(SERIALIZED_NAME_READONLY_TIME_LIMIT_TYPE)
  private TimePeriodType readonlyTimeLimitType;

  public static final String SERIALIZED_NAME_READONLY_TIME_LIMIT = "readonlyTimeLimit";
  @SerializedName(SERIALIZED_NAME_READONLY_TIME_LIMIT)
  private Integer readonlyTimeLimit;

  public static final String SERIALIZED_NAME_TEMPLATES_SPACE_LIMIT = "templatesSpaceLimit";
  @SerializedName(SERIALIZED_NAME_TEMPLATES_SPACE_LIMIT)
  private Long templatesSpaceLimit;

  public static final String SERIALIZED_NAME_REPORTS_SPACE_LIMIT = "reportsSpaceLimit";
  @SerializedName(SERIALIZED_NAME_REPORTS_SPACE_LIMIT)
  private Long reportsSpaceLimit;

  public static final String SERIALIZED_NAME_EXPORTS_SPACE_LIMIT = "exportsSpaceLimit";
  @SerializedName(SERIALIZED_NAME_EXPORTS_SPACE_LIMIT)
  private Long exportsSpaceLimit;

  public static final String SERIALIZED_NAME_FILE_UPLOAD_SIZE_LIMIT = "fileUploadSizeLimit";
  @SerializedName(SERIALIZED_NAME_FILE_UPLOAD_SIZE_LIMIT)
  private Long fileUploadSizeLimit;

  public static final String SERIALIZED_NAME_DATA_SOURCE_LIMIT = "dataSourceLimit";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_LIMIT)
  private Integer dataSourceLimit;

  public static final String SERIALIZED_NAME_MAX_USERS_COUNT = "maxUsersCount";
  @SerializedName(SERIALIZED_NAME_MAX_USERS_COUNT)
  private Integer maxUsersCount;

  public static final String SERIALIZED_NAME_GROUP_LIMIT = "groupLimit";
  @SerializedName(SERIALIZED_NAME_GROUP_LIMIT)
  private Integer groupLimit;

  public static final String SERIALIZED_NAME_ONLINE_DESIGNER = "onlineDesigner";
  @SerializedName(SERIALIZED_NAME_ONLINE_DESIGNER)
  private Boolean onlineDesigner;

  public static final String SERIALIZED_NAME_IS_DEMO = "isDemo";
  @SerializedName(SERIALIZED_NAME_IS_DEMO)
  private Boolean isDemo;

  public static final String SERIALIZED_NAME_URL_TO_BUY = "urlToBuy";
  @SerializedName(SERIALIZED_NAME_URL_TO_BUY)
  private String urlToBuy;

  public static final String SERIALIZED_NAME_UNLIMITED_PAGE = "unlimitedPage";
  @SerializedName(SERIALIZED_NAME_UNLIMITED_PAGE)
  private Boolean unlimitedPage;

  public static final String SERIALIZED_NAME_PAGE_LIMIT = "pageLimit";
  @SerializedName(SERIALIZED_NAME_PAGE_LIMIT)
  private Integer pageLimit;

  public static final String SERIALIZED_NAME_TASKS = "tasks";
  @SerializedName(SERIALIZED_NAME_TASKS)
  private TaskSettingsVM tasks;

  public static final String SERIALIZED_NAME_$_T = "$t";
  @SerializedName(SERIALIZED_NAME_$_T)
  protected String $t;

  public SubscriptionPlanVM() {
    this.$t = this.getClass().getSimpleName();
  }

  public SubscriptionPlanVM id(String id) {
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


  public SubscriptionPlanVM isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nullable
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public SubscriptionPlanVM displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public SubscriptionPlanVM timePeriodType(TimePeriodType timePeriodType) {
    this.timePeriodType = timePeriodType;
    return this;
  }

   /**
   * Get timePeriodType
   * @return timePeriodType
  **/
  @javax.annotation.Nullable
  public TimePeriodType getTimePeriodType() {
    return timePeriodType;
  }

  public void setTimePeriodType(TimePeriodType timePeriodType) {
    this.timePeriodType = timePeriodType;
  }


  public SubscriptionPlanVM timePeriod(Integer timePeriod) {
    this.timePeriod = timePeriod;
    return this;
  }

   /**
   * Get timePeriod
   * @return timePeriod
  **/
  @javax.annotation.Nullable
  public Integer getTimePeriod() {
    return timePeriod;
  }

  public void setTimePeriod(Integer timePeriod) {
    this.timePeriod = timePeriod;
  }


  public SubscriptionPlanVM readonlyTimeLimitType(TimePeriodType readonlyTimeLimitType) {
    this.readonlyTimeLimitType = readonlyTimeLimitType;
    return this;
  }

   /**
   * Get readonlyTimeLimitType
   * @return readonlyTimeLimitType
  **/
  @javax.annotation.Nullable
  public TimePeriodType getReadonlyTimeLimitType() {
    return readonlyTimeLimitType;
  }

  public void setReadonlyTimeLimitType(TimePeriodType readonlyTimeLimitType) {
    this.readonlyTimeLimitType = readonlyTimeLimitType;
  }


  public SubscriptionPlanVM readonlyTimeLimit(Integer readonlyTimeLimit) {
    this.readonlyTimeLimit = readonlyTimeLimit;
    return this;
  }

   /**
   * Get readonlyTimeLimit
   * @return readonlyTimeLimit
  **/
  @javax.annotation.Nullable
  public Integer getReadonlyTimeLimit() {
    return readonlyTimeLimit;
  }

  public void setReadonlyTimeLimit(Integer readonlyTimeLimit) {
    this.readonlyTimeLimit = readonlyTimeLimit;
  }


  public SubscriptionPlanVM templatesSpaceLimit(Long templatesSpaceLimit) {
    this.templatesSpaceLimit = templatesSpaceLimit;
    return this;
  }

   /**
   * Get templatesSpaceLimit
   * @return templatesSpaceLimit
  **/
  @javax.annotation.Nullable
  public Long getTemplatesSpaceLimit() {
    return templatesSpaceLimit;
  }

  public void setTemplatesSpaceLimit(Long templatesSpaceLimit) {
    this.templatesSpaceLimit = templatesSpaceLimit;
  }


  public SubscriptionPlanVM reportsSpaceLimit(Long reportsSpaceLimit) {
    this.reportsSpaceLimit = reportsSpaceLimit;
    return this;
  }

   /**
   * Get reportsSpaceLimit
   * @return reportsSpaceLimit
  **/
  @javax.annotation.Nullable
  public Long getReportsSpaceLimit() {
    return reportsSpaceLimit;
  }

  public void setReportsSpaceLimit(Long reportsSpaceLimit) {
    this.reportsSpaceLimit = reportsSpaceLimit;
  }


  public SubscriptionPlanVM exportsSpaceLimit(Long exportsSpaceLimit) {
    this.exportsSpaceLimit = exportsSpaceLimit;
    return this;
  }

   /**
   * Get exportsSpaceLimit
   * @return exportsSpaceLimit
  **/
  @javax.annotation.Nullable
  public Long getExportsSpaceLimit() {
    return exportsSpaceLimit;
  }

  public void setExportsSpaceLimit(Long exportsSpaceLimit) {
    this.exportsSpaceLimit = exportsSpaceLimit;
  }


  public SubscriptionPlanVM fileUploadSizeLimit(Long fileUploadSizeLimit) {
    this.fileUploadSizeLimit = fileUploadSizeLimit;
    return this;
  }

   /**
   * Get fileUploadSizeLimit
   * @return fileUploadSizeLimit
  **/
  @javax.annotation.Nullable
  public Long getFileUploadSizeLimit() {
    return fileUploadSizeLimit;
  }

  public void setFileUploadSizeLimit(Long fileUploadSizeLimit) {
    this.fileUploadSizeLimit = fileUploadSizeLimit;
  }


  public SubscriptionPlanVM dataSourceLimit(Integer dataSourceLimit) {
    this.dataSourceLimit = dataSourceLimit;
    return this;
  }

   /**
   * Get dataSourceLimit
   * @return dataSourceLimit
  **/
  @javax.annotation.Nullable
  public Integer getDataSourceLimit() {
    return dataSourceLimit;
  }

  public void setDataSourceLimit(Integer dataSourceLimit) {
    this.dataSourceLimit = dataSourceLimit;
  }


  public SubscriptionPlanVM maxUsersCount(Integer maxUsersCount) {
    this.maxUsersCount = maxUsersCount;
    return this;
  }

   /**
   * Get maxUsersCount
   * @return maxUsersCount
  **/
  @javax.annotation.Nullable
  public Integer getMaxUsersCount() {
    return maxUsersCount;
  }

  public void setMaxUsersCount(Integer maxUsersCount) {
    this.maxUsersCount = maxUsersCount;
  }


  public SubscriptionPlanVM groupLimit(Integer groupLimit) {
    this.groupLimit = groupLimit;
    return this;
  }

   /**
   * Get groupLimit
   * @return groupLimit
  **/
  @javax.annotation.Nullable
  public Integer getGroupLimit() {
    return groupLimit;
  }

  public void setGroupLimit(Integer groupLimit) {
    this.groupLimit = groupLimit;
  }


  public SubscriptionPlanVM onlineDesigner(Boolean onlineDesigner) {
    this.onlineDesigner = onlineDesigner;
    return this;
  }

   /**
   * Get onlineDesigner
   * @return onlineDesigner
  **/
  @javax.annotation.Nullable
  public Boolean getOnlineDesigner() {
    return onlineDesigner;
  }

  public void setOnlineDesigner(Boolean onlineDesigner) {
    this.onlineDesigner = onlineDesigner;
  }


  public SubscriptionPlanVM isDemo(Boolean isDemo) {
    this.isDemo = isDemo;
    return this;
  }

   /**
   * Get isDemo
   * @return isDemo
  **/
  @javax.annotation.Nullable
  public Boolean getIsDemo() {
    return isDemo;
  }

  public void setIsDemo(Boolean isDemo) {
    this.isDemo = isDemo;
  }


  public SubscriptionPlanVM urlToBuy(String urlToBuy) {
    this.urlToBuy = urlToBuy;
    return this;
  }

   /**
   * Get urlToBuy
   * @return urlToBuy
  **/
  @javax.annotation.Nullable
  public String getUrlToBuy() {
    return urlToBuy;
  }

  public void setUrlToBuy(String urlToBuy) {
    this.urlToBuy = urlToBuy;
  }


  public SubscriptionPlanVM unlimitedPage(Boolean unlimitedPage) {
    this.unlimitedPage = unlimitedPage;
    return this;
  }

   /**
   * Get unlimitedPage
   * @return unlimitedPage
  **/
  @javax.annotation.Nullable
  public Boolean getUnlimitedPage() {
    return unlimitedPage;
  }

  public void setUnlimitedPage(Boolean unlimitedPage) {
    this.unlimitedPage = unlimitedPage;
  }


  public SubscriptionPlanVM pageLimit(Integer pageLimit) {
    this.pageLimit = pageLimit;
    return this;
  }

   /**
   * Get pageLimit
   * @return pageLimit
  **/
  @javax.annotation.Nullable
  public Integer getPageLimit() {
    return pageLimit;
  }

  public void setPageLimit(Integer pageLimit) {
    this.pageLimit = pageLimit;
  }


  public SubscriptionPlanVM tasks(TaskSettingsVM tasks) {
    this.tasks = tasks;
    return this;
  }

   /**
   * Get tasks
   * @return tasks
  **/
  @javax.annotation.Nullable
  public TaskSettingsVM getTasks() {
    return tasks;
  }

  public void setTasks(TaskSettingsVM tasks) {
    this.tasks = tasks;
  }


  public SubscriptionPlanVM $t(String $t) {
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
    SubscriptionPlanVM subscriptionPlanVM = (SubscriptionPlanVM) o;
    return Objects.equals(this.id, subscriptionPlanVM.id) &&
        Objects.equals(this.isActive, subscriptionPlanVM.isActive) &&
        Objects.equals(this.displayName, subscriptionPlanVM.displayName) &&
        Objects.equals(this.timePeriodType, subscriptionPlanVM.timePeriodType) &&
        Objects.equals(this.timePeriod, subscriptionPlanVM.timePeriod) &&
        Objects.equals(this.readonlyTimeLimitType, subscriptionPlanVM.readonlyTimeLimitType) &&
        Objects.equals(this.readonlyTimeLimit, subscriptionPlanVM.readonlyTimeLimit) &&
        Objects.equals(this.templatesSpaceLimit, subscriptionPlanVM.templatesSpaceLimit) &&
        Objects.equals(this.reportsSpaceLimit, subscriptionPlanVM.reportsSpaceLimit) &&
        Objects.equals(this.exportsSpaceLimit, subscriptionPlanVM.exportsSpaceLimit) &&
        Objects.equals(this.fileUploadSizeLimit, subscriptionPlanVM.fileUploadSizeLimit) &&
        Objects.equals(this.dataSourceLimit, subscriptionPlanVM.dataSourceLimit) &&
        Objects.equals(this.maxUsersCount, subscriptionPlanVM.maxUsersCount) &&
        Objects.equals(this.groupLimit, subscriptionPlanVM.groupLimit) &&
        Objects.equals(this.onlineDesigner, subscriptionPlanVM.onlineDesigner) &&
        Objects.equals(this.isDemo, subscriptionPlanVM.isDemo) &&
        Objects.equals(this.urlToBuy, subscriptionPlanVM.urlToBuy) &&
        Objects.equals(this.unlimitedPage, subscriptionPlanVM.unlimitedPage) &&
        Objects.equals(this.pageLimit, subscriptionPlanVM.pageLimit) &&
        Objects.equals(this.tasks, subscriptionPlanVM.tasks) &&
        Objects.equals(this.$t, subscriptionPlanVM.$t) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isActive, displayName, timePeriodType, timePeriod, readonlyTimeLimitType, readonlyTimeLimit, templatesSpaceLimit, reportsSpaceLimit, exportsSpaceLimit, fileUploadSizeLimit, dataSourceLimit, maxUsersCount, groupLimit, onlineDesigner, isDemo, urlToBuy, unlimitedPage, pageLimit, tasks, $t, super.hashCode());
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
    sb.append("class SubscriptionPlanVM {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    timePeriodType: ").append(toIndentedString(timePeriodType)).append("\n");
    sb.append("    timePeriod: ").append(toIndentedString(timePeriod)).append("\n");
    sb.append("    readonlyTimeLimitType: ").append(toIndentedString(readonlyTimeLimitType)).append("\n");
    sb.append("    readonlyTimeLimit: ").append(toIndentedString(readonlyTimeLimit)).append("\n");
    sb.append("    templatesSpaceLimit: ").append(toIndentedString(templatesSpaceLimit)).append("\n");
    sb.append("    reportsSpaceLimit: ").append(toIndentedString(reportsSpaceLimit)).append("\n");
    sb.append("    exportsSpaceLimit: ").append(toIndentedString(exportsSpaceLimit)).append("\n");
    sb.append("    fileUploadSizeLimit: ").append(toIndentedString(fileUploadSizeLimit)).append("\n");
    sb.append("    dataSourceLimit: ").append(toIndentedString(dataSourceLimit)).append("\n");
    sb.append("    maxUsersCount: ").append(toIndentedString(maxUsersCount)).append("\n");
    sb.append("    groupLimit: ").append(toIndentedString(groupLimit)).append("\n");
    sb.append("    onlineDesigner: ").append(toIndentedString(onlineDesigner)).append("\n");
    sb.append("    isDemo: ").append(toIndentedString(isDemo)).append("\n");
    sb.append("    urlToBuy: ").append(toIndentedString(urlToBuy)).append("\n");
    sb.append("    unlimitedPage: ").append(toIndentedString(unlimitedPage)).append("\n");
    sb.append("    pageLimit: ").append(toIndentedString(pageLimit)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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
  * @throws IOException if the JSON Element is invalid with respect to SubscriptionPlanVM
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SubscriptionPlanVM.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubscriptionPlanVM is not found in the empty JSON string", SubscriptionPlanVM.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SubscriptionPlanVM.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubscriptionPlanVM` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SubscriptionPlanVM.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionPlanVM.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionPlanVM' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionPlanVM> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionPlanVM.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionPlanVM>() {
           @Override
           public void write(JsonWriter out, SubscriptionPlanVM value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionPlanVM read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             // comment by Detrav, do not need to validate JSON while parse
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscriptionPlanVM given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionPlanVM
  * @throws IOException if the JSON string is invalid with respect to SubscriptionPlanVM
  */
  public static SubscriptionPlanVM fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionPlanVM.class);
  }

 /**
  * Convert an instance of SubscriptionPlanVM to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

