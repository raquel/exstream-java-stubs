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
import org.openapitools.client.model.DataResponseExternalConfiguration;
import org.openapitools.client.model.PageResponseMessage;
import org.openapitools.client.model.ProcessState;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApiV1InternalApi
 */
@Disabled
public class ApiV1InternalApiTest {

    private final ApiV1InternalApi api = new ApiV1InternalApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConfigsTest() throws ApiException {
        String eventType = null;
        Integer offset = null;
        Integer count = null;
        PageResponseMessage response = api.getConfigs(eventType, offset, count);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateProcessingStateTest() throws ApiException {
        String tenantId = null;
        String domainId = null;
        ProcessState processState = null;
        DataResponseExternalConfiguration response = api.updateProcessingState(tenantId, domainId, processState);
        // TODO: test validations
    }

}
