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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CreateApiKeyVM
 */
@JsonPropertyOrder({
  CreateApiKeyVM.JSON_PROPERTY_DESCRIPTION,
  CreateApiKeyVM.JSON_PROPERTY_EXPIRED
})
@JsonTypeName("CreateApiKeyVM")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateApiKeyVM {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXPIRED = "expired";
  private OffsetDateTime expired;


  public CreateApiKeyVM description(String description) {
    this.description = JsonNullable.<String>of(description);
    
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public CreateApiKeyVM expired(OffsetDateTime expired) {
    
    this.expired = expired;
    return this;
  }

   /**
   * Get expired
   * @return expired
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EXPIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getExpired() {
    return expired;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExpired(OffsetDateTime expired) {
    this.expired = expired;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateApiKeyVM createApiKeyVM = (CreateApiKeyVM) o;
    return Objects.equals(this.description, createApiKeyVM.description) &&
        Objects.equals(this.expired, createApiKeyVM.expired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, expired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateApiKeyVM {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
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

