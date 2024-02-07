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
import cloud.fastreport.model.TransportTaskBaseVM;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
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
 * FTPUploadTaskVM
 */
@JsonPropertyOrder({
  FTPUploadTaskVM.JSON_PROPERTY_ARCHIVE,
  FTPUploadTaskVM.JSON_PROPERTY_ARCHIVE_NAME,
  FTPUploadTaskVM.JSON_PROPERTY_DESTINATION_FOLDER,
  FTPUploadTaskVM.JSON_PROPERTY_FTP_HOST,
  FTPUploadTaskVM.JSON_PROPERTY_FTP_PORT,
  FTPUploadTaskVM.JSON_PROPERTY_FTP_USERNAME,
  FTPUploadTaskVM.JSON_PROPERTY_USE_S_F_T_P
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonIgnoreProperties(
  value = "$t", // ignore manually set $t, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the $t to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$t", visible = true)

public class FTPUploadTaskVM extends TransportTaskBaseVM {
  public static final String JSON_PROPERTY_ARCHIVE = "archive";
  private Boolean archive;

  public static final String JSON_PROPERTY_ARCHIVE_NAME = "archiveName";
  private JsonNullable<String> archiveName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESTINATION_FOLDER = "destinationFolder";
  private JsonNullable<String> destinationFolder = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FTP_HOST = "ftpHost";
  private JsonNullable<String> ftpHost = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FTP_PORT = "ftpPort";
  private Integer ftpPort;

  public static final String JSON_PROPERTY_FTP_USERNAME = "ftpUsername";
  private JsonNullable<String> ftpUsername = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USE_S_F_T_P = "useSFTP";
  private Boolean useSFTP;

  public FTPUploadTaskVM() {

  }

  public FTPUploadTaskVM archive(Boolean archive) {
    
    this.archive = archive;
    return this;
  }

   /**
   * Get archive
   * @return archive
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARCHIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getArchive() {
    return archive;
  }


  @JsonProperty(JSON_PROPERTY_ARCHIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArchive(Boolean archive) {
    this.archive = archive;
  }


  public FTPUploadTaskVM archiveName(String archiveName) {
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


  public FTPUploadTaskVM destinationFolder(String destinationFolder) {
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


  public FTPUploadTaskVM ftpHost(String ftpHost) {
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


  public FTPUploadTaskVM ftpPort(Integer ftpPort) {
    
    this.ftpPort = ftpPort;
    return this;
  }

   /**
   * Get ftpPort
   * @return ftpPort
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FTP_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFtpPort() {
    return ftpPort;
  }


  @JsonProperty(JSON_PROPERTY_FTP_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFtpPort(Integer ftpPort) {
    this.ftpPort = ftpPort;
  }


  public FTPUploadTaskVM ftpUsername(String ftpUsername) {
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


  public FTPUploadTaskVM useSFTP(Boolean useSFTP) {
    
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

  @Override
  public FTPUploadTaskVM cronExpression(String cronExpression) {
    this.setCronExpression(cronExpression);
    return this;
  }

  @Override
  public FTPUploadTaskVM delayedRunTime(OffsetDateTime delayedRunTime) {
    this.setDelayedRunTime(delayedRunTime);
    return this;
  }

  @Override
  public FTPUploadTaskVM delayedWasRunTime(OffsetDateTime delayedWasRunTime) {
    this.setDelayedWasRunTime(delayedWasRunTime);
    return this;
  }

  @Override
  public FTPUploadTaskVM id(String id) {
    this.setId(id);
    return this;
  }

  @Override
  public FTPUploadTaskVM name(String name) {
    this.setName(name);
    return this;
  }

  @Override
  public FTPUploadTaskVM recurrentRunTime(OffsetDateTime recurrentRunTime) {
    this.setRecurrentRunTime(recurrentRunTime);
    return this;
  }

  @Override
  public FTPUploadTaskVM recurrentWasRunTime(OffsetDateTime recurrentWasRunTime) {
    this.setRecurrentWasRunTime(recurrentWasRunTime);
    return this;
  }

  @Override
  public FTPUploadTaskVM subscriptionId(String subscriptionId) {
    this.setSubscriptionId(subscriptionId);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FTPUploadTaskVM ftPUploadTaskVM = (FTPUploadTaskVM) o;
    return Objects.equals(this.archive, ftPUploadTaskVM.archive) &&
        equalsNullable(this.archiveName, ftPUploadTaskVM.archiveName) &&
        equalsNullable(this.destinationFolder, ftPUploadTaskVM.destinationFolder) &&
        equalsNullable(this.ftpHost, ftPUploadTaskVM.ftpHost) &&
        Objects.equals(this.ftpPort, ftPUploadTaskVM.ftpPort) &&
        equalsNullable(this.ftpUsername, ftPUploadTaskVM.ftpUsername) &&
        Objects.equals(this.useSFTP, ftPUploadTaskVM.useSFTP) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(archive, hashCodeNullable(archiveName), hashCodeNullable(destinationFolder), hashCodeNullable(ftpHost), ftpPort, hashCodeNullable(ftpUsername), useSFTP, super.hashCode());
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
    sb.append("class FTPUploadTaskVM {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
    sb.append("    archiveName: ").append(toIndentedString(archiveName)).append("\n");
    sb.append("    destinationFolder: ").append(toIndentedString(destinationFolder)).append("\n");
    sb.append("    ftpHost: ").append(toIndentedString(ftpHost)).append("\n");
    sb.append("    ftpPort: ").append(toIndentedString(ftpPort)).append("\n");
    sb.append("    ftpUsername: ").append(toIndentedString(ftpUsername)).append("\n");
    sb.append("    useSFTP: ").append(toIndentedString(useSFTP)).append("\n");
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

