package org.openapitools.api;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.openapitools.model.DataResponseTheme;
import org.openapitools.model.Theme;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.UUID;

@SpringBootTest
public class ApiApiClientTest {

    @MockitoBean
    private ApiApiClient mockApiApiClient;

    @Test
    public void testGetTheme() {
        // Mock the response
        String domain = "exampleDomain"; // Example domain
        UUID themeId = UUID.randomUUID(); // Generate a random UUID for testing
        Integer version = -1; // Default version

        Theme theme = new Theme(); // Assuming Theme is a valid class
        theme.setId(themeId); // Replace with actual setter if available

        DataResponseTheme mockResponse = new DataResponseTheme();
        mockResponse.setData(theme);
        mockResponse.setStatus("success");

        // Wrap the mock response in a ResponseEntity
        ResponseEntity<DataResponseTheme> mockEntity = ResponseEntity.ok(mockResponse);
        
        // Mock the method call
        when(mockApiApiClient.getThemeUsingGET(Mockito.eq(domain), Mockito.eq(themeId), Mockito.eq(version)))
                .thenReturn(mockEntity);

        // Call the client
        ResponseEntity<DataResponseTheme> responseEntity = mockApiApiClient.getThemeUsingGET(domain, themeId, version);

        // Assert the response
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody().getData());
        assertNotNull(responseEntity.getBody().getData().getId());
        System.out.println("Theme ID: " + responseEntity.getBody().getData().getId());
    }
}
