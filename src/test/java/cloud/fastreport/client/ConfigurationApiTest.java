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


package cloud.fastreport.client;

import cloud.fastreport.model.ServerConfigurationVM;
import org.junit.Test;
import org.junit.Ignore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConfigurationApi
 */
@Ignore
public class ConfigurationApiTest {

    private final ConfigurationApi api = new ConfigurationApi();

    
    /**
     * returns information about server configuration
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void configurationGetTest() throws IOException {
        ServerConfigurationVM response = api.configurationGet();

        // TODO: test validations
    }
    
}
