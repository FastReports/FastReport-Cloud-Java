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
import cloud.fastreport.model.FileStatus;
import cloud.fastreport.model.FileStatusReason;
import cloud.fastreport.model.FileType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * FileVM
 */
@JsonPropertyOrder({
  FileVM.JSON_PROPERTY_NAME,
  FileVM.JSON_PROPERTY_PARENT_ID,
  FileVM.JSON_PROPERTY_TAGS,
  FileVM.JSON_PROPERTY_ICON,
  FileVM.JSON_PROPERTY_TYPE,
  FileVM.JSON_PROPERTY_SIZE,
  FileVM.JSON_PROPERTY_SUBSCRIPTION_ID,
  FileVM.JSON_PROPERTY_STATUS,
  FileVM.JSON_PROPERTY_STATUS_REASON,
  FileVM.JSON_PROPERTY_ERROR_MESSAGE,
  FileVM.JSON_PROPERTY_IS_DELETED,
  FileVM.JSON_PROPERTY_ID,
  FileVM.JSON_PROPERTY_CREATED_TIME,
  FileVM.JSON_PROPERTY_CREATOR_USER_ID,
  FileVM.JSON_PROPERTY_EDITED_TIME,
  FileVM.JSON_PROPERTY_EDITOR_USER_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FileVM {
  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PARENT_ID = "parentId";
  private JsonNullable<String> parentId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_ICON = "icon";
  private JsonNullable<byte[]> icon = JsonNullable.<byte[]>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private FileType type;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscriptionId";
  private JsonNullable<String> subscriptionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATUS = "status";
  private FileStatus status;

  public static final String JSON_PROPERTY_STATUS_REASON = "statusReason";
  private FileStatusReason statusReason;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "errorMessage";
  private JsonNullable<String> errorMessage = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_DELETED = "isDeleted";
  private Boolean isDeleted;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  private OffsetDateTime createdTime;

  public static final String JSON_PROPERTY_CREATOR_USER_ID = "creatorUserId";
  private JsonNullable<String> creatorUserId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EDITED_TIME = "editedTime";
  private OffsetDateTime editedTime;

  public static final String JSON_PROPERTY_EDITOR_USER_ID = "editorUserId";
  private JsonNullable<String> editorUserId = JsonNullable.<String>undefined();

  public FileVM() {
  }

  public FileVM name(String name) {
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


  public FileVM parentId(String parentId) {
    this.parentId = JsonNullable.<String>of(parentId);
    
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getParentId() {
        return parentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getParentId_JsonNullable() {
    return parentId;
  }
  
  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  public void setParentId_JsonNullable(JsonNullable<String> parentId) {
    this.parentId = parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = JsonNullable.<String>of(parentId);
  }


  public FileVM tags(List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
    
    return this;
  }

  public FileVM addTagsItem(String tagsItem) {
    if (this.tags == null || !this.tags.isPresent()) {
      this.tags = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.tags.get().add(tagsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public List<String> getTags() {
        return tags.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getTags_JsonNullable() {
    return tags;
  }
  
  @JsonProperty(JSON_PROPERTY_TAGS)
  public void setTags_JsonNullable(JsonNullable<List<String>> tags) {
    this.tags = tags;
  }

  public void setTags(List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
  }


  public FileVM icon(byte[] icon) {
    this.icon = JsonNullable.<byte[]>of(icon);
    
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public byte[] getIcon() {
        return icon.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<byte[]> getIcon_JsonNullable() {
    return icon;
  }
  
  @JsonProperty(JSON_PROPERTY_ICON)
  public void setIcon_JsonNullable(JsonNullable<byte[]> icon) {
    this.icon = icon;
  }

  public void setIcon(byte[] icon) {
    this.icon = JsonNullable.<byte[]>of(icon);
  }


  public FileVM type(FileType type) {
    
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

  public FileType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(FileType type) {
    this.type = type;
  }


  public FileVM size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(Long size) {
    this.size = size;
  }


  public FileVM subscriptionId(String subscriptionId) {
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


  public FileVM status(FileStatus status) {
    
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

  public FileStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(FileStatus status) {
    this.status = status;
  }


  public FileVM statusReason(FileStatusReason statusReason) {
    
    this.statusReason = statusReason;
    return this;
  }

   /**
   * Get statusReason
   * @return statusReason
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileStatusReason getStatusReason() {
    return statusReason;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusReason(FileStatusReason statusReason) {
    this.statusReason = statusReason;
  }


  public FileVM errorMessage(String errorMessage) {
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


  public FileVM isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public FileVM id(String id) {
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


  public FileVM createdTime(OffsetDateTime createdTime) {
    
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


  public FileVM creatorUserId(String creatorUserId) {
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


  public FileVM editedTime(OffsetDateTime editedTime) {
    
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


  public FileVM editorUserId(String editorUserId) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileVM fileVM = (FileVM) o;
    return equalsNullable(this.name, fileVM.name) &&
        equalsNullable(this.parentId, fileVM.parentId) &&
        equalsNullable(this.tags, fileVM.tags) &&
        equalsNullable(this.icon, fileVM.icon) &&
        Objects.equals(this.type, fileVM.type) &&
        Objects.equals(this.size, fileVM.size) &&
        equalsNullable(this.subscriptionId, fileVM.subscriptionId) &&
        Objects.equals(this.status, fileVM.status) &&
        Objects.equals(this.statusReason, fileVM.statusReason) &&
        equalsNullable(this.errorMessage, fileVM.errorMessage) &&
        Objects.equals(this.isDeleted, fileVM.isDeleted) &&
        equalsNullable(this.id, fileVM.id) &&
        Objects.equals(this.createdTime, fileVM.createdTime) &&
        equalsNullable(this.creatorUserId, fileVM.creatorUserId) &&
        Objects.equals(this.editedTime, fileVM.editedTime) &&
        equalsNullable(this.editorUserId, fileVM.editorUserId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(parentId), hashCodeNullable(tags), hashCodeNullable(icon), type, size, hashCodeNullable(subscriptionId), status, statusReason, hashCodeNullable(errorMessage), isDeleted, hashCodeNullable(id), createdTime, hashCodeNullable(creatorUserId), editedTime, hashCodeNullable(editorUserId));
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
    sb.append("class FileVM {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    creatorUserId: ").append(toIndentedString(creatorUserId)).append("\n");
    sb.append("    editedTime: ").append(toIndentedString(editedTime)).append("\n");
    sb.append("    editorUserId: ").append(toIndentedString(editorUserId)).append("\n");
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

