package cloud.fastreport;

import cloud.fastreport.client.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.openapitools.jackson.nullable.JsonNullableModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.api.client.googleapis.util.Utils;
import com.google.api.client.http.AbstractHttpContent;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.Json;

import java.io.IOException;
import java.io.OutputStream;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiClient {
    private final String basePath;
    private final HttpRequestFactory httpRequestFactory;
    private final ObjectMapper objectMapper;

    private static final String defaultBasePath = "http://localhost";

    // A reasonable default object mapper. Client can pass in a chosen ObjectMapper anyway, this is just for reasonable defaults.
    private static ObjectMapper createDefaultObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper()
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .setDateFormat(new RFC3339DateFormat());
        objectMapper.registerModule(new JavaTimeModule());
        JsonNullableModule jnm = new JsonNullableModule();
        objectMapper.registerModule(jnm);
        return objectMapper;
    }

    public ApiClient() {
        this(null, null, null, null);
    }

    public ApiClient(
        String basePath,
        HttpTransport httpTransport,
        HttpRequestInitializer initializer,
        ObjectMapper objectMapper
    ) {
        this.basePath = basePath == null ? defaultBasePath : (
            basePath.endsWith("/") ? basePath.substring(0, basePath.length() - 1) : basePath
        );
        this.httpRequestFactory = (httpTransport == null ? Utils.getDefaultTransport() : httpTransport).createRequestFactory(initializer);
        this.objectMapper = (objectMapper == null ? createDefaultObjectMapper() : objectMapper);
    }

    public HttpRequestFactory getHttpRequestFactory() {
        return httpRequestFactory;
    }

    public String getBasePath() {
        return basePath;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public class JacksonJsonHttpContent extends AbstractHttpContent {
        /* A POJO that can be serialized with a com.fasterxml Jackson ObjectMapper */
        private final Object data;

        public JacksonJsonHttpContent(Object data) {
            super(Json.MEDIA_TYPE);
            this.data = data;
        }

        @Override
        public void writeTo(OutputStream out) throws IOException {
            objectMapper.writeValue(out, data);
        }
    }

    // Builder pattern to get API instances for this client.
    
    public ApiKeysApi apiKeysApi() {
        return new ApiKeysApi(this);
    }
    
    public ConfigurationApi _configurationApi() {
        return new ConfigurationApi(this);
    }
    
    public ContactGroupsApi contactGroupsApi() {
        return new ContactGroupsApi(this);
    }
    
    public ContactsApi contactsApi() {
        return new ContactsApi(this);
    }
    
    public DataSourcesApi dataSourcesApi() {
        return new DataSourcesApi(this);
    }
    
    public DownloadApi downloadApi() {
        return new DownloadApi(this);
    }
    
    public ExportsApi exportsApi() {
        return new ExportsApi(this);
    }
    
    public GroupUsersApi groupUsersApi() {
        return new GroupUsersApi(this);
    }
    
    public GroupsApi groupsApi() {
        return new GroupsApi(this);
    }
    
    public HealthCheckApi healthCheckApi() {
        return new HealthCheckApi(this);
    }
    
    public ReportsApi reportsApi() {
        return new ReportsApi(this);
    }
    
    public SubscriptionGroupsApi subscriptionGroupsApi() {
        return new SubscriptionGroupsApi(this);
    }
    
    public SubscriptionInvitesApi subscriptionInvitesApi() {
        return new SubscriptionInvitesApi(this);
    }
    
    public SubscriptionPlansApi subscriptionPlansApi() {
        return new SubscriptionPlansApi(this);
    }
    
    public SubscriptionUsersApi subscriptionUsersApi() {
        return new SubscriptionUsersApi(this);
    }
    
    public SubscriptionsApi subscriptionsApi() {
        return new SubscriptionsApi(this);
    }
    
    public TasksApi tasksApi() {
        return new TasksApi(this);
    }
    
    public TemplatesApi templatesApi() {
        return new TemplatesApi(this);
    }
    
    public UserProfileApi userProfileApi() {
        return new UserProfileApi(this);
    }
    
    public UserSettingsApi userSettingsApi() {
        return new UserSettingsApi(this);
    }
    
}
