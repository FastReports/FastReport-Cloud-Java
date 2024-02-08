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
import cloud.fastreport.model.DataSourcePermission;
import cloud.fastreport.model.FilePermission;
import cloud.fastreport.model.GroupPermission;
import cloud.fastreport.model.SubscriptionPermission;
import cloud.fastreport.model.TaskPermission;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MyPermissionsVM
 */
@JsonPropertyOrder({
  MyPermissionsVM.JSON_PROPERTY_SUBSCRIPTION,
  MyPermissionsVM.JSON_PROPERTY_FILES,
  MyPermissionsVM.JSON_PROPERTY_DATASOURCES,
  MyPermissionsVM.JSON_PROPERTY_GROUPS,
  MyPermissionsVM.JSON_PROPERTY_TASKS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MyPermissionsVM {
  public static final String JSON_PROPERTY_SUBSCRIPTION = "subscription";
  private SubscriptionPermission subscription;

  public static final String JSON_PROPERTY_FILES = "files";
  private FilePermission files;

  public static final String JSON_PROPERTY_DATASOURCES = "datasources";
  private DataSourcePermission datasources;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private GroupPermission groups;

  public static final String JSON_PROPERTY_TASKS = "tasks";
  private TaskPermission tasks;

  public MyPermissionsVM() { 
  }

  public MyPermissionsVM subscription(SubscriptionPermission subscription) {
    this.subscription = subscription;
    return this;
  }

   /**
   * Get subscription
   * @return subscription
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionPermission getSubscription() {
    return subscription;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscription(SubscriptionPermission subscription) {
    this.subscription = subscription;
  }


  public MyPermissionsVM files(FilePermission files) {
    this.files = files;
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FilePermission getFiles() {
    return files;
  }


  @JsonProperty(JSON_PROPERTY_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiles(FilePermission files) {
    this.files = files;
  }


  public MyPermissionsVM datasources(DataSourcePermission datasources) {
    this.datasources = datasources;
    return this;
  }

   /**
   * Get datasources
   * @return datasources
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATASOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DataSourcePermission getDatasources() {
    return datasources;
  }


  @JsonProperty(JSON_PROPERTY_DATASOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatasources(DataSourcePermission datasources) {
    this.datasources = datasources;
  }


  public MyPermissionsVM groups(GroupPermission groups) {
    this.groups = groups;
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GroupPermission getGroups() {
    return groups;
  }


  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroups(GroupPermission groups) {
    this.groups = groups;
  }


  public MyPermissionsVM tasks(TaskPermission tasks) {
    this.tasks = tasks;
    return this;
  }

   /**
   * Get tasks
   * @return tasks
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TASKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TaskPermission getTasks() {
    return tasks;
  }


  @JsonProperty(JSON_PROPERTY_TASKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTasks(TaskPermission tasks) {
    this.tasks = tasks;
  }


  /**
   * Return true if this MyPermissionsVM object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MyPermissionsVM myPermissionsVM = (MyPermissionsVM) o;
    return Objects.equals(this.subscription, myPermissionsVM.subscription) &&
        Objects.equals(this.files, myPermissionsVM.files) &&
        Objects.equals(this.datasources, myPermissionsVM.datasources) &&
        Objects.equals(this.groups, myPermissionsVM.groups) &&
        Objects.equals(this.tasks, myPermissionsVM.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscription, files, datasources, groups, tasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MyPermissionsVM {\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    datasources: ").append(toIndentedString(datasources)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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

    // add `subscription` to the URL query string
    if (getSubscription() != null) {
      joiner.add(getSubscription().toUrlQueryString(prefix + "subscription" + suffix));
    }

    // add `files` to the URL query string
    if (getFiles() != null) {
      joiner.add(getFiles().toUrlQueryString(prefix + "files" + suffix));
    }

    // add `datasources` to the URL query string
    if (getDatasources() != null) {
      joiner.add(getDatasources().toUrlQueryString(prefix + "datasources" + suffix));
    }

    // add `groups` to the URL query string
    if (getGroups() != null) {
      joiner.add(getGroups().toUrlQueryString(prefix + "groups" + suffix));
    }

    // add `tasks` to the URL query string
    if (getTasks() != null) {
      joiner.add(getTasks().toUrlQueryString(prefix + "tasks" + suffix));
    }

    return joiner.toString();
  }
}

