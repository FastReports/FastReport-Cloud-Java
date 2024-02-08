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
import cloud.fastreport.model.UpdateTransportTaskBaseVM;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * UpdateFTPUploadTaskVM
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateFTPUploadTaskVM extends UpdateTransportTaskBaseVM {
  public static final String SERIALIZED_NAME_ARCHIVE = "archive";
  @SerializedName(SERIALIZED_NAME_ARCHIVE)
  private Boolean archive;

  public static final String SERIALIZED_NAME_ARCHIVE_NAME = "archiveName";
  @SerializedName(SERIALIZED_NAME_ARCHIVE_NAME)
  private String archiveName;

  public static final String SERIALIZED_NAME_DESTINATION_FOLDER = "destinationFolder";
  @SerializedName(SERIALIZED_NAME_DESTINATION_FOLDER)
  private String destinationFolder;

  public static final String SERIALIZED_NAME_FTP_HOST = "ftpHost";
  @SerializedName(SERIALIZED_NAME_FTP_HOST)
  private String ftpHost;

  public static final String SERIALIZED_NAME_FTP_PASSWORD = "ftpPassword";
  @SerializedName(SERIALIZED_NAME_FTP_PASSWORD)
  private String ftpPassword;

  public static final String SERIALIZED_NAME_FTP_PORT = "ftpPort";
  @SerializedName(SERIALIZED_NAME_FTP_PORT)
  private Integer ftpPort;

  public static final String SERIALIZED_NAME_FTP_USERNAME = "ftpUsername";
  @SerializedName(SERIALIZED_NAME_FTP_USERNAME)
  private String ftpUsername;

  public static final String SERIALIZED_NAME_USE_S_F_T_P = "useSFTP";
  @SerializedName(SERIALIZED_NAME_USE_S_F_T_P)
  private Boolean useSFTP;

  public UpdateFTPUploadTaskVM() {
    this.$t = this.getClass().getSimpleName();
  }

  public UpdateFTPUploadTaskVM archive(Boolean archive) {
    this.archive = archive;
    return this;
  }

   /**
   * Get archive
   * @return archive
  **/
  @javax.annotation.Nullable
  public Boolean getArchive() {
    return archive;
  }

  public void setArchive(Boolean archive) {
    this.archive = archive;
  }


  public UpdateFTPUploadTaskVM archiveName(String archiveName) {
    this.archiveName = archiveName;
    return this;
  }

   /**
   * Get archiveName
   * @return archiveName
  **/
  @javax.annotation.Nullable
  public String getArchiveName() {
    return archiveName;
  }

  public void setArchiveName(String archiveName) {
    this.archiveName = archiveName;
  }


  public UpdateFTPUploadTaskVM destinationFolder(String destinationFolder) {
    this.destinationFolder = destinationFolder;
    return this;
  }

   /**
   * Get destinationFolder
   * @return destinationFolder
  **/
  @javax.annotation.Nullable
  public String getDestinationFolder() {
    return destinationFolder;
  }

  public void setDestinationFolder(String destinationFolder) {
    this.destinationFolder = destinationFolder;
  }


  public UpdateFTPUploadTaskVM ftpHost(String ftpHost) {
    this.ftpHost = ftpHost;
    return this;
  }

   /**
   * Get ftpHost
   * @return ftpHost
  **/
  @javax.annotation.Nullable
  public String getFtpHost() {
    return ftpHost;
  }

  public void setFtpHost(String ftpHost) {
    this.ftpHost = ftpHost;
  }


  public UpdateFTPUploadTaskVM ftpPassword(String ftpPassword) {
    this.ftpPassword = ftpPassword;
    return this;
  }

   /**
   * Get ftpPassword
   * @return ftpPassword
  **/
  @javax.annotation.Nullable
  public String getFtpPassword() {
    return ftpPassword;
  }

  public void setFtpPassword(String ftpPassword) {
    this.ftpPassword = ftpPassword;
  }


  public UpdateFTPUploadTaskVM ftpPort(Integer ftpPort) {
    this.ftpPort = ftpPort;
    return this;
  }

   /**
   * Get ftpPort
   * @return ftpPort
  **/
  @javax.annotation.Nullable
  public Integer getFtpPort() {
    return ftpPort;
  }

  public void setFtpPort(Integer ftpPort) {
    this.ftpPort = ftpPort;
  }


  public UpdateFTPUploadTaskVM ftpUsername(String ftpUsername) {
    this.ftpUsername = ftpUsername;
    return this;
  }

   /**
   * Get ftpUsername
   * @return ftpUsername
  **/
  @javax.annotation.Nullable
  public String getFtpUsername() {
    return ftpUsername;
  }

  public void setFtpUsername(String ftpUsername) {
    this.ftpUsername = ftpUsername;
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
  public Boolean getUseSFTP() {
    return useSFTP;
  }

  public void setUseSFTP(Boolean useSFTP) {
    this.useSFTP = useSFTP;
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
    return Objects.equals(this.archive, updateFTPUploadTaskVM.archive) &&
        Objects.equals(this.archiveName, updateFTPUploadTaskVM.archiveName) &&
        Objects.equals(this.destinationFolder, updateFTPUploadTaskVM.destinationFolder) &&
        Objects.equals(this.ftpHost, updateFTPUploadTaskVM.ftpHost) &&
        Objects.equals(this.ftpPassword, updateFTPUploadTaskVM.ftpPassword) &&
        Objects.equals(this.ftpPort, updateFTPUploadTaskVM.ftpPort) &&
        Objects.equals(this.ftpUsername, updateFTPUploadTaskVM.ftpUsername) &&
        Objects.equals(this.useSFTP, updateFTPUploadTaskVM.useSFTP) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(archive, archiveName, destinationFolder, ftpHost, ftpPassword, ftpPort, ftpUsername, useSFTP, super.hashCode());
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("cronExpression");
    openapiFields.add("delayedRunTime");
    openapiFields.add("name");
    openapiFields.add("$t");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("$t");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateFTPUploadTaskVM
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateFTPUploadTaskVM.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateFTPUploadTaskVM is not found in the empty JSON string", UpdateFTPUploadTaskVM.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateFTPUploadTaskVM.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateFTPUploadTaskVM` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateFTPUploadTaskVM.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateFTPUploadTaskVM.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateFTPUploadTaskVM' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateFTPUploadTaskVM> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateFTPUploadTaskVM.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateFTPUploadTaskVM>() {
           @Override
           public void write(JsonWriter out, UpdateFTPUploadTaskVM value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateFTPUploadTaskVM read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateFTPUploadTaskVM given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateFTPUploadTaskVM
  * @throws IOException if the JSON string is invalid with respect to UpdateFTPUploadTaskVM
  */
  public static UpdateFTPUploadTaskVM fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateFTPUploadTaskVM.class);
  }

 /**
  * Convert an instance of UpdateFTPUploadTaskVM to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

