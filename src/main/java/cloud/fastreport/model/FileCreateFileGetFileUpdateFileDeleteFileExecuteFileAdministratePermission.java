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
import cloud.fastreport.model.FileAdministrate;
import cloud.fastreport.model.FileCreate;
import cloud.fastreport.model.FileDelete;
import cloud.fastreport.model.FileExecute;
import cloud.fastreport.model.FileGet;
import cloud.fastreport.model.FileUpdate;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * FileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermission
 */
@JsonPropertyOrder({
  FileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermission.JSON_PROPERTY_CREATE,
  FileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermission.JSON_PROPERTY_DELETE,
  FileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermission.JSON_PROPERTY_EXECUTE,
  FileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermission.JSON_PROPERTY_GET,
  FileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermission.JSON_PROPERTY_UPDATE,
  FileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermission.JSON_PROPERTY_ADMINISTRATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermission {
  public static final String JSON_PROPERTY_CREATE = "create";
  private FileCreate create;

  public static final String JSON_PROPERTY_DELETE = "delete";
  private FileDelete delete;

  public static final String JSON_PROPERTY_EXECUTE = "execute";
  private FileExecute execute;

  public static final String JSON_PROPERTY_GET = "get";
  private FileGet get;

  public static final String JSON_PROPERTY_UPDATE = "update";
  private FileUpdate update;

  public static final String JSON_PROPERTY_ADMINISTRATE = "administrate";
  private FileAdministrate administrate;

  public FileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermission() {
  }

  public FileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermission create(FileCreate create) {
    
    this.create = create;
    return this;
  }

   /**
   * Get create
   * @return create
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileCreate getCreate() {
    return create;
  }


  @JsonProperty(JSON_PROPERTY_CREATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreate(FileCreate create) {
    this.create = create;
  }


  public FileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermission delete(FileDelete delete) {
    
    this.delete = delete;
    return this;
  }

   /**
   * Get delete
   * @return delete
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileDelete getDelete() {
    return delete;
  }


  @JsonProperty(JSON_PROPERTY_DELETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDelete(FileDelete delete) {
    this.delete = delete;
  }


  public FileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermission execute(FileExecute execute) {
    
    this.execute = execute;
    return this;
  }

   /**
   * Get execute
   * @return execute
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXECUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileExecute getExecute() {
    return execute;
  }


  @JsonProperty(JSON_PROPERTY_EXECUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExecute(FileExecute execute) {
    this.execute = execute;
  }


  public FileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermission get(FileGet get) {
    
    this.get = get;
    return this;
  }

   /**
   * Get get
   * @return get
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileGet getGet() {
    return get;
  }


  @JsonProperty(JSON_PROPERTY_GET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGet(FileGet get) {
    this.get = get;
  }


  public FileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermission update(FileUpdate update) {
    
    this.update = update;
    return this;
  }

   /**
   * Get update
   * @return update
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileUpdate getUpdate() {
    return update;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdate(FileUpdate update) {
    this.update = update;
  }


  public FileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermission administrate(FileAdministrate administrate) {
    
    this.administrate = administrate;
    return this;
  }

   /**
   * Get administrate
   * @return administrate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADMINISTRATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileAdministrate getAdministrate() {
    return administrate;
  }


  @JsonProperty(JSON_PROPERTY_ADMINISTRATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdministrate(FileAdministrate administrate) {
    this.administrate = administrate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermission fileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermission = (FileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermission) o;
    return Objects.equals(this.create, fileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermission.create) &&
        Objects.equals(this.delete, fileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermission.delete) &&
        Objects.equals(this.execute, fileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermission.execute) &&
        Objects.equals(this.get, fileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermission.get) &&
        Objects.equals(this.update, fileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermission.update) &&
        Objects.equals(this.administrate, fileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermission.administrate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, delete, execute, get, update, administrate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileCreateFileGetFileUpdateFileDeleteFileExecuteFileAdministratePermission {\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
    sb.append("    execute: ").append(toIndentedString(execute)).append("\n");
    sb.append("    get: ").append(toIndentedString(get)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    administrate: ").append(toIndentedString(administrate)).append("\n");
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

