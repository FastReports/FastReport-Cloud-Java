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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateFTPUploadTaskVM
 */
@JsonPropertyOrder({
  UpdateFTPUploadTaskVM.JSON_PROPERTY_FTP_HOST,
  UpdateFTPUploadTaskVM.JSON_PROPERTY_FTP_PORT,
  UpdateFTPUploadTaskVM.JSON_PROPERTY_FTP_USERNAME,
  UpdateFTPUploadTaskVM.JSON_PROPERTY_FTP_PASSWORD,
  UpdateFTPUploadTaskVM.JSON_PROPERTY_DESTINATION_FOLDER,
  UpdateFTPUploadTaskVM.JSON_PROPERTY_ARCHIVE,
  UpdateFTPUploadTaskVM.JSON_PROPERTY_ARCHIVE_NAME,
  UpdateFTPUploadTaskVM.JSON_PROPERTY_USE_S_F_T_P,
  UpdateFTPUploadTaskVM.JSON_PROPERTY_NAME,
  UpdateFTPUploadTaskVM.JSON_PROPERTY_SUBSCRIPTION_ID,
  UpdateFTPUploadTaskVM.JSON_PROPERTY_TYPE,
  UpdateFTPUploadTaskVM.JSON_PROPERTY_DELAYED_RUN_TIME,
  UpdateFTPUploadTaskVM.JSON_PROPERTY_CRON_EXPRESSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateFTPUploadTaskVM {
  public static final String JSON_PROPERTY_FTP_HOST = "ftpHost";
  private JsonNullable<String> ftpHost = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FTP_PORT = "ftpPort";
  private JsonNullable<Integer> ftpPort = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_FTP_USERNAME = "ftpUsername";
  private JsonNullable<String> ftpUsername = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FTP_PASSWORD = "ftpPassword";
  private JsonNullable<String> ftpPassword = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESTINATION_FOLDER = "destinationFolder";
  private JsonNullable<String> destinationFolder = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ARCHIVE = "archive";
  private JsonNullable<Boolean> archive = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_ARCHIVE_NAME = "archiveName";
  private JsonNullable<String> archiveName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USE_S_F_T_P = "useSFTP";
  private Boolean useSFTP;

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

  public UpdateFTPUploadTaskVM() {
  }

  public UpdateFTPUploadTaskVM ftpHost(String ftpHost) {
    this.ftpHost = JsonNullable.<String>of(ftpHost);
    
    return this;
  }

   /**
   * Get ftpHost
   * @return ftpHost
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getFtpHost() {
        return ftpHost.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FTP_HOST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFtpHost_JsonNullable() {
    return ftpHost;
  }
  
  @JsonProperty(JSON_PROPERTY_FTP_HOST)
  public void setFtpHost_JsonNullable(JsonNullable<String> ftpHost) {
    this.ftpHost = ftpHost;
  }

  public void setFtpHost(String ftpHost) {
    this.ftpHost = JsonNullable.<String>of(ftpHost);
  }


  public UpdateFTPUploadTaskVM ftpPort(Integer ftpPort) {
    this.ftpPort = JsonNullable.<Integer>of(ftpPort);
    
    return this;
  }

   /**
   * Get ftpPort
   * @return ftpPort
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getFtpPort() {
        return ftpPort.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FTP_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getFtpPort_JsonNullable() {
    return ftpPort;
  }
  
  @JsonProperty(JSON_PROPERTY_FTP_PORT)
  public void setFtpPort_JsonNullable(JsonNullable<Integer> ftpPort) {
    this.ftpPort = ftpPort;
  }

  public void setFtpPort(Integer ftpPort) {
    this.ftpPort = JsonNullable.<Integer>of(ftpPort);
  }


  public UpdateFTPUploadTaskVM ftpUsername(String ftpUsername) {
    this.ftpUsername = JsonNullable.<String>of(ftpUsername);
    
    return this;
  }

   /**
   * Get ftpUsername
   * @return ftpUsername
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getFtpUsername() {
        return ftpUsername.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FTP_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFtpUsername_JsonNullable() {
    return ftpUsername;
  }
  
  @JsonProperty(JSON_PROPERTY_FTP_USERNAME)
  public void setFtpUsername_JsonNullable(JsonNullable<String> ftpUsername) {
    this.ftpUsername = ftpUsername;
  }

  public void setFtpUsername(String ftpUsername) {
    this.ftpUsername = JsonNullable.<String>of(ftpUsername);
  }


  public UpdateFTPUploadTaskVM ftpPassword(String ftpPassword) {
    this.ftpPassword = JsonNullable.<String>of(ftpPassword);
    
    return this;
  }

   /**
   * Get ftpPassword
   * @return ftpPassword
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getFtpPassword() {
        return ftpPassword.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FTP_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFtpPassword_JsonNullable() {
    return ftpPassword;
  }
  
  @JsonProperty(JSON_PROPERTY_FTP_PASSWORD)
  public void setFtpPassword_JsonNullable(JsonNullable<String> ftpPassword) {
    this.ftpPassword = ftpPassword;
  }

  public void setFtpPassword(String ftpPassword) {
    this.ftpPassword = JsonNullable.<String>of(ftpPassword);
  }


  public UpdateFTPUploadTaskVM destinationFolder(String destinationFolder) {
    this.destinationFolder = JsonNullable.<String>of(destinationFolder);
    
    return this;
  }

   /**
   * Get destinationFolder
   * @return destinationFolder
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getDestinationFolder() {
        return destinationFolder.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESTINATION_FOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDestinationFolder_JsonNullable() {
    return destinationFolder;
  }
  
  @JsonProperty(JSON_PROPERTY_DESTINATION_FOLDER)
  public void setDestinationFolder_JsonNullable(JsonNullable<String> destinationFolder) {
    this.destinationFolder = destinationFolder;
  }

  public void setDestinationFolder(String destinationFolder) {
    this.destinationFolder = JsonNullable.<String>of(destinationFolder);
  }


  public UpdateFTPUploadTaskVM archive(Boolean archive) {
    this.archive = JsonNullable.<Boolean>of(archive);
    
    return this;
  }

   /**
   * Get archive
   * @return archive
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getArchive() {
        return archive.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ARCHIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getArchive_JsonNullable() {
    return archive;
  }
  
  @JsonProperty(JSON_PROPERTY_ARCHIVE)
  public void setArchive_JsonNullable(JsonNullable<Boolean> archive) {
    this.archive = archive;
  }

  public void setArchive(Boolean archive) {
    this.archive = JsonNullable.<Boolean>of(archive);
  }


  public UpdateFTPUploadTaskVM archiveName(String archiveName) {
    this.archiveName = JsonNullable.<String>of(archiveName);
    
    return this;
  }

   /**
   * Get archiveName
   * @return archiveName
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getArchiveName() {
        return archiveName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ARCHIVE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getArchiveName_JsonNullable() {
    return archiveName;
  }
  
  @JsonProperty(JSON_PROPERTY_ARCHIVE_NAME)
  public void setArchiveName_JsonNullable(JsonNullable<String> archiveName) {
    this.archiveName = archiveName;
  }

  public void setArchiveName(String archiveName) {
    this.archiveName = JsonNullable.<String>of(archiveName);
  }


  public UpdateFTPUploadTaskVM useSFTP(Boolean useSFTP) {
    
    this.useSFTP = useSFTP;
    return this;
  }

   /**
   * Get useSFTP
   * @return useSFTP
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_S_F_T_P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseSFTP() {
    return useSFTP;
  }


  @JsonProperty(JSON_PROPERTY_USE_S_F_T_P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseSFTP(Boolean useSFTP) {
    this.useSFTP = useSFTP;
  }


  public UpdateFTPUploadTaskVM name(String name) {
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


  public UpdateFTPUploadTaskVM subscriptionId(String subscriptionId) {
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


  public UpdateFTPUploadTaskVM type(TaskType type) {
    
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


  public UpdateFTPUploadTaskVM delayedRunTime(OffsetDateTime delayedRunTime) {
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


  public UpdateFTPUploadTaskVM cronExpression(String cronExpression) {
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
    UpdateFTPUploadTaskVM updateFTPUploadTaskVM = (UpdateFTPUploadTaskVM) o;
    return equalsNullable(this.ftpHost, updateFTPUploadTaskVM.ftpHost) &&
        equalsNullable(this.ftpPort, updateFTPUploadTaskVM.ftpPort) &&
        equalsNullable(this.ftpUsername, updateFTPUploadTaskVM.ftpUsername) &&
        equalsNullable(this.ftpPassword, updateFTPUploadTaskVM.ftpPassword) &&
        equalsNullable(this.destinationFolder, updateFTPUploadTaskVM.destinationFolder) &&
        equalsNullable(this.archive, updateFTPUploadTaskVM.archive) &&
        equalsNullable(this.archiveName, updateFTPUploadTaskVM.archiveName) &&
        Objects.equals(this.useSFTP, updateFTPUploadTaskVM.useSFTP) &&
        equalsNullable(this.name, updateFTPUploadTaskVM.name) &&
        equalsNullable(this.subscriptionId, updateFTPUploadTaskVM.subscriptionId) &&
        Objects.equals(this.type, updateFTPUploadTaskVM.type) &&
        equalsNullable(this.delayedRunTime, updateFTPUploadTaskVM.delayedRunTime) &&
        equalsNullable(this.cronExpression, updateFTPUploadTaskVM.cronExpression);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(ftpHost), hashCodeNullable(ftpPort), hashCodeNullable(ftpUsername), hashCodeNullable(ftpPassword), hashCodeNullable(destinationFolder), hashCodeNullable(archive), hashCodeNullable(archiveName), useSFTP, hashCodeNullable(name), hashCodeNullable(subscriptionId), type, hashCodeNullable(delayedRunTime), hashCodeNullable(cronExpression));
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
    sb.append("class UpdateFTPUploadTaskVM {\n");
    sb.append("    ftpHost: ").append(toIndentedString(ftpHost)).append("\n");
    sb.append("    ftpPort: ").append(toIndentedString(ftpPort)).append("\n");
    sb.append("    ftpUsername: ").append(toIndentedString(ftpUsername)).append("\n");
    sb.append("    ftpPassword: ").append(toIndentedString(ftpPassword)).append("\n");
    sb.append("    destinationFolder: ").append(toIndentedString(destinationFolder)).append("\n");
    sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
    sb.append("    archiveName: ").append(toIndentedString(archiveName)).append("\n");
    sb.append("    useSFTP: ").append(toIndentedString(useSFTP)).append("\n");
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

