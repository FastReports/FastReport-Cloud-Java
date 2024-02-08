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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cloud.fastreport.JSON;

/**
 * AcceptAgreementsVM
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AcceptAgreementsVM {
  public static final String SERIALIZED_NAME_SLA_ACCEPTED = "slaAccepted";
  @SerializedName(SERIALIZED_NAME_SLA_ACCEPTED)
  private Boolean slaAccepted;

  public AcceptAgreementsVM() {
  }

  public AcceptAgreementsVM slaAccepted(Boolean slaAccepted) {
    this.slaAccepted = slaAccepted;
    return this;
  }

   /**
   * Get slaAccepted
   * @return slaAccepted
  **/
  @javax.annotation.Nullable
  public Boolean getSlaAccepted() {
    return slaAccepted;
  }

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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("slaAccepted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AcceptAgreementsVM
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AcceptAgreementsVM.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AcceptAgreementsVM is not found in the empty JSON string", AcceptAgreementsVM.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AcceptAgreementsVM.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AcceptAgreementsVM` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AcceptAgreementsVM.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AcceptAgreementsVM' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AcceptAgreementsVM> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AcceptAgreementsVM.class));

       return (TypeAdapter<T>) new TypeAdapter<AcceptAgreementsVM>() {
           @Override
           public void write(JsonWriter out, AcceptAgreementsVM value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AcceptAgreementsVM read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AcceptAgreementsVM given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AcceptAgreementsVM
  * @throws IOException if the JSON string is invalid with respect to AcceptAgreementsVM
  */
  public static AcceptAgreementsVM fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AcceptAgreementsVM.class);
  }

 /**
  * Convert an instance of AcceptAgreementsVM to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

