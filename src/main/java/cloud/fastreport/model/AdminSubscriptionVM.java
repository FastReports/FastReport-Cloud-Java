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
import cloud.fastreport.model.DefaultPermissions;
import cloud.fastreport.model.SubscriptionFolder;
import cloud.fastreport.model.SubscriptionPeriodVM;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AdminSubscriptionVM
 */
@JsonPropertyOrder({
  AdminSubscriptionVM.JSON_PROPERTY_DEFAULT_PERMISSIONS,
  AdminSubscriptionVM.JSON_PROPERTY_ID,
  AdminSubscriptionVM.JSON_PROPERTY_NAME,
  AdminSubscriptionVM.JSON_PROPERTY_LOCALE,
  AdminSubscriptionVM.JSON_PROPERTY_CURRENT,
  AdminSubscriptionVM.JSON_PROPERTY_OLD,
  AdminSubscriptionVM.JSON_PROPERTY_TEMPLATES_FOLDER,
  AdminSubscriptionVM.JSON_PROPERTY_REPORTS_FOLDER,
  AdminSubscriptionVM.JSON_PROPERTY_EXPORTS_FOLDER
})
@JsonTypeName("AdminSubscriptionVM")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-22T14:13:34.806+03:00[Europe/Moscow]")
public class AdminSubscriptionVM {
  public static final String JSON_PROPERTY_DEFAULT_PERMISSIONS = "defaultPermissions";
  private DefaultPermissions defaultPermissions;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_LOCALE = "locale";
  private String locale;

  public static final String JSON_PROPERTY_CURRENT = "current";
  private SubscriptionPeriodVM current;

  public static final String JSON_PROPERTY_OLD = "old";
  private List<SubscriptionPeriodVM> old = null;

  public static final String JSON_PROPERTY_TEMPLATES_FOLDER = "templatesFolder";
  private SubscriptionFolder templatesFolder;

  public static final String JSON_PROPERTY_REPORTS_FOLDER = "reportsFolder";
  private SubscriptionFolder reportsFolder;

  public static final String JSON_PROPERTY_EXPORTS_FOLDER = "exportsFolder";
  private SubscriptionFolder exportsFolder;


  public AdminSubscriptionVM defaultPermissions(DefaultPermissions defaultPermissions) {
    
    this.defaultPermissions = defaultPermissions;
    return this;
  }

   /**
   * Get defaultPermissions
   * @return defaultPermissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DefaultPermissions getDefaultPermissions() {
    return defaultPermissions;
  }


  public void setDefaultPermissions(DefaultPermissions defaultPermissions) {
    this.defaultPermissions = defaultPermissions;
  }


  public AdminSubscriptionVM id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AdminSubscriptionVM name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AdminSubscriptionVM locale(String locale) {
    
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


  public AdminSubscriptionVM current(SubscriptionPeriodVM current) {
    
    this.current = current;
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionPeriodVM getCurrent() {
    return current;
  }


  public void setCurrent(SubscriptionPeriodVM current) {
    this.current = current;
  }


  public AdminSubscriptionVM old(List<SubscriptionPeriodVM> old) {
    
    this.old = old;
    return this;
  }

  public AdminSubscriptionVM addOldItem(SubscriptionPeriodVM oldItem) {
    if (this.old == null) {
      this.old = new ArrayList<>();
    }
    this.old.add(oldItem);
    return this;
  }

   /**
   * Get old
   * @return old
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SubscriptionPeriodVM> getOld() {
    return old;
  }


  public void setOld(List<SubscriptionPeriodVM> old) {
    this.old = old;
  }


  public AdminSubscriptionVM templatesFolder(SubscriptionFolder templatesFolder) {
    
    this.templatesFolder = templatesFolder;
    return this;
  }

   /**
   * Get templatesFolder
   * @return templatesFolder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEMPLATES_FOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionFolder getTemplatesFolder() {
    return templatesFolder;
  }


  public void setTemplatesFolder(SubscriptionFolder templatesFolder) {
    this.templatesFolder = templatesFolder;
  }


  public AdminSubscriptionVM reportsFolder(SubscriptionFolder reportsFolder) {
    
    this.reportsFolder = reportsFolder;
    return this;
  }

   /**
   * Get reportsFolder
   * @return reportsFolder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPORTS_FOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionFolder getReportsFolder() {
    return reportsFolder;
  }


  public void setReportsFolder(SubscriptionFolder reportsFolder) {
    this.reportsFolder = reportsFolder;
  }


  public AdminSubscriptionVM exportsFolder(SubscriptionFolder exportsFolder) {
    
    this.exportsFolder = exportsFolder;
    return this;
  }

   /**
   * Get exportsFolder
   * @return exportsFolder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPORTS_FOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionFolder getExportsFolder() {
    return exportsFolder;
  }


  public void setExportsFolder(SubscriptionFolder exportsFolder) {
    this.exportsFolder = exportsFolder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminSubscriptionVM adminSubscriptionVM = (AdminSubscriptionVM) o;
    return Objects.equals(this.defaultPermissions, adminSubscriptionVM.defaultPermissions) &&
        Objects.equals(this.id, adminSubscriptionVM.id) &&
        Objects.equals(this.name, adminSubscriptionVM.name) &&
        Objects.equals(this.locale, adminSubscriptionVM.locale) &&
        Objects.equals(this.current, adminSubscriptionVM.current) &&
        Objects.equals(this.old, adminSubscriptionVM.old) &&
        Objects.equals(this.templatesFolder, adminSubscriptionVM.templatesFolder) &&
        Objects.equals(this.reportsFolder, adminSubscriptionVM.reportsFolder) &&
        Objects.equals(this.exportsFolder, adminSubscriptionVM.exportsFolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultPermissions, id, name, locale, current, old, templatesFolder, reportsFolder, exportsFolder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminSubscriptionVM {\n");
    sb.append("    defaultPermissions: ").append(toIndentedString(defaultPermissions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    old: ").append(toIndentedString(old)).append("\n");
    sb.append("    templatesFolder: ").append(toIndentedString(templatesFolder)).append("\n");
    sb.append("    reportsFolder: ").append(toIndentedString(reportsFolder)).append("\n");
    sb.append("    exportsFolder: ").append(toIndentedString(exportsFolder)).append("\n");
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

