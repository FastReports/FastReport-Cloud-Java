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
 * Gets or Sets DataSourceExecute
 */
@JsonAdapter(DataSourceExecute.Adapter.class)
public enum DataSourceExecute {
  
  NUMBER_0(0),
  
  NUMBER_1(1),
  
  NUMBER_MINUS_1(-1);

  private Integer value;

  DataSourceExecute(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DataSourceExecute fromValue(Integer value) {
    for (DataSourceExecute b : DataSourceExecute.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DataSourceExecute> {
    @Override
    public void write(final JsonWriter jsonWriter, final DataSourceExecute enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DataSourceExecute read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return DataSourceExecute.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    DataSourceExecute.fromValue(value);
  }
}

