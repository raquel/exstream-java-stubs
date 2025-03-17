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
import org.openapitools.client.model.DataResponseGroupRole;
import org.openapitools.client.model.DataResponseListGroupRole;
import org.openapitools.client.model.GenericResponse;
import org.openapitools.client.model.GroupRole;
import org.openapitools.client.model.ListResponseGroupRole;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupRoleControllerApi
 */
@Disabled
public class GroupRoleControllerApiTest {

    private final GroupRoleControllerApi api = new GroupRoleControllerApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createRole2Test() throws ApiException {
        GroupRole groupRole = null;
        DataResponseGroupRole response = api.createRole2(groupRole);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteRole1Test() throws ApiException {
        GroupRole groupRole = null;
        GenericResponse response = api.deleteRole1(groupRole);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRoles1Test() throws ApiException {
        ListResponseGroupRole response = api.getRoles1();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRoles2Test() throws ApiException {
        String domain = null;
        DataResponseListGroupRole response = api.getRoles2(domain);
        // TODO: test validations
    }

}
