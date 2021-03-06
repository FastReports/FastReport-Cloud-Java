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
import cloud.fastreport.model.AppMixins;
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
 * FrontendApp
 */
@JsonPropertyOrder({
  FrontendApp.JSON_PROPERTY_MIXINS,
  FrontendApp.JSON_PROPERTY_INVARIANT_LOCALE
})
@JsonTypeName("FrontendApp")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FrontendApp {
  public static final String JSON_PROPERTY_MIXINS = "mixins";
  private AppMixins mixins;

  public static final String JSON_PROPERTY_INVARIANT_LOCALE = "invariantLocale";
  private JsonNullable<String> invariantLocale = JsonNullable.<String>undefined();


  public FrontendApp mixins(AppMixins mixins) {
    
    this.mixins = mixins;
    return this;
  }

   /**
   * Get mixins
   * @return mixins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MIXINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppMixins getMixins() {
    return mixins;
  }


  @JsonProperty(JSON_PROPERTY_MIXINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMixins(AppMixins mixins) {
    this.mixins = mixins;
  }


  public FrontendApp invariantLocale(String invariantLocale) {
    this.invariantLocale = JsonNullable.<String>of(invariantLocale);
    
    return this;
  }

   /**
   * Get invariantLocale
   * @return invariantLocale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getInvariantLocale() {
        return invariantLocale.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INVARIANT_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getInvariantLocale_JsonNullable() {
    return invariantLocale;
  }
  
  @JsonProperty(JSON_PROPERTY_INVARIANT_LOCALE)
  public void setInvariantLocale_JsonNullable(JsonNullable<String> invariantLocale) {
    this.invariantLocale = invariantLocale;
  }

  public void setInvariantLocale(String invariantLocale) {
    this.invariantLocale = JsonNullable.<String>of(invariantLocale);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrontendApp frontendApp = (FrontendApp) o;
    return Objects.equals(this.mixins, frontendApp.mixins) &&
        Objects.equals(this.invariantLocale, frontendApp.invariantLocale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mixins, invariantLocale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrontendApp {\n");
    sb.append("    mixins: ").append(toIndentedString(mixins)).append("\n");
    sb.append("    invariantLocale: ").append(toIndentedString(invariantLocale)).append("\n");
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

