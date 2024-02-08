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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AuditType
 */
public enum AuditType {
  
  TASK_CREATED_EXPORTTEMPLATE("Task_Created_ExportTemplate"),
  
  TASK_CREATED_EXPORTREPORT("Task_Created_ExportReport"),
  
  TASK_CREATED_PREPARETEMPLATE("Task_Created_PrepareTemplate"),
  
  TASK_CREATED_FETCH("Task_Created_Fetch"),
  
  TASK_CREATED_EMAIL("Task_Created_Email"),
  
  TASK_CREATED_WEBHOOK("Task_Created_Webhook"),
  
  TASK_DELETED_EXPORTTEMPLATE("Task_Deleted_ExportTemplate"),
  
  TASK_DELETED_EXPORTREPORT("Task_Deleted_ExportReport"),
  
  TASK_DELETED_PREPARETEMPLATE("Task_Deleted_PrepareTemplate"),
  
  TASK_DELETED_FETCH("Task_Deleted_Fetch"),
  
  TASK_DELETED_EMAIL("Task_Deleted_Email"),
  
  TASK_DELETED_WEBHOOK("Task_Deleted_Webhook"),
  
  TASK_UPDATED_EXPORTTEMPLATE("Task_Updated_ExportTemplate"),
  
  TASK_UPDATED_EXPORTREPORT("Task_Updated_ExportReport"),
  
  TASK_UPDATED_PREPARETEMPLATE("Task_Updated_PrepareTemplate"),
  
  TASK_UPDATED_FETCH("Task_Updated_Fetch"),
  
  TASK_UPDATED_EMAIL("Task_Updated_Email"),
  
  TASK_UPDATED_WEBHOOK("Task_Updated_Webhook"),
  
  TASK_INQUEUE_EXPORTTEMPLATE("Task_InQueue_ExportTemplate"),
  
  TASK_INQUEUE_EXPORTREPORT("Task_InQueue_ExportReport"),
  
  TASK_INQUEUE_PREPARETEMPLATE("Task_InQueue_PrepareTemplate"),
  
  TASK_INQUEUE_FETCH("Task_InQueue_Fetch"),
  
  TASK_INQUEUE_EMAIL("Task_InQueue_Email"),
  
  TASK_INQUEUE_WEBHOOK("Task_InQueue_Webhook"),
  
  TASK_INPROCESS_EXPORTTEMPLATE("Task_InProcess_ExportTemplate"),
  
  TASK_INPROCESS_EXPORTREPORT("Task_InProcess_ExportReport"),
  
  TASK_INPROCESS_PREPARETEMPLATE("Task_InProcess_PrepareTemplate"),
  
  TASK_INPROCESS_FETCH("Task_InProcess_Fetch"),
  
  TASK_INPROCESS_EMAIL("Task_InProcess_Email"),
  
  TASK_INPROCESS_WEBHOOK("Task_InProcess_Webhook"),
  
  TASK_SUCCESS_EXPORTTEMPLATE("Task_Success_ExportTemplate"),
  
  TASK_SUCCESS_EXPORTREPORT("Task_Success_ExportReport"),
  
  TASK_SUCCESS_PREPARETEMPLATE("Task_Success_PrepareTemplate"),
  
  TASK_SUCCESS_FETCH("Task_Success_Fetch"),
  
  TASK_SUCCESS_EMAIL("Task_Success_Email"),
  
  TASK_SUCCESS_WEBHOOK("Task_Success_Webhook"),
  
  TASK_FAILED_EXPORTTEMPLATE("Task_Failed_ExportTemplate"),
  
  TASK_FAILED_EXPORTREPORT("Task_Failed_ExportReport"),
  
  TASK_FAILED_PREPARETEMPLATE("Task_Failed_PrepareTemplate"),
  
  TASK_FAILED_FETCH("Task_Failed_Fetch"),
  
  TASK_FAILED_EMAIL("Task_Failed_Email"),
  
  TASK_FAILED_WEBHOOK("Task_Failed_Webhook"),
  
  TASK_CREATED_THUMBNAILREPORT("Task_Created_ThumbnailReport"),
  
  TASK_DELETED_THUMBNAILREPORT("Task_Deleted_ThumbnailReport"),
  
  TASK_UPDATED_THUMBNAILREPORT("Task_Updated_ThumbnailReport"),
  
  TASK_INQUEUE_THUMBNAILREPORT("Task_InQueue_ThumbnailReport"),
  
  TASK_INPROCESS_THUMBNAILREPORT("Task_InProcess_ThumbnailReport"),
  
  TASK_SUCCESS_THUMBNAILREPORT("Task_Success_ThumbnailReport"),
  
  TASK_FAIL_THUMBNAILREPORT("Task_Fail_ThumbnailReport"),
  
  TASK_CREATED_THUMBNAILTEMPLATE("Task_Created_ThumbnailTemplate"),
  
  TASK_DELETED_THUMBNAILTEMPLATE("Task_Deleted_ThumbnailTemplate"),
  
  TASK_UPDATED_THUMBNAILTEMPLATE("Task_Updated_ThumbnailTemplate"),
  
  TASK_INQUEUE_THUMBNAILTEMPLATE("Task_InQueue_ThumbnailTemplate"),
  
  TASK_INPROCESS_THUMBNAILTEMPLATE("Task_InProcess_ThumbnailTemplate"),
  
  TASK_SUCCESS_THUMBNAILTEMPLATE("Task_Success_ThumbnailTemplate"),
  
  TASK_FAIL_THUMBNAILTEMPLATE("Task_Fail_ThumbnailTemplate"),
  
  SUBSCRIPTION_RENEWED("Subscription_Renewed"),
  
  SUBSCRIPTION_CREATED("Subscription_Created"),
  
  FILE_RENAMED("File_Renamed"),
  
  FILE_CONTENT_UPDATED("File_Content_Updated"),
  
  FILE_DELETED("File_Deleted"),
  
  FILE_MOVED("File_Moved"),
  
  FILE_COPIED("File_Copied"),
  
  FILE_TAGS_UPDATED("File_Tags_Updated"),
  
  FILE_PERMISSIONS_UPDATED("File_Permissions_Updated"),
  
  FILE_RESTORED("File_Restored"),
  
  FILE_MOVEDTOBIN("File_MovedToBin"),
  
  FILE_UPDATED("File_Updated"),
  
  TASK_CREATED_FTPUPLOAD("Task_Created_FTPUpload"),
  
  TASK_DELETED_FTPUPLOAD("Task_Deleted_FTPUpload"),
  
  TASK_UPDATED_FTPUPLOAD("Task_Updated_FTPUpload"),
  
  TASK_INQUEUE_FTPUPLOAD("Task_InQueue_FTPUpload"),
  
  TASK_INPROCESS_FTPUPLOAD("Task_InProcess_FTPUpload"),
  
  TASK_SUCCESS_FTPUPLOAD("Task_Success_FTPUpload"),
  
  TASK_FAIL_FTPUPLOAD("Task_Fail_FTPUpload"),
  
  FILE_CREATED("File_Created");

  private String value;

  AuditType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AuditType fromValue(String value) {
    for (AuditType b : AuditType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    if (prefix == null) {
      prefix = "";
    }

    return String.format("%s=%s", prefix, this.toString());
  }

}

