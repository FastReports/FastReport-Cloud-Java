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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ExportFormat
 */
public enum ExportFormat {
  
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

  ExportFormat(String value) {
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
  public static ExportFormat fromValue(String value) {
    for (ExportFormat b : ExportFormat.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

