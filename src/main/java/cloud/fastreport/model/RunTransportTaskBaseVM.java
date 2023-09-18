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
import cloud.fastreport.model.RunEmailTaskVM;
import cloud.fastreport.model.RunFTPUploadTaskVM;
import cloud.fastreport.model.RunInputFileVM;
import cloud.fastreport.model.RunTaskBaseVM;
import cloud.fastreport.model.RunWebhookTaskVM;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RunTransportTaskBaseVM
 */
@JsonPropertyOrder({
  RunTransportTaskBaseVM.JSON_PROPERTY_INPUT_FILE,
  RunTransportTaskBaseVM.JSON_PROPERTY_$_T
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonIgnoreProperties(
  value = "$t", // ignore manually set $t, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the $t to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$t", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = RunEmailTaskVM.class, name = "RunEmailTaskVM"),
  @JsonSubTypes.Type(value = RunFTPUploadTaskVM.class, name = "RunFTPUploadTaskVM"),
  @JsonSubTypes.Type(value = RunWebhookTaskVM.class, name = "RunWebhookTaskVM"),
})

public class RunTransportTaskBaseVM extends RunTaskBaseVM {
  public static final String JSON_PROPERTY_INPUT_FILE = "inputFile";
  private RunInputFileVM inputFile;

  public static final String JSON_PROPERTY_$_T = "$t";
  protected String $t;

  public RunTransportTaskBaseVM() {

  }

  public RunTransportTaskBaseVM inputFile(RunInputFileVM inputFile) {
    
    this.inputFile = inputFile;
    return this;
  }

   /**
   * Get inputFile
   * @return inputFile
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RunInputFileVM getInputFile() {
    return inputFile;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputFile(RunInputFileVM inputFile) {
    this.inputFile = inputFile;
  }


  public RunTransportTaskBaseVM $t(String $t) {
    
    this.$t = $t;
    return this;
  }

   /**
   * Get $t
   * @return $t
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_$_T)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String get$T() {
    return $t;
  }


  @JsonProperty(JSON_PROPERTY_$_T)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void set$T(String $t) {
    this.$t = $t;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunTransportTaskBaseVM runTransportTaskBaseVM = (RunTransportTaskBaseVM) o;
    return Objects.equals(this.inputFile, runTransportTaskBaseVM.inputFile) &&
        Objects.equals(this.$t, runTransportTaskBaseVM.$t) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputFile, $t, super.hashCode());
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
    sb.append("class RunTransportTaskBaseVM {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inputFile: ").append(toIndentedString(inputFile)).append("\n");
    sb.append("    $t: ").append(toIndentedString($t)).append("\n");
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

