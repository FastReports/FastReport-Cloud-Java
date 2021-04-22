package cloud.fastreport;

import cloud.fastreport.client.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.openapitools.jackson.nullable.JsonNullableModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.threetenbp.ThreeTenModule;
import org.threeten.bp.*;
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
        ThreeTenModule module = new ThreeTenModule();
        module.addDeserializer(Instant.class, CustomInstantDeserializer.INSTANT);
        module.addDeserializer(OffsetDateTime.class, CustomInstantDeserializer.OFFSET_DATE_TIME);
        module.addDeserializer(ZonedDateTime.class, CustomInstantDeserializer.ZONED_DATE_TIME);
        objectMapper.registerModule(module);
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
    
    public AdminApiKeysApi adminApiKeysApi() {
        return new AdminApiKeysApi(this);
    }
    
    public AdminDataSourceApi adminDataSourceApi() {
        return new AdminDataSourceApi(this);
    }
    
    public AdminExportsApi adminExportsApi() {
        return new AdminExportsApi(this);
    }
    
    public AdminGroupsApi adminGroupsApi() {
        return new AdminGroupsApi(this);
    }
    
    public AdminHealthCheckApi adminHealthCheckApi() {
        return new AdminHealthCheckApi(this);
    }
    
    public AdminReportsApi adminReportsApi() {
        return new AdminReportsApi(this);
    }
    
    public AdminSubscriptionAnalyticsApi adminSubscriptionAnalyticsApi() {
        return new AdminSubscriptionAnalyticsApi(this);
    }
    
    public AdminSubscriptionInvitesApi adminSubscriptionInvitesApi() {
        return new AdminSubscriptionInvitesApi(this);
    }
    
    public AdminSubscriptionPeriodApi adminSubscriptionPeriodApi() {
        return new AdminSubscriptionPeriodApi(this);
    }
    
    public AdminSubscriptionPlansApi adminSubscriptionPlansApi() {
        return new AdminSubscriptionPlansApi(this);
    }
    
    public AdminSubscriptionProblemSolvingApi adminSubscriptionProblemSolvingApi() {
        return new AdminSubscriptionProblemSolvingApi(this);
    }
    
    public AdminSubscriptionsApi adminSubscriptionsApi() {
        return new AdminSubscriptionsApi(this);
    }
    
    public AdminTemplatesApi adminTemplatesApi() {
        return new AdminTemplatesApi(this);
    }
    
    public AdminUsersApi adminUsersApi() {
        return new AdminUsersApi(this);
    }
    
    public ApiKeysApi apiKeysApi() {
        return new ApiKeysApi(this);
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
    
    public TemplatesApi templatesApi() {
        return new TemplatesApi(this);
    }
    
    public UserProfileApi userProfileApi() {
        return new UserProfileApi(this);
    }
    
}
