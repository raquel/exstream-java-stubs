/*
 * Exstream Design
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
import org.openapitools.client.model.DataResponseCurrentUserResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthenticationControllerApi
 */
@Disabled
public class AuthenticationControllerApiTest {

    private final AuthenticationControllerApi api = new AuthenticationControllerApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void currentUserTest() throws ApiException {
        String domain = null;
        DataResponseCurrentUserResponse response = api.currentUser(domain);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void currentUser1Test() throws ApiException {
        DataResponseCurrentUserResponse response = api.currentUser1();
        // TODO: test validations
    }

}
