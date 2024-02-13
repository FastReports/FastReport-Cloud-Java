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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * CloudBaseVM
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CloudBaseVM {
  public static final String SERIALIZED_NAME_$_T = "$t";
  @SerializedName(SERIALIZED_NAME_$_T)
  protected String $t;

  public CloudBaseVM() {
    this.$t = this.getClass().getSimpleName();
  }

  public CloudBaseVM $t(String $t) {
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
    CloudBaseVM cloudBaseVM = (CloudBaseVM) o;
    return Objects.equals(this.$t, cloudBaseVM.$t);
  }

  @Override
  public int hashCode() {
    return Objects.hash($t);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudBaseVM {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to CloudBaseVM
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CloudBaseVM.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudBaseVM is not found in the empty JSON string", CloudBaseVM.openapiRequiredFields.toString()));
        }
      }

      String discriminatorValue = jsonElement.getAsJsonObject().get("$t").getAsString();
      switch (discriminatorValue) {
        case "AcceptAgreementsVM":
          AcceptAgreementsVM.validateJsonElement(jsonElement);
          break;
        case "AdminExportFolderCreateVM":
          AdminExportFolderCreateVM.validateJsonElement(jsonElement);
          break;
        case "AdminFolderCreateVM":
          AdminFolderCreateVM.validateJsonElement(jsonElement);
          break;
        case "AdminReportFolderCreateVM":
          AdminReportFolderCreateVM.validateJsonElement(jsonElement);
          break;
        case "AdminSubscriptionVM":
          AdminSubscriptionVM.validateJsonElement(jsonElement);
          break;
        case "AdminSubscriptionsVM":
          AdminSubscriptionsVM.validateJsonElement(jsonElement);
          break;
        case "AdminTemplateFolderCreateVM":
          AdminTemplateFolderCreateVM.validateJsonElement(jsonElement);
          break;
        case "AdminUpdateCurrentSubscriptionPlanVM":
          AdminUpdateCurrentSubscriptionPlanVM.validateJsonElement(jsonElement);
          break;
        case "AnalysisResultVM":
          AnalysisResultVM.validateJsonElement(jsonElement);
          break;
        case "AnalysisResultsVM":
          AnalysisResultsVM.validateJsonElement(jsonElement);
          break;
        case "ApiKeyVM":
          ApiKeyVM.validateJsonElement(jsonElement);
          break;
        case "ApiKeysVM":
          ApiKeysVM.validateJsonElement(jsonElement);
          break;
        case "AppMixinsVM":
          AppMixinsVM.validateJsonElement(jsonElement);
          break;
        case "AuditActionVM":
          AuditActionVM.validateJsonElement(jsonElement);
          break;
        case "AuditActionsVM":
          AuditActionsVM.validateJsonElement(jsonElement);
          break;
        case "AuditFilePropertyChangedVM":
          AuditFilePropertyChangedVM.validateJsonElement(jsonElement);
          break;
        case "AuditStatVM":
          AuditStatVM.validateJsonElement(jsonElement);
          break;
        case "AuditStatsVM":
          AuditStatsVM.validateJsonElement(jsonElement);
          break;
        case "AuditSubscriptionActionVM":
          AuditSubscriptionActionVM.validateJsonElement(jsonElement);
          break;
        case "AuditTaskActionVM":
          AuditTaskActionVM.validateJsonElement(jsonElement);
          break;
        case "AuthConfigVM":
          AuthConfigVM.validateJsonElement(jsonElement);
          break;
        case "BreadcrumbsVM":
          BreadcrumbsVM.validateJsonElement(jsonElement);
          break;
        case "CheckUserByPasswordInternalVM":
          CheckUserByPasswordInternalVM.validateJsonElement(jsonElement);
          break;
        case "ClearNotificationsVM":
          ClearNotificationsVM.validateJsonElement(jsonElement);
          break;
        case "CloudBaseVM":
          CloudBaseVM.validateJsonElement(jsonElement);
          break;
        case "CountVM":
          CountVM.validateJsonElement(jsonElement);
          break;
        case "CreateApiKeyVM":
          CreateApiKeyVM.validateJsonElement(jsonElement);
          break;
        case "CreateAuditActionVM":
          CreateAuditActionVM.validateJsonElement(jsonElement);
          break;
        case "CreateDataSourceAdminVM":
          CreateDataSourceAdminVM.validateJsonElement(jsonElement);
          break;
        case "CreateDataSourceVM":
          CreateDataSourceVM.validateJsonElement(jsonElement);
          break;
        case "CreateEmailTaskVM":
          CreateEmailTaskVM.validateJsonElement(jsonElement);
          break;
        case "CreateExportReportTaskVM":
          CreateExportReportTaskVM.validateJsonElement(jsonElement);
          break;
        case "CreateExportTemplateTaskVM":
          CreateExportTemplateTaskVM.validateJsonElement(jsonElement);
          break;
        case "CreateFTPUploadTaskVM":
          CreateFTPUploadTaskVM.validateJsonElement(jsonElement);
          break;
        case "CreateFetchTaskVM":
          CreateFetchTaskVM.validateJsonElement(jsonElement);
          break;
        case "CreateGroupAdminVM":
          CreateGroupAdminVM.validateJsonElement(jsonElement);
          break;
        case "CreateGroupVM":
          CreateGroupVM.validateJsonElement(jsonElement);
          break;
        case "CreateIfNotExistInternalVM":
          CreateIfNotExistInternalVM.validateJsonElement(jsonElement);
          break;
        case "CreatePrepareTemplateTaskVM":
          CreatePrepareTemplateTaskVM.validateJsonElement(jsonElement);
          break;
        case "CreateSubscriptionInviteVM":
          CreateSubscriptionInviteVM.validateJsonElement(jsonElement);
          break;
        case "CreateSubscriptionPeriodVM":
          CreateSubscriptionPeriodVM.validateJsonElement(jsonElement);
          break;
        case "CreateSubscriptionPlanVM":
          CreateSubscriptionPlanVM.validateJsonElement(jsonElement);
          break;
        case "CreateSubscriptionVM":
          CreateSubscriptionVM.validateJsonElement(jsonElement);
          break;
        case "CreateTaskBaseVM":
          CreateTaskBaseVM.validateJsonElement(jsonElement);
          break;
        case "CreateThumbnailReportTaskVM":
          CreateThumbnailReportTaskVM.validateJsonElement(jsonElement);
          break;
        case "CreateThumbnailTemplateTaskVM":
          CreateThumbnailTemplateTaskVM.validateJsonElement(jsonElement);
          break;
        case "CreateTransformTaskBaseVM":
          CreateTransformTaskBaseVM.validateJsonElement(jsonElement);
          break;
        case "CreateTransportTaskBaseVM":
          CreateTransportTaskBaseVM.validateJsonElement(jsonElement);
          break;
        case "CreateWebhookTaskVM":
          CreateWebhookTaskVM.validateJsonElement(jsonElement);
          break;
        case "DataSourcePermissionCRUDVM":
          DataSourcePermissionCRUDVM.validateJsonElement(jsonElement);
          break;
        case "DataSourcePermissionsCRUDVM":
          DataSourcePermissionsCRUDVM.validateJsonElement(jsonElement);
          break;
        case "DataSourcePermissionsVM":
          DataSourcePermissionsVM.validateJsonElement(jsonElement);
          break;
        case "DataSourceVM":
          DataSourceVM.validateJsonElement(jsonElement);
          break;
        case "DataSourcesVM":
          DataSourcesVM.validateJsonElement(jsonElement);
          break;
        case "DefaultPermissionsVM":
          DefaultPermissionsVM.validateJsonElement(jsonElement);
          break;
        case "DeleteApiKeyVM":
          DeleteApiKeyVM.validateJsonElement(jsonElement);
          break;
        case "EmailTaskVM":
          EmailTaskVM.validateJsonElement(jsonElement);
          break;
        case "ExportCreateAdminVM":
          ExportCreateAdminVM.validateJsonElement(jsonElement);
          break;
        case "ExportCreateVM":
          ExportCreateVM.validateJsonElement(jsonElement);
          break;
        case "ExportFolderCreateVM":
          ExportFolderCreateVM.validateJsonElement(jsonElement);
          break;
        case "ExportReportTaskVM":
          ExportReportTaskVM.validateJsonElement(jsonElement);
          break;
        case "ExportReportVM":
          ExportReportVM.validateJsonElement(jsonElement);
          break;
        case "ExportTemplateTaskVM":
          ExportTemplateTaskVM.validateJsonElement(jsonElement);
          break;
        case "ExportTemplateVM":
          ExportTemplateVM.validateJsonElement(jsonElement);
          break;
        case "ExportVM":
          ExportVM.validateJsonElement(jsonElement);
          break;
        case "ExportsVM":
          ExportsVM.validateJsonElement(jsonElement);
          break;
        case "FTPUploadTaskVM":
          FTPUploadTaskVM.validateJsonElement(jsonElement);
          break;
        case "FetchTaskVM":
          FetchTaskVM.validateJsonElement(jsonElement);
          break;
        case "FileContentVM":
          FileContentVM.validateJsonElement(jsonElement);
          break;
        case "FileCreateFormVM":
          FileCreateFormVM.validateJsonElement(jsonElement);
          break;
        case "FileCreateVM":
          FileCreateVM.validateJsonElement(jsonElement);
          break;
        case "FileIconVM":
          FileIconVM.validateJsonElement(jsonElement);
          break;
        case "FilePermissionCRUDVM":
          FilePermissionCRUDVM.validateJsonElement(jsonElement);
          break;
        case "FilePermissionsCRUDVM":
          FilePermissionsCRUDVM.validateJsonElement(jsonElement);
          break;
        case "FilePermissionsVM":
          FilePermissionsVM.validateJsonElement(jsonElement);
          break;
        case "FileRenameVM":
          FileRenameVM.validateJsonElement(jsonElement);
          break;
        case "FileStatusUpdateInternalVM":
          FileStatusUpdateInternalVM.validateJsonElement(jsonElement);
          break;
        case "FileStatusVM":
          FileStatusVM.validateJsonElement(jsonElement);
          break;
        case "FileTagsUpdateVM":
          FileTagsUpdateVM.validateJsonElement(jsonElement);
          break;
        case "FileThumbnailUpdateInternalVM":
          FileThumbnailUpdateInternalVM.validateJsonElement(jsonElement);
          break;
        case "FileUpdateVM":
          FileUpdateVM.validateJsonElement(jsonElement);
          break;
        case "FileVM":
          FileVM.validateJsonElement(jsonElement);
          break;
        case "FilesVM":
          FilesVM.validateJsonElement(jsonElement);
          break;
        case "FilesVMBase":
          FilesVMBase.validateJsonElement(jsonElement);
          break;
        case "FolderCreateVM":
          FolderCreateVM.validateJsonElement(jsonElement);
          break;
        case "FolderIconVM":
          FolderIconVM.validateJsonElement(jsonElement);
          break;
        case "FolderRenameVM":
          FolderRenameVM.validateJsonElement(jsonElement);
          break;
        case "FolderSizeVM":
          FolderSizeVM.validateJsonElement(jsonElement);
          break;
        case "FolderTagsUpdateVM":
          FolderTagsUpdateVM.validateJsonElement(jsonElement);
          break;
        case "FrontendAppVM":
          FrontendAppVM.validateJsonElement(jsonElement);
          break;
        case "GroupPermissionCRUDVM":
          GroupPermissionCRUDVM.validateJsonElement(jsonElement);
          break;
        case "GroupPermissionsCRUDVM":
          GroupPermissionsCRUDVM.validateJsonElement(jsonElement);
          break;
        case "GroupPermissionsVM":
          GroupPermissionsVM.validateJsonElement(jsonElement);
          break;
        case "GroupUserVM":
          GroupUserVM.validateJsonElement(jsonElement);
          break;
        case "GroupUsersVM":
          GroupUsersVM.validateJsonElement(jsonElement);
          break;
        case "GroupVM":
          GroupVM.validateJsonElement(jsonElement);
          break;
        case "GroupsVM":
          GroupsVM.validateJsonElement(jsonElement);
          break;
        case "InputFileVM":
          InputFileVM.validateJsonElement(jsonElement);
          break;
        case "MyPermissionsVM":
          MyPermissionsVM.validateJsonElement(jsonElement);
          break;
        case "OutputFileVM":
          OutputFileVM.validateJsonElement(jsonElement);
          break;
        case "PrepareTemplateTaskVM":
          PrepareTemplateTaskVM.validateJsonElement(jsonElement);
          break;
        case "PrepareTemplateVM":
          PrepareTemplateVM.validateJsonElement(jsonElement);
          break;
        case "PreviewReportVM":
          PreviewReportVM.validateJsonElement(jsonElement);
          break;
        case "PreviewTemplateVM":
          PreviewTemplateVM.validateJsonElement(jsonElement);
          break;
        case "RegisterUserVM":
          RegisterUserVM.validateJsonElement(jsonElement);
          break;
        case "RenameDataSourceVM":
          RenameDataSourceVM.validateJsonElement(jsonElement);
          break;
        case "RenameGroupVM":
          RenameGroupVM.validateJsonElement(jsonElement);
          break;
        case "RenameSubscriptionVM":
          RenameSubscriptionVM.validateJsonElement(jsonElement);
          break;
        case "ReportCreateAdminVM":
          ReportCreateAdminVM.validateJsonElement(jsonElement);
          break;
        case "ReportCreateFormVM":
          ReportCreateFormVM.validateJsonElement(jsonElement);
          break;
        case "ReportCreateVM":
          ReportCreateVM.validateJsonElement(jsonElement);
          break;
        case "ReportFolderCreateVM":
          ReportFolderCreateVM.validateJsonElement(jsonElement);
          break;
        case "ReportVM":
          ReportVM.validateJsonElement(jsonElement);
          break;
        case "ReportsVM":
          ReportsVM.validateJsonElement(jsonElement);
          break;
        case "RestOfSpaceVM":
          RestOfSpaceVM.validateJsonElement(jsonElement);
          break;
        case "RunEmailTaskVM":
          RunEmailTaskVM.validateJsonElement(jsonElement);
          break;
        case "RunExportReportTaskVM":
          RunExportReportTaskVM.validateJsonElement(jsonElement);
          break;
        case "RunExportTemplateTaskVM":
          RunExportTemplateTaskVM.validateJsonElement(jsonElement);
          break;
        case "RunFTPUploadTaskVM":
          RunFTPUploadTaskVM.validateJsonElement(jsonElement);
          break;
        case "RunFetchTaskVM":
          RunFetchTaskVM.validateJsonElement(jsonElement);
          break;
        case "RunInputFileVM":
          RunInputFileVM.validateJsonElement(jsonElement);
          break;
        case "RunPrepareTemplateTaskVM":
          RunPrepareTemplateTaskVM.validateJsonElement(jsonElement);
          break;
        case "RunTaskBaseVM":
          RunTaskBaseVM.validateJsonElement(jsonElement);
          break;
        case "RunThumbnailReportTaskVM":
          RunThumbnailReportTaskVM.validateJsonElement(jsonElement);
          break;
        case "RunThumbnailTemplateTaskVM":
          RunThumbnailTemplateTaskVM.validateJsonElement(jsonElement);
          break;
        case "RunTransformTaskBaseVM":
          RunTransformTaskBaseVM.validateJsonElement(jsonElement);
          break;
        case "RunTransportTaskBaseVM":
          RunTransportTaskBaseVM.validateJsonElement(jsonElement);
          break;
        case "RunWebhookTaskVM":
          RunWebhookTaskVM.validateJsonElement(jsonElement);
          break;
        case "SelectedFilesVM":
          SelectedFilesVM.validateJsonElement(jsonElement);
          break;
        case "ServerConfigurationVM":
          ServerConfigurationVM.validateJsonElement(jsonElement);
          break;
        case "SolvationReportVM":
          SolvationReportVM.validateJsonElement(jsonElement);
          break;
        case "SubscriptionInviteVM":
          SubscriptionInviteVM.validateJsonElement(jsonElement);
          break;
        case "SubscriptionInvitesVM":
          SubscriptionInvitesVM.validateJsonElement(jsonElement);
          break;
        case "SubscriptionPeriodVM":
          SubscriptionPeriodVM.validateJsonElement(jsonElement);
          break;
        case "SubscriptionPermissionCRUDVM":
          SubscriptionPermissionCRUDVM.validateJsonElement(jsonElement);
          break;
        case "SubscriptionPermissionsCRUDVM":
          SubscriptionPermissionsCRUDVM.validateJsonElement(jsonElement);
          break;
        case "SubscriptionPermissionsVM":
          SubscriptionPermissionsVM.validateJsonElement(jsonElement);
          break;
        case "SubscriptionPlanVM":
          SubscriptionPlanVM.validateJsonElement(jsonElement);
          break;
        case "SubscriptionPlansVM":
          SubscriptionPlansVM.validateJsonElement(jsonElement);
          break;
        case "SubscriptionUserVM":
          SubscriptionUserVM.validateJsonElement(jsonElement);
          break;
        case "SubscriptionUsersVM":
          SubscriptionUsersVM.validateJsonElement(jsonElement);
          break;
        case "SubscriptionVM":
          SubscriptionVM.validateJsonElement(jsonElement);
          break;
        case "SubscriptionsVM":
          SubscriptionsVM.validateJsonElement(jsonElement);
          break;
        case "TaskBaseVM":
          TaskBaseVM.validateJsonElement(jsonElement);
          break;
        case "TaskIdsVM":
          TaskIdsVM.validateJsonElement(jsonElement);
          break;
        case "TaskMessageIdVM":
          TaskMessageIdVM.validateJsonElement(jsonElement);
          break;
        case "TaskPermissionCRUDVM":
          TaskPermissionCRUDVM.validateJsonElement(jsonElement);
          break;
        case "TaskPermissionsCRUDVM":
          TaskPermissionsCRUDVM.validateJsonElement(jsonElement);
          break;
        case "TaskPermissionsVM":
          TaskPermissionsVM.validateJsonElement(jsonElement);
          break;
        case "TaskSettingsVM":
          TaskSettingsVM.validateJsonElement(jsonElement);
          break;
        case "TasksVM":
          TasksVM.validateJsonElement(jsonElement);
          break;
        case "TemplateContentVM":
          TemplateContentVM.validateJsonElement(jsonElement);
          break;
        case "TemplateCreateAdminVM":
          TemplateCreateAdminVM.validateJsonElement(jsonElement);
          break;
        case "TemplateCreateFormVM":
          TemplateCreateFormVM.validateJsonElement(jsonElement);
          break;
        case "TemplateCreateVM":
          TemplateCreateVM.validateJsonElement(jsonElement);
          break;
        case "TemplateFolderCreateVM":
          TemplateFolderCreateVM.validateJsonElement(jsonElement);
          break;
        case "TemplateVM":
          TemplateVM.validateJsonElement(jsonElement);
          break;
        case "TemplatesVM":
          TemplatesVM.validateJsonElement(jsonElement);
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
        case "UpdateContentInternalVM":
          UpdateContentInternalVM.validateJsonElement(jsonElement);
          break;
        case "UpdateDataSourceConnectionStringVM":
          UpdateDataSourceConnectionStringVM.validateJsonElement(jsonElement);
          break;
        case "UpdateDataSourcePermissionsVM":
          UpdateDataSourcePermissionsVM.validateJsonElement(jsonElement);
          break;
        case "UpdateDataSourceSubscriptionVM":
          UpdateDataSourceSubscriptionVM.validateJsonElement(jsonElement);
          break;
        case "UpdateDataSourceVM":
          UpdateDataSourceVM.validateJsonElement(jsonElement);
          break;
        case "UpdateDataVM":
          UpdateDataVM.validateJsonElement(jsonElement);
          break;
        case "UpdateDefaultPermissionsVM":
          UpdateDefaultPermissionsVM.validateJsonElement(jsonElement);
          break;
        case "UpdateEmailTaskVM":
          UpdateEmailTaskVM.validateJsonElement(jsonElement);
          break;
        case "UpdateExportReportTaskVM":
          UpdateExportReportTaskVM.validateJsonElement(jsonElement);
          break;
        case "UpdateExportTemplateTaskVM":
          UpdateExportTemplateTaskVM.validateJsonElement(jsonElement);
          break;
        case "UpdateFTPUploadTaskVM":
          UpdateFTPUploadTaskVM.validateJsonElement(jsonElement);
          break;
        case "UpdateFetchTaskVM":
          UpdateFetchTaskVM.validateJsonElement(jsonElement);
          break;
        case "UpdateFileContentFormVM":
          UpdateFileContentFormVM.validateJsonElement(jsonElement);
          break;
        case "UpdateFileContentInternalVM":
          UpdateFileContentInternalVM.validateJsonElement(jsonElement);
          break;
        case "UpdateFileContentVM":
          UpdateFileContentVM.validateJsonElement(jsonElement);
          break;
        case "UpdateFilePermissionsVM":
          UpdateFilePermissionsVM.validateJsonElement(jsonElement);
          break;
        case "UpdateGroupPermissionsVM":
          UpdateGroupPermissionsVM.validateJsonElement(jsonElement);
          break;
        case "UpdateGroupVM":
          UpdateGroupVM.validateJsonElement(jsonElement);
          break;
        case "UpdatePrepareTemplateTaskVM":
          UpdatePrepareTemplateTaskVM.validateJsonElement(jsonElement);
          break;
        case "UpdateSubscriptionLocaleVM":
          UpdateSubscriptionLocaleVM.validateJsonElement(jsonElement);
          break;
        case "UpdateSubscriptionPermissionsVM":
          UpdateSubscriptionPermissionsVM.validateJsonElement(jsonElement);
          break;
        case "UpdateSubscriptionPlanVM":
          UpdateSubscriptionPlanVM.validateJsonElement(jsonElement);
          break;
        case "UpdateSubscriptionVM":
          UpdateSubscriptionVM.validateJsonElement(jsonElement);
          break;
        case "UpdateTaskBaseVM":
          UpdateTaskBaseVM.validateJsonElement(jsonElement);
          break;
        case "UpdateTaskPermissionsVM":
          UpdateTaskPermissionsVM.validateJsonElement(jsonElement);
          break;
        case "UpdateThumbnailReportTaskVM":
          UpdateThumbnailReportTaskVM.validateJsonElement(jsonElement);
          break;
        case "UpdateThumbnailTemplateTaskVM":
          UpdateThumbnailTemplateTaskVM.validateJsonElement(jsonElement);
          break;
        case "UpdateTransformTaskBaseVM":
          UpdateTransformTaskBaseVM.validateJsonElement(jsonElement);
          break;
        case "UpdateTransportTaskBaseVM":
          UpdateTransportTaskBaseVM.validateJsonElement(jsonElement);
          break;
        case "UpdateUserProfileVM":
          UpdateUserProfileVM.validateJsonElement(jsonElement);
          break;
        case "UpdateUserSettingsVM":
          UpdateUserSettingsVM.validateJsonElement(jsonElement);
          break;
        case "UpdateUserVM":
          UpdateUserVM.validateJsonElement(jsonElement);
          break;
        case "UpdateWebhookTaskVM":
          UpdateWebhookTaskVM.validateJsonElement(jsonElement);
          break;
        case "UserIsAdminVM":
          UserIsAdminVM.validateJsonElement(jsonElement);
          break;
        case "UserProfileVM":
          UserProfileVM.validateJsonElement(jsonElement);
          break;
        case "UserResultVM":
          UserResultVM.validateJsonElement(jsonElement);
          break;
        case "UserSettingsVM":
          UserSettingsVM.validateJsonElement(jsonElement);
          break;
        case "UserVM":
          UserVM.validateJsonElement(jsonElement);
          break;
        case "UsersVM":
          UsersVM.validateJsonElement(jsonElement);
          break;
        case "WebhookTaskVM":
          WebhookTaskVM.validateJsonElement(jsonElement);
          break;
        default:
          throw new IllegalArgumentException(String.format("The value of the `$t` field `%s` does not match any key defined in the discriminator's mapping.", discriminatorValue));
      }
  }


 /**
  * Create an instance of CloudBaseVM given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CloudBaseVM
  * @throws IOException if the JSON string is invalid with respect to CloudBaseVM
  */
  public static CloudBaseVM fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudBaseVM.class);
  }

 /**
  * Convert an instance of CloudBaseVM to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

