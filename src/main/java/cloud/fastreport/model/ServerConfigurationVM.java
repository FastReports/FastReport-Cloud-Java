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
import cloud.fastreport.model.AuthConfigVM;
import cloud.fastreport.model.FrontendApp;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * ServerConfigurationVM
 */
@JsonPropertyOrder({
  ServerConfigurationVM.JSON_PROPERTY_TITLE,
  ServerConfigurationVM.JSON_PROPERTY_LOGO_LINK,
  ServerConfigurationVM.JSON_PROPERTY_COPYRIGHT,
  ServerConfigurationVM.JSON_PROPERTY_CORPORATE_SERVER_MODE,
  ServerConfigurationVM.JSON_PROPERTY_LAST_S_L_A_VERSION,
  ServerConfigurationVM.JSON_PROPERTY_IS_DISABLED,
  ServerConfigurationVM.JSON_PROPERTY_FRONTEND,
  ServerConfigurationVM.JSON_PROPERTY_INVARIANT_LOCALE,
  ServerConfigurationVM.JSON_PROPERTY_AUTH,
  ServerConfigurationVM.JSON_PROPERTY_DESIGNER_FOR_ANONS,
  ServerConfigurationVM.JSON_PROPERTY_SLA_LINK,
  ServerConfigurationVM.JSON_PROPERTY_FIRST_STEPS_VIDEO_LINK,
  ServerConfigurationVM.JSON_PROPERTY_ABOUT_LINK,
  ServerConfigurationVM.JSON_PROPERTY_HOME_PAGE_LINK,
  ServerConfigurationVM.JSON_PROPERTY_AUTH_SERVER_NAME,
  ServerConfigurationVM.JSON_PROPERTY_UPDATE_WORKSPACE_LINK
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServerConfigurationVM {
  public static final String JSON_PROPERTY_TITLE = "title";
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LOGO_LINK = "logoLink";
  private JsonNullable<String> logoLink = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COPYRIGHT = "copyright";
  private JsonNullable<String> copyright = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CORPORATE_SERVER_MODE = "corporateServerMode";
  private Boolean corporateServerMode;

  public static final String JSON_PROPERTY_LAST_S_L_A_VERSION = "lastSLAVersion";
  private JsonNullable<OffsetDateTime> lastSLAVersion = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_IS_DISABLED = "isDisabled";
  private Boolean isDisabled;

  public static final String JSON_PROPERTY_FRONTEND = "frontend";
  private FrontendApp frontend;

  public static final String JSON_PROPERTY_INVARIANT_LOCALE = "invariantLocale";
  private JsonNullable<String> invariantLocale = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AUTH = "auth";
  private AuthConfigVM auth;

  public static final String JSON_PROPERTY_DESIGNER_FOR_ANONS = "designerForAnons";
  private Boolean designerForAnons;

  public static final String JSON_PROPERTY_SLA_LINK = "slaLink";
  private JsonNullable<String> slaLink = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FIRST_STEPS_VIDEO_LINK = "firstStepsVideoLink";
  private JsonNullable<String> firstStepsVideoLink = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ABOUT_LINK = "aboutLink";
  private JsonNullable<String> aboutLink = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HOME_PAGE_LINK = "homePageLink";
  private JsonNullable<String> homePageLink = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AUTH_SERVER_NAME = "authServerName";
  private JsonNullable<String> authServerName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_UPDATE_WORKSPACE_LINK = "updateWorkspaceLink";
  private JsonNullable<String> updateWorkspaceLink = JsonNullable.<String>undefined();

  public ServerConfigurationVM() {
  }

  public ServerConfigurationVM title(String title) {
    this.title = JsonNullable.<String>of(title);
    
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getTitle() {
        return title.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTitle_JsonNullable() {
    return title;
  }
  
  @JsonProperty(JSON_PROPERTY_TITLE)
  public void setTitle_JsonNullable(JsonNullable<String> title) {
    this.title = title;
  }

  public void setTitle(String title) {
    this.title = JsonNullable.<String>of(title);
  }


  public ServerConfigurationVM logoLink(String logoLink) {
    this.logoLink = JsonNullable.<String>of(logoLink);
    
    return this;
  }

   /**
   * Get logoLink
   * @return logoLink
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLogoLink() {
        return logoLink.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOGO_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLogoLink_JsonNullable() {
    return logoLink;
  }
  
  @JsonProperty(JSON_PROPERTY_LOGO_LINK)
  public void setLogoLink_JsonNullable(JsonNullable<String> logoLink) {
    this.logoLink = logoLink;
  }

  public void setLogoLink(String logoLink) {
    this.logoLink = JsonNullable.<String>of(logoLink);
  }


  public ServerConfigurationVM copyright(String copyright) {
    this.copyright = JsonNullable.<String>of(copyright);
    
    return this;
  }

   /**
   * Get copyright
   * @return copyright
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCopyright() {
        return copyright.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COPYRIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCopyright_JsonNullable() {
    return copyright;
  }
  
  @JsonProperty(JSON_PROPERTY_COPYRIGHT)
  public void setCopyright_JsonNullable(JsonNullable<String> copyright) {
    this.copyright = copyright;
  }

  public void setCopyright(String copyright) {
    this.copyright = JsonNullable.<String>of(copyright);
  }


  public ServerConfigurationVM corporateServerMode(Boolean corporateServerMode) {
    
    this.corporateServerMode = corporateServerMode;
    return this;
  }

   /**
   * Get corporateServerMode
   * @return corporateServerMode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CORPORATE_SERVER_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCorporateServerMode() {
    return corporateServerMode;
  }


  @JsonProperty(JSON_PROPERTY_CORPORATE_SERVER_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCorporateServerMode(Boolean corporateServerMode) {
    this.corporateServerMode = corporateServerMode;
  }


  public ServerConfigurationVM lastSLAVersion(OffsetDateTime lastSLAVersion) {
    this.lastSLAVersion = JsonNullable.<OffsetDateTime>of(lastSLAVersion);
    
    return this;
  }

   /**
   * Get lastSLAVersion
   * @return lastSLAVersion
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getLastSLAVersion() {
        return lastSLAVersion.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_S_L_A_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getLastSLAVersion_JsonNullable() {
    return lastSLAVersion;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_S_L_A_VERSION)
  public void setLastSLAVersion_JsonNullable(JsonNullable<OffsetDateTime> lastSLAVersion) {
    this.lastSLAVersion = lastSLAVersion;
  }

  public void setLastSLAVersion(OffsetDateTime lastSLAVersion) {
    this.lastSLAVersion = JsonNullable.<OffsetDateTime>of(lastSLAVersion);
  }


  public ServerConfigurationVM isDisabled(Boolean isDisabled) {
    
    this.isDisabled = isDisabled;
    return this;
  }

   /**
   * Get isDisabled
   * @return isDisabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDisabled() {
    return isDisabled;
  }


  @JsonProperty(JSON_PROPERTY_IS_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
  }


  public ServerConfigurationVM frontend(FrontendApp frontend) {
    
    this.frontend = frontend;
    return this;
  }

   /**
   * Get frontend
   * @return frontend
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FRONTEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FrontendApp getFrontend() {
    return frontend;
  }


  @JsonProperty(JSON_PROPERTY_FRONTEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrontend(FrontendApp frontend) {
    this.frontend = frontend;
  }


  public ServerConfigurationVM invariantLocale(String invariantLocale) {
    this.invariantLocale = JsonNullable.<String>of(invariantLocale);
    
    return this;
  }

   /**
   * Get invariantLocale
   * @return invariantLocale
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getInvariantLocale() {
        return invariantLocale.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INVARIANT_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getInvariantLocale_JsonNullable() {
    return invariantLocale;
  }
  
  @JsonProperty(JSON_PROPERTY_INVARIANT_LOCALE)
  public void setInvariantLocale_JsonNullable(JsonNullable<String> invariantLocale) {
    this.invariantLocale = invariantLocale;
  }

  public void setInvariantLocale(String invariantLocale) {
    this.invariantLocale = JsonNullable.<String>of(invariantLocale);
  }


  public ServerConfigurationVM auth(AuthConfigVM auth) {
    
    this.auth = auth;
    return this;
  }

   /**
   * Get auth
   * @return auth
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AuthConfigVM getAuth() {
    return auth;
  }


  @JsonProperty(JSON_PROPERTY_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuth(AuthConfigVM auth) {
    this.auth = auth;
  }


  public ServerConfigurationVM designerForAnons(Boolean designerForAnons) {
    
    this.designerForAnons = designerForAnons;
    return this;
  }

   /**
   * Get designerForAnons
   * @return designerForAnons
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESIGNER_FOR_ANONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDesignerForAnons() {
    return designerForAnons;
  }


  @JsonProperty(JSON_PROPERTY_DESIGNER_FOR_ANONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesignerForAnons(Boolean designerForAnons) {
    this.designerForAnons = designerForAnons;
  }


  public ServerConfigurationVM slaLink(String slaLink) {
    this.slaLink = JsonNullable.<String>of(slaLink);
    
    return this;
  }

   /**
   * Get slaLink
   * @return slaLink
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getSlaLink() {
        return slaLink.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SLA_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSlaLink_JsonNullable() {
    return slaLink;
  }
  
  @JsonProperty(JSON_PROPERTY_SLA_LINK)
  public void setSlaLink_JsonNullable(JsonNullable<String> slaLink) {
    this.slaLink = slaLink;
  }

  public void setSlaLink(String slaLink) {
    this.slaLink = JsonNullable.<String>of(slaLink);
  }


  public ServerConfigurationVM firstStepsVideoLink(String firstStepsVideoLink) {
    this.firstStepsVideoLink = JsonNullable.<String>of(firstStepsVideoLink);
    
    return this;
  }

   /**
   * Get firstStepsVideoLink
   * @return firstStepsVideoLink
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getFirstStepsVideoLink() {
        return firstStepsVideoLink.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FIRST_STEPS_VIDEO_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFirstStepsVideoLink_JsonNullable() {
    return firstStepsVideoLink;
  }
  
  @JsonProperty(JSON_PROPERTY_FIRST_STEPS_VIDEO_LINK)
  public void setFirstStepsVideoLink_JsonNullable(JsonNullable<String> firstStepsVideoLink) {
    this.firstStepsVideoLink = firstStepsVideoLink;
  }

  public void setFirstStepsVideoLink(String firstStepsVideoLink) {
    this.firstStepsVideoLink = JsonNullable.<String>of(firstStepsVideoLink);
  }


  public ServerConfigurationVM aboutLink(String aboutLink) {
    this.aboutLink = JsonNullable.<String>of(aboutLink);
    
    return this;
  }

   /**
   * Get aboutLink
   * @return aboutLink
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getAboutLink() {
        return aboutLink.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ABOUT_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAboutLink_JsonNullable() {
    return aboutLink;
  }
  
  @JsonProperty(JSON_PROPERTY_ABOUT_LINK)
  public void setAboutLink_JsonNullable(JsonNullable<String> aboutLink) {
    this.aboutLink = aboutLink;
  }

  public void setAboutLink(String aboutLink) {
    this.aboutLink = JsonNullable.<String>of(aboutLink);
  }


  public ServerConfigurationVM homePageLink(String homePageLink) {
    this.homePageLink = JsonNullable.<String>of(homePageLink);
    
    return this;
  }

   /**
   * Get homePageLink
   * @return homePageLink
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getHomePageLink() {
        return homePageLink.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HOME_PAGE_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getHomePageLink_JsonNullable() {
    return homePageLink;
  }
  
  @JsonProperty(JSON_PROPERTY_HOME_PAGE_LINK)
  public void setHomePageLink_JsonNullable(JsonNullable<String> homePageLink) {
    this.homePageLink = homePageLink;
  }

  public void setHomePageLink(String homePageLink) {
    this.homePageLink = JsonNullable.<String>of(homePageLink);
  }


  public ServerConfigurationVM authServerName(String authServerName) {
    this.authServerName = JsonNullable.<String>of(authServerName);
    
    return this;
  }

   /**
   * Get authServerName
   * @return authServerName
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getAuthServerName() {
        return authServerName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AUTH_SERVER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAuthServerName_JsonNullable() {
    return authServerName;
  }
  
  @JsonProperty(JSON_PROPERTY_AUTH_SERVER_NAME)
  public void setAuthServerName_JsonNullable(JsonNullable<String> authServerName) {
    this.authServerName = authServerName;
  }

  public void setAuthServerName(String authServerName) {
    this.authServerName = JsonNullable.<String>of(authServerName);
  }


  public ServerConfigurationVM updateWorkspaceLink(String updateWorkspaceLink) {
    this.updateWorkspaceLink = JsonNullable.<String>of(updateWorkspaceLink);
    
    return this;
  }

   /**
   * Get updateWorkspaceLink
   * @return updateWorkspaceLink
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getUpdateWorkspaceLink() {
        return updateWorkspaceLink.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UPDATE_WORKSPACE_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUpdateWorkspaceLink_JsonNullable() {
    return updateWorkspaceLink;
  }
  
  @JsonProperty(JSON_PROPERTY_UPDATE_WORKSPACE_LINK)
  public void setUpdateWorkspaceLink_JsonNullable(JsonNullable<String> updateWorkspaceLink) {
    this.updateWorkspaceLink = updateWorkspaceLink;
  }

  public void setUpdateWorkspaceLink(String updateWorkspaceLink) {
    this.updateWorkspaceLink = JsonNullable.<String>of(updateWorkspaceLink);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerConfigurationVM serverConfigurationVM = (ServerConfigurationVM) o;
    return equalsNullable(this.title, serverConfigurationVM.title) &&
        equalsNullable(this.logoLink, serverConfigurationVM.logoLink) &&
        equalsNullable(this.copyright, serverConfigurationVM.copyright) &&
        Objects.equals(this.corporateServerMode, serverConfigurationVM.corporateServerMode) &&
        equalsNullable(this.lastSLAVersion, serverConfigurationVM.lastSLAVersion) &&
        Objects.equals(this.isDisabled, serverConfigurationVM.isDisabled) &&
        Objects.equals(this.frontend, serverConfigurationVM.frontend) &&
        equalsNullable(this.invariantLocale, serverConfigurationVM.invariantLocale) &&
        Objects.equals(this.auth, serverConfigurationVM.auth) &&
        Objects.equals(this.designerForAnons, serverConfigurationVM.designerForAnons) &&
        equalsNullable(this.slaLink, serverConfigurationVM.slaLink) &&
        equalsNullable(this.firstStepsVideoLink, serverConfigurationVM.firstStepsVideoLink) &&
        equalsNullable(this.aboutLink, serverConfigurationVM.aboutLink) &&
        equalsNullable(this.homePageLink, serverConfigurationVM.homePageLink) &&
        equalsNullable(this.authServerName, serverConfigurationVM.authServerName) &&
        equalsNullable(this.updateWorkspaceLink, serverConfigurationVM.updateWorkspaceLink);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(title), hashCodeNullable(logoLink), hashCodeNullable(copyright), corporateServerMode, hashCodeNullable(lastSLAVersion), isDisabled, frontend, hashCodeNullable(invariantLocale), auth, designerForAnons, hashCodeNullable(slaLink), hashCodeNullable(firstStepsVideoLink), hashCodeNullable(aboutLink), hashCodeNullable(homePageLink), hashCodeNullable(authServerName), hashCodeNullable(updateWorkspaceLink));
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
    sb.append("class ServerConfigurationVM {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    logoLink: ").append(toIndentedString(logoLink)).append("\n");
    sb.append("    copyright: ").append(toIndentedString(copyright)).append("\n");
    sb.append("    corporateServerMode: ").append(toIndentedString(corporateServerMode)).append("\n");
    sb.append("    lastSLAVersion: ").append(toIndentedString(lastSLAVersion)).append("\n");
    sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
    sb.append("    frontend: ").append(toIndentedString(frontend)).append("\n");
    sb.append("    invariantLocale: ").append(toIndentedString(invariantLocale)).append("\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    designerForAnons: ").append(toIndentedString(designerForAnons)).append("\n");
    sb.append("    slaLink: ").append(toIndentedString(slaLink)).append("\n");
    sb.append("    firstStepsVideoLink: ").append(toIndentedString(firstStepsVideoLink)).append("\n");
    sb.append("    aboutLink: ").append(toIndentedString(aboutLink)).append("\n");
    sb.append("    homePageLink: ").append(toIndentedString(homePageLink)).append("\n");
    sb.append("    authServerName: ").append(toIndentedString(authServerName)).append("\n");
    sb.append("    updateWorkspaceLink: ").append(toIndentedString(updateWorkspaceLink)).append("\n");
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

