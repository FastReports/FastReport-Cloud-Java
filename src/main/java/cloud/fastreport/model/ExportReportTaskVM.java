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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ExportReportTaskVM
 */
@JsonPropertyOrder({
  ExportReportTaskVM.JSON_PROPERTY_FILE_NAME,
  ExportReportTaskVM.JSON_PROPERTY_FOLDER_ID,
  ExportReportTaskVM.JSON_PROPERTY_LOCALE,
  ExportReportTaskVM.JSON_PROPERTY_PAGES_COUNT,
  ExportReportTaskVM.JSON_PROPERTY_FORMAT,
  ExportReportTaskVM.JSON_PROPERTY_EXPORT_PARAMETERS
})
@JsonTypeName("ExportReportTaskVM")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExportReportTaskVM {
  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private String fileName;

  public static final String JSON_PROPERTY_FOLDER_ID = "folderId";
  private String folderId;

  public static final String JSON_PROPERTY_LOCALE = "locale";
  private String locale;

  public static final String JSON_PROPERTY_PAGES_COUNT = "pagesCount";
  private Integer pagesCount;

  /**
   * Gets or Sets format
   */
  public enum FormatEnum {
    PDF("Pdf"),
    
    HTML("Html"),
    
    MHT("Mht"),
    
    IMAGE("Image"),
    
    BIFF8("Biff8"),
    
    CSV("Csv"),
    
    DBF("Dbf"),
    
    JSON("Json"),
    
    LATEX("LaTeX"),
    
    ODT("Odt"),
    
    ODS("Ods"),
    
    DOCX("Docx"),
    
    PPTX("Pptx"),
    
    XLSX("Xlsx"),
    
    XPS("Xps"),
    
    PPML("Ppml"),
    
    PS("PS"),
    
    RICHTEXT("Richtext"),
    
    SVG("Svg"),
    
    TEXT("Text"),
    
    XAML("Xaml"),
    
    XML("Xml"),
    
    ZPL("Zpl");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FORMAT = "format";
  private FormatEnum format;

  public static final String JSON_PROPERTY_EXPORT_PARAMETERS = "exportParameters";
  private Map<String, Object> exportParameters = null;


  public ExportReportTaskVM fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public ExportReportTaskVM folderId(String folderId) {
    
    this.folderId = folderId;
    return this;
  }

   /**
   * Get folderId
   * @return folderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFolderId() {
    return folderId;
  }


  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }


  public ExportReportTaskVM locale(String locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocale() {
    return locale;
  }


  public void setLocale(String locale) {
    this.locale = locale;
  }


  public ExportReportTaskVM pagesCount(Integer pagesCount) {
    
    this.pagesCount = pagesCount;
    return this;
  }

   /**
   * Get pagesCount
   * @return pagesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPagesCount() {
    return pagesCount;
  }


  public void setPagesCount(Integer pagesCount) {
    this.pagesCount = pagesCount;
  }


  public ExportReportTaskVM format(FormatEnum format) {
    
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

  public FormatEnum getFormat() {
    return format;
  }


  public void setFormat(FormatEnum format) {
    this.format = format;
  }


  public ExportReportTaskVM exportParameters(Map<String, Object> exportParameters) {
    
    this.exportParameters = exportParameters;
    return this;
  }

  public ExportReportTaskVM putExportParametersItem(String key, Object exportParametersItem) {
    if (this.exportParameters == null) {
      this.exportParameters = new HashMap<>();
    }
    this.exportParameters.put(key, exportParametersItem);
    return this;
  }

   /**
   * Get exportParameters
   * @return exportParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPORT_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getExportParameters() {
    return exportParameters;
  }


  public void setExportParameters(Map<String, Object> exportParameters) {
    this.exportParameters = exportParameters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportReportTaskVM exportReportTaskVM = (ExportReportTaskVM) o;
    return Objects.equals(this.fileName, exportReportTaskVM.fileName) &&
        Objects.equals(this.folderId, exportReportTaskVM.folderId) &&
        Objects.equals(this.locale, exportReportTaskVM.locale) &&
        Objects.equals(this.pagesCount, exportReportTaskVM.pagesCount) &&
        Objects.equals(this.format, exportReportTaskVM.format) &&
        Objects.equals(this.exportParameters, exportReportTaskVM.exportParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, folderId, locale, pagesCount, format, exportParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportReportTaskVM {\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    pagesCount: ").append(toIndentedString(pagesCount)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    exportParameters: ").append(toIndentedString(exportParameters)).append("\n");
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

