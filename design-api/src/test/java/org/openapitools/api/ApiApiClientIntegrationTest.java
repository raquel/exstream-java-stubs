package org.openapitools.api;

import org.junit.jupiter.api.Test;
import org.openapitools.model.DataResponseTheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.UUID;

@SpringBootTest
public class ApiApiClientIntegrationTest {

    @Autowired
    private ApiApiClient apiApiClient;

    @Test
    public void testGetThemeUsingGETIntegration() {
        // Define the required parameters
        String domain = "exampleDomain"; // Replace with your actual domain
        UUID themeId = UUID.randomUUID(); // Replace with a valid UUID if needed
        Integer version = -1; // Default version

        // Call the real API
        DataResponseTheme response = apiApiClient.getThemeUsingGET(domain, themeId, version).getBody();

        // Assert the response
        assertNotNull(response, "Response should not be null");
        assertNotNull(response.getData(), "Response data should not be null");
        assertNotNull(response.getData().getId(), "Theme ID should not be null");
        System.out.println("Theme ID: " + response.getData().getId());
    }

    @Test
    public void testGetThemeIntegration() {
        // Use the default method from ApiApiClient
        UUID themeId = UUID.randomUUID(); // Replace with a valid UUID if needed

        // Call the default method
        DataResponseTheme response = apiApiClient.getTheme(themeId);

        // Assert the response
        assertNotNull(response, "Response should not be null");
        assertNotNull(response.getData(), "Response data should not be null");
        assertNotNull(response.getData().getId(), "Theme ID should not be null");
        System.out.println("Theme ID: " + response.getData().getId());
    }
}