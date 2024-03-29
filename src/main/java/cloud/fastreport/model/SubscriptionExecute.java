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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets SubscriptionExecute
 */
@JsonAdapter(SubscriptionExecute.Adapter.class)
public enum SubscriptionExecute {
  
  NUMBER_0(0),
  
  NUMBER_4(4),
  
  NUMBER_MINUS_1(-1);

  private Integer value;

  SubscriptionExecute(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SubscriptionExecute fromValue(Integer value) {
    for (SubscriptionExecute b : SubscriptionExecute.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SubscriptionExecute> {
    @Override
    public void write(final JsonWriter jsonWriter, final SubscriptionExecute enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SubscriptionExecute read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return SubscriptionExecute.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    SubscriptionExecute.fromValue(value);
  }
}

