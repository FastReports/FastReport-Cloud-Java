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
import cloud.fastreport.model.CreateTransformTaskBaseVM;
import cloud.fastreport.model.ExportFormat;
import cloud.fastreport.model.TaskType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CreateExportReportTaskVM
 */
@JsonPropertyOrder({
  CreateExportReportTaskVM.JSON_PROPERTY_EXPORT_PARAMETERS,
  CreateExportReportTaskVM.JSON_PROPERTY_FORMAT,
  CreateExportReportTaskVM.JSON_PROPERTY_PAGES_COUNT,
  CreateExportReportTaskVM.JSON_PROPERTY_NAME,
  CreateExportReportTaskVM.JSON_PROPERTY_SUBSCRIPTION_ID,
  CreateExportReportTaskVM.JSON_PROPERTY_TYPE
})
@JsonTypeName("CreateExportReportTaskVM")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateExportReportTaskVM {
  public static final String JSON_PROPERTY_EXPORT_PARAMETERS = "exportParameters";
  private JsonNullable<Map<String, String>> exportParameters = JsonNullable.<Map<String, String>>undefined();

  public static final String JSON_PROPERTY_FORMAT = "format";
  private ExportFormat format;

  public static final String JSON_PROPERTY_PAGES_COUNT = "pagesCount";
  private JsonNullable<Integer> pagesCount = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscriptionId";
  private JsonNullable<String> subscriptionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private TaskType type;


  public CreateExportReportTaskVM exportParameters(Map<String, String> exportParameters) {
    this.exportParameters = JsonNullable.<Map<String, String>>of(exportParameters);
    
    return this;
  }

  public CreateExportReportTaskVM putExportParametersItem(String key, String exportParametersItem) {
    if (this.exportParameters == null || !this.exportParameters.isPresent()) {
      this.exportParameters = JsonNullable.<Map<String, String>>of(new HashMap<>());
    }
    try {
      this.exportParameters.get().put(key, exportParametersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get exportParameters
   * @return exportParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Map<String, String> getExportParameters() {
        return exportParameters.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPORT_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, String>> getExportParameters_JsonNullable() {
    return exportParameters;
  }
  
  @JsonProperty(JSON_PROPERTY_EXPORT_PARAMETERS)
  public void setExportParameters_JsonNullable(JsonNullable<Map<String, String>> exportParameters) {
    this.exportParameters = exportParameters;
  }

  public void setExportParameters(Map<String, String> exportParameters) {
    this.exportParameters = JsonNullable.<Map<String, String>>of(exportParameters);
  }


  public CreateExportReportTaskVM format(ExportFormat format) {
    
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExportFormat getFormat() {
    return format;
  }


  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormat(ExportFormat format) {
    this.format = format;
  }


  public CreateExportReportTaskVM pagesCount(Integer pagesCount) {
    this.pagesCount = JsonNullable.<Integer>of(pagesCount);
    
    return this;
  }

   /**
   * Get pagesCount
   * minimum: 0
   * maximum: 2147483647
   * @return pagesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getPagesCount() {
        return pagesCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAGES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getPagesCount_JsonNullable() {
    return pagesCount;
  }
  
  @JsonProperty(JSON_PROPERTY_PAGES_COUNT)
  public void setPagesCount_JsonNullable(JsonNullable<Integer> pagesCount) {
    this.pagesCount = pagesCount;
  }

  public void setPagesCount(Integer pagesCount) {
    this.pagesCount = JsonNullable.<Integer>of(pagesCount);
  }


  public CreateExportReportTaskVM name(String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public CreateExportReportTaskVM subscriptionId(String subscriptionId) {
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


  public CreateExportReportTaskVM type(TaskType type) {
    
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
    CreateExportReportTaskVM createExportReportTaskVM = (CreateExportReportTaskVM) o;
    return Objects.equals(this.exportParameters, createExportReportTaskVM.exportParameters) &&
        Objects.equals(this.format, createExportReportTaskVM.format) &&
        Objects.equals(this.pagesCount, createExportReportTaskVM.pagesCount) &&
        Objects.equals(this.name, createExportReportTaskVM.name) &&
        Objects.equals(this.subscriptionId, createExportReportTaskVM.subscriptionId) &&
        Objects.equals(this.type, createExportReportTaskVM.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportParameters, format, pagesCount, name, subscriptionId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateExportReportTaskVM {\n");
    sb.append("    exportParameters: ").append(toIndentedString(exportParameters)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    pagesCount: ").append(toIndentedString(pagesCount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

