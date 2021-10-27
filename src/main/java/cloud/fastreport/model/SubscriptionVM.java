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
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SubscriptionVM
 */
@JsonPropertyOrder({
  SubscriptionVM.JSON_PROPERTY_ID,
  SubscriptionVM.JSON_PROPERTY_NAME,
  SubscriptionVM.JSON_PROPERTY_LOCALE,
  SubscriptionVM.JSON_PROPERTY_CURRENT,
  SubscriptionVM.JSON_PROPERTY_OLD,
  SubscriptionVM.JSON_PROPERTY_TEMPLATES_FOLDER,
  SubscriptionVM.JSON_PROPERTY_REPORTS_FOLDER,
  SubscriptionVM.JSON_PROPERTY_EXPORTS_FOLDER
})
@JsonTypeName("SubscriptionVM")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubscriptionVM {
  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LOCALE = "locale";
  private JsonNullable<String> locale = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CURRENT = "current";
  private SubscriptionPeriodVM current;

  public static final String JSON_PROPERTY_OLD = "old";
  private JsonNullable<List<SubscriptionPeriodVM>> old = JsonNullable.<List<SubscriptionPeriodVM>>undefined();

  public static final String JSON_PROPERTY_TEMPLATES_FOLDER = "templatesFolder";
  private SubscriptionFolder templatesFolder;

  public static final String JSON_PROPERTY_REPORTS_FOLDER = "reportsFolder";
  private SubscriptionFolder reportsFolder;

  public static final String JSON_PROPERTY_EXPORTS_FOLDER = "exportsFolder";
  private SubscriptionFolder exportsFolder;


  public SubscriptionVM id(String id) {
    this.id = JsonNullable.<String>of(id);
    
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getId() {
        return id.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getId_JsonNullable() {
    return id;
  }
  
  @JsonProperty(JSON_PROPERTY_ID)
  public void setId_JsonNullable(JsonNullable<String> id) {
    this.id = id;
  }

  public void setId(String id) {
    this.id = JsonNullable.<String>of(id);
  }


  public SubscriptionVM name(String name) {
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


  public SubscriptionVM locale(String locale) {
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


  public SubscriptionVM current(SubscriptionPeriodVM current) {
    
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


  @JsonProperty(JSON_PROPERTY_CURRENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrent(SubscriptionPeriodVM current) {
    this.current = current;
  }


  public SubscriptionVM old(List<SubscriptionPeriodVM> old) {
    this.old = JsonNullable.<List<SubscriptionPeriodVM>>of(old);
    
    return this;
  }

  public SubscriptionVM addOldItem(SubscriptionPeriodVM oldItem) {
    if (this.old == null || !this.old.isPresent()) {
      this.old = JsonNullable.<List<SubscriptionPeriodVM>>of(new ArrayList<>());
    }
    try {
      this.old.get().add(oldItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get old
   * @return old
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<SubscriptionPeriodVM> getOld() {
        return old.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<SubscriptionPeriodVM>> getOld_JsonNullable() {
    return old;
  }
  
  @JsonProperty(JSON_PROPERTY_OLD)
  public void setOld_JsonNullable(JsonNullable<List<SubscriptionPeriodVM>> old) {
    this.old = old;
  }

  public void setOld(List<SubscriptionPeriodVM> old) {
    this.old = JsonNullable.<List<SubscriptionPeriodVM>>of(old);
  }


  public SubscriptionVM templatesFolder(SubscriptionFolder templatesFolder) {
    
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


  @JsonProperty(JSON_PROPERTY_TEMPLATES_FOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplatesFolder(SubscriptionFolder templatesFolder) {
    this.templatesFolder = templatesFolder;
  }


  public SubscriptionVM reportsFolder(SubscriptionFolder reportsFolder) {
    
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


  @JsonProperty(JSON_PROPERTY_REPORTS_FOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportsFolder(SubscriptionFolder reportsFolder) {
    this.reportsFolder = reportsFolder;
  }


  public SubscriptionVM exportsFolder(SubscriptionFolder exportsFolder) {
    
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


  @JsonProperty(JSON_PROPERTY_EXPORTS_FOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    SubscriptionVM subscriptionVM = (SubscriptionVM) o;
    return Objects.equals(this.id, subscriptionVM.id) &&
        Objects.equals(this.name, subscriptionVM.name) &&
        Objects.equals(this.locale, subscriptionVM.locale) &&
        Objects.equals(this.current, subscriptionVM.current) &&
        Objects.equals(this.old, subscriptionVM.old) &&
        Objects.equals(this.templatesFolder, subscriptionVM.templatesFolder) &&
        Objects.equals(this.reportsFolder, subscriptionVM.reportsFolder) &&
        Objects.equals(this.exportsFolder, subscriptionVM.exportsFolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, locale, current, old, templatesFolder, reportsFolder, exportsFolder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionVM {\n");
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

