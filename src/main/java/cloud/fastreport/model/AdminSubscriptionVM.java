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
import cloud.fastreport.model.DefaultPermissionsVM;
import cloud.fastreport.model.SubscriptionFolder;
import cloud.fastreport.model.SubscriptionPeriodVM;
import cloud.fastreport.model.SubscriptionVM;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AdminSubscriptionVM
 */
@JsonPropertyOrder({
  AdminSubscriptionVM.JSON_PROPERTY_DEFAULT_PERMISSIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdminSubscriptionVM extends SubscriptionVM {
  public static final String JSON_PROPERTY_DEFAULT_PERMISSIONS = "defaultPermissions";
  private DefaultPermissionsVM defaultPermissions;

  public AdminSubscriptionVM() {

  }

  public AdminSubscriptionVM defaultPermissions(DefaultPermissionsVM defaultPermissions) {
    
    this.defaultPermissions = defaultPermissions;
    return this;
  }

   /**
   * Get defaultPermissions
   * @return defaultPermissions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DefaultPermissionsVM getDefaultPermissions() {
    return defaultPermissions;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultPermissions(DefaultPermissionsVM defaultPermissions) {
    this.defaultPermissions = defaultPermissions;
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
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultPermissions, super.hashCode());
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
    sb.append("class AdminSubscriptionVM {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    defaultPermissions: ").append(toIndentedString(defaultPermissions)).append("\n");
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

