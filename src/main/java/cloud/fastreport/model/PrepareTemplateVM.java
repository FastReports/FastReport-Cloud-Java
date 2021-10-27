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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * PrepareTemplateVM
 */
@JsonPropertyOrder({
  PrepareTemplateVM.JSON_PROPERTY_NAME,
  PrepareTemplateVM.JSON_PROPERTY_LOCALE,
  PrepareTemplateVM.JSON_PROPERTY_PARENT_FOLDER_ID,
  PrepareTemplateVM.JSON_PROPERTY_PAGES_COUNT,
  PrepareTemplateVM.JSON_PROPERTY_REPORT_PARAMETERS
})
@JsonTypeName("PrepareTemplateVM")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PrepareTemplateVM {
  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LOCALE = "locale";
  private JsonNullable<String> locale = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PARENT_FOLDER_ID = "parentFolderId";
  private JsonNullable<String> parentFolderId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PAGES_COUNT = "pagesCount";
  private JsonNullable<Integer> pagesCount = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_REPORT_PARAMETERS = "reportParameters";
  private JsonNullable<Map<String, String>> reportParameters = JsonNullable.<Map<String, String>>undefined();


  public PrepareTemplateVM name(String name) {
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


  public PrepareTemplateVM locale(String locale) {
    this.locale = JsonNullable.<String>of(locale);
    
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getLocale() {
        return locale.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLocale_JsonNullable() {
    return locale;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCALE)
  public void setLocale_JsonNullable(JsonNullable<String> locale) {
    this.locale = locale;
  }

  public void setLocale(String locale) {
    this.locale = JsonNullable.<String>of(locale);
  }


  public PrepareTemplateVM parentFolderId(String parentFolderId) {
    this.parentFolderId = JsonNullable.<String>of(parentFolderId);
    
    return this;
  }

   /**
   * Get parentFolderId
   * @return parentFolderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getParentFolderId() {
        return parentFolderId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARENT_FOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getParentFolderId_JsonNullable() {
    return parentFolderId;
  }
  
  @JsonProperty(JSON_PROPERTY_PARENT_FOLDER_ID)
  public void setParentFolderId_JsonNullable(JsonNullable<String> parentFolderId) {
    this.parentFolderId = parentFolderId;
  }

  public void setParentFolderId(String parentFolderId) {
    this.parentFolderId = JsonNullable.<String>of(parentFolderId);
  }


  public PrepareTemplateVM pagesCount(Integer pagesCount) {
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


  public PrepareTemplateVM reportParameters(Map<String, String> reportParameters) {
    this.reportParameters = JsonNullable.<Map<String, String>>of(reportParameters);
    
    return this;
  }

  public PrepareTemplateVM putReportParametersItem(String key, String reportParametersItem) {
    if (this.reportParameters == null || !this.reportParameters.isPresent()) {
      this.reportParameters = JsonNullable.<Map<String, String>>of(new HashMap<>());
    }
    try {
      this.reportParameters.get().put(key, reportParametersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get reportParameters
   * @return reportParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Map<String, String> getReportParameters() {
        return reportParameters.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REPORT_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, String>> getReportParameters_JsonNullable() {
    return reportParameters;
  }
  
  @JsonProperty(JSON_PROPERTY_REPORT_PARAMETERS)
  public void setReportParameters_JsonNullable(JsonNullable<Map<String, String>> reportParameters) {
    this.reportParameters = reportParameters;
  }

  public void setReportParameters(Map<String, String> reportParameters) {
    this.reportParameters = JsonNullable.<Map<String, String>>of(reportParameters);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrepareTemplateVM prepareTemplateVM = (PrepareTemplateVM) o;
    return Objects.equals(this.name, prepareTemplateVM.name) &&
        Objects.equals(this.locale, prepareTemplateVM.locale) &&
        Objects.equals(this.parentFolderId, prepareTemplateVM.parentFolderId) &&
        Objects.equals(this.pagesCount, prepareTemplateVM.pagesCount) &&
        Objects.equals(this.reportParameters, prepareTemplateVM.reportParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, locale, parentFolderId, pagesCount, reportParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepareTemplateVM {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    parentFolderId: ").append(toIndentedString(parentFolderId)).append("\n");
    sb.append("    pagesCount: ").append(toIndentedString(pagesCount)).append("\n");
    sb.append("    reportParameters: ").append(toIndentedString(reportParameters)).append("\n");
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

