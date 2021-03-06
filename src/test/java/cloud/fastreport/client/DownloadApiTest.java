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

import java.io.File;
import cloud.fastreport.model.ProblemDetails;
import org.junit.Test;
import org.junit.Ignore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DownloadApi
 */
@Ignore
public class DownloadApiTest {

    private final DownloadApi api = new DownloadApi();

    
    /**
     * Returns a export file with specified id
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void downloadGetExportTest() throws IOException {
        String id = null;
        Boolean preview = null;
        File response = api.downloadGetExport(id, preview);

        // TODO: test validations
    }
    
    /**
     * Returns export&#39;s thumbnail
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void downloadGetExportThumbnailTest() throws IOException {
        String id = null;
        File response = api.downloadGetExportThumbnail(id);

        // TODO: test validations
    }
    
    /**
     * Returns a zip archive with selected ids
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void downloadGetExportsTest() throws IOException {
        String archiveName = null;
        String ids = null;
        File response = api.downloadGetExports(archiveName, ids);

        // TODO: test validations
    }
    
    /**
     * Returns a prepared file with specified id
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void downloadGetReportTest() throws IOException {
        String id = null;
        File response = api.downloadGetReport(id);

        // TODO: test validations
    }
    
    /**
     * Returns report&#39;s thumbnail
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void downloadGetReportThumbnailTest() throws IOException {
        String id = null;
        File response = api.downloadGetReportThumbnail(id);

        // TODO: test validations
    }
    
    /**
     * Returns a zip archive with selected files
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void downloadGetReportsTest() throws IOException {
        String archiveName = null;
        String ids = null;
        File response = api.downloadGetReports(archiveName, ids);

        // TODO: test validations
    }
    
    /**
     * Returns a Template file with specified id
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void downloadGetTemplateTest() throws IOException {
        String id = null;
        File response = api.downloadGetTemplate(id);

        // TODO: test validations
    }
    
    /**
     * Returns template&#39;s thumbnail
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void downloadGetTemplateThumbnailTest() throws IOException {
        String id = null;
        File response = api.downloadGetTemplateThumbnail(id);

        // TODO: test validations
    }
    
    /**
     * Returns a zip archive with selected files
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void downloadGetTemplatesTest() throws IOException {
        String archiveName = null;
        String ids = null;
        File response = api.downloadGetTemplates(archiveName, ids);

        // TODO: test validations
    }
    
}
