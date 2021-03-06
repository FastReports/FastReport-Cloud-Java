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
import cloud.fastreport.model.DataSourceAdministrate;
import cloud.fastreport.model.DataSourceCreate;
import cloud.fastreport.model.DataSourceDelete;
import cloud.fastreport.model.DataSourceExecute;
import cloud.fastreport.model.DataSourceGet;
import cloud.fastreport.model.DataSourceUpdate;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DataSourceCreateDataSourceGetDataSourceUpdateDataSourceDeleteDataSourceExecuteDataSourceAdministratePermission
 */
@JsonPropertyOrder({
  DataSourceCreateDataSourceGetDataSourceUpdateDataSourceDeleteDataSourceExecuteDataSourceAdministratePermission.JSON_PROPERTY_CREATE,
  DataSourceCreateDataSourceGetDataSourceUpdateDataSourceDeleteDataSourceExecuteDataSourceAdministratePermission.JSON_PROPERTY_DELETE,
  DataSourceCreateDataSourceGetDataSourceUpdateDataSourceDeleteDataSourceExecuteDataSourceAdministratePermission.JSON_PROPERTY_EXECUTE,
  DataSourceCreateDataSourceGetDataSourceUpdateDataSourceDeleteDataSourceExecuteDataSourceAdministratePermission.JSON_PROPERTY_GET,
  DataSourceCreateDataSourceGetDataSourceUpdateDataSourceDeleteDataSourceExecuteDataSourceAdministratePermission.JSON_PROPERTY_UPDATE,
  DataSourceCreateDataSourceGetDataSourceUpdateDataSourceDeleteDataSourceExecuteDataSourceAdministratePermission.JSON_PROPERTY_ADMINISTRATE
})
@JsonTypeName("DataSourceCreateDataSourceGetDataSourceUpdateDataSourceDeleteDataSourceExecuteDataSourceAdministratePermission")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DataSourceCreateDataSourceGetDataSourceUpdateDataSourceDeleteDataSourceExecuteDataSourceAdministratePermission {
  public static final String JSON_PROPERTY_CREATE = "create";
  private DataSourceCreate create;

  public static final String JSON_PROPERTY_DELETE = "delete";
  private DataSourceDelete delete;

  public static final String JSON_PROPERTY_EXECUTE = "execute";
  private DataSourceExecute execute;

  public static final String JSON_PROPERTY_GET = "get";
  private DataSourceGet get;

  public static final String JSON_PROPERTY_UPDATE = "update";
  private DataSourceUpdate update;

  public static final String JSON_PROPERTY_ADMINISTRATE = "administrate";
  private DataSourceAdministrate administrate;


  public DataSourceCreateDataSourceGetDataSourceUpdateDataSourceDeleteDataSourceExecuteDataSourceAdministratePermission create(DataSourceCreate create) {
    
    this.create = create;
    return this;
  }

   /**
   * Get create
   * @return create
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DataSourceCreate getCreate() {
    return create;
  }


  @JsonProperty(JSON_PROPERTY_CREATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreate(DataSourceCreate create) {
    this.create = create;
  }


  public DataSourceCreateDataSourceGetDataSourceUpdateDataSourceDeleteDataSourceExecuteDataSourceAdministratePermission delete(DataSourceDelete delete) {
    
    this.delete = delete;
    return this;
  }

   /**
   * Get delete
   * @return delete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DataSourceDelete getDelete() {
    return delete;
  }


  @JsonProperty(JSON_PROPERTY_DELETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDelete(DataSourceDelete delete) {
    this.delete = delete;
  }


  public DataSourceCreateDataSourceGetDataSourceUpdateDataSourceDeleteDataSourceExecuteDataSourceAdministratePermission execute(DataSourceExecute execute) {
    
    this.execute = execute;
    return this;
  }

   /**
   * Get execute
   * @return execute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXECUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DataSourceExecute getExecute() {
    return execute;
  }


  @JsonProperty(JSON_PROPERTY_EXECUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExecute(DataSourceExecute execute) {
    this.execute = execute;
  }


  public DataSourceCreateDataSourceGetDataSourceUpdateDataSourceDeleteDataSourceExecuteDataSourceAdministratePermission get(DataSourceGet get) {
    
    this.get = get;
    return this;
  }

   /**
   * Get get
   * @return get
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DataSourceGet getGet() {
    return get;
  }


  @JsonProperty(JSON_PROPERTY_GET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGet(DataSourceGet get) {
    this.get = get;
  }


  public DataSourceCreateDataSourceGetDataSourceUpdateDataSourceDeleteDataSourceExecuteDataSourceAdministratePermission update(DataSourceUpdate update) {
    
    this.update = update;
    return this;
  }

   /**
   * Get update
   * @return update
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DataSourceUpdate getUpdate() {
    return update;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdate(DataSourceUpdate update) {
    this.update = update;
  }


  public DataSourceCreateDataSourceGetDataSourceUpdateDataSourceDeleteDataSourceExecuteDataSourceAdministratePermission administrate(DataSourceAdministrate administrate) {
    
    this.administrate = administrate;
    return this;
  }

   /**
   * Get administrate
   * @return administrate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADMINISTRATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DataSourceAdministrate getAdministrate() {
    return administrate;
  }


  @JsonProperty(JSON_PROPERTY_ADMINISTRATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdministrate(DataSourceAdministrate administrate) {
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
    DataSourceCreateDataSourceGetDataSourceUpdateDataSourceDeleteDataSourceExecuteDataSourceAdministratePermission dataSourceCreateDataSourceGetDataSourceUpdateDataSourceDeleteDataSourceExecuteDataSourceAdministratePermission = (DataSourceCreateDataSourceGetDataSourceUpdateDataSourceDeleteDataSourceExecuteDataSourceAdministratePermission) o;
    return Objects.equals(this.create, dataSourceCreateDataSourceGetDataSourceUpdateDataSourceDeleteDataSourceExecuteDataSourceAdministratePermission.create) &&
        Objects.equals(this.delete, dataSourceCreateDataSourceGetDataSourceUpdateDataSourceDeleteDataSourceExecuteDataSourceAdministratePermission.delete) &&
        Objects.equals(this.execute, dataSourceCreateDataSourceGetDataSourceUpdateDataSourceDeleteDataSourceExecuteDataSourceAdministratePermission.execute) &&
        Objects.equals(this.get, dataSourceCreateDataSourceGetDataSourceUpdateDataSourceDeleteDataSourceExecuteDataSourceAdministratePermission.get) &&
        Objects.equals(this.update, dataSourceCreateDataSourceGetDataSourceUpdateDataSourceDeleteDataSourceExecuteDataSourceAdministratePermission.update) &&
        Objects.equals(this.administrate, dataSourceCreateDataSourceGetDataSourceUpdateDataSourceDeleteDataSourceExecuteDataSourceAdministratePermission.administrate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, delete, execute, get, update, administrate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSourceCreateDataSourceGetDataSourceUpdateDataSourceDeleteDataSourceExecuteDataSourceAdministratePermission {\n");
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

