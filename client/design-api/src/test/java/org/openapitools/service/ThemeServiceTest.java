package org.openapitools.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.openapitools.api.ApiApiClient;
import org.openapitools.model.DataResponseTheme;
import org.openapitools.model.Theme;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ThemeServiceTest {

    @MockitoBean
    private ApiApiClient mockApiApiClient;

    @Test
    public void testGetTheme() {
        // Mock the response
        UUID themeId = UUID.randomUUID();
        String domain = "defaultDomain";
        Integer version = -1;

        Theme theme = new Theme();
        theme.setId(themeId);

        DataResponseTheme mockResponse = new DataResponseTheme();
        mockResponse.setData(theme);
        mockResponse.setStatus("success");

        // Mock the ApiApiClient call
        when(mockApiApiClient.getThemeUsingGET(Mockito.eq(domain), Mockito.eq(themeId), Mockito.eq(version)))
                .thenReturn(ResponseEntity.ok(mockResponse));

        // Create the service and call the method
        ThemeService themeService = new ThemeService(mockApiApiClient);
        DataResponseTheme response = themeService.getTheme(themeId);

        // Assert the response
        assertNotNull(response);
        assertNotNull(response.getData());
        assertNotNull(response.getData().getId());
        System.out.println("Theme ID: " + response.getData().getId());
    }
}