/*
 * Exstream Orchestration
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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
import org.openapitools.client.model.ConfigurationFilterRequest;
import org.openapitools.client.model.DataResponseConfiguration;
import org.openapitools.client.model.GenericResponse;
import org.openapitools.client.model.ModelConfiguration;
import org.openapitools.client.model.PageResponseConfiguration;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConfigurationControllerApi
 */
@Disabled
public class ConfigurationControllerApiTest {

    private final ConfigurationControllerApi api = new ConfigurationControllerApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addConfigurationTest() throws ApiException {
        String domainId = null;
        ModelConfiguration modelConfiguration = null;
        DataResponseConfiguration response = api.addConfiguration(domainId, modelConfiguration);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteConfigurationTest() throws ApiException {
        String domainId = null;
        String configType = null;
        String configName = null;
        GenericResponse response = api.deleteConfiguration(domainId, configType, configName);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConfigurationTest() throws ApiException {
        String domainId = null;
        String configType = null;
        String configName = null;
        ModelConfiguration response = api.getConfiguration(domainId, configType, configName);
        // TODO: test validations
    }

    /**
     * Get all matching configurations
     *
     * Get all configurations (no filter) or all the configurations matching the filter. &lt;br/&gt;Filter example: filter&#x3D;configType:myConfigType (domain is taken from the URL)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConfigurationsTest() throws ApiException {
        ConfigurationFilterRequest filterRequest = null;
        String domainId = null;
        PageResponseConfiguration response = api.getConfigurations(filterRequest, domainId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateConfigurationTest() throws ApiException {
        String domainId = null;
        ModelConfiguration modelConfiguration = null;
        DataResponseConfiguration response = api.updateConfiguration(domainId, modelConfiguration);
        // TODO: test validations
    }

}
