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
import cloud.fastreport.model.BreadcrumbsModel;
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
 * BreadcrumbsVM
 */
@JsonPropertyOrder({
  BreadcrumbsVM.JSON_PROPERTY_BREADCRUMBS
})
@JsonTypeName("BreadcrumbsVM")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BreadcrumbsVM {
  public static final String JSON_PROPERTY_BREADCRUMBS = "breadcrumbs";
  private List<BreadcrumbsModel> breadcrumbs = null;


  public BreadcrumbsVM breadcrumbs(List<BreadcrumbsModel> breadcrumbs) {
    
    this.breadcrumbs = breadcrumbs;
    return this;
  }

  public BreadcrumbsVM addBreadcrumbsItem(BreadcrumbsModel breadcrumbsItem) {
    if (this.breadcrumbs == null) {
      this.breadcrumbs = new ArrayList<>();
    }
    this.breadcrumbs.add(breadcrumbsItem);
    return this;
  }

   /**
   * Get breadcrumbs
   * @return breadcrumbs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BREADCRUMBS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BreadcrumbsModel> getBreadcrumbs() {
    return breadcrumbs;
  }


  public void setBreadcrumbs(List<BreadcrumbsModel> breadcrumbs) {
    this.breadcrumbs = breadcrumbs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BreadcrumbsVM breadcrumbsVM = (BreadcrumbsVM) o;
    return Objects.equals(this.breadcrumbs, breadcrumbsVM.breadcrumbs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breadcrumbs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreadcrumbsVM {\n");
    sb.append("    breadcrumbs: ").append(toIndentedString(breadcrumbs)).append("\n");
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

