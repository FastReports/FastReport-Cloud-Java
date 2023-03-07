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
import cloud.fastreport.model.RunTransportTaskBaseVM;
import cloud.fastreport.model.TaskType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * RunFTPUploadTaskVM
 */
@JsonPropertyOrder({
  RunFTPUploadTaskVM.JSON_PROPERTY_FTP_HOST,
  RunFTPUploadTaskVM.JSON_PROPERTY_FTP_PORT,
  RunFTPUploadTaskVM.JSON_PROPERTY_FTP_USERNAME,
  RunFTPUploadTaskVM.JSON_PROPERTY_FTP_PASSWORD,
  RunFTPUploadTaskVM.JSON_PROPERTY_DESTINATION_FOLDER,
  RunFTPUploadTaskVM.JSON_PROPERTY_ARCHIVE,
  RunFTPUploadTaskVM.JSON_PROPERTY_ARCHIVE_NAME,
  RunFTPUploadTaskVM.JSON_PROPERTY_USE_S_F_T_P,
  RunFTPUploadTaskVM.JSON_PROPERTY_SUBSCRIPTION_ID,
  RunFTPUploadTaskVM.JSON_PROPERTY_TYPE
})
@JsonTypeName("RunFTPUploadTaskVM")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RunFTPUploadTaskVM {
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

  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscriptionId";
  private JsonNullable<String> subscriptionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private TaskType type;


  public RunFTPUploadTaskVM ftpHost(String ftpHost) {
    this.ftpHost = JsonNullable.<String>of(ftpHost);
    
    return this;
  }

   /**
   * Get ftpHost
   * @return ftpHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public RunFTPUploadTaskVM ftpPort(Integer ftpPort) {
    this.ftpPort = JsonNullable.<Integer>of(ftpPort);
    
    return this;
  }

   /**
   * Get ftpPort
   * @return ftpPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public RunFTPUploadTaskVM ftpUsername(String ftpUsername) {
    this.ftpUsername = JsonNullable.<String>of(ftpUsername);
    
    return this;
  }

   /**
   * Get ftpUsername
   * @return ftpUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public RunFTPUploadTaskVM ftpPassword(String ftpPassword) {
    this.ftpPassword = JsonNullable.<String>of(ftpPassword);
    
    return this;
  }

   /**
   * Get ftpPassword
   * @return ftpPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public RunFTPUploadTaskVM destinationFolder(String destinationFolder) {
    this.destinationFolder = JsonNullable.<String>of(destinationFolder);
    
    return this;
  }

   /**
   * Get destinationFolder
   * @return destinationFolder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public RunFTPUploadTaskVM archive(Boolean archive) {
    this.archive = JsonNullable.<Boolean>of(archive);
    
    return this;
  }

   /**
   * Get archive
   * @return archive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public RunFTPUploadTaskVM archiveName(String archiveName) {
    this.archiveName = JsonNullable.<String>of(archiveName);
    
    return this;
  }

   /**
   * Get archiveName
   * @return archiveName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public RunFTPUploadTaskVM useSFTP(Boolean useSFTP) {
    
    this.useSFTP = useSFTP;
    return this;
  }

   /**
   * Get useSFTP
   * @return useSFTP
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public RunFTPUploadTaskVM subscriptionId(String subscriptionId) {
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


  public RunFTPUploadTaskVM type(TaskType type) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunFTPUploadTaskVM runFTPUploadTaskVM = (RunFTPUploadTaskVM) o;
    return Objects.equals(this.ftpHost, runFTPUploadTaskVM.ftpHost) &&
        Objects.equals(this.ftpPort, runFTPUploadTaskVM.ftpPort) &&
        Objects.equals(this.ftpUsername, runFTPUploadTaskVM.ftpUsername) &&
        Objects.equals(this.ftpPassword, runFTPUploadTaskVM.ftpPassword) &&
        Objects.equals(this.destinationFolder, runFTPUploadTaskVM.destinationFolder) &&
        Objects.equals(this.archive, runFTPUploadTaskVM.archive) &&
        Objects.equals(this.archiveName, runFTPUploadTaskVM.archiveName) &&
        Objects.equals(this.useSFTP, runFTPUploadTaskVM.useSFTP) &&
        Objects.equals(this.subscriptionId, runFTPUploadTaskVM.subscriptionId) &&
        Objects.equals(this.type, runFTPUploadTaskVM.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ftpHost, ftpPort, ftpUsername, ftpPassword, destinationFolder, archive, archiveName, useSFTP, subscriptionId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunFTPUploadTaskVM {\n");
    sb.append("    ftpHost: ").append(toIndentedString(ftpHost)).append("\n");
    sb.append("    ftpPort: ").append(toIndentedString(ftpPort)).append("\n");
    sb.append("    ftpUsername: ").append(toIndentedString(ftpUsername)).append("\n");
    sb.append("    ftpPassword: ").append(toIndentedString(ftpPassword)).append("\n");
    sb.append("    destinationFolder: ").append(toIndentedString(destinationFolder)).append("\n");
    sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
    sb.append("    archiveName: ").append(toIndentedString(archiveName)).append("\n");
    sb.append("    useSFTP: ").append(toIndentedString(useSFTP)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
