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
import cloud.fastreport.model.UpdateTransportTaskBaseVM;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import cloud.fastreport.JSON;
/**
 * UpdateFTPUploadTaskVM
 */
@JsonPropertyOrder({
  UpdateFTPUploadTaskVM.JSON_PROPERTY_ARCHIVE,
  UpdateFTPUploadTaskVM.JSON_PROPERTY_ARCHIVE_NAME,
  UpdateFTPUploadTaskVM.JSON_PROPERTY_DESTINATION_FOLDER,
  UpdateFTPUploadTaskVM.JSON_PROPERTY_FTP_HOST,
  UpdateFTPUploadTaskVM.JSON_PROPERTY_FTP_PASSWORD,
  UpdateFTPUploadTaskVM.JSON_PROPERTY_FTP_PORT,
  UpdateFTPUploadTaskVM.JSON_PROPERTY_FTP_USERNAME,
  UpdateFTPUploadTaskVM.JSON_PROPERTY_USE_S_F_T_P
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonIgnoreProperties(
  value = "$t", // ignore manually set $t, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the $t to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$t", visible = true)

public class UpdateFTPUploadTaskVM extends UpdateTransportTaskBaseVM {
  public static final String JSON_PROPERTY_ARCHIVE = "archive";
  private JsonNullable<Boolean> archive = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_ARCHIVE_NAME = "archiveName";
  private JsonNullable<String> archiveName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESTINATION_FOLDER = "destinationFolder";
  private JsonNullable<String> destinationFolder = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FTP_HOST = "ftpHost";
  private JsonNullable<String> ftpHost = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FTP_PASSWORD = "ftpPassword";
  private JsonNullable<String> ftpPassword = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FTP_PORT = "ftpPort";
  private JsonNullable<Integer> ftpPort = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_FTP_USERNAME = "ftpUsername";
  private JsonNullable<String> ftpUsername = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USE_S_F_T_P = "useSFTP";
  private JsonNullable<Boolean> useSFTP = JsonNullable.<Boolean>undefined();

  public UpdateFTPUploadTaskVM() { 
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


  public UpdateFTPUploadTaskVM useSFTP(Boolean useSFTP) {
    this.useSFTP = JsonNullable.<Boolean>of(useSFTP);
    return this;
  }

   /**
   * Get useSFTP
   * @return useSFTP
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getUseSFTP() {
        return useSFTP.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USE_S_F_T_P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getUseSFTP_JsonNullable() {
    return useSFTP;
  }
  
  @JsonProperty(JSON_PROPERTY_USE_S_F_T_P)
  public void setUseSFTP_JsonNullable(JsonNullable<Boolean> useSFTP) {
    this.useSFTP = useSFTP;
  }

  public void setUseSFTP(Boolean useSFTP) {
    this.useSFTP = JsonNullable.<Boolean>of(useSFTP);
  }


  @Override
  public UpdateFTPUploadTaskVM cronExpression(String cronExpression) {
    this.setCronExpression(cronExpression);
    return this;
  }

  @Override
  public UpdateFTPUploadTaskVM delayedRunTime(OffsetDateTime delayedRunTime) {
    this.setDelayedRunTime(delayedRunTime);
    return this;
  }

  @Override
  public UpdateFTPUploadTaskVM name(String name) {
    this.setName(name);
    return this;
  }

  /**
   * Return true if this UpdateFTPUploadTaskVM object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFTPUploadTaskVM updateFTPUploadTaskVM = (UpdateFTPUploadTaskVM) o;
    return equalsNullable(this.archive, updateFTPUploadTaskVM.archive) &&
        equalsNullable(this.archiveName, updateFTPUploadTaskVM.archiveName) &&
        equalsNullable(this.destinationFolder, updateFTPUploadTaskVM.destinationFolder) &&
        equalsNullable(this.ftpHost, updateFTPUploadTaskVM.ftpHost) &&
        equalsNullable(this.ftpPassword, updateFTPUploadTaskVM.ftpPassword) &&
        equalsNullable(this.ftpPort, updateFTPUploadTaskVM.ftpPort) &&
        equalsNullable(this.ftpUsername, updateFTPUploadTaskVM.ftpUsername) &&
        equalsNullable(this.useSFTP, updateFTPUploadTaskVM.useSFTP) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(archive), hashCodeNullable(archiveName), hashCodeNullable(destinationFolder), hashCodeNullable(ftpHost), hashCodeNullable(ftpPassword), hashCodeNullable(ftpPort), hashCodeNullable(ftpUsername), hashCodeNullable(useSFTP), super.hashCode());
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
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
    sb.append("    archiveName: ").append(toIndentedString(archiveName)).append("\n");
    sb.append("    destinationFolder: ").append(toIndentedString(destinationFolder)).append("\n");
    sb.append("    ftpHost: ").append(toIndentedString(ftpHost)).append("\n");
    sb.append("    ftpPassword: ").append(toIndentedString(ftpPassword)).append("\n");
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

    // add `cronExpression` to the URL query string
    if (getCronExpression() != null) {
      joiner.add(String.format("%scronExpression%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCronExpression()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `delayedRunTime` to the URL query string
    if (getDelayedRunTime() != null) {
      joiner.add(String.format("%sdelayedRunTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDelayedRunTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `$t` to the URL query string
    if (get$T() != null) {
      joiner.add(String.format("%s$t%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(get$T()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("UpdateFTPUploadTaskVM", UpdateFTPUploadTaskVM.class);
  JSON.registerDiscriminator(UpdateFTPUploadTaskVM.class, "$t", mappings);
}
}

