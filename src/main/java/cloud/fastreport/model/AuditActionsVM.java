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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AuditActionsVM
 */
@JsonPropertyOrder({
  AuditActionsVM.JSON_PROPERTY_ITEMS,
  AuditActionsVM.JSON_PROPERTY_HAS_MORE,
  AuditActionsVM.JSON_PROPERTY_SKIP,
  AuditActionsVM.JSON_PROPERTY_TAKE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuditActionsVM {
  public static final String JSON_PROPERTY_ITEMS = "items";
  private JsonNullable<List<AuditActionVM>> items = JsonNullable.<List<AuditActionVM>>undefined();

  public static final String JSON_PROPERTY_HAS_MORE = "hasMore";
  private Boolean hasMore;

  public static final String JSON_PROPERTY_SKIP = "skip";
  private Integer skip;

  public static final String JSON_PROPERTY_TAKE = "take";
  private Integer take;

  public AuditActionsVM() {
  }

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


  public AuditActionsVM hasMore(Boolean hasMore) {
    
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Get hasMore
   * @return hasMore
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_MORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasMore() {
    return hasMore;
  }


  @JsonProperty(JSON_PROPERTY_HAS_MORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
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
    return equalsNullable(this.items, auditActionsVM.items) &&
        Objects.equals(this.hasMore, auditActionsVM.hasMore) &&
        Objects.equals(this.skip, auditActionsVM.skip) &&
        Objects.equals(this.take, auditActionsVM.take);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(items), hasMore, skip, take);
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
    sb.append("class AuditActionsVM {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
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

