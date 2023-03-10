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
import cloud.fastreport.model.FileVM;
import cloud.fastreport.model.ReportInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * ReportVM
 */
@JsonPropertyOrder({
  ReportVM.JSON_PROPERTY_TEMPLATE_ID,
  ReportVM.JSON_PROPERTY_REPORT_INFO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportVM extends FileVM {
  public static final String JSON_PROPERTY_TEMPLATE_ID = "templateId";
  private JsonNullable<String> templateId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REPORT_INFO = "reportInfo";
  private ReportInfo reportInfo;

  public ReportVM() {

  }

  public ReportVM templateId(String templateId) {
    this.templateId = JsonNullable.<String>of(templateId);
    
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getTemplateId() {
        return templateId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTemplateId_JsonNullable() {
    return templateId;
  }
  
  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  public void setTemplateId_JsonNullable(JsonNullable<String> templateId) {
    this.templateId = templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = JsonNullable.<String>of(templateId);
  }


  public ReportVM reportInfo(ReportInfo reportInfo) {
    
    this.reportInfo = reportInfo;
    return this;
  }

   /**
   * Get reportInfo
   * @return reportInfo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPORT_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportInfo getReportInfo() {
    return reportInfo;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportInfo(ReportInfo reportInfo) {
    this.reportInfo = reportInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportVM reportVM = (ReportVM) o;
    return equalsNullable(this.templateId, reportVM.templateId) &&
        Objects.equals(this.reportInfo, reportVM.reportInfo) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(templateId), reportInfo, super.hashCode());
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
    sb.append("class ReportVM {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    reportInfo: ").append(toIndentedString(reportInfo)).append("\n");
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

