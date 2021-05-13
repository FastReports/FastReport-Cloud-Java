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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * FilePermission
 */
@JsonPropertyOrder({
  FilePermission.JSON_PROPERTY_CREATE,
  FilePermission.JSON_PROPERTY_DELETE,
  FilePermission.JSON_PROPERTY_EXECUTE,
  FilePermission.JSON_PROPERTY_GET,
  FilePermission.JSON_PROPERTY_UPDATE,
  FilePermission.JSON_PROPERTY_ADMINISTRATE
})
@JsonTypeName("FilePermission")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FilePermission {
  /**
   * Gets or Sets create
   */
  public enum CreateEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_MINUS_1(-1);

    private Integer value;

    CreateEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CreateEnum fromValue(Integer value) {
      for (CreateEnum b : CreateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CREATE = "create";
  private CreateEnum create;

  /**
   * Gets or Sets delete
   */
  public enum DeleteEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_MINUS_1(-1);

    private Integer value;

    DeleteEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DeleteEnum fromValue(Integer value) {
      for (DeleteEnum b : DeleteEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DELETE = "delete";
  private DeleteEnum delete;

  /**
   * Gets or Sets execute
   */
  public enum ExecuteEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_4(4),
    
    NUMBER_MINUS_1(-1);

    private Integer value;

    ExecuteEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ExecuteEnum fromValue(Integer value) {
      for (ExecuteEnum b : ExecuteEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_EXECUTE = "execute";
  private ExecuteEnum execute;

  /**
   * Gets or Sets get
   */
  public enum GetEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_4(4),
    
    NUMBER_8(8),
    
    NUMBER_16(16),
    
    NUMBER_MINUS_1(-1);

    private Integer value;

    GetEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GetEnum fromValue(Integer value) {
      for (GetEnum b : GetEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_GET = "get";
  private GetEnum get;

  /**
   * Gets or Sets update
   */
  public enum UpdateEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_4(4),
    
    NUMBER_8(8),
    
    NUMBER_MINUS_1(-1);

    private Integer value;

    UpdateEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static UpdateEnum fromValue(Integer value) {
      for (UpdateEnum b : UpdateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_UPDATE = "update";
  private UpdateEnum update;

  /**
   * Gets or Sets administrate
   */
  public enum AdministrateEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_4(4),
    
    NUMBER_8(8),
    
    NUMBER_MINUS_1(-1);

    private Integer value;

    AdministrateEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AdministrateEnum fromValue(Integer value) {
      for (AdministrateEnum b : AdministrateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ADMINISTRATE = "administrate";
  private AdministrateEnum administrate;


  public FilePermission create(CreateEnum create) {
    
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

  public CreateEnum getCreate() {
    return create;
  }


  @JsonProperty(JSON_PROPERTY_CREATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreate(CreateEnum create) {
    this.create = create;
  }


  public FilePermission delete(DeleteEnum delete) {
    
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

  public DeleteEnum getDelete() {
    return delete;
  }


  @JsonProperty(JSON_PROPERTY_DELETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDelete(DeleteEnum delete) {
    this.delete = delete;
  }


  public FilePermission execute(ExecuteEnum execute) {
    
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

  public ExecuteEnum getExecute() {
    return execute;
  }


  @JsonProperty(JSON_PROPERTY_EXECUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExecute(ExecuteEnum execute) {
    this.execute = execute;
  }


  public FilePermission get(GetEnum get) {
    
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

  public GetEnum getGet() {
    return get;
  }


  @JsonProperty(JSON_PROPERTY_GET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGet(GetEnum get) {
    this.get = get;
  }


  public FilePermission update(UpdateEnum update) {
    
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

  public UpdateEnum getUpdate() {
    return update;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdate(UpdateEnum update) {
    this.update = update;
  }


  public FilePermission administrate(AdministrateEnum administrate) {
    
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

  public AdministrateEnum getAdministrate() {
    return administrate;
  }


  @JsonProperty(JSON_PROPERTY_ADMINISTRATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdministrate(AdministrateEnum administrate) {
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
    FilePermission filePermission = (FilePermission) o;
    return Objects.equals(this.create, filePermission.create) &&
        Objects.equals(this.delete, filePermission.delete) &&
        Objects.equals(this.execute, filePermission.execute) &&
        Objects.equals(this.get, filePermission.get) &&
        Objects.equals(this.update, filePermission.update) &&
        Objects.equals(this.administrate, filePermission.administrate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, delete, execute, get, update, administrate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilePermission {\n");
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

