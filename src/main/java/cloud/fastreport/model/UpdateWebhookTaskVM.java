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
import cloud.fastreport.model.TaskType;
import cloud.fastreport.model.UpdateEndpointVM;
import cloud.fastreport.model.UpdateTransportTaskBaseVM;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateWebhookTaskVM
 */
@JsonPropertyOrder({
  UpdateWebhookTaskVM.JSON_PROPERTY_ENDPOINTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateWebhookTaskVM extends UpdateTransportTaskBaseVM {
  public static final String JSON_PROPERTY_ENDPOINTS = "endpoints";
  private JsonNullable<List<UpdateEndpointVM>> endpoints = JsonNullable.<List<UpdateEndpointVM>>undefined();

  public UpdateWebhookTaskVM() {

  }

  public UpdateWebhookTaskVM endpoints(List<UpdateEndpointVM> endpoints) {
    this.endpoints = JsonNullable.<List<UpdateEndpointVM>>of(endpoints);
    
    return this;
  }

  public UpdateWebhookTaskVM addEndpointsItem(UpdateEndpointVM endpointsItem) {
    if (this.endpoints == null || !this.endpoints.isPresent()) {
      this.endpoints = JsonNullable.<List<UpdateEndpointVM>>of(new ArrayList<>());
    }
    try {
      this.endpoints.get().add(endpointsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get endpoints
   * @return endpoints
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public List<UpdateEndpointVM> getEndpoints() {
        return endpoints.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENDPOINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<UpdateEndpointVM>> getEndpoints_JsonNullable() {
    return endpoints;
  }
  
  @JsonProperty(JSON_PROPERTY_ENDPOINTS)
  public void setEndpoints_JsonNullable(JsonNullable<List<UpdateEndpointVM>> endpoints) {
    this.endpoints = endpoints;
  }

  public void setEndpoints(List<UpdateEndpointVM> endpoints) {
    this.endpoints = JsonNullable.<List<UpdateEndpointVM>>of(endpoints);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateWebhookTaskVM updateWebhookTaskVM = (UpdateWebhookTaskVM) o;
    return equalsNullable(this.endpoints, updateWebhookTaskVM.endpoints) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(endpoints), super.hashCode());
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
    sb.append("class UpdateWebhookTaskVM {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
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

