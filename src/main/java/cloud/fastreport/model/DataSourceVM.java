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
import cloud.fastreport.model.DataSourceConnectionType;
import cloud.fastreport.model.DataSourceStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DataSourceVM
 */
@JsonPropertyOrder({
  DataSourceVM.JSON_PROPERTY_ID,
  DataSourceVM.JSON_PROPERTY_NAME,
  DataSourceVM.JSON_PROPERTY_CONNECTION_TYPE,
  DataSourceVM.JSON_PROPERTY_CONNECTION_STRING,
  DataSourceVM.JSON_PROPERTY_DATA_STRUCTURE,
  DataSourceVM.JSON_PROPERTY_SUBSCRIPTION_ID,
  DataSourceVM.JSON_PROPERTY_EDITED_TIME,
  DataSourceVM.JSON_PROPERTY_EDITOR_USER_ID,
  DataSourceVM.JSON_PROPERTY_CREATED_TIME,
  DataSourceVM.JSON_PROPERTY_CREATOR_USER_ID,
  DataSourceVM.JSON_PROPERTY_STATUS,
  DataSourceVM.JSON_PROPERTY_ERROR_MESSAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DataSourceVM {
  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONNECTION_TYPE = "connectionType";
  private DataSourceConnectionType connectionType;

  public static final String JSON_PROPERTY_CONNECTION_STRING = "connectionString";
  private JsonNullable<String> connectionString = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DATA_STRUCTURE = "dataStructure";
  private JsonNullable<String> dataStructure = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscriptionId";
  private JsonNullable<String> subscriptionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EDITED_TIME = "editedTime";
  private OffsetDateTime editedTime;

  public static final String JSON_PROPERTY_EDITOR_USER_ID = "editorUserId";
  private JsonNullable<String> editorUserId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  private OffsetDateTime createdTime;

  public static final String JSON_PROPERTY_CREATOR_USER_ID = "creatorUserId";
  private JsonNullable<String> creatorUserId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATUS = "status";
  private DataSourceStatus status;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "errorMessage";
  private JsonNullable<String> errorMessage = JsonNullable.<String>undefined();

  public DataSourceVM() { 
  }

  public DataSourceVM id(String id) {
    this.id = JsonNullable.<String>of(id);
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getId() {
        return id.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getId_JsonNullable() {
    return id;
  }
  
  @JsonProperty(JSON_PROPERTY_ID)
  public void setId_JsonNullable(JsonNullable<String> id) {
    this.id = id;
  }

  public void setId(String id) {
    this.id = JsonNullable.<String>of(id);
  }


  public DataSourceVM name(String name) {
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


  public DataSourceVM connectionType(DataSourceConnectionType connectionType) {
    this.connectionType = connectionType;
    return this;
  }

   /**
   * Get connectionType
   * @return connectionType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DataSourceConnectionType getConnectionType() {
    return connectionType;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectionType(DataSourceConnectionType connectionType) {
    this.connectionType = connectionType;
  }


  public DataSourceVM connectionString(String connectionString) {
    this.connectionString = JsonNullable.<String>of(connectionString);
    return this;
  }

   /**
   * Get connectionString
   * @return connectionString
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getConnectionString() {
        return connectionString.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONNECTION_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getConnectionString_JsonNullable() {
    return connectionString;
  }
  
  @JsonProperty(JSON_PROPERTY_CONNECTION_STRING)
  public void setConnectionString_JsonNullable(JsonNullable<String> connectionString) {
    this.connectionString = connectionString;
  }

  public void setConnectionString(String connectionString) {
    this.connectionString = JsonNullable.<String>of(connectionString);
  }


  public DataSourceVM dataStructure(String dataStructure) {
    this.dataStructure = JsonNullable.<String>of(dataStructure);
    return this;
  }

   /**
   * Get dataStructure
   * @return dataStructure
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getDataStructure() {
        return dataStructure.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATA_STRUCTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDataStructure_JsonNullable() {
    return dataStructure;
  }
  
  @JsonProperty(JSON_PROPERTY_DATA_STRUCTURE)
  public void setDataStructure_JsonNullable(JsonNullable<String> dataStructure) {
    this.dataStructure = dataStructure;
  }

  public void setDataStructure(String dataStructure) {
    this.dataStructure = JsonNullable.<String>of(dataStructure);
  }


  public DataSourceVM subscriptionId(String subscriptionId) {
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


  public DataSourceVM editedTime(OffsetDateTime editedTime) {
    this.editedTime = editedTime;
    return this;
  }

   /**
   * Get editedTime
   * @return editedTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EDITED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEditedTime() {
    return editedTime;
  }


  @JsonProperty(JSON_PROPERTY_EDITED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEditedTime(OffsetDateTime editedTime) {
    this.editedTime = editedTime;
  }


  public DataSourceVM editorUserId(String editorUserId) {
    this.editorUserId = JsonNullable.<String>of(editorUserId);
    return this;
  }

   /**
   * Get editorUserId
   * @return editorUserId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getEditorUserId() {
        return editorUserId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EDITOR_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEditorUserId_JsonNullable() {
    return editorUserId;
  }
  
  @JsonProperty(JSON_PROPERTY_EDITOR_USER_ID)
  public void setEditorUserId_JsonNullable(JsonNullable<String> editorUserId) {
    this.editorUserId = editorUserId;
  }

  public void setEditorUserId(String editorUserId) {
    this.editorUserId = JsonNullable.<String>of(editorUserId);
  }


  public DataSourceVM createdTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Get createdTime
   * @return createdTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }


  public DataSourceVM creatorUserId(String creatorUserId) {
    this.creatorUserId = JsonNullable.<String>of(creatorUserId);
    return this;
  }

   /**
   * Get creatorUserId
   * @return creatorUserId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCreatorUserId() {
        return creatorUserId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATOR_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCreatorUserId_JsonNullable() {
    return creatorUserId;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATOR_USER_ID)
  public void setCreatorUserId_JsonNullable(JsonNullable<String> creatorUserId) {
    this.creatorUserId = creatorUserId;
  }

  public void setCreatorUserId(String creatorUserId) {
    this.creatorUserId = JsonNullable.<String>of(creatorUserId);
  }


  public DataSourceVM status(DataSourceStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DataSourceStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(DataSourceStatus status) {
    this.status = status;
  }


  public DataSourceVM errorMessage(String errorMessage) {
    this.errorMessage = JsonNullable.<String>of(errorMessage);
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getErrorMessage() {
        return errorMessage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getErrorMessage_JsonNullable() {
    return errorMessage;
  }
  
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  public void setErrorMessage_JsonNullable(JsonNullable<String> errorMessage) {
    this.errorMessage = errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = JsonNullable.<String>of(errorMessage);
  }


  /**
   * Return true if this DataSourceVM object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataSourceVM dataSourceVM = (DataSourceVM) o;
    return equalsNullable(this.id, dataSourceVM.id) &&
        equalsNullable(this.name, dataSourceVM.name) &&
        Objects.equals(this.connectionType, dataSourceVM.connectionType) &&
        equalsNullable(this.connectionString, dataSourceVM.connectionString) &&
        equalsNullable(this.dataStructure, dataSourceVM.dataStructure) &&
        equalsNullable(this.subscriptionId, dataSourceVM.subscriptionId) &&
        Objects.equals(this.editedTime, dataSourceVM.editedTime) &&
        equalsNullable(this.editorUserId, dataSourceVM.editorUserId) &&
        Objects.equals(this.createdTime, dataSourceVM.createdTime) &&
        equalsNullable(this.creatorUserId, dataSourceVM.creatorUserId) &&
        Objects.equals(this.status, dataSourceVM.status) &&
        equalsNullable(this.errorMessage, dataSourceVM.errorMessage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(name), connectionType, hashCodeNullable(connectionString), hashCodeNullable(dataStructure), hashCodeNullable(subscriptionId), editedTime, hashCodeNullable(editorUserId), createdTime, hashCodeNullable(creatorUserId), status, hashCodeNullable(errorMessage));
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
    sb.append("class DataSourceVM {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
    sb.append("    connectionString: ").append(toIndentedString(connectionString)).append("\n");
    sb.append("    dataStructure: ").append(toIndentedString(dataStructure)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    editedTime: ").append(toIndentedString(editedTime)).append("\n");
    sb.append("    editorUserId: ").append(toIndentedString(editorUserId)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    creatorUserId: ").append(toIndentedString(creatorUserId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `connectionType` to the URL query string
    if (getConnectionType() != null) {
      joiner.add(String.format("%sconnectionType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConnectionType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `connectionString` to the URL query string
    if (getConnectionString() != null) {
      joiner.add(String.format("%sconnectionString%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConnectionString()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dataStructure` to the URL query string
    if (getDataStructure() != null) {
      joiner.add(String.format("%sdataStructure%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDataStructure()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `subscriptionId` to the URL query string
    if (getSubscriptionId() != null) {
      joiner.add(String.format("%ssubscriptionId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubscriptionId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `editedTime` to the URL query string
    if (getEditedTime() != null) {
      joiner.add(String.format("%seditedTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEditedTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `editorUserId` to the URL query string
    if (getEditorUserId() != null) {
      joiner.add(String.format("%seditorUserId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEditorUserId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `createdTime` to the URL query string
    if (getCreatedTime() != null) {
      joiner.add(String.format("%screatedTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `creatorUserId` to the URL query string
    if (getCreatorUserId() != null) {
      joiner.add(String.format("%screatorUserId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatorUserId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `errorMessage` to the URL query string
    if (getErrorMessage() != null) {
      joiner.add(String.format("%serrorMessage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getErrorMessage()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

