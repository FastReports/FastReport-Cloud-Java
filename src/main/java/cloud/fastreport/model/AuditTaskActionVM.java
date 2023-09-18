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
import cloud.fastreport.model.AuditFilePropertyChangedVM;
import cloud.fastreport.model.AuditSubscriptionActionVM;
import cloud.fastreport.model.AuditTaskActionVM;
import cloud.fastreport.model.AuditType;
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
 * AuditTaskActionVM
 */
@JsonPropertyOrder({
  AuditTaskActionVM.JSON_PROPERTY_MESSAGE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonIgnoreProperties(
  value = "$t", // ignore manually set $t, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the $t to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$t", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = AuditFilePropertyChangedVM.class, name = "AuditFilePropertyChangedVM"),
  @JsonSubTypes.Type(value = AuditSubscriptionActionVM.class, name = "AuditSubscriptionActionVM"),
  @JsonSubTypes.Type(value = AuditTaskActionVM.class, name = "AuditTaskActionVM"),
})

public class AuditTaskActionVM extends AuditActionVM {
  public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
  private JsonNullable<String> messageId = JsonNullable.<String>undefined();

  public AuditTaskActionVM() {

  }

  public AuditTaskActionVM messageId(String messageId) {
    this.messageId = JsonNullable.<String>of(messageId);
    
    return this;
  }

   /**
   * Get messageId
   * @return messageId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getMessageId() {
        return messageId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMessageId_JsonNullable() {
    return messageId;
  }
  
  @JsonProperty(JSON_PROPERTY_MESSAGE_ID)
  public void setMessageId_JsonNullable(JsonNullable<String> messageId) {
    this.messageId = messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = JsonNullable.<String>of(messageId);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditTaskActionVM auditTaskActionVM = (AuditTaskActionVM) o;
    return equalsNullable(this.messageId, auditTaskActionVM.messageId) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(messageId), super.hashCode());
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
    sb.append("class AuditTaskActionVM {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
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

