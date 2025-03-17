/*
 * Exstream CXI Integration
 * **For internal use of the product only**
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ConfigFormat;
import org.openapitools.client.model.DataResponseBoolean;
import org.openapitools.client.model.DataResponseExternalConfiguration;
import org.openapitools.client.model.ExternalConfiguration;
import org.openapitools.client.model.GenericResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApiV1ConfigApi
 */
@Disabled
public class ApiV1ConfigApiTest {

    private final ApiV1ConfigApi api = new ApiV1ConfigApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteConfigTest() throws ApiException {
        String tenantId = null;
        String domainId = null;
        String configName = null;
        GenericResponse response = api.deleteConfig(tenantId, domainId, configName);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConfigTest() throws ApiException {
        String tenantId = null;
        String domainId = null;
        String configName = null;
        ExternalConfiguration response = api.getConfig(tenantId, domainId, configName);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateConfigTest() throws ApiException {
        String tenantId = null;
        String domainId = null;
        ConfigFormat configFormat = null;
        DataResponseExternalConfiguration response = api.updateConfig(tenantId, domainId, configFormat);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validateCovisintConfigTest() throws ApiException {
        String tenantId = null;
        String domainId = null;
        Map<String, String> requestBody = null;
        DataResponseBoolean response = api.validateCovisintConfig(tenantId, domainId, requestBody);
        // TODO: test validations
    }

}
