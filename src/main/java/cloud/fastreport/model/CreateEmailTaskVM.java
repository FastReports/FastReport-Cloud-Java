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
import cloud.fastreport.model.CreateTransportTaskBaseVM;
import cloud.fastreport.model.TaskType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CreateEmailTaskVM
 */
@JsonPropertyOrder({
  CreateEmailTaskVM.JSON_PROPERTY_PASSWORD,
  CreateEmailTaskVM.JSON_PROPERTY_BODY,
  CreateEmailTaskVM.JSON_PROPERTY_IS_BODY_HTML,
  CreateEmailTaskVM.JSON_PROPERTY_SUBJECT,
  CreateEmailTaskVM.JSON_PROPERTY_TO,
  CreateEmailTaskVM.JSON_PROPERTY_FROM,
  CreateEmailTaskVM.JSON_PROPERTY_USERNAME,
  CreateEmailTaskVM.JSON_PROPERTY_SERVER,
  CreateEmailTaskVM.JSON_PROPERTY_PORT,
  CreateEmailTaskVM.JSON_PROPERTY_ENABLE_SSL,
  CreateEmailTaskVM.JSON_PROPERTY_NAME,
  CreateEmailTaskVM.JSON_PROPERTY_SUBSCRIPTION_ID,
  CreateEmailTaskVM.JSON_PROPERTY_TYPE
})
@JsonTypeName("CreateEmailTaskVM")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateEmailTaskVM {
  public static final String JSON_PROPERTY_PASSWORD = "password";
  private JsonNullable<String> password = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BODY = "body";
  private JsonNullable<String> body = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_BODY_HTML = "isBodyHtml";
  private Boolean isBodyHtml;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private JsonNullable<String> subject = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TO = "to";
  private JsonNullable<List<String>> to = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_FROM = "from";
  private JsonNullable<String> from = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USERNAME = "username";
  private JsonNullable<String> username = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SERVER = "server";
  private JsonNullable<String> server = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PORT = "port";
  private Integer port;

  public static final String JSON_PROPERTY_ENABLE_SSL = "enableSsl";
  private Boolean enableSsl;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscriptionId";
  private JsonNullable<String> subscriptionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private TaskType type;


  public CreateEmailTaskVM password(String password) {
    this.password = JsonNullable.<String>of(password);
    
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getPassword() {
        return password.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPassword_JsonNullable() {
    return password;
  }
  
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  public void setPassword_JsonNullable(JsonNullable<String> password) {
    this.password = password;
  }

  public void setPassword(String password) {
    this.password = JsonNullable.<String>of(password);
  }


  public CreateEmailTaskVM body(String body) {
    this.body = JsonNullable.<String>of(body);
    
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getBody() {
        return body.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBody_JsonNullable() {
    return body;
  }
  
  @JsonProperty(JSON_PROPERTY_BODY)
  public void setBody_JsonNullable(JsonNullable<String> body) {
    this.body = body;
  }

  public void setBody(String body) {
    this.body = JsonNullable.<String>of(body);
  }


  public CreateEmailTaskVM isBodyHtml(Boolean isBodyHtml) {
    
    this.isBodyHtml = isBodyHtml;
    return this;
  }

   /**
   * Get isBodyHtml
   * @return isBodyHtml
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_BODY_HTML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsBodyHtml() {
    return isBodyHtml;
  }


  @JsonProperty(JSON_PROPERTY_IS_BODY_HTML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsBodyHtml(Boolean isBodyHtml) {
    this.isBodyHtml = isBodyHtml;
  }


  public CreateEmailTaskVM subject(String subject) {
    this.subject = JsonNullable.<String>of(subject);
    
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getSubject() {
        return subject.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSubject_JsonNullable() {
    return subject;
  }
  
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  public void setSubject_JsonNullable(JsonNullable<String> subject) {
    this.subject = subject;
  }

  public void setSubject(String subject) {
    this.subject = JsonNullable.<String>of(subject);
  }


  public CreateEmailTaskVM to(List<String> to) {
    this.to = JsonNullable.<List<String>>of(to);
    
    return this;
  }

  public CreateEmailTaskVM addToItem(String toItem) {
    if (this.to == null || !this.to.isPresent()) {
      this.to = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.to.get().add(toItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<String> getTo() {
        return to.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getTo_JsonNullable() {
    return to;
  }
  
  @JsonProperty(JSON_PROPERTY_TO)
  public void setTo_JsonNullable(JsonNullable<List<String>> to) {
    this.to = to;
  }

  public void setTo(List<String> to) {
    this.to = JsonNullable.<List<String>>of(to);
  }


  public CreateEmailTaskVM from(String from) {
    this.from = JsonNullable.<String>of(from);
    
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getFrom() {
        return from.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFrom_JsonNullable() {
    return from;
  }
  
  @JsonProperty(JSON_PROPERTY_FROM)
  public void setFrom_JsonNullable(JsonNullable<String> from) {
    this.from = from;
  }

  public void setFrom(String from) {
    this.from = JsonNullable.<String>of(from);
  }


  public CreateEmailTaskVM username(String username) {
    this.username = JsonNullable.<String>of(username);
    
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getUsername() {
        return username.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUsername_JsonNullable() {
    return username;
  }
  
  @JsonProperty(JSON_PROPERTY_USERNAME)
  public void setUsername_JsonNullable(JsonNullable<String> username) {
    this.username = username;
  }

  public void setUsername(String username) {
    this.username = JsonNullable.<String>of(username);
  }


  public CreateEmailTaskVM server(String server) {
    this.server = JsonNullable.<String>of(server);
    
    return this;
  }

   /**
   * Get server
   * @return server
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getServer() {
        return server.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SERVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getServer_JsonNullable() {
    return server;
  }
  
  @JsonProperty(JSON_PROPERTY_SERVER)
  public void setServer_JsonNullable(JsonNullable<String> server) {
    this.server = server;
  }

  public void setServer(String server) {
    this.server = JsonNullable.<String>of(server);
  }


  public CreateEmailTaskVM port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * minimum: 0
   * maximum: 2147483647
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPort() {
    return port;
  }


  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPort(Integer port) {
    this.port = port;
  }


  public CreateEmailTaskVM enableSsl(Boolean enableSsl) {
    
    this.enableSsl = enableSsl;
    return this;
  }

   /**
   * Get enableSsl
   * @return enableSsl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENABLE_SSL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableSsl() {
    return enableSsl;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_SSL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableSsl(Boolean enableSsl) {
    this.enableSsl = enableSsl;
  }


  public CreateEmailTaskVM name(String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public CreateEmailTaskVM subscriptionId(String subscriptionId) {
    this.subscriptionId = JsonNullable.<String>of(subscriptionId);
    
    return this;
  }

   /**
   * Get subscriptionId
   * @return subscriptionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getSubscriptionId() {
        return subscriptionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSubscriptionId_JsonNullable() {
    return subscriptionId;
  }
  
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  public void setSubscriptionId_JsonNullable(JsonNullable<String> subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = JsonNullable.<String>of(subscriptionId);
  }


  public CreateEmailTaskVM type(TaskType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TaskType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TaskType type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEmailTaskVM createEmailTaskVM = (CreateEmailTaskVM) o;
    return Objects.equals(this.password, createEmailTaskVM.password) &&
        Objects.equals(this.body, createEmailTaskVM.body) &&
        Objects.equals(this.isBodyHtml, createEmailTaskVM.isBodyHtml) &&
        Objects.equals(this.subject, createEmailTaskVM.subject) &&
        Objects.equals(this.to, createEmailTaskVM.to) &&
        Objects.equals(this.from, createEmailTaskVM.from) &&
        Objects.equals(this.username, createEmailTaskVM.username) &&
        Objects.equals(this.server, createEmailTaskVM.server) &&
        Objects.equals(this.port, createEmailTaskVM.port) &&
        Objects.equals(this.enableSsl, createEmailTaskVM.enableSsl) &&
        Objects.equals(this.name, createEmailTaskVM.name) &&
        Objects.equals(this.subscriptionId, createEmailTaskVM.subscriptionId) &&
        Objects.equals(this.type, createEmailTaskVM.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, body, isBodyHtml, subject, to, from, username, server, port, enableSsl, name, subscriptionId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEmailTaskVM {\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    isBodyHtml: ").append(toIndentedString(isBodyHtml)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    enableSsl: ").append(toIndentedString(enableSsl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
