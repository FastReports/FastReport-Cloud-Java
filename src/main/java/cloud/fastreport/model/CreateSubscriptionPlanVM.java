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
import java.net.URI;
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
 * CreateSubscriptionPlanVM
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateSubscriptionPlanVM extends CloudBaseVM {
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
  private URI urlToBuy;

  public static final String SERIALIZED_NAME_UNLIMITED_PAGE = "unlimitedPage";
  @SerializedName(SERIALIZED_NAME_UNLIMITED_PAGE)
  private Boolean unlimitedPage;

  public static final String SERIALIZED_NAME_PAGE_LIMIT = "pageLimit";
  @SerializedName(SERIALIZED_NAME_PAGE_LIMIT)
  private Integer pageLimit;

  public static final String SERIALIZED_NAME_READONLY_TIME_LIMIT_TYPE = "readonlyTimeLimitType";
  @SerializedName(SERIALIZED_NAME_READONLY_TIME_LIMIT_TYPE)
  private TimePeriodType readonlyTimeLimitType;

  public static final String SERIALIZED_NAME_READONLY_TIME_LIMIT = "readonlyTimeLimit";
  @SerializedName(SERIALIZED_NAME_READONLY_TIME_LIMIT)
  private Integer readonlyTimeLimit;

  public static final String SERIALIZED_NAME_TASKS = "tasks";
  @SerializedName(SERIALIZED_NAME_TASKS)
  private TaskSettingsVM tasks;

  public static final String SERIALIZED_NAME_$_T = "$t";
  @SerializedName(SERIALIZED_NAME_$_T)
  protected String $t;

  public CreateSubscriptionPlanVM() {
    this.$t = this.getClass().getSimpleName();
  }

  public CreateSubscriptionPlanVM isActive(Boolean isActive) {
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


  public CreateSubscriptionPlanVM displayName(String displayName) {
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


  public CreateSubscriptionPlanVM timePeriodType(TimePeriodType timePeriodType) {
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


  public CreateSubscriptionPlanVM timePeriod(Integer timePeriod) {
    this.timePeriod = timePeriod;
    return this;
  }

   /**
   * Get timePeriod
   * minimum: 1
   * maximum: 2147483647
   * @return timePeriod
  **/
  @javax.annotation.Nullable
  public Integer getTimePeriod() {
    return timePeriod;
  }

  public void setTimePeriod(Integer timePeriod) {
    this.timePeriod = timePeriod;
  }


  public CreateSubscriptionPlanVM templatesSpaceLimit(Long templatesSpaceLimit) {
    this.templatesSpaceLimit = templatesSpaceLimit;
    return this;
  }

   /**
   * Get templatesSpaceLimit
   * minimum: 1048576
   * @return templatesSpaceLimit
  **/
  @javax.annotation.Nullable
  public Long getTemplatesSpaceLimit() {
    return templatesSpaceLimit;
  }

  public void setTemplatesSpaceLimit(Long templatesSpaceLimit) {
    this.templatesSpaceLimit = templatesSpaceLimit;
  }


  public CreateSubscriptionPlanVM reportsSpaceLimit(Long reportsSpaceLimit) {
    this.reportsSpaceLimit = reportsSpaceLimit;
    return this;
  }

   /**
   * Get reportsSpaceLimit
   * minimum: 1048576
   * @return reportsSpaceLimit
  **/
  @javax.annotation.Nullable
  public Long getReportsSpaceLimit() {
    return reportsSpaceLimit;
  }

  public void setReportsSpaceLimit(Long reportsSpaceLimit) {
    this.reportsSpaceLimit = reportsSpaceLimit;
  }


  public CreateSubscriptionPlanVM exportsSpaceLimit(Long exportsSpaceLimit) {
    this.exportsSpaceLimit = exportsSpaceLimit;
    return this;
  }

   /**
   * Get exportsSpaceLimit
   * minimum: 1048576
   * @return exportsSpaceLimit
  **/
  @javax.annotation.Nullable
  public Long getExportsSpaceLimit() {
    return exportsSpaceLimit;
  }

  public void setExportsSpaceLimit(Long exportsSpaceLimit) {
    this.exportsSpaceLimit = exportsSpaceLimit;
  }


  public CreateSubscriptionPlanVM fileUploadSizeLimit(Long fileUploadSizeLimit) {
    this.fileUploadSizeLimit = fileUploadSizeLimit;
    return this;
  }

   /**
   * Get fileUploadSizeLimit
   * minimum: 0
   * maximum: 1073741824
   * @return fileUploadSizeLimit
  **/
  @javax.annotation.Nullable
  public Long getFileUploadSizeLimit() {
    return fileUploadSizeLimit;
  }

  public void setFileUploadSizeLimit(Long fileUploadSizeLimit) {
    this.fileUploadSizeLimit = fileUploadSizeLimit;
  }


  public CreateSubscriptionPlanVM dataSourceLimit(Integer dataSourceLimit) {
    this.dataSourceLimit = dataSourceLimit;
    return this;
  }

   /**
   * Get dataSourceLimit
   * minimum: 0
   * maximum: 2147483647
   * @return dataSourceLimit
  **/
  @javax.annotation.Nullable
  public Integer getDataSourceLimit() {
    return dataSourceLimit;
  }

  public void setDataSourceLimit(Integer dataSourceLimit) {
    this.dataSourceLimit = dataSourceLimit;
  }


  public CreateSubscriptionPlanVM maxUsersCount(Integer maxUsersCount) {
    this.maxUsersCount = maxUsersCount;
    return this;
  }

   /**
   * Get maxUsersCount
   * minimum: 0
   * maximum: 2147483647
   * @return maxUsersCount
  **/
  @javax.annotation.Nullable
  public Integer getMaxUsersCount() {
    return maxUsersCount;
  }

  public void setMaxUsersCount(Integer maxUsersCount) {
    this.maxUsersCount = maxUsersCount;
  }


  public CreateSubscriptionPlanVM groupLimit(Integer groupLimit) {
    this.groupLimit = groupLimit;
    return this;
  }

   /**
   * Get groupLimit
   * minimum: 0
   * maximum: 2147483647
   * @return groupLimit
  **/
  @javax.annotation.Nullable
  public Integer getGroupLimit() {
    return groupLimit;
  }

  public void setGroupLimit(Integer groupLimit) {
    this.groupLimit = groupLimit;
  }


  public CreateSubscriptionPlanVM onlineDesigner(Boolean onlineDesigner) {
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


  public CreateSubscriptionPlanVM isDemo(Boolean isDemo) {
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


  public CreateSubscriptionPlanVM urlToBuy(URI urlToBuy) {
    this.urlToBuy = urlToBuy;
    return this;
  }

   /**
   * Get urlToBuy
   * @return urlToBuy
  **/
  @javax.annotation.Nullable
  public URI getUrlToBuy() {
    return urlToBuy;
  }

  public void setUrlToBuy(URI urlToBuy) {
    this.urlToBuy = urlToBuy;
  }


  public CreateSubscriptionPlanVM unlimitedPage(Boolean unlimitedPage) {
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


  public CreateSubscriptionPlanVM pageLimit(Integer pageLimit) {
    this.pageLimit = pageLimit;
    return this;
  }

   /**
   * Get pageLimit
   * minimum: 0
   * maximum: 2147483647
   * @return pageLimit
  **/
  @javax.annotation.Nullable
  public Integer getPageLimit() {
    return pageLimit;
  }

  public void setPageLimit(Integer pageLimit) {
    this.pageLimit = pageLimit;
  }


  public CreateSubscriptionPlanVM readonlyTimeLimitType(TimePeriodType readonlyTimeLimitType) {
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


  public CreateSubscriptionPlanVM readonlyTimeLimit(Integer readonlyTimeLimit) {
    this.readonlyTimeLimit = readonlyTimeLimit;
    return this;
  }

   /**
   * Get readonlyTimeLimit
   * minimum: 1
   * maximum: 2147483647
   * @return readonlyTimeLimit
  **/
  @javax.annotation.Nullable
  public Integer getReadonlyTimeLimit() {
    return readonlyTimeLimit;
  }

  public void setReadonlyTimeLimit(Integer readonlyTimeLimit) {
    this.readonlyTimeLimit = readonlyTimeLimit;
  }


  public CreateSubscriptionPlanVM tasks(TaskSettingsVM tasks) {
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


  public CreateSubscriptionPlanVM $t(String $t) {
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
    CreateSubscriptionPlanVM createSubscriptionPlanVM = (CreateSubscriptionPlanVM) o;
    return Objects.equals(this.isActive, createSubscriptionPlanVM.isActive) &&
        Objects.equals(this.displayName, createSubscriptionPlanVM.displayName) &&
        Objects.equals(this.timePeriodType, createSubscriptionPlanVM.timePeriodType) &&
        Objects.equals(this.timePeriod, createSubscriptionPlanVM.timePeriod) &&
        Objects.equals(this.templatesSpaceLimit, createSubscriptionPlanVM.templatesSpaceLimit) &&
        Objects.equals(this.reportsSpaceLimit, createSubscriptionPlanVM.reportsSpaceLimit) &&
        Objects.equals(this.exportsSpaceLimit, createSubscriptionPlanVM.exportsSpaceLimit) &&
        Objects.equals(this.fileUploadSizeLimit, createSubscriptionPlanVM.fileUploadSizeLimit) &&
        Objects.equals(this.dataSourceLimit, createSubscriptionPlanVM.dataSourceLimit) &&
        Objects.equals(this.maxUsersCount, createSubscriptionPlanVM.maxUsersCount) &&
        Objects.equals(this.groupLimit, createSubscriptionPlanVM.groupLimit) &&
        Objects.equals(this.onlineDesigner, createSubscriptionPlanVM.onlineDesigner) &&
        Objects.equals(this.isDemo, createSubscriptionPlanVM.isDemo) &&
        Objects.equals(this.urlToBuy, createSubscriptionPlanVM.urlToBuy) &&
        Objects.equals(this.unlimitedPage, createSubscriptionPlanVM.unlimitedPage) &&
        Objects.equals(this.pageLimit, createSubscriptionPlanVM.pageLimit) &&
        Objects.equals(this.readonlyTimeLimitType, createSubscriptionPlanVM.readonlyTimeLimitType) &&
        Objects.equals(this.readonlyTimeLimit, createSubscriptionPlanVM.readonlyTimeLimit) &&
        Objects.equals(this.tasks, createSubscriptionPlanVM.tasks) &&
        Objects.equals(this.$t, createSubscriptionPlanVM.$t) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(isActive, displayName, timePeriodType, timePeriod, templatesSpaceLimit, reportsSpaceLimit, exportsSpaceLimit, fileUploadSizeLimit, dataSourceLimit, maxUsersCount, groupLimit, onlineDesigner, isDemo, urlToBuy, unlimitedPage, pageLimit, readonlyTimeLimitType, readonlyTimeLimit, tasks, $t, super.hashCode());
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
    sb.append("class CreateSubscriptionPlanVM {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    timePeriodType: ").append(toIndentedString(timePeriodType)).append("\n");
    sb.append("    timePeriod: ").append(toIndentedString(timePeriod)).append("\n");
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
    sb.append("    readonlyTimeLimitType: ").append(toIndentedString(readonlyTimeLimitType)).append("\n");
    sb.append("    readonlyTimeLimit: ").append(toIndentedString(readonlyTimeLimit)).append("\n");
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
  * @throws IOException if the JSON Element is invalid with respect to CreateSubscriptionPlanVM
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateSubscriptionPlanVM.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateSubscriptionPlanVM is not found in the empty JSON string", CreateSubscriptionPlanVM.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateSubscriptionPlanVM.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateSubscriptionPlanVM` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateSubscriptionPlanVM.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSubscriptionPlanVM.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSubscriptionPlanVM' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSubscriptionPlanVM> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSubscriptionPlanVM.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSubscriptionPlanVM>() {
           @Override
           public void write(JsonWriter out, CreateSubscriptionPlanVM value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSubscriptionPlanVM read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             // comment by Detrav, do not need to validate JSON while parse
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateSubscriptionPlanVM given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSubscriptionPlanVM
  * @throws IOException if the JSON string is invalid with respect to CreateSubscriptionPlanVM
  */
  public static CreateSubscriptionPlanVM fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSubscriptionPlanVM.class);
  }

 /**
  * Convert an instance of CreateSubscriptionPlanVM to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

