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
import cloud.fastreport.model.DataSourceVM;
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
 * DataSourcesVM
 */
@JsonPropertyOrder({
  DataSourcesVM.JSON_PROPERTY_DATA_SOURCES,
  DataSourcesVM.JSON_PROPERTY_COUNT,
  DataSourcesVM.JSON_PROPERTY_SKIP,
  DataSourcesVM.JSON_PROPERTY_TAKE
})
@JsonTypeName("DataSourcesVM")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-22T14:13:34.806+03:00[Europe/Moscow]")
public class DataSourcesVM {
  public static final String JSON_PROPERTY_DATA_SOURCES = "dataSources";
  private List<DataSourceVM> dataSources = null;

  public static final String JSON_PROPERTY_COUNT = "count";
  private Long count;

  public static final String JSON_PROPERTY_SKIP = "skip";
  private Integer skip;

  public static final String JSON_PROPERTY_TAKE = "take";
  private Integer take;


  public DataSourcesVM dataSources(List<DataSourceVM> dataSources) {
    
    this.dataSources = dataSources;
    return this;
  }

  public DataSourcesVM addDataSourcesItem(DataSourceVM dataSourcesItem) {
    if (this.dataSources == null) {
      this.dataSources = new ArrayList<>();
    }
    this.dataSources.add(dataSourcesItem);
    return this;
  }

   /**
   * Get dataSources
   * @return dataSources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DataSourceVM> getDataSources() {
    return dataSources;
  }


  public void setDataSources(List<DataSourceVM> dataSources) {
    this.dataSources = dataSources;
  }


  public DataSourcesVM count(Long count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCount() {
    return count;
  }


  public void setCount(Long count) {
    this.count = count;
  }


  public DataSourcesVM skip(Integer skip) {
    
    this.skip = skip;
    return this;
  }

   /**
   * Get skip
   * @return skip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SKIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSkip() {
    return skip;
  }


  public void setSkip(Integer skip) {
    this.skip = skip;
  }


  public DataSourcesVM take(Integer take) {
    
    this.take = take;
    return this;
  }

   /**
   * Get take
   * @return take
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTake() {
    return take;
  }


  public void setTake(Integer take) {
    this.take = take;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataSourcesVM dataSourcesVM = (DataSourcesVM) o;
    return Objects.equals(this.dataSources, dataSourcesVM.dataSources) &&
        Objects.equals(this.count, dataSourcesVM.count) &&
        Objects.equals(this.skip, dataSourcesVM.skip) &&
        Objects.equals(this.take, dataSourcesVM.take);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSources, count, skip, take);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSourcesVM {\n");
    sb.append("    dataSources: ").append(toIndentedString(dataSources)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
    sb.append("    take: ").append(toIndentedString(take)).append("\n");
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

