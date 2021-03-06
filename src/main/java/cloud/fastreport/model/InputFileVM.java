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
import cloud.fastreport.model.FileKind;
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
 * InputFileVM
 */
@JsonPropertyOrder({
  InputFileVM.JSON_PROPERTY_ENTITY_ID,
  InputFileVM.JSON_PROPERTY_FILE_NAME,
  InputFileVM.JSON_PROPERTY_TYPE
})
@JsonTypeName("InputFileVM")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InputFileVM {
  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  private JsonNullable<String> entityId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private JsonNullable<String> fileName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private FileKind type;


  public InputFileVM entityId(String entityId) {
    this.entityId = JsonNullable.<String>of(entityId);
    
    return this;
  }

   /**
   * Get entityId
   * @return entityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getEntityId() {
        return entityId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEntityId_JsonNullable() {
    return entityId;
  }
  
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  public void setEntityId_JsonNullable(JsonNullable<String> entityId) {
    this.entityId = entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = JsonNullable.<String>of(entityId);
  }


  public InputFileVM fileName(String fileName) {
    this.fileName = JsonNullable.<String>of(fileName);
    
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getFileName() {
        return fileName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFileName_JsonNullable() {
    return fileName;
  }
  
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  public void setFileName_JsonNullable(JsonNullable<String> fileName) {
    this.fileName = fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = JsonNullable.<String>of(fileName);
  }


  public InputFileVM type(FileKind type) {
    
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

  public FileKind getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(FileKind type) {
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
    InputFileVM inputFileVM = (InputFileVM) o;
    return Objects.equals(this.entityId, inputFileVM.entityId) &&
        Objects.equals(this.fileName, inputFileVM.fileName) &&
        Objects.equals(this.type, inputFileVM.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, fileName, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputFileVM {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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

