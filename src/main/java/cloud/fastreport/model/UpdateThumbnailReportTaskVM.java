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
import cloud.fastreport.model.UpdateEmailTaskVM;
import cloud.fastreport.model.UpdateExportReportTaskVM;
import cloud.fastreport.model.UpdateExportTemplateTaskVM;
import cloud.fastreport.model.UpdateFTPUploadTaskVM;
import cloud.fastreport.model.UpdateFetchTaskVM;
import cloud.fastreport.model.UpdatePrepareTemplateTaskVM;
import cloud.fastreport.model.UpdateTaskBaseVM;
import cloud.fastreport.model.UpdateThumbnailReportTaskVM;
import cloud.fastreport.model.UpdateThumbnailTemplateTaskVM;
import cloud.fastreport.model.UpdateWebhookTaskVM;
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
 * UpdateThumbnailReportTaskVM
 */
@JsonPropertyOrder({
  UpdateThumbnailReportTaskVM.JSON_PROPERTY_REPORT_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonIgnoreProperties(
  value = "$t", // ignore manually set $t, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the $t to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$t", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = UpdateEmailTaskVM.class, name = "UpdateEmailTaskVM"),
  @JsonSubTypes.Type(value = UpdateExportReportTaskVM.class, name = "UpdateExportReportTaskVM"),
  @JsonSubTypes.Type(value = UpdateExportTemplateTaskVM.class, name = "UpdateExportTemplateTaskVM"),
  @JsonSubTypes.Type(value = UpdateFTPUploadTaskVM.class, name = "UpdateFTPUploadTaskVM"),
  @JsonSubTypes.Type(value = UpdateFetchTaskVM.class, name = "UpdateFetchTaskVM"),
  @JsonSubTypes.Type(value = UpdatePrepareTemplateTaskVM.class, name = "UpdatePrepareTemplateTaskVM"),
  @JsonSubTypes.Type(value = UpdateTaskBaseVM.class, name = "UpdateTaskBaseVM"),
  @JsonSubTypes.Type(value = UpdateThumbnailReportTaskVM.class, name = "UpdateThumbnailReportTaskVM"),
  @JsonSubTypes.Type(value = UpdateThumbnailTemplateTaskVM.class, name = "UpdateThumbnailTemplateTaskVM"),
  @JsonSubTypes.Type(value = UpdateWebhookTaskVM.class, name = "UpdateWebhookTaskVM"),
})

public class UpdateThumbnailReportTaskVM extends UpdateTaskBaseVM {
  public static final String JSON_PROPERTY_REPORT_ID = "reportId";
  private JsonNullable<String> reportId = JsonNullable.<String>undefined();

  public UpdateThumbnailReportTaskVM() {

  }

  public UpdateThumbnailReportTaskVM reportId(String reportId) {
    this.reportId = JsonNullable.<String>of(reportId);
    
    return this;
  }

   /**
   * Get reportId
   * @return reportId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getReportId() {
        return reportId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REPORT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getReportId_JsonNullable() {
    return reportId;
  }
  
  @JsonProperty(JSON_PROPERTY_REPORT_ID)
  public void setReportId_JsonNullable(JsonNullable<String> reportId) {
    this.reportId = reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = JsonNullable.<String>of(reportId);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateThumbnailReportTaskVM updateThumbnailReportTaskVM = (UpdateThumbnailReportTaskVM) o;
    return equalsNullable(this.reportId, updateThumbnailReportTaskVM.reportId) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(reportId), super.hashCode());
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
    sb.append("class UpdateThumbnailReportTaskVM {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
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

