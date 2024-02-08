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

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import cloud.fastreport.model.FolderCreateVM;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import cloud.fastreport.JSON;
/**
 * AdminFolderCreateVM
 */
@JsonPropertyOrder({
  AdminFolderCreateVM.JSON_PROPERTY_PARENT_ID,
  AdminFolderCreateVM.JSON_PROPERTY_OWNER_ID,
  AdminFolderCreateVM.JSON_PROPERTY_FORCE,
  AdminFolderCreateVM.JSON_PROPERTY_$_T
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonIgnoreProperties(
  value = "$t", // ignore manually set $t, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the $t to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$t", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = AdminExportFolderCreateVM.class, name = "AdminExportFolderCreateVM"),
  @JsonSubTypes.Type(value = AdminFolderCreateVM.class, name = "AdminFolderCreateVM"),
  @JsonSubTypes.Type(value = AdminReportFolderCreateVM.class, name = "AdminReportFolderCreateVM"),
  @JsonSubTypes.Type(value = AdminTemplateFolderCreateVM.class, name = "AdminTemplateFolderCreateVM"),
})

public class AdminFolderCreateVM extends FolderCreateVM {
  public static final String JSON_PROPERTY_PARENT_ID = "parentId";
  private String parentId;

  public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
  private String ownerId;

  public static final String JSON_PROPERTY_FORCE = "force";
  private Boolean force;

  public static final String JSON_PROPERTY_$_T = "$t";
  private String $t;

  public AdminFolderCreateVM() { 
  }

  public AdminFolderCreateVM parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getParentId() {
    return parentId;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public AdminFolderCreateVM ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOwnerId() {
    return ownerId;
  }


  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  public AdminFolderCreateVM force(Boolean force) {
    this.force = force;
    return this;
  }

   /**
   * Get force
   * @return force
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getForce() {
    return force;
  }


  @JsonProperty(JSON_PROPERTY_FORCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForce(Boolean force) {
    this.force = force;
  }


  public AdminFolderCreateVM $t(String $t) {
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
  public AdminFolderCreateVM name(String name) {
    this.setName(name);
    return this;
  }

  @Override
  public AdminFolderCreateVM tags(List<String> tags) {
    this.setTags(tags);
    return this;
  }

  @Override
  public AdminFolderCreateVM icon(byte[] icon) {
    this.setIcon(icon);
    return this;
  }

  /**
   * Return true if this AdminFolderCreateVM object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminFolderCreateVM adminFolderCreateVM = (AdminFolderCreateVM) o;
    return Objects.equals(this.parentId, adminFolderCreateVM.parentId) &&
        Objects.equals(this.ownerId, adminFolderCreateVM.ownerId) &&
        Objects.equals(this.force, adminFolderCreateVM.force) &&
        Objects.equals(this.$t, adminFolderCreateVM.$t) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentId, ownerId, force, $t, super.hashCode());
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
    sb.append("class AdminFolderCreateVM {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      for (int i = 0; i < getTags().size(); i++) {
        joiner.add(String.format("%stags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getTags().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `icon` to the URL query string
    if (getIcon() != null) {
      joiner.add(String.format("%sicon%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIcon()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `$t` to the URL query string
    if (get$T() != null) {
      joiner.add(String.format("%s$t%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(get$T()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("AdminExportFolderCreateVM", AdminExportFolderCreateVM.class);
  mappings.put("AdminFolderCreateVM", AdminFolderCreateVM.class);
  mappings.put("AdminReportFolderCreateVM", AdminReportFolderCreateVM.class);
  mappings.put("AdminTemplateFolderCreateVM", AdminTemplateFolderCreateVM.class);
  mappings.put("AdminFolderCreateVM", AdminFolderCreateVM.class);
  JSON.registerDiscriminator(AdminFolderCreateVM.class, "$t", mappings);
}
}

