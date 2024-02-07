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
import cloud.fastreport.model.DataSourceConnectionType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateDataSourceVM
 */
@JsonPropertyOrder({
  CreateDataSourceVM.JSON_PROPERTY_NAME,
  CreateDataSourceVM.JSON_PROPERTY_CONNECTION_STRING,
  CreateDataSourceVM.JSON_PROPERTY_SUBSCRIPTION_ID,
  CreateDataSourceVM.JSON_PROPERTY_CONNECTION_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateDataSourceVM {
  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONNECTION_STRING = "connectionString";
  private String connectionString;

  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscriptionId";
  private String subscriptionId;

  public static final String JSON_PROPERTY_CONNECTION_TYPE = "connectionType";
  private DataSourceConnectionType connectionType;

  public CreateDataSourceVM() {
  }

  public CreateDataSourceVM name(String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
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


  public CreateDataSourceVM connectionString(String connectionString) {
    
    this.connectionString = connectionString;
    return this;
  }

   /**
   * Get connectionString
   * @return connectionString
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONNECTION_STRING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConnectionString() {
    return connectionString;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_STRING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnectionString(String connectionString) {
    this.connectionString = connectionString;
  }


  public CreateDataSourceVM subscriptionId(String subscriptionId) {
    
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Get subscriptionId
   * @return subscriptionId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSubscriptionId() {
    return subscriptionId;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  public CreateDataSourceVM connectionType(DataSourceConnectionType connectionType) {
    
    this.connectionType = connectionType;
    return this;
  }

   /**
   * Get connectionType
   * @return connectionType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DataSourceConnectionType getConnectionType() {
    return connectionType;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectionType(DataSourceConnectionType connectionType) {
    this.connectionType = connectionType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDataSourceVM createDataSourceVM = (CreateDataSourceVM) o;
    return equalsNullable(this.name, createDataSourceVM.name) &&
        Objects.equals(this.connectionString, createDataSourceVM.connectionString) &&
        Objects.equals(this.subscriptionId, createDataSourceVM.subscriptionId) &&
        Objects.equals(this.connectionType, createDataSourceVM.connectionType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), connectionString, subscriptionId, connectionType);
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
    sb.append("class CreateDataSourceVM {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    connectionString: ").append(toIndentedString(connectionString)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
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

