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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AcceptAgreementsVM
 */
@JsonPropertyOrder({
  AcceptAgreementsVM.JSON_PROPERTY_SLA_ACCEPTED
})
@JsonTypeName("AcceptAgreementsVM")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AcceptAgreementsVM {
  public static final String JSON_PROPERTY_SLA_ACCEPTED = "slaAccepted";
  private Boolean slaAccepted;


  public AcceptAgreementsVM slaAccepted(Boolean slaAccepted) {
    
    this.slaAccepted = slaAccepted;
    return this;
  }

   /**
   * Get slaAccepted
   * @return slaAccepted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SLA_ACCEPTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSlaAccepted() {
    return slaAccepted;
  }


  @JsonProperty(JSON_PROPERTY_SLA_ACCEPTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSlaAccepted(Boolean slaAccepted) {
    this.slaAccepted = slaAccepted;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcceptAgreementsVM acceptAgreementsVM = (AcceptAgreementsVM) o;
    return Objects.equals(this.slaAccepted, acceptAgreementsVM.slaAccepted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slaAccepted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcceptAgreementsVM {\n");
    sb.append("    slaAccepted: ").append(toIndentedString(slaAccepted)).append("\n");
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
