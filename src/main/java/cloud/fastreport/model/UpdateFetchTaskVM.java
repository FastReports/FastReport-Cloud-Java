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
import cloud.fastreport.model.UpdateTaskBaseVM;
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
 * UpdateFetchTaskVM
 */
@JsonPropertyOrder({
  UpdateFetchTaskVM.JSON_PROPERTY_DATA_SOURCE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonIgnoreProperties(
  value = "$t", // ignore manually set $t, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the $t to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$t", visible = true)

public class UpdateFetchTaskVM extends UpdateTaskBaseVM {
  public static final String JSON_PROPERTY_DATA_SOURCE_ID = "dataSourceId";
  private JsonNullable<String> dataSourceId = JsonNullable.<String>undefined();

  public UpdateFetchTaskVM() {

  }

  public UpdateFetchTaskVM dataSourceId(String dataSourceId) {
    this.dataSourceId = JsonNullable.<String>of(dataSourceId);
    
    return this;
  }

   /**
   * Get dataSourceId
   * @return dataSourceId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getDataSourceId() {
        return dataSourceId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATA_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDataSourceId_JsonNullable() {
    return dataSourceId;
  }
  
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE_ID)
  public void setDataSourceId_JsonNullable(JsonNullable<String> dataSourceId) {
    this.dataSourceId = dataSourceId;
  }

  public void setDataSourceId(String dataSourceId) {
    this.dataSourceId = JsonNullable.<String>of(dataSourceId);
  }

  @Override
  public UpdateFetchTaskVM cronExpression(String cronExpression) {
    this.setCronExpression(cronExpression);
    return this;
  }

  @Override
  public UpdateFetchTaskVM delayedRunTime(OffsetDateTime delayedRunTime) {
    this.setDelayedRunTime(delayedRunTime);
    return this;
  }

  @Override
  public UpdateFetchTaskVM name(String name) {
    this.setName(name);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFetchTaskVM updateFetchTaskVM = (UpdateFetchTaskVM) o;
    return equalsNullable(this.dataSourceId, updateFetchTaskVM.dataSourceId) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(dataSourceId), super.hashCode());
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
    sb.append("class UpdateFetchTaskVM {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dataSourceId: ").append(toIndentedString(dataSourceId)).append("\n");
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

