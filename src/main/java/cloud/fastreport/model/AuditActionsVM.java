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
import cloud.fastreport.model.AuditActionVM;
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
 * AuditActionsVM
 */
@JsonPropertyOrder({
  AuditActionsVM.JSON_PROPERTY_ITEMS,
  AuditActionsVM.JSON_PROPERTY_COUNT,
  AuditActionsVM.JSON_PROPERTY_SKIP,
  AuditActionsVM.JSON_PROPERTY_TAKE
})
@JsonTypeName("AuditActionsVM")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuditActionsVM {
  public static final String JSON_PROPERTY_ITEMS = "items";
  private JsonNullable<List<AuditActionVM>> items = JsonNullable.<List<AuditActionVM>>undefined();

  public static final String JSON_PROPERTY_COUNT = "count";
  private Long count;

  public static final String JSON_PROPERTY_SKIP = "skip";
  private Integer skip;

  public static final String JSON_PROPERTY_TAKE = "take";
  private Integer take;


  public AuditActionsVM items(List<AuditActionVM> items) {
    this.items = JsonNullable.<List<AuditActionVM>>of(items);
    
    return this;
  }

  public AuditActionsVM addItemsItem(AuditActionVM itemsItem) {
    if (this.items == null || !this.items.isPresent()) {
      this.items = JsonNullable.<List<AuditActionVM>>of(new ArrayList<>());
    }
    try {
      this.items.get().add(itemsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<AuditActionVM> getItems() {
        return items.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AuditActionVM>> getItems_JsonNullable() {
    return items;
  }
  
  @JsonProperty(JSON_PROPERTY_ITEMS)
  public void setItems_JsonNullable(JsonNullable<List<AuditActionVM>> items) {
    this.items = items;
  }

  public void setItems(List<AuditActionVM> items) {
    this.items = JsonNullable.<List<AuditActionVM>>of(items);
  }


  public AuditActionsVM count(Long count) {
    
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


  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCount(Long count) {
    this.count = count;
  }


  public AuditActionsVM skip(Integer skip) {
    
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


  @JsonProperty(JSON_PROPERTY_SKIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkip(Integer skip) {
    this.skip = skip;
  }


  public AuditActionsVM take(Integer take) {
    
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


  @JsonProperty(JSON_PROPERTY_TAKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    AuditActionsVM auditActionsVM = (AuditActionsVM) o;
    return Objects.equals(this.items, auditActionsVM.items) &&
        Objects.equals(this.count, auditActionsVM.count) &&
        Objects.equals(this.skip, auditActionsVM.skip) &&
        Objects.equals(this.take, auditActionsVM.take);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, count, skip, take);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditActionsVM {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

