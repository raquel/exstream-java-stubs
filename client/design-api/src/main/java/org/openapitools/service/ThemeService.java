package org.openapitools.service;

import java.util.UUID;

import org.openapitools.api.ApiApiClient;
import org.openapitools.model.DataResponseTheme;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ThemeService {

    private final ApiApiClient apiApiClient;

    public ThemeService(ApiApiClient apiApiClient) {
        this.apiApiClient = apiApiClient;
    }

    public DataResponseTheme getTheme(UUID themeId) {
        String domain = "defaultDomain"; // Replace with your default domain
        Integer version = -1; // Default version

        // Call the encapsulated method
        ResponseEntity<DataResponseTheme> response = apiApiClient.getThemeUsingGET(domain, themeId, version);

        // Return the body of the response
        return response.getBody();
    }
} 